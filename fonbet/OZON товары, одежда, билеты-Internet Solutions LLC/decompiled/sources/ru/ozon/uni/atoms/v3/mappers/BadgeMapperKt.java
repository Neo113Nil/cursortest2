package ru.ozon.uni.atoms.v3.mappers;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;
import ru.ozon.uni.core.models.GradientDirection;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "mapToDsBadge", "(Lru/ozon/uni/atoms/data/badge/Badge;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/badge/Badge$StyleType;", "theme", "", "getDefaultIconToken", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;)Ljava/lang/String;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "mapSize", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "backgroundColor", "textColor", "leftIconColor", "rightIconColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "mapStyle", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "Lru/ozon/uni/atoms/data/badge/Badge$GradientColor;", "gradientBackgroundColor", "mapBackgroundColor", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$GradientColor;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "gradientColor", "Lru/ozon/uni/core/UniGradient;", "mapGradient", "(Lru/ozon/uni/atoms/data/badge/Badge$GradientColor;)Lru/ozon/uni/core/UniGradient;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Badge.StyleType.values().length];
            try {
                iArr[Badge.StyleType.STYLE_TYPE_PREMIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_PREMIUM_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_XSMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_DISCOUNT_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_MEDIUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_LARGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_DISCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_INVALID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String getDefaultIconToken(Badge.StyleType styleType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return "ic_s_status_points_compact";
        }
        return null;
    }

    private static final BadgeDTO.CustomBackground mapBackgroundColor(String str, Badge.GradientColor gradientColor) {
        if (gradientColor != null) {
            return new BadgeDTO.CustomBackground(null, mapGradient(gradientColor), 1, null);
        }
        if (str != null) {
            return new BadgeDTO.CustomBackground(str, null, 2, null);
        }
        return null;
    }

    private static final UniGradient mapGradient(Badge.GradientColor gradientColor) {
        List b02 = C7714v.b0(gradientColor.getStartColor(), gradientColor.getEndColor());
        return new UniGradient(GradientDirection.LEFT_RIGHT, b02, b02, null, 8, null);
    }

    private static final BadgeDTO.BadgeSize mapSize(Badge.StyleType styleType) {
        switch (WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return BadgeDTO.BadgeSize.SIZE_500;
            case 2:
            case 4:
            case 5:
                return BadgeDTO.BadgeSize.SIZE_400;
            case 3:
                return BadgeDTO.BadgeSize.SIZE_300;
            default:
                throw new o();
        }
    }

    private static final BadgeDTO.CustomStyle mapStyle(Badge.StyleType styleType, BadgeDTO.CustomBackground customBackground, String str, String str2, String str3) {
        switch (WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()]) {
            case 1:
            case 2:
                if (customBackground == null) {
                    customBackground = new BadgeDTO.CustomBackground(UniColors.GRAPHIC_PREMIUM_BLUE.getToken(), null, 2, null);
                }
                BadgeDTO.CustomBackground customBackground2 = customBackground;
                if (str == null) {
                    str = UniColors.TEXT_LIGHT_KEY.getToken();
                }
                return new BadgeDTO.CustomStyle(customBackground2, null, str, str2 == null ? UniColors.GRAPHIC_LIGHT_KEY.getToken() : str2, str3 == null ? UniColors.GRAPHIC_TERTIARY_ON_DARK.getToken() : str3, 2, null);
            case 3:
                if (customBackground == null) {
                    customBackground = new BadgeDTO.CustomBackground(null, UniGradients.GR_SALE.getGradient(), 1, null);
                }
                BadgeDTO.CustomBackground customBackground3 = customBackground;
                if (str == null) {
                    str = UniColors.TEXT_LIGHT_KEY.getToken();
                }
                return new BadgeDTO.CustomStyle(customBackground3, null, str, str2 == null ? UniColors.GRAPHIC_LIGHT_KEY.getToken() : str2, str3 == null ? UniColors.GRAPHIC_LIGHT_KEY.getToken() : str3, 2, null);
            case 4:
            case 8:
            case 9:
                if (customBackground == null) {
                    customBackground = new BadgeDTO.CustomBackground(UniColors.BG_ACCENT_PRIMARY.getToken(), null, 2, null);
                }
                BadgeDTO.CustomBackground customBackground4 = customBackground;
                if (str == null) {
                    str = UniColors.TEXT_LIGHT_KEY.getToken();
                }
                return new BadgeDTO.CustomStyle(customBackground4, null, str, str2 == null ? UniColors.GRAPHIC_LIGHT_KEY.getToken() : str2, str3 == null ? UniColors.GRAPHIC_LIGHT_KEY.getToken() : str3, 2, null);
            case 5:
            case 6:
                if (customBackground == null) {
                    customBackground = new BadgeDTO.CustomBackground(UniColors.BG_PRIMARY.getToken(), null, 2, null);
                }
                BadgeDTO.CustomBackground customBackground5 = customBackground;
                if (str == null) {
                    str = UniColors.TEXT_LIGHT_KEY.getToken();
                }
                return new BadgeDTO.CustomStyle(customBackground5, null, str, str2 == null ? UniColors.GRAPHIC_SECONDARY.getToken() : str2, str3 == null ? UniColors.GRAPHIC_SECONDARY.getToken() : str3, 2, null);
            case 7:
                if (customBackground == null) {
                    customBackground = new BadgeDTO.CustomBackground(UniColors.CLEAR_LIGHT_KEY_0.getToken(), null, 2, null);
                }
                BadgeDTO.CustomBackground customBackground6 = customBackground;
                if (str == null) {
                    str = UniColors.TEXT_PRIMARY.getToken();
                }
                return new BadgeDTO.CustomStyle(customBackground6, null, str, str2 == null ? UniColors.GRAPHIC_PRIMARY.getToken() : str2, str3 == null ? UniColors.GRAPHIC_PRIMARY.getToken() : str3, 2, null);
            default:
                throw new o();
        }
    }

    @NotNull
    public static final BadgeDTO mapToDsBadge(@NotNull Badge badge) {
        String str;
        Intrinsics.checkNotNullParameter(badge, "<this>");
        String tintColor = badge.getTintColor();
        String iconTintColor = badge.getIconTintColor();
        if (iconTintColor == null) {
            iconTintColor = tintColor;
        }
        Badge.Accessory accessory = badge.getAccessory();
        if (accessory == null || (str = accessory.getIconTintColor()) == null) {
            str = tintColor;
        }
        BadgeDTO.CustomBackground mapBackgroundColor = mapBackgroundColor(badge.getBackgroundColor(), badge.getGradientBackgroundColor());
        CommonControlSettings commonControlSettings = (badge.getAction() == null && badge.getTrackingInfo() == null && badge.getTestInfo() == null) ? null : new CommonControlSettings(badge.getAction(), badge.getTrackingInfo(), badge.getTestInfo());
        Badge.StyleType theme = badge.getTheme();
        if (theme == null) {
            theme = Badge.StyleType.STYLE_TYPE_DISCOUNT_SMALL;
        }
        String text = badge.getText();
        String image = badge.getImage();
        if (image == null) {
            image = getDefaultIconToken(theme);
        }
        return new BadgeDTO(text, image, mapSize(theme), null, mapStyle(theme, mapBackgroundColor, tintColor, iconTintColor, str), commonControlSettings, null, null, BadgeDTO.Style.CUSTOM, null, null, null, 3784, null);
    }
}
