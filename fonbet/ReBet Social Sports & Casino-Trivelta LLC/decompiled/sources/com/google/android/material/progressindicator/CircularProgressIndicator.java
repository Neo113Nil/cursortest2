package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class CircularProgressIndicator extends b {

    /* renamed from: q, reason: collision with root package name */
    public static final int f35580q = ia.l.f48587z;

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48234g);
    }

    public int getIndeterminateAnimationType() {
        return ((g) this.f35583a).f35652n;
    }

    public int getIndicatorDirection() {
        return ((g) this.f35583a).f35655q;
    }

    public int getIndicatorInset() {
        return ((g) this.f35583a).f35654p;
    }

    public int getIndicatorSize() {
        return ((g) this.f35583a).f35653o;
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((g) this.f35583a).f35652n == i10) {
            return;
        }
        if (t() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        c cVar = this.f35583a;
        ((g) cVar).f35652n = i10;
        ((g) cVar).h();
        getIndeterminateDrawable().A(i10 == 1 ? new f(getContext(), (g) this.f35583a) : new e((g) this.f35583a));
        p();
        invalidate();
    }

    public void setIndicatorDirection(int i10) {
        ((g) this.f35583a).f35655q = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        c cVar = this.f35583a;
        if (((g) cVar).f35654p != i10) {
            ((g) cVar).f35654p = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        c cVar = this.f35583a;
        if (((g) cVar).f35653o != max) {
            ((g) cVar).f35653o = max;
            ((g) cVar).h();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((g) this.f35583a).h();
    }

    @Override // com.google.android.material.progressindicator.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public g i(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public final void v() {
        d dVar = new d((g) this.f35583a);
        setIndeterminateDrawable(n.v(getContext(), (g) this.f35583a, dVar));
        setProgressDrawable(j.A(getContext(), (g) this.f35583a, dVar));
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f35580q);
        v();
        this.f35593k = true;
    }
}
