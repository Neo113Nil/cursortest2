package com.bytedance.sdk.component.adexpress.oo;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tz;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    public static String gm(@NonNull Context context) {
        String str;
        try {
            Locale locale = tz.sf(context).getConfiguration().getLocales().get(0);
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return pcc(str);
    }

    private static float oo(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static String pcc(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }

    public static int sf(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int sf(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        float oo = oo(context);
        if (oo <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            oo = 1.0f;
        }
        return (int) ((f / oo) + 0.5f);
    }

    public static float gm(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        return f * oo(context);
    }

    public static float pcc(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        return (f * oo(context)) + 0.5f;
    }

    public static int pcc(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int pcc(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }
}
