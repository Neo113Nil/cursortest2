package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdbs implements zzdgv, zzdmi {
    public final Context a;
    public final zzflw b;
    public final VersionInfoParcel c;
    public final com.google.android.gms.ads.internal.util.zzg d;
    public final zzecu e;
    public final zzfrj f;
    public final zzedp g;

    public zzdbs(Context context, zzflw zzflwVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzj zzjVar, zzecu zzecuVar, zzfrj zzfrjVar, zzedp zzedpVar) {
        this.a = context;
        this.b = zzflwVar;
        this.c = versionInfoParcel;
        this.d = zzjVar;
        this.e = zzecuVar;
        this.f = zzfrjVar;
        this.g = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
        a();
    }

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b5)).booleanValue()) {
            String str = this.b.g;
            zzcfq zzi = this.d.zzi();
            com.google.android.gms.ads.internal.zzt.zzl().zzb(this.a, this.c, str, zzi, this.f, this.g.f());
        }
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c5)).booleanValue()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(String str) {
    }
}
