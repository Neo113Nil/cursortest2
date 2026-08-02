package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vt4 extends dtj {
    public static final /* synthetic */ int P = 0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    static {
        new vt4(new tt4());
    }

    public vt4(tt4 tt4Var) {
        super(tt4Var);
        this.A = tt4Var.A;
        this.B = tt4Var.B;
        this.C = tt4Var.C;
        this.D = tt4Var.D;
        this.E = tt4Var.E;
        this.F = tt4Var.F;
        this.G = tt4Var.G;
        this.H = tt4Var.H;
        this.I = tt4Var.I;
        this.J = tt4Var.J;
        this.K = tt4Var.K;
        this.L = tt4Var.L;
        this.M = tt4Var.M;
        this.N = tt4Var.N;
        this.O = tt4Var.O;
    }

    @Override // defpackage.dtj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt4.class == obj.getClass()) {
            vt4 vt4Var = (vt4) obj;
            if (super.equals(vt4Var) && this.A == vt4Var.A && this.B == vt4Var.B && this.C == vt4Var.C && this.D == vt4Var.D && this.E == vt4Var.E && this.F == vt4Var.F && this.G == vt4Var.G && this.H == vt4Var.H && this.I == vt4Var.I && this.J == vt4Var.J && this.K == vt4Var.K && this.L == vt4Var.L && this.M == vt4Var.M) {
                SparseBooleanArray sparseBooleanArray = vt4Var.O;
                SparseBooleanArray sparseBooleanArray2 = this.O;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = vt4Var.N;
                            SparseArray sparseArray2 = this.N;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                psj psjVar = (psj) entry.getKey();
                                                if (map2.containsKey(psjVar) && lik.a(entry.getValue(), map2.get(psjVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dtj
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0);
    }
}
