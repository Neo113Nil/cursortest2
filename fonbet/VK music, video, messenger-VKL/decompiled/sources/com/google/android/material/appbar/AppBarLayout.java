package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$integer;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.SuperAppFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bdl;
import xsna.bqx0;
import xsna.byu;
import xsna.dwu;
import xsna.fpo0;
import xsna.i2u0;
import xsna.iut0;
import xsna.jl10;
import xsna.m13;
import xsna.m33;
import xsna.qm10;
import xsna.r160;
import xsna.rq2;
import xsna.tb30;
import xsna.tko;
import xsna.xwk;
import xsna.zm10;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int A = R$style.Widget_Design_AppBarLayout;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;

    @Nullable
    public bqx0 h;
    public ArrayList i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;

    @Nullable
    public WeakReference<View> o;
    public final boolean p;

    @Nullable
    public ValueAnimator q;

    @Nullable
    public final ValueAnimator.AnimatorUpdateListener r;
    public final ArrayList s;
    public final long t;
    public final TimeInterpolator u;
    public int[] v;

    @Nullable
    public Drawable w;

    @Nullable
    public Integer x;
    public final float y;
    public Behavior z;

    /* loaded from: classes13.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends dwu<T> {
        public int k;
        public int l;
        public ValueAnimator m;
        public SavedState n;

        @Nullable
        public WeakReference<View> o;
        public Behavior.a p;

        public static abstract class a<T extends AppBarLayout> {
            public abstract boolean a();
        }

        public BaseBehavior() {
        }

        public static View N(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        public static View Q(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof r160) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void a0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((d) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.m) {
                z2 = appBarLayout.i(Q(coordinatorLayout));
            }
            boolean h = appBarLayout.h(z2);
            if (!z) {
                if (h) {
                    ArrayList F = coordinatorLayout.F(appBarLayout);
                    int size = F.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) F.get(i5)).getLayoutParams()).a;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).g == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // xsna.azt0
        public final int E() {
            return D() + this.k;
        }

        @Override // xsna.dwu
        public final boolean H(View view) {
            Behavior.a aVar = this.p;
            if (aVar != null) {
                return aVar.a();
            }
            WeakReference<View> weakReference = this.o;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // xsna.dwu
        public final int I(@NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // xsna.dwu
        public final int J(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.dwu
        public final void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Z(coordinatorLayout, appBarLayout);
            if (appBarLayout.m) {
                appBarLayout.h(appBarLayout.i(Q(coordinatorLayout)));
            }
        }

        @Override // xsna.dwu
        public final int L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int E = E();
            int i6 = 0;
            if (i2 == 0 || E < i2 || E > i3) {
                this.k = 0;
            } else {
                int b = xwk.b(i, i2, i3);
                if (E != b) {
                    if (appBarLayout.f) {
                        int abs = Math.abs(b);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = dVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(b);
                                }
                            }
                        }
                    }
                    i4 = b;
                    boolean G = G(i4);
                    int i9 = E - b;
                    this.k = b - i4;
                    int i10 = 1;
                    if (G) {
                        int i11 = 0;
                        while (i11 < appBarLayout.getChildCount()) {
                            d dVar2 = (d) appBarLayout.getChildAt(i11).getLayoutParams();
                            c cVar = dVar2.b;
                            if (cVar != null && (dVar2.a & i10) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                float D = D();
                                Rect rect = cVar.b;
                                Rect rect2 = cVar.a;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect2.top - Math.abs(D);
                                if (abs2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float a2 = 1.0f - xwk.a(Math.abs(abs2 / rect2.height()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (a2 * a2)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-height));
                                    if (height >= rect.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                                    childAt2.setClipBounds(rect);
                                } else {
                                    WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    childAt2.setVisibility(0);
                                }
                            }
                            i11++;
                            i10 = 1;
                        }
                    }
                    if (!G && appBarLayout.f) {
                        coordinatorLayout.B(appBarLayout);
                    }
                    appBarLayout.e(D());
                    a0(coordinatorLayout, appBarLayout, b, b < E ? -1 : 1, false);
                    i6 = i9;
                }
            }
            if (iut0.e(coordinatorLayout) != null) {
                return i6;
            }
            iut0.q(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public final void P(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(E() - i);
            float abs2 = Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int round = abs2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int E = E();
            if (E == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(rq2.e);
                this.m.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(round, 600));
            this.m.setIntValues(E, i);
            this.m.start();
        }

        public void R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int round;
            super.n(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            P(coordinatorLayout, appBarLayout, i2);
                        } else {
                            M(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            P(coordinatorLayout, appBarLayout, 0);
                        } else {
                            M(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.d) {
                M(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.e) {
                M(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f);
                int i3 = -childAt.getBottom();
                if (this.n.h) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    round = Math.round(childAt.getHeight() * this.n.g) + i3;
                }
                M(coordinatorLayout, appBarLayout, round);
            }
            appBarLayout.g = 0;
            this.n = null;
            G(xwk.b(D(), -appBarLayout.getTotalScrollRange(), 0));
            a0(coordinatorLayout, appBarLayout, D(), 0, true);
            appBarLayout.e(D());
            if (iut0.e(coordinatorLayout) != null) {
                return;
            }
            iut0.q(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void r(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            T t2;
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    t2 = t;
                    iArr[1] = L(coordinatorLayout, t2, E() - i2, i6, i7);
                    if (t2.m) {
                        return;
                    }
                    t2.h(t2.i(view));
                    return;
                }
            }
            t2 = t;
            if (t2.m) {
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: T */
        public void u(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t2;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                iArr[1] = L(coordinatorLayout2, t2, E() - i4, -t.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
            }
            if (i4 == 0 && iut0.e(coordinatorLayout2) == null) {
                iut0.q(coordinatorLayout2, new com.google.android.material.appbar.b(coordinatorLayout2, this, t2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m || (t.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.o = null;
            this.l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: V */
        public void B(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                Z(coordinatorLayout, t);
                if (t.m) {
                    t.h(t.i(view));
                }
            }
            this.o = new WeakReference<>(view);
        }

        public final void W(@Nullable SavedState savedState, boolean z) {
            if (this.n == null || z) {
                this.n = savedState;
            }
        }

        @Nullable
        public final SavedState X(@Nullable Parcelable parcelable, @NonNull T t) {
            int D = D();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + D;
                if (childAt.getTop() + D <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = D == 0;
                    savedState.e = z;
                    savedState.d = !z && (-D) >= t.getTotalScrollRange();
                    savedState.f = i;
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    savedState.h = bottom == t.getTopInset() + childAt.getMinimumHeight();
                    savedState.g = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void Y(@Nullable SuperAppFragment.d dVar) {
            this.p = dVar;
        }

        public final void Z(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int E = E() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if ((dVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i2 = -E;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i3 = dVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        if (t.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i4 -= t.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (E < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (E < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    P(coordinatorLayout, t, xwk.b(i4 + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // xsna.azt0, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            R(coordinatorLayout, (AppBarLayout) view, i);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.U(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void w(@NonNull View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.n = null;
            } else {
                W((SavedState) parcelable, true);
                Parcelable parcelable2 = this.n.b;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable x(@NonNull View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState X = X(absSavedState, (AppBarLayout) view);
            return X == null ? absSavedState : X;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public boolean d;
            public boolean e;
            public int f;
            public float g;
            public boolean h;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                public final Object createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            }

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.d = parcel.readByte() != 0;
                this.e = parcel.readByte() != 0;
                this.f = parcel.readInt();
                this.g = parcel.readFloat();
                this.h = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f);
                parcel.writeFloat(this.g);
                parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.a<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends byu {
        public ScrollingViewBehavior() {
        }

        @Override // xsna.byu
        @Nullable
        public final View H(@NonNull ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // xsna.byu
        public final float J(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
            int E = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).E() : 0;
            return ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) ? (E / i) + 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.byu
        public final int K(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                int bottom = ((((BaseBehavior) cVar).k + (view2.getBottom() - view.getTop())) + this.f) - I(view2);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.m) {
                return false;
            }
            appBarLayout.h(appBarLayout.i(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            if (view instanceof AppBarLayout) {
                iut0.q(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList E = coordinatorLayout.E(view);
            int size = E.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) E.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.d;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.g(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes13.dex */
    public interface a<T extends AppBarLayout> {
        void a(T t, int i);
    }

    /* loaded from: classes13.dex */
    public static abstract class b {
    }

    /* loaded from: classes13.dex */
    public static class c extends b {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    public static class d extends LinearLayout.LayoutParams {
        public int a;
        public c b;
        public Interpolator c;

        public d(int i) {
            super(-1, i);
            this.a = 1;
        }
    }

    /* loaded from: classes13.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes13.dex */
    public interface f extends a<AppBarLayout> {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r5, r6), attributeSet, r5);
        Integer num;
        int i = R$attr.appBarLayoutStyle;
        int i2 = A;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = 0;
        this.s = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        i2u0.b(this, attributeSet, i, i2);
        TypedArray d2 = fpo0.d(context2, attributeSet, R$styleable.AppBarLayout, i, i2, new int[0]);
        Drawable drawable = d2.getDrawable(R$styleable.AppBarLayout_android_background);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackground(drawable);
        final ColorStateList a2 = qm10.a(context2, d2, R$styleable.AppBarLayout_liftOnScrollColor);
        this.p = a2 != null;
        final ColorStateList d3 = tko.d(getBackground());
        if (d3 != null) {
            final MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(d3);
            if (a2 != null) {
                Context context3 = getContext();
                TypedValue a3 = jl10.a(R$attr.colorSurface, context3);
                if (a3 != null) {
                    int i3 = a3.resourceId;
                    num = Integer.valueOf(i3 != 0 ? context3.getColor(i3) : a3.data);
                } else {
                    num = null;
                }
                final Integer num2 = num;
                this.r = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.k13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num3;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        ArrayList arrayList = appBarLayout.s;
                        int g = dm10.g(((Float) valueAnimator.getAnimatedValue()).floatValue(), d3.getDefaultColor(), a2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(g);
                        MaterialShapeDrawable materialShapeDrawable2 = materialShapeDrawable;
                        materialShapeDrawable2.setFillColor(valueOf);
                        if (appBarLayout.w != null && (num3 = appBarLayout.x) != null && num3.equals(num2)) {
                            appBarLayout.w.setTint(g);
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AppBarLayout.e eVar = (AppBarLayout.e) it.next();
                            if (materialShapeDrawable2.getFillColor() != null) {
                                eVar.a();
                            }
                        }
                    }
                };
                setBackground(materialShapeDrawable);
            } else {
                materialShapeDrawable.initializeElevationOverlay(context2);
                this.r = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.l13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i4 = AppBarLayout.A;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        MaterialShapeDrawable materialShapeDrawable2 = materialShapeDrawable;
                        materialShapeDrawable2.setElevation(floatValue);
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        Drawable drawable2 = appBarLayout.w;
                        if (drawable2 instanceof MaterialShapeDrawable) {
                            ((MaterialShapeDrawable) drawable2).setElevation(floatValue);
                        }
                        Iterator it = appBarLayout.s.iterator();
                        while (it.hasNext()) {
                            AppBarLayout.e eVar = (AppBarLayout.e) it.next();
                            materialShapeDrawable2.getResolvedTintColor();
                            eVar.a();
                        }
                    }
                };
                setBackground(materialShapeDrawable);
            }
        }
        this.t = tb30.c(R$attr.motionDurationMedium2, getResources().getInteger(R$integer.app_bar_elevation_anim_duration), context2);
        this.u = tb30.d(context2, R$attr.motionEasingStandardInterpolator, rq2.a);
        if (d2.hasValue(R$styleable.AppBarLayout_expanded)) {
            g(d2.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
        }
        if (d2.hasValue(R$styleable.AppBarLayout_elevation)) {
            i2u0.a(this, d2.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0));
        }
        if (d2.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
            setKeyboardNavigationCluster(d2.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if (d2.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
            setTouchscreenBlocksFocus(d2.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        this.y = getResources().getDimension(R$dimen.design_appbar_elevation);
        this.m = d2.getBoolean(R$styleable.AppBarLayout_liftOnScroll, false);
        this.n = d2.getResourceId(R$styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(d2.getDrawable(R$styleable.AppBarLayout_statusBarForeground));
        d2.recycle();
        iut0.d.c(this, new m13(this));
    }

    public static d c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            d dVar = new d((LinearLayout.LayoutParams) layoutParams);
            dVar.a = 1;
            return dVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar2 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar2.a = 1;
            return dVar2;
        }
        d dVar3 = new d(layoutParams);
        dVar3.a = 1;
        return dVar3;
    }

    public final void a(f fVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        if (fVar == null || this.i.contains(fVar)) {
            return;
        }
        this.i.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
        dVar.a = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        dVar.b = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new c();
        if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            dVar.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
        return dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d() {
        Behavior behavior = this.z;
        BaseBehavior.SavedState X = (behavior == null || this.c == -1 || this.g != 0) ? null : behavior.X(AbsSavedState.c, this);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        if (X != null) {
            this.z.W(X, false);
        }
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.w == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.b);
        this.w.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.b = i;
        if (!willNotDraw()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.i.get(i2);
                if (aVar != null) {
                    aVar.a(this, i);
                }
            }
        }
    }

    public final void f(f fVar) {
        ArrayList arrayList = this.i;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.remove(fVar);
    }

    public final void g(boolean z, boolean z2, boolean z3) {
        this.g = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.z = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = dVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i4 & 8) != 0) {
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0) {
                            WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                            if (childAt.getFitsSystemWindows()) {
                                i = Math.min(i, measuredHeight - getTopInset());
                            }
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
                int i4 = dVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.g;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.w;
    }

    @Deprecated
    public float getTargetElevation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int getTopInset() {
        bqx0 bqx0Var = this.h;
        if (bqx0Var != null) {
            return bqx0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = dVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    if (childAt.getFitsSystemWindows()) {
                        i5 -= getTopInset();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(boolean z) {
        if (this.j || this.l == z) {
            return false;
        }
        this.l = z;
        refreshDrawableState();
        if (!(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        boolean z2 = this.p;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            float f3 = z ? 0.0f : 1.0f;
            if (z) {
                f2 = 1.0f;
            }
            j(f3, f2);
            return true;
        }
        if (!this.m) {
            return true;
        }
        float f4 = this.y;
        float f5 = z ? 0.0f : f4;
        if (z) {
            f2 = f4;
        }
        j(f5, f2);
        return true;
    }

    public final boolean i(@Nullable View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.o;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void j(float f2, float f3) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.q = ofFloat;
        ofFloat.setDuration(this.t);
        this.q.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.r;
        if (animatorUpdateListener != null) {
            this.q.addUpdateListener(animatorUpdateListener);
        }
        this.q.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdl.f(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.k;
        int i2 = R$attr.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.l) ? R$attr.state_lifted : -R$attr.state_lifted;
        int i3 = R$attr.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.l) ? R$attr.state_collapsed : -R$attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i5).getLayoutParams()).c != null) {
                this.f = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.j) {
            return;
        }
        if (!this.m) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((d) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.k != z2) {
            this.k = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = xwk.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        bdl.d(this, f2);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        g(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.m = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.n = -1;
        if (view != null) {
            this.o = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.j = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.w = mutate;
            if (mutate instanceof MaterialShapeDrawable) {
                num = Integer.valueOf(((MaterialShapeDrawable) mutate).getResolvedTintColor());
            } else {
                ColorStateList d2 = tko.d(mutate);
                if (d2 != null) {
                    num = Integer.valueOf(d2.getDefaultColor());
                }
            }
            this.x = num;
            Drawable drawable3 = this.w;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.w.setState(getDrawableState());
                }
                Drawable drawable4 = this.w;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.w.setVisible(getVisibility() == 0, false);
                this.w.setCallback(this);
            }
            if (this.w != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(m33.a(i, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        i2u0.a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new d(-2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
