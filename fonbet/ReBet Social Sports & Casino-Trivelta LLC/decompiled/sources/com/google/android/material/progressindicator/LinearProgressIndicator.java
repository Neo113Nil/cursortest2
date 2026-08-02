package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public class LinearProgressIndicator extends b {

    /* renamed from: q, reason: collision with root package name */
    public static final int f35581q = ia.l.f48552D;

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48200E);
    }

    private void v() {
        o oVar = new o((r) this.f35583a);
        setIndeterminateDrawable(n.w(getContext(), (r) this.f35583a, oVar));
        setProgressDrawable(j.B(getContext(), (r) this.f35583a, oVar));
    }

    public int getIndeterminateAnimationType() {
        return ((r) this.f35583a).f35739n;
    }

    public int getIndicatorDirection() {
        return ((r) this.f35583a).f35740o;
    }

    public int getTrackInnerCornerRadius() {
        return ((r) this.f35583a).f35744s;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((r) this.f35583a).f35743r;
    }

    public int getTrackStopIndicatorSize() {
        return ((r) this.f35583a).f35742q;
    }

    @Override // com.google.android.material.progressindicator.b, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c cVar = this.f35583a;
        r rVar = (r) cVar;
        boolean z11 = true;
        if (((r) cVar).f35740o != 1 && ((getLayoutDirection() != 1 || ((r) this.f35583a).f35740o != 2) && (getLayoutDirection() != 0 || ((r) this.f35583a).f35740o != 3))) {
            z11 = false;
        }
        rVar.f35741p = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        n indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        j progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void q(int i10, boolean z10) {
        c cVar = this.f35583a;
        if (cVar != null && ((r) cVar).f35739n == 0 && isIndeterminate()) {
            return;
        }
        super.q(i10, z10);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((r) this.f35583a).f35739n == i10) {
            return;
        }
        if (t() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        c cVar = this.f35583a;
        ((r) cVar).f35739n = i10;
        ((r) cVar).h();
        if (i10 == 0) {
            getIndeterminateDrawable().A(new p((r) this.f35583a));
        } else {
            getIndeterminateDrawable().A(new q(getContext(), (r) this.f35583a));
        }
        p();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((r) this.f35583a).h();
    }

    public void setIndicatorDirection(int i10) {
        c cVar = this.f35583a;
        ((r) cVar).f35740o = i10;
        r rVar = (r) cVar;
        boolean z10 = true;
        if (i10 != 1 && ((getLayoutDirection() != 1 || ((r) this.f35583a).f35740o != 2) && (getLayoutDirection() != 0 || i10 != 3))) {
            z10 = false;
        }
        rVar.f35741p = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((r) this.f35583a).h();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i10) {
        c cVar = this.f35583a;
        if (((r) cVar).f35744s != i10) {
            ((r) cVar).f35744s = Math.round(Math.min(i10, ((r) cVar).f35602a / 2.0f));
            c cVar2 = this.f35583a;
            ((r) cVar2).f35746u = false;
            ((r) cVar2).f35747v = true;
            ((r) cVar2).h();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f10) {
        c cVar = this.f35583a;
        if (((r) cVar).f35745t != f10) {
            ((r) cVar).f35745t = Math.min(f10, 0.5f);
            c cVar2 = this.f35583a;
            ((r) cVar2).f35746u = true;
            ((r) cVar2).f35747v = true;
            ((r) cVar2).h();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        if (Objects.equals(((r) this.f35583a).f35743r, num)) {
            return;
        }
        ((r) this.f35583a).f35743r = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        c cVar = this.f35583a;
        if (((r) cVar).f35742q != i10) {
            ((r) cVar).f35742q = Math.min(i10, ((r) cVar).f35602a);
            ((r) this.f35583a).h();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public r i(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f35581q);
        v();
        this.f35593k = true;
    }
}
