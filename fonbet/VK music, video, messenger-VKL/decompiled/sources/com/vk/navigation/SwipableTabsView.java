package com.vk.navigation;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.e43;
import xsna.f4m;
import xsna.mln0;
import xsna.nqj0;
import xsna.nx50;
import xsna.swe0;
import xsna.z27;

/* compiled from: SwipableTabsView.kt */
/* loaded from: classes.dex */
public final class SwipableTabsView extends FitSystemWindowsFrameLayout {
    public static final List<Integer> u = e43.l(Integer.valueOf(R.id.first_swipable_fragment), Integer.valueOf(R.id.second_swipable_fragment));
    public final List<Pair<Integer, Class<? extends FragmentImpl>>> i;
    public final nx50 j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public float p;
    public float q;
    public final Scroller r;
    public final GestureDetector s;
    public final float t;

    /* compiled from: SwipableTabsView.kt */
    public final class a extends nqj0 {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs((int) f) <= 1500) {
                return false;
            }
            Float valueOf = Float.valueOf(-f);
            List<Integer> list = SwipableTabsView.u;
            SwipableTabsView.this.c(valueOf);
            return true;
        }
    }

    public SwipableTabsView(Context context, List list, nx50 nx50Var) {
        super(context, null);
        this.i = list;
        this.j = nx50Var;
        this.o = -1;
        this.r = new Scroller(context);
        this.s = new GestureDetector(context, new a());
        this.t = ViewConfiguration.get(context).getScaledTouchSlop();
        int size = list.size();
        List<Integer> list2 = u;
        if (size > list2.size()) {
            throw new IllegalStateException("Fragments more that containers. Add more ids to CONTAINER_IDS");
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = new FitSystemWindowsFrameLayout(context, null);
            fitSystemWindowsFrameLayout.setId(list2.get(i).intValue());
            addView(fitSystemWindowsFrameLayout, getChildCount(), layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r4.canScrollHorizontally(r11) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(View view, int i, int i2, int i3) {
        int i4;
        int i5;
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (f4m.h(childAt) && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                int left = i4 - childAt.getLeft();
                int top = i5 - childAt.getTop();
                boolean z = true;
                if (!(childAt instanceof SeekBar)) {
                    if (childAt instanceof RecyclerView) {
                        RecyclerView.o layoutManager = ((RecyclerView) childAt).getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        if (linearLayoutManager != null) {
                            if (linearLayoutManager.canScrollHorizontally()) {
                            }
                        }
                    }
                    if (!childAt.canScrollHorizontally(i) && !e(childAt, i, left, top)) {
                        z = false;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Float f) {
        int scrollX = getScrollX() - (getWidth() * this.k);
        int d = f != null ? d(f.floatValue()) : ((double) Math.abs(scrollX)) > ((double) getWidth()) * 0.25d ? d(scrollX) : this.k;
        this.r.startScroll(getScrollX(), 0, (getWidth() * d) - getScrollX(), 0, 250);
        if (d != this.k) {
            this.k = d;
            this.m = true;
        }
        this.o = -1;
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.r;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            invalidate();
            return;
        }
        if (this.m) {
            if (getScrollX() == getWidth() * this.k) {
                nx50 nx50Var = this.j;
                if (nx50Var != null) {
                    int intValue = this.i.get(this.k).i().intValue();
                    Integer num = nx50Var.E;
                    if (num == null || intValue != num.intValue()) {
                        nx50.N0(nx50Var, intValue, null, 14);
                    }
                }
                this.m = false;
            }
        }
    }

    public final int d(float f) {
        return swe0.g(this.k + ((int) Math.signum(f)), 0, getChildCount() - 1);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        postDelayed(new z27(this, 15), 50L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != 3) goto L33;
     */
    @Override // com.vk.core.view.FitSystemWindowsFrameLayout, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nx50 nx50Var;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.o);
                    if (findPointerIndex >= 0) {
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        float f = this.p - x;
                        boolean z = Math.abs(f) > Math.max(this.t, Math.abs(this.q - y)) && !e(this, (int) f, (int) x, (int) y) && (nx50Var = this.j) != null && nx50Var.K0();
                        this.l = z;
                        if (z) {
                            this.n = true;
                            this.m = false;
                        }
                        return z;
                    }
                }
            }
            this.o = -1;
            return false;
        }
        this.o = motionEvent.getPointerId(0);
        this.p = motionEvent.getX();
        this.q = motionEvent.getY();
        Scroller scroller = this.r;
        if (!scroller.isFinished()) {
            scroller.forceFinished(true);
            this.n = true;
            return true;
        }
        return false;
    }

    @Override // com.vk.core.view.FitSystemWindowsFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            int width = getWidth() * i5;
            i5++;
            childAt.layout(width, 0, getWidth() * i5, getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r0 != 3) goto L18;
     */
    @Override // com.vk.core.view.FitSystemWindowsFrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentEntry fragmentEntry;
        if (this.l) {
            if (this.s.onTouchEvent(motionEvent)) {
                return true;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.o = motionEvent.getPointerId(0);
                this.p = motionEvent.getX();
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.o);
                    if (findPointerIndex >= 0) {
                        float x = motionEvent.getX(findPointerIndex);
                        float f = x - this.p;
                        int d = d(-f);
                        if (this.n && this.k != d) {
                            nx50 nx50Var = this.j;
                            if (nx50Var != null) {
                                Class<? extends FragmentImpl> j = this.i.get(d).j();
                                FragmentImpl i = nx50Var.y0().i(j);
                                if (i == null || (fragmentEntry = i.Kn()) == null) {
                                    fragmentEntry = new FragmentEntry(j, new Bundle());
                                }
                                nx50Var.y0().w(fragmentEntry);
                                Object obj = i;
                                if (i == null) {
                                    obj = nx50Var.y0().i(j);
                                }
                                if (obj instanceof mln0) {
                                    ((mln0) obj).k1();
                                }
                            }
                            this.n = false;
                        }
                        scrollTo(swe0.g(getScrollX() - ((int) f), 0, (getChildCount() - 1) * getWidth()), 0);
                        this.p = x;
                        return true;
                    }
                }
            }
            c(null);
            return true;
        }
        return false;
    }
}
