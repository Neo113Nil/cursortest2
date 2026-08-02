package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzns {
    public final zzs a;
    public final SparseArray b;

    public zzns(zzs zzsVar, SparseArray sparseArray) {
        this.a = zzsVar;
        SparseBooleanArray sparseBooleanArray = zzsVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            zzguk.i(i, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i);
            zznr zznrVar = (zznr) sparseArray.get(keyAt);
            zznrVar.getClass();
            sparseArray2.append(keyAt, zznrVar);
        }
        this.b = sparseArray2;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }
}
