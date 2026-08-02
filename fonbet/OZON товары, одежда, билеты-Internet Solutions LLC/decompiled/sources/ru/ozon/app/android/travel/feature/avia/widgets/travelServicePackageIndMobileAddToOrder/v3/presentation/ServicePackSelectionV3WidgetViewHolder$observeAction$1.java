package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3ViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ServicePackSelectionV3WidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<ServicePackSelectionV3ViewModel.Action, Unit> {
    final /* synthetic */ ServicePackSelectionV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackSelectionV3WidgetViewHolder$observeAction$1(ServicePackSelectionV3WidgetViewHolder servicePackSelectionV3WidgetViewHolder) {
        super(1);
        this.this$0 = servicePackSelectionV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServicePackSelectionV3ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ServicePackSelectionV3ViewModel.Action action) {
        Function1 function1;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        if (Intrinsics.d(action, ServicePackSelectionV3ViewModel.Action.Error.INSTANCE)) {
            composerReferences2 = this.this$0.ref;
            ViewGroup rootView = ContextExtKt.getRootView(composerReferences2.getContainer().c());
            if (rootView != null) {
                ServicePackSelectionV3WidgetViewHolder servicePackSelectionV3WidgetViewHolder = this.this$0;
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                composerReferences3 = servicePackSelectionV3WidgetViewHolder.ref;
                FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, composerReferences3.getContainer().g(), 62, null).show();
                return;
            }
            return;
        }
        if (action instanceof ServicePackSelectionV3ViewModel.Action.Success) {
            ServicePackSelectionV3ViewModel.Action.Success success = (ServicePackSelectionV3ViewModel.Action.Success) action;
            if (success.getShouldCloseFlow()) {
                composerReferences = this.this$0.ref;
                ComposerNavigator navigator = composerReferences.getNavigator();
                String uri = LinkGenerator.clearToRootTab$default(LinkGenerator.INSTANCE, null, 1, null).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
            }
            function1 = this.this$0.actionHandler;
            function1.invoke(success.getAtomAction());
        }
    }
}
