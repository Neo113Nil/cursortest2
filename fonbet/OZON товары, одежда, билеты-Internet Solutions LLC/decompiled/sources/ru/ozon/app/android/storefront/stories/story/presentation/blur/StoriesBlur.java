package ru.ozon.app.android.storefront.stories.story.presentation.blur;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/blur/StoriesBlur;", "", "", "sampling", "radius", "<init>", "(FF)V", "Landroid/graphics/Bitmap;", "source", "prepareBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "blur", "F", "getSampling", "()F", "setSampling", "(F)V", "getRadius", "setRadius", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoriesBlur {
    private float radius;
    private float sampling;

    public StoriesBlur(float f7, float f11) {
        this.sampling = f7;
        this.radius = f11;
    }

    private final Bitmap prepareBitmap(Bitmap source) {
        Bitmap createBitmap = Bitmap.createBitmap((int) (source.getWidth() / this.sampling), (int) (source.getHeight() / this.sampling), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Paint paint = new Paint(2);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 1;
        float f11 = this.sampling;
        canvas.scale(f7 / f11, f7 / f11);
        canvas.drawBitmap(source, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    @NotNull
    public final Bitmap blur(@NotNull Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Bitmap blur = StackBlur.blur(prepareBitmap(source), (int) this.radius);
        Intrinsics.checkNotNullExpressionValue(blur, "blur(...)");
        return blur;
    }
}
