package ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation;

import Sc.s;
import Wc.a;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9115P;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.data.FinanceWidgetCardDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import x1.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation.FinanceWidgetV2Kt$FinanceWidgetCard$1$1", f = "FinanceWidgetV2.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FinanceWidgetV2Kt$FinanceWidgetCard$1$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ FinanceWidgetCardDTO $state;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/e;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation.FinanceWidgetV2Kt$FinanceWidgetCard$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7459e, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7459e c7459e) {
            m1037invokek4lQ0M(c7459e.n());
            return Unit.f71690a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1037invokek4lQ0M(long j11) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/e;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation.FinanceWidgetV2Kt$FinanceWidgetCard$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<C7459e, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ FinanceWidgetCardDTO $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(FinanceWidgetCardDTO financeWidgetCardDTO, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$state = financeWidgetCardDTO;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7459e c7459e) {
            m1038invokek4lQ0M(c7459e.n());
            return Unit.f71690a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1038invokek4lQ0M(long j11) {
            AtomAction atomAction = this.$state.getCommon().toAtomAction();
            if (atomAction != null) {
                this.$actionHandler.invoke(atomAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FinanceWidgetV2Kt$FinanceWidgetCard$1$1(FinanceWidgetCardDTO financeWidgetCardDTO, Function1<? super AtomAction, Unit> function1, d<? super FinanceWidgetV2Kt$FinanceWidgetCard$1$1> dVar) {
        super(2, dVar);
        this.$state = financeWidgetCardDTO;
        this.$actionHandler = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FinanceWidgetV2Kt$FinanceWidgetCard$1$1 financeWidgetV2Kt$FinanceWidgetCard$1$1 = new FinanceWidgetV2Kt$FinanceWidgetCard$1$1(this.$state, this.$actionHandler, dVar);
        financeWidgetV2Kt$FinanceWidgetCard$1$1.L$0 = obj;
        return financeWidgetV2Kt$FinanceWidgetCard$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object f7;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f11 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$actionHandler);
            this.label = 1;
            f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : anonymousClass1, (r12 & 8) != 0 ? null : anonymousClass2, f11);
            if (f7 == aVar) {
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
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((FinanceWidgetV2Kt$FinanceWidgetCard$1$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
