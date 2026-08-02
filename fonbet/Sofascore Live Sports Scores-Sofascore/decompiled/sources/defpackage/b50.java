package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.a;
import com.sofascore.results.R;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b50 extends ViewGroup implements r9d, qe3, syd, kpd {
    public final h9d a;
    public final View b;
    public final ryd c;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public xtc h;
    public Function1 i;
    public kx4 j;
    public Function1 k;
    public u6b l;
    public qqg m;
    public final int[] n;
    public long o;
    public x9l p;
    public Function1 q;
    public final a50 r;
    public final a50 s;
    public Function1 t;
    public final int[] u;
    public int v;
    public int w;
    public final uif x;
    public boolean y;
    public final wma z;

    public b50(Context context, a aVar, int i, h9d h9dVar, View view, ryd rydVar) {
        super(context);
        this.a = h9dVar;
        this.b = view;
        this.c = rydVar;
        x0d x0dVar = qal.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, aVar);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        rsk rskVar = (rsk) this;
        t40 t40Var = new t40(rskVar, i2);
        WeakHashMap weakHashMap = bsk.a;
        d9l.a(this, t40Var);
        srk.c(this, this);
        this.d = mz.v;
        this.f = mz.u;
        this.g = mz.t;
        utc utcVar = utc.a;
        this.h = utcVar;
        this.j = yqo.c();
        int i3 = 2;
        this.n = new int[2];
        this.o = 0L;
        int i4 = 1;
        this.r = new a50(rskVar, i4);
        this.s = new a50(rskVar, i2);
        this.u = new int[2];
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = new uif((byte) 0, 9);
        wma wmaVar = new wma(3);
        wmaVar.o = rskVar;
        xtc a = o3h.a(lz.J(utcVar, xw3.a, h9dVar), true, ry.u);
        tze tzeVar = new tze();
        tzeVar.a = new v40(rskVar, i3);
        oi oiVar = new oi();
        oi oiVar2 = tzeVar.b;
        if (oiVar2 != null) {
            oiVar2.b = null;
        }
        tzeVar.b = oiVar;
        oiVar.b = tzeVar;
        setOnRequestDisallowInterceptTouchEvent$ui(oiVar);
        xtc z = un0.A(td4.X(a.z(tzeVar), new x40(rskVar, wmaVar, rskVar)), new u40(rskVar, wmaVar, i3)).z(new o32(new v40(rskVar, i4)));
        wmaVar.e0(this.h.z(z));
        this.i = new i20(5, wmaVar, z);
        wmaVar.a0(this.j);
        this.k = new oo(wmaVar, 5);
        wmaVar.M = new u40(rskVar, wmaVar, i2);
        wmaVar.N = new v40(rskVar, i2);
        wmaVar.d0(new w40(rskVar, wmaVar));
        this.z = wmaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uyd getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            r3a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((xy) this.c).getSnapshotObserver();
    }

    public static u4a k(u4a u4aVar, int i, int i2, int i3, int i4) {
        int i5 = u4aVar.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = u4aVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = u4aVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = u4aVar.d - i4;
        return u4a.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int m(int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(llf.c(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // defpackage.kpd
    public final x9l L(View view, x9l x9lVar) {
        this.p = new x9l(x9lVar);
        return l(x9lVar);
    }

    @Override // defpackage.qe3
    public final void a() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.q9d
    public final void b(int i, View view) {
        uif uifVar = this.x;
        if (i == 1) {
            uifVar.c = 0;
        } else {
            uifVar.b = 0;
        }
    }

    @Override // defpackage.q9d
    public final void c(View view, View view2, int i, int i2) {
        uif uifVar = this.x;
        if (i2 == 1) {
            uifVar.c = i;
        } else {
            uifVar.b = i;
        }
    }

    @Override // defpackage.q9d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (this.b.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            m9d m9dVar = this.a.a;
            m9d l1 = m9dVar != null ? m9dVar.l1() : null;
            long P = l1 != null ? l1.P(i4, floatToRawIntBits) : 0L;
            iArr[0] = jaa.t(Float.intBitsToFloat((int) (P >> 32)));
            iArr[1] = jaa.t(Float.intBitsToFloat((int) (P & 4294967295L)));
        }
    }

    @Override // defpackage.qe3
    public final void e() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // defpackage.qe3
    public final void f() {
        this.g.invoke();
    }

    @Override // defpackage.r9d
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            m9d m9dVar = this.a.a;
            m9d l1 = m9dVar != null ? m9dVar.l1() : null;
            long b0 = l1 != null ? l1.b0(i6, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = jaa.t(Float.intBitsToFloat((int) (b0 >> 32)));
            iArr[1] = jaa.t(Float.intBitsToFloat((int) (b0 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.u;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final kx4 getDensity() {
        return this.j;
    }

    @Nullable
    public final View getInteropView() {
        return this.b;
    }

    @NotNull
    public final wma getLayoutNode() {
        return this.z;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final u6b getLifecycleOwner() {
        return this.l;
    }

    @NotNull
    public final xtc getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        uif uifVar = this.x;
        return uifVar.c | uifVar.b;
    }

    @Nullable
    public final Function1<kx4, Unit> getOnDensityChanged$ui() {
        return this.k;
    }

    @Nullable
    public final Function1<xtc, Unit> getOnModifierChanged$ui() {
        return this.i;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.t;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.g;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.f;
    }

    @Nullable
    public final qqg getSavedStateRegistryOwner() {
        return this.m;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.d;
    }

    @NotNull
    public final View getView() {
        return this.b;
    }

    @Override // defpackage.q9d
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            m9d m9dVar = this.a.a;
            m9d l1 = m9dVar != null ? m9dVar.l1() : null;
            if (l1 != null) {
                l1.b0(i6, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.q9d
    public final boolean i(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.y) {
            this.z.C();
            return null;
        }
        this.b.postOnAnimation(new iy(3, this.s));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final x9l l(x9l x9lVar) {
        u9l u9lVar = x9lVar.a;
        u4a i = u9lVar.i(-1);
        u4a u4aVar = u4a.e;
        if (!i.equals(u4aVar) || !u9lVar.j(-9).equals(u4aVar) || u9lVar.h() != null) {
            z3a z3aVar = (z3a) this.z.F.d;
            if (z3aVar.S.n) {
                long L = s6a.L(z3aVar.P(0L));
                int i2 = (int) (L >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (L & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long e = o6a.y(z3aVar).e();
                int i4 = (int) (e >> 32);
                int i5 = (int) (e & 4294967295L);
                long j = z3aVar.c;
                long L2 = s6a.L(z3aVar.P((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i6 = i4 - ((int) (L2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (4294967295L & L2));
                int i8 = i7 >= 0 ? i7 : 0;
                if (i2 != 0 || i3 != 0 || i6 != 0 || i8 != 0) {
                    return x9lVar.a.r(i2, i3, i6, i8);
                }
            }
        }
        return x9lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.y) {
            this.z.C();
        } else {
            this.b.postOnAnimation(new iy(3, this.s));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.v = i;
        this.w = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        xw3.L(this.a.c(), null, null, new y40(z, this, t6a.i(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        xw3.L(this.a.c(), null, null, new z40(this, t6a.i(f * (-1.0f), f2 * (-1.0f)), (rq3) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.q;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? wba.O(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.t;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(@NotNull kx4 kx4Var) {
        if (kx4Var != this.j) {
            this.j = kx4Var;
            Function1 function1 = this.k;
            if (function1 != null) {
                function1.invoke(kx4Var);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable u6b u6bVar) {
        if (u6bVar != this.l) {
            this.l = u6bVar;
            setTag(R.id.view_tree_lifecycle_owner, u6bVar);
        }
    }

    public final void setModifier(@NotNull xtc xtcVar) {
        if (xtcVar != this.h) {
            this.h = xtcVar;
            Function1 function1 = this.i;
            if (function1 != null) {
                function1.invoke(xtcVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(@Nullable Function1<? super kx4, Unit> function1) {
        this.k = function1;
    }

    public final void setOnModifierChanged$ui(@Nullable Function1<? super xtc, Unit> function1) {
        this.i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(@Nullable Function1<? super Boolean, Unit> function1) {
        this.t = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.g = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.f = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable qqg qqgVar) {
        if (qqgVar != this.m) {
            this.m = qqgVar;
            setTag(R.id.view_tree_saved_state_registry_owner, qqgVar);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.d = function0;
        this.e = true;
        this.r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.syd
    public final boolean u0() {
        return isAttachedToWindow();
    }
}
