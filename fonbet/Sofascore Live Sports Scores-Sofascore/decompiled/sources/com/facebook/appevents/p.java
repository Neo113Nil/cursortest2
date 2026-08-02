package com.facebook.appevents;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.ph0;
import defpackage.sub;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p {
    public static final Map b = sub.d(new Pair(q.a, new Pair(ph0.a0(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), ph0.a0(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"}))));
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(q qVar, String str, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        qVar.getClass();
        str.getClass();
        obj.getClass();
        try {
            HashSet hashSet = e.f;
            f1.u(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new com.facebook.q(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(qVar)) {
                linkedHashMap.put(qVar, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(qVar);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }
}
