package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zad {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        a = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}
