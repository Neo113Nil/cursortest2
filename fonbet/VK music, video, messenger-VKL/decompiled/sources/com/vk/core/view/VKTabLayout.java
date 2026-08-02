package com.vk.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.VKTabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.abg0;
import xsna.bpn0;
import xsna.cp6;
import xsna.dhr0;
import xsna.gzs;
import xsna.iah0;
import xsna.j5g;
import xsna.jjc;
import xsna.l7s;
import xsna.rou0;
import xsna.too0;
import xsna.tv4;
import xsna.wzs;
import xsna.xgr0;
import xsna.ygr0;

@Deprecated
/* loaded from: classes.dex */
public class VKTabLayout extends TabLayout implements too0, rou0 {
    public static final /* synthetic */ int y0 = 0;
    public int c0;
    public boolean d0;
    public final ArrayList e0;
    public final bpn0 f0;
    public int g0;
    public int h0;
    public int i0;

    @Nullable
    public Paint j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public wzs<Integer, ViewGroup, View> p0;
    public int q0;
    public int r0;
    public final int s0;
    public int t0;
    public final int u0;
    public final ArrayList<Integer> v0;
    public boolean w0;
    public xgr0 x0;

    /* loaded from: classes17.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
        }
    }

    public class a implements gzs<GestureDetector> {
        public a() {
        }

        @Override // xsna.gzs
        public final GestureDetector invoke() {
            return new GestureDetector(VKTabLayout.this.getContext(), new b());
        }
    }

    /* loaded from: classes17.dex */
    public static class b extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes17.dex */
    public interface c {
        void a(int i);
    }

    public VKTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    private Paint getBottomLinePaint() {
        if (this.j0 == null) {
            Paint paint = new Paint();
            this.j0 = paint;
            paint.setAntiAlias(false);
            this.j0.setDither(false);
        }
        return this.j0;
    }

