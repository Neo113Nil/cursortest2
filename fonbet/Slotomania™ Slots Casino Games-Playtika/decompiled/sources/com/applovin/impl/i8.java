package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class i8 {
    private final com.applovin.impl.sdk.p a;
    private final Runnable e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private final WeakReference g;
    private final long h;
    private int k;
    private float l;
    private float m;
    private long n;
    private final Object b = new Object();
    private final Rect c = new Rect();
    private WeakReference i = new WeakReference(null);
    private WeakReference j = new WeakReference(null);
    private long o = Long.MIN_VALUE;
    private final Handler d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public i8(final View view, com.applovin.impl.sdk.l lVar, a aVar) {
        this.a = lVar.Q();
        this.h = ((Long) lVar.a(z4.C1)).longValue();
        this.g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.e = new Runnable() { // from class: com.applovin.impl.i8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i8.this.a(weakReference);
            }
        };
        this.f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.i8$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean a2;
                a2 = i8.this.a(view);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    private void c(View view) {
        View b = g8.b((View) this.g.get());
        if (b == null) {
            b = g8.b(view);
        }
        if (b == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f);
        } else if (com.applovin.impl.sdk.p.a()) {
            this.a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    public void b() {
        synchronized (this.b) {
            this.d.removeMessages(0);
            b((View) this.g.get());
            this.o = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.c)) {
            return false;
        }
        long pxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.height());
        if (pxToDp < this.k) {
            return false;
        }
        if ((pxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.c.width() * this.c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(j3 j3Var) {
        View v0;
        if (j3Var instanceof d3) {
            v0 = j3Var.z();
        } else if (!(j3Var instanceof f3)) {
            return;
        } else {
            v0 = ((f3) j3Var).v0();
        }
        a(j3Var.n0(), j3Var.p0(), j3Var.q0(), j3Var.r0(), v0);
    }

    public void a(int i, float f, float f2, long j, View view) {
        synchronized (this.b) {
            if (com.applovin.impl.sdk.p.a()) {
                this.a.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.j = weakReference;
            this.k = i;
            this.l = f;
            this.m = f2;
            this.n = j;
            c((View) weakReference.get());
        }
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.p.a()) {
            this.a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.i.clear();
    }

    private void a() {
        this.d.postDelayed(this.e, this.h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.o == Long.MIN_VALUE) {
                this.o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.o >= this.n) {
                return true;
            }
        }
        return false;
    }
}
