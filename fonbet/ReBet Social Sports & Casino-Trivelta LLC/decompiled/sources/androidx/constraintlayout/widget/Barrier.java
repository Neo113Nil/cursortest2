package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f18094h;

    /* renamed from: i, reason: collision with root package name */
    public int f18095i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f18096j;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f18096j.v1();
    }

    public int getMargin() {
        return this.f18096j.x1();
    }

    public int getType() {
        return this.f18094h;
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f18096j = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18619i1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.f18611h1) {
                    this.f18096j.A1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.f18627j1) {
                    this.f18096j.C1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f18228c = this.f18096j;
        o();
    }

    @Override // androidx.constraintlayout.widget.b
    public void j(androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
        p(eVar, this.f18094h, z10);
    }

    public final void p(androidx.constraintlayout.core.widgets.e eVar, int i10, boolean z10) {
        this.f18095i = i10;
        if (z10) {
            int i11 = this.f18094h;
            if (i11 == 5) {
                this.f18095i = 1;
            } else if (i11 == 6) {
                this.f18095i = 0;
            }
        } else {
            int i12 = this.f18094h;
            if (i12 == 5) {
                this.f18095i = 0;
            } else if (i12 == 6) {
                this.f18095i = 1;
            }
        }
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) eVar).B1(this.f18095i);
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f18096j.A1(z10);
    }

    public void setDpMargin(int i10) {
        this.f18096j.C1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f18096j.C1(i10);
    }

    public void setType(int i10) {
        this.f18094h = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
