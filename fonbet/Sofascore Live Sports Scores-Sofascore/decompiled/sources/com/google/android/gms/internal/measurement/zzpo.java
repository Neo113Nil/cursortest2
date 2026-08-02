package com.google.android.gms.internal.measurement;

import defpackage.lzo;
import defpackage.wzo;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpo {
    public final AtomicReferenceArray a;
    public final zzog b;

    public zzpo(zzog zzogVar, int i) {
        this.b = zzogVar;
        this.a = new AtomicReferenceArray(i);
    }

    public final zzom a(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i);
        if (zzomVar != null) {
            return zzomVar;
        }
        lzo a = this.b.a(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, a)) {
            if (atomicReferenceArray.get(i) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return a;
    }

    public final zzom b(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i);
        if (zzomVar != null) {
            return zzomVar;
        }
        wzo wzoVar = new wzo(str, this.b.a, j);
        while (!atomicReferenceArray.compareAndSet(i, null, wzoVar)) {
            if (atomicReferenceArray.get(i) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return wzoVar;
    }

    public final zzom c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i);
        if (zzomVar != null) {
            return zzomVar;
        }
        defpackage.zzo zzoVar = new defpackage.zzo(str, this.b.a, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, zzoVar)) {
            if (atomicReferenceArray.get(i) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzoVar;
    }
}
