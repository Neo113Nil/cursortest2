package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import defpackage.a70;
import defpackage.dmi;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class d {
    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j;
        n nVar = new n(16);
        if (c.a(bVar, nVar).a != z.a("RIFF")) {
            return null;
        }
        bVar.a(nVar.a, 0, 4, false);
        nVar.e(0);
        if (nVar.b() != z.a("WAVE")) {
            return null;
        }
        c a = c.a(bVar, nVar);
        while (true) {
            int i = a.a;
            int a2 = z.a("fmt ");
            j = a.b;
            if (i == a2) {
                break;
            }
            bVar.a((int) j, false);
            a = c.a(bVar, nVar);
        }
        if (j < 16) {
            zzl.s();
            return null;
        }
        bVar.a(nVar.a, 0, 16, false);
        nVar.e(0);
        int f = nVar.f();
        int f2 = nVar.f();
        int d = nVar.d();
        if (d < 0) {
            a70.r(m.a("Top bit not zero: ", d));
            return null;
        }
        int d2 = nVar.d();
        if (d2 < 0) {
            a70.r(m.a("Top bit not zero: ", d2));
            return null;
        }
        int f3 = nVar.f();
        int f4 = nVar.f();
        int i2 = (f2 * f4) / 8;
        if (f3 != i2) {
            zzl.t(dmi.k(i2, f3, "Expected block alignment: ", "; got: "));
            return null;
        }
        int a3 = z.a(f4);
        if (a3 == 0) {
            return null;
        }
        if (f != 1 && f != 65534) {
            return null;
        }
        bVar.a(((int) a.b) - 16, false);
        return new b(f2, d, d2, f3, f4, a3);
    }
}
