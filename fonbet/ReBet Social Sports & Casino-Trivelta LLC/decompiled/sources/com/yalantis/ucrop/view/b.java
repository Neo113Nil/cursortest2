package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import hd.C4504b;
import jd.AbstractC5130a;
import jd.d;
import jd.g;

/* loaded from: classes4.dex */
public abstract class b extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    public Matrix f42352d;

    /* renamed from: e, reason: collision with root package name */
    public int f42353e;

    /* renamed from: f, reason: collision with root package name */
    public int f42354f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0604b f42355g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42356h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f42357i;

    /* renamed from: j, reason: collision with root package name */
    public int f42358j;

    /* renamed from: k, reason: collision with root package name */
    public String f42359k;

    /* renamed from: l, reason: collision with root package name */
    public String f42360l;
    protected final float[] mCurrentImageCenter;
    protected final float[] mCurrentImageCorners;
    private float[] mInitialImageCenter;
    private float[] mInitialImageCorners;
    private final float[] mMatrixValues;

    /* renamed from: n, reason: collision with root package name */
    public Uri f42361n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f42362o;

    /* renamed from: p, reason: collision with root package name */
    public C4504b f42363p;

    public class a implements gd.b {
        public a() {
        }

        @Override // gd.b
        public void a(Bitmap bitmap, C4504b c4504b, Uri uri, Uri uri2) {
            b.this.f42361n = uri;
            b.this.f42362o = uri2;
            b.this.f42359k = uri.getPath();
            b.this.f42360l = uri2 != null ? uri2.getPath() : null;
            b.this.f42363p = c4504b;
            b bVar = b.this;
            bVar.f42356h = true;
            bVar.setImageBitmap(bitmap);
        }

        @Override // gd.b
        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            InterfaceC0604b interfaceC0604b = b.this.f42355g;
            if (interfaceC0604b != null) {
                interfaceC0604b.b(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0604b {
        void a();

        void b(Exception exc);

        void c(float f10);

        void d(float f10);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCurrentImageCorners = new float[8];
        this.mCurrentImageCenter = new float[2];
        this.mMatrixValues = new float[9];
        this.f42352d = new Matrix();
        this.f42356h = false;
        this.f42357i = false;
        this.f42358j = 0;
        k();
    }

    public float getCurrentAngle() {
        return h(this.f42352d);
    }

    public float getCurrentScale() {
        return i(this.f42352d);
    }

    public C4504b getExifInfo() {
        return this.f42363p;
    }

    public String getImageInputPath() {
        return this.f42359k;
    }

    public Uri getImageInputUri() {
        return this.f42361n;
    }

    public String getImageOutputPath() {
        return this.f42360l;
    }

    public Uri getImageOutputUri() {
        return this.f42362o;
    }

    public int getMaxBitmapSize() {
        if (this.f42358j <= 0) {
            this.f42358j = AbstractC5130a.b(getContext());
        }
        return this.f42358j;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof d)) {
            return null;
        }
        return ((d) getDrawable()).a();
    }

    public float h(Matrix matrix) {
        return (float) (-(Math.atan2(j(matrix, 1), j(matrix, 0)) * 57.29577951308232d));
    }

    public float i(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(j(matrix, 0), 2.0d) + Math.pow(j(matrix, 3), 2.0d));
    }

    public float j(Matrix matrix, int i10) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i10];
    }

    public void k() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.mInitialImageCorners = g.b(rectF);
        this.mInitialImageCenter = g.a(rectF);
        this.f42357i = true;
        InterfaceC0604b interfaceC0604b = this.f42355g;
        if (interfaceC0604b != null) {
            interfaceC0604b.a();
        }
    }

    public void m(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f42352d.postRotate(f10, f11, f12);
            setImageMatrix(this.f42352d);
            InterfaceC0604b interfaceC0604b = this.f42355g;
            if (interfaceC0604b != null) {
                interfaceC0604b.d(h(this.f42352d));
            }
        }
    }

    public void n(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f42352d.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f42352d);
            InterfaceC0604b interfaceC0604b = this.f42355g;
            if (interfaceC0604b != null) {
                interfaceC0604b.c(i(this.f42352d));
            }
        }
    }

    public void o(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f42352d.postTranslate(f10, f11);
        setImageMatrix(this.f42352d);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f42356h && !this.f42357i)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f42353e = width - paddingLeft;
            this.f42354f = height - paddingTop;
            l();
        }
    }

    public void p(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        AbstractC5130a.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    public final void q() {
        this.f42352d.mapPoints(this.mCurrentImageCorners, this.mInitialImageCorners);
        this.f42352d.mapPoints(this.mCurrentImageCenter, this.mInitialImageCenter);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f42352d.set(matrix);
        q();
    }

    public void setMaxBitmapSize(int i10) {
        this.f42358j = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(InterfaceC0604b interfaceC0604b) {
        this.f42355g = interfaceC0604b;
    }
}
