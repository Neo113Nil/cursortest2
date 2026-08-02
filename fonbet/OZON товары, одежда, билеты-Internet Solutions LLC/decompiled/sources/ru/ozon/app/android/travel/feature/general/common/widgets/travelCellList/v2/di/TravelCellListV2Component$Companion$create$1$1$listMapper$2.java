package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.data.TravelCellListV2ListMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2ListMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelCellListV2Component$Companion$create$1$1$listMapper$2 extends AbstractC7737t implements Function0<TravelCellListV2ListMapper> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCellListV2Component$Companion$create$1$1$listMapper$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TravelCellListV2ListMapper invoke() {
        return new TravelCellListV2ListMapper(ComposerWidgetComponentStorageKt.getContext(this.$storage));
    }
}
