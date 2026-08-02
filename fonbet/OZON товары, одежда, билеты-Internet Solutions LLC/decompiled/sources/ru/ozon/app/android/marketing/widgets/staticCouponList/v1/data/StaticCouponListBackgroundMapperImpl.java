package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\f\u0010\f\u001a\u00020\r*\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBackgroundMapperImpl;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBackgroundMapper;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mapBackground", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "dto", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "mapColors", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "mapGradientDirection", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListBackgroundMapperImpl implements StaticCouponListBackgroundMapper {

    @NotNull
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticCouponListDTO.Background.GradientType.values().length];
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StaticCouponListDTO.Background.GradientType.GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StaticCouponListBackgroundMapperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final StaticCouponListBackground.Colors mapColors(StaticCouponListDTO.Background background, Context context) {
        if (background.getBackgroundColor() != null) {
            Integer parseColor = StyleParser.INSTANCE.parseColor(context, background.getBackgroundColor());
            if (parseColor == null) {
                parseColor = StaticCouponListUtilsKt.toColorIntOrNull(background.getBackgroundColor());
            }
            return StaticCouponListBackground.Colors.Solid.m796boximpl(StaticCouponListBackground.Colors.Solid.m797constructorimpl(parseColor));
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor2 = styleParser.parseColor(context, background.getGradientFromColor());
        Integer num = null;
        if (parseColor2 == null) {
            String gradientFromColor = background.getGradientFromColor();
            parseColor2 = gradientFromColor != null ? StaticCouponListUtilsKt.toColorIntOrNull(gradientFromColor) : null;
        }
        Integer parseColor3 = styleParser.parseColor(context, background.getGradientToColor());
        if (parseColor3 == null) {
            String gradientToColor = background.getGradientToColor();
            if (gradientToColor != null) {
                num = StaticCouponListUtilsKt.toColorIntOrNull(gradientToColor);
            }
        } else {
            num = parseColor3;
        }
        return new StaticCouponListBackground.Colors.Gradient(parseColor2, num, mapGradientDirection(background));
    }

    private final StaticCouponListBackground.GradientDirection mapGradientDirection(StaticCouponListDTO.Background background) {
        switch (WhenMappings.$EnumSwitchMapping$0[background.getGradientType().ordinal()]) {
            case 1:
                return StaticCouponListBackground.GradientDirection.TOP_BOTTOM;
            case 2:
                return StaticCouponListBackground.GradientDirection.TOP_RIGHT_LEFT_BOTTOM;
            case 3:
                return StaticCouponListBackground.GradientDirection.RIGHT_LEFT;
            case 4:
                return StaticCouponListBackground.GradientDirection.BOTTOM_RIGHT_TOP_LEFT;
            case 5:
                return StaticCouponListBackground.GradientDirection.BOTTOM_TOP;
            case 6:
                return StaticCouponListBackground.GradientDirection.BOTTOM_LEFT_TOP_RIGHT;
            case 7:
                return StaticCouponListBackground.GradientDirection.LEFT_RIGHT;
            case 8:
                return StaticCouponListBackground.GradientDirection.TOP_LEFT_BOTTOM_RIGHT;
            default:
                throw new o();
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListBackgroundMapper
    @NotNull
    public StaticCouponListBackground mapBackground(@NotNull StaticCouponListDTO.Background dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new StaticCouponListBackground(mapColors(dto, this.context));
    }
}
