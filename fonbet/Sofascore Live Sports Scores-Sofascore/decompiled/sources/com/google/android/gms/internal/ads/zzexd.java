package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzexd implements zzfdg {
    public final Integer a;

    public zzexd(Integer num) {
        this.a = num;
    }

    public static /* synthetic */ zzexd a(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hb)).booleanValue()) {
            return new zzexd(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int i = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Kb)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Jb)).intValue() && i2 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                i = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getAdServicesExtensionVersion", e);
        }
        return new zzexd(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
