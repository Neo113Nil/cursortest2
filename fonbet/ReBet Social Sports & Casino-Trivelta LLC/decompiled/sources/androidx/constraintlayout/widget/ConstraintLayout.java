package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.k;
import androidx.constraintlayout.core.widgets.l;
import com.plaid.internal.EnumC3631g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: y, reason: collision with root package name */
    public static h f18097y;

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f18098a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18099b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.f f18100c;

    /* renamed from: d, reason: collision with root package name */
    public int f18101d;

    /* renamed from: e, reason: collision with root package name */
    public int f18102e;

    /* renamed from: f, reason: collision with root package name */
    public int f18103f;

    /* renamed from: g, reason: collision with root package name */
    public int f18104g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18105h;

    /* renamed from: i, reason: collision with root package name */
    public int f18106i;

    /* renamed from: j, reason: collision with root package name */
    public d f18107j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f18108k;

    /* renamed from: l, reason: collision with root package name */
    public int f18109l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f18110m;

    /* renamed from: n, reason: collision with root package name */
    public int f18111n;

    /* renamed from: o, reason: collision with root package name */
    public int f18112o;

    /* renamed from: p, reason: collision with root package name */
    public int f18113p;

    /* renamed from: q, reason: collision with root package name */
    public int f18114q;

    /* renamed from: r, reason: collision with root package name */
    public int f18115r;

    /* renamed from: s, reason: collision with root package name */
    public int f18116s;

    /* renamed from: t, reason: collision with root package name */
    public SparseArray f18117t;

    /* renamed from: u, reason: collision with root package name */
    public c f18118u;

    /* renamed from: v, reason: collision with root package name */
    public int f18119v;

    /* renamed from: w, reason: collision with root package name */
    public int f18120w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f18121x;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[e.b.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements b.InterfaceC0352b {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintLayout f18198a;

        /* renamed from: b, reason: collision with root package name */
        public int f18199b;

        /* renamed from: c, reason: collision with root package name */
        public int f18200c;

        /* renamed from: d, reason: collision with root package name */
        public int f18201d;

        /* renamed from: e, reason: collision with root package name */
        public int f18202e;

        /* renamed from: f, reason: collision with root package name */
        public int f18203f;

        /* renamed from: g, reason: collision with root package name */
        public int f18204g;

        public c(ConstraintLayout constraintLayout) {
            this.f18198a = constraintLayout;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0352b
        public final void a() {
            int childCount = this.f18198a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f18198a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.f18198a);
                }
            }
            int size = this.f18198a.f18099b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f18198a.f18099b.get(i11)).l(this.f18198a);
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0352b
        public final void b(androidx.constraintlayout.core.widgets.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int max2;
            int i10;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f17801e = 0;
                aVar.f17802f = 0;
                aVar.f17803g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.a(ConstraintLayout.this);
            e.b bVar = aVar.f17797a;
            e.b bVar2 = aVar.f17798b;
            int i11 = aVar.f17799c;
            int i12 = aVar.f17800d;
            int i13 = this.f18199b + this.f18200c;
            int i14 = this.f18201d;
            View view = (View) eVar.s();
            int[] iArr = a.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f18203f, i14, -2);
            } else if (i15 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f18203f, i14 + eVar.B(), -1);
            } else if (i15 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f18203f, i14, -2);
                boolean z10 = eVar.f17987u == 1;
                int i16 = aVar.f17806j;
                if (i16 == b.a.f17795l || i16 == b.a.f17796m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f17806j == b.a.f17796m || !z10 || ((z10 && z11) || (view instanceof Placeholder) || eVar.n0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f18204g, i13, -2);
            } else if (i17 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f18204g, i13 + eVar.U(), -1);
            } else if (i17 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f18204g, i13, -2);
                boolean z12 = eVar.f17989v == 1;
                int i18 = aVar.f17806j;
                if (i18 == b.a.f17795l || i18 == b.a.f17796m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f17806j == b.a.f17796m || !z12 || ((z12 && z13) || (view instanceof Placeholder) || eVar.o0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.f18106i, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), makeMeasureSpec, eVar.W()) && d(eVar.D(), makeMeasureSpec2, eVar.x())) {
                aVar.f17801e = eVar.W();
                aVar.f17802f = eVar.x();
                aVar.f17803g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z18 = z14 && eVar.f17943W > 0.0f;
            boolean z19 = z15 && eVar.f17943W > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f17806j;
            if (i19 != b.a.f17795l && i19 != b.a.f17796m && z14 && eVar.f17987u == 0 && z15 && eVar.f17989v == 0) {
                i10 = -1;
                max2 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof i) && (eVar instanceof l)) {
                    ((i) view).p((l) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.W0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = eVar.f17991w;
                max = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = eVar.f17993x;
                if (i21 > 0) {
                    max = Math.min(i21, max);
                }
                int i22 = eVar.f17997z;
                max2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = eVar.f17921A;
                if (i23 > 0) {
                    max2 = Math.min(i23, max2);
                }
                boolean z21 = z16;
                if (!k.b(ConstraintLayout.this.f18106i, 1)) {
                    if (z18 && z21) {
                        max = (int) ((max2 * eVar.f17943W) + 0.5f);
                    } else if (z19 && z20) {
                        max2 = (int) ((max / eVar.f17943W) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != max2) {
                    if (measuredWidth != max) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    }
                    if (measuredHeight != max2) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    eVar.W0(makeMeasureSpec, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    max2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10;
            aVar.f17805i = (max == aVar.f17799c && max2 == aVar.f17800d) ? false : true;
            if (bVar5.f18161g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && eVar.p() != baseline) {
                aVar.f17805i = true;
            }
            aVar.f17801e = max;
            aVar.f17802f = max2;
            aVar.f17804h = z22;
            aVar.f17803g = baseline;
            ConstraintLayout.a(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f18199b = i12;
            this.f18200c = i13;
            this.f18201d = i14;
            this.f18202e = i15;
            this.f18203f = i10;
            this.f18204g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f18098a = new SparseArray();
        this.f18099b = new ArrayList(4);
        this.f18100c = new androidx.constraintlayout.core.widgets.f();
        this.f18101d = 0;
        this.f18102e = 0;
        this.f18103f = Integer.MAX_VALUE;
        this.f18104g = Integer.MAX_VALUE;
        this.f18105h = true;
        this.f18106i = EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.f18107j = null;
        this.f18108k = null;
        this.f18109l = -1;
        this.f18110m = new HashMap();
        this.f18111n = -1;
        this.f18112o = -1;
        this.f18113p = -1;
        this.f18114q = -1;
        this.f18115r = 0;
        this.f18116s = 0;
        this.f18117t = new SparseArray();
        this.f18118u = new c(this);
        this.f18119v = 0;
        this.f18120w = 0;
        m(null, 0, 0);
    }

    public static /* synthetic */ androidx.constraintlayout.core.e a(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static h getSharedValues() {
        if (f18097y == null) {
            f18097y = new h();
        }
        return f18097y;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f18099b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.b) this.f18099b.get(i10)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(boolean z10, View view, androidx.constraintlayout.core.widgets.e eVar, b bVar, SparseArray sparseArray) {
        androidx.constraintlayout.core.widgets.e eVar2;
        androidx.constraintlayout.core.widgets.e eVar3;
        androidx.constraintlayout.core.widgets.e eVar4;
        androidx.constraintlayout.core.widgets.e eVar5;
        b bVar2;
        androidx.constraintlayout.core.widgets.e eVar6;
        float f10;
        int i10;
        bVar.a();
        bVar.f18193w0 = false;
        eVar.k1(view.getVisibility());
        if (bVar.f18167j0) {
            eVar.U0(true);
            eVar.k1(8);
        }
        eVar.C0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).j(eVar, this.f18100c.R1());
        }
        if (bVar.f18163h0) {
            androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
            int i11 = bVar.f18185s0;
            int i12 = bVar.f18187t0;
            float f11 = bVar.f18189u0;
            if (f11 != -1.0f) {
                hVar.A1(f11);
                return;
            } else if (i11 != -1) {
                hVar.y1(i11);
                return;
            } else {
                if (i12 != -1) {
                    hVar.z1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f18171l0;
        int i14 = bVar.f18173m0;
        int i15 = bVar.f18175n0;
        int i16 = bVar.f18177o0;
        int i17 = bVar.f18179p0;
        int i18 = bVar.f18181q0;
        float f12 = bVar.f18183r0;
        int i19 = bVar.f18178p;
        if (i19 != -1) {
            androidx.constraintlayout.core.widgets.e eVar7 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i19);
            if (eVar7 != null) {
                eVar.l(eVar7, bVar.f18182r, bVar.f18180q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i13 != -1) {
                androidx.constraintlayout.core.widgets.e eVar8 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i13);
                if (eVar8 != null) {
                    d.a aVar = d.a.LEFT;
                    eVar.e0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i14)) != null) {
                eVar.e0(d.a.LEFT, eVar2, d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                androidx.constraintlayout.core.widgets.e eVar9 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i15);
                if (eVar9 != null) {
                    eVar.e0(d.a.RIGHT, eVar9, d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i16)) != null) {
                d.a aVar2 = d.a.RIGHT;
                eVar.e0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f18164i;
            if (i20 != -1) {
                androidx.constraintlayout.core.widgets.e eVar10 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i20);
                if (eVar10 != null) {
                    d.a aVar3 = d.a.TOP;
                    eVar.e0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f18194x);
                }
            } else {
                int i21 = bVar.f18166j;
                if (i21 != -1 && (eVar4 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i21)) != null) {
                    eVar.e0(d.a.TOP, eVar4, d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f18194x);
                }
            }
            int i22 = bVar.f18168k;
            if (i22 != -1) {
                androidx.constraintlayout.core.widgets.e eVar11 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i22);
                if (eVar11 != null) {
                    eVar.e0(d.a.BOTTOM, eVar11, d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f18196z);
                }
            } else {
                int i23 = bVar.f18170l;
                if (i23 != -1 && (eVar5 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i23)) != null) {
                    d.a aVar4 = d.a.BOTTOM;
                    eVar.e0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f18196z);
                }
            }
            int i24 = bVar.f18172m;
            if (i24 != -1) {
                bVar2 = bVar;
                v(eVar, bVar2, sparseArray, i24, d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f18174n;
                if (i25 != -1) {
                    v(eVar, bVar2, sparseArray, i25, d.a.TOP);
                } else {
                    int i26 = bVar2.f18176o;
                    if (i26 != -1) {
                        v(eVar, bVar2, sparseArray, i26, d.a.BOTTOM);
                        eVar6 = eVar;
                        if (f12 >= 0.0f) {
                            eVar6.N0(f12);
                        }
                        f10 = bVar2.f18129H;
                        if (f10 >= 0.0f) {
                            eVar6.e1(f10);
                        }
                    }
                }
            }
            eVar6 = eVar;
            if (f12 >= 0.0f) {
            }
            f10 = bVar2.f18129H;
            if (f10 >= 0.0f) {
            }
        }
        if (z10 && ((i10 = bVar2.f18145X) != -1 || bVar2.f18146Y != -1)) {
            eVar6.c1(i10, bVar2.f18146Y);
        }
        if (bVar2.f18157e0) {
            eVar6.Q0(e.b.FIXED);
            eVar6.l1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.Q0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f18149a0) {
                eVar6.Q0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.Q0(e.b.MATCH_PARENT);
            }
            eVar6.o(d.a.LEFT).f17908g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.o(d.a.RIGHT).f17908g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.Q0(e.b.MATCH_CONSTRAINT);
            eVar6.l1(0);
        }
        if (bVar2.f18159f0) {
            eVar6.h1(e.b.FIXED);
            eVar6.M0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.h1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f18151b0) {
                eVar6.h1(e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.h1(e.b.MATCH_PARENT);
            }
            eVar6.o(d.a.TOP).f17908g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.o(d.a.BOTTOM).f17908g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.h1(e.b.MATCH_CONSTRAINT);
            eVar6.M0(0);
        }
        eVar6.E0(bVar2.f18130I);
        eVar6.S0(bVar2.f18133L);
        eVar6.j1(bVar2.f18134M);
        eVar6.O0(bVar2.f18135N);
        eVar6.f1(bVar2.f18136O);
        eVar6.m1(bVar2.f18155d0);
        eVar6.R0(bVar2.f18137P, bVar2.f18139R, bVar2.f18141T, bVar2.f18143V);
        eVar6.i1(bVar2.f18138Q, bVar2.f18140S, bVar2.f18142U, bVar2.f18144W);
    }

    public boolean f(int i10, int i11) {
        if (this.f18121x == null) {
            return false;
        }
        View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        Iterator it = this.f18121x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            Iterator it2 = this.f18100c.s1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((androidx.constraintlayout.core.widgets.e) it2.next()).s();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        o();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f18104g;
    }

    public int getMaxWidth() {
        return this.f18103f;
    }

    public int getMinHeight() {
        return this.f18102e;
    }

    public int getMinWidth() {
        return this.f18101d;
    }

    public int getOptimizationLevel() {
        return this.f18100c.L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f18100c.f17971m == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f18100c.f17971m = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f18100c.f17971m = "parent";
            }
        }
        if (this.f18100c.t() == null) {
            androidx.constraintlayout.core.widgets.f fVar = this.f18100c;
            fVar.D0(fVar.f17971m);
            this.f18100c.t();
        }
        Iterator it = this.f18100c.s1().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
            View view = (View) eVar.s();
            if (view != null) {
                if (eVar.f17971m == null && (id2 = view.getId()) != -1) {
                    eVar.f17971m = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.t() == null) {
                    eVar.D0(eVar.f17971m);
                    eVar.t();
                }
            }
        }
        this.f18100c.O(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object i(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f18110m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f18110m.get(str);
    }

    public final androidx.constraintlayout.core.widgets.e j(int i10) {
        if (i10 == 0) {
            return this.f18100c;
        }
        View view = (View) this.f18098a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f18100c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f18191v0;
    }

    public View k(int i10) {
        return (View) this.f18098a.get(i10);
    }

    public final androidx.constraintlayout.core.widgets.e l(View view) {
        if (view == this) {
            return this.f18100c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f18191v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f18191v0;
        }
        return null;
    }

    public final void m(AttributeSet attributeSet, int i10, int i11) {
        this.f18100c.C0(this);
        this.f18100c.X1(this.f18118u);
        this.f18098a.put(getId(), this);
        this.f18107j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == g.f18571c1) {
                    this.f18101d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18101d);
                } else if (index == g.f18579d1) {
                    this.f18102e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18102e);
                } else if (index == g.f18555a1) {
                    this.f18103f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18103f);
                } else if (index == g.f18563b1) {
                    this.f18104g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18104g);
                } else if (index == g.f18451L2) {
                    this.f18106i = obtainStyledAttributes.getInt(index, this.f18106i);
                } else if (index == g.f18415G1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            p(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f18108k = null;
                        }
                    }
                } else if (index == g.f18635k1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f18107j = dVar;
                        dVar.q(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f18107j = null;
                    }
                    this.f18109l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f18100c.Y1(this.f18106i);
    }

    public boolean n() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void o() {
        this.f18105h = true;
        this.f18111n = -1;
        this.f18112o = -1;
        this.f18113p = -1;
        this.f18114q = -1;
        this.f18115r = 0;
        this.f18116s = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            androidx.constraintlayout.core.widgets.e eVar = bVar.f18191v0;
            if ((childAt.getVisibility() != 8 || bVar.f18163h0 || bVar.f18165i0 || bVar.f18169k0 || isInEditMode) && !bVar.f18167j0) {
                int X10 = eVar.X();
                int Y10 = eVar.Y();
                int W10 = eVar.W() + X10;
                int x10 = eVar.x() + Y10;
                childAt.layout(X10, Y10, W10, x10);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(X10, Y10, W10, x10);
                }
            }
        }
        int size = this.f18099b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.b) this.f18099b.get(i15)).k(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean f10 = this.f18105h | f(i10, i11);
        this.f18105h = f10;
        if (!f10) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f18105h = true;
                    break;
                }
                i12++;
            }
        }
        this.f18119v = i10;
        this.f18120w = i11;
        this.f18100c.a2(n());
        if (this.f18105h) {
            this.f18105h = false;
            if (w()) {
                this.f18100c.c2();
            }
        }
        this.f18100c.J1(null);
        r(this.f18100c, this.f18106i, i10, i11);
        q(i10, i11, this.f18100c.W(), this.f18100c.x(), this.f18100c.S1(), this.f18100c.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        androidx.constraintlayout.core.widgets.e l10 = l(view);
        if ((view instanceof Guideline) && !(l10 instanceof androidx.constraintlayout.core.widgets.h)) {
            b bVar = (b) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.h hVar = new androidx.constraintlayout.core.widgets.h();
            bVar.f18191v0 = hVar;
            bVar.f18163h0 = true;
            hVar.B1(bVar.f18147Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.o();
            ((b) view.getLayoutParams()).f18165i0 = true;
            if (!this.f18099b.contains(bVar2)) {
                this.f18099b.add(bVar2);
            }
        }
        this.f18098a.put(view.getId(), view);
        this.f18105h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f18098a.remove(view.getId());
        this.f18100c.u1(l(view));
        this.f18099b.remove(view);
        this.f18105h = true;
    }

    public void p(int i10) {
        this.f18108k = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    public void q(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f18118u;
        int i14 = cVar.f18202e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f18201d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int min = Math.min(this.f18103f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f18104g, resolveSizeAndState2);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f18111n = min;
        this.f18112o = min2;
    }

    public void r(androidx.constraintlayout.core.widgets.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f18118u.c(i11, i12, max, max2, paddingWidth, i14);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (n()) {
            i13 = max4;
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            u(fVar, mode, i15, mode2, i16);
            fVar.T1(i10, mode, i15, mode2, i16, this.f18111n, this.f18112o, i13, max);
        }
        i13 = max3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        u(fVar, mode, i152, mode2, i162);
        fVar.T1(i10, mode, i152, mode2, i162, this.f18111n, this.f18112o, i13, max);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        o();
        super.requestLayout();
    }

    public final void s() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            androidx.constraintlayout.core.widgets.e l10 = l(getChildAt(i10));
            if (l10 != null) {
                l10.t0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    t(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    j(childAt.getId()).D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f18109l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        d dVar = this.f18107j;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f18100c.v1();
        int size = this.f18099b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.b) this.f18099b.get(i13)).n(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 instanceof Placeholder) {
                ((Placeholder) childAt2).c(this);
            }
        }
        this.f18117t.clear();
        this.f18117t.put(0, this.f18100c);
        this.f18117t.put(getId(), this.f18100c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            this.f18117t.put(childAt3.getId(), l(childAt3));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            androidx.constraintlayout.core.widgets.e l11 = l(childAt4);
            if (l11 != null) {
                b bVar = (b) childAt4.getLayoutParams();
                this.f18100c.a(l11);
                e(isInEditMode, childAt4, l11, bVar, this.f18117t);
            }
        }
    }

    public void setConstraintSet(d dVar) {
        this.f18107j = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f18098a.remove(getId());
        super.setId(i10);
        this.f18098a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f18104g) {
            return;
        }
        this.f18104g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f18103f) {
            return;
        }
        this.f18103f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f18102e) {
            return;
        }
        this.f18102e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f18101d) {
            return;
        }
        this.f18101d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.f18108k;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f18106i = i10;
        this.f18100c.Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f18110m == null) {
                this.f18110m = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f18110m.put(str, (Integer) obj2);
        }
    }

    public void u(androidx.constraintlayout.core.widgets.f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.f18118u;
        int i14 = cVar.f18202e;
        int i15 = cVar.f18201d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f18101d);
            }
        } else if (i10 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f18101d);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.f18103f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f18102e);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.f18104g - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f18102e);
            }
            i13 = 0;
        }
        if (i11 != fVar.W() || i13 != fVar.x()) {
            fVar.P1();
        }
        fVar.n1(0);
        fVar.o1(0);
        fVar.Y0(this.f18103f - i15);
        fVar.X0(this.f18104g - i14);
        fVar.b1(0);
        fVar.a1(0);
        fVar.Q0(bVar);
        fVar.l1(i11);
        fVar.h1(bVar2);
        fVar.M0(i13);
        fVar.b1(this.f18101d - i15);
        fVar.a1(this.f18102e - i14);
    }

    public final void v(androidx.constraintlayout.core.widgets.e eVar, b bVar, SparseArray sparseArray, int i10, d.a aVar) {
        View view = (View) this.f18098a.get(i10);
        androidx.constraintlayout.core.widgets.e eVar2 = (androidx.constraintlayout.core.widgets.e) sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f18161g0 = true;
        d.a aVar2 = d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f18161g0 = true;
            bVar2.f18191v0.L0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.f18125D, bVar.f18124C, true);
        eVar.L0(true);
        eVar.o(d.a.TOP).q();
        eVar.o(d.a.BOTTOM).q();
    }

    public final boolean w() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            s();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18098a = new SparseArray();
        this.f18099b = new ArrayList(4);
        this.f18100c = new androidx.constraintlayout.core.widgets.f();
        this.f18101d = 0;
        this.f18102e = 0;
        this.f18103f = Integer.MAX_VALUE;
        this.f18104g = Integer.MAX_VALUE;
        this.f18105h = true;
        this.f18106i = EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.f18107j = null;
        this.f18108k = null;
        this.f18109l = -1;
        this.f18110m = new HashMap();
        this.f18111n = -1;
        this.f18112o = -1;
        this.f18113p = -1;
        this.f18114q = -1;
        this.f18115r = 0;
        this.f18116s = 0;
        this.f18117t = new SparseArray();
        this.f18118u = new c(this);
        this.f18119v = 0;
        this.f18120w = 0;
        m(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18098a = new SparseArray();
        this.f18099b = new ArrayList(4);
        this.f18100c = new androidx.constraintlayout.core.widgets.f();
        this.f18101d = 0;
        this.f18102e = 0;
        this.f18103f = Integer.MAX_VALUE;
        this.f18104g = Integer.MAX_VALUE;
        this.f18105h = true;
        this.f18106i = EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.f18107j = null;
        this.f18108k = null;
        this.f18109l = -1;
        this.f18110m = new HashMap();
        this.f18111n = -1;
        this.f18112o = -1;
        this.f18113p = -1;
        this.f18114q = -1;
        this.f18115r = 0;
        this.f18116s = 0;
        this.f18117t = new SparseArray();
        this.f18118u = new c(this);
        this.f18119v = 0;
        this.f18120w = 0;
        m(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f18122A;

        /* renamed from: B, reason: collision with root package name */
        public int f18123B;

        /* renamed from: C, reason: collision with root package name */
        public int f18124C;

        /* renamed from: D, reason: collision with root package name */
        public int f18125D;

        /* renamed from: E, reason: collision with root package name */
        public boolean f18126E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f18127F;

        /* renamed from: G, reason: collision with root package name */
        public float f18128G;

        /* renamed from: H, reason: collision with root package name */
        public float f18129H;

        /* renamed from: I, reason: collision with root package name */
        public String f18130I;

        /* renamed from: J, reason: collision with root package name */
        public float f18131J;

        /* renamed from: K, reason: collision with root package name */
        public int f18132K;

        /* renamed from: L, reason: collision with root package name */
        public float f18133L;

        /* renamed from: M, reason: collision with root package name */
        public float f18134M;

        /* renamed from: N, reason: collision with root package name */
        public int f18135N;

        /* renamed from: O, reason: collision with root package name */
        public int f18136O;

        /* renamed from: P, reason: collision with root package name */
        public int f18137P;

        /* renamed from: Q, reason: collision with root package name */
        public int f18138Q;

        /* renamed from: R, reason: collision with root package name */
        public int f18139R;

        /* renamed from: S, reason: collision with root package name */
        public int f18140S;

        /* renamed from: T, reason: collision with root package name */
        public int f18141T;

        /* renamed from: U, reason: collision with root package name */
        public int f18142U;

        /* renamed from: V, reason: collision with root package name */
        public float f18143V;

        /* renamed from: W, reason: collision with root package name */
        public float f18144W;

        /* renamed from: X, reason: collision with root package name */
        public int f18145X;

        /* renamed from: Y, reason: collision with root package name */
        public int f18146Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f18147Z;

        /* renamed from: a, reason: collision with root package name */
        public int f18148a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f18149a0;

        /* renamed from: b, reason: collision with root package name */
        public int f18150b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f18151b0;

        /* renamed from: c, reason: collision with root package name */
        public float f18152c;

        /* renamed from: c0, reason: collision with root package name */
        public String f18153c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18154d;

        /* renamed from: d0, reason: collision with root package name */
        public int f18155d0;

        /* renamed from: e, reason: collision with root package name */
        public int f18156e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f18157e0;

        /* renamed from: f, reason: collision with root package name */
        public int f18158f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f18159f0;

        /* renamed from: g, reason: collision with root package name */
        public int f18160g;

        /* renamed from: g0, reason: collision with root package name */
        public boolean f18161g0;

        /* renamed from: h, reason: collision with root package name */
        public int f18162h;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f18163h0;

        /* renamed from: i, reason: collision with root package name */
        public int f18164i;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f18165i0;

        /* renamed from: j, reason: collision with root package name */
        public int f18166j;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f18167j0;

        /* renamed from: k, reason: collision with root package name */
        public int f18168k;

        /* renamed from: k0, reason: collision with root package name */
        public boolean f18169k0;

        /* renamed from: l, reason: collision with root package name */
        public int f18170l;

        /* renamed from: l0, reason: collision with root package name */
        public int f18171l0;

        /* renamed from: m, reason: collision with root package name */
        public int f18172m;

        /* renamed from: m0, reason: collision with root package name */
        public int f18173m0;

        /* renamed from: n, reason: collision with root package name */
        public int f18174n;

        /* renamed from: n0, reason: collision with root package name */
        public int f18175n0;

        /* renamed from: o, reason: collision with root package name */
        public int f18176o;

        /* renamed from: o0, reason: collision with root package name */
        public int f18177o0;

        /* renamed from: p, reason: collision with root package name */
        public int f18178p;

        /* renamed from: p0, reason: collision with root package name */
        public int f18179p0;

        /* renamed from: q, reason: collision with root package name */
        public int f18180q;

        /* renamed from: q0, reason: collision with root package name */
        public int f18181q0;

        /* renamed from: r, reason: collision with root package name */
        public float f18182r;

        /* renamed from: r0, reason: collision with root package name */
        public float f18183r0;

        /* renamed from: s, reason: collision with root package name */
        public int f18184s;

        /* renamed from: s0, reason: collision with root package name */
        public int f18185s0;

        /* renamed from: t, reason: collision with root package name */
        public int f18186t;

        /* renamed from: t0, reason: collision with root package name */
        public int f18187t0;

        /* renamed from: u, reason: collision with root package name */
        public int f18188u;

        /* renamed from: u0, reason: collision with root package name */
        public float f18189u0;

        /* renamed from: v, reason: collision with root package name */
        public int f18190v;

        /* renamed from: v0, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.e f18191v0;

        /* renamed from: w, reason: collision with root package name */
        public int f18192w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f18193w0;

        /* renamed from: x, reason: collision with root package name */
        public int f18194x;

        /* renamed from: y, reason: collision with root package name */
        public int f18195y;

        /* renamed from: z, reason: collision with root package name */
        public int f18196z;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f18197a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f18197a = sparseIntArray;
                sparseIntArray.append(g.f18728w2, 64);
                sparseIntArray.append(g.f18548Z1, 65);
                sparseIntArray.append(g.f18620i2, 8);
                sparseIntArray.append(g.f18628j2, 9);
                sparseIntArray.append(g.f18644l2, 10);
                sparseIntArray.append(g.f18652m2, 11);
                sparseIntArray.append(g.f18700s2, 12);
                sparseIntArray.append(g.f18692r2, 13);
                sparseIntArray.append(g.f18478P1, 14);
                sparseIntArray.append(g.f18471O1, 15);
                sparseIntArray.append(g.f18443K1, 16);
                sparseIntArray.append(g.f18457M1, 52);
                sparseIntArray.append(g.f18450L1, 53);
                sparseIntArray.append(g.f18485Q1, 2);
                sparseIntArray.append(g.f18499S1, 3);
                sparseIntArray.append(g.f18492R1, 4);
                sparseIntArray.append(g.f18381B2, 49);
                sparseIntArray.append(g.f18388C2, 50);
                sparseIntArray.append(g.f18527W1, 5);
                sparseIntArray.append(g.f18534X1, 6);
                sparseIntArray.append(g.f18541Y1, 7);
                sparseIntArray.append(g.f18408F1, 67);
                sparseIntArray.append(g.f18505T0, 1);
                sparseIntArray.append(g.f18660n2, 17);
                sparseIntArray.append(g.f18668o2, 18);
                sparseIntArray.append(g.f18520V1, 19);
                sparseIntArray.append(g.f18513U1, 20);
                sparseIntArray.append(g.f18416G2, 21);
                sparseIntArray.append(g.f18437J2, 22);
                sparseIntArray.append(g.f18423H2, 23);
                sparseIntArray.append(g.f18402E2, 24);
                sparseIntArray.append(g.f18430I2, 25);
                sparseIntArray.append(g.f18409F2, 26);
                sparseIntArray.append(g.f18395D2, 55);
                sparseIntArray.append(g.f18444K2, 54);
                sparseIntArray.append(g.f18588e2, 29);
                sparseIntArray.append(g.f18707t2, 30);
                sparseIntArray.append(g.f18506T1, 44);
                sparseIntArray.append(g.f18604g2, 45);
                sparseIntArray.append(g.f18721v2, 46);
                sparseIntArray.append(g.f18596f2, 47);
                sparseIntArray.append(g.f18714u2, 48);
                sparseIntArray.append(g.f18429I1, 27);
                sparseIntArray.append(g.f18422H1, 28);
                sparseIntArray.append(g.f18735x2, 31);
                sparseIntArray.append(g.f18556a2, 32);
                sparseIntArray.append(g.f18749z2, 33);
                sparseIntArray.append(g.f18742y2, 34);
                sparseIntArray.append(g.f18374A2, 35);
                sparseIntArray.append(g.f18572c2, 36);
                sparseIntArray.append(g.f18564b2, 37);
                sparseIntArray.append(g.f18580d2, 38);
                sparseIntArray.append(g.f18612h2, 39);
                sparseIntArray.append(g.f18684q2, 40);
                sparseIntArray.append(g.f18636k2, 41);
                sparseIntArray.append(g.f18464N1, 42);
                sparseIntArray.append(g.f18436J1, 43);
                sparseIntArray.append(g.f18676p2, 51);
                sparseIntArray.append(g.f18458M2, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f18148a = -1;
            this.f18150b = -1;
            this.f18152c = -1.0f;
            this.f18154d = true;
            this.f18156e = -1;
            this.f18158f = -1;
            this.f18160g = -1;
            this.f18162h = -1;
            this.f18164i = -1;
            this.f18166j = -1;
            this.f18168k = -1;
            this.f18170l = -1;
            this.f18172m = -1;
            this.f18174n = -1;
            this.f18176o = -1;
            this.f18178p = -1;
            this.f18180q = 0;
            this.f18182r = 0.0f;
            this.f18184s = -1;
            this.f18186t = -1;
            this.f18188u = -1;
            this.f18190v = -1;
            this.f18192w = Integer.MIN_VALUE;
            this.f18194x = Integer.MIN_VALUE;
            this.f18195y = Integer.MIN_VALUE;
            this.f18196z = Integer.MIN_VALUE;
            this.f18122A = Integer.MIN_VALUE;
            this.f18123B = Integer.MIN_VALUE;
            this.f18124C = Integer.MIN_VALUE;
            this.f18125D = 0;
            this.f18126E = true;
            this.f18127F = true;
            this.f18128G = 0.5f;
            this.f18129H = 0.5f;
            this.f18130I = null;
            this.f18131J = 0.0f;
            this.f18132K = 1;
            this.f18133L = -1.0f;
            this.f18134M = -1.0f;
            this.f18135N = 0;
            this.f18136O = 0;
            this.f18137P = 0;
            this.f18138Q = 0;
            this.f18139R = 0;
            this.f18140S = 0;
            this.f18141T = 0;
            this.f18142U = 0;
            this.f18143V = 1.0f;
            this.f18144W = 1.0f;
            this.f18145X = -1;
            this.f18146Y = -1;
            this.f18147Z = -1;
            this.f18149a0 = false;
            this.f18151b0 = false;
            this.f18153c0 = null;
            this.f18155d0 = 0;
            this.f18157e0 = true;
            this.f18159f0 = true;
            this.f18161g0 = false;
            this.f18163h0 = false;
            this.f18165i0 = false;
            this.f18167j0 = false;
            this.f18169k0 = false;
            this.f18171l0 = -1;
            this.f18173m0 = -1;
            this.f18175n0 = -1;
            this.f18177o0 = -1;
            this.f18179p0 = Integer.MIN_VALUE;
            this.f18181q0 = Integer.MIN_VALUE;
            this.f18183r0 = 0.5f;
            this.f18191v0 = new androidx.constraintlayout.core.widgets.e();
            this.f18193w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f18148a = bVar.f18148a;
                this.f18150b = bVar.f18150b;
                this.f18152c = bVar.f18152c;
                this.f18154d = bVar.f18154d;
                this.f18156e = bVar.f18156e;
                this.f18158f = bVar.f18158f;
                this.f18160g = bVar.f18160g;
                this.f18162h = bVar.f18162h;
                this.f18164i = bVar.f18164i;
                this.f18166j = bVar.f18166j;
                this.f18168k = bVar.f18168k;
                this.f18170l = bVar.f18170l;
                this.f18172m = bVar.f18172m;
                this.f18174n = bVar.f18174n;
                this.f18176o = bVar.f18176o;
                this.f18178p = bVar.f18178p;
                this.f18180q = bVar.f18180q;
                this.f18182r = bVar.f18182r;
                this.f18184s = bVar.f18184s;
                this.f18186t = bVar.f18186t;
                this.f18188u = bVar.f18188u;
                this.f18190v = bVar.f18190v;
                this.f18192w = bVar.f18192w;
                this.f18194x = bVar.f18194x;
                this.f18195y = bVar.f18195y;
                this.f18196z = bVar.f18196z;
                this.f18122A = bVar.f18122A;
                this.f18123B = bVar.f18123B;
                this.f18124C = bVar.f18124C;
                this.f18125D = bVar.f18125D;
                this.f18128G = bVar.f18128G;
                this.f18129H = bVar.f18129H;
                this.f18130I = bVar.f18130I;
                this.f18131J = bVar.f18131J;
                this.f18132K = bVar.f18132K;
                this.f18133L = bVar.f18133L;
                this.f18134M = bVar.f18134M;
                this.f18135N = bVar.f18135N;
                this.f18136O = bVar.f18136O;
                this.f18149a0 = bVar.f18149a0;
                this.f18151b0 = bVar.f18151b0;
                this.f18137P = bVar.f18137P;
                this.f18138Q = bVar.f18138Q;
                this.f18139R = bVar.f18139R;
                this.f18141T = bVar.f18141T;
                this.f18140S = bVar.f18140S;
                this.f18142U = bVar.f18142U;
                this.f18143V = bVar.f18143V;
                this.f18144W = bVar.f18144W;
                this.f18145X = bVar.f18145X;
                this.f18146Y = bVar.f18146Y;
                this.f18147Z = bVar.f18147Z;
                this.f18157e0 = bVar.f18157e0;
                this.f18159f0 = bVar.f18159f0;
                this.f18161g0 = bVar.f18161g0;
                this.f18163h0 = bVar.f18163h0;
                this.f18171l0 = bVar.f18171l0;
                this.f18173m0 = bVar.f18173m0;
                this.f18175n0 = bVar.f18175n0;
                this.f18177o0 = bVar.f18177o0;
                this.f18179p0 = bVar.f18179p0;
                this.f18181q0 = bVar.f18181q0;
                this.f18183r0 = bVar.f18183r0;
                this.f18153c0 = bVar.f18153c0;
                this.f18155d0 = bVar.f18155d0;
                this.f18191v0 = bVar.f18191v0;
                this.f18126E = bVar.f18126E;
                this.f18127F = bVar.f18127F;
            }
        }

        public void a() {
            this.f18163h0 = false;
            this.f18157e0 = true;
            this.f18159f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f18149a0) {
                this.f18157e0 = false;
                if (this.f18137P == 0) {
                    this.f18137P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f18151b0) {
                this.f18159f0 = false;
                if (this.f18138Q == 0) {
                    this.f18138Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f18157e0 = false;
                if (i10 == 0 && this.f18137P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f18149a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f18159f0 = false;
                if (i11 == 0 && this.f18138Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f18151b0 = true;
                }
            }
            if (this.f18152c == -1.0f && this.f18148a == -1 && this.f18150b == -1) {
                return;
            }
            this.f18163h0 = true;
            this.f18157e0 = true;
            this.f18159f0 = true;
            if (!(this.f18191v0 instanceof androidx.constraintlayout.core.widgets.h)) {
                this.f18191v0 = new androidx.constraintlayout.core.widgets.h();
            }
            ((androidx.constraintlayout.core.widgets.h) this.f18191v0).B1(this.f18147Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f18175n0 = -1;
            this.f18177o0 = -1;
            this.f18171l0 = -1;
            this.f18173m0 = -1;
            this.f18179p0 = this.f18192w;
            this.f18181q0 = this.f18195y;
            float f10 = this.f18128G;
            this.f18183r0 = f10;
            int i17 = this.f18148a;
            this.f18185s0 = i17;
            int i18 = this.f18150b;
            this.f18187t0 = i18;
            float f11 = this.f18152c;
            this.f18189u0 = f11;
            if (z11) {
                int i19 = this.f18184s;
                if (i19 != -1) {
                    this.f18175n0 = i19;
                } else {
                    int i20 = this.f18186t;
                    if (i20 != -1) {
                        this.f18177o0 = i20;
                    }
                    i11 = this.f18188u;
                    if (i11 != -1) {
                        this.f18173m0 = i11;
                        z10 = true;
                    }
                    i12 = this.f18190v;
                    if (i12 != -1) {
                        this.f18171l0 = i12;
                        z10 = true;
                    }
                    i13 = this.f18122A;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f18181q0 = i13;
                    }
                    i14 = this.f18123B;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f18179p0 = i14;
                    }
                    if (z10) {
                        this.f18183r0 = 1.0f - f10;
                    }
                    if (this.f18163h0 && this.f18147Z == 1 && this.f18154d) {
                        if (f11 == -1.0f) {
                            this.f18189u0 = 1.0f - f11;
                            this.f18185s0 = -1;
                            this.f18187t0 = -1;
                        } else if (i17 != -1) {
                            this.f18187t0 = i17;
                            this.f18185s0 = -1;
                            this.f18189u0 = -1.0f;
                        } else if (i18 != -1) {
                            this.f18185s0 = i18;
                            this.f18187t0 = -1;
                            this.f18189u0 = -1.0f;
                        }
                    }
                }
                z10 = true;
                i11 = this.f18188u;
                if (i11 != -1) {
                }
                i12 = this.f18190v;
                if (i12 != -1) {
                }
                i13 = this.f18122A;
                if (i13 != Integer.MIN_VALUE) {
                }
                i14 = this.f18123B;
                if (i14 != Integer.MIN_VALUE) {
                }
                if (z10) {
                }
                if (this.f18163h0) {
                    if (f11 == -1.0f) {
                    }
                }
            } else {
                int i21 = this.f18184s;
                if (i21 != -1) {
                    this.f18173m0 = i21;
                }
                int i22 = this.f18186t;
                if (i22 != -1) {
                    this.f18171l0 = i22;
                }
                int i23 = this.f18188u;
                if (i23 != -1) {
                    this.f18175n0 = i23;
                }
                int i24 = this.f18190v;
                if (i24 != -1) {
                    this.f18177o0 = i24;
                }
                int i25 = this.f18122A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f18179p0 = i25;
                }
                int i26 = this.f18123B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f18181q0 = i26;
                }
            }
            if (this.f18188u == -1 && this.f18190v == -1 && this.f18186t == -1 && this.f18184s == -1) {
                int i27 = this.f18160g;
                if (i27 != -1) {
                    this.f18175n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f18162h;
                    if (i28 != -1) {
                        this.f18177o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f18156e;
                if (i29 != -1) {
                    this.f18171l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f18158f;
                if (i30 != -1) {
                    this.f18173m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18148a = -1;
            this.f18150b = -1;
            this.f18152c = -1.0f;
            this.f18154d = true;
            this.f18156e = -1;
            this.f18158f = -1;
            this.f18160g = -1;
            this.f18162h = -1;
            this.f18164i = -1;
            this.f18166j = -1;
            this.f18168k = -1;
            this.f18170l = -1;
            this.f18172m = -1;
            this.f18174n = -1;
            this.f18176o = -1;
            this.f18178p = -1;
            this.f18180q = 0;
            this.f18182r = 0.0f;
            this.f18184s = -1;
            this.f18186t = -1;
            this.f18188u = -1;
            this.f18190v = -1;
            this.f18192w = Integer.MIN_VALUE;
            this.f18194x = Integer.MIN_VALUE;
            this.f18195y = Integer.MIN_VALUE;
            this.f18196z = Integer.MIN_VALUE;
            this.f18122A = Integer.MIN_VALUE;
            this.f18123B = Integer.MIN_VALUE;
            this.f18124C = Integer.MIN_VALUE;
            this.f18125D = 0;
            this.f18126E = true;
            this.f18127F = true;
            this.f18128G = 0.5f;
            this.f18129H = 0.5f;
            this.f18130I = null;
            this.f18131J = 0.0f;
            this.f18132K = 1;
            this.f18133L = -1.0f;
            this.f18134M = -1.0f;
            this.f18135N = 0;
            this.f18136O = 0;
            this.f18137P = 0;
            this.f18138Q = 0;
            this.f18139R = 0;
            this.f18140S = 0;
            this.f18141T = 0;
            this.f18142U = 0;
            this.f18143V = 1.0f;
            this.f18144W = 1.0f;
            this.f18145X = -1;
            this.f18146Y = -1;
            this.f18147Z = -1;
            this.f18149a0 = false;
            this.f18151b0 = false;
            this.f18153c0 = null;
            this.f18155d0 = 0;
            this.f18157e0 = true;
            this.f18159f0 = true;
            this.f18161g0 = false;
            this.f18163h0 = false;
            this.f18165i0 = false;
            this.f18167j0 = false;
            this.f18169k0 = false;
            this.f18171l0 = -1;
            this.f18173m0 = -1;
            this.f18175n0 = -1;
            this.f18177o0 = -1;
            this.f18179p0 = Integer.MIN_VALUE;
            this.f18181q0 = Integer.MIN_VALUE;
            this.f18183r0 = 0.5f;
            this.f18191v0 = new androidx.constraintlayout.core.widgets.e();
            this.f18193w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f18197a.get(index);
                switch (i11) {
                    case 1:
                        this.f18147Z = obtainStyledAttributes.getInt(index, this.f18147Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f18178p);
                        this.f18178p = resourceId;
                        if (resourceId == -1) {
                            this.f18178p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f18180q = obtainStyledAttributes.getDimensionPixelSize(index, this.f18180q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f18182r) % 360.0f;
                        this.f18182r = f10;
                        if (f10 < 0.0f) {
                            this.f18182r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f18148a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18148a);
                        break;
                    case 6:
                        this.f18150b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18150b);
                        break;
                    case 7:
                        this.f18152c = obtainStyledAttributes.getFloat(index, this.f18152c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f18156e);
                        this.f18156e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f18156e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f18158f);
                        this.f18158f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f18158f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f18160g);
                        this.f18160g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f18160g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f18162h);
                        this.f18162h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f18162h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f18164i);
                        this.f18164i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f18164i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f18166j);
                        this.f18166j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f18166j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f18168k);
                        this.f18168k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f18168k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f18170l);
                        this.f18170l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f18170l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f18172m);
                        this.f18172m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f18172m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f18184s);
                        this.f18184s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f18184s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f18186t);
                        this.f18186t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f18186t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f18188u);
                        this.f18188u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f18188u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f18190v);
                        this.f18190v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f18190v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f18192w = obtainStyledAttributes.getDimensionPixelSize(index, this.f18192w);
                        break;
                    case 22:
                        this.f18194x = obtainStyledAttributes.getDimensionPixelSize(index, this.f18194x);
                        break;
                    case 23:
                        this.f18195y = obtainStyledAttributes.getDimensionPixelSize(index, this.f18195y);
                        break;
                    case 24:
                        this.f18196z = obtainStyledAttributes.getDimensionPixelSize(index, this.f18196z);
                        break;
                    case 25:
                        this.f18122A = obtainStyledAttributes.getDimensionPixelSize(index, this.f18122A);
                        break;
                    case 26:
                        this.f18123B = obtainStyledAttributes.getDimensionPixelSize(index, this.f18123B);
                        break;
                    case 27:
                        this.f18149a0 = obtainStyledAttributes.getBoolean(index, this.f18149a0);
                        break;
                    case 28:
                        this.f18151b0 = obtainStyledAttributes.getBoolean(index, this.f18151b0);
                        break;
                    case 29:
                        this.f18128G = obtainStyledAttributes.getFloat(index, this.f18128G);
                        break;
                    case 30:
                        this.f18129H = obtainStyledAttributes.getFloat(index, this.f18129H);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.f18137P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f18138Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f18139R = obtainStyledAttributes.getDimensionPixelSize(index, this.f18139R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f18139R) == -2) {
                                this.f18139R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f18141T = obtainStyledAttributes.getDimensionPixelSize(index, this.f18141T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f18141T) == -2) {
                                this.f18141T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f18143V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f18143V));
                        this.f18137P = 2;
                        break;
                    case 36:
                        try {
                            this.f18140S = obtainStyledAttributes.getDimensionPixelSize(index, this.f18140S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f18140S) == -2) {
                                this.f18140S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f18142U = obtainStyledAttributes.getDimensionPixelSize(index, this.f18142U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f18142U) == -2) {
                                this.f18142U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f18144W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f18144W));
                        this.f18138Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                d.v(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f18133L = obtainStyledAttributes.getFloat(index, this.f18133L);
                                break;
                            case 46:
                                this.f18134M = obtainStyledAttributes.getFloat(index, this.f18134M);
                                break;
                            case 47:
                                this.f18135N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f18136O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f18145X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18145X);
                                break;
                            case 50:
                                this.f18146Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18146Y);
                                break;
                            case 51:
                                this.f18153c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f18174n);
                                this.f18174n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f18174n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f18176o);
                                this.f18176o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f18176o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f18125D = obtainStyledAttributes.getDimensionPixelSize(index, this.f18125D);
                                break;
                            case 55:
                                this.f18124C = obtainStyledAttributes.getDimensionPixelSize(index, this.f18124C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.t(this, obtainStyledAttributes, index, 0);
                                        this.f18126E = true;
                                        break;
                                    case 65:
                                        d.t(this, obtainStyledAttributes, index, 1);
                                        this.f18127F = true;
                                        break;
                                    case 66:
                                        this.f18155d0 = obtainStyledAttributes.getInt(index, this.f18155d0);
                                        break;
                                    case 67:
                                        this.f18154d = obtainStyledAttributes.getBoolean(index, this.f18154d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f18148a = -1;
            this.f18150b = -1;
            this.f18152c = -1.0f;
            this.f18154d = true;
            this.f18156e = -1;
            this.f18158f = -1;
            this.f18160g = -1;
            this.f18162h = -1;
            this.f18164i = -1;
            this.f18166j = -1;
            this.f18168k = -1;
            this.f18170l = -1;
            this.f18172m = -1;
            this.f18174n = -1;
            this.f18176o = -1;
            this.f18178p = -1;
            this.f18180q = 0;
            this.f18182r = 0.0f;
            this.f18184s = -1;
            this.f18186t = -1;
            this.f18188u = -1;
            this.f18190v = -1;
            this.f18192w = Integer.MIN_VALUE;
            this.f18194x = Integer.MIN_VALUE;
            this.f18195y = Integer.MIN_VALUE;
            this.f18196z = Integer.MIN_VALUE;
            this.f18122A = Integer.MIN_VALUE;
            this.f18123B = Integer.MIN_VALUE;
            this.f18124C = Integer.MIN_VALUE;
            this.f18125D = 0;
            this.f18126E = true;
            this.f18127F = true;
            this.f18128G = 0.5f;
            this.f18129H = 0.5f;
            this.f18130I = null;
            this.f18131J = 0.0f;
            this.f18132K = 1;
            this.f18133L = -1.0f;
            this.f18134M = -1.0f;
            this.f18135N = 0;
            this.f18136O = 0;
            this.f18137P = 0;
            this.f18138Q = 0;
            this.f18139R = 0;
            this.f18140S = 0;
            this.f18141T = 0;
            this.f18142U = 0;
            this.f18143V = 1.0f;
            this.f18144W = 1.0f;
            this.f18145X = -1;
            this.f18146Y = -1;
            this.f18147Z = -1;
            this.f18149a0 = false;
            this.f18151b0 = false;
            this.f18153c0 = null;
            this.f18155d0 = 0;
            this.f18157e0 = true;
            this.f18159f0 = true;
            this.f18161g0 = false;
            this.f18163h0 = false;
            this.f18165i0 = false;
            this.f18167j0 = false;
            this.f18169k0 = false;
            this.f18171l0 = -1;
            this.f18173m0 = -1;
            this.f18175n0 = -1;
            this.f18177o0 = -1;
            this.f18179p0 = Integer.MIN_VALUE;
            this.f18181q0 = Integer.MIN_VALUE;
            this.f18183r0 = 0.5f;
            this.f18191v0 = new androidx.constraintlayout.core.widgets.e();
            this.f18193w0 = false;
        }
    }
}
