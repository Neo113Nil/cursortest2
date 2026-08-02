package com.vk.core.ui.bottomsheet.internal;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.b;
import xsna.iah0;

/* compiled from: LegoHugSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class d extends b {
    public final float a;
    public View b;
    public int c;
    public int d;

    public d() {
        this(0.6666667f);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean b() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        int i4;
        int i5 = this.c;
        int f = f(i, i3);
        if (f > ((int) (this.a * i5)) || (i4 = (i5 - f) - this.d) < 0) {
            return 0;
        }
        return i4;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int i4;
        int f = f(i, i3);
        int i5 = (int) (this.a * i2);
        if (f <= i5) {
            i4 = this.d;
        } else {
            f = iah0.a(16) + i5;
            i4 = this.d;
        }
        return f + i4;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final void e(int i, int i2, int i3, int i4, b.a aVar) {
        this.c = i3;
        super.e(i, i2, i3, i4, aVar);
    }

    public final int f(int i, int i2) {
        int measuredHeight;
        View view = this.b;
        if (view == null) {
            measuredHeight = -1;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, Integer.MIN_VALUE));
            measuredHeight = view.getMeasuredHeight();
        }
        return measuredHeight > 0 ? measuredHeight : this.c - i;
    }

    public d(float f) {
        this.a = f;
    }
}
