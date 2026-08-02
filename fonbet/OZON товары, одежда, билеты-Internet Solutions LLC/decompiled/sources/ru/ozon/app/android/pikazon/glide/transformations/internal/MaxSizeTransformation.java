package ru.ozon.app.android.pikazon.glide.transformations.internal;

import T5.f;
import W5.d;
import android.graphics.Bitmap;
import c6.AbstractC5754f;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/internal/MaxSizeTransformation;", "Lc6/f;", "<init>", "()V", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "(Ljava/security/MessageDigest;)V", "LW5/d;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "", "outWidth", "outHeight", "transform", "(LW5/d;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MaxSizeTransformation extends AbstractC5754f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final byte[] ID_BYTES;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/internal/MaxSizeTransformation$Companion;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "", "MAX_BITMAP_SIZE", "I", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Charset CHARSET = f.f26662a;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "ru.ozon.app.android.glide.transformations.MaxSizeTransformation".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ID_BYTES = bytes;
    }

    @Override // T5.f
    public boolean equals(Object other) {
        return other instanceof MaxSizeTransformation;
    }

    @Override // T5.f
    public int hashCode() {
        return -67239812;
    }

    @Override // c6.AbstractC5754f
    @NotNull
    protected Bitmap transform(@NotNull d pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        if (toTransform.getByteCount() < 104857600) {
            return toTransform;
        }
        int rowBytes = 104857600 / toTransform.getRowBytes();
        if (rowBytes < 1) {
            rowBytes = 1;
        }
        int i11 = (int) (outWidth * (rowBytes / outHeight));
        if (i11 < 1) {
            i11 = 1;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(toTransform, i11, rowBytes, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        pool.c(toTransform);
        return createScaledBitmap;
    }

    @Override // T5.f
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(ID_BYTES);
    }
}
