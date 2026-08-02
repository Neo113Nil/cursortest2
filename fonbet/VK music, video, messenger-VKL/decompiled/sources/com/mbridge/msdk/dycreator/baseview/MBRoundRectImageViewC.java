package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes13.dex */
public class MBRoundRectImageViewC extends MBImageView {
    private Paint d;

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Paint();
    }

    private Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        Matrix matrix;
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        try {
            int width = getWidth();
            float height = getHeight() / bitmap.getHeight();
            matrix = new Matrix();
            matrix.postScale(width / bitmap.getWidth(), height);
            bitmap2 = bitmap;
        } catch (Exception e) {
            e = e;
            bitmap2 = bitmap;
        }
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e2) {
            e = e2;
            q0.b("MBRoundRectImageViewC", e.getMessage());
            return bitmap2;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap a = a(((BitmapDrawable) drawable).getBitmap());
            if (a != null && !a.isRecycled()) {
                Bitmap a2 = a(a, 30);
                if (a2 != null && !a2.isRecycled()) {
                    Rect rect = new Rect(0, 0, a2.getWidth(), a2.getHeight());
                    this.d.reset();
                    canvas.drawBitmap(a2, rect, rect, this.d);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e) {
            q0.b("MBRoundRectImageViewC", e.getMessage());
        }
    }

    private Bitmap a(Bitmap bitmap, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f = i;
                canvas.drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
                return createBitmap;
            } catch (Exception e) {
                q0.b("MBRoundRectImageViewC", e.getMessage());
            }
        }
        return bitmap;
    }
}
