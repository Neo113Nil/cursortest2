package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzdlw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzac extends zzbzs implements zzbga {
    public final AdOverlayInfoParcel a;
    public final Activity b;
    public final boolean f;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean g = false;
    public boolean h = false;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.V5)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzac(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        this.a = adOverlayInfoParcel;
        this.b = activity;
        if (!((Boolean) zzba.zzc().a(zzbjg.Q5)).booleanValue()) {
            if (!((Boolean) zzba.zzc().a(zzbjg.R5)).booleanValue()) {
            }
        }
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj) {
            if (Build.MANUFACTURER.matches((String) zzba.zzc().a(zzbjg.T5))) {
                if (Build.MODEL.matches((String) zzba.zzc().a(zzbjg.U5))) {
                    z = true;
                }
            }
        }
        this.f = z;
    }

    public final synchronized void E4() {
        try {
            if (!this.d) {
                zzr zzrVar = this.a.zzc;
                if (zzrVar != null) {
                    zzrVar.zzdW(4);
                }
                this.d = true;
                if (this.f) {
                    if (((Boolean) zzba.zzc().a(zzbjg.V5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().c(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        if (!z) {
            this.h = true;
        } else if (this.h) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zze() throws RemoteException {
        zzr zzrVar = this.a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final boolean zzf() throws RemoteException {
        return ((Boolean) zzba.zzc().a(zzbjg.R5)).booleanValue() && this.f && this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzg(@Nullable Bundle bundle) {
        zzr zzrVar;
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.ta)).booleanValue();
        Activity activity = this.b;
        if (booleanValue && !this.e) {
            activity.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdlw zzdlwVar = adOverlayInfoParcel.zzu;
            if (zzdlwVar != null) {
                zzdlwVar.M();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzh();
            }
        }
        if (this.f) {
            if (((Boolean) zzba.zzc().a(zzbjg.V5)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().b(this);
            }
        }
        zzc zzcVar = adOverlayInfoParcel.zza;
        zzad zzadVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        zzaa zzaaVar = zzcVar.zzi;
        Activity activity2 = this.b;
        if (zza.zzb(activity2, zzcVar, zzadVar, zzaaVar, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzj() throws RemoteException {
        if (this.c) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.b.finish();
            return;
        }
        this.c = true;
        this.g = true;
        zzr zzrVar = this.a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdx();
        }
        if (this.f) {
            if (((Boolean) zzba.zzc().a(zzbjg.Q5)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzac zzacVar = zzac.this;
                        if (zzacVar.g) {
                            zzacVar.b.finish();
                        }
                    }
                }, ((Integer) zzba.zzc().a(zzbjg.S5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzk() throws RemoteException {
        this.g = false;
        zzr zzrVar = this.a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdw();
        }
        if (this.b.isFinishing()) {
            E4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzn(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzo() throws RemoteException {
        if (this.b.isFinishing()) {
            E4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzp() throws RemoteException {
        if (this.b.isFinishing()) {
            E4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzr() throws RemoteException {
        this.e = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzd() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzG(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzl(int i, int i2, Intent intent) throws RemoteException {
    }
}
