package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.v;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core.TimerViewModelFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm.TimerViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateV2ButtonsTimerSupport$timerViewModel$2 extends AbstractC7737t implements Function0<TimerViewModel> {
    final /* synthetic */ v $viewModelOwnerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2ButtonsTimerSupport$timerViewModel$2(v vVar) {
        super(0);
        this.$viewModelOwnerProvider = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TimerViewModel invoke() {
        return (TimerViewModel) new z0(this.$viewModelOwnerProvider.a(), TimerViewModelFactory.INSTANCE).a(TimerViewModel.class);
    }
}
