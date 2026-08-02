package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbv implements zzfdi {
    public final ApplicationInfo a;
    public final PackageInfo b;
    public final Context c;

    public zzfbv(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.a = applicationInfo;
        this.b = packageInfo;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        String str;
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        Context context = this.c;
        String str5 = this.a.packageName;
        String str6 = null;
        PackageInfo packageInfo = this.b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str7 = packageInfo == null ? null : packageInfo.versionName;
        try {
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            Context context2 = Wrappers.a(context).a;
            str = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str5, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.we)).booleanValue()) {
                try {
                    installSourceInfo = context.getPackageManager().getInstallSourceInfo(str5);
                } catch (PackageManager.NameNotFoundException e) {
                    e = e;
                    str4 = null;
                }
                if (installSourceInfo != null) {
                    str4 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str4)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str4 = null;
                        }
                        try {
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                        } catch (PackageManager.NameNotFoundException e2) {
                            e = e2;
                        }
                        try {
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                            str6 = initiatingPackageName;
                            com.google.android.gms.ads.internal.zzt.zzh().d("PackageInfoSignalSource.getInstallSourceInfo", e);
                            str3 = str6;
                            str2 = str4;
                            return zzhcy.a(new zzfbw(valueOf, str5, str7, str, str2, str3));
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        e = e4;
                    }
                    if (!TextUtils.isEmpty(initiatingPackageName)) {
                        str3 = initiatingPackageName;
                        str2 = str4;
                        return zzhcy.a(new zzfbw(valueOf, str5, str7, str, str2, str3));
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                    str3 = str6;
                    str2 = str4;
                    return zzhcy.a(new zzfbw(valueOf, str5, str7, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzhcy.a(new zzfbw(valueOf, str5, str7, str, str2, str3));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 29;
    }
}
