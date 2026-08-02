package com.mbridge.msdk.config.dynamic.utils.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.a32;
import xsna.b32;
import xsna.f2l;
import xsna.h32;
import xsna.i32;
import xsna.nek;
import xsna.ro2;
import xsna.tou;
import xsna.tzz;
import xsna.wd10;
import xsna.xy4;

/* compiled from: ImageOperateUtil.java */
/* loaded from: classes13.dex */
public class b {

    /* compiled from: ImageOperateUtil.java */
    public class a implements c {
        final /* synthetic */ ImageView a;

        public a(ImageView imageView) {
            this.a = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("ImageOperateUtil", "图片下载失败: " + str + " URL: " + str2);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                ImageView imageView = this.a;
                if (imageView instanceof ComponentImageView) {
                    ((ComponentImageView) imageView).setBitmap(bitmap);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Throwable th) {
                q0.b("ImageOperateUtil", "设置图片异常: " + th.getMessage());
            }
        }
    }

    public static void a(ImageView imageView, Bitmap bitmap) {
        a(imageView, bitmap, 25.0f, Shader.TileMode.MIRROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Bitmap bitmap, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new tou(6, b(bitmap), imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final float f, final Shader.TileMode tileMode) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: xsna.rey0
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.config.dynamic.utils.image.b.a(bitmap, f, tileMode, imageView);
                }
            });
        } else {
            imageView.setImageBitmap(bitmap);
            a(imageView, f, tileMode);
        }
    }

    public static void b(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new ro2(6, bitmap, imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static Bitmap b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    float f = min;
                    canvas.drawCircle(f, f, f, paint);
                    return createBitmap;
                }
            } catch (Throwable th) {
                q0.b("ImageOperateUtil", th.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, float f, Shader.TileMode tileMode, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new tzz(6, a(bitmap, f, tileMode), imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final int i, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final int a2 = a(str);
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: xsna.qey0
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.dynamic.utils.image.b.a(bitmap, i, a2, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, int i, int i2, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new nek(7, a(bitmap, i, i2), imageView));
    }

    public static void a(ImageView imageView, Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            imageView.setImageBitmap(a());
        } else if (bitmapArr.length == 1) {
            a(imageView, bitmapArr[0]);
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new f2l(6, bitmapArr, imageView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap[] bitmapArr, ImageView imageView) {
        com.mbridge.msdk.video.dynview.shape.a build;
        ArrayList arrayList = new ArrayList();
        for (Bitmap bitmap : bitmapArr) {
            arrayList.add(a(bitmap, 25.0f, Shader.TileMode.MIRROR));
        }
        if (arrayList.size() <= 1 || (build = com.mbridge.msdk.video.dynview.shape.a.a().b((Bitmap) arrayList.get(0)).a((Bitmap) arrayList.get(1)).a(5).orientation(m0.G(com.mbridge.msdk.foundation.controller.c.n().d())).build()) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new xy4(6, imageView, build));
    }

    public static void a(View view, float f, Shader.TileMode tileMode) {
        RenderEffect createBlurEffect;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 25.0f;
                }
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                createBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
                view.setRenderEffect(createBlurEffect);
            }
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
        }
    }

    public static Bitmap a(Bitmap bitmap, float f, Shader.TileMode tileMode) {
        RenderEffect createBlurEffect;
        ImageReader newInstance;
        RecordingCanvas beginRecording;
        HardwareRenderer.FrameRenderRequest createRenderRequest;
        HardwareRenderer.FrameRenderRequest waitForPresent;
        Bitmap wrapHardwareBuffer;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 25.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                createBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
                newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                a32.c();
                RenderNode b = h32.b();
                b32.d();
                HardwareRenderer c = i32.c();
                c.setSurface(newInstance.getSurface());
                c.setContentRoot(b);
                b.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
                b.setRenderEffect(createBlurEffect);
                beginRecording = b.beginRecording();
                beginRecording.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                b.endRecording();
                createRenderRequest = c.createRenderRequest();
                waitForPresent = createRenderRequest.setWaitForPresent(true);
                waitForPresent.syncAndDraw();
                Image acquireNextImage = newInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                    acquireNextImage.close();
                    hardwareBuffer.close();
                    return wrapHardwareBuffer;
                }
                return a();
            }
            return a(bitmap);
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        try {
            Bitmap a2 = com.mbridge.msdk.config.dynamic.utils.image.a.a(bitmap, 10);
            if (a2 != null && !a2.isRecycled()) {
                return a2;
            }
            return a();
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    private static Bitmap a() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            createBitmap.eraseColor(Color.parseColor("#FF0000"));
            return createBitmap;
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, float f, int i) {
        Bitmap bitmap2;
        Bitmap createBitmap;
        Canvas canvas;
        Paint paint;
        Path path;
        RectF rectF;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        try {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            canvas = new Canvas(createBitmap);
            paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            path = new Path();
            rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
            bitmap2 = null;
        } catch (Throwable th) {
            th = th;
            bitmap2 = null;
        }
        try {
            switch (i) {
                case 0:
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    break;
                case 1:
                    path.addRoundRect(rectF, new float[]{f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                    break;
                case 2:
                    path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                    break;
                case 3:
                    path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f}, Path.Direction.CW);
                    break;
                case 4:
                    path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                    break;
                case 5:
                    path.addRoundRect(rectF, new float[]{f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                    break;
                case 6:
                    path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, f, f}, Path.Direction.CW);
                    break;
                case 7:
                    path.addRoundRect(rectF, new float[]{f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f}, Path.Direction.CW);
                    break;
                case 8:
                    path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                    break;
                case 9:
                    path.addRoundRect(rectF, new float[]{f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                    break;
                case 10:
                    path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f}, Path.Direction.CW);
                    break;
            }
            canvas.clipPath(path);
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            return createBitmap;
        } catch (Throwable th2) {
            th = th2;
            q0.b("ImageOperateUtil", th.getMessage());
            return bitmap2;
        }
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.equals("corner")) {
            return 0;
        }
        String replace = str.replace("corner", "");
        if (TextUtils.isEmpty(replace)) {
            return 0;
        }
        String upperCase = replace.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
        }
        return 0;
    }

    public static void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        wd10.b().a(str, new a(imageView));
    }
}
