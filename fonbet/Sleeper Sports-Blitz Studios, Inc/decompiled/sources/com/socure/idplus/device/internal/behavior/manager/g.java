package com.socure.idplus.device.internal.behavior.manager;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import com.socure.idplus.device.internal.behavior.model.Orientation;
import com.socure.idplus.device.internal.behavior.model.ViewportSizeEvent;
import com.socure.idplus.device.internal.input.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final l f851a;
    public ViewportSizeEvent b;

    public g(com.socure.idplus.device.internal.thread.c socureThread) {
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
        l lVar = new l(socureThread);
        lVar.a();
        this.f851a = lVar;
    }

    public final void a(Activity context) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        ViewportSizeEvent viewportSizeEvent;
        Orientation orientation;
        ViewportSizeEvent viewportSizeEvent2;
        Configuration configuration;
        WindowMetrics currentWindowMetrics;
        int navigationBars;
        int displayCutout;
        WindowInsets windowInsets;
        Insets insetsIgnoringVisibility;
        int i5;
        int i6;
        int i7;
        int i8;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = context.getWindowManager().getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            navigationBars = WindowInsets.Type.navigationBars();
            displayCutout = WindowInsets.Type.displayCutout();
            int i9 = navigationBars | displayCutout;
            windowInsets = currentWindowMetrics.getWindowInsets();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(i9);
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            i5 = insetsIgnoringVisibility.right;
            i6 = insetsIgnoringVisibility.left;
            int i10 = i5 + i6;
            i7 = insetsIgnoringVisibility.top;
            i8 = insetsIgnoringVisibility.bottom;
            int i11 = i7 + i8;
            bounds = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            f = context.getResources().getDisplayMetrics().density;
            i = bounds.width();
            i2 = bounds.height();
            i3 = bounds.width() - i10;
            i4 = bounds.height() - i11;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = context.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRealMetrics(displayMetrics);
            float f2 = displayMetrics.density;
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            defaultDisplay.getMetrics(displayMetrics);
            i3 = displayMetrics.widthPixels;
            i4 = displayMetrics.heightPixels;
            f = f2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i12 = (int) (i3 / f);
        int i13 = (int) (i4 / f);
        int i14 = (int) (i / f);
        int i15 = (int) (i2 / f);
        Intrinsics.checkNotNullParameter(context, "context");
        float f3 = context.getResources().getDisplayMetrics().density;
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            int i16 = configuration.orientation;
            if (i16 == 1) {
                orientation = Orientation.PORTRAIT_PRIMARY;
            } else if (i16 == 2) {
                orientation = Orientation.LANDSCAPE_PRIMARY;
            }
            viewportSizeEvent = new ViewportSizeEvent(uptimeMillis, i12, i13, i14, i15, f3, orientation);
            viewportSizeEvent2 = this.b;
            if (viewportSizeEvent2 != null && viewportSizeEvent.getViewportWidth() == viewportSizeEvent2.getViewportWidth() && viewportSizeEvent.getViewportHeight() == viewportSizeEvent2.getViewportHeight() && viewportSizeEvent.getScreenWidth() == viewportSizeEvent2.getScreenWidth() && viewportSizeEvent.getScreenHeight() == viewportSizeEvent2.getScreenHeight() && viewportSizeEvent.getDevicePixelRatio() == viewportSizeEvent2.getDevicePixelRatio() && viewportSizeEvent.getOrientation() == viewportSizeEvent2.getOrientation()) {
                return;
            }
            this.b = viewportSizeEvent;
            l lVar = this.f851a;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(viewportSizeEvent, "viewportSizeEvent");
            lVar.a(viewportSizeEvent);
        }
        orientation = Orientation.UNKNOWN;
        viewportSizeEvent = new ViewportSizeEvent(uptimeMillis, i12, i13, i14, i15, f3, orientation);
        viewportSizeEvent2 = this.b;
        if (viewportSizeEvent2 != null) {
            return;
        }
        this.b = viewportSizeEvent;
        l lVar2 = this.f851a;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(viewportSizeEvent, "viewportSizeEvent");
        lVar2.a(viewportSizeEvent);
    }
}
