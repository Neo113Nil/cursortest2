package ru.ozon.app.android.fakeOzon.tab;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fakeOzon.tab.FakeMainState;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FakeMainViewModel$getTabConfig$3 extends AbstractC7737t implements Function1<TabConfigResponse, Unit> {
    final /* synthetic */ FakeMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeMainViewModel$getTabConfig$3(FakeMainViewModel fakeMainViewModel) {
        super(1);
        this.this$0 = fakeMainViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TabConfigResponse tabConfigResponse) {
        invoke2(tabConfigResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TabConfigResponse tabConfigResponse) {
        FakeMainTabConfigMapper fakeMainTabConfigMapper;
        V<FakeMainState> state = this.this$0.getState();
        fakeMainTabConfigMapper = this.this$0.mapper;
        Intrinsics.f(tabConfigResponse);
        state.postValue(new FakeMainState.Success(fakeMainTabConfigMapper.mapTabConfig(tabConfigResponse, null)));
    }
}
