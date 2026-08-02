package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjn {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature(-1, 1L, "commit_to_configuration_v2_api", true);
        a = feature;
        Feature feature2 = new Feature(-1, 1L, "get_serving_version_api", true);
        Feature feature3 = new Feature(-1, 1L, "get_experiment_tokens_api", true);
        Feature feature4 = new Feature(-1, 2L, "register_flag_update_listener_api", true);
        b = feature4;
        Feature feature5 = new Feature(-1, 1L, "sync_after_api", true);
        Feature feature6 = new Feature(-1, 1L, "sync_after_for_application_api", true);
        Feature feature7 = new Feature(-1, 1L, "set_app_wide_properties_api", true);
        Feature feature8 = new Feature(-1, 1L, "set_runtime_properties_api", true);
        Feature feature9 = new Feature(-1, 1L, "get_storage_info_api", true);
        c = feature9;
        d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }
}
