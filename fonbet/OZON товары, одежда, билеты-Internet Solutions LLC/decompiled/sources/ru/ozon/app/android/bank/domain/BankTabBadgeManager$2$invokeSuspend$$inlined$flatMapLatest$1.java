package ru.ozon.app.android.bank.domain;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LAe/i;", "it", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.domain.BankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1", f = "BankTabBadgeManager.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1 extends j implements InterfaceC6511n<InterfaceC2397i<? super BankTabBadgeManager.BankBadgeState>, User, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BankTabBadgeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1(d dVar, BankTabBadgeManager bankTabBadgeManager) {
        super(3, dVar);
        this.this$0 = bankTabBadgeManager;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super BankTabBadgeManager.BankBadgeState> interfaceC2397i, User user, d<? super Unit> dVar) {
        BankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1 bankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1 = new BankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1(dVar, this.this$0);
        bankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = interfaceC2397i;
        bankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = user;
        return bankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            InterfaceC2395h requestActionFlow = this.this$0.requestActionFlow();
            this.label = 1;
            if (C2399j.r(interfaceC2397i, requestActionFlow, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
