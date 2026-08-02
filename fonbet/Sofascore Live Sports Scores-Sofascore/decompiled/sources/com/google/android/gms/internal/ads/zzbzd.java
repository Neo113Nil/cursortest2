package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzd extends NativeAd {
    public final zzbom a;
    public final zzbzc c;
    public final zzbza d;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final AtomicLong f = new AtomicLong();

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|(3:19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23)))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: RemoteException -> 0x00b0, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00b0, blocks: (B:42:0x009b, B:44:0x00a3), top: B:41:0x009b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbzd(zzbom zzbomVar) {
        zzbzc zzbzcVar;
        zzbmv zzh;
        this.a = zzbomVar;
        zzbza zzbzaVar = null;
        try {
            List zzf = zzbomVar.zzf();
            if (zzf != null) {
                for (Object obj : zzf) {
                    zzbmv E4 = obj instanceof IBinder ? zzbmu.E4((IBinder) obj) : null;
                    if (E4 != null) {
                        this.b.add(new zzbzc(E4));
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
            zzh = this.a.zzh();
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
        }
        if (zzh != null) {
            zzbzcVar = new zzbzc(zzh);
            this.c = zzbzcVar;
            if (this.a.zzq() != null) {
                zzbzaVar = new zzbza(this.a.zzq());
            }
            this.d = zzbzaVar;
        }
        zzbzcVar = null;
        this.c = zzbzcVar;
        if (this.a.zzq() != null) {
        }
        this.d = zzbzaVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ IObjectWrapper a() {
        try {
            return this.a.zzu();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.j();
        } catch (RemoteException e) {
            zzo.zzg("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzD();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzj();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.a.zzg();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzw = this.a.zzw();
            if (zzw != null) {
                return zzw;
            }
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.a.zze();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            zzbom zzbomVar = this.a;
            if (zzbomVar.zzF() != null) {
                return new zzfb(zzbomVar.zzF(), null);
            }
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.f;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long b = this.a.b();
                    AtomicLong atomicLong2 = this.f;
                    atomicLong2.set(b);
                    j = atomicLong2.get();
                } catch (RemoteException e) {
                    zzo.zzg("Failed to getPlacementId", e);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.a.zzm();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.a.zzH();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            zzdxVar = null;
        }
        return ResponseInfo.zzb(zzdxVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.a.zzl();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzA();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        zzbom zzbomVar = this.a;
        try {
            try {
                if (zzbomVar.zzA()) {
                    if (muteThisAdReason == null) {
                        zzbomVar.m1(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzdh) {
                        zzbomVar.m1(((com.google.android.gms.ads.internal.client.zzdh) muteThisAdReason).zza());
                        return;
                    } else {
                        zzo.zzf("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                zzo.zzg("", e);
            }
            zzo.zzf("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.V3(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzE();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.a.g1(bundle);
        } catch (RemoteException e) {
            zzo.zzg("Failed to record native event", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.y3(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.h3(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.C2(new com.google.android.gms.ads.internal.client.zzdd(muteThisAdListener));
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.l1(new zzfo(onPaidEventListener));
        } catch (RemoteException e) {
            zzo.zzg("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setPlacementId(long j) {
        try {
            this.a.E2(j);
            this.f.set(j);
        } catch (RemoteException e) {
            zzo.zzg("Failed to setPlacementId", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.Q(new zzbzj(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzo.zzg("Failed to setUnconfirmedClickListener", e);
        }
    }
}
