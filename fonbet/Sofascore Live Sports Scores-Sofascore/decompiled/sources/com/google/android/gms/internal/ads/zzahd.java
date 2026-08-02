package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahd implements zzahk {
    public final zzei a;
    public final zzei b;
    public final long c;

    public zzahd(long[] jArr, long[] jArr2, long j) {
        zzei zzeiVar;
        zzei zzeiVar2;
        int length = jArr.length;
        int length2 = jArr2.length;
        zzguk.a(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            zzeiVar = new zzei(length2);
            this.a = zzeiVar;
            zzeiVar2 = new zzei(length2);
            this.b = zzeiVar2;
        } else {
            int i = length2 + 1;
            zzeiVar = new zzei(i);
            this.a = zzeiVar;
            zzeiVar2 = new zzei(i);
            this.b = zzeiVar2;
            int i2 = zzeiVar.a;
            long[] jArr3 = zzeiVar.b;
            if (i2 == jArr3.length) {
                jArr3 = Arrays.copyOf(jArr3, i2 + i2);
                zzeiVar.b = jArr3;
            }
            int i3 = zzeiVar.a;
            zzeiVar.a = i3 + 1;
            jArr3[i3] = 0;
            int i4 = zzeiVar2.a;
            long[] jArr4 = zzeiVar2.b;
            if (i4 == jArr4.length) {
                jArr4 = Arrays.copyOf(jArr4, i4 + i4);
                zzeiVar2.b = jArr4;
            }
            int i5 = zzeiVar2.a;
            zzeiVar2.a = i5 + 1;
            jArr4[i5] = 0;
        }
        zzeiVar.a(jArr);
        zzeiVar2.a(jArr2);
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        zzei zzeiVar = this.b;
        int i = zzeiVar.a;
        if (i == 0) {
            zzahl zzahlVar = zzahl.c;
            return new zzahi(zzahlVar, zzahlVar);
        }
        String str = zzfm.a;
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            if (zzeiVar.b(i5) < j) {
                i4 = i5 + 1;
            } else {
                i2 = i5 - 1;
            }
        }
        int i6 = i2 + 1;
        if (i6 < zzeiVar.a && zzeiVar.b(i6) == j) {
            i3 = i6;
        } else if (i2 != -1) {
            i3 = i2;
        }
        long b = zzeiVar.b(i3);
        zzei zzeiVar2 = this.a;
        zzahl zzahlVar2 = new zzahl(b, zzeiVar2.b(i3));
        if (b == j || i3 == zzeiVar.a - 1) {
            return new zzahi(zzahlVar2, zzahlVar2);
        }
        int i7 = i3 + 1;
        return new zzahi(zzahlVar2, new zzahl(zzeiVar.b(i7), zzeiVar2.b(i7)));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.b.a > 0;
    }
}
