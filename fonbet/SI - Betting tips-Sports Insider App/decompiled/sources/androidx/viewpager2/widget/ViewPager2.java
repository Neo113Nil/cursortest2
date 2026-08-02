package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.z0;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.x0;
import com.google.firebase.messaging.x;
import java.util.ArrayList;
import java.util.WeakHashMap;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2866a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2867b;

    /* renamed from: c, reason: collision with root package name */
    public final f f2868c;

    /* renamed from: d, reason: collision with root package name */
    public int f2869d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2870e;

    /* renamed from: f, reason: collision with root package name */
    public final e f2871f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2872g;

    /* renamed from: h, reason: collision with root package name */
    public int f2873h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f2874i;
    public final m j;

    /* renamed from: k, reason: collision with root package name */
    public final l f2875k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2876l;

    /* renamed from: m, reason: collision with root package name */
    public final f f2877m;

    /* renamed from: n, reason: collision with root package name */
    public final h9.c f2878n;

    /* renamed from: o, reason: collision with root package name */
    public final b f2879o;

    /* renamed from: p, reason: collision with root package name */
    public f1 f2880p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2881r;

    /* renamed from: s, reason: collision with root package name */
    public int f2882s;

    /* renamed from: t, reason: collision with root package name */
    public final x f2883t;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new n();

        /* renamed from: a, reason: collision with root package name */
        public int f2884a;

        /* renamed from: b, reason: collision with root package name */
        public int f2885b;

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f2886c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2884a = parcel.readInt();
            this.f2885b = parcel.readInt();
            this.f2886c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f2884a);
            parcel.writeInt(this.f2885b);
            parcel.writeParcelable(this.f2886c, i5);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2866a = new Rect();
        this.f2867b = new Rect();
        f fVar = new f();
        this.f2868c = fVar;
        int i5 = 0;
        this.f2870e = false;
        this.f2871f = new e(i5, this);
        this.f2873h = -1;
        this.f2880p = null;
        this.q = false;
        int i10 = 1;
        this.f2881r = true;
        this.f2882s = -1;
        x xVar = new x();
        xVar.f6185d = this;
        xVar.f6182a = new j(xVar, i5);
        xVar.f6183b = new j(xVar, i10);
        this.f2883t = xVar;
        m mVar = new m(this, context);
        this.j = mVar;
        WeakHashMap weakHashMap = z0.f1413a;
        mVar.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        h hVar = new h(this);
        this.f2872g = hVar;
        this.j.setLayoutManager(hVar);
        this.j.setScrollingTouchSlop(1);
        int[] iArr = d3.a.f8110a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        z0.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.j.addOnChildAttachStateChangeListener(new g());
            d dVar = new d(this);
            this.f2876l = dVar;
            this.f2878n = new h9.c(12, dVar);
            l lVar = new l(this);
            this.f2875k = lVar;
            lVar.attachToRecyclerView(this.j);
            this.j.addOnScrollListener(this.f2876l);
            f fVar2 = new f();
            this.f2877m = fVar2;
            this.f2876l.f2891a = fVar2;
            f fVar3 = new f(this, i5);
            f fVar4 = new f(this, i10);
            ((ArrayList) fVar2.f2905b).add(fVar3);
            ((ArrayList) this.f2877m.f2905b).add(fVar4);
            x xVar2 = this.f2883t;
            m mVar2 = this.j;
            xVar2.getClass();
            mVar2.setImportantForAccessibility(2);
            xVar2.f6184c = new e(i10, xVar2);
            ViewPager2 viewPager2 = (ViewPager2) xVar2.f6185d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f2877m.f2905b).add(fVar);
            b bVar = new b();
            this.f2879o = bVar;
            ((ArrayList) this.f2877m.f2905b).add(bVar);
            m mVar3 = this.j;
            attachViewToParent(mVar3, 0, mVar3.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        x0 adapter;
        if (this.f2873h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f2874i != null) {
            this.f2874i = null;
        }
        int max = Math.max(0, Math.min(this.f2873h, adapter.getItemCount() - 1));
        this.f2869d = max;
        this.f2873h = -1;
        this.j.scrollToPosition(max);
        this.f2883t.P();
    }

    public final void b(int i5, boolean z5) {
        f fVar;
        x0 adapter = getAdapter();
        if (adapter == null) {
            if (this.f2873h != -1) {
                this.f2873h = Math.max(i5, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i5, 0), adapter.getItemCount() - 1);
        int i10 = this.f2869d;
        if (min == i10 && this.f2876l.f2896f == 0) {
            return;
        }
        if (min == i10 && z5) {
            return;
        }
        double d10 = i10;
        this.f2869d = min;
        this.f2883t.P();
        d dVar = this.f2876l;
        if (dVar.f2896f != 0) {
            dVar.c();
            c cVar = dVar.f2897g;
            d10 = cVar.f2888a + cVar.f2889b;
        }
        d dVar2 = this.f2876l;
        dVar2.getClass();
        dVar2.f2895e = z5 ? 2 : 3;
        boolean z7 = dVar2.f2899i != min;
        dVar2.f2899i = min;
        dVar2.a(2);
        if (z7 && (fVar = dVar2.f2891a) != null) {
            fVar.onPageSelected(min);
        }
        if (!z5) {
            this.j.scrollToPosition(min);
            return;
        }
        double d11 = min;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.j.smoothScrollToPosition(min);
            return;
        }
        this.j.scrollToPosition(d11 > d10 ? min - 3 : min + 3);
        m mVar = this.j;
        mVar.post(new o(min, mVar));
    }

    public final void c() {
        l lVar = this.f2875k;
        if (lVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View findSnapView = lVar.findSnapView(this.f2872g);
        if (findSnapView == null) {
            return;
        }
        int position = this.f2872g.getPosition(findSnapView);
        if (position != this.f2869d && getScrollState() == 0) {
            this.f2877m.onPageSelected(position);
        }
        this.f2870e = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i5) {
        return this.j.canScrollHorizontally(i5);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i5) {
        return this.j.canScrollVertically(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i5 = ((SavedState) parcelable).f2884a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i5));
            sparseArray.remove(i5);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f2883t.getClass();
        this.f2883t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public x0 getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2869d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f2882s;
    }

    public int getOrientation() {
        return this.f2872g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        m mVar = this.j;
        if (orientation == 0) {
            height = mVar.getWidth() - mVar.getPaddingLeft();
            paddingBottom = mVar.getPaddingRight();
        } else {
            height = mVar.getHeight() - mVar.getPaddingTop();
            paddingBottom = mVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f2876l.f2896f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i5;
        int i10;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f2883t.f6185d;
        if (viewPager2.getAdapter() == null) {
            i5 = 0;
            i10 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i5 = viewPager2.getAdapter().getItemCount();
            i10 = 1;
        } else {
            i10 = viewPager2.getAdapter().getItemCount();
            i5 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c4.k.b(i5, i10, 0, false).f3593a);
        x0 adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.f2881r) {
            return;
        }
        if (viewPager2.f2869d > 0) {
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
        if (viewPager2.f2869d < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2866a;
        rect.left = paddingLeft;
        rect.right = (i11 - i5) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f2867b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2870e) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        measureChild(this.j, i5, i10);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i5, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2873h = savedState.f2885b;
        this.f2874i = savedState.f2886c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2884a = this.j.getId();
        int i5 = this.f2873h;
        if (i5 == -1) {
            i5 = this.f2869d;
        }
        savedState.f2885b = i5;
        Parcelable parcelable = this.f2874i;
        if (parcelable != null) {
            savedState.f2886c = parcelable;
            return savedState;
        }
        this.j.getAdapter();
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i5, Bundle bundle) {
        this.f2883t.getClass();
        if (i5 != 8192 && i5 != 4096) {
            return super.performAccessibilityAction(i5, bundle);
        }
        x xVar = this.f2883t;
        ViewPager2 viewPager2 = (ViewPager2) xVar.f6185d;
        if (i5 != 8192 && i5 != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i5 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = (ViewPager2) xVar.f6185d;
        if (viewPager22.f2881r) {
            viewPager22.b(currentItem, true);
        }
        return true;
    }

    public void setAdapter(x0 x0Var) {
        x0 adapter = this.j.getAdapter();
        x xVar = this.f2883t;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((e) xVar.f6184c);
        } else {
            xVar.getClass();
        }
        e eVar = this.f2871f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(eVar);
        }
        this.j.setAdapter(x0Var);
        this.f2869d = 0;
        a();
        x xVar2 = this.f2883t;
        xVar2.P();
        if (x0Var != null) {
            x0Var.registerAdapterDataObserver((e) xVar2.f6184c);
        }
        if (x0Var != null) {
            x0Var.registerAdapterDataObserver(eVar);
        }
    }

    public void setCurrentItem(int i5) {
        Object obj = this.f2878n.f10430b;
        b(i5, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        super.setLayoutDirection(i5);
        this.f2883t.P();
    }

    public void setOffscreenPageLimit(int i5) {
        if (i5 < 1 && i5 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f2882s = i5;
        this.j.requestLayout();
    }

    public void setOrientation(int i5) {
        this.f2872g.setOrientation(i5);
        this.f2883t.P();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.q) {
                this.f2880p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        } else if (this.q) {
            this.j.setItemAnimator(this.f2880p);
            this.f2880p = null;
            this.q = false;
        }
        this.f2879o.getClass();
        if (kVar == null) {
            return;
        }
        this.f2879o.getClass();
        this.f2879o.getClass();
    }

    public void setUserInputEnabled(boolean z5) {
        this.f2881r = z5;
        this.f2883t.P();
    }
}
