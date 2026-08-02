package com.vk.libvideo.design.view.swipe.layout;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.f;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.g4x;
import xsna.iah0;
import xsna.iut0;
import xsna.l4x;
import xsna.qg90;

/* loaded from: classes2.dex */
public class SwipeLayout extends a {
    public int r;
    public int s;
    public final l4x t;

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new l4x();
        this.n.n = iah0.a(16000);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public final void a(View view, g4x g4xVar) {
        this.t.a(view, g4xVar);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public final void b(View view, g4x g4xVar) {
        this.t.c.add(new qg90(view, g4xVar));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.n.g()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }
        this.r = this.d.getLeft();
        this.s = this.d.getTop() - getPaddingTop();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public final boolean d(View view) {
        boolean z;
        boolean z2;
        KeyEvent.Callback callback = this.d;
        if (callback instanceof a.f) {
            a.f fVar = (a.f) callback;
            z2 = fVar.a();
            z = fVar.b();
        } else {
            z = false;
            z2 = true;
        }
        a.e eVar = this.c;
        if ((eVar == null || (eVar.Sj() && this.c.Wh())) && ((z2 || z) && this.n.a != 2 && this.l >= this.j)) {
            boolean z3 = view == this.d;
            this.f = z3;
            if (z3) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(20)
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        this.b.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.t.d(windowInsets, false);
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        f fVar = this.n;
        if (action == 0 && fVar.a != 2) {
            OverScroller overScroller = fVar.q;
            fVar.a();
            if (fVar.a == 2) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                overScroller.abortAnimation();
                int currX2 = overScroller.getCurrX();
                int currY2 = overScroller.getCurrY();
                fVar.r.h(fVar.s, currX2, currY2, currX2 - currX, currY2 - currY);
            }
            fVar.p(0);
        }
        if (motionEvent.getAction() == 0) {
            if (this.k == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.k = motionEvent.getY();
            }
        } else if (motionEvent.getAction() == 2) {
            this.l = Math.abs(motionEvent.getY() - this.k);
        } else {
            this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (fVar.a == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            fVar.k(motionEvent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public int getBackgroundAlpha() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getAlpha();
        }
        l4x l4xVar = this.t;
        if (l4xVar.b.isEmpty()) {
            return 0;
        }
        return (int) (((View) ((qg90) l4xVar.b.get(0)).a).getAlpha() * 255.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public float getVideoViewsAlpha() {
        l4x l4xVar = this.t;
        return l4xVar.c.isEmpty() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((View) ((qg90) l4xVar.c.get(0)).a).getAlpha();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public float getVolume() {
        a.e eVar = this.c;
        return eVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : eVar.getVolume();
    }

    @Override // android.view.View
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = findViewById(R.id.drag_view);
        a.e eVar = this.c;
        setBackgroundAlpha((eVar == null || !eVar.h6()) ? 255 : 0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.n.r(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.offsetLeftAndRight(this.r);
        this.d.offsetTopAndBottom(this.s);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        a.e eVar = this.c;
        if ((eVar != null && !eVar.Wh()) || !isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.n.k(motionEvent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.design.view.swipe.layout.a
    @Keep
    public void setBackgroundAlpha(int i) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        float f = i / 255.0f;
        Iterator it = this.t.b.iterator();
        while (it.hasNext()) {
            qg90 qg90Var = (qg90) it.next();
            if (((View) qg90Var.a).getVisibility() == 0) {
                ((View) qg90Var.a).setAlpha(f);
            }
        }
    }

    public void setIgnoreInsetsVisibility(boolean z) {
        this.t.d = z;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a
    public void setNavigationCallback(a.e eVar) {
        this.c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.design.view.swipe.layout.a
    @Keep
    public void setVideoViewsAlpha(float f) {
        Iterator it = this.t.c.iterator();
        while (it.hasNext()) {
            qg90 qg90Var = (qg90) it.next();
            if (((View) qg90Var.a).getVisibility() == 0) {
                ((View) qg90Var.a).setAlpha(f);
            }
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a
    @Keep
    public void setVolume(float f) {
        if (this.c != null) {
            e eVar = e.a;
            if (e.c()) {
                this.c.setVolume(f);
            }
        }
    }
}
