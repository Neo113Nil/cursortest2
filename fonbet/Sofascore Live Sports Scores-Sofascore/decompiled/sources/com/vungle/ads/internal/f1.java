package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.inmobi.media.AbstractC3406f1;
import defpackage.bsk;
import defpackage.xfg;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f1 {
    public final Map a;
    public final Handler b;
    public final Rect c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public WeakReference e;
    public final e1 f;
    public boolean g;
    public boolean h;

    public f1(Context context, WeakHashMap weakHashMap, Handler handler) {
        context.getClass();
        weakHashMap.getClass();
        handler.getClass();
        this.a = weakHashMap;
        this.b = handler;
        this.c = new Rect();
        this.f = new e1(this);
        this.d = new xfg(this, 1);
        this.e = new WeakReference(null);
        this.h = a(context, (View) null);
    }

    public static final void d(f1 f1Var) {
        if (f1Var.g) {
            return;
        }
        f1Var.g = true;
        f1Var.b.postDelayed(f1Var.f, 100L);
    }

    public final boolean a(Context context, View view) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View view2 = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view2 = decorView.findViewById(R.id.content);
        }
        if (view2 == null && view != null) {
            WeakHashMap weakHashMap = bsk.a;
            if (!view.isAttachedToWindow()) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c(AbstractC3406f1.f, "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                view2 = rootView.findViewById(R.id.content);
            }
            if (view2 == null) {
                view2 = rootView;
            }
        }
        if (view2 == null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a(AbstractC3406f1.f, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.e = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.d);
            return true;
        }
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a(AbstractC3406f1.f, "The root view tree observer was not alive");
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        context.getClass();
    }

    public static final boolean a(f1 f1Var, View view, int i) {
        f1Var.getClass();
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.c("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (view.getGlobalVisibleRect(f1Var.c)) {
                long height = f1Var.c.height() * f1Var.c.width();
                long height2 = view.getHeight() * view.getWidth();
                if (height2 > 0 && 100 * height >= i * height2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(View view, c1 c1Var) {
        view.getClass();
        this.h = a(view.getContext(), view);
        d1 d1Var = (d1) this.a.get(view);
        if (d1Var == null) {
            d1Var = new d1();
            this.a.put(view, d1Var);
            if (!this.g) {
                this.g = true;
                this.b.postDelayed(this.f, 100L);
            }
        }
        d1Var.c();
        d1Var.a(c1Var);
    }

    public final void a(View view) {
        view.getClass();
        this.a.remove(view);
    }

    public final void a() {
        this.a.clear();
        this.b.removeMessages(0);
        this.g = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        this.e.clear();
    }

    public static final boolean a(f1 f1Var) {
        f1Var.getClass();
        if (!f1Var.g) {
            f1Var.g = true;
            f1Var.b.postDelayed(f1Var.f, 100L);
        }
        return true;
    }
}
