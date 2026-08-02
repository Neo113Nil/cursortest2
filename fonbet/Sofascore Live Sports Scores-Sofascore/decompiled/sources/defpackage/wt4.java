package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.W3;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wt4 extends etj {
    public static final wt4 H = new wt4(new ut4());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final SparseArray F;
    public final SparseBooleanArray G;
    public final boolean y;
    public final boolean z;

    static {
        wt3.s(1000, 1001, 1002, 1003, 1004);
        wt3.s(1005, 1006, 1007, 1008, 1009);
        wt3.s(1010, 1011, TTAdConstant.IMAGE_MODE_1012, W3.i, W3.j);
        nik.N(1015);
        nik.N(W3.l);
        nik.N(1017);
        nik.N(1018);
    }

    public wt4(ut4 ut4Var) {
        super(ut4Var);
        this.y = ut4Var.x;
        this.z = ut4Var.y;
        this.A = ut4Var.z;
        this.B = ut4Var.A;
        this.C = ut4Var.B;
        this.D = ut4Var.C;
        this.E = ut4Var.D;
        this.F = ut4Var.E;
        this.G = ut4Var.F;
    }

    @Override // defpackage.etj
    public final ctj a() {
        return new ut4(this);
    }

    @Override // defpackage.etj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wt4.class == obj.getClass()) {
            wt4 wt4Var = (wt4) obj;
            if (super.equals(wt4Var) && this.y == wt4Var.y && this.z == wt4Var.z && this.A == wt4Var.A && this.B == wt4Var.B && this.C == wt4Var.C && this.D == wt4Var.D && this.E == wt4Var.E) {
                SparseBooleanArray sparseBooleanArray = wt4Var.G;
                SparseBooleanArray sparseBooleanArray2 = this.G;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = wt4Var.F;
                            SparseArray sparseArray2 = this.F;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                qsj qsjVar = (qsj) entry.getKey();
                                                if (map2.containsKey(qsjVar) && Objects.equals(entry.getValue(), map2.get(qsjVar))) {
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

    @Override // defpackage.etj
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.y ? 1 : 0)) * 961) + (this.z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 28629151) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 961) + (this.E ? 1 : 0)) * 31;
    }
}
