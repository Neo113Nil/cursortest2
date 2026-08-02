package ru.ozon.app.android.timerMolecule.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.timerMolecule.presentation.TimerDelegateImpl$onAttach$2", f = "TimerDelegateImpl.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TimerDelegateImpl$onAttach$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onTimerFinish;
    final /* synthetic */ TimerViewModel $vm;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.timerMolecule.presentation.TimerDelegateImpl$onAttach$2$1", f = "TimerDelegateImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.timerMolecule.presentation.TimerDelegateImpl$onAttach$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<TimerViewModel.Action, d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
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
            return Boolean.valueOf(((TimerViewModel.Action) this.L$0) instanceof TimerViewModel.Action.OnTimerFinished);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TimerViewModel.Action action, d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(action, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerDelegateImpl$onAttach$2(TimerViewModel timerViewModel, Function0<Unit> function0, d<? super TimerDelegateImpl$onAttach$2> dVar) {
        super(2, dVar);
        this.$vm = timerViewModel;
        this.$onTimerFinish = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerDelegateImpl$onAttach$2(this.$vm, this.$onTimerFinish, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<TimerViewModel.Action> action = this.$vm.getAction();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (C2399j.v(action, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Function0<Unit> function0 = this.$onTimerFinish;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerDelegateImpl$onAttach$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
