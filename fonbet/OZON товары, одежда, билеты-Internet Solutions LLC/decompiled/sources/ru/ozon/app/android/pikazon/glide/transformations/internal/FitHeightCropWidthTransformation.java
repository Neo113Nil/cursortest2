package ru.ozon.app.android.pikazon.glide.transformations.internal;

import Sc.o;
import T5.f;
import W5.d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import c6.AbstractC5754f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.l;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/internal/FitHeightCropWidthTransformation;", "Lc6/f;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;", "cropType", "<init>", "(Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;)V", "", "scaledWidth", "targetWidth", "calculateLeft", "(FF)F", "LW5/d;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "", "outWidth", "outHeight", "transform", "(LW5/d;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "(Ljava/security/MessageDigest;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FitHeightCropWidthTransformation extends AbstractC5754f {

    @NotNull
    private static final byte[] ID_BYTES;

    @NotNull
    private final ImageTransformation.FitHeightCropWidth.CropType cropType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageTransformation.FitHeightCropWidth.CropType.values().length];
            try {
                iArr[ImageTransformation.FitHeightCropWidth.CropType.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageTransformation.FitHeightCropWidth.CropType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageTransformation.FitHeightCropWidth.CropType.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Charset CHARSET = f.f26662a;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "ru.ozon.app.android.lib.glide.transformations.FitHeightCropWidthTransformation".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ID_BYTES = bytes;
    }

    public FitHeightCropWidthTransformation(@NotNull ImageTransformation.FitHeightCropWidth.CropType cropType) {
        Intrinsics.checkNotNullParameter(cropType, "cropType");
        this.cropType = cropType;
    }

    private final float calculateLeft(float scaledWidth, float targetWidth) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.cropType.ordinal()];
        if (i11 == 1) {
            return 0.0f;
        }
        if (i11 == 2) {
            return (targetWidth - scaledWidth) / 2;
        }
        if (i11 == 3) {
            return targetWidth - scaledWidth;
        }
        throw new o();
    }

    @Override // T5.f
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FitHeightCropWidthTransformation) && this.cropType == ((FitHeightCropWidthTransformation) other).cropType;
    }

    @Override // T5.f
    public int hashCode() {
        return l.g(-1750812222, this.cropType.hashCode());
    }

    @Override // c6.AbstractC5754f
    @NotNull
    protected Bitmap transform(@NotNull d pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap f7 = pool.f(outWidth, outHeight, toTransform.getConfig());
        Intrinsics.checkNotNullExpressionValue(f7, "get(...)");
        float f11 = outHeight;
        float height = (f11 / toTransform.getHeight()) * toTransform.getWidth();
        float calculateLeft = calculateLeft(height, outWidth);
        new Canvas(f7).drawBitmap(toTransform, (Rect) null, new RectF(calculateLeft, 0.0f, height + calculateLeft, f11), (Paint) null);
        return f7;
    }

    @Override // T5.f
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(ID_BYTES);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.cropType.ordinal()).array());
    }
}
