package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.view.InputCurtainView;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class InputCurtainViewHolder$onAttachViewModel$1 extends C7719a implements Function2<InputCurtainUpdate, d<? super Unit>, Object> {
    InputCurtainViewHolder$onAttachViewModel$1(Object obj) {
        super(2, obj, InputCurtainView.class, "bindUpdate", "bindUpdate(Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainUpdate;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InputCurtainUpdate inputCurtainUpdate, d<? super Unit> dVar) {
        Object onAttachViewModel$bindUpdate;
        onAttachViewModel$bindUpdate = InputCurtainViewHolder.onAttachViewModel$bindUpdate((InputCurtainView) this.receiver, inputCurtainUpdate, dVar);
        return onAttachViewModel$bindUpdate;
    }
}
