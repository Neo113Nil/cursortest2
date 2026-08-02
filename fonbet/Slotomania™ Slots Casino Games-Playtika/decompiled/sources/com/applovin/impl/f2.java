package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.AppMeasurement;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f2 {
    public static final f2 A;
    public static final f2 A0;
    public static final f2 B;
    public static final f2 B0;
    public static final f2 C;
    public static final f2 C0;
    public static final f2 D;
    public static final f2 D0;
    public static final f2 E;
    public static final f2 E0;
    public static final f2 F;
    public static final f2 F0;
    public static final f2 G;
    public static final f2 G0;
    public static final f2 H;
    public static final f2 H0;
    public static final f2 I;
    public static final f2 I0;
    public static final f2 J;
    public static final f2 J0;
    public static final f2 K;
    public static final f2 K0;
    public static final f2 L;
    public static final f2 L0;
    public static final f2 M;
    public static final f2 M0;
    public static final f2 N;
    public static final f2 N0;
    public static final f2 O;
    public static final f2 O0;
    public static final f2 P;
    public static final f2 P0;
    public static final f2 Q;
    public static final f2 Q0;
    public static final f2 R;
    public static final f2 R0;
    public static final f2 S;
    public static final f2 S0;
    public static final f2 T;
    public static final f2 T0;
    public static final f2 U;
    public static final f2 U0;
    public static final f2 V;
    public static final f2 V0;
    public static final f2 W;
    public static final f2 W0;
    public static final f2 X;
    public static final f2 X0;
    public static final f2 Y;
    public static final f2 Y0;
    public static final f2 Z;
    public static final f2 Z0;
    public static final f2 a0;
    public static final f2 a1;
    public static final f2 b0;
    public static final f2 b1;
    private static JSONObject c;
    public static final f2 c0;
    public static final f2 c1;
    public static final f2 d;
    public static final f2 d0;
    public static final f2 d1;
    public static final f2 e;
    public static final f2 e0;
    public static final f2 e1;
    public static final f2 f;
    public static final f2 f0;
    public static final f2 f1;
    public static final f2 g;
    public static final f2 g0;
    public static final f2 g1;
    public static final f2 h;
    public static final f2 h0;
    public static final f2 h1;
    public static final f2 i;
    public static final f2 i0;
    public static final f2 i1;
    public static final f2 j;
    public static final f2 j0;
    public static final f2 j1;
    public static final f2 k;
    public static final f2 k0;
    public static final f2 k1;
    public static final f2 l;
    public static final f2 l0;
    public static final f2 l1;
    public static final f2 m;
    public static final f2 m0;
    public static final f2 m1;
    public static final f2 n;
    public static final f2 n0;
    public static final f2 n1;
    public static final f2 o;
    public static final f2 o0;
    public static final f2 p;
    public static final f2 p0;
    public static final f2 q;
    public static final f2 q0;
    public static final f2 r;
    public static final f2 r0;
    public static final f2 s;
    public static final f2 s0;
    public static final f2 t;
    public static final f2 t0;
    public static final f2 u;
    public static final f2 u0;
    public static final f2 v;
    public static final f2 v0;
    public static final f2 w;
    public static final f2 w0;
    public static final f2 x;
    public static final f2 x0;
    public static final f2 y;
    public static final f2 y0;
    public static final f2 z;
    public static final f2 z0;
    private final String a;
    private final b b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.MEDIATED_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.USER_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        AD,
        MEDIATED_AD,
        ERROR,
        USER_SESSION
    }

    static {
        b bVar = b.ERROR;
        d = new f2("generic", bVar);
        b bVar2 = b.USER_SESSION;
        e = new f2("sdk_init", bVar2);
        f = new f2("generic_user_session_info", bVar2);
        g = new f2("fetch_basic_settings_started", bVar2);
        h = new f2("fetch_basic_settings_success", bVar2);
        i = new f2("fetch_basic_settings_failure", bVar2);
        j = new f2("pub_init_callback", bVar2);
        k = new f2("sdk_extra_parameter_set", bVar2);
        l = new f2("app_validation_success", bVar2);
        m = new f2("app_validation_failure", bVar2);
        n = new f2("ad_reshow_skipped_after_user_swiped_app", bVar2);
        o = new f2("consent_flow_started", bVar2);
        p = new f2("terms_and_privacy_policy_alert_shown", bVar2);
        q = new f2("terms_and_privacy_policy_alert_hidden", bVar2);
        r = new f2("cmp_load_started", bVar2);
        s = new f2("cmp_load_success", bVar2);
        t = new f2("cmp_load_failure", bVar2);
        u = new f2("cmp_show_attempted", bVar2);
        v = new f2("cmp_show_failure", bVar2);
        w = new f2("cmp_hidden", bVar2);
        x = new f2("consent_flow_completed", bVar2);
        b bVar3 = b.AD;
        y = new f2("ad_requested", bVar3);
        z = new f2("ad_request_success", bVar3);
        A = new f2("ad_request_failure", bVar3);
        B = new f2("ad_load_success", bVar3);
        C = new f2("ad_load_failure", bVar3);
        D = new f2("ad_display_attempted", bVar3);
        E = new f2("ad_displayed", bVar3);
        F = new f2("ad_reshown", bVar3);
        G = new f2("ad_display_failure", bVar3);
        H = new f2("ad_hidden", bVar3);
        I = new f2("reward_reporting_error", bVar3);
        J = new f2("reward_validation_error", bVar3);
        K = new f2("user_not_rewarded", bVar3);
        L = new f2("original_resource_urls_restored", bVar3);
        M = new f2("resource_load_started", bVar3);
        N = new f2("resource_retrieved_from_cache", bVar3);
        O = new f2("resource_load_success", bVar3);
        P = new f2("resource_load_failure", bVar3);
        Q = new f2("resource_download_started", bVar3);
        R = new f2("resource_stream_loaded", bVar3);
        S = new f2("resource_download_success", bVar3);
        T = new f2("resource_download_failure", bVar3);
        U = new f2("ad_persist_request", bVar3);
        V = new f2("ad_persist_success", bVar3);
        W = new f2("ad_persist_failure", bVar3);
        X = new f2("persisted_ad_requested", bVar3);
        Y = new f2("persisted_ad_load_success", bVar3);
        Z = new f2("persisted_ad_load_failure", bVar3);
        a0 = new f2("persisted_ad_expired", bVar3);
        b0 = new f2("custom_intent_launch_success", bVar3);
        c0 = new f2("custom_intent_launch_failure", bVar3);
        b bVar4 = b.MEDIATED_AD;
        d0 = new f2("adapter_init_started", bVar4);
        e0 = new f2("adapter_init_success", bVar4);
        f0 = new f2("adapter_init_failure", bVar4);
        g0 = new f2("signal_collection_success", bVar4);
        h0 = new f2("signal_collection_failure", bVar4);
        i0 = new f2("mediated_ad_requested", bVar4);
        j0 = new f2("mediated_ad_request_success", bVar4);
        k0 = new f2("mediated_ad_request_failure", bVar4);
        l0 = new f2("mediated_ad_load_started", bVar4);
        m0 = new f2("mediated_ad_load_success", bVar4);
        n0 = new f2("mediated_ad_load_failure", bVar4);
        o0 = new f2("waterfall_processing_complete", bVar4);
        p0 = new f2("mediated_ad_display_attempted", bVar4);
        q0 = new f2("mediated_ad_displayed", bVar4);
        r0 = new f2("mediated_ad_viewability_impression_called", bVar4);
        s0 = new f2("mediated_ad_display_failure", bVar4);
        t0 = new f2("mediated_ad_hidden", bVar4);
        u0 = new f2("mediated_ad_hidden_callback_not_called", bVar4);
        v0 = new f2("mediated_ad_reward_reporting_error", bVar4);
        w0 = new f2("mediated_ad_reward_validation_error", bVar4);
        x0 = new f2("user_not_rewarded_for_mediated_ad", bVar4);
        y0 = new f2("mediated_ad_extra_parameter_set", bVar4);
        z0 = new f2("mediated_ad_failover_missing_cached_ad", bVar4);
        A0 = new f2("mediated_ad_failover_attempted", bVar4);
        B0 = new f2("mediated_ad_failover_success", bVar4);
        C0 = new f2("mediated_ad_failover_failure", bVar4);
        D0 = new f2("missing_failover_ad_in_waterfall", bVar4);
        E0 = new f2("failover_ad_load_started", bVar4);
        F0 = new f2("failover_ad_load_success", bVar4);
        G0 = new f2("failover_ad_load_failure", bVar4);
        H0 = new f2("failover_ad_ecpm_below_floor", bVar4);
        I0 = new f2("failover_ad_expired_in_cache", bVar4);
        J0 = new f2("failover_ad_evicted_from_cache", bVar4);
        K0 = new f2("activity_destroyed_by_app_relaunch", bVar);
        L0 = new f2("activity_missing", bVar);
        M0 = new f2("ad_context_violation", bVar);
        N0 = new f2("al_fs_activity_finished_externally", bVar);
        O0 = new f2("anr", bVar);
        P0 = new f2("app_exit_info_stack_trace", bVar);
        Q0 = new f2("app_killed_during_ad", bVar);
        R0 = new f2("app_killed_during_mediated_ad", bVar);
        S0 = new f2("auto_redirect", bVar);
        T0 = new f2("black_view_detected", bVar);
        U0 = new f2("black_view", bVar);
        V0 = new f2("cache_error", bVar);
        W0 = new f2("caught_exception", bVar);
        X0 = new f2("consent_flow_error", bVar);
        Y0 = new f2(AppMeasurement.CRASH_ORIGIN, bVar);
        Z0 = new f2("file_error", bVar);
        a1 = new f2("haptic_error", bVar);
        b1 = new f2("integration_error", bVar);
        c1 = new f2("media_error", bVar);
        d1 = new f2("memory_leak", bVar);
        e1 = new f2("native_error", bVar);
        f1 = new f2("network_error", bVar);
        g1 = new f2("task_exception", bVar);
        h1 = new f2("task_latency_alert", bVar);
        i1 = new f2("template_error", bVar);
        j1 = new f2("unexpected_state", bVar);
        k1 = new f2("web_view_error", bVar);
        l1 = new f2("payload_decode_failure", bVar);
        m1 = new f2("request_encode_failure", bVar);
        n1 = new f2("response_decode_failure", bVar);
    }

    public f2(String str, b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public b a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public double a(com.applovin.impl.sdk.l lVar) {
        if (q7.k(com.applovin.impl.sdk.l.p())) {
            return 100.0d;
        }
        double a2 = a(this.a, lVar);
        if (a2 >= 0.0d) {
            return a2;
        }
        double a3 = a(this.b, lVar);
        return a3 >= 0.0d ? a3 : ((Float) lVar.a(z4.H)).floatValue();
    }

    private double a(String str, com.applovin.impl.sdk.l lVar) {
        if (c == null) {
            c = JsonUtils.deserialize((String) lVar.a(z4.D));
        }
        Double d2 = JsonUtils.getDouble(c, str, (Double) null);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return -1.0d;
    }

    private double a(b bVar, com.applovin.impl.sdk.l lVar) {
        float floatValue;
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            floatValue = ((Float) lVar.a(z4.E)).floatValue();
        } else if (i2 == 3) {
            floatValue = ((Float) lVar.a(z4.F)).floatValue();
        } else {
            if (i2 != 4) {
                return -1.0d;
            }
            floatValue = ((Float) lVar.a(z4.G)).floatValue();
        }
        return floatValue;
    }
}
