package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ilo;
import defpackage.lrn;
import defpackage.ng2;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdvt implements Callable {
    public final com.google.android.gms.ads.internal.zza a;
    public final Context b;
    public final zzeaj c;
    public final zzele d;
    public final Executor e;
    public final zzbbd f;
    public final VersionInfoParcel g;
    public final zzfte h;
    public final zzelp i;
    public final zzfma j;
    public final zzdcg k;

    public zzdvt(Context context, Executor executor, zzbbd zzbbdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzele zzeleVar, zzfte zzfteVar, zzeaj zzeajVar, zzelp zzelpVar, zzfma zzfmaVar, zzdcg zzdcgVar) {
        this.b = context;
        this.e = executor;
        this.f = zzbbdVar;
        this.g = versionInfoParcel;
        this.a = zzaVar;
        this.d = zzeleVar;
        this.h = zzfteVar;
        this.c = zzeajVar;
        this.i = zzelpVar;
        this.j = zzfmaVar;
        this.k = zzdcgVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzdvv zzdvvVar = new zzdvv(this);
        synchronized (zzdvvVar) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N4);
            zzbbd zzbbdVar = zzdvvVar.f;
            com.google.android.gms.ads.internal.zza zzaVar = zzdvvVar.b;
            zzelp zzelpVar = zzdvvVar.k;
            ilo i = zzhcy.i(zzhcy.d(new ng2(zzdvvVar.c, zzbbdVar, zzdvvVar.g, zzaVar, zzelpVar, zzdvvVar.l, zzdvvVar.d, str), zzcgj.f), new lrn(zzdvvVar, 1), zzdvvVar.e);
            zzdvvVar.n = i;
            zzcgm.a(i, "NativeJavascriptExecutor.initializeEngine", zzcgj.h);
        }
        return zzdvvVar;
    }
}
