package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzfm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wgn implements vgn {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public wgn(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.vgn
    public final long a(long j) {
        return this.a[zzfm.s(this.b, j, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        long[] jArr = this.a;
        int s = zzfm.s(jArr, j, true);
        long j2 = jArr[s];
        long[] jArr2 = this.b;
        zzahl zzahlVar = new zzahl(j2, jArr2[s]);
        if (j2 >= j || s == jArr.length - 1) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i = s + 1;
        return new zzahi(zzahlVar, new zzahl(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // defpackage.vgn
    public final long zzg() {
        return this.d;
    }

    @Override // defpackage.vgn
    public final int zzh() {
        return this.e;
    }
}
