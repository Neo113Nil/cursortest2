package ru.ozon.app.android.cml.delivery.widgets.order.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderWidgetV2Component$Companion$create$1$1$cellListGroupMapper$2 extends AbstractC7737t implements Function0<CellListGroupMapper> {
    public static final OrderWidgetV2Component$Companion$create$1$1$cellListGroupMapper$2 INSTANCE = new OrderWidgetV2Component$Companion$create$1$1$cellListGroupMapper$2();

    OrderWidgetV2Component$Companion$create$1$1$cellListGroupMapper$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CellListGroupMapper invoke() {
        return new CellListGroupMapper(new CmlCellListMoleculeMapper());
    }
}
