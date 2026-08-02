package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bm3;
import defpackage.bn3;
import defpackage.cm3;
import defpackage.dm3;
import defpackage.h8b;
import defpackage.jjc;
import defpackage.mm3;
import defpackage.pvd;
import defpackage.ql3;
import defpackage.s49;
import defpackage.sl3;
import defpackage.t99;
import defpackage.tl3;
import defpackage.ueh;
import defpackage.ul3;
import defpackage.vjf;
import defpackage.vl3;
import defpackage.wm3;
import defpackage.xm3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static ueh sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ql3> mConstraintHelpers;
    protected dm3 mConstraintLayoutSpec;
    private mm3 mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected xm3 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    ul3 mMeasurer;
    private jjc mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<vl3> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<wm3> mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new xm3();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new ul3(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(null, 0);
    }

    public static /* synthetic */ jjc access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static ueh getSharedValues() {
        ueh uehVar = sSharedValues;
        if (uehVar != null) {
            return uehVar;
        }
        ueh uehVar2 = new ueh();
        new SparseIntArray();
        new HashMap();
        sSharedValues = uehVar2;
        return uehVar2;
    }

    public final void a(AttributeSet attributeSet, int i) {
        xm3 xm3Var = this.mLayoutWidget;
        xm3Var.g0 = this;
        ul3 ul3Var = this.mMeasurer;
        xm3Var.v0 = ul3Var;
        xm3Var.t0.h = ul3Var;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vjf.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        mm3 mm3Var = new mm3();
                        this.mConstraintSet = mm3Var;
                        mm3Var.k(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        xm3 xm3Var2 = this.mLayoutWidget;
        xm3Var2.E0 = this.mOptimizationLevel;
        h8b.q = xm3Var2.c0(512);
    }

    public void addValueModifier(vl3 vl3Var) {
        ArrayList<vl3> arrayList = this.mModifiers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mModifiers = arrayList;
        }
        arrayList.add(vl3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyConstraintsFromLayoutParams(boolean z, View view, wm3 wm3Var, tl3 tl3Var, SparseArray<wm3> sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        wm3 wm3Var2;
        int i2;
        int i3;
        int i4;
        wm3 wm3Var3;
        int i5;
        int i6;
        int i7;
        wm3 wm3Var4;
        int i8;
        int i9;
        int i10;
        int i11;
        wm3 wm3Var5;
        int i12;
        tl3 tl3Var2;
        wm3 wm3Var6;
        int i13;
        float f;
        int i14;
        wm3 wm3Var7 = wm3Var;
        tl3Var.a();
        wm3Var7.h0 = view.getVisibility();
        wm3Var7.g0 = view;
        if (view instanceof ql3) {
            constraintLayout = this;
            ((ql3) view).i(wm3Var7, constraintLayout.mLayoutWidget.w0);
        } else {
            constraintLayout = this;
        }
        if (tl3Var.d0) {
            s49 s49Var = (s49) wm3Var7;
            int i15 = tl3Var.m0;
            int i16 = tl3Var.n0;
            float f2 = tl3Var.o0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    s49Var.r0 = f2;
                    s49Var.s0 = -1;
                    s49Var.t0 = -1;
                    return;
                }
                return;
            }
            if (i15 != -1) {
                if (i15 > -1) {
                    s49Var.r0 = -1.0f;
                    s49Var.s0 = i15;
                    s49Var.t0 = -1;
                    return;
                }
                return;
            }
            if (i16 == -1 || i16 <= -1) {
                return;
            }
            s49Var.r0 = -1.0f;
            s49Var.s0 = -1;
            s49Var.t0 = i16;
            return;
        }
        int i17 = tl3Var.f0;
        int i18 = tl3Var.g0;
        int i19 = tl3Var.h0;
        int i20 = tl3Var.i0;
        int i21 = tl3Var.j0;
        int i22 = tl3Var.k0;
        float f3 = tl3Var.l0;
        int i23 = tl3Var.p;
        if (i23 != -1) {
            wm3 wm3Var8 = sparseArray.get(i23);
            if (wm3Var8 != null) {
                float f4 = tl3Var.r;
                wm3Var.w(7, 7, tl3Var.q, 0, wm3Var8);
                wm3Var7 = wm3Var;
                wm3Var7.E = f4;
            }
            wm3Var6 = wm3Var7;
            tl3Var2 = tl3Var;
            i5 = 4;
            i4 = 2;
            i13 = 5;
            i11 = 3;
        } else {
            if (i17 != -1) {
                wm3 wm3Var9 = sparseArray.get(i17);
                if (wm3Var9 != null) {
                    i = 2;
                    wm3Var7.w(2, 2, ((ViewGroup.MarginLayoutParams) tl3Var).leftMargin, i21, wm3Var9);
                } else {
                    i = 2;
                }
            } else {
                i = 2;
                if (i18 != -1 && (wm3Var2 = sparseArray.get(i18)) != null) {
                    wm3Var.w(2, 4, ((ViewGroup.MarginLayoutParams) tl3Var).leftMargin, i21, wm3Var2);
                    i2 = 2;
                    i3 = 4;
                    if (i19 == -1) {
                        wm3 wm3Var10 = sparseArray.get(i19);
                        if (wm3Var10 != null) {
                            wm3Var.w(i3, i2, ((ViewGroup.MarginLayoutParams) tl3Var).rightMargin, i22, wm3Var10);
                        }
                        i4 = i2;
                    } else {
                        i4 = i2;
                        if (i20 != -1 && (wm3Var3 = sparseArray.get(i20)) != null) {
                            wm3Var.w(i3, i3, ((ViewGroup.MarginLayoutParams) tl3Var).rightMargin, i22, wm3Var3);
                        }
                    }
                    i5 = i3;
                    i6 = tl3Var.i;
                    if (i6 == -1) {
                        wm3 wm3Var11 = sparseArray.get(i6);
                        if (wm3Var11 != null) {
                            i7 = 3;
                            wm3Var.w(3, 3, ((ViewGroup.MarginLayoutParams) tl3Var).topMargin, tl3Var.x, wm3Var11);
                        } else {
                            i7 = 3;
                        }
                    } else {
                        i7 = 3;
                        int i24 = tl3Var.j;
                        if (i24 != -1 && (wm3Var4 = sparseArray.get(i24)) != null) {
                            wm3Var.w(3, 5, ((ViewGroup.MarginLayoutParams) tl3Var).topMargin, tl3Var.x, wm3Var4);
                            i8 = 3;
                            i9 = 5;
                            i10 = tl3Var.k;
                            if (i10 != -1) {
                                wm3 wm3Var12 = sparseArray.get(i10);
                                if (wm3Var12 != null) {
                                    wm3Var.w(i9, i8, ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin, tl3Var.z, wm3Var12);
                                }
                                i11 = i8;
                            } else {
                                i11 = i8;
                                int i25 = tl3Var.l;
                                if (i25 != -1 && (wm3Var5 = sparseArray.get(i25)) != null) {
                                    wm3Var.w(i9, i9, ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin, tl3Var.z, wm3Var5);
                                }
                            }
                            int i26 = i9;
                            i12 = tl3Var.m;
                            if (i12 != -1) {
                                tl3Var2 = tl3Var;
                                constraintLayout.e(wm3Var, tl3Var2, sparseArray, i12, 6);
                            } else {
                                tl3Var2 = tl3Var;
                                int i27 = tl3Var2.n;
                                if (i27 != -1) {
                                    e(wm3Var, tl3Var2, sparseArray, i27, i11);
                                } else {
                                    int i28 = tl3Var2.o;
                                    if (i28 != -1) {
                                        e(wm3Var, tl3Var2, sparseArray, i28, i26);
                                        wm3Var6 = wm3Var;
                                        i13 = i26;
                                        if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            wm3Var6.e0 = f3;
                                        }
                                        f = tl3Var2.F;
                                        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            wm3Var6.f0 = f;
                                        }
                                    }
                                }
                            }
                            wm3Var6 = wm3Var;
                            i13 = i26;
                            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            f = tl3Var2.F;
                            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                        }
                    }
                    i8 = i7;
                    i9 = 5;
                    i10 = tl3Var.k;
                    if (i10 != -1) {
                    }
                    int i262 = i9;
                    i12 = tl3Var.m;
                    if (i12 != -1) {
                    }
                    wm3Var6 = wm3Var;
                    i13 = i262;
                    if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    f = tl3Var2.F;
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                }
            }
            i2 = i;
            i3 = 4;
            if (i19 == -1) {
            }
            i5 = i3;
            i6 = tl3Var.i;
            if (i6 == -1) {
            }
            i8 = i7;
            i9 = 5;
            i10 = tl3Var.k;
            if (i10 != -1) {
            }
            int i2622 = i9;
            i12 = tl3Var.m;
            if (i12 != -1) {
            }
            wm3Var6 = wm3Var;
            i13 = i2622;
            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            f = tl3Var2.F;
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
        if (z && ((i14 = tl3Var2.T) != -1 || tl3Var2.U != -1)) {
            int i29 = tl3Var2.U;
            wm3Var6.Z = i14;
            wm3Var6.a0 = i29;
        }
        if (tl3Var2.a0) {
            wm3Var6.O(1);
            wm3Var6.S(((ViewGroup.MarginLayoutParams) tl3Var2).width);
            if (((ViewGroup.MarginLayoutParams) tl3Var2).width == -2) {
                wm3Var6.O(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) tl3Var2).width == -1) {
            if (tl3Var2.W) {
                wm3Var6.O(3);
            } else {
                wm3Var6.O(4);
            }
            wm3Var6.j(i4).g = ((ViewGroup.MarginLayoutParams) tl3Var2).leftMargin;
            wm3Var6.j(i5).g = ((ViewGroup.MarginLayoutParams) tl3Var2).rightMargin;
        } else {
            wm3Var6.O(3);
            wm3Var6.S(0);
        }
        if (tl3Var2.b0) {
            wm3Var6.Q(1);
            wm3Var6.N(((ViewGroup.MarginLayoutParams) tl3Var2).height);
            if (((ViewGroup.MarginLayoutParams) tl3Var2).height == -2) {
                wm3Var6.Q(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) tl3Var2).height == -1) {
            if (tl3Var2.X) {
                wm3Var6.Q(3);
            } else {
                wm3Var6.Q(4);
            }
            wm3Var6.j(i11).g = ((ViewGroup.MarginLayoutParams) tl3Var2).topMargin;
            wm3Var6.j(i13).g = ((ViewGroup.MarginLayoutParams) tl3Var2).bottomMargin;
        } else {
            wm3Var6.Q(3);
            wm3Var6.N(0);
        }
        wm3Var6.K(tl3Var2.G);
        float f5 = tl3Var2.H;
        float[] fArr = wm3Var6.l0;
        fArr[0] = f5;
        fArr[1] = tl3Var2.I;
        wm3Var6.j0 = tl3Var2.J;
        wm3Var6.k0 = tl3Var2.K;
        int i30 = tl3Var2.Z;
        if (i30 >= 0 && i30 <= 3) {
            wm3Var6.r = i30;
        }
        wm3Var6.P(tl3Var2.L, tl3Var2.R, tl3Var2.N, tl3Var2.P);
        wm3Var6.R(tl3Var2.M, tl3Var2.S, tl3Var2.O, tl3Var2.Q);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tl3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ql3> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).getClass();
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
                    String[] split = ((String) tag).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
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

    public boolean dynamicUpdateConstraints(int i, int i2) {
        Iterator it;
        if (this.mModifiers != null) {
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
            Iterator<vl3> it2 = this.mModifiers.iterator();
            do {
                if (it2.hasNext()) {
                    if (it2.next() == null) {
                        it = this.mLayoutWidget.r0.iterator();
                    } else {
                        pvd.j();
                    }
                }
            } while (!it.hasNext());
            View view = (View) ((wm3) it.next()).g0;
            view.getId();
            throw null;
        }
        return false;
    }

    public final void e(wm3 wm3Var, tl3 tl3Var, SparseArray sparseArray, int i, int i2) {
        View view = this.mChildrenByIds.get(i);
        wm3 wm3Var2 = (wm3) sparseArray.get(i);
        if (wm3Var2 == null || view == null || !(view.getLayoutParams() instanceof tl3)) {
            return;
        }
        tl3Var.c0 = true;
        if (i2 == 6) {
            tl3 tl3Var2 = (tl3) view.getLayoutParams();
            tl3Var2.c0 = true;
            tl3Var2.p0.F = true;
        }
        wm3Var.j(6).b(wm3Var2.j(i2), tl3Var.D, tl3Var.C, true);
        wm3Var.F = true;
        wm3Var.j(3).j();
        wm3Var.j(5).j();
    }

    public void fillMetrics(jjc jjcVar) {
        this.mLayoutWidget.x0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public tl3 generateDefaultLayoutParams() {
        return new tl3(-2, -2);
    }

    @Override // android.view.ViewGroup
    public tl3 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        tl3 tl3Var = new tl3(context, attributeSet);
        tl3Var.a = -1;
        tl3Var.b = -1;
        tl3Var.c = -1.0f;
        tl3Var.d = true;
        tl3Var.e = -1;
        tl3Var.f = -1;
        tl3Var.g = -1;
        tl3Var.h = -1;
        tl3Var.i = -1;
        tl3Var.j = -1;
        tl3Var.k = -1;
        tl3Var.l = -1;
        tl3Var.m = -1;
        tl3Var.n = -1;
        tl3Var.o = -1;
        tl3Var.p = -1;
        tl3Var.q = 0;
        tl3Var.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        tl3Var.s = -1;
        tl3Var.t = -1;
        tl3Var.u = -1;
        tl3Var.v = -1;
        tl3Var.w = Integer.MIN_VALUE;
        tl3Var.x = Integer.MIN_VALUE;
        tl3Var.y = Integer.MIN_VALUE;
        tl3Var.z = Integer.MIN_VALUE;
        tl3Var.A = Integer.MIN_VALUE;
        tl3Var.B = Integer.MIN_VALUE;
        tl3Var.C = Integer.MIN_VALUE;
        tl3Var.D = 0;
        tl3Var.E = 0.5f;
        tl3Var.F = 0.5f;
        tl3Var.G = null;
        tl3Var.H = -1.0f;
        tl3Var.I = -1.0f;
        tl3Var.J = 0;
        tl3Var.K = 0;
        tl3Var.L = 0;
        tl3Var.M = 0;
        tl3Var.N = 0;
        tl3Var.O = 0;
        tl3Var.P = 0;
        tl3Var.Q = 0;
        tl3Var.R = 1.0f;
        tl3Var.S = 1.0f;
        tl3Var.T = -1;
        tl3Var.U = -1;
        tl3Var.V = -1;
        tl3Var.W = false;
        tl3Var.X = false;
        tl3Var.Y = null;
        tl3Var.Z = 0;
        tl3Var.a0 = true;
        tl3Var.b0 = true;
        tl3Var.c0 = false;
        tl3Var.d0 = false;
        tl3Var.e0 = false;
        tl3Var.f0 = -1;
        tl3Var.g0 = -1;
        tl3Var.h0 = -1;
        tl3Var.i0 = -1;
        tl3Var.j0 = Integer.MIN_VALUE;
        tl3Var.k0 = Integer.MIN_VALUE;
        tl3Var.l0 = 0.5f;
        tl3Var.p0 = new wm3();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vjf.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = sl3.a.get(index);
            switch (i2) {
                case 1:
                    tl3Var.V = obtainStyledAttributes.getInt(index, tl3Var.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, tl3Var.p);
                    tl3Var.p = resourceId;
                    if (resourceId == -1) {
                        tl3Var.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    tl3Var.q = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, tl3Var.r) % 360.0f;
                    tl3Var.r = f;
                    if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        tl3Var.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    tl3Var.a = obtainStyledAttributes.getDimensionPixelOffset(index, tl3Var.a);
                    break;
                case 6:
                    tl3Var.b = obtainStyledAttributes.getDimensionPixelOffset(index, tl3Var.b);
                    break;
                case 7:
                    tl3Var.c = obtainStyledAttributes.getFloat(index, tl3Var.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, tl3Var.e);
                    tl3Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        tl3Var.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, tl3Var.f);
                    tl3Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        tl3Var.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, tl3Var.g);
                    tl3Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        tl3Var.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, tl3Var.h);
                    tl3Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        tl3Var.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, tl3Var.i);
                    tl3Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        tl3Var.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, tl3Var.j);
                    tl3Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        tl3Var.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, tl3Var.k);
                    tl3Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        tl3Var.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, tl3Var.l);
                    tl3Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        tl3Var.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, tl3Var.m);
                    tl3Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        tl3Var.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, tl3Var.s);
                    tl3Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        tl3Var.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, tl3Var.t);
                    tl3Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        tl3Var.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, tl3Var.u);
                    tl3Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        tl3Var.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, tl3Var.v);
                    tl3Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        tl3Var.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    tl3Var.w = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.w);
                    break;
                case 22:
                    tl3Var.x = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.x);
                    break;
                case 23:
                    tl3Var.y = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.y);
                    break;
                case 24:
                    tl3Var.z = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.z);
                    break;
                case 25:
                    tl3Var.A = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.A);
                    break;
                case 26:
                    tl3Var.B = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.B);
                    break;
                case 27:
                    tl3Var.W = obtainStyledAttributes.getBoolean(index, tl3Var.W);
                    break;
                case 28:
                    tl3Var.X = obtainStyledAttributes.getBoolean(index, tl3Var.X);
                    break;
                case 29:
                    tl3Var.E = obtainStyledAttributes.getFloat(index, tl3Var.E);
                    break;
                case 30:
                    tl3Var.F = obtainStyledAttributes.getFloat(index, tl3Var.F);
                    break;
                case 31:
                    tl3Var.L = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    tl3Var.M = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        tl3Var.N = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, tl3Var.N) == -2) {
                            tl3Var.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        tl3Var.P = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, tl3Var.P) == -2) {
                            tl3Var.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    tl3Var.R = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obtainStyledAttributes.getFloat(index, tl3Var.R));
                    tl3Var.L = 2;
                    break;
                case 36:
                    try {
                        tl3Var.O = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, tl3Var.O) == -2) {
                            tl3Var.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        tl3Var.Q = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, tl3Var.Q) == -2) {
                            tl3Var.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    tl3Var.S = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obtainStyledAttributes.getFloat(index, tl3Var.S));
                    tl3Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            mm3.n(tl3Var, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            tl3Var.H = obtainStyledAttributes.getFloat(index, tl3Var.H);
                            break;
                        case 46:
                            tl3Var.I = obtainStyledAttributes.getFloat(index, tl3Var.I);
                            break;
                        case 47:
                            tl3Var.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            tl3Var.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            tl3Var.T = obtainStyledAttributes.getDimensionPixelOffset(index, tl3Var.T);
                            break;
                        case 50:
                            tl3Var.U = obtainStyledAttributes.getDimensionPixelOffset(index, tl3Var.U);
                            break;
                        case 51:
                            tl3Var.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, tl3Var.n);
                            tl3Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                tl3Var.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, tl3Var.o);
                            tl3Var.o = resourceId16;
                            if (resourceId16 == -1) {
                                tl3Var.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            tl3Var.D = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.D);
                            break;
                        case 55:
                            tl3Var.C = obtainStyledAttributes.getDimensionPixelSize(index, tl3Var.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    mm3.m(tl3Var, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    mm3.m(tl3Var, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    tl3Var.Z = obtainStyledAttributes.getInt(index, tl3Var.Z);
                                    break;
                                case 67:
                                    tl3Var.d = obtainStyledAttributes.getBoolean(index, tl3Var.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        tl3Var.a();
        return tl3Var;
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        xm3 xm3Var = this.mLayoutWidget;
        if (xm3Var.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                String resourceEntryName = getContext().getResources().getResourceEntryName(id2);
                xm3 xm3Var2 = this.mLayoutWidget;
                xm3Var2.k = resourceEntryName;
                xm3Var = xm3Var2;
            } else {
                xm3Var = this.mLayoutWidget;
                xm3Var.k = "parent";
            }
        }
        if (xm3Var.i0 == null) {
            xm3Var.i0 = xm3Var.k;
        }
        Iterator it = xm3Var.r0.iterator();
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            View view = (View) wm3Var.g0;
            if (view != null) {
                if (wm3Var.k == null && (id = view.getId()) != -1) {
                    wm3Var.k = getContext().getResources().getResourceEntryName(id);
                }
                if (wm3Var.i0 == null) {
                    wm3Var.i0 = wm3Var.k;
                }
            }
        }
        this.mLayoutWidget.o(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final wm3 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof tl3) {
            return ((tl3) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof tl3) {
            return ((tl3) view.getLayoutParams()).p0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new dm3(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            tl3 tl3Var = (tl3) childAt.getLayoutParams();
            wm3 wm3Var = tl3Var.p0;
            if (childAt.getVisibility() != 8 || tl3Var.d0 || tl3Var.e0 || isInEditMode) {
                int s = wm3Var.s();
                int t = wm3Var.t();
                childAt.layout(s, t, wm3Var.r() + s, wm3Var.l() + t);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).j();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int g;
        wm3 wm3Var;
        boolean dynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = dynamicUpdateConstraints;
        if (!dynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.w0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i4).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    wm3 viewWidget = getViewWidget(getChildAt(i5));
                    if (viewWidget != null) {
                        viewWidget.D();
                    }
                }
                if (isInEditMode) {
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        View childAt = getChildAt(i6);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id == 0) {
                                wm3Var = this.mLayoutWidget;
                            } else {
                                View view = this.mChildrenByIds.get(id);
                                if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                wm3Var = view == this ? this.mLayoutWidget : view == null ? null : ((tl3) view.getLayoutParams()).p0;
                            }
                            wm3Var.i0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                mm3 mm3Var = this.mConstraintSet;
                if (mm3Var != null) {
                    mm3Var.b(this);
                }
                this.mLayoutWidget.r0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    for (int i8 = 0; i8 < size; i8++) {
                        ql3 ql3Var = this.mConstraintHelpers.get(i8);
                        HashMap hashMap = ql3Var.g;
                        if (ql3Var.isInEditMode()) {
                            ql3Var.setIds(ql3Var.e);
                        }
                        t99 t99Var = ql3Var.d;
                        if (t99Var != null) {
                            t99Var.s0 = 0;
                            Arrays.fill(t99Var.r0, (Object) null);
                            for (int i9 = 0; i9 < ql3Var.b; i9++) {
                                int i10 = ql3Var.a[i9];
                                View viewById = getViewById(i10);
                                if (viewById == null && (g = ql3Var.g(this, (str = (String) hashMap.get(Integer.valueOf(i10))))) != 0) {
                                    ql3Var.a[i9] = g;
                                    hashMap.put(Integer.valueOf(g), str);
                                    viewById = getViewById(g);
                                }
                                if (viewById != null) {
                                    ql3Var.d.V(getViewWidget(viewById));
                                }
                            }
                            ql3Var.d.X();
                        }
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    wm3 viewWidget2 = getViewWidget(childAt3);
                    if (viewWidget2 != null) {
                        tl3 tl3Var = (tl3) childAt3.getLayoutParams();
                        this.mLayoutWidget.V(viewWidget2);
                        applyConstraintsFromLayoutParams(isInEditMode, childAt3, viewWidget2, tl3Var, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z) {
                xm3 xm3Var = this.mLayoutWidget;
                xm3Var.s0.H(xm3Var);
            }
        }
        this.mLayoutWidget.x0.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int r = this.mLayoutWidget.r();
        int l = this.mLayoutWidget.l();
        xm3 xm3Var2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, r, l, xm3Var2.F0, xm3Var2.G0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        wm3 viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof s49)) {
            tl3 tl3Var = (tl3) view.getLayoutParams();
            s49 s49Var = new s49();
            tl3Var.p0 = s49Var;
            tl3Var.d0 = true;
            s49Var.W(tl3Var.V);
        }
        if (view instanceof ql3) {
            ql3 ql3Var = (ql3) view;
            ql3Var.k();
            ((tl3) view.getLayoutParams()).e0 = true;
            if (!this.mConstraintHelpers.contains(ql3Var)) {
                this.mConstraintHelpers.add(ql3Var);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        wm3 viewWidget = getViewWidget(view);
        this.mLayoutWidget.r0.remove(viewWidget);
        viewWidget.D();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new dm3(getContext(), this, i);
    }

    public void removeValueModifier(vl3 vl3Var) {
        if (vl3Var == null) {
            return;
        }
        this.mModifiers.remove(vl3Var);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        ul3 ul3Var = this.mMeasurer;
        int i5 = ul3Var.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + ul3Var.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z) {
            min |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        if (z2) {
            min2 |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(xm3 xm3Var, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        ul3 ul3Var = this.mMeasurer;
        ul3Var.b = max;
        ul3Var.c = max2;
        ul3Var.d = paddingWidth;
        ul3Var.e = i4;
        ul3Var.f = i2;
        ul3Var.g = i3;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            max3 = max4;
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(xm3Var, mode, i5, mode2, i6);
        xm3Var.a0(i, mode, i5, mode2, i6, max3, max);
    }

    public void setConstraintSet(mm3 mm3Var) {
        this.mConstraintSet = mm3Var;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(bn3 bn3Var) {
        dm3 dm3Var = this.mConstraintLayoutSpec;
        if (dm3Var != null) {
            dm3Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        xm3 xm3Var = this.mLayoutWidget;
        xm3Var.E0 = i;
        h8b.q = xm3Var.c0(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelfDimensionBehaviour(xm3 xm3Var, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        ul3 ul3Var = this.mMeasurer;
        int i8 = ul3Var.e;
        int i9 = ul3Var.d;
        int childCount = getChildCount();
        int i10 = 2;
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i == 1073741824) {
                    i2 = Math.min(this.mMaxWidth - i9, i2);
                    i5 = 1;
                    if (i3 != Integer.MIN_VALUE) {
                        if (i3 == 0) {
                            if (childCount == 0) {
                                i4 = Math.max(0, this.mMinHeight);
                            }
                            i4 = 0;
                        } else if (i3 != 1073741824) {
                            i10 = 1;
                            i4 = 0;
                        } else {
                            i4 = Math.min(this.mMaxHeight - i8, i4);
                            i10 = 1;
                        }
                    } else if (childCount == 0) {
                        i4 = Math.max(0, this.mMinHeight);
                    }
                    if (i2 == xm3Var.r() || i4 != xm3Var.l()) {
                        xm3Var.t0.c = true;
                    }
                    xm3Var.Z = 0;
                    xm3Var.a0 = 0;
                    int i11 = this.mMaxWidth - i9;
                    int[] iArr = xm3Var.D;
                    iArr[0] = i11;
                    iArr[1] = this.mMaxHeight - i8;
                    xm3Var.c0 = 0;
                    xm3Var.d0 = 0;
                    xm3Var.O(i5);
                    xm3Var.S(i2);
                    xm3Var.Q(i10);
                    xm3Var.N(i4);
                    i6 = this.mMinWidth - i9;
                    if (i6 < 0) {
                        xm3Var.c0 = 0;
                    } else {
                        xm3Var.c0 = i6;
                    }
                    i7 = this.mMinHeight - i8;
                    if (i7 < 0) {
                        xm3Var.d0 = 0;
                        return;
                    } else {
                        xm3Var.d0 = i7;
                        return;
                    }
                }
                i5 = 1;
            } else if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            } else {
                i5 = 2;
            }
            i2 = 0;
            if (i3 != Integer.MIN_VALUE) {
            }
            if (i2 == xm3Var.r()) {
            }
            xm3Var.t0.c = true;
            xm3Var.Z = 0;
            xm3Var.a0 = 0;
            int i112 = this.mMaxWidth - i9;
            int[] iArr2 = xm3Var.D;
            iArr2[0] = i112;
            iArr2[1] = this.mMaxHeight - i8;
            xm3Var.c0 = 0;
            xm3Var.d0 = 0;
            xm3Var.O(i5);
            xm3Var.S(i2);
            xm3Var.Q(i10);
            xm3Var.N(i4);
            i6 = this.mMinWidth - i9;
            if (i6 < 0) {
            }
            i7 = this.mMinHeight - i8;
            if (i7 < 0) {
            }
        } else if (childCount == 0) {
            i2 = Math.max(0, this.mMinWidth);
        }
        i5 = 2;
        if (i3 != Integer.MIN_VALUE) {
        }
        if (i2 == xm3Var.r()) {
        }
        xm3Var.t0.c = true;
        xm3Var.Z = 0;
        xm3Var.a0 = 0;
        int i1122 = this.mMaxWidth - i9;
        int[] iArr22 = xm3Var.D;
        iArr22[0] = i1122;
        iArr22[1] = this.mMaxHeight - i8;
        xm3Var.c0 = 0;
        xm3Var.d0 = 0;
        xm3Var.O(i5);
        xm3Var.S(i2);
        xm3Var.Q(i10);
        xm3Var.N(i4);
        i6 = this.mMinWidth - i9;
        if (i6 < 0) {
        }
        i7 = this.mMinHeight - i8;
        if (i7 < 0) {
        }
    }

    public void setState(int i, int i2, int i3) {
        dm3 dm3Var = this.mConstraintLayoutSpec;
        if (dm3Var != null) {
            float f = i2;
            float f2 = i3;
            ConstraintLayout constraintLayout = dm3Var.a;
            SparseArray sparseArray = dm3Var.d;
            int i4 = dm3Var.b;
            int i5 = 0;
            if (i4 != i) {
                dm3Var.b = i;
                bm3 bm3Var = (bm3) sparseArray.get(i);
                ArrayList arrayList = bm3Var.b;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        i5 = -1;
                        break;
                    } else if (((cm3) arrayList.get(i5)).a(f, f2)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                ArrayList arrayList2 = bm3Var.b;
                mm3 mm3Var = i5 == -1 ? bm3Var.d : ((cm3) arrayList2.get(i5)).f;
                if (i5 != -1) {
                    int i6 = ((cm3) arrayList2.get(i5)).e;
                }
                if (mm3Var == null) {
                    return;
                }
                dm3Var.c = i5;
                mm3Var.a(constraintLayout);
                return;
            }
            bm3 bm3Var2 = i == -1 ? (bm3) sparseArray.valueAt(0) : (bm3) sparseArray.get(i4);
            int i7 = dm3Var.c;
            if (i7 == -1 || !((cm3) bm3Var2.b.get(i7)).a(f, f2)) {
                ArrayList arrayList3 = bm3Var2.b;
                while (true) {
                    if (i5 >= arrayList3.size()) {
                        i5 = -1;
                        break;
                    } else if (((cm3) arrayList3.get(i5)).a(f, f2)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                ArrayList arrayList4 = bm3Var2.b;
                if (dm3Var.c == i5) {
                    return;
                }
                mm3 mm3Var2 = i5 == -1 ? null : ((cm3) arrayList4.get(i5)).f;
                if (i5 != -1) {
                    int i8 = ((cm3) arrayList4.get(i5)).e;
                }
                if (mm3Var2 == null) {
                    return;
                }
                dm3Var.c = i5;
                mm3Var2.a(constraintLayout);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new xm3();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new ul3(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new xm3();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new ul3(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        tl3 tl3Var = new tl3(layoutParams);
        tl3Var.a = -1;
        tl3Var.b = -1;
        tl3Var.c = -1.0f;
        tl3Var.d = true;
        tl3Var.e = -1;
        tl3Var.f = -1;
        tl3Var.g = -1;
        tl3Var.h = -1;
        tl3Var.i = -1;
        tl3Var.j = -1;
        tl3Var.k = -1;
        tl3Var.l = -1;
        tl3Var.m = -1;
        tl3Var.n = -1;
        tl3Var.o = -1;
        tl3Var.p = -1;
        tl3Var.q = 0;
        tl3Var.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        tl3Var.s = -1;
        tl3Var.t = -1;
        tl3Var.u = -1;
        tl3Var.v = -1;
        tl3Var.w = Integer.MIN_VALUE;
        tl3Var.x = Integer.MIN_VALUE;
        tl3Var.y = Integer.MIN_VALUE;
        tl3Var.z = Integer.MIN_VALUE;
        tl3Var.A = Integer.MIN_VALUE;
        tl3Var.B = Integer.MIN_VALUE;
        tl3Var.C = Integer.MIN_VALUE;
        tl3Var.D = 0;
        tl3Var.E = 0.5f;
        tl3Var.F = 0.5f;
        tl3Var.G = null;
        tl3Var.H = -1.0f;
        tl3Var.I = -1.0f;
        tl3Var.J = 0;
        tl3Var.K = 0;
        tl3Var.L = 0;
        tl3Var.M = 0;
        tl3Var.N = 0;
        tl3Var.O = 0;
        tl3Var.P = 0;
        tl3Var.Q = 0;
        tl3Var.R = 1.0f;
        tl3Var.S = 1.0f;
        tl3Var.T = -1;
        tl3Var.U = -1;
        tl3Var.V = -1;
        tl3Var.W = false;
        tl3Var.X = false;
        tl3Var.Y = null;
        tl3Var.Z = 0;
        tl3Var.a0 = true;
        tl3Var.b0 = true;
        tl3Var.c0 = false;
        tl3Var.d0 = false;
        tl3Var.e0 = false;
        tl3Var.f0 = -1;
        tl3Var.g0 = -1;
        tl3Var.h0 = -1;
        tl3Var.i0 = -1;
        tl3Var.j0 = Integer.MIN_VALUE;
        tl3Var.k0 = Integer.MIN_VALUE;
        tl3Var.l0 = 0.5f;
        tl3Var.p0 = new wm3();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) tl3Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) tl3Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin = marginLayoutParams.bottomMargin;
            tl3Var.setMarginStart(marginLayoutParams.getMarginStart());
            tl3Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof tl3)) {
            return tl3Var;
        }
        tl3 tl3Var2 = (tl3) layoutParams;
        tl3Var.a = tl3Var2.a;
        tl3Var.b = tl3Var2.b;
        tl3Var.c = tl3Var2.c;
        tl3Var.d = tl3Var2.d;
        tl3Var.e = tl3Var2.e;
        tl3Var.f = tl3Var2.f;
        tl3Var.g = tl3Var2.g;
        tl3Var.h = tl3Var2.h;
        tl3Var.i = tl3Var2.i;
        tl3Var.j = tl3Var2.j;
        tl3Var.k = tl3Var2.k;
        tl3Var.l = tl3Var2.l;
        tl3Var.m = tl3Var2.m;
        tl3Var.n = tl3Var2.n;
        tl3Var.o = tl3Var2.o;
        tl3Var.p = tl3Var2.p;
        tl3Var.q = tl3Var2.q;
        tl3Var.r = tl3Var2.r;
        tl3Var.s = tl3Var2.s;
        tl3Var.t = tl3Var2.t;
        tl3Var.u = tl3Var2.u;
        tl3Var.v = tl3Var2.v;
        tl3Var.w = tl3Var2.w;
        tl3Var.x = tl3Var2.x;
        tl3Var.y = tl3Var2.y;
        tl3Var.z = tl3Var2.z;
        tl3Var.A = tl3Var2.A;
        tl3Var.B = tl3Var2.B;
        tl3Var.C = tl3Var2.C;
        tl3Var.D = tl3Var2.D;
        tl3Var.E = tl3Var2.E;
        tl3Var.F = tl3Var2.F;
        tl3Var.G = tl3Var2.G;
        tl3Var.H = tl3Var2.H;
        tl3Var.I = tl3Var2.I;
        tl3Var.J = tl3Var2.J;
        tl3Var.K = tl3Var2.K;
        tl3Var.W = tl3Var2.W;
        tl3Var.X = tl3Var2.X;
        tl3Var.L = tl3Var2.L;
        tl3Var.M = tl3Var2.M;
        tl3Var.N = tl3Var2.N;
        tl3Var.P = tl3Var2.P;
        tl3Var.O = tl3Var2.O;
        tl3Var.Q = tl3Var2.Q;
        tl3Var.R = tl3Var2.R;
        tl3Var.S = tl3Var2.S;
        tl3Var.T = tl3Var2.T;
        tl3Var.U = tl3Var2.U;
        tl3Var.V = tl3Var2.V;
        tl3Var.a0 = tl3Var2.a0;
        tl3Var.b0 = tl3Var2.b0;
        tl3Var.c0 = tl3Var2.c0;
        tl3Var.d0 = tl3Var2.d0;
        tl3Var.f0 = tl3Var2.f0;
        tl3Var.g0 = tl3Var2.g0;
        tl3Var.h0 = tl3Var2.h0;
        tl3Var.i0 = tl3Var2.i0;
        tl3Var.j0 = tl3Var2.j0;
        tl3Var.k0 = tl3Var2.k0;
        tl3Var.l0 = tl3Var2.l0;
        tl3Var.Y = tl3Var2.Y;
        tl3Var.Z = tl3Var2.Z;
        tl3Var.p0 = tl3Var2.p0;
        return tl3Var;
    }
}
