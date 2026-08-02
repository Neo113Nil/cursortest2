package ru.ozon.uni.android.ds.compose.component.indicator;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorStyle;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\"&\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001f\u001a\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\u00020\t*\u0004\u0018\u00010\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u001b*\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010#\"\u001a\u0010\"\u001a\u00020\t*\u0004\u0018\u00010$8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010%\"\u001a\u0010\"\u001a\u00020\t*\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "DsIndicatorAtom", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/core/models/UniIconToken;", "iconToken", "Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "evaluatedStyle", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/core/models/UniIconToken;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "other", "merge", "(Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "indicatorLocator", "Lkotlin/jvm/functions/Function1;", "", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;", "Lkotlin/Function0;", "dtoStyleMap", "Ljava/util/Map;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;", "dtoSizeMap", "getDefaultStyle", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "defaultStyle", "getAsVo", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "asVo", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$CustomStyle;", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$CustomStyle;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Custom;", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Custom;)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIndicatorAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> indicatorLocator = DsIndicatorAtomKt$indicatorLocator$1.INSTANCE;

    @NotNull
    private static final Map<IndicatorDTO.Style, Function2<InterfaceC3967k, Integer, DsIndicatorStyle>> dtoStyleMap = U.j(new Pair(IndicatorDTO.Style.ACCENT, DsIndicatorAtomKt$dtoStyleMap$1.INSTANCE), new Pair(IndicatorDTO.Style.ACCENT_SECONDARY, DsIndicatorAtomKt$dtoStyleMap$2.INSTANCE), new Pair(IndicatorDTO.Style.NEUTRAL, DsIndicatorAtomKt$dtoStyleMap$3.INSTANCE), new Pair(IndicatorDTO.Style.NEUTRAL_TRANSPARENT, DsIndicatorAtomKt$dtoStyleMap$4.INSTANCE), new Pair(IndicatorDTO.Style.LIGHT, DsIndicatorAtomKt$dtoStyleMap$5.INSTANCE), new Pair(IndicatorDTO.Style.LIGHT_NEUTRAL, DsIndicatorAtomKt$dtoStyleMap$6.INSTANCE), new Pair(IndicatorDTO.Style.STATIC, DsIndicatorAtomKt$dtoStyleMap$7.INSTANCE), new Pair(IndicatorDTO.Style.NEUTRAL_ON_DARK, DsIndicatorAtomKt$dtoStyleMap$8.INSTANCE));

    @NotNull
    private static final Map<IndicatorDTO.IndicatorSize, DsIndicatorSize> dtoSizeMap = U.j(new Pair(IndicatorDTO.IndicatorSize.SIZE_300, DsIndicatorSize.Size300), new Pair(IndicatorDTO.IndicatorSize.SIZE_400, DsIndicatorSize.Size400), new Pair(IndicatorDTO.IndicatorSize.SIZE_450, DsIndicatorSize.Size450), new Pair(IndicatorDTO.IndicatorSize.SIZE_600, DsIndicatorSize.Size600), new Pair(IndicatorDTO.IndicatorSize.SIZE_700, DsIndicatorSize.Size700), new Pair(IndicatorDTO.IndicatorSize.SIZE_800, DsIndicatorSize.Size800));

    public static final void DsIndicatorAtom(@NotNull IndicatorDTO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1467356146);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar, dto);
            DsIndicatorSize asVo = getAsVo(dto.getSize());
            String text = dto.getText();
            if (dto.getContent() != null && dto.getContent() != IndicatorDTO.IndicatorContent.TEXT) {
                text = null;
            }
            String icon = dto.getIcon();
            if (dto.getContent() != null && dto.getContent() != IndicatorDTO.IndicatorContent.ICON) {
                icon = null;
            }
            UniIconToken byId = icon != null ? UniTheme.INSTANCE.getIconTokens().getById(icon) : null;
            u11.o(-1496010304);
            AbstractC8972b icon2 = byId != null ? TokensExtKt.getIcon(byId, u11, UniIconToken.$stable) : null;
            u11.k();
            DsIndicatorKt.DsIndicator(AtomLocatorKt.testTag(viewAnalytics, indicatorLocator.invoke(dto.getTestInfo())), asVo, evaluatedStyle(dto, byId, u11, (i13 & 14) | (UniIconToken.$stable << 3)), text, icon2, u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsIndicatorAtomKt$DsIndicatorAtom$1(dto, eVar, i11, i12));
        }
    }

    private static final DsIndicatorStyle evaluatedStyle(IndicatorDTO indicatorDTO, UniIconToken uniIconToken, InterfaceC3967k interfaceC3967k, int i11) {
        DsIndicatorStyle asVo;
        long j11;
        interfaceC3967k.o(349404921);
        if (indicatorDTO.getCompatStyle() == IndicatorDTO.Style.CUSTOM) {
            interfaceC3967k.o(-807764525);
            asVo = merge(getDefaultStyle(interfaceC3967k, 0), getAsVo(indicatorDTO.getCustomStyle(), interfaceC3967k, 0));
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-807707609);
            asVo = getAsVo(indicatorDTO.getCompatStyle(), interfaceC3967k, 0);
            interfaceC3967k.k();
        }
        if (indicatorDTO.getCustomPreset() != null) {
            asVo = merge(asVo, getAsVo(indicatorDTO.getCustomPreset()));
        }
        if (uniIconToken != null && uniIconToken.getIsMulticolor()) {
            DsIndicatorStyle.Companion companion = DsIndicatorStyle.INSTANCE;
            long backgroundColor = asVo.getBackgroundColor();
            long textColor = asVo.getTextColor();
            j11 = C7807Z.f72259m;
            asVo = companion.m1734customjRlVdoo(backgroundColor, textColor, j11, asVo.getBorderColor());
        }
        interfaceC3967k.k();
        return asVo;
    }

    private static final DsIndicatorStyle getAsVo(IndicatorDTO.Style style, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(948229453);
        Function2<InterfaceC3967k, Integer, DsIndicatorStyle> function2 = dtoStyleMap.get(style);
        interfaceC3967k.o(-100513955);
        DsIndicatorStyle invoke = function2 == null ? null : function2.invoke(interfaceC3967k, 0);
        interfaceC3967k.k();
        if (invoke == null) {
            invoke = getDefaultStyle(interfaceC3967k, 0);
        }
        interfaceC3967k.k();
        return invoke;
    }

    private static final DsIndicatorStyle getDefaultStyle(InterfaceC3967k interfaceC3967k, int i11) {
        return DsIndicatorStyle.INSTANCE.accent(interfaceC3967k, 6);
    }

    private static final DsIndicatorStyle merge(DsIndicatorStyle dsIndicatorStyle, DsIndicatorStyle dsIndicatorStyle2) {
        DsIndicatorStyle.Companion companion = DsIndicatorStyle.INSTANCE;
        long backgroundColor = dsIndicatorStyle2.getBackgroundColor();
        if (backgroundColor == 16) {
            backgroundColor = dsIndicatorStyle.getBackgroundColor();
        }
        long textColor = dsIndicatorStyle2.getTextColor();
        if (textColor == 16) {
            textColor = dsIndicatorStyle.getTextColor();
        }
        long iconColor = dsIndicatorStyle2.getIconColor();
        if (iconColor == 16) {
            iconColor = dsIndicatorStyle.getIconColor();
        }
        long borderColor = dsIndicatorStyle2.getBorderColor();
        if (borderColor == 16) {
            borderColor = dsIndicatorStyle.getBorderColor();
        }
        return companion.m1734customjRlVdoo(backgroundColor, textColor, iconColor, borderColor);
    }

    private static final DsIndicatorSize getAsVo(IndicatorDTO.IndicatorSize indicatorSize) {
        return dtoSizeMap.getOrDefault(indicatorSize, DsIndicatorSize.Size500);
    }

    private static final DsIndicatorStyle getAsVo(IndicatorDTO.CustomStyle customStyle, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(374450846);
        DsIndicatorStyle.Companion companion = DsIndicatorStyle.INSTANCE;
        C7807Z c7807z = TokenParserKt.tokenToColor(customStyle != null ? customStyle.getBackgroundColor() : null, interfaceC3967k, 0);
        long w11 = c7807z != null ? c7807z.w() : C7807Z.f72259m;
        C7807Z c7807z2 = TokenParserKt.tokenToColor(customStyle != null ? customStyle.getTextColor() : null, interfaceC3967k, 0);
        long w12 = c7807z2 != null ? c7807z2.w() : C7807Z.f72259m;
        C7807Z c7807z3 = TokenParserKt.tokenToColor(customStyle != null ? customStyle.getIconColor() : null, interfaceC3967k, 0);
        long w13 = c7807z3 != null ? c7807z3.w() : C7807Z.f72259m;
        C7807Z c7807z4 = TokenParserKt.tokenToColor(customStyle != null ? customStyle.getBorderColor() : null, interfaceC3967k, 0);
        DsIndicatorStyle m1734customjRlVdoo = companion.m1734customjRlVdoo(w11, w12, w13, c7807z4 != null ? c7807z4.w() : C7807Z.f72259m);
        interfaceC3967k.k();
        return m1734customjRlVdoo;
    }

    private static final DsIndicatorStyle getAsVo(IndicatorDTO.Custom custom) {
        long j11;
        long j12;
        long j13;
        long j14;
        Integer borderColor;
        Integer iconColor;
        Integer textColor;
        Integer backgroundColor;
        DsIndicatorStyle.Companion companion = DsIndicatorStyle.INSTANCE;
        if (custom == null || (backgroundColor = custom.getBackgroundColor()) == null) {
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
        } else {
            j11 = C7811b0.b(backgroundColor.intValue());
        }
        if (custom == null || (textColor = custom.getTextColor()) == null) {
            int i12 = C7807Z.f72260n;
            j12 = C7807Z.f72259m;
        } else {
            j12 = C7811b0.b(textColor.intValue());
        }
        if (custom == null || (iconColor = custom.getIconColor()) == null) {
            int i13 = C7807Z.f72260n;
            j13 = C7807Z.f72259m;
        } else {
            j13 = C7811b0.b(iconColor.intValue());
        }
        if (custom == null || (borderColor = custom.getBorderColor()) == null) {
            int i14 = C7807Z.f72260n;
            j14 = C7807Z.f72259m;
        } else {
            j14 = C7811b0.b(borderColor.intValue());
        }
        return companion.m1734customjRlVdoo(j11, j12, j13, j14);
    }
}
