package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbon extends UnifiedNativeAd {
    public final zzbom a;
    public final zzbmw c;
    public final ArrayList b = new ArrayList();
    public final VideoController d = new VideoController();
    public final ArrayList e = new ArrayList();

    public zzbon(zzbom zzbomVar) {
        zzbmv zzbmvVar;
        this.a = zzbomVar;
        zzbmw zzbmwVar = null;
        try {
            List zzf = zzbomVar.zzf();
            if (zzf != null) {
                for (Object obj : zzf) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbmvVar = queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(iBinder);
                    } else {
                        zzbmvVar = null;
                    }
                    if (zzbmvVar != null) {
                        this.b.add(new zzbmw(zzbmvVar));
                    }
                }
            }
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        try {
            List zzz = this.a.zzz();
            if (zzz != null) {
                for (Object obj2 : zzz) {
                    com.google.android.gms.ads.internal.client.zzdg zza = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzdf.zza((IBinder) obj2) : null;
                    if (zza != null) {
                        this.e.add(new com.google.android.gms.ads.internal.client.zzdh(zza));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
        try {
            zzbmv zzh = this.a.zzh();
            if (zzh != null) {
                zzbmwVar = new zzbmw(zzh);
            }
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
        }
        this.c = zzbmwVar;
        try {
            if (this.a.zzq() != null) {
                new zzbmp(this.a.zzq());
            }
        } catch (RemoteException e4) {
            zzo.zzg("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.V3(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.y3(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.h3(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zza() {
        try {
            return this.a.zze();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzb() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzc() {
        try {
            return this.a.zzg();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzd() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.a.zzj();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzg() {
        try {
            double zzk = this.a.zzk();
            if (zzk == -1.0d) {
                return null;
            }
            return Double.valueOf(zzk);
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.a.zzl();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.a.zzm();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zzj() {
        VideoController videoController = this.d;
        try {
            zzbom zzbomVar = this.a;
            if (zzbomVar.zzn() != null) {
                videoController.zza(zzbomVar.zzn());
            }
        } catch (RemoteException e) {
            zzo.zzg("Exception occurred while getting video controller", e);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzk() {
        try {
            IObjectWrapper zzv = this.a.zzv();
            if (zzv != null) {
                return ObjectWrapper.Z1(zzv);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }
}
