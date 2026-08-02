package ru.ozon.android.messenger.framework.presentation.common.screen;

import P2.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.core.view.Y;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.messenger.R$styleable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u000b\fB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/screen/BaseBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class BaseBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private int f91011a;

    /* renamed from: b, reason: collision with root package name */
    private int f91012b;

    /* renamed from: c, reason: collision with root package name */
    private int f91013c;

    /* renamed from: d, reason: collision with root package name */
    private int f91014d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f91015e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f91016f;

    /* renamed from: g, reason: collision with root package name */
    private int f91017g;

    /* renamed from: h, reason: collision with root package name */
    private P2.b f91018h;

    /* renamed from: i, reason: collision with root package name */
    private int f91019i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<V> f91020j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<View> f91021k;

    /* renamed from: l, reason: collision with root package name */
    private int f91022l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f91023m;

    /* renamed from: n, reason: collision with root package name */
    private int f91024n;

    /* renamed from: o, reason: collision with root package name */
    private final float f91025o;

    /* renamed from: p, reason: collision with root package name */
    private int f91026p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f91027q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f91028r;

    /* renamed from: s, reason: collision with root package name */
    private int f91029s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f91030t;

    /* renamed from: u, reason: collision with root package name */
    private WeakReference<ViewPager> f91031u;

    /* renamed from: v, reason: collision with root package name */
    private BottomSheetBehavior.f f91032v;

    /* renamed from: w, reason: collision with root package name */
    private VelocityTracker f91033w;

    /* renamed from: x, reason: collision with root package name */
    private int f91034x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final c f91035y;

    protected static final class a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1697a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f91036a;

        /* renamed from: b, reason: collision with root package name */
        private final int f91037b;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.common.screen.BaseBottomSheetBehavior$a$a, reason: collision with other inner class name */
        public static final class C1697a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readParcelable(a.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(Parcelable parcelable, int i11) {
            this.f91036a = parcelable;
            this.f91037b = i11;
        }

        public final int a() {
            return this.f91037b;
        }

        public final Parcelable b() {
            return this.f91036a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f91036a, aVar.f91036a) && this.f91037b == aVar.f91037b;
        }

        public final int hashCode() {
            Parcelable parcelable = this.f91036a;
            return Integer.hashCode(this.f91037b) + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "SavedState(superState=" + this.f91036a + ", state=" + this.f91037b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91036a, i11);
            dest.writeInt(this.f91037b);
        }
    }

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f91038a;

        /* renamed from: b, reason: collision with root package name */
        private final int f91039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseBottomSheetBehavior<V> f91040c;

        public b(@NotNull BaseBottomSheetBehavior baseBottomSheetBehavior, View mView, int i11) {
            Intrinsics.checkNotNullParameter(mView, "mView");
            this.f91040c = baseBottomSheetBehavior;
            this.f91038a = mView;
            this.f91039b = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91040c;
            P2.b f91018h = baseBottomSheetBehavior.getF91018h();
            if (f91018h == null || !f91018h.f()) {
                baseBottomSheetBehavior.p(this.f91039b);
            } else {
                int i11 = Y.f42258g;
                this.f91038a.postOnAnimation(this);
            }
        }
    }

    public static final class c extends b.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseBottomSheetBehavior<V> f91041a;

        c(BaseBottomSheetBehavior<V> baseBottomSheetBehavior) {
            this.f91041a = baseBottomSheetBehavior;
        }

        @Override // P2.b.c
        public final int clampViewPositionHorizontal(View child, int i11, int i12) {
            Intrinsics.checkNotNullParameter(child, "child");
            return child.getLeft();
        }

        @Override // P2.b.c
        public final int clampViewPositionVertical(View child, int i11, int i12) {
            Intrinsics.checkNotNullParameter(child, "child");
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91041a;
            return com.google.common.primitives.e.b(i11, baseBottomSheetBehavior.getF91012b(), ((BaseBottomSheetBehavior) baseBottomSheetBehavior).f91015e ? baseBottomSheetBehavior.getF91019i() : baseBottomSheetBehavior.getF91013c());
        }

        @Override // P2.b.c
        public final int getViewVerticalDragRange(View child) {
            int f91013c;
            int f91012b;
            Intrinsics.checkNotNullParameter(child, "child");
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91041a;
            if (((BaseBottomSheetBehavior) baseBottomSheetBehavior).f91015e) {
                f91013c = baseBottomSheetBehavior.getF91019i();
                f91012b = baseBottomSheetBehavior.getF91012b();
            } else {
                f91013c = baseBottomSheetBehavior.getF91013c();
                f91012b = baseBottomSheetBehavior.getF91012b();
            }
            return f91013c - f91012b;
        }

        @Override // P2.b.c
        public final void onViewDragStateChanged(int i11) {
            if (i11 == 1) {
                this.f91041a.p(1);
            }
        }

        @Override // P2.b.c
        public final void onViewPositionChanged(View changedView, int i11, int i12, int i13, int i14) {
            Intrinsics.checkNotNullParameter(changedView, "changedView");
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91041a;
            baseBottomSheetBehavior.e(i12);
            baseBottomSheetBehavior.getF91013c();
            baseBottomSheetBehavior.getClass();
        }

        @Override // P2.b.c
        public final void onViewReleased(View releasedChild, float f7, float f11) {
            int f91013c;
            Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
            int top = releasedChild.getTop();
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91041a;
            int i11 = 3;
            if (f11 < 0.0f) {
                f91013c = baseBottomSheetBehavior.getF91012b();
            } else if (baseBottomSheetBehavior.getF91016f()) {
                if (baseBottomSheetBehavior.r(releasedChild, f11)) {
                    f91013c = baseBottomSheetBehavior.getF91012b();
                } else {
                    f91013c = baseBottomSheetBehavior.getF91019i();
                    i11 = 5;
                }
            } else if (((BaseBottomSheetBehavior) baseBottomSheetBehavior).f91015e && baseBottomSheetBehavior.q(releasedChild, f11)) {
                f91013c = baseBottomSheetBehavior.getF91019i();
                i11 = 5;
            } else {
                if (f11 != 0.0f) {
                    f91013c = baseBottomSheetBehavior.getF91013c();
                } else if (Math.abs(top - baseBottomSheetBehavior.getF91012b()) < Math.abs(top - baseBottomSheetBehavior.getF91013c())) {
                    f91013c = baseBottomSheetBehavior.getF91012b();
                } else {
                    f91013c = baseBottomSheetBehavior.getF91013c();
                }
                i11 = 4;
            }
            P2.b f91018h = baseBottomSheetBehavior.getF91018h();
            if (f91018h == null || !f91018h.r(releasedChild.getLeft(), f91013c)) {
                baseBottomSheetBehavior.p(i11);
                return;
            }
            baseBottomSheetBehavior.p(2);
            b bVar = new b(baseBottomSheetBehavior, releasedChild, i11);
            int i12 = Y.f42258g;
            releasedChild.postOnAnimation(bVar);
        }

        @Override // P2.b.c
        public final boolean tryCaptureView(View child, int i11) {
            Intrinsics.checkNotNullParameter(child, "child");
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91041a;
            if (baseBottomSheetBehavior.k() == 1 || baseBottomSheetBehavior.getF91023m()) {
                return false;
            }
            if (baseBottomSheetBehavior.k() == 3 && baseBottomSheetBehavior.getF91022l() == i11) {
                WeakReference<View> i12 = baseBottomSheetBehavior.i();
                View view = i12 != null ? i12.get() : null;
                if (view != null && view.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> n11 = baseBottomSheetBehavior.n();
            return (n11 != null ? n11.get() : null) == child;
        }
    }

    public static final class d extends ViewPager.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseBottomSheetBehavior<V> f91042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPager f91043b;

        d(BaseBottomSheetBehavior<V> baseBottomSheetBehavior, ViewPager viewPager) {
            this.f91042a = baseBottomSheetBehavior;
            this.f91043b = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i11) {
            ViewPager viewPager = this.f91043b;
            BaseBottomSheetBehavior<V> baseBottomSheetBehavior = this.f91042a;
            baseBottomSheetBehavior.o(new WeakReference<>(baseBottomSheetBehavior.findScrollingChild(viewPager)));
        }
    }

    public BaseBottomSheetBehavior() {
        this.f91014d = 4;
        this.f91017g = 3;
        this.f91035y = new c(this);
        this.f91025o = 0.0f;
    }

    public static void b(BaseBottomSheetBehavior baseBottomSheetBehavior, View view, int i11) {
        baseBottomSheetBehavior.startSettlingAnimation(view, i11);
    }

    private static boolean d(View view) {
        C5314e0 c5314e0;
        if (view.canScrollVertically(-1)) {
            return true;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return false;
        }
        Iterator<View> it = C5316f0.b(viewGroup).iterator();
        do {
            c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return false;
            }
        } while (!d((View) c5314e0.next()));
        return true;
    }

    private final float getYVelocity() {
        VelocityTracker velocityTracker = this.f91033w;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f91025o);
        return velocityTracker.getXVelocity(this.f91022l);
    }

    private final void reset() {
        this.f91022l = -1;
        VelocityTracker velocityTracker = this.f91033w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f91033w = null;
    }

    private final void startSettlingAnimation(View view, int i11) {
        int i12;
        if (i11 == 4) {
            i12 = this.f91013c;
        } else if (i11 == 3) {
            i12 = this.f91012b;
        } else {
            if (!this.f91015e || i11 != 5) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Illegal state argument: "));
            }
            i12 = this.f91019i;
        }
        P2.b bVar = this.f91018h;
        if (bVar == null || !bVar.t(view, view.getLeft(), i12)) {
            p(i11);
            return;
        }
        p(2);
        b bVar2 = new b(this, view, i11);
        int i13 = Y.f42258g;
        view.postOnAnimation(bVar2);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void addBottomSheetCallback(@NotNull BottomSheetBehavior.f callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f91032v = callback;
    }

    public final void e(int i11) {
        WeakReference<V> weakReference = this.f91020j;
        V bottomSheet = weakReference != null ? weakReference.get() : null;
        if (bottomSheet != null) {
            if (i11 > this.f91013c) {
                float f7 = (r1 - i11) / (this.f91019i - r1);
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                BottomSheetBehavior.f fVar = this.f91032v;
                if (fVar != null) {
                    fVar.onSlide(bottomSheet, f7);
                    return;
                }
                return;
            }
            float f11 = (r1 - i11) / (r1 - this.f91012b);
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            BottomSheetBehavior.f fVar2 = this.f91032v;
            if (fVar2 != null) {
                fVar2.onSlide(bottomSheet, f11);
            }
        }
    }

    /* renamed from: f, reason: from getter */
    public final int getF91022l() {
        return this.f91022l;
    }

    protected final View findScrollingChild(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Y.s(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            this.f91031u = new WeakReference<>(view);
            ViewPager viewPager = (ViewPager) view;
            View childAt = viewPager.getChildAt(viewPager.getCurrentItem());
            Intrinsics.f(childAt);
            View findScrollingChild = findScrollingChild(childAt);
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
            return null;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
            View findScrollingChild2 = findScrollingChild(childAt2);
            if (findScrollingChild2 != null) {
                return findScrollingChild2;
            }
        }
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final int getF91013c() {
        return this.f91013c;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final int getPeekHeight() {
        if (this.f91027q) {
            return -1;
        }
        return this.f91026p;
    }

    /* renamed from: getSkipCollapsed, reason: from getter */
    public final boolean getF91016f() {
        return this.f91016f;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: getState, reason: from getter */
    public final int getF91017g() {
        return this.f91017g;
    }

    /* renamed from: h, reason: from getter */
    public final int getF91012b() {
        return this.f91012b;
    }

    public final WeakReference<View> i() {
        return this.f91021k;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: isHideable, reason: from getter */
    public final boolean getF91015e() {
        return this.f91015e;
    }

    /* renamed from: j, reason: from getter */
    public final int getF91019i() {
        return this.f91019i;
    }

    public final int k() {
        return this.f91017g;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getF91023m() {
        return this.f91023m;
    }

    /* renamed from: m, reason: from getter */
    public final P2.b getF91018h() {
        return this.f91018h;
    }

    public final WeakReference<V> n() {
        return this.f91020j;
    }

    public final void o(WeakReference<View> weakReference) {
        this.f91021k = weakReference;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(@NotNull CoordinatorLayout.f layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        super.onAttachedToLayoutParams(layoutParams);
        this.f91020j = null;
        this.f91018h = null;
        this.f91021k = null;
        this.f91031u = null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f91020j = null;
        this.f91018h = null;
        this.f91021k = null;
        this.f91031u = null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        ViewPager viewPager;
        P2.b bVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!child.isShown()) {
            this.f91028r = true;
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.f91033w == null) {
            this.f91033w = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f91033w;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        if (actionMasked == 0) {
            int x11 = (int) event.getX();
            this.f91034x = (int) event.getY();
            WeakReference<ViewPager> weakReference = this.f91031u;
            if (weakReference != null && (viewPager = weakReference.get()) != null) {
                viewPager.addOnPageChangeListener(new d(this, viewPager));
            }
            WeakReference<View> weakReference2 = this.f91021k;
            View view = weakReference2 != null ? weakReference2.get() : null;
            if (view != null && parent.isPointInChildBounds(view, x11, this.f91034x) && d(view)) {
                this.f91022l = event.getPointerId(event.getActionIndex());
                this.f91023m = true;
            }
            this.f91028r = this.f91022l == -1 && !parent.isPointInChildBounds(child, x11, this.f91034x);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f91023m = false;
            this.f91022l = -1;
            if (this.f91028r) {
                this.f91028r = false;
                return false;
            }
        }
        if (this.f91028r || (bVar = this.f91018h) == null || !bVar.s(event)) {
            WeakReference<View> weakReference3 = this.f91021k;
            View view2 = weakReference3 != null ? weakReference3.get() : null;
            P2.b bVar2 = this.f91018h;
            if (actionMasked != 2 || view2 == null || this.f91028r || this.f91017g == 1 || parent.isPointInChildBounds(view2, (int) event.getX(), (int) event.getY()) || bVar2 == null || Math.abs(this.f91034x - event.getY()) <= bVar2.k()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull V child, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int i13 = Y.f42258g;
        if (parent.getFitsSystemWindows() && !child.getFitsSystemWindows()) {
            child.setFitsSystemWindows(true);
        }
        int top = child.getTop();
        parent.onLayoutChild(child, i11);
        this.f91019i = parent.getHeight();
        if (this.f91027q) {
            if (this.f91011a == 0) {
                this.f91011a = parent.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            WindowInsets rootWindowInsets = parent.getRootWindowInsets();
            i12 = Math.max(this.f91011a, (this.f91019i - (rootWindowInsets != null ? rootWindowInsets.getStableInsetTop() : 0)) - ((parent.getWidth() * 9) / 16));
        } else {
            i12 = this.f91026p;
        }
        int max = Math.max(0, this.f91019i - child.getHeight());
        this.f91012b = max;
        int max2 = Math.max(this.f91019i - i12, max);
        this.f91013c = max2;
        int i14 = this.f91017g;
        if (i14 == 3) {
            child.offsetTopAndBottom(this.f91012b);
        } else if (this.f91015e && i14 == 5) {
            child.offsetTopAndBottom(this.f91019i);
        } else if (i14 == 4) {
            child.offsetTopAndBottom(max2);
        } else if (i14 == 1 || i14 == 2) {
            child.offsetTopAndBottom(top - child.getTop());
        }
        if (this.f91018h == null) {
            this.f91018h = P2.b.g(parent, this.f91035y);
        }
        this.f91020j = new WeakReference<>(child);
        this.f91021k = new WeakReference<>(findScrollingChild(child));
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onNestedPreFling(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View target, float f7, float f11) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        WeakReference<View> weakReference = this.f91021k;
        return (target == (weakReference != null ? weakReference.get() : null)) && ((this.f91017g != 3) || super.onNestedPreFling(coordinatorLayout, child, target, f7, f11));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View target, int i11, int i12, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        WeakReference<View> weakReference = this.f91021k;
        if (target != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = child.getTop();
        int i13 = top - i12;
        if (i12 > 0) {
            int i14 = this.f91012b;
            if (i13 < i14) {
                int i15 = top - i14;
                consumed[1] = i15;
                int i16 = Y.f42258g;
                child.offsetTopAndBottom(-i15);
                p(3);
            } else {
                consumed[1] = i12;
                int i17 = Y.f42258g;
                child.offsetTopAndBottom(-i12);
                p(1);
            }
        } else if (i12 < 0 && !target.canScrollVertically(-1)) {
            int i18 = this.f91013c;
            if (i13 <= i18 || this.f91015e || this.f91016f) {
                consumed[1] = i12;
                int i19 = Y.f42258g;
                child.offsetTopAndBottom(-i12);
                p(1);
            } else {
                int i21 = top - i18;
                consumed[1] = i21;
                int i22 = Y.f42258g;
                child.offsetTopAndBottom(-i21);
                p(4);
            }
        }
        e(child.getTop());
        this.f91029s = i12;
        this.f91030t = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onRestoreInstanceState(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(state, "state");
        a aVar = state instanceof a ? (a) state : null;
        if (aVar == null) {
            super.onRestoreInstanceState(parent, child, O2.a.f19867b);
            return;
        }
        if (aVar.b() != null) {
            super.onRestoreInstanceState(parent, child, aVar.b());
        }
        this.f91017g = (aVar.a() == 1 || aVar.a() == 2) ? this.f91014d : aVar.a();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NotNull
    public final Parcelable onSaveInstanceState(@NotNull CoordinatorLayout parent, @NotNull V child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return new a(super.onSaveInstanceState(parent, child), this.f91017g);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View directTargetChild, @NotNull View target, int i11) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f91029s = 0;
        this.f91030t = false;
        return (i11 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View target) {
        int i11;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        int i12 = 3;
        if (child.getTop() == this.f91012b) {
            p(3);
            return;
        }
        WeakReference<View> weakReference = this.f91021k;
        if (target == (weakReference != null ? weakReference.get() : null) && this.f91030t) {
            if (this.f91029s > 0) {
                i11 = this.f91012b;
            } else {
                boolean z11 = this.f91016f;
                int i13 = 5;
                if (!z11) {
                    if (this.f91015e && (z11 || q(child, getYVelocity()))) {
                        i11 = this.f91019i;
                    } else {
                        i13 = 4;
                        if (this.f91029s == 0) {
                            int top = child.getTop();
                            if (Math.abs(top - this.f91012b) < Math.abs(top - this.f91013c)) {
                                i11 = this.f91012b;
                            } else {
                                i11 = this.f91013c;
                            }
                        } else {
                            i11 = this.f91013c;
                        }
                    }
                    i12 = i13;
                } else if (r(child, getYVelocity())) {
                    i11 = this.f91012b;
                } else {
                    i11 = this.f91019i;
                    i12 = i13;
                }
            }
            P2.b bVar = this.f91018h;
            if (bVar == null || !bVar.t(child, child.getLeft(), i11)) {
                p(i12);
            } else {
                p(2);
                b bVar2 = new b(this, child, i12);
                int i14 = Y.f42258g;
                child.postOnAnimation(bVar2);
            }
            this.f91030t = false;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!child.isShown()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (this.f91017g == 1 && actionMasked == 0) {
            return true;
        }
        try {
            P2.b bVar = this.f91018h;
            if (bVar != null) {
                bVar.m(event);
            }
        } catch (IllegalArgumentException unused) {
        }
        if (actionMasked == 0) {
            reset();
        }
        VelocityTracker velocityTracker = this.f91033w;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.f91033w = velocityTracker;
        }
        velocityTracker.addMovement(event);
        P2.b bVar2 = this.f91018h;
        if (bVar2 != null && actionMasked == 2 && !this.f91028r && Math.abs(this.f91034x - event.getY()) > bVar2.k()) {
            bVar2.b(event.getPointerId(event.getActionIndex()), child);
        }
        return !this.f91028r;
    }

    public final void p(int i11) {
        V bottomSheet;
        if (this.f91017g == i11) {
            return;
        }
        this.f91017g = i11;
        WeakReference<V> weakReference = this.f91020j;
        if (weakReference == null || (bottomSheet = weakReference.get()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        BottomSheetBehavior.f fVar = this.f91032v;
        if (fVar != null) {
            fVar.onStateChanged(bottomSheet, i11);
        }
    }

    public final boolean q(@NotNull View child, float f7) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f91016f) {
            return true;
        }
        if (child.getTop() < this.f91013c) {
            return false;
        }
        return Math.abs(((f7 * 0.1f) + ((float) child.getTop())) - ((float) this.f91013c)) / ((float) this.f91026p) > 0.5f;
    }

    public final boolean r(@NotNull View child, float f7) {
        Intrinsics.checkNotNullParameter(child, "child");
        float top = (f7 * 0.1f) + child.getTop();
        float f11 = this.f91019i;
        return (f11 - top) / f11 > 0.5f;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setHideable(boolean z11) {
        this.f91015e = z11;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setPeekHeight(int i11) {
        WeakReference<V> weakReference;
        V v11;
        int i12 = this.f91024n;
        if (i12 == -1) {
            if (this.f91027q) {
                return;
            } else {
                this.f91027q = true;
            }
        } else {
            if (!this.f91027q && this.f91026p == i12) {
                return;
            }
            this.f91027q = false;
            this.f91026p = Math.max(0, i12);
            this.f91013c = this.f91019i - i12;
        }
        if (this.f91017g != 4 || (weakReference = this.f91020j) == null || (v11 = weakReference.get()) == null) {
            return;
        }
        v11.requestLayout();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setSkipCollapsed(boolean z11) {
        this.f91016f = z11;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setState(final int i11) {
        if (i11 == this.f91017g) {
            return;
        }
        WeakReference<V> weakReference = this.f91020j;
        if (weakReference == null) {
            if (i11 == 4 || i11 == 3 || (this.f91015e && i11 == 5)) {
                this.f91017g = i11;
                return;
            }
            return;
        }
        final V v11 = weakReference.get();
        if (v11 == null) {
            return;
        }
        ViewParent parent = v11.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            int i12 = Y.f42258g;
            if (v11.isAttachedToWindow()) {
                v11.post(new Runnable() { // from class: ru.ozon.android.messenger.framework.presentation.common.screen.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseBottomSheetBehavior.b(BaseBottomSheetBehavior.this, v11, i11);
                    }
                });
                return;
            }
        }
        startSettlingAnimation(v11, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBottomSheetBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f91014d = 4;
        this.f91017g = 3;
        this.f91035y = new c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.OzonBottomSheetBehavior_Layout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        TypedValue peekValue = obtainStyledAttributes.peekValue(R$styleable.OzonBottomSheetBehavior_Layout_behavior_sheetPeekHeight);
        this.f91024n = (peekValue == null || (i11 = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(R$styleable.OzonBottomSheetBehavior_Layout_behavior_sheetPeekHeight, -1) : i11;
        this.f91015e = obtainStyledAttributes.getBoolean(R$styleable.OzonBottomSheetBehavior_Layout_behavior_hideable, false);
        this.f91016f = obtainStyledAttributes.getBoolean(R$styleable.OzonBottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        int i12 = obtainStyledAttributes.getInt(R$styleable.OzonBottomSheetBehavior_Layout_behavior_defaultState, 3);
        this.f91014d = i12;
        this.f91017g = i12;
        obtainStyledAttributes.recycle();
        this.f91025o = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
