package ru.ozon.uni.android.uikit.view.atoms.badge;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeGradientPaint;", "Landroid/graphics/Paint;", "<init>", "()V", "gradientColors", "", "prevWidth", "", "Ljava/lang/Float;", "setGradientColor", "", "colors", "width", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeGradientPaint extends Paint {
    private int[] gradientColors;
    private Float prevWidth;

    public final void setGradientColor(@NotNull int[] colors, float width) {
        Float f7;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (!Arrays.equals(this.gradientColors, colors) || getShader() == null || (f7 = this.prevWidth) == null || width != f7.floatValue()) {
            this.gradientColors = colors;
            this.prevWidth = Float.valueOf(width);
            setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, colors, (float[]) null, Shader.TileMode.CLAMP));
        }
    }
}
