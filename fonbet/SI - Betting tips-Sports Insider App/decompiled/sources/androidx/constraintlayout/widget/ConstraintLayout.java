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
import com.appsflyer.attribution.RequestError;
import com.google.android.material.navigation.NavigationBarView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static t sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<b> mConstraintHelpers;
    protected i mConstraintLayoutSpec;
    private p mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected x.e mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    e mMeasurer;
    private v.d mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<f> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<x.d> mTempMapIdToWidget;

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new x.e();
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
        this.mMeasurer = new e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, 0);
    }

    public static /* synthetic */ v.d access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static t getSharedValues() {
        if (sSharedValues == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            sSharedValues = tVar;
        }
        return sSharedValues;
    }

    public final void a(AttributeSet attributeSet, int i5) {
        x.e eVar = this.mLayoutWidget;
        eVar.f25303f0 = this;
        e eVar2 = this.mMeasurer;
        eVar.f25334u0 = eVar2;
        eVar.f25332s0.f18752f = eVar2;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1216b, i5, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
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
                        p pVar = new p();
                        this.mConstraintSet = pVar;
                        pVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        x.e eVar3 = this.mLayoutWidget;
        eVar3.D0 = this.mOptimizationLevel;
        v.c.q = eVar3.W(512);
    }

    public void addValueModifier(f fVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02bb -> B:76:0x02bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyConstraintsFromLayoutParams(boolean z5, View view, x.d dVar, d dVar2, SparseArray<x.d> sparseArray) {
        ConstraintLayout constraintLayout;
        int i5;
        float f6;
        x.d dVar3;
        int i10;
        int i11;
        int i12;
        x.d dVar4;
        int i13;
        int i14;
        int i15;
        x.d dVar5;
        int i16;
        int i17;
        int i18;
        int i19;
        x.d dVar6;
        int i20;
        d dVar7;
        x.d dVar8;
        int i21;
        float f10;
        int i22;
        float f11;
        int i23;
        float f12;
        x.d dVar9 = dVar;
        dVar2.a();
        dVar9.f25305g0 = view.getVisibility();
        dVar9.f25303f0 = view;
        if (view instanceof b) {
            constraintLayout = this;
            ((b) view).h(dVar9, constraintLayout.mLayoutWidget.f25335v0);
        } else {
            constraintLayout = this;
        }
        int i24 = -1;
        if (dVar2.f1076d0) {
            x.h hVar = (x.h) dVar9;
            int i25 = dVar2.f1090m0;
            int i26 = dVar2.f1092n0;
            float f13 = dVar2.f1094o0;
            if (f13 != -1.0f) {
                if (f13 > -1.0f) {
                    hVar.f25362q0 = f13;
                    hVar.f25363r0 = -1;
                    hVar.f25364s0 = -1;
                    return;
                }
                return;
            }
            if (i25 != -1) {
                if (i25 > -1) {
                    hVar.f25362q0 = -1.0f;
                    hVar.f25363r0 = i25;
                    hVar.f25364s0 = -1;
                    return;
                }
                return;
            }
            if (i26 == -1 || i26 <= -1) {
                return;
            }
            hVar.f25362q0 = -1.0f;
            hVar.f25363r0 = -1;
            hVar.f25364s0 = i26;
            return;
        }
        int i27 = dVar2.f1079f0;
        int i28 = dVar2.f1081g0;
        int i29 = dVar2.f1083h0;
        int i30 = dVar2.f1085i0;
        int i31 = dVar2.j0;
        int i32 = dVar2.k0;
        float f14 = dVar2.f1088l0;
        int i33 = dVar2.f1095p;
        if (i33 != -1) {
            x.d dVar10 = sparseArray.get(i33);
            if (dVar10 != null) {
                float f15 = dVar2.f1097r;
                f12 = 0.0f;
                dVar.v(7, 7, dVar2.q, 0, dVar10);
                dVar9 = dVar;
                dVar9.D = f15;
            } else {
                f12 = 0.0f;
            }
            f6 = f12;
            i12 = 2;
            dVar8 = dVar9;
            dVar7 = dVar2;
            i13 = 4;
            i21 = 5;
            i19 = 3;
        } else {
            if (i27 != -1) {
                x.d dVar11 = sparseArray.get(i27);
                if (dVar11 != null) {
                    f6 = 0.0f;
                    i5 = 2;
                    dVar9.v(2, 2, ((ViewGroup.MarginLayoutParams) dVar2).leftMargin, i31, dVar11);
                } else {
                    i5 = 2;
                    f6 = 0.0f;
                }
            } else {
                i5 = 2;
                f6 = 0.0f;
                if (i28 != -1 && (dVar3 = sparseArray.get(i28)) != null) {
                    dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) dVar2).leftMargin, i31, dVar3);
                    i10 = 2;
                    i11 = 4;
                    if (i29 == -1) {
                        x.d dVar12 = sparseArray.get(i29);
                        if (dVar12 != null) {
                            dVar.v(i11, i10, ((ViewGroup.MarginLayoutParams) dVar2).rightMargin, i32, dVar12);
                        }
                        i12 = i10;
                    } else {
                        i12 = i10;
                        if (i30 != -1 && (dVar4 = sparseArray.get(i30)) != null) {
                            dVar.v(i11, i11, ((ViewGroup.MarginLayoutParams) dVar2).rightMargin, i32, dVar4);
                        }
                    }
                    i13 = i11;
                    i14 = dVar2.f1084i;
                    if (i14 == -1) {
                        x.d dVar13 = sparseArray.get(i14);
                        if (dVar13 != null) {
                            i15 = 3;
                            dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) dVar2).topMargin, dVar2.f1103x, dVar13);
                        } else {
                            i15 = 3;
                        }
                    } else {
                        i15 = 3;
                        int i34 = dVar2.j;
                        if (i34 != -1 && (dVar5 = sparseArray.get(i34)) != null) {
                            dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) dVar2).topMargin, dVar2.f1103x, dVar5);
                            i16 = 3;
                            i17 = 5;
                            i18 = dVar2.f1086k;
                            if (i18 != -1) {
                                x.d dVar14 = sparseArray.get(i18);
                                if (dVar14 != null) {
                                    dVar.v(i17, i16, ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin, dVar2.f1105z, dVar14);
                                }
                                i19 = i16;
                            } else {
                                i19 = i16;
                                int i35 = dVar2.f1087l;
                                if (i35 != -1 && (dVar6 = sparseArray.get(i35)) != null) {
                                    dVar.v(i17, i17, ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin, dVar2.f1105z, dVar6);
                                }
                            }
                            int i36 = i17;
                            i20 = dVar2.f1089m;
                            if (i20 != -1) {
                                dVar7 = dVar2;
                                constraintLayout.b(dVar, dVar7, sparseArray, i20, 6);
                            } else {
                                dVar7 = dVar2;
                                int i37 = dVar7.f1091n;
                                if (i37 != -1) {
                                    b(dVar, dVar7, sparseArray, i37, i19);
                                } else {
                                    int i38 = dVar7.f1093o;
                                    if (i38 != -1) {
                                        b(dVar, dVar7, sparseArray, i38, i36);
                                        dVar8 = dVar;
                                        i21 = i36;
                                        if (f14 >= f6) {
                                            dVar8.f25300d0 = f14;
                                        }
                                        f10 = dVar7.F;
                                        if (f10 >= f6) {
                                            dVar8.e0 = f10;
                                        }
                                    }
                                }
                            }
                            dVar8 = dVar;
                            i21 = i36;
                            if (f14 >= f6) {
                            }
                            f10 = dVar7.F;
                            if (f10 >= f6) {
                            }
                        }
                    }
                    i16 = i15;
                    i17 = 5;
                    i18 = dVar2.f1086k;
                    if (i18 != -1) {
                    }
                    int i362 = i17;
                    i20 = dVar2.f1089m;
                    if (i20 != -1) {
                    }
                    dVar8 = dVar;
                    i21 = i362;
                    if (f14 >= f6) {
                    }
                    f10 = dVar7.F;
                    if (f10 >= f6) {
                    }
                }
            }
            i10 = i5;
            i11 = 4;
            if (i29 == -1) {
            }
            i13 = i11;
            i14 = dVar2.f1084i;
            if (i14 == -1) {
            }
            i16 = i15;
            i17 = 5;
            i18 = dVar2.f1086k;
            if (i18 != -1) {
            }
            int i3622 = i17;
            i20 = dVar2.f1089m;
            if (i20 != -1) {
            }
            dVar8 = dVar;
            i21 = i3622;
            if (f14 >= f6) {
            }
            f10 = dVar7.F;
            if (f10 >= f6) {
            }
        }
        if (z5 && ((i23 = dVar7.T) != -1 || dVar7.U != -1)) {
            int i39 = dVar7.U;
            dVar8.Y = i23;
            dVar8.Z = i39;
        }
        if (dVar7.f1070a0) {
            dVar8.M(1);
            dVar8.O(((ViewGroup.MarginLayoutParams) dVar7).width);
            if (((ViewGroup.MarginLayoutParams) dVar7).width == -2) {
                dVar8.M(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) dVar7).width == -1) {
            if (dVar7.W) {
                dVar8.M(3);
            } else {
                dVar8.M(4);
            }
            dVar8.i(i12).f25290g = ((ViewGroup.MarginLayoutParams) dVar7).leftMargin;
            dVar8.i(i13).f25290g = ((ViewGroup.MarginLayoutParams) dVar7).rightMargin;
        } else {
            dVar8.M(3);
            dVar8.O(0);
        }
        if (dVar7.f1072b0) {
            dVar8.N(1);
            dVar8.L(((ViewGroup.MarginLayoutParams) dVar7).height);
            if (((ViewGroup.MarginLayoutParams) dVar7).height == -2) {
                dVar8.N(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) dVar7).height == -1) {
            if (dVar7.X) {
                dVar8.N(3);
            } else {
                dVar8.N(4);
            }
            dVar8.i(i19).f25290g = ((ViewGroup.MarginLayoutParams) dVar7).topMargin;
            dVar8.i(i21).f25290g = ((ViewGroup.MarginLayoutParams) dVar7).bottomMargin;
        } else {
            dVar8.N(3);
            dVar8.L(0);
        }
        String str = dVar7.G;
        if (str == null || str.length() == 0) {
            dVar8.W = f6;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf <= 0 || indexOf >= length - 1) {
                i22 = 0;
            } else {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i24 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i24 = 1;
                }
                i22 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i22);
                if (substring2.length() > 0) {
                    f11 = Float.parseFloat(substring2);
                }
                f11 = f6;
            } else {
                String substring3 = str.substring(i22, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > f6 && parseFloat2 > f6) {
                        f11 = i24 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                f11 = f6;
            }
            if (f11 > f6) {
                dVar8.W = f11;
                dVar8.X = i24;
            }
        }
        float f16 = dVar7.H;
        float[] fArr = dVar8.k0;
        fArr[0] = f16;
        fArr[1] = dVar7.I;
        dVar8.f25309i0 = dVar7.J;
        dVar8.j0 = dVar7.K;
        int i40 = dVar7.Z;
        if (i40 >= 0 && i40 <= 3) {
            dVar8.q = i40;
        }
        int i41 = dVar7.L;
        int i42 = dVar7.N;
        int i43 = dVar7.P;
        float f17 = dVar7.R;
        dVar8.f25321r = i41;
        dVar8.f25324u = i42;
        if (i43 == Integer.MAX_VALUE) {
            i43 = 0;
        }
        dVar8.f25325v = i43;
        dVar8.f25326w = f17;
        if (f17 > f6 && f17 < 1.0f && i41 == 0) {
            dVar8.f25321r = 2;
        }
        int i44 = dVar7.M;
        int i45 = dVar7.O;
        int i46 = dVar7.Q;
        float f18 = dVar7.S;
        dVar8.f25322s = i44;
        dVar8.f25327x = i45;
        dVar8.f25328y = i46 != Integer.MAX_VALUE ? i46 : 0;
        dVar8.f25329z = f18;
        if (f18 <= f6 || f18 >= 1.0f || i44 != 0) {
            return;
        }
        dVar8.f25322s = 2;
    }

    public final void b(x.d dVar, d dVar2, SparseArray sparseArray, int i5, int i10) {
        View view = this.mChildrenByIds.get(i5);
        x.d dVar3 = (x.d) sparseArray.get(i5);
        if (dVar3 == null || view == null || !(view.getLayoutParams() instanceof d)) {
            return;
        }
        dVar2.f1074c0 = true;
        if (i10 == 6) {
            d dVar4 = (d) view.getLayoutParams();
            dVar4.f1074c0 = true;
            dVar4.f1096p0.E = true;
        }
        dVar.i(6).b(dVar3.i(i10), dVar2.D, dVar2.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.mConstraintHelpers.get(i5).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(StringUtils.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i11;
                        float f10 = i12;
                        float f11 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f10, f11, f10, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f10, f11, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i5, int i10) {
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i5);
        View.MeasureSpec.getSize(i10);
        Iterator<f> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Iterator it2 = this.mLayoutWidget.f25330q0.iterator();
            if (it2.hasNext()) {
                View view = ((x.d) it2.next()).f25303f0;
                view.getId();
                throw null;
            }
        }
        return false;
    }

    public void fillMetrics(v.d dVar) {
        this.mLayoutWidget.f25336w0.getClass();
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

    public Object getDesignInformation(int i5, Object obj) {
        if (i5 != 0 || !(obj instanceof String)) {
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
        return this.mLayoutWidget.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.j = "parent";
            }
        }
        x.e eVar = this.mLayoutWidget;
        if (eVar.f25307h0 == null) {
            eVar.f25307h0 = eVar.j;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f25307h0);
        }
        Iterator it = this.mLayoutWidget.f25330q0.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            View view = dVar.f25303f0;
            if (view != null) {
                if (dVar.j == null && (id2 = view.getId()) != -1) {
                    dVar.j = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.f25307h0 == null) {
                    dVar.f25307h0 = dVar.j;
                    Log.v(TAG, " setDebugName " + dVar.f25307h0);
                }
            }
        }
        this.mLayoutWidget.n(sb2);
        return sb2.toString();
    }

    public View getViewById(int i5) {
        return this.mChildrenByIds.get(i5);
    }

    public final x.d getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f1096p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f1096p0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i5) {
        if (i5 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new i(getContext(), this, i5);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d dVar = (d) childAt.getLayoutParams();
            x.d dVar2 = dVar.f1096p0;
            if (childAt.getVisibility() != 8 || dVar.f1076d0 || dVar.e0 || isInEditMode) {
                int r5 = dVar2.r();
                int s8 = dVar2.s();
                childAt.layout(r5, s8, dVar2.q() + r5, dVar2.k() + s8);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.mConstraintHelpers.get(i14).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        boolean z5;
        boolean z7;
        boolean z10;
        x.d dVar;
        boolean dynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i5, i10);
        this.mDirtyHierarchy = dynamicUpdateConstraints;
        boolean z11 = true;
        int i11 = 0;
        if (!dynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i12++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i5;
        this.mOnMeasureHeightMeasureSpec = i10;
        this.mLayoutWidget.f25335v0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount2) {
                    z5 = false;
                    break;
                } else {
                    if (getChildAt(i13).isLayoutRequested()) {
                        z5 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z5) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    x.d viewWidget = getViewWidget(getChildAt(i14));
                    if (viewWidget != null) {
                        viewWidget.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt = getChildAt(i15);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                dVar = this.mLayoutWidget;
                            } else {
                                View view = this.mChildrenByIds.get(id2);
                                if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                dVar = view == this ? this.mLayoutWidget : view == null ? null : ((d) view.getLayoutParams()).f1096p0;
                            }
                            dVar.f25307h0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        getChildAt(i16).getId();
                    }
                }
                p pVar = this.mConstraintSet;
                if (pVar != null) {
                    pVar.a(this);
                }
                this.mLayoutWidget.f25330q0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i17 = 0;
                    while (i17 < size) {
                        b bVar = this.mConstraintHelpers.get(i17);
                        HashMap hashMap = bVar.f1067g;
                        if (bVar.isInEditMode()) {
                            bVar.setIds(bVar.f1065e);
                        }
                        x.i iVar = bVar.f1064d;
                        if (iVar == null) {
                            z7 = z11;
                        } else {
                            iVar.f25369r0 = i11;
                            Arrays.fill(iVar.f25368q0, obj);
                            int i18 = i11;
                            while (i18 < bVar.f1062b) {
                                int i19 = bVar.f1061a[i18];
                                View viewById = getViewById(i19);
                                if (viewById == null) {
                                    String str = (String) hashMap.get(Integer.valueOf(i19));
                                    z10 = z11;
                                    int f6 = bVar.f(this, str);
                                    if (f6 != 0) {
                                        bVar.f1061a[i18] = f6;
                                        hashMap.put(Integer.valueOf(f6), str);
                                        viewById = getViewById(f6);
                                    }
                                } else {
                                    z10 = z11;
                                }
                                if (viewById != null) {
                                    x.i iVar2 = bVar.f1064d;
                                    x.d viewWidget2 = getViewWidget(viewById);
                                    iVar2.getClass();
                                    if (viewWidget2 != iVar2 && viewWidget2 != null) {
                                        int i20 = iVar2.f25369r0 + 1;
                                        x.d[] dVarArr = iVar2.f25368q0;
                                        if (i20 > dVarArr.length) {
                                            iVar2.f25368q0 = (x.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        x.d[] dVarArr2 = iVar2.f25368q0;
                                        int i21 = iVar2.f25369r0;
                                        dVarArr2[i21] = viewWidget2;
                                        iVar2.f25369r0 = i21 + 1;
                                    }
                                }
                                i18++;
                                z11 = z10;
                            }
                            z7 = z11;
                            bVar.f1064d.S();
                        }
                        i17++;
                        z11 = z7;
                        i11 = 0;
                        obj = null;
                    }
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    getChildAt(i22);
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt2 = getChildAt(i23);
                    this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
                }
                for (int i24 = 0; i24 < childCount3; i24++) {
                    View childAt3 = getChildAt(i24);
                    x.d viewWidget3 = getViewWidget(childAt3);
                    if (viewWidget3 != null) {
                        d dVar2 = (d) childAt3.getLayoutParams();
                        x.e eVar = this.mLayoutWidget;
                        eVar.f25330q0.add(viewWidget3);
                        x.d dVar3 = viewWidget3.T;
                        if (dVar3 != null) {
                            ((x.e) dVar3).f25330q0.remove(viewWidget3);
                            viewWidget3.C();
                        }
                        viewWidget3.T = eVar;
                        applyConstraintsFromLayoutParams(isInEditMode, childAt3, viewWidget3, dVar2, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z5) {
                x.e eVar2 = this.mLayoutWidget;
                eVar2.f25331r0.q(eVar2);
            }
        }
        this.mLayoutWidget.f25336w0.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i5, i10);
        int q = this.mLayoutWidget.q();
        int k6 = this.mLayoutWidget.k();
        x.e eVar3 = this.mLayoutWidget;
        resolveMeasuredDimension(i5, i10, q, k6, eVar3.E0, eVar3.F0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        x.d viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof x.h)) {
            d dVar = (d) view.getLayoutParams();
            x.h hVar = new x.h();
            dVar.f1096p0 = hVar;
            dVar.f1076d0 = true;
            hVar.S(dVar.V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.i();
            ((d) view.getLayoutParams()).e0 = true;
            if (!this.mConstraintHelpers.contains(bVar)) {
                this.mConstraintHelpers.add(bVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        x.d viewWidget = getViewWidget(view);
        this.mLayoutWidget.f25330q0.remove(viewWidget);
        viewWidget.C();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i5) {
        this.mConstraintLayoutSpec = new i(getContext(), this, i5);
    }

    public void removeValueModifier(f fVar) {
        if (fVar == null) {
            return;
        }
        this.mModifiers.remove(fVar);
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

    public void resolveMeasuredDimension(int i5, int i10, int i11, int i12, boolean z5, boolean z7) {
        e eVar = this.mMeasurer;
        int i13 = eVar.f1110e;
        int resolveSizeAndState = View.resolveSizeAndState(i11 + eVar.f1109d, i5, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z7) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x0060, code lost:
    
        if (isRtl() != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resolveSystem(x.e eVar, int i5, int i10, int i11) {
        boolean z5;
        int i12;
        e eVar2;
        boolean z7;
        boolean z10;
        int i13;
        int i14;
        int i15;
        e eVar3;
        boolean z11;
        boolean z12;
        boolean z13;
        e eVar4;
        int i16;
        y.j jVar;
        y.l lVar;
        boolean z14;
        int i17;
        int i18;
        ArrayList arrayList;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z15;
        Iterator it;
        Iterator it2;
        boolean z16;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i24 = max + max2;
        int paddingWidth = getPaddingWidth();
        e eVar5 = this.mMeasurer;
        eVar5.f1107b = max;
        eVar5.f1108c = max2;
        eVar5.f1109d = paddingWidth;
        eVar5.f1110e = i24;
        eVar5.f1111f = i10;
        eVar5.f1112g = i11;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        }
        max4 = max3;
        int i25 = size - paddingWidth;
        int i26 = size2 - i24;
        setSelfDimensionBehaviour(eVar, mode, i25, mode2, i26);
        eVar.x0 = max4;
        k2.r rVar = eVar.f25332s0;
        eVar.f25337y0 = max;
        kh.g gVar = eVar.f25331r0;
        x.e eVar6 = (x.e) gVar.f19117d;
        ArrayList arrayList2 = (ArrayList) gVar.f19115b;
        e eVar7 = eVar.f25334u0;
        int[] iArr = eVar.C;
        int size3 = eVar.f25330q0.size();
        int q = eVar.q();
        int k6 = eVar.k();
        boolean z17 = false;
        boolean c2 = x.j.c(i5, 128);
        boolean z18 = c2 || x.j.c(i5, 64);
        if (z18) {
            int i27 = 0;
            while (i27 < size3) {
                boolean z19 = z18;
                x.d dVar = (x.d) eVar.f25330q0.get(i27);
                int i28 = i27;
                int[] iArr2 = dVar.f25320p0;
                i12 = size3;
                boolean z20 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.W > 0.0f;
                if ((dVar.x() && z20) || ((dVar.y() && z20) || (dVar instanceof x.g) || dVar.x() || dVar.y())) {
                    z5 = false;
                    break;
                } else {
                    i27 = i28 + 1;
                    z18 = z19;
                    size3 = i12;
                }
            }
        }
        z5 = z18;
        i12 = size3;
        boolean z21 = z5 & ((mode == 1073741824 && mode2 == 1073741824) || c2);
        if (z21) {
            int min = Math.min(iArr[0], i25);
            int min2 = Math.min(iArr[1], i26);
            if (mode != 1073741824 || eVar.q() == min) {
                z14 = true;
            } else {
                eVar.O(min);
                z14 = true;
                rVar.f18747a = true;
            }
            if (mode2 == 1073741824 && eVar.k() != min2) {
                eVar.L(min2);
                rVar.f18747a = z14;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList arrayList3 = (ArrayList) rVar.f18751e;
                x.e eVar8 = (x.e) rVar.f18749c;
                if (rVar.f18747a || rVar.f18748b) {
                    Iterator it3 = eVar8.f25330q0.iterator();
                    while (it3.hasNext()) {
                        x.d dVar2 = (x.d) it3.next();
                        dVar2.h();
                        dVar2.f25293a = z17;
                        dVar2.f25299d.n();
                        dVar2.f25301e.m();
                        arrayList3 = arrayList3;
                        z17 = false;
                    }
                    arrayList = arrayList3;
                    eVar8.h();
                    i19 = 0;
                    eVar8.f25293a = false;
                    eVar8.f25299d.n();
                    eVar8.f25301e.m();
                    rVar.f18748b = false;
                } else {
                    arrayList = arrayList3;
                    i19 = 0;
                }
                rVar.c((x.e) rVar.f18750d);
                eVar8.Y = i19;
                int[] iArr3 = eVar8.f25320p0;
                eVar8.Z = i19;
                int j = eVar8.j(i19);
                int j6 = eVar8.j(1);
                if (rVar.f18747a) {
                    rVar.d();
                }
                int r5 = eVar8.r();
                z7 = z21;
                int s8 = eVar8.s();
                eVar2 = eVar7;
                eVar8.f25299d.f25520h.d(r5);
                eVar8.f25301e.f25520h.d(s8);
                rVar.i();
                if (j == 2 || j6 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((y.n) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j == 2) {
                        eVar8.M(1);
                        i20 = r5;
                        eVar8.O(rVar.e(eVar8, 0));
                        eVar8.f25299d.f25517e.d(eVar8.q());
                    } else {
                        i20 = r5;
                    }
                    if (c2 && j6 == 2) {
                        i21 = 1;
                        eVar8.N(1);
                        eVar8.L(rVar.e(eVar8, 1));
                        eVar8.f25301e.f25517e.d(eVar8.k());
                        i22 = iArr3[0];
                        if (i22 != i21 || i22 == 4) {
                            int q3 = eVar8.q() + i20;
                            eVar8.f25299d.f25521i.d(q3);
                            eVar8.f25299d.f25517e.d(q3 - i20);
                            rVar.i();
                            i23 = iArr3[1];
                            if (i23 != 1 || i23 == 4) {
                                int k9 = eVar8.k() + s8;
                                eVar8.f25301e.f25521i.d(k9);
                                eVar8.f25301e.f25517e.d(k9 - s8);
                            }
                            rVar.i();
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            y.n nVar = (y.n) it.next();
                            if (nVar.f25514b != eVar8 || nVar.f25519g) {
                                nVar.e();
                            }
                        }
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            y.n nVar2 = (y.n) it2.next();
                            if (z15 || nVar2.f25514b != eVar8) {
                                if (!nVar2.f25520h.j || ((!nVar2.f25521i.j && !(nVar2 instanceof y.h)) || (!nVar2.f25517e.j && !(nVar2 instanceof y.c) && !(nVar2 instanceof y.h)))) {
                                    z16 = false;
                                    break;
                                }
                            }
                        }
                        z16 = true;
                        eVar8.M(j);
                        eVar8.N(j6);
                        z10 = z16;
                        i18 = 1073741824;
                        i13 = 2;
                    }
                } else {
                    i20 = r5;
                }
                i21 = 1;
                i22 = iArr3[0];
                if (i22 != i21) {
                }
                int q32 = eVar8.q() + i20;
                eVar8.f25299d.f25521i.d(q32);
                eVar8.f25299d.f25517e.d(q32 - i20);
                rVar.i();
                i23 = iArr3[1];
                if (i23 != 1) {
                }
                int k92 = eVar8.k() + s8;
                eVar8.f25301e.f25521i.d(k92);
                eVar8.f25301e.f25517e.d(k92 - s8);
                rVar.i();
                z15 = true;
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                }
                z16 = true;
                eVar8.M(j);
                eVar8.N(j6);
                z10 = z16;
                i18 = 1073741824;
                i13 = 2;
            } else {
                eVar2 = eVar7;
                z7 = z21;
                x.e eVar9 = (x.e) rVar.f18749c;
                if (rVar.f18747a) {
                    Iterator it5 = eVar9.f25330q0.iterator();
                    while (it5.hasNext()) {
                        x.d dVar3 = (x.d) it5.next();
                        dVar3.h();
                        dVar3.f25293a = false;
                        y.j jVar2 = dVar3.f25299d;
                        jVar2.f25517e.j = false;
                        jVar2.f25519g = false;
                        jVar2.n();
                        y.l lVar2 = dVar3.f25301e;
                        lVar2.f25517e.j = false;
                        lVar2.f25519g = false;
                        lVar2.m();
                    }
                    i17 = 0;
                    eVar9.h();
                    eVar9.f25293a = false;
                    y.j jVar3 = eVar9.f25299d;
                    jVar3.f25517e.j = false;
                    jVar3.f25519g = false;
                    jVar3.n();
                    y.l lVar3 = eVar9.f25301e;
                    lVar3.f25517e.j = false;
                    lVar3.f25519g = false;
                    lVar3.m();
                    rVar.d();
                } else {
                    i17 = 0;
                }
                rVar.c((x.e) rVar.f18750d);
                eVar9.Y = i17;
                eVar9.Z = i17;
                eVar9.f25299d.f25520h.d(i17);
                eVar9.f25301e.f25520h.d(i17);
                i18 = 1073741824;
                if (mode == 1073741824) {
                    z10 = eVar.T(i17, c2);
                    i13 = 1;
                } else {
                    z10 = true;
                    i13 = 0;
                }
                if (mode2 == 1073741824) {
                    z10 &= eVar.T(1, c2);
                    i13++;
                }
            }
            if (z10) {
                eVar.P(mode == i18, mode2 == i18);
            }
        } else {
            eVar2 = eVar7;
            z7 = z21;
            z10 = false;
            i13 = 0;
        }
        if (z10 && i13 == 2) {
            return;
        }
        int i29 = eVar.D0;
        if (i12 > 0) {
            int size4 = eVar.f25330q0.size();
            boolean W = eVar.W(64);
            e eVar10 = eVar.f25334u0;
            int i30 = 0;
            while (i30 < size4) {
                x.d dVar4 = (x.d) eVar.f25330q0.get(i30);
                if ((dVar4 instanceof x.h) || (dVar4 instanceof x.a) || dVar4.F || (W && (jVar = dVar4.f25299d) != null && (lVar = dVar4.f25301e) != null && jVar.f25517e.j && lVar.f25517e.j)) {
                    i16 = size4;
                } else {
                    int j10 = dVar4.j(0);
                    int j11 = dVar4.j(1);
                    i16 = size4;
                    boolean z22 = j10 == 3 && dVar4.f25321r != 1 && j11 == 3 && dVar4.f25322s != 1;
                    if (!z22 && eVar.W(1) && !(dVar4 instanceof x.g)) {
                        if (j10 == 3 && dVar4.f25321r == 0 && j11 != 3 && !dVar4.x()) {
                            z22 = true;
                        }
                        if (j11 == 3 && dVar4.f25322s == 0 && j10 != 3 && !dVar4.x()) {
                            z22 = true;
                        }
                        if ((j10 == 3 || j11 == 3) && dVar4.W > 0.0f) {
                            z22 = true;
                        }
                    }
                    if (!z22) {
                        gVar.n(0, eVar10, dVar4);
                    }
                }
                i30++;
                size4 = i16;
            }
            ConstraintLayout constraintLayout = eVar10.f1106a;
            int childCount = constraintLayout.getChildCount();
            for (int i31 = 0; i31 < childCount; i31++) {
                constraintLayout.getChildAt(i31);
            }
            int size5 = constraintLayout.mConstraintHelpers.size();
            if (size5 > 0) {
                for (int i32 = 0; i32 < size5; i32++) {
                    ((b) constraintLayout.mConstraintHelpers.get(i32)).getClass();
                }
            }
        }
        gVar.q(eVar);
        int size6 = arrayList2.size();
        if (i12 > 0) {
            gVar.p(eVar, 0, q, k6);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar.f25320p0;
            boolean z23 = iArr4[0] == 2;
            boolean z24 = iArr4[1] == 2;
            int max5 = Math.max(eVar.q(), eVar6.f25296b0);
            int max6 = Math.max(eVar.k(), eVar6.f25298c0);
            int i33 = 0;
            boolean z25 = false;
            while (i33 < size6) {
                x.d dVar5 = (x.d) arrayList2.get(i33);
                if (dVar5 instanceof x.g) {
                    int q10 = dVar5.q();
                    int k10 = dVar5.k();
                    z12 = z24;
                    z13 = z23;
                    eVar4 = eVar2;
                    boolean n9 = z25 | gVar.n(1, eVar4, dVar5);
                    int q11 = dVar5.q();
                    boolean z26 = n9;
                    int k11 = dVar5.k();
                    if (q11 != q10) {
                        dVar5.O(q11);
                        if (z13 && dVar5.r() + dVar5.U > max5) {
                            max5 = Math.max(max5, dVar5.i(4).e() + dVar5.r() + dVar5.U);
                        }
                        z26 = true;
                    }
                    if (k11 != k10) {
                        dVar5.L(k11);
                        if (z12 && dVar5.s() + dVar5.V > max6) {
                            max6 = Math.max(max6, dVar5.i(5).e() + dVar5.s() + dVar5.V);
                        }
                        z26 = true;
                    }
                    z25 = z26 | ((x.g) dVar5).f25361y0;
                } else {
                    z12 = z24;
                    z13 = z23;
                    eVar4 = eVar2;
                }
                i33++;
                eVar2 = eVar4;
                z23 = z13;
                z24 = z12;
            }
            boolean z27 = z24;
            boolean z28 = z23;
            int i34 = 0;
            while (true) {
                e eVar11 = eVar2;
                if (i34 >= 2) {
                    break;
                }
                int i35 = 0;
                while (i35 < size6) {
                    x.d dVar6 = (x.d) arrayList2.get(i35);
                    if (((dVar6 instanceof x.i) && !(dVar6 instanceof x.g)) || (dVar6 instanceof x.h) || dVar6.f25305g0 == 8 || ((z7 && dVar6.f25299d.f25517e.j && dVar6.f25301e.f25517e.j) || (dVar6 instanceof x.g))) {
                        i14 = size6;
                        eVar3 = eVar11;
                        i15 = i35;
                    } else {
                        int q12 = dVar6.q();
                        int k12 = dVar6.k();
                        i14 = size6;
                        int i36 = dVar6.f25294a0;
                        i15 = i35;
                        boolean n10 = gVar.n(i34 == 1 ? 2 : 1, eVar11, dVar6) | z25;
                        int q13 = dVar6.q();
                        eVar3 = eVar11;
                        int k13 = dVar6.k();
                        if (q13 != q12) {
                            dVar6.O(q13);
                            if (z28 && dVar6.r() + dVar6.U > max5) {
                                max5 = Math.max(max5, dVar6.i(4).e() + dVar6.r() + dVar6.U);
                            }
                            n10 = true;
                        }
                        if (k13 != k12) {
                            dVar6.L(k13);
                            if (z27 && dVar6.s() + dVar6.V > max6) {
                                max6 = Math.max(max6, dVar6.i(5).e() + dVar6.s() + dVar6.V);
                            }
                            z11 = true;
                        } else {
                            z11 = n10;
                        }
                        z25 = (!dVar6.E || i36 == dVar6.f25294a0) ? z11 : true;
                    }
                    i35 = i15 + 1;
                    size6 = i14;
                    eVar11 = eVar3;
                }
                int i37 = size6;
                eVar2 = eVar11;
                if (!z25) {
                    break;
                }
                i34++;
                gVar.p(eVar, i34, q, k6);
                size6 = i37;
                z25 = false;
            }
        }
        eVar.D0 = i29;
        v.c.q = eVar.W(512);
    }

    public void setConstraintSet(p pVar) {
        this.mConstraintSet = pVar;
    }

    public void setDesignInformation(int i5, Object obj, Object obj2) {
        if (i5 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
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
    public void setId(int i5) {
        this.mChildrenByIds.remove(getId());
        super.setId(i5);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i5) {
        if (i5 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i5;
        requestLayout();
    }

    public void setMaxWidth(int i5) {
        if (i5 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i5;
        requestLayout();
    }

    public void setMinHeight(int i5) {
        if (i5 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i5;
        requestLayout();
    }

    public void setMinWidth(int i5) {
        if (i5 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i5;
        requestLayout();
    }

    public void setOnConstraintsChanged(q qVar) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i5) {
        this.mOptimizationLevel = i5;
        x.e eVar = this.mLayoutWidget;
        eVar.D0 = i5;
        v.c.q = eVar.W(512);
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
    public void setSelfDimensionBehaviour(x.e eVar, int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        e eVar2 = this.mMeasurer;
        int i16 = eVar2.f1110e;
        int i17 = eVar2.f1109d;
        int childCount = getChildCount();
        int i18 = 2;
        if (i5 != Integer.MIN_VALUE) {
            if (i5 != 0) {
                if (i5 == 1073741824) {
                    i10 = Math.min(this.mMaxWidth - i17, i10);
                    i13 = 1;
                    if (i11 != Integer.MIN_VALUE) {
                        if (i11 == 0) {
                            if (childCount == 0) {
                                i12 = Math.max(0, this.mMinHeight);
                            }
                            i12 = 0;
                        } else if (i11 != 1073741824) {
                            i18 = 1;
                            i12 = 0;
                        } else {
                            i12 = Math.min(this.mMaxHeight - i16, i12);
                            i18 = 1;
                        }
                    } else if (childCount == 0) {
                        i12 = Math.max(0, this.mMinHeight);
                    }
                    if (i10 == eVar.q() || i12 != eVar.k()) {
                        eVar.f25332s0.f18748b = true;
                    }
                    eVar.Y = 0;
                    eVar.Z = 0;
                    int i19 = this.mMaxWidth - i17;
                    int[] iArr = eVar.C;
                    iArr[0] = i19;
                    iArr[1] = this.mMaxHeight - i16;
                    eVar.f25296b0 = 0;
                    eVar.f25298c0 = 0;
                    eVar.M(i13);
                    eVar.O(i10);
                    eVar.N(i18);
                    eVar.L(i12);
                    i14 = this.mMinWidth - i17;
                    if (i14 < 0) {
                        eVar.f25296b0 = 0;
                    } else {
                        eVar.f25296b0 = i14;
                    }
                    i15 = this.mMinHeight - i16;
                    if (i15 < 0) {
                        eVar.f25298c0 = 0;
                        return;
                    } else {
                        eVar.f25298c0 = i15;
                        return;
                    }
                }
                i13 = 1;
            } else if (childCount == 0) {
                i10 = Math.max(0, this.mMinWidth);
            } else {
                i13 = 2;
            }
            i10 = 0;
            if (i11 != Integer.MIN_VALUE) {
            }
            if (i10 == eVar.q()) {
            }
            eVar.f25332s0.f18748b = true;
            eVar.Y = 0;
            eVar.Z = 0;
            int i192 = this.mMaxWidth - i17;
            int[] iArr2 = eVar.C;
            iArr2[0] = i192;
            iArr2[1] = this.mMaxHeight - i16;
            eVar.f25296b0 = 0;
            eVar.f25298c0 = 0;
            eVar.M(i13);
            eVar.O(i10);
            eVar.N(i18);
            eVar.L(i12);
            i14 = this.mMinWidth - i17;
            if (i14 < 0) {
            }
            i15 = this.mMinHeight - i16;
            if (i15 < 0) {
            }
        } else if (childCount == 0) {
            i10 = Math.max(0, this.mMinWidth);
        }
        i13 = 2;
        if (i11 != Integer.MIN_VALUE) {
        }
        if (i10 == eVar.q()) {
        }
        eVar.f25332s0.f18748b = true;
        eVar.Y = 0;
        eVar.Z = 0;
        int i1922 = this.mMaxWidth - i17;
        int[] iArr22 = eVar.C;
        iArr22[0] = i1922;
        iArr22[1] = this.mMaxHeight - i16;
        eVar.f25296b0 = 0;
        eVar.f25298c0 = 0;
        eVar.M(i13);
        eVar.O(i10);
        eVar.N(i18);
        eVar.L(i12);
        i14 = this.mMinWidth - i17;
        if (i14 < 0) {
        }
        i15 = this.mMinHeight - i16;
        if (i15 < 0) {
        }
    }

    public void setState(int i5, int i10, int i11) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            float f6 = i10;
            float f10 = i11;
            ConstraintLayout constraintLayout = iVar.f1124a;
            SparseArray sparseArray = iVar.f1127d;
            int i12 = iVar.f1125b;
            int i13 = 0;
            if (i12 == i5) {
                g gVar = i5 == -1 ? (g) sparseArray.valueAt(0) : (g) sparseArray.get(i12);
                int i14 = iVar.f1126c;
                if (i14 == -1 || !((h) gVar.f1115b.get(i14)).a(f6, f10)) {
                    ArrayList arrayList = gVar.f1115b;
                    while (true) {
                        if (i13 >= arrayList.size()) {
                            i13 = -1;
                            break;
                        } else if (((h) arrayList.get(i13)).a(f6, f10)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    ArrayList arrayList2 = gVar.f1115b;
                    if (iVar.f1126c == i13) {
                        return;
                    }
                    p pVar = i13 == -1 ? null : ((h) arrayList2.get(i13)).f1123f;
                    if (i13 != -1) {
                        int i15 = ((h) arrayList2.get(i13)).f1122e;
                    }
                    if (pVar == null) {
                        return;
                    }
                    iVar.f1126c = i13;
                    pVar.a(constraintLayout);
                    constraintLayout.setConstraintSet(null);
                    constraintLayout.requestLayout();
                    return;
                }
                return;
            }
            iVar.f1125b = i5;
            g gVar2 = (g) sparseArray.get(i5);
            ArrayList arrayList3 = gVar2.f1115b;
            while (true) {
                if (i13 >= arrayList3.size()) {
                    i13 = -1;
                    break;
                } else if (((h) arrayList3.get(i13)).a(f6, f10)) {
                    break;
                } else {
                    i13++;
                }
            }
            ArrayList arrayList4 = gVar2.f1115b;
            p pVar2 = i13 == -1 ? gVar2.f1117d : ((h) arrayList4.get(i13)).f1123f;
            if (i13 != -1) {
                int i16 = ((h) arrayList4.get(i13)).f1122e;
            }
            if (pVar2 != null) {
                iVar.f1126c = i13;
                pVar2.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
                return;
            }
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i5 + ", dim =" + f6 + ", " + f10);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public d generateDefaultLayoutParams() {
        d dVar = new d(-2, -2);
        dVar.f1069a = -1;
        dVar.f1071b = -1;
        dVar.f1073c = -1.0f;
        dVar.f1075d = true;
        dVar.f1077e = -1;
        dVar.f1078f = -1;
        dVar.f1080g = -1;
        dVar.f1082h = -1;
        dVar.f1084i = -1;
        dVar.j = -1;
        dVar.f1086k = -1;
        dVar.f1087l = -1;
        dVar.f1089m = -1;
        dVar.f1091n = -1;
        dVar.f1093o = -1;
        dVar.f1095p = -1;
        dVar.q = 0;
        dVar.f1097r = 0.0f;
        dVar.f1098s = -1;
        dVar.f1099t = -1;
        dVar.f1100u = -1;
        dVar.f1101v = -1;
        dVar.f1102w = Integer.MIN_VALUE;
        dVar.f1103x = Integer.MIN_VALUE;
        dVar.f1104y = Integer.MIN_VALUE;
        dVar.f1105z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f1070a0 = true;
        dVar.f1072b0 = true;
        dVar.f1074c0 = false;
        dVar.f1076d0 = false;
        dVar.e0 = false;
        dVar.f1079f0 = -1;
        dVar.f1081g0 = -1;
        dVar.f1083h0 = -1;
        dVar.f1085i0 = -1;
        dVar.j0 = Integer.MIN_VALUE;
        dVar.k0 = Integer.MIN_VALUE;
        dVar.f1088l0 = 0.5f;
        dVar.f1096p0 = new x.d();
        return dVar;
    }

    @Override // android.view.ViewGroup
    public d generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f1069a = -1;
        dVar.f1071b = -1;
        dVar.f1073c = -1.0f;
        dVar.f1075d = true;
        dVar.f1077e = -1;
        dVar.f1078f = -1;
        dVar.f1080g = -1;
        dVar.f1082h = -1;
        dVar.f1084i = -1;
        dVar.j = -1;
        dVar.f1086k = -1;
        dVar.f1087l = -1;
        dVar.f1089m = -1;
        dVar.f1091n = -1;
        dVar.f1093o = -1;
        dVar.f1095p = -1;
        dVar.q = 0;
        dVar.f1097r = 0.0f;
        dVar.f1098s = -1;
        dVar.f1099t = -1;
        dVar.f1100u = -1;
        dVar.f1101v = -1;
        dVar.f1102w = Integer.MIN_VALUE;
        dVar.f1103x = Integer.MIN_VALUE;
        dVar.f1104y = Integer.MIN_VALUE;
        dVar.f1105z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f1070a0 = true;
        dVar.f1072b0 = true;
        dVar.f1074c0 = false;
        dVar.f1076d0 = false;
        dVar.e0 = false;
        dVar.f1079f0 = -1;
        dVar.f1081g0 = -1;
        dVar.f1083h0 = -1;
        dVar.f1085i0 = -1;
        dVar.j0 = Integer.MIN_VALUE;
        dVar.k0 = Integer.MIN_VALUE;
        dVar.f1088l0 = 0.5f;
        dVar.f1096p0 = new x.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1216b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            int i10 = c.f1068a.get(index);
            switch (i10) {
                case 1:
                    dVar.V = obtainStyledAttributes.getInt(index, dVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, dVar.f1095p);
                    dVar.f1095p = resourceId;
                    if (resourceId == -1) {
                        dVar.f1095p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    dVar.q = obtainStyledAttributes.getDimensionPixelSize(index, dVar.q);
                    break;
                case 4:
                    float f6 = obtainStyledAttributes.getFloat(index, dVar.f1097r) % 360.0f;
                    dVar.f1097r = f6;
                    if (f6 < 0.0f) {
                        dVar.f1097r = (360.0f - f6) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dVar.f1069a = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f1069a);
                    break;
                case 6:
                    dVar.f1071b = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f1071b);
                    break;
                case 7:
                    dVar.f1073c = obtainStyledAttributes.getFloat(index, dVar.f1073c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, dVar.f1077e);
                    dVar.f1077e = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f1077e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, dVar.f1078f);
                    dVar.f1078f = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f1078f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, dVar.f1080g);
                    dVar.f1080g = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f1080g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, dVar.f1082h);
                    dVar.f1082h = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f1082h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, dVar.f1084i);
                    dVar.f1084i = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.f1084i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, dVar.j);
                    dVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, dVar.f1086k);
                    dVar.f1086k = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f1086k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, dVar.f1087l);
                    dVar.f1087l = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f1087l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, dVar.f1089m);
                    dVar.f1089m = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f1089m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, dVar.f1098s);
                    dVar.f1098s = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f1098s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, dVar.f1099t);
                    dVar.f1099t = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f1099t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, dVar.f1100u);
                    dVar.f1100u = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f1100u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, dVar.f1101v);
                    dVar.f1101v = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f1101v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    dVar.f1102w = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1102w);
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    dVar.f1103x = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1103x);
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    dVar.f1104y = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1104y);
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    dVar.f1105z = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1105z);
                    break;
                case C0122e9.F /* 25 */:
                    dVar.A = obtainStyledAttributes.getDimensionPixelSize(index, dVar.A);
                    break;
                case C0122e9.G /* 26 */:
                    dVar.B = obtainStyledAttributes.getDimensionPixelSize(index, dVar.B);
                    break;
                case C0122e9.H /* 27 */:
                    dVar.W = obtainStyledAttributes.getBoolean(index, dVar.W);
                    break;
                case 28:
                    dVar.X = obtainStyledAttributes.getBoolean(index, dVar.X);
                    break;
                case C0122e9.I /* 29 */:
                    dVar.E = obtainStyledAttributes.getFloat(index, dVar.E);
                    break;
                case 30:
                    dVar.F = obtainStyledAttributes.getFloat(index, dVar.F);
                    break;
                case 31:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    dVar.L = i11;
                    if (i11 == 1) {
                        w0.d(TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    dVar.M = i12;
                    if (i12 == 1) {
                        w0.d(TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        dVar.N = obtainStyledAttributes.getDimensionPixelSize(index, dVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, dVar.N) == -2) {
                            dVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        dVar.P = obtainStyledAttributes.getDimensionPixelSize(index, dVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, dVar.P) == -2) {
                            dVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case C0122e9.J /* 35 */:
                    dVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dVar.R));
                    dVar.L = 2;
                    break;
                case 36:
                    try {
                        dVar.O = obtainStyledAttributes.getDimensionPixelSize(index, dVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, dVar.O) == -2) {
                            dVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        dVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, dVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, dVar.Q) == -2) {
                            dVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case C0122e9.K /* 38 */:
                    dVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dVar.S));
                    dVar.M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            p.h(dVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dVar.H = obtainStyledAttributes.getFloat(index, dVar.H);
                            break;
                        case 46:
                            dVar.I = obtainStyledAttributes.getFloat(index, dVar.I);
                            break;
                        case 47:
                            dVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                            dVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.T);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            dVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.U);
                            break;
                        case 51:
                            dVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, dVar.f1091n);
                            dVar.f1091n = resourceId15;
                            if (resourceId15 == -1) {
                                dVar.f1091n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, dVar.f1093o);
                            dVar.f1093o = resourceId16;
                            if (resourceId16 == -1) {
                                dVar.f1093o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            dVar.D = obtainStyledAttributes.getDimensionPixelSize(index, dVar.D);
                            break;
                        case 55:
                            dVar.C = obtainStyledAttributes.getDimensionPixelSize(index, dVar.C);
                            break;
                        default:
                            switch (i10) {
                                case 64:
                                    p.g(dVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    p.g(dVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dVar.Z = obtainStyledAttributes.getInt(index, dVar.Z);
                                    break;
                                case 67:
                                    dVar.f1075d = obtainStyledAttributes.getBoolean(index, dVar.f1075d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new x.e();
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
        this.mMeasurer = new e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i5);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f1069a = -1;
        dVar.f1071b = -1;
        dVar.f1073c = -1.0f;
        dVar.f1075d = true;
        dVar.f1077e = -1;
        dVar.f1078f = -1;
        dVar.f1080g = -1;
        dVar.f1082h = -1;
        dVar.f1084i = -1;
        dVar.j = -1;
        dVar.f1086k = -1;
        dVar.f1087l = -1;
        dVar.f1089m = -1;
        dVar.f1091n = -1;
        dVar.f1093o = -1;
        dVar.f1095p = -1;
        dVar.q = 0;
        dVar.f1097r = 0.0f;
        dVar.f1098s = -1;
        dVar.f1099t = -1;
        dVar.f1100u = -1;
        dVar.f1101v = -1;
        dVar.f1102w = Integer.MIN_VALUE;
        dVar.f1103x = Integer.MIN_VALUE;
        dVar.f1104y = Integer.MIN_VALUE;
        dVar.f1105z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f1070a0 = true;
        dVar.f1072b0 = true;
        dVar.f1074c0 = false;
        dVar.f1076d0 = false;
        dVar.e0 = false;
        dVar.f1079f0 = -1;
        dVar.f1081g0 = -1;
        dVar.f1083h0 = -1;
        dVar.f1085i0 = -1;
        dVar.j0 = Integer.MIN_VALUE;
        dVar.k0 = Integer.MIN_VALUE;
        dVar.f1088l0 = 0.5f;
        dVar.f1096p0 = new x.d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = marginLayoutParams.bottomMargin;
            dVar.setMarginStart(marginLayoutParams.getMarginStart());
            dVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof d)) {
            return dVar;
        }
        d dVar2 = (d) layoutParams;
        dVar.f1069a = dVar2.f1069a;
        dVar.f1071b = dVar2.f1071b;
        dVar.f1073c = dVar2.f1073c;
        dVar.f1075d = dVar2.f1075d;
        dVar.f1077e = dVar2.f1077e;
        dVar.f1078f = dVar2.f1078f;
        dVar.f1080g = dVar2.f1080g;
        dVar.f1082h = dVar2.f1082h;
        dVar.f1084i = dVar2.f1084i;
        dVar.j = dVar2.j;
        dVar.f1086k = dVar2.f1086k;
        dVar.f1087l = dVar2.f1087l;
        dVar.f1089m = dVar2.f1089m;
        dVar.f1091n = dVar2.f1091n;
        dVar.f1093o = dVar2.f1093o;
        dVar.f1095p = dVar2.f1095p;
        dVar.q = dVar2.q;
        dVar.f1097r = dVar2.f1097r;
        dVar.f1098s = dVar2.f1098s;
        dVar.f1099t = dVar2.f1099t;
        dVar.f1100u = dVar2.f1100u;
        dVar.f1101v = dVar2.f1101v;
        dVar.f1102w = dVar2.f1102w;
        dVar.f1103x = dVar2.f1103x;
        dVar.f1104y = dVar2.f1104y;
        dVar.f1105z = dVar2.f1105z;
        dVar.A = dVar2.A;
        dVar.B = dVar2.B;
        dVar.C = dVar2.C;
        dVar.D = dVar2.D;
        dVar.E = dVar2.E;
        dVar.F = dVar2.F;
        dVar.G = dVar2.G;
        dVar.H = dVar2.H;
        dVar.I = dVar2.I;
        dVar.J = dVar2.J;
        dVar.K = dVar2.K;
        dVar.W = dVar2.W;
        dVar.X = dVar2.X;
        dVar.L = dVar2.L;
        dVar.M = dVar2.M;
        dVar.N = dVar2.N;
        dVar.P = dVar2.P;
        dVar.O = dVar2.O;
        dVar.Q = dVar2.Q;
        dVar.R = dVar2.R;
        dVar.S = dVar2.S;
        dVar.T = dVar2.T;
        dVar.U = dVar2.U;
        dVar.V = dVar2.V;
        dVar.f1070a0 = dVar2.f1070a0;
        dVar.f1072b0 = dVar2.f1072b0;
        dVar.f1074c0 = dVar2.f1074c0;
        dVar.f1076d0 = dVar2.f1076d0;
        dVar.f1079f0 = dVar2.f1079f0;
        dVar.f1081g0 = dVar2.f1081g0;
        dVar.f1083h0 = dVar2.f1083h0;
        dVar.f1085i0 = dVar2.f1085i0;
        dVar.j0 = dVar2.j0;
        dVar.k0 = dVar2.k0;
        dVar.f1088l0 = dVar2.f1088l0;
        dVar.Y = dVar2.Y;
        dVar.Z = dVar2.Z;
        dVar.f1096p0 = dVar2.f1096p0;
        return dVar;
    }
}
