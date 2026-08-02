package com.vk.core.dialogs.alert;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.f4m;
import xsna.iah0;
import xsna.iut0;

/* compiled from: ButtonBarLayout.kt */
/* loaded from: classes17.dex */
public final class ButtonBarLayout extends LinearLayout {
    public boolean b;
    public int c;
    public final int d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        this.d = iah0.a(8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k);
        try {
            this.b = obtainStyledAttributes.getBoolean(0, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        int i = this.d;
        f4m.r(z ? 0 : i, button);
        f4m.t(z ? i : 0, button);
        if (!z) {
            i = 0;
        }
        f4m.q(i, button);
        for (int childCount = getChildCount() - 2; -1 < childCount; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        if (this.b) {
            if (size > this.c && getOrientation() == 1) {
                setStacked(false);
            }
            this.c = size;
        }
        if (getOrientation() != 1 && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.b && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            i4 = -1;
            if (i5 >= childCount) {
                i5 = -1;
                break;
            } else if (getChildAt(i5).getVisibility() == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i6 = i5 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i6 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i6).getVisibility() == 0) {
                        i4 = i6;
                        break;
                    }
                    i6++;
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (16 * getResources().getDisplayMetrics().density));
                } else {
                    r3 = measuredHeight;
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            r3 = paddingBottom + measuredHeight;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public final void setAllowStacking(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
