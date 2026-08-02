package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelTabNavigationFragment$setUpScreenState$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TravelTabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelTabNavigationFragment$setUpScreenState$1(TravelTabNavigationFragment travelTabNavigationFragment) {
        super(0);
        this.this$0 = travelTabNavigationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TravelTabViewModel travelTabViewModel;
        String str;
        String str2;
        travelTabViewModel = this.this$0.viewModel;
        if (travelTabViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        str = this.this$0.miniAppName;
        if (str == null) {
            Intrinsics.n("miniAppName");
            throw null;
        }
        str2 = this.this$0.referrerMiniAppName;
        travelTabViewModel.observeConfigChanges(str, str2);
    }
}
