package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.viewpager2.R$styleable;
import androidx.viewpager2.widget.e;
import xsna.am;
import xsna.b9m;
import xsna.fzt0;
import xsna.iut0;
import xsna.yuk0;
import xsna.zm;

/* loaded from: classes12.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect b;
    public final Rect c;
    public final androidx.viewpager2.widget.a d;
    public int e;
    public boolean f;
    public final a g;
    public f h;
    public int i;
    public Parcelable j;
    public RecyclerView k;
    public j l;
    public androidx.viewpager2.widget.e m;
    public androidx.viewpager2.widget.a n;
    public b9m o;
    public androidx.viewpager2.widget.d p;
    public RecyclerView.l q;
    public boolean r;
    public boolean s;
    public int t;
    public h u;

    public class a extends e {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f = true;
            viewPager2.m.m = true;
        }
    }

    public class b extends g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.h();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.e != i) {
                viewPager2.e = i;
                viewPager2.u.a();
            }
        }
    }

    public class c extends g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.k.requestFocus(2);
            }
        }
    }

    public abstract class d {
    }

    public static abstract class e extends RecyclerView.i {
        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void b();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, @Nullable Object obj) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            b();
        }
    }

    public class f extends LinearLayoutManager {
        public f() {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void o(@NonNull RecyclerView.a0 a0Var, @NonNull int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.o(a0Var, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.v vVar, @NonNull RecyclerView.a0 a0Var, @NonNull am amVar) {
            super.onInitializeAccessibilityNodeInfo(vVar, a0Var, amVar);
            ViewPager2.this.u.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.v vVar, @NonNull RecyclerView.a0 a0Var, @NonNull View view, @NonNull am amVar) {
            ViewPager2 viewPager2 = ViewPager2.this;
            amVar.q(am.h.a(viewPager2.getOrientation() == 1 ? viewPager2.h.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.h.getPosition(view) : 0, 1, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean performAccessibilityAction(@NonNull RecyclerView.v vVar, @NonNull RecyclerView.a0 a0Var, int i, @Nullable Bundle bundle) {
            ViewPager2.this.u.getClass();
            return super.performAccessibilityAction(vVar, a0Var, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    public class h extends d {
        public final a a = new a();
        public final b b = new b();
        public androidx.viewpager2.widget.f c;

        public class a implements zm {
            public a() {
            }

            @Override // xsna.zm
            public final boolean a(@NonNull View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.s) {
                    viewPager2.f(currentItem, true);
                }
                return true;
            }
        }

        public class b implements zm {
            public b() {
            }

            @Override // xsna.zm
            public final boolean a(@NonNull View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.s) {
                    viewPager2.f(currentItem, true);
                }
                return true;
            }
        }

        public h() {
        }

        public final void a() {
            int itemCount;
            int i = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            iut0.n(R.id.accessibilityActionPageLeft, viewPager2);
            iut0.k(0, viewPager2);
            iut0.n(R.id.accessibilityActionPageRight, viewPager2);
            iut0.k(0, viewPager2);
            iut0.n(R.id.accessibilityActionPageUp, viewPager2);
            iut0.k(0, viewPager2);
            iut0.n(R.id.accessibilityActionPageDown, viewPager2);
            iut0.k(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.s) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.b;
            a aVar = this.a;
            if (orientation != 0) {
                if (viewPager2.e < itemCount - 1) {
                    iut0.o(viewPager2, new am.a(R.id.accessibilityActionPageDown, (CharSequence) null), null, aVar);
                }
                if (viewPager2.e > 0) {
                    iut0.o(viewPager2, new am.a(R.id.accessibilityActionPageUp, (CharSequence) null), null, bVar);
                    return;
                }
                return;
            }
            boolean z = viewPager2.h.getLayoutDirection() == 1;
            int i2 = z ? 16908360 : 16908361;
            if (z) {
                i = 16908361;
            }
            if (viewPager2.e < itemCount - 1) {
                iut0.o(viewPager2, new am.a(i2, (CharSequence) null), null, aVar);
            }
            if (viewPager2.e > 0) {
                iut0.o(viewPager2, new am.a(i, (CharSequence) null), null, bVar);
            }
        }
    }

    public interface i {
        void transformPage(@NonNull View view, float f);
    }

    public class j extends g0 {
        public j() {
        }

        @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
        @Nullable
        public final View findSnapView(RecyclerView.o oVar) {
            Object obj = ViewPager2.this.o.b;
            return super.findSnapView(oVar);
        }
    }

    public class k extends RecyclerView {
        public k(@NonNull Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.u.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.e);
            accessibilityEvent.setToIndex(viewPager2.e);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.s && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.s && super.onTouchEvent(motionEvent);
        }
    }

    public static class l implements Runnable {
        public final int b;
        public final RecyclerView c;

        public l(RecyclerView recyclerView, int i) {
            this.b = i;
            this.c = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.smoothScrollToPosition(this.b);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        this.d = new androidx.viewpager2.widget.a();
        this.f = false;
        this.g = new a();
        this.i = -1;
        this.q = null;
        this.r = false;
        this.s = true;
        this.t = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.u = new h();
        k kVar = new k(context);
        this.k = kVar;
        kVar.setId(View.generateViewId());
        this.k.setDescendantFocusability(131072);
        f fVar = new f();
        this.h = fVar;
        this.k.setLayoutManager(fVar);
        this.k.setScrollingTouchSlop(1);
        int[] iArr = R$styleable.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        iut0.p(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.k.addOnChildAttachStateChangeListener(new fzt0());
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.m = eVar;
            this.o = new b9m(eVar);
            j jVar = new j();
            this.l = jVar;
            jVar.attachToRecyclerView(this.k);
            this.k.addOnScrollListener(this.m);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
            this.n = aVar;
            this.m.b = aVar;
            b bVar = new b();
            c cVar = new c();
            this.n.d.add(bVar);
            this.n.d.add(cVar);
            h hVar = this.u;
            RecyclerView recyclerView = this.k;
            hVar.getClass();
            recyclerView.setImportantForAccessibility(2);
            hVar.c = new androidx.viewpager2.widget.f(hVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            androidx.viewpager2.widget.a aVar2 = this.n;
            aVar2.d.add(this.d);
            androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.h);
            this.p = dVar;
            this.n.d.add(dVar);
            RecyclerView recyclerView2 = this.k;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(@NonNull g gVar) {
        this.d.d.add(gVar);
    }

    public final void c() {
        if (this.p.e == null) {
            return;
        }
        androidx.viewpager2.widget.e eVar = this.m;
        eVar.o();
        e.a aVar = eVar.h;
        double d2 = aVar.a + aVar.b;
        int i2 = (int) d2;
        float f2 = (float) (d2 - i2);
        this.p.onPageScrolled(i2, f2, Math.round(getPageSize() * f2));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.k.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.k.canScrollVertically(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        RecyclerView.Adapter adapter;
        if (this.i == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.j;
        if (parcelable != null) {
            if (adapter instanceof yuk0) {
                ((yuk0) adapter).h(parcelable);
            }
            this.j = null;
        }
        int max = Math.max(0, Math.min(this.i, adapter.getItemCount() - 1));
        this.e = max;
        this.i = -1;
        this.k.scrollToPosition(max);
        this.u.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).b;
            sparseArray.put(this.k.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i2, boolean z) {
        Object obj = this.o.b;
        f(i2, z);
    }

    public final void f(int i2, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.i != -1) {
                this.i = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        int i3 = this.e;
        if (min == i3 && this.m.g == 0) {
            return;
        }
        if (min == i3 && z) {
            return;
        }
        double d2 = i3;
        this.e = min;
        this.u.a();
        androidx.viewpager2.widget.e eVar = this.m;
        if (eVar.g != 0) {
            eVar.o();
            e.a aVar = eVar.h;
            d2 = aVar.a + aVar.b;
        }
        this.m.m(min, z);
        if (!z) {
            this.k.scrollToPosition(min);
            return;
        }
        double d3 = min;
        if (Math.abs(d3 - d2) <= 3.0d) {
            this.k.smoothScrollToPosition(min);
            return;
        }
        this.k.scrollToPosition(d3 > d2 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.k;
        recyclerView.post(new l(recyclerView, min));
    }

    public final void g(@NonNull g gVar) {
        this.d.d.remove(gVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.u.getClass();
        this.u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.k.getAdapter();
    }

    public int getCurrentItem() {
        return this.e;
    }

    public int getItemDecorationCount() {
        return this.k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.t;
    }

    public int getOrientation() {
        return this.h.b == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.m.g;
    }

    public final void h() {
        j jVar = this.l;
        if (jVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View findSnapView = jVar.findSnapView(this.h);
        if (findSnapView == null) {
            return;
        }
        int position = this.h.getPosition(findSnapView);
        if (position != this.e && getScrollState() == 0) {
            this.n.onPageSelected(position);
        }
        this.f = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        int i3;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            i2 = 0;
            i3 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i2 = viewPager2.getAdapter().getItemCount();
            i3 = 1;
        } else {
            i3 = viewPager2.getAdapter().getItemCount();
            i2 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) am.g.a(i2, i3, 0, false).a);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.s) {
            return;
        }
        if (viewPager2.e > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.e < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.k.getMeasuredWidth();
        int measuredHeight = this.k.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.b;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.k.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f) {
            h();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.k, i2, i3);
        int measuredWidth = this.k.getMeasuredWidth();
        int measuredHeight = this.k.getMeasuredHeight();
        int measuredState = this.k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.c;
        this.j = savedState.d;
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.k.getId();
        int i2 = this.i;
        if (i2 == -1) {
            i2 = this.e;
        }
        savedState.c = i2;
        Parcelable parcelable = this.j;
        if (parcelable != null) {
            savedState.d = parcelable;
            return savedState;
        }
        Object adapter = this.k.getAdapter();
        if (adapter instanceof yuk0) {
            savedState.d = ((yuk0) adapter).r();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, @Nullable Bundle bundle) {
        this.u.getClass();
        if (i2 != 8192 && i2 != 4096) {
            return super.performAccessibilityAction(i2, bundle);
        }
        h hVar = this.u;
        ViewPager2 viewPager2 = ViewPager2.this;
        if (i2 != 8192 && i2 != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i2 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = ViewPager2.this;
        if (viewPager22.s) {
            viewPager22.f(currentItem, true);
        }
        return true;
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.k.getAdapter();
        h hVar = this.u;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(hVar.c);
        } else {
            hVar.getClass();
        }
        a aVar = this.g;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(aVar);
        }
        this.k.setAdapter(adapter);
        this.e = 0;
        d();
        h hVar2 = this.u;
        hVar2.a();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(hVar2.c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i2) {
        e(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.u.a();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.t = i2;
        this.k.requestLayout();
    }

    public void setOrientation(int i2) {
        this.h.setOrientation(i2);
        this.u.a();
    }

    public void setPageTransformer(@Nullable i iVar) {
        if (iVar != null) {
            if (!this.r) {
                this.q = this.k.getItemAnimator();
                this.r = true;
            }
            this.k.setItemAnimator(null);
        } else if (this.r) {
            this.k.setItemAnimator(this.q);
            this.q = null;
            this.r = false;
        }
        androidx.viewpager2.widget.d dVar = this.p;
        if (iVar == dVar.e) {
            return;
        }
        dVar.e = iVar;
        c();
    }

    public void setUserInputEnabled(boolean z) {
        this.s = z;
        this.u.a();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public Parcelable d;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                savedState.d = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                savedState.d = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = new Rect();
        this.d = new androidx.viewpager2.widget.a();
        this.f = false;
        this.g = new a();
        this.i = -1;
        this.q = null;
        this.r = false;
        this.s = true;
        this.t = -1;
        a(context, attributeSet);
    }

    public static abstract class g {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new Rect();
        this.c = new Rect();
        this.d = new androidx.viewpager2.widget.a();
        this.f = false;
        this.g = new a();
        this.i = -1;
        this.q = null;
        this.r = false;
        this.s = true;
        this.t = -1;
        a(context, attributeSet);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.b = new Rect();
        this.c = new Rect();
        this.d = new androidx.viewpager2.widget.a();
        this.f = false;
        this.g = new a();
        this.i = -1;
        this.q = null;
        this.r = false;
        this.s = true;
        this.t = -1;
        a(context, attributeSet);
    }
}
