package ru.ozon.app.android.product.molecules.countbutton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CountButtonView$bindOrGone$2 extends C7719a implements Function2<ButtonState, d<? super Unit>, Object> {
    CountButtonView$bindOrGone$2(Object obj) {
        super(2, obj, CountButtonView.class, "onButtonStateChanged", "onButtonStateChanged(Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ButtonState buttonState, d<? super Unit> dVar) {
        Object bindOrGone$onButtonStateChanged;
        bindOrGone$onButtonStateChanged = CountButtonView.bindOrGone$onButtonStateChanged((CountButtonView) this.receiver, buttonState, dVar);
        return bindOrGone$onButtonStateChanged;
    }
}
