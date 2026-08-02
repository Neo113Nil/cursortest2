package ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/GradientManager;", "", "<init>", "()V", "startGradient", "Landroid/graphics/LinearGradient;", "endGradient", "gradientPaint", "Landroid/graphics/Paint;", "setupGradients", "", "width", "", "applyGradients", "canvas", "Landroid/graphics/Canvas;", "height", "isRunning", "", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GradientManager {
    private static final float GRADIENT_WIDTH_DP = UiExtKt.toPxF(16);
    private static final float GRADIENT_WIDTH_DP_2 = UiExtKt.toPxF(8);
    private LinearGradient endGradient;

    @NotNull
    private final Paint gradientPaint;
    private LinearGradient startGradient;

    public GradientManager() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.gradientPaint = paint;
    }

    public final void applyGradients(@NotNull Canvas canvas, int width, int height, boolean isRunning) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.gradientPaint.setShader(this.endGradient);
        float f7 = width;
        float f11 = height;
        canvas.drawRect(0.0f, 0.0f, f7, f11, this.gradientPaint);
        if (isRunning) {
            this.gradientPaint.setShader(this.startGradient);
            canvas.drawRect(0.0f, 0.0f, f7, f11, this.gradientPaint);
        }
    }

    public final void setupGradients(int width) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.startGradient = new LinearGradient(0.0f, 0.0f, GRADIENT_WIDTH_DP, 0.0f, new int[]{0, -1}, new float[]{0.0455f, 0.2936f}, tileMode);
        float f7 = width;
        this.endGradient = new LinearGradient(f7 - GRADIENT_WIDTH_DP_2, 0.0f, f7, 0.0f, new int[]{-1, 0}, new float[]{0.0455f, 0.2936f}, tileMode);
    }
}
