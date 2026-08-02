package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h implements zzifs {
    public static final h a = new h();

    @Override // com.google.android.gms.internal.ads.zzifs
    public final boolean a(int i) {
        zzbil.zzd.zza zzaVar;
        switch (i) {
            case 0:
                zzaVar = zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzaVar = zzbil.zzd.zza.BANNER;
                break;
            case 2:
                zzaVar = zzbil.zzd.zza.INTERSTITIAL;
                break;
            case 3:
                zzaVar = zzbil.zzd.zza.NATIVE_EXPRESS;
                break;
            case 4:
                zzaVar = zzbil.zzd.zza.NATIVE_CONTENT;
                break;
            case 5:
                zzaVar = zzbil.zzd.zza.NATIVE_APP_INSTALL;
                break;
            case 6:
                zzaVar = zzbil.zzd.zza.NATIVE_CUSTOM_TEMPLATE;
                break;
            case 7:
                zzaVar = zzbil.zzd.zza.DFP_BANNER;
                break;
            case 8:
                zzaVar = zzbil.zzd.zza.DFP_INTERSTITIAL;
                break;
            case 9:
                zzaVar = zzbil.zzd.zza.REWARD_BASED_VIDEO_AD;
                break;
            case 10:
                zzaVar = zzbil.zzd.zza.BANNER_SEARCH_ADS;
                break;
            default:
                zzaVar = null;
                break;
        }
        return zzaVar != null;
    }
}
