package ru.ozon.uni.core.compose.theme;

import Sc.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"2\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lru/ozon/uni/core/models/UniColorToken;", "Lkotlin/Function1;", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "Ll1/Z;", "UniThemeColorAttrsMap", "Ljava/util/Map;", "getUniThemeColorAttrsMap", "()Ljava/util/Map;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniThemeColorAttrsMapKt {

    @NotNull
    private static final Map<UniColorToken, Function1<UniColorScheme, C7807Z>> UniThemeColorAttrsMap;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        UniThemeColorAttrsMap = U.j(w.a(uniTheme.getColorTokens().getDetectorColorMine(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2342invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2342invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getDetectorColorMine();
            }
        }), w.a(uniTheme.getColorTokens().getBgAccentOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2453invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2453invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAccentOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getBgDarkKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2564invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2564invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgDarkKey();
            }
        }), w.a(uniTheme.getColorTokens().getBgLightKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2659invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2659invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgLightKey();
            }
        }), w.a(uniTheme.getColorTokens().getBgMarketingOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2670invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2670invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgMarketingOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getBgPositiveOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2681invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2681invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPositiveOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getBgWarningOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2692invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2692invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgWarningOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey100(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$8
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2703invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2703invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey100();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey200(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$9
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2714invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2714invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey200();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey300(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$10
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2343invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2343invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey300();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey400(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$11
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2354invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2354invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey400();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey500(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$12
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2365invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2365invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey500();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey600(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$13
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2376invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2376invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey600();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey700(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$14
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2387invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2387invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey700();
            }
        }), w.a(uniTheme.getColorTokens().getClearDarkKey800(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$15
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2398invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2398invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearDarkKey800();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey0(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$16
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2409invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2409invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey0();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey100(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$17
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2420invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2420invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey100();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey200(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$18
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2431invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2431invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey200();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey300(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$19
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2442invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2442invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey300();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey400(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$20
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2454invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2454invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey400();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey500(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$21
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2465invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2465invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey500();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey600(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$22
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2476invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2476invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey600();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey700(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$23
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2487invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2487invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey700();
            }
        }), w.a(uniTheme.getColorTokens().getClearLightKey800(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$24
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2498invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2498invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getClearLightKey800();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicAccentOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$25
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2509invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2509invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicAccentOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActionOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$26
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2520invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2520invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActionOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActionOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$27
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2531invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2531invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActionOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicDarkKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$28
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2542invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2542invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicDarkKey();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicDarkerNeutralOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$29
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2553invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2553invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicDarkerNeutralOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicDisabledOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$30
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2565invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2565invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicDisabledOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicDisabledOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$31
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2576invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2576invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicDisabledOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicExpressOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$32
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2587invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2587invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicExpressOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicFreshOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$33
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2598invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2598invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicFreshOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicLightKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$34
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2609invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2609invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicLightKey();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicMarketingOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$35
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2620invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2620invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicMarketingOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicMarketingOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$36
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2631invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2631invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicMarketingOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNegativeOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$37
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2642invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2642invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNegativeOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNeutralOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$38
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2653invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2653invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNeutralOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNeutralOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$39
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2658invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2658invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNeutralOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPositiveOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$40
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2660invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2660invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPositiveOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPositivePrimaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$41
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2661invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2661invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPositivePrimaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPrimaryOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$42
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2662invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2662invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPrimaryOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPrimaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$43
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2663invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2663invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPrimaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSecondaryOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$44
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2664invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2664invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSecondaryOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSecondaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$45
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2665invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2665invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSecondaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSolidNeutral(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$46
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2666invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2666invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSolidNeutral();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTertiaryOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$47
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2667invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2667invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTertiaryOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTertiaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$48
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2668invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2668invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTertiaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicWarningOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$49
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2669invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2669invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicWarningOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicWarningPrimaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$50
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2671invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2671invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicWarningPrimaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor1OnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$51
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2672invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2672invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor1OnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextAccentOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$52
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2673invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2673invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextAccentOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextActionOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$53
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2674invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2674invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActionOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextActionOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$54
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2675invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2675invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActionOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextDarkKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$55
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2676invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2676invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextDarkKey();
            }
        }), w.a(uniTheme.getColorTokens().getTextExpressOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$56
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2677invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2677invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextExpressOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextFreshOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$57
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2678invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2678invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextFreshOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextLightKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$58
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2679invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2679invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextLightKey();
            }
        }), w.a(uniTheme.getColorTokens().getTextMarketingOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$59
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2680invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2680invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextMarketingOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextMarketingOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$60
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2682invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2682invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextMarketingOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextNegativeOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$61
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2683invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2683invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextNegativeOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextPositiveOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$62
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2684invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2684invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPositiveOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextPositiveOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$63
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2685invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2685invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPositiveOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextPrimaryOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$64
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2686invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2686invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPrimaryOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextPrimaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$65
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2687invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2687invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPrimaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextSecondaryOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$66
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2688invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2688invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextSecondaryOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextSecondaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$67
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2689invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2689invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextSecondaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextTertiaryOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$68
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2690invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2690invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextTertiaryOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getTextTertiaryOnLight(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$69
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2691invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2691invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextTertiaryOnLight();
            }
        }), w.a(uniTheme.getColorTokens().getTextWarningOnDark(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$70
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2693invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2693invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextWarningOnDark();
            }
        }), w.a(uniTheme.getColorTokens().getBgAccentPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$71
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2694invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2694invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAccentPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgAccentPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$72
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2695invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2695invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAccentPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgAccentSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$73
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2696invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2696invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAccentSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgAccentSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$74
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2697invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2697invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAccentSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActionPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$75
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2698invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2698invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActionPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActionPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$76
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2699invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2699invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActionPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActionSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$77
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2700invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2700invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActionSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActionSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$78
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2701invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2701invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActionSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActionSecondarySolid(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$79
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2702invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2702invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActionSecondarySolid();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveAccentPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$80
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2704invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2704invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveAccentPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveAccentPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$81
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2705invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2705invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveAccentPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveAccentSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$82
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2706invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2706invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveAccentSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveAccentSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$83
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2707invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2707invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveAccentSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveActionPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$84
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2708invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2708invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveActionPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveActionPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$85
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2709invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2709invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveActionPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveActionSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$86
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2710invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2710invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveActionSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveActionSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$87
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2711invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2711invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveActionSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveApparelPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$88
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2712invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2712invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveApparelPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveApparelPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$89
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2713invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2713invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveApparelPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveApparelSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$90
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2715invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2715invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveApparelSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveApparelSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$91
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2716invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2716invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveApparelSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveAquaPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$92
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2717invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2717invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveAquaPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveBestpricePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$93
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2718invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2718invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveBestpricePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveBestpricePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$94
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2719invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2719invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveBestpricePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveBestpriceSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$95
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2720invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2720invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveBestpriceSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveBestpriceSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$96
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2721invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2721invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveBestpriceSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveEconomPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$97
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2722invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2722invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveEconomPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveEconomSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$98
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2723invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2723invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveEconomSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveExpressPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$99
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2724invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2724invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveExpressPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveExpressPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$100
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2344invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2344invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveExpressPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveExpressSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$101
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2345invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2345invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveExpressSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveExpressSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$102
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2346invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2346invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveExpressSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveFreshPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$103
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2347invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2347invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveFreshPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveFreshPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$104
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2348invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2348invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveFreshPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveFreshSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$105
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2349invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2349invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveFreshSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveFreshSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$106
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2350invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2350invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveFreshSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveMarketingPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$107
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2351invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2351invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveMarketingPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveMarketingPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$108
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2352invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2352invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveMarketingPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveMarketingSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$109
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2353invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2353invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveMarketingSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveMarketingSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$110
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2355invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2355invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveMarketingSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveNegativePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$111
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2356invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2356invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveNegativePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveNegativePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$112
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2357invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2357invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveNegativePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveNegativeSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$113
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2358invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2358invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveNegativeSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveNegativeSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$114
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2359invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2359invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveNegativeSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveOzonPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$115
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2360invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2360invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveOzonPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveOzonSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$116
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2361invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2361invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveOzonSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePositivePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$117
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2362invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2362invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePositivePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePositivePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$118
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2363invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2363invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePositivePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePositiveSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$119
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2364invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2364invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePositiveSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePositiveSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$120
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2366invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2366invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePositiveSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePremiumPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$121
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2367invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2367invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePremiumPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePremiumPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$122
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2368invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2368invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePremiumPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePremiumSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$123
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2369invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2369invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePremiumSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePremiumSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$124
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2370invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2370invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePremiumSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$125
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2371invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2371invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActivePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$126
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2372invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2372invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActivePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$127
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2373invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2373invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$128
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2374invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2374invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveSelect(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$129
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2375invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2375invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveSelect();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveSelectInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$130
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2377invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2377invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveSelectInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveWarningPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$131
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2378invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2378invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveWarningPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveWarningPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$132
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2379invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2379invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveWarningPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveWarningSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$133
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2380invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2380invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveWarningSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgActiveWarningSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$134
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2381invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2381invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgActiveWarningSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgApparelPiggy(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$135
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2382invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2382invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgApparelPiggy();
            }
        }), w.a(uniTheme.getColorTokens().getBgApparelPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$136
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2383invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2383invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgApparelPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgApparelPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$137
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2384invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2384invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgApparelPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgApparelSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$138
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2385invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2385invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgApparelSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgApparelSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$139
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2386invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2386invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgApparelSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgAquaPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$140
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2388invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2388invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAquaPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgAttentionPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$141
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2389invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2389invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgAttentionPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgBestpricePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$142
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2390invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2390invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgBestpricePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgBestpricePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$143
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2391invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2391invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgBestpricePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgBestpriceSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$144
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2392invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2392invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgBestpriceSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgBestpriceSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$145
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2393invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2393invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgBestpriceSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgControl(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$146
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2394invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2394invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgControl();
            }
        }), w.a(uniTheme.getColorTokens().getBgControlInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$147
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2395invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2395invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgControlInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgDarkCerulean(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$148
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2396invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2396invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgDarkCerulean();
            }
        }), w.a(uniTheme.getColorTokens().getBgDoubtfullPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$149
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2397invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2397invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgDoubtfullPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgEconomPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$150
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2399invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2399invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgEconomPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgEconomSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$151
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2400invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2400invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgEconomSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgExpressPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$152
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2401invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2401invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgExpressPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgExpressPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$153
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2402invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2402invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgExpressPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgExpressSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$154
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2403invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2403invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgExpressSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgExpressSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$155
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2404invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2404invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgExpressSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgFreshPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$156
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2405invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2405invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgFreshPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgFreshPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$157
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2406invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2406invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgFreshPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgFreshSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$158
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2407invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2407invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgFreshSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgFreshSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$159
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2408invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2408invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgFreshSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgGuaranteePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$160
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2410invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2410invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgGuaranteePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgInstalmentPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$161
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2411invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2411invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgInstalmentPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgInstalmentSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$162
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2412invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2412invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgInstalmentSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgMarketingPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$163
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2413invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2413invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgMarketingPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgMarketingPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$164
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2414invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2414invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgMarketingPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgMarketingSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$165
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2415invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2415invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgMarketingSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgMarketingSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$166
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2416invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2416invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgMarketingSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgMarketingSecondarySolid(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$167
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2417invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2417invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgMarketingSecondarySolid();
            }
        }), w.a(uniTheme.getColorTokens().getBgNegativePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$168
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2418invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2418invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgNegativePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgNegativePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$169
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2419invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2419invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgNegativePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgNegativeSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$170
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2421invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2421invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgNegativeSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgNegativeSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$171
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2422invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2422invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgNegativeSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueAccentSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$172
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2423invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2423invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueAccentSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueActionSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$173
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2424invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2424invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueActionSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueApparelSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$174
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2425invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2425invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueApparelSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueEconomSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$175
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2426invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2426invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueEconomSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueFreshSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$176
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2427invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2427invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueFreshSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueMarketingSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$177
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2428invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2428invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueMarketingSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueNegativeSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$178
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2429invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2429invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueNegativeSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueOzonSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$179
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2430invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2430invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueOzonSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaquePositiveSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$180
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2432invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2432invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaquePositiveSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$181
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2433invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2433invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOpaqueWarningSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$182
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2434invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2434invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOpaqueWarningSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOverlap(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$183
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2435invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2435invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOverlap();
            }
        }), w.a(uniTheme.getColorTokens().getBgOverlapInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$184
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2436invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2436invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOverlapInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgOxford(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$185
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2437invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2437invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOxford();
            }
        }), w.a(uniTheme.getColorTokens().getBgOzonPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$186
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2438invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2438invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOzonPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgOzonSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$187
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2439invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2439invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgOzonSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgPositivePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$188
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2440invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2440invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPositivePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgPositivePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$189
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2441invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2441invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPositivePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgPositiveSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$190
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2443invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2443invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPositiveSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgPositiveSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$191
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2444invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2444invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPositiveSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgPremiumPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$192
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2445invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2445invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPremiumPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgPremiumPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$193
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2446invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2446invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPremiumPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgPremiumSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$194
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2447invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2447invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPremiumSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgPremiumSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$195
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2448invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2448invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPremiumSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$196
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2449invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2449invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$197
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2450invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2450invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgPrussian(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$198
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2451invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2451invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgPrussian();
            }
        }), w.a(uniTheme.getColorTokens().getBgSbp(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$199
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2452invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2452invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSbp();
            }
        }), w.a(uniTheme.getColorTokens().getBgSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$200
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2455invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2455invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgSecondaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$201
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2456invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2456invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSecondaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getBgSecondaryDynamicInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$202
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2457invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2457invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSecondaryDynamicInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$203
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2458invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2458invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgSelect(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$204
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2459invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2459invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSelect();
            }
        }), w.a(uniTheme.getColorTokens().getBgSelectInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$205
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2460invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2460invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgSelectInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgTabbarPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$206
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2461invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2461invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgTabbarPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgTech(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$207
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2462invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2462invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgTech();
            }
        }), w.a(uniTheme.getColorTokens().getBgUltraPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$208
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2463invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2463invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgUltraPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgWarningPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$209
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2464invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2464invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgWarningPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getBgWarningPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$210
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2466invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2466invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgWarningPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getBgWarningSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$211
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2467invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2467invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgWarningSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getBgWarningSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$212
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2468invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2468invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getBgWarningSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicAccentPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$213
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2469invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2469invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicAccentPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicAccentPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$214
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2470invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2470invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicAccentPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActionPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$215
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2471invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2471invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActionPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActionPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$216
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2472invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2472invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActionPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveAccentPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$217
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2473invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2473invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveAccentPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveAccentPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$218
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2474invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2474invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveAccentPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveActionPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$219
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2475invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2475invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveActionPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveActionPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$220
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2477invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2477invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveActionPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveApparel(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$221
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2478invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2478invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveApparel();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveApparelInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$222
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2479invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2479invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveApparelInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveBestprice(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$223
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2480invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2480invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveBestprice();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveBestpriceInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$224
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2481invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2481invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveBestpriceInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveEconom(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$225
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2482invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2482invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveEconom();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveExpress(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$226
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2483invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2483invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveExpress();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveExpressInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$227
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2484invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2484invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveExpressInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveFresh(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$228
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2485invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2485invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveFresh();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveFreshInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$229
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2486invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2486invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveFreshInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveMarketing(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$230
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2488invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2488invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveMarketing();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveMarketingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$231
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2489invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2489invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveMarketingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveNegativePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$232
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2490invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2490invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveNegativePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveNegativePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$233
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2491invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2491invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveNegativePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveOzon(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$234
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2492invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2492invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveOzon();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActivePositivePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$235
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2493invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2493invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActivePositivePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActivePositivePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$236
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2494invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2494invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActivePositivePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActivePremium(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$237
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2495invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2495invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActivePremium();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActivePremiumBlue(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$238
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2496invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2496invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActivePremiumBlue();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActivePremiumInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$239
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2497invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2497invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActivePremiumInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveRating(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$240
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2499invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2499invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveRating();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveRatingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$241
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2500invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2500invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveRatingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveWarningPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$242
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2501invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2501invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveWarningPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicActiveWarningPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$243
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2502invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2502invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicActiveWarningPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicApparel(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$244
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2503invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2503invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicApparel();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicApparelInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$245
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2504invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2504invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicApparelInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicBestprice(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$246
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2505invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2505invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicBestprice();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicBestpriceInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$247
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2506invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2506invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicBestpriceInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicDisabled(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$248
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2507invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2507invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicDisabled();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicDisabledInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$249
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2508invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2508invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicDisabledInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicEconom(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$250
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2510invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2510invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicEconom();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicExpress(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$251
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2511invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2511invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicExpress();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicExpressInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$252
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2512invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2512invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicExpressInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicFintechGracePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$253
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2513invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2513invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicFintechGracePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicFintechGraceSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$254
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2514invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2514invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicFintechGraceSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicFresh(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$255
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2515invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2515invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicFresh();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicFreshInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$256
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2516invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2516invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicFreshInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicGuarantee(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$257
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2517invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2517invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicGuarantee();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicKey(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$258
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2518invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2518invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicKey();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicKeyInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$259
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2519invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2519invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicKeyInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicMarketing(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$260
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2521invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2521invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicMarketing();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicMarketingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$261
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2522invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2522invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicMarketingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNegativePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$262
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2523invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2523invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNegativePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNegativePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$263
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2524invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2524invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNegativePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNeutral(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$264
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2525invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2525invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNeutral();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicNeutralInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$265
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2526invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2526invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicNeutralInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicOverlapPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$266
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2527invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2527invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicOverlapPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicOverlapPrimaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$267
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2528invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2528invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicOverlapPrimaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicOxford(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$268
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2529invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2529invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicOxford();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicOzon(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$269
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2530invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2530invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicOzon();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPositivePrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$270
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2532invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2532invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPositivePrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPositivePrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$271
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2533invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2533invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPositivePrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPositiveSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$272
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2534invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2534invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPositiveSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPremium(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$273
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2535invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2535invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPremium();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPremiumBlue(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$274
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2536invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2536invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPremiumBlue();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPremiumInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$275
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2537invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2537invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPremiumInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$276
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2538invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2538invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPrimaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$277
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2539invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2539invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPrimaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPrimaryDynamicInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$278
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2540invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2540invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPrimaryDynamicInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$279
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2541invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2541invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicQuaternary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$280
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2543invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2543invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicQuaternary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicRating(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$281
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2544invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2544invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicRating();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicRatingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$282
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2545invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2545invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicRatingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$283
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2546invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2546invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSecondaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$284
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2547invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2547invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSecondaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSecondaryDynamicInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$285
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2548invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2548invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSecondaryDynamicInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$286
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2549invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2549invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicStrokeSticky(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$287
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2550invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2550invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicStrokeSticky();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTabbarIconPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$288
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2551invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2551invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTabbarIconPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTabbarIconSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$289
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2552invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2552invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTabbarIconSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTech(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$290
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2554invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2554invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTech();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTertiary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$291
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2555invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2555invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTertiary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTertiaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$292
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2556invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2556invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTertiaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicTertiaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$293
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2557invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2557invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicTertiaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicUltraPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$294
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2558invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2558invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicUltraPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicWarningPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$295
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2559invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2559invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicWarningPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getGraphicWarningPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$296
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2560invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2560invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getGraphicWarningPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor0(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$297
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2561invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2561invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor0();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor1(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$298
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2562invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2562invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor1();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor1Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$299
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2563invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2563invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor1Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor2(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$300
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2566invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2566invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor2();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor2Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$301
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2567invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2567invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor2Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor3(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$302
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2568invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2568invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor3();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveFloor3Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$303
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2569invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2569invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveFloor3Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveSurface(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$304
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2570invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2570invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveSurface();
            }
        }), w.a(uniTheme.getColorTokens().getLayerActiveSurfaceInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$305
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2571invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2571invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerActiveSurfaceInverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor0(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$306
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2572invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2572invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor0();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor0Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$307
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2573invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2573invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor0Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor1(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$308
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2574invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2574invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor1();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor1Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$309
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2575invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2575invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor1Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor2(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$310
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2577invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2577invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor2();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor2Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$311
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2578invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2578invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor2Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor3(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$312
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2579invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2579invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor3();
            }
        }), w.a(uniTheme.getColorTokens().getLayerFloor3Inverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$313
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2580invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2580invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerFloor3Inverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerOverlayDimming(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$314
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2581invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2581invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerOverlayDimming();
            }
        }), w.a(uniTheme.getColorTokens().getLayerOverlayDimmingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$315
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2582invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2582invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerOverlayDimmingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerOverlayParanja(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$316
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2583invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2583invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerOverlayParanja();
            }
        }), w.a(uniTheme.getColorTokens().getLayerOverlayParanjaInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$317
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2584invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2584invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerOverlayParanjaInverted();
            }
        }), w.a(uniTheme.getColorTokens().getLayerSurface(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$318
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2585invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2585invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerSurface();
            }
        }), w.a(uniTheme.getColorTokens().getLayerSurfaceInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$319
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2586invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2586invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getLayerSurfaceInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextAccent(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$320
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2588invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2588invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextAccent();
            }
        }), w.a(uniTheme.getColorTokens().getTextAccentInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$321
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2589invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2589invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextAccentInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextAction(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$322
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2590invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2590invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextAction();
            }
        }), w.a(uniTheme.getColorTokens().getTextActionInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$323
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2591invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2591invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActionInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveAccent(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$324
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2592invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2592invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveAccent();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveAccentInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$325
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2593invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2593invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveAccentInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveAction(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$326
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2594invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2594invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveAction();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveActionInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$327
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2595invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2595invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveActionInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveApparel(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$328
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2596invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2596invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveApparel();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveApparelInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$329
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2597invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2597invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveApparelInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveBestprice(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$330
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2599invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2599invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveBestprice();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveBestpriceInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$331
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2600invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2600invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveBestpriceInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveExpress(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$332
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2601invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2601invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveExpress();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveExpressInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$333
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2602invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2602invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveExpressInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveFresh(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$334
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2603invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2603invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveFresh();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveFreshInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$335
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2604invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2604invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveFreshInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveMarketing(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$336
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2605invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2605invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveMarketing();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveMarketingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$337
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2606invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2606invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveMarketingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveNegative(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$338
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2607invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2607invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveNegative();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveNegativeInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$339
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2608invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2608invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveNegativeInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveOzon(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$340
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2610invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2610invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveOzon();
            }
        }), w.a(uniTheme.getColorTokens().getTextActivePositive(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$341
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2611invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2611invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActivePositive();
            }
        }), w.a(uniTheme.getColorTokens().getTextActivePositiveInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$342
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2612invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2612invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActivePositiveInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActivePremium(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$343
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2613invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2613invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActivePremium();
            }
        }), w.a(uniTheme.getColorTokens().getTextActivePremiumInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$344
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2614invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2614invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActivePremiumInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveWarning(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$345
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2615invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2615invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveWarning();
            }
        }), w.a(uniTheme.getColorTokens().getTextActiveWarningInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$346
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2616invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2616invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextActiveWarningInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextApparel(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$347
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2617invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2617invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextApparel();
            }
        }), w.a(uniTheme.getColorTokens().getTextApparelInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$348
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2618invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2618invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextApparelInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextBestprice(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$349
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2619invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2619invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextBestprice();
            }
        }), w.a(uniTheme.getColorTokens().getTextBestpriceInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$350
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2621invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2621invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextBestpriceInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextDiscountUnavialable(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$351
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2622invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2622invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextDiscountUnavialable();
            }
        }), w.a(uniTheme.getColorTokens().getTextEconom(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$352
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2623invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2623invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextEconom();
            }
        }), w.a(uniTheme.getColorTokens().getTextExpress(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$353
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2624invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2624invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextExpress();
            }
        }), w.a(uniTheme.getColorTokens().getTextExpressInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$354
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2625invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2625invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextExpressInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextFresh(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$355
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2626invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2626invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextFresh();
            }
        }), w.a(uniTheme.getColorTokens().getTextFreshInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$356
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2627invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2627invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextFreshInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextGuarantee(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$357
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2628invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2628invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextGuarantee();
            }
        }), w.a(uniTheme.getColorTokens().getTextMarketing(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$358
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2629invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2629invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextMarketing();
            }
        }), w.a(uniTheme.getColorTokens().getTextMarketingInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$359
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2630invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2630invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextMarketingInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextNegative(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$360
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2632invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2632invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextNegative();
            }
        }), w.a(uniTheme.getColorTokens().getTextNegativeInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$361
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2633invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2633invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextNegativeInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextOriginalprice(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$362
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2634invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2634invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextOriginalprice();
            }
        }), w.a(uniTheme.getColorTokens().getTextOriginalpriceAvailable(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$363
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2635invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2635invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextOriginalpriceAvailable();
            }
        }), w.a(uniTheme.getColorTokens().getTextOxford(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$364
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2636invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2636invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextOxford();
            }
        }), w.a(uniTheme.getColorTokens().getTextOzon(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$365
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2637invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2637invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextOzon();
            }
        }), w.a(uniTheme.getColorTokens().getTextPositive(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$366
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2638invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2638invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPositive();
            }
        }), w.a(uniTheme.getColorTokens().getTextPositiveInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$367
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2639invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2639invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPositiveInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextPremium(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$368
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2640invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2640invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPremium();
            }
        }), w.a(uniTheme.getColorTokens().getTextPremiumInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$369
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2641invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2641invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPremiumInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextPrimary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$370
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2643invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2643invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPrimary();
            }
        }), w.a(uniTheme.getColorTokens().getTextPrimaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$371
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2644invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2644invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPrimaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getTextPrimaryDynamicInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$372
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2645invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2645invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPrimaryDynamicInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextPrimaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$373
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2646invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2646invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextPrimaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextSecondary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$374
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2647invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2647invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextSecondary();
            }
        }), w.a(uniTheme.getColorTokens().getTextSecondaryDynamic(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$375
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2648invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2648invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextSecondaryDynamic();
            }
        }), w.a(uniTheme.getColorTokens().getTextSecondaryDynamicInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$376
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2649invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2649invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextSecondaryDynamicInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextSecondaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$377
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2650invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2650invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextSecondaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextTech(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$378
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2651invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2651invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextTech();
            }
        }), w.a(uniTheme.getColorTokens().getTextTertiary(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$379
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2652invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2652invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextTertiary();
            }
        }), w.a(uniTheme.getColorTokens().getTextTertiaryInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$380
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2654invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2654invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextTertiaryInverted();
            }
        }), w.a(uniTheme.getColorTokens().getTextUltra(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$381
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2655invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2655invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextUltra();
            }
        }), w.a(uniTheme.getColorTokens().getTextWarning(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$382
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2656invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2656invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextWarning();
            }
        }), w.a(uniTheme.getColorTokens().getTextWarningInverted(), new Function1<UniColorScheme, C7807Z>() { // from class: ru.ozon.uni.core.compose.theme.UniThemeColorAttrsMapKt$UniThemeColorAttrsMap$383
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C7807Z invoke(UniColorScheme uniColorScheme) {
                return C7807Z.m(m2657invokevNxB06k(uniColorScheme));
            }

            /* renamed from: invoke-vNxB06k, reason: not valid java name */
            public final long m2657invokevNxB06k(UniColorScheme to) {
                Intrinsics.checkNotNullParameter(to, "$this$to");
                return to.getTextWarningInverted();
            }
        }));
    }

    @NotNull
    public static final Map<UniColorToken, Function1<UniColorScheme, C7807Z>> getUniThemeColorAttrsMap() {
        return UniThemeColorAttrsMap;
    }
}
