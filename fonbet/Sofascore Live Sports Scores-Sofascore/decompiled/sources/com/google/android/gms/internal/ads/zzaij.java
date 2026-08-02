package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaij implements zzagh {
    public final zzeu a = new zzeu(4);
    public final zzahm b = new zzahm(-1, -1, "image/avif");

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.b.a(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        zzafy zzafyVar = (zzafy) zzagiVar;
        zzafyVar.k(4, false);
        zzeu zzeuVar = this.a;
        zzeuVar.y(4);
        zzafyVar.f(zzeuVar.a, 0, 4, false);
        if (zzeuVar.N() == 1718909296) {
            zzeuVar.y(4);
            zzafyVar.f(zzeuVar.a, 0, 4, false);
            if (zzeuVar.N() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.b.d(zzagkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        return this.b.e(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
