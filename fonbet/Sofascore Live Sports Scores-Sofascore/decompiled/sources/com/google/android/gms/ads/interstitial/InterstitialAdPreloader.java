package com.google.android.gms.ads.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class InterstitialAdPreloader {
    private InterstitialAdPreloader() {
    }

    public static zzem a() {
        zzem zzemVar = (zzem) zzeu.zzb().zza(AdFormat.INTERSTITIAL);
        if (zzemVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzemVar;
    }

    public static boolean destroy(@NonNull String str) {
        zzem a = a();
        if (a == null) {
            return false;
        }
        return a.zzf(str);
    }

    public static void destroyAll() {
        zzem a = a();
        if (a != null) {
            a.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzem a = a();
        if (a == null) {
            return null;
        }
        return a.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzem a = a();
        return a == null ? new HashMap() : a.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzem a = a();
        if (a == null) {
            return 0;
        }
        return a.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzem a = a();
        if (a == null) {
            return false;
        }
        return a.zzd(str);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull String str) {
        zzem a = a();
        if (a == null) {
            return null;
        }
        return a.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzem a = a();
        if (a == null) {
            return false;
        }
        return a.zzc(str, preloadConfiguration);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzem a = a();
        if (a == null) {
            return false;
        }
        return a.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
