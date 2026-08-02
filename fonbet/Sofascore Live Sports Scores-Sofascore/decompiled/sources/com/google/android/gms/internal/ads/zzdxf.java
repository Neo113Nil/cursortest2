package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import defpackage.a1o;
import defpackage.cb;
import defpackage.f0o;
import defpackage.fjn;
import defpackage.g1o;
import defpackage.inn;
import defpackage.qon;
import defpackage.x5n;
import defpackage.y38;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxf {
    public final zzddn a;
    public final zzdlu b;
    public final zzdew c;
    public final zzdfj d;
    public final zzdga e;
    public final zzdit f;
    public final Executor g;
    public final zzdlq h;
    public final zzcuy i;
    public final com.google.android.gms.ads.internal.zzb j;
    public final zzcef k;
    public final zzbbd l;
    public final zzdik m;
    public final zzele n;
    public final zzfte o;
    public final zzeaj p;
    public final zzcub q;
    public final zzdxl r;
    public final zzebm s;
    public final zzdcq t;
    public final zzdck u;
    public final zzdcg v;

    public zzdxf(zzddn zzddnVar, zzdew zzdewVar, zzdfj zzdfjVar, zzdga zzdgaVar, zzdit zzditVar, Executor executor, zzdlq zzdlqVar, zzcuy zzcuyVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar, zzbbd zzbbdVar, zzdik zzdikVar, zzele zzeleVar, zzfte zzfteVar, zzeaj zzeajVar, zzdlu zzdluVar, zzcub zzcubVar, zzdxl zzdxlVar, zzebm zzebmVar, zzdcq zzdcqVar, zzdck zzdckVar, zzdcg zzdcgVar) {
        this.a = zzddnVar;
        this.c = zzdewVar;
        this.d = zzdfjVar;
        this.e = zzdgaVar;
        this.f = zzditVar;
        this.g = executor;
        this.h = zzdlqVar;
        this.i = zzcuyVar;
        this.j = zzbVar;
        this.k = zzcefVar;
        this.l = zzbbdVar;
        this.m = zzdikVar;
        this.n = zzeleVar;
        this.o = zzfteVar;
        this.p = zzeajVar;
        this.b = zzdluVar;
        this.q = zzcubVar;
        this.r = zzdxlVar;
        this.s = zzebmVar;
        this.t = zzdcqVar;
        this.u = zzdckVar;
        this.v = zzdcgVar;
    }

    public static final zzcgo b(zzclm zzclmVar, String str, String str2, zzeae zzeaeVar, zzfrg zzfrgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V2)).booleanValue()) {
            x5n.q("rendering-webview-load-html-start", zzeaeVar);
        }
        zzcgo zzcgoVar = new zzcgo();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.qa)).booleanValue()) {
            zzfqw e = zzfqw.e(112, zzclmVar.getContext());
            e.zza();
            zzfrf.c(zzcgoVar, zzfrgVar, e, false);
        }
        zzclmVar.zzP().g = new f0o(4, zzeaeVar, zzcgoVar);
        zzclmVar.G(str, str2);
        return zzcgoVar;
    }

    public final void a(zzclm zzclmVar, boolean z, zzbqk zzbqkVar, zzeae zzeaeVar) {
        zzbay zzbayVar;
        inn innVar = zzbjg.V2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
            x5n.q("rendering-configure-webview-start", zzeaeVar);
        }
        zzclmVar.zzP().L(new com.google.android.gms.ads.internal.client.zza() { // from class: o1o
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                zzdxf.this.a.onAdClicked();
            }
        }, this.d, this.e, new zzboz() { // from class: k1o
            @Override // com.google.android.gms.internal.ads.zzboz
            public final /* synthetic */ void l0(String str, String str2) {
                zzdxf.this.f.l0(str, str2);
            }
        }, new g1o(this, 2), z, zzbqkVar, this.j, new fjn(this, 10), this.k, this.n, this.o, this.p, null, this.b, null, null, null, this.q, this.s, this.t, this.u, this.v);
        int i = 3;
        zzclmVar.setOnTouchListener(new y38(this, i));
        zzclmVar.setOnClickListener(new cb(this, 14));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E3)).booleanValue() && (zzbayVar = this.l.b) != null) {
            zzbayVar.zzh(zzclmVar.zzE());
        }
        zzdlq zzdlqVar = this.h;
        Executor executor = this.g;
        zzdlqVar.n0(zzclmVar, executor);
        zzdlqVar.n0(new a1o(zzclmVar, 2), executor);
        zzdlqVar.q0(zzclmVar.zzE());
        zzclmVar.T("/trackActiveViewUnit", new qon(i, this, zzclmVar));
        zzcuy zzcuyVar = this.i;
        zzcuyVar.getClass();
        zzcuyVar.j = new WeakReference(zzclmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
            x5n.q("rendering-configure-webview-end", zzeaeVar);
        }
    }
}
