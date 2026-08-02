package ru.ozon.app.android.storefront.ui.tooltip.internal;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipBeakPosition;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipStyle;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniTextStyles;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\r\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"toPx", "", "Lru/ozon/uni/core/models/UniPaddingToken;", "toStyle", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipStyle;", "Lru/ozon/uni/atoms/data/common/TooltipDTO$StyleType;", "toBeakPosition", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipBeakPosition;", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "toTooltipTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "textColor", "toTooltipSubtitle", "spannableFromHtml", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "tooltip_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TooltipUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TooltipDTO.StyleType.values().length];
            try {
                iArr[TooltipDTO.StyleType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipDTO.StyleType.STATIC_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipDTO.StyleType.STATIC_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TooltipDTO.BeakPosition.values().length];
            try {
                iArr2[TooltipDTO.BeakPosition.BOTTOM_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.LEFT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.RIGHT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.TOP_CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.BOTTOM_CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final OzonSpannableString spannableFromHtml(String str) {
        return OzonHtmlParser.INSTANCE.parseHtml(str, 63);
    }

    @NotNull
    public static final TooltipBeakPosition toBeakPosition(@NotNull TooltipDTO.BeakPosition beakPosition) {
        Intrinsics.checkNotNullParameter(beakPosition, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[beakPosition.ordinal()]) {
            case 1:
                return TooltipBeakPosition.BottomCenter.INSTANCE;
            case 2:
                return TooltipBeakPosition.TopCenter.INSTANCE;
            case 3:
                return TooltipBeakPosition.Left.INSTANCE;
            case 4:
                return TooltipBeakPosition.Right.INSTANCE;
            case 5:
                return TooltipBeakPosition.TopCustom.INSTANCE;
            case 6:
                return TooltipBeakPosition.BottomCustom.INSTANCE;
            default:
                throw new o();
        }
    }

    public static final int toPx(@NotNull UniPaddingToken uniPaddingToken) {
        Intrinsics.checkNotNullParameter(uniPaddingToken, "<this>");
        return UiExtKt.toPx(TokensExtKt.getDp(uniPaddingToken));
    }

    @NotNull
    public static final TooltipStyle toStyle(@NotNull TooltipDTO.StyleType styleType) {
        Intrinsics.checkNotNullParameter(styleType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()];
        if (i11 == 1) {
            return TooltipStyle.INSTANCE.m1022default();
        }
        if (i11 == 2) {
            return TooltipStyle.INSTANCE.staticLight();
        }
        if (i11 == 3) {
            return TooltipStyle.INSTANCE.staticDark();
        }
        throw new o();
    }

    @NotNull
    public static final TextDTO toTooltipSubtitle(@NotNull String str, @NotNull String textColor) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new TextDTO(spannableFromHtml(str), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_300_X_SMALL.getToken(), textColor, null, null, null, null, true, null, null, null, null, Integer.MAX_VALUE, 253502, null);
    }

    @NotNull
    public static final TextDTO toTooltipTitle(@NotNull String str, @NotNull String textColor) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new TextDTO(spannableFromHtml(str), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.COMPACT_400_SMALL.getToken(), textColor, null, null, null, null, true, null, null, null, null, Integer.MAX_VALUE, 253502, null);
    }
}
