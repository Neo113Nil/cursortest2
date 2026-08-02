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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.R$styleable;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.dpj0;
import xsna.go9;
import xsna.iut0;
import xsna.pxt0;
import xsna.qzm;
import xsna.s101;
import xsna.t160;
import xsna.tvb0;
import xsna.u080;
import xsna.u160;
import xsna.v160;
import xsna.v1v;
import xsna.vvb0;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements t160, u160 {
    public static final String u;
    public static final Class<?>[] v;
    public static final ThreadLocal<Map<String, Constructor<c>>> w;
    public static final h x;
    public static final vvb0 y;
    public final ArrayList b;
    public final qzm<View> c;
    public final ArrayList d;
    public final ArrayList e;
    public final int[] f;
    public final int[] g;
    public boolean h;
    public boolean i;
    public final int[] j;
    public View k;
    public View l;
    public g m;
    public boolean n;
    public bqx0 o;
    public boolean p;
    public Drawable q;
    public ViewGroup.OnHierarchyChangeListener r;
    public a s;
    public final v160 t;

    /* loaded from: classes11.dex */
    public class a implements u080 {
        public a() {
        }

        @Override // xsna.u080
        public final bqx0 b(View view, bqx0 bqx0Var) {
            c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.o, bqx0Var)) {
                coordinatorLayout.o = bqx0Var;
                boolean z = bqx0Var.d() > 0;
                coordinatorLayout.p = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!bqx0Var.a.s()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).a) != null) {
                            bqx0Var = cVar.h(childAt, bqx0Var);
                            if (bqx0Var.a.s()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return bqx0Var;
        }
    }

    public interface b {
        @NonNull
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                A(v, view);
            }
        }

        public boolean C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean f(@NonNull Rect rect, @NonNull View view) {
            return false;
        }

        public boolean g(@NonNull View view, @NonNull View view2) {
            return false;
        }

        public boolean j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            return false;
        }

        public boolean p(@NonNull View view, @NonNull View view2, float f) {
            return false;
        }

        public void r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                q(v, view, i2, iArr);
            }
        }

        @Deprecated
        public void t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                s(i2, v);
            }
        }

        public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            t(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public boolean v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        @Nullable
        public Parcelable x(@NonNull View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean y(int i, @NonNull View view) {
            return false;
        }

        public boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return y(i, v);
            }
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void l() {
        }

        public void i(@NonNull f fVar) {
        }

        @Deprecated
        public void A(@NonNull View view, @NonNull View view2) {
        }

        @NonNull
        public bqx0 h(@NonNull View view, @NonNull bqx0 bqx0Var) {
            return bqx0Var;
        }

        public void k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        }

        @Deprecated
        public void s(int i, @NonNull View view) {
        }

        public void w(@NonNull View view, @NonNull Parcelable parcelable) {
        }

        @Deprecated
        public void q(@NonNull View view, @NonNull View view2, int i, @NonNull int[] iArr) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes11.dex */
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.P(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes11.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.P(0);
            return true;
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
        x = new h();
        v = new Class[]{Context.class, AttributeSet.class};
        w = new ThreadLocal<>();
        y = new vvb0(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public static void G(int i, Rect rect, Rect rect2, f fVar, int i2, int i3) {
        int i4 = fVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int n = s101.n(i4, i);
        int i5 = fVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int n2 = s101.n(i5, i);
        int i6 = n & 7;
        int i7 = n & 112;
        int i8 = n2 & 7;
        int i9 = n2 & 112;
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
    public static f N(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.c(behavior);
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.c(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public static void q0(int i, View view) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.i;
        if (i2 != i) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.offsetLeftAndRight(i - i2);
            fVar.i = i;
        }
    }

    public static void s0(int i, View view) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.j;
        if (i2 != i) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.offsetTopAndBottom(i - i2);
            fVar.j = i;
        }
    }

    @NonNull
    public static Rect u() {
        Rect rect = (Rect) y.c();
        return rect == null ? new Rect() : rect;
    }

    public final void B(@NonNull View view) {
        ArrayList<View> arrayList = this.c.b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = arrayList.get(i);
            c cVar = ((f) view2.getLayoutParams()).a;
            if (cVar != null) {
                cVar.j(this, view2, view);
            }
        }
    }

    public final void D(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            pxt0.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public final ArrayList E(@NonNull View view) {
        dpj0<View, ArrayList<View>> dpj0Var = this.c.b;
        int i = dpj0Var.d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> j = dpj0Var.j(i2);
            if (j != null && j.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dpj0Var.f(i2));
            }
        }
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    @NonNull
    public final ArrayList F(@NonNull ViewGroup viewGroup) {
        ArrayList<View> arrayList = this.c.b.get(viewGroup);
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public final int H(int i) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // xsna.t160
    public void H0(View view, int i, int i2, int i3, int i4, int i5) {
        a2(view, i, i2, i3, i4, 0, this.g);
    }

    public final boolean O(int i, int i2, @NonNull View view) {
        vvb0 vvb0Var = y;
        Rect u2 = u();
        pxt0.a(this, view, u2);
        try {
            return u2.contains(i, i2);
        } finally {
            u2.setEmpty();
            vvb0Var.a(u2);
        }
    }

    public final void P(int i) {
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
        f fVar;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        c cVar;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.b;
        int size = arrayList3.size();
        Rect u2 = u();
        Rect u3 = u();
        Rect u4 = u();
        int i13 = 0;
        while (true) {
            vvb0 vvb0Var = y;
            if (i13 >= size) {
                Rect rect3 = u4;
                u2.setEmpty();
                vvb0Var.a(u2);
                u3.setEmpty();
                vvb0Var.a(u3);
                rect3.setEmpty();
                vvb0Var.a(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            f fVar2 = (f) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (fVar2.l == ((View) arrayList3.get(i14))) {
                        f fVar3 = (f) view2.getLayoutParams();
                        if (fVar3.k != null) {
                            Rect u5 = u();
                            Rect u6 = u();
                            f fVar4 = fVar2;
                            Rect u7 = u();
                            pxt0.a(this, fVar3.k, u5);
                            D(view2, u6, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            fVar = fVar4;
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            i12 = i13;
                            view = view3;
                            G(layoutDirection, u5, u7, fVar3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = u4;
                            boolean z4 = (u7.left == u6.left && u7.top == u6.top) ? false : true;
                            w(fVar3, u7, measuredWidth, measuredHeight);
                            int i15 = u7.left - u6.left;
                            int i16 = u7.top - u6.top;
                            if (i15 != 0) {
                                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z4 && (cVar = fVar3.a) != null) {
                                cVar.j(this, view, fVar3.k);
                            }
                            u5.setEmpty();
                            vvb0Var.a(u5);
                            u6.setEmpty();
                            vvb0Var.a(u6);
                            u7.setEmpty();
                            vvb0Var.a(u7);
                            i14 = i10 + 1;
                            fVar2 = fVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            u4 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    fVar = fVar2;
                    i10 = i14;
                    i11 = size;
                    rect2 = u4;
                    i12 = i13;
                    view = view2;
                    i14 = i10 + 1;
                    fVar2 = fVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    u4 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                f fVar5 = fVar2;
                int i17 = size;
                Rect rect4 = u4;
                i2 = i13;
                View view4 = view2;
                D(view4, u3, true);
                if (fVar5.g != 0 && !u3.isEmpty()) {
                    int n = s101.n(fVar5.g, layoutDirection);
                    int i18 = n & 112;
                    if (i18 == 48) {
                        u2.top = Math.max(u2.top, u3.bottom);
                    } else if (i18 == 80) {
                        u2.bottom = Math.max(u2.bottom, getHeight() - u3.top);
                    }
                    int i19 = n & 7;
                    if (i19 == 3) {
                        u2.left = Math.max(u2.left, u3.right);
                    } else if (i19 == 5) {
                        u2.right = Math.max(u2.right, getWidth() - u3.left);
                    }
                }
                if (fVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        f fVar6 = (f) view4.getLayoutParams();
                        c cVar2 = fVar6.a;
                        Rect u8 = u();
                        Rect u9 = u();
                        u9.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (cVar2 == null || !cVar2.f(u8, view4)) {
                            u8.set(u9);
                        } else if (!u9.contains(u8)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + u8.toShortString() + " | Bounds:" + u9.toShortString());
                        }
                        u9.setEmpty();
                        vvb0Var.a(u9);
                        if (u8.isEmpty()) {
                            u8.setEmpty();
                            vvb0Var.a(u8);
                        } else {
                            int n2 = s101.n(fVar6.h, layoutDirection);
                            if ((n2 & 48) != 48 || (i8 = (u8.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.j) >= (i9 = u2.top)) {
                                z2 = false;
                            } else {
                                s0(i9 - i8, view4);
                                z2 = true;
                            }
                            if ((n2 & 80) == 80 && (height = ((getHeight() - u8.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.j) < (i7 = u2.bottom)) {
                                s0(height - i7, view4);
                                z2 = true;
                            }
                            if (!z2) {
                                s0(0, view4);
                            }
                            if ((n2 & 3) != 3 || (i5 = (u8.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.i) >= (i6 = u2.left)) {
                                z3 = false;
                            } else {
                                q0(i6 - i5, view4);
                                z3 = true;
                            }
                            if ((n2 & 5) == 5 && (width = ((getWidth() - u8.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.i) < (i4 = u2.right)) {
                                q0(width - i4, view4);
                                z3 = true;
                            }
                            if (!z3) {
                                q0(0, view4);
                            }
                            u8.setEmpty();
                            vvb0Var.a(u8);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((f) view4.getLayoutParams()).p);
                    if (rect.equals(u3)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((f) view4.getLayoutParams()).p.set(u3);
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
                    f fVar7 = (f) view5.getLayoutParams();
                    c cVar3 = fVar7.a;
                    if (cVar3 != null && cVar3.g(view5, view4)) {
                        if (i == 0 && fVar7.o) {
                            fVar7.o = false;
                        } else {
                            if (i != 2) {
                                z = cVar3.j(this, view5, view4);
                            } else {
                                cVar3.k(this, view4);
                                z = true;
                            }
                            if (i == 1) {
                                fVar7.o = z;
                            }
                        }
                    }
                    i20++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = u4;
                i2 = i13;
            }
            i13 = i2 + 1;
            u4 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    public final void R(int i, @NonNull View view) {
        Rect u2;
        Rect u3;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        if (view2 == null && fVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        vvb0 vvb0Var = y;
        if (view2 != null) {
            u2 = u();
            u3 = u();
            try {
                pxt0.a(this, view2, u2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                G(i, u2, u3, fVar2, measuredWidth, measuredHeight);
                w(fVar2, u3, measuredWidth, measuredHeight);
                view.layout(u3.left, u3.top, u3.right, u3.bottom);
                return;
            } finally {
                u2.setEmpty();
                vvb0Var.a(u2);
                u3.setEmpty();
                vvb0Var.a(u3);
            }
        }
        int i2 = fVar.e;
        if (i2 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            u2 = u();
            u2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.o != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    u2.left = this.o.b() + u2.left;
                    u2.top = this.o.d() + u2.top;
                    u2.right -= this.o.c();
                    u2.bottom -= this.o.a();
                }
            }
            u3 = u();
            int i3 = fVar3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            s101.g(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), i, u2, u3);
            view.layout(u3.left, u3.top, u3.right, u3.bottom);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i4 = fVar4.c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int n = s101.n(i4, i);
        int i5 = n & 7;
        int i6 = n & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int H = H(i2) - measuredWidth2;
        if (i5 == 1) {
            H += measuredWidth2 / 2;
        } else if (i5 == 5) {
            H += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(H, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final void U(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean W(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        h hVar = x;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            c cVar = ((f) view.getLayoutParams()).a;
            if (z && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    }
                    if (i == 0) {
                        cVar.m(this, view, motionEvent2);
                    } else if (i == 1) {
                        cVar.C(this, view, motionEvent2);
                    }
                }
            } else if (!z && cVar != null) {
                if (i == 0) {
                    z = cVar.m(this, view, motionEvent);
                } else if (i == 1) {
                    z = cVar.C(this, view, motionEvent);
                }
                if (z) {
                    this.k = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // xsna.u160
    public void a2(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i5) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.u(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            P(1);
        }
    }

    @Override // xsna.t160
    public void c0(int i, View view) {
        v160 v160Var = this.t;
        if (i == 1) {
            v160Var.b = 0;
        } else {
            v160Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.B(this, childAt, view, i);
                }
                if (i == 0) {
                    fVar.m = false;
                } else if (i == 1) {
                    fVar.n = false;
                }
                fVar.o = false;
            }
        }
        this.l = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        o0();
        return Collections.unmodifiableList(this.b);
    }

    public final bqx0 getLastWindowInsets() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // xsna.t160
    public boolean h4(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean z2 = cVar.z(this, childAt, view, view2, i, i2);
                    z |= z2;
                    if (i2 == 0) {
                        fVar.m = z2;
                    } else if (i2 == 1) {
                        fVar.n = z2;
                    }
                } else if (i2 == 0) {
                    fVar.m = false;
                } else if (i2 == 1) {
                    fVar.n = false;
                }
            }
        }
        return z;
    }

    @Override // xsna.t160
    public final void l0(View view, View view2, int i, int i2) {
        v160 v160Var = this.t;
        if (i2 == 1) {
            v160Var.b = i;
        } else {
            v160Var.a = i;
        }
        this.l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        if ((xsna.s101.n(r8.h, r12) & r13) == r13) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        qzm<View> qzmVar = this.c;
        dpj0<T, ArrayList<T>> dpj0Var = qzmVar.b;
        tvb0 tvb0Var = qzmVar.a;
        dpj0<T, ArrayList<T>> dpj0Var2 = qzmVar.b;
        int i = dpj0Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) dpj0Var.j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                tvb0Var.a(arrayList2);
            }
        }
        dpj0Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f N = N(childAt);
            if (N.f == -1) {
                N.l = null;
                N.k = null;
            } else {
                View view = N.k;
                if (view != null && view.getId() == N.f) {
                    View view2 = N.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            N.l = null;
                            N.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    N.l = view2;
                }
                View findViewById = findViewById(N.f);
                N.k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(N.f) + " to anchor view " + childAt);
                    }
                    N.l = null;
                    N.k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            N.l = null;
                            N.k = null;
                        }
                    }
                    N.l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    N.l = null;
                    N.k = null;
                }
            }
            if (!dpj0Var2.containsKey(childAt)) {
                dpj0Var2.put(childAt, null);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    View childAt2 = getChildAt(i4);
                    if (childAt2 != N.l) {
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        int layoutDirection = getLayoutDirection();
                        int n = s101.n(((f) childAt2.getLayoutParams()).g, layoutDirection);
                        if (n != 0) {
                        }
                        c cVar = N.a;
                        if (cVar == null) {
                            continue;
                        } else if (!cVar.g(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!dpj0Var2.containsKey(childAt2) && !dpj0Var2.containsKey(childAt2)) {
                        dpj0Var2.put(childAt2, null);
                    }
                    if (!dpj0Var2.containsKey(childAt2) || !dpj0Var2.containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) dpj0Var2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) tvb0Var.c();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        dpj0Var2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList<T> arrayList4 = qzmVar.c;
        arrayList4.clear();
        HashSet<T> hashSet = qzmVar.d;
        hashSet.clear();
        int i5 = dpj0Var2.d;
        for (int i6 = 0; i6 < i5; i6++) {
            qzmVar.a(dpj0Var2.f(i6), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p0(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.p || this.q == null) {
            return;
        }
        bqx0 bqx0Var = this.o;
        int d2 = bqx0Var != null ? bqx0Var.d() : 0;
        if (d2 > 0) {
            this.q.setBounds(0, 0, getWidth(), d2);
            this.q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p0(true);
        }
        boolean W = W(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return W;
        }
        p0(true);
        return W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c cVar;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.n(this, view, layoutDirection))) {
                R(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        c cVar;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        View view;
        int i15;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.o0();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i16);
            dpj0<View, ArrayList<View>> dpj0Var = coordinatorLayout.c.b;
            int i17 = dpj0Var.d;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList<View> j = dpj0Var.j(i18);
                if (j != null && j.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z != coordinatorLayout.n) {
            if (z) {
                if (coordinatorLayout.i) {
                    if (coordinatorLayout.m == null) {
                        coordinatorLayout.m = coordinatorLayout.new g();
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.m);
                }
                coordinatorLayout.n = true;
            } else {
                if (coordinatorLayout.i && coordinatorLayout.m != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.m);
                }
                coordinatorLayout.n = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.o != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList2 = coordinatorLayout.b;
        int size3 = arrayList2.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList2.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i6 = size3;
                i15 = i21;
                i9 = paddingLeft;
                suggestedMinimumWidth = i23;
                z2 = false;
                i11 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i24 = fVar.e;
                if (i24 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int H = coordinatorLayout.H(i24);
                    int i25 = fVar.c;
                    if (i25 == 0) {
                        i25 = 8388661;
                    }
                    int n = s101.n(i25, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((n == 3 && !z3) || (n == 5 && z3)) {
                        max = Math.max(0, (size - paddingRight) - H);
                    } else if ((n == 5 && !z3) || (n == 3 && z3)) {
                        max = Math.max(0, H - paddingLeft);
                    }
                    int i26 = size3;
                    i5 = max;
                    i4 = i26;
                    if (z4 || view2.getFitsSystemWindows()) {
                        i6 = i4;
                        i7 = i;
                        i8 = i2;
                    } else {
                        i6 = i4;
                        int c2 = coordinatorLayout.o.c() + coordinatorLayout.o.b();
                        int a2 = coordinatorLayout.o.a() + coordinatorLayout.o.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c2, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                    }
                    cVar = fVar.a;
                    if (cVar == null) {
                        z2 = false;
                        i9 = paddingLeft;
                        i10 = i23;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList2;
                        int i27 = i7;
                        i15 = i21;
                        int i28 = i8;
                        boolean o = cVar.o(this, view2, i27, i5, i28);
                        view = view2;
                        i7 = i27;
                        i13 = i5;
                        i14 = i28;
                        if (o) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max3 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i9 = paddingLeft;
                        i10 = i23;
                        z2 = false;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList2;
                        i13 = i5;
                        i14 = i8;
                        view = view2;
                        i15 = i21;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                    int max22 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max32 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i4 = size3;
                i5 = 0;
                if (z4) {
                }
                i6 = i4;
                i7 = i;
                i8 = i2;
                cVar = fVar.a;
                if (cVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                int max222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max322 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i21 = i15 + 1;
            paddingLeft = i9;
            paddingRight = i11;
            size3 = i6;
            arrayList2 = arrayList;
        }
        int i29 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z |= cVar.p(childAt, view, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        s1(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        H0(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        l0(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d());
        SparseArray<Parcelable> sparseArray = savedState.d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c cVar = N(childAt).a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.w(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable x2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (id != -1 && cVar != null && (x2 = cVar.x(childAt)) != null) {
                sparseArray.append(id, x2);
            }
        }
        savedState.d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return h4(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        c0(0, view);
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
        boolean C;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.k == null) {
            z = W(motionEvent, 1);
        } else {
            z = false;
        }
        c cVar = ((f) this.k.getLayoutParams()).a;
        if (cVar != null) {
            C = cVar.C(this, this.k, motionEvent);
            motionEvent2 = null;
            if (this.k != null) {
                C |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return C;
            }
            p0(false);
            return C;
        }
        C = false;
        motionEvent2 = null;
        if (this.k != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        p0(false);
        return C;
    }

    public final void p0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                if (z) {
                    cVar.m(this, childAt, obtain);
                } else {
                    cVar.C(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((f) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.k = null;
        this.h = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar == null || !cVar.v(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.h) {
            return;
        }
        p0(false);
        this.h = true;
    }

    @Override // xsna.t160
    public void s1(View view, int i, int i2, int[] iArr, int i3) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i3) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.r(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            P(1);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        v0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                Drawable drawable3 = this.q;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
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
        Drawable drawable = this.q;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    public final void v0() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!getFitsSystemWindows()) {
            iut0.d.c(this, null);
            return;
        }
        if (this.s == null) {
            this.s = new a();
        }
        iut0.d.c(this, this.s);
        setSystemUiVisibility(CoverVideoUploadTask.y);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public final void w(f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        int resourceId;
        this.b = new ArrayList();
        this.c = new qzm<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new v160();
        int[] iArr = R$styleable.a;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i != 0) {
                coordinatorLayout = this;
                context2 = context;
                coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
                resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    Resources resources = context2.getResources();
                    int[] intArray = resources.getIntArray(resourceId);
                    coordinatorLayout.j = intArray;
                    float f2 = resources.getDisplayMetrics().density;
                    int length = intArray.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        coordinatorLayout.j[i2] = (int) (r10[i2] * f2);
                    }
                }
                coordinatorLayout.q = obtainStyledAttributes.getDrawable(1);
                obtainStyledAttributes.recycle();
                v0();
                super.setOnHierarchyChangeListener(new e());
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (getImportantForAccessibility() != 0) {
                    setImportantForAccessibility(1);
                    return;
                }
                return;
            }
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        }
        coordinatorLayout = this;
        context2 = context;
        resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
        }
        coordinatorLayout.q = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        v0();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        if (getImportantForAccessibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    /* loaded from: classes11.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray<Parcelable> d;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.d.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.d.keyAt(i2);
                parcelableArr[i2] = this.d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public final int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public final Rect p;

        public f(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public final boolean a(int i) {
            if (i == 0) {
                return this.m;
            }
            if (i != 1) {
                return false;
            }
            return this.n;
        }

        public final void b(int i) {
            this.l = null;
            this.k = null;
            this.f = i;
        }

        public final void c(@Nullable c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.l();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.i(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.u;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = v1v.a(JwtParser.SEPARATOR_CHAR, str2, string);
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.w;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(go9.b("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.i(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }
    }
}
