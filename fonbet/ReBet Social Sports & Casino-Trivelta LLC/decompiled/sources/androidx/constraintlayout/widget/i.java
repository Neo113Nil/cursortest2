package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.l;

/* loaded from: classes.dex */
public abstract class i extends b {

    /* renamed from: h, reason: collision with root package name */
    public boolean f18755h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18756i;

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b
    public void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18547Z0) {
                    this.f18755h = true;
                } else if (index == g.f18603g1) {
                    this.f18756i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18755h || this.f18756i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f18226a; i10++) {
                    View k10 = constraintLayout.k(this.mIds[i10]);
                    if (k10 != null) {
                        if (this.f18755h) {
                            k10.setVisibility(visibility);
                        }
                        if (this.f18756i && elevation > 0.0f) {
                            k10.setTranslationZ(k10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void p(l lVar, int i10, int i11);

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
