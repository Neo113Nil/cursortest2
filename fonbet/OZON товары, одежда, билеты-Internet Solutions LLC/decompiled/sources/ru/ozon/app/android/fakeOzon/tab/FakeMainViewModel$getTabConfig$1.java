package ru.ozon.app.android.fakeOzon.tab;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import nc.InterfaceC8487b;
import ru.ozon.app.android.fakeOzon.tab.FakeMainState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc/b;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lnc/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FakeMainViewModel$getTabConfig$1 extends AbstractC7737t implements Function1<InterfaceC8487b, Unit> {
    final /* synthetic */ FakeMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeMainViewModel$getTabConfig$1(FakeMainViewModel fakeMainViewModel) {
        super(1);
        this.this$0 = fakeMainViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8487b interfaceC8487b) {
        invoke2(interfaceC8487b);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8487b interfaceC8487b) {
        this.this$0.getState().postValue(FakeMainState.Loading.INSTANCE);
    }
}
