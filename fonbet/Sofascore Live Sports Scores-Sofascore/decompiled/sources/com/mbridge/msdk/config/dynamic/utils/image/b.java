package com.mbridge.msdk.config.dynamic.utils.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.Path;
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
import com.mbridge.msdk.config.dynamic.utils.image.b;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aul;
import defpackage.by1;
import defpackage.hqc;
import defpackage.s5l;
import defpackage.w1l;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
    public static /* synthetic */ void c(Bitmap bitmap, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new aul(b(bitmap), imageView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void b(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new aul(bitmap, imageView, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final float f, final Shader.TileMode tileMode) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            imageView.setImageBitmap(bitmap);
            a(imageView, f, tileMode);
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: dul
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(bitmap, f, tileMode, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, float f, Shader.TileMode tileMode, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new aul(a(bitmap, f, tileMode), imageView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(ImageView imageView, Bitmap bitmap, int i, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new hqc(bitmap, i, a(str), imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, int i, int i2, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new aul(a(bitmap, i, i2), imageView, 2));
    }

    public static void a(ImageView imageView, Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            imageView.setImageBitmap(a());
        } else if (bitmapArr.length == 1) {
            a(imageView, bitmapArr[0]);
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new s5l(19, bitmapArr, imageView));
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
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new s5l(20, imageView, build));
    }

    public static void a(View view, float f, Shader.TileMode tileMode) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 25.0f;
                }
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                view.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
            }
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
        }
    }

    public static Bitmap a(Bitmap bitmap, float f, Shader.TileMode tileMode) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 25.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                RenderEffect createBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
                ImageReader newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                by1.k();
                RenderNode renderNode = new RenderNode("BlurEffect");
                by1.l();
                HardwareRenderer b = by1.b();
                b.setSurface(newInstance.getSurface());
                b.setContentRoot(renderNode);
                renderNode.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
                renderNode.setRenderEffect(createBlurEffect);
                renderNode.beginRecording().drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                renderNode.endRecording();
                b.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image acquireNextImage = newInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
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

    public static void a(ImageView imageView, Bitmap bitmap) {
        a(imageView, bitmap, 25.0f, Shader.TileMode.MIRROR);
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.equals(FootballShotmapItem.SITUATION_TYPE_CORNER)) {
            return 0;
        }
        String replace = str.replace(FootballShotmapItem.SITUATION_TYPE_CORNER, "");
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
        w1l.d().a(str, new a(imageView));
    }
}
