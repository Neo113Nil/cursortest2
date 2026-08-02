package com.playtika.pras.sdk.network;

import android.os.Bundle;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.ironsource.B5;
import com.ironsource.X3;
import com.playtika.pras.d.a;
import com.playtika.pras.d.b;
import com.playtika.pras.sdk.network.models.Stage;
import com.playtika.pras.sdk.network.models.ValidationException;
import com.playtika.pras.sdk.network.models.WebStage;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class StagesApi {
    private static final String CDN_HOST_PARAM = "BUNDLE_STAGES_API_CDN_HOST_PARAM";
    private static final String CONFIG_URL_PARAM = "BUNDLE_STAGES_API_CONFIG_URL_PARAM";
    private static final int GET_CONFIG_TIMEOUT = 5000;
    private static StagesApi INSTANCE = null;
    private static final List<WebStageReceivedInterceptor> INTERCEPTORS = Collections.EMPTY_LIST;
    private static final String SDK_VERSION_PARAM = "BUNDLE_STAGES_API_SDK_VERSION_PARAM";
    private static final String SERVER_HOST_PARAM = "BUNDLE_STAGES_API_SERVER_HOST_PARAM";
    private static final String STAGE_NAME_PARAM = "BUNDLE_STAGES_API_STAGE_NAME_PARAM";
    private static final String WEB_STAGE_PARAM = "BUNDLE_STAGES_API_WEB_STAGE_PARAM";
    private final String cdnHost;
    private final String configUrl;
    private final List<WebStageReceivedInterceptor> interceptors;
    private final String sdkVersion;
    private final String serverHost;
    private final String stageName;
    private volatile WebStage webStage;

    public static class ListWebStageReceivedInterceptorChain implements WebStageReceivedInterceptorChain {
        private int index = 0;
        private final List<WebStageReceivedInterceptor> interceptors;
        private final WebStageReceivedListener last;

        public ListWebStageReceivedInterceptorChain(List<WebStageReceivedInterceptor> list, WebStageReceivedListener webStageReceivedListener) {
            this.interceptors = list;
            this.last = webStageReceivedListener;
        }

        @Override // com.playtika.pras.sdk.network.WebStageReceivedInterceptorChain
        public void onFailure() {
            if (this.index >= this.interceptors.size()) {
                this.last.onFailure();
                return;
            }
            List<WebStageReceivedInterceptor> list = this.interceptors;
            int i = this.index;
            this.index = i + 1;
            list.get(i).onFailure(this);
        }

        @Override // com.playtika.pras.sdk.network.WebStageReceivedInterceptorChain
        public void onSuccess(WebStage webStage) {
            if (this.index >= this.interceptors.size()) {
                this.last.onSuccess(webStage);
                return;
            }
            List<WebStageReceivedInterceptor> list = this.interceptors;
            int i = this.index;
            this.index = i + 1;
            list.get(i).onSuccess(webStage, this);
        }
    }

    private StagesApi(String str, String str2, String str3, String str4, String str5, List<WebStageReceivedInterceptor> list) {
        this(str, str2, str3, str4, str5, list, null);
    }

    public static synchronized StagesApi getInstance() {
        StagesApi stagesApi;
        synchronized (StagesApi.class) {
            stagesApi = INSTANCE;
            if (stagesApi == null) {
                throw new IllegalStateException("Not initialized yet");
            }
        }
        return stagesApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(String str, WebStageReceivedListener webStageReceivedListener, String str2) {
        sendAnalyticsErrorEvent(str, str2);
        new ListWebStageReceivedInterceptorChain(this.interceptors, webStageReceivedListener).onFailure();
    }

    public static synchronized void init(String str, String str2, String str3, String str4) {
        synchronized (StagesApi.class) {
            String lowerCase = str.toLowerCase();
            String replaceAll = str4 != null ? str4.replaceAll("/+$", "") : str.toLowerCase().equals(B5.t) ? "https://pras-cdn.playtika.com" : "https://pras-preprod-cdn.playtika.com";
            INSTANCE = new StagesApi(lowerCase, replaceAll + "/config/web/" + str.toLowerCase() + "/stage.json", str2, str3, str4, INTERCEPTORS);
        }
    }

    public static void restore(Bundle bundle) {
        init(bundle.getString(STAGE_NAME_PARAM), bundle.getString(CONFIG_URL_PARAM), bundle.getString(SDK_VERSION_PARAM), bundle.getString(SERVER_HOST_PARAM), bundle.getString(CDN_HOST_PARAM), (WebStage) bundle.getParcelable(WEB_STAGE_PARAM));
    }

    public static void save(Bundle bundle) {
        bundle.putString(STAGE_NAME_PARAM, INSTANCE.stageName);
        bundle.putString(CONFIG_URL_PARAM, INSTANCE.configUrl);
        bundle.putString(SDK_VERSION_PARAM, INSTANCE.sdkVersion);
        bundle.putString(SERVER_HOST_PARAM, INSTANCE.serverHost);
        bundle.putString(CDN_HOST_PARAM, INSTANCE.cdnHost);
        bundle.putParcelable(WEB_STAGE_PARAM, INSTANCE.webStage);
    }

    private void sendAnalyticsErrorEvent(String str, String str2) {
        a aVar;
        synchronized (a.class) {
            aVar = a.k;
        }
        aVar.a("result_config_loading_error", str, str2, b.SDK_PAYMENT_API, false);
    }

    public String getCDNHost() {
        return this.cdnHost;
    }

    public String getServerHost() {
        return this.serverHost;
    }

    public String getStageName() {
        return this.stageName;
    }

    public void getWebStage(final WebStageReceivedListener webStageReceivedListener, final String str) {
        if (this.webStage != null) {
            webStageReceivedListener.onSuccess(this.webStage);
            return;
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(0, this.configUrl, null, new Response.Listener<JSONObject>() { // from class: com.playtika.pras.sdk.network.StagesApi.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(JSONObject jSONObject) {
                try {
                    Stage stage = new Stage(jSONObject.getJSONObject(X3.i.q));
                    stage.validate();
                    WebStage webStageByName = stage.getWebStageByName(StagesApi.this.sdkVersion);
                    if (webStageByName == null) {
                        StagesApi.this.handleError(str, webStageReceivedListener, "Undefined stage");
                    } else {
                        StagesApi.this.webStage = webStageByName;
                        new ListWebStageReceivedInterceptorChain(StagesApi.this.interceptors, webStageReceivedListener).onSuccess(webStageByName);
                    }
                } catch (ValidationException | JSONException e) {
                    StagesApi.this.handleError(str, webStageReceivedListener, e.getMessage());
                }
            }
        }, new Response.ErrorListener() { // from class: com.playtika.pras.sdk.network.StagesApi.2
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                StagesApi.this.handleError(str, webStageReceivedListener, volleyError.getMessage());
            }
        });
        jsonObjectRequest.setTag(RequestTag.CONFIG_LOADING_ID);
        jsonObjectRequest.setShouldRetryConnectionErrors(true);
        jsonObjectRequest.setShouldRetryServerErrors(true);
        NetworkApi.getInstance().addRequest(jsonObjectRequest, 5000, 2);
    }

    private StagesApi(String str, String str2, String str3, String str4, String str5, List<WebStageReceivedInterceptor> list, WebStage webStage) {
        this.stageName = str;
        this.serverHost = str4;
        this.cdnHost = str5;
        this.configUrl = str2;
        this.sdkVersion = str3;
        this.interceptors = list;
        this.webStage = webStage;
    }

    private static synchronized void init(String str, String str2, String str3, String str4, String str5, WebStage webStage) {
        synchronized (StagesApi.class) {
            INSTANCE = new StagesApi(str, str2, str3, str4, str5, INTERCEPTORS, webStage);
        }
    }
}
