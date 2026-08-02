package com.vk.videomessage.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.Window;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.videomessage.impl.BackgroundBlurView;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import xsna.aw5;
import xsna.e3m;
import xsna.izs;
import xsna.s3q0;
import xsna.skd;

/* compiled from: BackgroundBlurView.kt */
/* loaded from: classes7.dex */
public final class BackgroundBlurView extends TextureView {
    public volatile boolean b;
    public izs<? super Bitmap, s3q0> c;
    public a d;
    public int e;

    public BackgroundBlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAlpha(0.001f);
    }

    public final void a() {
        a aVar = this.d;
        if (aVar != null) {
            BackgroundBlurView.this.b = true;
            ReentrantLock reentrantLock = aVar.h;
            reentrantLock.lock();
            try {
                aVar.l++;
                aVar.n.open();
                aVar.i.signal();
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final izs<Bitmap, s3q0> getBlurCallback() {
        return this.c;
    }

    public final boolean getDrawInProgress() {
        return this.b;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(0, 0, getRootView().getMeasuredWidth(), getRootView().getMeasuredHeight());
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        Window window;
        super.onAttachedToWindow();
        this.b = true;
        a aVar = new a();
        setSurfaceTextureListener(aVar);
        this.d = aVar;
        aVar.start();
        Activity h = e3m.h(getContext());
        if (h == null || (window = h.getWindow()) == null) {
            return;
        }
        this.e = window.getStatusBarColor();
        window.setStatusBarColor(1929379840);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Window window;
        Activity h = e3m.h(getContext());
        if (h != null && (window = h.getWindow()) != null) {
            window.setStatusBarColor(this.e);
        }
        super.onDetachedFromWindow();
        a aVar = this.d;
        if (aVar != null) {
            ReentrantLock reentrantLock = aVar.h;
            reentrantLock.lock();
            try {
                aVar.g = true;
                aVar.i.signal();
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        this.d = null;
        setSurfaceTextureListener(null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (i3 - i == 0 || i4 - i2 == 0 || !z) {
            return;
        }
        a();
    }

    public final void setBlurCallback(izs<? super Bitmap, s3q0> izsVar) {
        this.c = izsVar;
    }

    /* compiled from: BackgroundBlurView.kt */
    public final class a extends Thread implements TextureView.SurfaceTextureListener {
        public volatile boolean c;
        public SurfaceTexture f;
        public boolean g;
        public final ReentrantLock h;
        public final Condition i;
        public final float j;
        public final Matrix k;
        public volatile int l;
        public volatile boolean m;
        public final ConditionVariable n;
        public final float b = 6.5f;
        public final Handler d = new Handler(Looper.getMainLooper());
        public final skd e = new skd();

        public a() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.h = reentrantLock;
            this.i = reentrantLock.newCondition();
            this.j = 1 / 6.0f;
            this.k = new Matrix();
            this.n = new ConditionVariable();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                this.f = surfaceTexture;
                this.i.signal();
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.m = true;
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                this.f = null;
                s3q0 s3q0Var = s3q0.a;
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            this.m = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (!this.g) {
                ReentrantLock reentrantLock = this.h;
                reentrantLock.lock();
                try {
                    SurfaceTexture surfaceTexture = this.f;
                    if (surfaceTexture == null) {
                        this.i.await();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    if (surfaceTexture != null) {
                        this.n.block();
                        this.n.close();
                        while (true) {
                            boolean z = false;
                            while (true) {
                                if (!this.g && !z) {
                                    final int i = this.l;
                                    final ConditionVariable conditionVariable = new ConditionVariable();
                                    this.m = false;
                                    Surface surface = new Surface(surfaceTexture);
                                    final Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                                    try {
                                        this.d.postAtFrontOfQueue(new Runnable() { // from class: xsna.zv5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i2 = i;
                                                BackgroundBlurView.a aVar = this;
                                                ConditionVariable conditionVariable2 = conditionVariable;
                                                Canvas canvas = lockHardwareCanvas;
                                                if (i2 != aVar.l) {
                                                    conditionVariable2.open();
                                                    return;
                                                }
                                                aVar.c = true;
                                                Rect b = f4m.b(BackgroundBlurView.this);
                                                int save = canvas.save();
                                                aVar.k.setRectToRect(new RectF(b.left, b.top, b.right, b.bottom), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight()), Matrix.ScaleToFit.FILL);
                                                canvas.setMatrix(aVar.k);
                                                try {
                                                    BackgroundBlurView.this.getRootView().draw(canvas);
                                                    canvas.restoreToCount(save);
                                                    aVar.c = false;
                                                    conditionVariable2.open();
                                                } catch (Throwable th) {
                                                    canvas.restoreToCount(save);
                                                    throw th;
                                                }
                                            }
                                        });
                                        conditionVariable.block();
                                        lockHardwareCanvas.drawColor(1929379840);
                                        surface.unlockCanvasAndPost(lockHardwareCanvas);
                                        surface.release();
                                        if (i == this.l) {
                                            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                                            while (!this.m) {
                                                try {
                                                    BackgroundBlurView.this.getBitmap(createBitmap);
                                                } catch (NullPointerException unused) {
                                                    if (this.g) {
                                                        BackgroundBlurView.this.b = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            Bitmap bitmap = null;
                                            try {
                                                Bitmap bitmap2 = BackgroundBlurView.this.getBitmap((int) (r5.getWidth() * this.j), (int) (BackgroundBlurView.this.getHeight() * this.j));
                                                if (bitmap2 != null) {
                                                    skd skdVar = this.e;
                                                    float f = this.b;
                                                    skdVar.getClass();
                                                    NativeBlurFilter.iterativeBoxBlur(bitmap2, 3, (int) f);
                                                    bitmap = bitmap2;
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            this.d.postAtFrontOfQueue(new aw5(0, BackgroundBlurView.this, bitmap));
                                            if (i == this.l) {
                                                z = true;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        surface.unlockCanvasAndPost(lockHardwareCanvas);
                                        surface.release();
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }
    }
}
