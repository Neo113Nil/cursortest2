package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxu {
    public final zzeaj a;

    public zzdxu(zzeaj zzeajVar) {
        this.a = zzeajVar;
    }

    public final boolean a(zzgbw zzgbwVar) {
        boolean O = zzgbwVar.O();
        zzeaj zzeajVar = this.a;
        if (O) {
            zzeai a = zzeajVar.a();
            a.b("action", "aq_ad_closed");
            a.b("gqi", zzgbwVar.G());
            a.b("aq_ad_duration", String.valueOf(zzgbwVar.H()));
            a.b("aq_ad_bounce_cnt", String.valueOf(zzgbwVar.I()));
            a.b("aq_time_away", String.valueOf(zzgbwVar.L()));
            return a.d().equals(com.google.android.gms.ads.internal.util.client.zzt.zza);
        }
        zzeai a2 = zzeajVar.a();
        a2.b("action", "aq_ad_kill");
        a2.b("gqi", zzgbwVar.G());
        a2.b("aq_ad_duration", String.valueOf(zzgbwVar.H()));
        a2.b("aq_ad_bounce_cnt", String.valueOf(zzgbwVar.I()));
        a2.b("aq_time_away", String.valueOf(zzgbwVar.L()));
        a2.b("aq_is_os_kill", String.valueOf(zzgbwVar.K()));
        return a2.d().equals(com.google.android.gms.ads.internal.util.client.zzt.zza);
    }
}
