package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$onShowMoreButtonClicked$2$1 extends AbstractC7737t implements Function1<AdditionalServicesVO, AdditionalServicesVO> {
    final /* synthetic */ AdditionalServicesViewModel $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$onShowMoreButtonClicked$2$1(AdditionalServicesViewModel additionalServicesViewModel) {
        super(1);
        this.$this_run = additionalServicesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdditionalServicesVO invoke(AdditionalServicesVO setState) {
        AdditionalServicesVO viewState;
        AdditionalServicesVO.State.Loaded loadedState;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        viewState = this.$this_run.getViewState();
        loadedState = this.$this_run.getLoadedState();
        return AdditionalServicesVO.copy$default(viewState, 0L, AdditionalServicesVO.State.Loaded.copy$default(loadedState, null, null, null, 0, null, null, 47, null), null, 5, null);
    }
}
