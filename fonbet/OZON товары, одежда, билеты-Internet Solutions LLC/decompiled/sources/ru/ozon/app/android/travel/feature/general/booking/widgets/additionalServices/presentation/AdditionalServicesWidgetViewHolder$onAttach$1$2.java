package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class AdditionalServicesWidgetViewHolder$onAttach$1$2 extends C7719a implements Function2<AdditionalServicesViewModel.Event<AdditionalServicesVO.State.Loaded>, d<? super Unit>, Object> {
    AdditionalServicesWidgetViewHolder$onAttach$1$2(Object obj) {
        super(2, obj, AdditionalServicesWidgetViewHolder.class, "handleEvent", "handleEvent(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdditionalServicesViewModel.Event<AdditionalServicesVO.State.Loaded> event, d<? super Unit> dVar) {
        Object onAttach$lambda$1$handleEvent;
        onAttach$lambda$1$handleEvent = AdditionalServicesWidgetViewHolder.onAttach$lambda$1$handleEvent((AdditionalServicesWidgetViewHolder) this.receiver, event, dVar);
        return onAttach$lambda$1$handleEvent;
    }
}
