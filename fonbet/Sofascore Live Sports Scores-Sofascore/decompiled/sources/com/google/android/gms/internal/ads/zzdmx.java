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
public final class zzdmx extends zzcyl {
    public final Context l;
    public final WeakReference m;
    public final zzdla n;
    public final zzdom o;
    public final zzczg p;
    public final zzfys q;
    public final zzdec r;
    public final zzcga s;
    public final zzeaj t;
    public boolean u;

    public zzdmx(zzcyk zzcykVar, Context context, zzclm zzclmVar, zzdla zzdlaVar, zzdom zzdomVar, zzczg zzczgVar, zzfys zzfysVar, zzdec zzdecVar, zzcga zzcgaVar, zzeaj zzeajVar) {
        super(zzcykVar);
        this.u = false;
        this.l = context;
        this.m = new WeakReference(zzclmVar);
        this.n = zzdlaVar;
        this.o = zzdomVar;
        this.p = zzczgVar;
        this.q = zzfysVar;
        this.r = zzdecVar;
        this.s = zzcgaVar;
        this.t = zzeajVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z) {
        zzfld e;
        int i;
        Context context = this.l;
        zzdec zzdecVar = this.r;
        zzdla zzdlaVar = this.n;
        zzdlaVar.p0(v9f.g);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdom zzdomVar = this.o;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdomVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.uf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(context, this.b, this.t);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s1)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    zzdecVar.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t1)).booleanValue()) {
                        this.q.a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        zzclm zzclmVar = (zzclm) this.m.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cd)).booleanValue() && zzclmVar != null && (e = zzclmVar.e()) != null && e.r0) {
            int i3 = e.s0;
            zzcga zzcgaVar = this.s;
            synchronized (zzcgaVar.a) {
                zzcfx zzcfxVar = zzcgaVar.d;
                synchronized (zzcfxVar.f) {
                    i = zzcfxVar.l;
                }
            }
            if (i3 != i) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("The interstitial consent form has been shown.");
                zzdecVar.zzc(zzfmy.d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.u) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("The interstitial ad has been shown.");
            zzdecVar.zzc(zzfmy.d(10, null, null));
        }
        if (this.u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            zzdomVar.b(z, activity, zzdecVar);
            zzdlaVar.p0(u8f.f);
            this.u = true;
        } catch (zzdol e2) {
            zzdecVar.L(e2);
        }
    }

    public final void finalize() {
        try {
            zzclm zzclmVar = (zzclm) this.m.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M7)).booleanValue()) {
                if (!this.u && zzclmVar != null) {
                    zzcgj.f.execute(new cun(zzclmVar, 4));
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
