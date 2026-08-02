package com.vk.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import xsna.vg10;

/* loaded from: classes17.dex */
public class MaskableFrameLayout extends FrameLayout {
    public final Handler b;

    @Nullable
    public Drawable c;

    @Nullable
    public Bitmap d;
    public Paint e;
    public PorterDuffXfermode f;

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.b = new Handler();
        setDrawingCacheEnabled(true);
        setLayerType(1, null);
        Paint paint = new Paint(1);
        paint.setAntiAlias(false);
        paint.setXfermode(this.f);
        this.e = paint;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new vg10(this, viewTreeObserver));
    }

    @Nullable
    public final Bitmap a(@Nullable Drawable drawable) {
        if (drawable == null) {
            L.e("No bitmap mask loaded, view will NOT be masked !");
            return null;
        }
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            L.e("Can't create a mask with height 0 or width 0. Or the layout has no children and is wrap content");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void b(@Nullable Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.d.recycle();
            }
            this.d = bitmap;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d == null || (paint = this.e) == null) {
            L.e("Mask or paint is null ...");
            return;
        }
        paint.setXfermode(this.f);
        canvas.drawBitmap(this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e);
        this.e.setXfermode(null);
    }

    @Nullable
    public Drawable getDrawableMask() {
        return this.c;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != null) {
            this.c = drawable;
            if (drawable instanceof AnimationDrawable) {
                drawable.setCallback(this);
            }
            b(a(drawable));
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            L.e("Width and height must be higher than 0");
            return;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            b(a(drawable));
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == null || runnable == null) {
            return;
        }
        this.b.postAtTime(runnable, j);
    }

    public void setMask(@Nullable Drawable drawable) {
        if (drawable != null) {
            this.c = drawable;
            if (drawable instanceof AnimationDrawable) {
                drawable.setCallback(this);
            }
        } else {
            L.e("Are you sure you don't want to provide a mask ?");
        }
        b(a(this.c));
        invalidate();
    }

    public void setPorterMode(int i) {
        PorterDuff.Mode mode;
        switch (i) {
            case 0:
                mode = PorterDuff.Mode.ADD;
                break;
            case 1:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 2:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 3:
                mode = PorterDuff.Mode.DST;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 5:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 7:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 8:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            case 9:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 10:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 11:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 12:
                mode = PorterDuff.Mode.SRC;
                break;
            case 13:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 15:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 16:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 17:
                mode = PorterDuff.Mode.XOR;
                break;
            default:
                mode = PorterDuff.Mode.DST_IN;
                break;
        }
        L.e("Mode is " + mode.toString());
        this.f = new PorterDuffXfermode(mode);
        Paint paint = new Paint(1);
        paint.setAntiAlias(false);
        paint.setXfermode(this.f);
        this.e = paint;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == null || runnable == null) {
            return;
        }
        this.b.removeCallbacks(runnable);
    }

    public void setMask(int i) {
        Resources resources = getResources();
        if (resources != null) {
            setMask(resources.getDrawable(i));
        } else {
            L.e("Unable to load resources, mask will not be loaded as drawable");
        }
    }
}
