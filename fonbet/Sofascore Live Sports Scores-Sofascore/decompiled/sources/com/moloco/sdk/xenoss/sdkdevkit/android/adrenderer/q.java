package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q {
    public final Context a;

    public q(Context context) {
        context.getClass();
        this.a = context;
    }

    public final com.moloco.sdk.common_adapter_internal.a a() {
        DisplayMetrics displayMetrics;
        Context context = this.a;
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        if (windowManager == null) {
            return new com.moloco.sdk.common_adapter_internal.a(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            displayMetrics = new DisplayMetrics();
            displayMetrics.density = context.getResources().getDisplayMetrics().density;
            displayMetrics.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
            displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
            displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        } else {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        return new com.moloco.sdk.common_adapter_internal.a(i, i2, i / f, i2 / f, displayMetrics.densityDpi, f);
    }
}
