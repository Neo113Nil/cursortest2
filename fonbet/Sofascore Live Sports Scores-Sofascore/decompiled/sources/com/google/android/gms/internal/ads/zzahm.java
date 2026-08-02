package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahm implements zzagh {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public zzagk f;
    public zzaht g;

    public zzahm(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        int i = this.b;
        int i2 = this.a;
        zzguk.f((i2 == -1 || i == -1) ? false : true);
        zzeu zzeuVar = new zzeu(i);
        ((zzafy) zzagiVar).f(zzeuVar.a, 0, i, false);
        return zzeuVar.J() == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.f = zzagkVar;
        zzaht b = zzagkVar.b(1024, 4);
        this.g = b;
        zzt zztVar = new zzt();
        String str = this.c;
        zztVar.c(str);
        zztVar.d(str);
        b.e(new zzv(zztVar));
        this.f.zzv();
        this.f.c(new zzahn());
        this.e = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            defpackage.zzl.s();
            return 0;
        }
        zzaht zzahtVar = this.g;
        zzahtVar.getClass();
        int d = zzahtVar.d(zzagiVar, 1024, true);
        if (d != -1) {
            this.d += d;
            return 0;
        }
        this.e = 2;
        this.g.f(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
