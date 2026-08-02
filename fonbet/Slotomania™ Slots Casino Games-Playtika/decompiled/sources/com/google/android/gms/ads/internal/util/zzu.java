package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbie;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public class zzu extends zzt {
    static final boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfZ)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgb)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, configuration.screenHeightDp);
        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzv = zzs.zzv(windowManager);
        int i = zzv.heightPixels;
        int i2 = zzv.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfX)).intValue();
        return (zze(i, zzE + dimensionPixelSize, round) && zze(i2, zzE2, round)) ? false : true;
    }
}
