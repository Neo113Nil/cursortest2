package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.AbstractC2082d0;
import n0.AbstractC5597a;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2065u extends C2061p {

    /* renamed from: c, reason: collision with root package name */
    public final SeekBar f17360c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f17361d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f17362e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f17363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17364g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17365h;

    public C2065u(SeekBar seekBar) {
        super(seekBar);
        this.f17362e = null;
        this.f17363f = null;
        this.f17364g = false;
        this.f17365h = false;
        this.f17360c = seekBar;
    }

    @Override // androidx.appcompat.widget.C2061p
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        a0 v10 = a0.v(this.f17360c.getContext(), attributeSet, l.j.AppCompatSeekBar, i10, 0);
        SeekBar seekBar = this.f17360c;
        AbstractC2082d0.j0(seekBar, seekBar.getContext(), l.j.AppCompatSeekBar, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(l.j.f55206K);
        if (h10 != null) {
            this.f17360c.setThumb(h10);
        }
        j(v10.g(l.j.f55210L));
        if (v10.s(l.j.f55218N)) {
            this.f17363f = I.e(v10.k(l.j.f55218N, -1), this.f17363f);
            this.f17365h = true;
        }
        if (v10.s(l.j.f55214M)) {
            this.f17362e = v10.c(l.j.f55214M);
            this.f17364g = true;
        }
        v10.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f17361d;
        if (drawable != null) {
            if (this.f17364g || this.f17365h) {
                Drawable r10 = AbstractC5597a.r(drawable.mutate());
                this.f17361d = r10;
                if (this.f17364g) {
                    AbstractC5597a.o(r10, this.f17362e);
                }
                if (this.f17365h) {
                    AbstractC5597a.p(this.f17361d, this.f17363f);
                }
                if (this.f17361d.isStateful()) {
                    this.f17361d.setState(this.f17360c.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f17361d != null) {
            int max = this.f17360c.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f17361d.getIntrinsicWidth();
                int intrinsicHeight = this.f17361d.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f17361d.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f17360c.getWidth() - this.f17360c.getPaddingLeft()) - this.f17360c.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f17360c.getPaddingLeft(), this.f17360c.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f17361d.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f17361d;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f17360c.getDrawableState())) {
            this.f17360c.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f17361d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f17361d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f17361d = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f17360c);
            AbstractC5597a.m(drawable, this.f17360c.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f17360c.getDrawableState());
            }
            f();
        }
        this.f17360c.invalidate();
    }
}
