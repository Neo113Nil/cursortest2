package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzb implements b0h {
    public final ou2 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public zzb(SparseArray sparseArray, long j, int i, long j2, long j3) {
        ou2 ou2Var;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            ou2Var = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                yzb yzbVar = (yzb) list.get(i4);
                jArr3[i4] = yzbVar.a;
                jArr[i4] = yzbVar.b;
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
                tgj.d0("Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            ou2Var = new ou2(iArr, jArr, jArr2, jArr3);
        }
        this.a = ou2Var;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        ou2 ou2Var = this.a;
        if (ou2Var != null) {
            return ou2Var.getSeekPoints(j);
        }
        f0h f0hVar = f0h.c;
        return new zzg(f0hVar, f0hVar);
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
