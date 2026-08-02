package ru.ozon.app.android.bank.domain;

import Sc.s;
import Wc.a;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.fintech.features.finwebview.domain.badge.ExternalBadgeCallback$BadgeState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.domain.BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1", f = "BankTabBadgeManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $json;
    int label;
    final /* synthetic */ BankTabBadgeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1(BankTabBadgeManager bankTabBadgeManager, String str, d<? super BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1> dVar) {
        super(2, dVar);
        this.this$0 = bankTabBadgeManager;
        this.$json = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1(this.this$0, this.$json, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonAdapter jsonAdapter;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        jsonAdapter = this.this$0.badgeDTOJsonAdapter;
        ExternalBadgeCallback$BadgeState externalBadgeCallback$BadgeState = (ExternalBadgeCallback$BadgeState) jsonAdapter.fromJson(this.$json);
        if (externalBadgeCallback$BadgeState != null) {
            this.this$0.mutableBadgeState.tryEmit(new BankTabBadgeManager.BankBadgeState(externalBadgeCallback$BadgeState.isActive(), externalBadgeCallback$BadgeState.getCount()));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