    private void setTabDefaultPaddings(@NonNull ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                childAt.setPadding(this.g0, childAt.getPaddingTop(), this.h0, childAt.getPaddingBottom());
            }
        }
    }

    public void Ng() {
        Drawable d;
        if (getContext() instanceof l7s) {
            return;
        }
        int tabCount = getTabCount();
        TabLayout.g b2 = tabCount > 0 ? super.b(0) : null;
        if (b2 != null && (b2.d() instanceof cp6)) {
            for (int i = 0; i < getTabCount(); i++) {
                TabLayout.g b3 = super.b(i);
                if (b3 != null) {
                    z(b3.d(), b3.h());
                }
            }
        }
        int i2 = this.q0;
        if (i2 != 0) {
            abg0 abg0Var = dhr0.t;
            int c2 = abg0Var.c(i2);
            int i3 = this.r0;
            if (i3 != 0) {
                setTabTextColors(TabLayout.n(c2, abg0Var.c(i3)));
            } else {
                setTabTextColors(ColorStateList.valueOf(c2));
            }
        }
        int i4 = this.s0;
        if (i4 != 0 && (d = dhr0.t.d(i4)) != null) {
            setSelectedTabIndicator(d);
            setSelectedTabIndicatorHeight(d.getIntrinsicHeight());
        }
        int i5 = this.t0;
        if (i5 != 0) {
            setSelectedTabIndicatorColor(dhr0.t.c(i5));
        }
        int i6 = this.u0;
        if (i6 != 0) {
            setTabRippleColor(ColorStateList.valueOf(dhr0.t.c(i6)));
        }
        if (this.o0 != 0) {
            getBottomLinePaint().setColor(dhr0.t.c(this.o0));
        }
        for (int i7 = 0; i7 < tabCount; i7++) {
            TabLayout.g b4 = super.b(i7);
            if (b4 != null) {
                z(b4.d(), b4.h());
            }
        }
    }

    @Override // xsna.rou0
    public final boolean a(@NonNull TabLayout.g gVar) {
        return false;
    }

    @Override // com.google.android.material.tabs.TabLayout, xsna.rou0
    public final void c(@NonNull TabLayout.g gVar, boolean z) {
        xgr0 xgr0Var = this.x0;
        if (xgr0Var == null || !xgr0Var.a(gVar)) {
            super.c(gVar, z);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, xsna.rou0
    public final void d(int i, float f, boolean z, boolean z2) {
        v(i, f, z, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.k0) {
            canvas2 = canvas;
            canvas2.drawRect(getScrollX(), getHeight() - this.n0, getWidth() + getScrollX(), getHeight(), getBottomLinePaint());
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        getScrollX();
    }

    @Override // xsna.rou0
    public final int e(@NonNull TabLayout.g gVar) {
        return gVar.f();
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void g(@NonNull TabLayout.d dVar) {
        f(dVar);
    }

    @Override // com.google.android.material.tabs.TabLayout, xsna.rou0
    public int getTabCount() {
        return super.getTabCount();
    }

    @Override // com.google.android.material.tabs.TabLayout
    @SuppressLint({"WrongConstant"})
    public int getTabMode() {
        int i = this.c0;
        if (i >= 0 && i <= 2) {
            return i;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        return super.getTabMode();
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void i(@NonNull TabLayout.g gVar, boolean z) {
        CharSequence g;
        super.i(gVar, z);
        wzs<Integer, ViewGroup, View> wzsVar = this.p0;
        if (wzsVar != null) {
            View invoke = wzsVar.invoke(Integer.valueOf(gVar.f()), gVar.h);
            if ((invoke instanceof cp6) && (g = gVar.g()) != null) {
                ((cp6) invoke).setText(g);
            }
            z(invoke, z);
            gVar.l(invoke);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (jjc.e()) {
            return true;
        }
        if (((GestureDetector) this.f0.getValue()).onTouchEvent(motionEvent)) {
            jjc.b();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.c0;
        if (i3 < 0) {
            i3 = getTabMode();
        }
        this.c0 = i3;
        boolean z = this.l0;
        ArrayList<Integer> arrayList = this.v0;
        int i4 = 0;
        if (z) {
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList(((ViewGroup) getChildAt(0)).getChildCount());
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt != null) {
                    childAt.setPadding(0, childAt.getPaddingTop(), 0, childAt.getPaddingBottom());
                }
            }
            setTabGravity(2);
            super.setTabMode(0);
            super.onMeasure(i, i2);
            ViewGroup viewGroup2 = (ViewGroup) getChildAt(0);
            for (int i6 = 0; i6 < viewGroup2.getChildCount(); i6++) {
                View childAt2 = viewGroup2.getChildAt(i6);
                if (childAt2 != null) {
                    arrayList2.add(Integer.valueOf(childAt2.getMeasuredWidth()));
                }
            }
            arrayList.addAll(arrayList2);
            if (arrayList.size() > 0) {
                Iterator<Integer> it = arrayList.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    i7 += it.next().intValue();
                }
                int measuredWidth = getMeasuredWidth() - i7;
                if (measuredWidth > 0) {
                    int size = (measuredWidth / arrayList.size()) / 2;
                    ViewGroup viewGroup3 = (ViewGroup) getChildAt(0);
                    while (i4 < viewGroup3.getChildCount()) {
                        View childAt3 = viewGroup3.getChildAt(i4);
                        if (childAt3 != null) {
                            childAt3.setPadding(size, childAt3.getPaddingTop(), size, childAt3.getPaddingBottom());
                        }
                        i4++;
                    }
                } else {
                    ViewGroup viewGroup4 = (ViewGroup) getChildAt(0);
                    for (int i8 = 0; i8 < viewGroup4.getChildCount(); i8++) {
                        View childAt4 = viewGroup4.getChildAt(i8);
                        if (childAt4 != null) {
                            childAt4.setPadding(0, childAt4.getPaddingTop(), 0, childAt4.getPaddingBottom());
                        }
                    }
                }
            }
        } else if (this.d0 && i3 == 1) {
            arrayList.clear();
            super.setTabMode(0);
            super.onMeasure(i, i2);
            ViewGroup viewGroup5 = (ViewGroup) getChildAt(0);
            for (int i9 = 0; i9 < viewGroup5.getChildCount(); i9++) {
                View childAt5 = viewGroup5.getChildAt(i9);
                if (childAt5 != null) {
                    arrayList.add(Integer.valueOf(childAt5.getMeasuredWidth()));
                    childAt5.setPadding(this.g0, childAt5.getPaddingTop(), this.h0, childAt5.getPaddingBottom());
                }
            }
            super.setTabMode(1);
            super.onMeasure(i, i2);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    View childAt6 = viewGroup5.getChildAt(i10);
                    if (childAt6 != null && arrayList.get(i10).intValue() > childAt6.getMeasuredWidth()) {
                        super.setTabMode(0);
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        View childAt7 = viewGroup5.getChildAt(i11);
                        if (childAt7 != null) {
                            childAt7.setPadding(0, childAt7.getPaddingTop(), 0, childAt7.getPaddingBottom());
                        }
                    }
                }
            }
        } else if (i3 == 3) {
            ViewGroup viewGroup6 = (ViewGroup) getChildAt(0);
            setTabDefaultPaddings(viewGroup6);
            setTabGravity(2);
            super.setTabMode(0);
            super.onMeasure(i, i2);
            int y = y(viewGroup6);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
            if (y > measuredWidth2) {
                setTabGravity(0);
                super.setTabMode(1);
                super.onMeasure(i, i2);
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        View childAt8 = viewGroup6.getChildAt(i12);
                        if (childAt8 != null && arrayList.get(i12).intValue() > childAt8.getMeasuredWidth()) {
                            setTabGravity(2);
                            super.setTabMode(0);
                            break;
                        }
                        i12++;
                    } else {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            View childAt9 = viewGroup6.getChildAt(i13);
                            if (childAt9 != null) {
                                childAt9.setPadding(0, childAt9.getPaddingTop(), 0, childAt9.getPaddingBottom());
                            }
                        }
                    }
                }
            } else if (this.m0) {
                setTabGravity(2);
                super.setTabMode(1);
                super.onMeasure(i, i2);
                int y2 = y(viewGroup6);
                int size2 = arrayList.isEmpty() ? 0 : measuredWidth2 / arrayList.size();
                int i14 = measuredWidth2 - y2;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    if (size2 - arrayList.get(i16).intValue() > 0) {
                        i15++;
                    }
                }
                if (arrayList.size() == i15) {
                    setTabGravity(0);
                    super.setTabMode(1);
                    while (i4 < arrayList.size()) {
                        View childAt10 = viewGroup6.getChildAt(i4);
                        if (childAt10 != null) {
                            childAt10.setPadding(this.g0, childAt10.getPaddingTop(), this.h0, childAt10.getPaddingBottom());
                        }
                        i4++;
                    }
                    super.onMeasure(i, i2);
                } else if (i15 > 0) {
                    int size3 = i14 / arrayList.size();
                    while (i4 < arrayList.size()) {
                        View childAt11 = viewGroup6.getChildAt(i4);
                        if (childAt11 != null) {
                            int i17 = size3 / 2;
                            childAt11.setPadding(this.g0 + i17, childAt11.getPaddingTop(), this.h0 + i17, childAt11.getPaddingBottom());
                        }
                        i4++;
                    }
                }
            } else {
                int i18 = measuredWidth2 - y;
                setTabGravity(2);
                super.setTabMode(1);
                int size4 = (arrayList.isEmpty() || i18 <= 0) ? 0 : i18 / arrayList.size();
                while (i4 < viewGroup6.getChildCount()) {
                    View childAt12 = viewGroup6.getChildAt(i4);
                    int intValue = arrayList.get(i4).intValue() + size4;
                    ViewGroup.LayoutParams layoutParams = childAt12.getLayoutParams();
                    layoutParams.width = intValue;
                    childAt12.setLayoutParams(layoutParams);
                    i4++;
                }
                super.onMeasure(i, i2);
            }
        } else if (i3 == 4) {
            ViewGroup viewGroup7 = (ViewGroup) getChildAt(0);
            if (viewGroup7.getChildCount() > 0) {
                setTabDefaultPaddings(viewGroup7);
                setTabGravity(0);
                super.setTabMode(1);
                super.onMeasure(i, i2);
                int y3 = y(viewGroup7);
                int measuredWidth3 = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
                int i19 = this.i0;
                if ((viewGroup7.getChildCount() * (((i19 - this.g0) + i19) - this.h0)) + y3 <= measuredWidth3) {
                    for (int i20 = 0; i20 < viewGroup7.getChildCount(); i20++) {
                        View childAt13 = viewGroup7.getChildAt(i20);
                        int i21 = this.i0;
                        childAt13.setPadding(i21, 0, i21, 0);
                    }
                }
            }
        } else if (i3 == 2 && this.w0) {
            arrayList.clear();
            super.onMeasure(i, i2);
            ViewGroup viewGroup8 = (ViewGroup) getChildAt(0);
            while (i4 < viewGroup8.getChildCount()) {
                View childAt14 = viewGroup8.getChildAt(i4);
                if (childAt14 != null) {
                    arrayList.add(Integer.valueOf(childAt14.getMeasuredWidth()));
                }
                i4++;
            }
            j5g.F0(arrayList);
            int i22 = iah0.f().widthPixels;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.d());
            setTabMode(savedState.d);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.c0;
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (jjc.e()) {
            return false;
        }
        if (((GestureDetector) this.f0.getValue()).onTouchEvent(motionEvent)) {
            jjc.b();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBottomLineColor(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            getBottomLinePaint().setColor(dhr0.t.c(i));
        }
    }

    public void setBottomLineHeight(int i) {
        if (this.n0 != i) {
            this.n0 = i;
            invalidate();
        }
    }

    public void setBottomLineVisible(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            invalidate();
        }
    }

    public void setCustomTabView(final int i) {
        setCustomTabView(new wzs() { // from class: xsna.wgr0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                ViewGroup viewGroup = (ViewGroup) obj2;
                int i2 = VKTabLayout.y0;
                return tf3.b(viewGroup, i, viewGroup, false);
            }
        });
    }

    public void setForceScrolling(boolean z) {
        this.d0 = z;
    }

    public void setIsEnabledTabsSizeListener(boolean z) {
        this.w0 = z;
    }

    public void setSelectTabInterceptor(xgr0 xgr0Var) {
        this.x0 = xgr0Var;
    }

    public void setSpreadTabsEvenly(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            requestLayout();
        }
    }

    public void setTabIndicatorColorAttrId(int i) {
        this.t0 = i;
        Ng();
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void setTabMode(int i) {
        if (this.c0 == i) {
            return;
        }
        this.c0 = i;
        if (i == 3) {
            super.setTabMode(0);
        } else if (i == 4) {
            super.setTabMode(1);
        } else {
            super.setTabMode(i);
        }
    }

    public void setTabPaddingEnd(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            requestLayout();
        }
    }

    public void setTabPaddingStart(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            requestLayout();
        }
    }

    public void setTabPaddingTabletHorizontal(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            requestLayout();
        }
    }

    public void setTabTextColorAttrId(int i) {
        this.q0 = i;
        Ng();
    }

    public void setTabTextSelectedColorAttrId(int i) {
        this.r0 = i;
        Ng();
    }

    public void setUsePaddingsToFillFreeWidthInFluidMode(boolean z) {
        if (this.m0 != z) {
            this.m0 = z;
            requestLayout();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void t(@NonNull TabLayout.d dVar) {
        this.M.remove(dVar);
    }

    public final int y(@NonNull ViewGroup viewGroup) {
        ArrayList<Integer> arrayList = this.v0;
        arrayList.clear();
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                int measuredWidth = childAt.getMeasuredWidth();
                i = tv4.a(arrayList, measuredWidth, i, measuredWidth);
            }
        }
        return i;
    }

    public final void z(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.text1);
        if (textView != null) {
            textView.setTextColor(getTabTextColors());
        }
        if (view instanceof cp6) {
            ((cp6) view).setTabSelected(z);
        }
    }

    public VKTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Drawable d;
        this.c0 = -1;
        this.d0 = true;
        this.e0 = new ArrayList();
        this.f0 = new bpn0(new a());
        this.k0 = false;
        this.l0 = false;
        this.m0 = true;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = null;
        this.q0 = 0;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = new ArrayList<>();
        this.q0 = dhr0.B("tabTextColor", attributeSet);
        int B = dhr0.B("tabSelectedTextColor", attributeSet);
        this.r0 = B;
        if (this.q0 == 0) {
            this.q0 = com.vkontakte.android.R.attr.vk_ui_text_tertiary;
        }
        if (B == 0) {
            this.r0 = com.vkontakte.android.R.attr.vk_ui_text_primary;
        }
        int A = dhr0.A("tabIndicator", attributeSet);
        this.s0 = A;
        if (A != 0 && (d = dhr0.t.d(A)) != null) {
            setSelectedTabIndicator(d);
            setSelectedTabIndicatorHeight(d.getIntrinsicHeight());
        }
        int A2 = dhr0.A("tabIndicatorColor", attributeSet);
        this.t0 = A2;
        if (A2 == 0) {
            this.t0 = com.vkontakte.android.R.attr.vk_ui_stroke_accent;
            setSelectedTabIndicatorColor(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_stroke_accent));
        }
        this.u0 = dhr0.A("tabRippleColor", attributeSet);
        this.g0 = dhr0.a0(com.vkontakte.android.R.attr.tabBarTabPadding);
        this.h0 = dhr0.a0(com.vkontakte.android.R.attr.tabBarTabPadding);
    }

    public void setCustomTabView(wzs<Integer, ViewGroup, View> wzsVar) {
        this.p0 = wzsVar;
    }

    public void setTabsSizeListener(ygr0 ygr0Var) {
    }
}
