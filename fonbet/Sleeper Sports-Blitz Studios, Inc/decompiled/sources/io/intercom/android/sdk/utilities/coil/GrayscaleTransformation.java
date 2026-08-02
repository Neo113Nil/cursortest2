package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import coil.size.Size;
import coil.transform.Transformation;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrayscaleTransformation.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/GrayscaleTransformation;", "Lcoil/transform/Transformation;", "<init>", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", MetricTracker.Object.INPUT, RRWebVideoEvent.JsonKeys.SIZE, "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GrayscaleTransformation implements Transformation {
    public static final int $stable = 0;
    private static final ColorMatrixColorFilter COLOR_FILTER;
    private static final Companion Companion = new Companion(null);

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        String name = GrayscaleTransformation.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // coil.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        Paint paint = new Paint(3);
        paint.setColorFilter(COLOR_FILTER);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public boolean equals(Object other) {
        return other instanceof GrayscaleTransformation;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public String toString() {
        return "GrayscaleTransformation()";
    }

    /* compiled from: GrayscaleTransformation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/GrayscaleTransformation$Companion;", "", "<init>", "()V", "COLOR_FILTER", "Landroid/graphics/ColorMatrixColorFilter;", "getCOLOR_FILTER", "()Landroid/graphics/ColorMatrixColorFilter;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ColorMatrixColorFilter getCOLOR_FILTER() {
            return GrayscaleTransformation.COLOR_FILTER;
        }
    }

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        COLOR_FILTER = new ColorMatrixColorFilter(colorMatrix);
    }
}
