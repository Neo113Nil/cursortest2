package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i78 {
    public final SparseBooleanArray a;

    public i78(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        qx9.s(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i78) {
            i78 i78Var = (i78) obj;
            SparseBooleanArray sparseBooleanArray = i78Var.a;
            int i = lik.a;
            SparseBooleanArray sparseBooleanArray2 = this.a;
            if (i >= 24) {
                return sparseBooleanArray2.equals(sparseBooleanArray);
            }
            if (sparseBooleanArray2.size() == sparseBooleanArray.size()) {
                for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                    if (a(i2) == i78Var.a(i2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = lik.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
