package Ic;

import Jc.k;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.RootView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f5597a;

    /* renamed from: b, reason: collision with root package name */
    public final j f5598b;

    /* renamed from: c, reason: collision with root package name */
    public final D f5599c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f5600d;

    /* renamed from: e, reason: collision with root package name */
    public float f5601e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5602f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5603g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5604h;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f5605i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5606j;

    /* renamed from: k, reason: collision with root package name */
    public int f5607k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5608l;

    /* renamed from: m, reason: collision with root package name */
    public int f5609m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f5593n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final PointF f5594o = new PointF();

    @NotNull
    private static final float[] matrixTransformCoords = new float[2];

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f5595p = new Matrix();

    @NotNull
    private static final float[] tempCoords = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator f5596q = new Comparator() { // from class: Ic.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int t10;
            t10 = i.t((AbstractC1350d) obj, (AbstractC1350d) obj2);
            return t10;
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean h(AbstractC1350d abstractC1350d, AbstractC1350d abstractC1350d2) {
            return abstractC1350d == abstractC1350d2 || abstractC1350d.L0(abstractC1350d2) || abstractC1350d2.L0(abstractC1350d);
        }

        public final boolean i(int i10) {
            return i10 == 3 || i10 == 1 || i10 == 5;
        }

        public final boolean j(float f10, float f11, View view) {
            return 0.0f <= f10 && f10 <= ((float) view.getWidth()) && 0.0f <= f11 && f11 <= ((float) view.getHeight());
        }

        public final boolean k(AbstractC1350d abstractC1350d, AbstractC1350d abstractC1350d2) {
            if (!abstractC1350d.Y(abstractC1350d2) || h(abstractC1350d, abstractC1350d2)) {
                return false;
            }
            if (abstractC1350d == abstractC1350d2) {
                return true;
            }
            if (abstractC1350d.a0() || abstractC1350d.S() == 4) {
                return abstractC1350d.K0(abstractC1350d2);
            }
            return true;
        }

        public final boolean l(AbstractC1350d abstractC1350d, AbstractC1350d abstractC1350d2) {
            if (abstractC1350d != abstractC1350d2) {
                return abstractC1350d.N0(abstractC1350d2) || abstractC1350d2.M0(abstractC1350d);
            }
            return false;
        }

        public final boolean m(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && j(fArr[0], fArr[1], view);
        }

        public final void n(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = i.matrixTransformCoords;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(i.f5595p);
                i.f5595p.mapPoints(fArr);
                float f12 = fArr[0];
                scrollY = fArr[1];
                scrollX = f12;
            }
            pointF.set(scrollX, scrollY);
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.f5696a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.f5698c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.f5697b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.f5699d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i(ViewGroup wrapperView, j handlerRegistry, D viewConfigHelper, ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(wrapperView, "wrapperView");
        Intrinsics.checkNotNullParameter(handlerRegistry, "handlerRegistry");
        Intrinsics.checkNotNullParameter(viewConfigHelper, "viewConfigHelper");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f5597a = wrapperView;
        this.f5598b = handlerRegistry;
        this.f5599c = viewConfigHelper;
        this.f5600d = rootView;
        this.f5602f = new ArrayList();
        this.f5603g = new ArrayList();
        this.f5604h = new ArrayList();
        this.f5605i = new HashSet();
    }

    public static final Unit g(AbstractC1350d abstractC1350d) {
        abstractC1350d.p();
        abstractC1350d.k();
        abstractC1350d.B();
        return Unit.INSTANCE;
    }

    public static final boolean m(AbstractC1350d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f5593n.i(it.S()) && !it.a0();
    }

    public static final int t(AbstractC1350d abstractC1350d, AbstractC1350d abstractC1350d2) {
        if ((abstractC1350d.Z() && abstractC1350d2.Z()) || (abstractC1350d.a0() && abstractC1350d2.a0())) {
            return Integer.signum(abstractC1350d2.G() - abstractC1350d.G());
        }
        if (abstractC1350d.Z()) {
            return -1;
        }
        if (abstractC1350d2.Z()) {
            return 1;
        }
        if (abstractC1350d.a0()) {
            return -1;
        }
        return abstractC1350d2.a0() ? 1 : 0;
    }

    public final void A(AbstractC1350d handler, int i10, int i11) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5607k++;
        if (f5593n.i(i10)) {
            for (AbstractC1350d abstractC1350d : CollectionsKt.toList(this.f5603g)) {
                if (f5593n.l(abstractC1350d, handler) && this.f5605i.contains(Integer.valueOf(abstractC1350d.T()))) {
                    if (i10 == 5) {
                        abstractC1350d.q();
                        if (abstractC1350d.S() == 5) {
                            abstractC1350d.w(3, 2);
                        }
                        abstractC1350d.x0(false);
                    } else {
                        N(abstractC1350d);
                    }
                }
            }
            k();
        }
        if (i10 == 4) {
            N(handler);
        } else if (i11 == 4 || i11 == 5) {
            if (handler.Z()) {
                handler.w(i10, i11);
            } else if (i11 == 4 && (i10 == 3 || i10 == 1)) {
                handler.w(i10, 2);
            }
        } else if (i11 != 0 || i10 != 3) {
            handler.w(i10, i11);
        }
        this.f5607k--;
        E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r1 != 7) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(MotionEvent event) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5606j = true;
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 3) {
                j();
            } else if (actionMasked != 5) {
            }
            o(event);
            this.f5606j = false;
            if (this.f5608l && this.f5607k == 0) {
                l();
            }
            if ((actionMasked != 1 || actionMasked == 3 || actionMasked == 10) && this.f5602f.isEmpty()) {
                viewGroup = this.f5600d;
                if (viewGroup instanceof RootView) {
                    ((RootView) viewGroup).onChildEndedNativeGesture(viewGroup, event);
                }
            }
            return true;
        }
        q(event);
        o(event);
        this.f5606j = false;
        if (this.f5608l) {
            l();
        }
        if (actionMasked != 1) {
        }
        viewGroup = this.f5600d;
        if (viewGroup instanceof RootView) {
        }
        return true;
    }

    public final void C(AbstractC1350d abstractC1350d, View view) {
        if (this.f5602f.contains(abstractC1350d)) {
            return;
        }
        this.f5602f.add(abstractC1350d);
        abstractC1350d.w0(false);
        abstractC1350d.x0(false);
        abstractC1350d.v0(Integer.MAX_VALUE);
        abstractC1350d.q0(view, this);
    }

    public final boolean D(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        ArrayList a10 = this.f5598b.a(view);
        if (a10 != null) {
            synchronized (a10) {
                try {
                    Iterator it = a10.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    z10 = false;
                    while (it.hasNext()) {
                        AbstractC1350d abstractC1350d = (AbstractC1350d) it.next();
                        if (abstractC1350d.d0() && abstractC1350d.g0(view, fArr[0], fArr[1]) && !I(abstractC1350d, motionEvent)) {
                            C(abstractC1350d, view);
                            abstractC1350d.O0(i10);
                            z10 = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            z10 = false;
        }
        float width = view.getWidth();
        float f10 = fArr[0];
        if (0.0f <= f10 && f10 <= width) {
            float height = view.getHeight();
            float f11 = fArr[1];
            if (0.0f <= f11 && f11 <= height && y(view) && p(view, fArr, i10)) {
                return true;
            }
        }
        return z10;
    }

    public final void E() {
        if (this.f5606j || this.f5607k != 0) {
            this.f5608l = true;
        } else {
            l();
        }
    }

    public final void F(float f10) {
        this.f5601e = f10;
    }

    public final boolean G(AbstractC1350d abstractC1350d) {
        ArrayList<AbstractC1350d> arrayList = this.f5602f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1350d abstractC1350d2 : arrayList) {
            if (abstractC1350d.Y(abstractC1350d2) && abstractC1350d2.S() == 4 && !f5593n.h(abstractC1350d, abstractC1350d2) && abstractC1350d.c0(abstractC1350d2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H(AbstractC1350d abstractC1350d) {
        ArrayList<AbstractC1350d> arrayList = this.f5602f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1350d abstractC1350d2 : arrayList) {
            if (f5593n.l(abstractC1350d, abstractC1350d2) && abstractC1350d2.S() == 5) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(AbstractC1350d abstractC1350d, MotionEvent motionEvent) {
        return ((abstractC1350d instanceof m) || (abstractC1350d instanceof k.b) || !Jc.a.c(motionEvent)) ? false : true;
    }

    public final boolean J(View view) {
        return (view instanceof Jc.l) && !Intrinsics.areEqual(view, this.f5597a) && ((Jc.l) view).p();
    }

    public final MotionEvent K(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.areEqual(viewGroup, this.f5597a)) {
                K(viewGroup, event);
            }
            if (viewGroup != null) {
                event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f5595p;
                matrix.invert(matrix2);
                event.transform(matrix2);
            }
        }
        return event;
    }

    public final PointF L(View view, PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.areEqual(viewGroup, this.f5597a)) {
                L(viewGroup, point);
            }
            if (viewGroup != null) {
                point.x += viewGroup.getScrollX() - view.getLeft();
                point.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f5595p;
                matrix.invert(matrix2);
                float[] fArr = tempCoords;
                fArr[0] = point.x;
                fArr[1] = point.y;
                matrix2.mapPoints(fArr);
                point.x = fArr[0];
                point.y = fArr[1];
            }
        }
        return point;
    }

    public final boolean M(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        if (J(view)) {
            return false;
        }
        int i11 = b.$EnumSwitchMapping$0[this.f5599c.a(view).ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return D(view, fArr, i10, motionEvent) || f5593n.m(view, fArr);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return D(view, fArr, i10, motionEvent) || (view instanceof ViewGroup ? r((ViewGroup) view, fArr, i10, motionEvent) : false) || f5593n.m(view, fArr);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return D(view, fArr, i10, motionEvent);
            }
            return false;
        }
        boolean r10 = r((ViewGroup) view, fArr, i10, motionEvent);
        if (r10) {
            D(view, fArr, i10, motionEvent);
        }
        return r10;
    }

    public final void N(AbstractC1350d abstractC1350d) {
        if (H(abstractC1350d) || G(abstractC1350d)) {
            abstractC1350d.q();
        } else if (u(abstractC1350d)) {
            h(abstractC1350d);
        } else {
            z(abstractC1350d);
            abstractC1350d.x0(false);
        }
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList<AbstractC1350d> a10 = this.f5598b.a(view);
        if (a10 != null) {
            for (final AbstractC1350d abstractC1350d : a10) {
                if (abstractC1350d instanceof q) {
                    C(abstractC1350d, view);
                    abstractC1350d.T0(new Function0() { // from class: Ic.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit g10;
                            g10 = i.g(AbstractC1350d.this);
                            return g10;
                        }
                    });
                }
            }
        }
    }

    public final void h(AbstractC1350d abstractC1350d) {
        if (this.f5603g.contains(abstractC1350d)) {
            return;
        }
        this.f5603g.add(abstractC1350d);
        this.f5605i.add(Integer.valueOf(abstractC1350d.T()));
        abstractC1350d.x0(true);
        int i10 = this.f5609m;
        this.f5609m = i10 + 1;
        abstractC1350d.v0(i10);
    }

    public final boolean i(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f5601e;
    }

    public final void j() {
        Iterator it = CollectionsKt.toList(CollectionsKt.asReversedMutable(this.f5603g)).iterator();
        while (it.hasNext()) {
            ((AbstractC1350d) it.next()).q();
        }
        this.f5604h.clear();
        this.f5604h.addAll(this.f5602f);
        Iterator it2 = CollectionsKt.asReversedMutable(this.f5602f).iterator();
        while (it2.hasNext()) {
            ((AbstractC1350d) it2.next()).q();
        }
    }

    public final void k() {
        for (AbstractC1350d abstractC1350d : CollectionsKt.toList(this.f5603g)) {
            if (!abstractC1350d.a0()) {
                this.f5603g.remove(abstractC1350d);
                this.f5605i.remove(Integer.valueOf(abstractC1350d.T()));
            }
        }
    }

    public final void l() {
        for (AbstractC1350d abstractC1350d : CollectionsKt.asReversedMutable(this.f5602f)) {
            if (f5593n.i(abstractC1350d.S()) && !abstractC1350d.a0()) {
                abstractC1350d.r0();
                abstractC1350d.w0(false);
                abstractC1350d.x0(false);
                abstractC1350d.v0(Integer.MAX_VALUE);
            }
        }
        CollectionsKt.removeAll((List) this.f5602f, new Function1() { // from class: Ic.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean m10;
                m10 = i.m((AbstractC1350d) obj);
                return Boolean.valueOf(m10);
            }
        });
        this.f5608l = false;
    }

    public final void n(AbstractC1350d abstractC1350d, MotionEvent motionEvent) {
        if (!x(abstractC1350d.W())) {
            abstractC1350d.q();
            return;
        }
        if (abstractC1350d.S0(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            View W10 = abstractC1350d.W();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            MotionEvent K10 = K(W10, obtain);
            if (abstractC1350d.N() && abstractC1350d.S() != 0) {
                abstractC1350d.R0(K10, motionEvent);
            }
            if (!abstractC1350d.a0() || actionMasked != 2) {
                boolean z10 = abstractC1350d.S() == 0;
                abstractC1350d.X(K10, motionEvent);
                if (abstractC1350d.Z()) {
                    if (abstractC1350d.R()) {
                        abstractC1350d.H0(false);
                        abstractC1350d.t0();
                    }
                    abstractC1350d.v(K10);
                }
                if (abstractC1350d.N() && z10) {
                    abstractC1350d.R0(K10, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    abstractC1350d.P0(K10.getPointerId(K10.getActionIndex()));
                }
            }
            K10.recycle();
        }
    }

    public final void o(MotionEvent motionEvent) {
        this.f5604h.clear();
        this.f5604h.addAll(this.f5602f);
        CollectionsKt.sortWith(this.f5604h, f5596q);
        Iterator it = this.f5604h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            n((AbstractC1350d) it.next(), motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final boolean p(View view, float[] fArr, int i10) {
        boolean z10 = false;
        for (Jc.l lVar = view.getParent(); lVar != 0; lVar = lVar.getParent()) {
            if (lVar instanceof ViewGroup) {
                if ((lVar instanceof Jc.l) && lVar.p()) {
                    break;
                }
                ViewGroup viewGroup = lVar;
                ArrayList a10 = this.f5598b.a(lVar);
                if (a10 != null) {
                    synchronized (a10) {
                        try {
                            Iterator it = a10.iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                            while (it.hasNext()) {
                                AbstractC1350d abstractC1350d = (AbstractC1350d) it.next();
                                if (abstractC1350d.d0() && abstractC1350d.g0(view, fArr[0], fArr[1])) {
                                    C(abstractC1350d, viewGroup);
                                    abstractC1350d.O0(i10);
                                    z10 = true;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z10;
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = tempCoords;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        M(this.f5597a, fArr, pointerId, motionEvent);
        r(this.f5597a, fArr, pointerId, motionEvent);
    }

    public final boolean r(ViewGroup viewGroup, float[] fArr, int i10, MotionEvent motionEvent) {
        ViewGroup viewGroup2;
        if (J(viewGroup)) {
            return false;
        }
        int childCount = viewGroup.getChildCount() - 1;
        while (-1 < childCount) {
            View c10 = this.f5599c.c(viewGroup, childCount);
            if (i(c10)) {
                PointF pointF = f5594o;
                a aVar = f5593n;
                viewGroup2 = viewGroup;
                aVar.n(fArr[0], fArr[1], viewGroup2, c10, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean M10 = (!w(c10) || aVar.j(fArr[0], fArr[1], c10)) ? M(c10, fArr, i10, motionEvent) : false;
                fArr[0] = f10;
                fArr[1] = f11;
                if (M10) {
                    return true;
                }
            } else {
                viewGroup2 = viewGroup;
            }
            childCount--;
            viewGroup = viewGroup2;
        }
        return false;
    }

    public final ArrayList s(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f5598b.a(view);
    }

    public final boolean u(AbstractC1350d abstractC1350d) {
        ArrayList<AbstractC1350d> arrayList = this.f5602f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1350d abstractC1350d2 : arrayList) {
            a aVar = f5593n;
            if (!aVar.i(abstractC1350d2.S()) && aVar.l(abstractC1350d, abstractC1350d2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        ArrayList arrayList = this.f5602f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractC1350d) it.next()).S() == 4) {
                return true;
            }
        }
        return false;
    }

    public final boolean w(View view) {
        return !(view instanceof ViewGroup) || this.f5599c.b((ViewGroup) view);
    }

    public final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f5597a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f5597a) {
            parent = parent.getParent();
        }
        return parent == this.f5597a;
    }

    public final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = matrixTransformCoords;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    public final void z(AbstractC1350d abstractC1350d) {
        int S10 = abstractC1350d.S();
        abstractC1350d.x0(false);
        abstractC1350d.w0(true);
        abstractC1350d.H0(true);
        int i10 = this.f5609m;
        this.f5609m = i10 + 1;
        abstractC1350d.v0(i10);
        for (AbstractC1350d abstractC1350d2 : CollectionsKt.asReversedMutable(this.f5602f)) {
            if (f5593n.k(abstractC1350d2, abstractC1350d)) {
                abstractC1350d2.q();
            }
        }
        for (AbstractC1350d abstractC1350d3 : CollectionsKt.asReversedMutable(this.f5603g)) {
            if (f5593n.k(abstractC1350d3, abstractC1350d)) {
                abstractC1350d3.x0(false);
            }
        }
        k();
        if (S10 == 1 || S10 == 3) {
            return;
        }
        abstractC1350d.w(4, 2);
        if (S10 != 4) {
            abstractC1350d.w(5, 4);
            if (S10 != 5) {
                abstractC1350d.w(0, 5);
            }
        }
    }
}
