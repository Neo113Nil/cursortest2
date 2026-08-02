package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.d6j;
import xsna.e2v;
import xsna.kt6;
import xsna.o4u0;
import xsna.q6j;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static d s;
    public final SparseArray<View> b;
    public final ArrayList<androidx.constraintlayout.widget.a> c;
    public final androidx.constraintlayout.core.widgets.d d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public androidx.constraintlayout.widget.b k;
    public d6j l;
    public int m;
    public HashMap<String, Integer> n;
    public final SparseArray<ConstraintWidget> o;
    public final c p;
    public int q;
    public int r;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements kt6.b {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public static boolean c(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // xsna.kt6.b
        @SuppressLint({"WrongCall"})
        public final void a(ConstraintWidget constraintWidget, kt6.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int max;
            int max2;
            boolean z;
            int baseline;
            int i;
            int childMeasureSpec;
            if (constraintWidget == null) {
                return;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.M;
            ConstraintAnchor constraintAnchor2 = constraintWidget.K;
            if (constraintWidget.j0 == 8 && !constraintWidget.G) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (constraintWidget.W == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = (View) constraintWidget.i0;
            int[] iArr = a.a;
            int i6 = iArr[dimensionBehaviour.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                } else if (i6 == 3) {
                    int i7 = this.f;
                    int i8 = constraintAnchor2 != null ? constraintAnchor2.g : 0;
                    if (constraintAnchor != null) {
                        i8 += constraintAnchor.g;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
                } else if (i6 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                    boolean z2 = constraintWidget.s == 1;
                    int i9 = aVar.j;
                    if (i9 == 1 || i9 == 2) {
                        boolean z3 = view.getMeasuredHeight() == constraintWidget.p();
                        if (aVar.j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || constraintWidget.F())) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.v(), 1073741824);
                        }
                    }
                }
                makeMeasureSpec = childMeasureSpec;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            int i10 = iArr[dimensionBehaviour2.ordinal()];
            if (i10 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i10 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (i10 == 3) {
                int i11 = this.g;
                int i12 = constraintAnchor2 != null ? constraintWidget.L.g : 0;
                if (constraintAnchor != null) {
                    i12 += constraintWidget.N.g;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i4 + i12, -1);
            } else if (i10 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z4 = constraintWidget.t == 1;
                int i13 = aVar.j;
                if (i13 == 1 || i13 == 2) {
                    boolean z5 = view.getMeasuredWidth() == constraintWidget.v();
                    if (aVar.j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || constraintWidget.G())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.p(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.W;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (dVar != null && g.b(constraintLayout.j, 256) && view.getMeasuredWidth() == constraintWidget.v() && view.getMeasuredWidth() < dVar.v() && view.getMeasuredHeight() == constraintWidget.p() && view.getMeasuredHeight() < dVar.p() && view.getBaseline() == constraintWidget.d0 && !constraintWidget.E() && c(constraintWidget.I, makeMeasureSpec, constraintWidget.v()) && c(constraintWidget.J, makeMeasureSpec2, constraintWidget.p())) {
                aVar.e = constraintWidget.v();
                aVar.f = constraintWidget.p();
                aVar.g = constraintWidget.d0;
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z6 = dimensionBehaviour == dimensionBehaviour3;
            boolean z7 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z8 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z9 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z10 = z6 && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            boolean z11 = z7 && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (view == null) {
                return;
            }
            b bVar = (b) view.getLayoutParams();
            int i14 = aVar.j;
            if (i14 != 1 && i14 != 2 && z6 && constraintWidget.s == 0 && z7 && constraintWidget.t == 0) {
                z = false;
                i = -1;
                baseline = 0;
                max = 0;
                max2 = 0;
            } else {
                if ((view instanceof o4u0) && (constraintWidget instanceof i)) {
                    ((o4u0) view).u((i) constraintWidget, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                constraintWidget.I = makeMeasureSpec;
                constraintWidget.J = makeMeasureSpec2;
                constraintWidget.g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i15 = constraintWidget.v;
                max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
                int i16 = constraintWidget.w;
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                int i17 = constraintWidget.y;
                max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
                int i18 = makeMeasureSpec2;
                int i19 = constraintWidget.z;
                if (i19 > 0) {
                    max2 = Math.min(i19, max2);
                }
                if (!g.b(constraintLayout.j, 1)) {
                    if (z10 && z8) {
                        max = (int) ((max2 * constraintWidget.Z) + 0.5f);
                    } else if (z11 && z9) {
                        max2 = (int) ((max / constraintWidget.Z) + 0.5f);
                    }
                }
                if (measuredWidth == max && measuredHeight == max2) {
                    baseline = baseline2;
                    z = false;
                } else {
                    if (measuredWidth != max) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    }
                    int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i18;
                    view.measure(makeMeasureSpec, makeMeasureSpec3);
                    constraintWidget.I = makeMeasureSpec;
                    constraintWidget.J = makeMeasureSpec3;
                    z = false;
                    constraintWidget.g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    max = measuredWidth2;
                    max2 = measuredHeight2;
                }
                i = -1;
            }
            boolean z12 = baseline != i ? true : z;
            aVar.i = (max == aVar.c && max2 == aVar.d) ? z : true;
            if (bVar.c0) {
                z12 = true;
            }
            if (z12 && baseline != -1 && constraintWidget.d0 != baseline) {
                aVar.i = true;
            }
            aVar.e = max;
            aVar.f = max2;
            aVar.h = z12;
            aVar.g = baseline;
        }

        @Override // xsna.kt6.b
        public final void b() {
            ConstraintLayout constraintLayout = this.a;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.c != null) {
                        b bVar = (b) placeholder.getLayoutParams();
                        b bVar2 = (b) placeholder.c.getLayoutParams();
                        ConstraintWidget constraintWidget = bVar2.q0;
                        constraintWidget.j0 = 0;
                        ConstraintWidget constraintWidget2 = bVar.q0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.V[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.W(constraintWidget.v());
                        }
                        ConstraintWidget constraintWidget3 = bVar.q0;
                        if (constraintWidget3.V[1] != dimensionBehaviour2) {
                            constraintWidget3.R(bVar2.q0.p());
                        }
                        bVar2.q0.j0 = 8;
                    }
                }
            }
            int size = constraintLayout.c.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    constraintLayout.c.get(i2).getClass();
                }
            }
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new androidx.constraintlayout.core.widgets.d();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = new SparseArray<>();
        this.p = new c(this);
        this.q = 0;
        this.r = 0;
        I4(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static d getSharedValues() {
        if (s == null) {
            s = new d();
        }
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F4(boolean z, View view, ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        b bVar2;
        ConstraintWidget constraintWidget6;
        float f;
        int i;
        ConstraintWidget constraintWidget7 = constraintWidget;
        bVar.a();
        constraintWidget7.j0 = view.getVisibility();
        if (bVar.f0) {
            constraintWidget7.G = true;
            constraintWidget7.j0 = 8;
        }
        constraintWidget7.i0 = view;
        if (view instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a) view).p(constraintWidget7, this.d.A0);
        }
        if (bVar.d0) {
            f fVar = (f) constraintWidget7;
            int i2 = bVar.n0;
            int i3 = bVar.o0;
            float f2 = bVar.p0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    fVar.v0 = f2;
                    fVar.w0 = -1;
                    fVar.x0 = -1;
                    return;
                }
                return;
            }
            if (i2 != -1) {
                if (i2 > -1) {
                    fVar.v0 = -1.0f;
                    fVar.w0 = i2;
                    fVar.x0 = -1;
                    return;
                }
                return;
            }
            if (i3 == -1 || i3 <= -1) {
                return;
            }
            fVar.v0 = -1.0f;
            fVar.w0 = -1;
            fVar.x0 = i3;
            return;
        }
        int i4 = bVar.g0;
        int i5 = bVar.h0;
        int i6 = bVar.i0;
        int i7 = bVar.j0;
        int i8 = bVar.k0;
        int i9 = bVar.l0;
        float f3 = bVar.m0;
        int i10 = bVar.p;
        if (i10 != -1) {
            ConstraintWidget constraintWidget8 = sparseArray.get(i10);
            if (constraintWidget8 != null) {
                float f4 = bVar.r;
                int i11 = bVar.q;
                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                constraintWidget.A(type, constraintWidget8, type, i11, 0);
                constraintWidget7 = constraintWidget;
                constraintWidget7.E = f4;
            }
            constraintWidget6 = constraintWidget7;
            bVar2 = bVar;
        } else {
            if (i4 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i4);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                    constraintWidget.A(type2, constraintWidget9, type2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            } else if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                constraintWidget.A(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
            }
            if (i6 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i6);
                if (constraintWidget10 != null) {
                    constraintWidget.A(ConstraintAnchor.Type.RIGHT, constraintWidget10, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.A(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i12 = bVar.i;
            if (i12 != -1) {
                ConstraintWidget constraintWidget11 = sparseArray.get(i12);
                if (constraintWidget11 != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                    constraintWidget.A(type4, constraintWidget11, type4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i13 = bVar.j;
                if (i13 != -1 && (constraintWidget4 = sparseArray.get(i13)) != null) {
                    constraintWidget.A(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i14 = bVar.k;
            if (i14 != -1) {
                ConstraintWidget constraintWidget12 = sparseArray.get(i14);
                if (constraintWidget12 != null) {
                    constraintWidget.A(ConstraintAnchor.Type.BOTTOM, constraintWidget12, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i15 = bVar.l;
                if (i15 != -1 && (constraintWidget5 = sparseArray.get(i15)) != null) {
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.A(type5, constraintWidget5, type5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i16 = bVar.m;
            if (i16 != -1) {
                bVar2 = bVar;
                O4(constraintWidget, bVar2, sparseArray, i16, ConstraintAnchor.Type.BASELINE);
            } else {
                bVar2 = bVar;
                int i17 = bVar2.n;
                if (i17 != -1) {
                    O4(constraintWidget, bVar2, sparseArray, i17, ConstraintAnchor.Type.TOP);
                } else {
                    int i18 = bVar2.o;
                    if (i18 != -1) {
                        O4(constraintWidget, bVar2, sparseArray, i18, ConstraintAnchor.Type.BOTTOM);
                        constraintWidget6 = constraintWidget;
                        if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            constraintWidget6.g0 = f3;
                        }
                        f = bVar2.F;
                        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            constraintWidget6.h0 = f;
                        }
                    }
                }
            }
            constraintWidget6 = constraintWidget;
            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            f = bVar2.F;
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
        if (z && ((i = bVar2.T) != -1 || bVar2.U != -1)) {
            int i19 = bVar2.U;
            constraintWidget6.b0 = i;
            constraintWidget6.c0 = i19;
        }
        if (bVar2.a0) {
            constraintWidget6.S(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.W(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                constraintWidget6.S(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.W) {
                constraintWidget6.S(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.S(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.n(ConstraintAnchor.Type.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            constraintWidget6.n(ConstraintAnchor.Type.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            constraintWidget6.S(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.W(0);
        }
        if (bVar2.b0) {
            constraintWidget6.U(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.R(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                constraintWidget6.U(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.X) {
                constraintWidget6.U(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.U(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.n(ConstraintAnchor.Type.TOP).g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            constraintWidget6.n(ConstraintAnchor.Type.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            constraintWidget6.U(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.R(0);
        }
        constraintWidget6.O(bVar2.G);
        float f5 = bVar2.H;
        float[] fArr = constraintWidget6.o0;
        fArr[0] = f5;
        fArr[1] = bVar2.I;
        constraintWidget6.m0 = bVar2.J;
        constraintWidget6.n0 = bVar2.K;
        int i20 = bVar2.Z;
        if (i20 >= 0 && i20 <= 3) {
            constraintWidget6.r = i20;
        }
        constraintWidget6.T(bVar2.R, bVar2.L, bVar2.N, bVar2.P);
        constraintWidget6.V(bVar2.S, bVar2.M, bVar2.O, bVar2.Q);
    }

    public final View G4(int i) {
        return this.b.get(i);
    }

    public final ConstraintWidget H4(View view) {
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).q0;
        }
        view.setLayoutParams(new b(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).q0;
        }
        return null;
    }

    public final void I4(AttributeSet attributeSet, int i, int i2) {
        androidx.constraintlayout.core.widgets.d dVar = this.d;
        dVar.i0 = this;
        c cVar = this.p;
        dVar.z0 = cVar;
        dVar.x0.f = cVar;
        this.b.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 17) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 14) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 15) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 113) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            L4(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.k = bVar;
                        bVar.w(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        dVar.I0 = this.j;
        androidx.constraintlayout.core.c.q = dVar.f0(512);
    }

    public final boolean J4() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void L4(int i) {
        this.l = new d6j(getContext(), this, i);
    }

    public final void M4(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.p;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.h, resolveSizeAndState2);
        if (z) {
            min |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        if (z2) {
            min2 |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        setMeasuredDimension(min, min2);
    }

    public final void N4(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i4;
        int max;
        int max2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i5 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        c cVar = this.p;
        cVar.b = max3;
        cVar.c = max4;
        cVar.d = paddingWidth;
        cVar.e = i5;
        cVar.f = i2;
        cVar.g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if (J4()) {
            max5 = max6;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        int i8 = cVar.e;
        int i9 = cVar.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.e);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviour;
                i4 = max;
                dimensionBehaviour2 = dimensionBehaviour4;
            } else {
                dimensionBehaviour2 = dimensionBehaviour;
                i4 = i6;
            }
        } else if (mode != 0) {
            i4 = mode != 1073741824 ? 0 : Math.min(this.g - i9, i6);
            dimensionBehaviour2 = dimensionBehaviour3;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.e);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour42 = dimensionBehaviour;
                i4 = max;
                dimensionBehaviour2 = dimensionBehaviour42;
            } else {
                dimensionBehaviour2 = dimensionBehaviour;
                i4 = 0;
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            max2 = childCount == 0 ? Math.max(0, this.f) : i7;
        } else if (mode2 != 0) {
            if (mode2 == 1073741824) {
                max2 = Math.min(this.h - i8, i7);
            }
            max2 = 0;
        } else {
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                max2 = Math.max(0, this.f);
            }
            max2 = 0;
        }
        if (i4 != dVar.v() || max2 != dVar.p()) {
            dVar.x0.c = true;
        }
        dVar.b0 = 0;
        dVar.c0 = 0;
        int i10 = this.g - i9;
        int[] iArr = dVar.D;
        iArr[0] = i10;
        iArr[1] = this.h - i8;
        dVar.e0 = 0;
        dVar.f0 = 0;
        dVar.S(dimensionBehaviour2);
        dVar.W(i4);
        dVar.U(dimensionBehaviour3);
        dVar.R(max2);
        int i11 = this.e - i9;
        if (i11 < 0) {
            dVar.e0 = 0;
        } else {
            dVar.e0 = i11;
        }
        int i12 = this.f - i8;
        if (i12 < 0) {
            dVar.f0 = 0;
        } else {
            dVar.f0 = i12;
        }
        dVar.d0(i, mode, i6, mode2, i7, max5, max3);
    }

    public final void O4(ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.b.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.c0 = true;
            bVar2.q0.F = true;
        }
        constraintWidget.n(type2).b(constraintWidget2.n(type), bVar.D, bVar.C, true);
        constraintWidget.F = true;
        constraintWidget.n(ConstraintAnchor.Type.TOP).j();
        constraintWidget.n(ConstraintAnchor.Type.BOTTOM).j();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(StringUtils.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f;
    }

    public int getMinWidth() {
        return this.e;
    }

    public int getOptimizationLevel() {
        return this.d.I0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        androidx.constraintlayout.core.widgets.d dVar = this.d;
        if (dVar.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                dVar.k = getContext().getResources().getResourceEntryName(id2);
            } else {
                dVar.k = "parent";
            }
        }
        if (dVar.l0 == null) {
            dVar.l0 = dVar.k;
        }
        Iterator<ConstraintWidget> it = dVar.v0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.i0;
            if (view != null) {
                if (next.k == null && (id = view.getId()) != -1) {
                    next.k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.l0 == null) {
                    next.l0 = next.k;
                }
            }
        }
        dVar.s(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.q0;
            if ((childAt.getVisibility() != 8 || bVar.d0 || bVar.e0 || isInEditMode) && !bVar.f0) {
                int w = constraintWidget.w();
                int x = constraintWidget.x();
                int v = constraintWidget.v() + w;
                int p = constraintWidget.p() + x;
                childAt.layout(w, x, v, p);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(w, x, v, p);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).q();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int k;
        String resourceName;
        int id;
        ConstraintWidget constraintWidget;
        if (this.q == i) {
            int i3 = this.r;
        }
        int i4 = 0;
        if (!this.i) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                if (getChildAt(i5).isLayoutRequested()) {
                    this.i = true;
                    break;
                }
                i5++;
            }
        }
        this.q = i;
        this.r = i2;
        boolean J4 = J4();
        androidx.constraintlayout.core.widgets.d dVar = this.d;
        dVar.A0 = J4;
        if (this.i) {
            this.i = false;
            int childCount2 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i6).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i6++;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i7 = 0; i7 < childCount3; i7++) {
                    ConstraintWidget H4 = H4(getChildAt(i7));
                    if (H4 != null) {
                        H4.H();
                    }
                }
                if (isInEditMode) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt = getChildAt(i8);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.n == null) {
                                    this.n = new HashMap<>();
                                }
                                int indexOf = resourceName.indexOf(DomExceptionUtils.SEPARATOR);
                                this.n.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = this.b.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                constraintWidget = view == null ? null : ((b) view.getLayoutParams()).q0;
                                constraintWidget.l0 = resourceName;
                            }
                        }
                        constraintWidget = dVar;
                        constraintWidget.l0 = resourceName;
                    }
                }
                if (this.m != -1) {
                    for (int i9 = 0; i9 < childCount3; i9++) {
                        View childAt2 = getChildAt(i9);
                        if (childAt2.getId() == this.m && (childAt2 instanceof androidx.constraintlayout.widget.c)) {
                            this.k = ((androidx.constraintlayout.widget.c) childAt2).getConstraintSet();
                        }
                    }
                }
                androidx.constraintlayout.widget.b bVar = this.k;
                if (bVar != null) {
                    bVar.c(this);
                }
                dVar.v0.clear();
                ArrayList<androidx.constraintlayout.widget.a> arrayList = this.c;
                int size = arrayList.size();
                if (size > 0) {
                    int i10 = 0;
                    while (i10 < size) {
                        androidx.constraintlayout.widget.a aVar = arrayList.get(i10);
                        HashMap<Integer, String> hashMap = aVar.i;
                        if (aVar.isInEditMode()) {
                            aVar.setIds(aVar.f);
                        }
                        e2v e2vVar = aVar.e;
                        if (e2vVar != null) {
                            e2vVar.a();
                            for (int i11 = i4; i11 < aVar.c; i11++) {
                                int i12 = aVar.b[i11];
                                View G4 = G4(i12);
                                if (G4 == null && (k = aVar.k(this, (str = hashMap.get(Integer.valueOf(i12))))) != 0) {
                                    aVar.b[i11] = k;
                                    hashMap.put(Integer.valueOf(k), str);
                                    G4 = G4(k);
                                }
                                View view2 = G4;
                                if (view2 != null) {
                                    aVar.e.c(H4(view2));
                                }
                            }
                            aVar.e.b();
                        }
                        i10++;
                        i4 = 0;
                    }
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.b == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.d);
                        }
                        View findViewById = findViewById(placeholder.b);
                        placeholder.c = findViewById;
                        if (findViewById != null) {
                            ((b) findViewById.getLayoutParams()).f0 = true;
                            placeholder.c.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                SparseArray<ConstraintWidget> sparseArray = this.o;
                sparseArray.clear();
                sparseArray.put(0, dVar);
                sparseArray.put(getId(), dVar);
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt4 = getChildAt(i14);
                    sparseArray.put(childAt4.getId(), H4(childAt4));
                }
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt5 = getChildAt(i15);
                    ConstraintWidget H42 = H4(childAt5);
                    if (H42 != null) {
                        b bVar2 = (b) childAt5.getLayoutParams();
                        dVar.c(H42);
                        F4(isInEditMode, childAt5, H42, bVar2, sparseArray);
                    }
                }
            }
            if (z) {
                dVar.w0.c(dVar);
            }
        }
        N4(dVar, this.j, i, i2);
        M4(i, i2, dVar.v(), dVar.p(), dVar.J0, dVar.K0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget H4 = H4(view);
        if ((view instanceof Guideline) && !(H4 instanceof f)) {
            b bVar = (b) view.getLayoutParams();
            f fVar = new f();
            bVar.q0 = fVar;
            bVar.d0 = true;
            fVar.a0(bVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) view;
            aVar.t();
            ((b) view.getLayoutParams()).e0 = true;
            ArrayList<androidx.constraintlayout.widget.a> arrayList = this.c;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
        }
        this.b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.b.remove(view.getId());
        ConstraintWidget H4 = H4(view);
        this.d.v0.remove(H4);
        H4.H();
        this.c.remove(view);
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.k = bVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.b;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(q6j q6jVar) {
        d6j d6jVar = this.l;
        if (d6jVar != null) {
            d6jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.j = i;
        androidx.constraintlayout.core.widgets.d dVar = this.d;
        dVar.I0 = i;
        androidx.constraintlayout.core.c.q = dVar.f0(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new androidx.constraintlayout.core.widgets.d();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = new SparseArray<>();
        this.p = new c(this);
        this.q = 0;
        this.r = 0;
        I4(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new androidx.constraintlayout.core.widgets.d();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = new SparseArray<>();
        this.p = new c(this);
        this.q = 0;
        this.r = 0;
        I4(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new androidx.constraintlayout.core.widgets.d();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = new SparseArray<>();
        this.p = new c(this);
        this.q = 0;
        this.r = 0;
        I4(attributeSet, i, i2);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public final boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public ConstraintWidget q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.b.A(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.b.z(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.b.z(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.q0 instanceof f)) {
                this.q0 = new f();
            }
            ((f) this.q0).a0(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.i0 = -1;
            this.j0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.k0 = this.w;
            this.l0 = this.y;
            float f = this.E;
            this.m0 = f;
            int i8 = this.a;
            this.n0 = i8;
            int i9 = this.b;
            this.o0 = i9;
            float f2 = this.c;
            this.p0 = f2;
            if (z2) {
                int i10 = this.s;
                if (i10 != -1) {
                    this.i0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.j0 = i11;
                    }
                    i2 = this.u;
                    if (i2 != -1) {
                        this.h0 = i2;
                        z = true;
                    }
                    i3 = this.v;
                    if (i3 != -1) {
                        this.g0 = i3;
                        z = true;
                    }
                    i4 = this.A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.l0 = i4;
                    }
                    i5 = this.B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.k0 = i5;
                    }
                    if (z) {
                        this.m0 = 1.0f - f;
                    }
                    if (this.d0 && this.V == 1 && this.d) {
                        if (f2 == -1.0f) {
                            this.p0 = 1.0f - f2;
                            this.n0 = -1;
                            this.o0 = -1;
                        } else if (i8 != -1) {
                            this.o0 = i8;
                            this.n0 = -1;
                            this.p0 = -1.0f;
                        } else if (i9 != -1) {
                            this.n0 = i9;
                            this.o0 = -1;
                            this.p0 = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                }
                i3 = this.v;
                if (i3 != -1) {
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.d0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.h0 = i12;
                }
                int i13 = this.t;
                if (i13 != -1) {
                    this.g0 = i13;
                }
                int i14 = this.u;
                if (i14 != -1) {
                    this.i0 = i14;
                }
                int i15 = this.v;
                if (i15 != -1) {
                    this.j0 = i15;
                }
                int i16 = this.A;
                if (i16 != Integer.MIN_VALUE) {
                    this.k0 = i16;
                }
                int i17 = this.B;
                if (i17 != Integer.MIN_VALUE) {
                    this.l0 = i17;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int i18 = this.g;
                if (i18 != -1) {
                    this.i0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.j0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.e;
                if (i20 != -1) {
                    this.g0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f;
                if (i21 != -1) {
                    this.h0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
        }
    }
}
