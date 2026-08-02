package com.vk.core.view.components.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.tabs.TabLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bpn0;
import xsna.dbj0;
import xsna.hbh0;
import xsna.izs;
import xsna.jjc;
import xsna.krv0;
import xsna.ozl;
import xsna.too0;
import xsna.tv4;
import xsna.zsa;

/* compiled from: VkTabLayout.kt */
@ozl
/* loaded from: classes17.dex */
public abstract class VkTabLayout extends TabLayout implements too0 {
    public static final /* synthetic */ int s0 = 0;
    public int c0;
    public boolean d0;
    public final ArrayList e0;
    public final bpn0 f0;
    public int g0;
    public int h0;
    public int i0;
    public Paint j0;
    public boolean k0;
    public boolean l0;
    public final boolean m0;
    public final float n0;
    public final int o0;
    public izs<? super TabLayout.g, ? extends View> p0;
    public final ArrayList q0;
    public int r0;

    /* compiled from: VkTabLayout.kt */
    public static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;

        /* compiled from: VkTabLayout.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
        }
    }

    /* compiled from: VkTabLayout.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: VkTabLayout.kt */
    public interface b {
        void a();
    }

    public VkTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Paint getDividerPaint() {
        Paint paint = this.j0;
        if (paint == null) {
            paint = new Paint();
            this.j0 = paint;
        }
        paint.setAntiAlias(false);
        paint.setDither(false);
        paint.setColor(krv0.m(this.o0, getContext()));
        return paint;
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.f0.getValue();
    }

