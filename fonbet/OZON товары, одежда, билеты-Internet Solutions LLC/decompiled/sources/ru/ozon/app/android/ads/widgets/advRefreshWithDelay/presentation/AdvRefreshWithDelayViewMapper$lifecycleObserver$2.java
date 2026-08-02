package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ReturnFromAnotherPageOrBackgroundObserver;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvRefreshWithDelayViewMapper$lifecycleObserver$2 extends AbstractC7737t implements Function0<ReturnFromAnotherPageOrBackgroundObserver> {
    final /* synthetic */ AdvRefreshWithDelayViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvRefreshWithDelayViewMapper$lifecycleObserver$2(AdvRefreshWithDelayViewMapper advRefreshWithDelayViewMapper) {
        super(0);
        this.this$0 = advRefreshWithDelayViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReturnFromAnotherPageOrBackgroundObserver invoke() {
        AdvRefreshWithDelayViewModel advRefreshWithDelayViewModel;
        advRefreshWithDelayViewModel = this.this$0.viewModel;
        if (advRefreshWithDelayViewModel != null) {
            return new ReturnFromAnotherPageOrBackgroundObserver(advRefreshWithDelayViewModel);
        }
        return null;
    }
}
