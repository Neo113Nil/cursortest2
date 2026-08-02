package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainAsyncUpdateUiState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SecureDealDataViewHolder$onAttach$1 extends C7719a implements Function2<SecureDealCurtainAsyncUpdateUiState, d<? super Unit>, Object> {
    SecureDealDataViewHolder$onAttach$1(Object obj) {
        super(2, obj, SecureDealDataViewHolder.class, "handleAsyncUpdateState", "handleAsyncUpdateState(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainAsyncUpdateUiState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SecureDealCurtainAsyncUpdateUiState secureDealCurtainAsyncUpdateUiState, d<? super Unit> dVar) {
        Object onAttach$handleAsyncUpdateState;
        onAttach$handleAsyncUpdateState = SecureDealDataViewHolder.onAttach$handleAsyncUpdateState((SecureDealDataViewHolder) this.receiver, secureDealCurtainAsyncUpdateUiState, dVar);
        return onAttach$handleAsyncUpdateState;
    }
}
