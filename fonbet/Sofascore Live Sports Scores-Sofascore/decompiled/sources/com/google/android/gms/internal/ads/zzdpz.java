package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpz extends zzbmr {
    public final zzdqr a;
    public IObjectWrapper b;

    public zzdpz(zzdqr zzdqrVar) {
        this.a = zzdqrVar;
    }

    public static float E4(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        return (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.Z1(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zze() {
        float f;
        zzcnw zzN;
        int i;
        int i2;
        float f2;
        zzdqr zzdqrVar = this.a;
        synchronized (zzdqrVar) {
            f = zzdqrVar.x;
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (zzdqrVar) {
                f2 = zzdqrVar.x;
            }
            return f2;
        }
        if (zzdqrVar.r() != null) {
            try {
                return zzdqrVar.r().zzm();
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        IObjectWrapper iObjectWrapper = this.b;
        if (iObjectWrapper != null) {
            return E4(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ae)).booleanValue() && zzdqrVar.i() != null && (zzN = zzdqrVar.i().zzN()) != null && (i = zzN.c) >= 0 && (i2 = zzN.b) > 0) {
            return i / i2;
        }
        zzbmv b = zzdqrVar.b();
        if (b == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float zzd = (b.zzd() == -1 || b.zze() == -1) ? 0.0f : b.zzd() / b.zze();
        return zzd == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? E4(b.zza()) : zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.b = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final IObjectWrapper zzg() {
        IObjectWrapper iObjectWrapper = this.b;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbmv b = this.a.b();
        if (b == null) {
            return null;
        }
        return b.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzh() {
        zzdqr zzdqrVar = this.a;
        return zzdqrVar.r() != null ? zzdqrVar.r().zzj() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzi() {
        zzdqr zzdqrVar = this.a;
        return zzdqrVar.r() != null ? zzdqrVar.r().zzk() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.ads.internal.client.zzea zzj() {
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzk() {
        return this.a.r() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzl() {
        zzclm zzclmVar;
        zzdqr zzdqrVar = this.a;
        synchronized (zzdqrVar) {
            zzclmVar = zzdqrVar.j;
        }
        return zzclmVar != null;
    }
}
