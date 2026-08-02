package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class p {

    @Nullable
    static o a;
    static long b;

    private p() {
    }

    public static void a(o oVar) {
        if (oVar.f != null || oVar.g != null) {
            ilg.c();
            return;
        }
        if (oVar.d) {
            return;
        }
        synchronized (p.class) {
            try {
                long j = b + 8192;
                if (j > 65536) {
                    return;
                }
                b = j;
                oVar.f = a;
                oVar.c = 0;
                oVar.b = 0;
                a = oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = a;
                if (oVar != null) {
                    a = oVar.f;
                    oVar.f = null;
                    b -= 8192;
                    return oVar;
                }
                return new o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
