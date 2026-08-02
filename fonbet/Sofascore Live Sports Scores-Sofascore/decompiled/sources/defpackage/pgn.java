package defpackage;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzafv;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzeh;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pgn implements zzahk {
    public final zzafv a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public pgn(SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        zzafv zzafvVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                ogn ognVar = (ogn) list.get(i4);
                jArr3[i4] = ognVar.a;
                jArr[i4] = ognVar.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                zzeh.c("Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            zzafvVar = new zzafv(iArr, jArr, jArr2, jArr3);
        }
        this.a = zzafvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        zzafv zzafvVar = this.a;
        if (zzafvVar != null) {
            return zzafvVar.b(j);
        }
        zzahl zzahlVar = zzahl.c;
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
