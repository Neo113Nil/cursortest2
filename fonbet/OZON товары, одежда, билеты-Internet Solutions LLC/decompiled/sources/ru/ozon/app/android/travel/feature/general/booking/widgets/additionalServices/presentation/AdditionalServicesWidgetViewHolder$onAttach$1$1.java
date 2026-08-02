package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class AdditionalServicesWidgetViewHolder$onAttach$1$1 extends C7719a implements Function2<AdditionalServicesVO, d<? super Unit>, Object> {
    AdditionalServicesWidgetViewHolder$onAttach$1$1(Object obj) {
        super(2, obj, AdditionalServicesWidgetViewHolder.class, "handleState", "handleState(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdditionalServicesVO additionalServicesVO, d<? super Unit> dVar) {
        Object onAttach$lambda$1$handleState;
        onAttach$lambda$1$handleState = AdditionalServicesWidgetViewHolder.onAttach$lambda$1$handleState((AdditionalServicesWidgetViewHolder) this.receiver, additionalServicesVO, dVar);
        return onAttach$lambda$1$handleState;
    }
}
