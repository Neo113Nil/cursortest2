package ru.ozon.app.android.pdp.widgets.tabs.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.tabs.data.PdpTabsDTO;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000  2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001 B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0017\u001a\u00020\u0016*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/core/PdpTabsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "", "widgetId", "toVo", "(Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;J)Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$Tab;", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "tabsStyle", "", "isSelected", "", "horizontalPadding", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "toVoTab", "(Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$Tab;JLru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;ZI)Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "mapOldColors", "(Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;)Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTabsMapper implements Function2<PdpTabsDTO, d, List<? extends PdpTabsVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppType appType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/core/PdpTabsMapper$Companion;", "", "<init>", "()V", "HEIGHT", "", "SELECT_HEIGHT", "DEFAULT_CORNER_RADIUS", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PdpTabsMapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
    }

    private final PdpTabsVO.TabsStyle mapOldColors(PdpTabsVO.TabsStyle tabsStyle) {
        String textColor = tabsStyle.getTextColor();
        Locale locale = Locale.ROOT;
        String lowerCase = textColor.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String token = Intrinsics.d(lowerCase, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue()) ? UniColors.TEXT_PRIMARY.getToken() : tabsStyle.getTextColor();
        String lowerCase2 = tabsStyle.getSelectedTextColor().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        String token2 = Intrinsics.d(lowerCase2, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY.getValue()) ? UniColors.TEXT_PRIMARY_INVERTED.getToken() : tabsStyle.getSelectedTextColor();
        String lowerCase3 = tabsStyle.getBackgroundColor().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        String token3 = Intrinsics.d(lowerCase3, StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue()) ? UniColors.BG_SECONDARY.getToken() : tabsStyle.getBackgroundColor();
        String lowerCase4 = tabsStyle.getSelectedBackgroundColor().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        return PdpTabsVO.TabsStyle.copy$default(tabsStyle, token3, Intrinsics.d(lowerCase4, StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL.getValue()) ? UniColors.BG_PREMIUM_PRIMARY_INVERTED.getToken() : tabsStyle.getSelectedBackgroundColor(), token, token2, 0, 16, null);
    }

    private final PdpTabsVO toVo(PdpTabsDTO pdpTabsDTO, long j11) {
        String backgroundColor = pdpTabsDTO.getTabTheme().getBackgroundColor();
        String backgroundColor2 = pdpTabsDTO.getTabSelectedTheme().getBackgroundColor();
        String textColor = pdpTabsDTO.getTabTheme().getTextColor();
        String textColor2 = pdpTabsDTO.getTabSelectedTheme().getTextColor();
        Integer tabBorderRadius = pdpTabsDTO.getTabBorderRadius();
        PdpTabsVO.TabsStyle mapOldColors = mapOldColors(new PdpTabsVO.TabsStyle(backgroundColor, backgroundColor2, textColor, textColor2, tabBorderRadius != null ? tabBorderRadius.intValue() : 8));
        Iterator<PdpTabsDTO.Tab> it = pdpTabsDTO.getTabs().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getTabGroupId(), pdpTabsDTO.getSelectedTabGroupId())) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        List<PdpTabsDTO.Tab> tabs = pdpTabsDTO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        int i12 = 0;
        for (Object obj : tabs) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVoTab((PdpTabsDTO.Tab) obj, j11, mapOldColors, i12 == intValue, pdpTabsDTO.getTabs().size() > 1 ? 12 : 0));
            i12 = i13;
        }
        String backgroundColor3 = pdpTabsDTO.getBackgroundColor();
        if (Intrinsics.d(backgroundColor3, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY.getValue())) {
            backgroundColor3 = null;
        }
        if (backgroundColor3 == null) {
            backgroundColor3 = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor3;
        Map<String, TokenizedTrackingInfo> trackingInfo = pdpTabsDTO.getTrackingInfo();
        return new PdpTabsVO(j11, arrayList, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, this.appType == AppType.SELECT ? 32 : 30);
    }

    private final PdpTabsVO.Tab toVoTab(PdpTabsDTO.Tab tab, long j11, PdpTabsVO.TabsStyle tabsStyle, boolean z11, int i11) {
        TextAtom name = tab.getName();
        String lowerCase = tab.getName().getTextStyle().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(name, null, null, null, null, null, null, null, Intrinsics.d(lowerCase, StyleParser.TextStyle.BODY_M.getStyleName()) ? UniTextStyles.BODY_400_SMALL.getToken() : tab.getName().getTextColor(), null, 1, null, false, 3455, null);
        String tabGroupId = tab.getTabGroupId();
        Map<String, TokenizedTrackingInfo> trackingInfo = tab.getTrackingInfo();
        return new PdpTabsVO.Tab(dsTextAtom$default, tabGroupId, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, tab.isInitiallyHidden(), tabsStyle, z11, i11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PdpTabsVO> invoke(@NotNull PdpTabsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return state.getTabs().isEmpty() ? K.f71697a : C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
