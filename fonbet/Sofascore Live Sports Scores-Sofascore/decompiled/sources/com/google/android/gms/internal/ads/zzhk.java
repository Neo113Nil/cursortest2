package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhk implements zzhs {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public zzhw d;

    public zzhk(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void c(zziq zziqVar) {
        zziqVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(zziqVar)) {
            return;
        }
        arrayList.add(zziqVar);
        this.c++;
    }

    public final void k(zzhw zzhwVar) {
        for (int i = 0; i < this.c; i++) {
            ((zziq) this.b.get(i)).getClass();
        }
    }

    public final void l(zzhw zzhwVar) {
        this.d = zzhwVar;
        for (int i = 0; i < this.c; i++) {
            ((zziq) this.b.get(i)).e(this, zzhwVar, this.a);
        }
    }

    public final void m(int i) {
        zzhw zzhwVar = this.d;
        String str = zzfm.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((zziq) this.b.get(i2)).m(zzhwVar, this.a, i);
        }
    }

    public final void n() {
        zzhw zzhwVar = this.d;
        String str = zzfm.a;
        for (int i = 0; i < this.c; i++) {
            ((zziq) this.b.get(i)).f(zzhwVar, this.a);
        }
        this.d = null;
    }
}
