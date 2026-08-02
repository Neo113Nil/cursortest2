package com.commit451.coiltransformations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import coil.size.Size;
import coil.transform.Transformation;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropTransformation.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/commit451/coiltransformations/CropTransformation;", "Lcoil/transform/Transformation;", "cropType", "Lcom/commit451/coiltransformations/CropTransformation$CropType;", "(Lcom/commit451/coiltransformations/CropTransformation$CropType;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "getTop", "", "height", "scaledHeight", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", MetricTracker.Object.INPUT, RRWebVideoEvent.JsonKeys.SIZE, "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CropType", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CropTransformation implements Transformation {
    private final String cacheKey;
    private final CropType cropType;

    /* compiled from: CropTransformation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/commit451/coiltransformations/CropTransformation$CropType;", "", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum CropType {
        TOP,
        CENTER,
        BOTTOM
    }

    /* compiled from: CropTransformation.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropType.values().length];
            iArr[CropType.TOP.ordinal()] = 1;
            iArr[CropType.CENTER.ordinal()] = 2;
            iArr[CropType.BOTTOM.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CropTransformation() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CropTransformation(CropType cropType) {
        Intrinsics.checkNotNullParameter(cropType, "cropType");
        this.cropType = cropType;
        this.cacheKey = CropTransformation.class.getName() + '-' + cropType;
    }

    public /* synthetic */ CropTransformation(CropType cropType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CropType.CENTER : cropType);
    }

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Util.INSTANCE.getSafeConfig$transformations_release(bitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        createBitmap.setHasAlpha(true);
        float f = width;
        float f2 = height;
        float max = Math.max(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        float width2 = bitmap.getWidth() * max;
        float height2 = max * bitmap.getHeight();
        float f3 = (f - width2) / 2;
        float top = getTop(f2, height2);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, new RectF(f3, top, width2 + f3, height2 + top), (Paint) null);
        return createBitmap;
    }

    private final float getTop(float height, float scaledHeight) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.cropType.ordinal()];
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return (height - scaledHeight) / 2;
        }
        if (i == 3) {
            return height - scaledHeight;
        }
        throw new NoWhenBranchMatchedException();
    }
}
