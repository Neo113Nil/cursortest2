package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.logic.processor.h;
import xsna.ahq;
import xsna.aj2;
import xsna.an2;
import xsna.dc7;
import xsna.ec7;
import xsna.fc7;
import xsna.gc7;
import xsna.hpg0;
import xsna.hta0;
import xsna.rp2;
import xsna.s3q0;
import xsna.uvf;
import xsna.yi2;
import xsna.ym2;
import xsna.zcl;

/* compiled from: BitmapAnimationBackend.kt */
/* loaded from: classes12.dex */
public final class BitmapAnimationBackend implements ym2, an2.b {
    public static final int FRAME_TYPE_CACHED = 0;
    public static final int FRAME_TYPE_CREATED = 2;
    public static final int FRAME_TYPE_FALLBACK = 3;
    public static final int FRAME_TYPE_REUSED = 1;
    public static final int FRAME_TYPE_UNKNOWN = -1;
    private final rp2 animationInformation;
    private ym2.a animationListener;
    private final Bitmap.Config bitmapConfig;
    private final dc7 bitmapFrameCache;
    private final ec7 bitmapFramePreparationStrategy;
    private final fc7 bitmapFramePreparer;
    private final gc7 bitmapFrameRenderer;
    private int bitmapHeight;
    private int bitmapWidth;
    private Rect bounds;
    private final float[] cornerRadii;
    private b frameListener;
    private final boolean isNewRenderImplementation;
    private final Matrix matrix;
    private final Paint paint;
    private final Path path;
    private int pathFrameNumber;
    private final hta0 platformBitmapFactory;
    public static final a Companion = new a();
    private static final Class<BitmapAnimationBackend> TAG = BitmapAnimationBackend.class;

    /* compiled from: BitmapAnimationBackend.kt */
    public static final class a {
    }

    /* compiled from: BitmapAnimationBackend.kt */
    public interface b {
    }

    public BitmapAnimationBackend(hta0 hta0Var, dc7 dc7Var, rp2 rp2Var, gc7 gc7Var, boolean z, ec7 ec7Var, fc7 fc7Var, hpg0 hpg0Var) {
        this.platformBitmapFactory = hta0Var;
        this.bitmapFrameCache = dc7Var;
        this.animationInformation = rp2Var;
        this.bitmapFrameRenderer = gc7Var;
        this.isNewRenderImplementation = z;
        this.bitmapFramePreparationStrategy = ec7Var;
        this.bitmapFramePreparer = fc7Var;
        this.cornerRadii = null;
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.paint = new Paint(6);
        this.path = new Path();
        this.matrix = new Matrix();
        this.pathFrameNumber = -1;
        updateBitmapDimensions();
    }

