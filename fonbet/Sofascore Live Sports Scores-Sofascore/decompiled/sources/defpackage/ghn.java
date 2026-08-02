package defpackage;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzfm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ghn implements zzahk {
    public final SparseArray a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public /* synthetic */ ghn(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        SparseArray sparseArray = this.a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            zzahl zzahlVar = new zzahl(0L, this.d);
            return new zzahi(zzahlVar, zzahlVar);
        }
        int s = zzfm.s(jArr, j, true);
        zzahl zzahlVar2 = new zzahl(jArr[s], jArr2[s]);
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
