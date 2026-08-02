package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfcj implements zzfby {
    private final zzhbs zza;
    private final Context zzb;
    private final zzedp zzc;
    private final String zzd;

    zzfcj(zzhbs zzhbsVar, Context context, zzedp zzedpVar, String str) {
        this.zza = zzhbsVar;
        this.zzb = context;
        this.zzc = zzedpVar;
        this.zzd = str;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfci
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfcj.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfch zzc() {
        ActivityInfo activityInfo;
        boolean z;
        String str;
        String str2;
        String str3;
        boolean equals;
        boolean z2;
        PackageInfo packageInfo;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        boolean zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        boolean isLatchsky = DeviceProperties.isLatchsky(context);
        boolean isSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd3 == null || (activityInfo = zzd3.activityInfo) == null) {
            str = null;
            z = true;
        } else {
            try {
                z = true;
                try {
                    PackageInfo packageInfo2 = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo2 != null) {
                        int i2 = packageInfo2.versionCode;
                        String str4 = activityInfo.packageName;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str4).length());
                        sb.append(i2);
                        sb.append(".");
                        sb.append(str4);
                        str = sb.toString();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z = true;
            }
            str = null;
        }
        try {
            packageInfo = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        } catch (Exception unused3) {
        }
        if (packageInfo != null) {
            int i3 = packageInfo.versionCode;
            String str5 = packageInfo.packageName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str5).length());
            sb2.append(i3);
            sb2.append(".");
            sb2.append(str5);
            str2 = sb2.toString();
            String str6 = null;
            String str7 = Build.FINGERPRINT;
            String language2 = Locale.getDefault().getLanguage();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoT)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzq zzk = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb);
                language2 = zzk.zzb();
                str6 = zzk.zza();
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoS)).booleanValue()) {
                language2 = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb).zzb();
            }
            String str8 = str6;
            String str9 = language2;
            Context context2 = this.zzb;
            if (packageManager != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null && resolveActivity != null) {
                    int i4 = 0;
                    while (i4 < queryIntentActivities.size()) {
                        str3 = str2;
                        if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i4).activityInfo.name)) {
                            equals = resolveActivity.activityInfo.packageName.equals(zzimy.zza(context2));
                            break;
                        }
                        i4++;
                        str2 = str3;
                    }
                }
            }
            str3 = str2;
            equals = false;
            com.google.android.gms.ads.internal.zzt.zzc();
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmK)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzE(context2)) {
                    z2 = z;
                    return new zzfch(zzd != null ? z : false, zzd2 != null ? z : false, country, zzy, isLatchsky, isSidewinder, language, arrayList, str, str3, str7, equals, Build.MODEL, availableBytes, z2, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmO)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmQ)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", Build.VERSION.SDK_INT, str9, str8, this.zzc.zza());
                }
            }
            z2 = false;
            return new zzfch(zzd != null ? z : false, zzd2 != null ? z : false, country, zzy, isLatchsky, isSidewinder, language, arrayList, str, str3, str7, equals, Build.MODEL, availableBytes, z2, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmO)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmQ)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", Build.VERSION.SDK_INT, str9, str8, this.zzc.zza());
        }
        str2 = null;
        String str62 = null;
        String str72 = Build.FINGERPRINT;
        String language22 = Locale.getDefault().getLanguage();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoT)).booleanValue()) {
        }
        String str82 = str62;
        String str92 = language22;
        Context context22 = this.zzb;
        if (packageManager != null) {
        }
        str3 = str2;
        equals = false;
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmK)).booleanValue()) {
        }
        z2 = false;
        return new zzfch(zzd != null ? z : false, zzd2 != null ? z : false, country, zzy, isLatchsky, isSidewinder, language, arrayList, str, str3, str72, equals, Build.MODEL, availableBytes2, z2, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmO)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmQ)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context22) : "", Build.VERSION.SDK_INT, str92, str82, this.zzc.zza());
    }
}
