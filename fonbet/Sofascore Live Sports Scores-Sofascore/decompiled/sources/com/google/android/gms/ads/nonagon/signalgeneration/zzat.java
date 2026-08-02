package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbil;
import com.ironsource.mediationsdk.j;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzat {
    public final String a;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final zzbil.zza.EnumC0134zza zzc() {
        String str = this.a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return zzbil.zza.EnumC0134zza.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return zzbil.zza.EnumC0134zza.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return zzbil.zza.EnumC0134zza.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals(j.a)) {
                    return zzbil.zza.EnumC0134zza.BANNER;
                }
                break;
        }
        return zzbil.zza.EnumC0134zza.AD_INITIATER_UNSPECIFIED;
    }
}
