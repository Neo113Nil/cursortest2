package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.bsk;
import defpackage.fhh;
import defpackage.ilg;
import defpackage.q9d;
import defpackage.r9d;
import defpackage.s0f;
import defpackage.sa0;
import defpackage.srk;
import defpackage.sw9;
import defpackage.t0f;
import defpackage.ts3;
import defpackage.uif;
import defpackage.ujg;
import defpackage.us3;
import defpackage.vs3;
import defpackage.vsk;
import defpackage.wjf;
import defpackage.ws3;
import defpackage.x9l;
import defpackage.xs3;
import defpackage.y73;
import defpackage.ys3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q9d, r9d {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final y73 w;
    public static final t0f x;
    public final ArrayList a;
    public final ujg b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public ys3 l;
    public boolean m;
    public x9l n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public sa0 r;
    public final uif s;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.c.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        w = new y73(10);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new t0f(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.a = new ArrayList();
        this.b = new ujg(9);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.s = new uif((byte) (0 == true ? 1 : 0), 9);
        int[] iArr = wjf.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.i[i2] = (int) (r10[i2] * f);
            }
        }
        coordinatorLayout.p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        coordinatorLayout.w();
        super.setOnHierarchyChangeListener(new ws3(coordinatorLayout));
        WeakHashMap weakHashMap = bsk.a;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) x.c();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, xs3 xs3Var, int i2, int i3) {
        int i4 = xs3Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = xs3Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xs3 m(View view) {
        xs3 xs3Var = (xs3) view.getLayoutParams();
        if (!xs3Var.b) {
            if (view instanceof ts3) {
                xs3Var.b(((ts3) view).getBehavior());
                xs3Var.b = true;
                return xs3Var;
            }
            vs3 vs3Var = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                vs3Var = (vs3) cls.getAnnotation(vs3.class);
                if (vs3Var != null) {
                    break;
                }
            }
            if (vs3Var != null) {
                try {
                    xs3Var.b((us3) vs3Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    vs3Var.value().getClass();
                }
            }
            xs3Var.b = true;
        }
        return xs3Var;
    }

    public static void u(int i, View view) {
        xs3 xs3Var = (xs3) view.getLayoutParams();
        int i2 = xs3Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = bsk.a;
            view.offsetLeftAndRight(i - i2);
            xs3Var.i = i;
        }
    }

    public static void v(int i, View view) {
        xs3 xs3Var = (xs3) view.getLayoutParams();
        int i2 = xs3Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = bsk.a;
            view.offsetTopAndBottom(i - i2);
            xs3Var.j = i;
        }
    }

    @Override // defpackage.q9d
    public void b(int i, View view) {
        uif uifVar = this.s;
        if (i == 1) {
            uifVar.c = 0;
        } else {
            uifVar.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            xs3 xs3Var = (xs3) childAt.getLayoutParams();
            if (xs3Var.a(i)) {
                us3 us3Var = xs3Var.a;
                if (us3Var != null) {
                    us3Var.u(this, childAt, view, i);
                }
                if (i == 0) {
                    xs3Var.m = false;
                } else if (i == 1) {
                    xs3Var.n = false;
                }
                xs3Var.o = false;
            }
        }
        this.k = null;
    }

    @Override // defpackage.q9d
    public final void c(View view, View view2, int i, int i2) {
        uif uifVar = this.s;
        if (i2 == 1) {
            uifVar.c = i;
        } else {
            uifVar.b = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((xs3) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof xs3) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.q9d
    public void d(View view, int i, int i2, int[] iArr, int i3) {
        us3 us3Var;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                xs3 xs3Var = (xs3) childAt.getLayoutParams();
                if (xs3Var.a(i3) && (us3Var = xs3Var.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    us3Var.o(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        us3 us3Var = ((xs3) view.getLayoutParams()).a;
        if (us3Var != null) {
            us3Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(xs3 xs3Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) xs3Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void f(View view) {
        List list = (List) ((fhh) this.b.c).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            us3 us3Var = ((xs3) view2.getLayoutParams()).a;
            if (us3Var != null) {
                us3Var.h(this, view2, view);
            }
        }
    }

    @Override // defpackage.r9d
    public void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        us3 us3Var;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                xs3 xs3Var = (xs3) childAt.getLayoutParams();
                if (xs3Var.a(i5) && (us3Var = xs3Var.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    us3Var.p(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new xs3();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xs3 ? new xs3((xs3) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new xs3((ViewGroup.MarginLayoutParams) layoutParams) : new xs3(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.a);
    }

    public final x9l getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        uif uifVar = this.s;
        return uifVar.c | uifVar.b;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // defpackage.q9d
    public void h(View view, int i, int i2, int i3, int i4, int i5) {
        g(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // defpackage.q9d
    public boolean i(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                xs3 xs3Var = (xs3) childAt.getLayoutParams();
                us3 us3Var = xs3Var.a;
                if (us3Var != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean t2 = us3Var.t(coordinatorLayout, childAt, view3, i3, i4);
                    z |= t2;
                    if (i4 == 0) {
                        xs3Var.m = t2;
                    } else if (i4 == 1) {
                        xs3Var.n = t2;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        xs3Var.m = false;
                    } else if (i4 == 1) {
                        xs3Var.n = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    public final void j(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            vsk.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        fhh fhhVar = (fhh) this.b.c;
        int i = fhhVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) fhhVar.k(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fhhVar.g(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final boolean n(View view, int i, int i2) {
        t0f t0fVar = x;
        Rect a = a();
        vsk.a(this, view, a);
        try {
            return a.contains(i, i2);
        } finally {
            a.setEmpty();
            t0fVar.b(a);
        }
    }

    public final void o(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList2;
        xs3 xs3Var;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        us3 us3Var;
        WeakHashMap weakHashMap = bsk.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.a;
        int size = arrayList3.size();
        Rect a = a();
        Rect a2 = a();
        Rect a3 = a();
        int i13 = 0;
        while (true) {
            t0f t0fVar = x;
            if (i13 >= size) {
                Rect rect3 = a3;
                a.setEmpty();
                t0fVar.b(a);
                a2.setEmpty();
                t0fVar.b(a2);
                rect3.setEmpty();
                t0fVar.b(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            xs3 xs3Var2 = (xs3) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (xs3Var2.l == ((View) arrayList3.get(i14))) {
                        xs3 xs3Var3 = (xs3) view2.getLayoutParams();
                        if (xs3Var3.k != null) {
                            Rect a4 = a();
                            Rect a5 = a();
                            xs3 xs3Var4 = xs3Var2;
                            Rect a6 = a();
                            vsk.a(this, xs3Var3.k, a4);
                            j(view2, a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            xs3Var = xs3Var4;
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            i12 = i13;
                            view = view3;
                            l(layoutDirection, a4, a6, xs3Var3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = a3;
                            boolean z4 = (a6.left == a5.left && a6.top == a5.top) ? false : true;
                            e(xs3Var3, a6, measuredWidth, measuredHeight);
                            int i15 = a6.left - a5.left;
                            int i16 = a6.top - a5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = bsk.a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = bsk.a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z4 && (us3Var = xs3Var3.a) != null) {
                                us3Var.h(this, view, xs3Var3.k);
                            }
                            a4.setEmpty();
                            t0fVar.b(a4);
                            a5.setEmpty();
                            t0fVar.b(a5);
                            a6.setEmpty();
                            t0fVar.b(a6);
                            i14 = i10 + 1;
                            xs3Var2 = xs3Var;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            a3 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    xs3Var = xs3Var2;
                    i10 = i14;
                    i11 = size;
                    rect2 = a3;
                    i12 = i13;
                    view = view2;
                    i14 = i10 + 1;
                    xs3Var2 = xs3Var;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    a3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                xs3 xs3Var5 = xs3Var2;
                int i17 = size;
                Rect rect4 = a3;
                i2 = i13;
                View view4 = view2;
                j(view4, a2, true);
                if (xs3Var5.g != 0 && !a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(xs3Var5.g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i18 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i19 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (xs3Var5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = bsk.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        xs3 xs3Var6 = (xs3) view4.getLayoutParams();
                        us3 us3Var2 = xs3Var6.a;
                        Rect a7 = a();
                        Rect a8 = a();
                        a8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (us3Var2 == null || !us3Var2.e(a7, view4)) {
                            a7.set(a8);
                        } else if (!a8.contains(a7)) {
                            sw9.q("Rect should be within the child's bounds. Rect:", a7.toShortString(), " | Bounds:", a8.toShortString());
                            return;
                        }
                        a8.setEmpty();
                        t0fVar.b(a8);
                        if (a7.isEmpty()) {
                            a7.setEmpty();
                            t0fVar.b(a7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(xs3Var6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (a7.top - ((ViewGroup.MarginLayoutParams) xs3Var6).topMargin) - xs3Var6.j) >= (i9 = a.top)) {
                                z2 = false;
                            } else {
                                v(i9 - i8, view4);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - ((ViewGroup.MarginLayoutParams) xs3Var6).bottomMargin) + xs3Var6.j) < (i7 = a.bottom)) {
                                v(height - i7, view4);
                                z2 = true;
                            }
                            if (!z2) {
                                v(0, view4);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (a7.left - ((ViewGroup.MarginLayoutParams) xs3Var6).leftMargin) - xs3Var6.i) >= (i6 = a.left)) {
                                z3 = false;
                            } else {
                                u(i6 - i5, view4);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a7.right) - ((ViewGroup.MarginLayoutParams) xs3Var6).rightMargin) + xs3Var6.i) < (i4 = a.right)) {
                                u(width - i4, view4);
                                z3 = true;
                            }
                            if (!z3) {
                                u(0, view4);
                            }
                            a7.setEmpty();
                            t0fVar.b(a7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((xs3) view4.getLayoutParams()).p);
                    if (rect.equals(a2)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((xs3) view4.getLayoutParams()).p.set(a2);
                    }
                } else {
                    rect = rect4;
                }
                int i20 = i2 + 1;
                i3 = i17;
                while (true) {
                    arrayList = arrayList4;
                    if (i20 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i20);
                    xs3 xs3Var7 = (xs3) view5.getLayoutParams();
                    us3 us3Var3 = xs3Var7.a;
                    if (us3Var3 != null && us3Var3.f(view5, view4)) {
                        if (i == 0 && xs3Var7.o) {
                            xs3Var7.o = false;
                        } else {
                            if (i != 2) {
                                z = us3Var3.h(this, view5, view4);
                            } else {
                                us3Var3.i(this, view4);
                                z = true;
                            }
                            if (i == 1) {
                                xs3Var7.o = z;
                            }
                        }
                    }
                    i20++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = a3;
                i2 = i13;
            }
            i13 = i2 + 1;
            a3 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.m) {
            if (this.l == null) {
                this.l = new ys3(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = bsk.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.o || this.p == null) {
            return;
        }
        x9l x9lVar = this.n;
        int d = x9lVar != null ? x9lVar.d() : 0;
        if (d > 0) {
            this.p.setBounds(0, 0, getWidth(), d);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        us3 us3Var;
        WeakHashMap weakHashMap = bsk.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((us3Var = ((xs3) view.getLayoutParams()).a) == null || !us3Var.l(this, view, layoutDirection))) {
                p(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        us3 us3Var;
        int i7;
        View view;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int absoluteGravity;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i16);
            fhh fhhVar = (fhh) coordinatorLayout.b.c;
            int i17 = fhhVar.c;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList2 = (ArrayList) fhhVar.k(i18);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z != coordinatorLayout.m) {
            boolean z3 = coordinatorLayout.h;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.l == null) {
                        coordinatorLayout.l = new ys3(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = true;
            } else {
                if (z3 && coordinatorLayout.l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = bsk.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.n != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.a;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i8 = size3;
                i13 = i21;
                i11 = paddingRight;
                suggestedMinimumWidth = i23;
                z2 = false;
                i9 = paddingLeft;
            } else {
                xs3 xs3Var = (xs3) view2.getLayoutParams();
                int i24 = xs3Var.e;
                if (i24 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                    arrayList = arrayList3;
                } else {
                    i3 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.i;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (i24 < 0 || i24 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i14 = iArr[i24];
                            i15 = xs3Var.c;
                            if (i15 == 0) {
                                i15 = 8388661;
                            }
                            absoluteGravity = Gravity.getAbsoluteGravity(i15, layoutDirection) & 7;
                            if (!(absoluteGravity == 3 || z4) || (absoluteGravity == 5 && z4)) {
                                i4 = Math.max(0, (size - paddingRight) - i14);
                            } else if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                                i4 = Math.max(0, i14 - paddingLeft);
                            }
                            if (z5 || view2.getFitsSystemWindows()) {
                                i5 = i;
                                i6 = i2;
                            } else {
                                int c = coordinatorLayout.n.c() + coordinatorLayout.n.b();
                                int a = coordinatorLayout.n.a() + coordinatorLayout.n.d();
                                i5 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                                i6 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                            }
                            us3Var = xs3Var.a;
                            if (us3Var == null) {
                                int i25 = i4;
                                int i26 = i5;
                                i8 = size3;
                                i9 = paddingLeft;
                                i10 = i23;
                                int i27 = i3;
                                i11 = paddingRight;
                                i12 = i27;
                                z2 = false;
                                i13 = i21;
                                int i28 = i6;
                                boolean m = us3Var.m(this, view2, i26, i25, i28);
                                view = view2;
                                i5 = i26;
                                i4 = i25;
                                i7 = i28;
                                if (m) {
                                    coordinatorLayout = this;
                                    int max = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin + ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin);
                                    int max2 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) xs3Var).topMargin + ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin);
                                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                                    suggestedMinimumWidth = max;
                                    suggestedMinimumHeight = max2;
                                }
                            } else {
                                int i29 = size3;
                                i7 = i6;
                                view = view2;
                                i8 = i29;
                                i9 = paddingLeft;
                                i10 = i23;
                                int i30 = i3;
                                i11 = paddingRight;
                                i12 = i30;
                                i13 = i21;
                                z2 = false;
                            }
                            coordinatorLayout = this;
                            coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                            int max3 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin + ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin);
                            int max22 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) xs3Var).topMargin + ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max3;
                            suggestedMinimumHeight = max22;
                        }
                    }
                    i14 = 0;
                    i15 = xs3Var.c;
                    if (i15 == 0) {
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i15, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                    }
                    if (absoluteGravity == 5) {
                        i4 = Math.max(0, i14 - paddingLeft);
                        if (z5) {
                        }
                        i5 = i;
                        i6 = i2;
                        us3Var = xs3Var.a;
                        if (us3Var == null) {
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                        int max32 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin + ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin);
                        int max222 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) xs3Var).topMargin + ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin);
                        i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                        suggestedMinimumWidth = max32;
                        suggestedMinimumHeight = max222;
                    }
                    i4 = Math.max(0, i14 - paddingLeft);
                    if (z5) {
                    }
                    i5 = i;
                    i6 = i2;
                    us3Var = xs3Var.a;
                    if (us3Var == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                    int max322 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin + ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin);
                    int max2222 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) xs3Var).topMargin + ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max322;
                    suggestedMinimumHeight = max2222;
                }
                i4 = 0;
                if (z5) {
                }
                i5 = i;
                i6 = i2;
                us3Var = xs3Var.a;
                if (us3Var == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                int max3222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin + ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin);
                int max22222 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) xs3Var).topMargin + ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max3222;
                suggestedMinimumHeight = max22222;
            }
            i21 = i13 + 1;
            size3 = i8;
            paddingLeft = i9;
            paddingRight = i11;
            arrayList3 = arrayList;
        }
        int i31 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i2, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                xs3 xs3Var = (xs3) childAt.getLayoutParams();
                if (xs3Var.a(0)) {
                    us3 us3Var = xs3Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        us3 us3Var;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                xs3 xs3Var = (xs3) childAt.getLayoutParams();
                if (xs3Var.a(0) && (us3Var = xs3Var.a) != null) {
                    z |= us3Var.n(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        h(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        SparseArray sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            us3 us3Var = m(childAt).a;
            if (id != -1 && us3Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                us3Var.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable s;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            us3 us3Var = ((xs3) childAt.getLayoutParams()).a;
            if (id != -1 && us3Var != null && (s = us3Var.s(childAt)) != null) {
                sparseArray.append(id, s);
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return i(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean v2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == null) {
            z = r(motionEvent, 1);
        } else {
            z = false;
        }
        us3 us3Var = ((xs3) this.j.getLayoutParams()).a;
        if (us3Var != null) {
            v2 = us3Var.v(this, this.j, motionEvent);
            motionEvent2 = null;
            if (this.j != null) {
                v2 |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return v2;
            }
            t(false);
            return v2;
        }
        v2 = false;
        motionEvent2 = null;
        if (this.j != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return v2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i, View view) {
        Rect a;
        Rect a2;
        int i2;
        xs3 xs3Var = (xs3) view.getLayoutParams();
        View view2 = xs3Var.k;
        if (view2 == null && xs3Var.f != -1) {
            a70.r("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        t0f t0fVar = x;
        if (view2 != null) {
            a = a();
            a2 = a();
            try {
                vsk.a(this, view2, a);
                xs3 xs3Var2 = (xs3) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, a, a2, xs3Var2, measuredWidth, measuredHeight);
                e(xs3Var2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
                return;
            } finally {
                a.setEmpty();
                t0fVar.b(a);
                a2.setEmpty();
                t0fVar.b(a2);
            }
        }
        int i3 = xs3Var.e;
        if (i3 < 0) {
            xs3 xs3Var3 = (xs3) view.getLayoutParams();
            a = a();
            a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xs3Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) xs3Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) xs3Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) xs3Var3).bottomMargin);
            if (this.n != null) {
                WeakHashMap weakHashMap = bsk.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a.left = this.n.b() + a.left;
                    a.top = this.n.d() + a.top;
                    a.right -= this.n.c();
                    a.bottom -= this.n.a();
                }
            }
            a2 = a();
            int i4 = xs3Var3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
            return;
        }
        xs3 xs3Var4 = (xs3) view.getLayoutParams();
        int i5 = xs3Var4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int i8 = 0;
        int[] iArr = this.i;
        if (iArr == null) {
            toString();
        } else {
            if (i3 >= 0 && i3 < iArr.length) {
                i2 = iArr[i3];
                int i9 = i2 - measuredWidth2;
                if (i6 != 1) {
                    i9 += measuredWidth2 / 2;
                } else if (i6 == 5) {
                    i9 += measuredWidth2;
                }
                if (i7 != 16) {
                    i8 = measuredHeight2 / 2;
                } else if (i7 == 80) {
                    i8 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xs3Var4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) xs3Var4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) xs3Var4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) xs3Var4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            }
            toString();
        }
        i2 = 0;
        int i92 = i2 - measuredWidth2;
        if (i6 != 1) {
        }
        if (i7 != 16) {
        }
        int max3 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xs3Var4).leftMargin, Math.min(i92, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) xs3Var4).rightMargin));
        int max22 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) xs3Var4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) xs3Var4).bottomMargin));
        view.layout(max3, max22, measuredWidth2 + max3, measuredHeight2 + max22);
    }

    public final void q(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        y73 y73Var = w;
        if (y73Var != null) {
            Collections.sort(arrayList, y73Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            us3 us3Var = ((xs3) view.getLayoutParams()).a;
            if (z && actionMasked != 0) {
                if (us3Var != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    }
                    if (i == 0) {
                        us3Var.k(this, view, motionEvent2);
                    } else if (i == 1) {
                        us3Var.v(this, view, motionEvent2);
                    }
                }
            } else if (!z && us3Var != null) {
                if (i == 0) {
                    z = us3Var.k(this, view, motionEvent);
                } else if (i == 1) {
                    z = us3Var.v(this, view, motionEvent);
                }
                if (z) {
                    this.j = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        us3 us3Var = ((xs3) view.getLayoutParams()).a;
        if (us3Var == null || !us3Var.q(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        t(false);
        this.g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        ujg ujgVar = this.b;
        fhh fhhVar = (fhh) ujgVar.c;
        s0f s0fVar = (s0f) ujgVar.b;
        fhh fhhVar2 = (fhh) ujgVar.c;
        int i = fhhVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) fhhVar.k(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                s0fVar.b(arrayList2);
            }
        }
        fhhVar.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            xs3 m = m(childAt);
            int i4 = m.f;
            if (i4 == -1) {
                m.l = null;
                m.k = null;
            } else {
                View view = m.k;
                if (view != null && view.getId() == i4) {
                    View view2 = m.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            m.l = null;
                            m.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    m.l = view2;
                }
                View findViewById = findViewById(i4);
                m.k = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 != childAt) {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            } else if (!isInEditMode()) {
                                a70.r("Anchor must not be a descendant of the anchored view");
                                return;
                            } else {
                                m.l = null;
                                m.k = null;
                            }
                        }
                        m.l = findViewById;
                    } else if (!isInEditMode()) {
                        a70.r("View can not be anchored to the the parent CoordinatorLayout");
                        return;
                    } else {
                        m.l = null;
                        m.k = null;
                    }
                } else if (!isInEditMode()) {
                    ilg.j("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                    return;
                } else {
                    m.l = null;
                    m.k = null;
                }
            }
            if (!fhhVar2.containsKey(childAt)) {
                fhhVar2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != m.l) {
                        WeakHashMap weakHashMap = bsk.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((xs3) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        us3 us3Var = m.a;
                        if (us3Var == null) {
                            continue;
                        } else if (!us3Var.f(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!fhhVar2.containsKey(childAt2) && !fhhVar2.containsKey(childAt2)) {
                        fhhVar2.put(childAt2, null);
                    }
                    if (!fhhVar2.containsKey(childAt2) || !fhhVar2.containsKey(childAt)) {
                        a70.p("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) fhhVar2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) s0fVar.c();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        fhhVar2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) ujgVar.e;
        arrayList4.clear();
        HashSet hashSet = (HashSet) ujgVar.d;
        hashSet.clear();
        int i6 = fhhVar2.c;
        for (int i7 = 0; i7 < i6; i7++) {
            ujgVar.M(fhhVar2.g(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap weakHashMap = bsk.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = bsk.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.p.setVisible(z, false);
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            us3 us3Var = ((xs3) childAt.getLayoutParams()).a;
            if (us3Var != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                if (z) {
                    us3Var.k(this, childAt, obtain);
                } else {
                    us3Var.v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((xs3) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.j = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final void w() {
        WeakHashMap weakHashMap = bsk.a;
        if (!getFitsSystemWindows()) {
            srk.c(this, null);
            return;
        }
        sa0 sa0Var = this.r;
        if (sa0Var == null) {
            sa0Var = new sa0(this, 7);
            this.r = sa0Var;
        }
        srk.c(this, sa0Var);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new xs3(getContext(), attributeSet);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
