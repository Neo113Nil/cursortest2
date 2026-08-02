package com.vk.id.group.subscription.compose.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.C10435g;
import y5.b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/vk/id/group/subscription/compose/util/UserImageTransformation;", "Ly5/b;", "", "backgroundColor", "<init>", "(I)V", "Landroid/graphics/Canvas;", "Landroid/graphics/Bitmap;", "input", "", "radius", "", "drawSurroundingCircle", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;F)V", "Lw5/g;", "size", "transform", "(Landroid/graphics/Bitmap;Lw5/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "I", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "Companion", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserImageTransformation implements b {
    private final int backgroundColor;

    public UserImageTransformation(int i11) {
        this.backgroundColor = i11;
    }

    private final void drawSurroundingCircle(Canvas canvas, Bitmap bitmap, float f7) {
        Paint paint = new Paint();
        paint.setColor(this.backgroundColor);
        paint.setStyle(Paint.Style.FILL);
        Unit unit = Unit.f71690a;
        canvas.drawCircle(((-bitmap.getWidth()) / 24.0f) * 9, bitmap.getHeight() / 2.0f, f7, paint);
    }

    @Override // y5.b
    @NotNull
    public String getCacheKey() {
        return String.valueOf(this.backgroundColor);
    }

    @Override // y5.b
    public Object transform(@NotNull Bitmap bitmap, @NotNull C10435g c10435g, @NotNull d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f7 = min / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, bitmap.getConfig());
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f7, f7, f7, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f7 - (bitmap.getWidth() / 2.0f), f7 - (bitmap.getHeight() / 2.0f), paint);
        drawSurroundingCircle(canvas, bitmap, f7);
        return createBitmap;
    }
}
