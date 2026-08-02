package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.InterfaceC4003e;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm.TimerViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsTimerSupport$startCollecting$1", f = "EmptyStateV2ButtonsTimerSupport.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class EmptyStateV2ButtonsTimerSupport$startCollecting$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ TimerViewModel $timerViewModel;
    int label;
    final /* synthetic */ EmptyStateV2ButtonsTimerSupport this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsTimerSupport$startCollecting$1$1", f = "EmptyStateV2ButtonsTimerSupport.kt", l = {145}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsTimerSupport$startCollecting$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ TimerViewModel $timerViewModel;
        int label;
        final /* synthetic */ EmptyStateV2ButtonsTimerSupport this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsTimerSupport$startCollecting$1$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C14431 implements InterfaceC2397i, InterfaceC7732n {
            final /* synthetic */ EmptyStateV2ButtonsTimerSupport $tmp0;

            C14431(EmptyStateV2ButtonsTimerSupport emptyStateV2ButtonsTimerSupport) {
                this.$tmp0 = emptyStateV2ButtonsTimerSupport;
            }

            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((Map<String, TimerViewModel.TimerState>) obj, (d<? super Unit>) dVar);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                    return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7732n
            public final InterfaceC4003e<?> getFunctionDelegate() {
                return new C7719a(2, this.$tmp0, EmptyStateV2ButtonsTimerSupport.class, "render", "render(Ljava/util/Map;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Map<String, TimerViewModel.TimerState> map, d<? super Unit> dVar) {
                Object invokeSuspend$render = AnonymousClass1.invokeSuspend$render(this.$tmp0, map, dVar);
                return invokeSuspend$render == a.COROUTINE_SUSPENDED ? invokeSuspend$render : Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TimerViewModel timerViewModel, EmptyStateV2ButtonsTimerSupport emptyStateV2ButtonsTimerSupport, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$timerViewModel = timerViewModel;
            this.this$0 = emptyStateV2ButtonsTimerSupport;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$render(EmptyStateV2ButtonsTimerSupport emptyStateV2ButtonsTimerSupport, Map map, d dVar) {
            emptyStateV2ButtonsTimerSupport.render(map);
            return Unit.f71690a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$timerViewModel, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M0<Map<String, TimerViewModel.TimerState>> timerStates = this.$timerViewModel.getTimerStates();
                C14431 c14431 = new C14431(this.this$0);
                this.label = 1;
                if (timerStates.collect(c14431, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2ButtonsTimerSupport$startCollecting$1(J j11, TimerViewModel timerViewModel, EmptyStateV2ButtonsTimerSupport emptyStateV2ButtonsTimerSupport, d<? super EmptyStateV2ButtonsTimerSupport$startCollecting$1> dVar) {
        super(2, dVar);
        this.$lifecycleOwner = j11;
        this.$timerViewModel = timerViewModel;
        this.this$0 = emptyStateV2ButtonsTimerSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EmptyStateV2ButtonsTimerSupport$startCollecting$1(this.$lifecycleOwner, this.$timerViewModel, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            J j11 = this.$lifecycleOwner;
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timerViewModel, this.this$0, null);
            this.label = 1;
            if (C5412d0.b(j11, bVar, anonymousClass1, this) == aVar) {
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
        return ((EmptyStateV2ButtonsTimerSupport$startCollecting$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
