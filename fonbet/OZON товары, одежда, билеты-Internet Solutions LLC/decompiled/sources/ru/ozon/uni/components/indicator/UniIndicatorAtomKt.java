package ru.ozon.uni.components.indicator;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.components.indicator.UniIndicatorStyle;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "UniIndicatorAtom", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "Lru/ozon/uni/components/indicator/UniIndicatorSize;", "toVO", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;)Lru/ozon/uni/components/indicator/UniIndicatorSize;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "toStyleVO", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;LS0/k;I)Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIndicatorAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorDTO.IndicatorSize.values().length];
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_450.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void UniIndicatorAtom(@NotNull IndicatorDTO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1883046507);
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
            IndicatorDTO.IndicatorContent content = dto.getContent();
            boolean z11 = (dto.getText() == null || dto.getIcon() == null) ? false : true;
            u11.o(1287112350);
            TestInfo testInfo = dto.getTestInfo();
            if (testInfo != null) {
                viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
            }
            u11.k();
            String text = dto.getText();
            IndicatorDTO.IndicatorContent indicatorContent = IndicatorDTO.IndicatorContent.NONE;
            if (content == indicatorContent || (z11 && content == IndicatorDTO.IndicatorContent.ICON)) {
                text = null;
            }
            String icon = dto.getIcon();
            AbstractC8972b abstractC8972b = icon == null ? null : TokenParserKt.tokenToIcon(icon, u11, 0);
            if (content == indicatorContent || (z11 && content == IndicatorDTO.IndicatorContent.TEXT)) {
                abstractC8972b = null;
            }
            UniIndicatorStyle styleVO = toStyleVO(dto, u11, i13 & 14);
            IndicatorDTO.IndicatorSize size = dto.getSize();
            if (size == null) {
                size = IndicatorDTO.INSTANCE.getDefaultSize();
            }
            UniIndicatorKt.UniIndicator(viewAnalytics, text, abstractC8972b, styleVO, toVO(size), u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniIndicatorAtomKt$UniIndicatorAtom$4(dto, eVar, i11, i12));
        }
    }

    private static final UniIndicatorStyle toStyleVO(IndicatorDTO indicatorDTO, InterfaceC3967k interfaceC3967k, int i11) {
        UniIndicatorStyle uniIndicatorStyle;
        interfaceC3967k.o(657944313);
        IndicatorDTO.Style compatStyle = indicatorDTO.getCompatStyle();
        if (compatStyle == IndicatorDTO.Style.ACCENT || compatStyle == null) {
            uniIndicatorStyle = UniIndicatorStyle.Accent.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.ACCENT_SECONDARY) {
            uniIndicatorStyle = UniIndicatorStyle.AccentSecondary.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.NEUTRAL) {
            uniIndicatorStyle = UniIndicatorStyle.Neutral.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.NEUTRAL_TRANSPARENT) {
            uniIndicatorStyle = UniIndicatorStyle.NeutralTransparent.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.LIGHT) {
            uniIndicatorStyle = UniIndicatorStyle.Light.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.LIGHT_NEUTRAL) {
            uniIndicatorStyle = UniIndicatorStyle.LightNeutral.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.STATIC) {
            uniIndicatorStyle = UniIndicatorStyle.Static.INSTANCE;
        } else if (compatStyle == IndicatorDTO.Style.NEUTRAL_ON_DARK) {
            uniIndicatorStyle = UniIndicatorStyle.NeutralOnDark.INSTANCE;
        } else {
            if (compatStyle != IndicatorDTO.Style.CUSTOM) {
                throw new o();
            }
            IndicatorDTO.CustomStyle customStyle = indicatorDTO.getCustomStyle();
            String backgroundColor = customStyle != null ? customStyle.getBackgroundColor() : null;
            interfaceC3967k.o(470405405);
            C7807Z c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(470404507);
            long value = c7807z == null ? DeferredColor.getValue(UniIndicatorStyle.Accent.INSTANCE.getBackgroundColor(), interfaceC3967k, 0) : c7807z.w();
            interfaceC3967k.k();
            IndicatorDTO.CustomStyle customStyle2 = indicatorDTO.getCustomStyle();
            String textColor = customStyle2 != null ? customStyle2.getTextColor() : null;
            interfaceC3967k.o(470408349);
            C7807Z c7807z2 = textColor == null ? null : TokenParserKt.tokenToColor(textColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(470407631);
            long value2 = c7807z2 == null ? DeferredColor.getValue(UniIndicatorStyle.Accent.INSTANCE.getTextColor(), interfaceC3967k, 0) : c7807z2.w();
            interfaceC3967k.k();
            IndicatorDTO.CustomStyle customStyle3 = indicatorDTO.getCustomStyle();
            String iconColor = customStyle3 != null ? customStyle3.getIconColor() : null;
            interfaceC3967k.o(470411101);
            C7807Z c7807z3 = iconColor != null ? TokenParserKt.tokenToColor(iconColor, interfaceC3967k, 0) : null;
            interfaceC3967k.k();
            uniIndicatorStyle = new UniIndicatorStyle.CustomStyle(value, value2, c7807z3 == null ? DeferredColor.getValue(UniIndicatorStyle.Accent.INSTANCE.getIconColor(), interfaceC3967k, 0) : c7807z3.w(), null);
        }
        interfaceC3967k.k();
        return uniIndicatorStyle;
    }

    private static final UniIndicatorSize toVO(IndicatorDTO.IndicatorSize indicatorSize) {
        switch (WhenMappings.$EnumSwitchMapping$0[indicatorSize.ordinal()]) {
            case 1:
                return UniIndicatorSize.Size300;
            case 2:
                return UniIndicatorSize.Size400;
            case 3:
                return UniIndicatorSize.Size450;
            case 4:
                return UniIndicatorSize.Size500;
            case 5:
                return UniIndicatorSize.Size600;
            case 6:
                return UniIndicatorSize.Size700;
            case 7:
                return UniIndicatorSize.Size800;
            default:
                throw new o();
        }
    }
}
