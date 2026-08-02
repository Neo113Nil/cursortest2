package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.egn;
import defpackage.o6a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaiy implements zzagh {
    public final zzahm a;
    public final egn b;
    public zzagk c;
    public zzagh d;
    public Pair e;

    public zzaiy(int i) {
        this.a = new zzahm(-1, -1, "image/heif");
        this.b = new egn();
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
        if (o6a.P(zzagiVar, true)) {
            return true;
        }
        ((zzafy) zzagiVar).f = 0;
        return o6a.P(zzagiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.c = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        if (this.d == null) {
            zzagh zzaghVar = this.b;
            zzaghVar.getClass();
            if (!o6a.P(zzagiVar, true)) {
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
        this.b.zzf();
    }

    public zzaiy() {
        this(0);
    }
}
