package com.commit451.coiltransformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import coil.size.Size;
import coil.transform.Transformation;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaskTransformation.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/commit451/coiltransformations/MaskTransformation;", "Lcoil/transform/Transformation;", "context", "Landroid/content/Context;", "maskDrawableRes", "", "(Landroid/content/Context;I)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "getMaskDrawableRes", "()I", "getMaskDrawable", "Landroid/graphics/drawable/Drawable;", "maskId", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", MetricTracker.Object.INPUT, RRWebVideoEvent.JsonKeys.SIZE, "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaskTransformation implements Transformation {
    private static final Paint paint;
    private final String cacheKey;
    private final Context context;
    private final int maskDrawableRes;

    public MaskTransformation(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.maskDrawableRes = i;
        this.cacheKey = MaskTransformation.class.getName() + '-' + i;
    }

    public final int getMaskDrawableRes() {
        return this.maskDrawableRes;
    }

    static {
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint = paint2;
    }

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Util.INSTANCE.getSafeConfig$transformations_release(bitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        createBitmap.setHasAlpha(true);
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        Drawable maskDrawable = getMaskDrawable(applicationContext, this.maskDrawableRes);
        Canvas canvas = new Canvas(createBitmap);
        maskDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        maskDrawable.draw(canvas);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    private final Drawable getMaskDrawable(Context context, int maskId) {
        Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), maskId, null);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalArgumentException("maskId is invalid");
    }
}
