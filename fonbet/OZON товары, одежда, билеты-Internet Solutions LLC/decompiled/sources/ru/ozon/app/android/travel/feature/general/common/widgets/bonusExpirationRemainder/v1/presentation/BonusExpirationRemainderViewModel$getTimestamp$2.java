package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)J"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel$getTimestamp$2", f = "BonusExpirationRemainderViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BonusExpirationRemainderViewModel$getTimestamp$2 extends j implements Function2<M, d<? super Long>, Object> {
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ BonusExpirationRemainderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BonusExpirationRemainderViewModel$getTimestamp$2(BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, String str, d<? super BonusExpirationRemainderViewModel$getTimestamp$2> dVar) {
        super(2, dVar);
        this.this$0 = bonusExpirationRemainderViewModel;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BonusExpirationRemainderViewModel$getTimestamp$2(this.this$0, this.$key, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BonusExpirationRemainderRepository bonusExpirationRemainderRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        bonusExpirationRemainderRepository = this.this$0.repository;
        String str = this.$key;
        this.label = 1;
        Object timestamp = bonusExpirationRemainderRepository.getTimestamp(str, this);
        return timestamp == aVar ? aVar : timestamp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Long> dVar) {
        return ((BonusExpirationRemainderViewModel$getTimestamp$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
