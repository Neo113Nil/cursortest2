package com.vk.core.ui.swipes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bpn0;
import xsna.ef2;
import xsna.gp10;
import xsna.iut0;
import xsna.ozl;
import xsna.x0;
import xsna.xpg0;

/* compiled from: ButtonsSwipeView.kt */
@ozl
/* loaded from: classes17.dex */
public final class ButtonsSwipeView extends HorizontalScrollView {
    public static final /* synthetic */ int r = 0;
    public final bpn0 b;
    public int c;
    public final int d;
    public boolean e;
    public int f;
    public final ArrayList<a> g;
    public boolean h;
    public final Rect i;
    public final GestureDetector j;
    public final LinearLayout k;
    public View l;
    public final ArrayList<View> m;
    public final ArrayList<View> n;
    public int o;
    public int p;
    public boolean q;

    /* compiled from: ButtonsSwipeView.kt */
    public interface a {
        void a(int i, int i2, View view);

        void c();
    }

    /* compiled from: ButtonsSwipeView.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ButtonsSwipeView buttonsSwipeView = ButtonsSwipeView.this;
            if (!buttonsSwipeView.h) {
                return false;
            }
            buttonsSwipeView.b();
            return true;
        }
    }

    public ButtonsSwipeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.b.getValue();
    }

    public final void a() {
        ArrayList<a> arrayList = this.g;
        if (arrayList == null || arrayList == null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).c();
            }
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).c();
            }
        }
    }

    public final void b() {
        ef2 ef2Var = new ef2(this, 3);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        postOnAnimation(ef2Var);
    }

    public final LinearLayout getContainer() {
        return this.k;
    }

    public final int getContentMeasuredWidth() {
        View view = this.l;
        if (view != null) {
            return view.getMeasuredWidth();
        }
        return 0;
    }

    public final int getEndMeasuredWidth() {
        return xpg0.b() ? this.p : this.o;
    }

    public final int getInitialScrollOffset() {
        return xpg0.b() ? this.o : this.p;
    }

    public final int getLeftMeasuredWidth() {
        return this.o;
    }

    public final ArrayList<View> getLeftViews() {
        return this.m;
    }

    public final int getMaxEndScrollOffset() {
        return this.o + this.p;
    }

    public final int getMaxLeftScrollOffset() {
        return xpg0.b() ? getMaxStartScrollOffset() : getMaxEndScrollOffset();
    }

    public final int getMaxRightScrollOffset() {
        return xpg0.b() ? getMaxEndScrollOffset() : getMaxStartScrollOffset();
    }

    public final int getMaxStartScrollOffset() {
        return 0;
    }

    public final int getRightMeasuredWidth() {
        return this.p;
    }

    public final ArrayList<View> getRightViews() {
        return this.n;
    }

    public final int getStartMeasuredWidth() {
        return xpg0.b() ? this.o : this.p;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.q) {
            return false;
        }
        boolean z2 = motionEvent.getPointerId(0) != 0;
        this.e = z2;
        if (!z2) {
            if (motionEvent.getActionMasked() == 0 && getScrollX() != getInitialScrollOffset()) {
                View view = this.l;
                Rect rect = this.i;
                if (view != null) {
                    view.getGlobalVisibleRect(rect);
                }
                z = rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            this.h = z;
            if (!z) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        scrollTo(getInitialScrollOffset(), 0);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        int a2 = gp10.a(i, getSuggestedMinimumWidth(), Integer.MAX_VALUE, getPaddingRight() + getPaddingLeft());
        View view = this.l;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = a2;
        }
        super.onMeasure(i, i2);
        Iterator<View> it = this.m.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().getMeasuredWidth();
        }
        this.o = i4;
        Iterator<View> it2 = this.n.iterator();
        while (it2.hasNext()) {
            i3 += it2.next().getMeasuredWidth();
        }
        this.p = i3;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i3 != this.f) {
            ArrayList<a> arrayList = this.g;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.get(i5).a(i, i3, this);
                }
            } else {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a(i, i3, this);
                }
            }
        }
        this.f = i3;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e || (this.h && this.j.onTouchEvent(motionEvent))) {
            return true;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            Rect rect = this.i;
            if (actionMasked == 1) {
                getVelocityTracker().addMovement(obtain);
                getVelocityTracker().computeCurrentVelocity(1000, this.d);
                if ((-getVelocityTracker().getXVelocity(this.c)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    a();
                }
                rect.setEmpty();
                this.h = false;
                getVelocityTracker().clear();
                a();
                obtain.recycle();
                return super.onTouchEvent(motionEvent);
            }
            if (actionMasked == 3) {
                rect.setEmpty();
                this.h = false;
                getVelocityTracker().clear();
                a();
                a();
            } else if (actionMasked == 5) {
                this.c = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.c) {
                    this.c = motionEvent.getPointerId(actionIndex2 != 0 ? 0 : 1);
                }
            }
        } else {
            this.c = motionEvent.getPointerId(0);
        }
        getVelocityTracker().addMovement(obtain);
        obtain.recycle();
        return super.onTouchEvent(motionEvent);
    }

    public final void setContentView(View view) {
        View view2 = this.l;
        LinearLayout linearLayout = this.k;
        if (view2 != null) {
            linearLayout.removeView(view2);
        }
        if (view != null) {
            this.l = view;
            linearLayout.addView(view, this.m.size());
        }
    }

    public final void setLeftViews(List<? extends View> list) {
        LinearLayout linearLayout = this.k;
        ArrayList<View> arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                linearLayout.removeView(arrayList.get(i));
            }
        } else {
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                linearLayout.removeView(it.next());
            }
        }
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends View> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int size2 = list.size();
        while (true) {
            size2--;
            if (-1 >= size2) {
                return;
            } else {
                linearLayout.addView(list.get(size2), 0);
            }
        }
    }

    public final void setRightViews(List<? extends View> list) {
        LinearLayout linearLayout = this.k;
        ArrayList<View> arrayList = this.n;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                linearLayout.removeView(arrayList.get(i));
            }
        } else {
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                linearLayout.removeView(it.next());
            }
        }
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list != null) {
            List<? extends View> list2 = list;
            if (!(list2 instanceof RandomAccess)) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    linearLayout.addView((View) it2.next());
                }
            } else {
                List<? extends View> list3 = list2;
                int size2 = list3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    linearLayout.addView(list3.get(i2));
                }
            }
        }
    }

    public ButtonsSwipeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = new bpn0(new x0(3));
        this.c = -1;
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = -1;
        this.g = new ArrayList<>();
        this.i = new Rect();
        this.j = new GestureDetector(context, new b());
        LinearLayout a2 = q1.a(0, context);
        this.k = a2;
        this.m = new ArrayList<>(2);
        this.n = new ArrayList<>(2);
        this.q = true;
        addView(a2);
    }
}
