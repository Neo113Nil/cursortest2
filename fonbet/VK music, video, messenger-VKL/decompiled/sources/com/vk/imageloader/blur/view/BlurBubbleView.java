package com.vk.imageloader.blur.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.R$styleable;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.random.Random;
import xsna.k9x;
import xsna.kg7;
import xsna.shy;
import xsna.skd;
import xsna.swe0;
import xsna.vu5;
import xsna.yzs;

/* compiled from: BlurBubbleView.kt */
/* loaded from: classes2.dex */
public final class BlurBubbleView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final b h = new b();
    public c b;
    public int c;
    public int d;
    public int e;
    public float f;
    public kg7 g;

    /* compiled from: BlurBubbleView.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;

        public a(float f, float f2, float f3, float f4, int i, int i2) {
            Random.Default r0 = Random.b;
            r0.getClass();
            float i3 = Random.c.i();
            int n = swe0.n(new k9x(0, 1, 1), r0);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && this.e == aVar.e && this.f == aVar.f && Float.compare(this.g, aVar.g) == 0 && this.h == aVar.h;
        }

        public final int hashCode() {
            return Integer.hashCode(this.h) + io.reactivex.rxjava3.subjects.b.a(this.g, shy.a(this.f, shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Circle(x=");
            sb.append(this.a);
            sb.append(", y=");
            sb.append(this.b);
            sb.append(", radius=");
            sb.append(this.c);
            sb.append(", radius2=");
            sb.append(this.d);
            sb.append(", minColor=");
            sb.append(this.e);
            sb.append(", maxColor=");
            sb.append(this.f);
            sb.append(", startPos=");
            sb.append(this.g);
            sb.append(", direction=");
            return vu5.b(sb, this.h, ')');
        }
    }

    /* compiled from: BlurBubbleView.kt */
    public static final class b {
        public static final Object a(b bVar, float f, int i, Number number, Number number2, float f2, yzs yzsVar, Number number3) {
            bVar.getClass();
            if (i > 0) {
                float f3 = 1;
                float f4 = 2;
                float f5 = (f3 - f) / f4;
                float f6 = (f4 - f) / f4;
                Object invoke = yzsVar.invoke(number, number2, Float.valueOf(f));
                if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < f5) {
                    return yzsVar.invoke(invoke, number2, Float.valueOf((f2 % f5) / f5));
                }
                if (f2 >= f5 && f2 < f6) {
                    float f7 = f6 - f5;
                    return yzsVar.invoke(number2, number, Float.valueOf(((f2 - f5) % f7) / f7));
                }
                if (f6 <= f2 && f2 <= 1.0f) {
                    float f8 = f3 - f6;
                    return yzsVar.invoke(number, invoke, Float.valueOf(((f2 - f6) % f8) / f8));
                }
            } else {
                float f9 = 2;
                float f10 = f / f9;
                float f11 = 1;
                float f12 = (f11 + f) / f9;
                Object invoke2 = yzsVar.invoke(number, number2, Float.valueOf(f));
                if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < f10) {
                    return yzsVar.invoke(invoke2, number, Float.valueOf((f2 % f10) / f10));
                }
                if (f2 >= f10 && f2 < f12) {
                    float f13 = f12 - f10;
                    return yzsVar.invoke(number, number2, Float.valueOf(((f2 - f10) % f13) / f13));
                }
                if (f12 <= f2 && f2 <= 1.0f) {
                    float f14 = f11 - f12;
                    return yzsVar.invoke(number2, invoke2, Float.valueOf(((f2 - f12) % f14) / f14));
                }
            }
            return number3;
        }
    }

    /* compiled from: BlurBubbleView.kt */
    public final class c extends Thread {
        public final BlurBubbleView b;
        public final int c;
        public final ArrayList d;
        public volatile boolean e;
        public final Paint f;
        public final Bitmap g;
        public final Canvas h;
        public long i;

        public c(BlurBubbleView blurBubbleView, int i) {
            this.b = blurBubbleView;
            this.c = i;
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            Paint paint = new Paint();
            this.f = paint;
            Bitmap createBitmap = Bitmap.createBitmap(BlurBubbleView.this.getWidth() / i, BlurBubbleView.this.getHeight() / i, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.h = new Canvas(createBitmap);
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            float f = i;
            float width = BlurBubbleView.this.getWidth() / f;
            float height = BlurBubbleView.this.getHeight() / f;
            float f2 = width * 0.27f;
            arrayList.add(new a(width * 0.4f, height * 0.54f, f2, f2 * 1.2f, -11730762, -523696));
            float f3 = width * 0.18f;
            arrayList.add(new a(width * 0.69f, height * 0.33f, f3 * 1.3f, f3, -43713, -13243));
            float f4 = width * 0.15f;
            arrayList.add(new a(width * 0.73f, height * 0.7f, f4, f4 * 1.3f, -16734299, -15335428));
        }

        public final void a(Canvas canvas) {
            float currentTimeMillis = ((System.currentTimeMillis() - this.i) % IronSourceError.ERROR_CAPPING_VALIDATION_FAILED) / IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                b bVar = BlurBubbleView.h;
                int intValue = ((Number) b.a(bVar, aVar.g, aVar.h, Integer.valueOf(aVar.e), Integer.valueOf(aVar.f), currentTimeMillis, com.vk.imageloader.blur.view.a.b, 0)).intValue();
                Paint paint = this.f;
                paint.setColor(intValue);
                canvas.drawCircle(aVar.a, aVar.b, ((Number) b.a(bVar, aVar.g, aVar.h, Float.valueOf(aVar.c), Float.valueOf(aVar.d), currentTimeMillis, new com.vk.imageloader.blur.view.b(3, bVar, b.class, "calcRadius", "calcRadius(FFF)F", 0), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))).floatValue(), paint);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        
            if (r2 == null) goto L17;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            this.i = System.currentTimeMillis();
            while (this.e) {
                long currentTimeMillis = System.currentTimeMillis();
                Canvas canvas = null;
                try {
                    try {
                        canvas = this.b.lockCanvas();
                    } catch (InterruptedException e) {
                        L.i(e);
                    }
                    if (canvas != null) {
                        this.g.eraseColor(BlurBubbleView.this.getSurfaceBackgroundColor());
                        a(this.h);
                        BlurBubbleView.this.getBlurAlgorithm().a(this.g, BlurBubbleView.this.getBlurRadius());
                        canvas.save();
                        float f = this.c;
                        canvas.scale(f, f);
                        canvas.drawBitmap(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f);
                        canvas.restore();
                        canvas.drawColor(BlurBubbleView.this.getOverlayColor());
                        this.b.unlockCanvasAndPost(canvas);
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        if (currentTimeMillis2 < 16) {
                            try {
                                Thread.sleep(16 - currentTimeMillis2);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (canvas != null) {
                        this.b.unlockCanvasAndPost(canvas);
                    }
                    throw th;
                }
            }
        }
    }

    public BlurBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = -1;
        this.e = 15;
        this.f = 25.0f;
        this.g = new skd();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        this.f = obtainStyledAttributes.getFloat(1, 25.0f);
        setDownsampleFactor(obtainStyledAttributes.getInt(2, 15));
        this.c = obtainStyledAttributes.getColor(3, 0);
        this.d = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        setSurfaceTextureListener(this);
    }

    public final void a() {
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.e = false;
        boolean z = true;
        while (z) {
            try {
                c cVar2 = this.b;
                if (cVar2 != null) {
                    cVar2.join();
                }
                z = false;
            } catch (InterruptedException e) {
                L.i(e);
            }
        }
        this.b = null;
    }

    public final kg7 getBlurAlgorithm() {
        return this.g;
    }

    public final float getBlurRadius() {
        return this.f;
    }

    public final int getDownsampleFactor() {
        return this.e;
    }

    public final int getOverlayColor() {
        return this.c;
    }

    public final int getSurfaceBackgroundColor() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        c cVar = new c(this, this.e);
        this.b = cVar;
        cVar.e = true;
        c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a();
        return false;
    }

    public final void setBlurAlgorithm(kg7 kg7Var) {
        this.g = kg7Var;
    }

    public final void setBlurRadius(float f) {
        this.f = f;
    }

    public final void setDownsampleFactor(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Downsample factor must be greater than 0.");
        }
        if (this.e != i) {
            this.e = i;
        }
    }

    public final void setOverlayColor(int i) {
        this.c = i;
    }

    public final void setSurfaceBackgroundColor(int i) {
        this.d = i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
