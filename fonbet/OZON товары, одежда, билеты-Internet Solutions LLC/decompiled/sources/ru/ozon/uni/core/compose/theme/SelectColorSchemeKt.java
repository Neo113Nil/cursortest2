package ru.ozon.uni.core.compose.theme;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniCoreColors;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\n\" \u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0002\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lru/ozon/uni/core/compose/theme/UniColorScheme;", "SelectLightColorScheme", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "getSelectLightColorScheme", "()Lru/ozon/uni/core/compose/theme/UniColorScheme;", "getSelectLightColorScheme$annotations", "()V", "SelectDarkColorScheme", "getSelectDarkColorScheme", "getSelectDarkColorScheme$annotations", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectColorSchemeKt {

    @NotNull
    private static final UniColorScheme SelectLightColorScheme = new UniColorScheme() { // from class: ru.ozon.uni.core.compose.theme.SelectColorSchemeKt$SelectLightColorScheme$1
        private final /* synthetic */ UniColorScheme $$delegate_0 = DefaultUniColorSchemeKt.getDefaultLightUniColorScheme();
        private final long bgAccentOnLight;
        private final long bgAccentPrimary;
        private final long bgAccentPrimaryInverted;
        private final long bgAccentSecondary;
        private final long bgAccentSecondaryInverted;
        private final long bgActionPrimary;
        private final long bgActionPrimaryInverted;
        private final long bgActionSecondary;
        private final long bgActionSecondaryInverted;
        private final long bgActiveAccentPrimary;
        private final long bgActiveAccentPrimaryInverted;
        private final long bgActiveAccentSecondary;
        private final long bgActiveAccentSecondaryInverted;
        private final long bgActiveActionPrimary;
        private final long bgActiveActionPrimaryInverted;
        private final long bgActiveActionSecondary;
        private final long bgActiveActionSecondaryInverted;
        private final long bgActiveMarketingPrimary;
        private final long bgActiveMarketingPrimaryInverted;
        private final long bgActiveMarketingSecondary;
        private final long bgActiveMarketingSecondaryInverted;
        private final long bgActivePositivePrimary;
        private final long bgActivePositivePrimaryInverted;
        private final long bgActivePositiveSecondary;
        private final long bgActivePositiveSecondaryInverted;
        private final long bgActiveWarningPrimary;
        private final long bgActiveWarningPrimaryInverted;
        private final long bgActiveWarningSecondary;
        private final long bgActiveWarningSecondaryInverted;
        private final long bgMarketingOnLight;
        private final long bgMarketingPrimary;
        private final long bgMarketingPrimaryInverted;
        private final long bgMarketingSecondary;
        private final long bgMarketingSecondaryInverted;
        private final long bgOpaqueAccentSecondary;
        private final long bgOpaqueActionSecondary;
        private final long bgOpaqueMarketingSecondary;
        private final long bgOpaquePositiveSecondary;
        private final long bgOpaqueWarningSecondary;
        private final long bgPositiveOnLight;
        private final long bgPositivePrimary;
        private final long bgPositivePrimaryInverted;
        private final long bgPositiveSecondary;
        private final long bgPositiveSecondaryInverted;
        private final long bgSecondaryDynamic;
        private final long bgSecondaryDynamicInverted;
        private final long bgWarningOnLight;
        private final long bgWarningPrimary;
        private final long bgWarningPrimaryInverted;
        private final long bgWarningSecondary;
        private final long bgWarningSecondaryInverted;
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
        private final long graphicActiveMarketing;
        private final long graphicActiveMarketingInverted;
        private final long graphicActiveNegativePrimary;
        private final long graphicActiveNegativePrimaryInverted;
        private final long graphicActivePositivePrimary;
        private final long graphicActivePositivePrimaryInverted;
        private final long graphicActiveRating;
        private final long graphicActiveRatingInverted;
        private final long graphicActiveWarningPrimary;
        private final long graphicActiveWarningPrimaryInverted;
        private final long graphicMarketing;
        private final long graphicMarketingInverted;
        private final long graphicMarketingOnDark;
        private final long graphicMarketingOnLight;
        private final long graphicOverlapPrimary;
        private final long graphicOverlapPrimaryDynamic;
        private final long graphicPositiveOnDark;
        private final long graphicPositivePrimary;
        private final long graphicPositivePrimaryInverted;
        private final long graphicPositivePrimaryOnLight;
        private final long graphicPositiveSecondary;
        private final long graphicPrimary;
        private final long graphicPrimaryDynamic;
        private final long graphicPrimaryDynamicInverted;
        private final long graphicRating;
        private final long graphicRatingInverted;
        private final long graphicSecondaryDynamic;
        private final long graphicSecondaryDynamicInverted;
        private final long graphicTertiaryDynamic;
        private final long graphicWarningOnDark;
        private final long graphicWarningPrimary;
        private final long graphicWarningPrimaryInverted;
        private final long graphicWarningPrimaryOnLight;
        private final long layerActiveFloor0;
        private final long layerFloor0;
        private final long layerFloor0Inverted;
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
        private final long textActiveMarketing;
        private final long textActiveMarketingInverted;
        private final long textActivePositive;
        private final long textActivePositiveInverted;
        private final long textActiveWarning;
        private final long textActiveWarningInverted;
        private final long textMarketing;
        private final long textMarketingInverted;
        private final long textMarketingOnDark;
        private final long textMarketingOnLight;
        private final long textPositive;
        private final long textPositiveInverted;
        private final long textPositiveOnDark;
        private final long textPositiveOnLight;
        private final long textPrimaryDynamic;
        private final long textPrimaryDynamicInverted;
        private final long textSecondaryDynamic;
        private final long textSecondaryDynamicInverted;
        private final long textWarning;
        private final long textWarningInverted;
        private final long textWarningOnDark;

        {
            UniCoreColors uniCoreColors = UniCoreColors.INSTANCE;
            this.bgAccentOnLight = uniCoreColors.m2892getStrawberry1000d7_KjU();
            this.bgMarketingOnLight = uniCoreColors.m2871getPortage1000d7_KjU();
            this.bgPositiveOnLight = uniCoreColors.m2903getTurquoise500d7_KjU();
            this.bgWarningOnLight = uniCoreColors.m2819getMango1000d7_KjU();
            this.graphicAccentOnLight = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.graphicActionOnDark = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicActionOnLight = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicMarketingOnDark = uniCoreColors.m2912getViolet5000d7_KjU();
            this.graphicMarketingOnLight = uniCoreColors.m2876getPortage8000d7_KjU();
            this.graphicPositiveOnDark = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.graphicPositivePrimaryOnLight = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.graphicWarningOnDark = uniCoreColors.m2825getMango9000d7_KjU();
            this.graphicWarningPrimaryOnLight = uniCoreColors.m2825getMango9000d7_KjU();
            this.textAccentOnLight = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.textActionOnDark = uniCoreColors.m2919getWhite0d7_KjU();
            this.textActionOnLight = uniCoreColors.m2740getBlack0d7_KjU();
            this.textMarketingOnDark = uniCoreColors.m2912getViolet5000d7_KjU();
            this.textMarketingOnLight = uniCoreColors.m2876getPortage8000d7_KjU();
            this.textPositiveOnDark = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.textPositiveOnLight = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.textWarningOnDark = uniCoreColors.m2825getMango9000d7_KjU();
            this.bgAccentPrimaryInverted = uniCoreColors.m2896getStrawberry6000d7_KjU();
            this.bgAccentPrimary = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.bgAccentSecondaryInverted = uniCoreColors.m2893getStrawberry10000d7_KjU();
            this.bgAccentSecondary = uniCoreColors.m2892getStrawberry1000d7_KjU();
            this.bgActionPrimaryInverted = uniCoreColors.m2784getBrandSelectSelectGray1000d7_KjU();
            this.bgActionPrimary = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.bgActionSecondaryInverted = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.bgActionSecondary = uniCoreColors.m2781getBrandSelectSelectBlue250d7_KjU();
            this.bgActiveAccentPrimaryInverted = uniCoreColors.m2895getStrawberry5000d7_KjU();
            this.bgActiveAccentPrimary = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.bgActiveAccentSecondaryInverted = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.bgActiveAccentSecondary = uniCoreColors.m2894getStrawberry2000d7_KjU();
            this.bgActiveActionPrimaryInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgActiveActionPrimary = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgActiveActionSecondaryInverted = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgActiveActionSecondary = uniCoreColors.m2782getBrandSelectSelectBlue500d7_KjU();
            this.bgActiveMarketingPrimaryInverted = uniCoreColors.m2877getPortage9000d7_KjU();
            this.bgActiveMarketingPrimary = uniCoreColors.m2877getPortage9000d7_KjU();
            this.bgActiveMarketingSecondaryInverted = uniCoreColors.m2871getPortage1000d7_KjU();
            this.bgActiveMarketingSecondary = uniCoreColors.m2871getPortage1000d7_KjU();
            this.bgActivePositivePrimaryInverted = uniCoreColors.m2902getTurquoise3000d7_KjU();
            this.bgActivePositivePrimary = uniCoreColors.m2906getTurquoise9000d7_KjU();
            this.bgActivePositiveSecondaryInverted = uniCoreColors.m2907getTurquoise9500d7_KjU();
            this.bgActivePositiveSecondary = uniCoreColors.m2900getTurquoise1000d7_KjU();
            this.bgActiveWarningPrimaryInverted = uniCoreColors.m2823getMango4000d7_KjU();
            this.bgActiveWarningPrimary = uniCoreColors.m2826getMango9500d7_KjU();
            this.bgActiveWarningSecondaryInverted = uniCoreColors.m2820getMango10000d7_KjU();
            this.bgActiveWarningSecondary = uniCoreColors.m2822getMango2000d7_KjU();
            this.bgMarketingPrimaryInverted = uniCoreColors.m2874getPortage4000d7_KjU();
            this.bgMarketingPrimary = uniCoreColors.m2876getPortage8000d7_KjU();
            this.bgMarketingSecondaryInverted = uniCoreColors.m2872getPortage10000d7_KjU();
            this.bgMarketingSecondary = uniCoreColors.m2875getPortage500d7_KjU();
            this.bgOpaqueAccentSecondary = uniCoreColors.m2892getStrawberry1000d7_KjU();
            this.bgOpaqueActionSecondary = uniCoreColors.m2787getBrandSelectSelectGray500d7_KjU();
            this.bgOpaqueMarketingSecondary = uniCoreColors.m2875getPortage500d7_KjU();
            this.bgOpaquePositiveSecondary = uniCoreColors.m2903getTurquoise500d7_KjU();
            this.bgOpaqueWarningSecondary = uniCoreColors.m2819getMango1000d7_KjU();
            this.bgPositivePrimaryInverted = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.bgPositivePrimary = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.bgPositiveSecondaryInverted = uniCoreColors.m2901getTurquoise10000d7_KjU();
            this.bgPositiveSecondary = uniCoreColors.m2903getTurquoise500d7_KjU();
            this.bgSecondaryDynamicInverted = uniCoreColors.m2760getBlueTransparent1000d7_KjU();
            this.bgSecondaryDynamic = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.bgWarningPrimaryInverted = uniCoreColors.m2824getMango5000d7_KjU();
            this.bgWarningPrimary = uniCoreColors.m2825getMango9000d7_KjU();
            this.bgWarningSecondaryInverted = uniCoreColors.m2821getMango11000d7_KjU();
            this.bgWarningSecondary = uniCoreColors.m2819getMango1000d7_KjU();
            this.graphicAccentPrimaryInverted = uniCoreColors.m2896getStrawberry6000d7_KjU();
            this.graphicAccentPrimary = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.graphicActionPrimaryInverted = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicActionPrimary = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicActiveAccentPrimaryInverted = uniCoreColors.m2895getStrawberry5000d7_KjU();
            this.graphicActiveAccentPrimary = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.graphicActiveActionPrimaryInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicActiveActionPrimary = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicActiveMarketingInverted = uniCoreColors.m2877getPortage9000d7_KjU();
            this.graphicActiveMarketing = uniCoreColors.m2877getPortage9000d7_KjU();
            this.graphicActiveNegativePrimaryInverted = uniCoreColors.m2882getRed4000d7_KjU();
            this.graphicActiveNegativePrimary = uniCoreColors.m2884getRed5000d7_KjU();
            this.graphicActivePositivePrimaryInverted = uniCoreColors.m2902getTurquoise3000d7_KjU();
            this.graphicActivePositivePrimary = uniCoreColors.m2906getTurquoise9000d7_KjU();
            this.graphicActiveRatingInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicActiveRating = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicActiveWarningPrimaryInverted = uniCoreColors.m2823getMango4000d7_KjU();
            this.graphicActiveWarningPrimary = uniCoreColors.m2826getMango9500d7_KjU();
            this.graphicMarketingInverted = uniCoreColors.m2874getPortage4000d7_KjU();
            this.graphicMarketing = uniCoreColors.m2876getPortage8000d7_KjU();
            this.graphicOverlapPrimaryDynamic = uniCoreColors.m2783getBrandSelectSelectCarbon3000d7_KjU();
            this.graphicOverlapPrimary = uniCoreColors.m2783getBrandSelectSelectCarbon3000d7_KjU();
            this.graphicPositivePrimaryInverted = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.graphicPositivePrimary = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.graphicPositiveSecondary = uniCoreColors.m2903getTurquoise500d7_KjU();
            this.graphicPrimaryDynamicInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicPrimaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicPrimary = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicRatingInverted = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicRating = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicSecondaryDynamicInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicSecondaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicTertiaryDynamic = uniCoreColors.m2926getWhiteTransparent3000d7_KjU();
            this.graphicWarningPrimaryInverted = uniCoreColors.m2824getMango5000d7_KjU();
            this.graphicWarningPrimary = uniCoreColors.m2825getMango9000d7_KjU();
            this.layerActiveFloor0 = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerFloor0Inverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerFloor0 = uniCoreColors.m2740getBlack0d7_KjU();
            this.textAccentInverted = uniCoreColors.m2896getStrawberry6000d7_KjU();
            this.textAccent = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.textActionInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.textAction = uniCoreColors.m2740getBlack0d7_KjU();
            this.textActiveAccentInverted = uniCoreColors.m2895getStrawberry5000d7_KjU();
            this.textActiveAccent = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.textActiveActionInverted = uniCoreColors.m2785getBrandSelectSelectGray1500d7_KjU();
            this.textActiveAction = uniCoreColors.m2788getBrandSelectSelectGray8500d7_KjU();
            this.textActiveMarketingInverted = uniCoreColors.m2873getPortage3000d7_KjU();
            this.textActiveMarketing = uniCoreColors.m2877getPortage9000d7_KjU();
            this.textActivePositiveInverted = uniCoreColors.m2902getTurquoise3000d7_KjU();
            this.textActivePositive = uniCoreColors.m2906getTurquoise9000d7_KjU();
            this.textActiveWarningInverted = uniCoreColors.m2823getMango4000d7_KjU();
            this.textActiveWarning = uniCoreColors.m2826getMango9500d7_KjU();
            this.textMarketingInverted = uniCoreColors.m2874getPortage4000d7_KjU();
            this.textMarketing = uniCoreColors.m2876getPortage8000d7_KjU();
            this.textPositiveInverted = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.textPositive = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.textPrimaryDynamicInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.textPrimaryDynamic = uniCoreColors.m2919getWhite0d7_KjU();
            this.textSecondaryDynamicInverted = uniCoreColors.m2844getNeutralTransparent8000d7_KjU();
            this.textSecondaryDynamic = uniCoreColors.m2932getWhiteTransparent6000d7_KjU();
            this.textWarningInverted = uniCoreColors.m2824getMango5000d7_KjU();
            this.textWarning = uniCoreColors.m2825getMango9000d7_KjU();
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
        /* renamed from: getBgActionSecondarySolid-0d7_KjU */
        public long getBgActionSecondarySolid() {
            return this.$$delegate_0.getBgActionSecondarySolid();
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
        /* renamed from: getBgActiveApparelPrimary-0d7_KjU */
        public long getBgActiveApparelPrimary() {
            return this.$$delegate_0.getBgActiveApparelPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimaryInverted-0d7_KjU */
        public long getBgActiveApparelPrimaryInverted() {
            return this.$$delegate_0.getBgActiveApparelPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondary-0d7_KjU */
        public long getBgActiveApparelSecondary() {
            return this.$$delegate_0.getBgActiveApparelSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondaryInverted-0d7_KjU */
        public long getBgActiveApparelSecondaryInverted() {
            return this.$$delegate_0.getBgActiveApparelSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAquaPrimary-0d7_KjU */
        public long getBgActiveAquaPrimary() {
            return this.$$delegate_0.getBgActiveAquaPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimary-0d7_KjU */
        public long getBgActiveBestpricePrimary() {
            return this.$$delegate_0.getBgActiveBestpricePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimaryInverted-0d7_KjU */
        public long getBgActiveBestpricePrimaryInverted() {
            return this.$$delegate_0.getBgActiveBestpricePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondary-0d7_KjU */
        public long getBgActiveBestpriceSecondary() {
            return this.$$delegate_0.getBgActiveBestpriceSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondaryInverted-0d7_KjU */
        public long getBgActiveBestpriceSecondaryInverted() {
            return this.$$delegate_0.getBgActiveBestpriceSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomPrimary-0d7_KjU */
        public long getBgActiveEconomPrimary() {
            return this.$$delegate_0.getBgActiveEconomPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomSecondary-0d7_KjU */
        public long getBgActiveEconomSecondary() {
            return this.$$delegate_0.getBgActiveEconomSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimary-0d7_KjU */
        public long getBgActiveExpressPrimary() {
            return this.$$delegate_0.getBgActiveExpressPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimaryInverted-0d7_KjU */
        public long getBgActiveExpressPrimaryInverted() {
            return this.$$delegate_0.getBgActiveExpressPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondary-0d7_KjU */
        public long getBgActiveExpressSecondary() {
            return this.$$delegate_0.getBgActiveExpressSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondaryInverted-0d7_KjU */
        public long getBgActiveExpressSecondaryInverted() {
            return this.$$delegate_0.getBgActiveExpressSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimary-0d7_KjU */
        public long getBgActiveFreshPrimary() {
            return this.$$delegate_0.getBgActiveFreshPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimaryInverted-0d7_KjU */
        public long getBgActiveFreshPrimaryInverted() {
            return this.$$delegate_0.getBgActiveFreshPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondary-0d7_KjU */
        public long getBgActiveFreshSecondary() {
            return this.$$delegate_0.getBgActiveFreshSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondaryInverted-0d7_KjU */
        public long getBgActiveFreshSecondaryInverted() {
            return this.$$delegate_0.getBgActiveFreshSecondaryInverted();
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
        /* renamed from: getBgActiveNegativePrimary-0d7_KjU */
        public long getBgActiveNegativePrimary() {
            return this.$$delegate_0.getBgActiveNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativePrimaryInverted-0d7_KjU */
        public long getBgActiveNegativePrimaryInverted() {
            return this.$$delegate_0.getBgActiveNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondary-0d7_KjU */
        public long getBgActiveNegativeSecondary() {
            return this.$$delegate_0.getBgActiveNegativeSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondaryInverted-0d7_KjU */
        public long getBgActiveNegativeSecondaryInverted() {
            return this.$$delegate_0.getBgActiveNegativeSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonPrimary-0d7_KjU */
        public long getBgActiveOzonPrimary() {
            return this.$$delegate_0.getBgActiveOzonPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonSecondary-0d7_KjU */
        public long getBgActiveOzonSecondary() {
            return this.$$delegate_0.getBgActiveOzonSecondary();
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
        /* renamed from: getBgActivePremiumPrimary-0d7_KjU */
        public long getBgActivePremiumPrimary() {
            return this.$$delegate_0.getBgActivePremiumPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumPrimaryInverted-0d7_KjU */
        public long getBgActivePremiumPrimaryInverted() {
            return this.$$delegate_0.getBgActivePremiumPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondary-0d7_KjU */
        public long getBgActivePremiumSecondary() {
            return this.$$delegate_0.getBgActivePremiumSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondaryInverted-0d7_KjU */
        public long getBgActivePremiumSecondaryInverted() {
            return this.$$delegate_0.getBgActivePremiumSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimary-0d7_KjU */
        public long getBgActivePrimary() {
            return this.$$delegate_0.getBgActivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimaryInverted-0d7_KjU */
        public long getBgActivePrimaryInverted() {
            return this.$$delegate_0.getBgActivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondary-0d7_KjU */
        public long getBgActiveSecondary() {
            return this.$$delegate_0.getBgActiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondaryInverted-0d7_KjU */
        public long getBgActiveSecondaryInverted() {
            return this.$$delegate_0.getBgActiveSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelect-0d7_KjU */
        public long getBgActiveSelect() {
            return this.$$delegate_0.getBgActiveSelect();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelectInverted-0d7_KjU */
        public long getBgActiveSelectInverted() {
            return this.$$delegate_0.getBgActiveSelectInverted();
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
        /* renamed from: getBgApparelPiggy-0d7_KjU */
        public long getBgApparelPiggy() {
            return this.$$delegate_0.getBgApparelPiggy();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimary-0d7_KjU */
        public long getBgApparelPrimary() {
            return this.$$delegate_0.getBgApparelPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimaryInverted-0d7_KjU */
        public long getBgApparelPrimaryInverted() {
            return this.$$delegate_0.getBgApparelPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondary-0d7_KjU */
        public long getBgApparelSecondary() {
            return this.$$delegate_0.getBgApparelSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondaryInverted-0d7_KjU */
        public long getBgApparelSecondaryInverted() {
            return this.$$delegate_0.getBgApparelSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAquaPrimary-0d7_KjU */
        public long getBgAquaPrimary() {
            return this.$$delegate_0.getBgAquaPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAttentionPrimary-0d7_KjU */
        public long getBgAttentionPrimary() {
            return this.$$delegate_0.getBgAttentionPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimary-0d7_KjU */
        public long getBgBestpricePrimary() {
            return this.$$delegate_0.getBgBestpricePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimaryInverted-0d7_KjU */
        public long getBgBestpricePrimaryInverted() {
            return this.$$delegate_0.getBgBestpricePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondary-0d7_KjU */
        public long getBgBestpriceSecondary() {
            return this.$$delegate_0.getBgBestpriceSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondaryInverted-0d7_KjU */
        public long getBgBestpriceSecondaryInverted() {
            return this.$$delegate_0.getBgBestpriceSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControl-0d7_KjU */
        public long getBgControl() {
            return this.$$delegate_0.getBgControl();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControlInverted-0d7_KjU */
        public long getBgControlInverted() {
            return this.$$delegate_0.getBgControlInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkCerulean-0d7_KjU */
        public long getBgDarkCerulean() {
            return this.$$delegate_0.getBgDarkCerulean();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkKey-0d7_KjU */
        public long getBgDarkKey() {
            return this.$$delegate_0.getBgDarkKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDoubtfullPrimary-0d7_KjU */
        public long getBgDoubtfullPrimary() {
            return this.$$delegate_0.getBgDoubtfullPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomPrimary-0d7_KjU */
        public long getBgEconomPrimary() {
            return this.$$delegate_0.getBgEconomPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomSecondary-0d7_KjU */
        public long getBgEconomSecondary() {
            return this.$$delegate_0.getBgEconomSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimary-0d7_KjU */
        public long getBgExpressPrimary() {
            return this.$$delegate_0.getBgExpressPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimaryInverted-0d7_KjU */
        public long getBgExpressPrimaryInverted() {
            return this.$$delegate_0.getBgExpressPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondary-0d7_KjU */
        public long getBgExpressSecondary() {
            return this.$$delegate_0.getBgExpressSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondaryInverted-0d7_KjU */
        public long getBgExpressSecondaryInverted() {
            return this.$$delegate_0.getBgExpressSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimary-0d7_KjU */
        public long getBgFreshPrimary() {
            return this.$$delegate_0.getBgFreshPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimaryInverted-0d7_KjU */
        public long getBgFreshPrimaryInverted() {
            return this.$$delegate_0.getBgFreshPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondary-0d7_KjU */
        public long getBgFreshSecondary() {
            return this.$$delegate_0.getBgFreshSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondaryInverted-0d7_KjU */
        public long getBgFreshSecondaryInverted() {
            return this.$$delegate_0.getBgFreshSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgGuaranteePrimary-0d7_KjU */
        public long getBgGuaranteePrimary() {
            return this.$$delegate_0.getBgGuaranteePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentPrimary-0d7_KjU */
        public long getBgInstalmentPrimary() {
            return this.$$delegate_0.getBgInstalmentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentSecondary-0d7_KjU */
        public long getBgInstalmentSecondary() {
            return this.$$delegate_0.getBgInstalmentSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgLightKey-0d7_KjU */
        public long getBgLightKey() {
            return this.$$delegate_0.getBgLightKey();
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
        /* renamed from: getBgMarketingSecondarySolid-0d7_KjU */
        public long getBgMarketingSecondarySolid() {
            return this.$$delegate_0.getBgMarketingSecondarySolid();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimary-0d7_KjU */
        public long getBgNegativePrimary() {
            return this.$$delegate_0.getBgNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimaryInverted-0d7_KjU */
        public long getBgNegativePrimaryInverted() {
            return this.$$delegate_0.getBgNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondary-0d7_KjU */
        public long getBgNegativeSecondary() {
            return this.$$delegate_0.getBgNegativeSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondaryInverted-0d7_KjU */
        public long getBgNegativeSecondaryInverted() {
            return this.$$delegate_0.getBgNegativeSecondaryInverted();
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
        /* renamed from: getBgOpaqueApparelSecondary-0d7_KjU */
        public long getBgOpaqueApparelSecondary() {
            return this.$$delegate_0.getBgOpaqueApparelSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueEconomSecondary-0d7_KjU */
        public long getBgOpaqueEconomSecondary() {
            return this.$$delegate_0.getBgOpaqueEconomSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueFreshSecondary-0d7_KjU */
        public long getBgOpaqueFreshSecondary() {
            return this.$$delegate_0.getBgOpaqueFreshSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueMarketingSecondary() {
            return this.bgOpaqueMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueNegativeSecondary-0d7_KjU */
        public long getBgOpaqueNegativeSecondary() {
            return this.$$delegate_0.getBgOpaqueNegativeSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueOzonSecondary-0d7_KjU */
        public long getBgOpaqueOzonSecondary() {
            return this.$$delegate_0.getBgOpaqueOzonSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaquePositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaquePositiveSecondary() {
            return this.bgOpaquePositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueSecondary-0d7_KjU */
        public long getBgOpaqueSecondary() {
            return this.$$delegate_0.getBgOpaqueSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueWarningSecondary() {
            return this.bgOpaqueWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlap-0d7_KjU */
        public long getBgOverlap() {
            return this.$$delegate_0.getBgOverlap();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlapInverted-0d7_KjU */
        public long getBgOverlapInverted() {
            return this.$$delegate_0.getBgOverlapInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOxford-0d7_KjU */
        public long getBgOxford() {
            return this.$$delegate_0.getBgOxford();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonPrimary-0d7_KjU */
        public long getBgOzonPrimary() {
            return this.$$delegate_0.getBgOzonPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonSecondary-0d7_KjU */
        public long getBgOzonSecondary() {
            return this.$$delegate_0.getBgOzonSecondary();
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
        /* renamed from: getBgPremiumPrimary-0d7_KjU */
        public long getBgPremiumPrimary() {
            return this.$$delegate_0.getBgPremiumPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumPrimaryInverted-0d7_KjU */
        public long getBgPremiumPrimaryInverted() {
            return this.$$delegate_0.getBgPremiumPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondary-0d7_KjU */
        public long getBgPremiumSecondary() {
            return this.$$delegate_0.getBgPremiumSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondaryInverted-0d7_KjU */
        public long getBgPremiumSecondaryInverted() {
            return this.$$delegate_0.getBgPremiumSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimary-0d7_KjU */
        public long getBgPrimary() {
            return this.$$delegate_0.getBgPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimaryInverted-0d7_KjU */
        public long getBgPrimaryInverted() {
            return this.$$delegate_0.getBgPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrussian-0d7_KjU */
        public long getBgPrussian() {
            return this.$$delegate_0.getBgPrussian();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSbp-0d7_KjU */
        public long getBgSbp() {
            return this.$$delegate_0.getBgSbp();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondary-0d7_KjU */
        public long getBgSecondary() {
            return this.$$delegate_0.getBgSecondary();
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
        /* renamed from: getBgSecondaryInverted-0d7_KjU */
        public long getBgSecondaryInverted() {
            return this.$$delegate_0.getBgSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelect-0d7_KjU */
        public long getBgSelect() {
            return this.$$delegate_0.getBgSelect();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelectInverted-0d7_KjU */
        public long getBgSelectInverted() {
            return this.$$delegate_0.getBgSelectInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTabbarPrimary-0d7_KjU */
        public long getBgTabbarPrimary() {
            return this.$$delegate_0.getBgTabbarPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTech-0d7_KjU */
        public long getBgTech() {
            return this.$$delegate_0.getBgTech();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgUltraPrimary-0d7_KjU */
        public long getBgUltraPrimary() {
            return this.$$delegate_0.getBgUltraPrimary();
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
        /* renamed from: getClearDarkKey100-0d7_KjU */
        public long getClearDarkKey100() {
            return this.$$delegate_0.getClearDarkKey100();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey200-0d7_KjU */
        public long getClearDarkKey200() {
            return this.$$delegate_0.getClearDarkKey200();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey300-0d7_KjU */
        public long getClearDarkKey300() {
            return this.$$delegate_0.getClearDarkKey300();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey400-0d7_KjU */
        public long getClearDarkKey400() {
            return this.$$delegate_0.getClearDarkKey400();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey500-0d7_KjU */
        public long getClearDarkKey500() {
            return this.$$delegate_0.getClearDarkKey500();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey600-0d7_KjU */
        public long getClearDarkKey600() {
            return this.$$delegate_0.getClearDarkKey600();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey700-0d7_KjU */
        public long getClearDarkKey700() {
            return this.$$delegate_0.getClearDarkKey700();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey800-0d7_KjU */
        public long getClearDarkKey800() {
            return this.$$delegate_0.getClearDarkKey800();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey0-0d7_KjU */
        public long getClearLightKey0() {
            return this.$$delegate_0.getClearLightKey0();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey100-0d7_KjU */
        public long getClearLightKey100() {
            return this.$$delegate_0.getClearLightKey100();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey200-0d7_KjU */
        public long getClearLightKey200() {
            return this.$$delegate_0.getClearLightKey200();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey300-0d7_KjU */
        public long getClearLightKey300() {
            return this.$$delegate_0.getClearLightKey300();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey400-0d7_KjU */
        public long getClearLightKey400() {
            return this.$$delegate_0.getClearLightKey400();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey500-0d7_KjU */
        public long getClearLightKey500() {
            return this.$$delegate_0.getClearLightKey500();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey600-0d7_KjU */
        public long getClearLightKey600() {
            return this.$$delegate_0.getClearLightKey600();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey700-0d7_KjU */
        public long getClearLightKey700() {
            return this.$$delegate_0.getClearLightKey700();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey800-0d7_KjU */
        public long getClearLightKey800() {
            return this.$$delegate_0.getClearLightKey800();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getDetectorColorMine-0d7_KjU */
        public long getDetectorColorMine() {
            return this.$$delegate_0.getDetectorColorMine();
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
        /* renamed from: getGraphicActiveApparel-0d7_KjU */
        public long getGraphicActiveApparel() {
            return this.$$delegate_0.getGraphicActiveApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveApparelInverted-0d7_KjU */
        public long getGraphicActiveApparelInverted() {
            return this.$$delegate_0.getGraphicActiveApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestprice-0d7_KjU */
        public long getGraphicActiveBestprice() {
            return this.$$delegate_0.getGraphicActiveBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestpriceInverted-0d7_KjU */
        public long getGraphicActiveBestpriceInverted() {
            return this.$$delegate_0.getGraphicActiveBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveEconom-0d7_KjU */
        public long getGraphicActiveEconom() {
            return this.$$delegate_0.getGraphicActiveEconom();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpress-0d7_KjU */
        public long getGraphicActiveExpress() {
            return this.$$delegate_0.getGraphicActiveExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpressInverted-0d7_KjU */
        public long getGraphicActiveExpressInverted() {
            return this.$$delegate_0.getGraphicActiveExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFresh-0d7_KjU */
        public long getGraphicActiveFresh() {
            return this.$$delegate_0.getGraphicActiveFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFreshInverted-0d7_KjU */
        public long getGraphicActiveFreshInverted() {
            return this.$$delegate_0.getGraphicActiveFreshInverted();
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
        /* renamed from: getGraphicActiveOzon-0d7_KjU */
        public long getGraphicActiveOzon() {
            return this.$$delegate_0.getGraphicActiveOzon();
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
        /* renamed from: getGraphicActivePremium-0d7_KjU */
        public long getGraphicActivePremium() {
            return this.$$delegate_0.getGraphicActivePremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumBlue-0d7_KjU */
        public long getGraphicActivePremiumBlue() {
            return this.$$delegate_0.getGraphicActivePremiumBlue();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumInverted-0d7_KjU */
        public long getGraphicActivePremiumInverted() {
            return this.$$delegate_0.getGraphicActivePremiumInverted();
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
        /* renamed from: getGraphicApparel-0d7_KjU */
        public long getGraphicApparel() {
            return this.$$delegate_0.getGraphicApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicApparelInverted-0d7_KjU */
        public long getGraphicApparelInverted() {
            return this.$$delegate_0.getGraphicApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestprice-0d7_KjU */
        public long getGraphicBestprice() {
            return this.$$delegate_0.getGraphicBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestpriceInverted-0d7_KjU */
        public long getGraphicBestpriceInverted() {
            return this.$$delegate_0.getGraphicBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkKey-0d7_KjU */
        public long getGraphicDarkKey() {
            return this.$$delegate_0.getGraphicDarkKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkerNeutralOnLight-0d7_KjU */
        public long getGraphicDarkerNeutralOnLight() {
            return this.$$delegate_0.getGraphicDarkerNeutralOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabled-0d7_KjU */
        public long getGraphicDisabled() {
            return this.$$delegate_0.getGraphicDisabled();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledInverted-0d7_KjU */
        public long getGraphicDisabledInverted() {
            return this.$$delegate_0.getGraphicDisabledInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnDark-0d7_KjU */
        public long getGraphicDisabledOnDark() {
            return this.$$delegate_0.getGraphicDisabledOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnLight-0d7_KjU */
        public long getGraphicDisabledOnLight() {
            return this.$$delegate_0.getGraphicDisabledOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicEconom-0d7_KjU */
        public long getGraphicEconom() {
            return this.$$delegate_0.getGraphicEconom();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpress-0d7_KjU */
        public long getGraphicExpress() {
            return this.$$delegate_0.getGraphicExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressInverted-0d7_KjU */
        public long getGraphicExpressInverted() {
            return this.$$delegate_0.getGraphicExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressOnDark-0d7_KjU */
        public long getGraphicExpressOnDark() {
            return this.$$delegate_0.getGraphicExpressOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGracePrimary-0d7_KjU */
        public long getGraphicFintechGracePrimary() {
            return this.$$delegate_0.getGraphicFintechGracePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGraceSecondary-0d7_KjU */
        public long getGraphicFintechGraceSecondary() {
            return this.$$delegate_0.getGraphicFintechGraceSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFresh-0d7_KjU */
        public long getGraphicFresh() {
            return this.$$delegate_0.getGraphicFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshInverted-0d7_KjU */
        public long getGraphicFreshInverted() {
            return this.$$delegate_0.getGraphicFreshInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshOnDark-0d7_KjU */
        public long getGraphicFreshOnDark() {
            return this.$$delegate_0.getGraphicFreshOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicGuarantee-0d7_KjU */
        public long getGraphicGuarantee() {
            return this.$$delegate_0.getGraphicGuarantee();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKey-0d7_KjU */
        public long getGraphicKey() {
            return this.$$delegate_0.getGraphicKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKeyInverted-0d7_KjU */
        public long getGraphicKeyInverted() {
            return this.$$delegate_0.getGraphicKeyInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicLightKey-0d7_KjU */
        public long getGraphicLightKey() {
            return this.$$delegate_0.getGraphicLightKey();
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
        /* renamed from: getGraphicNegativeOnDark-0d7_KjU */
        public long getGraphicNegativeOnDark() {
            return this.$$delegate_0.getGraphicNegativeOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimary-0d7_KjU */
        public long getGraphicNegativePrimary() {
            return this.$$delegate_0.getGraphicNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimaryInverted-0d7_KjU */
        public long getGraphicNegativePrimaryInverted() {
            return this.$$delegate_0.getGraphicNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutral-0d7_KjU */
        public long getGraphicNeutral() {
            return this.$$delegate_0.getGraphicNeutral();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralInverted-0d7_KjU */
        public long getGraphicNeutralInverted() {
            return this.$$delegate_0.getGraphicNeutralInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnDark-0d7_KjU */
        public long getGraphicNeutralOnDark() {
            return this.$$delegate_0.getGraphicNeutralOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnLight-0d7_KjU */
        public long getGraphicNeutralOnLight() {
            return this.$$delegate_0.getGraphicNeutralOnLight();
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
        /* renamed from: getGraphicOxford-0d7_KjU */
        public long getGraphicOxford() {
            return this.$$delegate_0.getGraphicOxford();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOzon-0d7_KjU */
        public long getGraphicOzon() {
            return this.$$delegate_0.getGraphicOzon();
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
        /* renamed from: getGraphicPremium-0d7_KjU */
        public long getGraphicPremium() {
            return this.$$delegate_0.getGraphicPremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumBlue-0d7_KjU */
        public long getGraphicPremiumBlue() {
            return this.$$delegate_0.getGraphicPremiumBlue();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumInverted-0d7_KjU */
        public long getGraphicPremiumInverted() {
            return this.$$delegate_0.getGraphicPremiumInverted();
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
        /* renamed from: getGraphicPrimaryInverted-0d7_KjU */
        public long getGraphicPrimaryInverted() {
            return this.$$delegate_0.getGraphicPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnDark-0d7_KjU */
        public long getGraphicPrimaryOnDark() {
            return this.$$delegate_0.getGraphicPrimaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnLight-0d7_KjU */
        public long getGraphicPrimaryOnLight() {
            return this.$$delegate_0.getGraphicPrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicQuaternary-0d7_KjU */
        public long getGraphicQuaternary() {
            return this.$$delegate_0.getGraphicQuaternary();
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
        /* renamed from: getGraphicSecondary-0d7_KjU */
        public long getGraphicSecondary() {
            return this.$$delegate_0.getGraphicSecondary();
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
        /* renamed from: getGraphicSecondaryInverted-0d7_KjU */
        public long getGraphicSecondaryInverted() {
            return this.$$delegate_0.getGraphicSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnDark-0d7_KjU */
        public long getGraphicSecondaryOnDark() {
            return this.$$delegate_0.getGraphicSecondaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnLight-0d7_KjU */
        public long getGraphicSecondaryOnLight() {
            return this.$$delegate_0.getGraphicSecondaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSolidNeutral-0d7_KjU */
        public long getGraphicSolidNeutral() {
            return this.$$delegate_0.getGraphicSolidNeutral();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicStrokeSticky-0d7_KjU */
        public long getGraphicStrokeSticky() {
            return this.$$delegate_0.getGraphicStrokeSticky();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconPrimary-0d7_KjU */
        public long getGraphicTabbarIconPrimary() {
            return this.$$delegate_0.getGraphicTabbarIconPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconSecondary-0d7_KjU */
        public long getGraphicTabbarIconSecondary() {
            return this.$$delegate_0.getGraphicTabbarIconSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTech-0d7_KjU */
        public long getGraphicTech() {
            return this.$$delegate_0.getGraphicTech();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiary-0d7_KjU */
        public long getGraphicTertiary() {
            return this.$$delegate_0.getGraphicTertiary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryDynamic() {
            return this.graphicTertiaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryInverted-0d7_KjU */
        public long getGraphicTertiaryInverted() {
            return this.$$delegate_0.getGraphicTertiaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnDark-0d7_KjU */
        public long getGraphicTertiaryOnDark() {
            return this.$$delegate_0.getGraphicTertiaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnLight-0d7_KjU */
        public long getGraphicTertiaryOnLight() {
            return this.$$delegate_0.getGraphicTertiaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicUltraPrimary-0d7_KjU */
        public long getGraphicUltraPrimary() {
            return this.$$delegate_0.getGraphicUltraPrimary();
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
        /* renamed from: getLayerActiveFloor1-0d7_KjU */
        public long getLayerActiveFloor1() {
            return this.$$delegate_0.getLayerActiveFloor1();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor1Inverted-0d7_KjU */
        public long getLayerActiveFloor1Inverted() {
            return this.$$delegate_0.getLayerActiveFloor1Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2-0d7_KjU */
        public long getLayerActiveFloor2() {
            return this.$$delegate_0.getLayerActiveFloor2();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2Inverted-0d7_KjU */
        public long getLayerActiveFloor2Inverted() {
            return this.$$delegate_0.getLayerActiveFloor2Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3-0d7_KjU */
        public long getLayerActiveFloor3() {
            return this.$$delegate_0.getLayerActiveFloor3();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3Inverted-0d7_KjU */
        public long getLayerActiveFloor3Inverted() {
            return this.$$delegate_0.getLayerActiveFloor3Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurface-0d7_KjU */
        public long getLayerActiveSurface() {
            return this.$$delegate_0.getLayerActiveSurface();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurfaceInverted-0d7_KjU */
        public long getLayerActiveSurfaceInverted() {
            return this.$$delegate_0.getLayerActiveSurfaceInverted();
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
        /* renamed from: getLayerFloor1-0d7_KjU */
        public long getLayerFloor1() {
            return this.$$delegate_0.getLayerFloor1();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1Inverted-0d7_KjU */
        public long getLayerFloor1Inverted() {
            return this.$$delegate_0.getLayerFloor1Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1OnDark-0d7_KjU */
        public long getLayerFloor1OnDark() {
            return this.$$delegate_0.getLayerFloor1OnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2-0d7_KjU */
        public long getLayerFloor2() {
            return this.$$delegate_0.getLayerFloor2();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2Inverted-0d7_KjU */
        public long getLayerFloor2Inverted() {
            return this.$$delegate_0.getLayerFloor2Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3-0d7_KjU */
        public long getLayerFloor3() {
            return this.$$delegate_0.getLayerFloor3();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3Inverted-0d7_KjU */
        public long getLayerFloor3Inverted() {
            return this.$$delegate_0.getLayerFloor3Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimming-0d7_KjU */
        public long getLayerOverlayDimming() {
            return this.$$delegate_0.getLayerOverlayDimming();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimmingInverted-0d7_KjU */
        public long getLayerOverlayDimmingInverted() {
            return this.$$delegate_0.getLayerOverlayDimmingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanja-0d7_KjU */
        public long getLayerOverlayParanja() {
            return this.$$delegate_0.getLayerOverlayParanja();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanjaInverted-0d7_KjU */
        public long getLayerOverlayParanjaInverted() {
            return this.$$delegate_0.getLayerOverlayParanjaInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurface-0d7_KjU */
        public long getLayerSurface() {
            return this.$$delegate_0.getLayerSurface();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurfaceInverted-0d7_KjU */
        public long getLayerSurfaceInverted() {
            return this.$$delegate_0.getLayerSurfaceInverted();
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
        /* renamed from: getTextActiveApparel-0d7_KjU */
        public long getTextActiveApparel() {
            return this.$$delegate_0.getTextActiveApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveApparelInverted-0d7_KjU */
        public long getTextActiveApparelInverted() {
            return this.$$delegate_0.getTextActiveApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestprice-0d7_KjU */
        public long getTextActiveBestprice() {
            return this.$$delegate_0.getTextActiveBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestpriceInverted-0d7_KjU */
        public long getTextActiveBestpriceInverted() {
            return this.$$delegate_0.getTextActiveBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpress-0d7_KjU */
        public long getTextActiveExpress() {
            return this.$$delegate_0.getTextActiveExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpressInverted-0d7_KjU */
        public long getTextActiveExpressInverted() {
            return this.$$delegate_0.getTextActiveExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFresh-0d7_KjU */
        public long getTextActiveFresh() {
            return this.$$delegate_0.getTextActiveFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFreshInverted-0d7_KjU */
        public long getTextActiveFreshInverted() {
            return this.$$delegate_0.getTextActiveFreshInverted();
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
        /* renamed from: getTextActiveNegative-0d7_KjU */
        public long getTextActiveNegative() {
            return this.$$delegate_0.getTextActiveNegative();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveNegativeInverted-0d7_KjU */
        public long getTextActiveNegativeInverted() {
            return this.$$delegate_0.getTextActiveNegativeInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveOzon-0d7_KjU */
        public long getTextActiveOzon() {
            return this.$$delegate_0.getTextActiveOzon();
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
        /* renamed from: getTextActivePremium-0d7_KjU */
        public long getTextActivePremium() {
            return this.$$delegate_0.getTextActivePremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePremiumInverted-0d7_KjU */
        public long getTextActivePremiumInverted() {
            return this.$$delegate_0.getTextActivePremiumInverted();
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
        /* renamed from: getTextApparel-0d7_KjU */
        public long getTextApparel() {
            return this.$$delegate_0.getTextApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextApparelInverted-0d7_KjU */
        public long getTextApparelInverted() {
            return this.$$delegate_0.getTextApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestprice-0d7_KjU */
        public long getTextBestprice() {
            return this.$$delegate_0.getTextBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestpriceInverted-0d7_KjU */
        public long getTextBestpriceInverted() {
            return this.$$delegate_0.getTextBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDarkKey-0d7_KjU */
        public long getTextDarkKey() {
            return this.$$delegate_0.getTextDarkKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDiscountUnavialable-0d7_KjU */
        public long getTextDiscountUnavialable() {
            return this.$$delegate_0.getTextDiscountUnavialable();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextEconom-0d7_KjU */
        public long getTextEconom() {
            return this.$$delegate_0.getTextEconom();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpress-0d7_KjU */
        public long getTextExpress() {
            return this.$$delegate_0.getTextExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressInverted-0d7_KjU */
        public long getTextExpressInverted() {
            return this.$$delegate_0.getTextExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressOnDark-0d7_KjU */
        public long getTextExpressOnDark() {
            return this.$$delegate_0.getTextExpressOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFresh-0d7_KjU */
        public long getTextFresh() {
            return this.$$delegate_0.getTextFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshInverted-0d7_KjU */
        public long getTextFreshInverted() {
            return this.$$delegate_0.getTextFreshInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshOnDark-0d7_KjU */
        public long getTextFreshOnDark() {
            return this.$$delegate_0.getTextFreshOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextGuarantee-0d7_KjU */
        public long getTextGuarantee() {
            return this.$$delegate_0.getTextGuarantee();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextLightKey-0d7_KjU */
        public long getTextLightKey() {
            return this.$$delegate_0.getTextLightKey();
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
        /* renamed from: getTextNegative-0d7_KjU */
        public long getTextNegative() {
            return this.$$delegate_0.getTextNegative();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeInverted-0d7_KjU */
        public long getTextNegativeInverted() {
            return this.$$delegate_0.getTextNegativeInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeOnDark-0d7_KjU */
        public long getTextNegativeOnDark() {
            return this.$$delegate_0.getTextNegativeOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalprice-0d7_KjU */
        public long getTextOriginalprice() {
            return this.$$delegate_0.getTextOriginalprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalpriceAvailable-0d7_KjU */
        public long getTextOriginalpriceAvailable() {
            return this.$$delegate_0.getTextOriginalpriceAvailable();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOxford-0d7_KjU */
        public long getTextOxford() {
            return this.$$delegate_0.getTextOxford();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOzon-0d7_KjU */
        public long getTextOzon() {
            return this.$$delegate_0.getTextOzon();
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
        /* renamed from: getTextPremium-0d7_KjU */
        public long getTextPremium() {
            return this.$$delegate_0.getTextPremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPremiumInverted-0d7_KjU */
        public long getTextPremiumInverted() {
            return this.$$delegate_0.getTextPremiumInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimary-0d7_KjU */
        public long getTextPrimary() {
            return this.$$delegate_0.getTextPrimary();
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
        /* renamed from: getTextPrimaryInverted-0d7_KjU */
        public long getTextPrimaryInverted() {
            return this.$$delegate_0.getTextPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnDark-0d7_KjU */
        public long getTextPrimaryOnDark() {
            return this.$$delegate_0.getTextPrimaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnLight-0d7_KjU */
        public long getTextPrimaryOnLight() {
            return this.$$delegate_0.getTextPrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondary-0d7_KjU */
        public long getTextSecondary() {
            return this.$$delegate_0.getTextSecondary();
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
        /* renamed from: getTextSecondaryInverted-0d7_KjU */
        public long getTextSecondaryInverted() {
            return this.$$delegate_0.getTextSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnDark-0d7_KjU */
        public long getTextSecondaryOnDark() {
            return this.$$delegate_0.getTextSecondaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnLight-0d7_KjU */
        public long getTextSecondaryOnLight() {
            return this.$$delegate_0.getTextSecondaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTech-0d7_KjU */
        public long getTextTech() {
            return this.$$delegate_0.getTextTech();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiary-0d7_KjU */
        public long getTextTertiary() {
            return this.$$delegate_0.getTextTertiary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryInverted-0d7_KjU */
        public long getTextTertiaryInverted() {
            return this.$$delegate_0.getTextTertiaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnDark-0d7_KjU */
        public long getTextTertiaryOnDark() {
            return this.$$delegate_0.getTextTertiaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnLight-0d7_KjU */
        public long getTextTertiaryOnLight() {
            return this.$$delegate_0.getTextTertiaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextUltra-0d7_KjU */
        public long getTextUltra() {
            return this.$$delegate_0.getTextUltra();
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
        /* renamed from: isDark */
        public boolean getIsDark() {
            return this.$$delegate_0.getIsDark();
        }
    };

    @NotNull
    private static final UniColorScheme SelectDarkColorScheme = new UniColorScheme() { // from class: ru.ozon.uni.core.compose.theme.SelectColorSchemeKt$SelectDarkColorScheme$1
        private final /* synthetic */ UniColorScheme $$delegate_0 = DefaultUniColorSchemeKt.getDefaultDarkUniColorScheme();
        private final long bgAccentOnLight;
        private final long bgAccentPrimary;
        private final long bgAccentPrimaryInverted;
        private final long bgAccentSecondary;
        private final long bgAccentSecondaryInverted;
        private final long bgActionPrimary;
        private final long bgActionPrimaryInverted;
        private final long bgActionSecondary;
        private final long bgActionSecondaryInverted;
        private final long bgActiveAccentPrimary;
        private final long bgActiveAccentPrimaryInverted;
        private final long bgActiveAccentSecondary;
        private final long bgActiveAccentSecondaryInverted;
        private final long bgActiveActionPrimary;
        private final long bgActiveActionPrimaryInverted;
        private final long bgActiveActionSecondary;
        private final long bgActiveActionSecondaryInverted;
        private final long bgActiveMarketingPrimary;
        private final long bgActiveMarketingPrimaryInverted;
        private final long bgActiveMarketingSecondary;
        private final long bgActiveMarketingSecondaryInverted;
        private final long bgActivePositivePrimary;
        private final long bgActivePositivePrimaryInverted;
        private final long bgActivePositiveSecondary;
        private final long bgActivePositiveSecondaryInverted;
        private final long bgActiveWarningPrimary;
        private final long bgActiveWarningPrimaryInverted;
        private final long bgActiveWarningSecondary;
        private final long bgActiveWarningSecondaryInverted;
        private final long bgMarketingOnLight;
        private final long bgMarketingPrimary;
        private final long bgMarketingPrimaryInverted;
        private final long bgMarketingSecondary;
        private final long bgMarketingSecondaryInverted;
        private final long bgOpaqueAccentSecondary;
        private final long bgOpaqueActionSecondary;
        private final long bgOpaqueMarketingSecondary;
        private final long bgOpaquePositiveSecondary;
        private final long bgOpaqueWarningSecondary;
        private final long bgPositiveOnLight;
        private final long bgPositivePrimary;
        private final long bgPositivePrimaryInverted;
        private final long bgPositiveSecondary;
        private final long bgPositiveSecondaryInverted;
        private final long bgSecondaryDynamic;
        private final long bgSecondaryDynamicInverted;
        private final long bgWarningOnLight;
        private final long bgWarningPrimary;
        private final long bgWarningPrimaryInverted;
        private final long bgWarningSecondary;
        private final long bgWarningSecondaryInverted;
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
        private final long graphicActiveMarketing;
        private final long graphicActiveMarketingInverted;
        private final long graphicActiveNegativePrimary;
        private final long graphicActiveNegativePrimaryInverted;
        private final long graphicActivePositivePrimary;
        private final long graphicActivePositivePrimaryInverted;
        private final long graphicActiveRating;
        private final long graphicActiveRatingInverted;
        private final long graphicActiveWarningPrimary;
        private final long graphicActiveWarningPrimaryInverted;
        private final long graphicMarketing;
        private final long graphicMarketingInverted;
        private final long graphicMarketingOnDark;
        private final long graphicMarketingOnLight;
        private final long graphicOverlapPrimary;
        private final long graphicOverlapPrimaryDynamic;
        private final long graphicPositiveOnDark;
        private final long graphicPositivePrimary;
        private final long graphicPositivePrimaryInverted;
        private final long graphicPositivePrimaryOnLight;
        private final long graphicPositiveSecondary;
        private final long graphicPrimary;
        private final long graphicPrimaryDynamic;
        private final long graphicPrimaryDynamicInverted;
        private final long graphicRating;
        private final long graphicRatingInverted;
        private final long graphicSecondaryDynamic;
        private final long graphicSecondaryDynamicInverted;
        private final long graphicTertiaryDynamic;
        private final long graphicWarningOnDark;
        private final long graphicWarningPrimary;
        private final long graphicWarningPrimaryInverted;
        private final long graphicWarningPrimaryOnLight;
        private final long layerActiveFloor0;
        private final long layerFloor0;
        private final long layerFloor0Inverted;
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
        private final long textActiveMarketing;
        private final long textActiveMarketingInverted;
        private final long textActivePositive;
        private final long textActivePositiveInverted;
        private final long textActiveWarning;
        private final long textActiveWarningInverted;
        private final long textMarketing;
        private final long textMarketingInverted;
        private final long textMarketingOnDark;
        private final long textMarketingOnLight;
        private final long textPositive;
        private final long textPositiveInverted;
        private final long textPositiveOnDark;
        private final long textPositiveOnLight;
        private final long textPrimaryDynamic;
        private final long textPrimaryDynamicInverted;
        private final long textSecondaryDynamic;
        private final long textSecondaryDynamicInverted;
        private final long textWarning;
        private final long textWarningInverted;
        private final long textWarningOnDark;

        {
            UniCoreColors uniCoreColors = UniCoreColors.INSTANCE;
            this.bgAccentOnLight = uniCoreColors.m2892getStrawberry1000d7_KjU();
            this.bgMarketingOnLight = uniCoreColors.m2871getPortage1000d7_KjU();
            this.bgPositiveOnLight = uniCoreColors.m2903getTurquoise500d7_KjU();
            this.bgWarningOnLight = uniCoreColors.m2819getMango1000d7_KjU();
            this.graphicAccentOnLight = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.graphicActionOnDark = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicActionOnLight = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicMarketingOnDark = uniCoreColors.m2912getViolet5000d7_KjU();
            this.graphicMarketingOnLight = uniCoreColors.m2876getPortage8000d7_KjU();
            this.graphicPositiveOnDark = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.graphicPositivePrimaryOnLight = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.graphicWarningOnDark = uniCoreColors.m2825getMango9000d7_KjU();
            this.graphicWarningPrimaryOnLight = uniCoreColors.m2825getMango9000d7_KjU();
            this.textAccentOnLight = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.textActionOnDark = uniCoreColors.m2919getWhite0d7_KjU();
            this.textActionOnLight = uniCoreColors.m2740getBlack0d7_KjU();
            this.textMarketingOnDark = uniCoreColors.m2912getViolet5000d7_KjU();
            this.textMarketingOnLight = uniCoreColors.m2876getPortage8000d7_KjU();
            this.textPositiveOnDark = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.textPositiveOnLight = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.textWarningOnDark = uniCoreColors.m2825getMango9000d7_KjU();
            this.bgAccentPrimaryInverted = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.bgAccentPrimary = uniCoreColors.m2896getStrawberry6000d7_KjU();
            this.bgAccentSecondaryInverted = uniCoreColors.m2892getStrawberry1000d7_KjU();
            this.bgAccentSecondary = uniCoreColors.m2893getStrawberry10000d7_KjU();
            this.bgActionPrimaryInverted = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.bgActionPrimary = uniCoreColors.m2784getBrandSelectSelectGray1000d7_KjU();
            this.bgActionSecondaryInverted = uniCoreColors.m2781getBrandSelectSelectBlue250d7_KjU();
            this.bgActionSecondary = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.bgActiveAccentPrimaryInverted = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.bgActiveAccentPrimary = uniCoreColors.m2895getStrawberry5000d7_KjU();
            this.bgActiveAccentSecondaryInverted = uniCoreColors.m2894getStrawberry2000d7_KjU();
            this.bgActiveAccentSecondary = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.bgActiveActionPrimaryInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.bgActiveActionPrimary = uniCoreColors.m2919getWhite0d7_KjU();
            this.bgActiveActionSecondaryInverted = uniCoreColors.m2782getBrandSelectSelectBlue500d7_KjU();
            this.bgActiveActionSecondary = uniCoreColors.m2922getWhiteTransparent1200d7_KjU();
            this.bgActiveMarketingPrimaryInverted = uniCoreColors.m2877getPortage9000d7_KjU();
            this.bgActiveMarketingPrimary = uniCoreColors.m2873getPortage3000d7_KjU();
            this.bgActiveMarketingSecondaryInverted = uniCoreColors.m2878getPortage9500d7_KjU();
            this.bgActiveMarketingSecondary = uniCoreColors.m2878getPortage9500d7_KjU();
            this.bgActivePositivePrimaryInverted = uniCoreColors.m2906getTurquoise9000d7_KjU();
            this.bgActivePositivePrimary = uniCoreColors.m2902getTurquoise3000d7_KjU();
            this.bgActivePositiveSecondaryInverted = uniCoreColors.m2900getTurquoise1000d7_KjU();
            this.bgActivePositiveSecondary = uniCoreColors.m2907getTurquoise9500d7_KjU();
            this.bgActiveWarningPrimaryInverted = uniCoreColors.m2826getMango9500d7_KjU();
            this.bgActiveWarningPrimary = uniCoreColors.m2823getMango4000d7_KjU();
            this.bgActiveWarningSecondaryInverted = uniCoreColors.m2822getMango2000d7_KjU();
            this.bgActiveWarningSecondary = uniCoreColors.m2820getMango10000d7_KjU();
            this.bgMarketingPrimaryInverted = uniCoreColors.m2876getPortage8000d7_KjU();
            this.bgMarketingPrimary = uniCoreColors.m2874getPortage4000d7_KjU();
            this.bgMarketingSecondaryInverted = uniCoreColors.m2875getPortage500d7_KjU();
            this.bgMarketingSecondary = uniCoreColors.m2872getPortage10000d7_KjU();
            this.bgOpaqueAccentSecondary = uniCoreColors.m2893getStrawberry10000d7_KjU();
            this.bgOpaqueActionSecondary = uniCoreColors.m2780getBrandSelectSelectBlack2000d7_KjU();
            this.bgOpaqueMarketingSecondary = uniCoreColors.m2872getPortage10000d7_KjU();
            this.bgOpaquePositiveSecondary = uniCoreColors.m2901getTurquoise10000d7_KjU();
            this.bgOpaqueWarningSecondary = uniCoreColors.m2821getMango11000d7_KjU();
            this.bgPositivePrimaryInverted = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.bgPositivePrimary = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.bgPositiveSecondaryInverted = uniCoreColors.m2903getTurquoise500d7_KjU();
            this.bgPositiveSecondary = uniCoreColors.m2901getTurquoise10000d7_KjU();
            this.bgSecondaryDynamicInverted = uniCoreColors.m2930getWhiteTransparent500d7_KjU();
            this.bgSecondaryDynamic = uniCoreColors.m2781getBrandSelectSelectBlue250d7_KjU();
            this.bgWarningPrimaryInverted = uniCoreColors.m2825getMango9000d7_KjU();
            this.bgWarningPrimary = uniCoreColors.m2824getMango5000d7_KjU();
            this.bgWarningSecondaryInverted = uniCoreColors.m2819getMango1000d7_KjU();
            this.bgWarningSecondary = uniCoreColors.m2821getMango11000d7_KjU();
            this.graphicAccentPrimaryInverted = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.graphicAccentPrimary = uniCoreColors.m2896getStrawberry6000d7_KjU();
            this.graphicActionPrimaryInverted = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicActionPrimary = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicActiveAccentPrimaryInverted = uniCoreColors.m2899getStrawberry9500d7_KjU();
            this.graphicActiveAccentPrimary = uniCoreColors.m2895getStrawberry5000d7_KjU();
            this.graphicActiveActionPrimaryInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicActiveActionPrimary = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicActiveMarketingInverted = uniCoreColors.m2877getPortage9000d7_KjU();
            this.graphicActiveMarketing = uniCoreColors.m2873getPortage3000d7_KjU();
            this.graphicActiveNegativePrimaryInverted = uniCoreColors.m2884getRed5000d7_KjU();
            this.graphicActiveNegativePrimary = uniCoreColors.m2882getRed4000d7_KjU();
            this.graphicActivePositivePrimaryInverted = uniCoreColors.m2906getTurquoise9000d7_KjU();
            this.graphicActivePositivePrimary = uniCoreColors.m2902getTurquoise3000d7_KjU();
            this.graphicActiveRatingInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicActiveRating = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicActiveWarningPrimaryInverted = uniCoreColors.m2826getMango9500d7_KjU();
            this.graphicActiveWarningPrimary = uniCoreColors.m2823getMango4000d7_KjU();
            this.graphicMarketingInverted = uniCoreColors.m2876getPortage8000d7_KjU();
            this.graphicMarketing = uniCoreColors.m2874getPortage4000d7_KjU();
            this.graphicOverlapPrimaryDynamic = uniCoreColors.m2783getBrandSelectSelectCarbon3000d7_KjU();
            this.graphicOverlapPrimary = uniCoreColors.m2783getBrandSelectSelectCarbon3000d7_KjU();
            this.graphicPositivePrimaryInverted = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.graphicPositivePrimary = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.graphicPositiveSecondary = uniCoreColors.m2901getTurquoise10000d7_KjU();
            this.graphicPrimaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicPrimaryDynamic = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicPrimary = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicRatingInverted = uniCoreColors.m2779getBrandSelectSelectBlack1000d7_KjU();
            this.graphicRating = uniCoreColors.m2786getBrandSelectSelectGray250d7_KjU();
            this.graphicSecondaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.graphicSecondaryDynamic = uniCoreColors.m2740getBlack0d7_KjU();
            this.graphicTertiaryDynamic = uniCoreColors.m2842getNeutralTransparent4000d7_KjU();
            this.graphicWarningPrimaryInverted = uniCoreColors.m2825getMango9000d7_KjU();
            this.graphicWarningPrimary = uniCoreColors.m2824getMango5000d7_KjU();
            this.layerActiveFloor0 = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerFloor0Inverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.layerFloor0 = uniCoreColors.m2740getBlack0d7_KjU();
            this.textAccentInverted = uniCoreColors.m2897getStrawberry8000d7_KjU();
            this.textAccent = uniCoreColors.m2896getStrawberry6000d7_KjU();
            this.textActionInverted = uniCoreColors.m2740getBlack0d7_KjU();
            this.textAction = uniCoreColors.m2919getWhite0d7_KjU();
            this.textActiveAccentInverted = uniCoreColors.m2898getStrawberry9000d7_KjU();
            this.textActiveAccent = uniCoreColors.m2895getStrawberry5000d7_KjU();
            this.textActiveActionInverted = uniCoreColors.m2788getBrandSelectSelectGray8500d7_KjU();
            this.textActiveAction = uniCoreColors.m2785getBrandSelectSelectGray1500d7_KjU();
            this.textActiveMarketingInverted = uniCoreColors.m2877getPortage9000d7_KjU();
            this.textActiveMarketing = uniCoreColors.m2873getPortage3000d7_KjU();
            this.textActivePositiveInverted = uniCoreColors.m2906getTurquoise9000d7_KjU();
            this.textActivePositive = uniCoreColors.m2902getTurquoise3000d7_KjU();
            this.textActiveWarningInverted = uniCoreColors.m2826getMango9500d7_KjU();
            this.textActiveWarning = uniCoreColors.m2823getMango4000d7_KjU();
            this.textMarketingInverted = uniCoreColors.m2876getPortage8000d7_KjU();
            this.textMarketing = uniCoreColors.m2874getPortage4000d7_KjU();
            this.textPositiveInverted = uniCoreColors.m2905getTurquoise8000d7_KjU();
            this.textPositive = uniCoreColors.m2904getTurquoise5000d7_KjU();
            this.textPrimaryDynamicInverted = uniCoreColors.m2919getWhite0d7_KjU();
            this.textPrimaryDynamic = uniCoreColors.m2740getBlack0d7_KjU();
            this.textSecondaryDynamicInverted = uniCoreColors.m2932getWhiteTransparent6000d7_KjU();
            this.textSecondaryDynamic = uniCoreColors.m2843getNeutralTransparent5000d7_KjU();
            this.textWarningInverted = uniCoreColors.m2825getMango9000d7_KjU();
            this.textWarning = uniCoreColors.m2824getMango5000d7_KjU();
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
        /* renamed from: getBgActionSecondarySolid-0d7_KjU */
        public long getBgActionSecondarySolid() {
            return this.$$delegate_0.getBgActionSecondarySolid();
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
        /* renamed from: getBgActiveApparelPrimary-0d7_KjU */
        public long getBgActiveApparelPrimary() {
            return this.$$delegate_0.getBgActiveApparelPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimaryInverted-0d7_KjU */
        public long getBgActiveApparelPrimaryInverted() {
            return this.$$delegate_0.getBgActiveApparelPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondary-0d7_KjU */
        public long getBgActiveApparelSecondary() {
            return this.$$delegate_0.getBgActiveApparelSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelSecondaryInverted-0d7_KjU */
        public long getBgActiveApparelSecondaryInverted() {
            return this.$$delegate_0.getBgActiveApparelSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAquaPrimary-0d7_KjU */
        public long getBgActiveAquaPrimary() {
            return this.$$delegate_0.getBgActiveAquaPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimary-0d7_KjU */
        public long getBgActiveBestpricePrimary() {
            return this.$$delegate_0.getBgActiveBestpricePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpricePrimaryInverted-0d7_KjU */
        public long getBgActiveBestpricePrimaryInverted() {
            return this.$$delegate_0.getBgActiveBestpricePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondary-0d7_KjU */
        public long getBgActiveBestpriceSecondary() {
            return this.$$delegate_0.getBgActiveBestpriceSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveBestpriceSecondaryInverted-0d7_KjU */
        public long getBgActiveBestpriceSecondaryInverted() {
            return this.$$delegate_0.getBgActiveBestpriceSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomPrimary-0d7_KjU */
        public long getBgActiveEconomPrimary() {
            return this.$$delegate_0.getBgActiveEconomPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveEconomSecondary-0d7_KjU */
        public long getBgActiveEconomSecondary() {
            return this.$$delegate_0.getBgActiveEconomSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimary-0d7_KjU */
        public long getBgActiveExpressPrimary() {
            return this.$$delegate_0.getBgActiveExpressPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressPrimaryInverted-0d7_KjU */
        public long getBgActiveExpressPrimaryInverted() {
            return this.$$delegate_0.getBgActiveExpressPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondary-0d7_KjU */
        public long getBgActiveExpressSecondary() {
            return this.$$delegate_0.getBgActiveExpressSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveExpressSecondaryInverted-0d7_KjU */
        public long getBgActiveExpressSecondaryInverted() {
            return this.$$delegate_0.getBgActiveExpressSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimary-0d7_KjU */
        public long getBgActiveFreshPrimary() {
            return this.$$delegate_0.getBgActiveFreshPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshPrimaryInverted-0d7_KjU */
        public long getBgActiveFreshPrimaryInverted() {
            return this.$$delegate_0.getBgActiveFreshPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondary-0d7_KjU */
        public long getBgActiveFreshSecondary() {
            return this.$$delegate_0.getBgActiveFreshSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveFreshSecondaryInverted-0d7_KjU */
        public long getBgActiveFreshSecondaryInverted() {
            return this.$$delegate_0.getBgActiveFreshSecondaryInverted();
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
        /* renamed from: getBgActiveNegativePrimary-0d7_KjU */
        public long getBgActiveNegativePrimary() {
            return this.$$delegate_0.getBgActiveNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativePrimaryInverted-0d7_KjU */
        public long getBgActiveNegativePrimaryInverted() {
            return this.$$delegate_0.getBgActiveNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondary-0d7_KjU */
        public long getBgActiveNegativeSecondary() {
            return this.$$delegate_0.getBgActiveNegativeSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveNegativeSecondaryInverted-0d7_KjU */
        public long getBgActiveNegativeSecondaryInverted() {
            return this.$$delegate_0.getBgActiveNegativeSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonPrimary-0d7_KjU */
        public long getBgActiveOzonPrimary() {
            return this.$$delegate_0.getBgActiveOzonPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveOzonSecondary-0d7_KjU */
        public long getBgActiveOzonSecondary() {
            return this.$$delegate_0.getBgActiveOzonSecondary();
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
        /* renamed from: getBgActivePremiumPrimary-0d7_KjU */
        public long getBgActivePremiumPrimary() {
            return this.$$delegate_0.getBgActivePremiumPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumPrimaryInverted-0d7_KjU */
        public long getBgActivePremiumPrimaryInverted() {
            return this.$$delegate_0.getBgActivePremiumPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondary-0d7_KjU */
        public long getBgActivePremiumSecondary() {
            return this.$$delegate_0.getBgActivePremiumSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePremiumSecondaryInverted-0d7_KjU */
        public long getBgActivePremiumSecondaryInverted() {
            return this.$$delegate_0.getBgActivePremiumSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimary-0d7_KjU */
        public long getBgActivePrimary() {
            return this.$$delegate_0.getBgActivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePrimaryInverted-0d7_KjU */
        public long getBgActivePrimaryInverted() {
            return this.$$delegate_0.getBgActivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondary-0d7_KjU */
        public long getBgActiveSecondary() {
            return this.$$delegate_0.getBgActiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSecondaryInverted-0d7_KjU */
        public long getBgActiveSecondaryInverted() {
            return this.$$delegate_0.getBgActiveSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelect-0d7_KjU */
        public long getBgActiveSelect() {
            return this.$$delegate_0.getBgActiveSelect();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveSelectInverted-0d7_KjU */
        public long getBgActiveSelectInverted() {
            return this.$$delegate_0.getBgActiveSelectInverted();
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
        /* renamed from: getBgApparelPiggy-0d7_KjU */
        public long getBgApparelPiggy() {
            return this.$$delegate_0.getBgApparelPiggy();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimary-0d7_KjU */
        public long getBgApparelPrimary() {
            return this.$$delegate_0.getBgApparelPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelPrimaryInverted-0d7_KjU */
        public long getBgApparelPrimaryInverted() {
            return this.$$delegate_0.getBgApparelPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondary-0d7_KjU */
        public long getBgApparelSecondary() {
            return this.$$delegate_0.getBgApparelSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgApparelSecondaryInverted-0d7_KjU */
        public long getBgApparelSecondaryInverted() {
            return this.$$delegate_0.getBgApparelSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAquaPrimary-0d7_KjU */
        public long getBgAquaPrimary() {
            return this.$$delegate_0.getBgAquaPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAttentionPrimary-0d7_KjU */
        public long getBgAttentionPrimary() {
            return this.$$delegate_0.getBgAttentionPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimary-0d7_KjU */
        public long getBgBestpricePrimary() {
            return this.$$delegate_0.getBgBestpricePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpricePrimaryInverted-0d7_KjU */
        public long getBgBestpricePrimaryInverted() {
            return this.$$delegate_0.getBgBestpricePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondary-0d7_KjU */
        public long getBgBestpriceSecondary() {
            return this.$$delegate_0.getBgBestpriceSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgBestpriceSecondaryInverted-0d7_KjU */
        public long getBgBestpriceSecondaryInverted() {
            return this.$$delegate_0.getBgBestpriceSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControl-0d7_KjU */
        public long getBgControl() {
            return this.$$delegate_0.getBgControl();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgControlInverted-0d7_KjU */
        public long getBgControlInverted() {
            return this.$$delegate_0.getBgControlInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkCerulean-0d7_KjU */
        public long getBgDarkCerulean() {
            return this.$$delegate_0.getBgDarkCerulean();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDarkKey-0d7_KjU */
        public long getBgDarkKey() {
            return this.$$delegate_0.getBgDarkKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgDoubtfullPrimary-0d7_KjU */
        public long getBgDoubtfullPrimary() {
            return this.$$delegate_0.getBgDoubtfullPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomPrimary-0d7_KjU */
        public long getBgEconomPrimary() {
            return this.$$delegate_0.getBgEconomPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgEconomSecondary-0d7_KjU */
        public long getBgEconomSecondary() {
            return this.$$delegate_0.getBgEconomSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimary-0d7_KjU */
        public long getBgExpressPrimary() {
            return this.$$delegate_0.getBgExpressPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressPrimaryInverted-0d7_KjU */
        public long getBgExpressPrimaryInverted() {
            return this.$$delegate_0.getBgExpressPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondary-0d7_KjU */
        public long getBgExpressSecondary() {
            return this.$$delegate_0.getBgExpressSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgExpressSecondaryInverted-0d7_KjU */
        public long getBgExpressSecondaryInverted() {
            return this.$$delegate_0.getBgExpressSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimary-0d7_KjU */
        public long getBgFreshPrimary() {
            return this.$$delegate_0.getBgFreshPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshPrimaryInverted-0d7_KjU */
        public long getBgFreshPrimaryInverted() {
            return this.$$delegate_0.getBgFreshPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondary-0d7_KjU */
        public long getBgFreshSecondary() {
            return this.$$delegate_0.getBgFreshSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgFreshSecondaryInverted-0d7_KjU */
        public long getBgFreshSecondaryInverted() {
            return this.$$delegate_0.getBgFreshSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgGuaranteePrimary-0d7_KjU */
        public long getBgGuaranteePrimary() {
            return this.$$delegate_0.getBgGuaranteePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentPrimary-0d7_KjU */
        public long getBgInstalmentPrimary() {
            return this.$$delegate_0.getBgInstalmentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgInstalmentSecondary-0d7_KjU */
        public long getBgInstalmentSecondary() {
            return this.$$delegate_0.getBgInstalmentSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgLightKey-0d7_KjU */
        public long getBgLightKey() {
            return this.$$delegate_0.getBgLightKey();
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
        /* renamed from: getBgMarketingSecondarySolid-0d7_KjU */
        public long getBgMarketingSecondarySolid() {
            return this.$$delegate_0.getBgMarketingSecondarySolid();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimary-0d7_KjU */
        public long getBgNegativePrimary() {
            return this.$$delegate_0.getBgNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativePrimaryInverted-0d7_KjU */
        public long getBgNegativePrimaryInverted() {
            return this.$$delegate_0.getBgNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondary-0d7_KjU */
        public long getBgNegativeSecondary() {
            return this.$$delegate_0.getBgNegativeSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgNegativeSecondaryInverted-0d7_KjU */
        public long getBgNegativeSecondaryInverted() {
            return this.$$delegate_0.getBgNegativeSecondaryInverted();
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
        /* renamed from: getBgOpaqueApparelSecondary-0d7_KjU */
        public long getBgOpaqueApparelSecondary() {
            return this.$$delegate_0.getBgOpaqueApparelSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueEconomSecondary-0d7_KjU */
        public long getBgOpaqueEconomSecondary() {
            return this.$$delegate_0.getBgOpaqueEconomSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueFreshSecondary-0d7_KjU */
        public long getBgOpaqueFreshSecondary() {
            return this.$$delegate_0.getBgOpaqueFreshSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueMarketingSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueMarketingSecondary() {
            return this.bgOpaqueMarketingSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueNegativeSecondary-0d7_KjU */
        public long getBgOpaqueNegativeSecondary() {
            return this.$$delegate_0.getBgOpaqueNegativeSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueOzonSecondary-0d7_KjU */
        public long getBgOpaqueOzonSecondary() {
            return this.$$delegate_0.getBgOpaqueOzonSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaquePositiveSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaquePositiveSecondary() {
            return this.bgOpaquePositiveSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueSecondary-0d7_KjU */
        public long getBgOpaqueSecondary() {
            return this.$$delegate_0.getBgOpaqueSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueWarningSecondary-0d7_KjU, reason: from getter */
        public long getBgOpaqueWarningSecondary() {
            return this.bgOpaqueWarningSecondary;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlap-0d7_KjU */
        public long getBgOverlap() {
            return this.$$delegate_0.getBgOverlap();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOverlapInverted-0d7_KjU */
        public long getBgOverlapInverted() {
            return this.$$delegate_0.getBgOverlapInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOxford-0d7_KjU */
        public long getBgOxford() {
            return this.$$delegate_0.getBgOxford();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonPrimary-0d7_KjU */
        public long getBgOzonPrimary() {
            return this.$$delegate_0.getBgOzonPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOzonSecondary-0d7_KjU */
        public long getBgOzonSecondary() {
            return this.$$delegate_0.getBgOzonSecondary();
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
        /* renamed from: getBgPremiumPrimary-0d7_KjU */
        public long getBgPremiumPrimary() {
            return this.$$delegate_0.getBgPremiumPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumPrimaryInverted-0d7_KjU */
        public long getBgPremiumPrimaryInverted() {
            return this.$$delegate_0.getBgPremiumPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondary-0d7_KjU */
        public long getBgPremiumSecondary() {
            return this.$$delegate_0.getBgPremiumSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPremiumSecondaryInverted-0d7_KjU */
        public long getBgPremiumSecondaryInverted() {
            return this.$$delegate_0.getBgPremiumSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimary-0d7_KjU */
        public long getBgPrimary() {
            return this.$$delegate_0.getBgPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrimaryInverted-0d7_KjU */
        public long getBgPrimaryInverted() {
            return this.$$delegate_0.getBgPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPrussian-0d7_KjU */
        public long getBgPrussian() {
            return this.$$delegate_0.getBgPrussian();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSbp-0d7_KjU */
        public long getBgSbp() {
            return this.$$delegate_0.getBgSbp();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondary-0d7_KjU */
        public long getBgSecondary() {
            return this.$$delegate_0.getBgSecondary();
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
        /* renamed from: getBgSecondaryInverted-0d7_KjU */
        public long getBgSecondaryInverted() {
            return this.$$delegate_0.getBgSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelect-0d7_KjU */
        public long getBgSelect() {
            return this.$$delegate_0.getBgSelect();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSelectInverted-0d7_KjU */
        public long getBgSelectInverted() {
            return this.$$delegate_0.getBgSelectInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTabbarPrimary-0d7_KjU */
        public long getBgTabbarPrimary() {
            return this.$$delegate_0.getBgTabbarPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgTech-0d7_KjU */
        public long getBgTech() {
            return this.$$delegate_0.getBgTech();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgUltraPrimary-0d7_KjU */
        public long getBgUltraPrimary() {
            return this.$$delegate_0.getBgUltraPrimary();
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
        /* renamed from: getClearDarkKey100-0d7_KjU */
        public long getClearDarkKey100() {
            return this.$$delegate_0.getClearDarkKey100();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey200-0d7_KjU */
        public long getClearDarkKey200() {
            return this.$$delegate_0.getClearDarkKey200();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey300-0d7_KjU */
        public long getClearDarkKey300() {
            return this.$$delegate_0.getClearDarkKey300();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey400-0d7_KjU */
        public long getClearDarkKey400() {
            return this.$$delegate_0.getClearDarkKey400();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey500-0d7_KjU */
        public long getClearDarkKey500() {
            return this.$$delegate_0.getClearDarkKey500();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey600-0d7_KjU */
        public long getClearDarkKey600() {
            return this.$$delegate_0.getClearDarkKey600();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey700-0d7_KjU */
        public long getClearDarkKey700() {
            return this.$$delegate_0.getClearDarkKey700();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearDarkKey800-0d7_KjU */
        public long getClearDarkKey800() {
            return this.$$delegate_0.getClearDarkKey800();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey0-0d7_KjU */
        public long getClearLightKey0() {
            return this.$$delegate_0.getClearLightKey0();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey100-0d7_KjU */
        public long getClearLightKey100() {
            return this.$$delegate_0.getClearLightKey100();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey200-0d7_KjU */
        public long getClearLightKey200() {
            return this.$$delegate_0.getClearLightKey200();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey300-0d7_KjU */
        public long getClearLightKey300() {
            return this.$$delegate_0.getClearLightKey300();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey400-0d7_KjU */
        public long getClearLightKey400() {
            return this.$$delegate_0.getClearLightKey400();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey500-0d7_KjU */
        public long getClearLightKey500() {
            return this.$$delegate_0.getClearLightKey500();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey600-0d7_KjU */
        public long getClearLightKey600() {
            return this.$$delegate_0.getClearLightKey600();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey700-0d7_KjU */
        public long getClearLightKey700() {
            return this.$$delegate_0.getClearLightKey700();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getClearLightKey800-0d7_KjU */
        public long getClearLightKey800() {
            return this.$$delegate_0.getClearLightKey800();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getDetectorColorMine-0d7_KjU */
        public long getDetectorColorMine() {
            return this.$$delegate_0.getDetectorColorMine();
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
        /* renamed from: getGraphicActiveApparel-0d7_KjU */
        public long getGraphicActiveApparel() {
            return this.$$delegate_0.getGraphicActiveApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveApparelInverted-0d7_KjU */
        public long getGraphicActiveApparelInverted() {
            return this.$$delegate_0.getGraphicActiveApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestprice-0d7_KjU */
        public long getGraphicActiveBestprice() {
            return this.$$delegate_0.getGraphicActiveBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveBestpriceInverted-0d7_KjU */
        public long getGraphicActiveBestpriceInverted() {
            return this.$$delegate_0.getGraphicActiveBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveEconom-0d7_KjU */
        public long getGraphicActiveEconom() {
            return this.$$delegate_0.getGraphicActiveEconom();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpress-0d7_KjU */
        public long getGraphicActiveExpress() {
            return this.$$delegate_0.getGraphicActiveExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveExpressInverted-0d7_KjU */
        public long getGraphicActiveExpressInverted() {
            return this.$$delegate_0.getGraphicActiveExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFresh-0d7_KjU */
        public long getGraphicActiveFresh() {
            return this.$$delegate_0.getGraphicActiveFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveFreshInverted-0d7_KjU */
        public long getGraphicActiveFreshInverted() {
            return this.$$delegate_0.getGraphicActiveFreshInverted();
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
        /* renamed from: getGraphicActiveOzon-0d7_KjU */
        public long getGraphicActiveOzon() {
            return this.$$delegate_0.getGraphicActiveOzon();
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
        /* renamed from: getGraphicActivePremium-0d7_KjU */
        public long getGraphicActivePremium() {
            return this.$$delegate_0.getGraphicActivePremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumBlue-0d7_KjU */
        public long getGraphicActivePremiumBlue() {
            return this.$$delegate_0.getGraphicActivePremiumBlue();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePremiumInverted-0d7_KjU */
        public long getGraphicActivePremiumInverted() {
            return this.$$delegate_0.getGraphicActivePremiumInverted();
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
        /* renamed from: getGraphicApparel-0d7_KjU */
        public long getGraphicApparel() {
            return this.$$delegate_0.getGraphicApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicApparelInverted-0d7_KjU */
        public long getGraphicApparelInverted() {
            return this.$$delegate_0.getGraphicApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestprice-0d7_KjU */
        public long getGraphicBestprice() {
            return this.$$delegate_0.getGraphicBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicBestpriceInverted-0d7_KjU */
        public long getGraphicBestpriceInverted() {
            return this.$$delegate_0.getGraphicBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkKey-0d7_KjU */
        public long getGraphicDarkKey() {
            return this.$$delegate_0.getGraphicDarkKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDarkerNeutralOnLight-0d7_KjU */
        public long getGraphicDarkerNeutralOnLight() {
            return this.$$delegate_0.getGraphicDarkerNeutralOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabled-0d7_KjU */
        public long getGraphicDisabled() {
            return this.$$delegate_0.getGraphicDisabled();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledInverted-0d7_KjU */
        public long getGraphicDisabledInverted() {
            return this.$$delegate_0.getGraphicDisabledInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnDark-0d7_KjU */
        public long getGraphicDisabledOnDark() {
            return this.$$delegate_0.getGraphicDisabledOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicDisabledOnLight-0d7_KjU */
        public long getGraphicDisabledOnLight() {
            return this.$$delegate_0.getGraphicDisabledOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicEconom-0d7_KjU */
        public long getGraphicEconom() {
            return this.$$delegate_0.getGraphicEconom();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpress-0d7_KjU */
        public long getGraphicExpress() {
            return this.$$delegate_0.getGraphicExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressInverted-0d7_KjU */
        public long getGraphicExpressInverted() {
            return this.$$delegate_0.getGraphicExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicExpressOnDark-0d7_KjU */
        public long getGraphicExpressOnDark() {
            return this.$$delegate_0.getGraphicExpressOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGracePrimary-0d7_KjU */
        public long getGraphicFintechGracePrimary() {
            return this.$$delegate_0.getGraphicFintechGracePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFintechGraceSecondary-0d7_KjU */
        public long getGraphicFintechGraceSecondary() {
            return this.$$delegate_0.getGraphicFintechGraceSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFresh-0d7_KjU */
        public long getGraphicFresh() {
            return this.$$delegate_0.getGraphicFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshInverted-0d7_KjU */
        public long getGraphicFreshInverted() {
            return this.$$delegate_0.getGraphicFreshInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicFreshOnDark-0d7_KjU */
        public long getGraphicFreshOnDark() {
            return this.$$delegate_0.getGraphicFreshOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicGuarantee-0d7_KjU */
        public long getGraphicGuarantee() {
            return this.$$delegate_0.getGraphicGuarantee();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKey-0d7_KjU */
        public long getGraphicKey() {
            return this.$$delegate_0.getGraphicKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicKeyInverted-0d7_KjU */
        public long getGraphicKeyInverted() {
            return this.$$delegate_0.getGraphicKeyInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicLightKey-0d7_KjU */
        public long getGraphicLightKey() {
            return this.$$delegate_0.getGraphicLightKey();
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
        /* renamed from: getGraphicNegativeOnDark-0d7_KjU */
        public long getGraphicNegativeOnDark() {
            return this.$$delegate_0.getGraphicNegativeOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimary-0d7_KjU */
        public long getGraphicNegativePrimary() {
            return this.$$delegate_0.getGraphicNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNegativePrimaryInverted-0d7_KjU */
        public long getGraphicNegativePrimaryInverted() {
            return this.$$delegate_0.getGraphicNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutral-0d7_KjU */
        public long getGraphicNeutral() {
            return this.$$delegate_0.getGraphicNeutral();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralInverted-0d7_KjU */
        public long getGraphicNeutralInverted() {
            return this.$$delegate_0.getGraphicNeutralInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnDark-0d7_KjU */
        public long getGraphicNeutralOnDark() {
            return this.$$delegate_0.getGraphicNeutralOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicNeutralOnLight-0d7_KjU */
        public long getGraphicNeutralOnLight() {
            return this.$$delegate_0.getGraphicNeutralOnLight();
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
        /* renamed from: getGraphicOxford-0d7_KjU */
        public long getGraphicOxford() {
            return this.$$delegate_0.getGraphicOxford();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicOzon-0d7_KjU */
        public long getGraphicOzon() {
            return this.$$delegate_0.getGraphicOzon();
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
        /* renamed from: getGraphicPremium-0d7_KjU */
        public long getGraphicPremium() {
            return this.$$delegate_0.getGraphicPremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumBlue-0d7_KjU */
        public long getGraphicPremiumBlue() {
            return this.$$delegate_0.getGraphicPremiumBlue();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPremiumInverted-0d7_KjU */
        public long getGraphicPremiumInverted() {
            return this.$$delegate_0.getGraphicPremiumInverted();
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
        /* renamed from: getGraphicPrimaryInverted-0d7_KjU */
        public long getGraphicPrimaryInverted() {
            return this.$$delegate_0.getGraphicPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnDark-0d7_KjU */
        public long getGraphicPrimaryOnDark() {
            return this.$$delegate_0.getGraphicPrimaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryOnLight-0d7_KjU */
        public long getGraphicPrimaryOnLight() {
            return this.$$delegate_0.getGraphicPrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicQuaternary-0d7_KjU */
        public long getGraphicQuaternary() {
            return this.$$delegate_0.getGraphicQuaternary();
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
        /* renamed from: getGraphicSecondary-0d7_KjU */
        public long getGraphicSecondary() {
            return this.$$delegate_0.getGraphicSecondary();
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
        /* renamed from: getGraphicSecondaryInverted-0d7_KjU */
        public long getGraphicSecondaryInverted() {
            return this.$$delegate_0.getGraphicSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnDark-0d7_KjU */
        public long getGraphicSecondaryOnDark() {
            return this.$$delegate_0.getGraphicSecondaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryOnLight-0d7_KjU */
        public long getGraphicSecondaryOnLight() {
            return this.$$delegate_0.getGraphicSecondaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSolidNeutral-0d7_KjU */
        public long getGraphicSolidNeutral() {
            return this.$$delegate_0.getGraphicSolidNeutral();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicStrokeSticky-0d7_KjU */
        public long getGraphicStrokeSticky() {
            return this.$$delegate_0.getGraphicStrokeSticky();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconPrimary-0d7_KjU */
        public long getGraphicTabbarIconPrimary() {
            return this.$$delegate_0.getGraphicTabbarIconPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTabbarIconSecondary-0d7_KjU */
        public long getGraphicTabbarIconSecondary() {
            return this.$$delegate_0.getGraphicTabbarIconSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTech-0d7_KjU */
        public long getGraphicTech() {
            return this.$$delegate_0.getGraphicTech();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiary-0d7_KjU */
        public long getGraphicTertiary() {
            return this.$$delegate_0.getGraphicTertiary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryDynamic-0d7_KjU, reason: from getter */
        public long getGraphicTertiaryDynamic() {
            return this.graphicTertiaryDynamic;
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryInverted-0d7_KjU */
        public long getGraphicTertiaryInverted() {
            return this.$$delegate_0.getGraphicTertiaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnDark-0d7_KjU */
        public long getGraphicTertiaryOnDark() {
            return this.$$delegate_0.getGraphicTertiaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicTertiaryOnLight-0d7_KjU */
        public long getGraphicTertiaryOnLight() {
            return this.$$delegate_0.getGraphicTertiaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicUltraPrimary-0d7_KjU */
        public long getGraphicUltraPrimary() {
            return this.$$delegate_0.getGraphicUltraPrimary();
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
        /* renamed from: getLayerActiveFloor1-0d7_KjU */
        public long getLayerActiveFloor1() {
            return this.$$delegate_0.getLayerActiveFloor1();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor1Inverted-0d7_KjU */
        public long getLayerActiveFloor1Inverted() {
            return this.$$delegate_0.getLayerActiveFloor1Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2-0d7_KjU */
        public long getLayerActiveFloor2() {
            return this.$$delegate_0.getLayerActiveFloor2();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor2Inverted-0d7_KjU */
        public long getLayerActiveFloor2Inverted() {
            return this.$$delegate_0.getLayerActiveFloor2Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3-0d7_KjU */
        public long getLayerActiveFloor3() {
            return this.$$delegate_0.getLayerActiveFloor3();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor3Inverted-0d7_KjU */
        public long getLayerActiveFloor3Inverted() {
            return this.$$delegate_0.getLayerActiveFloor3Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurface-0d7_KjU */
        public long getLayerActiveSurface() {
            return this.$$delegate_0.getLayerActiveSurface();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveSurfaceInverted-0d7_KjU */
        public long getLayerActiveSurfaceInverted() {
            return this.$$delegate_0.getLayerActiveSurfaceInverted();
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
        /* renamed from: getLayerFloor1-0d7_KjU */
        public long getLayerFloor1() {
            return this.$$delegate_0.getLayerFloor1();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1Inverted-0d7_KjU */
        public long getLayerFloor1Inverted() {
            return this.$$delegate_0.getLayerFloor1Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor1OnDark-0d7_KjU */
        public long getLayerFloor1OnDark() {
            return this.$$delegate_0.getLayerFloor1OnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2-0d7_KjU */
        public long getLayerFloor2() {
            return this.$$delegate_0.getLayerFloor2();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor2Inverted-0d7_KjU */
        public long getLayerFloor2Inverted() {
            return this.$$delegate_0.getLayerFloor2Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3-0d7_KjU */
        public long getLayerFloor3() {
            return this.$$delegate_0.getLayerFloor3();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor3Inverted-0d7_KjU */
        public long getLayerFloor3Inverted() {
            return this.$$delegate_0.getLayerFloor3Inverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimming-0d7_KjU */
        public long getLayerOverlayDimming() {
            return this.$$delegate_0.getLayerOverlayDimming();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayDimmingInverted-0d7_KjU */
        public long getLayerOverlayDimmingInverted() {
            return this.$$delegate_0.getLayerOverlayDimmingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanja-0d7_KjU */
        public long getLayerOverlayParanja() {
            return this.$$delegate_0.getLayerOverlayParanja();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerOverlayParanjaInverted-0d7_KjU */
        public long getLayerOverlayParanjaInverted() {
            return this.$$delegate_0.getLayerOverlayParanjaInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurface-0d7_KjU */
        public long getLayerSurface() {
            return this.$$delegate_0.getLayerSurface();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerSurfaceInverted-0d7_KjU */
        public long getLayerSurfaceInverted() {
            return this.$$delegate_0.getLayerSurfaceInverted();
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
        /* renamed from: getTextActiveApparel-0d7_KjU */
        public long getTextActiveApparel() {
            return this.$$delegate_0.getTextActiveApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveApparelInverted-0d7_KjU */
        public long getTextActiveApparelInverted() {
            return this.$$delegate_0.getTextActiveApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestprice-0d7_KjU */
        public long getTextActiveBestprice() {
            return this.$$delegate_0.getTextActiveBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveBestpriceInverted-0d7_KjU */
        public long getTextActiveBestpriceInverted() {
            return this.$$delegate_0.getTextActiveBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpress-0d7_KjU */
        public long getTextActiveExpress() {
            return this.$$delegate_0.getTextActiveExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveExpressInverted-0d7_KjU */
        public long getTextActiveExpressInverted() {
            return this.$$delegate_0.getTextActiveExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFresh-0d7_KjU */
        public long getTextActiveFresh() {
            return this.$$delegate_0.getTextActiveFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveFreshInverted-0d7_KjU */
        public long getTextActiveFreshInverted() {
            return this.$$delegate_0.getTextActiveFreshInverted();
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
        /* renamed from: getTextActiveNegative-0d7_KjU */
        public long getTextActiveNegative() {
            return this.$$delegate_0.getTextActiveNegative();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveNegativeInverted-0d7_KjU */
        public long getTextActiveNegativeInverted() {
            return this.$$delegate_0.getTextActiveNegativeInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveOzon-0d7_KjU */
        public long getTextActiveOzon() {
            return this.$$delegate_0.getTextActiveOzon();
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
        /* renamed from: getTextActivePremium-0d7_KjU */
        public long getTextActivePremium() {
            return this.$$delegate_0.getTextActivePremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePremiumInverted-0d7_KjU */
        public long getTextActivePremiumInverted() {
            return this.$$delegate_0.getTextActivePremiumInverted();
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
        /* renamed from: getTextApparel-0d7_KjU */
        public long getTextApparel() {
            return this.$$delegate_0.getTextApparel();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextApparelInverted-0d7_KjU */
        public long getTextApparelInverted() {
            return this.$$delegate_0.getTextApparelInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestprice-0d7_KjU */
        public long getTextBestprice() {
            return this.$$delegate_0.getTextBestprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextBestpriceInverted-0d7_KjU */
        public long getTextBestpriceInverted() {
            return this.$$delegate_0.getTextBestpriceInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDarkKey-0d7_KjU */
        public long getTextDarkKey() {
            return this.$$delegate_0.getTextDarkKey();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextDiscountUnavialable-0d7_KjU */
        public long getTextDiscountUnavialable() {
            return this.$$delegate_0.getTextDiscountUnavialable();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextEconom-0d7_KjU */
        public long getTextEconom() {
            return this.$$delegate_0.getTextEconom();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpress-0d7_KjU */
        public long getTextExpress() {
            return this.$$delegate_0.getTextExpress();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressInverted-0d7_KjU */
        public long getTextExpressInverted() {
            return this.$$delegate_0.getTextExpressInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextExpressOnDark-0d7_KjU */
        public long getTextExpressOnDark() {
            return this.$$delegate_0.getTextExpressOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFresh-0d7_KjU */
        public long getTextFresh() {
            return this.$$delegate_0.getTextFresh();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshInverted-0d7_KjU */
        public long getTextFreshInverted() {
            return this.$$delegate_0.getTextFreshInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextFreshOnDark-0d7_KjU */
        public long getTextFreshOnDark() {
            return this.$$delegate_0.getTextFreshOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextGuarantee-0d7_KjU */
        public long getTextGuarantee() {
            return this.$$delegate_0.getTextGuarantee();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextLightKey-0d7_KjU */
        public long getTextLightKey() {
            return this.$$delegate_0.getTextLightKey();
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
        /* renamed from: getTextNegative-0d7_KjU */
        public long getTextNegative() {
            return this.$$delegate_0.getTextNegative();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeInverted-0d7_KjU */
        public long getTextNegativeInverted() {
            return this.$$delegate_0.getTextNegativeInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextNegativeOnDark-0d7_KjU */
        public long getTextNegativeOnDark() {
            return this.$$delegate_0.getTextNegativeOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalprice-0d7_KjU */
        public long getTextOriginalprice() {
            return this.$$delegate_0.getTextOriginalprice();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOriginalpriceAvailable-0d7_KjU */
        public long getTextOriginalpriceAvailable() {
            return this.$$delegate_0.getTextOriginalpriceAvailable();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOxford-0d7_KjU */
        public long getTextOxford() {
            return this.$$delegate_0.getTextOxford();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextOzon-0d7_KjU */
        public long getTextOzon() {
            return this.$$delegate_0.getTextOzon();
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
        /* renamed from: getTextPremium-0d7_KjU */
        public long getTextPremium() {
            return this.$$delegate_0.getTextPremium();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPremiumInverted-0d7_KjU */
        public long getTextPremiumInverted() {
            return this.$$delegate_0.getTextPremiumInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimary-0d7_KjU */
        public long getTextPrimary() {
            return this.$$delegate_0.getTextPrimary();
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
        /* renamed from: getTextPrimaryInverted-0d7_KjU */
        public long getTextPrimaryInverted() {
            return this.$$delegate_0.getTextPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnDark-0d7_KjU */
        public long getTextPrimaryOnDark() {
            return this.$$delegate_0.getTextPrimaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryOnLight-0d7_KjU */
        public long getTextPrimaryOnLight() {
            return this.$$delegate_0.getTextPrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondary-0d7_KjU */
        public long getTextSecondary() {
            return this.$$delegate_0.getTextSecondary();
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
        /* renamed from: getTextSecondaryInverted-0d7_KjU */
        public long getTextSecondaryInverted() {
            return this.$$delegate_0.getTextSecondaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnDark-0d7_KjU */
        public long getTextSecondaryOnDark() {
            return this.$$delegate_0.getTextSecondaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryOnLight-0d7_KjU */
        public long getTextSecondaryOnLight() {
            return this.$$delegate_0.getTextSecondaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTech-0d7_KjU */
        public long getTextTech() {
            return this.$$delegate_0.getTextTech();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiary-0d7_KjU */
        public long getTextTertiary() {
            return this.$$delegate_0.getTextTertiary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryInverted-0d7_KjU */
        public long getTextTertiaryInverted() {
            return this.$$delegate_0.getTextTertiaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnDark-0d7_KjU */
        public long getTextTertiaryOnDark() {
            return this.$$delegate_0.getTextTertiaryOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextTertiaryOnLight-0d7_KjU */
        public long getTextTertiaryOnLight() {
            return this.$$delegate_0.getTextTertiaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextUltra-0d7_KjU */
        public long getTextUltra() {
            return this.$$delegate_0.getTextUltra();
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
        /* renamed from: isDark */
        public boolean getIsDark() {
            return this.$$delegate_0.getIsDark();
        }
    };

    @NotNull
    public static final UniColorScheme getSelectDarkColorScheme() {
        return SelectDarkColorScheme;
    }

    @NotNull
    public static final UniColorScheme getSelectLightColorScheme() {
        return SelectLightColorScheme;
    }
}
