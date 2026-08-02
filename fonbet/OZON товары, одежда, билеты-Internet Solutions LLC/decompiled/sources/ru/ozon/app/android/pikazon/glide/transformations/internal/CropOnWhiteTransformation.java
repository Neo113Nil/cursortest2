package ru.ozon.app.android.pikazon.glide.transformations.internal;

import T5.f;
import T5.m;
import V5.v;
import W5.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import c6.C5753e;
import c6.k;
import com.bumptech.glide.c;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/internal/CropOnWhiteTransformation;", "LT5/m;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "(Ljava/security/MessageDigest;)V", "Landroid/content/Context;", "context", "LV5/v;", "resource", "", "outWidth", "outHeight", "transform", "(Landroid/content/Context;LV5/v;II)LV5/v;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CropOnWhiteTransformation implements m<Bitmap> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final byte[] ID_BYTES;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/internal/CropOnWhiteTransformation$Companion;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        byte[] bytes = "ru.ozon.app.android.glide.transformations.CropOnWhiteTransformation".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ID_BYTES = bytes;
    }

    @Override // T5.f
    public boolean equals(Object other) {
        return other instanceof CropOnWhiteTransformation;
    }

    @Override // T5.f
    public int hashCode() {
        return 1147102737;
    }

    @Override // T5.m
    @NotNull
    public v<Bitmap> transform(@NotNull Context context, @NotNull v<Bitmap> resource, int outWidth, int outHeight) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Bitmap bitmap = new k().transform(context, resource, outWidth, outHeight).get();
        Intrinsics.checkNotNullExpressionValue(bitmap, "get(...)");
        d c11 = c.a(context).c();
        Intrinsics.checkNotNullExpressionValue(c11, "getBitmapPool(...)");
        Bitmap f7 = c11.f(outWidth, outHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(f7, "get(...)");
        Canvas canvas = new Canvas(f7);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, (outWidth - r6.getWidth()) / 2.0f, (outHeight - r6.getHeight()) / 2.0f, (Paint) null);
        C5753e c12 = C5753e.c(c11, f7);
        Intrinsics.g(c12, "null cannot be cast to non-null type com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap>");
        return c12;
    }

    @Override // T5.f
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(ID_BYTES);
    }
}
