package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.cun;
import defpackage.u8f;
import defpackage.v9f;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdwk extends zzcyl {
    public final Context l;
    public final WeakReference m;
    public final zzdom n;
    public final zzdla o;
    public final zzdec p;
    public final zzdfj q;
    public final zzczg r;
    public final zzcdr s;
    public final zzfys t;
    public final zzflq u;
    public final zzeaj v;
    public boolean w;

    public zzdwk(zzcyk zzcykVar, Context context, zzclm zzclmVar, zzdom zzdomVar, zzdla zzdlaVar, zzdec zzdecVar, zzdfj zzdfjVar, zzczg zzczgVar, zzfld zzfldVar, zzfys zzfysVar, zzflq zzflqVar, zzeaj zzeajVar) {
        super(zzcykVar);
        this.w = false;
        this.l = context;
        this.n = zzdomVar;
        this.m = new WeakReference(zzclmVar);
        this.o = zzdlaVar;
        this.p = zzdecVar;
        this.q = zzdfjVar;
        this.r = zzczgVar;
        this.t = zzfysVar;
        zzcct zzcctVar = zzfldVar.l;
        this.s = new zzcdr(zzcctVar != null ? zzcctVar.a : "", zzcctVar != null ? zzcctVar.b : 1);
        this.u = zzflqVar;
        this.v = zzeajVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdom zzdomVar = this.n;
        boolean zzR = com.google.android.gms.ads.internal.util.zzs.zzR(zzdomVar.zzb());
        Context context = this.l;
        zzdec zzdecVar = this.p;
        if (!zzR) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.uf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(context, this.b, this.v);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s1)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    zzdecVar.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t1)).booleanValue()) {
                        this.t.a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.w) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("The rewarded ad have been showed.");
            zzdecVar.zzc(zzfmy.d(10, null, null));
            return;
        }
        this.w = true;
        v9f v9fVar = v9f.g;
        zzdla zzdlaVar = this.o;
        zzdlaVar.p0(v9fVar);
        if (activity == null) {
            activity = context;
        }
        try {
            zzdomVar.b(z, activity, zzdecVar);
            zzdlaVar.p0(u8f.f);
        } catch (zzdol e) {
            zzdecVar.L(e);
        }
    }

    public final void finalize() {
        try {
            zzclm zzclmVar = (zzclm) this.m.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M7)).booleanValue()) {
                if (!this.w && zzclmVar != null) {
                    zzcgj.f.execute(new cun(zzclmVar, 6));
                }
            } else if (zzclmVar != null) {
                zzclmVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
