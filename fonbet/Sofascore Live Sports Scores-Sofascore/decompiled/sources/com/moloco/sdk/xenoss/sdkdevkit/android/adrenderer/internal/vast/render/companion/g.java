package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import android.content.Context;
import android.content.res.Resources;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzcll;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzgvc;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.b10;
import defpackage.beh;
import defpackage.ddi;
import defpackage.dnd;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements h, o, zzgvc {
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public final Object o;
    public final Object p;

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b bVar, int i, Context context, com.moloco.sdk.internal.services.events.c cVar, t0 t0Var, boolean z, k kVar) {
        bVar.getClass();
        context.getClass();
        cVar.getClass();
        t0Var.getClass();
        this.d = bVar;
        this.a = context;
        this.e = cVar;
        this.f = t0Var;
        this.b = z;
        this.g = kVar;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.h = c;
        this.i = new b10(i, c);
        this.j = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) dnd.f(0L)) / Resources.getSystem().getDisplayMetrics().density, ((int) dnd.g(0L)) / Resources.getSystem().getDisplayMetrics().density);
        List list = bVar.e;
        ArrayList arrayList = bVar.f;
        n nVar = new n();
        f1 b = g1.b();
        cVar.getClass();
        b.getClass();
        com.moloco.sdk.internal.ilrd.n nVar2 = new com.moloco.sdk.internal.ilrd.n();
        nVar2.a = cVar;
        nVar2.c = list;
        nVar2.d = arrayList;
        nVar2.b = nVar;
        nVar2.e = b;
        this.k = nVar2;
        rq3 rq3Var = null;
        aeh b2 = beh.b(0, 0, null, 7);
        this.l = b2;
        this.m = b2;
        this.c = bVar.d != null;
        s sVar = (s) this.n;
        fdi a = gdi.a(sVar != null ? sVar.a : null);
        this.o = a;
        this.p = a;
        xw3.L(c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, rq3Var, 10), 3);
    }

    public void a(e eVar) {
        xw3.L((ad2) this.h, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, eVar, null, 11), 3);
    }

    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        gVar.getClass();
        String str = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b) this.d).d;
        if (str != null) {
            ((com.moloco.sdk.internal.ilrd.n) this.k).b(gVar);
            a(a.a);
            ((k) this.g).a(str);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        s9a.o((ad2) this.h, null);
        s sVar = (s) this.n;
        if (sVar != null) {
            sVar.destroy();
        }
        this.n = null;
        ((fdi) this.o).l(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public ddi l() {
        return (jof) ((b10) this.i).d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void reset() {
        ((b10) this.i).reset();
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        zzcnw zzcnwVar = (zzcnw) this.d;
        String str = (String) this.e;
        boolean z = this.b;
        boolean z2 = this.c;
        zzelp zzelpVar = (zzelp) this.p;
        zzeaj zzeajVar = (zzeaj) this.o;
        zzn zznVar = (zzn) this.i;
        zza zzaVar = (zza) this.j;
        zzbif zzbifVar = (zzbif) this.k;
        zzfld zzfldVar = (zzfld) this.l;
        zzflg zzflgVar = (zzflg) this.m;
        zzfma zzfmaVar = (zzfma) this.n;
        zzbbd zzbbdVar = (zzbbd) this.f;
        zzbkn zzbknVar = (zzbkn) this.g;
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.h;
        Context context = this.a;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = com.google.android.gms.internal.ads.n.c0;
            zzcno zzcnoVar = new zzcno(context);
            zzcnoVar.setBaseContext(context);
            zzcmi zzcmiVar = new zzcmi(new com.google.android.gms.internal.ads.n(zzcnoVar, zzcnwVar, str, z, zzbbdVar, zzbknVar, versionInfoParcel, zznVar, zzaVar, zzbifVar, zzfldVar, zzflgVar, zzfmaVar), zzeajVar);
            zzcmiVar.setWebViewClient(zzt.zzf().zzb(zzcmiVar, zzbifVar, z2, zzelpVar));
            zzcmiVar.setWebChromeClient(new zzcll(zzcmiVar));
            return zzcmiVar;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public /* synthetic */ g(Context context, zzcnw zzcnwVar, String str, boolean z, boolean z2, zzbbd zzbbdVar, zzbkn zzbknVar, VersionInfoParcel versionInfoParcel, zzn zznVar, zza zzaVar, zzbif zzbifVar, zzfld zzfldVar, zzflg zzflgVar, zzfma zzfmaVar, zzeaj zzeajVar, zzelp zzelpVar) {
        this.a = context;
        this.d = zzcnwVar;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = zzbbdVar;
        this.g = zzbknVar;
        this.h = versionInfoParcel;
        this.i = zznVar;
        this.j = zzaVar;
        this.k = zzbifVar;
        this.l = zzfldVar;
        this.m = zzflgVar;
        this.n = zzfmaVar;
        this.o = zzeajVar;
        this.p = zzelpVar;
    }
}
