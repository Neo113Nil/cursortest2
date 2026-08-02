package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaap extends zzbk {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public zzaap(zzaaq zzaaqVar) {
        a(zzaaqVar);
        this.w = zzaaqVar.w;
        this.x = zzaaqVar.x;
        this.y = zzaaqVar.y;
        this.z = zzaaqVar.z;
        this.A = zzaaqVar.A;
        this.B = zzaaqVar.B;
        this.C = zzaaqVar.C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = zzaaqVar.D;
            if (i >= sparseArray2.size()) {
                this.D = sparseArray;
                this.E = zzaaqVar.E.clone();
                return;
            } else {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            }
        }
    }

    public zzaap() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
