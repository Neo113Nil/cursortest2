package com.vk.voip.ui.menu.ui.actions;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.vk.log.L;
import com.vk.voip.ui.R$styleable;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vk.voip.ui.menu.ui.actions.a;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.asu0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.dhr0;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.gsn;
import xsna.gzs;
import xsna.h70;
import xsna.i0q0;
import xsna.iah0;
import xsna.ie90;
import xsna.izs;
import xsna.j5g;
import xsna.ku;
import xsna.mv1;
import xsna.o440;
import xsna.s0p0;
import xsna.s3q0;
import xsna.s55;
import xsna.t70;
import xsna.tmg0;
import xsna.v34;
import xsna.x9;
import xsna.yy4;

/* compiled from: PrimaryActionsView.kt */
/* loaded from: classes7.dex */
public final class PrimaryActionsView extends FrameLayout implements h70, tmg0 {
    public static final float t = cn70.a() * 32.0f;
    public static final int u = cn70.b(4);
    public static final int v = cn70.b(8);
    public static final int w = cn70.b(4);
    public final ArrayList b;
    public final LinkedHashMap c;
    public ku<? extends Object, ? extends View> d;
    public final ArrayList e;
    public final HorizontalScrollView f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final mv1 m;
    public final c n;
    public final a o;
    public final ArrayList p;
    public final com.vk.voip.ui.menu.ui.actions.a q;
    public View r;
    public io.reactivex.rxjava3.disposables.c s;

    /* compiled from: PrimaryActionsView.kt */
    public final class a extends ViewGroup {
        public a(Context context) {
            super(context, null, 0);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            setLayoutTransition(layoutTransition);
            if (PrimaryActionsView.this.k) {
                float f = PrimaryActionsView.t;
                setBackground(b.a(context));
                setWillNotDraw(false);
                setElevation(cn70.a() * 5.0f);
            }
        }

