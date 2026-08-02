package com.vk.core.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.aq0;
import xsna.b0u0;
import xsna.bqx0;
import xsna.h4x;
import xsna.ify;
import xsna.iut0;
import xsna.msy;
import xsna.o0q0;
import xsna.t5m;
import xsna.u080;
import xsna.wqx0;

/* compiled from: FitSystemWindowsFrameLayout.kt */
/* loaded from: classes.dex */
public class FitSystemWindowsFrameLayout extends FrameLayout implements o0q0, UiTracking$TrackableView {
    public static final /* synthetic */ int h = 0;
    public final Object b;
    public bqx0 c;
    public d d;
    public boolean e;
    public boolean f;
    public WeakReference<Fragment> g;

    /* compiled from: FitSystemWindowsFrameLayout.kt */
    public static final class a {
        public static WeakReference<FitSystemWindowsFrameLayout> a = new WeakReference<>(null);

        /* compiled from: FitSystemWindowsFrameLayout.kt */
        /* renamed from: com.vk.core.view.FitSystemWindowsFrameLayout$a$a, reason: collision with other inner class name */
        public static final class C0800a {
            public static void a(FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout) {
                a.a = fitSystemWindowsFrameLayout != null ? new WeakReference<>(fitSystemWindowsFrameLayout) : new WeakReference<>(null);
            }
        }
    }

    /* compiled from: FitSystemWindowsFrameLayout.kt */
    /* loaded from: classes17.dex */
    public static final class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    /* compiled from: FitSystemWindowsFrameLayout.kt */
    @TargetApi(20)
    public static final class c implements u080 {
        public final FitSystemWindowsFrameLayout b;
        public final Rect c = new Rect();
        public final Rect d;
        public final Rect e;
        public final double f;

        public c(FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout, boolean z) {
            this.b = fitSystemWindowsFrameLayout;
            Rect rect = new Rect();
            bqx0 lastInsets = fitSystemWindowsFrameLayout.getLastInsets();
            if (lastInsets != null && z) {
                h4x i = lastInsets.a.i(591);
                rect.set(i.a, i.b, i.c, i.d);
            }
            this.d = rect;
            this.e = new Rect();
            this.f = 0.3d;
        }

        @Override // xsna.u080
        public final bqx0 b(View view, bqx0 bqx0Var) {
            FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = (FitSystemWindowsFrameLayout) view;
            Rect rect = this.c;
            Rect rect2 = this.d;
            rect.set(rect2);
            h4x i = bqx0Var.a.i(591);
            int i2 = ify.a;
            double d = ify.d(3, null) * this.f;
            int i3 = i.d;
            if (t5m.b() && i3 < d) {
                i3 = 0;
            }
            rect2.set(i.a, i.b, i.c, i3);
            FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout2 = this.b;
            Rect rect3 = this.e;
            if (fitSystemWindowsFrameLayout2.b(rect3, rect2)) {
                if (!rect2.equals(rect)) {
                    int i4 = Build.VERSION.SDK_INT;
                    bqx0.h gVar = i4 >= 36 ? new bqx0.g(bqx0Var) : i4 >= 35 ? new bqx0.f(bqx0Var) : i4 >= 34 ? new bqx0.e(bqx0Var) : i4 >= 31 ? new bqx0.d(bqx0Var) : i4 >= 30 ? new bqx0.c(bqx0Var) : i4 >= 29 ? new bqx0.b(bqx0Var) : new bqx0.a(bqx0Var);
                    gVar.d(1, h4x.d(rect2));
                    gVar.d(8, h4x.d(rect2));
                    gVar.d(519, h4x.d(rect2));
                    gVar.d(64, h4x.d(rect2));
                    fitSystemWindowsFrameLayout.setChildInsets(gVar.b());
                    rect3.set(rect2);
                }
                ify.f(rect2);
            } else {
                rect2.set(rect);
            }
            return bqx0.b;
        }
    }

    /* compiled from: FitSystemWindowsFrameLayout.kt */
    public interface d {
        boolean i(Rect rect, Rect rect2);
    }

