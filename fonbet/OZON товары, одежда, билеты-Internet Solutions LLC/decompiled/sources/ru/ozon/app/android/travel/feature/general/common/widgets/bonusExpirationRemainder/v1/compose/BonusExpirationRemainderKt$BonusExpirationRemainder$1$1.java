package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose.BonusExpirationRemainderKt$BonusExpirationRemainder$1$1", f = "BonusExpirationRemainder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BonusExpirationRemainderKt$BonusExpirationRemainder$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ BonusExpirationRemainderVI $state;
    final /* synthetic */ BonusExpirationRemainderViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BonusExpirationRemainderKt$BonusExpirationRemainder$1$1(BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, BonusExpirationRemainderVI bonusExpirationRemainderVI, d<? super BonusExpirationRemainderKt$BonusExpirationRemainder$1$1> dVar) {
        super(2, dVar);
        this.$viewModel = bonusExpirationRemainderViewModel;
        this.$state = bonusExpirationRemainderVI;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BonusExpirationRemainderKt$BonusExpirationRemainder$1$1(this.$viewModel, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$viewModel.processItem(this.$state);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BonusExpirationRemainderKt$BonusExpirationRemainder$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
