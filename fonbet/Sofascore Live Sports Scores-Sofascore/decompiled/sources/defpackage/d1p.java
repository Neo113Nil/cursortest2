package defpackage;

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
import com.google.android.gms.internal.consent_sdk.zzaq;
import com.google.android.gms.internal.consent_sdk.zzcf;
import com.google.android.gms.internal.consent_sdk.zzcg;
import com.google.android.gms.internal.consent_sdk.zzch;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzcj;
import com.google.android.gms.internal.consent_sdk.zzck;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d1p {
    public final gvo a;
    public final Activity b;
    public final r0a c;

    public /* synthetic */ d1p(gvo gvoVar, Activity activity, r0a r0aVar, it7 it7Var) {
        this.a = gvoVar;
        this.b = activity;
        this.c = r0aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    public static zzcl a(d1p d1pVar) {
        Bundle bundle;
        String string;
        ArrayList arrayList;
        List list;
        PackageInfo packageInfo;
        zzcl zzclVar = new zzcl();
        gvo gvoVar = d1pVar.a;
        Application application = (Application) gvoVar.b;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        zzclVar.a = string;
        if (d1pVar.c.b) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zzcg.a);
            arrayList = arrayList2;
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        zzclVar.i = arrayList;
        zzclVar.e = ((zzaq) gvoVar.c).a();
        zzclVar.d = Boolean.FALSE;
        zzclVar.c = Locale.getDefault().toLanguageTag();
        zzch zzchVar = new zzch();
        int i = Build.VERSION.SDK_INT;
        zzchVar.b = Integer.valueOf(i);
        zzchVar.a = Build.MODEL;
        zzchVar.c = 2;
        zzclVar.b = zzchVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        zzcj zzcjVar = new zzcj();
        zzcjVar.a = Integer.valueOf(configuration.screenWidthDp);
        zzcjVar.b = Integer.valueOf(configuration.screenHeightDp);
        zzcjVar.c = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list = Collections.EMPTY_LIST;
        } else {
            Activity activity = d1pVar.b;
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
                        zzci zzciVar = new zzci();
                        zzciVar.b = Integer.valueOf(rect.left);
                        zzciVar.c = Integer.valueOf(rect.right);
                        zzciVar.a = Integer.valueOf(rect.top);
                        zzciVar.d = Integer.valueOf(rect.bottom);
                        arrayList3.add(zzciVar);
                    }
                }
                list = arrayList3;
            }
        }
        zzcjVar.d = list;
        zzclVar.f = zzcjVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcf zzcfVar = new zzcf();
        zzcfVar.a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        zzcfVar.b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcfVar.c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzclVar.g = zzcfVar;
        zzck zzckVar = new zzck();
        zzckVar.a = "4.0.0";
        zzclVar.h = zzckVar;
        return zzclVar;
    }
}
