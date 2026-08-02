package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hc0 extends f4a {
    public final gc0 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public hc0(gc0 gc0Var) {
        super(gc0Var, 1);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = gc0Var;
    }

    public final void F() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable mutate = drawable.mutate();
                this.k = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void G(Canvas canvas) {
        if (this.k != null) {
            int max = this.j.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.f4a
    public final void o(AttributeSet attributeSet, int i) {
        super.o(attributeSet, R.attr.seekBarStyle);
        gc0 gc0Var = this.j;
        Context context = gc0Var.getContext();
        int[] iArr = dkf.g;
        l2a y = l2a.y(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) y.c;
        bsk.p(gc0Var, gc0Var.getContext(), iArr, attributeSet, (TypedArray) y.c, R.attr.seekBarStyle);
        Drawable r = y.r(0);
        if (r != null) {
            gc0Var.setThumb(r);
        }
        Drawable q = y.q(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = q;
        if (q != null) {
            q.setCallback(gc0Var);
            q.setLayoutDirection(gc0Var.getLayoutDirection());
            if (q.isStateful()) {
                q.setState(gc0Var.getDrawableState());
            }
            F();
        }
        gc0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = fb5.c(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = y.m(2);
            this.n = true;
        }
        y.F();
        F();
    }
}
