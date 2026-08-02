package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$setState$1 extends AbstractC7737t implements Function1<AdditionalServicesVO, AdditionalServicesVO> {
    final /* synthetic */ List<AdditionalServicesCellVO> $newCells;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$setState$1(AdditionalServicesViewModel additionalServicesViewModel, List<AdditionalServicesCellVO> list) {
        super(1);
        this.this$0 = additionalServicesViewModel;
        this.$newCells = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdditionalServicesVO invoke(AdditionalServicesVO setState) {
        AdditionalServicesVO.State.Loaded loadedState;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        loadedState = this.this$0.getLoadedState();
        return AdditionalServicesVO.copy$default(setState, 0L, AdditionalServicesVO.State.Loaded.copy$default(loadedState, null, null, this.$newCells, 0, null, null, 59, null), null, 5, null);
    }
}
