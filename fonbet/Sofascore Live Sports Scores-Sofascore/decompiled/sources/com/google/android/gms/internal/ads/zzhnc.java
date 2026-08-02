package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzhnc implements zzhet {
    public final String a;
    public final Class b;
    public final int c;

    public zzhnc(int i, String str, Class cls) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final Object a(zziei zzieiVar) {
        return ((zzhoo) zzhnt.b.a.get()).a(zzhnw.b.e(zzhos.a(this.a, zzieiVar, zzhor.c(this.c), zzhor.d(5), null), zzhfr.a), this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final zzhtt b(zziei zzieiVar) {
        zzhtv G = zzhtw.G();
        G.n();
        ((zzhtw) G.b).J(this.a);
        G.n();
        ((zzhtw) G.b).K(zzieiVar);
        G.n();
        ((zzhtw) G.b).M(5);
        zzhot b = zzhot.b((zzhtw) G.o());
        zzhnw zzhnwVar = zzhnw.b;
        zzhos zzhosVar = (zzhos) zzhnwVar.f(zzhnn.b.b(zzhnwVar.g(b), null), zzhfr.a);
        zzhts F = zzhtt.F();
        String str = zzhosVar.a;
        F.n();
        ((zzhtt) F.b).H(str);
        zziei zzieiVar2 = zzhosVar.c;
        F.n();
        ((zzhtt) F.b).I(zzieiVar2);
        int b2 = zzhor.b(zzhosVar.d);
        F.n();
        ((zzhtt) F.b).K(b2);
        return (zzhtt) F.o();
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final String zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final Class zzc() {
        return this.b;
    }
}