    public FitSystemWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getFailFastEnabled() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final void a(boolean z) {
        setFitsSystemWindows(true);
        if (getFitsSystemWindows()) {
            WeakReference<FitSystemWindowsFrameLayout> weakReference = a.a;
            c cVar = new c(this, z);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(this, cVar);
            setSystemUiVisibility(getSystemUiVisibility() | CoverVideoUploadTask.y);
        }
    }

    public boolean b(Rect rect, Rect rect2) {
        d dVar = this.d;
        if (dVar != null) {
            return dVar.i(rect, rect2);
        }
        return true;
    }

    public final boolean getInterceptTouchEvents() {
        return this.f;
    }

    public final bqx0 getLastInsets() {
        return this.c;
    }

    public final d getOnWindowInsetsListener() {
        return this.d;
    }

    @Override // xsna.o0q0
    public Fragment getUiTrackingFragment() {
        WeakReference<Fragment> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getId() == R.id.fragment_wrapper) {
            WeakReference<FitSystemWindowsFrameLayout> weakReference = a.a;
            a.C0800a.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Throwable th) {
            if (getFailFastEnabled()) {
                com.vk.metrics.eventtracking.b.a.q(new b(th));
            } else if (BuildInfo.h()) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.e = true;
        bqx0 bqx0Var = this.c;
        if (bqx0Var != null) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    if (!getFitsSystemWindows()) {
                        WeakReference<FitSystemWindowsFrameLayout> weakReference = a.a;
                        WeakReference<FitSystemWindowsFrameLayout> weakReference2 = a.a;
                        iut0.c(childAt, bqx0Var);
                    } else if (childAt.getFitsSystemWindows()) {
                        WeakReference<FitSystemWindowsFrameLayout> weakReference3 = a.a;
                        WeakReference<FitSystemWindowsFrameLayout> weakReference4 = a.a;
                        iut0.c(childAt, bqx0Var);
                    } else {
                        WeakReference<FitSystemWindowsFrameLayout> weakReference5 = a.a;
                        WeakReference<FitSystemWindowsFrameLayout> weakReference6 = a.a;
                        h4x i4 = bqx0Var.a.i(519);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                        marginLayoutParams.leftMargin = i4.a;
                        marginLayoutParams.topMargin = i4.b;
                        marginLayoutParams.rightMargin = i4.c;
                        marginLayoutParams.bottomMargin = i4.d;
                    }
                }
            }
        }
        this.e = false;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z || getId() != R.id.fragment_wrapper) {
            if (equals(a.a.get())) {
                a.C0800a.a(null);
            }
        } else {
            WeakReference<FitSystemWindowsFrameLayout> weakReference = a.a;
            a.C0800a.a(this);
            bqx0 bqx0Var = this.c;
            if (bqx0Var != null) {
                iut0.c(this, bqx0Var);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e) {
            return;
        }
        super.requestLayout();
    }

    public final void setChildInsets(bqx0 bqx0Var) {
        WeakReference<FitSystemWindowsFrameLayout> weakReference = a.a;
        WeakReference<FitSystemWindowsFrameLayout> weakReference2 = a.a;
        bqx0 bqx0Var2 = this.c;
        h4x c2 = bqx0Var2 != null ? wqx0.c(bqx0Var2) : null;
        h4x c3 = wqx0.c(bqx0Var);
        if (c2 != null && c2.b == c3.b && c2.d == c3.d && c2.a == c3.a && c2.c == c3.c) {
            return;
        }
        this.c = bqx0Var;
        requestLayout();
    }

    public final void setInterceptTouchEvents(boolean z) {
        this.f = z;
    }

    public final void setLastFragment(Fragment fragment) {
        if (fragment != null) {
            this.g = new WeakReference<>(fragment);
        }
    }

    public final void setLastInsets(bqx0 bqx0Var) {
        this.c = bqx0Var;
    }

    public final void setOnWindowInsetsListener(d dVar) {
        this.d = dVar;
    }

    public FitSystemWindowsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new aq0(3));
        a(false);
    }
}
