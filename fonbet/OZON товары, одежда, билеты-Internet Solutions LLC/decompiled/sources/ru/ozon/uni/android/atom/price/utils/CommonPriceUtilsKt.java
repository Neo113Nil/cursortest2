package ru.ozon.uni.android.atom.price.utils;

import Sc.o;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.price.data.PriceViewGradient;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.core.models.GradientDirection;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a1\u0010\t\u001a\u00020\n*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"getShaderByPriceViewGradient", "Landroid/graphics/LinearGradient;", "gradient", "Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "top", "", "left", "height", "width", "configure", "Landroid/graphics/Paint;", "appearanceId", "", "textColor", "context", "Landroid/content/Context;", "(Landroid/graphics/Paint;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Context;)Landroid/graphics/Paint;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonPriceUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDirection.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDirection.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDirection.TL_BR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDirection.TR_BL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDirection.BR_TL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDirection.BL_TR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Paint configure(@NotNull Paint paint, Integer num, Integer num2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (num != null) {
            TextPaintExtKt.applyStyle(paint, context, num.intValue());
        }
        if (num2 != null) {
            paint.setColor(num2.intValue());
        }
        return paint;
    }

    @NotNull
    public static final LinearGradient getShaderByPriceViewGradient(@NotNull PriceViewGradient gradient, float f7, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        switch (WhenMappings.$EnumSwitchMapping$0[gradient.getDirection().ordinal()]) {
            case 1:
                return new LinearGradient(f11, f7, f11, f7 + f12, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 2:
                return new LinearGradient(f11, f7 + f12, f11, f7, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 3:
                return new LinearGradient(f11, f7, f11 + f13, f7, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 4:
                return new LinearGradient(f11 + f13, f7, f11, f7, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 5:
                return new LinearGradient(f11, f7, f11 + f13, f7 + f12, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 6:
                return new LinearGradient(f11 + f13, f7, f11, f7 + f12, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 7:
                return new LinearGradient(f11 + f13, f7 + f12, f11, f7, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            case 8:
                return new LinearGradient(f11, f7 + f12, f11 + f13, f7, new int[]{gradient.getStartColor(), gradient.getEndColor()}, (float[]) null, Shader.TileMode.CLAMP);
            default:
                throw new o();
        }
    }

    public static /* synthetic */ LinearGradient getShaderByPriceViewGradient$default(PriceViewGradient priceViewGradient, float f7, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.0f;
        }
        return getShaderByPriceViewGradient(priceViewGradient, f7, f11, f12, f13);
    }
}
