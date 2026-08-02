package ru.ozon.uni.android.ds.compose.component.badge;

import S0.InterfaceC3967k;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeStyle;
import ru.ozon.uni.android.ds.compose.util.GradientExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "toVo", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "Ll1/Q;", "getBackgroundBrush", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;LS0/k;I)Ll1/Q;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsBadgeStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeDTO.Style.values().length];
            try {
                iArr[BadgeDTO.Style.NEUTRAL_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_STATIC_PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.Style.WARNING_PRIMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BadgeDTO.Style.WARNING_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BadgeDTO.Style.NEGATIVE_PRIMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BadgeDTO.Style.NEGATIVE_SECONDARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BadgeDTO.Style.POSITIVE_PRIMARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BadgeDTO.Style.POSITIVE_SECONDARY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BadgeDTO.Style.ACTION_PRIMARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BadgeDTO.Style.ACTION_SECONDARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BadgeDTO.Style.SELLER_BONUS_LIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BadgeDTO.Style.SELLER_BONUS_DARK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BadgeDTO.Style.DIGITAL_GOODS_LIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BadgeDTO.Style.DIGITAL_GOODS_DARK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BadgeDTO.Style.PROMOTIONAL_FIRST_LIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BadgeDTO.Style.PROMOTIONAL_FIRST_DARK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_CARE_LIGHT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_CARE_DARK.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BadgeDTO.Style.PRE_ORDER_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BadgeDTO.Style.PRE_ORDER_DARK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BadgeDTO.Style.NEW_LIGHT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BadgeDTO.Style.NEW_DARK.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BadgeDTO.Style.BESTSELLER_LIGHT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BadgeDTO.Style.BESTSELLER_DARK.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BadgeDTO.Style.TSR_CERTIFICATE_LIGHT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BadgeDTO.Style.TSR_CERTIFICATE_DARK.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_ADS_LIGHT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_ADS_DARK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[BadgeDTO.Style.PAYMENT_AFTER_FITTING_LIGHT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[BadgeDTO.Style.PAYMENT_AFTER_FITTING_DARK.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[BadgeDTO.Style.POINTS_FOR_REVIEWS_LIGHT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[BadgeDTO.Style.POINTS_FOR_REVIEWS_DARK.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[BadgeDTO.Style.CASH_PAYMENT_LIGHT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[BadgeDTO.Style.CASH_PAYMENT_DARK.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[BadgeDTO.Style.AUDIO_LIGHT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[BadgeDTO.Style.AUDIO_DARK.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[BadgeDTO.Style.ORIGINAL_PRODUCT_LIGHT.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[BadgeDTO.Style.ORIGINAL_PRODUCT_DARK.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[BadgeDTO.Style.OUT_OF_STOCK_LIGHT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[BadgeDTO.Style.OUT_OF_STOCK_DARK.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[BadgeDTO.Style.BIG_PROMO.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[BadgeDTO.Style.RATING.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[BadgeDTO.Style.PREMIUM_PLUS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AbstractC7799Q getBackgroundBrush(@NotNull BadgeDTO.CustomBackground customBackground, InterfaceC3967k interfaceC3967k, int i11) {
        AbstractC7799Q brush;
        Intrinsics.checkNotNullParameter(customBackground, "<this>");
        interfaceC3967k.o(868710525);
        if (customBackground.getColor() != null) {
            interfaceC3967k.o(-866421163);
            brush = TokenParserKt.tokenToGradient(customBackground.getColor(), interfaceC3967k, 0);
            if (brush == null) {
                C7807Z c7807z = TokenParserKt.tokenToColor(customBackground.getColor(), interfaceC3967k, 0);
                brush = new K0(c7807z == null ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getBgSecondary() : c7807z.w());
            }
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-866300728);
            UniGradient gradient = customBackground.getGradient();
            brush = gradient == null ? null : GradientExtKt.toBrush(gradient, interfaceC3967k, UniGradient.$stable);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return brush;
    }

    @NotNull
    public static final DsBadgeStyle toVo(@NotNull BadgeDTO.Style style, InterfaceC3967k interfaceC3967k, int i11) {
        DsBadgeStyle neutralPrimary;
        Intrinsics.checkNotNullParameter(style, "<this>");
        interfaceC3967k.o(1542252920);
        switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                interfaceC3967k.o(1963180549);
                neutralPrimary = DsBadgeStyle.INSTANCE.neutralPrimary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 2:
                interfaceC3967k.o(1963182919);
                neutralPrimary = DsBadgeStyle.INSTANCE.neutralSecondary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 3:
                interfaceC3967k.o(1963185318);
                neutralPrimary = DsBadgeStyle.INSTANCE.neutralTertiary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 4:
                interfaceC3967k.o(1963187883);
                neutralPrimary = DsBadgeStyle.INSTANCE.neutralStaticPrimary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 5:
                interfaceC3967k.o(1963190373);
                neutralPrimary = DsBadgeStyle.INSTANCE.warningPrimary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 6:
                interfaceC3967k.o(1963192743);
                neutralPrimary = DsBadgeStyle.INSTANCE.warningSecondary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 7:
                interfaceC3967k.o(1963195142);
                neutralPrimary = DsBadgeStyle.INSTANCE.negativePrimary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 8:
                interfaceC3967k.o(1963197576);
                neutralPrimary = DsBadgeStyle.INSTANCE.negativeSecondary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 9:
                interfaceC3967k.o(1963200006);
                neutralPrimary = DsBadgeStyle.INSTANCE.positivePrimary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 10:
                interfaceC3967k.o(1963202440);
                neutralPrimary = DsBadgeStyle.INSTANCE.positiveSecondary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 11:
                interfaceC3967k.o(1963204804);
                neutralPrimary = DsBadgeStyle.INSTANCE.actionPrimary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 12:
                interfaceC3967k.o(1963207110);
                neutralPrimary = DsBadgeStyle.INSTANCE.actionSecondary(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 13:
                interfaceC3967k.o(1963209543);
                neutralPrimary = DsBadgeStyle.INSTANCE.sellerBonusLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 14:
                interfaceC3967k.o(1963211974);
                neutralPrimary = DsBadgeStyle.INSTANCE.sellerBonusDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 15:
                interfaceC3967k.o(1963214440);
                neutralPrimary = DsBadgeStyle.INSTANCE.digitalGoodsLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 16:
                interfaceC3967k.o(1963216935);
                neutralPrimary = DsBadgeStyle.INSTANCE.digitalGoodsDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 17:
                interfaceC3967k.o(1963219564);
                neutralPrimary = DsBadgeStyle.INSTANCE.promotionalFirstLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 18:
                interfaceC3967k.o(1963222315);
                neutralPrimary = DsBadgeStyle.INSTANCE.promotionalFirstDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 19:
                interfaceC3967k.o(1963224804);
                neutralPrimary = DsBadgeStyle.INSTANCE.ozonCareLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 20:
                interfaceC3967k.o(1963227043);
                neutralPrimary = DsBadgeStyle.INSTANCE.ozonCareDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 21:
                interfaceC3967k.o(1963229284);
                neutralPrimary = DsBadgeStyle.INSTANCE.preOrderLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 22:
                interfaceC3967k.o(1963231523);
                neutralPrimary = DsBadgeStyle.INSTANCE.preOrderDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 23:
                interfaceC3967k.o(1963233567);
                neutralPrimary = DsBadgeStyle.INSTANCE.newLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 24:
                interfaceC3967k.o(1963235454);
                neutralPrimary = DsBadgeStyle.INSTANCE.newDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                interfaceC3967k.o(1963237574);
                neutralPrimary = DsBadgeStyle.INSTANCE.bestsellerLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                interfaceC3967k.o(1963239909);
                neutralPrimary = DsBadgeStyle.INSTANCE.bestsellerDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                interfaceC3967k.o(1963242410);
                neutralPrimary = DsBadgeStyle.INSTANCE.tSRCertificateLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 28:
                interfaceC3967k.o(1963245033);
                neutralPrimary = DsBadgeStyle.INSTANCE.tSRCertificateDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 29:
                interfaceC3967k.o(1963247427);
                neutralPrimary = DsBadgeStyle.INSTANCE.ozonAdsLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                interfaceC3967k.o(1963249602);
                neutralPrimary = DsBadgeStyle.INSTANCE.ozonAdsDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                interfaceC3967k.o(1963252207);
                neutralPrimary = DsBadgeStyle.INSTANCE.paymentAfterFittingLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 32:
                interfaceC3967k.o(1963255182);
                neutralPrimary = DsBadgeStyle.INSTANCE.paymentAfterFittingDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 33:
                interfaceC3967k.o(1963258060);
                neutralPrimary = DsBadgeStyle.INSTANCE.pointsForReviewsLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 34:
                interfaceC3967k.o(1963260843);
                neutralPrimary = DsBadgeStyle.INSTANCE.pointsForReviewsDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                interfaceC3967k.o(1963263431);
                neutralPrimary = DsBadgeStyle.INSTANCE.cashPaymentLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                interfaceC3967k.o(1963265862);
                neutralPrimary = DsBadgeStyle.INSTANCE.cashPaymentDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                interfaceC3967k.o(1963268065);
                neutralPrimary = DsBadgeStyle.INSTANCE.audioLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 38:
                interfaceC3967k.o(1963270080);
                neutralPrimary = DsBadgeStyle.INSTANCE.audioDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                interfaceC3967k.o(1963272459);
                neutralPrimary = DsBadgeStyle.INSTANCE.originalProductLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 40:
                interfaceC3967k.o(1963275146);
                neutralPrimary = DsBadgeStyle.INSTANCE.originalProductDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 41:
                interfaceC3967k.o(1963277702);
                neutralPrimary = DsBadgeStyle.INSTANCE.outOfStockLight(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 42:
                interfaceC3967k.o(1963280101);
                neutralPrimary = DsBadgeStyle.INSTANCE.outOfStockDark(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case 43:
                interfaceC3967k.o(1963282207);
                neutralPrimary = DsBadgeStyle.INSTANCE.bigPromo(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                interfaceC3967k.o(1963284029);
                neutralPrimary = DsBadgeStyle.INSTANCE.rating(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                interfaceC3967k.o(1963285986);
                neutralPrimary = DsBadgeStyle.INSTANCE.premiumPlus(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
            default:
                interfaceC3967k.o(1963287358);
                neutralPrimary = DsBadgeStyle.INSTANCE.default$uni_release(interfaceC3967k, 6);
                interfaceC3967k.k();
                break;
        }
        interfaceC3967k.k();
        return neutralPrimary;
    }

    @NotNull
    public static final DsBadgeStyle toVo(BadgeDTO.CustomStyle customStyle, InterfaceC3967k interfaceC3967k, int i11) {
        InterfaceC3967k interfaceC3967k2;
        DsBadgeStyle m1679customEtIuwbw;
        interfaceC3967k.o(1307193993);
        if (customStyle == null) {
            interfaceC3967k.o(732474983);
            m1679customEtIuwbw = DsBadgeStyle.INSTANCE.default$uni_release(interfaceC3967k, 6);
            interfaceC3967k.k();
            interfaceC3967k2 = interfaceC3967k;
        } else {
            interfaceC3967k.o(732536177);
            DsBadgeStyle.Companion companion = DsBadgeStyle.INSTANCE;
            DsBadgeStyle default$uni_release = companion.default$uni_release(interfaceC3967k, 6);
            BadgeDTO.CustomBackground backgroundColor = customStyle.getBackgroundColor();
            interfaceC3967k.o(1963295273);
            AbstractC7799Q backgroundBrush = backgroundColor == null ? null : getBackgroundBrush(backgroundColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            if (backgroundBrush == null) {
                backgroundBrush = default$uni_release.getBackground();
            }
            C7807Z c7807z = TokenParserKt.tokenToColor(customStyle.getTextColor(), interfaceC3967k, 0);
            long w11 = c7807z != null ? c7807z.w() : default$uni_release.getTextColor();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(customStyle.getLeftGraphicColor(), interfaceC3967k, 0);
            long w12 = c7807z2 != null ? c7807z2.w() : default$uni_release.getLeftIconColor();
            C7807Z c7807z3 = TokenParserKt.tokenToColor(customStyle.getRightGraphicColor(), interfaceC3967k, 0);
            interfaceC3967k2 = interfaceC3967k;
            m1679customEtIuwbw = companion.m1679customEtIuwbw(backgroundBrush, w11, w12, c7807z3 != null ? c7807z3.w() : default$uni_release.getRightIconColor(), interfaceC3967k2, 24576);
            interfaceC3967k2.k();
        }
        interfaceC3967k2.k();
        return m1679customEtIuwbw;
    }
}
