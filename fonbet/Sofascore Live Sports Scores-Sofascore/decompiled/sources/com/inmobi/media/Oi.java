package com.inmobi.media;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.aal;
import defpackage.bea;
import defpackage.bka;
import defpackage.ild;
import defpackage.joa;
import defpackage.p93;
import defpackage.pea;
import defpackage.y9l;
import defpackage.ypa;
import defpackage.z9l;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Oi {
    public static final joa a = ypa.b(new ild(4));

    public static final Uo a(Uo uo, Uo uo2, Uo uo3, Uo uo4) {
        uo.getClass();
        uo2.getClass();
        uo3.getClass();
        uo4.getClass();
        return new Uo(p93.c(uo.a, uo2.a, uo3.a, uo4.a), p93.c(uo.b, uo2.b, uo3.b, uo4.b), p93.c(uo.c, uo2.c, uo3.c, uo4.c), p93.c(uo.d, uo2.d, uo3.d, uo4.d));
    }

    public static final Uo b(WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        int i4;
        windowInsets.getClass();
        Uo e = e(windowInsets);
        Uo c = c(windowInsets);
        Uo d = d(windowInsets);
        windowInsets.getClass();
        Insets insets = windowInsets.getInsets(2);
        insets.getClass();
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return a(e, c, d, new Uo(i, i2, i3, i4));
    }

    public static final Uo c(WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        int i4;
        windowInsets.getClass();
        F5.a.getClass();
        if (F5.t()) {
            Insets insets = windowInsets.getInsets(128);
            insets.getClass();
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            return new Uo(i, i2, i3, i4);
        }
        if (!F5.r()) {
            return (Uo) a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new Uo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final Uo d(WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        windowInsets.getClass();
        F5.a.getClass();
        if (!F5.u()) {
            return (Uo) a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int i4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            i = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner.getRadius());
        } else {
            i = 0;
        }
        if (roundedCorner2 != null) {
            i2 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner2.getRadius());
        } else {
            i2 = 0;
        }
        if (roundedCorner3 != null) {
            i3 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner3.getRadius());
        } else {
            i3 = 0;
        }
        if (roundedCorner4 != null) {
            i4 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner4.getRadius());
        }
        return new Uo(Math.max(i, i2), Math.max(i2, i3), Math.max(i4, i3), Math.max(i, i4));
    }

    public static final Uo e(WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        windowInsets.getClass();
        F5.a.getClass();
        if (F5.t()) {
            Insets insets = windowInsets.getInsets(16);
            insets.getClass();
            i5 = insets.left;
            i6 = insets.top;
            i7 = insets.right;
            i8 = insets.bottom;
            return new Uo(i5, i6, i7, i8);
        }
        if (!F5.s()) {
            return (Uo) a.getValue();
        }
        i = windowInsets.getSystemGestureInsets().left;
        i2 = windowInsets.getSystemGestureInsets().top;
        i3 = windowInsets.getSystemGestureInsets().right;
        i4 = windowInsets.getSystemGestureInsets().bottom;
        return new Uo(i, i2, i3, i4);
    }

    public static final void b(Window window) {
        window.getClass();
        F5.a.getClass();
        if (F5.r()) {
            window.getClass();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 0;
            window.setAttributes(attributes);
            bea.L(window, true);
        }
    }

    public static final Uo a() {
        return new Uo(0, 0, 0, 0);
    }

    public static final Uo a(WindowInsets windowInsets) {
        windowInsets.getClass();
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (Uo) a.getValue());
    }

    public static final JSONObject a(String str, int i) {
        JSONObject a2 = AbstractC3734rj.a(str, "targetViewId", "id", str);
        a2.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        return a2;
    }

    public static final void a(Window window) {
        pea y9lVar;
        window.getClass();
        F5.a.getClass();
        if (F5.t()) {
            bka bkaVar = new bka(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                y9lVar = new aal(window, bkaVar);
            } else if (i >= 30) {
                y9lVar = new z9l(window, bkaVar);
            } else {
                y9lVar = new y9l(window, bkaVar);
            }
            y9lVar.D();
            y9lVar.x(519);
            y9lVar.x(128);
            return;
        }
        if (F5.w()) {
            window.getDecorView().setSystemUiVisibility(5638);
        }
    }

    public static final void a(Window window, int i) {
        window.getClass();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = i;
        window.setAttributes(attributes);
        bea.L(window, false);
    }

    public static final void c(Window window) {
        pea y9lVar;
        window.getClass();
        F5.a.getClass();
        if (F5.t()) {
            bka bkaVar = new bka(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                y9lVar = new aal(window, bkaVar);
            } else if (i >= 30) {
                y9lVar = new z9l(window, bkaVar);
            } else {
                y9lVar = new y9l(window, bkaVar);
            }
            y9lVar.E(519);
            y9lVar.E(128);
            return;
        }
        if (F5.w()) {
            window.getDecorView().setSystemUiVisibility(0);
        }
    }
}
