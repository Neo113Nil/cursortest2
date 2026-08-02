package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import hg.InterfaceC6950c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import nc.C8486a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg/c;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lhg/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$pollFlights$4 extends AbstractC7737t implements Function1<InterfaceC6950c, Unit> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$pollFlights$4(AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6950c interfaceC6950c) {
        invoke2(interfaceC6950c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC6950c interfaceC6950c) {
        C8486a c8486a;
        Function0 function0;
        c8486a = this.this$0.luggageSelectionDisposables;
        c8486a.d();
        function0 = this.this$0.showProgressAction;
        if (function0 != null) {
            function0.invoke();
        }
        this.this$0.showProgressAction = null;
    }
}
