package com.fyber.inneractive.sdk.rtb.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes12.dex */
public final class b {
    public ImageView a;

    public b(Context context, String str) {
        Bitmap bitmap;
        ImageView imageView = null;
        try {
            byte[] decode = Base64.decode(str, 0);
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            th = th;
            bitmap = null;
        }
        try {
            if (bitmap == null) {
                IAlog.a("Failed to decode watermark: Invalid image data", new Object[0]);
            } else {
                ImageView imageView2 = new ImageView(context);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
                imageView2.setBackground(bitmapDrawable);
                imageView2.setId(R.id.ia_ext_watermark);
                imageView = imageView2;
            }
        } catch (Throwable th2) {
            th = th2;
            if (bitmap != null) {
                bitmap.recycle();
            }
            IAlog.a("%s Error occurred when trying to create external watermark", th, "InneractiveWatermark");
            this.a = imageView;
        }
        this.a = imageView;
    }
}
