package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ryb extends LinearLayout {
    public static final Object l = null;
    public int a;
    public final ArrayList b;
    public final cqa c;
    public final rs2 d;
    public Integer[] e;
    public idi f;
    public jdi g;
    public int h;
    public ldi i;
    public boolean j;
    public final ArrayList k;

    public ryb(Context context, AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        idi b;
        XmlResourceParser xml;
        int next;
        int next2;
        this.a = 0;
        this.b = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.c = new cqa(materialButtonToggleGroup);
        this.d = new rs2(materialButtonToggleGroup, 5);
        this.j = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.k = new ArrayList();
        Context context2 = getContext();
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.v, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (Y.hasValue(2)) {
            int resourceId = Y.getResourceId(2, 0);
            ldi ldiVar = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        ldi ldiVar2 = new ldi();
                        ldiVar2.c = new int[10][];
                        ldiVar2.d = new cqa[10];
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            ldiVar2.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        ldiVar = ldiVar2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.i = ldiVar;
        }
        if (Y.hasValue(6)) {
            jdi g = jdi.g(context2, Y, 6);
            this.g = g;
            if (g == null) {
                this.g = new il9(xah.g(context2, Y.getResourceId(6, 0), Y.getResourceId(7, 0)).a()).d();
            }
        }
        if (Y.hasValue(3)) {
            q0 q0Var = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int resourceId2 = Y.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = idi.b(xah.k(Y, 3, q0Var));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        b = new idi();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            b.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = idi.b(q0Var);
                }
            } else {
                b = idi.b(xah.k(Y, 3, q0Var));
            }
            this.f = b;
        }
        this.h = Y.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(Y.getBoolean(0, true));
        setOverflowMode(Y.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        Y.recycle();
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new qyb(layoutParams.width, layoutParams.height);
    }

    public static qyb f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new qyb((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new qyb((ViewGroup.MarginLayoutParams) layoutParams) : new qyb(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (i(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i2 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.h <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                    LinearLayout.LayoutParams d = d(childAt);
                    if (getOrientation() != 0) {
                        d.setMarginEnd(0);
                        d.setMarginStart(this.h - i);
                        d.topMargin = 0;
                    } else {
                        d.bottomMargin = 0;
                        d.topMargin = this.h - i;
                        d.setMarginStart(0);
                    }
                    childAt.setLayoutParams(d);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                }
            }
            i = 0;
            LinearLayout.LayoutParams d2 = d(childAt);
            if (getOrientation() != 0) {
            }
            childAt.setLayoutParams(d2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams d3 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            d3.topMargin = 0;
            d3.bottomMargin = 0;
        } else {
            d3.setMarginEnd(0);
            d3.setMarginStart(0);
            d3.leftMargin = 0;
            d3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            j();
            this.j = true;
            int indexOfChild = indexOfChild(null);
            if (indexOfChild < 0 || i != -1) {
                super.addView(view, i, layoutParams);
            } else {
                super.addView(view, indexOfChild, layoutParams);
            }
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.c);
            this.b.add(materialButton.getShapeAppearance());
            materialButton.setEnabled(isEnabled());
        }
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.i == null) {
            return;
        }
        if (this.a != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    public final void c(int i, int i2) {
        float max;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(pyb.a);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = i;
        while (i4 <= i2) {
            if (i(i4)) {
                ((MaterialButton) getChildAt(i4)).setWidthChangeDirection(i4 == i ? pyb.c : i4 == i2 ? pyb.b : pyb.d);
                if (i(i4) && this.i != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                    ldi ldiVar = this.i;
                    int width = materialButton.getWidth();
                    int i5 = -width;
                    for (int i6 = 0; i6 < ldiVar.a; i6++) {
                        kdi kdiVar = (kdi) ldiVar.d[i6].a;
                        int i7 = kdiVar.a;
                        float f = kdiVar.b;
                        if (i7 == 2) {
                            max = Math.max(i5, f);
                        } else if (i7 == 1) {
                            max = Math.max(i5, width * f);
                        }
                        i5 = (int) max;
                    }
                    int max2 = Math.max(0, i5);
                    MaterialButton h = h(i4);
                    int allowedWidthDecrease = h == null ? 0 : h.getAllowedWidthDecrease();
                    MaterialButton g = g(i4);
                    r4 = Math.min(max2, allowedWidthDecrease + (g != null ? g.getAllowedWidthDecrease() : 0));
                }
                if (i4 != i && i4 != i2) {
                    r4 /= 2;
                }
                i3 = Math.min(i3, r4);
            }
            i4++;
        }
        while (i <= i2) {
            if (i(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.i);
                materialButton2.setWidthChangeMax(i3 * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qyb;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final qyb generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        qyb qybVar = new qyb(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.w);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
        return qybVar;
    }

    public final MaterialButton g(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (i(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.k;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= intValue && i <= intValue2 && (i2 < intValue || i2 > intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qyb(-2, -2);
    }

    @Nullable
    public ldi getButtonSizeChange() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @NonNull
    public ut3 getInnerCornerSize() {
        return this.f.b;
    }

    @NonNull
    public idi getInnerCornerSizeStateList() {
        return this.f;
    }

    @Nullable
    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.a;
    }

    @Nullable
    public xah getShapeAppearance() {
        jdi jdiVar = this.g;
        if (jdiVar == null) {
            return null;
        }
        return jdiVar.h();
    }

    public int getSpacing() {
        return this.h;
    }

    @Nullable
    public jdi getStateListShapeAppearance() {
        return this.g;
    }

    public final MaterialButton h(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (i(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.k;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= intValue && i < intValue2 && (i2 < intValue || i2 >= intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean i(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void j() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.C;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.C = null;
                materialButton.z = -2.1474836E9f;
            }
        }
    }

    public final void k() {
        int i;
        if (!(this.f == null && this.g == null) && this.j) {
            this.j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    Object obj = this.g;
                    ArrayList arrayList = this.b;
                    if (obj == null || (!z && !z2)) {
                        obj = (vah) arrayList.get(i2);
                    }
                    il9 il9Var = !(obj instanceof jdi) ? new il9((xah) arrayList.get(i2)) : ((jdi) obj).j();
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    idi idiVar = this.f;
                    if ((i3 | 1) == i3) {
                        il9Var.f = idiVar;
                    }
                    if ((i3 | 2) == i3) {
                        il9Var.g = idiVar;
                    }
                    if ((i3 | 4) == i3) {
                        il9Var.h = idiVar;
                    }
                    if ((i3 | 8) == i3) {
                        il9Var.i = idiVar;
                    }
                    jdi d = il9Var.d();
                    boolean f = d.f();
                    xah xahVar = d;
                    if (!f) {
                        xahVar = d.h();
                    }
                    materialButton.setShapeAppearance(xahVar);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a();
        if (this.a != 2) {
            i3 = 0;
        } else {
            if (getOrientation() == 1) {
                a70.p("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                a70.p("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.k;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (i(i7)) {
                    View view = (MaterialButton) getChildAt(i7);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams d = d(view);
                        if (i4 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.h) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i4));
                            }
                            i6 += i5 + (arrayList.isEmpty() ? 0 : this.h);
                            arrayList.add(Integer.valueOf(i7));
                            d.setMarginStart(-i4);
                            arrayList2.clear();
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 += measuredWidth + (i4 == 0 ? 0 : this.h);
                        i5 = Math.max(i5, measuredHeight);
                        arrayList2.add(Integer.valueOf(i7));
                        d.topMargin += i6;
                        view.setLayoutParams(d);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i4));
            int intValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i8 = 0;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                int intValue2 = ((Integer) arrayList.get(i9)).intValue();
                int intValue3 = ((Integer) arrayList3.get(i9)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(intValue2);
                LinearLayout.LayoutParams d2 = d(materialButton);
                int i10 = d2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                int i11 = intValue - intValue3;
                if (i10 != 8388611) {
                    if (absoluteGravity == 1) {
                        i11 /= 2;
                    }
                    d2.setMarginStart((d2.getMarginStart() + i11) - i8);
                    materialButton.setLayoutParams(d2);
                    i8 = i11;
                }
            }
            i3 = getPaddingBottom() + getPaddingTop() + i6 + i5;
        }
        k();
        super.onMeasure(i, i2);
        if (this.a != 2 || i3 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.b.remove(indexOfChild);
        }
        this.j = true;
        k();
        j();
        a();
    }

    public void setButtonSizeChange(@NonNull ldi ldiVar) {
        if (this.i != ldiVar) {
            this.i = ldiVar;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(@NonNull ut3 ut3Var) {
        this.f = idi.b(ut3Var);
        this.j = true;
        k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(@NonNull idi idiVar) {
        this.f = idiVar;
        this.j = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.j = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(@Nullable Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(@Nullable xah xahVar) {
        this.g = new il9(xahVar).d();
        this.j = true;
        k();
        invalidate();
    }

    public void setSpacing(int i) {
        this.h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(@Nullable jdi jdiVar) {
        this.g = jdiVar;
        this.j = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new qyb(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }
}
