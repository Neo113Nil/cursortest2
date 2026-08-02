package com.github.chrisbanes.photoview;

import E6.d;
import E6.e;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes8.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    private e f57768a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView.ScaleType f57769b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f57768a = new e(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f57769b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f57769b = null;
        }
    }

    public final e c() {
        return this.f57768a;
    }

    public final float d() {
        return this.f57768a.w();
    }

    public final float e() {
        return this.f57768a.x();
    }

    public final float f() {
        return this.f57768a.y();
    }

    public final float g() {
        return this.f57768a.z();
    }

    @Override // android.widget.ImageView
    public final Matrix getImageMatrix() {
        return this.f57768a.v();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.f57768a.A();
    }

    public final void h(Matrix matrix) {
        this.f57768a.B(matrix);
    }

    public final void i(float f7) {
        this.f57768a.D(f7);
    }

    public final void j(float f7) {
        this.f57768a.E(f7);
    }

    public final void k() {
        this.f57768a.F();
    }

    public final void l(d dVar) {
        this.f57768a.I(dVar);
    }

    public final void m(float f7) {
        this.f57768a.J(f7);
    }

    public final void n(float f7, float f11, float f12) {
        this.f57768a.K(f7, f11, f12, true);
    }

    public final void o(Matrix matrix) {
        this.f57768a.C(matrix);
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i11, int i12, int i13, int i14) {
        boolean frame = super.setFrame(i11, i12, i13, i14);
        if (frame) {
            this.f57768a.M();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e eVar = this.f57768a;
        if (eVar != null) {
            eVar.M();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i11) {
        super.setImageResource(i11);
        e eVar = this.f57768a;
        if (eVar != null) {
            eVar.M();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e eVar = this.f57768a;
        if (eVar != null) {
            eVar.M();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f57768a.G(onClickListener);
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f57768a.H(onLongClickListener);
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        e eVar = this.f57768a;
        if (eVar == null) {
            this.f57769b = scaleType;
        } else {
            eVar.L(scaleType);
        }
    }
}
