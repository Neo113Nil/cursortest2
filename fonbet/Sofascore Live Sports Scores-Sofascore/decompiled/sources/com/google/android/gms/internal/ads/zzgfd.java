package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.iko;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgfd {
    public static byte[] a(String str, boolean z) {
        iko ikoVar;
        if (z) {
            iko ikoVar2 = zzhah.b;
            Character ch = ikoVar2.e;
            ikoVar = ikoVar2;
            if (ch != null) {
                ikoVar = ikoVar2.h(ikoVar2.d, null);
            }
        } else {
            ikoVar = zzhah.a;
        }
        byte[] g = ikoVar.g(str);
        if (g.length != 0 || str.length() <= 0) {
            return g;
        }
        a70.p("Unable to decode ".concat(str));
        return null;
    }
}
