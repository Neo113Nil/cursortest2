package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.HomeScreenStatePublisher;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ProcessLifecyclePublisher;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ProcessAndStateObserver$observe$1", f = "ProcessAndStateObserver.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class ProcessAndStateObserver$observe$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProcessAndStateObserver this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "processState", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "homeScreenState", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$PreviousAndCurrentHomeState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ProcessAndStateObserver$observe$1$1", f = "ProcessAndStateObserver.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ProcessAndStateObserver$observe$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<ProcessLifecyclePublisher.PreviousAndCurrentProcessState, HomeScreenStatePublisher.PreviousAndCurrentHomeState, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ ProcessAndStateObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ProcessAndStateObserver processAndStateObserver, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.this$0 = processAndStateObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean isReturnFromAnotherPage;
            boolean isReturnFromBackground;
            Function1 function1;
            boolean z11;
            Function0 function0;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ProcessLifecyclePublisher.PreviousAndCurrentProcessState previousAndCurrentProcessState = (ProcessLifecyclePublisher.PreviousAndCurrentProcessState) this.L$0;
            HomeScreenStatePublisher.PreviousAndCurrentHomeState previousAndCurrentHomeState = (HomeScreenStatePublisher.PreviousAndCurrentHomeState) this.L$1;
            if (previousAndCurrentHomeState.getPreviousState() == HomeScreenStatePublisher.HomeScreenState.STOPPED && previousAndCurrentHomeState.getCurrentState() == HomeScreenStatePublisher.HomeScreenState.STARTED) {
                this.this$0.fromAnotherPage = true;
            }
            isReturnFromAnotherPage = this.this$0.isReturnFromAnotherPage(previousAndCurrentProcessState, previousAndCurrentHomeState);
            if (isReturnFromAnotherPage) {
                function0 = this.this$0.returnFromAnotherPageCallback;
                function0.invoke();
                this.this$0.fromAnotherPage = false;
            } else {
                isReturnFromBackground = this.this$0.isReturnFromBackground(previousAndCurrentProcessState, previousAndCurrentHomeState);
                if (isReturnFromBackground) {
                    function1 = this.this$0.returnFromBackgroundCallback;
                    z11 = this.this$0.fromAnotherPage;
                    function1.invoke(Boolean.valueOf(z11));
                    this.this$0.resetPublishersState();
                    this.this$0.fromAnotherPage = false;
                }
            }
            return Unit.f71690a;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(ProcessLifecyclePublisher.PreviousAndCurrentProcessState previousAndCurrentProcessState, HomeScreenStatePublisher.PreviousAndCurrentHomeState previousAndCurrentHomeState, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = previousAndCurrentProcessState;
            anonymousClass1.L$1 = previousAndCurrentHomeState;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProcessAndStateObserver$observe$1(ProcessAndStateObserver processAndStateObserver, d<? super ProcessAndStateObserver$observe$1> dVar) {
        super(2, dVar);
        this.this$0 = processAndStateObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProcessAndStateObserver$observe$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProcessLifecyclePublisher processLifecyclePublisher;
        HomeScreenStatePublisher homeScreenStatePublisher;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            processLifecyclePublisher = this.this$0.processLifecyclePublisher;
            InterfaceC2395h<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> processPublisher = processLifecyclePublisher.getProcessPublisher();
            homeScreenStatePublisher = this.this$0.homeScreenStatePublisher;
            C2417s0 c2417s0 = new C2417s0(processPublisher, homeScreenStatePublisher.getStatePublisher(), new AnonymousClass1(this.this$0, null));
            this.label = 1;
            if (C2399j.g(c2417s0, this) == aVar) {
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
        return ((ProcessAndStateObserver$observe$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
