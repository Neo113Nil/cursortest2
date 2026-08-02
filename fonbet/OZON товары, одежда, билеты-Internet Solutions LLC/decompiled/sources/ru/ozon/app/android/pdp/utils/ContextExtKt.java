package ru.ozon.app.android.pdp.utils;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.core.content.a;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001aC\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\u001aY\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0018\u001a\u00020\u0003*\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "", "color", "", "parseColor", "(Landroid/content/Context;Ljava/lang/String;)I", "", "radius", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "type", "colorRes", "colorInt", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/drawable/ShapeDrawable;", "createRoundRectShape", "(Landroid/content/Context;FLru/ozon/app/android/pdp/utils/CornersConfig;IILandroid/graphics/LinearGradient;)Landroid/graphics/drawable/ShapeDrawable;", "strokeColorRes", "strokeColorInt", "strokeWidth", "Landroid/graphics/drawable/GradientDrawable;", "createRoundGradientDrawable", "(Landroid/content/Context;FLru/ozon/app/android/pdp/utils/CornersConfig;IILjava/lang/Integer;Ljava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;", "Landroid/view/View;", "getStatusBarHeight", "(Landroid/view/View;)I", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContextExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornersConfig.values().length];
            try {
                iArr[CornersConfig.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CornersConfig.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CornersConfig.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final GradientDrawable createRoundGradientDrawable(@NotNull Context context, float f7, @NotNull CornersConfig type, int i11, int i12, Integer num, Integer num2, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i12);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i14 = iArr[type.ordinal()];
        float f11 = (i14 == 1 || i14 == 2) ? f7 : 0.0f;
        int i15 = iArr[type.ordinal()];
        if (i15 != 2 && i15 != 3) {
            f7 = 0.0f;
        }
        gradientDrawable.setCornerRadii(new float[]{f11, f11, f11, f11, f7, f7, f7, f7});
        if (num2 != null) {
            gradientDrawable.setStroke(i13, num2.intValue());
        }
        return gradientDrawable;
    }

    public static /* synthetic */ GradientDrawable createRoundGradientDrawable$default(Context context, float f7, CornersConfig cornersConfig, int i11, int i12, Integer num, Integer num2, int i13, int i14, Object obj) {
        CornersConfig cornersConfig2 = (i14 & 2) != 0 ? CornersConfig.NONE : cornersConfig;
        int i15 = (i14 & 4) != 0 ? R$color.bg_primary : i11;
        int color = (i14 & 8) != 0 ? a.getColor(context, i15) : i12;
        Integer num3 = null;
        Integer num4 = (i14 & 16) != 0 ? null : num;
        if ((i14 & 32) == 0) {
            num3 = num2;
        } else if (num4 != null) {
            num3 = Integer.valueOf(a.getColor(context, num4.intValue()));
        }
        return createRoundGradientDrawable(context, f7, cornersConfig2, i15, color, num4, num3, (i14 & 64) != 0 ? ResourceExtKt.toPx(1) : i13);
    }

    @NotNull
    public static final ShapeDrawable createRoundRectShape(@NotNull Context context, float f7, @NotNull CornersConfig type, int i11, int i12, LinearGradient linearGradient) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i13 = iArr[type.ordinal()];
        float f11 = (i13 == 1 || i13 == 2) ? f7 : 0.0f;
        int i14 = iArr[type.ordinal()];
        if (i14 != 2 && i14 != 3) {
            f7 = 0.0f;
        }
        shapeDrawable.setShape(new RoundRectShape(new float[]{f11, f11, f11, f11, f7, f7, f7, f7}, null, null));
        if (linearGradient == null) {
            shapeDrawable.getPaint().setColor(i12);
            return shapeDrawable;
        }
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setShader(linearGradient);
        return shapeDrawable;
    }

    public static /* synthetic */ ShapeDrawable createRoundRectShape$default(Context context, float f7, CornersConfig cornersConfig, int i11, int i12, LinearGradient linearGradient, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            cornersConfig = CornersConfig.NONE;
        }
        CornersConfig cornersConfig2 = cornersConfig;
        if ((i13 & 4) != 0) {
            i11 = R$color.bg_primary;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = a.getColor(context, i14);
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            linearGradient = null;
        }
        return createRoundRectShape(context, f7, cornersConfig2, i14, i15, linearGradient);
    }

    public static final int getStatusBarHeight(@NotNull View view) {
        d f7;
        Intrinsics.checkNotNullParameter(view, "<this>");
        C5353y0 n11 = Y.n(view);
        if (n11 == null || (f7 = n11.f(1)) == null) {
            return 0;
        }
        return f7.f42127b;
    }

    public static final int parseColor(@NotNull Context context, @NotNull String color) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, color);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        return 0;
    }
}
