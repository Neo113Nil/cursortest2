package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.fn0;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafv implements zzahk {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public zzafv(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        long[] jArr = this.e;
        int s = zzfm.s(jArr, j, true);
        long j2 = jArr[s];
        long[] jArr2 = this.c;
        zzahl zzahlVar = new zzahl(j2, jArr2[s]);
        if (j2 >= j || s == this.a - 1) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i = s + 1;
        return new zzahi(zzahlVar, new zzahl(jArr[i], jArr2[i]));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        int i = this.a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        fn0.s(i, "ChunkIndex(length=", ", sizes=", arrays, sb);
        bf3.v(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return wt3.m(", durationsUs=", arrays4, sb, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
