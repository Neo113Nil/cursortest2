package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID a(byte[] bArr) {
        Pair pair;
        int b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        if (nVar.c >= 32) {
            nVar.e(0);
            if (nVar.b() == (nVar.c - nVar.b) + 4 && nVar.b() == c.V && (b = (nVar.b() >> 24) & 255) <= 1) {
                UUID uuid = new UUID(nVar.g(), nVar.g());
                if (b == 1) {
                    nVar.e(nVar.b + (nVar.m() * 16));
                }
                int m = nVar.m();
                if (m == nVar.c - nVar.b) {
                    byte[] bArr2 = new byte[m];
                    nVar.a(bArr2, 0, m);
                    pair = Pair.create(uuid, bArr2);
                    if (pair != null) {
                        return null;
                    }
                    return (UUID) pair.first;
                }
            }
        }
        pair = null;
        if (pair != null) {
        }
    }
}