    private final void drawBitmap(int i, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.bounds;
        if (rect == null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.paint);
        } else if (updatePath(i, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.path, this.paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.paint);
        }
    }

    private final boolean drawBitmapAndCache(int i, uvf<Bitmap> uvfVar, Canvas canvas, int i2) {
        if (uvfVar == null || !uvf.t(uvfVar)) {
            return false;
        }
        drawBitmap(i, uvfVar.r(), canvas);
        if (i2 == 3 || this.isNewRenderImplementation) {
            return true;
        }
        this.bitmapFrameCache.b(i, uvfVar);
        return true;
    }

    private final boolean drawFrameOrFallback(Canvas canvas, int i, int i2) {
        uvf g;
        boolean drawBitmapAndCache;
        uvf<Bitmap> uvfVar = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.isNewRenderImplementation) {
                ec7 ec7Var = this.bitmapFramePreparationStrategy;
                uvf<Bitmap> a2 = ec7Var != null ? ec7Var.a(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (a2 != null) {
                    try {
                        if (a2.s()) {
                            drawBitmap(i, a2.r(), canvas);
                            a2.close();
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        uvfVar = a2;
                        uvf.q(uvfVar);
                        throw th;
                    }
                }
                ec7 ec7Var2 = this.bitmapFramePreparationStrategy;
                if (ec7Var2 != null) {
                    ec7Var2.c(canvas.getWidth(), canvas.getHeight(), null);
                }
                uvf.q(a2);
                return false;
            }
            if (i2 == 0) {
                g = this.bitmapFrameCache.g(i);
                drawBitmapAndCache = drawBitmapAndCache(i, g, canvas, 0);
            } else if (i2 == 1) {
                g = this.bitmapFrameCache.d();
                if (renderFrameInBitmap(i, g) && drawBitmapAndCache(i, g, canvas, 1)) {
                    z = true;
                }
                drawBitmapAndCache = z;
                i3 = 2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        g = this.bitmapFrameCache.c();
                        drawBitmapAndCache = drawBitmapAndCache(i, g, canvas, 3);
                        i3 = -1;
                    }
                    return false;
                }
                try {
                    g = this.platformBitmapFactory.c(this.bitmapWidth, this.bitmapHeight, this.bitmapConfig);
                    if (renderFrameInBitmap(i, g) && drawBitmapAndCache(i, g, canvas, 2)) {
                        z = true;
                    }
                    drawBitmapAndCache = z;
                    i3 = 3;
                } catch (RuntimeException e) {
                    ahq.i(TAG, "Failed to create frame bitmap", e);
                }
            }
            uvf.q(g);
            return (drawBitmapAndCache || i3 == -1) ? drawBitmapAndCache : drawFrameOrFallback(canvas, i, i3);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 preloadAnimation$lambda$1(BitmapAnimationBackend bitmapAnimationBackend) {
        ym2.a aVar = bitmapAnimationBackend.animationListener;
        if (aVar != null) {
            ((aj2) ((yi2) aVar).c).n.getClass();
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 preloadAnimation$lambda$2(BitmapAnimationBackend bitmapAnimationBackend) {
        ym2.a aVar = bitmapAnimationBackend.animationListener;
        if (aVar != null) {
            ((aj2) ((yi2) aVar).c).n.getClass();
        }
        return s3q0.a;
    }

    private final boolean renderFrameInBitmap(int i, uvf<Bitmap> uvfVar) {
        if (uvfVar == null || !uvfVar.s()) {
            return false;
        }
        boolean a2 = this.bitmapFrameRenderer.a(i, uvfVar.r());
        if (!a2) {
            uvfVar.close();
        }
        return a2;
    }

    private final void updateBitmapDimensions() {
        int intrinsicWidth = this.bitmapFrameRenderer.getIntrinsicWidth();
        this.bitmapWidth = intrinsicWidth;
        if (intrinsicWidth == -1) {
            Rect rect = this.bounds;
            this.bitmapWidth = rect != null ? rect.width() : -1;
        }
        int intrinsicHeight = this.bitmapFrameRenderer.getIntrinsicHeight();
        this.bitmapHeight = intrinsicHeight;
        if (intrinsicHeight == -1) {
            Rect rect2 = this.bounds;
            this.bitmapHeight = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean updatePath(int i, Bitmap bitmap, float f, float f2) {
        if (this.cornerRadii == null) {
            return false;
        }
        if (i == this.pathFrameNumber) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.matrix.setRectToRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bitmapWidth, this.bitmapHeight), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.matrix);
        this.paint.setShader(bitmapShader);
        this.path.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2), this.cornerRadii, Path.Direction.CW);
        this.pathFrameNumber = i;
        return true;
    }

    @Override // xsna.ym2
    public void clear() {
        if (!this.isNewRenderImplementation) {
            this.bitmapFrameCache.clear();
            return;
        }
        ec7 ec7Var = this.bitmapFramePreparationStrategy;
        if (ec7Var != null) {
            ec7Var.b();
        }
    }

    @Override // xsna.ym2
    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        fc7 fc7Var;
        ec7 ec7Var;
        boolean drawFrameOrFallback = drawFrameOrFallback(canvas, i, 0);
        if (!this.isNewRenderImplementation && (fc7Var = this.bitmapFramePreparer) != null && (ec7Var = this.bitmapFramePreparationStrategy) != null) {
            ec7Var.d(fc7Var, this.bitmapFrameCache, this, i, null);
        }
        return drawFrameOrFallback;
    }

    public final float[] getCornerRadii() {
        return this.cornerRadii;
    }

    @Override // xsna.rp2
    public int getFrameCount() {
        return this.animationInformation.getFrameCount();
    }

    @Override // xsna.rp2
    public int getFrameDurationMs(int i) {
        return this.animationInformation.getFrameDurationMs(i);
    }

    @Override // xsna.ym2
    public int getIntrinsicHeight() {
        return this.bitmapHeight;
    }

    @Override // xsna.ym2
    public int getIntrinsicWidth() {
        return this.bitmapWidth;
    }

    @Override // xsna.rp2
    public int getLoopCount() {
        return this.animationInformation.getLoopCount();
    }

    @Override // xsna.rp2
    public int getLoopDurationMs() {
        return this.animationInformation.getLoopDurationMs();
    }

    public int getSizeInBytes() {
        return this.bitmapFrameCache.u();
    }

    @Override // xsna.rp2
    public int height() {
        return this.animationInformation.height();
    }

    @Override // xsna.an2.b
    public void onInactive() {
        if (!this.isNewRenderImplementation) {
            clear();
            return;
        }
        ec7 ec7Var = this.bitmapFramePreparationStrategy;
        if (ec7Var != null) {
            ec7Var.onStop();
        }
    }

    public void preloadAnimation() {
        fc7 fc7Var;
        if (this.isNewRenderImplementation || (fc7Var = this.bitmapFramePreparer) == null) {
            ec7 ec7Var = this.bitmapFramePreparationStrategy;
            if (ec7Var != null) {
                ec7Var.c(this.animationInformation.width(), this.animationInformation.height(), new com.vk.movika.sdk.base.model.b(this, 10));
                return;
            }
            return;
        }
        ec7 ec7Var2 = this.bitmapFramePreparationStrategy;
        if (ec7Var2 != null) {
            ec7Var2.d(fc7Var, this.bitmapFrameCache, this, 0, new h(this, 7));
        }
    }

    @Override // xsna.ym2
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override // xsna.ym2
    public void setAnimationListener(ym2.a aVar) {
        this.animationListener = aVar;
    }

    @Override // xsna.ym2
    public void setBounds(Rect rect) {
        this.bounds = rect;
        this.bitmapFrameRenderer.setBounds(rect);
        updateBitmapDimensions();
    }

    @Override // xsna.ym2
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // xsna.rp2
    public int width() {
        return this.animationInformation.width();
    }

    public /* synthetic */ BitmapAnimationBackend(hta0 hta0Var, dc7 dc7Var, rp2 rp2Var, gc7 gc7Var, boolean z, ec7 ec7Var, fc7 fc7Var, hpg0 hpg0Var, int i, zcl zclVar) {
        this(hta0Var, dc7Var, rp2Var, gc7Var, z, ec7Var, fc7Var, (i & 128) != 0 ? null : hpg0Var);
    }

    public final void setFrameListener(b bVar) {
    }
}
