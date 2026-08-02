package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.databinding.FragmentTravelTabBinding;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabScreenState;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabScreenState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabScreenState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelTabNavigationFragment$observeStateChanges$1 extends AbstractC7737t implements Function1<TravelTabScreenState, Unit> {
    final /* synthetic */ TravelTabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelTabNavigationFragment$observeStateChanges$1(TravelTabNavigationFragment travelTabNavigationFragment) {
        super(1);
        this.this$0 = travelTabNavigationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelTabScreenState travelTabScreenState) {
        invoke2(travelTabScreenState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelTabScreenState travelTabScreenState) {
        FragmentTravelTabBinding binding;
        if (Intrinsics.d(travelTabScreenState, TravelTabScreenState.Loading.INSTANCE)) {
            binding = this.this$0.getBinding();
            binding.screenState.showState(new ScreenState.Loading());
        } else {
            if (!(travelTabScreenState instanceof TravelTabScreenState.Success)) {
                throw new o();
            }
            this.this$0.handleSuccessState((TravelTabScreenState.Success) travelTabScreenState);
        }
    }
}
