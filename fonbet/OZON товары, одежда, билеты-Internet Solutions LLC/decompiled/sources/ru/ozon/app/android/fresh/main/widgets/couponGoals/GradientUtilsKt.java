package ru.ozon.app.android.fresh.main.widgets.couponGoals;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "width", "height", "angle", "", "getGradientCoordinates", "(FFF)[F", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GradientUtilsKt {
    @NotNull
    public static final float[] getGradientCoordinates(float f7, float f11, float f12) {
        float f13 = 360;
        float f14 = ((f12 % f13) + f13) % f13;
        float radians = (float) Math.toRadians(f14);
        double d11 = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(f7, d11)) + ((float) Math.pow(f11, d11)));
        float acos = (float) Math.acos(f7 / sqrt);
        float abs = Math.abs(((float) Math.cos(((f14 <= 90.0f || f14 >= 180.0f) && (f14 <= 270.0f || f14 >= 360.0f)) ? radians - acos : (3.1415927f - radians) - acos)) * sqrt);
        float f15 = 2;
        float f16 = abs / f15;
        double d12 = radians;
        float cos = ((float) Math.cos(d12)) * f16;
        float sin = f16 * ((float) Math.sin(d12));
        float f17 = f7 / f15;
        float f18 = f11 / f15;
        return new float[]{f17 - cos, f18 + sin, f17 + cos, f18 - sin};
    }
}
