package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AdvVideoBannerV2ViewHolderNew$onAttachViewModel$1 extends C7719a implements Function2<AdvVideoBannerV2ViewModelNew.State, d<? super Unit>, Object> {
    AdvVideoBannerV2ViewHolderNew$onAttachViewModel$1(Object obj) {
        super(2, obj, AdvVideoBannerV2PlayerBinder.class, "renderPlayerState", "renderPlayerState(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvVideoBannerV2ViewModelNew.State state, d<? super Unit> dVar) {
        Object onAttachViewModel$renderPlayerState;
        onAttachViewModel$renderPlayerState = AdvVideoBannerV2ViewHolderNew.onAttachViewModel$renderPlayerState((AdvVideoBannerV2PlayerBinder) this.receiver, state, dVar);
        return onAttachViewModel$renderPlayerState;
    }
}
