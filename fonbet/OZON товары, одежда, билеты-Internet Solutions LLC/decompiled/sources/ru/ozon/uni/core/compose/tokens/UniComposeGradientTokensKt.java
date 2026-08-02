package ru.ozon.uni.core.compose.tokens;

import S0.InterfaceC3967k;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.graphics.DirectionalLinearGradientKt;
import ru.ozon.uni.core.compose.theme.UniColorScheme;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniGradientDirection;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\",\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lru/ozon/uni/core/models/UniGradientToken;", "Lkotlin/Function0;", "Ll1/Q;", "composeGradientTokenMap", "Ljava/util/Map;", "getComposeGradientTokenMap", "()Ljava/util/Map;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniComposeGradientTokensKt {

    @NotNull
    private static final Map<UniGradientToken, Function2<InterfaceC3967k, Integer, AbstractC7799Q>> composeGradientTokenMap;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        composeGradientTokenMap = U.j(new Pair(uniTheme.getGradients().getGrDelivery(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(483744996);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4278213631L))), new Pair(Float.valueOf(0.25f), C7807Z.m(C7811b0.c(4278213631L))), new Pair(Float.valueOf(0.75f), C7807Z.m(C7811b0.c(4288883131L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4294512981L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrFadeHorizontalFloor1(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1606024195);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(1908772))), new Pair(Float.valueOf(0.6f), C7807Z.m(C7811b0.c(4280098852L)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(16777215))), new Pair(Float.valueOf(0.6f), C7807Z.m(C7811b0.c(4294967295L)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.LeftRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrFavouritePromoBanner(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1566663902);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.53f), C7807Z.m(C7811b0.c(4294939593L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4294958317L)))}, 0, UniGradientDirection.BottomLeftTopRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrFavouritePromoFade(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-444384703);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(3092789))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4281282869L)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(16119802))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4294309882L)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.LeftRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrFresh(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(677894496);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4285790201L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4283016110L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrFreshSkuScroll(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1800173695);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4281282869L))), new Pair(Float.valueOf(0.52f), C7807Z.m(C7811b0.c(2150576437L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(3092789)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294939593L))), new Pair(Float.valueOf(0.52f), C7807Z.m(C7811b0.c(4294939593L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(16749513)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.TopBottom);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrGift(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1372514402);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294796782L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4286211581L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrHighDemandDelivery(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-250235203);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294944768L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4294956352L)))}, 0, UniGradientDirection.LeftRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonExpressPrimary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(872043996);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294950890L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4294762751L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4290428671L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonExpressSecondary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1994323195);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4284299091L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4283972183L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4282992232L)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(2583674858L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(2583486719L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(2579347711L)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonFreshPrimary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-334642791);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4286314474L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4291231734L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4290623743L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonFreshSecondary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(787636408);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4278207303L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4278210383L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4282992232L)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(2575038442L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(2579955702L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(2579347711L)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonInCart(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1909915607);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4290623743L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4290117581L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4291228342L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonOzonPrimary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1262772490);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4287412479L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4292932095L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4290623743L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLikezonOzonSecondary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$15
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-140493291);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4280563030L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(4281287531L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4282992232L)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(2578374143L))), new Pair(Float.valueOf(0.5f), C7807Z.m(C7811b0.c(2581656063L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(2579347711L)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrLowDemandDelivery(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$16
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(981785908);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4278239938L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4279561308L)))}, 0, UniGradientDirection.LeftRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrMarketingPrimary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$17
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(2104065107);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4287267574L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4284174814L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrOverlayLive(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$18
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1068622990);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(16322901))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(1727598933)))}, 0, UniGradientDirection.TopBottom);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrOverlayPrimary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$19
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(53656209);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(0))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(3003121664L)))}, 0, UniGradientDirection.TopBottom);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrOverlayTertiaryReversed(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$20
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1175935408);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(637534208))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(0)))}, 0, UniGradientDirection.TopBottom);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrOzonCard(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$21
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(96274010);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4285618943L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4283601151L)))}, 0, UniGradientDirection.LeftRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrPremium(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$22
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1218553209);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.05f), C7807Z.m(C7811b0.c(4280990971L))), new Pair(Float.valueOf(0.3f), C7807Z.m(C7811b0.c(4279932925L))), new Pair(Float.valueOf(0.85f), C7807Z.m(C7811b0.c(4278213631L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrPremiumPlus(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$23
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1954134888);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294144255L))), new Pair(Float.valueOf(0.6f), C7807Z.m(C7811b0.c(4284570623L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4278213631L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrPremiumPro(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$24
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-831855689);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294950170L))), new Pair(Float.valueOf(0.7f), C7807Z.m(C7811b0.c(4294002611L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4293594367L)))}, 0, UniGradientDirection.BottomLeftTopRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrPremiumProTransparent(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$25
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(290423510);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(1291828506))), new Pair(Float.valueOf(0.7f), C7807Z.m(C7811b0.b(1290880947))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(1290472703)))}, 0, UniGradientDirection.BottomLeftTopRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrSale(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$26
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1412702709);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294811981L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4294790646L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrSberPay(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$27
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1759985388);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4293715477L))), new Pair(Float.valueOf(0.08f), C7807Z.m(C7811b0.c(4289449781L))), new Pair(Float.valueOf(0.25f), C7807Z.m(C7811b0.c(4288072007L))), new Pair(Float.valueOf(0.52f), C7807Z.m(C7811b0.c(4283020957L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4279011786L)))}, 0, UniGradientDirection.LeftRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrSelectFade(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$28
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-637706189);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294309882L))), new Pair(Float.valueOf(0.9f), C7807Z.m(C7811b0.b(16119802)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4278650631L))), new Pair(Float.valueOf(0.9f), C7807Z.m(C7811b0.b(460551)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.TopBottom);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrSelectInstallment(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$29
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(484573010);
                AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                Pair[] pairArr = ((UniColorScheme) interfaceC3967k.m(UniCompositionLocalKt.getLocalUniColorScheme())).getIsDark() ? new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4283124555L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4282268989L)))} : new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294309365L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4292730333L)))};
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrSocialPrimary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$30
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1606852209);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4285385727L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4278212095L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrSocialSecondary(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$31
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(527190811);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294932713L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4293988734L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrStars(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$32
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1649470010);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4278399418L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4278957002L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrStarsProgram(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$33
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-1523218087);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.23f), C7807Z.m(C7811b0.c(4280541597L))), new Pair(Float.valueOf(0.51f), C7807Z.m(C7811b0.c(4283876095L))), new Pair(Float.valueOf(0.74f), C7807Z.m(C7811b0.c(4283866879L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4283857919L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrTile(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$34
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(-400938888);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.22f), C7807Z.m(C7811b0.c(4280518393L))), new Pair(Float.valueOf(0.64f), C7807Z.m(C7811b0.c(4284635121L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4283056334L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrTopTravel(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$35
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(721340311);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.c(4294934584L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4294955384L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }), new Pair(uniTheme.getGradients().getGrTravel(), new Function2<InterfaceC3967k, Integer, AbstractC7799Q>() { // from class: ru.ozon.uni.core.compose.tokens.UniComposeGradientTokensKt$composeGradientTokenMap$36
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(interfaceC3967k, num.intValue());
            }

            public final AbstractC7799Q invoke(InterfaceC3967k interfaceC3967k, int i11) {
                interfaceC3967k.B(1843619510);
                AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.4f), C7807Z.m(C7811b0.c(4281959415L))), new Pair(Float.valueOf(0.8f), C7807Z.m(C7811b0.c(4285808617L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.c(4285808617L)))}, 0, UniGradientDirection.TopLeftBottomRight);
                interfaceC3967k.K();
                return m1957directionalLinearGradientesKoAe4;
            }
        }));
    }

    @NotNull
    public static final Map<UniGradientToken, Function2<InterfaceC3967k, Integer, AbstractC7799Q>> getComposeGradientTokenMap() {
        return composeGradientTokenMap;
    }
}
