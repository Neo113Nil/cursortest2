package com.facebook.drawee.drawable;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3010a extends Drawable implements Drawable.Callback, E, D {

    /* renamed from: a, reason: collision with root package name */
    public E f30404a;

    /* renamed from: b, reason: collision with root package name */
    public final C3013d f30405b = new C3013d();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f30406c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public boolean f30407d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30408e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30409f = false;
    private final InterfaceC3012c[] mDrawableParents;
    private final Drawable[] mLayers;

    /* renamed from: com.facebook.drawee.drawable.a$a, reason: collision with other inner class name */
    public class C0478a implements InterfaceC3012c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30410a;

        public C0478a(int i10) {
            this.f30410a = i10;
        }

        @Override // com.facebook.drawee.drawable.InterfaceC3012c
        public Drawable getDrawable() {
            return AbstractC3010a.this.b(this.f30410a);
        }

        @Override // com.facebook.drawee.drawable.InterfaceC3012c
        public Drawable setDrawable(Drawable drawable) {
            return AbstractC3010a.this.e(this.f30410a, drawable);
        }
    }

    public AbstractC3010a(Drawable[] drawableArr) {
        int i10 = 0;
        D6.k.g(drawableArr);
        this.mLayers = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.mLayers;
            if (i10 >= drawableArr2.length) {
                this.mDrawableParents = new InterfaceC3012c[drawableArr2.length];
                return;
            } else {
                C3014e.d(drawableArr2[i10], this, this);
                i10++;
            }
        }
    }

    public final InterfaceC3012c a(int i10) {
        return new C0478a(i10);
    }

    public Drawable b(int i10) {
        D6.k.b(Boolean.valueOf(i10 >= 0));
        D6.k.b(Boolean.valueOf(i10 < this.mLayers.length));
        return this.mLayers[i10];
    }

    public InterfaceC3012c c(int i10) {
        D6.k.b(Boolean.valueOf(i10 >= 0));
        D6.k.b(Boolean.valueOf(i10 < this.mDrawableParents.length));
        InterfaceC3012c[] interfaceC3012cArr = this.mDrawableParents;
        if (interfaceC3012cArr[i10] == null) {
            interfaceC3012cArr[i10] = a(i10);
        }
        return this.mDrawableParents[i10];
    }

    public int d() {
        return this.mLayers.length;
    }

    public Drawable e(int i10, Drawable drawable) {
        D6.k.b(Boolean.valueOf(i10 >= 0));
        D6.k.b(Boolean.valueOf(i10 < this.mLayers.length));
        Drawable drawable2 = this.mLayers[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f30409f) {
                drawable.mutate();
            }
            C3014e.d(this.mLayers[i10], null, null);
            C3014e.d(drawable, null, null);
            C3014e.e(drawable, this.f30405b);
            C3014e.a(drawable, this);
            C3014e.d(drawable, this, this);
            this.f30408e = false;
            this.mLayers[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mLayers.length == 0) {
            return -2;
        }
        int i10 = 1;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return i11;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Drawable.resolveOpacity(i11, drawable.getOpacity());
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f30406c;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // com.facebook.drawee.drawable.E
    public void getRootBounds(RectF rectF) {
        E e10 = this.f30404a;
        if (e10 != null) {
            e10.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.E
    public void getTransform(Matrix matrix) {
        E e10 = this.f30404a;
        if (e10 != null) {
            e10.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f30408e) {
            this.f30407d = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.mLayers;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f30407d;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f30407d = z11 | z10;
                i10++;
            }
            this.f30408e = true;
        }
        return this.f30407d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                this.f30409f = true;
                return this;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.mutate();
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30405b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f30405b.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f30405b.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // com.facebook.drawee.drawable.D
    public void setTransformCallback(E e10) {
        this.f30404a = e10;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.mLayers;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
