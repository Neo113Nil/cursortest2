package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsMapper implements Function2<CatalogueTabsDTO, d, List<? extends CatalogueTabsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CatalogueTabsVO> invoke(@NotNull CatalogueTabsDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = ExtentionsKt.getId(widgetInfo);
        int hashCode = Long.hashCode(id2);
        List<CatalogueTabsDTO.CatalogueTabsSingleTab> tabs = state.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : tabs) {
            int i13 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CatalogueTabsDTO.CatalogueTabsSingleTab catalogueTabsSingleTab = (CatalogueTabsDTO.CatalogueTabsSingleTab) obj;
            if (catalogueTabsSingleTab.getChip().getState() == ChipState.SELECTED) {
                i12 = i11;
            }
            ChipDTO chip = catalogueTabsSingleTab.getChip();
            String widgetScrollKey = catalogueTabsSingleTab.getWidgetScrollKey();
            int hashCode2 = widgetScrollKey != null ? widgetScrollKey.hashCode() : hashCode;
            CommonControlSettings common = catalogueTabsSingleTab.getChip().getCommon();
            if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null);
            }
            arrayList.add(new CatalogueTabsVO.CatalogueTabsSingleTab(hashCode2, chip, tVar));
            i11 = i13;
        }
        return C7714v.a0(new CatalogueTabsVO(id2, hashCode, 0.0f, ResourceExtKt.toPxF(state.getRadius().getPx()), state.getScrollableStatePaddings(), state.getTabsGapPadding(), arrayList, i12, false));
    }
}
