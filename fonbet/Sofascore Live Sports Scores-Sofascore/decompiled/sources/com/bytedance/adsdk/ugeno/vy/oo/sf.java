package com.bytedance.adsdk.ugeno.vy.oo;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.me4;
import defpackage.zzl;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends Drawable {
    private final boolean[] dax;
    private boolean gbb;
    private final RectF gm;
    private ColorStateList gpj;
    private Shader.TileMode hc;
    private float jr;
    private final RectF kj;
    private ImageView.ScaleType lo;
    private float lu;
    private boolean nac;
    private final Bitmap oo;
    private final Matrix ork;
    private final int qf;
    private Shader.TileMode tmg;
    private final RectF vh;
    private final Paint vj;
    private final Paint vy;
    private final int wh;
    private final RectF pcc = new RectF();
    private final RectF sf = new RectF();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.vy.oo.sf$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            pcc = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public sf(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.gm = rectF;
        this.kj = new RectF();
        this.ork = new Matrix();
        this.vh = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.tmg = tileMode;
        this.hc = tileMode;
        this.gbb = true;
        this.jr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.dax = new boolean[]{true, true, true, true};
        this.nac = false;
        this.lu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gpj = ColorStateList.valueOf(-16777216);
        this.lo = ImageView.ScaleType.FIT_CENTER;
        this.oo = bitmap;
        int width = bitmap.getWidth();
        this.wh = width;
        int height = bitmap.getHeight();
        this.qf = height;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        Paint paint = new Paint();
        this.vj = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.vy = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.gpj.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.lu);
    }

    private void pcc() {
        float width;
        float height;
        int i = AnonymousClass1.pcc[this.lo.ordinal()];
        if (i == 1) {
            this.kj.set(this.pcc);
            RectF rectF = this.kj;
            float f = this.lu;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.ork.reset();
            this.ork.setTranslate((int) me4.b(this.kj.width(), this.wh, 0.5f, 0.5f), (int) me4.b(this.kj.height(), this.qf, 0.5f, 0.5f));
        } else if (i == 2) {
            this.kj.set(this.pcc);
            RectF rectF2 = this.kj;
            float f2 = this.lu;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.ork.reset();
            float height2 = this.kj.height() * this.wh;
            float width2 = this.kj.width() * this.qf;
            RectF rectF3 = this.kj;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (height2 > width2) {
                width = rectF3.height() / this.qf;
                f3 = (this.kj.width() - (this.wh * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = rectF3.width() / this.wh;
                height = (this.kj.height() - (this.qf * width)) * 0.5f;
            }
            this.ork.setScale(width, width);
            Matrix matrix = this.ork;
            float f4 = this.lu;
            matrix.postTranslate((f4 / 2.0f) + ((int) (f3 + 0.5f)), (f4 / 2.0f) + ((int) (height + 0.5f)));
        } else if (i == 3) {
            this.ork.reset();
            float min = (((float) this.wh) > this.pcc.width() || ((float) this.qf) > this.pcc.height()) ? Math.min(this.pcc.width() / this.wh, this.pcc.height() / this.qf) : 1.0f;
            float width3 = (int) (((this.pcc.width() - (this.wh * min)) * 0.5f) + 0.5f);
            float height3 = (int) (((this.pcc.height() - (this.qf * min)) * 0.5f) + 0.5f);
            this.ork.setScale(min, min);
            this.ork.postTranslate(width3, height3);
            this.kj.set(this.gm);
            this.ork.mapRect(this.kj);
            RectF rectF4 = this.kj;
            float f5 = this.lu;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.ork.setRectToRect(this.gm, this.kj, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.kj.set(this.gm);
            this.ork.setRectToRect(this.gm, this.pcc, Matrix.ScaleToFit.END);
            this.ork.mapRect(this.kj);
            RectF rectF5 = this.kj;
            float f6 = this.lu;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.ork.setRectToRect(this.gm, this.kj, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF6 = this.kj;
            if (i != 7) {
                rectF6.set(this.gm);
                this.ork.setRectToRect(this.gm, this.pcc, Matrix.ScaleToFit.CENTER);
                this.ork.mapRect(this.kj);
                RectF rectF7 = this.kj;
                float f7 = this.lu;
                rectF7.inset(f7 / 2.0f, f7 / 2.0f);
                this.ork.setRectToRect(this.gm, this.kj, Matrix.ScaleToFit.FILL);
            } else {
                rectF6.set(this.pcc);
                RectF rectF8 = this.kj;
                float f8 = this.lu;
                rectF8.inset(f8 / 2.0f, f8 / 2.0f);
                this.ork.reset();
                this.ork.setRectToRect(this.gm, this.kj, Matrix.ScaleToFit.FILL);
            }
        } else {
            this.kj.set(this.gm);
            this.ork.setRectToRect(this.gm, this.pcc, Matrix.ScaleToFit.START);
            this.ork.mapRect(this.kj);
            RectF rectF9 = this.kj;
            float f9 = this.lu;
            rectF9.inset(f9 / 2.0f, f9 / 2.0f);
            this.ork.setRectToRect(this.gm, this.kj, Matrix.ScaleToFit.FILL);
        }
        this.sf.set(this.kj);
        this.gbb = true;
    }

    private void sf(Canvas canvas) {
        float f;
        float f2;
        if (sf(this.dax) || this.jr == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.sf;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float width = rectF.width() + f3;
        float height = this.sf.height() + f4;
        float f5 = this.jr;
        float f6 = this.lu / 2.0f;
        if (this.dax[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.vy);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.vy);
        }
        if (!this.dax[1]) {
            float f7 = f;
            canvas.drawLine((width - f5) - f6, f7, width, f, this.vy);
            canvas.drawLine(width, f7 - f6, width, f7 + f5, this.vy);
            width = width;
        }
        if (this.dax[2]) {
            f2 = height;
        } else {
            canvas.drawLine((width - f5) - f6, height, width + f6, height, this.vy);
            float f8 = width;
            canvas.drawLine(f8, height - f5, width, height, this.vy);
            f2 = height;
        }
        if (this.dax[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.vy);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.vy);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.gbb) {
            BitmapShader bitmapShader = new BitmapShader(this.oo, this.tmg, this.hc);
            Shader.TileMode tileMode = this.tmg;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.hc == tileMode2) {
                bitmapShader.setLocalMatrix(this.ork);
            }
            this.vj.setShader(bitmapShader);
            this.gbb = false;
        }
        if (this.nac) {
            float f = this.lu;
            RectF rectF = this.sf;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawOval(rectF, this.vj);
                return;
            } else {
                canvas.drawOval(rectF, this.vj);
                canvas.drawOval(this.kj, this.vy);
                return;
            }
        }
        if (!pcc(this.dax)) {
            canvas.drawRect(this.sf, this.vj);
            if (this.lu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(this.kj, this.vy);
                return;
            }
            return;
        }
        float f2 = this.jr;
        float f3 = this.lu;
        RectF rectF2 = this.sf;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRoundRect(rectF2, f2, f2, this.vj);
            pcc(canvas);
        } else {
            canvas.drawRoundRect(rectF2, f2, f2, this.vj);
            canvas.drawRoundRect(this.kj, f2, f2, this.vy);
            pcc(canvas);
            sf(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.vj.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.vj.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.qf;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.wh;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.gpj.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.pcc.set(rect);
        pcc();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.gpj.getColorForState(iArr, 0);
        if (this.vy.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.vy.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.vj.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.vj.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.vj.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.vj.setFilterBitmap(z);
        invalidateSelf();
    }

    public static Bitmap sf(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public sf sf(Shader.TileMode tileMode) {
        if (this.hc != tileMode) {
            this.hc = tileMode;
            this.gbb = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean sf(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static Drawable pcc(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof sf) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && zzl.n(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), pcc(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap sf = sf(drawable);
        return sf != null ? new sf(sf) : drawable;
    }

    public static sf pcc(Bitmap bitmap) {
        if (bitmap != null) {
            return new sf(bitmap);
        }
        return null;
    }

    private void pcc(Canvas canvas) {
        if (sf(this.dax) || this.jr == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.sf;
        float f = rectF.left;
        float f2 = rectF.top;
        float width = rectF.width() + f;
        float height = this.sf.height() + f2;
        float f3 = this.jr;
        if (!this.dax[0]) {
            this.vh.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.vh, this.vj);
        }
        if (!this.dax[1]) {
            this.vh.set(width - f3, f2, width, f3);
            canvas.drawRect(this.vh, this.vj);
        }
        if (!this.dax[2]) {
            this.vh.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.vh, this.vj);
        }
        if (this.dax[3]) {
            return;
        }
        this.vh.set(f, height - f3, f3 + f, height);
        canvas.drawRect(this.vh, this.vj);
    }

    public sf pcc(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.jr = floatValue;
                } else {
                    a70.p("Invalid radius value: ".concat(String.valueOf(floatValue)));
                    return null;
                }
            } else {
                this.jr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            boolean[] zArr = this.dax;
            zArr[0] = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[1] = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[2] = f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[3] = f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return this;
        }
        a70.p("Multiple nonzero corner radii not yet supported.");
        return null;
    }

    public sf pcc(float f) {
        this.lu = f;
        this.vy.setStrokeWidth(f);
        return this;
    }

    public sf pcc(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.gpj = colorStateList;
        this.vy.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public sf pcc(boolean z) {
        this.nac = z;
        return this;
    }

    public sf pcc(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.lo != scaleType) {
            this.lo = scaleType;
            pcc();
        }
        return this;
    }

    public sf pcc(Shader.TileMode tileMode) {
        if (this.tmg != tileMode) {
            this.tmg = tileMode;
            this.gbb = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean pcc(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
