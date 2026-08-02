package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import xsna.a5j;
import xsna.c5j;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final a5j zzc;
    private final c5j zzd;

    public /* synthetic */ zzn(zzl zzlVar, Activity activity, a5j a5jVar, c5j c5jVar, zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = a5jVar;
        this.zzd = c5jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.List] */
    public static zzci zza(zzn zznVar) {
        Bundle bundle;
        Application application;
        Application application2;
        ArrayList arrayList;
        zzap zzapVar;
        Application application3;
        Application application4;
        Application application5;
        List list;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        Application application9;
        zzci zzciVar = new zzci();
        String str = zznVar.zzd.a;
        if (TextUtils.isEmpty(str)) {
            try {
                application = zznVar.zza.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(str)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzciVar.zza = str;
        if (zznVar.zzc.a) {
            ArrayList arrayList2 = new ArrayList();
            zznVar.zzc.getClass();
            arrayList2.add(zzcd.PREVIEWING_DEBUG_MESSAGES);
            arrayList = arrayList2;
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        zzciVar.zzi = arrayList;
        zzapVar = zznVar.zza.zzb;
        zzciVar.zze = zzapVar.zzc();
        zznVar.zzd.getClass();
        zzciVar.zzd = Boolean.FALSE;
        zzciVar.zzc = Locale.getDefault().toLanguageTag();
        zzce zzceVar = new zzce();
        zzceVar.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzceVar.zza = Build.MODEL;
        zzceVar.zzc = 2;
        zzciVar.zzb = zzceVar;
        application3 = zznVar.zza.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar.zza.zza;
        application4.getResources().getConfiguration();
        zzcg zzcgVar = new zzcg();
        zzcgVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcgVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar.zza.zza;
        zzcgVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        Activity activity = zznVar.zzb;
        Window window = activity == null ? null : activity.getWindow();
        View decorView = window == null ? null : window.getDecorView();
        WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
        if (displayCutout == null) {
            list = Collections.EMPTY_LIST;
        } else {
            displayCutout.getSafeInsetBottom();
            ArrayList arrayList3 = new ArrayList();
            for (Rect rect : displayCutout.getBoundingRects()) {
                if (rect != null) {
                    zzcf zzcfVar = new zzcf();
                    zzcfVar.zzb = Integer.valueOf(rect.left);
                    zzcfVar.zzc = Integer.valueOf(rect.right);
                    zzcfVar.zza = Integer.valueOf(rect.top);
                    zzcfVar.zzd = Integer.valueOf(rect.bottom);
                    arrayList3.add(zzcfVar);
                }
            }
            list = arrayList3;
        }
        zzcgVar.zzd = list;
        zzciVar.zzf = zzcgVar;
        zzl zzlVar = zznVar.zza;
        application6 = zzlVar.zza;
        try {
            application9 = zzlVar.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcc zzccVar = new zzcc();
        zzccVar.zza = application6.getPackageName();
        application7 = zznVar.zza.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar.zza.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        zzccVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzccVar.zzc = Long.toString(packageInfo.getLongVersionCode());
        }
        zzciVar.zzg = zzccVar;
        zzch zzchVar = new zzch();
        zzchVar.zza = "3.0.0";
        zzciVar.zzh = zzchVar;
        return zzciVar;
    }
}
