package com.playtika.pras.sdk.network;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.braze.Constants;
import com.playtika.pras.c.d;
import com.playtika.pras.c.g;
import com.playtika.pras.d.a;
import com.playtika.pras.d.b;
import com.playtika.pras.sdk.network.ClientFacadeApi;
import com.playtika.pras.sdk.network.models.RetryPolicy;
import com.playtika.pras.sdk.network.models.SdkInitRequest;
import com.playtika.pras.sdk.network.models.SdkInitResponse;
import com.playtika.pras.sdk.network.models.WidgetSessionRequest;
import com.playtika.pras.sdk.network.models.WidgetSessionResponse;
import com.safedk.android.utils.j;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ClientFacadeApi {
    private static final float BACKOFF_MULTIPLIER = 0.0f;
    private static final String INIT_PATH = "/client-facade/public/sdk/v1/init";
    private static final int MAX_RETRIES = 2;
    private static final String REQUEST_TAG = "ClientFacadeApi.Init";
    private static final String SESSION_PATH = "/client-facade/public/widget/v1/sessions";
    private static final String SESSION_REQUEST_TAG = "ClientFacadeApi.Session";
    private static final int TIMEOUT_MS = 10000;

    public interface InitListener {
        void onFailure(Exception exc);

        void onSuccess(SdkInitResponse sdkInitResponse);
    }

    public static class InitRequestRetryPolicy extends DefaultRetryPolicy {
        private int attemptNumber;
        private final String esContext;

        public InitRequestRetryPolicy(int i, int i2, float f, String str) {
            super(i, i2, f);
            this.attemptNumber = 1;
            this.esContext = str;
        }

        public int getAttemptNumber() {
            return this.attemptNumber;
        }

        @Override // com.android.volley.DefaultRetryPolicy, com.android.volley.RetryPolicy
        public void retry(VolleyError volleyError) {
            a aVar;
            int i;
            NetworkResponse networkResponse = volleyError.networkResponse;
            if (networkResponse != null && (i = networkResponse.statusCode) >= 400 && i < 500) {
                throw volleyError;
            }
            super.retry(volleyError);
            this.attemptNumber++;
            synchronized (a.class) {
                aVar = a.k;
            }
            if (aVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt_number", this.attemptNumber);
                    aVar.a("sdk_init_request_send", this.esContext, b.INIT, jSONObject);
                } catch (JSONException e) {
                    d.a("Error creating attempt_number field", e);
                }
            }
        }
    }

    public interface SessionListener {
        void onFailure(Exception exc);

        void onSuccess(WidgetSessionResponse widgetSessionResponse);
    }

    public static class WidgetSessionRetryPolicy extends DefaultRetryPolicy {
        private int attemptNumber;
        private final String esContext;

        public WidgetSessionRetryPolicy(int i, int i2, float f, String str) {
            super(i, i2, f);
            this.attemptNumber = 1;
            this.esContext = str;
        }

        public int getAttemptNumber() {
            return this.attemptNumber;
        }

        @Override // com.android.volley.DefaultRetryPolicy, com.android.volley.RetryPolicy
        public void retry(VolleyError volleyError) {
            a aVar;
            int i;
            NetworkResponse networkResponse = volleyError.networkResponse;
            if (networkResponse != null && (i = networkResponse.statusCode) >= 400 && i < 500) {
                throw volleyError;
            }
            super.retry(volleyError);
            this.attemptNumber++;
            synchronized (a.class) {
                aVar = a.k;
            }
            if (aVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt_number", this.attemptNumber);
                    aVar.a("widget_session_request_send", this.esContext, b.INIT, jSONObject);
                } catch (JSONException e) {
                    d.a("Error creating attempt_number field", e);
                }
            }
        }
    }

    static void lambda$createWidgetSession$2(WidgetSessionRetryPolicy widgetSessionRetryPolicy, SessionListener sessionListener, JSONObject jSONObject) {
        a aVar;
        d.a("WIDGET SESSION REQUEST SUCCESS", jSONObject.toString());
        try {
            WidgetSessionResponse widgetSessionResponse = new WidgetSessionResponse(jSONObject);
            synchronized (a.class) {
                aVar = a.k;
            }
            if (aVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("attempt_number", widgetSessionRetryPolicy.getAttemptNumber());
                    aVar.a("widget_session_request_success", "widget_session", b.INIT, jSONObject2);
                } catch (JSONException e) {
                    d.a("Error creating additional fields for success event", e);
                }
            }
            sessionListener.onSuccess(widgetSessionResponse);
        } catch (JSONException e2) {
            d.a("WIDGET SESSION PARSE ERROR", e2);
            a a = a.a();
            if (a != null) {
                a.a("widget_session_request_error", "widget_session", "Error parsing widget session response: " + e2.getMessage(), b.INIT, false);
            }
            sessionListener.onFailure(e2);
        }
    }

    static void lambda$createWidgetSession$3(WidgetSessionRetryPolicy widgetSessionRetryPolicy, SessionListener sessionListener, VolleyError volleyError) {
        a aVar;
        d.b("WIDGET SESSION REQUEST ERROR: " + volleyError.toString());
        synchronized (a.class) {
            aVar = a.k;
        }
        if (aVar != null) {
            int attemptNumber = widgetSessionRetryPolicy.getAttemptNumber();
            aVar.a("widget_session_request_error", "widget_session", "Error creating widget session after " + attemptNumber + " attempt" + (attemptNumber > 1 ? Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY : "") + ": " + volleyError.getMessage(), b.INIT, false);
        }
        sessionListener.onFailure(volleyError);
    }

    static void lambda$init$0(InitRequestRetryPolicy initRequestRetryPolicy, InitListener initListener, JSONObject jSONObject) {
        a aVar;
        d.a("CLIENT FACADE INIT SUCCESS", jSONObject.toString());
        try {
            SdkInitResponse sdkInitResponse = new SdkInitResponse(jSONObject);
            boolean isDynamicConfigFlowEnabled = sdkInitResponse.isDynamicConfigFlowEnabled();
            boolean z = !isDynamicConfigFlowEnabled;
            String str = !isDynamicConfigFlowEnabled ? j.c : null;
            synchronized (a.class) {
                aVar = a.k;
            }
            if (aVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("attempt_number", initRequestRetryPolicy.getAttemptNumber());
                    jSONObject2.put("use_fallback", z);
                    if (str != null) {
                        jSONObject2.put("use_fallback_reason", str);
                    }
                    aVar.a("sdk_init_request_success", "ANDROID_SDK", b.INIT, jSONObject2);
                } catch (JSONException e) {
                    d.a("Error creating additional fields for success event", e);
                }
            }
            initListener.onSuccess(sdkInitResponse);
        } catch (JSONException e2) {
            d.a("CLIENT FACADE INIT PARSE ERROR", e2);
            a a = a.a();
            if (a != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("use_fallback", true);
                    jSONObject3.put("use_fallback_reason", "error");
                    a.a("sdk_init_request_error", "ANDROID_SDK", "Error parsing SDK init response: " + e2.getMessage(), b.INIT, jSONObject3);
                } catch (JSONException e3) {
                    d.a("Error creating additional fields for error event", e3);
                }
            }
            initListener.onFailure(e2);
        }
    }

    static void lambda$init$1(InitRequestRetryPolicy initRequestRetryPolicy, InitListener initListener, VolleyError volleyError) {
        a aVar;
        d.b("CLIENT FACADE INIT ERROR: " + volleyError.toString());
        synchronized (a.class) {
            aVar = a.k;
        }
        if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("use_fallback", true);
                jSONObject.put("use_fallback_reason", "error");
                int attemptNumber = initRequestRetryPolicy.getAttemptNumber();
                aVar.a("sdk_init_request_error", "ANDROID_SDK", "Error initializing SDK after " + attemptNumber + " attempt" + (attemptNumber > 1 ? Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY : "") + ": " + volleyError.getMessage(), b.INIT, jSONObject);
            } catch (JSONException e) {
                d.a("Error creating additional fields for error event", e);
            }
        }
        initListener.onFailure(volleyError);
    }

    public void createWidgetSession(WidgetSessionRequest widgetSessionRequest, String str, String str2, RetryPolicy retryPolicy, final SessionListener sessionListener) {
        a aVar;
        try {
            String str3 = g.a(str, str2) + SESSION_PATH;
            final WidgetSessionRetryPolicy widgetSessionRetryPolicy = new WidgetSessionRetryPolicy(retryPolicy.getInitialTimeout(), retryPolicy.getMaxAttempts() - 1, (float) retryPolicy.getBackoffMultiplier(), "widget_session");
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(1, str3, widgetSessionRequest.toJson(), new Response.Listener() { // from class: com.playtika.pras.sdk.network.ClientFacadeApi$$ExternalSyntheticLambda2
                @Override // com.android.volley.Response.Listener
                public final void onResponse(Object obj) {
                    ClientFacadeApi.lambda$createWidgetSession$2(ClientFacadeApi.WidgetSessionRetryPolicy.this, sessionListener, (JSONObject) obj);
                }
            }, new Response.ErrorListener() { // from class: com.playtika.pras.sdk.network.ClientFacadeApi$$ExternalSyntheticLambda3
                @Override // com.android.volley.Response.ErrorListener
                public final void onErrorResponse(VolleyError volleyError) {
                    ClientFacadeApi.lambda$createWidgetSession$3(ClientFacadeApi.WidgetSessionRetryPolicy.this, sessionListener, volleyError);
                }
            });
            synchronized (a.class) {
                aVar = a.k;
            }
            if (aVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt_number", 1);
                    aVar.a("widget_session_request_send", "widget_session", b.INIT, jSONObject);
                } catch (JSONException e) {
                    d.a("Error creating attempt_number field", e);
                }
            }
            jsonObjectRequest.setTag(SESSION_REQUEST_TAG);
            jsonObjectRequest.setShouldRetryConnectionErrors(true);
            jsonObjectRequest.setShouldRetryServerErrors(true);
            NetworkApi.getInstance().addRequest(jsonObjectRequest, widgetSessionRetryPolicy);
        } catch (JSONException e2) {
            d.a("WIDGET SESSION REQUEST BUILD ERROR", e2);
            a a = a.a();
            if (a != null) {
                a.a("widget_session_request_error", "widget_session", "Error building widget session request: " + e2.getMessage(), b.INIT, false);
            }
            sessionListener.onFailure(e2);
        }
    }

    public void init(SdkInitRequest sdkInitRequest, String str, String str2, final InitListener initListener) {
        a aVar;
        try {
            String str3 = g.a(str, str2) + INIT_PATH;
            final InitRequestRetryPolicy initRequestRetryPolicy = new InitRequestRetryPolicy(10000, 2, 0.0f, "ANDROID_SDK");
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(1, str3, sdkInitRequest.toJson(), new Response.Listener() { // from class: com.playtika.pras.sdk.network.ClientFacadeApi$$ExternalSyntheticLambda0
                @Override // com.android.volley.Response.Listener
                public final void onResponse(Object obj) {
                    ClientFacadeApi.lambda$init$0(ClientFacadeApi.InitRequestRetryPolicy.this, initListener, (JSONObject) obj);
                }
            }, new Response.ErrorListener() { // from class: com.playtika.pras.sdk.network.ClientFacadeApi$$ExternalSyntheticLambda1
                @Override // com.android.volley.Response.ErrorListener
                public final void onErrorResponse(VolleyError volleyError) {
                    ClientFacadeApi.lambda$init$1(ClientFacadeApi.InitRequestRetryPolicy.this, initListener, volleyError);
                }
            });
            synchronized (a.class) {
                aVar = a.k;
            }
            if (aVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt_number", 1);
                    aVar.a("sdk_init_request_send", "ANDROID_SDK", b.INIT, jSONObject);
                } catch (JSONException e) {
                    d.a("Error creating attempt_number field", e);
                }
            }
            jsonObjectRequest.setTag(REQUEST_TAG);
            jsonObjectRequest.setShouldRetryConnectionErrors(true);
            jsonObjectRequest.setShouldRetryServerErrors(true);
            NetworkApi.getInstance().addRequest(jsonObjectRequest, initRequestRetryPolicy);
        } catch (JSONException e2) {
            d.a("CLIENT FACADE INIT REQUEST BUILD ERROR", e2);
            a a = a.a();
            if (a != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("use_fallback", true);
                    jSONObject2.put("use_fallback_reason", "error");
                    a.a("sdk_init_request_error", "ANDROID_SDK", "Error building SDK init request: " + e2.getMessage(), b.INIT, jSONObject2);
                } catch (JSONException e3) {
                    d.a("Error creating additional fields for error event", e3);
                }
            }
            initListener.onFailure(e2);
        }
    }
}
