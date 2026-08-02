package ru.ozon.app.android.fakeOzon.tab;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FakeOzonTabNavigationFragment$onViewCreated$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FakeOzonTabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeOzonTabNavigationFragment$onViewCreated$1(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment) {
        super(0);
        this.this$0 = fakeOzonTabNavigationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FakeMainViewModel viewModel;
        String str;
        viewModel = this.this$0.getViewModel();
        str = this.this$0.miniAppName;
        if (str != null) {
            viewModel.getTabConfig(str);
        } else {
            Intrinsics.n("miniAppName");
            throw null;
        }
    }
}
