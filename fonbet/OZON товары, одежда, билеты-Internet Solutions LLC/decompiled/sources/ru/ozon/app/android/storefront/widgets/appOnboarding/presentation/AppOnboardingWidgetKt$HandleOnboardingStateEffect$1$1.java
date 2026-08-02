package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.o;
import Sc.s;
import Wc.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1", f = "AppOnboardingWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $closeFlow;
    final /* synthetic */ Function2<Uri, Uri, Unit> $closeFlowWithRedirect;
    final /* synthetic */ InterfaceC2395h<AppOnboardingViewModel.Event> $events;
    final /* synthetic */ Function0<Unit> $onFinished;
    final /* synthetic */ Function1<d<? super Unit>, Object> $scrollToPage;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1$1", f = "AppOnboardingWidget.kt", l = {181}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<AppOnboardingViewModel.Event, d<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $closeFlow;
        final /* synthetic */ Function2<Uri, Uri, Unit> $closeFlowWithRedirect;
        final /* synthetic */ Function0<Unit> $onFinished;
        final /* synthetic */ Function1<d<? super Unit>, Object> $scrollToPage;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, Function2<? super Uri, ? super Uri, Unit> function2, Function1<? super d<? super Unit>, ? extends Object> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$closeFlow = function0;
            this.$onFinished = function02;
            this.$closeFlowWithRedirect = function2;
            this.$scrollToPage = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$closeFlow, this.$onFinished, this.$closeFlowWithRedirect, this.$scrollToPage, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                AppOnboardingViewModel.Event event = (AppOnboardingViewModel.Event) this.L$0;
                if (event instanceof AppOnboardingViewModel.Event.CloseFlow) {
                    this.$closeFlow.invoke();
                    this.$onFinished.invoke();
                } else if (event instanceof AppOnboardingViewModel.Event.CloseFlowWithRedirect) {
                    AppOnboardingViewModel.Event.CloseFlowWithRedirect closeFlowWithRedirect = (AppOnboardingViewModel.Event.CloseFlowWithRedirect) event;
                    this.$closeFlowWithRedirect.invoke(closeFlowWithRedirect.getDeeplink(), closeFlowWithRedirect.getReferrer());
                    this.$onFinished.invoke();
                } else {
                    if (!(event instanceof AppOnboardingViewModel.Event.NextStep)) {
                        throw new o();
                    }
                    Function1<d<? super Unit>, Object> function1 = this.$scrollToPage;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
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
        public final Object invoke(AppOnboardingViewModel.Event event, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(event, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1(InterfaceC2395h<? extends AppOnboardingViewModel.Event> interfaceC2395h, Function0<Unit> function0, Function0<Unit> function02, Function2<? super Uri, ? super Uri, Unit> function2, Function1<? super d<? super Unit>, ? extends Object> function1, d<? super AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1> dVar) {
        super(2, dVar);
        this.$events = interfaceC2395h;
        this.$closeFlow = function0;
        this.$onFinished = function02;
        this.$closeFlowWithRedirect = function2;
        this.$scrollToPage = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1 appOnboardingWidgetKt$HandleOnboardingStateEffect$1$1 = new AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1(this.$events, this.$closeFlow, this.$onFinished, this.$closeFlowWithRedirect, this.$scrollToPage, dVar);
        appOnboardingWidgetKt$HandleOnboardingStateEffect$1$1.L$0 = obj;
        return appOnboardingWidgetKt$HandleOnboardingStateEffect$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        InterfaceC2395h<AppOnboardingViewModel.Event> interfaceC2395h = this.$events;
        if (interfaceC2395h != null) {
            C2399j.C(new C2408n0(interfaceC2395h, new AnonymousClass1(this.$closeFlow, this.$onFinished, this.$closeFlowWithRedirect, this.$scrollToPage, null)), m11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
