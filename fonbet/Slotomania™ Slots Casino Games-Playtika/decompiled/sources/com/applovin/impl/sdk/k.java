package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import androidx.autofill.HintConstants;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a3;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d3;
import com.applovin.impl.e3;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.j3;
import com.applovin.impl.k5;
import com.applovin.impl.k7;
import com.applovin.impl.o0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.SdksMapping;
import io.sentry.protocol.Geo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {
    private final l a;
    private final AppLovinCommunicator b;

    k(l lVar) {
        this.a = lVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(l.p());
        this.b = appLovinCommunicator;
        if (((Boolean) lVar.a(z4.v7)).booleanValue()) {
            appLovinCommunicator.a(lVar);
            appLovinCommunicator.subscribe(this, k7.a);
        }
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString("sdk_key", this.a.k0());
            bundle.putString("applovin_random_token", this.a.j0());
            bundle.putString("compass_random_token", this.a.v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(l.p()) ? "tablet" : HintConstants.AUTOFILL_HINT_PHONE);
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, JsonUtils.toBundle(y3.b(this.a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.a.y0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.a.a(z4.w7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, com.safedk.android.internal.d.y, true);
                JsonUtils.putJSONObject(jSONObject3, com.safedk.android.internal.d.w, jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j;
        int i;
        long j2;
        Map<String, Object> map2;
        if (((Boolean) this.a.a(z4.v7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey("sdk_key")) {
                    map3.put("sdk_key", this.a.k0());
                }
                this.a.h0().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map3).a(stringMap2).a(((Boolean) this.a.a(z4.p5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.a.l().addCustomQueryParams(q7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.a.l().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.a.Z().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.a.a(z4.o3)).longValue();
            int i2 = messageData2.getInt("retry_count", ((Integer) this.a.a(z4.p3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.a.a(z4.q3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.a.B().a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                j = millis;
                i = i2;
                j2 = millis2;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map G = this.a.B().G();
                    Map p = this.a.B().p();
                    j2 = millis2;
                    if (p.containsKey("idfv") && p.containsKey("idfv_scope")) {
                        i = i2;
                        String str = (String) p.get("idfv");
                        j = millis;
                        Integer num = (Integer) p.get("idfv_scope");
                        num.intValue();
                        p.remove("idfv");
                        p.remove("idfv_scope");
                        G.put("idfv", str);
                        G.put("idfv_scope", num);
                    } else {
                        j = millis;
                        i = i2;
                    }
                    G.put("server_installed_at", this.a.a(z4.o));
                    G.put("sdk_key", this.a.k0());
                    map.put("app", G);
                    map.put("device", p);
                } else {
                    j = millis;
                    i = i2;
                    j2 = millis2;
                }
            }
            this.a.s0().a((k5) new o0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j).a(i).b((int) j2).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.a), f6.b.OTHER);
        }
    }

    public void b(a3 a3Var, String str) {
        if (b("max_ad_events")) {
            Bundle a = a(a3Var);
            a.putString("type", str);
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("CommunicatorService", "Sending \"max_ad_events\" message: " + a);
            }
            a(a, "max_ad_events");
        }
    }

    public void b(a3 a3Var) {
        if (b(com.moloco.sdk.internal.ilrd.provider.a.k)) {
            Bundle a = a(a3Var);
            a.putAll(JsonUtils.toBundle(a3Var.S()));
            a.putString(Geo.JsonKeys.COUNTRY_CODE, this.a.w().getCountryCode());
            a(a, com.moloco.sdk.internal.ilrd.provider.a.k);
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(a3 a3Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle a = a(a3Var);
            a.putString("callback_name", str);
            a(a, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.a.a(z4.v7)).booleanValue()) {
            return this.a.c(z4.u7).contains(str) || this.b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.a.c(z4.u7).contains(str)));
        }
    }

    public boolean a(String str) {
        return k7.a.contains(str);
    }

    private Bundle a(a3 a3Var) {
        View view;
        Bundle bundle = new Bundle();
        bundle.putString("id", a3Var.T());
        bundle.putString(BrandSafetyEvent.ad, a3Var.c());
        bundle.putString(BrandSafetyEvent.l, a3Var.getAdUnitId());
        bundle.putString(BrandSafetyEvent.k, a3Var.U());
        bundle.putString("ad_format", a3Var.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", a3Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", a3Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", a3Var.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(a3Var.c())) {
            bundle.putString("custom_sdk_network_name", a3Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(a3Var.y()));
        if (a3Var instanceof j3) {
            if (a3Var instanceof d3) {
                view = ((d3) a3Var).z();
            } else {
                if (a3Var instanceof f3) {
                    f3 f3Var = (f3) a3Var;
                    if (!f3Var.A0()) {
                        view = f3Var.v0() != null ? f3Var.v0() : f3Var.w0();
                    }
                }
                view = null;
            }
            bundle.putString("ad_view", view != null ? g8.a(view) : "N/A");
            return bundle;
        }
        if (a3Var instanceof e3) {
            Bundle bundle2 = ((e3) a3Var).t0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
