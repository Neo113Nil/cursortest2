package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.qon;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdus {
    public final zzflw a;
    public final Executor b;
    public final zzdxg c;
    public final zzdwb d;
    public final Context e;
    public final zzeaj f;
    public final zzfte g;
    public final zzele h;
    public final zzdcg i;
    public final zzeae j;
    public final zzebm k;

    public zzdus(zzflw zzflwVar, Executor executor, zzdxg zzdxgVar, Context context, zzeaj zzeajVar, zzfte zzfteVar, zzele zzeleVar, zzdwb zzdwbVar, zzeae zzeaeVar, zzebm zzebmVar, zzdcg zzdcgVar) {
        this.a = zzflwVar;
        this.b = executor;
        this.c = zzdxgVar;
        this.e = context;
        this.f = zzeajVar;
        this.g = zzfteVar;
        this.h = zzeleVar;
        this.d = zzdwbVar;
        this.j = zzeaeVar;
        this.k = zzebmVar;
        this.i = zzdcgVar;
    }

    public static final void b(zzclm zzclmVar) {
        zzclmVar.T("/videoClicked", zzbqg.d);
        zzclx zzP = zzclmVar.zzP();
        synchronized (zzP.d) {
            zzP.r = true;
        }
        zzclmVar.T("/getNativeAdViewSignals", zzbqg.n);
        zzclmVar.T("/getNativeClickMeta", zzbqg.o);
    }

    public final void a(zzclm zzclmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar) {
        zzebm zzebmVar;
        b(zzclmVar);
        zzclmVar.T("/video", zzbqg.g);
        zzclmVar.T("/videoMeta", zzbqg.h);
        zzclmVar.T("/precache", new zzcjt());
        zzclmVar.T("/delayPageLoaded", zzbqg.k);
        zzclmVar.T("/instrument", zzbqg.i);
        zzclmVar.T("/log", zzbqg.c);
        Object obj = null;
        zzclmVar.T("/click", new qon(0, obj, obj));
        if (this.a.b != null) {
            zzclmVar.zzP().D(true);
            zzclmVar.T("/open", new zzbqv(true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yf)).booleanValue() ? null : zzbVar, null, null, null, null, null, this.i));
        } else {
            zzclmVar.zzP().D(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().a(zzclmVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzclmVar.e() != null) {
                hashMap = zzclmVar.e().w0;
            }
            zzclmVar.T("/logScionEvent", new zzbqn(zzclmVar.getContext(), hashMap));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yf)).booleanValue()) {
            zzclmVar.zzP().w = zzbVar;
            zzclmVar.zzP().y = zzcefVar;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q8)).booleanValue() || (zzebmVar = this.k) == null) {
            return;
        }
        zzclmVar.T("/onDeviceStorageEvent", new zzbqp(zzebmVar));
    }
}
