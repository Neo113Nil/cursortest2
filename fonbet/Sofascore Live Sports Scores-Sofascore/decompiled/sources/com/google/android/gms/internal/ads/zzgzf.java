package com.google.android.gms.internal.ads;

import defpackage.me4;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgzf {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            b(i2, objArr[i2]);
        }
    }

    public static void b(int i, Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s(me4.g(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }
}
