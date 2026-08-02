package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.zzbjg;
import defpackage.me4;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzx extends zzv {
    public static final WindowInsets a(Activity activity, View view, WindowInsets windowInsets) {
        int i;
        if (com.google.android.gms.ads.internal.zzt.zzh().g().zzu() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzj g = com.google.android.gms.ads.internal.zzt.zzh().g();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    int i2 = rect.left;
                    int i3 = rect.top;
                    int i4 = rect.right;
                    int i5 = rect.bottom;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    sb.append(i3);
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    sb.append(i4);
                    String g2 = me4.g(i5, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, sb);
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(g2);
                }
                g.zzv(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().g().zzv("");
            }
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i = attributes.layoutInDisplayCutoutMode;
        if (2 != i) {
            attributes.layoutInDisplayCutoutMode = 2;
            window.setAttributes(attributes);
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzh(final Activity activity) {
        int i;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W1)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().g().zzu() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i = attributes.layoutInDisplayCutoutMode;
            if (1 != i) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.a(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzi(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