    private final void setTabDefaultPaddings(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                childAt.setPadding(this.g0, childAt.getPaddingTop(), this.h0, childAt.getPaddingBottom());
            }
        }
    }

    public void Ng() {
        Paint paint = this.j0;
        if (paint != null) {
            paint.setColor(krv0.m(this.o0, getContext()));
        }
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.k0) {
            canvas2 = canvas;
            canvas2.drawRect(getScrollX(), getHeight() - this.n0, getWidth() + getScrollX(), getHeight(), getDividerPaint());
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        getScrollX();
    }

    @Override // com.google.android.material.tabs.TabLayout
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
    public final void i(TabLayout.g gVar, boolean z) {
        super.i(gVar, z);
        izs<? super TabLayout.g, ? extends View> izsVar = this.p0;
        if (izsVar != null) {
            gVar.l(izsVar.invoke(gVar));
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getGestureDetector().onTouchEvent(motionEvent)) {
            jjc.b();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.c0;
        if (i3 < 0) {
            i3 = getTabMode();
        }
        this.c0 = i3;
        boolean z = this.l0;
        ArrayList arrayList = this.q0;
        int i4 = 0;
        if (z) {
            arrayList.clear();
            int childCount = ((ViewGroup) getChildAt(0)).getChildCount();
            ArrayList arrayList2 = new ArrayList(childCount);
            for (int i5 = 0; i5 < childCount; i5 = tv4.a(arrayList2, 0, i5, 1)) {
            }
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            int childCount2 = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt != null) {
                    childAt.setPadding(0, childAt.getPaddingTop(), 0, childAt.getPaddingBottom());
                }
            }
            setTabGravity(2);
            super.setTabMode(0);
            super.onMeasure(i, i2);
            ViewGroup viewGroup2 = (ViewGroup) getChildAt(0);
            int childCount3 = viewGroup2.getChildCount();
            for (int i7 = 0; i7 < childCount3; i7++) {
                View childAt2 = viewGroup2.getChildAt(i7);
                if (childAt2 != null) {
                    arrayList2.add(Integer.valueOf(childAt2.getMeasuredWidth()));
                }
            }
            arrayList.addAll(arrayList2);
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    i8 += ((Number) it.next()).intValue();
                }
                int measuredWidth = getMeasuredWidth() - i8;
                if (measuredWidth > 0) {
                    int size = (measuredWidth / arrayList.size()) / 2;
                    ViewGroup viewGroup3 = (ViewGroup) getChildAt(0);
                    int childCount4 = viewGroup3.getChildCount();
                    while (i4 < childCount4) {
                        View childAt3 = viewGroup3.getChildAt(i4);
                        if (childAt3 != null) {
                            childAt3.setPadding(size, childAt3.getPaddingTop(), size, childAt3.getPaddingBottom());
                        }
                        i4++;
                    }
                } else {
                    ViewGroup viewGroup4 = (ViewGroup) getChildAt(0);
                    int childCount5 = viewGroup4.getChildCount();
                    for (int i9 = 0; i9 < childCount5; i9++) {
                        View childAt4 = viewGroup4.getChildAt(i9);
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
            int childCount6 = viewGroup5.getChildCount();
            for (int i10 = 0; i10 < childCount6; i10++) {
                View childAt5 = viewGroup5.getChildAt(i10);
                if (childAt5 != null) {
                    arrayList.add(Integer.valueOf(childAt5.getMeasuredWidth()));
                    childAt5.setPadding(this.g0, childAt5.getPaddingTop(), this.h0, childAt5.getPaddingBottom());
                }
            }
            super.setTabMode(1);
            super.onMeasure(i, i2);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    View childAt6 = viewGroup5.getChildAt(i11);
                    if (childAt6 != null && ((Number) arrayList.get(i11)).intValue() > childAt6.getMeasuredWidth()) {
                        super.setTabMode(0);
                        break;
                    }
                    i11++;
                } else {
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        View childAt7 = viewGroup5.getChildAt(i12);
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
                int size4 = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size4) {
                        View childAt8 = viewGroup6.getChildAt(i13);
                        if (childAt8 != null && ((Number) arrayList.get(i13)).intValue() > childAt8.getMeasuredWidth()) {
                            setTabGravity(2);
                            super.setTabMode(0);
                            break;
                        }
                        i13++;
                    } else {
                        int size5 = arrayList.size();
                        for (int i14 = 0; i14 < size5; i14++) {
                            View childAt9 = viewGroup6.getChildAt(i14);
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
                int size6 = arrayList.isEmpty() ? 0 : measuredWidth2 / arrayList.size();
                int i15 = measuredWidth2 - y2;
                int size7 = arrayList.size();
                int i16 = 0;
                for (int i17 = 0; i17 < size7; i17++) {
                    if (size6 - ((Number) arrayList.get(i17)).intValue() > 0) {
                        i16++;
                    }
                }
                if (arrayList.size() == i16) {
                    setTabGravity(0);
                    super.setTabMode(1);
                    int size8 = arrayList.size();
                    while (i4 < size8) {
                        View childAt10 = viewGroup6.getChildAt(i4);
                        if (childAt10 != null) {
                            childAt10.setPadding(this.g0, childAt10.getPaddingTop(), this.h0, childAt10.getPaddingBottom());
                        }
                        i4++;
                    }
                    super.onMeasure(i, i2);
                } else if (i16 > 0) {
                    int size9 = i15 / arrayList.size();
                    int size10 = arrayList.size();
                    while (i4 < size10) {
                        View childAt11 = viewGroup6.getChildAt(i4);
                        if (childAt11 != null) {
                            int i18 = size9 / 2;
                            childAt11.setPadding(this.g0 + i18, childAt11.getPaddingTop(), this.h0 + i18, childAt11.getPaddingBottom());
                        }
                        i4++;
                    }
                }
            } else {
                int i19 = measuredWidth2 - y;
                setTabGravity(2);
                super.setTabMode(1);
                int size11 = (arrayList.isEmpty() || i19 <= 0) ? 0 : i19 / arrayList.size();
                int childCount7 = viewGroup6.getChildCount();
                while (i4 < childCount7) {
                    View childAt12 = viewGroup6.getChildAt(i4);
                    int intValue = ((Number) arrayList.get(i4)).intValue() + size11;
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
                int i20 = this.i0;
                if ((viewGroup7.getChildCount() * (((i20 - this.g0) + i20) - this.h0)) + y3 <= measuredWidth3) {
                    int childCount8 = viewGroup7.getChildCount();
                    for (int i21 = 0; i21 < childCount8; i21++) {
                        View childAt13 = viewGroup7.getChildAt(i21);
                        int i22 = this.i0;
                        childAt13.setPadding(i22, 0, i22, 0);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.b);
            setTabMode(savedState.d);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.d = this.c0;
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getGestureDetector().onTouchEvent(motionEvent)) {
            jjc.b();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCustomTabContent(izs<? super TabLayout.g, ? extends d> izsVar) {
        setTabRippleColor(null);
        this.p0 = izsVar != null ? new zsa(izsVar, 2) : null;
    }

    public final void setCustomTabView(izs<? super TabLayout.g, ? extends View> izsVar) {
        this.p0 = izsVar;
    }

    public void setDividerVisible(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            invalidate();
        }
    }

    public final void setForceScrolling(boolean z) {
        this.d0 = z;
    }

    public final void setSelectedTabIndicatorColorAttr(int i) {
        this.r0 = i;
        z();
    }

    public final void setSpreadTabsEvenly(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            requestLayout();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void setTabMode(int i) {
        if (this.c0 == i) {
            return;
        }
        this.c0 = i;
        if (i == 3) {
            super.setTabMode(0);
        } else if (i != 4) {
            super.setTabMode(i);
        } else {
            super.setTabMode(1);
        }
    }

    public final void setTabPaddingEnd(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            requestLayout();
        }
    }

    public final void setTabPaddingStart(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            requestLayout();
        }
    }

    public final void setTabPaddingTabletHorizontal(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            requestLayout();
        }
    }

    public final int y(ViewGroup viewGroup) {
        ArrayList arrayList = this.q0;
        arrayList.clear();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                int measuredWidth = childAt.getMeasuredWidth();
                i = tv4.a(arrayList, measuredWidth, i, measuredWidth);
            }
        }
        return i;
    }

    public final void z() {
        if (this.r0 == 0) {
            setSelectedTabIndicatorColor(0);
        } else {
            setSelectedTabIndicatorColor(krv0.m(this.r0, getContext()));
        }
    }

    public VkTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.c0 = -1;
        this.d0 = true;
        this.e0 = new ArrayList();
        this.f0 = new bpn0(new dbj0(this, 21));
        this.m0 = true;
        this.n0 = hbh0.a(context, 0.5f);
        this.o0 = R.attr.vk_ui_separator_primary;
        this.q0 = new ArrayList();
        z();
    }

    private static /* synthetic */ void getTabMode$annotations() {
    }
}
