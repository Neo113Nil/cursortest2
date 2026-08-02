package ru.ozon.app.android.fakeOzon.tab;

import Sc.o;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fakeOzon.tab.FakeMainState;
import ru.ozon.app.android.storefront.feature.miniapp.databinding.FragmentFakeozonTabNavigationBinding;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fakeOzon/tab/FakeMainState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fakeOzon/tab/FakeMainState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FakeOzonTabNavigationFragment$onViewCreated$2 extends AbstractC7737t implements Function1<FakeMainState, Unit> {
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ FakeOzonTabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeOzonTabNavigationFragment$onViewCreated$2(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, Bundle bundle) {
        super(1);
        this.this$0 = fakeOzonTabNavigationFragment;
        this.$savedInstanceState = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FakeMainState fakeMainState) {
        invoke2(fakeMainState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FakeMainState fakeMainState) {
        FragmentFakeozonTabNavigationBinding binding;
        FragmentFakeozonTabNavigationBinding binding2;
        if (fakeMainState instanceof FakeMainState.Loading) {
            binding2 = this.this$0.getBinding();
            binding2.screenState.showState(new ScreenState.Loading());
        } else if (fakeMainState instanceof FakeMainState.Fail) {
            binding = this.this$0.getBinding();
            binding.screenState.showState(ScreenStateExtKt.toScreenState$default(((FakeMainState.Fail) fakeMainState).getThrowable(), null, false, 3, null));
        } else {
            if (!(fakeMainState instanceof FakeMainState.Success)) {
                throw new o();
            }
            this.this$0.handleSuccessfulState((FakeMainState.Success) fakeMainState, this.$savedInstanceState);
        }
    }
}
