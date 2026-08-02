package com.vk.core.tool.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.disableable.DisableableFrameLayout;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.bpn0;
import xsna.bu0;
import xsna.fsb;
import xsna.gbj;
import xsna.ifs;
import xsna.msy;
import xsna.u3k;
import xsna.zrp;

/* compiled from: FrameLayoutSwiped.kt */
/* loaded from: classes17.dex */
public final class FrameLayoutSwiped extends DisableableFrameLayout {
    public final bpn0 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ScrollState h;
    public final Object i;
    public final Object j;
    public boolean k;
    public final int l;
    public final int m;
    public boolean n;
    public a o;
    public boolean p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FrameLayoutSwiped.kt */
    public static final class ScrollState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScrollState[] $VALUES;
        public static final ScrollState Dragging;
        public static final ScrollState Idle;

        static {
            ScrollState scrollState = new ScrollState("Idle", 0);
            Idle = scrollState;
            ScrollState scrollState2 = new ScrollState("Dragging", 1);
            Dragging = scrollState2;
            ScrollState[] scrollStateArr = {scrollState, scrollState2};
            $VALUES = scrollStateArr;
            $ENTRIES = new asp(scrollStateArr);
        }

        public ScrollState() {
            throw null;
        }

        public static ScrollState valueOf(String str) {
            return (ScrollState) Enum.valueOf(ScrollState.class, str);
        }

        public static ScrollState[] values() {
            return (ScrollState[]) $VALUES.clone();
        }
    }

    /* compiled from: FrameLayoutSwiped.kt */
    public interface a {
        boolean Z();

        void c0();
    }

    public FrameLayoutSwiped(Context context) {
        super(context, null, 0);
        this.c = new bpn0(new bu0(11));
        this.d = -1;
        this.h = ScrollState.Idle;
        gbj gbjVar = new gbj(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, gbjVar);
        this.j = msy.a(lazyThreadSafetyMode, new u3k(this, 11));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.l = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        viewConfiguration.getScaledMinimumFlingVelocity();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getContainer() {
        return (View) this.i.getValue();
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getWidthReply() {
        return ((Number) this.j.getValue()).intValue();
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.d) {
            int i = actionIndex == 0 ? 1 : 0;
            this.d = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.e = x;
            this.f = x;
        }
    }

    public final void b() {
        getVelocityTracker().clear();
        this.h = ScrollState.Idle;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        View container = getContainer();
        if (container.getTranslationX() <= (-getWidthReply())) {
            getCallback().c0();
        }
        this.k = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(container.getTranslationX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(180L);
        ofFloat.addUpdateListener(new fsb(container, 1));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.8f));
        ofFloat.addListener(new ifs(this));
        ofFloat.start();
    }

    public final a getCallback() {
        a aVar = this.o;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // com.vk.core.tool.view.disableable.DisableableFrameLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            if (!this.k && getCallback().Z()) {
                if (motionEvent.getPointerId(0) != 0) {
                    this.p = true;
                    return true;
                }
                this.p = false;
                getVelocityTracker().addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    this.d = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.e = x;
                    this.f = x;
                    this.g = (int) (motionEvent.getY() + 0.5f);
                    ScrollState scrollState = this.h;
                    ScrollState scrollState2 = ScrollState.Dragging;
                    if (scrollState == scrollState2) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.h = scrollState2;
                    }
                } else if (actionMasked == 1) {
                    getVelocityTracker().clear();
                    this.h = ScrollState.Idle;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.d);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        ScrollState scrollState3 = this.h;
                        ScrollState scrollState4 = ScrollState.Dragging;
                        if (scrollState3 != scrollState4) {
                            int i = x2 - this.f;
                            int i2 = y - this.g;
                            if ((!this.n || i < 0) && Math.abs(i) > this.l / 2 && Math.abs(i) > Math.abs(i2)) {
                                this.e = x2;
                                ViewParent parent3 = getParent();
                                if (parent3 != null) {
                                    parent3.requestDisallowInterceptTouchEvent(true);
                                }
                                this.h = scrollState4;
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    b();
                    this.h = ScrollState.Idle;
                    ViewParent parent4 = getParent();
                    if (parent4 != null) {
                        parent4.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (actionMasked == 5) {
                    this.d = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.e = x3;
                    this.f = x3;
                    this.g = (int) (motionEvent.getY(actionIndex) + 0.5f);
                } else if (actionMasked == 6) {
                    a(motionEvent);
                }
                if (this.h == ScrollState.Dragging) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), getContainer().getMeasuredHeight()));
    }

    @Override // com.vk.core.tool.view.disableable.DisableableFrameLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b && !this.k && getCallback().Z()) {
            if (this.p) {
                return true;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                this.d = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.e = x;
                this.f = x;
            } else {
                if (actionMasked == 1) {
                    getVelocityTracker().addMovement(obtain);
                    getVelocityTracker().computeCurrentVelocity(1000, this.m);
                    if ((-getVelocityTracker().getXVelocity(this.d)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.h = ScrollState.Idle;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    b();
                    obtain.recycle();
                    return true;
                }
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.d);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int i = this.e - x2;
                        ScrollState scrollState = this.h;
                        ScrollState scrollState2 = ScrollState.Dragging;
                        if (scrollState != scrollState2) {
                            int abs = Math.abs(i);
                            int i2 = this.l;
                            if (abs > i2) {
                                i = i > 0 ? i - i2 : i + i2;
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.h = scrollState2;
                            }
                        }
                        if (this.h == scrollState2) {
                            this.e = x2;
                            float min = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.max(getContainer().getTranslationX() - i, -getWidthReply()));
                            if (getContainer().getTranslationX() != min) {
                                getContainer().setTranslationX(min);
                                ViewParent parent3 = getParent();
                                if (parent3 != null) {
                                    parent3.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    b();
                    this.h = ScrollState.Idle;
                    ViewParent parent4 = getParent();
                    if (parent4 != null) {
                        parent4.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (actionMasked == 5) {
                    this.d = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.e = x3;
                    this.f = x3;
                } else if (actionMasked == 6) {
                    a(motionEvent);
                }
            }
            getVelocityTracker().addMovement(obtain);
            obtain.recycle();
            return true;
        }
        return false;
    }

    public final void setCallback(a aVar) {
        this.o = aVar;
    }

    public final void setInterceptOnlyForLeftScroll(boolean z) {
        this.n = z;
    }
}