        public final int a(List<? extends View> list, boolean z) {
            List<? extends View> list2 = list;
            int i = 0;
            for (View view : list2) {
                i += z ? view.getMeasuredWidth() : view.getLayoutParams().width;
            }
            int paddingEnd = getPaddingEnd() + getPaddingStart();
            int i2 = 0;
            int i3 = 0;
            for (View view2 : list2) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    i2 += layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
                }
                if (i3 != e43.h(list)) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    i2 += layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
                }
                i3 = i4;
            }
            return PrimaryActionsView.b(PrimaryActionsView.this) ? i + paddingEnd + i2 : i + paddingEnd;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            Object obj;
            int i7 = i3 - i;
            int i8 = i4 - i2;
            PrimaryActionsView primaryActionsView = PrimaryActionsView.this;
            ArrayList arrayList = primaryActionsView.e;
            int i9 = primaryActionsView.j;
            int i10 = primaryActionsView.h;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (bwt0.K((View) next)) {
                    arrayList2.add(next);
                }
            }
            List<? extends View> O0 = j5g.O0(arrayList2);
            int a = a(O0, true);
            if (primaryActionsView.k) {
                i2 += PrimaryActionsView.u;
            }
            if (PrimaryActionsView.b(primaryActionsView)) {
                int paddingStart = getPaddingStart();
                int i11 = 0;
                for (View view : O0) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        paddingStart += layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
                    }
                    int measuredWidth = view.getMeasuredWidth() + paddingStart;
                    if (view instanceof gsn) {
                        int b = x9.b(i10, i9, 2, i2);
                        view.layout(paddingStart, b, measuredWidth, b + i9);
                    } else {
                        view.layout(paddingStart, i2, measuredWidth, i2 + i10);
                    }
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    paddingStart = (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) + measuredWidth;
                    i11 = i12;
                }
            } else {
                if (a < i7) {
                    i5 = (i7 - a) / (O0.size() + 1);
                    i6 = i5;
                } else {
                    i5 = (i7 - a) / 2;
                    i6 = 0;
                }
                int paddingStart2 = getPaddingStart() + i5;
                for (View view2 : O0) {
                    int measuredWidth2 = view2.getMeasuredWidth() + paddingStart2;
                    if (view2 instanceof gsn) {
                        int b2 = x9.b(i10, i9, 2, i2);
                        view2.layout(paddingStart2, b2, measuredWidth2, b2 + i9);
                    } else {
                        view2.layout(paddingStart2, i2, measuredWidth2, i2 + i10);
                    }
                    paddingStart2 = measuredWidth2 + i6;
                }
            }
            primaryActionsView.n.layout(0, i2, i7, i8);
            com.vk.voip.ui.menu.ui.actions.a aVar = primaryActionsView.q;
            ArrayList arrayList3 = primaryActionsView.b;
            ArrayList arrayList4 = primaryActionsView.e;
            aVar.getClass();
            int size = arrayList3.size();
            int size2 = arrayList4.size();
            Object obj2 = a.InterfaceC2066a.C2067a.a;
            if (size == size2) {
                ArrayList X0 = j5g.X0(arrayList3, arrayList4);
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = X0.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    Pair pair = (Pair) next2;
                    ku kuVar = (ku) pair.d();
                    View view3 = (View) pair.g();
                    if (kuVar.c() && bwt0.K(view3)) {
                        arrayList5.add(next2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Integer.valueOf(((View) ((Pair) it3.next()).g()).getId()));
                }
                if (arrayList6.size() > aVar.a.size()) {
                    Iterator it4 = arrayList4.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            if (((View) obj).getId() == ((Number) j5g.i0(arrayList6)).intValue()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    View view4 = (View) obj;
                    if (view4 != null) {
                        obj2 = new a.InterfaceC2066a.b(view4);
                    }
                }
                aVar.a = arrayList6;
            }
            if (obj2 instanceof a.InterfaceC2066a.b) {
                primaryActionsView.post(new yy4(8, obj2, primaryActionsView));
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            PrimaryActionsView primaryActionsView = PrimaryActionsView.this;
            ArrayList arrayList = primaryActionsView.e;
            int i3 = primaryActionsView.h;
            int i4 = primaryActionsView.l;
            boolean z = primaryActionsView.k;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (bwt0.K((View) next)) {
                    arrayList2.add(next);
                }
            }
            List<? extends View> O0 = j5g.O0(arrayList2);
            int min = z ? Math.min(a(O0, false), primaryActionsView.getMeasuredWidth()) : Math.max(a(O0, false), PrimaryActionsView.b(primaryActionsView) ? 0 : size);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(min, size);
            } else if (mode == 0) {
                size = min;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int i5 = (z ? PrimaryActionsView.u * 2 : i4) + i3;
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i5, size2);
            } else if (mode2 == 0) {
                size2 = i5;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size > min || !z) ? i5 - i4 : Math.max((size - (getPaddingEnd() + getPaddingStart())) / Math.max(O0.size(), 1), cn70.b(28)), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824);
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(primaryActionsView.i, 1073741824);
            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(primaryActionsView.j, 1073741824);
            for (View view : O0) {
                if (view instanceof gsn) {
                    view.measure(makeMeasureSpec3, makeMeasureSpec4);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
            }
            primaryActionsView.n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            setMeasuredDimension(size, size2);
        }
    }

    /* compiled from: PrimaryActionsView.kt */
    public static final class b {
        public static final ShapeDrawable a(Context context) {
            float f = PrimaryActionsView.t;
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = PrimaryActionsView.t;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            Paint paint = shapeDrawable.getPaint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(dhr0.Y(R.attr.vk_ui_background_modal, context));
            return shapeDrawable;
        }
    }

    /* compiled from: PrimaryActionsView.kt */
    public final class c extends FrameLayout {
        public final mv1 b;

        public c(Context context) {
            super(context, null, 0);
            this.b = new mv1(this, null, 6);
            if (PrimaryActionsView.this.k) {
                float f = PrimaryActionsView.t;
                setBackground(b.a(context));
                int i = PrimaryActionsView.w;
                int i2 = PrimaryActionsView.u;
                setPadding(i, i2, i, i2);
                setWillNotDraw(false);
                setElevation(cn70.a() * 5.0f);
            }
            bwt0.p0(this, false);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            mv1 mv1Var = this.b;
            AnimatorSet animatorSet = mv1Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = mv1Var.d;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
    }

    /* compiled from: PrimaryActionsView.kt */
    public static final class d implements izs<?, s3q0> {
        public final /* synthetic */ ku<? extends t70.c, ? extends View> b;
        public final /* synthetic */ PrimaryActionsView c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Ref$BooleanRef e;

        public d(ku kuVar, PrimaryActionsView primaryActionsView, ArrayList arrayList, Ref$BooleanRef ref$BooleanRef) {
            this.b = kuVar;
            this.c = primaryActionsView;
            this.d = arrayList;
            this.e = ref$BooleanRef;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            q qVar = (q) obj;
            ku<? extends t70.c, ? extends View> kuVar = this.b;
            if (kuVar != null) {
                LinkedHashMap linkedHashMap = this.c.c;
                qVar.getClass();
                linkedHashMap.put(kuVar, new y(qVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a));
                this.d.add(kuVar);
                this.e.element = true;
            }
            return s3q0.a;
        }
    }

    /* compiled from: PrimaryActionsView.kt */
    public static final class e implements izs<?, s3q0> {
        public final /* synthetic */ ku<? extends Object, ? extends View> c;
        public final /* synthetic */ Ref$BooleanRef d;

        public e(ku<? extends Object, ? extends View> kuVar, Ref$BooleanRef ref$BooleanRef) {
            this.c = kuVar;
            this.d = ref$BooleanRef;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            q qVar = (q) obj;
            LinkedHashMap linkedHashMap = PrimaryActionsView.this.c;
            qVar.getClass();
            linkedHashMap.put(this.c, new y(qVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a));
            this.d.element = true;
            return s3q0.a;
        }
    }

    public PrimaryActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        this.c = new LinkedHashMap();
        this.e = new ArrayList();
        this.i = Math.max(cn70.b(1), 2);
        this.j = cn70.b(32);
        this.p = new ArrayList();
        com.vk.voip.ui.menu.ui.actions.a aVar = new com.vk.voip.ui.menu.ui.actions.a();
        aVar.a = EmptyList.b;
        this.q = aVar;
        this.s = EmptyDisposable.INSTANCE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        try {
            this.g = obtainStyledAttributes.getDimensionPixelSize(1, cn70.b(56));
            this.h = obtainStyledAttributes.getDimensionPixelSize(0, cn70.b(56));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, cn70.b(0));
            this.l = dimensionPixelSize;
            boolean z = obtainStyledAttributes.getBoolean(3, false);
            this.k = z;
            obtainStyledAttributes.recycle();
            a aVar2 = new a(context);
            this.o = aVar2;
            c cVar = new c(context);
            this.n = cVar;
            HashSet hashSet = iah0.a;
            if (fnj.b(context) || z) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? -2 : -1, -2);
                if (z) {
                    int i = v;
                    f4m.l(i, i, aVar2);
                    layoutParams.gravity = 1;
                    layoutParams.setMarginStart(cn70.b(12));
                    layoutParams.setMarginEnd(cn70.b(12));
                    layoutParams.bottomMargin = cn70.b(12) + dimensionPixelSize;
                } else {
                    layoutParams.setMarginStart(cn70.b(16));
                    layoutParams.setMarginEnd(cn70.b(16));
                    layoutParams.bottomMargin = dimensionPixelSize;
                }
                addView(aVar2, layoutParams);
            } else {
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                this.f = horizontalScrollView;
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                f4m.l(cn70.b(16), cn70.b(16), aVar2);
                horizontalScrollView.addView(aVar2, layoutParams2);
                addView(horizontalScrollView, new FrameLayout.LayoutParams(-1, -2));
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            if (z) {
                layoutParams3.setMargins(cn70.b(12), 0, cn70.b(12), cn70.b(12) + dimensionPixelSize);
            } else {
                layoutParams3.setMargins(cn70.b(16), 0, cn70.b(16), dimensionPixelSize);
            }
            addView(cVar, layoutParams3);
            this.m = new mv1(aVar2, new AccelerateInterpolator(), 4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final boolean b(PrimaryActionsView primaryActionsView) {
        int i;
        if (!primaryActionsView.k) {
            ArrayList arrayList = primaryActionsView.e;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                i = 0;
                while (it.hasNext()) {
                    View view = (View) it.next();
                    if (bwt0.K(view) && !(view instanceof gsn) && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (i > 5) {
                Context context = primaryActionsView.getContext();
                HashSet hashSet = iah0.a;
                if (!fnj.b(context)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void setActionViewLayoutParams(View view) {
        boolean z = view instanceof gsn;
        int i = this.l;
        if (z) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.i, this.j + i);
            layoutParams.setMarginStart(cn70.b(4));
            layoutParams.setMarginEnd(cn70.b(4));
            layoutParams.gravity = 16;
            ((gsn) view).setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.g, this.h + i);
        if (!this.k) {
            marginLayoutParams.setMarginStart(cn70.b(4));
            marginLayoutParams.setMarginEnd(cn70.b(4));
        }
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // xsna.h70
    public final void a(final t70 t70Var, final boolean z) {
        if (i0q0.b()) {
            c(t70Var, z);
        } else {
            i0q0.f(new gzs() { // from class: xsna.q6d0
                @Override // xsna.gzs
                public final Object invoke() {
                    float f = PrimaryActionsView.t;
                    PrimaryActionsView.this.c(t70Var, z);
                    return s3q0.a;
                }
            });
        }
    }

    public final void c(t70 t70Var, boolean z) {
        a aVar;
        LinkedHashMap linkedHashMap;
        this.m.a(t70Var.c);
        if (z) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        s0p0 s0p0Var = t70Var.b;
        if (s0p0Var != null) {
            arrayList.add(s0p0Var);
        }
        arrayList.addAll(t70Var.a());
        List<ku<? extends Object, ? extends View>> b2 = t70Var.b();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ArrayList arrayList2 = this.b;
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = this.o;
            linkedHashMap = this.c;
            if (!hasNext) {
                break;
            }
            ku kuVar = (ku) it.next();
            if (!arrayList.contains(kuVar)) {
                kuVar.b(aVar);
                linkedHashMap.remove(kuVar);
                ref$BooleanRef.element = true;
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        ArrayList arrayList4 = this.p;
        arrayList4.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ku kuVar2 = (ku) it2.next();
            View a2 = kuVar2.a(aVar, new e(kuVar2, ref$BooleanRef), false);
            setActionViewLayoutParams(a2);
            if (b2.contains(kuVar2)) {
                arrayList4.add(a2);
            }
            arrayList3.add(a2);
        }
        ku<? extends t70.c, ? extends View> c2 = t70Var.c();
        if (!epx.f(c2, this.d)) {
            ku<? extends Object, ? extends View> kuVar3 = this.d;
            c cVar = this.n;
            if (kuVar3 != null) {
                kuVar3.b(cVar);
                linkedHashMap.remove(kuVar3);
                ref$BooleanRef.element = true;
            }
            this.d = c2;
            this.r = c2 != null ? c2.a(cVar, new d(c2, this, arrayList, ref$BooleanRef), true) : null;
        }
        if (ref$BooleanRef.element) {
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ku<? extends Object, ? extends View> kuVar4 = this.d;
            if (kuVar4 != null) {
                arrayList6.add(kuVar4);
            }
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                t tVar = (q) linkedHashMap.get((ku) it3.next());
                if (tVar == null) {
                    tVar = l1.b;
                }
                arrayList5.add(tVar);
            }
            this.s.dispose();
            this.s = io.reactivex.rxjava3.kotlin.c.f(2, new y(q.n(arrayList5, new v34(new ie90(arrayList6, 8), 26)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).v0(150L, TimeUnit.MILLISECONDS).a0(asu0.a.d()), null, new s55(L.a, 14), new o440(this, 17));
        }
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        List<View> animatedViewsToRotate;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((View) next) instanceof gsn)) {
                arrayList.add(next);
            }
        }
        List O0 = j5g.O0(arrayList);
        KeyEvent.Callback callback = this.r;
        tmg0 tmg0Var = callback instanceof tmg0 ? (tmg0) callback : null;
        return j5g.u0((tmg0Var == null || (animatedViewsToRotate = tmg0Var.getAnimatedViewsToRotate()) == null) ? EmptyList.b : animatedViewsToRotate, O0);
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        List<View> viewsToRotate;
        KeyEvent.Callback callback = this.r;
        tmg0 tmg0Var = callback instanceof tmg0 ? (tmg0) callback : null;
        return (tmg0Var == null || (viewsToRotate = tmg0Var.getViewsToRotate()) == null) ? EmptyList.b : viewsToRotate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.s.dispose();
        this.c.clear();
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ku) it.next()).b(this.o);
        }
        ku<? extends Object, ? extends View> kuVar = this.d;
        if (kuVar != null) {
            kuVar.b(this.n);
        }
        this.r = null;
        this.e.clear();
        arrayList.clear();
        super.onDetachedFromWindow();
        mv1 mv1Var = this.m;
        AnimatorSet animatorSet = mv1Var.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = mv1Var.d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }
}
