package ru.ozon.app.android.storefront.onboardingscreen.screen;

import GZ.g;
import GZ.l;
import Sc.o;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storefront.onboardingscreen.screen.NavigationState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "navState", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnboardingFlowFragment$onViewCreated$3 extends AbstractC7737t implements Function1<NavigationState, Unit> {
    final /* synthetic */ OnboardingFlowFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingFlowFragment$onViewCreated$3(OnboardingFlowFragment onboardingFlowFragment) {
        super(1);
        this.this$0 = onboardingFlowFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavigationState navigationState) {
        invoke2(navigationState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NavigationState navigationState) {
        g router;
        g router2;
        OnboardingFlowFragmentViewModel viewModel;
        g router3;
        if (navigationState instanceof NavigationState.InitialState) {
            return;
        }
        if (navigationState instanceof NavigationState.LaunchComposerPage) {
            router3 = this.this$0.getRouter();
            g.a.a(router3, ((NavigationState.LaunchComposerPage) navigationState).getDeeplink(), null, null, 6);
            return;
        }
        if (navigationState instanceof NavigationState.LaunchAuth) {
            r activity = this.this$0.getActivity();
            if (activity != null) {
                viewModel = this.this$0.getViewModel();
                viewModel.signIn(activity);
                return;
            }
            return;
        }
        if (navigationState instanceof NavigationState.LaunchGeo) {
            router2 = this.this$0.getRouter();
            String uri = LinkGenerator.INSTANCE.newPvzOrderDetails().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            g.a.a(router2, uri, null, null, 6);
            return;
        }
        if (!(navigationState instanceof NavigationState.CloseScreenFlow)) {
            if (!(navigationState instanceof NavigationState.EnableSystemPermissions)) {
                throw new o();
            }
            this.this$0.requestSystemPushEnabled(((NavigationState.EnableSystemPermissions) navigationState).getShouldAwaitRemote());
            return;
        }
        NavigationState.CloseScreenFlow closeScreenFlow = (NavigationState.CloseScreenFlow) navigationState;
        if (closeScreenFlow.getIsDeeplinkOpener() && closeScreenFlow.getResult() != null) {
            this.this$0.finishWithDeeplink(closeScreenFlow.getResult(), closeScreenFlow.getRef());
            return;
        }
        router = this.this$0.getRouter();
        l.a(router);
        this.this$0.close();
    }
}
