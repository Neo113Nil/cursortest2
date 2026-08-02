package ru.ozon.app.android.navigation.newrouter.navigators;

import EZ.e;
import GZ.g;
import NZ.f;
import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.newrouter.destinations.tabs.switchs.ClearToRootTabDestination;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ClearToRootTabNavigationHandler$navigateForResult$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ e<ClearToRootTabDestination> $response;
    final /* synthetic */ f $tabFragmentNavigator;
    final /* synthetic */ ClearToRootTabNavigationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClearToRootTabNavigationHandler$navigateForResult$1(f fVar, e<ClearToRootTabDestination> eVar, int i11, ClearToRootTabNavigationHandler clearToRootTabNavigationHandler) {
        super(0);
        this.$tabFragmentNavigator = fVar;
        this.$response = eVar;
        this.$requestCode = i11;
        this.this$0 = clearToRootTabNavigationHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g ozonRouter;
        g ozonRouter2;
        G fragmentManager = this.$tabFragmentNavigator.getFragmentManager();
        fragmentManager.R0(fragmentManager.k0(0).getId(), 0);
        String link = this.$response.b().getLink();
        if (link != null) {
            if (this.$requestCode == 0) {
                ozonRouter2 = this.this$0.getOzonRouter();
                g.a.a(ozonRouter2, link, null, null, 6);
            } else {
                ozonRouter = this.this$0.getOzonRouter();
                ozonRouter.b(link, this.$requestCode, U.c());
            }
        }
    }
}
