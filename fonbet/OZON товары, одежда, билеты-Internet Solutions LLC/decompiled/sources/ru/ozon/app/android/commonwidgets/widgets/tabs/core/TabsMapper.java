package ru.ozon.app.android.commonwidgets.widgets.tabs.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.tabs.data.TabsDTO;
import ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabsMapper implements Function2<TabsDTO, d, List<? extends TabsVO>> {
    private static final int defaultBadgeColorRes = R$color.oz_accent_alert;

    @NotNull
    private final Context appContext;

    public TabsMapper(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TabsVO> invoke(@NotNull TabsDTO dto, @NotNull d widgetInfo) {
        boolean z11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<TabsDTO.TabsItemDTO> tabs = dto.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator it = tabs.iterator();
        String str = "";
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TabsDTO.TabsItemDTO tabsItemDTO = (TabsDTO.TabsItemDTO) it.next();
            Boolean isSelected = tabsItemDTO.isSelected();
            boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
            String deeplink = tabsItemDTO.getDeeplink();
            String str2 = deeplink == null ? "" : deeplink;
            if (booleanValue) {
                str = str2;
            }
            String title = tabsItemDTO.getTitle();
            String badge = tabsItemDTO.getBadge();
            Integer w02 = badge != null ? h.w0(badge) : null;
            Iterator it2 = it;
            int parseColor = StyleParser.INSTANCE.parseColor(this.appContext, tabsItemDTO.getBadgeColor(), defaultBadgeColorRes);
            Map<String, TokenizedTrackingInfo> trackingInfo = tabsItemDTO.getTrackingInfo();
            arrayList.add(new TabsVO.TabsItemVO(title, w02, parseColor, booleanValue, str2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            it = it2;
        }
        Boolean isScrollable = dto.isScrollable();
        if (isScrollable != null) {
            z11 = isScrollable.booleanValue();
        } else if (dto.getTabs().size() > 3) {
            z11 = true;
        }
        return C7714v.a0(new TabsVO(hashCode, arrayList, z11, dto.getScrollableMinWidth(), str));
    }
}
