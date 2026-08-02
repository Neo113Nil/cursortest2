package ru.ozon.app.android.travel.utils.returnScreenRefresh;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ProcessAndStateObserver;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2 extends AbstractC7737t implements Function0<ProcessAndStateObserver> {
    final /* synthetic */ ReturnFromAnotherPageOrBackgroundObserver this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2$1, reason: invalid class name */
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
            ReturnScreenRefreshCallbacks returnScreenRefreshCallbacks;
            returnScreenRefreshCallbacks = this.this$0.returnScreenRefreshCallbacks;
            returnScreenRefreshCallbacks.onRefreshData();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2(ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver) {
        super(0);
        this.this$0 = returnFromAnotherPageOrBackgroundObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProcessAndStateObserver invoke() {
        ReturnScreenRefreshCallbacks returnScreenRefreshCallbacks;
        ProcessLifecyclePublisher processLifecyclePublisher;
        returnScreenRefreshCallbacks = this.this$0.returnScreenRefreshCallbacks;
        M viewModelScope = returnScreenRefreshCallbacks.getViewModelScope();
        processLifecyclePublisher = this.this$0.processLifecyclePublisher;
        return new ProcessAndStateObserver(viewModelScope, processLifecyclePublisher, this.this$0.getHomeScreenStatePublisher(), new AnonymousClass1(this.this$0));
    }
}
