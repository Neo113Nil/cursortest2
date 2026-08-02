package ru.ozon.uni.core.compose.theme;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniCoreColors;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\n\" \u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0002\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lru/ozon/uni/core/compose/theme/UniColorScheme;", "FreshLightColorScheme", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "getFreshLightColorScheme", "()Lru/ozon/uni/core/compose/theme/UniColorScheme;", "getFreshLightColorScheme$annotations", "()V", "FreshDarkColorScheme", "getFreshDarkColorScheme", "getFreshDarkColorScheme$annotations", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FreshColorSchemeKt {

    @NotNull
    private static final UniColorScheme FreshLightColorScheme = new UniColorScheme() { // from class: ru.ozon.uni.core.compose.theme.FreshColorSchemeKt$FreshLightColorScheme$1
        private final /* synthetic */ UniColorScheme $$delegate_0 = DefaultUniColorSchemeKt.getDefaultLightUniColorScheme();
        private final long bgActionPrimary;
        private final long bgActionPrimaryInverted;
        private final long bgActionSecondary;
        private final long bgActionSecondaryInverted;
        private final long bgActiveActionPrimary;
        private final long bgActiveActionPrimaryInverted;
        private final long bgActiveActionSecondary;
        private final long bgActiveActionSecondaryInverted;
        private final long bgOpaqueActionSecondary;
        private final long graphicActionOnDark;
        private final long graphicActionOnLight;
        private final long graphicActionPrimary;
        private final long graphicActionPrimaryInverted;
        private final long graphicOverlapPrimary;
        private final long graphicOverlapPrimaryDynamic;
        private final long textAction;
        private final long textActionInverted;
        private final long textActionOnDark;
        private final long textActionOnLight;
        private final long textActiveAction;
        private final long textActiveActionInverted;

        {
            UniCoreColors uniCoreColors = UniCoreColors.INSTANCE;
            this.graphicActionOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicActionOnLight = uniCoreColors.m2728getAzure3500d7_KjU();
            this.textActionOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActionOnLight = uniCoreColors.m2729getAzure4000d7_KjU();
            this.bgActionPrimary = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgActionPrimaryInverted = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgActionSecondary = uniCoreColors.m2739getAzureTransparent500d7_KjU();
            this.bgActionSecondaryInverted = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgActiveActionPrimary = uniCoreColors.m2729getAzure4000d7_KjU();
            this.bgActiveActionPrimaryInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.bgActiveActionSecondary = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgActiveActionSecondaryInverted = uniCoreColors.m2738getAzureTransparent2000d7_KjU();
            this.bgOpaqueActionSecondary = uniCoreColors.m2731getAzure500d7_KjU();
            this.graphicActionPrimary = uniCoreColors.m2728getAzure3500d7_KjU();
            this.graphicActionPrimaryInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicOverlapPrimary = uniCoreColors.m2728getAzure3500d7_KjU();
            this.graphicOverlapPrimaryDynamic = uniCoreColors.m2728getAzure3500d7_KjU();
            this.textAction = uniCoreColors.m2729getAzure4000d7_KjU();
            this.textActionInverted = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActiveAction = uniCoreColors.m2730getAzure4500d7_KjU();
            this.textActiveActionInverted = uniCoreColors.m2727getAzure3000d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentOnLight-0d7_KjU */
        public long mo1959getBgAccentOnLight0d7_KjU() {
            return this.$$delegate_0.mo1959getBgAccentOnLight0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimary-0d7_KjU */
        public long mo1960getBgAccentPrimary0d7_KjU() {
            return this.$$delegate_0.mo1960getBgAccentPrimary0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimaryInverted-0d7_KjU */
        public long mo1961getBgAccentPrimaryInverted0d7_KjU() {
            return this.$$delegate_0.mo1961getBgAccentPrimaryInverted0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondary-0d7_KjU */
        public long mo1962getBgAccentSecondary0d7_KjU() {
            return this.$$delegate_0.mo1962getBgAccentSecondary0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondaryInverted-0d7_KjU */
        public long mo1963getBgAccentSecondaryInverted0d7_KjU() {
            return this.$$delegate_0.mo1963getBgAccentSecondaryInverted0d7_KjU();
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
        /* renamed from: getBgActiveAccentPrimary-0d7_KjU */
        public long mo1969getBgActiveAccentPrimary0d7_KjU() {
            return this.$$delegate_0.mo1969getBgActiveAccentPrimary0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentPrimaryInverted-0d7_KjU */
        public long mo1970getBgActiveAccentPrimaryInverted0d7_KjU() {
            return this.$$delegate_0.mo1970getBgActiveAccentPrimaryInverted0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondary-0d7_KjU */
        public long mo1971getBgActiveAccentSecondary0d7_KjU() {
            return this.$$delegate_0.mo1971getBgActiveAccentSecondary0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondaryInverted-0d7_KjU */
        public long mo1972getBgActiveAccentSecondaryInverted0d7_KjU() {
            return this.$$delegate_0.mo1972getBgActiveAccentSecondaryInverted0d7_KjU();
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
        public long mo1977getBgActiveApparelPrimary0d7_KjU() {
            return this.$$delegate_0.mo1977getBgActiveApparelPrimary0d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveApparelPrimaryInverted-0d7_KjU */
        public long mo1978getBgActiveApparelPrimaryInverted0d7_KjU() {
            return this.$$delegate_0.mo1978getBgActiveApparelPrimaryInverted0d7_KjU();
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
        /* renamed from: getBgActiveMarketingPrimary-0d7_KjU */
        public long getBgActiveMarketingPrimary() {
            return this.$$delegate_0.getBgActiveMarketingPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingPrimaryInverted-0d7_KjU */
        public long getBgActiveMarketingPrimaryInverted() {
            return this.$$delegate_0.getBgActiveMarketingPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondary-0d7_KjU */
        public long getBgActiveMarketingSecondary() {
            return this.$$delegate_0.getBgActiveMarketingSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondaryInverted-0d7_KjU */
        public long getBgActiveMarketingSecondaryInverted() {
            return this.$$delegate_0.getBgActiveMarketingSecondaryInverted();
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
        /* renamed from: getBgActivePositivePrimary-0d7_KjU */
        public long getBgActivePositivePrimary() {
            return this.$$delegate_0.getBgActivePositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositivePrimaryInverted-0d7_KjU */
        public long getBgActivePositivePrimaryInverted() {
            return this.$$delegate_0.getBgActivePositivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondary-0d7_KjU */
        public long getBgActivePositiveSecondary() {
            return this.$$delegate_0.getBgActivePositiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondaryInverted-0d7_KjU */
        public long getBgActivePositiveSecondaryInverted() {
            return this.$$delegate_0.getBgActivePositiveSecondaryInverted();
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
        /* renamed from: getBgActiveWarningPrimary-0d7_KjU */
        public long getBgActiveWarningPrimary() {
            return this.$$delegate_0.getBgActiveWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningPrimaryInverted-0d7_KjU */
        public long getBgActiveWarningPrimaryInverted() {
            return this.$$delegate_0.getBgActiveWarningPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondary-0d7_KjU */
        public long getBgActiveWarningSecondary() {
            return this.$$delegate_0.getBgActiveWarningSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondaryInverted-0d7_KjU */
        public long getBgActiveWarningSecondaryInverted() {
            return this.$$delegate_0.getBgActiveWarningSecondaryInverted();
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
        /* renamed from: getBgMarketingOnLight-0d7_KjU */
        public long getBgMarketingOnLight() {
            return this.$$delegate_0.getBgMarketingOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimary-0d7_KjU */
        public long getBgMarketingPrimary() {
            return this.$$delegate_0.getBgMarketingPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimaryInverted-0d7_KjU */
        public long getBgMarketingPrimaryInverted() {
            return this.$$delegate_0.getBgMarketingPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondary-0d7_KjU */
        public long getBgMarketingSecondary() {
            return this.$$delegate_0.getBgMarketingSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondaryInverted-0d7_KjU */
        public long getBgMarketingSecondaryInverted() {
            return this.$$delegate_0.getBgMarketingSecondaryInverted();
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
        /* renamed from: getBgOpaqueAccentSecondary-0d7_KjU */
        public long getBgOpaqueAccentSecondary() {
            return this.$$delegate_0.getBgOpaqueAccentSecondary();
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
        /* renamed from: getBgOpaqueMarketingSecondary-0d7_KjU */
        public long getBgOpaqueMarketingSecondary() {
            return this.$$delegate_0.getBgOpaqueMarketingSecondary();
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
        /* renamed from: getBgOpaquePositiveSecondary-0d7_KjU */
        public long getBgOpaquePositiveSecondary() {
            return this.$$delegate_0.getBgOpaquePositiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueSecondary-0d7_KjU */
        public long getBgOpaqueSecondary() {
            return this.$$delegate_0.getBgOpaqueSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueWarningSecondary-0d7_KjU */
        public long getBgOpaqueWarningSecondary() {
            return this.$$delegate_0.getBgOpaqueWarningSecondary();
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
        /* renamed from: getBgPositiveOnLight-0d7_KjU */
        public long getBgPositiveOnLight() {
            return this.$$delegate_0.getBgPositiveOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimary-0d7_KjU */
        public long getBgPositivePrimary() {
            return this.$$delegate_0.getBgPositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimaryInverted-0d7_KjU */
        public long getBgPositivePrimaryInverted() {
            return this.$$delegate_0.getBgPositivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondary-0d7_KjU */
        public long getBgPositiveSecondary() {
            return this.$$delegate_0.getBgPositiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondaryInverted-0d7_KjU */
        public long getBgPositiveSecondaryInverted() {
            return this.$$delegate_0.getBgPositiveSecondaryInverted();
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
        /* renamed from: getBgSecondaryDynamic-0d7_KjU */
        public long getBgSecondaryDynamic() {
            return this.$$delegate_0.getBgSecondaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryDynamicInverted-0d7_KjU */
        public long getBgSecondaryDynamicInverted() {
            return this.$$delegate_0.getBgSecondaryDynamicInverted();
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
        /* renamed from: getBgWarningOnLight-0d7_KjU */
        public long getBgWarningOnLight() {
            return this.$$delegate_0.getBgWarningOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimary-0d7_KjU */
        public long getBgWarningPrimary() {
            return this.$$delegate_0.getBgWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimaryInverted-0d7_KjU */
        public long getBgWarningPrimaryInverted() {
            return this.$$delegate_0.getBgWarningPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondary-0d7_KjU */
        public long getBgWarningSecondary() {
            return this.$$delegate_0.getBgWarningSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondaryInverted-0d7_KjU */
        public long getBgWarningSecondaryInverted() {
            return this.$$delegate_0.getBgWarningSecondaryInverted();
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
        /* renamed from: getGraphicAccentOnLight-0d7_KjU */
        public long getGraphicAccentOnLight() {
            return this.$$delegate_0.getGraphicAccentOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimary-0d7_KjU */
        public long getGraphicAccentPrimary() {
            return this.$$delegate_0.getGraphicAccentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimaryInverted-0d7_KjU */
        public long getGraphicAccentPrimaryInverted() {
            return this.$$delegate_0.getGraphicAccentPrimaryInverted();
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
        /* renamed from: getGraphicActiveAccentPrimary-0d7_KjU */
        public long getGraphicActiveAccentPrimary() {
            return this.$$delegate_0.getGraphicActiveAccentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveAccentPrimaryInverted-0d7_KjU */
        public long getGraphicActiveAccentPrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveAccentPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimary-0d7_KjU */
        public long getGraphicActiveActionPrimary() {
            return this.$$delegate_0.getGraphicActiveActionPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimaryInverted-0d7_KjU */
        public long getGraphicActiveActionPrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveActionPrimaryInverted();
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
        /* renamed from: getGraphicActiveMarketing-0d7_KjU */
        public long getGraphicActiveMarketing() {
            return this.$$delegate_0.getGraphicActiveMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveMarketingInverted-0d7_KjU */
        public long getGraphicActiveMarketingInverted() {
            return this.$$delegate_0.getGraphicActiveMarketingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimary-0d7_KjU */
        public long getGraphicActiveNegativePrimary() {
            return this.$$delegate_0.getGraphicActiveNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimaryInverted-0d7_KjU */
        public long getGraphicActiveNegativePrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveOzon-0d7_KjU */
        public long getGraphicActiveOzon() {
            return this.$$delegate_0.getGraphicActiveOzon();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimary-0d7_KjU */
        public long getGraphicActivePositivePrimary() {
            return this.$$delegate_0.getGraphicActivePositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimaryInverted-0d7_KjU */
        public long getGraphicActivePositivePrimaryInverted() {
            return this.$$delegate_0.getGraphicActivePositivePrimaryInverted();
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
        /* renamed from: getGraphicActiveRating-0d7_KjU */
        public long getGraphicActiveRating() {
            return this.$$delegate_0.getGraphicActiveRating();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveRatingInverted-0d7_KjU */
        public long getGraphicActiveRatingInverted() {
            return this.$$delegate_0.getGraphicActiveRatingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimary-0d7_KjU */
        public long getGraphicActiveWarningPrimary() {
            return this.$$delegate_0.getGraphicActiveWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimaryInverted-0d7_KjU */
        public long getGraphicActiveWarningPrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveWarningPrimaryInverted();
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
        /* renamed from: getGraphicMarketing-0d7_KjU */
        public long getGraphicMarketing() {
            return this.$$delegate_0.getGraphicMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingInverted-0d7_KjU */
        public long getGraphicMarketingInverted() {
            return this.$$delegate_0.getGraphicMarketingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnDark-0d7_KjU */
        public long getGraphicMarketingOnDark() {
            return this.$$delegate_0.getGraphicMarketingOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnLight-0d7_KjU */
        public long getGraphicMarketingOnLight() {
            return this.$$delegate_0.getGraphicMarketingOnLight();
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
        /* renamed from: getGraphicPositiveOnDark-0d7_KjU */
        public long getGraphicPositiveOnDark() {
            return this.$$delegate_0.getGraphicPositiveOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimary-0d7_KjU */
        public long getGraphicPositivePrimary() {
            return this.$$delegate_0.getGraphicPositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryInverted-0d7_KjU */
        public long getGraphicPositivePrimaryInverted() {
            return this.$$delegate_0.getGraphicPositivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryOnLight-0d7_KjU */
        public long getGraphicPositivePrimaryOnLight() {
            return this.$$delegate_0.getGraphicPositivePrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositiveSecondary-0d7_KjU */
        public long getGraphicPositiveSecondary() {
            return this.$$delegate_0.getGraphicPositiveSecondary();
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
        /* renamed from: getGraphicPrimary-0d7_KjU */
        public long getGraphicPrimary() {
            return this.$$delegate_0.getGraphicPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamic-0d7_KjU */
        public long getGraphicPrimaryDynamic() {
            return this.$$delegate_0.getGraphicPrimaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamicInverted-0d7_KjU */
        public long getGraphicPrimaryDynamicInverted() {
            return this.$$delegate_0.getGraphicPrimaryDynamicInverted();
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
        /* renamed from: getGraphicRating-0d7_KjU */
        public long getGraphicRating() {
            return this.$$delegate_0.getGraphicRating();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicRatingInverted-0d7_KjU */
        public long getGraphicRatingInverted() {
            return this.$$delegate_0.getGraphicRatingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondary-0d7_KjU */
        public long getGraphicSecondary() {
            return this.$$delegate_0.getGraphicSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamic-0d7_KjU */
        public long getGraphicSecondaryDynamic() {
            return this.$$delegate_0.getGraphicSecondaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamicInverted-0d7_KjU */
        public long getGraphicSecondaryDynamicInverted() {
            return this.$$delegate_0.getGraphicSecondaryDynamicInverted();
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
        /* renamed from: getGraphicTertiaryDynamic-0d7_KjU */
        public long getGraphicTertiaryDynamic() {
            return this.$$delegate_0.getGraphicTertiaryDynamic();
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
        /* renamed from: getGraphicWarningOnDark-0d7_KjU */
        public long getGraphicWarningOnDark() {
            return this.$$delegate_0.getGraphicWarningOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimary-0d7_KjU */
        public long getGraphicWarningPrimary() {
            return this.$$delegate_0.getGraphicWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryInverted-0d7_KjU */
        public long getGraphicWarningPrimaryInverted() {
            return this.$$delegate_0.getGraphicWarningPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryOnLight-0d7_KjU */
        public long getGraphicWarningPrimaryOnLight() {
            return this.$$delegate_0.getGraphicWarningPrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor0-0d7_KjU */
        public long getLayerActiveFloor0() {
            return this.$$delegate_0.getLayerActiveFloor0();
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
        /* renamed from: getLayerFloor0-0d7_KjU */
        public long getLayerFloor0() {
            return this.$$delegate_0.getLayerFloor0();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor0Inverted-0d7_KjU */
        public long getLayerFloor0Inverted() {
            return this.$$delegate_0.getLayerFloor0Inverted();
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
        /* renamed from: getTextAccent-0d7_KjU */
        public long getTextAccent() {
            return this.$$delegate_0.getTextAccent();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentInverted-0d7_KjU */
        public long getTextAccentInverted() {
            return this.$$delegate_0.getTextAccentInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentOnLight-0d7_KjU */
        public long getTextAccentOnLight() {
            return this.$$delegate_0.getTextAccentOnLight();
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
        /* renamed from: getTextActiveAccent-0d7_KjU */
        public long getTextActiveAccent() {
            return this.$$delegate_0.getTextActiveAccent();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAccentInverted-0d7_KjU */
        public long getTextActiveAccentInverted() {
            return this.$$delegate_0.getTextActiveAccentInverted();
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
        /* renamed from: getTextActiveMarketing-0d7_KjU */
        public long getTextActiveMarketing() {
            return this.$$delegate_0.getTextActiveMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveMarketingInverted-0d7_KjU */
        public long getTextActiveMarketingInverted() {
            return this.$$delegate_0.getTextActiveMarketingInverted();
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
        /* renamed from: getTextActivePositive-0d7_KjU */
        public long getTextActivePositive() {
            return this.$$delegate_0.getTextActivePositive();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePositiveInverted-0d7_KjU */
        public long getTextActivePositiveInverted() {
            return this.$$delegate_0.getTextActivePositiveInverted();
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
        /* renamed from: getTextActiveWarning-0d7_KjU */
        public long getTextActiveWarning() {
            return this.$$delegate_0.getTextActiveWarning();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveWarningInverted-0d7_KjU */
        public long getTextActiveWarningInverted() {
            return this.$$delegate_0.getTextActiveWarningInverted();
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
        /* renamed from: getTextMarketing-0d7_KjU */
        public long getTextMarketing() {
            return this.$$delegate_0.getTextMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingInverted-0d7_KjU */
        public long getTextMarketingInverted() {
            return this.$$delegate_0.getTextMarketingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnDark-0d7_KjU */
        public long getTextMarketingOnDark() {
            return this.$$delegate_0.getTextMarketingOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnLight-0d7_KjU */
        public long getTextMarketingOnLight() {
            return this.$$delegate_0.getTextMarketingOnLight();
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
        /* renamed from: getTextPositive-0d7_KjU */
        public long getTextPositive() {
            return this.$$delegate_0.getTextPositive();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveInverted-0d7_KjU */
        public long getTextPositiveInverted() {
            return this.$$delegate_0.getTextPositiveInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnDark-0d7_KjU */
        public long getTextPositiveOnDark() {
            return this.$$delegate_0.getTextPositiveOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnLight-0d7_KjU */
        public long getTextPositiveOnLight() {
            return this.$$delegate_0.getTextPositiveOnLight();
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
        /* renamed from: getTextPrimaryDynamic-0d7_KjU */
        public long getTextPrimaryDynamic() {
            return this.$$delegate_0.getTextPrimaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryDynamicInverted-0d7_KjU */
        public long getTextPrimaryDynamicInverted() {
            return this.$$delegate_0.getTextPrimaryDynamicInverted();
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
        /* renamed from: getTextSecondaryDynamic-0d7_KjU */
        public long getTextSecondaryDynamic() {
            return this.$$delegate_0.getTextSecondaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryDynamicInverted-0d7_KjU */
        public long getTextSecondaryDynamicInverted() {
            return this.$$delegate_0.getTextSecondaryDynamicInverted();
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
        /* renamed from: getTextWarning-0d7_KjU */
        public long getTextWarning() {
            return this.$$delegate_0.getTextWarning();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningInverted-0d7_KjU */
        public long getTextWarningInverted() {
            return this.$$delegate_0.getTextWarningInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningOnDark-0d7_KjU */
        public long getTextWarningOnDark() {
            return this.$$delegate_0.getTextWarningOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: isDark */
        public boolean getIsDark() {
            return this.$$delegate_0.getIsDark();
        }
    };

    @NotNull
    private static final UniColorScheme FreshDarkColorScheme = new UniColorScheme() { // from class: ru.ozon.uni.core.compose.theme.FreshColorSchemeKt$FreshDarkColorScheme$1
        private final /* synthetic */ UniColorScheme $$delegate_0 = DefaultUniColorSchemeKt.getDefaultDarkUniColorScheme();
        private final long bgActionPrimary;
        private final long bgActionPrimaryInverted;
        private final long bgActionSecondary;
        private final long bgActionSecondaryInverted;
        private final long bgActiveActionPrimary;
        private final long bgActiveActionPrimaryInverted;
        private final long bgActiveActionSecondary;
        private final long bgActiveActionSecondaryInverted;
        private final long bgOpaqueActionSecondary;
        private final long graphicActionOnDark;
        private final long graphicActionOnLight;
        private final long graphicActionPrimary;
        private final long graphicActionPrimaryInverted;
        private final long graphicOverlapPrimary;
        private final long graphicOverlapPrimaryDynamic;
        private final long textAction;
        private final long textActionInverted;
        private final long textActionOnDark;
        private final long textActionOnLight;
        private final long textActiveAction;
        private final long textActiveActionInverted;

        {
            UniCoreColors uniCoreColors = UniCoreColors.INSTANCE;
            this.graphicActionOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicActionOnLight = uniCoreColors.m2728getAzure3500d7_KjU();
            this.textActionOnDark = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActionOnLight = uniCoreColors.m2729getAzure4000d7_KjU();
            this.bgActionPrimary = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgActionPrimaryInverted = uniCoreColors.m2728getAzure3500d7_KjU();
            this.bgActionSecondary = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgActionSecondaryInverted = uniCoreColors.m2739getAzureTransparent500d7_KjU();
            this.bgActiveActionPrimary = uniCoreColors.m2727getAzure3000d7_KjU();
            this.bgActiveActionPrimaryInverted = uniCoreColors.m2729getAzure4000d7_KjU();
            this.bgActiveActionSecondary = uniCoreColors.m2738getAzureTransparent2000d7_KjU();
            this.bgActiveActionSecondaryInverted = uniCoreColors.m2736getAzureTransparent1000d7_KjU();
            this.bgOpaqueActionSecondary = uniCoreColors.m2735getAzureOpaqueDark1000d7_KjU();
            this.graphicActionPrimary = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicActionPrimaryInverted = uniCoreColors.m2728getAzure3500d7_KjU();
            this.graphicOverlapPrimary = uniCoreColors.m2727getAzure3000d7_KjU();
            this.graphicOverlapPrimaryDynamic = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textAction = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActionInverted = uniCoreColors.m2729getAzure4000d7_KjU();
            this.textActiveAction = uniCoreColors.m2727getAzure3000d7_KjU();
            this.textActiveActionInverted = uniCoreColors.m2730getAzure4500d7_KjU();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentOnLight-0d7_KjU */
        public long getBgAccentOnLight() {
            return this.$$delegate_0.getBgAccentOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimary-0d7_KjU */
        public long getBgAccentPrimary() {
            return this.$$delegate_0.getBgAccentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentPrimaryInverted-0d7_KjU */
        public long getBgAccentPrimaryInverted() {
            return this.$$delegate_0.getBgAccentPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondary-0d7_KjU */
        public long getBgAccentSecondary() {
            return this.$$delegate_0.getBgAccentSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgAccentSecondaryInverted-0d7_KjU */
        public long getBgAccentSecondaryInverted() {
            return this.$$delegate_0.getBgAccentSecondaryInverted();
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
        /* renamed from: getBgActiveAccentPrimary-0d7_KjU */
        public long getBgActiveAccentPrimary() {
            return this.$$delegate_0.getBgActiveAccentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentPrimaryInverted-0d7_KjU */
        public long getBgActiveAccentPrimaryInverted() {
            return this.$$delegate_0.getBgActiveAccentPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondary-0d7_KjU */
        public long getBgActiveAccentSecondary() {
            return this.$$delegate_0.getBgActiveAccentSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveAccentSecondaryInverted-0d7_KjU */
        public long getBgActiveAccentSecondaryInverted() {
            return this.$$delegate_0.getBgActiveAccentSecondaryInverted();
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
        /* renamed from: getBgActiveMarketingPrimary-0d7_KjU */
        public long getBgActiveMarketingPrimary() {
            return this.$$delegate_0.getBgActiveMarketingPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingPrimaryInverted-0d7_KjU */
        public long getBgActiveMarketingPrimaryInverted() {
            return this.$$delegate_0.getBgActiveMarketingPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondary-0d7_KjU */
        public long getBgActiveMarketingSecondary() {
            return this.$$delegate_0.getBgActiveMarketingSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveMarketingSecondaryInverted-0d7_KjU */
        public long getBgActiveMarketingSecondaryInverted() {
            return this.$$delegate_0.getBgActiveMarketingSecondaryInverted();
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
        /* renamed from: getBgActivePositivePrimary-0d7_KjU */
        public long getBgActivePositivePrimary() {
            return this.$$delegate_0.getBgActivePositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositivePrimaryInverted-0d7_KjU */
        public long getBgActivePositivePrimaryInverted() {
            return this.$$delegate_0.getBgActivePositivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondary-0d7_KjU */
        public long getBgActivePositiveSecondary() {
            return this.$$delegate_0.getBgActivePositiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActivePositiveSecondaryInverted-0d7_KjU */
        public long getBgActivePositiveSecondaryInverted() {
            return this.$$delegate_0.getBgActivePositiveSecondaryInverted();
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
        /* renamed from: getBgActiveWarningPrimary-0d7_KjU */
        public long getBgActiveWarningPrimary() {
            return this.$$delegate_0.getBgActiveWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningPrimaryInverted-0d7_KjU */
        public long getBgActiveWarningPrimaryInverted() {
            return this.$$delegate_0.getBgActiveWarningPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondary-0d7_KjU */
        public long getBgActiveWarningSecondary() {
            return this.$$delegate_0.getBgActiveWarningSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgActiveWarningSecondaryInverted-0d7_KjU */
        public long getBgActiveWarningSecondaryInverted() {
            return this.$$delegate_0.getBgActiveWarningSecondaryInverted();
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
        /* renamed from: getBgMarketingOnLight-0d7_KjU */
        public long getBgMarketingOnLight() {
            return this.$$delegate_0.getBgMarketingOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimary-0d7_KjU */
        public long getBgMarketingPrimary() {
            return this.$$delegate_0.getBgMarketingPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingPrimaryInverted-0d7_KjU */
        public long getBgMarketingPrimaryInverted() {
            return this.$$delegate_0.getBgMarketingPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondary-0d7_KjU */
        public long getBgMarketingSecondary() {
            return this.$$delegate_0.getBgMarketingSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgMarketingSecondaryInverted-0d7_KjU */
        public long getBgMarketingSecondaryInverted() {
            return this.$$delegate_0.getBgMarketingSecondaryInverted();
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
        /* renamed from: getBgOpaqueAccentSecondary-0d7_KjU */
        public long getBgOpaqueAccentSecondary() {
            return this.$$delegate_0.getBgOpaqueAccentSecondary();
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
        /* renamed from: getBgOpaqueMarketingSecondary-0d7_KjU */
        public long getBgOpaqueMarketingSecondary() {
            return this.$$delegate_0.getBgOpaqueMarketingSecondary();
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
        /* renamed from: getBgOpaquePositiveSecondary-0d7_KjU */
        public long getBgOpaquePositiveSecondary() {
            return this.$$delegate_0.getBgOpaquePositiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueSecondary-0d7_KjU */
        public long getBgOpaqueSecondary() {
            return this.$$delegate_0.getBgOpaqueSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgOpaqueWarningSecondary-0d7_KjU */
        public long getBgOpaqueWarningSecondary() {
            return this.$$delegate_0.getBgOpaqueWarningSecondary();
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
        /* renamed from: getBgPositiveOnLight-0d7_KjU */
        public long getBgPositiveOnLight() {
            return this.$$delegate_0.getBgPositiveOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimary-0d7_KjU */
        public long getBgPositivePrimary() {
            return this.$$delegate_0.getBgPositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositivePrimaryInverted-0d7_KjU */
        public long getBgPositivePrimaryInverted() {
            return this.$$delegate_0.getBgPositivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondary-0d7_KjU */
        public long getBgPositiveSecondary() {
            return this.$$delegate_0.getBgPositiveSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgPositiveSecondaryInverted-0d7_KjU */
        public long getBgPositiveSecondaryInverted() {
            return this.$$delegate_0.getBgPositiveSecondaryInverted();
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
        /* renamed from: getBgSecondaryDynamic-0d7_KjU */
        public long getBgSecondaryDynamic() {
            return this.$$delegate_0.getBgSecondaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgSecondaryDynamicInverted-0d7_KjU */
        public long getBgSecondaryDynamicInverted() {
            return this.$$delegate_0.getBgSecondaryDynamicInverted();
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
        /* renamed from: getBgWarningOnLight-0d7_KjU */
        public long getBgWarningOnLight() {
            return this.$$delegate_0.getBgWarningOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimary-0d7_KjU */
        public long getBgWarningPrimary() {
            return this.$$delegate_0.getBgWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningPrimaryInverted-0d7_KjU */
        public long getBgWarningPrimaryInverted() {
            return this.$$delegate_0.getBgWarningPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondary-0d7_KjU */
        public long getBgWarningSecondary() {
            return this.$$delegate_0.getBgWarningSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getBgWarningSecondaryInverted-0d7_KjU */
        public long getBgWarningSecondaryInverted() {
            return this.$$delegate_0.getBgWarningSecondaryInverted();
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
        /* renamed from: getGraphicAccentOnLight-0d7_KjU */
        public long getGraphicAccentOnLight() {
            return this.$$delegate_0.getGraphicAccentOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimary-0d7_KjU */
        public long getGraphicAccentPrimary() {
            return this.$$delegate_0.getGraphicAccentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicAccentPrimaryInverted-0d7_KjU */
        public long getGraphicAccentPrimaryInverted() {
            return this.$$delegate_0.getGraphicAccentPrimaryInverted();
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
        /* renamed from: getGraphicActiveAccentPrimary-0d7_KjU */
        public long getGraphicActiveAccentPrimary() {
            return this.$$delegate_0.getGraphicActiveAccentPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveAccentPrimaryInverted-0d7_KjU */
        public long getGraphicActiveAccentPrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveAccentPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimary-0d7_KjU */
        public long getGraphicActiveActionPrimary() {
            return this.$$delegate_0.getGraphicActiveActionPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveActionPrimaryInverted-0d7_KjU */
        public long getGraphicActiveActionPrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveActionPrimaryInverted();
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
        /* renamed from: getGraphicActiveMarketing-0d7_KjU */
        public long getGraphicActiveMarketing() {
            return this.$$delegate_0.getGraphicActiveMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveMarketingInverted-0d7_KjU */
        public long getGraphicActiveMarketingInverted() {
            return this.$$delegate_0.getGraphicActiveMarketingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimary-0d7_KjU */
        public long getGraphicActiveNegativePrimary() {
            return this.$$delegate_0.getGraphicActiveNegativePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveNegativePrimaryInverted-0d7_KjU */
        public long getGraphicActiveNegativePrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveNegativePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveOzon-0d7_KjU */
        public long getGraphicActiveOzon() {
            return this.$$delegate_0.getGraphicActiveOzon();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimary-0d7_KjU */
        public long getGraphicActivePositivePrimary() {
            return this.$$delegate_0.getGraphicActivePositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActivePositivePrimaryInverted-0d7_KjU */
        public long getGraphicActivePositivePrimaryInverted() {
            return this.$$delegate_0.getGraphicActivePositivePrimaryInverted();
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
        /* renamed from: getGraphicActiveRating-0d7_KjU */
        public long getGraphicActiveRating() {
            return this.$$delegate_0.getGraphicActiveRating();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveRatingInverted-0d7_KjU */
        public long getGraphicActiveRatingInverted() {
            return this.$$delegate_0.getGraphicActiveRatingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimary-0d7_KjU */
        public long getGraphicActiveWarningPrimary() {
            return this.$$delegate_0.getGraphicActiveWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicActiveWarningPrimaryInverted-0d7_KjU */
        public long getGraphicActiveWarningPrimaryInverted() {
            return this.$$delegate_0.getGraphicActiveWarningPrimaryInverted();
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
        /* renamed from: getGraphicMarketing-0d7_KjU */
        public long getGraphicMarketing() {
            return this.$$delegate_0.getGraphicMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingInverted-0d7_KjU */
        public long getGraphicMarketingInverted() {
            return this.$$delegate_0.getGraphicMarketingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnDark-0d7_KjU */
        public long getGraphicMarketingOnDark() {
            return this.$$delegate_0.getGraphicMarketingOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicMarketingOnLight-0d7_KjU */
        public long getGraphicMarketingOnLight() {
            return this.$$delegate_0.getGraphicMarketingOnLight();
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
        /* renamed from: getGraphicPositiveOnDark-0d7_KjU */
        public long getGraphicPositiveOnDark() {
            return this.$$delegate_0.getGraphicPositiveOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimary-0d7_KjU */
        public long getGraphicPositivePrimary() {
            return this.$$delegate_0.getGraphicPositivePrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryInverted-0d7_KjU */
        public long getGraphicPositivePrimaryInverted() {
            return this.$$delegate_0.getGraphicPositivePrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositivePrimaryOnLight-0d7_KjU */
        public long getGraphicPositivePrimaryOnLight() {
            return this.$$delegate_0.getGraphicPositivePrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPositiveSecondary-0d7_KjU */
        public long getGraphicPositiveSecondary() {
            return this.$$delegate_0.getGraphicPositiveSecondary();
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
        /* renamed from: getGraphicPrimary-0d7_KjU */
        public long getGraphicPrimary() {
            return this.$$delegate_0.getGraphicPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamic-0d7_KjU */
        public long getGraphicPrimaryDynamic() {
            return this.$$delegate_0.getGraphicPrimaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicPrimaryDynamicInverted-0d7_KjU */
        public long getGraphicPrimaryDynamicInverted() {
            return this.$$delegate_0.getGraphicPrimaryDynamicInverted();
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
        /* renamed from: getGraphicRating-0d7_KjU */
        public long getGraphicRating() {
            return this.$$delegate_0.getGraphicRating();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicRatingInverted-0d7_KjU */
        public long getGraphicRatingInverted() {
            return this.$$delegate_0.getGraphicRatingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondary-0d7_KjU */
        public long getGraphicSecondary() {
            return this.$$delegate_0.getGraphicSecondary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamic-0d7_KjU */
        public long getGraphicSecondaryDynamic() {
            return this.$$delegate_0.getGraphicSecondaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicSecondaryDynamicInverted-0d7_KjU */
        public long getGraphicSecondaryDynamicInverted() {
            return this.$$delegate_0.getGraphicSecondaryDynamicInverted();
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
        /* renamed from: getGraphicTertiaryDynamic-0d7_KjU */
        public long getGraphicTertiaryDynamic() {
            return this.$$delegate_0.getGraphicTertiaryDynamic();
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
        /* renamed from: getGraphicWarningOnDark-0d7_KjU */
        public long getGraphicWarningOnDark() {
            return this.$$delegate_0.getGraphicWarningOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimary-0d7_KjU */
        public long getGraphicWarningPrimary() {
            return this.$$delegate_0.getGraphicWarningPrimary();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryInverted-0d7_KjU */
        public long getGraphicWarningPrimaryInverted() {
            return this.$$delegate_0.getGraphicWarningPrimaryInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getGraphicWarningPrimaryOnLight-0d7_KjU */
        public long getGraphicWarningPrimaryOnLight() {
            return this.$$delegate_0.getGraphicWarningPrimaryOnLight();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerActiveFloor0-0d7_KjU */
        public long getLayerActiveFloor0() {
            return this.$$delegate_0.getLayerActiveFloor0();
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
        /* renamed from: getLayerFloor0-0d7_KjU */
        public long getLayerFloor0() {
            return this.$$delegate_0.getLayerFloor0();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getLayerFloor0Inverted-0d7_KjU */
        public long getLayerFloor0Inverted() {
            return this.$$delegate_0.getLayerFloor0Inverted();
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
        /* renamed from: getTextAccent-0d7_KjU */
        public long getTextAccent() {
            return this.$$delegate_0.getTextAccent();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentInverted-0d7_KjU */
        public long getTextAccentInverted() {
            return this.$$delegate_0.getTextAccentInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextAccentOnLight-0d7_KjU */
        public long getTextAccentOnLight() {
            return this.$$delegate_0.getTextAccentOnLight();
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
        /* renamed from: getTextActiveAccent-0d7_KjU */
        public long getTextActiveAccent() {
            return this.$$delegate_0.getTextActiveAccent();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveAccentInverted-0d7_KjU */
        public long getTextActiveAccentInverted() {
            return this.$$delegate_0.getTextActiveAccentInverted();
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
        /* renamed from: getTextActiveMarketing-0d7_KjU */
        public long getTextActiveMarketing() {
            return this.$$delegate_0.getTextActiveMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveMarketingInverted-0d7_KjU */
        public long getTextActiveMarketingInverted() {
            return this.$$delegate_0.getTextActiveMarketingInverted();
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
        /* renamed from: getTextActivePositive-0d7_KjU */
        public long getTextActivePositive() {
            return this.$$delegate_0.getTextActivePositive();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActivePositiveInverted-0d7_KjU */
        public long getTextActivePositiveInverted() {
            return this.$$delegate_0.getTextActivePositiveInverted();
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
        /* renamed from: getTextActiveWarning-0d7_KjU */
        public long getTextActiveWarning() {
            return this.$$delegate_0.getTextActiveWarning();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextActiveWarningInverted-0d7_KjU */
        public long getTextActiveWarningInverted() {
            return this.$$delegate_0.getTextActiveWarningInverted();
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
        /* renamed from: getTextMarketing-0d7_KjU */
        public long getTextMarketing() {
            return this.$$delegate_0.getTextMarketing();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingInverted-0d7_KjU */
        public long getTextMarketingInverted() {
            return this.$$delegate_0.getTextMarketingInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnDark-0d7_KjU */
        public long getTextMarketingOnDark() {
            return this.$$delegate_0.getTextMarketingOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextMarketingOnLight-0d7_KjU */
        public long getTextMarketingOnLight() {
            return this.$$delegate_0.getTextMarketingOnLight();
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
        /* renamed from: getTextPositive-0d7_KjU */
        public long getTextPositive() {
            return this.$$delegate_0.getTextPositive();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveInverted-0d7_KjU */
        public long getTextPositiveInverted() {
            return this.$$delegate_0.getTextPositiveInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnDark-0d7_KjU */
        public long getTextPositiveOnDark() {
            return this.$$delegate_0.getTextPositiveOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPositiveOnLight-0d7_KjU */
        public long getTextPositiveOnLight() {
            return this.$$delegate_0.getTextPositiveOnLight();
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
        /* renamed from: getTextPrimaryDynamic-0d7_KjU */
        public long getTextPrimaryDynamic() {
            return this.$$delegate_0.getTextPrimaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextPrimaryDynamicInverted-0d7_KjU */
        public long getTextPrimaryDynamicInverted() {
            return this.$$delegate_0.getTextPrimaryDynamicInverted();
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
        /* renamed from: getTextSecondaryDynamic-0d7_KjU */
        public long getTextSecondaryDynamic() {
            return this.$$delegate_0.getTextSecondaryDynamic();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextSecondaryDynamicInverted-0d7_KjU */
        public long getTextSecondaryDynamicInverted() {
            return this.$$delegate_0.getTextSecondaryDynamicInverted();
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
        /* renamed from: getTextWarning-0d7_KjU */
        public long getTextWarning() {
            return this.$$delegate_0.getTextWarning();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningInverted-0d7_KjU */
        public long getTextWarningInverted() {
            return this.$$delegate_0.getTextWarningInverted();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: getTextWarningOnDark-0d7_KjU */
        public long getTextWarningOnDark() {
            return this.$$delegate_0.getTextWarningOnDark();
        }

        @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
        /* renamed from: isDark */
        public boolean getIsDark() {
            return this.$$delegate_0.getIsDark();
        }
    };

    @NotNull
    public static final UniColorScheme getFreshDarkColorScheme() {
        return FreshDarkColorScheme;
    }

    @NotNull
    public static final UniColorScheme getFreshLightColorScheme() {
        return FreshLightColorScheme;
    }
}
