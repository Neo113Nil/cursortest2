package com.google.android.gms.internal.identity_credentials;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("GET_CREDENTIAL", 1L);
        a = feature;
        Feature feature2 = new Feature("CREDENTIAL_REGISTRY", 1L);
        Feature feature3 = new Feature("CLEAR_REGISTRY", 2L);
        Feature feature4 = new Feature("CLEAR_CREATION_OPTIONS", 1L);
        Feature feature5 = new Feature("CLEAR_CREDENTIAL_STATE", 1L);
        b = feature5;
        c = new Feature[]{feature, feature2, feature3, feature4, feature5, new Feature("CREATE_CREDENTIAL", 3L), new Feature("REGISTER_CREATION_OPTIONS", 1L), new Feature("REGISTER_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS", 1L), new Feature("SIGNAL_CREDENTIAL_STATE", 1L), new Feature("CLEAR_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new Feature("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new Feature("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
