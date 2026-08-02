package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxf implements zzdej {
    public final zzclm a;
    public final zzeaj b;
    public final zzfld c;

    public zzcxf(zzclm zzclmVar, zzeaj zzeajVar, zzfld zzfldVar) {
        this.a = zzclmVar;
        this.b = zzeajVar;
        this.c = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        zzclm zzclmVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ke)).booleanValue() || (zzclmVar = this.a) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzclmVar.zzE()) ? "0" : "1";
        zzeai a = this.b.a();
        a.b("action", "hcp");
        a.b("hcp", str);
        a.a(this.c);
        a.c();
    }
}
