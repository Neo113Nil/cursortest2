package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import com.ironsource.Ua;
import defpackage.a70;
import defpackage.b8;
import defpackage.bsk;
import defpackage.ca;
import defpackage.dzb;
import defpackage.j41;
import defpackage.kuk;
import defpackage.ljf;
import defpackage.luk;
import defpackage.muk;
import defpackage.nkb;
import defpackage.nuk;
import defpackage.on6;
import defpackage.ouk;
import defpackage.puk;
import defpackage.q61;
import defpackage.quk;
import defpackage.ruk;
import defpackage.tq4;
import defpackage.udi;
import defpackage.ujg;
import defpackage.vxd;
import defpackage.wp8;
import defpackage.ytg;
import defpackage.ztg;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect a;
    public final Rect b;
    public final j41 c;
    public int d;
    public boolean e;
    public final kuk f;
    public final nuk g;
    public int h;
    public Parcelable i;
    public final ruk j;
    public final quk k;
    public final ztg l;
    public final j41 m;
    public final on6 n;
    public final dzb o;
    public m p;
    public boolean q;
    public boolean r;
    public int s;
    public final ujg t;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public Parcelable c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        j41 j41Var = new j41();
        this.c = j41Var;
        int i = 0;
        this.e = false;
        this.f = new kuk(this, i);
        this.h = -1;
        this.p = null;
        this.q = false;
        int i2 = 1;
        this.r = true;
        this.s = -1;
        this.t = new ujg(this);
        ruk rukVar = new ruk(this, context);
        this.j = rukVar;
        WeakHashMap weakHashMap = bsk.a;
        rukVar.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        nuk nukVar = new nuk(this);
        this.g = nukVar;
        this.j.setLayoutManager(nukVar);
        this.j.setScrollingTouchSlop(1);
        int[] iArr = ljf.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        bsk.p(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.j.addOnChildAttachStateChangeListener(new muk());
            ztg ztgVar = new ztg(this);
            this.l = ztgVar;
            this.n = new on6(this, ztgVar, this.j);
            quk qukVar = new quk(this);
            this.k = qukVar;
            qukVar.attachToRecyclerView(this.j);
            this.j.addOnScrollListener(this.l);
            j41 j41Var2 = new j41();
            this.m = j41Var2;
            this.l.a = j41Var2;
            luk lukVar = new luk(this, i);
            luk lukVar2 = new luk(this, i2);
            ((ArrayList) j41Var2.b).add(lukVar);
            ((ArrayList) this.m.b).add(lukVar2);
            ujg ujgVar = this.t;
            ruk rukVar2 = this.j;
            ujgVar.getClass();
            rukVar2.setImportantForAccessibility(2);
            ujgVar.d = new kuk(ujgVar, i2);
            ViewPager2 viewPager2 = (ViewPager2) ujgVar.e;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.m.b).add(j41Var);
            dzb dzbVar = new dzb(this.g);
            this.o = dzbVar;
            ((ArrayList) this.m.b).add(dzbVar);
            ruk rukVar3 = this.j;
            attachViewToParent(rukVar3, 0, rukVar3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(ouk oukVar) {
        ((ArrayList) this.c.b).add(oukVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        l adapter;
        String next;
        if (this.h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof udi) {
                wp8 wp8Var = (wp8) ((udi) adapter);
                nkb nkbVar = wp8Var.c;
                nkb nkbVar2 = wp8Var.d;
                if (!nkbVar2.e() || !nkbVar.e()) {
                    a70.r("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(wp8Var.getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    int i = 2;
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.startsWith("f#") && next.length() > 2) {
                            nkbVar.g(wp8Var.b.K(bundle, next), Long.parseLong(next.substring(2)));
                        } else {
                            if (!next.startsWith("s#") || next.length() <= 2) {
                                break;
                            }
                            long parseLong = Long.parseLong(next.substring(2));
                            Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                            if (wp8Var.p(parseLong)) {
                                nkbVar2.g(savedState, parseLong);
                            }
                        }
                    } else if (!nkbVar.e()) {
                        wp8Var.i = true;
                        wp8Var.h = true;
                        wp8Var.r();
                        Handler handler = new Handler(Looper.getMainLooper());
                        b8 b8Var = new b8(wp8Var, 18);
                        wp8Var.a.a(new tq4(i, handler, b8Var));
                        handler.postDelayed(b8Var, Ua.s);
                    }
                }
                a70.p("Unexpected key in savedState: ".concat(next));
                return;
            }
            this.i = null;
        }
        int max = Math.max(0, Math.min(this.h, adapter.getItemCount() - 1));
        this.d = max;
        this.h = -1;
        this.j.scrollToPosition(max);
        this.t.f0();
    }

    public final void c(int i, boolean z) {
        if (this.n.b.m) {
            a70.r("Cannot change current item when ViewPager2 is fake dragging");
        } else {
            d(i, z);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.j.canScrollVertically(i);
    }

    public final void d(int i, boolean z) {
        l adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i2 = this.d;
        ztg ztgVar = this.l;
        if (min == i2 && ztgVar.f == 0) {
            return;
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.d = min;
        this.t.f0();
        if (ztgVar.f != 0) {
            ztgVar.h();
            ytg ytgVar = ztgVar.g;
            d = ytgVar.b + ytgVar.a;
        }
        ztgVar.getClass();
        ztgVar.e = z ? 2 : 3;
        ztgVar.m = false;
        boolean z2 = ztgVar.i != min;
        ztgVar.i = min;
        ztgVar.d(2);
        if (z2) {
            ztgVar.b(min);
        }
        ruk rukVar = this.j;
        if (!z) {
            rukVar.scrollToPosition(min);
            return;
        }
        double d2 = min;
        if (Math.abs(d2 - d) <= 3.0d) {
            rukVar.smoothScrollToPosition(min);
        } else {
            rukVar.scrollToPosition(d2 > d ? min - 3 : min + 3);
            rukVar.post(new q61(min, rukVar));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e(ouk oukVar) {
        ((ArrayList) this.c.b).remove(oukVar);
    }

    public final void f() {
        quk qukVar = this.k;
        if (qukVar == null) {
            a70.r("Design assumption violated.");
            return;
        }
        nuk nukVar = this.g;
        View findSnapView = qukVar.findSnapView(nukVar);
        if (findSnapView == null) {
            return;
        }
        int position = nukVar.getPosition(findSnapView);
        if (position != this.d && getScrollState() == 0) {
            this.m.c(position);
        }
        this.e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public l getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        ruk rukVar = this.j;
        if (orientation == 0) {
            height = rukVar.getWidth() - rukVar.getPaddingLeft();
            paddingBottom = rukVar.getPaddingRight();
        } else {
            height = rukVar.getHeight() - rukVar.getPaddingTop();
            paddingBottom = rukVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.t.e;
        if (viewPager2.getAdapter() == null) {
            i = 0;
            i2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i = viewPager2.getAdapter().getItemCount();
            i2 = 1;
        } else {
            i2 = viewPager2.getAdapter().getItemCount();
            i = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ca.b(i, i2, 0, false).a);
        l adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.d < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ruk rukVar = this.j;
        int measuredWidth = rukVar.getMeasuredWidth();
        int measuredHeight = rukVar.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        rukVar.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            f();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.j, i, i2);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.h = savedState.b;
        this.i = savedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ruk rukVar = this.j;
        savedState.a = rukVar.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        savedState.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            savedState.c = parcelable;
            return savedState;
        }
        Object adapter = rukVar.getAdapter();
        if (adapter instanceof udi) {
            wp8 wp8Var = (wp8) ((udi) adapter);
            wp8Var.getClass();
            nkb nkbVar = wp8Var.c;
            int i2 = nkbVar.i();
            nkb nkbVar2 = wp8Var.d;
            Bundle bundle = new Bundle(nkbVar2.i() + i2);
            for (int i3 = 0; i3 < nkbVar.i(); i3++) {
                long f = nkbVar.f(i3);
                Fragment fragment = (Fragment) nkbVar.c(f);
                if (fragment != null && fragment.isAdded()) {
                    wp8Var.b.Y(bundle, vxd.l(f, "f#"), fragment);
                }
            }
            for (int i4 = 0; i4 < nkbVar2.i(); i4++) {
                long f2 = nkbVar2.f(i4);
                if (wp8Var.p(f2)) {
                    bundle.putParcelable(vxd.l(f2, "s#"), (Parcelable) nkbVar2.c(f2));
                }
            }
            savedState.c = bundle;
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        ujg ujgVar = this.t;
        ujgVar.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ujgVar.getClass();
        ViewPager2 viewPager2 = (ViewPager2) ujgVar.e;
        if (i != 8192 && i != 4096) {
            zzl.s();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(@Nullable l lVar) {
        ruk rukVar = this.j;
        l adapter = rukVar.getAdapter();
        ujg ujgVar = this.t;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((kuk) ujgVar.d);
        } else {
            ujgVar.getClass();
        }
        kuk kukVar = this.f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(kukVar);
        }
        rukVar.setAdapter(lVar);
        this.d = 0;
        b();
        ujgVar.f0();
        if (lVar != null) {
            lVar.registerAdapterDataObserver((kuk) ujgVar.d);
        }
        if (lVar != null) {
            lVar.registerAdapterDataObserver(kukVar);
        }
    }

    public void setCurrentItem(int i) {
        c(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.t.f0();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            a70.p("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.s = i;
            this.j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.g.setOrientation(i);
        this.t.f0();
    }

    public void setPageTransformer(@Nullable puk pukVar) {
        boolean z = this.q;
        ruk rukVar = this.j;
        if (pukVar != null) {
            if (!z) {
                this.p = rukVar.getItemAnimator();
                this.q = true;
            }
            rukVar.setItemAnimator(null);
        } else if (z) {
            rukVar.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        dzb dzbVar = this.o;
        if (pukVar == ((puk) dzbVar.c)) {
            return;
        }
        dzbVar.c = pukVar;
        if (pukVar == null) {
            return;
        }
        ztg ztgVar = this.l;
        ztgVar.h();
        ytg ytgVar = ztgVar.g;
        double d = ytgVar.b + ytgVar.a;
        int i = (int) d;
        float f = (float) (d - i);
        dzbVar.b(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.f0();
    }
}
