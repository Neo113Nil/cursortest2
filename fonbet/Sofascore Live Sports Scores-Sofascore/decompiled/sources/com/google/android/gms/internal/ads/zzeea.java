package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeea implements com.google.android.gms.ads.internal.overlay.zzr, zzcni {
    public final Context a;
    public final VersionInfoParcel b;
    public zzedp c;
    public zzclm d;
    public boolean e;
    public boolean f;
    public long g;
    public zzdk h;
    public boolean i;

    public zzeea(Context context, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = versionInfoParcel;
    }

    public final synchronized void a(zzdk zzdkVar, zzbrd zzbrdVar, zzbqw zzbqwVar, zzbqi zzbqiVar) {
        if (c(zzdkVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzclm a = zzcmc.a(this.a, new zzcnw(0, 0, 0), "", false, false, null, null, this.b, null, null, zzbif.a(), null, null, null, null, null);
                this.d = a;
                zzclx zzP = a.zzP();
                if (zzP == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzt.zzh().d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdkVar.zze(zzfmy.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("InspectorUi.openInspector 3", e);
                        return;
                    }
                }
                this.h = zzdkVar;
                Context context = this.a;
                zzP.L(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbrdVar, null, new zzbrc(context), zzbqwVar, zzbqiVar, null, null, null, null, null);
                zzP.g = this;
                this.d.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.wa));
                com.google.android.gms.ads.internal.zzt.zzb();
                zzn.zza(context, new AdOverlayInfoParcel(this, this.d, 1, this.b), true, null);
                this.g = com.google.android.gms.ads.internal.zzt.zzk().a();
            } catch (zzcmb e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzt.zzh().d("InspectorUi.openInspector 0", e2);
                    zzdkVar.zze(zzfmy.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("InspectorUi.openInspector 1", e3);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.e && this.f) {
            zzcgj.f.execute(new fsn(this, 27));
        }
    }

    public final synchronized boolean c(zzdk zzdkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdkVar.zze(zzfmy.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.c == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzh().d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdkVar.zze(zzfmy.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.e && !this.f) {
            if (com.google.android.gms.ads.internal.zzt.zzk().a() >= this.g + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ya)).intValue()) {
                return true;
            }
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdkVar.zze(zzfmy.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.e = true;
            b();
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Ad inspector failed to load.");
        try {
            zzcfv zzh = com.google.android.gms.ads.internal.zzt.zzh();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzh.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            zzdk zzdkVar = this.h;
            if (zzdkVar != null) {
                zzdkVar.zze(zzfmy.d(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.i = true;
        this.d.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdW(int i) {
        this.d.destroy();
        if (!this.i) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            zzdk zzdkVar = this.h;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f = false;
        this.e = false;
        this.g = 0L;
        this.i = false;
        this.h = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.f = true;
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
