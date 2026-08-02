package com.google.android.material.navigation;

import V4.C4072a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.core.view.Y;
import j7.C7292a;
import java.util.HashSet;
import k7.C7597a;
import s7.C9617l;
import t7.C9774a;
import x2.h;
import y2.q;
import y7.C10856g;
import y7.k;

/* loaded from: classes9.dex */
public abstract class d extends ViewGroup implements n {

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f58471B = {R.attr.state_checked};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f58472C = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    private g f58473A;

    /* renamed from: a, reason: collision with root package name */
    private final C4072a f58474a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final View.OnClickListener f58475b;

    /* renamed from: c, reason: collision with root package name */
    private final h f58476c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final SparseArray<View.OnTouchListener> f58477d;

    /* renamed from: e, reason: collision with root package name */
    private int f58478e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.material.navigation.a[] f58479f;

    /* renamed from: g, reason: collision with root package name */
    private int f58480g;

    /* renamed from: h, reason: collision with root package name */
    private int f58481h;

    /* renamed from: i, reason: collision with root package name */
    private ColorStateList f58482i;

    /* renamed from: j, reason: collision with root package name */
    private int f58483j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f58484k;

    /* renamed from: l, reason: collision with root package name */
    private final ColorStateList f58485l;

    /* renamed from: m, reason: collision with root package name */
    private int f58486m;

    /* renamed from: n, reason: collision with root package name */
    private int f58487n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f58488o;

    /* renamed from: p, reason: collision with root package name */
    private int f58489p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private final SparseArray<C7597a> f58490q;

    /* renamed from: r, reason: collision with root package name */
    private int f58491r;

    /* renamed from: s, reason: collision with root package name */
    private int f58492s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f58493t;

    /* renamed from: u, reason: collision with root package name */
    private int f58494u;

    /* renamed from: v, reason: collision with root package name */
    private int f58495v;

    /* renamed from: w, reason: collision with root package name */
    private int f58496w;

    /* renamed from: x, reason: collision with root package name */
    private k f58497x;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f58498y;

    /* renamed from: z, reason: collision with root package name */
    private e f58499z;

    final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.bottomnavigation.b f58500a;

