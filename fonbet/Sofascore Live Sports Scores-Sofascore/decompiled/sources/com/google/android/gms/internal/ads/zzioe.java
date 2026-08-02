package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzioe {
    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void b(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        a70.r(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
