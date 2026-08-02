package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.W3;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaaq extends zzbl {
    public static final zzaaq F = new zzaaq(new zzaap());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        String str = zzfm.a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(W3.i, 36);
        Integer.toString(W3.j, 36);
        Integer.toString(1015, 36);
        Integer.toString(W3.l, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public zzaaq(zzaap zzaapVar) {
        super(zzaapVar);
        this.w = zzaapVar.w;
        this.x = zzaapVar.x;
        this.y = zzaapVar.y;
        this.z = zzaapVar.z;
        this.A = zzaapVar.A;
        this.B = zzaapVar.B;
        this.C = zzaapVar.C;
        this.D = zzaapVar.D;
        this.E = zzaapVar.E;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaq.class == obj.getClass()) {
            zzaaq zzaaqVar = (zzaaq) obj;
            if (super.equals(zzaaqVar) && this.w == zzaaqVar.w && this.x == zzaaqVar.x && this.y == zzaaqVar.y && this.z == zzaaqVar.z && this.A == zzaaqVar.A && this.B == zzaaqVar.B && this.C == zzaaqVar.C) {
                SparseBooleanArray sparseBooleanArray = zzaaqVar.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = zzaaqVar.D;
                            SparseArray sparseArray2 = this.D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzzr zzzrVar = (zzzr) entry.getKey();
                                                if (map2.containsKey(zzzrVar) && Objects.equals(entry.getValue(), map2.get(zzzrVar))) {
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

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
