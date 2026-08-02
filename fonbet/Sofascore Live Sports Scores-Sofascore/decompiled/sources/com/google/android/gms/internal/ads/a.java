package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a implements zzifs {
    public static final a a = new a();

    @Override // com.google.android.gms.internal.ads.zzifs
    public final boolean a(int i) {
        zzbil.zza.EnumC0134zza enumC0134zza;
        switch (i) {
            case 0:
                enumC0134zza = zzbil.zza.EnumC0134zza.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                enumC0134zza = zzbil.zza.EnumC0134zza.BANNER;
                break;
            case 2:
                enumC0134zza = zzbil.zza.EnumC0134zza.DFP_BANNER;
                break;
            case 3:
                enumC0134zza = zzbil.zza.EnumC0134zza.INTERSTITIAL;
                break;
            case 4:
                enumC0134zza = zzbil.zza.EnumC0134zza.DFP_INTERSTITIAL;
                break;
            case 5:
                enumC0134zza = zzbil.zza.EnumC0134zza.NATIVE_EXPRESS;
                break;
            case 6:
                enumC0134zza = zzbil.zza.EnumC0134zza.AD_LOADER;
                break;
            case 7:
                enumC0134zza = zzbil.zza.EnumC0134zza.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                enumC0134zza = zzbil.zza.EnumC0134zza.BANNER_SEARCH_ADS;
                break;
            case 9:
                enumC0134zza = zzbil.zza.EnumC0134zza.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                enumC0134zza = zzbil.zza.EnumC0134zza.APP_OPEN;
                break;
            case 11:
                enumC0134zza = zzbil.zza.EnumC0134zza.REWARDED_INTERSTITIAL;
                break;
            default:
                enumC0134zza = null;
                break;
        }
        return enumC0134zza != null;
    }
}
