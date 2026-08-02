package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbjg;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaa {
    public static volatile float c = -1.0f;
    public static volatile long d;
    public static final Object e = new Object();
    public boolean a = false;
    public float b = 1.0f;

    public static float zze(Context context) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Wf)).booleanValue();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!booleanValue) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            return streamMaxVolume == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : audioManager.getStreamVolume(3) / streamMaxVolume;
        }
        long a = com.google.android.gms.ads.internal.zzt.zzk().a();
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Xf)).intValue();
        if (c != -1.0f && a - d < intValue) {
            return c;
        }
        synchronized (e) {
            try {
                long a2 = com.google.android.gms.ads.internal.zzt.zzk().a();
                if (c != -1.0f && a2 - d < intValue) {
                    return c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    d = a2;
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f = streamVolume / streamMaxVolume2;
                }
                c = f;
                d = a2;
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void zza(float f) {
        this.b = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized float zzb() {
        float f;
        boolean z;
        synchronized (this) {
            f = this.b;
            z = f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (z) {
            return 1.0f;
        }
        return f;
        if (z) {
        }
    }

    public final synchronized void zzc(boolean z) {
        this.a = z;
    }

    public final synchronized boolean zzd() {
        return this.a;
    }
}
