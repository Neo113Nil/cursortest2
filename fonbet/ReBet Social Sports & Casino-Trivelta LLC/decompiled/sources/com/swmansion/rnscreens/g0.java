package com.swmansion.rnscreens;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.C3834z;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f41804b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f41805c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f41806d;

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f41803a = new g0();

    /* renamed from: e, reason: collision with root package name */
    public static b f41807e = new b();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C3834z.g.values().length];
            try {
                iArr[C3834z.g.f42126a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3834z.g.f42127b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3834z.g.f42128c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3834z.g.f42129d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3834z.g.f42130e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b implements androidx.core.view.J {
        @Override // androidx.core.view.J
        public F0 f(View v10, F0 insets) {
            Intrinsics.checkNotNullParameter(v10, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            F0 X10 = AbstractC2082d0.X(v10, insets);
            Intrinsics.checkNotNullExpressionValue(X10, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                F0 r10 = X10.r(X10.k(), 0, X10.l(), X10.j());
                Intrinsics.checkNotNullExpressionValue(r10, "replaceSystemWindowInsets(...)");
                return r10;
            }
            androidx.core.graphics.e f10 = X10.f(F0.p.f());
            Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
            F0 a10 = new F0.a().b(F0.p.f(), androidx.core.graphics.e.c(f10.f19098a, 0, f10.f19100c, f10.f19101d)).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }
    }

    public static final void j(boolean z10, h1 h1Var) {
        if (z10) {
            h1Var.b(F0.p.f());
        } else {
            h1Var.g(F0.p.f());
        }
    }

    public static final void n(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        new h1(activity.getWindow(), decorView).e(Intrinsics.areEqual(str, "dark"));
    }

    public final void c() {
        f41806d = true;
    }

    public final void d() {
        f41804b = true;
    }

    public final void e() {
        f41805c = true;
    }

    public final boolean f(C3834z c3834z, C3834z.g gVar) {
        int i10 = a.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i10 == 1) {
            return c3834z.getScreenOrientation() != null;
        }
        if (i10 == 2) {
            return c3834z.getStatusBarStyle() != null;
        }
        if (i10 == 3) {
            return c3834z.r() != null;
        }
        if (i10 == 4) {
            return c3834z.q() != null;
        }
        if (i10 == 5) {
            return c3834z.p() != null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3834z g(C3834z c3834z, C3834z.g gVar) {
        H fragmentWrapper;
        if (c3834z == null || (fragmentWrapper = c3834z.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            C3834z topScreen = ((B) it.next()).getTopScreen();
            g0 g0Var = f41803a;
            C3834z g10 = g0Var.g(topScreen, gVar);
            if (g10 != null) {
                return g10;
            }
            if (topScreen != null && g0Var.f(topScreen, gVar)) {
                return topScreen;
            }
        }
        return null;
    }

    public final C3834z h(C3834z c3834z, C3834z.g gVar) {
        for (ViewParent container = c3834z.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C3834z) {
                C3834z c3834z2 = (C3834z) container;
                if (f(c3834z2, gVar)) {
                    return c3834z2;
                }
            }
        }
        return null;
    }

    public final C3834z i(C3834z c3834z, C3834z.g gVar) {
        C3834z g10 = g(c3834z, gVar);
        return g10 != null ? g10 : f(c3834z, gVar) ? c3834z : h(c3834z, gVar);
    }

    public final void k(C3834z screen, Activity activity) {
        Boolean r10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        C3834z i10 = i(screen, C3834z.g.f42128c);
        final boolean booleanValue = (i10 == null || (r10 = i10.r()) == null) ? false : r10.booleanValue();
        Window window = activity.getWindow();
        final h1 h1Var = new h1(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.j(booleanValue, h1Var);
            }
        });
    }

    public final void l(C3834z screen, Activity activity) {
        Boolean p10;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C3834z i10 = i(screen, C3834z.g.f42130e);
        if (!((i10 == null || (p10 = i10.p()) == null) ? false : p10.booleanValue())) {
            new h1(window, window.getDecorView()).g(F0.p.e());
            return;
        }
        h1 h1Var = new h1(window, window.getDecorView());
        h1Var.b(F0.p.e());
        h1Var.f(2);
    }

    public final void m(C3834z screen, Activity activity) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        C3834z i10 = i(screen, C3834z.g.f42126a);
        activity.setRequestedOrientation((i10 == null || (screenOrientation = i10.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void o(C3834z screen, final Activity activity, ReactContext reactContext) {
        final String str;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        C3834z i10 = i(screen, C3834z.g.f42127b);
        if (i10 == null || (str = i10.getStatusBarStyle()) == null) {
            str = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.n(activity, str);
            }
        });
    }

    public final void p(C3834z screen, Activity activity, ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (f41804b) {
            m(screen, activity);
        }
        if (f41805c) {
            o(screen, activity, reactContext);
            k(screen, activity);
        }
        if (f41806d) {
            l(screen, activity);
        }
    }
}
