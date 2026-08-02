package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.vungle.ads.internal.presenter.e0;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a0 {
    public static Pair a(Context context) {
        context.getClass();
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = resources.getConfiguration().orientation;
        return new Pair(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)));
    }

    public static WebView a(Context context, String str) {
        context.getClass();
        try {
            return e0.a(context, str);
        } catch (Resources.NotFoundException e) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e + ".message");
        } catch (Exception e2) {
            throw new InstantiationException(e2.getMessage());
        }
    }

    public static int a(Context context, int i) {
        context.getClass();
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
