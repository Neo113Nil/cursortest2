package ru.ozon.uni.ozi.theme;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.CourierFreshColorSchemeKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\" \u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\f\"-\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0012\u0010\u0013\" \u0010\u0016\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004\"&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\n\u0012\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001a\u0010\f\"-\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/uni/ozi/theme/OziColorScheme;", "FreshLightOziColorScheme", "Lru/ozon/uni/ozi/theme/OziColorScheme;", "getFreshLightOziColorScheme", "()Lru/ozon/uni/ozi/theme/OziColorScheme;", "getFreshLightOziColorScheme$annotations", "()V", "", "Ll1/Z;", "freshLightOziColorList", "Ljava/util/List;", "getFreshLightOziColorList", "()Ljava/util/List;", "getFreshLightOziColorList$annotations", "", "", "freshLightOziColorsMap$delegate", "LSc/j;", "getFreshLightOziColorsMap", "()Ljava/util/Map;", "getFreshLightOziColorsMap$annotations", "freshLightOziColorsMap", "FreshDarkOziColorScheme", "getFreshDarkOziColorScheme", "getFreshDarkOziColorScheme$annotations", "freshDarkOziColorList", "getFreshDarkOziColorList", "getFreshDarkOziColorList$annotations", "freshDarkOziColorsMap$delegate", "getFreshDarkOziColorsMap", "getFreshDarkOziColorsMap$annotations", "freshDarkOziColorsMap", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FreshOziColorSchemeKt {

    @NotNull
    private static final OziColorScheme FreshDarkOziColorScheme;

    @NotNull
    private static final OziColorScheme FreshLightOziColorScheme;

    @NotNull
    private static final List<C7807Z> freshDarkOziColorList;

    @NotNull
    private static final InterfaceC4008j freshDarkOziColorsMap$delegate;

    @NotNull
    private static final List<C7807Z> freshLightOziColorList;

    @NotNull
    private static final InterfaceC4008j freshLightOziColorsMap$delegate;

    static {
        OziColorScheme oziColorScheme = new OziColorScheme() { // from class: ru.ozon.uni.ozi.theme.FreshOziColorSchemeKt$FreshLightOziColorScheme$1
            private final /* synthetic */ OziColorScheme $$delegate_0 = DefaultLightOziColorSchemeKt.getDefaultLightOziColorScheme();
            private final long graphicActionOnDark = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActionOnDark();
            private final long graphicActionOnLight = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActionOnLight();
            private final long textActionOnDark = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActionOnDark();
            private final long textActionOnLight = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActionOnLight();
            private final long bgActionPrimary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActionPrimary();
            private final long bgActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActionPrimaryInverted();
            private final long bgActionSecondary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgOpaqueActionSecondary();
            private final long bgActionSecondaryInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActionSecondaryInverted();
            private final long bgActionSecondarySolid = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActionSecondarySolid();
            private final long bgActiveActionPrimary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionPrimary();
            private final long bgActiveActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionPrimaryInverted();
            private final long bgActiveActionSecondary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionSecondary();
            private final long bgActiveActionSecondaryInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionSecondaryInverted();
            private final long bgOpaqueActionSecondary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgOpaqueActionSecondary();
            private final long graphicActionPrimary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActionPrimary();
            private final long graphicActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActionPrimaryInverted();
            private final long graphicActiveActionPrimary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActiveActionPrimary();
            private final long graphicActiveActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActiveActionPrimaryInverted();
            private final long textAction = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextAction();
            private final long textActionInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActionInverted();
            private final long textActiveAction = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActiveAction();
            private final long textActiveActionInverted = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActiveActionInverted();
            private final long staticGraphicActionOnDark = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActionOnDark();
            private final long staticGraphicActionOnLight = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getGraphicActionOnLight();
            private final long staticTextActionOnDark = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActionOnDark();
            private final long staticTextActionOnLight = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActionOnLight();
            private final long invertedBgActionPrimary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActionPrimaryInverted();
            private final long invertedTextAction = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActionInverted();
            private final long bgActionSecondaryTransparent = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActionSecondary();
            private final long activeBgActionPrimary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionPrimary();
            private final long activeBgActionSecondary = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionSecondary();
            private final long activeBgActionSecondaryTransparent = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getBgActiveActionSecondary();
            private final long activeTextAction = CourierFreshColorSchemeKt.getCourierFreshLightColorScheme().getTextActiveAction();
            private final OziColorConfig colorConfig = new OziColorConfig(OziMiniAppColorScheme.Fresh, OziColorTheme.Light);

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
            /* renamed from: getActiveBgNegativePrimary-0d7_KjU */
            public long getActiveBgNegativePrimary() {
                return this.$$delegate_0.getActiveBgNegativePrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativeSecondary-0d7_KjU */
            public long getActiveBgNegativeSecondary() {
                return this.$$delegate_0.getActiveBgNegativeSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativeSecondaryTransparent-0d7_KjU */
            public long getActiveBgNegativeSecondaryTransparent() {
                return this.$$delegate_0.getActiveBgNegativeSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicNegativePrimary-0d7_KjU */
            public long getActiveGraphicNegativePrimary() {
                return this.$$delegate_0.getActiveGraphicNegativePrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicPositivePrimary-0d7_KjU */
            public long getActiveGraphicPositivePrimary() {
                return this.$$delegate_0.getActiveGraphicPositivePrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicWarningPrimary-0d7_KjU */
            public long getActiveGraphicWarningPrimary() {
                return this.$$delegate_0.getActiveGraphicWarningPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveTextAction-0d7_KjU, reason: from getter */
            public long getActiveTextAction() {
                return this.activeTextAction;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveTextPrimary-0d7_KjU */
            public long getActiveTextPrimary() {
                return this.$$delegate_0.getActiveTextPrimary();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgAccentSecondaryTransparent-0d7_KjU */
            public long getBgAccentSecondaryTransparent() {
                return this.$$delegate_0.getBgAccentSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgNegativeSecondaryTransparent-0d7_KjU */
            public long getBgNegativeSecondaryTransparent() {
                return this.$$delegate_0.getBgNegativeSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgPositiveSecondaryTransparent-0d7_KjU */
            public long getBgPositiveSecondaryTransparent() {
                return this.$$delegate_0.getBgPositiveSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgSecondaryTransparent-0d7_KjU */
            public long getBgSecondaryTransparent() {
                return this.$$delegate_0.getBgSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgWarningSecondaryTransparent-0d7_KjU */
            public long getBgWarningSecondaryTransparent() {
                return this.$$delegate_0.getBgWarningSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            public OziColorConfig getColorConfig() {
                return this.colorConfig;
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getDetectorColorMine-0d7_KjU */
            public long getDetectorColorMine() {
                return this.$$delegate_0.getDetectorColorMine();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomPrimary-0d7_KjU */
            public long getExtraBgEconomPrimary() {
                return this.$$delegate_0.getExtraBgEconomPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomSecondary-0d7_KjU */
            public long getExtraBgEconomSecondary() {
                return this.$$delegate_0.getExtraBgEconomSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomSecondaryTransparent-0d7_KjU */
            public long getExtraBgEconomSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgEconomSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressPrimary-0d7_KjU */
            public long getExtraBgExpressPrimary() {
                return this.$$delegate_0.getExtraBgExpressPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressSecondary-0d7_KjU */
            public long getExtraBgExpressSecondary() {
                return this.$$delegate_0.getExtraBgExpressSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressSecondaryTransparent-0d7_KjU */
            public long getExtraBgExpressSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgExpressSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshPrimary-0d7_KjU */
            public long getExtraBgFreshPrimary() {
                return this.$$delegate_0.getExtraBgFreshPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshSecondary-0d7_KjU */
            public long getExtraBgFreshSecondary() {
                return this.$$delegate_0.getExtraBgFreshSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshSecondaryTransparent-0d7_KjU */
            public long getExtraBgFreshSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgFreshSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingPrimary-0d7_KjU */
            public long getExtraBgMarketingPrimary() {
                return this.$$delegate_0.getExtraBgMarketingPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingSecondary-0d7_KjU */
            public long getExtraBgMarketingSecondary() {
                return this.$$delegate_0.getExtraBgMarketingSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingSecondaryTransparent-0d7_KjU */
            public long getExtraBgMarketingSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgMarketingSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgPremiumPrimary-0d7_KjU */
            public long getExtraBgPremiumPrimary() {
                return this.$$delegate_0.getExtraBgPremiumPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgPremiumSecondaryTransparent-0d7_KjU */
            public long getExtraBgPremiumSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgPremiumSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicEconom-0d7_KjU */
            public long getExtraGraphicEconom() {
                return this.$$delegate_0.getExtraGraphicEconom();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicExpress-0d7_KjU */
            public long getExtraGraphicExpress() {
                return this.$$delegate_0.getExtraGraphicExpress();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicFresh-0d7_KjU */
            public long getExtraGraphicFresh() {
                return this.$$delegate_0.getExtraGraphicFresh();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicMarketing-0d7_KjU */
            public long getExtraGraphicMarketing() {
                return this.$$delegate_0.getExtraGraphicMarketing();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicPremium-0d7_KjU */
            public long getExtraGraphicPremium() {
                return this.$$delegate_0.getExtraGraphicPremium();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextEconom-0d7_KjU */
            public long getExtraTextEconom() {
                return this.$$delegate_0.getExtraTextEconom();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextExpress-0d7_KjU */
            public long getExtraTextExpress() {
                return this.$$delegate_0.getExtraTextExpress();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextFresh-0d7_KjU */
            public long getExtraTextFresh() {
                return this.$$delegate_0.getExtraTextFresh();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextMarketing-0d7_KjU */
            public long getExtraTextMarketing() {
                return this.$$delegate_0.getExtraTextMarketing();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextPremium-0d7_KjU */
            public long getExtraTextPremium() {
                return this.$$delegate_0.getExtraTextPremium();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicDisabledTransparent-0d7_KjU */
            public long getGraphicDisabledTransparent() {
                return this.$$delegate_0.getGraphicDisabledTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicNeutralTransparent-0d7_KjU */
            public long getGraphicNeutralTransparent() {
                return this.$$delegate_0.getGraphicNeutralTransparent();
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getGraphicOverlapPrimary-0d7_KjU */
            public long getGraphicOverlapPrimary() {
                return this.$$delegate_0.getGraphicOverlapPrimary();
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getGraphicOverlapPrimaryDynamic-0d7_KjU */
            public long getGraphicOverlapPrimaryDynamic() {
                return this.$$delegate_0.getGraphicOverlapPrimaryDynamic();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicQuaternaryTransparent-0d7_KjU */
            public long getGraphicQuaternaryTransparent() {
                return this.$$delegate_0.getGraphicQuaternaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicSecondaryTransparent-0d7_KjU */
            public long getGraphicSecondaryTransparent() {
                return this.$$delegate_0.getGraphicSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicTertiaryTransparent-0d7_KjU */
            public long getGraphicTertiaryTransparent() {
                return this.$$delegate_0.getGraphicTertiaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgActionPrimary-0d7_KjU, reason: from getter */
            public long getInvertedBgActionPrimary() {
                return this.invertedBgActionPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgPrimary-0d7_KjU */
            public long getInvertedBgPrimary() {
                return this.$$delegate_0.getInvertedBgPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgSecondaryTransparent-0d7_KjU */
            public long getInvertedBgSecondaryTransparent() {
                return this.$$delegate_0.getInvertedBgSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicPrimary-0d7_KjU */
            public long getInvertedGraphicPrimary() {
                return this.$$delegate_0.getInvertedGraphicPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicSecondaryTransparent-0d7_KjU */
            public long getInvertedGraphicSecondaryTransparent() {
                return this.$$delegate_0.getInvertedGraphicSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicTertiaryTransparent-0d7_KjU */
            public long getInvertedGraphicTertiaryTransparent() {
                return this.$$delegate_0.getInvertedGraphicTertiaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedLayerFloor2-0d7_KjU */
            public long getInvertedLayerFloor2() {
                return this.$$delegate_0.getInvertedLayerFloor2();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextAction-0d7_KjU, reason: from getter */
            public long getInvertedTextAction() {
                return this.invertedTextAction;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextPrimary-0d7_KjU */
            public long getInvertedTextPrimary() {
                return this.$$delegate_0.getInvertedTextPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextSecondaryTransparent-0d7_KjU */
            public long getInvertedTextSecondaryTransparent() {
                return this.$$delegate_0.getInvertedTextSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerOverlayDimmingTransparent-0d7_KjU */
            public long getLayerOverlayDimmingTransparent() {
                return this.$$delegate_0.getLayerOverlayDimmingTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerOverlayParanjaTransparent-0d7_KjU */
            public long getLayerOverlayParanjaTransparent() {
                return this.$$delegate_0.getLayerOverlayParanjaTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerSurfaceTransparent-0d7_KjU */
            public long getLayerSurfaceTransparent() {
                return this.$$delegate_0.getLayerSurfaceTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticBgDarkKey-0d7_KjU */
            public long getStaticBgDarkKey() {
                return this.$$delegate_0.getStaticBgDarkKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticBgLightKey-0d7_KjU */
            public long getStaticBgLightKey() {
                return this.$$delegate_0.getStaticBgLightKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey100Transparent-0d7_KjU */
            public long getStaticClearDarkKey100Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey100Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey200Transparent-0d7_KjU */
            public long getStaticClearDarkKey200Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey200Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey300Transparent-0d7_KjU */
            public long getStaticClearDarkKey300Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey300Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey400Transparent-0d7_KjU */
            public long getStaticClearDarkKey400Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey400Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey500Transparent-0d7_KjU */
            public long getStaticClearDarkKey500Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey500Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey600Transparent-0d7_KjU */
            public long getStaticClearDarkKey600Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey600Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey700Transparent-0d7_KjU */
            public long getStaticClearDarkKey700Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey700Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey800Transparent-0d7_KjU */
            public long getStaticClearDarkKey800Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey800Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey0Transparent-0d7_KjU */
            public long getStaticClearLightKey0Transparent() {
                return this.$$delegate_0.getStaticClearLightKey0Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey100Transparent-0d7_KjU */
            public long getStaticClearLightKey100Transparent() {
                return this.$$delegate_0.getStaticClearLightKey100Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey200Transparent-0d7_KjU */
            public long getStaticClearLightKey200Transparent() {
                return this.$$delegate_0.getStaticClearLightKey200Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey300Transparent-0d7_KjU */
            public long getStaticClearLightKey300Transparent() {
                return this.$$delegate_0.getStaticClearLightKey300Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey400Transparent-0d7_KjU */
            public long getStaticClearLightKey400Transparent() {
                return this.$$delegate_0.getStaticClearLightKey400Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey500Transparent-0d7_KjU */
            public long getStaticClearLightKey500Transparent() {
                return this.$$delegate_0.getStaticClearLightKey500Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey600Transparent-0d7_KjU */
            public long getStaticClearLightKey600Transparent() {
                return this.$$delegate_0.getStaticClearLightKey600Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey700Transparent-0d7_KjU */
            public long getStaticClearLightKey700Transparent() {
                return this.$$delegate_0.getStaticClearLightKey700Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey800Transparent-0d7_KjU */
            public long getStaticClearLightKey800Transparent() {
                return this.$$delegate_0.getStaticClearLightKey800Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticDetectorColorMine-0d7_KjU */
            public long getStaticDetectorColorMine() {
                return this.$$delegate_0.getStaticDetectorColorMine();
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
            /* renamed from: getStaticGraphicDarkKey-0d7_KjU */
            public long getStaticGraphicDarkKey() {
                return this.$$delegate_0.getStaticGraphicDarkKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDarkerNeutralOnLight-0d7_KjU */
            public long getStaticGraphicDarkerNeutralOnLight() {
                return this.$$delegate_0.getStaticGraphicDarkerNeutralOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDisabledOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicDisabledOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicDisabledOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDisabledOnLight-0d7_KjU */
            public long getStaticGraphicDisabledOnLight() {
                return this.$$delegate_0.getStaticGraphicDisabledOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicLightKey-0d7_KjU */
            public long getStaticGraphicLightKey() {
                return this.$$delegate_0.getStaticGraphicLightKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicNeutralOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicNeutralOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicNeutralOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicNeutralOnLight-0d7_KjU */
            public long getStaticGraphicNeutralOnLight() {
                return this.$$delegate_0.getStaticGraphicNeutralOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicPrimaryOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicPrimaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicPrimaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicPrimaryOnLight-0d7_KjU */
            public long getStaticGraphicPrimaryOnLight() {
                return this.$$delegate_0.getStaticGraphicPrimaryOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSecondaryOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicSecondaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicSecondaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSecondaryOnLightTransparent-0d7_KjU */
            public long getStaticGraphicSecondaryOnLightTransparent() {
                return this.$$delegate_0.getStaticGraphicSecondaryOnLightTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSolidNeutral-0d7_KjU */
            public long getStaticGraphicSolidNeutral() {
                return this.$$delegate_0.getStaticGraphicSolidNeutral();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicTertiaryOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicTertiaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicTertiaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicTertiaryOnLightTransparent-0d7_KjU */
            public long getStaticGraphicTertiaryOnLightTransparent() {
                return this.$$delegate_0.getStaticGraphicTertiaryOnLightTransparent();
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
            /* renamed from: getStaticTextDarkKey-0d7_KjU */
            public long getStaticTextDarkKey() {
                return this.$$delegate_0.getStaticTextDarkKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextLightKey-0d7_KjU */
            public long getStaticTextLightKey() {
                return this.$$delegate_0.getStaticTextLightKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextPrimaryOnDark-0d7_KjU */
            public long getStaticTextPrimaryOnDark() {
                return this.$$delegate_0.getStaticTextPrimaryOnDark();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextPrimaryOnLight-0d7_KjU */
            public long getStaticTextPrimaryOnLight() {
                return this.$$delegate_0.getStaticTextPrimaryOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextSecondaryOnDarkTransparent-0d7_KjU */
            public long getStaticTextSecondaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticTextSecondaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextSecondaryOnLightTransparent-0d7_KjU */
            public long getStaticTextSecondaryOnLightTransparent() {
                return this.$$delegate_0.getStaticTextSecondaryOnLightTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextTertiaryOnDarkTransparent-0d7_KjU */
            public long getStaticTextTertiaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticTextTertiaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextTertiaryOnLightTransparent-0d7_KjU */
            public long getStaticTextTertiaryOnLightTransparent() {
                return this.$$delegate_0.getStaticTextTertiaryOnLightTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getTextSecondaryTransparent-0d7_KjU */
            public long getTextSecondaryTransparent() {
                return this.$$delegate_0.getTextSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getTextTertiaryTransparent-0d7_KjU */
            public long getTextTertiaryTransparent() {
                return this.$$delegate_0.getTextTertiaryTransparent();
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
        FreshLightOziColorScheme = oziColorScheme;
        freshLightOziColorList = C7714v.b0(C7807Z.m(oziColorScheme.getDetectorColorMine()), C7807Z.m(oziColorScheme.getBgAccentOnLight()), C7807Z.m(oziColorScheme.getBgDarkKey()), C7807Z.m(oziColorScheme.getBgLightKey()), C7807Z.m(oziColorScheme.getBgMarketingOnLight()), C7807Z.m(oziColorScheme.getBgPositiveOnLight()), C7807Z.m(oziColorScheme.getBgWarningOnLight()), C7807Z.m(oziColorScheme.getClearDarkKey100()), C7807Z.m(oziColorScheme.getClearDarkKey200()), C7807Z.m(oziColorScheme.getClearDarkKey300()), C7807Z.m(oziColorScheme.getClearDarkKey400()), C7807Z.m(oziColorScheme.getClearDarkKey500()), C7807Z.m(oziColorScheme.getClearDarkKey600()), C7807Z.m(oziColorScheme.getClearDarkKey700()), C7807Z.m(oziColorScheme.getClearDarkKey800()), C7807Z.m(oziColorScheme.getClearLightKey0()), C7807Z.m(oziColorScheme.getClearLightKey100()), C7807Z.m(oziColorScheme.getClearLightKey200()), C7807Z.m(oziColorScheme.getClearLightKey300()), C7807Z.m(oziColorScheme.getClearLightKey400()), C7807Z.m(oziColorScheme.getClearLightKey500()), C7807Z.m(oziColorScheme.getClearLightKey600()), C7807Z.m(oziColorScheme.getClearLightKey700()), C7807Z.m(oziColorScheme.getClearLightKey800()), C7807Z.m(oziColorScheme.getGraphicAccentOnLight()), C7807Z.m(oziColorScheme.getGraphicActionOnDark()), C7807Z.m(oziColorScheme.getGraphicActionOnLight()), C7807Z.m(oziColorScheme.getGraphicDarkKey()), C7807Z.m(oziColorScheme.getGraphicDarkerNeutralOnLight()), C7807Z.m(oziColorScheme.getGraphicDisabledOnDark()), C7807Z.m(oziColorScheme.getGraphicDisabledOnLight()), C7807Z.m(oziColorScheme.getGraphicExpressOnDark()), C7807Z.m(oziColorScheme.getGraphicFreshOnDark()), C7807Z.m(oziColorScheme.getGraphicLightKey()), C7807Z.m(oziColorScheme.getGraphicMarketingOnDark()), C7807Z.m(oziColorScheme.getGraphicMarketingOnLight()), C7807Z.m(oziColorScheme.getGraphicNegativeOnDark()), C7807Z.m(oziColorScheme.getGraphicNeutralOnDark()), C7807Z.m(oziColorScheme.getGraphicNeutralOnLight()), C7807Z.m(oziColorScheme.getGraphicOverlapPrimary()), C7807Z.m(oziColorScheme.getGraphicOverlapPrimaryDynamic()), C7807Z.m(oziColorScheme.getGraphicPositiveOnDark()), C7807Z.m(oziColorScheme.getGraphicPositivePrimaryOnLight()), C7807Z.m(oziColorScheme.getGraphicPrimaryOnDark()), C7807Z.m(oziColorScheme.getGraphicPrimaryOnLight()), C7807Z.m(oziColorScheme.getGraphicSecondaryOnDark()), C7807Z.m(oziColorScheme.getGraphicSecondaryOnLight()), C7807Z.m(oziColorScheme.getGraphicSolidNeutral()), C7807Z.m(oziColorScheme.getGraphicTertiaryOnDark()), C7807Z.m(oziColorScheme.getGraphicTertiaryOnLight()), C7807Z.m(oziColorScheme.getGraphicWarningOnDark()), C7807Z.m(oziColorScheme.getGraphicWarningPrimaryOnLight()), C7807Z.m(oziColorScheme.getLayerFloor1OnDark()), C7807Z.m(oziColorScheme.getTextAccentOnLight()), C7807Z.m(oziColorScheme.getTextActionOnDark()), C7807Z.m(oziColorScheme.getTextActionOnLight()), C7807Z.m(oziColorScheme.getTextDarkKey()), C7807Z.m(oziColorScheme.getTextExpressOnDark()), C7807Z.m(oziColorScheme.getTextFreshOnDark()), C7807Z.m(oziColorScheme.getTextLightKey()), C7807Z.m(oziColorScheme.getTextMarketingOnDark()), C7807Z.m(oziColorScheme.getTextMarketingOnLight()), C7807Z.m(oziColorScheme.getTextNegativeOnDark()), C7807Z.m(oziColorScheme.getTextPositiveOnDark()), C7807Z.m(oziColorScheme.getTextPositiveOnLight()), C7807Z.m(oziColorScheme.getTextPrimaryOnDark()), C7807Z.m(oziColorScheme.getTextPrimaryOnLight()), C7807Z.m(oziColorScheme.getTextSecondaryOnDark()), C7807Z.m(oziColorScheme.getTextSecondaryOnLight()), C7807Z.m(oziColorScheme.getTextTertiaryOnDark()), C7807Z.m(oziColorScheme.getTextTertiaryOnLight()), C7807Z.m(oziColorScheme.getTextWarningOnDark()), C7807Z.m(oziColorScheme.getBgAccentPrimary()), C7807Z.m(oziColorScheme.getBgAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getBgOpaqueAccentSecondary()), C7807Z.m(oziColorScheme.getBgAccentSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActionPrimary()), C7807Z.m(oziColorScheme.getBgActionPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActionSecondarySolid()), C7807Z.m(oziColorScheme.getBgActionSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveAccentPrimary()), C7807Z.m(oziColorScheme.getBgActiveAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveAccentSecondary()), C7807Z.m(oziColorScheme.getBgActiveAccentSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveActionPrimary()), C7807Z.m(oziColorScheme.getBgActiveActionPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveActionSecondary()), C7807Z.m(oziColorScheme.getBgActiveActionSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveApparelPrimary()), C7807Z.m(oziColorScheme.getBgActiveApparelPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveApparelSecondary()), C7807Z.m(oziColorScheme.getBgActiveApparelSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveAquaPrimary()), C7807Z.m(oziColorScheme.getBgActiveBestpricePrimary()), C7807Z.m(oziColorScheme.getBgActiveBestpricePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveBestpriceSecondary()), C7807Z.m(oziColorScheme.getBgActiveBestpriceSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveEconomPrimary()), C7807Z.m(oziColorScheme.getBgActiveEconomSecondary()), C7807Z.m(oziColorScheme.getBgActiveExpressPrimary()), C7807Z.m(oziColorScheme.getBgActiveExpressPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveExpressSecondary()), C7807Z.m(oziColorScheme.getBgActiveExpressSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveFreshPrimary()), C7807Z.m(oziColorScheme.getBgActiveFreshPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveFreshSecondary()), C7807Z.m(oziColorScheme.getBgActiveFreshSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveMarketingPrimary()), C7807Z.m(oziColorScheme.getBgActiveMarketingPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveMarketingSecondary()), C7807Z.m(oziColorScheme.getBgActiveMarketingSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveNegativePrimary()), C7807Z.m(oziColorScheme.getBgActiveNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveNegativeSecondary()), C7807Z.m(oziColorScheme.getBgActiveNegativeSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveOzonPrimary()), C7807Z.m(oziColorScheme.getBgActiveOzonSecondary()), C7807Z.m(oziColorScheme.getBgActivePositivePrimary()), C7807Z.m(oziColorScheme.getBgActivePositivePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActivePositiveSecondary()), C7807Z.m(oziColorScheme.getBgActivePositiveSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActivePremiumPrimary()), C7807Z.m(oziColorScheme.getBgActivePremiumPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActivePremiumSecondary()), C7807Z.m(oziColorScheme.getBgActivePremiumSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActivePrimary()), C7807Z.m(oziColorScheme.getBgActivePrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveSecondary()), C7807Z.m(oziColorScheme.getBgActiveSecondaryInverted()), C7807Z.m(oziColorScheme.getBgActiveSelect()), C7807Z.m(oziColorScheme.getBgActiveSelectInverted()), C7807Z.m(oziColorScheme.getBgActiveWarningPrimary()), C7807Z.m(oziColorScheme.getBgActiveWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getBgActiveWarningSecondary()), C7807Z.m(oziColorScheme.getBgActiveWarningSecondaryInverted()), C7807Z.m(oziColorScheme.getBgApparelPiggy()), C7807Z.m(oziColorScheme.getBgApparelPrimary()), C7807Z.m(oziColorScheme.getBgApparelPrimaryInverted()), C7807Z.m(oziColorScheme.getBgApparelSecondary()), C7807Z.m(oziColorScheme.getBgApparelSecondaryInverted()), C7807Z.m(oziColorScheme.getBgAquaPrimary()), C7807Z.m(oziColorScheme.getBgAttentionPrimary()), C7807Z.m(oziColorScheme.getBgBestpricePrimary()), C7807Z.m(oziColorScheme.getBgBestpricePrimaryInverted()), C7807Z.m(oziColorScheme.getBgBestpriceSecondary()), C7807Z.m(oziColorScheme.getBgBestpriceSecondaryInverted()), C7807Z.m(oziColorScheme.getBgControl()), C7807Z.m(oziColorScheme.getBgControlInverted()), C7807Z.m(oziColorScheme.getBgDarkCerulean()), C7807Z.m(oziColorScheme.getBgDoubtfullPrimary()), C7807Z.m(oziColorScheme.getBgEconomPrimary()), C7807Z.m(oziColorScheme.getBgEconomSecondary()), C7807Z.m(oziColorScheme.getBgExpressPrimary()), C7807Z.m(oziColorScheme.getBgExpressPrimaryInverted()), C7807Z.m(oziColorScheme.getBgExpressSecondary()), C7807Z.m(oziColorScheme.getBgExpressSecondaryInverted()), C7807Z.m(oziColorScheme.getBgFreshPrimary()), C7807Z.m(oziColorScheme.getBgFreshPrimaryInverted()), C7807Z.m(oziColorScheme.getBgFreshSecondary()), C7807Z.m(oziColorScheme.getBgFreshSecondaryInverted()), C7807Z.m(oziColorScheme.getBgGuaranteePrimary()), C7807Z.m(oziColorScheme.getBgInstalmentPrimary()), C7807Z.m(oziColorScheme.getBgInstalmentSecondary()), C7807Z.m(oziColorScheme.getBgMarketingPrimary()), C7807Z.m(oziColorScheme.getBgMarketingPrimaryInverted()), C7807Z.m(oziColorScheme.getBgMarketingSecondary()), C7807Z.m(oziColorScheme.getBgMarketingSecondaryInverted()), C7807Z.m(oziColorScheme.getBgMarketingSecondarySolid()), C7807Z.m(oziColorScheme.getBgNegativePrimary()), C7807Z.m(oziColorScheme.getBgNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getBgOpaqueNegativeSecondary()), C7807Z.m(oziColorScheme.getBgNegativeSecondaryInverted()), C7807Z.m(oziColorScheme.getBgOpaqueActionSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueApparelSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueEconomSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueFreshSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueMarketingSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueOzonSecondary()), C7807Z.m(oziColorScheme.getBgOpaquePositiveSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueSecondary()), C7807Z.m(oziColorScheme.getBgOpaqueWarningSecondary()), C7807Z.m(oziColorScheme.getBgOverlap()), C7807Z.m(oziColorScheme.getBgOverlapInverted()), C7807Z.m(oziColorScheme.getBgOxford()), C7807Z.m(oziColorScheme.getBgOzonPrimary()), C7807Z.m(oziColorScheme.getBgOzonSecondary()), C7807Z.m(oziColorScheme.getBgPositivePrimary()), C7807Z.m(oziColorScheme.getBgPositivePrimaryInverted()), C7807Z.m(oziColorScheme.getBgPositiveSecondary()), C7807Z.m(oziColorScheme.getBgPositiveSecondaryInverted()), C7807Z.m(oziColorScheme.getBgPremiumPrimary()), C7807Z.m(oziColorScheme.getBgPremiumPrimaryInverted()), C7807Z.m(oziColorScheme.getBgPremiumSecondary()), C7807Z.m(oziColorScheme.getBgPremiumSecondaryInverted()), C7807Z.m(oziColorScheme.getBgPrimary()), C7807Z.m(oziColorScheme.getBgPrimaryInverted()), C7807Z.m(oziColorScheme.getBgPrussian()), C7807Z.m(oziColorScheme.getBgSbp()), C7807Z.m(oziColorScheme.getBgSecondary()), C7807Z.m(oziColorScheme.getBgSecondaryDynamic()), C7807Z.m(oziColorScheme.getBgSecondaryDynamicInverted()), C7807Z.m(oziColorScheme.getBgSecondaryInverted()), C7807Z.m(oziColorScheme.getBgSelect()), C7807Z.m(oziColorScheme.getBgSelectInverted()), C7807Z.m(oziColorScheme.getBgTabbarPrimary()), C7807Z.m(oziColorScheme.getBgTech()), C7807Z.m(oziColorScheme.getBgUltraPrimary()), C7807Z.m(oziColorScheme.getBgWarningPrimary()), C7807Z.m(oziColorScheme.getBgWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getBgWarningSecondaryInverted()), C7807Z.m(oziColorScheme.getGraphicAccentPrimary()), C7807Z.m(oziColorScheme.getGraphicAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActionPrimary()), C7807Z.m(oziColorScheme.getGraphicActionPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveAccentPrimary()), C7807Z.m(oziColorScheme.getGraphicActiveAccentPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveActionPrimary()), C7807Z.m(oziColorScheme.getGraphicActiveActionPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveApparel()), C7807Z.m(oziColorScheme.getGraphicActiveApparelInverted()), C7807Z.m(oziColorScheme.getGraphicActiveBestprice()), C7807Z.m(oziColorScheme.getGraphicActiveBestpriceInverted()), C7807Z.m(oziColorScheme.getGraphicActiveEconom()), C7807Z.m(oziColorScheme.getGraphicActiveExpress()), C7807Z.m(oziColorScheme.getGraphicActiveExpressInverted()), C7807Z.m(oziColorScheme.getGraphicActiveFresh()), C7807Z.m(oziColorScheme.getGraphicActiveFreshInverted()), C7807Z.m(oziColorScheme.getGraphicActiveMarketing()), C7807Z.m(oziColorScheme.getGraphicActiveMarketingInverted()), C7807Z.m(oziColorScheme.getGraphicActiveNegativePrimary()), C7807Z.m(oziColorScheme.getGraphicActiveNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActiveOzon()), C7807Z.m(oziColorScheme.getGraphicActivePositivePrimary()), C7807Z.m(oziColorScheme.getGraphicActivePositivePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicActivePremium()), C7807Z.m(oziColorScheme.getGraphicActivePremiumBlue()), C7807Z.m(oziColorScheme.getGraphicActivePremiumInverted()), C7807Z.m(oziColorScheme.getGraphicActiveRating()), C7807Z.m(oziColorScheme.getGraphicActiveRatingInverted()), C7807Z.m(oziColorScheme.getGraphicActiveWarningPrimary()), C7807Z.m(oziColorScheme.getGraphicActiveWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicApparel()), C7807Z.m(oziColorScheme.getGraphicApparelInverted()), C7807Z.m(oziColorScheme.getGraphicBestprice()), C7807Z.m(oziColorScheme.getGraphicBestpriceInverted()), C7807Z.m(oziColorScheme.getGraphicDisabled()), C7807Z.m(oziColorScheme.getGraphicDisabledInverted()), C7807Z.m(oziColorScheme.getGraphicEconom()), C7807Z.m(oziColorScheme.getGraphicExpress()), C7807Z.m(oziColorScheme.getGraphicExpressInverted()), C7807Z.m(oziColorScheme.getGraphicFintechGracePrimary()), C7807Z.m(oziColorScheme.getGraphicFintechGraceSecondary()), C7807Z.m(oziColorScheme.getGraphicFresh()), C7807Z.m(oziColorScheme.getGraphicFreshInverted()), C7807Z.m(oziColorScheme.getGraphicGuarantee()), C7807Z.m(oziColorScheme.getGraphicKey()), C7807Z.m(oziColorScheme.getGraphicKeyInverted()), C7807Z.m(oziColorScheme.getGraphicMarketing()), C7807Z.m(oziColorScheme.getGraphicMarketingInverted()), C7807Z.m(oziColorScheme.getGraphicNegativePrimary()), C7807Z.m(oziColorScheme.getGraphicNegativePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicNeutral()), C7807Z.m(oziColorScheme.getGraphicNeutralInverted()), C7807Z.m(oziColorScheme.getGraphicOxford()), C7807Z.m(oziColorScheme.getGraphicOzon()), C7807Z.m(oziColorScheme.getGraphicPositivePrimary()), C7807Z.m(oziColorScheme.getGraphicPositivePrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicPositiveSecondary()), C7807Z.m(oziColorScheme.getGraphicPremium()), C7807Z.m(oziColorScheme.getGraphicPremiumBlue()), C7807Z.m(oziColorScheme.getGraphicPremiumInverted()), C7807Z.m(oziColorScheme.getGraphicPrimary()), C7807Z.m(oziColorScheme.getGraphicPrimaryDynamic()), C7807Z.m(oziColorScheme.getGraphicPrimaryDynamicInverted()), C7807Z.m(oziColorScheme.getGraphicPrimaryInverted()), C7807Z.m(oziColorScheme.getGraphicQuaternary()), C7807Z.m(oziColorScheme.getGraphicRating()), C7807Z.m(oziColorScheme.getGraphicRatingInverted()), C7807Z.m(oziColorScheme.getGraphicSecondary()), C7807Z.m(oziColorScheme.getGraphicSecondaryDynamic()), C7807Z.m(oziColorScheme.getGraphicSecondaryDynamicInverted()), C7807Z.m(oziColorScheme.getGraphicSecondaryInverted()), C7807Z.m(oziColorScheme.getGraphicStrokeSticky()), C7807Z.m(oziColorScheme.getGraphicTabbarIconPrimary()), C7807Z.m(oziColorScheme.getGraphicTabbarIconSecondary()), C7807Z.m(oziColorScheme.getGraphicTech()), C7807Z.m(oziColorScheme.getGraphicTertiary()), C7807Z.m(oziColorScheme.getGraphicTertiaryDynamic()), C7807Z.m(oziColorScheme.getGraphicTertiaryInverted()), C7807Z.m(oziColorScheme.getGraphicUltraPrimary()), C7807Z.m(oziColorScheme.getGraphicWarningPrimary()), C7807Z.m(oziColorScheme.getGraphicWarningPrimaryInverted()), C7807Z.m(oziColorScheme.getLayerActiveFloor0()), C7807Z.m(oziColorScheme.getLayerActiveFloor1()), C7807Z.m(oziColorScheme.getLayerActiveFloor1Inverted()), C7807Z.m(oziColorScheme.getLayerActiveFloor2()), C7807Z.m(oziColorScheme.getLayerActiveFloor2Inverted()), C7807Z.m(oziColorScheme.getLayerActiveFloor3()), C7807Z.m(oziColorScheme.getLayerActiveFloor3Inverted()), C7807Z.m(oziColorScheme.getLayerActiveSurface()), C7807Z.m(oziColorScheme.getLayerActiveSurfaceInverted()), C7807Z.m(oziColorScheme.getLayerFloor0()), C7807Z.m(oziColorScheme.getLayerFloor0Inverted()), C7807Z.m(oziColorScheme.getLayerFloor1()), C7807Z.m(oziColorScheme.getLayerFloor1Inverted()), C7807Z.m(oziColorScheme.getLayerFloor2()), C7807Z.m(oziColorScheme.getLayerFloor2Inverted()), C7807Z.m(oziColorScheme.getLayerFloor3()), C7807Z.m(oziColorScheme.getLayerFloor3Inverted()), C7807Z.m(oziColorScheme.getLayerOverlayDimming()), C7807Z.m(oziColorScheme.getLayerOverlayDimmingInverted()), C7807Z.m(oziColorScheme.getLayerOverlayParanja()), C7807Z.m(oziColorScheme.getLayerOverlayParanjaInverted()), C7807Z.m(oziColorScheme.getLayerSurface()), C7807Z.m(oziColorScheme.getLayerSurfaceInverted()), C7807Z.m(oziColorScheme.getTextAccent()), C7807Z.m(oziColorScheme.getTextAccentInverted()), C7807Z.m(oziColorScheme.getTextAction()), C7807Z.m(oziColorScheme.getTextActionInverted()), C7807Z.m(oziColorScheme.getTextActiveAccent()), C7807Z.m(oziColorScheme.getTextActiveAccentInverted()), C7807Z.m(oziColorScheme.getTextActiveAction()), C7807Z.m(oziColorScheme.getTextActiveActionInverted()), C7807Z.m(oziColorScheme.getTextActiveApparel()), C7807Z.m(oziColorScheme.getTextActiveApparelInverted()), C7807Z.m(oziColorScheme.getTextActiveBestprice()), C7807Z.m(oziColorScheme.getTextActiveBestpriceInverted()), C7807Z.m(oziColorScheme.getTextActiveExpress()), C7807Z.m(oziColorScheme.getTextActiveExpressInverted()), C7807Z.m(oziColorScheme.getTextActiveFresh()), C7807Z.m(oziColorScheme.getTextActiveFreshInverted()), C7807Z.m(oziColorScheme.getTextActiveMarketing()), C7807Z.m(oziColorScheme.getTextActiveMarketingInverted()), C7807Z.m(oziColorScheme.getTextActiveNegative()), C7807Z.m(oziColorScheme.getTextActiveNegativeInverted()), C7807Z.m(oziColorScheme.getTextActiveOzon()), C7807Z.m(oziColorScheme.getTextActivePositive()), C7807Z.m(oziColorScheme.getTextActivePositiveInverted()), C7807Z.m(oziColorScheme.getTextActivePremium()), C7807Z.m(oziColorScheme.getTextActivePremiumInverted()), C7807Z.m(oziColorScheme.getTextActiveWarning()), C7807Z.m(oziColorScheme.getTextActiveWarningInverted()), C7807Z.m(oziColorScheme.getTextApparel()), C7807Z.m(oziColorScheme.getTextApparelInverted()), C7807Z.m(oziColorScheme.getTextBestprice()), C7807Z.m(oziColorScheme.getTextBestpriceInverted()), C7807Z.m(oziColorScheme.getTextDiscountUnavialable()), C7807Z.m(oziColorScheme.getTextEconom()), C7807Z.m(oziColorScheme.getTextExpress()), C7807Z.m(oziColorScheme.getTextExpressInverted()), C7807Z.m(oziColorScheme.getTextFresh()), C7807Z.m(oziColorScheme.getTextFreshInverted()), C7807Z.m(oziColorScheme.getTextGuarantee()), C7807Z.m(oziColorScheme.getTextMarketing()), C7807Z.m(oziColorScheme.getTextMarketingInverted()), C7807Z.m(oziColorScheme.getTextNegative()), C7807Z.m(oziColorScheme.getTextNegativeInverted()), C7807Z.m(oziColorScheme.getTextOriginalprice()), C7807Z.m(oziColorScheme.getTextOriginalpriceAvailable()), C7807Z.m(oziColorScheme.getTextOxford()), C7807Z.m(oziColorScheme.getTextOzon()), C7807Z.m(oziColorScheme.getTextPositive()), C7807Z.m(oziColorScheme.getTextPositiveInverted()), C7807Z.m(oziColorScheme.getTextPremium()), C7807Z.m(oziColorScheme.getTextPremiumInverted()), C7807Z.m(oziColorScheme.getTextPrimary()), C7807Z.m(oziColorScheme.getTextPrimaryDynamic()), C7807Z.m(oziColorScheme.getTextPrimaryDynamicInverted()), C7807Z.m(oziColorScheme.getTextPrimaryInverted()), C7807Z.m(oziColorScheme.getTextSecondary()), C7807Z.m(oziColorScheme.getTextSecondaryDynamic()), C7807Z.m(oziColorScheme.getTextSecondaryDynamicInverted()), C7807Z.m(oziColorScheme.getTextSecondaryInverted()), C7807Z.m(oziColorScheme.getTextTech()), C7807Z.m(oziColorScheme.getTextTertiary()), C7807Z.m(oziColorScheme.getTextTertiaryInverted()), C7807Z.m(oziColorScheme.getTextUltra()), C7807Z.m(oziColorScheme.getTextWarning()), C7807Z.m(oziColorScheme.getTextWarningInverted()), C7807Z.m(oziColorScheme.getTextSecondaryTransparent()), C7807Z.m(oziColorScheme.getTextTertiaryTransparent()), C7807Z.m(oziColorScheme.getGraphicSecondaryTransparent()), C7807Z.m(oziColorScheme.getGraphicTertiaryTransparent()), C7807Z.m(oziColorScheme.getGraphicQuaternaryTransparent()), C7807Z.m(oziColorScheme.getGraphicNeutralTransparent()), C7807Z.m(oziColorScheme.getGraphicDisabledTransparent()), C7807Z.m(oziColorScheme.getBgSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgActionSecondary()), C7807Z.m(oziColorScheme.getBgActionSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgAccentSecondary()), C7807Z.m(oziColorScheme.getBgAccentSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgPositiveSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgWarningSecondary()), C7807Z.m(oziColorScheme.getBgWarningSecondaryTransparent()), C7807Z.m(oziColorScheme.getBgNegativeSecondary()), C7807Z.m(oziColorScheme.getBgNegativeSecondaryTransparent()), C7807Z.m(oziColorScheme.getLayerSurfaceTransparent()), C7807Z.m(oziColorScheme.getLayerOverlayDimmingTransparent()), C7807Z.m(oziColorScheme.getLayerOverlayParanjaTransparent()), C7807Z.m(oziColorScheme.getInvertedTextPrimary()), C7807Z.m(oziColorScheme.getInvertedTextSecondaryTransparent()), C7807Z.m(oziColorScheme.getInvertedTextAction()), C7807Z.m(oziColorScheme.getInvertedGraphicPrimary()), C7807Z.m(oziColorScheme.getInvertedGraphicSecondaryTransparent()), C7807Z.m(oziColorScheme.getInvertedGraphicTertiaryTransparent()), C7807Z.m(oziColorScheme.getInvertedBgPrimary()), C7807Z.m(oziColorScheme.getInvertedBgSecondaryTransparent()), C7807Z.m(oziColorScheme.getInvertedBgActionPrimary()), C7807Z.m(oziColorScheme.getInvertedLayerFloor2()), C7807Z.m(oziColorScheme.getExtraTextFresh()), C7807Z.m(oziColorScheme.getExtraTextExpress()), C7807Z.m(oziColorScheme.getExtraTextMarketing()), C7807Z.m(oziColorScheme.getExtraTextPremium()), C7807Z.m(oziColorScheme.getExtraTextEconom()), C7807Z.m(oziColorScheme.getExtraGraphicFresh()), C7807Z.m(oziColorScheme.getExtraGraphicExpress()), C7807Z.m(oziColorScheme.getExtraGraphicMarketing()), C7807Z.m(oziColorScheme.getExtraGraphicPremium()), C7807Z.m(oziColorScheme.getExtraGraphicEconom()), C7807Z.m(oziColorScheme.getExtraBgFreshPrimary()), C7807Z.m(oziColorScheme.getExtraBgFreshSecondary()), C7807Z.m(oziColorScheme.getExtraBgFreshSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgExpressPrimary()), C7807Z.m(oziColorScheme.getExtraBgExpressSecondary()), C7807Z.m(oziColorScheme.getExtraBgExpressSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgMarketingPrimary()), C7807Z.m(oziColorScheme.getExtraBgMarketingSecondary()), C7807Z.m(oziColorScheme.getExtraBgMarketingSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgPremiumPrimary()), C7807Z.m(oziColorScheme.getExtraBgPremiumSecondaryTransparent()), C7807Z.m(oziColorScheme.getExtraBgEconomPrimary()), C7807Z.m(oziColorScheme.getExtraBgEconomSecondary()), C7807Z.m(oziColorScheme.getExtraBgEconomSecondaryTransparent()), C7807Z.m(oziColorScheme.getStaticTextDarkKey()), C7807Z.m(oziColorScheme.getStaticTextPrimaryOnLight()), C7807Z.m(oziColorScheme.getStaticTextSecondaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticTextTertiaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticTextActionOnLight()), C7807Z.m(oziColorScheme.getStaticTextLightKey()), C7807Z.m(oziColorScheme.getStaticTextPrimaryOnDark()), C7807Z.m(oziColorScheme.getStaticTextSecondaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticTextTertiaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticTextActionOnDark()), C7807Z.m(oziColorScheme.getStaticGraphicDarkKey()), C7807Z.m(oziColorScheme.getStaticGraphicPrimaryOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicSecondaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicTertiaryOnLightTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicSolidNeutral()), C7807Z.m(oziColorScheme.getStaticGraphicActionOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicDarkerNeutralOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicNeutralOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicDisabledOnLight()), C7807Z.m(oziColorScheme.getStaticGraphicLightKey()), C7807Z.m(oziColorScheme.getStaticGraphicPrimaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicSecondaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicTertiaryOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicNeutralOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicDisabledOnDarkTransparent()), C7807Z.m(oziColorScheme.getStaticGraphicActionOnDark()), C7807Z.m(oziColorScheme.getStaticBgLightKey()), C7807Z.m(oziColorScheme.getStaticBgDarkKey()), C7807Z.m(oziColorScheme.getStaticClearDarkKey800Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey700Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey600Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey500Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey400Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey300Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey200Transparent()), C7807Z.m(oziColorScheme.getStaticClearDarkKey100Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey800Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey700Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey600Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey500Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey400Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey300Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey200Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey100Transparent()), C7807Z.m(oziColorScheme.getStaticClearLightKey0Transparent()), C7807Z.m(oziColorScheme.getStaticDetectorColorMine()), C7807Z.m(oziColorScheme.getActiveTextPrimary()), C7807Z.m(oziColorScheme.getActiveTextAction()), C7807Z.m(oziColorScheme.getActiveGraphicPositivePrimary()), C7807Z.m(oziColorScheme.getActiveGraphicWarningPrimary()), C7807Z.m(oziColorScheme.getActiveGraphicNegativePrimary()), C7807Z.m(oziColorScheme.getActiveBgActionPrimary()), C7807Z.m(oziColorScheme.getActiveBgActionSecondary()), C7807Z.m(oziColorScheme.getActiveBgActionSecondaryTransparent()), C7807Z.m(oziColorScheme.getActiveBgNegativePrimary()), C7807Z.m(oziColorScheme.getActiveBgNegativeSecondary()), C7807Z.m(oziColorScheme.getActiveBgNegativeSecondaryTransparent()));
        freshLightOziColorsMap$delegate = k.b(FreshOziColorSchemeKt$freshLightOziColorsMap$2.INSTANCE);
        OziColorScheme oziColorScheme2 = new OziColorScheme() { // from class: ru.ozon.uni.ozi.theme.FreshOziColorSchemeKt$FreshDarkOziColorScheme$1
            private final /* synthetic */ OziColorScheme $$delegate_0 = DefaultDarkOziColorSchemeKt.getDefaultDarkOziColorScheme();
            private final long graphicActionOnDark = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActionOnDark();
            private final long graphicActionOnLight = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActionOnLight();
            private final long textActionOnDark = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActionOnDark();
            private final long textActionOnLight = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActionOnLight();
            private final long bgActionPrimary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActionPrimary();
            private final long bgActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActionPrimaryInverted();
            private final long bgActionSecondary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgOpaqueActionSecondary();
            private final long bgActionSecondaryInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActionSecondaryInverted();
            private final long bgActionSecondarySolid = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActionSecondarySolid();
            private final long bgActiveActionPrimary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionPrimary();
            private final long bgActiveActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionPrimaryInverted();
            private final long bgActiveActionSecondary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionSecondary();
            private final long bgActiveActionSecondaryInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionSecondaryInverted();
            private final long bgOpaqueActionSecondary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgOpaqueActionSecondary();
            private final long graphicActionPrimary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActionPrimary();
            private final long graphicActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActionPrimaryInverted();
            private final long graphicActiveActionPrimary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActiveActionPrimary();
            private final long graphicActiveActionPrimaryInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActiveActionPrimaryInverted();
            private final long textAction = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextAction();
            private final long textActionInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActionInverted();
            private final long textActiveAction = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActiveAction();
            private final long textActiveActionInverted = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActiveActionInverted();
            private final long staticGraphicActionOnDark = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActionOnDark();
            private final long staticGraphicActionOnLight = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getGraphicActionOnLight();
            private final long staticTextActionOnDark = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActionOnDark();
            private final long staticTextActionOnLight = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActionOnLight();
            private final long invertedBgActionPrimary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActionPrimaryInverted();
            private final long invertedTextAction = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActionInverted();
            private final long bgActionSecondaryTransparent = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActionSecondary();
            private final long activeBgActionPrimary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionPrimary();
            private final long activeBgActionSecondary = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionSecondary();
            private final long activeBgActionSecondaryTransparent = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getBgActiveActionSecondary();
            private final long activeTextAction = CourierFreshColorSchemeKt.getCourierFreshDarkColorScheme().getTextActiveAction();
            private final OziColorConfig colorConfig = new OziColorConfig(OziMiniAppColorScheme.Fresh, OziColorTheme.Dark);

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
            /* renamed from: getActiveBgNegativePrimary-0d7_KjU */
            public long getActiveBgNegativePrimary() {
                return this.$$delegate_0.getActiveBgNegativePrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativeSecondary-0d7_KjU */
            public long getActiveBgNegativeSecondary() {
                return this.$$delegate_0.getActiveBgNegativeSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveBgNegativeSecondaryTransparent-0d7_KjU */
            public long getActiveBgNegativeSecondaryTransparent() {
                return this.$$delegate_0.getActiveBgNegativeSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicNegativePrimary-0d7_KjU */
            public long getActiveGraphicNegativePrimary() {
                return this.$$delegate_0.getActiveGraphicNegativePrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicPositivePrimary-0d7_KjU */
            public long getActiveGraphicPositivePrimary() {
                return this.$$delegate_0.getActiveGraphicPositivePrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveGraphicWarningPrimary-0d7_KjU */
            public long getActiveGraphicWarningPrimary() {
                return this.$$delegate_0.getActiveGraphicWarningPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveTextAction-0d7_KjU, reason: from getter */
            public long getActiveTextAction() {
                return this.activeTextAction;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getActiveTextPrimary-0d7_KjU */
            public long getActiveTextPrimary() {
                return this.$$delegate_0.getActiveTextPrimary();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgAccentSecondaryTransparent-0d7_KjU */
            public long getBgAccentSecondaryTransparent() {
                return this.$$delegate_0.getBgAccentSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgNegativeSecondaryTransparent-0d7_KjU */
            public long getBgNegativeSecondaryTransparent() {
                return this.$$delegate_0.getBgNegativeSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgPositiveSecondaryTransparent-0d7_KjU */
            public long getBgPositiveSecondaryTransparent() {
                return this.$$delegate_0.getBgPositiveSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgSecondaryTransparent-0d7_KjU */
            public long getBgSecondaryTransparent() {
                return this.$$delegate_0.getBgSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getBgWarningSecondaryTransparent-0d7_KjU */
            public long getBgWarningSecondaryTransparent() {
                return this.$$delegate_0.getBgWarningSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            public OziColorConfig getColorConfig() {
                return this.colorConfig;
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getDetectorColorMine-0d7_KjU */
            public long getDetectorColorMine() {
                return this.$$delegate_0.getDetectorColorMine();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomPrimary-0d7_KjU */
            public long getExtraBgEconomPrimary() {
                return this.$$delegate_0.getExtraBgEconomPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomSecondary-0d7_KjU */
            public long getExtraBgEconomSecondary() {
                return this.$$delegate_0.getExtraBgEconomSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgEconomSecondaryTransparent-0d7_KjU */
            public long getExtraBgEconomSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgEconomSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressPrimary-0d7_KjU */
            public long getExtraBgExpressPrimary() {
                return this.$$delegate_0.getExtraBgExpressPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressSecondary-0d7_KjU */
            public long getExtraBgExpressSecondary() {
                return this.$$delegate_0.getExtraBgExpressSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgExpressSecondaryTransparent-0d7_KjU */
            public long getExtraBgExpressSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgExpressSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshPrimary-0d7_KjU */
            public long getExtraBgFreshPrimary() {
                return this.$$delegate_0.getExtraBgFreshPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshSecondary-0d7_KjU */
            public long getExtraBgFreshSecondary() {
                return this.$$delegate_0.getExtraBgFreshSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgFreshSecondaryTransparent-0d7_KjU */
            public long getExtraBgFreshSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgFreshSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingPrimary-0d7_KjU */
            public long getExtraBgMarketingPrimary() {
                return this.$$delegate_0.getExtraBgMarketingPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingSecondary-0d7_KjU */
            public long getExtraBgMarketingSecondary() {
                return this.$$delegate_0.getExtraBgMarketingSecondary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgMarketingSecondaryTransparent-0d7_KjU */
            public long getExtraBgMarketingSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgMarketingSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgPremiumPrimary-0d7_KjU */
            public long getExtraBgPremiumPrimary() {
                return this.$$delegate_0.getExtraBgPremiumPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraBgPremiumSecondaryTransparent-0d7_KjU */
            public long getExtraBgPremiumSecondaryTransparent() {
                return this.$$delegate_0.getExtraBgPremiumSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicEconom-0d7_KjU */
            public long getExtraGraphicEconom() {
                return this.$$delegate_0.getExtraGraphicEconom();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicExpress-0d7_KjU */
            public long getExtraGraphicExpress() {
                return this.$$delegate_0.getExtraGraphicExpress();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicFresh-0d7_KjU */
            public long getExtraGraphicFresh() {
                return this.$$delegate_0.getExtraGraphicFresh();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicMarketing-0d7_KjU */
            public long getExtraGraphicMarketing() {
                return this.$$delegate_0.getExtraGraphicMarketing();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraGraphicPremium-0d7_KjU */
            public long getExtraGraphicPremium() {
                return this.$$delegate_0.getExtraGraphicPremium();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextEconom-0d7_KjU */
            public long getExtraTextEconom() {
                return this.$$delegate_0.getExtraTextEconom();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextExpress-0d7_KjU */
            public long getExtraTextExpress() {
                return this.$$delegate_0.getExtraTextExpress();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextFresh-0d7_KjU */
            public long getExtraTextFresh() {
                return this.$$delegate_0.getExtraTextFresh();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextMarketing-0d7_KjU */
            public long getExtraTextMarketing() {
                return this.$$delegate_0.getExtraTextMarketing();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getExtraTextPremium-0d7_KjU */
            public long getExtraTextPremium() {
                return this.$$delegate_0.getExtraTextPremium();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicDisabledTransparent-0d7_KjU */
            public long getGraphicDisabledTransparent() {
                return this.$$delegate_0.getGraphicDisabledTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicNeutralTransparent-0d7_KjU */
            public long getGraphicNeutralTransparent() {
                return this.$$delegate_0.getGraphicNeutralTransparent();
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getGraphicOverlapPrimary-0d7_KjU */
            public long getGraphicOverlapPrimary() {
                return this.$$delegate_0.getGraphicOverlapPrimary();
            }

            @Override // ru.ozon.uni.core.compose.theme.UniColorScheme
            /* renamed from: getGraphicOverlapPrimaryDynamic-0d7_KjU */
            public long getGraphicOverlapPrimaryDynamic() {
                return this.$$delegate_0.getGraphicOverlapPrimaryDynamic();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicQuaternaryTransparent-0d7_KjU */
            public long getGraphicQuaternaryTransparent() {
                return this.$$delegate_0.getGraphicQuaternaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicSecondaryTransparent-0d7_KjU */
            public long getGraphicSecondaryTransparent() {
                return this.$$delegate_0.getGraphicSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getGraphicTertiaryTransparent-0d7_KjU */
            public long getGraphicTertiaryTransparent() {
                return this.$$delegate_0.getGraphicTertiaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgActionPrimary-0d7_KjU, reason: from getter */
            public long getInvertedBgActionPrimary() {
                return this.invertedBgActionPrimary;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgPrimary-0d7_KjU */
            public long getInvertedBgPrimary() {
                return this.$$delegate_0.getInvertedBgPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedBgSecondaryTransparent-0d7_KjU */
            public long getInvertedBgSecondaryTransparent() {
                return this.$$delegate_0.getInvertedBgSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicPrimary-0d7_KjU */
            public long getInvertedGraphicPrimary() {
                return this.$$delegate_0.getInvertedGraphicPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicSecondaryTransparent-0d7_KjU */
            public long getInvertedGraphicSecondaryTransparent() {
                return this.$$delegate_0.getInvertedGraphicSecondaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedGraphicTertiaryTransparent-0d7_KjU */
            public long getInvertedGraphicTertiaryTransparent() {
                return this.$$delegate_0.getInvertedGraphicTertiaryTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedLayerFloor2-0d7_KjU */
            public long getInvertedLayerFloor2() {
                return this.$$delegate_0.getInvertedLayerFloor2();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextAction-0d7_KjU, reason: from getter */
            public long getInvertedTextAction() {
                return this.invertedTextAction;
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextPrimary-0d7_KjU */
            public long getInvertedTextPrimary() {
                return this.$$delegate_0.getInvertedTextPrimary();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getInvertedTextSecondaryTransparent-0d7_KjU */
            public long getInvertedTextSecondaryTransparent() {
                return this.$$delegate_0.getInvertedTextSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerOverlayDimmingTransparent-0d7_KjU */
            public long getLayerOverlayDimmingTransparent() {
                return this.$$delegate_0.getLayerOverlayDimmingTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerOverlayParanjaTransparent-0d7_KjU */
            public long getLayerOverlayParanjaTransparent() {
                return this.$$delegate_0.getLayerOverlayParanjaTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getLayerSurfaceTransparent-0d7_KjU */
            public long getLayerSurfaceTransparent() {
                return this.$$delegate_0.getLayerSurfaceTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticBgDarkKey-0d7_KjU */
            public long getStaticBgDarkKey() {
                return this.$$delegate_0.getStaticBgDarkKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticBgLightKey-0d7_KjU */
            public long getStaticBgLightKey() {
                return this.$$delegate_0.getStaticBgLightKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey100Transparent-0d7_KjU */
            public long getStaticClearDarkKey100Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey100Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey200Transparent-0d7_KjU */
            public long getStaticClearDarkKey200Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey200Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey300Transparent-0d7_KjU */
            public long getStaticClearDarkKey300Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey300Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey400Transparent-0d7_KjU */
            public long getStaticClearDarkKey400Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey400Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey500Transparent-0d7_KjU */
            public long getStaticClearDarkKey500Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey500Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey600Transparent-0d7_KjU */
            public long getStaticClearDarkKey600Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey600Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey700Transparent-0d7_KjU */
            public long getStaticClearDarkKey700Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey700Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearDarkKey800Transparent-0d7_KjU */
            public long getStaticClearDarkKey800Transparent() {
                return this.$$delegate_0.getStaticClearDarkKey800Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey0Transparent-0d7_KjU */
            public long getStaticClearLightKey0Transparent() {
                return this.$$delegate_0.getStaticClearLightKey0Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey100Transparent-0d7_KjU */
            public long getStaticClearLightKey100Transparent() {
                return this.$$delegate_0.getStaticClearLightKey100Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey200Transparent-0d7_KjU */
            public long getStaticClearLightKey200Transparent() {
                return this.$$delegate_0.getStaticClearLightKey200Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey300Transparent-0d7_KjU */
            public long getStaticClearLightKey300Transparent() {
                return this.$$delegate_0.getStaticClearLightKey300Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey400Transparent-0d7_KjU */
            public long getStaticClearLightKey400Transparent() {
                return this.$$delegate_0.getStaticClearLightKey400Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey500Transparent-0d7_KjU */
            public long getStaticClearLightKey500Transparent() {
                return this.$$delegate_0.getStaticClearLightKey500Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey600Transparent-0d7_KjU */
            public long getStaticClearLightKey600Transparent() {
                return this.$$delegate_0.getStaticClearLightKey600Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey700Transparent-0d7_KjU */
            public long getStaticClearLightKey700Transparent() {
                return this.$$delegate_0.getStaticClearLightKey700Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticClearLightKey800Transparent-0d7_KjU */
            public long getStaticClearLightKey800Transparent() {
                return this.$$delegate_0.getStaticClearLightKey800Transparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticDetectorColorMine-0d7_KjU */
            public long getStaticDetectorColorMine() {
                return this.$$delegate_0.getStaticDetectorColorMine();
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
            /* renamed from: getStaticGraphicDarkKey-0d7_KjU */
            public long getStaticGraphicDarkKey() {
                return this.$$delegate_0.getStaticGraphicDarkKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDarkerNeutralOnLight-0d7_KjU */
            public long getStaticGraphicDarkerNeutralOnLight() {
                return this.$$delegate_0.getStaticGraphicDarkerNeutralOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDisabledOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicDisabledOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicDisabledOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicDisabledOnLight-0d7_KjU */
            public long getStaticGraphicDisabledOnLight() {
                return this.$$delegate_0.getStaticGraphicDisabledOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicLightKey-0d7_KjU */
            public long getStaticGraphicLightKey() {
                return this.$$delegate_0.getStaticGraphicLightKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicNeutralOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicNeutralOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicNeutralOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicNeutralOnLight-0d7_KjU */
            public long getStaticGraphicNeutralOnLight() {
                return this.$$delegate_0.getStaticGraphicNeutralOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicPrimaryOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicPrimaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicPrimaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicPrimaryOnLight-0d7_KjU */
            public long getStaticGraphicPrimaryOnLight() {
                return this.$$delegate_0.getStaticGraphicPrimaryOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSecondaryOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicSecondaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicSecondaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSecondaryOnLightTransparent-0d7_KjU */
            public long getStaticGraphicSecondaryOnLightTransparent() {
                return this.$$delegate_0.getStaticGraphicSecondaryOnLightTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicSolidNeutral-0d7_KjU */
            public long getStaticGraphicSolidNeutral() {
                return this.$$delegate_0.getStaticGraphicSolidNeutral();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicTertiaryOnDarkTransparent-0d7_KjU */
            public long getStaticGraphicTertiaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticGraphicTertiaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticGraphicTertiaryOnLightTransparent-0d7_KjU */
            public long getStaticGraphicTertiaryOnLightTransparent() {
                return this.$$delegate_0.getStaticGraphicTertiaryOnLightTransparent();
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
            /* renamed from: getStaticTextDarkKey-0d7_KjU */
            public long getStaticTextDarkKey() {
                return this.$$delegate_0.getStaticTextDarkKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextLightKey-0d7_KjU */
            public long getStaticTextLightKey() {
                return this.$$delegate_0.getStaticTextLightKey();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextPrimaryOnDark-0d7_KjU */
            public long getStaticTextPrimaryOnDark() {
                return this.$$delegate_0.getStaticTextPrimaryOnDark();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextPrimaryOnLight-0d7_KjU */
            public long getStaticTextPrimaryOnLight() {
                return this.$$delegate_0.getStaticTextPrimaryOnLight();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextSecondaryOnDarkTransparent-0d7_KjU */
            public long getStaticTextSecondaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticTextSecondaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextSecondaryOnLightTransparent-0d7_KjU */
            public long getStaticTextSecondaryOnLightTransparent() {
                return this.$$delegate_0.getStaticTextSecondaryOnLightTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextTertiaryOnDarkTransparent-0d7_KjU */
            public long getStaticTextTertiaryOnDarkTransparent() {
                return this.$$delegate_0.getStaticTextTertiaryOnDarkTransparent();
            }

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getStaticTextTertiaryOnLightTransparent-0d7_KjU */
            public long getStaticTextTertiaryOnLightTransparent() {
                return this.$$delegate_0.getStaticTextTertiaryOnLightTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getTextSecondaryTransparent-0d7_KjU */
            public long getTextSecondaryTransparent() {
                return this.$$delegate_0.getTextSecondaryTransparent();
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

            @Override // ru.ozon.uni.ozi.theme.OziColorScheme
            /* renamed from: getTextTertiaryTransparent-0d7_KjU */
            public long getTextTertiaryTransparent() {
                return this.$$delegate_0.getTextTertiaryTransparent();
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
        FreshDarkOziColorScheme = oziColorScheme2;
        freshDarkOziColorList = C7714v.b0(C7807Z.m(oziColorScheme2.getDetectorColorMine()), C7807Z.m(oziColorScheme2.getBgAccentOnLight()), C7807Z.m(oziColorScheme2.getBgDarkKey()), C7807Z.m(oziColorScheme2.getBgLightKey()), C7807Z.m(oziColorScheme2.getBgMarketingOnLight()), C7807Z.m(oziColorScheme2.getBgPositiveOnLight()), C7807Z.m(oziColorScheme2.getBgWarningOnLight()), C7807Z.m(oziColorScheme2.getClearDarkKey100()), C7807Z.m(oziColorScheme2.getClearDarkKey200()), C7807Z.m(oziColorScheme2.getClearDarkKey300()), C7807Z.m(oziColorScheme2.getClearDarkKey400()), C7807Z.m(oziColorScheme2.getClearDarkKey500()), C7807Z.m(oziColorScheme2.getClearDarkKey600()), C7807Z.m(oziColorScheme2.getClearDarkKey700()), C7807Z.m(oziColorScheme2.getClearDarkKey800()), C7807Z.m(oziColorScheme2.getClearLightKey0()), C7807Z.m(oziColorScheme2.getClearLightKey100()), C7807Z.m(oziColorScheme2.getClearLightKey200()), C7807Z.m(oziColorScheme2.getClearLightKey300()), C7807Z.m(oziColorScheme2.getClearLightKey400()), C7807Z.m(oziColorScheme2.getClearLightKey500()), C7807Z.m(oziColorScheme2.getClearLightKey600()), C7807Z.m(oziColorScheme2.getClearLightKey700()), C7807Z.m(oziColorScheme2.getClearLightKey800()), C7807Z.m(oziColorScheme2.getGraphicAccentOnLight()), C7807Z.m(oziColorScheme2.getGraphicActionOnDark()), C7807Z.m(oziColorScheme2.getGraphicActionOnLight()), C7807Z.m(oziColorScheme2.getGraphicDarkKey()), C7807Z.m(oziColorScheme2.getGraphicDarkerNeutralOnLight()), C7807Z.m(oziColorScheme2.getGraphicDisabledOnDark()), C7807Z.m(oziColorScheme2.getGraphicDisabledOnLight()), C7807Z.m(oziColorScheme2.getGraphicExpressOnDark()), C7807Z.m(oziColorScheme2.getGraphicFreshOnDark()), C7807Z.m(oziColorScheme2.getGraphicLightKey()), C7807Z.m(oziColorScheme2.getGraphicMarketingOnDark()), C7807Z.m(oziColorScheme2.getGraphicMarketingOnLight()), C7807Z.m(oziColorScheme2.getGraphicNegativeOnDark()), C7807Z.m(oziColorScheme2.getGraphicNeutralOnDark()), C7807Z.m(oziColorScheme2.getGraphicNeutralOnLight()), C7807Z.m(oziColorScheme2.getGraphicOverlapPrimary()), C7807Z.m(oziColorScheme2.getGraphicOverlapPrimaryDynamic()), C7807Z.m(oziColorScheme2.getGraphicPositiveOnDark()), C7807Z.m(oziColorScheme2.getGraphicPositivePrimaryOnLight()), C7807Z.m(oziColorScheme2.getGraphicPrimaryOnDark()), C7807Z.m(oziColorScheme2.getGraphicPrimaryOnLight()), C7807Z.m(oziColorScheme2.getGraphicSecondaryOnDark()), C7807Z.m(oziColorScheme2.getGraphicSecondaryOnLight()), C7807Z.m(oziColorScheme2.getGraphicSolidNeutral()), C7807Z.m(oziColorScheme2.getGraphicTertiaryOnDark()), C7807Z.m(oziColorScheme2.getGraphicTertiaryOnLight()), C7807Z.m(oziColorScheme2.getGraphicWarningOnDark()), C7807Z.m(oziColorScheme2.getGraphicWarningPrimaryOnLight()), C7807Z.m(oziColorScheme2.getLayerFloor1OnDark()), C7807Z.m(oziColorScheme2.getTextAccentOnLight()), C7807Z.m(oziColorScheme2.getTextActionOnDark()), C7807Z.m(oziColorScheme2.getTextActionOnLight()), C7807Z.m(oziColorScheme2.getTextDarkKey()), C7807Z.m(oziColorScheme2.getTextExpressOnDark()), C7807Z.m(oziColorScheme2.getTextFreshOnDark()), C7807Z.m(oziColorScheme2.getTextLightKey()), C7807Z.m(oziColorScheme2.getTextMarketingOnDark()), C7807Z.m(oziColorScheme2.getTextMarketingOnLight()), C7807Z.m(oziColorScheme2.getTextNegativeOnDark()), C7807Z.m(oziColorScheme2.getTextPositiveOnDark()), C7807Z.m(oziColorScheme2.getTextPositiveOnLight()), C7807Z.m(oziColorScheme2.getTextPrimaryOnDark()), C7807Z.m(oziColorScheme2.getTextPrimaryOnLight()), C7807Z.m(oziColorScheme2.getTextSecondaryOnDark()), C7807Z.m(oziColorScheme2.getTextSecondaryOnLight()), C7807Z.m(oziColorScheme2.getTextTertiaryOnDark()), C7807Z.m(oziColorScheme2.getTextTertiaryOnLight()), C7807Z.m(oziColorScheme2.getTextWarningOnDark()), C7807Z.m(oziColorScheme2.getBgAccentPrimary()), C7807Z.m(oziColorScheme2.getBgAccentPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgOpaqueAccentSecondary()), C7807Z.m(oziColorScheme2.getBgAccentSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActionPrimary()), C7807Z.m(oziColorScheme2.getBgActionPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActionSecondarySolid()), C7807Z.m(oziColorScheme2.getBgActionSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveAccentPrimary()), C7807Z.m(oziColorScheme2.getBgActiveAccentPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveAccentSecondary()), C7807Z.m(oziColorScheme2.getBgActiveAccentSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveActionPrimary()), C7807Z.m(oziColorScheme2.getBgActiveActionPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveActionSecondary()), C7807Z.m(oziColorScheme2.getBgActiveActionSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveApparelPrimary()), C7807Z.m(oziColorScheme2.getBgActiveApparelPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveApparelSecondary()), C7807Z.m(oziColorScheme2.getBgActiveApparelSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveAquaPrimary()), C7807Z.m(oziColorScheme2.getBgActiveBestpricePrimary()), C7807Z.m(oziColorScheme2.getBgActiveBestpricePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveBestpriceSecondary()), C7807Z.m(oziColorScheme2.getBgActiveBestpriceSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveEconomPrimary()), C7807Z.m(oziColorScheme2.getBgActiveEconomSecondary()), C7807Z.m(oziColorScheme2.getBgActiveExpressPrimary()), C7807Z.m(oziColorScheme2.getBgActiveExpressPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveExpressSecondary()), C7807Z.m(oziColorScheme2.getBgActiveExpressSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveFreshPrimary()), C7807Z.m(oziColorScheme2.getBgActiveFreshPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveFreshSecondary()), C7807Z.m(oziColorScheme2.getBgActiveFreshSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveMarketingPrimary()), C7807Z.m(oziColorScheme2.getBgActiveMarketingPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveMarketingSecondary()), C7807Z.m(oziColorScheme2.getBgActiveMarketingSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveNegativePrimary()), C7807Z.m(oziColorScheme2.getBgActiveNegativePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveNegativeSecondary()), C7807Z.m(oziColorScheme2.getBgActiveNegativeSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveOzonPrimary()), C7807Z.m(oziColorScheme2.getBgActiveOzonSecondary()), C7807Z.m(oziColorScheme2.getBgActivePositivePrimary()), C7807Z.m(oziColorScheme2.getBgActivePositivePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActivePositiveSecondary()), C7807Z.m(oziColorScheme2.getBgActivePositiveSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActivePremiumPrimary()), C7807Z.m(oziColorScheme2.getBgActivePremiumPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActivePremiumSecondary()), C7807Z.m(oziColorScheme2.getBgActivePremiumSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActivePrimary()), C7807Z.m(oziColorScheme2.getBgActivePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveSecondary()), C7807Z.m(oziColorScheme2.getBgActiveSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveSelect()), C7807Z.m(oziColorScheme2.getBgActiveSelectInverted()), C7807Z.m(oziColorScheme2.getBgActiveWarningPrimary()), C7807Z.m(oziColorScheme2.getBgActiveWarningPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgActiveWarningSecondary()), C7807Z.m(oziColorScheme2.getBgActiveWarningSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgApparelPiggy()), C7807Z.m(oziColorScheme2.getBgApparelPrimary()), C7807Z.m(oziColorScheme2.getBgApparelPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgApparelSecondary()), C7807Z.m(oziColorScheme2.getBgApparelSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgAquaPrimary()), C7807Z.m(oziColorScheme2.getBgAttentionPrimary()), C7807Z.m(oziColorScheme2.getBgBestpricePrimary()), C7807Z.m(oziColorScheme2.getBgBestpricePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgBestpriceSecondary()), C7807Z.m(oziColorScheme2.getBgBestpriceSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgControl()), C7807Z.m(oziColorScheme2.getBgControlInverted()), C7807Z.m(oziColorScheme2.getBgDarkCerulean()), C7807Z.m(oziColorScheme2.getBgDoubtfullPrimary()), C7807Z.m(oziColorScheme2.getBgEconomPrimary()), C7807Z.m(oziColorScheme2.getBgEconomSecondary()), C7807Z.m(oziColorScheme2.getBgExpressPrimary()), C7807Z.m(oziColorScheme2.getBgExpressPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgExpressSecondary()), C7807Z.m(oziColorScheme2.getBgExpressSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgFreshPrimary()), C7807Z.m(oziColorScheme2.getBgFreshPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgFreshSecondary()), C7807Z.m(oziColorScheme2.getBgFreshSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgGuaranteePrimary()), C7807Z.m(oziColorScheme2.getBgInstalmentPrimary()), C7807Z.m(oziColorScheme2.getBgInstalmentSecondary()), C7807Z.m(oziColorScheme2.getBgMarketingPrimary()), C7807Z.m(oziColorScheme2.getBgMarketingPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgMarketingSecondary()), C7807Z.m(oziColorScheme2.getBgMarketingSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgMarketingSecondarySolid()), C7807Z.m(oziColorScheme2.getBgNegativePrimary()), C7807Z.m(oziColorScheme2.getBgNegativePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgOpaqueNegativeSecondary()), C7807Z.m(oziColorScheme2.getBgNegativeSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgOpaqueActionSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueApparelSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueEconomSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueFreshSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueMarketingSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueOzonSecondary()), C7807Z.m(oziColorScheme2.getBgOpaquePositiveSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueSecondary()), C7807Z.m(oziColorScheme2.getBgOpaqueWarningSecondary()), C7807Z.m(oziColorScheme2.getBgOverlap()), C7807Z.m(oziColorScheme2.getBgOverlapInverted()), C7807Z.m(oziColorScheme2.getBgOxford()), C7807Z.m(oziColorScheme2.getBgOzonPrimary()), C7807Z.m(oziColorScheme2.getBgOzonSecondary()), C7807Z.m(oziColorScheme2.getBgPositivePrimary()), C7807Z.m(oziColorScheme2.getBgPositivePrimaryInverted()), C7807Z.m(oziColorScheme2.getBgPositiveSecondary()), C7807Z.m(oziColorScheme2.getBgPositiveSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgPremiumPrimary()), C7807Z.m(oziColorScheme2.getBgPremiumPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgPremiumSecondary()), C7807Z.m(oziColorScheme2.getBgPremiumSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgPrimary()), C7807Z.m(oziColorScheme2.getBgPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgPrussian()), C7807Z.m(oziColorScheme2.getBgSbp()), C7807Z.m(oziColorScheme2.getBgSecondary()), C7807Z.m(oziColorScheme2.getBgSecondaryDynamic()), C7807Z.m(oziColorScheme2.getBgSecondaryDynamicInverted()), C7807Z.m(oziColorScheme2.getBgSecondaryInverted()), C7807Z.m(oziColorScheme2.getBgSelect()), C7807Z.m(oziColorScheme2.getBgSelectInverted()), C7807Z.m(oziColorScheme2.getBgTabbarPrimary()), C7807Z.m(oziColorScheme2.getBgTech()), C7807Z.m(oziColorScheme2.getBgUltraPrimary()), C7807Z.m(oziColorScheme2.getBgWarningPrimary()), C7807Z.m(oziColorScheme2.getBgWarningPrimaryInverted()), C7807Z.m(oziColorScheme2.getBgWarningSecondaryInverted()), C7807Z.m(oziColorScheme2.getGraphicAccentPrimary()), C7807Z.m(oziColorScheme2.getGraphicAccentPrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicActionPrimary()), C7807Z.m(oziColorScheme2.getGraphicActionPrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveAccentPrimary()), C7807Z.m(oziColorScheme2.getGraphicActiveAccentPrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveActionPrimary()), C7807Z.m(oziColorScheme2.getGraphicActiveActionPrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveApparel()), C7807Z.m(oziColorScheme2.getGraphicActiveApparelInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveBestprice()), C7807Z.m(oziColorScheme2.getGraphicActiveBestpriceInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveEconom()), C7807Z.m(oziColorScheme2.getGraphicActiveExpress()), C7807Z.m(oziColorScheme2.getGraphicActiveExpressInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveFresh()), C7807Z.m(oziColorScheme2.getGraphicActiveFreshInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveMarketing()), C7807Z.m(oziColorScheme2.getGraphicActiveMarketingInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveNegativePrimary()), C7807Z.m(oziColorScheme2.getGraphicActiveNegativePrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveOzon()), C7807Z.m(oziColorScheme2.getGraphicActivePositivePrimary()), C7807Z.m(oziColorScheme2.getGraphicActivePositivePrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicActivePremium()), C7807Z.m(oziColorScheme2.getGraphicActivePremiumBlue()), C7807Z.m(oziColorScheme2.getGraphicActivePremiumInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveRating()), C7807Z.m(oziColorScheme2.getGraphicActiveRatingInverted()), C7807Z.m(oziColorScheme2.getGraphicActiveWarningPrimary()), C7807Z.m(oziColorScheme2.getGraphicActiveWarningPrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicApparel()), C7807Z.m(oziColorScheme2.getGraphicApparelInverted()), C7807Z.m(oziColorScheme2.getGraphicBestprice()), C7807Z.m(oziColorScheme2.getGraphicBestpriceInverted()), C7807Z.m(oziColorScheme2.getGraphicDisabled()), C7807Z.m(oziColorScheme2.getGraphicDisabledInverted()), C7807Z.m(oziColorScheme2.getGraphicEconom()), C7807Z.m(oziColorScheme2.getGraphicExpress()), C7807Z.m(oziColorScheme2.getGraphicExpressInverted()), C7807Z.m(oziColorScheme2.getGraphicFintechGracePrimary()), C7807Z.m(oziColorScheme2.getGraphicFintechGraceSecondary()), C7807Z.m(oziColorScheme2.getGraphicFresh()), C7807Z.m(oziColorScheme2.getGraphicFreshInverted()), C7807Z.m(oziColorScheme2.getGraphicGuarantee()), C7807Z.m(oziColorScheme2.getGraphicKey()), C7807Z.m(oziColorScheme2.getGraphicKeyInverted()), C7807Z.m(oziColorScheme2.getGraphicMarketing()), C7807Z.m(oziColorScheme2.getGraphicMarketingInverted()), C7807Z.m(oziColorScheme2.getGraphicNegativePrimary()), C7807Z.m(oziColorScheme2.getGraphicNegativePrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicNeutral()), C7807Z.m(oziColorScheme2.getGraphicNeutralInverted()), C7807Z.m(oziColorScheme2.getGraphicOxford()), C7807Z.m(oziColorScheme2.getGraphicOzon()), C7807Z.m(oziColorScheme2.getGraphicPositivePrimary()), C7807Z.m(oziColorScheme2.getGraphicPositivePrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicPositiveSecondary()), C7807Z.m(oziColorScheme2.getGraphicPremium()), C7807Z.m(oziColorScheme2.getGraphicPremiumBlue()), C7807Z.m(oziColorScheme2.getGraphicPremiumInverted()), C7807Z.m(oziColorScheme2.getGraphicPrimary()), C7807Z.m(oziColorScheme2.getGraphicPrimaryDynamic()), C7807Z.m(oziColorScheme2.getGraphicPrimaryDynamicInverted()), C7807Z.m(oziColorScheme2.getGraphicPrimaryInverted()), C7807Z.m(oziColorScheme2.getGraphicQuaternary()), C7807Z.m(oziColorScheme2.getGraphicRating()), C7807Z.m(oziColorScheme2.getGraphicRatingInverted()), C7807Z.m(oziColorScheme2.getGraphicSecondary()), C7807Z.m(oziColorScheme2.getGraphicSecondaryDynamic()), C7807Z.m(oziColorScheme2.getGraphicSecondaryDynamicInverted()), C7807Z.m(oziColorScheme2.getGraphicSecondaryInverted()), C7807Z.m(oziColorScheme2.getGraphicStrokeSticky()), C7807Z.m(oziColorScheme2.getGraphicTabbarIconPrimary()), C7807Z.m(oziColorScheme2.getGraphicTabbarIconSecondary()), C7807Z.m(oziColorScheme2.getGraphicTech()), C7807Z.m(oziColorScheme2.getGraphicTertiary()), C7807Z.m(oziColorScheme2.getGraphicTertiaryDynamic()), C7807Z.m(oziColorScheme2.getGraphicTertiaryInverted()), C7807Z.m(oziColorScheme2.getGraphicUltraPrimary()), C7807Z.m(oziColorScheme2.getGraphicWarningPrimary()), C7807Z.m(oziColorScheme2.getGraphicWarningPrimaryInverted()), C7807Z.m(oziColorScheme2.getLayerActiveFloor0()), C7807Z.m(oziColorScheme2.getLayerActiveFloor1()), C7807Z.m(oziColorScheme2.getLayerActiveFloor1Inverted()), C7807Z.m(oziColorScheme2.getLayerActiveFloor2()), C7807Z.m(oziColorScheme2.getLayerActiveFloor2Inverted()), C7807Z.m(oziColorScheme2.getLayerActiveFloor3()), C7807Z.m(oziColorScheme2.getLayerActiveFloor3Inverted()), C7807Z.m(oziColorScheme2.getLayerActiveSurface()), C7807Z.m(oziColorScheme2.getLayerActiveSurfaceInverted()), C7807Z.m(oziColorScheme2.getLayerFloor0()), C7807Z.m(oziColorScheme2.getLayerFloor0Inverted()), C7807Z.m(oziColorScheme2.getLayerFloor1()), C7807Z.m(oziColorScheme2.getLayerFloor1Inverted()), C7807Z.m(oziColorScheme2.getLayerFloor2()), C7807Z.m(oziColorScheme2.getLayerFloor2Inverted()), C7807Z.m(oziColorScheme2.getLayerFloor3()), C7807Z.m(oziColorScheme2.getLayerFloor3Inverted()), C7807Z.m(oziColorScheme2.getLayerOverlayDimming()), C7807Z.m(oziColorScheme2.getLayerOverlayDimmingInverted()), C7807Z.m(oziColorScheme2.getLayerOverlayParanja()), C7807Z.m(oziColorScheme2.getLayerOverlayParanjaInverted()), C7807Z.m(oziColorScheme2.getLayerSurface()), C7807Z.m(oziColorScheme2.getLayerSurfaceInverted()), C7807Z.m(oziColorScheme2.getTextAccent()), C7807Z.m(oziColorScheme2.getTextAccentInverted()), C7807Z.m(oziColorScheme2.getTextAction()), C7807Z.m(oziColorScheme2.getTextActionInverted()), C7807Z.m(oziColorScheme2.getTextActiveAccent()), C7807Z.m(oziColorScheme2.getTextActiveAccentInverted()), C7807Z.m(oziColorScheme2.getTextActiveAction()), C7807Z.m(oziColorScheme2.getTextActiveActionInverted()), C7807Z.m(oziColorScheme2.getTextActiveApparel()), C7807Z.m(oziColorScheme2.getTextActiveApparelInverted()), C7807Z.m(oziColorScheme2.getTextActiveBestprice()), C7807Z.m(oziColorScheme2.getTextActiveBestpriceInverted()), C7807Z.m(oziColorScheme2.getTextActiveExpress()), C7807Z.m(oziColorScheme2.getTextActiveExpressInverted()), C7807Z.m(oziColorScheme2.getTextActiveFresh()), C7807Z.m(oziColorScheme2.getTextActiveFreshInverted()), C7807Z.m(oziColorScheme2.getTextActiveMarketing()), C7807Z.m(oziColorScheme2.getTextActiveMarketingInverted()), C7807Z.m(oziColorScheme2.getTextActiveNegative()), C7807Z.m(oziColorScheme2.getTextActiveNegativeInverted()), C7807Z.m(oziColorScheme2.getTextActiveOzon()), C7807Z.m(oziColorScheme2.getTextActivePositive()), C7807Z.m(oziColorScheme2.getTextActivePositiveInverted()), C7807Z.m(oziColorScheme2.getTextActivePremium()), C7807Z.m(oziColorScheme2.getTextActivePremiumInverted()), C7807Z.m(oziColorScheme2.getTextActiveWarning()), C7807Z.m(oziColorScheme2.getTextActiveWarningInverted()), C7807Z.m(oziColorScheme2.getTextApparel()), C7807Z.m(oziColorScheme2.getTextApparelInverted()), C7807Z.m(oziColorScheme2.getTextBestprice()), C7807Z.m(oziColorScheme2.getTextBestpriceInverted()), C7807Z.m(oziColorScheme2.getTextDiscountUnavialable()), C7807Z.m(oziColorScheme2.getTextEconom()), C7807Z.m(oziColorScheme2.getTextExpress()), C7807Z.m(oziColorScheme2.getTextExpressInverted()), C7807Z.m(oziColorScheme2.getTextFresh()), C7807Z.m(oziColorScheme2.getTextFreshInverted()), C7807Z.m(oziColorScheme2.getTextGuarantee()), C7807Z.m(oziColorScheme2.getTextMarketing()), C7807Z.m(oziColorScheme2.getTextMarketingInverted()), C7807Z.m(oziColorScheme2.getTextNegative()), C7807Z.m(oziColorScheme2.getTextNegativeInverted()), C7807Z.m(oziColorScheme2.getTextOriginalprice()), C7807Z.m(oziColorScheme2.getTextOriginalpriceAvailable()), C7807Z.m(oziColorScheme2.getTextOxford()), C7807Z.m(oziColorScheme2.getTextOzon()), C7807Z.m(oziColorScheme2.getTextPositive()), C7807Z.m(oziColorScheme2.getTextPositiveInverted()), C7807Z.m(oziColorScheme2.getTextPremium()), C7807Z.m(oziColorScheme2.getTextPremiumInverted()), C7807Z.m(oziColorScheme2.getTextPrimary()), C7807Z.m(oziColorScheme2.getTextPrimaryDynamic()), C7807Z.m(oziColorScheme2.getTextPrimaryDynamicInverted()), C7807Z.m(oziColorScheme2.getTextPrimaryInverted()), C7807Z.m(oziColorScheme2.getTextSecondary()), C7807Z.m(oziColorScheme2.getTextSecondaryDynamic()), C7807Z.m(oziColorScheme2.getTextSecondaryDynamicInverted()), C7807Z.m(oziColorScheme2.getTextSecondaryInverted()), C7807Z.m(oziColorScheme2.getTextTech()), C7807Z.m(oziColorScheme2.getTextTertiary()), C7807Z.m(oziColorScheme2.getTextTertiaryInverted()), C7807Z.m(oziColorScheme2.getTextUltra()), C7807Z.m(oziColorScheme2.getTextWarning()), C7807Z.m(oziColorScheme2.getTextWarningInverted()), C7807Z.m(oziColorScheme2.getTextSecondaryTransparent()), C7807Z.m(oziColorScheme2.getTextTertiaryTransparent()), C7807Z.m(oziColorScheme2.getGraphicSecondaryTransparent()), C7807Z.m(oziColorScheme2.getGraphicTertiaryTransparent()), C7807Z.m(oziColorScheme2.getGraphicQuaternaryTransparent()), C7807Z.m(oziColorScheme2.getGraphicNeutralTransparent()), C7807Z.m(oziColorScheme2.getGraphicDisabledTransparent()), C7807Z.m(oziColorScheme2.getBgSecondaryTransparent()), C7807Z.m(oziColorScheme2.getBgActionSecondary()), C7807Z.m(oziColorScheme2.getBgActionSecondaryTransparent()), C7807Z.m(oziColorScheme2.getBgAccentSecondary()), C7807Z.m(oziColorScheme2.getBgAccentSecondaryTransparent()), C7807Z.m(oziColorScheme2.getBgPositiveSecondaryTransparent()), C7807Z.m(oziColorScheme2.getBgWarningSecondary()), C7807Z.m(oziColorScheme2.getBgWarningSecondaryTransparent()), C7807Z.m(oziColorScheme2.getBgNegativeSecondary()), C7807Z.m(oziColorScheme2.getBgNegativeSecondaryTransparent()), C7807Z.m(oziColorScheme2.getLayerSurfaceTransparent()), C7807Z.m(oziColorScheme2.getLayerOverlayDimmingTransparent()), C7807Z.m(oziColorScheme2.getLayerOverlayParanjaTransparent()), C7807Z.m(oziColorScheme2.getInvertedTextPrimary()), C7807Z.m(oziColorScheme2.getInvertedTextSecondaryTransparent()), C7807Z.m(oziColorScheme2.getInvertedTextAction()), C7807Z.m(oziColorScheme2.getInvertedGraphicPrimary()), C7807Z.m(oziColorScheme2.getInvertedGraphicSecondaryTransparent()), C7807Z.m(oziColorScheme2.getInvertedGraphicTertiaryTransparent()), C7807Z.m(oziColorScheme2.getInvertedBgPrimary()), C7807Z.m(oziColorScheme2.getInvertedBgSecondaryTransparent()), C7807Z.m(oziColorScheme2.getInvertedBgActionPrimary()), C7807Z.m(oziColorScheme2.getInvertedLayerFloor2()), C7807Z.m(oziColorScheme2.getExtraTextFresh()), C7807Z.m(oziColorScheme2.getExtraTextExpress()), C7807Z.m(oziColorScheme2.getExtraTextMarketing()), C7807Z.m(oziColorScheme2.getExtraTextPremium()), C7807Z.m(oziColorScheme2.getExtraTextEconom()), C7807Z.m(oziColorScheme2.getExtraGraphicFresh()), C7807Z.m(oziColorScheme2.getExtraGraphicExpress()), C7807Z.m(oziColorScheme2.getExtraGraphicMarketing()), C7807Z.m(oziColorScheme2.getExtraGraphicPremium()), C7807Z.m(oziColorScheme2.getExtraGraphicEconom()), C7807Z.m(oziColorScheme2.getExtraBgFreshPrimary()), C7807Z.m(oziColorScheme2.getExtraBgFreshSecondary()), C7807Z.m(oziColorScheme2.getExtraBgFreshSecondaryTransparent()), C7807Z.m(oziColorScheme2.getExtraBgExpressPrimary()), C7807Z.m(oziColorScheme2.getExtraBgExpressSecondary()), C7807Z.m(oziColorScheme2.getExtraBgExpressSecondaryTransparent()), C7807Z.m(oziColorScheme2.getExtraBgMarketingPrimary()), C7807Z.m(oziColorScheme2.getExtraBgMarketingSecondary()), C7807Z.m(oziColorScheme2.getExtraBgMarketingSecondaryTransparent()), C7807Z.m(oziColorScheme2.getExtraBgPremiumPrimary()), C7807Z.m(oziColorScheme2.getExtraBgPremiumSecondaryTransparent()), C7807Z.m(oziColorScheme2.getExtraBgEconomPrimary()), C7807Z.m(oziColorScheme2.getExtraBgEconomSecondary()), C7807Z.m(oziColorScheme2.getExtraBgEconomSecondaryTransparent()), C7807Z.m(oziColorScheme2.getStaticTextDarkKey()), C7807Z.m(oziColorScheme2.getStaticTextPrimaryOnLight()), C7807Z.m(oziColorScheme2.getStaticTextSecondaryOnLightTransparent()), C7807Z.m(oziColorScheme2.getStaticTextTertiaryOnLightTransparent()), C7807Z.m(oziColorScheme2.getStaticTextActionOnLight()), C7807Z.m(oziColorScheme2.getStaticTextLightKey()), C7807Z.m(oziColorScheme2.getStaticTextPrimaryOnDark()), C7807Z.m(oziColorScheme2.getStaticTextSecondaryOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticTextTertiaryOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticTextActionOnDark()), C7807Z.m(oziColorScheme2.getStaticGraphicDarkKey()), C7807Z.m(oziColorScheme2.getStaticGraphicPrimaryOnLight()), C7807Z.m(oziColorScheme2.getStaticGraphicSecondaryOnLightTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicTertiaryOnLightTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicSolidNeutral()), C7807Z.m(oziColorScheme2.getStaticGraphicActionOnLight()), C7807Z.m(oziColorScheme2.getStaticGraphicDarkerNeutralOnLight()), C7807Z.m(oziColorScheme2.getStaticGraphicNeutralOnLight()), C7807Z.m(oziColorScheme2.getStaticGraphicDisabledOnLight()), C7807Z.m(oziColorScheme2.getStaticGraphicLightKey()), C7807Z.m(oziColorScheme2.getStaticGraphicPrimaryOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicSecondaryOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicTertiaryOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicNeutralOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicDisabledOnDarkTransparent()), C7807Z.m(oziColorScheme2.getStaticGraphicActionOnDark()), C7807Z.m(oziColorScheme2.getStaticBgLightKey()), C7807Z.m(oziColorScheme2.getStaticBgDarkKey()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey800Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey700Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey600Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey500Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey400Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey300Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey200Transparent()), C7807Z.m(oziColorScheme2.getStaticClearDarkKey100Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey800Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey700Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey600Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey500Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey400Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey300Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey200Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey100Transparent()), C7807Z.m(oziColorScheme2.getStaticClearLightKey0Transparent()), C7807Z.m(oziColorScheme2.getStaticDetectorColorMine()), C7807Z.m(oziColorScheme2.getActiveTextPrimary()), C7807Z.m(oziColorScheme2.getActiveTextAction()), C7807Z.m(oziColorScheme2.getActiveGraphicPositivePrimary()), C7807Z.m(oziColorScheme2.getActiveGraphicWarningPrimary()), C7807Z.m(oziColorScheme2.getActiveGraphicNegativePrimary()), C7807Z.m(oziColorScheme2.getActiveBgActionPrimary()), C7807Z.m(oziColorScheme2.getActiveBgActionSecondary()), C7807Z.m(oziColorScheme2.getActiveBgActionSecondaryTransparent()), C7807Z.m(oziColorScheme2.getActiveBgNegativePrimary()), C7807Z.m(oziColorScheme2.getActiveBgNegativeSecondary()), C7807Z.m(oziColorScheme2.getActiveBgNegativeSecondaryTransparent()));
        freshDarkOziColorsMap$delegate = k.b(FreshOziColorSchemeKt$freshDarkOziColorsMap$2.INSTANCE);
    }

    @NotNull
    public static final List<C7807Z> getFreshDarkOziColorList() {
        return freshDarkOziColorList;
    }

    @NotNull
    public static final OziColorScheme getFreshDarkOziColorScheme() {
        return FreshDarkOziColorScheme;
    }

    @NotNull
    public static final List<C7807Z> getFreshLightOziColorList() {
        return freshLightOziColorList;
    }

    @NotNull
    public static final OziColorScheme getFreshLightOziColorScheme() {
        return FreshLightOziColorScheme;
    }
}
