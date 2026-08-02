package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoAsyncUpdateUiState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class PersonalInfoVerificationViewHolder$onAttach$1 extends C7719a implements Function2<PersonalInfoAsyncUpdateUiState, d<? super Unit>, Object> {
    PersonalInfoVerificationViewHolder$onAttach$1(Object obj) {
        super(2, obj, PersonalInfoVerificationViewHolder.class, "handleAsyncUpdateState", "handleAsyncUpdateState(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PersonalInfoAsyncUpdateUiState personalInfoAsyncUpdateUiState, d<? super Unit> dVar) {
        Object onAttach$handleAsyncUpdateState;
        onAttach$handleAsyncUpdateState = PersonalInfoVerificationViewHolder.onAttach$handleAsyncUpdateState((PersonalInfoVerificationViewHolder) this.receiver, personalInfoAsyncUpdateUiState, dVar);
        return onAttach$handleAsyncUpdateState;
    }
}
