package ru.ozon.app.android.cml.delivery.widgets.cellList.data.cellList;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewItem.CellListVI;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;", "cellListMoleculeMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellListMapper implements Function2<CellListDTO, d, List<? extends CellListVI>> {

    @NotNull
    private final CmlCellListMoleculeMapper cellListMoleculeMapper;

    public CellListMapper(@NotNull CmlCellListMoleculeMapper cellListMoleculeMapper) {
        Intrinsics.checkNotNullParameter(cellListMoleculeMapper, "cellListMoleculeMapper");
        this.cellListMoleculeMapper = cellListMoleculeMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CellListVI> invoke(@NotNull CellListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        CmlCellListMoleculeDTO cellList = state.getCellList();
        List<CellItem> map = this.cellListMoleculeMapper.map(state.getCellList());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new CellListVI(widgetId, cellList, map, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null, state.getHeaderWidgetKey(), false, 32, null));
    }
}
