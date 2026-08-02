package ru.ozon.uni.android.ds.compose.component.tabs;

import S0.InterfaceC3967k;
import Sc.o;
import U7.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000e\u001a\u00020\u000b*\u0004\u0018\u00010\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "toTabBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;", "tabsStyle", "toTabIndicator", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;)Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;", "resolveIndicatorStyle", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;)Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;", "Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;", "getTabsStyle", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;", "TabsStyle", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTabsAtomMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TabsDTO.Style.values().length];
            try {
                iArr[TabsDTO.Style.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabsDTO.Style.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabsDTO.Style.ACCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DsTabsStyle getTabsStyle(TabsDTO.Style style, InterfaceC3967k interfaceC3967k, int i11) {
        int i12 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i12 == -1 || i12 == 1 || i12 == 2) {
            interfaceC3967k.o(150523850);
            DsTabsStyle base = DsTabsStyle.INSTANCE.base(interfaceC3967k, 6);
            interfaceC3967k.k();
            return base;
        }
        if (i12 != 3) {
            throw l.c(interfaceC3967k, 150521305);
        }
        interfaceC3967k.o(150525484);
        DsTabsStyle accent = DsTabsStyle.INSTANCE.accent(interfaceC3967k, 6);
        interfaceC3967k.k();
        return accent;
    }

    private static final IndicatorDTO.Style resolveIndicatorStyle(IndicatorDTO.Style style, TabsDTO.Style style2) {
        int i11 = style2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style2.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            if (style != IndicatorDTO.Style.ACCENT) {
                return IndicatorDTO.Style.NEUTRAL;
            }
        } else {
            if (i11 != 3) {
                throw new o();
            }
            if (style != IndicatorDTO.Style.ACCENT) {
                return IndicatorDTO.Style.NEUTRAL_ON_DARK;
            }
        }
        return style;
    }

    @NotNull
    public static final BadgeDTO toTabBadge(@NotNull BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(badgeDTO, "<this>");
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_300;
        BadgeDTO.Style styleType = badgeDTO.getStyleType();
        if (styleType == null && (styleType = badgeDTO.getStyle()) == null) {
            styleType = BadgeDTO.Style.POSITIVE_SECONDARY;
        }
        return BadgeDTO.copy$default(badgeDTO, null, null, badgeSize, null, null, null, null, Boolean.TRUE, styleType, null, null, null, 3705, null);
    }

    @NotNull
    public static final IndicatorDTO toTabIndicator(@NotNull IndicatorDTO indicatorDTO, TabsDTO.Style style) {
        Intrinsics.checkNotNullParameter(indicatorDTO, "<this>");
        String text = indicatorDTO.getText();
        IndicatorDTO.IndicatorSize indicatorSize = (text == null || text.length() == 0) ? IndicatorDTO.IndicatorSize.SIZE_400 : IndicatorDTO.IndicatorSize.SIZE_500;
        IndicatorDTO.Style styleType = indicatorDTO.getStyleType();
        if (styleType == null) {
            styleType = indicatorDTO.getStyle();
        }
        return IndicatorDTO.copy$default(indicatorDTO, null, null, indicatorSize, null, null, null, null, null, null, resolveIndicatorStyle(styleType, style), null, 1529, null);
    }
}
