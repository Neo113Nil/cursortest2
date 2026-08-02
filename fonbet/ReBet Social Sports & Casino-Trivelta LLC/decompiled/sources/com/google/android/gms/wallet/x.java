package com.google.android.gms.wallet;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f34671a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f34672b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f34673c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature f34674d;

    /* renamed from: e, reason: collision with root package name */
    public static final Feature f34675e;

    /* renamed from: f, reason: collision with root package name */
    public static final Feature f34676f;

    /* renamed from: g, reason: collision with root package name */
    public static final Feature f34677g;

    /* renamed from: h, reason: collision with root package name */
    public static final Feature f34678h;
    public static final Feature[] zzi;

    static {
        Feature feature = new Feature("wallet", 1L);
        f34671a = feature;
        Feature feature2 = new Feature("wallet_biometric_auth_keys", 1L);
        f34672b = feature2;
        Feature feature3 = new Feature("wallet_payment_dynamic_update", 2L);
        f34673c = feature3;
        Feature feature4 = new Feature("wallet_1p_initialize_buyflow", 1L);
        f34674d = feature4;
        Feature feature5 = new Feature("wallet_warm_up_ui_process", 1L);
        f34675e = feature5;
        Feature feature6 = new Feature("wallet_get_setup_wizard_intent", 4L);
        f34676f = feature6;
        Feature feature7 = new Feature("wallet_get_payment_card_recognition_intent", 1L);
        f34677g = feature7;
        Feature feature8 = new Feature("wallet_save_instrument", 1L);
        f34678h = feature8;
        zzi = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
