package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000b\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "kotlin.jvm.PlatformType", "filterValue", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/String;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ConcreteStepCellDataSource$subscribeCells$1 extends AbstractC7737t implements Function1<String, List<? extends AtomDTO>> {
    final /* synthetic */ ConcreteStepCellDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConcreteStepCellDataSource$subscribeCells$1(ConcreteStepCellDataSource concreteStepCellDataSource) {
        super(1);
        this.this$0 = concreteStepCellDataSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<AtomDTO> invoke(String filterValue) {
        List list;
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        list = this.this$0.cells;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AtomDTO atomDTO = (AtomDTO) obj;
            if (atomDTO instanceof CellAtom) {
                String obj2 = ((CellAtom) atomDTO).getTitle().toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                if (h.t(obj2, filterValue, true)) {
                    arrayList.add(obj);
                }
            }
            if (atomDTO instanceof RangeFilter) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
