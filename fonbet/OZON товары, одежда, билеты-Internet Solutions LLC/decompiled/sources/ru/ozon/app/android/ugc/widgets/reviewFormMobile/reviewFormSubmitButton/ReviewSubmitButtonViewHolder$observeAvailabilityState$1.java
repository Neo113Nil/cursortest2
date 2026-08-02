package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ReviewSubmitButtonViewHolder$observeAvailabilityState$1 extends C7719a implements Function2<Boolean, d<? super Unit>, Object> {
    ReviewSubmitButtonViewHolder$observeAvailabilityState$1(Object obj) {
        super(2, obj, ReviewSubmitButtonViewHolder.class, "bindButton", "bindButton(Z)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        Object observeAvailabilityState$bindButton;
        observeAvailabilityState$bindButton = ReviewSubmitButtonViewHolder.observeAvailabilityState$bindButton((ReviewSubmitButtonViewHolder) this.receiver, z11, dVar);
        return observeAvailabilityState$bindButton;
    }
}