        a(com.google.android.material.bottomnavigation.b bVar) {
            this.f58500a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i g10 = ((com.google.android.material.navigation.a) view).g();
            com.google.android.material.bottomnavigation.b bVar = this.f58500a;
            if (((d) bVar).f58473A.z(g10, ((d) bVar).f58499z, 0)) {
                return;
            }
            g10.setChecked(true);
        }
    }

    public d(@NonNull Context context) {
        super(context);
        this.f58476c = new h(5);
        this.f58477d = new SparseArray<>(5);
        this.f58480g = 0;
        this.f58481h = 0;
        this.f58490q = new SparseArray<>(5);
        this.f58491r = -1;
        this.f58492s = -1;
        this.f58485l = e();
        if (isInEditMode()) {
            this.f58474a = null;
        } else {
            C4072a c4072a = new C4072a();
            this.f58474a = c4072a;
            c4072a.f(0);
            Context context2 = getContext();
            int integer = getResources().getInteger(ru.ozon.app.android.R.integer.material_motion_duration_long_1);
            TypedValue a11 = v7.b.a(ru.ozon.app.android.R.attr.motionDurationLong1, context2);
            if (a11 != null && a11.type == 16) {
                integer = a11.data;
            }
            c4072a.d(integer);
            c4072a.setInterpolator(C9774a.c(getContext(), C7292a.f69464b));
            c4072a.a(new C9617l());
        }
        this.f58475b = new a((com.google.android.material.bottomnavigation.b) this);
        int i11 = Y.f42258g;
        setImportantForAccessibility(1);
    }

    private static void Y(int i11) {
        if (i11 != -1) {
            return;
        }
        throw new IllegalArgumentException(i11 + " is not a valid view id");
    }

    private C10856g f() {
        if (this.f58497x == null || this.f58498y == null) {
            return null;
        }
        C10856g c10856g = new C10856g(this.f58497x);
        c10856g.B(this.f58498y);
        return c10856g;
    }

    public final int A() {
        return this.f58480g;
    }

    protected final int B() {
        return this.f58481h;
    }

    final void C(int i11) {
        com.google.android.material.navigation.a aVar;
        Y(i11);
        SparseArray<C7597a> sparseArray = this.f58490q;
        C7597a c7597a = sparseArray.get(i11);
        Y(i11);
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            int length = aVarArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                aVar = aVarArr[i12];
                if (aVar.getId() == i11) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            aVar.k();
        }
        if (c7597a != null) {
            sparseArray.remove(i11);
        }
    }

    final void D(SparseArray<C7597a> sparseArray) {
        SparseArray<C7597a> sparseArray2;
        int i11 = 0;
        while (true) {
            int size = sparseArray.size();
            sparseArray2 = this.f58490q;
            if (i11 >= size) {
                break;
            }
            int keyAt = sparseArray.keyAt(i11);
            if (sparseArray2.indexOfKey(keyAt) < 0) {
                sparseArray2.append(keyAt, sparseArray.get(keyAt));
            }
            i11++;
        }
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.r(sparseArray2.get(aVar.getId()));
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f58482i = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.u(colorStateList);
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        this.f58498y = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.l(f());
            }
        }
    }

    public final void G(boolean z11) {
        this.f58493t = z11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.m(z11);
            }
        }
    }

    public final void H(int i11) {
        this.f58495v = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.n(i11);
            }
        }
    }

    public final void I(int i11) {
        this.f58496w = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.o(i11);
            }
        }
    }

    public final void J(k kVar) {
        this.f58497x = kVar;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.l(f());
            }
        }
    }

    public final void K(int i11) {
        this.f58494u = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.q(i11);
            }
        }
    }

    public final void L(Drawable drawable) {
        this.f58488o = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.v(drawable);
            }
        }
    }

    public final void M(int i11) {
        this.f58489p = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.v(i11 == 0 ? null : androidx.core.content.a.getDrawable(aVar.getContext(), i11));
            }
        }
    }

    public final void N(int i11) {
        this.f58483j = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.t(i11);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void O(int i11, View.OnTouchListener onTouchListener) {
        SparseArray<View.OnTouchListener> sparseArray = this.f58477d;
        if (onTouchListener == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, onTouchListener);
        }
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.g().getItemId() == i11) {
                    aVar.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public final void P(int i11) {
        this.f58492s = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.w(i11);
            }
        }
    }

    public final void Q(int i11) {
        this.f58491r = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.x(i11);
            }
        }
    }

    public final void R(int i11) {
        this.f58487n = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.A(i11);
                ColorStateList colorStateList = this.f58484k;
                if (colorStateList != null) {
                    aVar.D(colorStateList);
                }
            }
        }
    }

    public final void S(int i11) {
        this.f58486m = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.B(i11);
                ColorStateList colorStateList = this.f58484k;
                if (colorStateList != null) {
                    aVar.D(colorStateList);
                }
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        this.f58484k = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.D(colorStateList);
            }
        }
    }

    public final void U(int i11) {
        this.f58478e = i11;
    }

    public final void V(@NonNull e eVar) {
        this.f58499z = eVar;
    }

    final void W(int i11) {
        int size = this.f58473A.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.f58473A.getItem(i12);
            if (i11 == item.getItemId()) {
                this.f58480g = i11;
                this.f58481h = i12;
                item.setChecked(true);
                return;
            }
        }
    }

    public final void X() {
        C4072a c4072a;
        g gVar = this.f58473A;
        if (gVar == null || this.f58479f == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.f58479f.length) {
            d();
            return;
        }
        int i11 = this.f58480g;
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.f58473A.getItem(i12);
            if (item.isChecked()) {
                this.f58480g = item.getItemId();
                this.f58481h = i12;
            }
        }
        if (i11 != this.f58480g && (c4072a = this.f58474a) != null) {
            V4.n.a(this, c4072a);
        }
        int i13 = this.f58478e;
        boolean z11 = i13 != -1 ? i13 == 0 : this.f58473A.r().size() > 3;
        for (int i14 = 0; i14 < size; i14++) {
            this.f58499z.m(true);
            this.f58479f[i14].y(this.f58478e);
            this.f58479f[i14].z(z11);
            this.f58479f[i14].e((i) this.f58473A.getItem(i14));
            this.f58499z.m(false);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void a(@NonNull g gVar) {
        this.f58473A = gVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void d() {
        SparseArray<C7597a> sparseArray;
        C7597a c7597a;
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        h hVar = this.f58476c;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    hVar.b(aVar);
                    aVar.i();
                }
            }
        }
        if (this.f58473A.size() == 0) {
            this.f58480g = 0;
            this.f58481h = 0;
            this.f58479f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.f58473A.size(); i11++) {
            hashSet.add(Integer.valueOf(this.f58473A.getItem(i11).getItemId()));
        }
        int i12 = 0;
        while (true) {
            sparseArray = this.f58490q;
            if (i12 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i12);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i12++;
        }
        this.f58479f = new com.google.android.material.navigation.a[this.f58473A.size()];
        int i13 = this.f58478e;
        boolean z11 = i13 != -1 ? i13 == 0 : this.f58473A.r().size() > 3;
        for (int i14 = 0; i14 < this.f58473A.size(); i14++) {
            this.f58499z.m(true);
            this.f58473A.getItem(i14).setCheckable(true);
            this.f58499z.m(false);
            com.google.android.material.navigation.a aVar2 = (com.google.android.material.navigation.a) hVar.a();
            if (aVar2 == null) {
                aVar2 = new com.google.android.material.bottomnavigation.a(getContext());
            }
            this.f58479f[i14] = aVar2;
            aVar2.u(this.f58482i);
            aVar2.t(this.f58483j);
            aVar2.D(this.f58485l);
            aVar2.B(this.f58486m);
            aVar2.A(this.f58487n);
            aVar2.D(this.f58484k);
            int i15 = this.f58491r;
            if (i15 != -1) {
                aVar2.x(i15);
            }
            int i16 = this.f58492s;
            if (i16 != -1) {
                aVar2.w(i16);
            }
            aVar2.q(this.f58494u);
            aVar2.n(this.f58495v);
            aVar2.o(this.f58496w);
            aVar2.l(f());
            aVar2.m(this.f58493t);
            Drawable drawable = this.f58488o;
            if (drawable != null) {
                aVar2.v(drawable);
            } else {
                int i17 = this.f58489p;
                aVar2.v(i17 == 0 ? null : androidx.core.content.a.getDrawable(aVar2.getContext(), i17));
            }
            aVar2.z(z11);
            aVar2.y(this.f58478e);
            i iVar = (i) this.f58473A.getItem(i14);
            aVar2.e(iVar);
            int itemId = iVar.getItemId();
            aVar2.setOnTouchListener(this.f58477d.get(itemId));
            aVar2.setOnClickListener(this.f58475b);
            int i18 = this.f58480g;
            if (i18 != 0 && itemId == i18) {
                this.f58481h = i14;
            }
            int id2 = aVar2.getId();
            if (id2 != -1 && (c7597a = sparseArray.get(id2)) != null) {
                aVar2.r(c7597a);
            }
            addView(aVar2);
        }
        int min = Math.min(this.f58473A.size() - 1, this.f58481h);
        this.f58481h = min;
        this.f58473A.getItem(min).setChecked(true);
    }

    public final ColorStateList e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = androidx.core.content.a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(ru.ozon.app.android.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f58472C;
        return new ColorStateList(new int[][]{iArr, f58471B, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final C7597a g(int i11) {
        return this.f58490q.get(i11);
    }

    final SparseArray<C7597a> h() {
        return this.f58490q;
    }

    public final ColorStateList i() {
        return this.f58482i;
    }

    public final ColorStateList j() {
        return this.f58498y;
    }

    public final boolean k() {
        return this.f58493t;
    }

    public final int l() {
        return this.f58495v;
    }

    public final int m() {
        return this.f58496w;
    }

    public final k n() {
        return this.f58497x;
    }

    public final int o() {
        return this.f58494u;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q.A0(accessibilityNodeInfo).M(q.e.a(1, this.f58473A.r().size(), 1, false));
    }

    public final Drawable p() {
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f58488o : aVarArr[0].getBackground();
    }

    @Deprecated
    public final int q() {
        return this.f58489p;
    }

    public final int r() {
        return this.f58483j;
    }

    public final int s() {
        return this.f58492s;
    }

    public final int t() {
        return this.f58491r;
    }

    public final int u() {
        return this.f58487n;
    }

    public final int v() {
        return this.f58486m;
    }

    public final ColorStateList w() {
        return this.f58484k;
    }

    public final int x() {
        return this.f58478e;
    }

    protected final g y() {
        return this.f58473A;
    }

    final C7597a z(int i11) {
        com.google.android.material.navigation.a aVar;
        Y(i11);
        SparseArray<C7597a> sparseArray = this.f58490q;
        C7597a c7597a = sparseArray.get(i11);
        if (c7597a == null) {
            c7597a = C7597a.b(getContext());
            sparseArray.put(i11, c7597a);
        }
        Y(i11);
        com.google.android.material.navigation.a[] aVarArr = this.f58479f;
        if (aVarArr != null) {
            int length = aVarArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                aVar = aVarArr[i12];
                if (aVar.getId() == i11) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            aVar.r(c7597a);
        }
        return c7597a;
    }
}
