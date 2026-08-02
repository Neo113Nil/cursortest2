package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import defpackage.bnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzefd implements zzdgv, zzdmi, zzdfd, zzdej {
    public final Context a;
    public final zzeaj b;

    public zzefd(Context context, zzeaj zzeajVar) {
        this.a = context;
        this.b = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K5)).booleanValue()) {
            a(this.a);
        }
    }

    public final void a(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I5)).booleanValue()) {
            zzcgj.a.execute(new bnn(14, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(String str) {
    }
}
