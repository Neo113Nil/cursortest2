package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import xsna.efz;

/* loaded from: classes12.dex */
public abstract class d {
    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        n nVar = new n(16);
        if (c.a(bVar, nVar).a != z.a("RIFF")) {
            return null;
        }
        bVar.a(nVar.a, 0, 4, false);
        nVar.e(0);
        int b = nVar.b();
        if (b != z.a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + b);
            return null;
        }
        c a = c.a(bVar, nVar);
        while (a.a != z.a("fmt ")) {
            bVar.a((int) a.b, false);
            a = c.a(bVar, nVar);
        }
        if (a.b < 16) {
            throw new IllegalStateException();
        }
        bVar.a(nVar.a, 0, 16, false);
        nVar.e(0);
        int f = nVar.f();
        int f2 = nVar.f();
        int d = nVar.d();
        if (d < 0) {
            throw new IllegalStateException(m.a("Top bit not zero: ", d));
        }
        int d2 = nVar.d();
        if (d2 < 0) {
            throw new IllegalStateException(m.a("Top bit not zero: ", d2));
        }
        int f3 = nVar.f();
        int f4 = nVar.f();
        int i = (f2 * f4) / 8;
        if (f3 != i) {
            throw new r(efz.a(i, f3, "Expected block alignment: ", "; got: "));
        }
        int a2 = z.a(f4);
        if (a2 == 0) {
            Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + f4);
            return null;
        }
        if (f == 1 || f == 65534) {
            bVar.a(((int) a.b) - 16, false);
            return new b(f2, d, d2, f3, f4, a2);
        }
        Log.e("WavHeaderReader", "Unsupported WAV format type: " + f);
        return null;
    }
}
