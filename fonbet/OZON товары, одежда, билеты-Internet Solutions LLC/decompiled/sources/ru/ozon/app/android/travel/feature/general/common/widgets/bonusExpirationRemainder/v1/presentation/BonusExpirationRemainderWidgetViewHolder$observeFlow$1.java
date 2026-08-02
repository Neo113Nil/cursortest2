package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class BonusExpirationRemainderWidgetViewHolder$observeFlow$1 extends C7719a implements Function2<BonusExpirationRemainderViewModel.BonusAction, d<? super Unit>, Object> {
    BonusExpirationRemainderWidgetViewHolder$observeFlow$1(Object obj) {
        super(2, obj, BonusExpirationRemainderWidgetViewHolder.class, "handleAction", "handleAction(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BonusExpirationRemainderViewModel.BonusAction bonusAction, d<? super Unit> dVar) {
        Object observeFlow$handleAction;
        observeFlow$handleAction = BonusExpirationRemainderWidgetViewHolder.observeFlow$handleAction((BonusExpirationRemainderWidgetViewHolder) this.receiver, bonusAction, dVar);
        return observeFlow$handleAction;
    }
}
