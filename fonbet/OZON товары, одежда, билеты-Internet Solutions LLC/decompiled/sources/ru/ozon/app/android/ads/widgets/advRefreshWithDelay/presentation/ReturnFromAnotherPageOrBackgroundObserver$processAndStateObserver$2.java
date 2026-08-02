package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessAndStateObserver;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2 extends AbstractC7737t implements Function0<ProcessAndStateObserver> {
    final /* synthetic */ ReturnFromAnotherPageOrBackgroundObserver this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ReturnFromAnotherPageOrBackgroundObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver) {
            super(0);
            this.this$0 = returnFromAnotherPageOrBackgroundObserver;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AdvRefreshWithDelayViewModel advRefreshWithDelayViewModel;
            advRefreshWithDelayViewModel = this.this$0.viewModel;
            advRefreshWithDelayViewModel.refreshData(AdvRefreshWithDelayViewModel.Refresh.FromAnotherPage.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "fromAnotherPage", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ ReturnFromAnotherPageOrBackgroundObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver) {
            super(1);
            this.this$0 = returnFromAnotherPageOrBackgroundObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            AdvRefreshWithDelayViewModel advRefreshWithDelayViewModel;
            advRefreshWithDelayViewModel = this.this$0.viewModel;
            advRefreshWithDelayViewModel.refreshData(new AdvRefreshWithDelayViewModel.Refresh.FromBackground(z11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2(ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver) {
        super(0);
        this.this$0 = returnFromAnotherPageOrBackgroundObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProcessAndStateObserver invoke() {
        AdvRefreshWithDelayViewModel advRefreshWithDelayViewModel;
        ProcessLifecyclePublisher processLifecyclePublisher;
        advRefreshWithDelayViewModel = this.this$0.viewModel;
        C6788a a11 = x0.a(advRefreshWithDelayViewModel);
        processLifecyclePublisher = this.this$0.processLifecyclePublisher;
        return new ProcessAndStateObserver(a11, processLifecyclePublisher, this.this$0.getHomeScreenStatePublisher(), new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0));
    }
}
