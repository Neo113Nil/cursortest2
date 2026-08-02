package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fqd;
import defpackage.hik;
import defpackage.hqd;
import defpackage.iqd;
import defpackage.oqd;
import defpackage.qqd;
import defpackage.rha;
import defpackage.wqd;
import defpackage.xqd;
import defpackage.zfe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PhotoView extends AppCompatImageView {
    public final zfe a;
    public ImageView.ScaleType b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new zfe(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.b = null;
        }
    }

    public zfe getAttacher() {
        return this.a;
    }

    public RectF getDisplayRect() {
        zfe zfeVar = this.a;
        zfeVar.b();
        Matrix c = zfeVar.c();
        RectF rectF = zfeVar.n;
        if (zfeVar.h.getDrawable() == null) {
            return null;
        }
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r4.getIntrinsicWidth(), r4.getIntrinsicHeight());
        c.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.a.l;
    }

    public float getMaximumScale() {
        return this.a.e;
    }

    public float getMediumScale() {
        return this.a.d;
    }

    public float getMinimumScale() {
        return this.a.c;
    }

    public float getScale() {
        return this.a.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.a.w;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.a.f = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.a.f();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        zfe zfeVar = this.a;
        if (zfeVar != null) {
            zfeVar.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        zfe zfeVar = this.a;
        if (zfeVar != null) {
            zfeVar.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        zfe zfeVar = this.a;
        if (zfeVar != null) {
            zfeVar.f();
        }
    }

    public void setMaximumScale(float f) {
        zfe zfeVar = this.a;
        rha.m(zfeVar.c, zfeVar.d, f);
        zfeVar.e = f;
    }

    public void setMediumScale(float f) {
        zfe zfeVar = this.a;
        rha.m(zfeVar.c, f, zfeVar.e);
        zfeVar.d = f;
    }

    public void setMinimumScale(float f) {
        zfe zfeVar = this.a;
        rha.m(f, zfeVar.d, zfeVar.e);
        zfeVar.c = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(fqd fqdVar) {
        this.a.getClass();
    }

    public void setOnOutsidePhotoTapListener(hqd hqdVar) {
        this.a.getClass();
    }

    public void setOnPhotoTapListener(iqd iqdVar) {
        this.a.getClass();
    }

    public void setOnScaleChangeListener(oqd oqdVar) {
        this.a.getClass();
    }

    public void setOnSingleFlingListener(qqd qqdVar) {
        this.a.r = qqdVar;
    }

    public void setOnViewDragListener(wqd wqdVar) {
        this.a.getClass();
    }

    public void setOnViewTapListener(xqd xqdVar) {
        this.a.getClass();
    }

    public void setRotationBy(float f) {
        zfe zfeVar = this.a;
        zfeVar.m.postRotate(f % 360.0f);
        zfeVar.a();
    }

    public void setRotationTo(float f) {
        zfe zfeVar = this.a;
        zfeVar.m.setRotate(f % 360.0f);
        zfeVar.a();
    }

    public void setScale(float f) {
        zfe zfeVar = this.a;
        PhotoView photoView = zfeVar.h;
        zfeVar.e(f, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        zfe zfeVar = this.a;
        if (zfeVar == null) {
            this.b = scaleType;
            return;
        }
        zfeVar.getClass();
        if (scaleType == null) {
            return;
        }
        if (hik.a[scaleType.ordinal()] == 1) {
            a70.r("Matrix scale type is not supported");
        } else if (scaleType != zfeVar.w) {
            zfeVar.w = scaleType;
            zfeVar.f();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.a.b = i;
    }

    public void setZoomable(boolean z) {
        zfe zfeVar = this.a;
        zfeVar.v = z;
        zfeVar.f();
    }
}
