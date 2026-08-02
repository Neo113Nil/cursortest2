package ru.ozon.app.android.account.orders.cancel.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$stateStore$1$1$1", f = "CancelReasonVM.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelReasonViewModelImpl$stateStore$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CancelReasonStateStore $this_apply;
    int label;
    final /* synthetic */ CancelReasonViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "itemsList", "", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$stateStore$1$1$1$1", f = "CancelReasonVM.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$stateStore$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<List<? extends CancelReasonVO>, d<? super Unit>, Object> {
        final /* synthetic */ CancelReasonStateStore $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CancelReasonViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CancelReasonViewModelImpl cancelReasonViewModelImpl, CancelReasonStateStore cancelReasonStateStore, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = cancelReasonViewModelImpl;
            this.$this_apply = cancelReasonStateStore;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.getItems().setValue((List) this.L$0);
            V<CancelReasonVO.Button> button = this.this$0.getButton();
            CancelReasonVO.Button value = this.this$0.getButton().getValue();
            button.setValue(value != null ? CancelReasonVO.Button.copy$default(value, null, this.$this_apply.isButtonEnabled(), 1, null) : null);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends CancelReasonVO> list, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(list, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonViewModelImpl$stateStore$1$1$1(CancelReasonStateStore cancelReasonStateStore, CancelReasonViewModelImpl cancelReasonViewModelImpl, d<? super CancelReasonViewModelImpl$stateStore$1$1$1> dVar) {
        super(2, dVar);
        this.$this_apply = cancelReasonStateStore;
        this.this$0 = cancelReasonViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CancelReasonViewModelImpl$stateStore$1$1$1(this.$this_apply, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<List<CancelReasonVO>> observeItems = this.$this_apply.observeItems();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (C2399j.h(observeItems, anonymousClass1, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CancelReasonViewModelImpl$stateStore$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
