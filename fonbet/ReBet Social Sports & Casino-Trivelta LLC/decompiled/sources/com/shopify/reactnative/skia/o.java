package com.shopify.reactnative.skia;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import com.horcrux.svg.BuildConfig;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class o {
    public static /* synthetic */ void a(Canvas canvas, SurfaceView surfaceView, Paint paint, float f10, Bitmap bitmap, CountDownLatch countDownLatch, int i10) {
        canvas.save();
        b(canvas, surfaceView);
        paint.setAlpha(Math.round(f10 * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
        countDownLatch.countDown();
    }

    public static void b(Canvas canvas, View view) {
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate((view.getLeft() + view.getPaddingLeft()) - view.getScrollX(), (view.getTop() + view.getPaddingTop()) - view.getScrollY());
        canvas.concat(matrix2);
        canvas.concat(matrix);
    }

    public static Paint c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    public static void d(Canvas canvas, View view, float f10) {
        Drawable background = view.getBackground();
        if (background != null) {
            canvas.saveLayerAlpha(null, Math.round(f10 * 255.0f));
            background.draw(canvas);
            canvas.restore();
        }
    }

    public static void e(Canvas canvas, ViewGroup viewGroup, Paint paint, float f10) {
        if (viewGroup instanceof ReactViewGroup) {
            try {
                Method declaredMethod = ReactViewGroup.class.getDeclaredMethod("dispatchOverflowDraw", Canvas.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(viewGroup, canvas);
            } catch (Exception e10) {
                Log.e("SkiaScreenshot", "couldn't invoke dispatchOverflowDraw() on ReactViewGroup", e10);
            }
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof TextureView) {
                    h(canvas, (TextureView) childAt, paint, f10);
                } else if (childAt instanceof SurfaceView) {
                    f(canvas, (SurfaceView) childAt, paint, f10);
                } else {
                    l(canvas, childAt, paint, f10);
                }
            }
        }
    }

    public static void f(Canvas canvas, SurfaceView surfaceView, Paint paint, float f10) {
        final Canvas canvas2;
        final SurfaceView surfaceView2;
        final Paint paint2;
        final float f11;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            canvas2 = canvas;
            surfaceView2 = surfaceView;
            paint2 = paint;
            f11 = f10;
        } catch (Exception e10) {
            e = e10;
            canvas2 = canvas;
            surfaceView2 = surfaceView;
            paint2 = paint;
            f11 = f10;
        }
        try {
            PixelCopy.request(surfaceView2, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.shopify.reactnative.skia.n
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    o.a(canvas2, surfaceView2, paint2, f11, createBitmap, countDownLatch, i10);
                }
            }, new Handler(Looper.getMainLooper()));
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (Exception e11) {
            e = e11;
            Log.e("SkiaScreenshot", "Cannot PixelCopy for " + surfaceView2, e);
            g(canvas2, surfaceView2, paint2, f11);
        }
    }

    public static void g(Canvas canvas, SurfaceView surfaceView, Paint paint, float f10) {
        Bitmap drawingCache = surfaceView.getDrawingCache();
        if (drawingCache != null) {
            canvas.save();
            b(canvas, surfaceView);
            paint.setAlpha(Math.round(f10 * 255.0f));
            canvas.drawBitmap(drawingCache, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    public static void h(Canvas canvas, TextureView textureView, Paint paint, float f10) {
        textureView.setOpaque(false);
        Bitmap bitmap = textureView.getBitmap(Bitmap.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888));
        canvas.save();
        b(canvas, textureView);
        paint.setAlpha(Math.round(f10 * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public static void i(Canvas canvas, View view, Paint paint, float f10) {
        canvas.saveLayerAlpha(null, Math.round(f10 * 255.0f));
        view.draw(canvas);
        canvas.restore();
    }

    public static boolean j(View view) {
        try {
            return view.getClass().getName().startsWith(BuildConfig.LIBRARY_PACKAGE_NAME);
        } catch (Throwable th2) {
            Log.e("ViewScreenshotService", "Error checking if view is SVG", th2);
            return false;
        }
    }

    public static Bitmap k(ReactContext reactContext, int i10) {
        View view;
        try {
            view = UIManagerHelper.getUIManagerForReactTag(reactContext, i10).resolveView(i10);
        } catch (RuntimeException e10) {
            reactContext.handleException(e10);
            view = null;
        }
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint c10 = c();
        canvas.save();
        canvas.translate(-view.getLeft(), -view.getTop());
        l(canvas, view, c10, 1.0f);
        canvas.restore();
        return createBitmap;
    }

    public static void l(Canvas canvas, View view, Paint paint, float f10) {
        float alpha = f10 * view.getAlpha();
        canvas.save();
        b(canvas, view);
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            int scrollX = scrollView.getScrollX();
            int scrollY = scrollView.getScrollY();
            canvas.clipRect(scrollX, scrollY, scrollView.getWidth() + scrollX, scrollView.getHeight() + scrollY);
        }
        if (!(view instanceof ViewGroup) || j(view)) {
            i(canvas, view, paint, alpha);
        } else {
            d(canvas, view, alpha);
            e(canvas, (ViewGroup) view, paint, alpha);
        }
        canvas.restore();
    }
}
