package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.qc4;
import defpackage.u8f;
import defpackage.v9f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvx extends zzcyl {
    public final zzclm l;
    public final int m;
    public final Context n;
    public final zzcvl o;
    public final zzdom p;
    public final zzdla q;
    public final zzdec r;
    public final boolean s;
    public final zzcga t;
    public final zzeaj u;
    public boolean v;

    public zzcvx(zzcyk zzcykVar, Context context, zzclm zzclmVar, int i, zzcvl zzcvlVar, zzdom zzdomVar, zzdla zzdlaVar, zzdec zzdecVar, zzcga zzcgaVar, zzeaj zzeajVar) {
        super(zzcykVar);
        this.v = false;
        this.l = zzclmVar;
        this.n = context;
        this.m = i;
        this.o = zzcvlVar;
        this.p = zzdomVar;
        this.q = zzdlaVar;
        this.r = zzdecVar;
        this.s = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B6)).booleanValue();
        this.t = zzcgaVar;
        this.u = zzeajVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.content.Context] */
    public final void c(Activity activity, boolean z) {
        zzclm zzclmVar;
        zzfld e;
        int i;
        zzdla zzdlaVar = this.q;
        zzdec zzdecVar = this.r;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.n;
        }
        boolean z2 = this.s;
        if (z2) {
            zzdlaVar.p0(v9f.g);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdom zzdomVar = this.p;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdomVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.uf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(activity2, this.b, this.u);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s1)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(activity2)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    zzdecVar.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t1)).booleanValue()) {
                        new zzfys(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cd)).booleanValue() && (zzclmVar = this.l) != null && (e = zzclmVar.e()) != null && e.r0) {
            int i3 = e.s0;
            zzcga zzcgaVar = this.t;
            synchronized (zzcgaVar.a) {
                zzcfx zzcfxVar = zzcgaVar.d;
                synchronized (zzcfxVar.f) {
                    i = zzcfxVar.l;
                }
            }
            if (i3 != i) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("The app open consent form has been shown.");
                zzdecVar.zzc(zzfmy.d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.v) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("App open interstitial ad is already visible.");
            zzdecVar.zzc(zzfmy.d(10, null, null));
        }
        if (this.v) {
            return;
        }
        try {
            zzdomVar.b(z, activity2, zzdecVar);
            if (z2) {
                zzdlaVar.p0(u8f.f);
            }
            this.v = true;
        } catch (zzdol e2) {
            zzdecVar.L(e2);
        }
    }

    public final void d() {
        zzdeo zzdeoVar = this.c;
        zzdeoVar.getClass();
        zzdeoVar.p0(new qc4(null, 4));
        zzclm zzclmVar = this.l;
        if (zzclmVar != null) {
            zzclmVar.destroy();
        }
    }

    public final void e(int i, long j) {
        zzcvl zzcvlVar = this.o;
        zzeai a = zzcvlVar.a.a();
        a.b("gqi", zzcvlVar.b.b.b.b);
        a.b("action", "ad_closed");
        a.b("show_time", String.valueOf(j));
        a.b("ad_format", "app_open_ad");
        int i2 = i - 1;
        a.b("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME : "cb" : "cc" : "bb" : com.mbridge.msdk.foundation.same.report.h.b);
        a.c();
    }
}
