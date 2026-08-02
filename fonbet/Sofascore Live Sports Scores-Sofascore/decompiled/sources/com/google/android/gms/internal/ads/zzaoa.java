package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import defpackage.whn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaoa implements zzagk {
    public final zzagk a;
    public final zzanx b;
    public final SparseArray c = new SparseArray();
    public boolean d;

    public zzaoa(zzagk zzagkVar, zzanx zzanxVar) {
        this.a = zzagkVar;
        this.b = zzanxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht b(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.d = true;
        }
        zzagk zzagkVar = this.a;
        if (i2 != 3) {
            return zzagkVar.b(i, i2);
        }
        SparseArray sparseArray = this.c;
        whn whnVar = (whn) sparseArray.get(i);
        if (whnVar != null) {
            return whnVar;
        }
        whn whnVar2 = new whn(zzagkVar.b(i, 3), this.b);
        sparseArray.put(i, whnVar2);
        return whnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void c(zzahk zzahkVar) {
        this.a.c(zzahkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.a.zzv();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((whn) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }
}
