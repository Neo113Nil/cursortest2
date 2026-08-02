package ru.ozon.uni.ozi.theme;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniColorTokenExtKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\" \u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\f\"-\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/ozi/theme/OziColorScheme;", "DefaultLightOziColorScheme", "Lru/ozon/uni/ozi/theme/OziColorScheme;", "getDefaultLightOziColorScheme", "()Lru/ozon/uni/ozi/theme/OziColorScheme;", "getDefaultLightOziColorScheme$annotations", "()V", "", "Ll1/Z;", "lightColorList", "Ljava/util/List;", "getLightColorList", "()Ljava/util/List;", "getLightColorList$annotations", "", "", "oziLightColorsMap$delegate", "LSc/j;", "getOziLightColorsMap", "()Ljava/util/Map;", "getOziLightColorsMap$annotations", "oziLightColorsMap", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultLightOziColorSchemeKt {

    @NotNull
    private static final OziColorScheme DefaultLightOziColorScheme;

    @NotNull
    private static final List<C7807Z> lightColorList;

    @NotNull
    private static final InterfaceC4008j oziLightColorsMap$delegate;

    static {
        OziColorScheme oziColorScheme = new OziColorScheme() { // from class: ru.ozon.uni.ozi.theme.DefaultLightOziColorSchemeKt$DefaultLightOziColorScheme$1
            private final long activeBgActionPrimary;
            private final long activeBgActionSecondary;
            private final long activeBgActionSecondaryTransparent;
            private final long activeBgNegativePrimary;
            private final long activeBgNegativeSecondary;
            private final long activeBgNegativeSecondaryTransparent;
            private final long activeGraphicNegativePrimary;
            private final long activeGraphicPositivePrimary;
            private final long activeGraphicWarningPrimary;
            private final long activeTextAction;
            private final long activeTextPrimary;
            private final long bgAccentOnLight;
            private final long bgAccentPrimary;
            private final long bgAccentPrimaryInverted;
            private final long bgAccentSecondary;
            private final long bgAccentSecondaryInverted;
            private final long bgAccentSecondaryTransparent;
            private final long bgActionPrimary;
            private final long bgActionPrimaryInverted;
            private final long bgActionSecondary;
            private final long bgActionSecondaryInverted;
            private final long bgActionSecondarySolid;
            private final long bgActionSecondaryTransparent;
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
            private final long bgNegativeSecondaryTransparent;
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
            private final long bgPositiveSecondaryTransparent;
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
            private final long bgSecondaryTransparent;
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
            private final long bgWarningSecondaryTransparent;
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
            private final OziColorConfig colorConfig;
            private final long detectorColorMine;
            private final long extraBgEconomPrimary;
            private final long extraBgEconomSecondary;
            private final long extraBgEconomSecondaryTransparent;
            private final long extraBgExpressPrimary;
            private final long extraBgExpressSecondary;
            private final long extraBgExpressSecondaryTransparent;
            private final long extraBgFreshPrimary;
            private final long extraBgFreshSecondary;
            private final long extraBgFreshSecondaryTransparent;
            private final long extraBgMarketingPrimary;
            private final long extraBgMarketingSecondary;
            private final long extraBgMarketingSecondaryTransparent;
            private final long extraBgPremiumPrimary;
            private final long extraBgPremiumSecondaryTransparent;
            private final long extraGraphicEconom;
            private final long extraGraphicExpress;
            private final long extraGraphicFresh;
            private final long extraGraphicMarketing;
            private final long extraGraphicPremium;
            private final long extraTextEconom;
            private final long extraTextExpress;
            private final long extraTextFresh;
            private final long extraTextMarketing;
            private final long extraTextPremium;
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
            private final long graphicDisabledTransparent;
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
            private final long graphicNeutralTransparent;
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
            private final long graphicQuaternaryTransparent;
            private final long graphicRating;
            private final long graphicRatingInverted;
            private final long graphicSecondary;
            private final long graphicSecondaryDynamic;
            private final long graphicSecondaryDynamicInverted;
            private final long graphicSecondaryInverted;
            private final long graphicSecondaryOnDark;
            private final long graphicSecondaryOnLight;
            private final long graphicSecondaryTransparent;
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
            private final long graphicTertiaryTransparent;
            private final long graphicUltraPrimary;
            private final long graphicWarningOnDark;
            private final long graphicWarningPrimary;
            private final long graphicWarningPrimaryInverted;
            private final long graphicWarningPrimaryOnLight;
            private final long invertedBgActionPrimary;
            private final long invertedBgPrimary;
            private final long invertedBgSecondaryTransparent;
            private final long invertedGraphicPrimary;
            private final long invertedGraphicSecondaryTransparent;
            private final long invertedGraphicTertiaryTransparent;
            private final long invertedLayerFloor2;
            private final long invertedTextAction;
            private final long invertedTextPrimary;
            private final long invertedTextSecondaryTransparent;
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
            private final long layerOverlayDimmingTransparent;
            private final long layerOverlayParanja;
            private final long layerOverlayParanjaInverted;
            private final long layerOverlayParanjaTransparent;
            private final long layerSurface;
            private final long layerSurfaceInverted;
            private final long layerSurfaceTransparent;
            private final long staticBgDarkKey;
            private final long staticBgLightKey;
            private final long staticClearDarkKey100Transparent;
            private final long staticClearDarkKey200Transparent;
            private final long staticClearDarkKey300Transparent;
            private final long staticClearDarkKey400Transparent;
            private final long staticClearDarkKey500Transparent;
            private final long staticClearDarkKey600Transparent;
            private final long staticClearDarkKey700Transparent;
            private final long staticClearDarkKey800Transparent;
            private final long staticClearLightKey0Transparent;
            private final long staticClearLightKey100Transparent;
            private final long staticClearLightKey200Transparent;
            private final long staticClearLightKey300Transparent;
            private final long staticClearLightKey400Transparent;
            private final long staticClearLightKey500Transparent;
            private final long staticClearLightKey600Transparent;
            private final long staticClearLightKey700Transparent;
            private final long staticClearLightKey800Transparent;
            private final long staticDetectorColorMine;
            private final long staticGraphicActionOnDark;
            private final long staticGraphicActionOnLight;
            private final long staticGraphicDarkKey;
            private final long staticGraphicDarkerNeutralOnLight;
            private final long staticGraphicDisabledOnDarkTransparent;
            private final long staticGraphicDisabledOnLight;
            private final long staticGraphicLightKey;
            private final long staticGraphicNeutralOnDarkTransparent;
            private final long staticGraphicNeutralOnLight;
            private final long staticGraphicPrimaryOnDarkTransparent;
            private final long staticGraphicPrimaryOnLight;
            private final long staticGraphicSecondaryOnDarkTransparent;
            private final long staticGraphicSecondaryOnLightTransparent;
            private final long staticGraphicSolidNeutral;
            private final long staticGraphicTertiaryOnDarkTransparent;
            private final long staticGraphicTertiaryOnLightTransparent;
            private final long staticTextActionOnDark;
            private final long staticTextActionOnLight;
            private final long staticTextDarkKey;
            private final long staticTextLightKey;
            private final long staticTextPrimaryOnDark;
            private final long staticTextPrimaryOnLight;
            private final long staticTextSecondaryOnDarkTransparent;
            private final long staticTextSecondaryOnLightTransparent;
            private final long staticTextTertiaryOnDarkTransparent;
            private final long staticTextTertiaryOnLightTransparent;
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
            private final long textSecondaryTransparent;
            private final long textTech;
            private final long textTertiary;
            private final long textTertiaryInverted;
            private final long textTertiaryOnDark;
            private final long textTertiaryOnLight;
            private final long textTertiaryTransparent;
            private final long textUltra;
            private final long textWarning;
            private final long textWarningInverted;
            private final long textWarningOnDark;

            {
                UniTheme uniTheme = UniTheme.INSTANCE;
                this.detectorColorMine = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getDetectorColorMine());
                this.bgAccentOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAccentOnLight());
                this.bgDarkKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgDarkKey());
                this.bgLightKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgLightKey());
                this.bgMarketingOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingOnLight());
                this.bgPositiveOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPositiveOnLight());
                this.bgWarningOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgWarningOnLight());
                this.clearDarkKey100 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey100());
                this.clearDarkKey200 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey200());
                this.clearDarkKey300 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey300());
                this.clearDarkKey400 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey400());
                this.clearDarkKey500 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey500());
                this.clearDarkKey600 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey600());
                this.clearDarkKey700 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey700());
                this.clearDarkKey800 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey800());
                this.clearLightKey0 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey0());
                this.clearLightKey100 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey100());
                this.clearLightKey200 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey200());
                this.clearLightKey300 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey300());
                this.clearLightKey400 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey400());
                this.clearLightKey500 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey500());
                this.clearLightKey600 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey600());
                this.clearLightKey700 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey700());
                this.clearLightKey800 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey800());
                this.graphicAccentOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicAccentOnLight());
                this.graphicActionOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActionOnDark());
                this.graphicActionOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActionOnLight());
                this.graphicDarkKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDarkKey());
                this.graphicDarkerNeutralOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDarkerNeutralOnLight());
                this.graphicDisabledOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabledOnDark());
                this.graphicDisabledOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabledOnLight());
                this.graphicExpressOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicExpressOnDark());
                this.graphicFreshOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicFreshOnDark());
                this.graphicLightKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicLightKey());
                this.graphicMarketingOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicMarketingOnDark());
                this.graphicMarketingOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicMarketingOnLight());
                this.graphicNegativeOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNegativeOnDark());
                this.graphicNeutralOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutralOnDark());
                this.graphicNeutralOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutralOnLight());
                this.graphicOverlapPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicOverlapPrimary());
                this.graphicOverlapPrimaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicOverlapPrimaryDynamic());
                this.graphicPositiveOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPositiveOnDark());
                this.graphicPositivePrimaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPositivePrimaryOnLight());
                this.graphicPrimaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryOnDark());
                this.graphicPrimaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryOnLight());
                this.graphicSecondaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryOnDark());
                this.graphicSecondaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryOnLight());
                this.graphicSolidNeutral = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSolidNeutral());
                this.graphicTertiaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryOnDark());
                this.graphicTertiaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryOnLight());
                this.graphicWarningOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicWarningOnDark());
                this.graphicWarningPrimaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicWarningPrimaryOnLight());
                this.layerFloor1OnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor1OnDark());
                this.textAccentOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextAccentOnLight());
                this.textActionOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionOnDark());
                this.textActionOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionOnLight());
                this.textDarkKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextDarkKey());
                this.textExpressOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextExpressOnDark());
                this.textFreshOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextFreshOnDark());
                this.textLightKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextLightKey());
                this.textMarketingOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextMarketingOnDark());
                this.textMarketingOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextMarketingOnLight());
                this.textNegativeOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextNegativeOnDark());
                this.textPositiveOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPositiveOnDark());
                this.textPositiveOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPositiveOnLight());
                this.textPrimaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryOnDark());
                this.textPrimaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryOnLight());
                this.textSecondaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryOnDark());
                this.textSecondaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryOnLight());
                this.textTertiaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiaryOnDark());
                this.textTertiaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiaryOnLight());
                this.textWarningOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextWarningOnDark());
                this.bgAccentPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAccentPrimary());
                this.bgAccentPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAccentPrimaryInverted());
                this.bgAccentSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueAccentSecondary());
                this.bgAccentSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAccentSecondaryInverted());
                this.bgActionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActionPrimary());
                this.bgActionPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActionPrimaryInverted());
                this.bgActionSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueActionSecondary());
                this.bgActionSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActionSecondaryInverted());
                this.bgActionSecondarySolid = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActionSecondarySolid());
                this.bgActiveAccentPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveAccentPrimary());
                this.bgActiveAccentPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveAccentPrimaryInverted());
                this.bgActiveAccentSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveAccentSecondary());
                this.bgActiveAccentSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveAccentSecondaryInverted());
                this.bgActiveActionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionPrimary());
                this.bgActiveActionPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionPrimaryInverted());
                this.bgActiveActionSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionSecondary());
                this.bgActiveActionSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionSecondaryInverted());
                this.bgActiveApparelPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveApparelPrimary());
                this.bgActiveApparelPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveApparelPrimaryInverted());
                this.bgActiveApparelSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveApparelSecondary());
                this.bgActiveApparelSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveApparelSecondaryInverted());
                this.bgActiveAquaPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveAquaPrimary());
                this.bgActiveBestpricePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveBestpricePrimary());
                this.bgActiveBestpricePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveBestpricePrimaryInverted());
                this.bgActiveBestpriceSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveBestpriceSecondary());
                this.bgActiveBestpriceSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveBestpriceSecondaryInverted());
                this.bgActiveEconomPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveEconomPrimary());
                this.bgActiveEconomSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveEconomSecondary());
                this.bgActiveExpressPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveExpressPrimary());
                this.bgActiveExpressPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveExpressPrimaryInverted());
                this.bgActiveExpressSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveExpressSecondary());
                this.bgActiveExpressSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveExpressSecondaryInverted());
                this.bgActiveFreshPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveFreshPrimary());
                this.bgActiveFreshPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveFreshPrimaryInverted());
                this.bgActiveFreshSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveFreshSecondary());
                this.bgActiveFreshSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveFreshSecondaryInverted());
                this.bgActiveMarketingPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveMarketingPrimary());
                this.bgActiveMarketingPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveMarketingPrimaryInverted());
                this.bgActiveMarketingSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveMarketingSecondary());
                this.bgActiveMarketingSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveMarketingSecondaryInverted());
                this.bgActiveNegativePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativePrimary());
                this.bgActiveNegativePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativePrimaryInverted());
                this.bgActiveNegativeSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativeSecondary());
                this.bgActiveNegativeSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativeSecondaryInverted());
                this.bgActiveOzonPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveOzonPrimary());
                this.bgActiveOzonSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveOzonSecondary());
                this.bgActivePositivePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePositivePrimary());
                this.bgActivePositivePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePositivePrimaryInverted());
                this.bgActivePositiveSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePositiveSecondary());
                this.bgActivePositiveSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePositiveSecondaryInverted());
                this.bgActivePremiumPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePremiumPrimary());
                this.bgActivePremiumPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePremiumPrimaryInverted());
                this.bgActivePremiumSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePremiumSecondary());
                this.bgActivePremiumSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePremiumSecondaryInverted());
                this.bgActivePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePrimary());
                this.bgActivePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActivePrimaryInverted());
                this.bgActiveSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveSecondary());
                this.bgActiveSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveSecondaryInverted());
                this.bgActiveSelect = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveSelect());
                this.bgActiveSelectInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveSelectInverted());
                this.bgActiveWarningPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveWarningPrimary());
                this.bgActiveWarningPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveWarningPrimaryInverted());
                this.bgActiveWarningSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveWarningSecondary());
                this.bgActiveWarningSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveWarningSecondaryInverted());
                this.bgApparelPiggy = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgApparelPiggy());
                this.bgApparelPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgApparelPrimary());
                this.bgApparelPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgApparelPrimaryInverted());
                this.bgApparelSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgApparelSecondary());
                this.bgApparelSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgApparelSecondaryInverted());
                this.bgAquaPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAquaPrimary());
                this.bgAttentionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAttentionPrimary());
                this.bgBestpricePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgBestpricePrimary());
                this.bgBestpricePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgBestpricePrimaryInverted());
                this.bgBestpriceSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgBestpriceSecondary());
                this.bgBestpriceSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgBestpriceSecondaryInverted());
                this.bgControl = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgControl());
                this.bgControlInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgControlInverted());
                this.bgDarkCerulean = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgDarkCerulean());
                this.bgDoubtfullPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgDoubtfullPrimary());
                this.bgEconomPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgEconomPrimary());
                this.bgEconomSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgEconomSecondary());
                this.bgExpressPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressPrimary());
                this.bgExpressPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressPrimaryInverted());
                this.bgExpressSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressSecondary());
                this.bgExpressSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressSecondaryInverted());
                this.bgFreshPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgFreshPrimary());
                this.bgFreshPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgFreshPrimaryInverted());
                this.bgFreshSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgFreshSecondary());
                this.bgFreshSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgFreshSecondaryInverted());
                this.bgGuaranteePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgGuaranteePrimary());
                this.bgInstalmentPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgInstalmentPrimary());
                this.bgInstalmentSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgInstalmentSecondary());
                this.bgMarketingPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingPrimary());
                this.bgMarketingPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingPrimaryInverted());
                this.bgMarketingSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingSecondary());
                this.bgMarketingSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingSecondaryInverted());
                this.bgMarketingSecondarySolid = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingSecondarySolid());
                this.bgNegativePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgNegativePrimary());
                this.bgNegativePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgNegativePrimaryInverted());
                this.bgNegativeSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueNegativeSecondary());
                this.bgNegativeSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgNegativeSecondaryInverted());
                this.bgOpaqueAccentSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueAccentSecondary());
                this.bgOpaqueActionSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueActionSecondary());
                this.bgOpaqueApparelSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueApparelSecondary());
                this.bgOpaqueEconomSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueEconomSecondary());
                this.bgOpaqueFreshSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueFreshSecondary());
                this.bgOpaqueMarketingSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueMarketingSecondary());
                this.bgOpaqueNegativeSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueNegativeSecondary());
                this.bgOpaqueOzonSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueOzonSecondary());
                this.bgOpaquePositiveSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaquePositiveSecondary());
                this.bgOpaqueSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueSecondary());
                this.bgOpaqueWarningSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueWarningSecondary());
                this.bgOverlap = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOverlap());
                this.bgOverlapInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOverlapInverted());
                this.bgOxford = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOxford());
                this.bgOzonPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOzonPrimary());
                this.bgOzonSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOzonSecondary());
                this.bgPositivePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPositivePrimary());
                this.bgPositivePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPositivePrimaryInverted());
                this.bgPositiveSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaquePositiveSecondary());
                this.bgPositiveSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPositiveSecondaryInverted());
                this.bgPremiumPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPremiumPrimary());
                this.bgPremiumPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPremiumPrimaryInverted());
                this.bgPremiumSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPremiumSecondary());
                this.bgPremiumSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPremiumSecondaryInverted());
                this.bgPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPrimary());
                this.bgPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPrimaryInverted());
                this.bgPrussian = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPrussian());
                this.bgSbp = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSbp());
                this.bgSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSecondary());
                this.bgSecondaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSecondaryDynamic());
                this.bgSecondaryDynamicInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSecondaryDynamicInverted());
                this.bgSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSecondaryInverted());
                this.bgSelect = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSelect());
                this.bgSelectInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSelectInverted());
                this.bgTabbarPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgTabbarPrimary());
                this.bgTech = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgTech());
                this.bgUltraPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgUltraPrimary());
                this.bgWarningPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgWarningPrimary());
                this.bgWarningPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgWarningPrimaryInverted());
                this.bgWarningSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueWarningSecondary());
                this.bgWarningSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgWarningSecondaryInverted());
                this.graphicAccentPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicAccentPrimary());
                this.graphicAccentPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicAccentPrimaryInverted());
                this.graphicActionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActionPrimary());
                this.graphicActionPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActionPrimaryInverted());
                this.graphicActiveAccentPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveAccentPrimary());
                this.graphicActiveAccentPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveAccentPrimaryInverted());
                this.graphicActiveActionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveActionPrimary());
                this.graphicActiveActionPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveActionPrimaryInverted());
                this.graphicActiveApparel = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveApparel());
                this.graphicActiveApparelInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveApparelInverted());
                this.graphicActiveBestprice = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveBestprice());
                this.graphicActiveBestpriceInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveBestpriceInverted());
                this.graphicActiveEconom = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveEconom());
                this.graphicActiveExpress = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveExpress());
                this.graphicActiveExpressInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveExpressInverted());
                this.graphicActiveFresh = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveFresh());
                this.graphicActiveFreshInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveFreshInverted());
                this.graphicActiveMarketing = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveMarketing());
                this.graphicActiveMarketingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveMarketingInverted());
                this.graphicActiveNegativePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveNegativePrimary());
                this.graphicActiveNegativePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveNegativePrimaryInverted());
                this.graphicActiveOzon = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveOzon());
                this.graphicActivePositivePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActivePositivePrimary());
                this.graphicActivePositivePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActivePositivePrimaryInverted());
                this.graphicActivePremium = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActivePremium());
                this.graphicActivePremiumBlue = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActivePremiumBlue());
                this.graphicActivePremiumInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActivePremiumInverted());
                this.graphicActiveRating = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveRating());
                this.graphicActiveRatingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveRatingInverted());
                this.graphicActiveWarningPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveWarningPrimary());
                this.graphicActiveWarningPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveWarningPrimaryInverted());
                this.graphicApparel = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicApparel());
                this.graphicApparelInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicApparelInverted());
                this.graphicBestprice = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicBestprice());
                this.graphicBestpriceInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicBestpriceInverted());
                this.graphicDisabled = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabled());
                this.graphicDisabledInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabledInverted());
                this.graphicEconom = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicEconom());
                this.graphicExpress = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicExpress());
                this.graphicExpressInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicExpressInverted());
                this.graphicFintechGracePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicFintechGracePrimary());
                this.graphicFintechGraceSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicFintechGraceSecondary());
                this.graphicFresh = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicFresh());
                this.graphicFreshInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicFreshInverted());
                this.graphicGuarantee = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicGuarantee());
                this.graphicKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicKey());
                this.graphicKeyInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicKeyInverted());
                this.graphicMarketing = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicMarketing());
                this.graphicMarketingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicMarketingInverted());
                this.graphicNegativePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNegativePrimary());
                this.graphicNegativePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNegativePrimaryInverted());
                this.graphicNeutral = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutral());
                this.graphicNeutralInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutralInverted());
                this.graphicOxford = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicOxford());
                this.graphicOzon = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicOzon());
                this.graphicPositivePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPositivePrimary());
                this.graphicPositivePrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPositivePrimaryInverted());
                this.graphicPositiveSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPositiveSecondary());
                this.graphicPremium = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPremium());
                this.graphicPremiumBlue = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPremiumBlue());
                this.graphicPremiumInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPremiumInverted());
                this.graphicPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimary());
                this.graphicPrimaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryDynamic());
                this.graphicPrimaryDynamicInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryDynamicInverted());
                this.graphicPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryInverted());
                this.graphicQuaternary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicQuaternary());
                this.graphicRating = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicRating());
                this.graphicRatingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicRatingInverted());
                this.graphicSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondary());
                this.graphicSecondaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryDynamic());
                this.graphicSecondaryDynamicInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryDynamicInverted());
                this.graphicSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryInverted());
                this.graphicStrokeSticky = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicStrokeSticky());
                this.graphicTabbarIconPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTabbarIconPrimary());
                this.graphicTabbarIconSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTabbarIconSecondary());
                this.graphicTech = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTech());
                this.graphicTertiary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiary());
                this.graphicTertiaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryDynamic());
                this.graphicTertiaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryInverted());
                this.graphicUltraPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicUltraPrimary());
                this.graphicWarningPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicWarningPrimary());
                this.graphicWarningPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicWarningPrimaryInverted());
                this.layerActiveFloor0 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor0());
                this.layerActiveFloor1 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor1());
                this.layerActiveFloor1Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor1Inverted());
                this.layerActiveFloor2 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor2());
                this.layerActiveFloor2Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor2Inverted());
                this.layerActiveFloor3 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor3());
                this.layerActiveFloor3Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveFloor3Inverted());
                this.layerActiveSurface = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveSurface());
                this.layerActiveSurfaceInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerActiveSurfaceInverted());
                this.layerFloor0 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor0());
                this.layerFloor0Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor0Inverted());
                this.layerFloor1 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor1());
                this.layerFloor1Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor1Inverted());
                this.layerFloor2 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor2());
                this.layerFloor2Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor2Inverted());
                this.layerFloor3 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor3());
                this.layerFloor3Inverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor3Inverted());
                this.layerOverlayDimming = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerOverlayDimming());
                this.layerOverlayDimmingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerOverlayDimmingInverted());
                this.layerOverlayParanja = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerOverlayParanja());
                this.layerOverlayParanjaInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerOverlayParanjaInverted());
                this.layerSurface = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerSurface());
                this.layerSurfaceInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerSurfaceInverted());
                this.textAccent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextAccent());
                this.textAccentInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextAccentInverted());
                this.textAction = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextAction());
                this.textActionInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionInverted());
                this.textActiveAccent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveAccent());
                this.textActiveAccentInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveAccentInverted());
                this.textActiveAction = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveAction());
                this.textActiveActionInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveActionInverted());
                this.textActiveApparel = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveApparel());
                this.textActiveApparelInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveApparelInverted());
                this.textActiveBestprice = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveBestprice());
                this.textActiveBestpriceInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveBestpriceInverted());
                this.textActiveExpress = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveExpress());
                this.textActiveExpressInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveExpressInverted());
                this.textActiveFresh = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveFresh());
                this.textActiveFreshInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveFreshInverted());
                this.textActiveMarketing = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveMarketing());
                this.textActiveMarketingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveMarketingInverted());
                this.textActiveNegative = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveNegative());
                this.textActiveNegativeInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveNegativeInverted());
                this.textActiveOzon = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveOzon());
                this.textActivePositive = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActivePositive());
                this.textActivePositiveInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActivePositiveInverted());
                this.textActivePremium = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActivePremium());
                this.textActivePremiumInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActivePremiumInverted());
                this.textActiveWarning = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveWarning());
                this.textActiveWarningInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActiveWarningInverted());
                this.textApparel = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextApparel());
                this.textApparelInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextApparelInverted());
                this.textBestprice = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextBestprice());
                this.textBestpriceInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextBestpriceInverted());
                this.textDiscountUnavialable = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextDiscountUnavialable());
                this.textEconom = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextEconom());
                this.textExpress = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextExpress());
                this.textExpressInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextExpressInverted());
                this.textFresh = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextFresh());
                this.textFreshInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextFreshInverted());
                this.textGuarantee = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextGuarantee());
                this.textMarketing = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextMarketing());
                this.textMarketingInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextMarketingInverted());
                this.textNegative = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextNegative());
                this.textNegativeInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextNegativeInverted());
                this.textOriginalprice = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextOriginalprice());
                this.textOriginalpriceAvailable = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextOriginalpriceAvailable());
                this.textOxford = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextOxford());
                this.textOzon = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextOzon());
                this.textPositive = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPositive());
                this.textPositiveInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPositiveInverted());
                this.textPremium = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPremium());
                this.textPremiumInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPremiumInverted());
                this.textPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimary());
                this.textPrimaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryDynamic());
                this.textPrimaryDynamicInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryDynamicInverted());
                this.textPrimaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryInverted());
                this.textSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondary());
                this.textSecondaryDynamic = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryDynamic());
                this.textSecondaryDynamicInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryDynamicInverted());
                this.textSecondaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryInverted());
                this.textTech = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTech());
                this.textTertiary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiary());
                this.textTertiaryInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiaryInverted());
                this.textUltra = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextUltra());
                this.textWarning = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextWarning());
                this.textWarningInverted = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextWarningInverted());
                this.textSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondary());
                this.textTertiaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiary());
                this.graphicSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondary());
                this.graphicTertiaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiary());
                this.graphicQuaternaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicQuaternary());
                this.graphicNeutralTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutral());
                this.graphicDisabledTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabled());
                this.bgSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSecondary());
                this.bgActionSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActionSecondary());
                this.bgAccentSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgAccentSecondary());
                this.bgPositiveSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPositiveSecondary());
                this.bgWarningSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgWarningSecondary());
                this.bgNegativeSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgNegativeSecondary());
                this.layerSurfaceTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerSurface());
                this.layerOverlayDimmingTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerOverlayDimming());
                this.layerOverlayParanjaTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerOverlayParanja());
                this.invertedTextPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryInverted());
                this.invertedTextSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryInverted());
                this.invertedTextAction = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionInverted());
                this.invertedGraphicPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryInverted());
                this.invertedGraphicSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryInverted());
                this.invertedGraphicTertiaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryInverted());
                this.invertedBgPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPrimaryInverted());
                this.invertedBgSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgSecondaryInverted());
                this.invertedBgActionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActionPrimaryInverted());
                this.invertedLayerFloor2 = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getLayerFloor2Inverted());
                this.extraTextFresh = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextFresh());
                this.extraTextExpress = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextExpress());
                this.extraTextMarketing = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextMarketing());
                this.extraTextPremium = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPremium());
                this.extraTextEconom = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextEconom());
                this.extraGraphicFresh = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicFresh());
                this.extraGraphicExpress = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicExpress());
                this.extraGraphicMarketing = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicMarketing());
                this.extraGraphicPremium = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPremium());
                this.extraGraphicEconom = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicEconom());
                this.extraBgFreshPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgFreshPrimary());
                this.extraBgFreshSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueFreshSecondary());
                this.extraBgFreshSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgFreshSecondary());
                this.extraBgExpressPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressPrimary());
                this.extraBgExpressSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressSecondary());
                this.extraBgExpressSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgExpressSecondary());
                this.extraBgMarketingPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingPrimary());
                this.extraBgMarketingSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueMarketingSecondary());
                this.extraBgMarketingSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgMarketingSecondary());
                this.extraBgPremiumPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPremiumPrimary());
                this.extraBgPremiumSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgPremiumSecondary());
                this.extraBgEconomPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgEconomPrimary());
                this.extraBgEconomSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgOpaqueEconomSecondary());
                this.extraBgEconomSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgEconomSecondary());
                this.staticTextDarkKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextDarkKey());
                this.staticTextPrimaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryOnLight());
                this.staticTextSecondaryOnLightTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryOnLight());
                this.staticTextTertiaryOnLightTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiaryOnLight());
                this.staticTextActionOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionOnLight());
                this.staticTextLightKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextLightKey());
                this.staticTextPrimaryOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextPrimaryOnDark());
                this.staticTextSecondaryOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextSecondaryOnDark());
                this.staticTextTertiaryOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiaryOnDark());
                this.staticTextActionOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionOnDark());
                this.staticGraphicDarkKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDarkKey());
                this.staticGraphicPrimaryOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryOnLight());
                this.staticGraphicSecondaryOnLightTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryOnLight());
                this.staticGraphicTertiaryOnLightTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryOnLight());
                this.staticGraphicSolidNeutral = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSolidNeutral());
                this.staticGraphicActionOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActionOnLight());
                this.staticGraphicDarkerNeutralOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDarkerNeutralOnLight());
                this.staticGraphicNeutralOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutralOnLight());
                this.staticGraphicDisabledOnLight = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabledOnLight());
                this.staticGraphicLightKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicLightKey());
                this.staticGraphicPrimaryOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicPrimaryOnDark());
                this.staticGraphicSecondaryOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicSecondaryOnDark());
                this.staticGraphicTertiaryOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicTertiaryOnDark());
                this.staticGraphicNeutralOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicNeutralOnDark());
                this.staticGraphicDisabledOnDarkTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicDisabledOnDark());
                this.staticGraphicActionOnDark = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActionOnDark());
                this.staticBgLightKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgLightKey());
                this.staticBgDarkKey = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgDarkKey());
                this.staticClearDarkKey800Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey800());
                this.staticClearDarkKey700Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey700());
                this.staticClearDarkKey600Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey600());
                this.staticClearDarkKey500Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey500());
                this.staticClearDarkKey400Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey400());
                this.staticClearDarkKey300Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey300());
                this.staticClearDarkKey200Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey200());
                this.staticClearDarkKey100Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearDarkKey100());
                this.staticClearLightKey800Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey800());
                this.staticClearLightKey700Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey700());
                this.staticClearLightKey600Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey600());
                this.staticClearLightKey500Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey500());
                this.staticClearLightKey400Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey400());
                this.staticClearLightKey300Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey300());
                this.staticClearLightKey200Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey200());
                this.staticClearLightKey100Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey100());
                this.staticClearLightKey0Transparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getClearLightKey0());
                this.staticDetectorColorMine = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getDetectorColorMine());
                this.activeTextPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextTertiary());
                this.activeTextAction = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getTextActionInverted());
                this.activeGraphicPositivePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActivePositivePrimary());
                this.activeGraphicWarningPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveWarningPrimary());
                this.activeGraphicNegativePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getGraphicActiveNegativePrimary());
                this.activeBgActionPrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionPrimary());
                this.activeBgActionSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionSecondary());
                this.activeBgActionSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveActionSecondary());
                this.activeBgNegativePrimary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativePrimary());
                this.activeBgNegativeSecondary = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativeSecondary());
                this.activeBgNegativeSecondaryTransparent = UniColorTokenExtKt.getLightColor(uniTheme.getColorTokens().getBgActiveNegativeSecondary());
                this.colorConfig = new OziColorConfig(null, OziColorTheme.Light, 1, null);
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgActionPrimary-0d7_KjU, reason: from getter */
            public long getActiveBgActionPrimary() {
                return this.activeBgActionPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgActionSecondary-0d7_KjU, reason: from getter */
            public long getActiveBgActionSecondary() {
                return this.activeBgActionSecondary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgActionSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getActiveBgActionSecondaryTransparent() {
                return this.activeBgActionSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativePrimary-0d7_KjU, reason: from getter */
            public long getActiveBgNegativePrimary() {
                return this.activeBgNegativePrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativeSecondary-0d7_KjU, reason: from getter */
            public long getActiveBgNegativeSecondary() {
                return this.activeBgNegativeSecondary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativeSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getActiveBgNegativeSecondaryTransparent() {
                return this.activeBgNegativeSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicNegativePrimary-0d7_KjU, reason: from getter */
            public long getActiveGraphicNegativePrimary() {
                return this.activeGraphicNegativePrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicPositivePrimary-0d7_KjU, reason: from getter */
            public long getActiveGraphicPositivePrimary() {
                return this.activeGraphicPositivePrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicWarningPrimary-0d7_KjU, reason: from getter */
            public long getActiveGraphicWarningPrimary() {
                return this.activeGraphicWarningPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveTextAction-0d7_KjU, reason: from getter */
            public long getActiveTextAction() {
                return this.activeTextAction;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveTextPrimary-0d7_KjU, reason: from getter */
            public long getActiveTextPrimary() {
                return this.activeTextPrimary;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgAccentSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getBgAccentSecondaryTransparent() {
                return this.bgAccentSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgActionSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getBgActionSecondaryTransparent() {
                return this.bgActionSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgNegativeSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getBgNegativeSecondaryTransparent() {
                return this.bgNegativeSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgPositiveSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getBgPositiveSecondaryTransparent() {
                return this.bgPositiveSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getBgSecondaryTransparent() {
                return this.bgSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgWarningSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getBgWarningSecondaryTransparent() {
                return this.bgWarningSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            public OziColorConfig getColorConfig() {
                return this.colorConfig;
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getDetectorColorMine-0d7_KjU, reason: from getter */
            public long getDetectorColorMine() {
                return this.detectorColorMine;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomPrimary-0d7_KjU, reason: from getter */
            public long getExtraBgEconomPrimary() {
                return this.extraBgEconomPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomSecondary-0d7_KjU, reason: from getter */
            public long getExtraBgEconomSecondary() {
                return this.extraBgEconomSecondary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getExtraBgEconomSecondaryTransparent() {
                return this.extraBgEconomSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressPrimary-0d7_KjU, reason: from getter */
            public long getExtraBgExpressPrimary() {
                return this.extraBgExpressPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressSecondary-0d7_KjU, reason: from getter */
            public long getExtraBgExpressSecondary() {
                return this.extraBgExpressSecondary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getExtraBgExpressSecondaryTransparent() {
                return this.extraBgExpressSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshPrimary-0d7_KjU, reason: from getter */
            public long getExtraBgFreshPrimary() {
                return this.extraBgFreshPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshSecondary-0d7_KjU, reason: from getter */
            public long getExtraBgFreshSecondary() {
                return this.extraBgFreshSecondary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getExtraBgFreshSecondaryTransparent() {
                return this.extraBgFreshSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingPrimary-0d7_KjU, reason: from getter */
            public long getExtraBgMarketingPrimary() {
                return this.extraBgMarketingPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingSecondary-0d7_KjU, reason: from getter */
            public long getExtraBgMarketingSecondary() {
                return this.extraBgMarketingSecondary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getExtraBgMarketingSecondaryTransparent() {
                return this.extraBgMarketingSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgPremiumPrimary-0d7_KjU, reason: from getter */
            public long getExtraBgPremiumPrimary() {
                return this.extraBgPremiumPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgPremiumSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getExtraBgPremiumSecondaryTransparent() {
                return this.extraBgPremiumSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicEconom-0d7_KjU, reason: from getter */
            public long getExtraGraphicEconom() {
                return this.extraGraphicEconom;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicExpress-0d7_KjU, reason: from getter */
            public long getExtraGraphicExpress() {
                return this.extraGraphicExpress;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicFresh-0d7_KjU, reason: from getter */
            public long getExtraGraphicFresh() {
                return this.extraGraphicFresh;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicMarketing-0d7_KjU, reason: from getter */
            public long getExtraGraphicMarketing() {
                return this.extraGraphicMarketing;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicPremium-0d7_KjU, reason: from getter */
            public long getExtraGraphicPremium() {
                return this.extraGraphicPremium;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextEconom-0d7_KjU, reason: from getter */
            public long getExtraTextEconom() {
                return this.extraTextEconom;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextExpress-0d7_KjU, reason: from getter */
            public long getExtraTextExpress() {
                return this.extraTextExpress;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextFresh-0d7_KjU, reason: from getter */
            public long getExtraTextFresh() {
                return this.extraTextFresh;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextMarketing-0d7_KjU, reason: from getter */
            public long getExtraTextMarketing() {
                return this.extraTextMarketing;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextPremium-0d7_KjU, reason: from getter */
            public long getExtraTextPremium() {
                return this.extraTextPremium;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicDisabledTransparent-0d7_KjU, reason: from getter */
            public long getGraphicDisabledTransparent() {
                return this.graphicDisabledTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicNeutralTransparent-0d7_KjU, reason: from getter */
            public long getGraphicNeutralTransparent() {
                return this.graphicNeutralTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicQuaternaryTransparent-0d7_KjU, reason: from getter */
            public long getGraphicQuaternaryTransparent() {
                return this.graphicQuaternaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getGraphicSecondaryTransparent() {
                return this.graphicSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicTertiaryTransparent-0d7_KjU, reason: from getter */
            public long getGraphicTertiaryTransparent() {
                return this.graphicTertiaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgActionPrimary-0d7_KjU, reason: from getter */
            public long getInvertedBgActionPrimary() {
                return this.invertedBgActionPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgPrimary-0d7_KjU, reason: from getter */
            public long getInvertedBgPrimary() {
                return this.invertedBgPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getInvertedBgSecondaryTransparent() {
                return this.invertedBgSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicPrimary-0d7_KjU, reason: from getter */
            public long getInvertedGraphicPrimary() {
                return this.invertedGraphicPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getInvertedGraphicSecondaryTransparent() {
                return this.invertedGraphicSecondaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicTertiaryTransparent-0d7_KjU, reason: from getter */
            public long getInvertedGraphicTertiaryTransparent() {
                return this.invertedGraphicTertiaryTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedLayerFloor2-0d7_KjU, reason: from getter */
            public long getInvertedLayerFloor2() {
                return this.invertedLayerFloor2;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextAction-0d7_KjU, reason: from getter */
            public long getInvertedTextAction() {
                return this.invertedTextAction;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextPrimary-0d7_KjU, reason: from getter */
            public long getInvertedTextPrimary() {
                return this.invertedTextPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getInvertedTextSecondaryTransparent() {
                return this.invertedTextSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerOverlayDimmingTransparent-0d7_KjU, reason: from getter */
            public long getLayerOverlayDimmingTransparent() {
                return this.layerOverlayDimmingTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerOverlayParanjaTransparent-0d7_KjU, reason: from getter */
            public long getLayerOverlayParanjaTransparent() {
                return this.layerOverlayParanjaTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerSurfaceTransparent-0d7_KjU, reason: from getter */
            public long getLayerSurfaceTransparent() {
                return this.layerSurfaceTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticBgDarkKey-0d7_KjU, reason: from getter */
            public long getStaticBgDarkKey() {
                return this.staticBgDarkKey;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticBgLightKey-0d7_KjU, reason: from getter */
            public long getStaticBgLightKey() {
                return this.staticBgLightKey;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey100Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey100Transparent() {
                return this.staticClearDarkKey100Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey200Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey200Transparent() {
                return this.staticClearDarkKey200Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey300Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey300Transparent() {
                return this.staticClearDarkKey300Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey400Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey400Transparent() {
                return this.staticClearDarkKey400Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey500Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey500Transparent() {
                return this.staticClearDarkKey500Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey600Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey600Transparent() {
                return this.staticClearDarkKey600Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey700Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey700Transparent() {
                return this.staticClearDarkKey700Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey800Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearDarkKey800Transparent() {
                return this.staticClearDarkKey800Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey0Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey0Transparent() {
                return this.staticClearLightKey0Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey100Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey100Transparent() {
                return this.staticClearLightKey100Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey200Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey200Transparent() {
                return this.staticClearLightKey200Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey300Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey300Transparent() {
                return this.staticClearLightKey300Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey400Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey400Transparent() {
                return this.staticClearLightKey400Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey500Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey500Transparent() {
                return this.staticClearLightKey500Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey600Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey600Transparent() {
                return this.staticClearLightKey600Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey700Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey700Transparent() {
                return this.staticClearLightKey700Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey800Transparent-0d7_KjU, reason: from getter */
            public long getStaticClearLightKey800Transparent() {
                return this.staticClearLightKey800Transparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticDetectorColorMine-0d7_KjU, reason: from getter */
            public long getStaticDetectorColorMine() {
                return this.staticDetectorColorMine;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicActionOnDark-0d7_KjU, reason: from getter */
            public long getStaticGraphicActionOnDark() {
                return this.staticGraphicActionOnDark;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicActionOnLight-0d7_KjU, reason: from getter */
            public long getStaticGraphicActionOnLight() {
                return this.staticGraphicActionOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDarkKey-0d7_KjU, reason: from getter */
            public long getStaticGraphicDarkKey() {
                return this.staticGraphicDarkKey;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDarkerNeutralOnLight-0d7_KjU, reason: from getter */
            public long getStaticGraphicDarkerNeutralOnLight() {
                return this.staticGraphicDarkerNeutralOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDisabledOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicDisabledOnDarkTransparent() {
                return this.staticGraphicDisabledOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDisabledOnLight-0d7_KjU, reason: from getter */
            public long getStaticGraphicDisabledOnLight() {
                return this.staticGraphicDisabledOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicLightKey-0d7_KjU, reason: from getter */
            public long getStaticGraphicLightKey() {
                return this.staticGraphicLightKey;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicNeutralOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicNeutralOnDarkTransparent() {
                return this.staticGraphicNeutralOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicNeutralOnLight-0d7_KjU, reason: from getter */
            public long getStaticGraphicNeutralOnLight() {
                return this.staticGraphicNeutralOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicPrimaryOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicPrimaryOnDarkTransparent() {
                return this.staticGraphicPrimaryOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicPrimaryOnLight-0d7_KjU, reason: from getter */
            public long getStaticGraphicPrimaryOnLight() {
                return this.staticGraphicPrimaryOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSecondaryOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicSecondaryOnDarkTransparent() {
                return this.staticGraphicSecondaryOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSecondaryOnLightTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicSecondaryOnLightTransparent() {
                return this.staticGraphicSecondaryOnLightTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSolidNeutral-0d7_KjU, reason: from getter */
            public long getStaticGraphicSolidNeutral() {
                return this.staticGraphicSolidNeutral;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicTertiaryOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicTertiaryOnDarkTransparent() {
                return this.staticGraphicTertiaryOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicTertiaryOnLightTransparent-0d7_KjU, reason: from getter */
            public long getStaticGraphicTertiaryOnLightTransparent() {
                return this.staticGraphicTertiaryOnLightTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextActionOnDark-0d7_KjU, reason: from getter */
            public long getStaticTextActionOnDark() {
                return this.staticTextActionOnDark;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextActionOnLight-0d7_KjU, reason: from getter */
            public long getStaticTextActionOnLight() {
                return this.staticTextActionOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextDarkKey-0d7_KjU, reason: from getter */
            public long getStaticTextDarkKey() {
                return this.staticTextDarkKey;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextLightKey-0d7_KjU, reason: from getter */
            public long getStaticTextLightKey() {
                return this.staticTextLightKey;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextPrimaryOnDark-0d7_KjU, reason: from getter */
            public long getStaticTextPrimaryOnDark() {
                return this.staticTextPrimaryOnDark;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextPrimaryOnLight-0d7_KjU, reason: from getter */
            public long getStaticTextPrimaryOnLight() {
                return this.staticTextPrimaryOnLight;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextSecondaryOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticTextSecondaryOnDarkTransparent() {
                return this.staticTextSecondaryOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextSecondaryOnLightTransparent-0d7_KjU, reason: from getter */
            public long getStaticTextSecondaryOnLightTransparent() {
                return this.staticTextSecondaryOnLightTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextTertiaryOnDarkTransparent-0d7_KjU, reason: from getter */
            public long getStaticTextTertiaryOnDarkTransparent() {
                return this.staticTextTertiaryOnDarkTransparent;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextTertiaryOnLightTransparent-0d7_KjU, reason: from getter */
            public long getStaticTextTertiaryOnLightTransparent() {
                return this.staticTextTertiaryOnLightTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getTextSecondaryTransparent-0d7_KjU, reason: from getter */
            public long getTextSecondaryTransparent() {
                return this.textSecondaryTransparent;
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getTextTertiaryTransparent-0d7_KjU, reason: from getter */
            public long getTextTertiaryTransparent() {
                return this.textTertiaryTransparent;
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
        DefaultLightOziColorScheme = oziColorScheme;
        lightColorList = C7714v.b0(C7807Z.m(oziColorScheme.getDetectorColorMine()), C7807Z.m(oziColorScheme.getBgAccentOnLight()), C7807Z.m(oziColorScheme.getBgDarkKey()), C7807Z.m(oziColorScheme.getBgLightKey()), C7807Z.m(oziColorScheme.getBgMarketingOnLight()), C7807Z.m(oziColorScheme.getBgPositiveOnLight()), C7807Z.m(oziColorScheme.getBgWarningOnLight()), C7807Z.m(oziColorScheme.getClearDarkKey100()), C7807Z.m(oziColorScheme.getClearDarkKey200()), C7807Z.m(oziColorScheme.getClearDarkKey300()), C7807Z.m(oziColorScheme.getClearDarkKey400()), C7807Z.m(oziColorScheme.getClearDarkKey500()), C7807Z.m(oziColorScheme.getClearDarkKey600()), C7807Z.m(oziColorScheme.getClearDarkKey700()), C7807Z.m(oziColorScheme.getClearDarkKey800()), C7807Z.m(oziColorScheme.getClearLightKey0()), C7807Z.m(oziColorScheme.getClearLightKey100()), C7807Z.m(oziColorScheme.getClearLightKey200()), C7807Z.m(oziColorScheme.getClearLightKey300()), C7807Z.m(oziColorScheme.getClearLightKey400()), C7807Z.m(oziColorScheme.getClearLightKey500()), C7807Z.m(oziColorScheme.getClearLightKey600()), C7807Z.m(oziColorScheme.getClearLightKey700()), C7807Z.m(oziColorScheme.getClearLightKey800()), C7807Z.m(oziColorScheme.getGraphicAccentOnLight()), C7807Z.m(oziColorScheme.getGraphicActionOnDark()), C7807Z.m(oziColorScheme.getGraphicActionOnLight()), C7807Z.m(oziColorScheme.getGraphicDarkKey()), C7807Z.m(oziColorScheme.getGraphicDarkerNeutralOnLight()), C7807Z.m(oziColorScheme.getGraphicDisabledOnDark()), C7807Z.m(oziColorScheme.getGraphicDisabledOnLight()), C7807Z.m(oziColorScheme.getGraphicExpressOnDark()), C7807Z.m(oziColorScheme.getGraphicFreshOnDark()), C7807Z.m(oziColorScheme.getGraphicLightKey()), C7807Z.m(oziColorScheme.getGraphicMarketingOnDark()), C7807Z.m(oziColorScheme.getGraphicMarketingOnLight()), C7807Z.m(oziColorScheme.getGraphicNegativeOnDark()), C7807Z.m(oziColorScheme.getGraphicNeutralOnDark()), C7807Z.m(oziColorScheme.getGraphicNeutralOnLight()), C7807Z.m(oziColorScheme.getGraphicOverlapPrimary()), C7807Z.m(oziColorScheme.getGraphicOverlapPrimaryDynamic()), C7807Z.m(oziColorScheme.getGraphicPositiveOnDark()), C7807Z.m(oziColorScheme.getGraphicPositivePrimaryOnLight()), C7807Z.m(oziColorScheme.getGraphicPrimaryOnDark()), C7807Z.m(oziColorScheme.getGraphicPrimaryOnLight()), C7807Z.m(oziColorScheme.getGraphicSecondaryOnDark()), C7807Z.m(oziColorScheme.getGraphicSecondaryOnLight()), C7807Z.m(oziColorScheme.getGraphicSolidNeutral()), C7807Z.m(oziColorScheme.getGraphicTertiaryOnDark()), C7807Z.m(oziColorScheme.getGraphicTertiaryOnLight()), C7807Z.m(oziColorScheme.getGraphicWarningOnDark()), C7807Z.m(oziColorScheme.getGraphicWarningPrimaryOnLight()), C7807Z.m(oziColorScheme.getLayerFloor1OnDark()), C7807Z.m(oziColorScheme.getTextAccentOnLight()), C7807Z.m(oziColorScheme.getTextActionOnDark()), C7807Z.m(oziColorScheme.getTextActionOnLight()), C7807Z.m(oziColorScheme.getTextDarkKey()), C7807Z.m(oziColorScheme.getTextExpressOnDark()), C7807Z.m(oziColorScheme.getTextFreshOnDark()), C7807Z.m(oziColorScheme.getTextLightKey()), C7807Z.m(oziColorScheme.getTextMarketingOnDark()), C7807Z.m(oziColorScheme.getTextMarketingOnLight()), C7807Z.m(oziColorScheme.getTextNegativeOnDark()), C7807Z.m(oziColorScheme.getTextPositiveOnDark()), C7807Z.m(oziColorScheme.getTextPositiveOnLight()), C7807Z.m(oziColorScheme.getTextPrimaryOnDark()), C7807Z.m(oziColorScheme.getTextPrimaryOnLight()), C7807Z.m(oziColorScheme.getTextSecondaryOnDark()), C7807Z.m(oziColorScheme.getTextSecondaryOnLight()), C7807Z.m(oziColorScheme.getTextTertiaryOnDark()), C7807Z.m(oziColorScheme.getTextTertiaryOnLight()), C7807Z.m(oziColorScheme.getTextWarningOnDark()), C7807Z.m(oziColorScheme.getBgAccentPrimary()), C7807Z.m(oziColorScheme.getBgAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getBgOpaqueAccentSecondary()), C7807Z.m(oziColorScheme.getBgAccentSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActionPrimary()), C7807Z.m(oziColorScheme.getBgActionPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActionSecondarySolid()), C7807Z.m(oziColorScheme.getBgActionSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveAccentPrimary()), C7807Z.m(oziColorScheme.getBgActiveAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveAccentSecondary()), C7807Z.m(oziColorScheme.getBgActiveAccentSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveActionPrimary()), C7807Z.m(oziColorScheme.getBgActiveActionPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveActionSecondary()), C7807Z.m(oziColorScheme.getBgActiveActionSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveApparelPrimary()), C7807Z.m(oziColorScheme.getBgActiveApparelPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveApparelSecondary()), C7807Z.m(oziColorScheme.getBgActiveApparelSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveAquaPrimary()), C7807Z.m(oziColorScheme.getBgActiveBestpricePrimary()), C7807Z.m(oziColorScheme.getBgActiveBestpricePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveBestpriceSecondary()), C7807Z.m(oziColorScheme.getBgActiveBestpriceSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveEconomPrimary()), C7807Z.m(oziColorScheme.getBgActiveEconomSecondary()), C7807Z.m(oziColorScheme.getBgActiveExpressPrimary()), C7807Z.m(oziColorScheme.getBgActiveExpressPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveExpressSecondary()), C7807Z.m(oziColorScheme.getBgActiveExpressSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveFreshPrimary()), C7807Z.m(oziColorScheme.getBgActiveFreshPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveFreshSecondary()), C7807Z.m(oziColorScheme.getBgActiveFreshSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveMarketingPrimary()), C7807Z.m(oziColorScheme.getBgActiveMarketingPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveMarketingSecondary()), C7807Z.m(oziColorScheme.getBgActiveMarketingSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveNegativePrimary()), C7807Z.m(oziColorScheme.getBgActiveNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveNegativeSecondary()), C7807Z.m(oziColorScheme.getBgActiveNegativeSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveOzonPrimary()), C7807Z.m(oziColorScheme.getBgActiveOzonSecondary()), C7807Z.m(oziColorScheme.getBgActivePositivePrimary()), C7807Z.m(oziColorScheme.getBgActivePositivePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActivePositiveSecondary()), C7807Z.m(oziColorScheme.getBgActivePositiveSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActivePremiumPrimary()), C7807Z.m(oziColorScheme.getBgActivePremiumPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActivePremiumSecondary()), C7807Z.m(oziColorScheme.getBgActivePremiumSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActivePrimary()), C7807Z.m(oziColorScheme.getBgActivePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveSecondary()), C7807Z.m(oziColorScheme.getBgActiveSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveSelect()), C7807Z.m(oziColorScheme.getBgActiveSelectInverted()), C7807Z.m(oziColorScheme.getBgActiveWarningPrimary()), C7807Z.m(oziColorScheme.getBgActiveWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveWarningSecondary()), C7807Z.m(oziColorScheme.getBgActiveWarningSecondaryInverted()), C7807Z.m(oziColorScheme.getBgApparelPiggy()), C7807Z.m(oziColorScheme.getBgApparelPrimary()), C7807Z.m(oziColorScheme.getBgApparelPrimaryInverted()), C7807Z.m(oziColorScheme.getBgApparelSecondary()), C7807Z.m(oziColorScheme.getBgApparelSecondaryInverted()), C7807Z.m(oziColorScheme.getBgAquaPrimary()), C7807Z.m(oziColorScheme.getBgAttentionPrimary()), C7807Z.m(oziColorScheme.getBgBestpricePrimary()), C7807Z.m(oziColorScheme.getBgBestpricePrimaryInverted()), C7807Z.m(oziColorScheme.getBgBestpriceSecondary()), C7807Z.m(oziColorScheme.getBgBestpriceSecondaryInverted()), C7807Z.m(oziColorScheme.getBgControl()), C7807Z.m(oziColorScheme.getBgControlInverted()), C7807Z.m(oziColorScheme.getBgDarkCerulean()), C7807Z.m(oziColorScheme.getBgDoubtfullPrimary()), C7807Z.m(oziColorScheme.getBgEconomPrimary()), C7807Z.m(oziColorScheme.getBgEconomSecondary()), C7807Z.m(oziColorScheme.getBgExpressPrimary()), C7807Z.m(oziColorScheme.getBgExpressPrimaryInverted()), C7807Z.m(oziColorScheme.getBgExpressSecondary()), C7807Z.m(oziColorScheme.getBgExpressSecondaryInverted()), C7807Z.m(oziColorScheme.getBgFreshPrimary()), C7807Z.m(oziColorScheme.getBgFreshPrimaryInverted()), C7807Z.m(oziColorScheme.getBgFreshSecondary()), C7807Z.m(oziColorScheme.getBgFreshSecondaryInverted()), C7807Z.m(oziColorScheme.getBgGuaranteePrimary()), C7807Z.m(oziColorScheme.getBgInstalmentPrimary()), C7807Z.m(oziColorScheme.getBgInstalmentSecondary()), C7807Z.m(oziColorScheme.getBgMarketingPrimary()), C7807Z.m(oziColorScheme.getBgMarketingPrimaryInverted()), C7807Z.m(oziColorScheme.getBgMarketingSecondary()), C7807Z.m(oziColorScheme.getBgMarketingSecondaryInverted()), C7807Z.m(oziColorScheme.getBgMarketingSecondarySolid()), C7807Z.m(oziColorScheme.getBgNegativePrimary()), C7807Z.m(oziColorScheme.getBgNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getBgOpaqueNegativeSecondary()), C7807Z.m(oziColorScheme.getBgNegativeSecondaryInverted()), C7807Z.m(oziColorScheme.getBgOpaqueActionSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueApparelSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueEconomSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueFreshSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueMarketingSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueOzonSecondary()), C7807Z.m(oziColorScheme.getBgOpaquePositiveSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueWarningSecondary()), C7807Z.m(oziColorScheme.getBgOverlap()), C7807Z.m(oziColorScheme.getBgOverlapInverted()), C7807Z.m(oziColorScheme.getBgOxford()), C7807Z.m(oziColorScheme.getBgOzonPrimary()), C7807Z.m(oziColorScheme.getBgOzonSecondary()), C7807Z.m(oziColorScheme.getBgPositivePrimary()), C7807Z.m(oziColorScheme.getBgPositivePrimaryInverted()), C7807Z.m(oziColorScheme.getBgPositiveSecondary()), C7807Z.m(oziColorScheme.getBgPositiveSecondaryInverted()), C7807Z.m(oziColorScheme.getBgPremiumPrimary()), C7807Z.m(oziColorScheme.getBgPremiumPrimaryInverted()), C7807Z.m(oziColorScheme.getBgPremiumSecondary()), C7807Z.m(oziColorScheme.getBgPremiumSecondaryInverted()), C7807Z.m(oziColorScheme.getBgPrimary()), C7807Z.m(oziColorScheme.getBgPrimaryInverted()), C7807Z.m(oziColorScheme.getBgPrussian()), C7807Z.m(oziColorScheme.getBgSbp()), C7807Z.m(oziColorScheme.getBgSecondary()), C7807Z.m(oziColorScheme.getBgSecondaryDynamic()), C7807Z.m(oziColorScheme.getBgSecondaryDynamicInverted()), C7807Z.m(oziColorScheme.getBgSecondaryInverted()), C7807Z.m(oziColorScheme.getBgSelect()), C7807Z.m(oziColorScheme.getBgSelectInverted()), C7807Z.m(oziColorScheme.getBgTabbarPrimary()), C7807Z.m(oziColorScheme.getBgTech()), C7807Z.m(oziColorScheme.getBgUltraPrimary()), C7807Z.m(oziColorScheme.getBgWarningPrimary()), C7807Z.m(oziColorScheme.getBgWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getBgWarningSecondaryInverted()), C7807Z.m(oziColorScheme.getGraphicAccentPrimary()), C7807Z.m(oziColorScheme.getGraphicAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActionPrimary()), C7807Z.m(oziColorScheme.getGraphicActionPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveAccentPrimary()), C7807Z.m(oziColorScheme.getGraphicActiveAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveActionPrimary()), C7807Z.m(oziColorScheme.getGraphicActiveActionPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveApparel()), C7807Z.m(oziColorScheme.getGraphicActiveApparelInverted()), C7807Z.m(oziColorScheme.getGraphicActiveBestprice()), C7807Z.m(oziColorScheme.getGraphicActiveBestpriceInverted()), C7807Z.m(oziColorScheme.getGraphicActiveEconom()), C7807Z.m(oziColorScheme.getGraphicActiveExpress()), C7807Z.m(oziColorScheme.getGraphicActiveExpressInverted()), C7807Z.m(oziColorScheme.getGraphicActiveFresh()), C7807Z.m(oziColorScheme.getGraphicActiveFreshInverted()), C7807Z.m(oziColorScheme.getGraphicActiveMarketing()), C7807Z.m(oziColorScheme.getGraphicActiveMarketingInverted()), C7807Z.m(oziColorScheme.getGraphicActiveNegativePrimary()), C7807Z.m(oziColorScheme.getGraphicActiveNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveOzon()), C7807Z.m(oziColorScheme.getGraphicActivePositivePrimary()), C7807Z.m(oziColorScheme.getGraphicActivePositivePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActivePremium()), C7807Z.m(oziColorScheme.getGraphicActivePremiumBlue()), C7807Z.m(oziColorScheme.getGraphicActivePremiumInverted()), C7807Z.m(oziColorScheme.getGraphicActiveRating()), C7807Z.m(oziColorScheme.getGraphicActiveRatingInverted()), C7807Z.m(oziColorScheme.getGraphicActiveWarningPrimary()), C7807Z.m(oziColorScheme.getGraphicActiveWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicApparel()), C7807Z.m(oziColorScheme.getGraphicApparelInverted()), C7807Z.m(oziColorScheme.getGraphicBestprice()), C7807Z.m(oziColorScheme.getGraphicBestpriceInverted()), C7807Z.m(oziColorScheme.getGraphicDisabled()), C7807Z.m(oziColorScheme.getGraphicDisabledInverted()), C7807Z.m(oziColorScheme.getGraphicEconom()), C7807Z.m(oziColorScheme.getGraphicExpress()), C7807Z.m(oziColorScheme.getGraphicExpressInverted()), C7807Z.m(oziColorScheme.getGraphicFintechGracePrimary()), C7807Z.m(oziColorScheme.getGraphicFintechGraceSecondary()), C7807Z.m(oziColorScheme.getGraphicFresh()), C7807Z.m(oziColorScheme.getGraphicFreshInverted()), C7807Z.m(oziColorScheme.getGraphicGuarantee()), C7807Z.m(oziColorScheme.getGraphicKey()), C7807Z.m(oziColorScheme.getGraphicKeyInverted()), C7807Z.m(oziColorScheme.getGraphicMarketing()), C7807Z.m(oziColorScheme.getGraphicMarketingInverted()), C7807Z.m(oziColorScheme.getGraphicNegativePrimary()), C7807Z.m(oziColorScheme.getGraphicNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicNeutral()), C7807Z.m(oziColorScheme.getGraphicNeutralInverted()), C7807Z.m(oziColorScheme.getGraphicOxford()), C7807Z.m(oziColorScheme.getGraphicOzon()), C7807Z.m(oziColorScheme.getGraphicPositivePrimary()), C7807Z.m(oziColorScheme.getGraphicPositivePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicPositiveSecondary()), C7807Z.m(oziColorScheme.getGraphicPremium()), C7807Z.m(oziColorScheme.getGraphicPremiumBlue()), C7807Z.m(oziColorScheme.getGraphicPremiumInverted()), C7807Z.m(oziColorScheme.getGraphicPrimary()), C7807Z.m(oziColorScheme.getGraphicPrimaryDynamic()), C7807Z.m(oziColorScheme.getGraphicPrimaryDynamicInverted()), C7807Z.m(oziColorScheme.getGraphicPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicQuaternary()), C7807Z.m(oziColorScheme.getGraphicRating()), C7807Z.m(oziColorScheme.getGraphicRatingInverted()), C7807Z.m(oziColorScheme.getGraphicSecondary()), C7807Z.m(oziColorScheme.getGraphicSecondaryDynamic()), C7807Z.m(oziColorScheme.getGraphicSecondaryDynamicInverted()), C7807Z.m(oziColorScheme.getGraphicSecondaryInverted()), C7807Z.m(oziColorScheme.getGraphicStrokeSticky()), C7807Z.m(oziColorScheme.getGraphicTabbarIconPrimary()), C7807Z.m(oziColorScheme.getGraphicTabbarIconSecondary()), C7807Z.m(oziColorScheme.getGraphicTech()), C7807Z.m(oziColorScheme.getGraphicTertiary()), C7807Z.m(oziColorScheme.getGraphicTertiaryDynamic()), C7807Z.m(oziColorScheme.getGraphicTertiaryInverted()), C7807Z.m(oziColorScheme.getGraphicUltraPrimary()), C7807Z.m(oziColorScheme.getGraphicWarningPrimary()), C7807Z.m(oziColorScheme.getGraphicWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getLayerActiveFloor0()), C7807Z.m(oziColorScheme.getLayerActiveFloor1()), C7807Z.m(oziColorScheme.getLayerActiveFloor1Inverted()), C7807Z.m(oziColorScheme.getLayerActiveFloor2()), C7807Z.m(oziColorScheme.getLayerActiveFloor2Inverted()), C7807Z.m(oziColorScheme.getLayerActiveFloor3()), C7807Z.m(oziColorScheme.getLayerActiveFloor3Inverted()), C7807Z.m(oziColorScheme.getLayerActiveSurface()), C7807Z.m(oziColorScheme.getLayerActiveSurfaceInverted()), C7807Z.m(oziColorScheme.getLayerFloor0()), C7807Z.m(oziColorScheme.getLayerFloor0Inverted()), C7807Z.m(oziColorScheme.getLayerFloor1()), C7807Z.m(oziColorScheme.getLayerFloor1Inverted()), C7807Z.m(oziColorScheme.getLayerFloor2()), C7807Z.m(oziColorScheme.getLayerFloor2Inverted()), C7807Z.m(oziColorScheme.getLayerFloor3()), C7807Z.m(oziColorScheme.getLayerFloor3Inverted()), C7807Z.m(oziColorScheme.getLayerOverlayDimming()), C7807Z.m(oziColorScheme.getLayerOverlayDimmingInverted()), C7807Z.m(oziColorScheme.getLayerOverlayParanja()), C7807Z.m(oziColorScheme.getLayerOverlayParanjaInverted()), C7807Z.m(oziColorScheme.getLayerSurface()), C7807Z.m(oziColorScheme.getLayerSurfaceInverted()), C7807Z.m(oziColorScheme.getTextAccent()), C7807Z.m(oziColorScheme.getTextAccentInverted()), C7807Z.m(oziColorScheme.getTextAction()), C7807Z.m(oziColorScheme.getTextActionInverted()), C7807Z.m(oziColorScheme.getTextActiveAccent()), C7807Z.m(oziColorScheme.getTextActiveAccentInverted()), C7807Z.m(oziColorScheme.getTextActiveAction()), C7807Z.m(oziColorScheme.getTextActiveActionInverted()), C7807Z.m(oziColorScheme.getTextActiveApparel()), C7807Z.m(oziColorScheme.getTextActiveApparelInverted()), C7807Z.m(oziColorScheme.getTextActiveBestprice()), C7807Z.m(oziColorScheme.getTextActiveBestpriceInverted()), C7807Z.m(oziColorScheme.getTextActiveExpress()), C7807Z.m(oziColorScheme.getTextActiveExpressInverted()), C7807Z.m(oziColorScheme.getTextActiveFresh()), C7807Z.m(oziColorScheme.getTextActiveFreshInverted()), C7807Z.m(oziColorScheme.getTextActiveMarketing()), C7807Z.m(oziColorScheme.getTextActiveMarketingInverted()), C7807Z.m(oziColorScheme.getTextActiveNegative()), C7807Z.m(oziColorScheme.getTextActiveNegativeInverted()), C7807Z.m(oziColorScheme.getTextActiveOzon()), C7807Z.m(oziColorScheme.getTextActivePositive()), C7807Z.m(oziColorScheme.getTextActivePositiveInverted()), C7807Z.m(oziColorScheme.getTextActivePremium()), C7807Z.m(oziColorScheme.getTextActivePremiumInverted()), C7807Z.m(oziColorScheme.getTextActiveWarning()), C7807Z.m(oziColorScheme.getTextActiveWarningInverted()), C7807Z.m(oziColorScheme.getTextApparel()), C7807Z.m(oziColorScheme.getTextApparelInverted()), C7807Z.m(oziColorScheme.getTextBestprice()), C7807Z.m(oziColorScheme.getTextBestpriceInverted()), C7807Z.m(oziColorScheme.getTextDiscountUnavialable()), C7807Z.m(oziColorScheme.getTextEconom()), C7807Z.m(oziColorScheme.getTextExpress()), C7807Z.m(oziColorScheme.getTextExpressInverted()), C7807Z.m(oziColorScheme.getTextFresh()), C7807Z.m(oziColorScheme.getTextFreshInverted()), C7807Z.m(oziColorScheme.getTextGuarantee()), C7807Z.m(oziColorScheme.getTextMarketing()), C7807Z.m(oziColorScheme.getTextMarketingInverted()), C7807Z.m(oziColorScheme.getTextNegative()), C7807Z.m(oziColorScheme.getTextNegativeInverted()), C7807Z.m(oziColorScheme.getTextOriginalprice()), C7807Z.m(oziColorScheme.getTextOriginalpriceAvailable()), C7807Z.m(oziColorScheme.getTextOxford()), C7807Z.m(oziColorScheme.getTextOzon()), C7807Z.m(oziColorScheme.getTextPositive()), C7807Z.m(oziColorScheme.getTextPositiveInverted()), C7807Z.m(oziColorScheme.getTextPremium()), C7807Z.m(oziColorScheme.getTextPremiumInverted()), C7807Z.m(oziColorScheme.getTextPrimary()), C7807Z.m(oziColorScheme.getTextPrimaryDynamic()), C7807Z.m(oziColorScheme.getTextPrimaryDynamicInverted()), C7807Z.m(oziColorScheme.getTextPrimaryInverted()), C7807Z.m(oziColorScheme.getTextSecondary()), C7807Z.m(oziColorScheme.getTextSecondaryDynamic()), C7807Z.m(oziColorScheme.getTextSecondaryDynamicInverted()), C7807Z.m(oziColorScheme.getTextSecondaryInverted()), C7807Z.m(oziColorScheme.getTextTech()), C7807Z.m(oziColorScheme.getTextTertiary()), C7807Z.m(oziColorScheme.getTextTertiaryInverted()), C7807Z.m(oziColorScheme.getTextUltra()), C7807Z.m(oziColorScheme.getTextWarning()), C7807Z.m(oziColorScheme.getTextWarningInverted()), C7807Z.m(oziColorScheme.getTextSecondaryTransparent()), C7807Z.m(oziColorScheme.getTextTertiaryTransparent()), C7807Z.m(oziColorScheme.getGraphicSecondaryTransparent()), C7807Z.m(oziColorScheme.getGraphicTertiaryTransparent()), C7807Z.m(oziColorScheme.getGraphicQuaternaryTransparent()), C7807Z.m(oziColorScheme.getGraphicNeutralTransparent()), C7807Z.m(oziColorScheme.getGraphicDisabledTransparent()), C7807Z.m(oziColorScheme.getBgSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgActionSecondary()), C7807Z.m(oziColorScheme.getBgActionSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgAccentSecondary()), C7807Z.m(oziColorScheme.getBgAccentSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgPositiveSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgWarningSecondary()), C7807Z.m(oziColorScheme.getBgWarningSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgNegativeSecondary()), C7807Z.m(oziColorScheme.getBgNegativeSecondaryTransparent()), C7807Z.m(oziColorScheme.getLayerSurfaceTransparent()), C7807Z.m(oziColorScheme.getLayerOverlayDimmingTransparent()), C7807Z.m(oziColorScheme.getLayerOverlayParanjaTransparent()), C7807Z.m(oziColorScheme.getInvertedTextPrimary()), C7807Z.m(oziColorScheme.getInvertedTextSecondaryTransparent()), C7807Z.m(oziColorScheme.getInvertedTextAction()), C7807Z.m(oziColorScheme.getInvertedGraphicPrimary()), C7807Z.m(oziColorScheme.getInvertedGraphicSecondaryTransparent()), C7807Z.m(oziColorScheme.getInvertedGraphicTertiaryTransparent()), C7807Z.m(oziColorScheme.getInvertedBgPrimary()), C7807Z.m(oziColorScheme.getInvertedBgSecondaryTransparent()), C7807Z.m(oziColorScheme.getInvertedBgActionPrimary()), C7807Z.m(oziColorScheme.getInvertedLayerFloor2()), C7807Z.m(oziColorScheme.getExtraTextFresh()), C7807Z.m(oziColorScheme.getExtraTextExpress()), C7807Z.m(oziColorScheme.getExtraTextMarketing()), C7807Z.m(oziColorScheme.getExtraTextPremium()), C7807Z.m(oziColorScheme.getExtraTextEconom()), C7807Z.m(oziColorScheme.getExtraGraphicFresh()), C7807Z.m(oziColorScheme.getExtraGraphicExpress()), C7807Z.m(oziColorScheme.getExtraGraphicMarketing()), C7807Z.m(oziColorScheme.getExtraGraphicPremium()), C7807Z.m(oziColorScheme.getExtraGraphicEconom()), C7807Z.m(oziColorScheme.getExtraBgFreshPrimary()), C7807Z.m(oziColorScheme.getExtraBgFreshSecondary()), C7807Z.m(oziColorScheme.getExtraBgFreshSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgExpressPrimary()), C7807Z.m(oziColorScheme.getExtraBgExpressSecondary()), C7807Z.m(oziColorScheme.getExtraBgExpressSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgMarketingPrimary()), C7807Z.m(oziColorScheme.getExtraBgMarketingSecondary()), C7807Z.m(oziColorScheme.getExtraBgMarketingSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgPremiumPrimary()), C7807Z.m(oziColorScheme.getExtraBgPremiumSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgEconomPrimary()), C7807Z.m(oziColorScheme.getExtraBgEconomSecondary()), C7807Z.m(oziColorScheme.getExtraBgEconomSecondaryTransparent()), C7807Z.m(oziColorScheme.getStaticTextDarkKey()), C7807Z.m(oziColorScheme.getStaticTextPrimaryOnLight()), C7807Z.m(oziColorScheme.getStaticTextSecondaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticTextTertiaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticTextActionOnLight()), C7807Z.m(oziColorScheme.getStaticTextLightKey()), C7807Z.m(oziColorScheme.getStaticTextPrimaryOnDark()), C7807Z.m(oziColorScheme.getStaticTextSecondaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticTextTertiaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticTextActionOnDark()), C7807Z.m(oziColorScheme.getStaticGraphicDarkKey()), C7807Z.m(oziColorScheme.getStaticGraphicPrimaryOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicSecondaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicTertiaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicSolidNeutral()), C7807Z.m(oziColorScheme.getStaticGraphicActionOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicDarkerNeutralOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicNeutralOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicDisabledOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicLightKey()), C7807Z.m(oziColorScheme.getStaticGraphicPrimaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicSecondaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicTertiaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicNeutralOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicDisabledOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicActionOnDark()), C7807Z.m(oziColorScheme.getStaticBgLightKey()), C7807Z.m(oziColorScheme.getStaticBgDarkKey()), C7807Z.m(oziColorScheme.getStaticClearDarkKey800Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey700Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey600Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey500Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey400Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey300Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey200Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey100Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey800Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey700Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey600Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey500Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey400Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey300Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey200Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey100Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey0Transparent()), C7807Z.m(oziColorScheme.getStaticDetectorColorMine()), C7807Z.m(oziColorScheme.getActiveTextPrimary()), C7807Z.m(oziColorScheme.getActiveTextAction()), C7807Z.m(oziColorScheme.getActiveGraphicPositivePrimary()), C7807Z.m(oziColorScheme.getActiveGraphicWarningPrimary()), C7807Z.m(oziColorScheme.getActiveGraphicNegativePrimary()), C7807Z.m(oziColorScheme.getActiveBgActionPrimary()), C7807Z.m(oziColorScheme.getActiveBgActionSecondary()), C7807Z.m(oziColorScheme.getActiveBgActionSecondaryTransparent()), C7807Z.m(oziColorScheme.getActiveBgNegativePrimary()), C7807Z.m(oziColorScheme.getActiveBgNegativeSecondary()), C7807Z.m(oziColorScheme.getActiveBgNegativeSecondaryTransparent()));
        oziLightColorsMap$delegate = k.b(DefaultLightOziColorSchemeKt$oziLightColorsMap$2.INSTANCE);
    }

    @NotNull
    public static final OziColorScheme getDefaultLightOziColorScheme() {
        return DefaultLightOziColorScheme;
    }

    @NotNull
    public static final List<C7807Z> getLightColorList() {
        return lightColorList;
    }
}
