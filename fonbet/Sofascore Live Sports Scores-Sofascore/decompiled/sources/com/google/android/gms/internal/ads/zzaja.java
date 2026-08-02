package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.ign;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaja implements zzagh {
    public final zzahm a;
    public final ign b;
    public zzagk c;
    public zzagh d;
    public Pair e;

    public zzaja(int i) {
        this.a = new zzahm(65496, 2, "image/jpeg");
        this.b = new ign();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        zzagh zzaghVar = this.d;
        if (zzaghVar != null) {
            zzaghVar.a(j, j2);
        } else {
            this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        if (this.b.c(zzagiVar)) {
            return true;
        }
        ((zzafy) zzagiVar).f = 0;
        return this.a.c(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.c = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        if (this.d == null) {
            zzagh zzaghVar = this.b;
            if (!zzaghVar.c(zzagiVar)) {
                zzaghVar = this.a;
            }
            this.d = zzaghVar;
            zzagiVar.zzl();
            Pair pair = this.e;
            if (pair != null) {
                this.d.a(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                this.e = null;
            }
            zzagh zzaghVar2 = this.d;
            zzagk zzagkVar = this.c;
            zzagkVar.getClass();
            zzaghVar2.d(zzagkVar);
        }
        return this.d.e(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    public zzaja() {
        this(0);
    }
}
