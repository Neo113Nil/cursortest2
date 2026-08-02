package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzawq;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzaxa;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzawa {
    public static zzaxa a(final long j) {
        return zzaxa.f(new zzaws() { // from class: ekn
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzawv) obj).b.b(zzaxa.b(j));
                    return Optional.empty();
                } catch (zzawq unused) {
                    return Optional.of(zzavk.b);
                }
            }
        });
    }

    public static void b(long j, zzawz zzawzVar, boolean z) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8;
        long j11 = j9 % 1629190168;
        long j12 = z ? (j + j) ^ (j >> 63) : j;
        int i = 1;
        while (true) {
            long j13 = j10 ^ j11;
            long j14 = j12 >>> 7;
            boolean z2 = j14 != 0 || i < 0;
            int i2 = (int) (j12 & j13);
            if (z2) {
                i2 = ((i2 | 128) << 24) >> 24;
            }
            zzawzVar.a.write((byte) i2);
            if (!z2) {
                return;
            }
            i++;
            j12 = j14;
        }
    }
}
