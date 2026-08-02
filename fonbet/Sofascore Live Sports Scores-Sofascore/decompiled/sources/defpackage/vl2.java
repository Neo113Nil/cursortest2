package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vl2 extends mij {
    public static final vl2 h = new vl2(new int[0], new SparseArray());
    public final SparseIntArray b;
    public final h6c[] c;
    public final int[] d;
    public final long[] e;
    public final long[] f;
    public final boolean[] g;

    public vl2(int[] iArr, SparseArray sparseArray) {
        int length = iArr.length;
        this.b = new SparseIntArray(length);
        this.d = Arrays.copyOf(iArr, length);
        this.e = new long[length];
        this.f = new long[length];
        this.g = new boolean[length];
        this.c = new h6c[length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i >= iArr2.length) {
                return;
            }
            int i2 = iArr2[i];
            this.b.put(i2, i);
            ul2 ul2Var = (ul2) sparseArray.get(i2, ul2.f);
            this.c[i] = ul2Var.d;
            this.e[i] = ul2Var.a;
            long[] jArr = this.f;
            long j = ul2Var.b;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            jArr[i] = j;
            this.g[i] = ul2Var.c;
            i++;
        }
    }

    @Override // defpackage.mij
    public final int b(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return this.b.get(((Integer) obj).intValue(), -1);
    }

    @Override // defpackage.mij
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl2)) {
            return false;
        }
        vl2 vl2Var = (vl2) obj;
        return Arrays.equals(this.d, vl2Var.d) && Arrays.equals(this.e, vl2Var.e) && Arrays.equals(this.f, vl2Var.f) && Arrays.equals(this.g, vl2Var.g);
    }

    @Override // defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        int i2 = this.d[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i2);
        long j = this.e[i];
        iijVar.getClass();
        iijVar.f(valueOf, valueOf2, i, j, 0L, kg.g, false);
        return iijVar;
    }

    @Override // defpackage.mij
    public final int h() {
        return this.d.length;
    }

    @Override // defpackage.mij
    public final int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (Arrays.hashCode(this.d) * 31)) * 31)) * 31);
    }

    @Override // defpackage.mij
    public final Object l(int i) {
        return Integer.valueOf(this.d[i]);
    }

    @Override // defpackage.mij
    public final kij m(int i, kij kijVar, long j) {
        long j2 = this.e[i];
        boolean z = j2 == C.TIME_UNSET;
        Integer valueOf = Integer.valueOf(this.d[i]);
        h6c h6cVar = this.c[i];
        kijVar.b(valueOf, h6cVar, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, !z, z, this.g[i] ? h6cVar.c : null, this.f[i], j2, i, i, 0L);
        return kijVar;
    }

    @Override // defpackage.mij
    public final int o() {
        return this.d.length;
    }
}
