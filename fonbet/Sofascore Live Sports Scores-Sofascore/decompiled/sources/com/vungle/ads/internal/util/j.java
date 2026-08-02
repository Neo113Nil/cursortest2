package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import android.webkit.WebView;
import defpackage.a70;
import defpackage.joa;
import defpackage.lnb;
import defpackage.vha;
import defpackage.y99;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j {
    public volatile Function2 a;

    public static int a(Bitmap bitmap, double d, int i, double d2) {
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = (int) (width * d);
        int i5 = (int) (height * d);
        int i6 = width - (i4 * 2);
        int i7 = height - (i5 * 2);
        if (i6 <= 0 || i7 <= 0) {
            return -1;
        }
        long j = i6 * i7;
        if (j > 2147483647L) {
            if (d >= d2) {
                return -1;
            }
            return a(bitmap, d * 2.0d, i, d2);
        }
        int i8 = (int) j;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, i6, i4, i5, i6, i7);
        int i9 = i8 - 1;
        if (i <= 0) {
            a70.p(lnb.n("Step must be positive, was: ", i, '.'));
            return 0;
        }
        int v = vha.v(0, i9, i);
        if (v >= 0) {
            int i10 = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                i2++;
                int i11 = iArr[i10];
                int i12 = (i11 >> 24) & 255;
                int i13 = (i11 >> 16) & 255;
                int i14 = (i11 >> 8) & 255;
                int i15 = i11 & 255;
                if (i12 > 0 && i13 < 10 && i14 < 10 && i15 < 10) {
                    i3++;
                }
                if (i10 == v) {
                    break;
                }
                i10 += i;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (i2 > 0) {
            return (int) ((i3 * 100) / i2);
        }
        return 0;
    }

    public final void a(WebView webView, int i, com.vungle.ads.internal.ui.q qVar) {
        Activity activity;
        qVar.getClass();
        this.a = qVar;
        if (webView == null) {
            boolean z = u.a;
            t.c("BlackScreenDetector", "Black screen detection failed: View not available");
            Function2 function2 = this.a;
            if (function2 != null) {
                function2.invoke(-1, "View not available");
            }
            this.a = null;
            return;
        }
        i iVar = new i(webView, this, i);
        if (this.a == null) {
            return;
        }
        Context context = webView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            boolean z2 = u.a;
            t.c("BlackScreenDetector", "Activity/Window not found for PixelCopy");
            iVar.invoke(null);
        } else {
            Context context2 = webView.getContext();
            context2.getClass();
            joa a = ypa.a(ysa.a, new f(context2));
            Handler handler = y.a;
            y.a(new g(webView, a, this, window, iVar));
        }
    }

    public static final com.vungle.ads.internal.executor.a a(joa joaVar) {
        return (com.vungle.ads.internal.executor.a) joaVar.getValue();
    }

    public static void a(Window window, Rect rect, Bitmap bitmap, Function1 function1) {
        try {
            PixelCopy.request(window, rect, bitmap, new y99(1, function1, bitmap), new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "PixelCopy request failed", th);
            bitmap.recycle();
            function1.invoke(null);
        }
    }

    public static final void a(Function1 function1, Bitmap bitmap, int i) {
        function1.getClass();
        bitmap.getClass();
        if (i == 0) {
            function1.invoke(bitmap);
            return;
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "PixelCopy failed: " + i);
        bitmap.recycle();
        function1.invoke(null);
    }

    public static Pair a(Bitmap bitmap, int i) {
        if (bitmap != null) {
            int a = a(bitmap, 0.1d, i, 0.5d);
            return new Pair(Integer.valueOf(a), a == -1 ? "Internal calculation error" : "");
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "Black screen detection failed: Snapshot capture failure");
        return new Pair(-1, "Snapshot capture failure");
    }

    public static final /* synthetic */ void a(j jVar, Window window, Rect rect, Bitmap bitmap, Function1 function1) {
        jVar.getClass();
        a(window, rect, bitmap, function1);
    }
}
