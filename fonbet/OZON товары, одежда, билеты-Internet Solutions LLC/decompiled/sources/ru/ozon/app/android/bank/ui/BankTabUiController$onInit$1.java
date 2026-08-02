package ru.ozon.app.android.bank.ui;

import Ae.C;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.ui.BankTabUiController$onInit$1", f = "BankTabUiController.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class BankTabUiController$onInit$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BankTabUiController this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager$BankBadgeState;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.bank.ui.BankTabUiController$onInit$1$1", f = "BankTabUiController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.ui.BankTabUiController$onInit$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<InterfaceC2397i<? super BankTabBadgeManager.BankBadgeState>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super BankTabBadgeManager.BankBadgeState> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = th2;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankTabUiController$onInit$1(BankTabUiController bankTabUiController, d<? super BankTabUiController$onInit$1> dVar) {
        super(2, dVar);
        this.this$0 = bankTabUiController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BankTabUiController$onInit$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BankTabBadgeManager bankTabBadgeManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            bankTabBadgeManager = this.this$0.bankTabManager;
            C c11 = new C(bankTabBadgeManager.getBadgeFlow(), new AnonymousClass1(null));
            final BankTabUiController bankTabUiController = this.this$0;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.bank.ui.BankTabUiController$onInit$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((BankTabBadgeManager.BankBadgeState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(BankTabBadgeManager.BankBadgeState bankBadgeState, d<? super Unit> dVar) {
                    BaseOzonBottomTabView tabView;
                    tabView = BankTabUiController.this.getTabView();
                    if (tabView != null) {
                        if (bankBadgeState.getCount().length() != 0 && bankBadgeState.getIsVisible()) {
                            tabView.bindBadge(new IndicatorDTO(bankBadgeState.getCount(), null, null, null, null, IndicatorDTO.IndicatorContent.TEXT, null, null, null, IndicatorDTO.Style.ACCENT, null, 1502, null), bankBadgeState.getCount());
                        } else {
                            tabView.removeBadge("");
                        }
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (c11.collect(interfaceC2397i, this) == aVar) {
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
        return ((BankTabUiController$onInit$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
