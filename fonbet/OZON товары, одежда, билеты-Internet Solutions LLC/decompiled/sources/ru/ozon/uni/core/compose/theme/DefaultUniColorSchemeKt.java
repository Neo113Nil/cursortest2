package ru.ozon.uni.core.compose.theme;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniCoreColors;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"DefaultLightUniColorScheme", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "getDefaultLightUniColorScheme", "()Lru/ozon/uni/core/compose/theme/UniColorScheme;", "DefaultDarkUniColorScheme", "getDefaultDarkUniColorScheme", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultUniColorSchemeKt {

    @NotNull
    private static final UniColorScheme DefaultLightUniColorScheme = new UniColorScheme() { // from class: ru.ozon.uni.core.compose.theme.DefaultUniColorSchemeKt$DefaultLightUniColorScheme$1
        private final long bgAccentOnLight;
        private final long bgAccentPrimary;
        private final long bgAccentPrimaryInverted;
        private final long bgAccentSecondary;
        private final long bgAccentSecondaryInverted;
        private final long bgActionPrimary;
        private final long bgActionPrimaryInverted;
        private final long bgActionSecondary;
        private final long bgActionSecondaryInverted;
        private final long bgActionSecondarySolid;
        private final long bgActiveAccentPrimary;
        private final long bgActiveAccentPrimaryInverted;
        private final long bgActiveAccentSecondary;
        private final long bgActiveAccentSecondaryInverted;
        private final long bgActiveActionPrimary;
        private final long bgActiveActionPrimaryInverted;
        private final long bgActiveActionSecondary;
        private final long bgActiveActionSecondaryInverted;
        private final long bgActiveApparelPrimary;
        private final long bgActiveApparelPrimaryInverted;
        private final long bgActiveApparelSecondary;
        private final long bgActiveApparelSecondaryInverted;
        private final long bgActiveAquaPrimary;
        private final long bgActiveBestpricePrimary;
        private final long bgActiveBestpricePrimaryInverted;
        private final long bgActiveBestpriceSecondary;
        private final long bgActiveBestpriceSecondaryInverted;
        private final long bgActiveEconomPrimary;
        private final long bgActiveEconomSecondary;
        private final long bgActiveExpressPrimary;
        private final long bgActiveExpressPrimaryInverted;
        private final long bgActiveExpressSecondary;
        private final long bgActiveExpressSecondaryInverted;
        private final long bgActiveFreshPrimary;
        private final long bgActiveFreshPrimaryInverted;
        private final long bgActiveFreshSecondary;
        private final long bgActiveFreshSecondaryInverted;
        private final long bgActiveMarketingPrimary;
        private final long bgActiveMarketingPrimaryInverted;
        private final long bgActiveMarketingSecondary;
        private final long bgActiveMarketingSecondaryInverted;
        private final long bgActiveNegativePrimary;
        private final long bgActiveNegativePrimaryInverted;
        private final long bgActiveNegativeSecondary;
        private final long bgActiveNegativeSecondaryInverted;
        private final long bgActiveOzonPrimary;
        private final long bgActiveOzonSecondary;
        private final long bgActivePositivePrimary;
        private final long bgActivePositivePrimaryInverted;
        private final long bgActivePositiveSecondary;
        private final long bgActivePositiveSecondaryInverted;
        private final long bgActivePremiumPrimary;
        private final long bgActivePremiumPrimaryInverted;
        private final long bgActivePremiumSecondary;
        private final long bgActivePremiumSecondaryInverted;
        private final long bgActivePrimary;
        private final long bgActivePrimaryInverted;
        private final long bgActiveSecondary;
        private final long bgActiveSecondaryInverted;
        private final long bgActiveSelect;
        private final long bgActiveSelectInverted;
        private final long bgActiveWarningPrimary;
        private final long bgActiveWarningPrimaryInverted;
        private final long bgActiveWarningSecondary;
        private final long bgActiveWarningSecondaryInverted;
        private final long bgApparelPiggy;
        private final long bgApparelPrimary;
        private final long bgApparelPrimaryInverted;
        private final long bgApparelSecondary;
        private final long bgApparelSecondaryInverted;
        private final long bgAquaPrimary;
        private final long bgAttentionPrimary;
        private final long bgBestpricePrimary;
        private final long bgBestpricePrimaryInverted;
        private final long bgBestpriceSecondary;
        private final long bgBestpriceSecondaryInverted;
        private final long bgControl;
        private final long bgControlInverted;
        private final long bgDarkCerulean;
        private final long bgDarkKey;
        private final long bgDoubtfullPrimary;
        private final long bgEconomPrimary;
        private final long bgEconomSecondary;
        private final long bgExpressPrimary;
        private final long bgExpressPrimaryInverted;
        private final long bgExpressSecondary;
        private final long bgExpressSecondaryInverted;
        private final long bgFreshPrimary;
        private final long bgFreshPrimaryInverted;
        private final long bgFreshSecondary;
        private final long bgFreshSecondaryInverted;
        private final long bgGuaranteePrimary;
        private final long bgInstalmentPrimary;
        private final long bgInstalmentSecondary;
        private final long bgLightKey;
        private final long bgMarketingOnLight;
        private final long bgMarketingPrimary;
        private final long bgMarketingPrimaryInverted;
        private final long bgMarketingSecondary;
        private final long bgMarketingSecondaryInverted;
        private final long bgMarketingSecondarySolid;
        private final long bgNegativePrimary;
        private final long bgNegativePrimaryInverted;
        private final long bgNegativeSecondary;
        private final long bgNegativeSecondaryInverted;
        private final long bgOpaqueAccentSecondary;
        private final long bgOpaqueActionSecondary;
        private final long bgOpaqueApparelSecondary;
        private final long bgOpaqueEconomSecondary;
        private final long bgOpaqueFreshSecondary;
        private final long bgOpaqueMarketingSecondary;
        private final long bgOpaqueNegativeSecondary;
        private final long bgOpaqueOzonSecondary;
        private final long bgOpaquePositiveSecondary;
        private final long bgOpaqueSecondary;
        private final long bgOpaqueWarningSecondary;
        private final long bgOverlap;
        private final long bgOverlapInverted;
        private final long bgOxford;
        private final long bgOzonPrimary;
        private final long bgOzonSecondary;
        private final long bgPositiveOnLight;
        private final long bgPositivePrimary;
        private final long bgPositivePrimaryInverted;
        private final long bgPositiveSecondary;
        private final long bgPositiveSecondaryInverted;
        private final long bgPremiumPrimary;
        private final long bgPremiumPrimaryInverted;
        private final long bgPremiumSecondary;
        private final long bgPremiumSecondaryInverted;
        private final long bgPrimary;
        private final long bgPrimaryInverted;
        private final long bgPrussian;
        private final long bgSbp;
        private final long bgSecondary;
        private final long bgSecondaryDynamic;
        private final long bgSecondaryDynamicInverted;
        private final long bgSecondaryInverted;
        private final long bgSelect;
        private final long bgSelectInverted;
        private final long bgTabbarPrimary;
        private final long bgTech;
        private final long bgUltraPrimary;
        private final long bgWarningOnLight;
        private final long bgWarningPrimary;
        private final long bgWarningPrimaryInverted;
        private final long bgWarningSecondary;
        private final long bgWarningSecondaryInverted;
        private final long clearDarkKey100;
        private final long clearDarkKey200;
        private final long clearDarkKey300;
        private final long clearDarkKey400;
        private final long clearDarkKey500;
        private final long clearDarkKey600;
        private final long clearDarkKey700;
        private final long clearDarkKey800;
        private final long clearLightKey0;
        private final long clearLightKey100;
        private final long clearLightKey200;
        private final long clearLightKey300;
        private final long clearLightKey400;
        private final long clearLightKey500;
        private final long clearLightKey600;
        private final long clearLightKey700;
        private final long clearLightKey800;
        private final long detectorColorMine;
        private final long graphicAccentOnLight;
        private final long graphicAccentPrimary;
        private final long graphicAccentPrimaryInverted;
        private final long graphicActionOnDark;
        private final long graphicActionOnLight;
        private final long graphicActionPrimary;
        private final long graphicActionPrimaryInverted;
        private final long graphicActiveAccentPrimary;
        private final long graphicActiveAccentPrimaryInverted;
        private final long graphicActiveActionPrimary;
        private final long graphicActiveActionPrimaryInverted;
        private final long graphicActiveApparel;
        private final long graphicActiveApparelInverted;
        private final long graphicActiveBestprice;
        private final long graphicActiveBestpriceInverted;
        private final long graphicActiveEconom;
        private final long graphicActiveExpress;
        private final long graphicActiveExpressInverted;
        private final long graphicActiveFresh;
        private final long graphicActiveFreshInverted;
        private final long graphicActiveMarketing;
        private final long graphicActiveMarketingInverted;
        private final long graphicActiveNegativePrimary;
        private final long graphicActiveNegativePrimaryInverted;
        private final long graphicActiveOzon;
        private final long graphicActivePositivePrimary;
        private final long graphicActivePositivePrimaryInverted;
        private final long graphicActivePremium;
        private final long graphicActivePremiumBlue;
        private final long graphicActivePremiumInverted;
        private final long graphicActiveRating;
        private final long graphicActiveRatingInverted;
        private final long graphicActiveWarningPrimary;
        private final long graphicActiveWarningPrimaryInverted;
        private final long graphicApparel;
        private final long graphicApparelInverted;
        private final long graphicBestprice;
        private final long graphicBestpriceInverted;
        private final long graphicDarkKey;
        private final long graphicDarkerNeutralOnLight;
        private final long graphicDisabled;
        private final long graphicDisabledInverted;
        private final long graphicDisabledOnDark;
        private final long graphicDisabledOnLight;
        private final long graphicEconom;
        private final long graphicExpress;
        private final long graphicExpressInverted;
        private final long graphicExpressOnDark;
        private final long graphicFintechGracePrimary;
        private final long graphicFintechGraceSecondary;
        private final long graphicFresh;
        private final long graphicFreshInverted;
        private final long graphicFreshOnDark;
        private final long graphicGuarantee;
        private final long graphicKey;
        private final long graphicKeyInverted;
        private final long graphicLightKey;
        private final long graphicMarketing;
        private final long graphicMarketingInverted;
        private final long graphicMarketingOnDark;
        private final long graphicMarketingOnLight;
        private final long graphicNegativeOnDark;
        private final long graphicNegativePrimary;
        private final long graphicNegativePrimaryInverted;
        private final long graphicNeutral;
        private final long graphicNeutralInverted;
        private final long graphicNeutralOnDark;
        private final long graphicNeutralOnLight;
        private final long graphicOverlapPrimary;
        private final long graphicOverlapPrimaryDynamic;
        private final long graphicOxford;
        private final long graphicOzon;
        private final long graphicPositiveOnDark;
        private final long graphicPositivePrimary;
        private final long graphicPositivePrimaryInverted;
        private final long graphicPositivePrimaryOnLight;
        private final long graphicPositiveSecondary;
        private final long graphicPremium;
        private final long graphicPremiumBlue;
        private final long graphicPremiumInverted;
        private final long graphicPrimary;
        private final long graphicPrimaryDynamic;
        private final long graphicPrimaryDynamicInverted;
        private final long graphicPrimaryInverted;
        private final long graphicPrimaryOnDark;
        private final long graphicPrimaryOnLight;
        private final long graphicQuaternary;
        private final long graphicRating;
        private final long graphicRatingInverted;
        private final long graphicSecondary;
        private final long graphicSecondaryDynamic;
        private final long graphicSecondaryDynamicInverted;
        private final long graphicSecondaryInverted;
        private final long graphicSecondaryOnDark;
        private final long graphicSecondaryOnLight;
        private final long graphicSolidNeutral;
        private final long graphicStrokeSticky;
        private final long graphicTabbarIconPrimary;
        private final long graphicTabbarIconSecondary;
        private final long graphicTech;
        private final long graphicTertiary;
        private final long graphicTertiaryDynamic;
        private final long graphicTertiaryInverted;
        private final long graphicTertiaryOnDark;
        private final long graphicTertiaryOnLight;
        private final long graphicUltraPrimary;
        private final long graphicWarningOnDark;
        private final long graphicWarningPrimary;
        private final long graphicWarningPrimaryInverted;
        private final long graphicWarningPrimaryOnLight;
        private final boolean isDark;
        private final long layerActiveFloor0;
        private final long layerActiveFloor1;
        private final long layerActiveFloor1Inverted;
        private final long layerActiveFloor2;
        private final long layerActiveFloor2Inverted;
        private final long layerActiveFloor3;
        private final long layerActiveFloor3Inverted;
        private final long layerActiveSurface;
        private final long layerActiveSurfaceInverted;
        private final long layerFloor0;
        private final long layerFloor0Inverted;
        private final long layerFloor1;
        private final long layerFloor1Inverted;
        private final long layerFloor1OnDark;
        private final long layerFloor2;
        private final long layerFloor2Inverted;
        private final long layerFloor3;
        private final long layerFloor3Inverted;
        private final long layerOverlayDimming;
        private final long layerOverlayDimmingInverted;
        private final long layerOverlayParanja;
        private final long layerOverlayParanjaInverted;
        private final long layerSurface;
        private final long layerSurfaceInverted;
        private final long textAccent;
        private final long textAccentInverted;
        private final long textAccentOnLight;
        private final long textAction;
        private final long textActionInverted;
        private final long textActionOnDark;
        private final long textActionOnLight;
        private final long textActiveAccent;
        private final long textActiveAccentInverted;
        private final long textActiveAction;
        private final long textActiveActionInverted;
        private final long textActiveApparel;
        private final long textActiveApparelInverted;
        private final long textActiveBestprice;
        private final long textActiveBestpriceInverted;
        private final long textActiveExpress;
        private final long textActiveExpressInverted;
        private final long textActiveFresh;
        private final long textActiveFreshInverted;
        private final long textActiveMarketing;
        private final long textActiveMarketingInverted;
        private final long textActiveNegative;
        private final long textActiveNegativeInverted;
        private final long textActiveOzon;
        private final long textActivePositive;
        private final long textActivePositiveInverted;
        private final long textActivePremium;
        private final long textActivePremiumInverted;
        private final long textActiveWarning;
        private final long textActiveWarningInverted;
        private final long textApparel;
        private final long textApparelInverted;
        private final long textBestprice;
        private final long textBestpriceInverted;
        private final long textDarkKey;
        private final long textDiscountUnavialable;
        private final long textEconom;
        private final long textExpress;
        private final long textExpressInverted;
        private final long textExpressOnDark;
        private final long textFresh;
        private final long textFreshInverted;
        private final long textFreshOnDark;
        private final long textGuarantee;
        private final long textLightKey;
        private final long textMarketing;
        private final long textMarketingInverted;
        private final long textMarketingOnDark;
        private final long textMarketingOnLight;
        private final long textNegative;
        private final long textNegativeInverted;
        private final long textNegativeOnDark;
        private final long textOriginalprice;
        private final long textOriginalpriceAvailable;
        private final long textOxford;
        private final long textOzon;
        private final long textPositive;
        private final long textPositiveInverted;
        private final long textPositiveOnDark;
        private final long textPositiveOnLight;
        private final long textPremium;
        private final long textPremiumInverted;
        private final long textPrimary;
        private final long textPrimaryDynamic;
        private final long textPrimaryDynamicInverted;
        private final long textPrimaryInverted;
        private final long textPrimaryOnDark;
        private final long textPrimaryOnLight;
        private final long textSecondary;
        private final long textSecondaryDynamic;
        private final long textSecondaryDynamicInverted;
        private final long textSecondaryInverted;
        private final long textSecondaryOnDark;
        private final long textSecondaryOnLight;
        private final long textTech;
        private final long textTertiary;
        private final long textTertiaryInverted;
        private final long textTertiaryOnDark;
        private final long textTertiaryOnLight;
        private final long textUltra;
        private final long textWarning;
        private final long textWarningInverted;
        private final long textWarningOnDark;

        {
            UniCoreColors uniCoreColors = UniCoreColors.INSTANCE;
            this.detectorColorMine = uniCoreColors.m2803getGreenhighlight0d7_KjU();
            this.bgAccentOnLight = uniCoreColors.m2811getMagenta500d7_KjU();
            this.bgDarkKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgLightKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgMarketingOnLight = uniCoreColors.m2911getViolet500d7_KjU();
            this.bgPositiveOnLight = uniCoreColors.m2798getGreen500d7_KjU();
            this.bgWarningOnLight = uniCoreColors.m2939getYellow250d7_KjU();
            this.clearDarkKey100 = uniCoreColors.m2744getBlackTransparent250d7_KjU();
            this.clearDarkKey200 = uniCoreColors.m2741getBlackTransparent1000d7_KjU();
            this.clearDarkKey300 = uniCoreColors.m2742getBlackTransparent1200d7_KjU();
            this.clearDarkKey400 = uniCoreColors.m2743getBlackTransparent1600d7_KjU();
            this.clearDarkKey500 = uniCoreColors.m2745getBlackTransparent3200d7_KjU();
            this.clearDarkKey600 = uniCoreColors.m2746getBlackTransparent4800d7_KjU();
            this.clearDarkKey700 = uniCoreColors.m2748getBlackTransparent6400d7_KjU();
            this.clearDarkKey800 = uniCoreColors.m2749getBlackTransparent8000d7_KjU();
            this.clearLightKey0 = uniCoreColors.m2920getWhiteTransparent00d7_KjU();
            this.clearLightKey100 = uniCoreColors.m2925getWhiteTransparent250d7_KjU();
            this.clearLightKey200 = uniCoreColors.m2921getWhiteTransparent1000d7_KjU();
            this.clearLightKey300 = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.clearLightKey400 = uniCoreColors.m2923getWhiteTransparent1600d7_KjU();
            this.clearLightKey500 = uniCoreColors.m2927getWhiteTransparent3200d7_KjU();
            this.clearLightKey600 = uniCoreColors.m2929getWhiteTransparent4800d7_KjU();
            this.clearLightKey700 = uniCoreColors.m2933getWhiteTransparent6400d7_KjU();
            this.clearLightKey800 = uniCoreColors.m2935getWhiteTransparent8000d7_KjU();
            this.graphicAccentOnLight = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.graphicActionOnDark = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicActionOnLight = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicDarkKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicDarkerNeutralOnLight = uniCoreColors.m2846getNeutralTransparentDark2000d7_KjU();
            this.graphicDisabledOnDark = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.graphicDisabledOnLight = uniCoreColors.m2848getNeutralTransparentDark500d7_KjU();
            this.graphicExpressOnDark = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.graphicFreshOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicLightKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicMarketingOnDark = uniCoreColors.m2909getViolet4000d7_KjU();
            this.graphicMarketingOnLight = uniCoreColors.m2912getViolet5000d7_KjU();
            this.graphicNegativeOnDark = uniCoreColors.m2881getRed3750d7_KjU();
            this.graphicNeutralOnDark = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.graphicNeutralOnLight = uniCoreColors.m2845getNeutralTransparentDark1000d7_KjU();
            this.graphicPositiveOnDark = uniCoreColors.m2795getGreen3000d7_KjU();
            this.graphicPositivePrimaryOnLight = uniCoreColors.m2796getGreen3500d7_KjU();
            this.graphicPrimaryOnDark = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicPrimaryOnLight = uniCoreColors.m2828getNeutral10000d7_KjU();
            this.graphicSecondaryOnDark = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicSecondaryOnLight = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.graphicSolidNeutral = uniCoreColors.m2833getNeutral4000d7_KjU();
            this.graphicTertiaryOnDark = uniCoreColors.m2926getWhiteTransparent3000d7_KjU();
            this.graphicTertiaryOnLight = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicWarningOnDark = uniCoreColors.m2937getYellow2000d7_KjU();
            this.graphicWarningPrimaryOnLight = uniCoreColors.m2941getYellow3000d7_KjU();
            this.layerFloor1OnDark = uniCoreColors.m2792getGray9000d7_KjU();
            this.textAccentOnLight = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.textActionOnDark = uniCoreColors.m2752getBlue4000d7_KjU();
            this.textActionOnLight = uniCoreColors.m2755getBlue5000d7_KjU();
            this.textDarkKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.textExpressOnDark = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textFreshOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textLightKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.textMarketingOnDark = uniCoreColors.m2909getViolet4000d7_KjU();
            this.textMarketingOnLight = uniCoreColors.m2912getViolet5000d7_KjU();
            this.textNegativeOnDark = uniCoreColors.m2881getRed3750d7_KjU();
            this.textPositiveOnDark = uniCoreColors.m2795getGreen3000d7_KjU();
            this.textPositiveOnLight = uniCoreColors.m2796getGreen3500d7_KjU();
            this.textPrimaryOnDark = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textPrimaryOnLight = uniCoreColors.m2740getBlack0d7_KjU();
            this.textSecondaryOnDark = uniCoreColors.m2932getWhiteTransparent6000d7_KjU();
            this.textSecondaryOnLight = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.textTertiaryOnDark = uniCoreColors.m2928getWhiteTransparent4000d7_KjU();
            this.textTertiaryOnLight = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.textWarningOnDark = uniCoreColors.m2937getYellow2000d7_KjU();
            this.bgAccentPrimary = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgAccentPrimaryInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgAccentSecondary = uniCoreColors.m2818getMagentaTransparent500d7_KjU();
            this.bgAccentSecondaryInverted = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgActionPrimary = uniCoreColors.m2755getBlue5000d7_KjU();
            this.bgActionPrimaryInverted = uniCoreColors.m2755getBlue5000d7_KjU();
            this.bgActionSecondary = uniCoreColors.m2762getBlueTransparent500d7_KjU();
            this.bgActionSecondaryInverted = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgActionSecondarySolid = uniCoreColors.m2890getSky2000d7_KjU();
            this.bgActiveAccentPrimary = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.bgActiveAccentPrimaryInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.bgActiveAccentSecondary = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgActiveAccentSecondaryInverted = uniCoreColors.m2817getMagentaTransparent1500d7_KjU();
            this.bgActiveActionPrimary = uniCoreColors.m2756getBlue6000d7_KjU();
            this.bgActiveActionPrimaryInverted = uniCoreColors.m2753getBlue4500d7_KjU();
            this.bgActiveActionSecondary = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgActiveActionSecondaryInverted = uniCoreColors.m2761getBlueTransparent1500d7_KjU();
            this.bgActiveApparelPrimary = uniCoreColors.m2866getPink6000d7_KjU();
            this.bgActiveApparelPrimaryInverted = uniCoreColors.m2864getPink4000d7_KjU();
            this.bgActiveApparelSecondary = uniCoreColors.m2870getPinkTransparent3000d7_KjU();
            this.bgActiveApparelSecondaryInverted = uniCoreColors.m2868getPinkTransparent1500d7_KjU();
            this.bgActiveAquaPrimary = uniCoreColors.m2751getBlue3500d7_KjU();
            this.bgActiveBestpricePrimary = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.bgActiveBestpricePrimaryInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.bgActiveBestpriceSecondary = uniCoreColors.m2765getBrandCaseBestprice400Transparent0d7_KjU();
            this.bgActiveBestpriceSecondaryInverted = uniCoreColors.m2765getBrandCaseBestprice400Transparent0d7_KjU();
            this.bgActiveEconomPrimary = uniCoreColors.m2852getOrange4000d7_KjU();
            this.bgActiveEconomSecondary = uniCoreColors.m2856getOrangeTransparent1000d7_KjU();
            this.bgActiveExpressPrimary = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.bgActiveExpressPrimaryInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.bgActiveExpressSecondary = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgActiveExpressSecondaryInverted = uniCoreColors.m2817getMagentaTransparent1500d7_KjU();
            this.bgActiveFreshPrimary = uniCoreColors.m2729getAzure4000d7_KjU();
            this.bgActiveFreshPrimaryInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.bgActiveFreshSecondary = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgActiveFreshSecondaryInverted = uniCoreColors.m2737getAzureTransparent1500d7_KjU();
            this.bgActiveMarketingPrimary = uniCoreColors.m2913getViolet6000d7_KjU();
            this.bgActiveMarketingPrimaryInverted = uniCoreColors.m2910getViolet4500d7_KjU();
            this.bgActiveMarketingSecondary = uniCoreColors.m2916getVioletTransparent1000d7_KjU();
            this.bgActiveMarketingSecondaryInverted = uniCoreColors.m2917getVioletTransparent1500d7_KjU();
            this.bgActiveNegativePrimary = uniCoreColors.m2884getRed5000d7_KjU();
            this.bgActiveNegativePrimaryInverted = uniCoreColors.m2882getRed4000d7_KjU();
            this.bgActiveNegativeSecondary = uniCoreColors.m2887getRedTransparent1000d7_KjU();
            this.bgActiveNegativeSecondaryInverted = uniCoreColors.m2888getRedTransparent1500d7_KjU();
            this.bgActiveOzonPrimary = uniCoreColors.m2756getBlue6000d7_KjU();
            this.bgActiveOzonSecondary = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgActivePositivePrimary = uniCoreColors.m2797getGreen4000d7_KjU();
            this.bgActivePositivePrimaryInverted = uniCoreColors.m2795getGreen3000d7_KjU();
            this.bgActivePositiveSecondary = uniCoreColors.m2800getGreenTransparent1000d7_KjU();
            this.bgActivePositiveSecondaryInverted = uniCoreColors.m2801getGreenTransparent1500d7_KjU();
            this.bgActivePremiumPrimary = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.bgActivePremiumPrimaryInverted = uniCoreColors.m2837getNeutral8000d7_KjU();
            this.bgActivePremiumSecondary = uniCoreColors.m2849getNeutralTransparentLight1000d7_KjU();
            this.bgActivePremiumSecondaryInverted = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgActivePrimary = uniCoreColors.m2830getNeutral2000d7_KjU();
            this.bgActivePrimaryInverted = uniCoreColors.m2790getGray7000d7_KjU();
            this.bgActiveSecondary = uniCoreColors.m2839getNeutralTransparent1000d7_KjU();
            this.bgActiveSecondaryInverted = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgActiveSelect = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgActiveSelectInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgActiveWarningPrimary = uniCoreColors.m2941getYellow3000d7_KjU();
            this.bgActiveWarningPrimaryInverted = uniCoreColors.m2938getYellow2250d7_KjU();
            this.bgActiveWarningSecondary = uniCoreColors.m2945getYellowTransparent1000d7_KjU();
            this.bgActiveWarningSecondaryInverted = uniCoreColors.m2946getYellowTransparent1500d7_KjU();
            this.bgApparelPiggy = uniCoreColors.m2860getPink1500d7_KjU();
            this.bgApparelPrimary = uniCoreColors.m2864getPink4000d7_KjU();
            this.bgApparelPrimaryInverted = uniCoreColors.m2863getPink3000d7_KjU();
            this.bgApparelSecondary = uniCoreColors.m2867getPinkTransparent1000d7_KjU();
            this.bgApparelSecondaryInverted = uniCoreColors.m2869getPinkTransparent2000d7_KjU();
            this.bgAquaPrimary = uniCoreColors.m2763getBrandAdditionalMorningBlue0d7_KjU();
            this.bgAttentionPrimary = uniCoreColors.m2880getRed3500d7_KjU();
            this.bgBestpricePrimary = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.bgBestpricePrimaryInverted = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.bgBestpriceSecondary = uniCoreColors.m2764getBrandCaseBestprice300Transparent0d7_KjU();
            this.bgBestpriceSecondaryInverted = uniCoreColors.m2764getBrandCaseBestprice300Transparent0d7_KjU();
            this.bgControl = uniCoreColors.m2834getNeutral500d7_KjU();
            this.bgControlInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgDarkCerulean = uniCoreColors.m2775getBrandOzonTechDarkCerulean0d7_KjU();
            this.bgDoubtfullPrimary = uniCoreColors.m2768getBrandCaseDoubtfull0d7_KjU();
            this.bgEconomPrimary = uniCoreColors.m2851getOrange3500d7_KjU();
            this.bgEconomSecondary = uniCoreColors.m2857getOrangeTransparent500d7_KjU();
            this.bgExpressPrimary = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgExpressPrimaryInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgExpressSecondary = uniCoreColors.m2818getMagentaTransparent500d7_KjU();
            this.bgExpressSecondaryInverted = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgFreshPrimary = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgFreshPrimaryInverted = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgFreshSecondary = uniCoreColors.m2739getAzureTransparent500d7_KjU();
            this.bgFreshSecondaryInverted = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgGuaranteePrimary = uniCoreColors.m2771getBrandCaseGuarantee600Transparent0d7_KjU();
            this.bgInstalmentPrimary = uniCoreColors.m2941getYellow3000d7_KjU();
            this.bgInstalmentSecondary = uniCoreColors.m2937getYellow2000d7_KjU();
            this.bgMarketingPrimary = uniCoreColors.m2912getViolet5000d7_KjU();
            this.bgMarketingPrimaryInverted = uniCoreColors.m2912getViolet5000d7_KjU();
            this.bgMarketingSecondary = uniCoreColors.m2918getVioletTransparent500d7_KjU();
            this.bgMarketingSecondaryInverted = uniCoreColors.m2916getVioletTransparent1000d7_KjU();
            this.bgMarketingSecondarySolid = uniCoreColors.m2911getViolet500d7_KjU();
            this.bgNegativePrimary = uniCoreColors.m2883getRed4500d7_KjU();
            this.bgNegativePrimaryInverted = uniCoreColors.m2883getRed4500d7_KjU();
            this.bgNegativeSecondary = uniCoreColors.m2889getRedTransparent500d7_KjU();
            this.bgNegativeSecondaryInverted = uniCoreColors.m2887getRedTransparent1000d7_KjU();
            this.bgOpaqueAccentSecondary = uniCoreColors.m2811getMagenta500d7_KjU();
            this.bgOpaqueActionSecondary = uniCoreColors.m2754getBlue500d7_KjU();
            this.bgOpaqueApparelSecondary = uniCoreColors.m2811getMagenta500d7_KjU();
            this.bgOpaqueEconomSecondary = uniCoreColors.m2853getOrange500d7_KjU();
            this.bgOpaqueFreshSecondary = uniCoreColors.m2731getAzure500d7_KjU();
            this.bgOpaqueMarketingSecondary = uniCoreColors.m2911getViolet500d7_KjU();
            this.bgOpaqueNegativeSecondary = uniCoreColors.m2879getRed250d7_KjU();
            this.bgOpaqueOzonSecondary = uniCoreColors.m2754getBlue500d7_KjU();
            this.bgOpaquePositiveSecondary = uniCoreColors.m2798getGreen500d7_KjU();
            this.bgOpaqueSecondary = uniCoreColors.m2754getBlue500d7_KjU();
            this.bgOpaqueWarningSecondary = uniCoreColors.m2939getYellow250d7_KjU();
            this.bgOverlap = uniCoreColors.m2859getOverlapLight0d7_KjU();
            this.bgOverlapInverted = uniCoreColors.m2858getOverlapDark0d7_KjU();
            this.bgOxford = uniCoreColors.m2776getBrandOzonTechOxfordBlue0d7_KjU();
            this.bgOzonPrimary = uniCoreColors.m2755getBlue5000d7_KjU();
            this.bgOzonSecondary = uniCoreColors.m2762getBlueTransparent500d7_KjU();
            this.bgPositivePrimary = uniCoreColors.m2796getGreen3500d7_KjU();
            this.bgPositivePrimaryInverted = uniCoreColors.m2796getGreen3500d7_KjU();
            this.bgPositiveSecondary = uniCoreColors.m2802getGreenTransparent500d7_KjU();
            this.bgPositiveSecondaryInverted = uniCoreColors.m2800getGreenTransparent1000d7_KjU();
            this.bgPremiumPrimary = uniCoreColors.m2831getNeutral250d7_KjU();
            this.bgPremiumPrimaryInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgPremiumSecondary = uniCoreColors.m2840getNeutralTransparent250d7_KjU();
            this.bgPremiumSecondaryInverted = uniCoreColors.m2921getWhiteTransparent1000d7_KjU();
            this.bgPrimary = uniCoreColors.m2834getNeutral500d7_KjU();
            this.bgPrimaryInverted = uniCoreColors.m2791getGray8000d7_KjU();
            this.bgPrussian = uniCoreColors.m2777getBrandOzonTechPrussianBlue0d7_KjU();
            this.bgSbp = uniCoreColors.m2772getBrandCaseSbpPrimary0d7_KjU();
            this.bgSecondary = uniCoreColors.m2850getNeutralTransparentLight250d7_KjU();
            this.bgSecondaryDynamic = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgSecondaryDynamicInverted = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgSecondaryInverted = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.bgSelect = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.bgSelectInverted = uniCoreColors.m2784getBrandSelectSelectGray1000d7_KjU();
            this.bgTabbarPrimary = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgTech = uniCoreColors.m2778getBrandOzonTechTechGreen0d7_KjU();
            this.bgUltraPrimary = uniCoreColors.m2774getBrandCaseUltra0d7_KjU();
            this.bgWarningPrimary = uniCoreColors.m2940getYellow2500d7_KjU();
            this.bgWarningPrimaryInverted = uniCoreColors.m2940getYellow2500d7_KjU();
            this.bgWarningSecondary = uniCoreColors.m2947getYellowTransparent500d7_KjU();
            this.bgWarningSecondaryInverted = uniCoreColors.m2945getYellowTransparent1000d7_KjU();
            this.graphicAccentPrimary = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.graphicAccentPrimaryInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.graphicActionPrimary = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicActionPrimaryInverted = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicActiveAccentPrimary = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.graphicActiveAccentPrimaryInverted = uniCoreColors.m2808getMagenta3500d7_KjU();
            this.graphicActiveActionPrimary = uniCoreColors.m2756getBlue6000d7_KjU();
            this.graphicActiveActionPrimaryInverted = uniCoreColors.m2751getBlue3500d7_KjU();
            this.graphicActiveApparel = uniCoreColors.m2865getPink5000d7_KjU();
            this.graphicActiveApparelInverted = uniCoreColors.m2862getPink2500d7_KjU();
            this.graphicActiveBestprice = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.graphicActiveBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.graphicActiveEconom = uniCoreColors.m2852getOrange4000d7_KjU();
            this.graphicActiveExpress = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.graphicActiveExpressInverted = uniCoreColors.m2808getMagenta3500d7_KjU();
            this.graphicActiveFresh = uniCoreColors.m2729getAzure4000d7_KjU();
            this.graphicActiveFreshInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicActiveMarketing = uniCoreColors.m2913getViolet6000d7_KjU();
            this.graphicActiveMarketingInverted = uniCoreColors.m2909getViolet4000d7_KjU();
            this.graphicActiveNegativePrimary = uniCoreColors.m2884getRed5000d7_KjU();
            this.graphicActiveNegativePrimaryInverted = uniCoreColors.m2880getRed3500d7_KjU();
            this.graphicActiveOzon = uniCoreColors.m2756getBlue6000d7_KjU();
            this.graphicActivePositivePrimary = uniCoreColors.m2797getGreen4000d7_KjU();
            this.graphicActivePositivePrimaryInverted = uniCoreColors.m2795getGreen3000d7_KjU();
            this.graphicActivePremium = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicActivePremiumBlue = uniCoreColors.m2758getBlue8000d7_KjU();
            this.graphicActivePremiumInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.graphicActiveRating = uniCoreColors.m2938getYellow2250d7_KjU();
            this.graphicActiveRatingInverted = uniCoreColors.m2940getYellow2500d7_KjU();
            this.graphicActiveWarningPrimary = uniCoreColors.m2942getYellow3500d7_KjU();
            this.graphicActiveWarningPrimaryInverted = uniCoreColors.m2936getYellow1500d7_KjU();
            this.graphicApparel = uniCoreColors.m2864getPink4000d7_KjU();
            this.graphicApparelInverted = uniCoreColors.m2863getPink3000d7_KjU();
            this.graphicBestprice = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.graphicBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.graphicDisabled = uniCoreColors.m2848getNeutralTransparentDark500d7_KjU();
            this.graphicDisabledInverted = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.graphicEconom = uniCoreColors.m2851getOrange3500d7_KjU();
            this.graphicExpress = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.graphicExpressInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.graphicFintechGracePrimary = uniCoreColors.m2806getLime3500d7_KjU();
            this.graphicFintechGraceSecondary = uniCoreColors.m2804getLime2000d7_KjU();
            this.graphicFresh = uniCoreColors.m2728getAzure3500d7_KjU();
            this.graphicFreshInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicGuarantee = uniCoreColors.m2769getBrandCaseGuarantee5000d7_KjU();
            this.graphicKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicKeyInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicMarketing = uniCoreColors.m2912getViolet5000d7_KjU();
            this.graphicMarketingInverted = uniCoreColors.m2909getViolet4000d7_KjU();
            this.graphicNegativePrimary = uniCoreColors.m2883getRed4500d7_KjU();
            this.graphicNegativePrimaryInverted = uniCoreColors.m2881getRed3750d7_KjU();
            this.graphicNeutral = uniCoreColors.m2845getNeutralTransparentDark1000d7_KjU();
            this.graphicNeutralInverted = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.graphicOverlapPrimary = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicOverlapPrimaryDynamic = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicOxford = uniCoreColors.m2776getBrandOzonTechOxfordBlue0d7_KjU();
            this.graphicOzon = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicPositivePrimary = uniCoreColors.m2796getGreen3500d7_KjU();
            this.graphicPositivePrimaryInverted = uniCoreColors.m2795getGreen3000d7_KjU();
            this.graphicPositiveSecondary = uniCoreColors.m2802getGreenTransparent500d7_KjU();
            this.graphicPremium = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicPremiumBlue = uniCoreColors.m2758getBlue8000d7_KjU();
            this.graphicPremiumInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.graphicPrimary = uniCoreColors.m2828getNeutral10000d7_KjU();
            this.graphicPrimaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicPrimaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicPrimaryInverted = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicQuaternary = uniCoreColors.m2841getNeutralTransparent2500d7_KjU();
            this.graphicRating = uniCoreColors.m2941getYellow3000d7_KjU();
            this.graphicRatingInverted = uniCoreColors.m2941getYellow3000d7_KjU();
            this.graphicSecondary = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.graphicSecondaryDynamic = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicSecondaryDynamicInverted = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicSecondaryInverted = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicStrokeSticky = uniCoreColors.m2827getNeutral1000d7_KjU();
            this.graphicTabbarIconPrimary = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicTabbarIconSecondary = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicTech = uniCoreColors.m2778getBrandOzonTechTechGreen0d7_KjU();
            this.graphicTertiary = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicTertiaryDynamic = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicTertiaryInverted = uniCoreColors.m2926getWhiteTransparent3000d7_KjU();
            this.graphicUltraPrimary = uniCoreColors.m2774getBrandCaseUltra0d7_KjU();
            this.graphicWarningPrimary = uniCoreColors.m2941getYellow3000d7_KjU();
            this.graphicWarningPrimaryInverted = uniCoreColors.m2937getYellow2000d7_KjU();
            this.layerActiveFloor0 = uniCoreColors.m2827getNeutral1000d7_KjU();
            this.layerActiveFloor1 = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.layerActiveFloor1Inverted = uniCoreColors.m2838getNeutral9000d7_KjU();
            this.layerActiveFloor2 = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.layerActiveFloor2Inverted = uniCoreColors.m2837getNeutral8000d7_KjU();
            this.layerActiveFloor3 = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.layerActiveFloor3Inverted = uniCoreColors.m2836getNeutral7000d7_KjU();
            this.layerActiveSurface = uniCoreColors.m2849getNeutralTransparentLight1000d7_KjU();
            this.layerActiveSurfaceInverted = uniCoreColors.m2924getWhiteTransparent2000d7_KjU();
            this.layerFloor0 = uniCoreColors.m2789getGray1250d7_KjU();
            this.layerFloor0Inverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerFloor1 = uniCoreColors.m2919getWhite0d7_KjU();
            this.layerFloor1Inverted = uniCoreColors.m2792getGray9000d7_KjU();
            this.layerFloor2 = uniCoreColors.m2919getWhite0d7_KjU();
            this.layerFloor2Inverted = uniCoreColors.m2791getGray8000d7_KjU();
            this.layerFloor3 = uniCoreColors.m2919getWhite0d7_KjU();
            this.layerFloor3Inverted = uniCoreColors.m2790getGray7000d7_KjU();
            this.layerOverlayDimming = uniCoreColors.m2794getGrayTransparent3000d7_KjU();
            this.layerOverlayDimmingInverted = uniCoreColors.m2747getBlackTransparent6000d7_KjU();
            this.layerOverlayParanja = uniCoreColors.m2850getNeutralTransparentLight250d7_KjU();
            this.layerOverlayParanjaInverted = uniCoreColors.m2793getGrayTransparent1000d7_KjU();
            this.layerSurface = uniCoreColors.m2850getNeutralTransparentLight250d7_KjU();
            this.layerSurfaceInverted = uniCoreColors.m2921getWhiteTransparent1000d7_KjU();
            this.textAccent = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.textAccentInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textAction = uniCoreColors.m2755getBlue5000d7_KjU();
            this.textActionInverted = uniCoreColors.m2752getBlue4000d7_KjU();
            this.textActiveAccent = uniCoreColors.m2813getMagenta6000d7_KjU();
            this.textActiveAccentInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textActiveAction = uniCoreColors.m2757getBlue7000d7_KjU();
            this.textActiveActionInverted = uniCoreColors.m2751getBlue3500d7_KjU();
            this.textActiveApparel = uniCoreColors.m2866getPink6000d7_KjU();
            this.textActiveApparelInverted = uniCoreColors.m2864getPink4000d7_KjU();
            this.textActiveBestprice = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.textActiveBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.textActiveExpress = uniCoreColors.m2885getRed6000d7_KjU();
            this.textActiveExpressInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textActiveFresh = uniCoreColors.m2730getAzure4500d7_KjU();
            this.textActiveFreshInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActiveMarketing = uniCoreColors.m2914getViolet7000d7_KjU();
            this.textActiveMarketingInverted = uniCoreColors.m2909getViolet4000d7_KjU();
            this.textActiveNegative = uniCoreColors.m2884getRed5000d7_KjU();
            this.textActiveNegativeInverted = uniCoreColors.m2882getRed4000d7_KjU();
            this.textActiveOzon = uniCoreColors.m2757getBlue7000d7_KjU();
            this.textActivePositive = uniCoreColors.m2797getGreen4000d7_KjU();
            this.textActivePositiveInverted = uniCoreColors.m2795getGreen3000d7_KjU();
            this.textActivePremium = uniCoreColors.m2740getBlack0d7_KjU();
            this.textActivePremiumInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textActiveWarning = uniCoreColors.m2943getYellow4000d7_KjU();
            this.textActiveWarningInverted = uniCoreColors.m2937getYellow2000d7_KjU();
            this.textApparel = uniCoreColors.m2865getPink5000d7_KjU();
            this.textApparelInverted = uniCoreColors.m2863getPink3000d7_KjU();
            this.textBestprice = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.textBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.textDiscountUnavialable = uniCoreColors.m2807getMagenta2500d7_KjU();
            this.textEconom = uniCoreColors.m2854getOrange5000d7_KjU();
            this.textExpress = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.textExpressInverted = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textFresh = uniCoreColors.m2729getAzure4000d7_KjU();
            this.textFreshInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textGuarantee = uniCoreColors.m2769getBrandCaseGuarantee5000d7_KjU();
            this.textMarketing = uniCoreColors.m2912getViolet5000d7_KjU();
            this.textMarketingInverted = uniCoreColors.m2909getViolet4000d7_KjU();
            this.textNegative = uniCoreColors.m2883getRed4500d7_KjU();
            this.textNegativeInverted = uniCoreColors.m2881getRed3750d7_KjU();
            this.textOriginalprice = uniCoreColors.m2830getNeutral2000d7_KjU();
            this.textOriginalpriceAvailable = uniCoreColors.m2832getNeutral3500d7_KjU();
            this.textOxford = uniCoreColors.m2776getBrandOzonTechOxfordBlue0d7_KjU();
            this.textOzon = uniCoreColors.m2755getBlue5000d7_KjU();
            this.textPositive = uniCoreColors.m2796getGreen3500d7_KjU();
            this.textPositiveInverted = uniCoreColors.m2795getGreen3000d7_KjU();
            this.textPremium = uniCoreColors.m2740getBlack0d7_KjU();
            this.textPremiumInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textPrimary = uniCoreColors.m2740getBlack0d7_KjU();
            this.textPrimaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.textPrimaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.textPrimaryInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textSecondary = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.textSecondaryDynamic = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textSecondaryDynamicInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textSecondaryInverted = uniCoreColors.m2932getWhiteTransparent6000d7_KjU();
            this.textTech = uniCoreColors.m2778getBrandOzonTechTechGreen0d7_KjU();
            this.textTertiary = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.textTertiaryInverted = uniCoreColors.m2928getWhiteTransparent4000d7_KjU();
            this.textUltra = uniCoreColors.m2774getBrandCaseUltra0d7_KjU();
            this.textWarning = uniCoreColors.m2941getYellow3000d7_KjU();
            this.textWarningInverted = uniCoreColors.m2937getYellow2000d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentOnLight-0d7_KjU, reason: from getter */
        public long getBgAccentOnLight() {
            return this.bgAccentOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimary-0d7_KjU, reason: from getter */
        public long getBgAccentPrimary() {
            return this.bgAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgAccentPrimaryInverted() {
            return this.bgAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondary-0d7_KjU, reason: from getter */
        public long getBgAccentSecondary() {
            return this.bgAccentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgAccentSecondaryInverted() {
            return this.bgAccentSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionPrimary-0d7_KjU, reason: from getter */
        public long getBgActionPrimary() {
            return this.bgActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActionPrimaryInverted() {
            return this.bgActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionSecondary-0d7_KjU, reason: from getter */
        public long getBgActionSecondary() {
            return this.bgActionSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActionSecondaryInverted() {
            return this.bgActionSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionSecondarySolid-0d7_KjU, reason: from getter */
        public long getBgActionSecondarySolid() {
            return this.bgActionSecondarySolid;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveAccentPrimary() {
            return this.bgActiveAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveAccentPrimaryInverted() {
            return this.bgActiveAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveAccentSecondary() {
            return this.bgActiveAccentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveAccentSecondaryInverted() {
            return this.bgActiveAccentSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveActionPrimary() {
            return this.bgActiveActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveActionPrimaryInverted() {
            return this.bgActiveActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveActionSecondary() {
            return this.bgActiveActionSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveActionSecondaryInverted() {
            return this.bgActiveActionSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveApparelPrimary() {
            return this.bgActiveApparelPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveApparelPrimaryInverted() {
            return this.bgActiveApparelPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveApparelSecondary() {
            return this.bgActiveApparelSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveApparelSecondaryInverted() {
            return this.bgActiveApparelSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAquaPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveAquaPrimary() {
            return this.bgActiveAquaPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimary-0d7_KjU, reason: from getter */
        public long getBgActiveBestpricePrimary() {
            return this.bgActiveBestpricePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveBestpricePrimaryInverted() {
            return this.bgActiveBestpricePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveBestpriceSecondary() {
            return this.bgActiveBestpriceSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveBestpriceSecondaryInverted() {
            return this.bgActiveBestpriceSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveEconomPrimary() {
            return this.bgActiveEconomPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveEconomSecondary() {
            return this.bgActiveEconomSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveExpressPrimary() {
            return this.bgActiveExpressPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveExpressPrimaryInverted() {
            return this.bgActiveExpressPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveExpressSecondary() {
            return this.bgActiveExpressSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveExpressSecondaryInverted() {
            return this.bgActiveExpressSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveFreshPrimary() {
            return this.bgActiveFreshPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveFreshPrimaryInverted() {
            return this.bgActiveFreshPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveFreshSecondary() {
            return this.bgActiveFreshSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveFreshSecondaryInverted() {
            return this.bgActiveFreshSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingPrimary() {
            return this.bgActiveMarketingPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingPrimaryInverted() {
            return this.bgActiveMarketingPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingSecondary() {
            return this.bgActiveMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingSecondaryInverted() {
            return this.bgActiveMarketingSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativePrimary-0d7_KjU, reason: from getter */
        public long getBgActiveNegativePrimary() {
            return this.bgActiveNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveNegativePrimaryInverted() {
            return this.bgActiveNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveNegativeSecondary() {
            return this.bgActiveNegativeSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveNegativeSecondaryInverted() {
            return this.bgActiveNegativeSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveOzonPrimary() {
            return this.bgActiveOzonPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveOzonSecondary() {
            return this.bgActiveOzonSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositivePrimary-0d7_KjU, reason: from getter */
        public long getBgActivePositivePrimary() {
            return this.bgActivePositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePositivePrimaryInverted() {
            return this.bgActivePositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgActivePositiveSecondary() {
            return this.bgActivePositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePositiveSecondaryInverted() {
            return this.bgActivePositiveSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumPrimary-0d7_KjU, reason: from getter */
        public long getBgActivePremiumPrimary() {
            return this.bgActivePremiumPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePremiumPrimaryInverted() {
            return this.bgActivePremiumPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondary-0d7_KjU, reason: from getter */
        public long getBgActivePremiumSecondary() {
            return this.bgActivePremiumSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePremiumSecondaryInverted() {
            return this.bgActivePremiumSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimary-0d7_KjU, reason: from getter */
        public long getBgActivePrimary() {
            return this.bgActivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePrimaryInverted() {
            return this.bgActivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveSecondary() {
            return this.bgActiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveSecondaryInverted() {
            return this.bgActiveSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelect-0d7_KjU, reason: from getter */
        public long getBgActiveSelect() {
            return this.bgActiveSelect;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelectInverted-0d7_KjU, reason: from getter */
        public long getBgActiveSelectInverted() {
            return this.bgActiveSelectInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveWarningPrimary() {
            return this.bgActiveWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveWarningPrimaryInverted() {
            return this.bgActiveWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveWarningSecondary() {
            return this.bgActiveWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveWarningSecondaryInverted() {
            return this.bgActiveWarningSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPiggy-0d7_KjU, reason: from getter */
        public long getBgApparelPiggy() {
            return this.bgApparelPiggy;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimary-0d7_KjU, reason: from getter */
        public long getBgApparelPrimary() {
            return this.bgApparelPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgApparelPrimaryInverted() {
            return this.bgApparelPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondary-0d7_KjU, reason: from getter */
        public long getBgApparelSecondary() {
            return this.bgApparelSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgApparelSecondaryInverted() {
            return this.bgApparelSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAquaPrimary-0d7_KjU, reason: from getter */
        public long getBgAquaPrimary() {
            return this.bgAquaPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAttentionPrimary-0d7_KjU, reason: from getter */
        public long getBgAttentionPrimary() {
            return this.bgAttentionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimary-0d7_KjU, reason: from getter */
        public long getBgBestpricePrimary() {
            return this.bgBestpricePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgBestpricePrimaryInverted() {
            return this.bgBestpricePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondary-0d7_KjU, reason: from getter */
        public long getBgBestpriceSecondary() {
            return this.bgBestpriceSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgBestpriceSecondaryInverted() {
            return this.bgBestpriceSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControl-0d7_KjU, reason: from getter */
        public long getBgControl() {
            return this.bgControl;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControlInverted-0d7_KjU, reason: from getter */
        public long getBgControlInverted() {
            return this.bgControlInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkCerulean-0d7_KjU, reason: from getter */
        public long getBgDarkCerulean() {
            return this.bgDarkCerulean;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkKey-0d7_KjU, reason: from getter */
        public long getBgDarkKey() {
            return this.bgDarkKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDoubtfullPrimary-0d7_KjU, reason: from getter */
        public long getBgDoubtfullPrimary() {
            return this.bgDoubtfullPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomPrimary-0d7_KjU, reason: from getter */
        public long getBgEconomPrimary() {
            return this.bgEconomPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomSecondary-0d7_KjU, reason: from getter */
        public long getBgEconomSecondary() {
            return this.bgEconomSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimary-0d7_KjU, reason: from getter */
        public long getBgExpressPrimary() {
            return this.bgExpressPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgExpressPrimaryInverted() {
            return this.bgExpressPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondary-0d7_KjU, reason: from getter */
        public long getBgExpressSecondary() {
            return this.bgExpressSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgExpressSecondaryInverted() {
            return this.bgExpressSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimary-0d7_KjU, reason: from getter */
        public long getBgFreshPrimary() {
            return this.bgFreshPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgFreshPrimaryInverted() {
            return this.bgFreshPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondary-0d7_KjU, reason: from getter */
        public long getBgFreshSecondary() {
            return this.bgFreshSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgFreshSecondaryInverted() {
            return this.bgFreshSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgGuaranteePrimary-0d7_KjU, reason: from getter */
        public long getBgGuaranteePrimary() {
            return this.bgGuaranteePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentPrimary-0d7_KjU, reason: from getter */
        public long getBgInstalmentPrimary() {
            return this.bgInstalmentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentSecondary-0d7_KjU, reason: from getter */
        public long getBgInstalmentSecondary() {
            return this.bgInstalmentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgLightKey-0d7_KjU, reason: from getter */
        public long getBgLightKey() {
            return this.bgLightKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingOnLight-0d7_KjU, reason: from getter */
        public long getBgMarketingOnLight() {
            return this.bgMarketingOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimary-0d7_KjU, reason: from getter */
        public long getBgMarketingPrimary() {
            return this.bgMarketingPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgMarketingPrimaryInverted() {
            return this.bgMarketingPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgMarketingSecondary() {
            return this.bgMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgMarketingSecondaryInverted() {
            return this.bgMarketingSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondarySolid-0d7_KjU, reason: from getter */
        public long getBgMarketingSecondarySolid() {
            return this.bgMarketingSecondarySolid;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimary-0d7_KjU, reason: from getter */
        public long getBgNegativePrimary() {
            return this.bgNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgNegativePrimaryInverted() {
            return this.bgNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondary-0d7_KjU, reason: from getter */
        public long getBgNegativeSecondary() {
            return this.bgNegativeSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgNegativeSecondaryInverted() {
            return this.bgNegativeSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueAccentSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueAccentSecondary() {
            return this.bgOpaqueAccentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueActionSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueActionSecondary() {
            return this.bgOpaqueActionSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueApparelSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueApparelSecondary() {
            return this.bgOpaqueApparelSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueEconomSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueEconomSecondary() {
            return this.bgOpaqueEconomSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueFreshSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueFreshSecondary() {
            return this.bgOpaqueFreshSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueMarketingSecondary() {
            return this.bgOpaqueMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueNegativeSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueNegativeSecondary() {
            return this.bgOpaqueNegativeSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueOzonSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueOzonSecondary() {
            return this.bgOpaqueOzonSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaquePositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaquePositiveSecondary() {
            return this.bgOpaquePositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueSecondary() {
            return this.bgOpaqueSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueWarningSecondary() {
            return this.bgOpaqueWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlap-0d7_KjU, reason: from getter */
        public long getBgOverlap() {
            return this.bgOverlap;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlapInverted-0d7_KjU, reason: from getter */
        public long getBgOverlapInverted() {
            return this.bgOverlapInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOxford-0d7_KjU, reason: from getter */
        public long getBgOxford() {
            return this.bgOxford;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonPrimary-0d7_KjU, reason: from getter */
        public long getBgOzonPrimary() {
            return this.bgOzonPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonSecondary-0d7_KjU, reason: from getter */
        public long getBgOzonSecondary() {
            return this.bgOzonSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveOnLight-0d7_KjU, reason: from getter */
        public long getBgPositiveOnLight() {
            return this.bgPositiveOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimary-0d7_KjU, reason: from getter */
        public long getBgPositivePrimary() {
            return this.bgPositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgPositivePrimaryInverted() {
            return this.bgPositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgPositiveSecondary() {
            return this.bgPositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgPositiveSecondaryInverted() {
            return this.bgPositiveSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumPrimary-0d7_KjU, reason: from getter */
        public long getBgPremiumPrimary() {
            return this.bgPremiumPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgPremiumPrimaryInverted() {
            return this.bgPremiumPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondary-0d7_KjU, reason: from getter */
        public long getBgPremiumSecondary() {
            return this.bgPremiumSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgPremiumSecondaryInverted() {
            return this.bgPremiumSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimary-0d7_KjU, reason: from getter */
        public long getBgPrimary() {
            return this.bgPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgPrimaryInverted() {
            return this.bgPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrussian-0d7_KjU, reason: from getter */
        public long getBgPrussian() {
            return this.bgPrussian;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSbp-0d7_KjU, reason: from getter */
        public long getBgSbp() {
            return this.bgSbp;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondary-0d7_KjU, reason: from getter */
        public long getBgSecondary() {
            return this.bgSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryDynamic-0d7_KjU, reason: from getter */
        public long getBgSecondaryDynamic() {
            return this.bgSecondaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getBgSecondaryDynamicInverted() {
            return this.bgSecondaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgSecondaryInverted() {
            return this.bgSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelect-0d7_KjU, reason: from getter */
        public long getBgSelect() {
            return this.bgSelect;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelectInverted-0d7_KjU, reason: from getter */
        public long getBgSelectInverted() {
            return this.bgSelectInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTabbarPrimary-0d7_KjU, reason: from getter */
        public long getBgTabbarPrimary() {
            return this.bgTabbarPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTech-0d7_KjU, reason: from getter */
        public long getBgTech() {
            return this.bgTech;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgUltraPrimary-0d7_KjU, reason: from getter */
        public long getBgUltraPrimary() {
            return this.bgUltraPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningOnLight-0d7_KjU, reason: from getter */
        public long getBgWarningOnLight() {
            return this.bgWarningOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimary-0d7_KjU, reason: from getter */
        public long getBgWarningPrimary() {
            return this.bgWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgWarningPrimaryInverted() {
            return this.bgWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgWarningSecondary() {
            return this.bgWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgWarningSecondaryInverted() {
            return this.bgWarningSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey100-0d7_KjU, reason: from getter */
        public long getClearDarkKey100() {
            return this.clearDarkKey100;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey200-0d7_KjU, reason: from getter */
        public long getClearDarkKey200() {
            return this.clearDarkKey200;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey300-0d7_KjU, reason: from getter */
        public long getClearDarkKey300() {
            return this.clearDarkKey300;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey400-0d7_KjU, reason: from getter */
        public long getClearDarkKey400() {
            return this.clearDarkKey400;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey500-0d7_KjU, reason: from getter */
        public long getClearDarkKey500() {
            return this.clearDarkKey500;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey600-0d7_KjU, reason: from getter */
        public long getClearDarkKey600() {
            return this.clearDarkKey600;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey700-0d7_KjU, reason: from getter */
        public long getClearDarkKey700() {
            return this.clearDarkKey700;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey800-0d7_KjU, reason: from getter */
        public long getClearDarkKey800() {
            return this.clearDarkKey800;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey0-0d7_KjU, reason: from getter */
        public long getClearLightKey0() {
            return this.clearLightKey0;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey100-0d7_KjU, reason: from getter */
        public long getClearLightKey100() {
            return this.clearLightKey100;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey200-0d7_KjU, reason: from getter */
        public long getClearLightKey200() {
            return this.clearLightKey200;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey300-0d7_KjU, reason: from getter */
        public long getClearLightKey300() {
            return this.clearLightKey300;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey400-0d7_KjU, reason: from getter */
        public long getClearLightKey400() {
            return this.clearLightKey400;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey500-0d7_KjU, reason: from getter */
        public long getClearLightKey500() {
            return this.clearLightKey500;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey600-0d7_KjU, reason: from getter */
        public long getClearLightKey600() {
            return this.clearLightKey600;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey700-0d7_KjU, reason: from getter */
        public long getClearLightKey700() {
            return this.clearLightKey700;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey800-0d7_KjU, reason: from getter */
        public long getClearLightKey800() {
            return this.clearLightKey800;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getDetectorColorMine-0d7_KjU, reason: from getter */
        public long getDetectorColorMine() {
            return this.detectorColorMine;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentOnLight-0d7_KjU, reason: from getter */
        public long getGraphicAccentOnLight() {
            return this.graphicAccentOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimary-0d7_KjU, reason: from getter */
        public long getGraphicAccentPrimary() {
            return this.graphicAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicAccentPrimaryInverted() {
            return this.graphicAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionOnDark-0d7_KjU, reason: from getter */
        public long getGraphicActionOnDark() {
            return this.graphicActionOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionOnLight-0d7_KjU, reason: from getter */
        public long getGraphicActionOnLight() {
            return this.graphicActionOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActionPrimary() {
            return this.graphicActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActionPrimaryInverted() {
            return this.graphicActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveAccentPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveAccentPrimary() {
            return this.graphicActiveAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveAccentPrimaryInverted() {
            return this.graphicActiveAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveActionPrimary() {
            return this.graphicActiveActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveActionPrimaryInverted() {
            return this.graphicActiveActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveApparel-0d7_KjU, reason: from getter */
        public long getGraphicActiveApparel() {
            return this.graphicActiveApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveApparelInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveApparelInverted() {
            return this.graphicActiveApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestprice-0d7_KjU, reason: from getter */
        public long getGraphicActiveBestprice() {
            return this.graphicActiveBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestpriceInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveBestpriceInverted() {
            return this.graphicActiveBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveEconom-0d7_KjU, reason: from getter */
        public long getGraphicActiveEconom() {
            return this.graphicActiveEconom;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpress-0d7_KjU, reason: from getter */
        public long getGraphicActiveExpress() {
            return this.graphicActiveExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpressInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveExpressInverted() {
            return this.graphicActiveExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFresh-0d7_KjU, reason: from getter */
        public long getGraphicActiveFresh() {
            return this.graphicActiveFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFreshInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveFreshInverted() {
            return this.graphicActiveFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveMarketing-0d7_KjU, reason: from getter */
        public long getGraphicActiveMarketing() {
            return this.graphicActiveMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveMarketingInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveMarketingInverted() {
            return this.graphicActiveMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveNegativePrimary() {
            return this.graphicActiveNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveNegativePrimaryInverted() {
            return this.graphicActiveNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveOzon-0d7_KjU, reason: from getter */
        public long getGraphicActiveOzon() {
            return this.graphicActiveOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimary-0d7_KjU, reason: from getter */
        public long getGraphicActivePositivePrimary() {
            return this.graphicActivePositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActivePositivePrimaryInverted() {
            return this.graphicActivePositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremium-0d7_KjU, reason: from getter */
        public long getGraphicActivePremium() {
            return this.graphicActivePremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumBlue-0d7_KjU, reason: from getter */
        public long getGraphicActivePremiumBlue() {
            return this.graphicActivePremiumBlue;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumInverted-0d7_KjU, reason: from getter */
        public long getGraphicActivePremiumInverted() {
            return this.graphicActivePremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveRating-0d7_KjU, reason: from getter */
        public long getGraphicActiveRating() {
            return this.graphicActiveRating;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveRatingInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveRatingInverted() {
            return this.graphicActiveRatingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveWarningPrimary() {
            return this.graphicActiveWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveWarningPrimaryInverted() {
            return this.graphicActiveWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicApparel-0d7_KjU, reason: from getter */
        public long getGraphicApparel() {
            return this.graphicApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicApparelInverted-0d7_KjU, reason: from getter */
        public long getGraphicApparelInverted() {
            return this.graphicApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestprice-0d7_KjU, reason: from getter */
        public long getGraphicBestprice() {
            return this.graphicBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestpriceInverted-0d7_KjU, reason: from getter */
        public long getGraphicBestpriceInverted() {
            return this.graphicBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkKey-0d7_KjU, reason: from getter */
        public long getGraphicDarkKey() {
            return this.graphicDarkKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkerNeutralOnLight-0d7_KjU, reason: from getter */
        public long getGraphicDarkerNeutralOnLight() {
            return this.graphicDarkerNeutralOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabled-0d7_KjU, reason: from getter */
        public long getGraphicDisabled() {
            return this.graphicDisabled;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledInverted-0d7_KjU, reason: from getter */
        public long getGraphicDisabledInverted() {
            return this.graphicDisabledInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnDark-0d7_KjU, reason: from getter */
        public long getGraphicDisabledOnDark() {
            return this.graphicDisabledOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnLight-0d7_KjU, reason: from getter */
        public long getGraphicDisabledOnLight() {
            return this.graphicDisabledOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicEconom-0d7_KjU, reason: from getter */
        public long getGraphicEconom() {
            return this.graphicEconom;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpress-0d7_KjU, reason: from getter */
        public long getGraphicExpress() {
            return this.graphicExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressInverted-0d7_KjU, reason: from getter */
        public long getGraphicExpressInverted() {
            return this.graphicExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressOnDark-0d7_KjU, reason: from getter */
        public long getGraphicExpressOnDark() {
            return this.graphicExpressOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGracePrimary-0d7_KjU, reason: from getter */
        public long getGraphicFintechGracePrimary() {
            return this.graphicFintechGracePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGraceSecondary-0d7_KjU, reason: from getter */
        public long getGraphicFintechGraceSecondary() {
            return this.graphicFintechGraceSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFresh-0d7_KjU, reason: from getter */
        public long getGraphicFresh() {
            return this.graphicFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshInverted-0d7_KjU, reason: from getter */
        public long getGraphicFreshInverted() {
            return this.graphicFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshOnDark-0d7_KjU, reason: from getter */
        public long getGraphicFreshOnDark() {
            return this.graphicFreshOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicGuarantee-0d7_KjU, reason: from getter */
        public long getGraphicGuarantee() {
            return this.graphicGuarantee;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKey-0d7_KjU, reason: from getter */
        public long getGraphicKey() {
            return this.graphicKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKeyInverted-0d7_KjU, reason: from getter */
        public long getGraphicKeyInverted() {
            return this.graphicKeyInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicLightKey-0d7_KjU, reason: from getter */
        public long getGraphicLightKey() {
            return this.graphicLightKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketing-0d7_KjU, reason: from getter */
        public long getGraphicMarketing() {
            return this.graphicMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingInverted-0d7_KjU, reason: from getter */
        public long getGraphicMarketingInverted() {
            return this.graphicMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnDark-0d7_KjU, reason: from getter */
        public long getGraphicMarketingOnDark() {
            return this.graphicMarketingOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnLight-0d7_KjU, reason: from getter */
        public long getGraphicMarketingOnLight() {
            return this.graphicMarketingOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativeOnDark-0d7_KjU, reason: from getter */
        public long getGraphicNegativeOnDark() {
            return this.graphicNegativeOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimary-0d7_KjU, reason: from getter */
        public long getGraphicNegativePrimary() {
            return this.graphicNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicNegativePrimaryInverted() {
            return this.graphicNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutral-0d7_KjU, reason: from getter */
        public long getGraphicNeutral() {
            return this.graphicNeutral;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralInverted-0d7_KjU, reason: from getter */
        public long getGraphicNeutralInverted() {
            return this.graphicNeutralInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnDark-0d7_KjU, reason: from getter */
        public long getGraphicNeutralOnDark() {
            return this.graphicNeutralOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnLight-0d7_KjU, reason: from getter */
        public long getGraphicNeutralOnLight() {
            return this.graphicNeutralOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOverlapPrimary-0d7_KjU, reason: from getter */
        public long getGraphicOverlapPrimary() {
            return this.graphicOverlapPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOverlapPrimaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicOverlapPrimaryDynamic() {
            return this.graphicOverlapPrimaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOxford-0d7_KjU, reason: from getter */
        public long getGraphicOxford() {
            return this.graphicOxford;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOzon-0d7_KjU, reason: from getter */
        public long getGraphicOzon() {
            return this.graphicOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositiveOnDark-0d7_KjU, reason: from getter */
        public long getGraphicPositiveOnDark() {
            return this.graphicPositiveOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimary-0d7_KjU, reason: from getter */
        public long getGraphicPositivePrimary() {
            return this.graphicPositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicPositivePrimaryInverted() {
            return this.graphicPositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicPositivePrimaryOnLight() {
            return this.graphicPositivePrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositiveSecondary-0d7_KjU, reason: from getter */
        public long getGraphicPositiveSecondary() {
            return this.graphicPositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremium-0d7_KjU, reason: from getter */
        public long getGraphicPremium() {
            return this.graphicPremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumBlue-0d7_KjU, reason: from getter */
        public long getGraphicPremiumBlue() {
            return this.graphicPremiumBlue;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumInverted-0d7_KjU, reason: from getter */
        public long getGraphicPremiumInverted() {
            return this.graphicPremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimary-0d7_KjU, reason: from getter */
        public long getGraphicPrimary() {
            return this.graphicPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryDynamic() {
            return this.graphicPrimaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryDynamicInverted() {
            return this.graphicPrimaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryInverted() {
            return this.graphicPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnDark-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryOnDark() {
            return this.graphicPrimaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryOnLight() {
            return this.graphicPrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicQuaternary-0d7_KjU, reason: from getter */
        public long getGraphicQuaternary() {
            return this.graphicQuaternary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicRating-0d7_KjU, reason: from getter */
        public long getGraphicRating() {
            return this.graphicRating;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicRatingInverted-0d7_KjU, reason: from getter */
        public long getGraphicRatingInverted() {
            return this.graphicRatingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondary-0d7_KjU, reason: from getter */
        public long getGraphicSecondary() {
            return this.graphicSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryDynamic() {
            return this.graphicSecondaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryDynamicInverted() {
            return this.graphicSecondaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryInverted() {
            return this.graphicSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnDark-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryOnDark() {
            return this.graphicSecondaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryOnLight() {
            return this.graphicSecondaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSolidNeutral-0d7_KjU, reason: from getter */
        public long getGraphicSolidNeutral() {
            return this.graphicSolidNeutral;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicStrokeSticky-0d7_KjU, reason: from getter */
        public long getGraphicStrokeSticky() {
            return this.graphicStrokeSticky;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconPrimary-0d7_KjU, reason: from getter */
        public long getGraphicTabbarIconPrimary() {
            return this.graphicTabbarIconPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconSecondary-0d7_KjU, reason: from getter */
        public long getGraphicTabbarIconSecondary() {
            return this.graphicTabbarIconSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTech-0d7_KjU, reason: from getter */
        public long getGraphicTech() {
            return this.graphicTech;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiary-0d7_KjU, reason: from getter */
        public long getGraphicTertiary() {
            return this.graphicTertiary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryDynamic() {
            return this.graphicTertiaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryInverted() {
            return this.graphicTertiaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnDark-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryOnDark() {
            return this.graphicTertiaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryOnLight() {
            return this.graphicTertiaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicUltraPrimary-0d7_KjU, reason: from getter */
        public long getGraphicUltraPrimary() {
            return this.graphicUltraPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningOnDark-0d7_KjU, reason: from getter */
        public long getGraphicWarningOnDark() {
            return this.graphicWarningOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimary-0d7_KjU, reason: from getter */
        public long getGraphicWarningPrimary() {
            return this.graphicWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicWarningPrimaryInverted() {
            return this.graphicWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicWarningPrimaryOnLight() {
            return this.graphicWarningPrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor0-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor0() {
            return this.layerActiveFloor0;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor1-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor1() {
            return this.layerActiveFloor1;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor1Inverted-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor1Inverted() {
            return this.layerActiveFloor1Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor2() {
            return this.layerActiveFloor2;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2Inverted-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor2Inverted() {
            return this.layerActiveFloor2Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor3() {
            return this.layerActiveFloor3;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3Inverted-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor3Inverted() {
            return this.layerActiveFloor3Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurface-0d7_KjU, reason: from getter */
        public long getLayerActiveSurface() {
            return this.layerActiveSurface;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurfaceInverted-0d7_KjU, reason: from getter */
        public long getLayerActiveSurfaceInverted() {
            return this.layerActiveSurfaceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor0-0d7_KjU, reason: from getter */
        public long getLayerFloor0() {
            return this.layerFloor0;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor0Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor0Inverted() {
            return this.layerFloor0Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1-0d7_KjU, reason: from getter */
        public long getLayerFloor1() {
            return this.layerFloor1;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor1Inverted() {
            return this.layerFloor1Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1OnDark-0d7_KjU, reason: from getter */
        public long getLayerFloor1OnDark() {
            return this.layerFloor1OnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2-0d7_KjU, reason: from getter */
        public long getLayerFloor2() {
            return this.layerFloor2;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor2Inverted() {
            return this.layerFloor2Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3-0d7_KjU, reason: from getter */
        public long getLayerFloor3() {
            return this.layerFloor3;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor3Inverted() {
            return this.layerFloor3Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimming-0d7_KjU, reason: from getter */
        public long getLayerOverlayDimming() {
            return this.layerOverlayDimming;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimmingInverted-0d7_KjU, reason: from getter */
        public long getLayerOverlayDimmingInverted() {
            return this.layerOverlayDimmingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanja-0d7_KjU, reason: from getter */
        public long getLayerOverlayParanja() {
            return this.layerOverlayParanja;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanjaInverted-0d7_KjU, reason: from getter */
        public long getLayerOverlayParanjaInverted() {
            return this.layerOverlayParanjaInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurface-0d7_KjU, reason: from getter */
        public long getLayerSurface() {
            return this.layerSurface;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurfaceInverted-0d7_KjU, reason: from getter */
        public long getLayerSurfaceInverted() {
            return this.layerSurfaceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccent-0d7_KjU, reason: from getter */
        public long getTextAccent() {
            return this.textAccent;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentInverted-0d7_KjU, reason: from getter */
        public long getTextAccentInverted() {
            return this.textAccentInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentOnLight-0d7_KjU, reason: from getter */
        public long getTextAccentOnLight() {
            return this.textAccentOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAction-0d7_KjU, reason: from getter */
        public long getTextAction() {
            return this.textAction;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActionInverted-0d7_KjU, reason: from getter */
        public long getTextActionInverted() {
            return this.textActionInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActionOnDark-0d7_KjU, reason: from getter */
        public long getTextActionOnDark() {
            return this.textActionOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActionOnLight-0d7_KjU, reason: from getter */
        public long getTextActionOnLight() {
            return this.textActionOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAccent-0d7_KjU, reason: from getter */
        public long getTextActiveAccent() {
            return this.textActiveAccent;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAccentInverted-0d7_KjU, reason: from getter */
        public long getTextActiveAccentInverted() {
            return this.textActiveAccentInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAction-0d7_KjU, reason: from getter */
        public long getTextActiveAction() {
            return this.textActiveAction;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveActionInverted-0d7_KjU, reason: from getter */
        public long getTextActiveActionInverted() {
            return this.textActiveActionInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveApparel-0d7_KjU, reason: from getter */
        public long getTextActiveApparel() {
            return this.textActiveApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveApparelInverted-0d7_KjU, reason: from getter */
        public long getTextActiveApparelInverted() {
            return this.textActiveApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestprice-0d7_KjU, reason: from getter */
        public long getTextActiveBestprice() {
            return this.textActiveBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestpriceInverted-0d7_KjU, reason: from getter */
        public long getTextActiveBestpriceInverted() {
            return this.textActiveBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpress-0d7_KjU, reason: from getter */
        public long getTextActiveExpress() {
            return this.textActiveExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpressInverted-0d7_KjU, reason: from getter */
        public long getTextActiveExpressInverted() {
            return this.textActiveExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFresh-0d7_KjU, reason: from getter */
        public long getTextActiveFresh() {
            return this.textActiveFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFreshInverted-0d7_KjU, reason: from getter */
        public long getTextActiveFreshInverted() {
            return this.textActiveFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveMarketing-0d7_KjU, reason: from getter */
        public long getTextActiveMarketing() {
            return this.textActiveMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveMarketingInverted-0d7_KjU, reason: from getter */
        public long getTextActiveMarketingInverted() {
            return this.textActiveMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveNegative-0d7_KjU, reason: from getter */
        public long getTextActiveNegative() {
            return this.textActiveNegative;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveNegativeInverted-0d7_KjU, reason: from getter */
        public long getTextActiveNegativeInverted() {
            return this.textActiveNegativeInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveOzon-0d7_KjU, reason: from getter */
        public long getTextActiveOzon() {
            return this.textActiveOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePositive-0d7_KjU, reason: from getter */
        public long getTextActivePositive() {
            return this.textActivePositive;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePositiveInverted-0d7_KjU, reason: from getter */
        public long getTextActivePositiveInverted() {
            return this.textActivePositiveInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePremium-0d7_KjU, reason: from getter */
        public long getTextActivePremium() {
            return this.textActivePremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePremiumInverted-0d7_KjU, reason: from getter */
        public long getTextActivePremiumInverted() {
            return this.textActivePremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveWarning-0d7_KjU, reason: from getter */
        public long getTextActiveWarning() {
            return this.textActiveWarning;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveWarningInverted-0d7_KjU, reason: from getter */
        public long getTextActiveWarningInverted() {
            return this.textActiveWarningInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextApparel-0d7_KjU, reason: from getter */
        public long getTextApparel() {
            return this.textApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextApparelInverted-0d7_KjU, reason: from getter */
        public long getTextApparelInverted() {
            return this.textApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestprice-0d7_KjU, reason: from getter */
        public long getTextBestprice() {
            return this.textBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestpriceInverted-0d7_KjU, reason: from getter */
        public long getTextBestpriceInverted() {
            return this.textBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDarkKey-0d7_KjU, reason: from getter */
        public long getTextDarkKey() {
            return this.textDarkKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDiscountUnavialable-0d7_KjU, reason: from getter */
        public long getTextDiscountUnavialable() {
            return this.textDiscountUnavialable;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextEconom-0d7_KjU, reason: from getter */
        public long getTextEconom() {
            return this.textEconom;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpress-0d7_KjU, reason: from getter */
        public long getTextExpress() {
            return this.textExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressInverted-0d7_KjU, reason: from getter */
        public long getTextExpressInverted() {
            return this.textExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressOnDark-0d7_KjU, reason: from getter */
        public long getTextExpressOnDark() {
            return this.textExpressOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFresh-0d7_KjU, reason: from getter */
        public long getTextFresh() {
            return this.textFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshInverted-0d7_KjU, reason: from getter */
        public long getTextFreshInverted() {
            return this.textFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshOnDark-0d7_KjU, reason: from getter */
        public long getTextFreshOnDark() {
            return this.textFreshOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextGuarantee-0d7_KjU, reason: from getter */
        public long getTextGuarantee() {
            return this.textGuarantee;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextLightKey-0d7_KjU, reason: from getter */
        public long getTextLightKey() {
            return this.textLightKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketing-0d7_KjU, reason: from getter */
        public long getTextMarketing() {
            return this.textMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingInverted-0d7_KjU, reason: from getter */
        public long getTextMarketingInverted() {
            return this.textMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnDark-0d7_KjU, reason: from getter */
        public long getTextMarketingOnDark() {
            return this.textMarketingOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnLight-0d7_KjU, reason: from getter */
        public long getTextMarketingOnLight() {
            return this.textMarketingOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegative-0d7_KjU, reason: from getter */
        public long getTextNegative() {
            return this.textNegative;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeInverted-0d7_KjU, reason: from getter */
        public long getTextNegativeInverted() {
            return this.textNegativeInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeOnDark-0d7_KjU, reason: from getter */
        public long getTextNegativeOnDark() {
            return this.textNegativeOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalprice-0d7_KjU, reason: from getter */
        public long getTextOriginalprice() {
            return this.textOriginalprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalpriceAvailable-0d7_KjU, reason: from getter */
        public long getTextOriginalpriceAvailable() {
            return this.textOriginalpriceAvailable;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOxford-0d7_KjU, reason: from getter */
        public long getTextOxford() {
            return this.textOxford;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOzon-0d7_KjU, reason: from getter */
        public long getTextOzon() {
            return this.textOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositive-0d7_KjU, reason: from getter */
        public long getTextPositive() {
            return this.textPositive;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveInverted-0d7_KjU, reason: from getter */
        public long getTextPositiveInverted() {
            return this.textPositiveInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnDark-0d7_KjU, reason: from getter */
        public long getTextPositiveOnDark() {
            return this.textPositiveOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnLight-0d7_KjU, reason: from getter */
        public long getTextPositiveOnLight() {
            return this.textPositiveOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPremium-0d7_KjU, reason: from getter */
        public long getTextPremium() {
            return this.textPremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPremiumInverted-0d7_KjU, reason: from getter */
        public long getTextPremiumInverted() {
            return this.textPremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimary-0d7_KjU, reason: from getter */
        public long getTextPrimary() {
            return this.textPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryDynamic-0d7_KjU, reason: from getter */
        public long getTextPrimaryDynamic() {
            return this.textPrimaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getTextPrimaryDynamicInverted() {
            return this.textPrimaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryInverted-0d7_KjU, reason: from getter */
        public long getTextPrimaryInverted() {
            return this.textPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnDark-0d7_KjU, reason: from getter */
        public long getTextPrimaryOnDark() {
            return this.textPrimaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnLight-0d7_KjU, reason: from getter */
        public long getTextPrimaryOnLight() {
            return this.textPrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondary-0d7_KjU, reason: from getter */
        public long getTextSecondary() {
            return this.textSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryDynamic-0d7_KjU, reason: from getter */
        public long getTextSecondaryDynamic() {
            return this.textSecondaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getTextSecondaryDynamicInverted() {
            return this.textSecondaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryInverted-0d7_KjU, reason: from getter */
        public long getTextSecondaryInverted() {
            return this.textSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnDark-0d7_KjU, reason: from getter */
        public long getTextSecondaryOnDark() {
            return this.textSecondaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnLight-0d7_KjU, reason: from getter */
        public long getTextSecondaryOnLight() {
            return this.textSecondaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTech-0d7_KjU, reason: from getter */
        public long getTextTech() {
            return this.textTech;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiary-0d7_KjU, reason: from getter */
        public long getTextTertiary() {
            return this.textTertiary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryInverted-0d7_KjU, reason: from getter */
        public long getTextTertiaryInverted() {
            return this.textTertiaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnDark-0d7_KjU, reason: from getter */
        public long getTextTertiaryOnDark() {
            return this.textTertiaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnLight-0d7_KjU, reason: from getter */
        public long getTextTertiaryOnLight() {
            return this.textTertiaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextUltra-0d7_KjU, reason: from getter */
        public long getTextUltra() {
            return this.textUltra;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarning-0d7_KjU, reason: from getter */
        public long getTextWarning() {
            return this.textWarning;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningInverted-0d7_KjU, reason: from getter */
        public long getTextWarningInverted() {
            return this.textWarningInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningOnDark-0d7_KjU, reason: from getter */
        public long getTextWarningOnDark() {
            return this.textWarningOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: isDark, reason: from getter */
        public boolean getIsDark() {
            return this.isDark;
        }
    };

    @NotNull
    private static final UniColorScheme DefaultDarkUniColorScheme = new UniColorScheme() { // from class: ru.ozon.uni.core.compose.theme.DefaultUniColorSchemeKt$DefaultDarkUniColorScheme$1
        private final long bgAccentOnLight;
        private final long bgAccentPrimary;
        private final long bgAccentPrimaryInverted;
        private final long bgAccentSecondary;
        private final long bgAccentSecondaryInverted;
        private final long bgActionPrimary;
        private final long bgActionPrimaryInverted;
        private final long bgActionSecondary;
        private final long bgActionSecondaryInverted;
        private final long bgActionSecondarySolid;
        private final long bgActiveAccentPrimary;
        private final long bgActiveAccentPrimaryInverted;
        private final long bgActiveAccentSecondary;
        private final long bgActiveAccentSecondaryInverted;
        private final long bgActiveActionPrimary;
        private final long bgActiveActionPrimaryInverted;
        private final long bgActiveActionSecondary;
        private final long bgActiveActionSecondaryInverted;
        private final long bgActiveApparelPrimary;
        private final long bgActiveApparelPrimaryInverted;
        private final long bgActiveApparelSecondary;
        private final long bgActiveApparelSecondaryInverted;
        private final long bgActiveAquaPrimary;
        private final long bgActiveBestpricePrimary;
        private final long bgActiveBestpricePrimaryInverted;
        private final long bgActiveBestpriceSecondary;
        private final long bgActiveBestpriceSecondaryInverted;
        private final long bgActiveEconomPrimary;
        private final long bgActiveEconomSecondary;
        private final long bgActiveExpressPrimary;
        private final long bgActiveExpressPrimaryInverted;
        private final long bgActiveExpressSecondary;
        private final long bgActiveExpressSecondaryInverted;
        private final long bgActiveFreshPrimary;
        private final long bgActiveFreshPrimaryInverted;
        private final long bgActiveFreshSecondary;
        private final long bgActiveFreshSecondaryInverted;
        private final long bgActiveMarketingPrimary;
        private final long bgActiveMarketingPrimaryInverted;
        private final long bgActiveMarketingSecondary;
        private final long bgActiveMarketingSecondaryInverted;
        private final long bgActiveNegativePrimary;
        private final long bgActiveNegativePrimaryInverted;
        private final long bgActiveNegativeSecondary;
        private final long bgActiveNegativeSecondaryInverted;
        private final long bgActiveOzonPrimary;
        private final long bgActiveOzonSecondary;
        private final long bgActivePositivePrimary;
        private final long bgActivePositivePrimaryInverted;
        private final long bgActivePositiveSecondary;
        private final long bgActivePositiveSecondaryInverted;
        private final long bgActivePremiumPrimary;
        private final long bgActivePremiumPrimaryInverted;
        private final long bgActivePremiumSecondary;
        private final long bgActivePremiumSecondaryInverted;
        private final long bgActivePrimary;
        private final long bgActivePrimaryInverted;
        private final long bgActiveSecondary;
        private final long bgActiveSecondaryInverted;
        private final long bgActiveSelect;
        private final long bgActiveSelectInverted;
        private final long bgActiveWarningPrimary;
        private final long bgActiveWarningPrimaryInverted;
        private final long bgActiveWarningSecondary;
        private final long bgActiveWarningSecondaryInverted;
        private final long bgApparelPiggy;
        private final long bgApparelPrimary;
        private final long bgApparelPrimaryInverted;
        private final long bgApparelSecondary;
        private final long bgApparelSecondaryInverted;
        private final long bgAquaPrimary;
        private final long bgAttentionPrimary;
        private final long bgBestpricePrimary;
        private final long bgBestpricePrimaryInverted;
        private final long bgBestpriceSecondary;
        private final long bgBestpriceSecondaryInverted;
        private final long bgControl;
        private final long bgControlInverted;
        private final long bgDarkCerulean;
        private final long bgDarkKey;
        private final long bgDoubtfullPrimary;
        private final long bgEconomPrimary;
        private final long bgEconomSecondary;
        private final long bgExpressPrimary;
        private final long bgExpressPrimaryInverted;
        private final long bgExpressSecondary;
        private final long bgExpressSecondaryInverted;
        private final long bgFreshPrimary;
        private final long bgFreshPrimaryInverted;
        private final long bgFreshSecondary;
        private final long bgFreshSecondaryInverted;
        private final long bgGuaranteePrimary;
        private final long bgInstalmentPrimary;
        private final long bgInstalmentSecondary;
        private final long bgLightKey;
        private final long bgMarketingOnLight;
        private final long bgMarketingPrimary;
        private final long bgMarketingPrimaryInverted;
        private final long bgMarketingSecondary;
        private final long bgMarketingSecondaryInverted;
        private final long bgMarketingSecondarySolid;
        private final long bgNegativePrimary;
        private final long bgNegativePrimaryInverted;
        private final long bgNegativeSecondary;
        private final long bgNegativeSecondaryInverted;
        private final long bgOpaqueAccentSecondary;
        private final long bgOpaqueActionSecondary;
        private final long bgOpaqueApparelSecondary;
        private final long bgOpaqueEconomSecondary;
        private final long bgOpaqueFreshSecondary;
        private final long bgOpaqueMarketingSecondary;
        private final long bgOpaqueNegativeSecondary;
        private final long bgOpaqueOzonSecondary;
        private final long bgOpaquePositiveSecondary;
        private final long bgOpaqueSecondary;
        private final long bgOpaqueWarningSecondary;
        private final long bgOverlap;
        private final long bgOverlapInverted;
        private final long bgOxford;
        private final long bgOzonPrimary;
        private final long bgOzonSecondary;
        private final long bgPositiveOnLight;
        private final long bgPositivePrimary;
        private final long bgPositivePrimaryInverted;
        private final long bgPositiveSecondary;
        private final long bgPositiveSecondaryInverted;
        private final long bgPremiumPrimary;
        private final long bgPremiumPrimaryInverted;
        private final long bgPremiumSecondary;
        private final long bgPremiumSecondaryInverted;
        private final long bgPrimary;
        private final long bgPrimaryInverted;
        private final long bgPrussian;
        private final long bgSbp;
        private final long bgSecondary;
        private final long bgSecondaryDynamic;
        private final long bgSecondaryDynamicInverted;
        private final long bgSecondaryInverted;
        private final long bgSelect;
        private final long bgSelectInverted;
        private final long bgTabbarPrimary;
        private final long bgTech;
        private final long bgUltraPrimary;
        private final long bgWarningOnLight;
        private final long bgWarningPrimary;
        private final long bgWarningPrimaryInverted;
        private final long bgWarningSecondary;
        private final long bgWarningSecondaryInverted;
        private final long clearDarkKey100;
        private final long clearDarkKey200;
        private final long clearDarkKey300;
        private final long clearDarkKey400;
        private final long clearDarkKey500;
        private final long clearDarkKey600;
        private final long clearDarkKey700;
        private final long clearDarkKey800;
        private final long clearLightKey0;
        private final long clearLightKey100;
        private final long clearLightKey200;
        private final long clearLightKey300;
        private final long clearLightKey400;
        private final long clearLightKey500;
        private final long clearLightKey600;
        private final long clearLightKey700;
        private final long clearLightKey800;
        private final long detectorColorMine;
        private final long graphicAccentOnLight;
        private final long graphicAccentPrimary;
        private final long graphicAccentPrimaryInverted;
        private final long graphicActionOnDark;
        private final long graphicActionOnLight;
        private final long graphicActionPrimary;
        private final long graphicActionPrimaryInverted;
        private final long graphicActiveAccentPrimary;
        private final long graphicActiveAccentPrimaryInverted;
        private final long graphicActiveActionPrimary;
        private final long graphicActiveActionPrimaryInverted;
        private final long graphicActiveApparel;
        private final long graphicActiveApparelInverted;
        private final long graphicActiveBestprice;
        private final long graphicActiveBestpriceInverted;
        private final long graphicActiveEconom;
        private final long graphicActiveExpress;
        private final long graphicActiveExpressInverted;
        private final long graphicActiveFresh;
        private final long graphicActiveFreshInverted;
        private final long graphicActiveMarketing;
        private final long graphicActiveMarketingInverted;
        private final long graphicActiveNegativePrimary;
        private final long graphicActiveNegativePrimaryInverted;
        private final long graphicActiveOzon;
        private final long graphicActivePositivePrimary;
        private final long graphicActivePositivePrimaryInverted;
        private final long graphicActivePremium;
        private final long graphicActivePremiumBlue;
        private final long graphicActivePremiumInverted;
        private final long graphicActiveRating;
        private final long graphicActiveRatingInverted;
        private final long graphicActiveWarningPrimary;
        private final long graphicActiveWarningPrimaryInverted;
        private final long graphicApparel;
        private final long graphicApparelInverted;
        private final long graphicBestprice;
        private final long graphicBestpriceInverted;
        private final long graphicDarkKey;
        private final long graphicDarkerNeutralOnLight;
        private final long graphicDisabled;
        private final long graphicDisabledInverted;
        private final long graphicDisabledOnDark;
        private final long graphicDisabledOnLight;
        private final long graphicEconom;
        private final long graphicExpress;
        private final long graphicExpressInverted;
        private final long graphicExpressOnDark;
        private final long graphicFintechGracePrimary;
        private final long graphicFintechGraceSecondary;
        private final long graphicFresh;
        private final long graphicFreshInverted;
        private final long graphicFreshOnDark;
        private final long graphicGuarantee;
        private final long graphicKey;
        private final long graphicKeyInverted;
        private final long graphicLightKey;
        private final long graphicMarketing;
        private final long graphicMarketingInverted;
        private final long graphicMarketingOnDark;
        private final long graphicMarketingOnLight;
        private final long graphicNegativeOnDark;
        private final long graphicNegativePrimary;
        private final long graphicNegativePrimaryInverted;
        private final long graphicNeutral;
        private final long graphicNeutralInverted;
        private final long graphicNeutralOnDark;
        private final long graphicNeutralOnLight;
        private final long graphicOverlapPrimary;
        private final long graphicOverlapPrimaryDynamic;
        private final long graphicOxford;
        private final long graphicOzon;
        private final long graphicPositiveOnDark;
        private final long graphicPositivePrimary;
        private final long graphicPositivePrimaryInverted;
        private final long graphicPositivePrimaryOnLight;
        private final long graphicPositiveSecondary;
        private final long graphicPremium;
        private final long graphicPremiumBlue;
        private final long graphicPremiumInverted;
        private final long graphicPrimary;
        private final long graphicPrimaryDynamic;
        private final long graphicPrimaryDynamicInverted;
        private final long graphicPrimaryInverted;
        private final long graphicPrimaryOnDark;
        private final long graphicPrimaryOnLight;
        private final long graphicQuaternary;
        private final long graphicRating;
        private final long graphicRatingInverted;
        private final long graphicSecondary;
        private final long graphicSecondaryDynamic;
        private final long graphicSecondaryDynamicInverted;
        private final long graphicSecondaryInverted;
        private final long graphicSecondaryOnDark;
        private final long graphicSecondaryOnLight;
        private final long graphicSolidNeutral;
        private final long graphicStrokeSticky;
        private final long graphicTabbarIconPrimary;
        private final long graphicTabbarIconSecondary;
        private final long graphicTech;
        private final long graphicTertiary;
        private final long graphicTertiaryDynamic;
        private final long graphicTertiaryInverted;
        private final long graphicTertiaryOnDark;
        private final long graphicTertiaryOnLight;
        private final long graphicUltraPrimary;
        private final long graphicWarningOnDark;
        private final long graphicWarningPrimary;
        private final long graphicWarningPrimaryInverted;
        private final long graphicWarningPrimaryOnLight;
        private final boolean isDark = true;
        private final long layerActiveFloor0;
        private final long layerActiveFloor1;
        private final long layerActiveFloor1Inverted;
        private final long layerActiveFloor2;
        private final long layerActiveFloor2Inverted;
        private final long layerActiveFloor3;
        private final long layerActiveFloor3Inverted;
        private final long layerActiveSurface;
        private final long layerActiveSurfaceInverted;
        private final long layerFloor0;
        private final long layerFloor0Inverted;
        private final long layerFloor1;
        private final long layerFloor1Inverted;
        private final long layerFloor1OnDark;
        private final long layerFloor2;
        private final long layerFloor2Inverted;
        private final long layerFloor3;
        private final long layerFloor3Inverted;
        private final long layerOverlayDimming;
        private final long layerOverlayDimmingInverted;
        private final long layerOverlayParanja;
        private final long layerOverlayParanjaInverted;
        private final long layerSurface;
        private final long layerSurfaceInverted;
        private final long textAccent;
        private final long textAccentInverted;
        private final long textAccentOnLight;
        private final long textAction;
        private final long textActionInverted;
        private final long textActionOnDark;
        private final long textActionOnLight;
        private final long textActiveAccent;
        private final long textActiveAccentInverted;
        private final long textActiveAction;
        private final long textActiveActionInverted;
        private final long textActiveApparel;
        private final long textActiveApparelInverted;
        private final long textActiveBestprice;
        private final long textActiveBestpriceInverted;
        private final long textActiveExpress;
        private final long textActiveExpressInverted;
        private final long textActiveFresh;
        private final long textActiveFreshInverted;
        private final long textActiveMarketing;
        private final long textActiveMarketingInverted;
        private final long textActiveNegative;
        private final long textActiveNegativeInverted;
        private final long textActiveOzon;
        private final long textActivePositive;
        private final long textActivePositiveInverted;
        private final long textActivePremium;
        private final long textActivePremiumInverted;
        private final long textActiveWarning;
        private final long textActiveWarningInverted;
        private final long textApparel;
        private final long textApparelInverted;
        private final long textBestprice;
        private final long textBestpriceInverted;
        private final long textDarkKey;
        private final long textDiscountUnavialable;
        private final long textEconom;
        private final long textExpress;
        private final long textExpressInverted;
        private final long textExpressOnDark;
        private final long textFresh;
        private final long textFreshInverted;
        private final long textFreshOnDark;
        private final long textGuarantee;
        private final long textLightKey;
        private final long textMarketing;
        private final long textMarketingInverted;
        private final long textMarketingOnDark;
        private final long textMarketingOnLight;
        private final long textNegative;
        private final long textNegativeInverted;
        private final long textNegativeOnDark;
        private final long textOriginalprice;
        private final long textOriginalpriceAvailable;
        private final long textOxford;
        private final long textOzon;
        private final long textPositive;
        private final long textPositiveInverted;
        private final long textPositiveOnDark;
        private final long textPositiveOnLight;
        private final long textPremium;
        private final long textPremiumInverted;
        private final long textPrimary;
        private final long textPrimaryDynamic;
        private final long textPrimaryDynamicInverted;
        private final long textPrimaryInverted;
        private final long textPrimaryOnDark;
        private final long textPrimaryOnLight;
        private final long textSecondary;
        private final long textSecondaryDynamic;
        private final long textSecondaryDynamicInverted;
        private final long textSecondaryInverted;
        private final long textSecondaryOnDark;
        private final long textSecondaryOnLight;
        private final long textTech;
        private final long textTertiary;
        private final long textTertiaryInverted;
        private final long textTertiaryOnDark;
        private final long textTertiaryOnLight;
        private final long textUltra;
        private final long textWarning;
        private final long textWarningInverted;
        private final long textWarningOnDark;

        {
            UniCoreColors uniCoreColors = UniCoreColors.INSTANCE;
            this.detectorColorMine = uniCoreColors.m2803getGreenhighlight0d7_KjU();
            this.bgAccentOnLight = uniCoreColors.m2811getMagenta500d7_KjU();
            this.bgDarkKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgLightKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgMarketingOnLight = uniCoreColors.m2911getViolet500d7_KjU();
            this.bgPositiveOnLight = uniCoreColors.m2798getGreen500d7_KjU();
            this.bgWarningOnLight = uniCoreColors.m2939getYellow250d7_KjU();
            this.clearDarkKey100 = uniCoreColors.m2744getBlackTransparent250d7_KjU();
            this.clearDarkKey200 = uniCoreColors.m2741getBlackTransparent1000d7_KjU();
            this.clearDarkKey300 = uniCoreColors.m2742getBlackTransparent1200d7_KjU();
            this.clearDarkKey400 = uniCoreColors.m2743getBlackTransparent1600d7_KjU();
            this.clearDarkKey500 = uniCoreColors.m2745getBlackTransparent3200d7_KjU();
            this.clearDarkKey600 = uniCoreColors.m2746getBlackTransparent4800d7_KjU();
            this.clearDarkKey700 = uniCoreColors.m2748getBlackTransparent6400d7_KjU();
            this.clearDarkKey800 = uniCoreColors.m2749getBlackTransparent8000d7_KjU();
            this.clearLightKey0 = uniCoreColors.m2920getWhiteTransparent00d7_KjU();
            this.clearLightKey100 = uniCoreColors.m2925getWhiteTransparent250d7_KjU();
            this.clearLightKey200 = uniCoreColors.m2921getWhiteTransparent1000d7_KjU();
            this.clearLightKey300 = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.clearLightKey400 = uniCoreColors.m2923getWhiteTransparent1600d7_KjU();
            this.clearLightKey500 = uniCoreColors.m2927getWhiteTransparent3200d7_KjU();
            this.clearLightKey600 = uniCoreColors.m2929getWhiteTransparent4800d7_KjU();
            this.clearLightKey700 = uniCoreColors.m2933getWhiteTransparent6400d7_KjU();
            this.clearLightKey800 = uniCoreColors.m2935getWhiteTransparent8000d7_KjU();
            this.graphicAccentOnLight = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.graphicActionOnDark = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicActionOnLight = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicDarkKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicDarkerNeutralOnLight = uniCoreColors.m2846getNeutralTransparentDark2000d7_KjU();
            this.graphicDisabledOnDark = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.graphicDisabledOnLight = uniCoreColors.m2848getNeutralTransparentDark500d7_KjU();
            this.graphicExpressOnDark = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.graphicFreshOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicLightKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicMarketingOnDark = uniCoreColors.m2909getViolet4000d7_KjU();
            this.graphicMarketingOnLight = uniCoreColors.m2912getViolet5000d7_KjU();
            this.graphicNegativeOnDark = uniCoreColors.m2881getRed3750d7_KjU();
            this.graphicNeutralOnDark = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.graphicNeutralOnLight = uniCoreColors.m2845getNeutralTransparentDark1000d7_KjU();
            this.graphicPositiveOnDark = uniCoreColors.m2795getGreen3000d7_KjU();
            this.graphicPositivePrimaryOnLight = uniCoreColors.m2796getGreen3500d7_KjU();
            this.graphicPrimaryOnDark = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicPrimaryOnLight = uniCoreColors.m2828getNeutral10000d7_KjU();
            this.graphicSecondaryOnDark = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicSecondaryOnLight = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.graphicSolidNeutral = uniCoreColors.m2833getNeutral4000d7_KjU();
            this.graphicTertiaryOnDark = uniCoreColors.m2926getWhiteTransparent3000d7_KjU();
            this.graphicTertiaryOnLight = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicWarningOnDark = uniCoreColors.m2937getYellow2000d7_KjU();
            this.graphicWarningPrimaryOnLight = uniCoreColors.m2941getYellow3000d7_KjU();
            this.layerFloor1OnDark = uniCoreColors.m2792getGray9000d7_KjU();
            this.textAccentOnLight = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.textActionOnDark = uniCoreColors.m2752getBlue4000d7_KjU();
            this.textActionOnLight = uniCoreColors.m2755getBlue5000d7_KjU();
            this.textDarkKey = uniCoreColors.m2740getBlack0d7_KjU();
            this.textExpressOnDark = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textFreshOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textLightKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.textMarketingOnDark = uniCoreColors.m2909getViolet4000d7_KjU();
            this.textMarketingOnLight = uniCoreColors.m2912getViolet5000d7_KjU();
            this.textNegativeOnDark = uniCoreColors.m2881getRed3750d7_KjU();
            this.textPositiveOnDark = uniCoreColors.m2795getGreen3000d7_KjU();
            this.textPositiveOnLight = uniCoreColors.m2796getGreen3500d7_KjU();
            this.textPrimaryOnDark = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textPrimaryOnLight = uniCoreColors.m2740getBlack0d7_KjU();
            this.textSecondaryOnDark = uniCoreColors.m2932getWhiteTransparent6000d7_KjU();
            this.textSecondaryOnLight = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.textTertiaryOnDark = uniCoreColors.m2928getWhiteTransparent4000d7_KjU();
            this.textTertiaryOnLight = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.textWarningOnDark = uniCoreColors.m2937getYellow2000d7_KjU();
            this.bgAccentPrimary = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgAccentPrimaryInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgAccentSecondary = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgAccentSecondaryInverted = uniCoreColors.m2818getMagentaTransparent500d7_KjU();
            this.bgActionPrimary = uniCoreColors.m2755getBlue5000d7_KjU();
            this.bgActionPrimaryInverted = uniCoreColors.m2755getBlue5000d7_KjU();
            this.bgActionSecondary = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgActionSecondaryInverted = uniCoreColors.m2762getBlueTransparent500d7_KjU();
            this.bgActionSecondarySolid = uniCoreColors.m2891getSky8000d7_KjU();
            this.bgActiveAccentPrimary = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.bgActiveAccentPrimaryInverted = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.bgActiveAccentSecondary = uniCoreColors.m2817getMagentaTransparent1500d7_KjU();
            this.bgActiveAccentSecondaryInverted = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgActiveActionPrimary = uniCoreColors.m2753getBlue4500d7_KjU();
            this.bgActiveActionPrimaryInverted = uniCoreColors.m2756getBlue6000d7_KjU();
            this.bgActiveActionSecondary = uniCoreColors.m2761getBlueTransparent1500d7_KjU();
            this.bgActiveActionSecondaryInverted = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgActiveApparelPrimary = uniCoreColors.m2864getPink4000d7_KjU();
            this.bgActiveApparelPrimaryInverted = uniCoreColors.m2866getPink6000d7_KjU();
            this.bgActiveApparelSecondary = uniCoreColors.m2868getPinkTransparent1500d7_KjU();
            this.bgActiveApparelSecondaryInverted = uniCoreColors.m2870getPinkTransparent3000d7_KjU();
            this.bgActiveAquaPrimary = uniCoreColors.m2750getBlue3000d7_KjU();
            this.bgActiveBestpricePrimary = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.bgActiveBestpricePrimaryInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.bgActiveBestpriceSecondary = uniCoreColors.m2765getBrandCaseBestprice400Transparent0d7_KjU();
            this.bgActiveBestpriceSecondaryInverted = uniCoreColors.m2765getBrandCaseBestprice400Transparent0d7_KjU();
            this.bgActiveEconomPrimary = uniCoreColors.m2852getOrange4000d7_KjU();
            this.bgActiveEconomSecondary = uniCoreColors.m2856getOrangeTransparent1000d7_KjU();
            this.bgActiveExpressPrimary = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.bgActiveExpressPrimaryInverted = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.bgActiveExpressSecondary = uniCoreColors.m2817getMagentaTransparent1500d7_KjU();
            this.bgActiveExpressSecondaryInverted = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgActiveFreshPrimary = uniCoreColors.m2727getAzure3000d7_KjU();
            this.bgActiveFreshPrimaryInverted = uniCoreColors.m2729getAzure4000d7_KjU();
            this.bgActiveFreshSecondary = uniCoreColors.m2737getAzureTransparent1500d7_KjU();
            this.bgActiveFreshSecondaryInverted = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgActiveMarketingPrimary = uniCoreColors.m2910getViolet4500d7_KjU();
            this.bgActiveMarketingPrimaryInverted = uniCoreColors.m2913getViolet6000d7_KjU();
            this.bgActiveMarketingSecondary = uniCoreColors.m2917getVioletTransparent1500d7_KjU();
            this.bgActiveMarketingSecondaryInverted = uniCoreColors.m2916getVioletTransparent1000d7_KjU();
            this.bgActiveNegativePrimary = uniCoreColors.m2882getRed4000d7_KjU();
            this.bgActiveNegativePrimaryInverted = uniCoreColors.m2884getRed5000d7_KjU();
            this.bgActiveNegativeSecondary = uniCoreColors.m2888getRedTransparent1500d7_KjU();
            this.bgActiveNegativeSecondaryInverted = uniCoreColors.m2887getRedTransparent1000d7_KjU();
            this.bgActiveOzonPrimary = uniCoreColors.m2753getBlue4500d7_KjU();
            this.bgActiveOzonSecondary = uniCoreColors.m2761getBlueTransparent1500d7_KjU();
            this.bgActivePositivePrimary = uniCoreColors.m2795getGreen3000d7_KjU();
            this.bgActivePositivePrimaryInverted = uniCoreColors.m2797getGreen4000d7_KjU();
            this.bgActivePositiveSecondary = uniCoreColors.m2801getGreenTransparent1500d7_KjU();
            this.bgActivePositiveSecondaryInverted = uniCoreColors.m2800getGreenTransparent1000d7_KjU();
            this.bgActivePremiumPrimary = uniCoreColors.m2837getNeutral8000d7_KjU();
            this.bgActivePremiumPrimaryInverted = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.bgActivePremiumSecondary = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgActivePremiumSecondaryInverted = uniCoreColors.m2849getNeutralTransparentLight1000d7_KjU();
            this.bgActivePrimary = uniCoreColors.m2790getGray7000d7_KjU();
            this.bgActivePrimaryInverted = uniCoreColors.m2830getNeutral2000d7_KjU();
            this.bgActiveSecondary = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgActiveSecondaryInverted = uniCoreColors.m2839getNeutralTransparent1000d7_KjU();
            this.bgActiveSelect = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgActiveSelectInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgActiveWarningPrimary = uniCoreColors.m2938getYellow2250d7_KjU();
            this.bgActiveWarningPrimaryInverted = uniCoreColors.m2941getYellow3000d7_KjU();
            this.bgActiveWarningSecondary = uniCoreColors.m2946getYellowTransparent1500d7_KjU();
            this.bgActiveWarningSecondaryInverted = uniCoreColors.m2945getYellowTransparent1000d7_KjU();
            this.bgApparelPiggy = uniCoreColors.m2861getPink2000d7_KjU();
            this.bgApparelPrimary = uniCoreColors.m2863getPink3000d7_KjU();
            this.bgApparelPrimaryInverted = uniCoreColors.m2864getPink4000d7_KjU();
            this.bgApparelSecondary = uniCoreColors.m2869getPinkTransparent2000d7_KjU();
            this.bgApparelSecondaryInverted = uniCoreColors.m2867getPinkTransparent1000d7_KjU();
            this.bgAquaPrimary = uniCoreColors.m2763getBrandAdditionalMorningBlue0d7_KjU();
            this.bgAttentionPrimary = uniCoreColors.m2880getRed3500d7_KjU();
            this.bgBestpricePrimary = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.bgBestpricePrimaryInverted = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.bgBestpriceSecondary = uniCoreColors.m2764getBrandCaseBestprice300Transparent0d7_KjU();
            this.bgBestpriceSecondaryInverted = uniCoreColors.m2764getBrandCaseBestprice300Transparent0d7_KjU();
            this.bgControl = uniCoreColors.m2791getGray8000d7_KjU();
            this.bgControlInverted = uniCoreColors.m2834getNeutral500d7_KjU();
            this.bgDarkCerulean = uniCoreColors.m2775getBrandOzonTechDarkCerulean0d7_KjU();
            this.bgDoubtfullPrimary = uniCoreColors.m2768getBrandCaseDoubtfull0d7_KjU();
            this.bgEconomPrimary = uniCoreColors.m2851getOrange3500d7_KjU();
            this.bgEconomSecondary = uniCoreColors.m2857getOrangeTransparent500d7_KjU();
            this.bgExpressPrimary = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgExpressPrimaryInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.bgExpressSecondary = uniCoreColors.m2816getMagentaTransparent1000d7_KjU();
            this.bgExpressSecondaryInverted = uniCoreColors.m2818getMagentaTransparent500d7_KjU();
            this.bgFreshPrimary = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgFreshPrimaryInverted = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgFreshSecondary = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgFreshSecondaryInverted = uniCoreColors.m2739getAzureTransparent500d7_KjU();
            this.bgGuaranteePrimary = uniCoreColors.m2771getBrandCaseGuarantee600Transparent0d7_KjU();
            this.bgInstalmentPrimary = uniCoreColors.m2941getYellow3000d7_KjU();
            this.bgInstalmentSecondary = uniCoreColors.m2938getYellow2250d7_KjU();
            this.bgMarketingPrimary = uniCoreColors.m2912getViolet5000d7_KjU();
            this.bgMarketingPrimaryInverted = uniCoreColors.m2912getViolet5000d7_KjU();
            this.bgMarketingSecondary = uniCoreColors.m2916getVioletTransparent1000d7_KjU();
            this.bgMarketingSecondaryInverted = uniCoreColors.m2918getVioletTransparent500d7_KjU();
            this.bgMarketingSecondarySolid = uniCoreColors.m2908getViolet10000d7_KjU();
            this.bgNegativePrimary = uniCoreColors.m2883getRed4500d7_KjU();
            this.bgNegativePrimaryInverted = uniCoreColors.m2883getRed4500d7_KjU();
            this.bgNegativeSecondary = uniCoreColors.m2887getRedTransparent1000d7_KjU();
            this.bgNegativeSecondaryInverted = uniCoreColors.m2889getRedTransparent500d7_KjU();
            this.bgOpaqueAccentSecondary = uniCoreColors.m2815getMagentaOpaqueDark1000d7_KjU();
            this.bgOpaqueActionSecondary = uniCoreColors.m2759getBlueOpaqueDark1000d7_KjU();
            this.bgOpaqueApparelSecondary = uniCoreColors.m2815getMagentaOpaqueDark1000d7_KjU();
            this.bgOpaqueEconomSecondary = uniCoreColors.m2855getOrangeOpaqueDark500d7_KjU();
            this.bgOpaqueFreshSecondary = uniCoreColors.m2735getAzureOpaqueDark1000d7_KjU();
            this.bgOpaqueMarketingSecondary = uniCoreColors.m2915getVioletOpaqueDark1000d7_KjU();
            this.bgOpaqueNegativeSecondary = uniCoreColors.m2886getRedOpaqueDark500d7_KjU();
            this.bgOpaqueOzonSecondary = uniCoreColors.m2759getBlueOpaqueDark1000d7_KjU();
            this.bgOpaquePositiveSecondary = uniCoreColors.m2799getGreenOpaqueDark1000d7_KjU();
            this.bgOpaqueSecondary = uniCoreColors.m2759getBlueOpaqueDark1000d7_KjU();
            this.bgOpaqueWarningSecondary = uniCoreColors.m2944getYellowOpaqueDark500d7_KjU();
            this.bgOverlap = uniCoreColors.m2858getOverlapDark0d7_KjU();
            this.bgOverlapInverted = uniCoreColors.m2859getOverlapLight0d7_KjU();
            this.bgOxford = uniCoreColors.m2776getBrandOzonTechOxfordBlue0d7_KjU();
            this.bgOzonPrimary = uniCoreColors.m2755getBlue5000d7_KjU();
            this.bgOzonSecondary = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgPositivePrimary = uniCoreColors.m2796getGreen3500d7_KjU();
            this.bgPositivePrimaryInverted = uniCoreColors.m2796getGreen3500d7_KjU();
            this.bgPositiveSecondary = uniCoreColors.m2800getGreenTransparent1000d7_KjU();
            this.bgPositiveSecondaryInverted = uniCoreColors.m2802getGreenTransparent500d7_KjU();
            this.bgPremiumPrimary = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgPremiumPrimaryInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.bgPremiumSecondary = uniCoreColors.m2921getWhiteTransparent1000d7_KjU();
            this.bgPremiumSecondaryInverted = uniCoreColors.m2840getNeutralTransparent250d7_KjU();
            this.bgPrimary = uniCoreColors.m2791getGray8000d7_KjU();
            this.bgPrimaryInverted = uniCoreColors.m2834getNeutral500d7_KjU();
            this.bgPrussian = uniCoreColors.m2777getBrandOzonTechPrussianBlue0d7_KjU();
            this.bgSbp = uniCoreColors.m2773getBrandCaseSbpSecondary0d7_KjU();
            this.bgSecondary = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.bgSecondaryDynamic = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgSecondaryDynamicInverted = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgSecondaryInverted = uniCoreColors.m2850getNeutralTransparentLight250d7_KjU();
            this.bgSelect = uniCoreColors.m2784getBrandSelectSelectGray1000d7_KjU();
            this.bgSelectInverted = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.bgTabbarPrimary = uniCoreColors.m2792getGray9000d7_KjU();
            this.bgTech = uniCoreColors.m2778getBrandOzonTechTechGreen0d7_KjU();
            this.bgUltraPrimary = uniCoreColors.m2774getBrandCaseUltra0d7_KjU();
            this.bgWarningPrimary = uniCoreColors.m2940getYellow2500d7_KjU();
            this.bgWarningPrimaryInverted = uniCoreColors.m2940getYellow2500d7_KjU();
            this.bgWarningSecondary = uniCoreColors.m2945getYellowTransparent1000d7_KjU();
            this.bgWarningSecondaryInverted = uniCoreColors.m2947getYellowTransparent500d7_KjU();
            this.graphicAccentPrimary = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.graphicAccentPrimaryInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.graphicActionPrimary = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicActionPrimaryInverted = uniCoreColors.m2755getBlue5000d7_KjU();
            this.graphicActiveAccentPrimary = uniCoreColors.m2808getMagenta3500d7_KjU();
            this.graphicActiveAccentPrimaryInverted = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.graphicActiveActionPrimary = uniCoreColors.m2751getBlue3500d7_KjU();
            this.graphicActiveActionPrimaryInverted = uniCoreColors.m2756getBlue6000d7_KjU();
            this.graphicActiveApparel = uniCoreColors.m2862getPink2500d7_KjU();
            this.graphicActiveApparelInverted = uniCoreColors.m2865getPink5000d7_KjU();
            this.graphicActiveBestprice = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.graphicActiveBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.graphicActiveEconom = uniCoreColors.m2852getOrange4000d7_KjU();
            this.graphicActiveExpress = uniCoreColors.m2808getMagenta3500d7_KjU();
            this.graphicActiveExpressInverted = uniCoreColors.m2812getMagenta5000d7_KjU();
            this.graphicActiveFresh = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicActiveFreshInverted = uniCoreColors.m2729getAzure4000d7_KjU();
            this.graphicActiveMarketing = uniCoreColors.m2909getViolet4000d7_KjU();
            this.graphicActiveMarketingInverted = uniCoreColors.m2913getViolet6000d7_KjU();
            this.graphicActiveNegativePrimary = uniCoreColors.m2880getRed3500d7_KjU();
            this.graphicActiveNegativePrimaryInverted = uniCoreColors.m2884getRed5000d7_KjU();
            this.graphicActiveOzon = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicActivePositivePrimary = uniCoreColors.m2795getGreen3000d7_KjU();
            this.graphicActivePositivePrimaryInverted = uniCoreColors.m2797getGreen4000d7_KjU();
            this.graphicActivePremium = uniCoreColors.m2831getNeutral250d7_KjU();
            this.graphicActivePremiumBlue = uniCoreColors.m2757getBlue7000d7_KjU();
            this.graphicActivePremiumInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicActiveRating = uniCoreColors.m2940getYellow2500d7_KjU();
            this.graphicActiveRatingInverted = uniCoreColors.m2938getYellow2250d7_KjU();
            this.graphicActiveWarningPrimary = uniCoreColors.m2936getYellow1500d7_KjU();
            this.graphicActiveWarningPrimaryInverted = uniCoreColors.m2942getYellow3500d7_KjU();
            this.graphicApparel = uniCoreColors.m2863getPink3000d7_KjU();
            this.graphicApparelInverted = uniCoreColors.m2864getPink4000d7_KjU();
            this.graphicBestprice = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.graphicBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.graphicDisabled = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.graphicDisabledInverted = uniCoreColors.m2848getNeutralTransparentDark500d7_KjU();
            this.graphicEconom = uniCoreColors.m2851getOrange3500d7_KjU();
            this.graphicExpress = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.graphicExpressInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.graphicFintechGracePrimary = uniCoreColors.m2806getLime3500d7_KjU();
            this.graphicFintechGraceSecondary = uniCoreColors.m2805getLime3000d7_KjU();
            this.graphicFresh = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicFreshInverted = uniCoreColors.m2728getAzure3500d7_KjU();
            this.graphicGuarantee = uniCoreColors.m2770getBrandCaseGuarantee6000d7_KjU();
            this.graphicKey = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicKeyInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicMarketing = uniCoreColors.m2909getViolet4000d7_KjU();
            this.graphicMarketingInverted = uniCoreColors.m2912getViolet5000d7_KjU();
            this.graphicNegativePrimary = uniCoreColors.m2881getRed3750d7_KjU();
            this.graphicNegativePrimaryInverted = uniCoreColors.m2883getRed4500d7_KjU();
            this.graphicNeutral = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.graphicNeutralInverted = uniCoreColors.m2845getNeutralTransparentDark1000d7_KjU();
            this.graphicOverlapPrimary = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicOverlapPrimaryDynamic = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicOxford = uniCoreColors.m2776getBrandOzonTechOxfordBlue0d7_KjU();
            this.graphicOzon = uniCoreColors.m2752getBlue4000d7_KjU();
            this.graphicPositivePrimary = uniCoreColors.m2795getGreen3000d7_KjU();
            this.graphicPositivePrimaryInverted = uniCoreColors.m2796getGreen3500d7_KjU();
            this.graphicPositiveSecondary = uniCoreColors.m2800getGreenTransparent1000d7_KjU();
            this.graphicPremium = uniCoreColors.m2831getNeutral250d7_KjU();
            this.graphicPremiumBlue = uniCoreColors.m2757getBlue7000d7_KjU();
            this.graphicPremiumInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicPrimary = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicPrimaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicPrimaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicPrimaryInverted = uniCoreColors.m2828getNeutral10000d7_KjU();
            this.graphicQuaternary = uniCoreColors.m2924getWhiteTransparent2000d7_KjU();
            this.graphicRating = uniCoreColors.m2941getYellow3000d7_KjU();
            this.graphicRatingInverted = uniCoreColors.m2941getYellow3000d7_KjU();
            this.graphicSecondary = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicSecondaryDynamic = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicSecondaryDynamicInverted = uniCoreColors.m2847getNeutralTransparentDark250d7_KjU();
            this.graphicSecondaryInverted = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.graphicStrokeSticky = uniCoreColors.m2790getGray7000d7_KjU();
            this.graphicTabbarIconPrimary = uniCoreColors.m2934getWhiteTransparent7000d7_KjU();
            this.graphicTabbarIconSecondary = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicTech = uniCoreColors.m2778getBrandOzonTechTechGreen0d7_KjU();
            this.graphicTertiary = uniCoreColors.m2926getWhiteTransparent3000d7_KjU();
            this.graphicTertiaryDynamic = uniCoreColors.m2931getWhiteTransparent5000d7_KjU();
            this.graphicTertiaryInverted = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicUltraPrimary = uniCoreColors.m2774getBrandCaseUltra0d7_KjU();
            this.graphicWarningPrimary = uniCoreColors.m2937getYellow2000d7_KjU();
            this.graphicWarningPrimaryInverted = uniCoreColors.m2941getYellow3000d7_KjU();
            this.layerActiveFloor0 = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerActiveFloor1 = uniCoreColors.m2838getNeutral9000d7_KjU();
            this.layerActiveFloor1Inverted = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.layerActiveFloor2 = uniCoreColors.m2837getNeutral8000d7_KjU();
            this.layerActiveFloor2Inverted = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.layerActiveFloor3 = uniCoreColors.m2836getNeutral7000d7_KjU();
            this.layerActiveFloor3Inverted = uniCoreColors.m2829getNeutral1500d7_KjU();
            this.layerActiveSurface = uniCoreColors.m2924getWhiteTransparent2000d7_KjU();
            this.layerActiveSurfaceInverted = uniCoreColors.m2849getNeutralTransparentLight1000d7_KjU();
            this.layerFloor0 = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerFloor0Inverted = uniCoreColors.m2789getGray1250d7_KjU();
            this.layerFloor1 = uniCoreColors.m2792getGray9000d7_KjU();
            this.layerFloor1Inverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.layerFloor2 = uniCoreColors.m2791getGray8000d7_KjU();
            this.layerFloor2Inverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.layerFloor3 = uniCoreColors.m2790getGray7000d7_KjU();
            this.layerFloor3Inverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.layerOverlayDimming = uniCoreColors.m2747getBlackTransparent6000d7_KjU();
            this.layerOverlayDimmingInverted = uniCoreColors.m2794getGrayTransparent3000d7_KjU();
            this.layerOverlayParanja = uniCoreColors.m2793getGrayTransparent1000d7_KjU();
            this.layerOverlayParanjaInverted = uniCoreColors.m2850getNeutralTransparentLight250d7_KjU();
            this.layerSurface = uniCoreColors.m2921getWhiteTransparent1000d7_KjU();
            this.layerSurfaceInverted = uniCoreColors.m2850getNeutralTransparentLight250d7_KjU();
            this.textAccent = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textAccentInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.textAction = uniCoreColors.m2752getBlue4000d7_KjU();
            this.textActionInverted = uniCoreColors.m2755getBlue5000d7_KjU();
            this.textActiveAccent = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textActiveAccentInverted = uniCoreColors.m2813getMagenta6000d7_KjU();
            this.textActiveAction = uniCoreColors.m2751getBlue3500d7_KjU();
            this.textActiveActionInverted = uniCoreColors.m2757getBlue7000d7_KjU();
            this.textActiveApparel = uniCoreColors.m2864getPink4000d7_KjU();
            this.textActiveApparelInverted = uniCoreColors.m2866getPink6000d7_KjU();
            this.textActiveBestprice = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.textActiveBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.textActiveExpress = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textActiveExpressInverted = uniCoreColors.m2885getRed6000d7_KjU();
            this.textActiveFresh = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActiveFreshInverted = uniCoreColors.m2730getAzure4500d7_KjU();
            this.textActiveMarketing = uniCoreColors.m2909getViolet4000d7_KjU();
            this.textActiveMarketingInverted = uniCoreColors.m2914getViolet7000d7_KjU();
            this.textActiveNegative = uniCoreColors.m2882getRed4000d7_KjU();
            this.textActiveNegativeInverted = uniCoreColors.m2884getRed5000d7_KjU();
            this.textActiveOzon = uniCoreColors.m2751getBlue3500d7_KjU();
            this.textActivePositive = uniCoreColors.m2795getGreen3000d7_KjU();
            this.textActivePositiveInverted = uniCoreColors.m2797getGreen4000d7_KjU();
            this.textActivePremium = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textActivePremiumInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.textActiveWarning = uniCoreColors.m2937getYellow2000d7_KjU();
            this.textActiveWarningInverted = uniCoreColors.m2943getYellow4000d7_KjU();
            this.textApparel = uniCoreColors.m2863getPink3000d7_KjU();
            this.textApparelInverted = uniCoreColors.m2865getPink5000d7_KjU();
            this.textBestprice = uniCoreColors.m2766getBrandCaseBestprice5000d7_KjU();
            this.textBestpriceInverted = uniCoreColors.m2767getBrandCaseBestprice6000d7_KjU();
            this.textDiscountUnavialable = uniCoreColors.m2814getMagenta8000d7_KjU();
            this.textEconom = uniCoreColors.m2852getOrange4000d7_KjU();
            this.textExpress = uniCoreColors.m2809getMagenta4000d7_KjU();
            this.textExpressInverted = uniCoreColors.m2810getMagenta4500d7_KjU();
            this.textFresh = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textFreshInverted = uniCoreColors.m2729getAzure4000d7_KjU();
            this.textGuarantee = uniCoreColors.m2770getBrandCaseGuarantee6000d7_KjU();
            this.textMarketing = uniCoreColors.m2909getViolet4000d7_KjU();
            this.textMarketingInverted = uniCoreColors.m2912getViolet5000d7_KjU();
            this.textNegative = uniCoreColors.m2881getRed3750d7_KjU();
            this.textNegativeInverted = uniCoreColors.m2883getRed4500d7_KjU();
            this.textOriginalprice = uniCoreColors.m2837getNeutral8000d7_KjU();
            this.textOriginalpriceAvailable = uniCoreColors.m2835getNeutral5000d7_KjU();
            this.textOxford = uniCoreColors.m2776getBrandOzonTechOxfordBlue0d7_KjU();
            this.textOzon = uniCoreColors.m2752getBlue4000d7_KjU();
            this.textPositive = uniCoreColors.m2795getGreen3000d7_KjU();
            this.textPositiveInverted = uniCoreColors.m2796getGreen3500d7_KjU();
            this.textPremium = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textPremiumInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.textPrimary = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textPrimaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.textPrimaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.textPrimaryInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.textSecondary = uniCoreColors.m2932getWhiteTransparent6000d7_KjU();
            this.textSecondaryDynamic = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textSecondaryDynamicInverted = uniCoreColors.m2831getNeutral250d7_KjU();
            this.textSecondaryInverted = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.textTech = uniCoreColors.m2778getBrandOzonTechTechGreen0d7_KjU();
            this.textTertiary = uniCoreColors.m2928getWhiteTransparent4000d7_KjU();
            this.textTertiaryInverted = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.textUltra = uniCoreColors.m2774getBrandCaseUltra0d7_KjU();
            this.textWarning = uniCoreColors.m2937getYellow2000d7_KjU();
            this.textWarningInverted = uniCoreColors.m2941getYellow3000d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentOnLight-0d7_KjU, reason: from getter */
        public long getBgAccentOnLight() {
            return this.bgAccentOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimary-0d7_KjU, reason: from getter */
        public long getBgAccentPrimary() {
            return this.bgAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgAccentPrimaryInverted() {
            return this.bgAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondary-0d7_KjU, reason: from getter */
        public long getBgAccentSecondary() {
            return this.bgAccentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgAccentSecondaryInverted() {
            return this.bgAccentSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionPrimary-0d7_KjU, reason: from getter */
        public long getBgActionPrimary() {
            return this.bgActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActionPrimaryInverted() {
            return this.bgActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionSecondary-0d7_KjU, reason: from getter */
        public long getBgActionSecondary() {
            return this.bgActionSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActionSecondaryInverted() {
            return this.bgActionSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActionSecondarySolid-0d7_KjU, reason: from getter */
        public long getBgActionSecondarySolid() {
            return this.bgActionSecondarySolid;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveAccentPrimary() {
            return this.bgActiveAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveAccentPrimaryInverted() {
            return this.bgActiveAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveAccentSecondary() {
            return this.bgActiveAccentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveAccentSecondaryInverted() {
            return this.bgActiveAccentSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveActionPrimary() {
            return this.bgActiveActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveActionPrimaryInverted() {
            return this.bgActiveActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveActionSecondary() {
            return this.bgActiveActionSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveActionSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveActionSecondaryInverted() {
            return this.bgActiveActionSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveApparelPrimary() {
            return this.bgActiveApparelPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveApparelPrimaryInverted() {
            return this.bgActiveApparelPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveApparelSecondary() {
            return this.bgActiveApparelSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveApparelSecondaryInverted() {
            return this.bgActiveApparelSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAquaPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveAquaPrimary() {
            return this.bgActiveAquaPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimary-0d7_KjU, reason: from getter */
        public long getBgActiveBestpricePrimary() {
            return this.bgActiveBestpricePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveBestpricePrimaryInverted() {
            return this.bgActiveBestpricePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveBestpriceSecondary() {
            return this.bgActiveBestpriceSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveBestpriceSecondaryInverted() {
            return this.bgActiveBestpriceSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveEconomPrimary() {
            return this.bgActiveEconomPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveEconomSecondary() {
            return this.bgActiveEconomSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveExpressPrimary() {
            return this.bgActiveExpressPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveExpressPrimaryInverted() {
            return this.bgActiveExpressPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveExpressSecondary() {
            return this.bgActiveExpressSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveExpressSecondaryInverted() {
            return this.bgActiveExpressSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveFreshPrimary() {
            return this.bgActiveFreshPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveFreshPrimaryInverted() {
            return this.bgActiveFreshPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveFreshSecondary() {
            return this.bgActiveFreshSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveFreshSecondaryInverted() {
            return this.bgActiveFreshSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingPrimary() {
            return this.bgActiveMarketingPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingPrimaryInverted() {
            return this.bgActiveMarketingPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingSecondary() {
            return this.bgActiveMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveMarketingSecondaryInverted() {
            return this.bgActiveMarketingSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativePrimary-0d7_KjU, reason: from getter */
        public long getBgActiveNegativePrimary() {
            return this.bgActiveNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveNegativePrimaryInverted() {
            return this.bgActiveNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveNegativeSecondary() {
            return this.bgActiveNegativeSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveNegativeSecondaryInverted() {
            return this.bgActiveNegativeSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveOzonPrimary() {
            return this.bgActiveOzonPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveOzonSecondary() {
            return this.bgActiveOzonSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositivePrimary-0d7_KjU, reason: from getter */
        public long getBgActivePositivePrimary() {
            return this.bgActivePositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePositivePrimaryInverted() {
            return this.bgActivePositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgActivePositiveSecondary() {
            return this.bgActivePositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePositiveSecondaryInverted() {
            return this.bgActivePositiveSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumPrimary-0d7_KjU, reason: from getter */
        public long getBgActivePremiumPrimary() {
            return this.bgActivePremiumPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePremiumPrimaryInverted() {
            return this.bgActivePremiumPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondary-0d7_KjU, reason: from getter */
        public long getBgActivePremiumSecondary() {
            return this.bgActivePremiumSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePremiumSecondaryInverted() {
            return this.bgActivePremiumSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimary-0d7_KjU, reason: from getter */
        public long getBgActivePrimary() {
            return this.bgActivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActivePrimaryInverted() {
            return this.bgActivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveSecondary() {
            return this.bgActiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveSecondaryInverted() {
            return this.bgActiveSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelect-0d7_KjU, reason: from getter */
        public long getBgActiveSelect() {
            return this.bgActiveSelect;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelectInverted-0d7_KjU, reason: from getter */
        public long getBgActiveSelectInverted() {
            return this.bgActiveSelectInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningPrimary-0d7_KjU, reason: from getter */
        public long getBgActiveWarningPrimary() {
            return this.bgActiveWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveWarningPrimaryInverted() {
            return this.bgActiveWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgActiveWarningSecondary() {
            return this.bgActiveWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgActiveWarningSecondaryInverted() {
            return this.bgActiveWarningSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPiggy-0d7_KjU, reason: from getter */
        public long getBgApparelPiggy() {
            return this.bgApparelPiggy;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimary-0d7_KjU, reason: from getter */
        public long getBgApparelPrimary() {
            return this.bgApparelPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgApparelPrimaryInverted() {
            return this.bgApparelPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondary-0d7_KjU, reason: from getter */
        public long getBgApparelSecondary() {
            return this.bgApparelSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgApparelSecondaryInverted() {
            return this.bgApparelSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAquaPrimary-0d7_KjU, reason: from getter */
        public long getBgAquaPrimary() {
            return this.bgAquaPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAttentionPrimary-0d7_KjU, reason: from getter */
        public long getBgAttentionPrimary() {
            return this.bgAttentionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimary-0d7_KjU, reason: from getter */
        public long getBgBestpricePrimary() {
            return this.bgBestpricePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgBestpricePrimaryInverted() {
            return this.bgBestpricePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondary-0d7_KjU, reason: from getter */
        public long getBgBestpriceSecondary() {
            return this.bgBestpriceSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgBestpriceSecondaryInverted() {
            return this.bgBestpriceSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControl-0d7_KjU, reason: from getter */
        public long getBgControl() {
            return this.bgControl;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControlInverted-0d7_KjU, reason: from getter */
        public long getBgControlInverted() {
            return this.bgControlInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkCerulean-0d7_KjU, reason: from getter */
        public long getBgDarkCerulean() {
            return this.bgDarkCerulean;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkKey-0d7_KjU, reason: from getter */
        public long getBgDarkKey() {
            return this.bgDarkKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDoubtfullPrimary-0d7_KjU, reason: from getter */
        public long getBgDoubtfullPrimary() {
            return this.bgDoubtfullPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomPrimary-0d7_KjU, reason: from getter */
        public long getBgEconomPrimary() {
            return this.bgEconomPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomSecondary-0d7_KjU, reason: from getter */
        public long getBgEconomSecondary() {
            return this.bgEconomSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimary-0d7_KjU, reason: from getter */
        public long getBgExpressPrimary() {
            return this.bgExpressPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgExpressPrimaryInverted() {
            return this.bgExpressPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondary-0d7_KjU, reason: from getter */
        public long getBgExpressSecondary() {
            return this.bgExpressSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgExpressSecondaryInverted() {
            return this.bgExpressSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimary-0d7_KjU, reason: from getter */
        public long getBgFreshPrimary() {
            return this.bgFreshPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgFreshPrimaryInverted() {
            return this.bgFreshPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondary-0d7_KjU, reason: from getter */
        public long getBgFreshSecondary() {
            return this.bgFreshSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgFreshSecondaryInverted() {
            return this.bgFreshSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgGuaranteePrimary-0d7_KjU, reason: from getter */
        public long getBgGuaranteePrimary() {
            return this.bgGuaranteePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentPrimary-0d7_KjU, reason: from getter */
        public long getBgInstalmentPrimary() {
            return this.bgInstalmentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentSecondary-0d7_KjU, reason: from getter */
        public long getBgInstalmentSecondary() {
            return this.bgInstalmentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgLightKey-0d7_KjU, reason: from getter */
        public long getBgLightKey() {
            return this.bgLightKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingOnLight-0d7_KjU, reason: from getter */
        public long getBgMarketingOnLight() {
            return this.bgMarketingOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimary-0d7_KjU, reason: from getter */
        public long getBgMarketingPrimary() {
            return this.bgMarketingPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgMarketingPrimaryInverted() {
            return this.bgMarketingPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgMarketingSecondary() {
            return this.bgMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgMarketingSecondaryInverted() {
            return this.bgMarketingSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondarySolid-0d7_KjU, reason: from getter */
        public long getBgMarketingSecondarySolid() {
            return this.bgMarketingSecondarySolid;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimary-0d7_KjU, reason: from getter */
        public long getBgNegativePrimary() {
            return this.bgNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgNegativePrimaryInverted() {
            return this.bgNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondary-0d7_KjU, reason: from getter */
        public long getBgNegativeSecondary() {
            return this.bgNegativeSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgNegativeSecondaryInverted() {
            return this.bgNegativeSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueAccentSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueAccentSecondary() {
            return this.bgOpaqueAccentSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueActionSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueActionSecondary() {
            return this.bgOpaqueActionSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueApparelSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueApparelSecondary() {
            return this.bgOpaqueApparelSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueEconomSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueEconomSecondary() {
            return this.bgOpaqueEconomSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueFreshSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueFreshSecondary() {
            return this.bgOpaqueFreshSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueMarketingSecondary() {
            return this.bgOpaqueMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueNegativeSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueNegativeSecondary() {
            return this.bgOpaqueNegativeSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueOzonSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueOzonSecondary() {
            return this.bgOpaqueOzonSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaquePositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaquePositiveSecondary() {
            return this.bgOpaquePositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueSecondary() {
            return this.bgOpaqueSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueWarningSecondary() {
            return this.bgOpaqueWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlap-0d7_KjU, reason: from getter */
        public long getBgOverlap() {
            return this.bgOverlap;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlapInverted-0d7_KjU, reason: from getter */
        public long getBgOverlapInverted() {
            return this.bgOverlapInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOxford-0d7_KjU, reason: from getter */
        public long getBgOxford() {
            return this.bgOxford;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonPrimary-0d7_KjU, reason: from getter */
        public long getBgOzonPrimary() {
            return this.bgOzonPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonSecondary-0d7_KjU, reason: from getter */
        public long getBgOzonSecondary() {
            return this.bgOzonSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveOnLight-0d7_KjU, reason: from getter */
        public long getBgPositiveOnLight() {
            return this.bgPositiveOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimary-0d7_KjU, reason: from getter */
        public long getBgPositivePrimary() {
            return this.bgPositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgPositivePrimaryInverted() {
            return this.bgPositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgPositiveSecondary() {
            return this.bgPositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgPositiveSecondaryInverted() {
            return this.bgPositiveSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumPrimary-0d7_KjU, reason: from getter */
        public long getBgPremiumPrimary() {
            return this.bgPremiumPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgPremiumPrimaryInverted() {
            return this.bgPremiumPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondary-0d7_KjU, reason: from getter */
        public long getBgPremiumSecondary() {
            return this.bgPremiumSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgPremiumSecondaryInverted() {
            return this.bgPremiumSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimary-0d7_KjU, reason: from getter */
        public long getBgPrimary() {
            return this.bgPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgPrimaryInverted() {
            return this.bgPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrussian-0d7_KjU, reason: from getter */
        public long getBgPrussian() {
            return this.bgPrussian;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSbp-0d7_KjU, reason: from getter */
        public long getBgSbp() {
            return this.bgSbp;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondary-0d7_KjU, reason: from getter */
        public long getBgSecondary() {
            return this.bgSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryDynamic-0d7_KjU, reason: from getter */
        public long getBgSecondaryDynamic() {
            return this.bgSecondaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getBgSecondaryDynamicInverted() {
            return this.bgSecondaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgSecondaryInverted() {
            return this.bgSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelect-0d7_KjU, reason: from getter */
        public long getBgSelect() {
            return this.bgSelect;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelectInverted-0d7_KjU, reason: from getter */
        public long getBgSelectInverted() {
            return this.bgSelectInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTabbarPrimary-0d7_KjU, reason: from getter */
        public long getBgTabbarPrimary() {
            return this.bgTabbarPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTech-0d7_KjU, reason: from getter */
        public long getBgTech() {
            return this.bgTech;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgUltraPrimary-0d7_KjU, reason: from getter */
        public long getBgUltraPrimary() {
            return this.bgUltraPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningOnLight-0d7_KjU, reason: from getter */
        public long getBgWarningOnLight() {
            return this.bgWarningOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimary-0d7_KjU, reason: from getter */
        public long getBgWarningPrimary() {
            return this.bgWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getBgWarningPrimaryInverted() {
            return this.bgWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgWarningSecondary() {
            return this.bgWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondaryInverted-0d7_KjU, reason: from getter */
        public long getBgWarningSecondaryInverted() {
            return this.bgWarningSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey100-0d7_KjU, reason: from getter */
        public long getClearDarkKey100() {
            return this.clearDarkKey100;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey200-0d7_KjU, reason: from getter */
        public long getClearDarkKey200() {
            return this.clearDarkKey200;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey300-0d7_KjU, reason: from getter */
        public long getClearDarkKey300() {
            return this.clearDarkKey300;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey400-0d7_KjU, reason: from getter */
        public long getClearDarkKey400() {
            return this.clearDarkKey400;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey500-0d7_KjU, reason: from getter */
        public long getClearDarkKey500() {
            return this.clearDarkKey500;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey600-0d7_KjU, reason: from getter */
        public long getClearDarkKey600() {
            return this.clearDarkKey600;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey700-0d7_KjU, reason: from getter */
        public long getClearDarkKey700() {
            return this.clearDarkKey700;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey800-0d7_KjU, reason: from getter */
        public long getClearDarkKey800() {
            return this.clearDarkKey800;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey0-0d7_KjU, reason: from getter */
        public long getClearLightKey0() {
            return this.clearLightKey0;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey100-0d7_KjU, reason: from getter */
        public long getClearLightKey100() {
            return this.clearLightKey100;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey200-0d7_KjU, reason: from getter */
        public long getClearLightKey200() {
            return this.clearLightKey200;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey300-0d7_KjU, reason: from getter */
        public long getClearLightKey300() {
            return this.clearLightKey300;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey400-0d7_KjU, reason: from getter */
        public long getClearLightKey400() {
            return this.clearLightKey400;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey500-0d7_KjU, reason: from getter */
        public long getClearLightKey500() {
            return this.clearLightKey500;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey600-0d7_KjU, reason: from getter */
        public long getClearLightKey600() {
            return this.clearLightKey600;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey700-0d7_KjU, reason: from getter */
        public long getClearLightKey700() {
            return this.clearLightKey700;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey800-0d7_KjU, reason: from getter */
        public long getClearLightKey800() {
            return this.clearLightKey800;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getDetectorColorMine-0d7_KjU, reason: from getter */
        public long getDetectorColorMine() {
            return this.detectorColorMine;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentOnLight-0d7_KjU, reason: from getter */
        public long getGraphicAccentOnLight() {
            return this.graphicAccentOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimary-0d7_KjU, reason: from getter */
        public long getGraphicAccentPrimary() {
            return this.graphicAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicAccentPrimaryInverted() {
            return this.graphicAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionOnDark-0d7_KjU, reason: from getter */
        public long getGraphicActionOnDark() {
            return this.graphicActionOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionOnLight-0d7_KjU, reason: from getter */
        public long getGraphicActionOnLight() {
            return this.graphicActionOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActionPrimary() {
            return this.graphicActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActionPrimaryInverted() {
            return this.graphicActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveAccentPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveAccentPrimary() {
            return this.graphicActiveAccentPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveAccentPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveAccentPrimaryInverted() {
            return this.graphicActiveAccentPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveActionPrimary() {
            return this.graphicActiveActionPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveActionPrimaryInverted() {
            return this.graphicActiveActionPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveApparel-0d7_KjU, reason: from getter */
        public long getGraphicActiveApparel() {
            return this.graphicActiveApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveApparelInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveApparelInverted() {
            return this.graphicActiveApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestprice-0d7_KjU, reason: from getter */
        public long getGraphicActiveBestprice() {
            return this.graphicActiveBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestpriceInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveBestpriceInverted() {
            return this.graphicActiveBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveEconom-0d7_KjU, reason: from getter */
        public long getGraphicActiveEconom() {
            return this.graphicActiveEconom;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpress-0d7_KjU, reason: from getter */
        public long getGraphicActiveExpress() {
            return this.graphicActiveExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpressInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveExpressInverted() {
            return this.graphicActiveExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFresh-0d7_KjU, reason: from getter */
        public long getGraphicActiveFresh() {
            return this.graphicActiveFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFreshInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveFreshInverted() {
            return this.graphicActiveFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveMarketing-0d7_KjU, reason: from getter */
        public long getGraphicActiveMarketing() {
            return this.graphicActiveMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveMarketingInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveMarketingInverted() {
            return this.graphicActiveMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveNegativePrimary() {
            return this.graphicActiveNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveNegativePrimaryInverted() {
            return this.graphicActiveNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveOzon-0d7_KjU, reason: from getter */
        public long getGraphicActiveOzon() {
            return this.graphicActiveOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimary-0d7_KjU, reason: from getter */
        public long getGraphicActivePositivePrimary() {
            return this.graphicActivePositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActivePositivePrimaryInverted() {
            return this.graphicActivePositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremium-0d7_KjU, reason: from getter */
        public long getGraphicActivePremium() {
            return this.graphicActivePremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumBlue-0d7_KjU, reason: from getter */
        public long getGraphicActivePremiumBlue() {
            return this.graphicActivePremiumBlue;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumInverted-0d7_KjU, reason: from getter */
        public long getGraphicActivePremiumInverted() {
            return this.graphicActivePremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveRating-0d7_KjU, reason: from getter */
        public long getGraphicActiveRating() {
            return this.graphicActiveRating;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveRatingInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveRatingInverted() {
            return this.graphicActiveRatingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimary-0d7_KjU, reason: from getter */
        public long getGraphicActiveWarningPrimary() {
            return this.graphicActiveWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicActiveWarningPrimaryInverted() {
            return this.graphicActiveWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicApparel-0d7_KjU, reason: from getter */
        public long getGraphicApparel() {
            return this.graphicApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicApparelInverted-0d7_KjU, reason: from getter */
        public long getGraphicApparelInverted() {
            return this.graphicApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestprice-0d7_KjU, reason: from getter */
        public long getGraphicBestprice() {
            return this.graphicBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestpriceInverted-0d7_KjU, reason: from getter */
        public long getGraphicBestpriceInverted() {
            return this.graphicBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkKey-0d7_KjU, reason: from getter */
        public long getGraphicDarkKey() {
            return this.graphicDarkKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkerNeutralOnLight-0d7_KjU, reason: from getter */
        public long getGraphicDarkerNeutralOnLight() {
            return this.graphicDarkerNeutralOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabled-0d7_KjU, reason: from getter */
        public long getGraphicDisabled() {
            return this.graphicDisabled;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledInverted-0d7_KjU, reason: from getter */
        public long getGraphicDisabledInverted() {
            return this.graphicDisabledInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnDark-0d7_KjU, reason: from getter */
        public long getGraphicDisabledOnDark() {
            return this.graphicDisabledOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnLight-0d7_KjU, reason: from getter */
        public long getGraphicDisabledOnLight() {
            return this.graphicDisabledOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicEconom-0d7_KjU, reason: from getter */
        public long getGraphicEconom() {
            return this.graphicEconom;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpress-0d7_KjU, reason: from getter */
        public long getGraphicExpress() {
            return this.graphicExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressInverted-0d7_KjU, reason: from getter */
        public long getGraphicExpressInverted() {
            return this.graphicExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressOnDark-0d7_KjU, reason: from getter */
        public long getGraphicExpressOnDark() {
            return this.graphicExpressOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGracePrimary-0d7_KjU, reason: from getter */
        public long getGraphicFintechGracePrimary() {
            return this.graphicFintechGracePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGraceSecondary-0d7_KjU, reason: from getter */
        public long getGraphicFintechGraceSecondary() {
            return this.graphicFintechGraceSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFresh-0d7_KjU, reason: from getter */
        public long getGraphicFresh() {
            return this.graphicFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshInverted-0d7_KjU, reason: from getter */
        public long getGraphicFreshInverted() {
            return this.graphicFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshOnDark-0d7_KjU, reason: from getter */
        public long getGraphicFreshOnDark() {
            return this.graphicFreshOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicGuarantee-0d7_KjU, reason: from getter */
        public long getGraphicGuarantee() {
            return this.graphicGuarantee;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKey-0d7_KjU, reason: from getter */
        public long getGraphicKey() {
            return this.graphicKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKeyInverted-0d7_KjU, reason: from getter */
        public long getGraphicKeyInverted() {
            return this.graphicKeyInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicLightKey-0d7_KjU, reason: from getter */
        public long getGraphicLightKey() {
            return this.graphicLightKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketing-0d7_KjU, reason: from getter */
        public long getGraphicMarketing() {
            return this.graphicMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingInverted-0d7_KjU, reason: from getter */
        public long getGraphicMarketingInverted() {
            return this.graphicMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnDark-0d7_KjU, reason: from getter */
        public long getGraphicMarketingOnDark() {
            return this.graphicMarketingOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnLight-0d7_KjU, reason: from getter */
        public long getGraphicMarketingOnLight() {
            return this.graphicMarketingOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativeOnDark-0d7_KjU, reason: from getter */
        public long getGraphicNegativeOnDark() {
            return this.graphicNegativeOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimary-0d7_KjU, reason: from getter */
        public long getGraphicNegativePrimary() {
            return this.graphicNegativePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicNegativePrimaryInverted() {
            return this.graphicNegativePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutral-0d7_KjU, reason: from getter */
        public long getGraphicNeutral() {
            return this.graphicNeutral;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralInverted-0d7_KjU, reason: from getter */
        public long getGraphicNeutralInverted() {
            return this.graphicNeutralInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnDark-0d7_KjU, reason: from getter */
        public long getGraphicNeutralOnDark() {
            return this.graphicNeutralOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnLight-0d7_KjU, reason: from getter */
        public long getGraphicNeutralOnLight() {
            return this.graphicNeutralOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOverlapPrimary-0d7_KjU, reason: from getter */
        public long getGraphicOverlapPrimary() {
            return this.graphicOverlapPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOverlapPrimaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicOverlapPrimaryDynamic() {
            return this.graphicOverlapPrimaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOxford-0d7_KjU, reason: from getter */
        public long getGraphicOxford() {
            return this.graphicOxford;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOzon-0d7_KjU, reason: from getter */
        public long getGraphicOzon() {
            return this.graphicOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositiveOnDark-0d7_KjU, reason: from getter */
        public long getGraphicPositiveOnDark() {
            return this.graphicPositiveOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimary-0d7_KjU, reason: from getter */
        public long getGraphicPositivePrimary() {
            return this.graphicPositivePrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicPositivePrimaryInverted() {
            return this.graphicPositivePrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicPositivePrimaryOnLight() {
            return this.graphicPositivePrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositiveSecondary-0d7_KjU, reason: from getter */
        public long getGraphicPositiveSecondary() {
            return this.graphicPositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremium-0d7_KjU, reason: from getter */
        public long getGraphicPremium() {
            return this.graphicPremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumBlue-0d7_KjU, reason: from getter */
        public long getGraphicPremiumBlue() {
            return this.graphicPremiumBlue;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumInverted-0d7_KjU, reason: from getter */
        public long getGraphicPremiumInverted() {
            return this.graphicPremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimary-0d7_KjU, reason: from getter */
        public long getGraphicPrimary() {
            return this.graphicPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryDynamic() {
            return this.graphicPrimaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryDynamicInverted() {
            return this.graphicPrimaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryInverted() {
            return this.graphicPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnDark-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryOnDark() {
            return this.graphicPrimaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicPrimaryOnLight() {
            return this.graphicPrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicQuaternary-0d7_KjU, reason: from getter */
        public long getGraphicQuaternary() {
            return this.graphicQuaternary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicRating-0d7_KjU, reason: from getter */
        public long getGraphicRating() {
            return this.graphicRating;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicRatingInverted-0d7_KjU, reason: from getter */
        public long getGraphicRatingInverted() {
            return this.graphicRatingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondary-0d7_KjU, reason: from getter */
        public long getGraphicSecondary() {
            return this.graphicSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryDynamic() {
            return this.graphicSecondaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryDynamicInverted() {
            return this.graphicSecondaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryInverted() {
            return this.graphicSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnDark-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryOnDark() {
            return this.graphicSecondaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicSecondaryOnLight() {
            return this.graphicSecondaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSolidNeutral-0d7_KjU, reason: from getter */
        public long getGraphicSolidNeutral() {
            return this.graphicSolidNeutral;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicStrokeSticky-0d7_KjU, reason: from getter */
        public long getGraphicStrokeSticky() {
            return this.graphicStrokeSticky;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconPrimary-0d7_KjU, reason: from getter */
        public long getGraphicTabbarIconPrimary() {
            return this.graphicTabbarIconPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconSecondary-0d7_KjU, reason: from getter */
        public long getGraphicTabbarIconSecondary() {
            return this.graphicTabbarIconSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTech-0d7_KjU, reason: from getter */
        public long getGraphicTech() {
            return this.graphicTech;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiary-0d7_KjU, reason: from getter */
        public long getGraphicTertiary() {
            return this.graphicTertiary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryDynamic() {
            return this.graphicTertiaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryInverted() {
            return this.graphicTertiaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnDark-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryOnDark() {
            return this.graphicTertiaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryOnLight() {
            return this.graphicTertiaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicUltraPrimary-0d7_KjU, reason: from getter */
        public long getGraphicUltraPrimary() {
            return this.graphicUltraPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningOnDark-0d7_KjU, reason: from getter */
        public long getGraphicWarningOnDark() {
            return this.graphicWarningOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimary-0d7_KjU, reason: from getter */
        public long getGraphicWarningPrimary() {
            return this.graphicWarningPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryInverted-0d7_KjU, reason: from getter */
        public long getGraphicWarningPrimaryInverted() {
            return this.graphicWarningPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryOnLight-0d7_KjU, reason: from getter */
        public long getGraphicWarningPrimaryOnLight() {
            return this.graphicWarningPrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor0-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor0() {
            return this.layerActiveFloor0;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor1-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor1() {
            return this.layerActiveFloor1;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor1Inverted-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor1Inverted() {
            return this.layerActiveFloor1Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor2() {
            return this.layerActiveFloor2;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2Inverted-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor2Inverted() {
            return this.layerActiveFloor2Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor3() {
            return this.layerActiveFloor3;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3Inverted-0d7_KjU, reason: from getter */
        public long getLayerActiveFloor3Inverted() {
            return this.layerActiveFloor3Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurface-0d7_KjU, reason: from getter */
        public long getLayerActiveSurface() {
            return this.layerActiveSurface;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurfaceInverted-0d7_KjU, reason: from getter */
        public long getLayerActiveSurfaceInverted() {
            return this.layerActiveSurfaceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor0-0d7_KjU, reason: from getter */
        public long getLayerFloor0() {
            return this.layerFloor0;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor0Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor0Inverted() {
            return this.layerFloor0Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1-0d7_KjU, reason: from getter */
        public long getLayerFloor1() {
            return this.layerFloor1;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor1Inverted() {
            return this.layerFloor1Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1OnDark-0d7_KjU, reason: from getter */
        public long getLayerFloor1OnDark() {
            return this.layerFloor1OnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2-0d7_KjU, reason: from getter */
        public long getLayerFloor2() {
            return this.layerFloor2;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor2Inverted() {
            return this.layerFloor2Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3-0d7_KjU, reason: from getter */
        public long getLayerFloor3() {
            return this.layerFloor3;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3Inverted-0d7_KjU, reason: from getter */
        public long getLayerFloor3Inverted() {
            return this.layerFloor3Inverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimming-0d7_KjU, reason: from getter */
        public long getLayerOverlayDimming() {
            return this.layerOverlayDimming;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimmingInverted-0d7_KjU, reason: from getter */
        public long getLayerOverlayDimmingInverted() {
            return this.layerOverlayDimmingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanja-0d7_KjU, reason: from getter */
        public long getLayerOverlayParanja() {
            return this.layerOverlayParanja;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanjaInverted-0d7_KjU, reason: from getter */
        public long getLayerOverlayParanjaInverted() {
            return this.layerOverlayParanjaInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurface-0d7_KjU, reason: from getter */
        public long getLayerSurface() {
            return this.layerSurface;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurfaceInverted-0d7_KjU, reason: from getter */
        public long getLayerSurfaceInverted() {
            return this.layerSurfaceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccent-0d7_KjU, reason: from getter */
        public long getTextAccent() {
            return this.textAccent;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentInverted-0d7_KjU, reason: from getter */
        public long getTextAccentInverted() {
            return this.textAccentInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentOnLight-0d7_KjU, reason: from getter */
        public long getTextAccentOnLight() {
            return this.textAccentOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAction-0d7_KjU, reason: from getter */
        public long getTextAction() {
            return this.textAction;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActionInverted-0d7_KjU, reason: from getter */
        public long getTextActionInverted() {
            return this.textActionInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActionOnDark-0d7_KjU, reason: from getter */
        public long getTextActionOnDark() {
            return this.textActionOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActionOnLight-0d7_KjU, reason: from getter */
        public long getTextActionOnLight() {
            return this.textActionOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAccent-0d7_KjU, reason: from getter */
        public long getTextActiveAccent() {
            return this.textActiveAccent;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAccentInverted-0d7_KjU, reason: from getter */
        public long getTextActiveAccentInverted() {
            return this.textActiveAccentInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAction-0d7_KjU, reason: from getter */
        public long getTextActiveAction() {
            return this.textActiveAction;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveActionInverted-0d7_KjU, reason: from getter */
        public long getTextActiveActionInverted() {
            return this.textActiveActionInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveApparel-0d7_KjU, reason: from getter */
        public long getTextActiveApparel() {
            return this.textActiveApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveApparelInverted-0d7_KjU, reason: from getter */
        public long getTextActiveApparelInverted() {
            return this.textActiveApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestprice-0d7_KjU, reason: from getter */
        public long getTextActiveBestprice() {
            return this.textActiveBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestpriceInverted-0d7_KjU, reason: from getter */
        public long getTextActiveBestpriceInverted() {
            return this.textActiveBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpress-0d7_KjU, reason: from getter */
        public long getTextActiveExpress() {
            return this.textActiveExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpressInverted-0d7_KjU, reason: from getter */
        public long getTextActiveExpressInverted() {
            return this.textActiveExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFresh-0d7_KjU, reason: from getter */
        public long getTextActiveFresh() {
            return this.textActiveFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFreshInverted-0d7_KjU, reason: from getter */
        public long getTextActiveFreshInverted() {
            return this.textActiveFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveMarketing-0d7_KjU, reason: from getter */
        public long getTextActiveMarketing() {
            return this.textActiveMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveMarketingInverted-0d7_KjU, reason: from getter */
        public long getTextActiveMarketingInverted() {
            return this.textActiveMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveNegative-0d7_KjU, reason: from getter */
        public long getTextActiveNegative() {
            return this.textActiveNegative;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveNegativeInverted-0d7_KjU, reason: from getter */
        public long getTextActiveNegativeInverted() {
            return this.textActiveNegativeInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveOzon-0d7_KjU, reason: from getter */
        public long getTextActiveOzon() {
            return this.textActiveOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePositive-0d7_KjU, reason: from getter */
        public long getTextActivePositive() {
            return this.textActivePositive;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePositiveInverted-0d7_KjU, reason: from getter */
        public long getTextActivePositiveInverted() {
            return this.textActivePositiveInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePremium-0d7_KjU, reason: from getter */
        public long getTextActivePremium() {
            return this.textActivePremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePremiumInverted-0d7_KjU, reason: from getter */
        public long getTextActivePremiumInverted() {
            return this.textActivePremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveWarning-0d7_KjU, reason: from getter */
        public long getTextActiveWarning() {
            return this.textActiveWarning;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveWarningInverted-0d7_KjU, reason: from getter */
        public long getTextActiveWarningInverted() {
            return this.textActiveWarningInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextApparel-0d7_KjU, reason: from getter */
        public long getTextApparel() {
            return this.textApparel;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextApparelInverted-0d7_KjU, reason: from getter */
        public long getTextApparelInverted() {
            return this.textApparelInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestprice-0d7_KjU, reason: from getter */
        public long getTextBestprice() {
            return this.textBestprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestpriceInverted-0d7_KjU, reason: from getter */
        public long getTextBestpriceInverted() {
            return this.textBestpriceInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDarkKey-0d7_KjU, reason: from getter */
        public long getTextDarkKey() {
            return this.textDarkKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDiscountUnavialable-0d7_KjU, reason: from getter */
        public long getTextDiscountUnavialable() {
            return this.textDiscountUnavialable;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextEconom-0d7_KjU, reason: from getter */
        public long getTextEconom() {
            return this.textEconom;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpress-0d7_KjU, reason: from getter */
        public long getTextExpress() {
            return this.textExpress;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressInverted-0d7_KjU, reason: from getter */
        public long getTextExpressInverted() {
            return this.textExpressInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressOnDark-0d7_KjU, reason: from getter */
        public long getTextExpressOnDark() {
            return this.textExpressOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFresh-0d7_KjU, reason: from getter */
        public long getTextFresh() {
            return this.textFresh;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshInverted-0d7_KjU, reason: from getter */
        public long getTextFreshInverted() {
            return this.textFreshInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshOnDark-0d7_KjU, reason: from getter */
        public long getTextFreshOnDark() {
            return this.textFreshOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextGuarantee-0d7_KjU, reason: from getter */
        public long getTextGuarantee() {
            return this.textGuarantee;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextLightKey-0d7_KjU, reason: from getter */
        public long getTextLightKey() {
            return this.textLightKey;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketing-0d7_KjU, reason: from getter */
        public long getTextMarketing() {
            return this.textMarketing;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingInverted-0d7_KjU, reason: from getter */
        public long getTextMarketingInverted() {
            return this.textMarketingInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnDark-0d7_KjU, reason: from getter */
        public long getTextMarketingOnDark() {
            return this.textMarketingOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnLight-0d7_KjU, reason: from getter */
        public long getTextMarketingOnLight() {
            return this.textMarketingOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegative-0d7_KjU, reason: from getter */
        public long getTextNegative() {
            return this.textNegative;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeInverted-0d7_KjU, reason: from getter */
        public long getTextNegativeInverted() {
            return this.textNegativeInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeOnDark-0d7_KjU, reason: from getter */
        public long getTextNegativeOnDark() {
            return this.textNegativeOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalprice-0d7_KjU, reason: from getter */
        public long getTextOriginalprice() {
            return this.textOriginalprice;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalpriceAvailable-0d7_KjU, reason: from getter */
        public long getTextOriginalpriceAvailable() {
            return this.textOriginalpriceAvailable;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOxford-0d7_KjU, reason: from getter */
        public long getTextOxford() {
            return this.textOxford;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOzon-0d7_KjU, reason: from getter */
        public long getTextOzon() {
            return this.textOzon;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositive-0d7_KjU, reason: from getter */
        public long getTextPositive() {
            return this.textPositive;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveInverted-0d7_KjU, reason: from getter */
        public long getTextPositiveInverted() {
            return this.textPositiveInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnDark-0d7_KjU, reason: from getter */
        public long getTextPositiveOnDark() {
            return this.textPositiveOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnLight-0d7_KjU, reason: from getter */
        public long getTextPositiveOnLight() {
            return this.textPositiveOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPremium-0d7_KjU, reason: from getter */
        public long getTextPremium() {
            return this.textPremium;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPremiumInverted-0d7_KjU, reason: from getter */
        public long getTextPremiumInverted() {
            return this.textPremiumInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimary-0d7_KjU, reason: from getter */
        public long getTextPrimary() {
            return this.textPrimary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryDynamic-0d7_KjU, reason: from getter */
        public long getTextPrimaryDynamic() {
            return this.textPrimaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getTextPrimaryDynamicInverted() {
            return this.textPrimaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryInverted-0d7_KjU, reason: from getter */
        public long getTextPrimaryInverted() {
            return this.textPrimaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnDark-0d7_KjU, reason: from getter */
        public long getTextPrimaryOnDark() {
            return this.textPrimaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnLight-0d7_KjU, reason: from getter */
        public long getTextPrimaryOnLight() {
            return this.textPrimaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondary-0d7_KjU, reason: from getter */
        public long getTextSecondary() {
            return this.textSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryDynamic-0d7_KjU, reason: from getter */
        public long getTextSecondaryDynamic() {
            return this.textSecondaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryDynamicInverted-0d7_KjU, reason: from getter */
        public long getTextSecondaryDynamicInverted() {
            return this.textSecondaryDynamicInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryInverted-0d7_KjU, reason: from getter */
        public long getTextSecondaryInverted() {
            return this.textSecondaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnDark-0d7_KjU, reason: from getter */
        public long getTextSecondaryOnDark() {
            return this.textSecondaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnLight-0d7_KjU, reason: from getter */
        public long getTextSecondaryOnLight() {
            return this.textSecondaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTech-0d7_KjU, reason: from getter */
        public long getTextTech() {
            return this.textTech;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiary-0d7_KjU, reason: from getter */
        public long getTextTertiary() {
            return this.textTertiary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryInverted-0d7_KjU, reason: from getter */
        public long getTextTertiaryInverted() {
            return this.textTertiaryInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnDark-0d7_KjU, reason: from getter */
        public long getTextTertiaryOnDark() {
            return this.textTertiaryOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnLight-0d7_KjU, reason: from getter */
        public long getTextTertiaryOnLight() {
            return this.textTertiaryOnLight;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextUltra-0d7_KjU, reason: from getter */
        public long getTextUltra() {
            return this.textUltra;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarning-0d7_KjU, reason: from getter */
        public long getTextWarning() {
            return this.textWarning;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningInverted-0d7_KjU, reason: from getter */
        public long getTextWarningInverted() {
            return this.textWarningInverted;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningOnDark-0d7_KjU, reason: from getter */
        public long getTextWarningOnDark() {
            return this.textWarningOnDark;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: isDark, reason: from getter */
        public boolean getIsDark() {
            return this.isDark;
        }
    };

    @NotNull
    public static final UniColorScheme getDefaultDarkUniColorScheme() {
        return DefaultDarkUniColorScheme;
    }

    @NotNull
    public static final UniColorScheme getDefaultLightUniColorScheme() {
        return DefaultLightUniColorScheme;
    }
}
