package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bxn;
import defpackage.fl5;
import defpackage.qc4;
import defpackage.w00;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzesz extends com.google.android.gms.ads.internal.client.zzbt {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzbh b;
    public final zzflw c;
    public final bxn d;
    public final FrameLayout e;
    public final zzeaj f;

    public zzesz(Context context, com.google.android.gms.ads.internal.client.zzbh zzbhVar, zzflw zzflwVar, bxn bxnVar, zzeaj zzeajVar) {
        this.a = context;
        this.b = zzbhVar;
        this.c = zzflwVar;
        this.d = bxnVar;
        this.f = zzeajVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = bxnVar.m;
        com.google.android.gms.ads.internal.zzt.zzc();
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzm().zzc);
        frameLayout.setMinimumWidth(zzm().zzf);
        this.e = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzE() {
        return this.d.e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.kd)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzeua zzeuaVar = this.c.c;
        if (zzeuaVar != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.f.b();
                }
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            zzeuaVar.c.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) {
        zzdck zzdckVar = this.d.j;
        if (zzdckVar != null) {
            zzdckVar.a(j);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() {
        zzdck zzdckVar;
        bxn bxnVar = this.d;
        if (bxnVar == null || (zzdckVar = bxnVar.j) == null) {
            return 0L;
        }
        return zzdckVar.a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        return new ObjectWrapper(this.e);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzb() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzdeo zzdeoVar = this.d.c;
        zzdeoVar.getClass();
        zzdeoVar.p0(new qc4(null, 4));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        zzeua zzeuaVar = this.c.c;
        if (zzeuaVar != null) {
            zzeuaVar.A(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zze() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzdeo zzdeoVar = this.d.c;
        zzdeoVar.getClass();
        zzdeoVar.p0(new fl5(null, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzdeo zzdeoVar = this.d.c;
        zzdeoVar.getClass();
        zzdeoVar.p0(new w00(null, 3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
        this.d.j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzm() {
        Preconditions.e("getAdSize must be called on the main UI thread.");
        return zzfmc.a(this.a, Collections.singletonList(this.d.f()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.e("setAdSize must be called on the main UI thread.");
        bxn bxnVar = this.d;
        if (bxnVar != null) {
            bxnVar.d(this.e, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzq() {
        return this.d.f.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        return this.d.f.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdx zzs() {
        return this.d.f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return this.c.g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        return this.c.o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzw(zzbkb zzbkbVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzz() {
        bxn bxnVar = this.d;
        return bxnVar != null && bxnVar.b.q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }
}
