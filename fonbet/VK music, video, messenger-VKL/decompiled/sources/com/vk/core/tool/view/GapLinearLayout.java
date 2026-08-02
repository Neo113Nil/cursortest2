package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.R$styleable;
import xsna.auw;
import xsna.e43;
import xsna.hfr;
import xsna.j21;
import xsna.jxt0;
import xsna.xka0;
import xsna.xtw;

/* compiled from: GapLinearLayout.kt */
/* loaded from: classes17.dex */
public class GapLinearLayout extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public int b;

    public GapLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, (4 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        hfr.a aVar = new hfr.a(new hfr(new auw(new jxt0(this)), true, new xka0(new j21((byte) 0, 8), 11)));
        int i2 = 0;
        while (aVar.hasNext()) {
            T t = ((xtw) aVar.next()).b;
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = ((View) t).getLayoutParams();
            if (i2 != 0 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                int orientation = getOrientation();
                if (orientation == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i;
                } else if (orientation == 1) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += i;
                }
            }
            i2 = i3;
        }
    }

    public final int getGap() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(this.b);
        super.onLayout(z, i, i2, i3, i4);
        a(-this.b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a(this.b);
        super.onMeasure(i, i2);
        a(-this.b);
    }

    public final void setGap(int i) {
        this.b = i;
        requestLayout();
    }

    public GapLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        setGap(obtainStyledAttributes.getDimensionPixelOffset(0, this.b));
        obtainStyledAttributes.recycle();
    }
}
