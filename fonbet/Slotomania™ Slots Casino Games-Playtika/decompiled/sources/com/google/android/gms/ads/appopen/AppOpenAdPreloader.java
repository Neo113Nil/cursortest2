package com.google.android.gms.ads.appopen;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public final class AppOpenAdPreloader {
    private AppOpenAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        zzel zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzel zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzel zza = zza();
        return zza == null ? new HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(String str) {
        zzel zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(String str) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    public static AppOpenAd pollAd(String str) {
        zzel zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    private static zzel zza() {
        zzel zzelVar = (zzel) zzeu.zzb().zza(AdFormat.APP_OPEN_AD);
        if (zzelVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzelVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzel zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
