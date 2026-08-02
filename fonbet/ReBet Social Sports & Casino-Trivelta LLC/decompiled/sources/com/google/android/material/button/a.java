package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.d;
import com.google.android.material.shape.n;
import com.google.android.material.shape.r;
import com.google.android.material.shape.s;
import com.google.android.material.shape.t;
import ia.l;
import ia.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import xa.o;

/* loaded from: classes3.dex */
public abstract class a extends LinearLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int f35062j = l.f48581t;

    /* renamed from: a, reason: collision with root package name */
    public final List f35063a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35064b;

    /* renamed from: c, reason: collision with root package name */
    public final b f35065c;
    private Integer[] childOrder;

    /* renamed from: d, reason: collision with root package name */
    public final Comparator f35066d;

    /* renamed from: e, reason: collision with root package name */
    public r f35067e;

    /* renamed from: f, reason: collision with root package name */
    public s f35068f;

    /* renamed from: g, reason: collision with root package name */
    public int f35069g;

    /* renamed from: h, reason: collision with root package name */
    public t f35070h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35071i;

    public class b implements MaterialButton.b {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            a.this.invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f35062j;
        this.f35063a = new ArrayList();
        this.f35064b = new ArrayList();
        this.f35065c = new b();
        this.f35066d = new Comparator() { // from class: oa.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return com.google.android.material.button.a.a(com.google.android.material.button.a.this, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f35071i = true;
        Context context2 = getContext();
        TypedArray i12 = xa.l.i(context2, attributeSet, m.MaterialButtonGroup, i10, i11, new int[0]);
        if (i12.hasValue(m.f49064w3)) {
            this.f35070h = t.b(context2, i12, m.f49064w3);
        }
        if (i12.hasValue(m.f49084y3)) {
            s b10 = s.b(context2, i12, m.f49084y3);
            this.f35068f = b10;
            if (b10 == null) {
                this.f35068f = new s.b(n.b(context2, i12.getResourceId(m.f49084y3, 0), i12.getResourceId(m.f49094z3, 0)).m()).j();
            }
        }
        if (i12.hasValue(m.f49074x3)) {
            this.f35067e = r.b(context2, i12, m.f49074x3, new com.google.android.material.shape.a(0.0f));
        }
        this.f35069g = i12.getDimensionPixelSize(m.f49054v3, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(i12.getBoolean(m.f49044u3, true));
        i12.recycle();
    }

    public static /* synthetic */ int a(a aVar, MaterialButton materialButton, MaterialButton materialButton2) {
        aVar.getClass();
        int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return compareTo2 != 0 ? compareTo2 : Integer.compare(aVar.indexOfChild(materialButton), aVar.indexOfChild(materialButton2));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (j(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.f35071i = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f35065c);
        this.f35063a.add(materialButton.getShapeAppearanceModel());
        this.f35064b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i10;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton f10 = f(i11);
            MaterialButton f11 = f(i11 - 1);
            if (this.f35069g <= 0) {
                i10 = Math.min(f10.getStrokeWidth(), f11.getStrokeWidth());
                f10.setShouldDrawSurfaceColorStroke(true);
                f11.setShouldDrawSurfaceColorStroke(true);
            } else {
                f10.setShouldDrawSurfaceColorStroke(false);
                f11.setShouldDrawSurfaceColorStroke(false);
                i10 = 0;
            }
            LinearLayout.LayoutParams d10 = d(f10);
            if (getOrientation() == 0) {
                d10.setMarginEnd(0);
                d10.setMarginStart(this.f35069g - i10);
                d10.topMargin = 0;
            } else {
                d10.bottomMargin = 0;
                d10.topMargin = this.f35069g - i10;
                d10.setMarginStart(0);
            }
            f10.setLayoutParams(d10);
        }
        m(firstVisibleChildIndex);
    }

    public final void c() {
        if (this.f35070h == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
            if (j(i11)) {
                int e10 = e(i11);
                if (i11 != firstVisibleChildIndex && i11 != lastVisibleChildIndex) {
                    e10 /= 2;
                }
                i10 = Math.min(i10, e10);
            }
        }
        int i12 = firstVisibleChildIndex;
        while (i12 <= lastVisibleChildIndex) {
            if (j(i12)) {
                f(i12).setSizeChange(this.f35070h);
                f(i12).setWidthChangeMax((i12 == firstVisibleChildIndex || i12 == lastVisibleChildIndex) ? i10 : i10 * 2);
            }
            i12++;
        }
    }

    public LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    public final int e(int i10) {
        if (!j(i10) || this.f35070h == null) {
            return 0;
        }
        int max = Math.max(0, this.f35070h.c(f(i10).getWidth()));
        MaterialButton i11 = i(i10);
        int allowedWidthDecrease = i11 == null ? 0 : i11.getAllowedWidthDecrease();
        MaterialButton g10 = g(i10);
        return Math.min(max, allowedWidthDecrease + (g10 != null ? g10.getAllowedWidthDecrease() : 0));
    }

    public MaterialButton f(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final MaterialButton g(int i10) {
        int childCount = getChildCount();
        do {
            i10++;
            if (i10 >= childCount) {
                return null;
            }
        } while (!j(i10));
        return f(i10);
    }

    public t getButtonSizeChange() {
        return this.f35070h;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    @NonNull
    public d getInnerCornerSize() {
        return this.f35067e.e();
    }

    @NonNull
    public r getInnerCornerSizeStateList() {
        return this.f35067e;
    }

    public n getShapeAppearance() {
        s sVar = this.f35068f;
        if (sVar == null) {
            return null;
        }
        return sVar.c(true);
    }

    public int getSpacing() {
        return this.f35069g;
    }

    public s getStateListShapeAppearance() {
        return this.f35068f;
    }

    public final s.b h(boolean z10, boolean z11, int i10) {
        s sVar = this.f35068f;
        if (sVar == null || (!z10 && !z11)) {
            sVar = (s) this.f35064b.get(i10);
        }
        return sVar == null ? new s.b((n) this.f35063a.get(i10)) : sVar.i();
    }

    public final MaterialButton i(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (j(i11)) {
                return f(i11);
            }
        }
        return null;
    }

    public void k(MaterialButton materialButton, int i10) {
        int indexOfChild = indexOfChild(materialButton);
        if (indexOfChild < 0) {
            return;
        }
        MaterialButton i11 = i(indexOfChild);
        MaterialButton g10 = g(indexOfChild);
        if (i11 == null && g10 == null) {
            return;
        }
        if (i11 == null) {
            g10.setDisplayedWidthDecrease(i10);
        }
        if (g10 == null) {
            i11.setDisplayedWidthDecrease(i10);
        }
        if (i11 == null || g10 == null) {
            return;
        }
        i11.setDisplayedWidthDecrease(i10 / 2);
        g10.setDisplayedWidthDecrease((i10 + 1) / 2);
    }

    public final void l() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).o();
        }
    }

    public final void m(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void n() {
        TreeMap treeMap = new TreeMap(this.f35066d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(f(i10), Integer.valueOf(i10));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void o() {
        int i10;
        if (!(this.f35067e == null && this.f35068f == null) && this.f35071i) {
            this.f35071i = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i11 = 0;
            while (i11 < childCount) {
                MaterialButton f10 = f(i11);
                if (f10.getVisibility() != 8) {
                    boolean z10 = i11 == firstVisibleChildIndex;
                    boolean z11 = i11 == lastVisibleChildIndex;
                    s.b h10 = h(z10, z11, i11);
                    boolean z12 = getOrientation() == 0;
                    boolean j10 = o.j(this);
                    if (z12) {
                        i10 = z10 ? 5 : 0;
                        if (z11) {
                            i10 |= 10;
                        }
                        if (j10) {
                            i10 = s.h(i10);
                        }
                    } else {
                        i10 = z10 ? 3 : 0;
                        if (z11) {
                            i10 |= 12;
                        }
                    }
                    s j11 = h10.n(this.f35067e, ~i10).j();
                    if (j11.f()) {
                        f10.setStateListShapeAppearanceModel(j11);
                    } else {
                        f10.setShapeAppearanceModel(j11.c(true));
                    }
                }
                i11++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        o();
        b();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f35063a.remove(indexOfChild);
            this.f35064b.remove(indexOfChild);
        }
        this.f35071i = true;
        o();
        l();
        b();
    }

    public void setButtonSizeChange(@NonNull t tVar) {
        if (this.f35070h != tVar) {
            this.f35070h = tVar;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(@NonNull d dVar) {
        this.f35067e = r.c(dVar);
        this.f35071i = true;
        o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(@NonNull r rVar) {
        this.f35067e = rVar;
        this.f35071i = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f35071i = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(n nVar) {
        this.f35068f = new s.b(nVar).j();
        this.f35071i = true;
        o();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.f35069g = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(s sVar) {
        this.f35068f = sVar;
        this.f35071i = true;
        o();
        invalidate();
    }
}
