package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tabs;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTabsDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tabs/TabsVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTabsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TabsViewMapper$mapper$1 extends AbstractC7737t implements Function2<SplitElementDTO.SplitTabsDTO, d, List<? extends TabsVO>> {
    public static final TabsViewMapper$mapper$1 INSTANCE = new TabsViewMapper$mapper$1();

    TabsViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<TabsVO> invoke(SplitElementDTO.SplitTabsDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + dto.getIndex()).hashCode();
        TabsDTO content = dto.getContent();
        Paddings paddings = dto.getPaddings();
        Boolean shouldDisableShadow = dto.getShouldDisableShadow();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getContent().getTrackingInfo();
        return C7714v.a0(new TabsVO(hashCode, content, paddings, shouldDisableShadow, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null));
    }
}
