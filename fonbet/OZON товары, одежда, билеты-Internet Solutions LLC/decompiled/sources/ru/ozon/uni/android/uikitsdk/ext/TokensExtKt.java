package ru.ozon.uni.android.uikitsdk.ext;

import Sc.o;
import Xc.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradientColors;
import ru.ozon.uni.core.UniGradients;
import ru.ozon.uni.core.models.GradientDirection;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroid/content/Context;", "context", "", "token", "", "getIconResByToken", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", AppMeasurementSdk.ConditionalUserProperty.NAME, "loadDrawableByName", "gradientToken", "Lru/ozon/uni/core/UniGradient;", "getGradientByToken", "(Ljava/lang/String;)Lru/ozon/uni/core/UniGradient;", "colorToken", "getGradientColorByToken", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lru/ozon/uni/core/models/GradientDirection;", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "toGradientOrientation", "(Lru/ozon/uni/core/models/GradientDirection;)Landroid/graphics/drawable/GradientDrawable$Orientation;", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "toGradient", "(Lru/ozon/uni/core/UniGradient;Landroid/content/Context;)Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "", "Lru/ozon/uni/core/UniGradients;", "UiKitCoreGradients", "Ljava/util/Map;", "Lru/ozon/uni/core/UniGradientColors;", "UiKitCoreGradientColors", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TokensExtKt {

    @NotNull
    private static final Map<String, UniGradientColors> UiKitCoreGradientColors;

    @NotNull
    private static final Map<String, UniGradients> UiKitCoreGradients;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDirection.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDirection.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDirection.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDirection.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDirection.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDirection.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr2[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        a<UniGradients> entries = UniGradients.getEntries();
        int h11 = U.h(C7714v.z(entries, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : entries) {
            linkedHashMap.put(((UniGradients) obj).getToken(), obj);
        }
        UiKitCoreGradients = linkedHashMap;
        a<UniGradientColors> entries2 = UniGradientColors.getEntries();
        int h12 = U.h(C7714v.z(entries2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
        for (Object obj2 : entries2) {
            linkedHashMap2.put(((UniGradientColors) obj2).getToken(), obj2);
        }
        UiKitCoreGradientColors = linkedHashMap2;
    }

    public static final UniGradient getGradientByToken(@NotNull String gradientToken) {
        Intrinsics.checkNotNullParameter(gradientToken, "gradientToken");
        UniGradients uniGradients = UiKitCoreGradients.get(gradientToken);
        if (uniGradients != null) {
            return uniGradients.getGradient();
        }
        return null;
    }

    public static final Integer getGradientColorByToken(String str) {
        UniGradientColors uniGradientColors = UiKitCoreGradientColors.get(str);
        if (uniGradientColors != null) {
            return Integer.valueOf(uniGradientColors.getResId());
        }
        return null;
    }

    public static final Integer getIconResByToken(@NotNull Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
            return loadDrawableByName(context, str);
        }
        return null;
    }

    public static final Integer loadDrawableByName(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        UniIconToken byId = UniTheme.INSTANCE.getIconTokens().getById(name);
        Integer drawable = byId != null ? ru.ozon.uni.core.compose.tokens.TokensExtKt.getDrawable(byId) : null;
        if (drawable != null) {
            return drawable;
        }
        int identifier = context.getResources().getIdentifier(name, "drawable", context.getApplicationContext().getPackageName());
        if (identifier != 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }

    @NotNull
    public static final Color.Gradient toGradient(@NotNull UniGradient uniGradient, @NotNull Context context) {
        List<String> lightColorTokens;
        int intValue;
        Intrinsics.checkNotNullParameter(uniGradient, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 29) {
            if (ThemeExtKt.isDarkThemeActive(context)) {
                lightColorTokens = uniGradient.getDarkColorTokens();
                if (lightColorTokens == null) {
                    lightColorTokens = uniGradient.getLightColorTokens();
                }
            } else {
                lightColorTokens = uniGradient.getLightColorTokens();
            }
        } else if (ThemeExtKt.isDarkThemeActive(context)) {
            lightColorTokens = uniGradient.getDarkColorTokens();
            List<String> list = lightColorTokens;
            if (list == null || list.isEmpty()) {
                lightColorTokens = null;
            }
            if (lightColorTokens == null) {
                lightColorTokens = uniGradient.getLightColorTokens();
            }
        } else {
            lightColorTokens = uniGradient.getLightColorTokens();
        }
        List<String> list2 = lightColorTokens;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (String str : list2) {
            Integer gradientColorByToken = getGradientColorByToken(str);
            if (gradientColorByToken != null) {
                intValue = ColorExtKt.toColorInt(gradientColorByToken.intValue(), context);
            } else {
                Integer parseColor = StyleParser.INSTANCE.parseColor(context, str);
                intValue = parseColor != null ? parseColor.intValue() : 0;
            }
            arrayList.add(Integer.valueOf(intValue));
        }
        int[] T02 = C7714v.T0(arrayList);
        GradientDirection gradientDirection = uniGradient.getGradientDirection();
        if (gradientDirection == null) {
            gradientDirection = GradientDirection.TOP_BOTTOM;
        }
        return new Color.Gradient(T02, toGradientOrientation(gradientDirection), C7714v.R0(uniGradient.getPositions()));
    }

    @NotNull
    public static final GradientDrawable.Orientation toGradientOrientation(@NotNull GradientDirection gradientDirection) {
        Intrinsics.checkNotNullParameter(gradientDirection, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[gradientDirection.ordinal()]) {
            case 1:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 2:
                return GradientDrawable.Orientation.TR_BL;
            case 3:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 4:
                return GradientDrawable.Orientation.BR_TL;
            case 5:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 6:
                return GradientDrawable.Orientation.BL_TR;
            case 7:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 8:
                return GradientDrawable.Orientation.TL_BR;
            default:
                throw new o();
        }
    }
}
