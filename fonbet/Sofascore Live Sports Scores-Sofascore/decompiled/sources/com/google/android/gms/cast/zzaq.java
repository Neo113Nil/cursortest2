package com.google.android.gms.cast;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaq {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature(-1, 1L, "client_side_logging", true);
        Feature feature2 = new Feature(-1, 1L, "cxless_client_minimal", true);
        a = feature2;
        Feature feature3 = new Feature(-1, 1L, "cxless_caf_control", true);
        Feature feature4 = new Feature(-1, 1L, "module_flag_control", true);
        b = feature4;
        Feature feature5 = new Feature(-1, 1L, "discovery_hint_supply", true);
        Feature feature6 = new Feature(-1, 1L, "relay_casting_set_active_account", true);
        Feature feature7 = new Feature(-1, 1L, "analytics_proto_enum_translation", true);
        c = feature7;
        Feature feature8 = new Feature(-1, 1L, "integer_to_integer_map", true);
        d = feature8;
        e = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, new Feature(-1, 1L, "relay_casting_set_remote_casting_mode", true), new Feature(-1, 1L, "get_relay_access_token", true), new Feature(-1, 1L, "get_cast_settings", true), new Feature(-1, 1L, "set_bundle_setting", true), new Feature(-1, 1L, "get_client_updated_info", true), new Feature(-1, 1L, "device_suggestions", true)};
    }
}
