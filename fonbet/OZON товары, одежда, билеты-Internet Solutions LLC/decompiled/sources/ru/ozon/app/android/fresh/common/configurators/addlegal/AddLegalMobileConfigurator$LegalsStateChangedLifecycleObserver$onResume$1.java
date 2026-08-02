package ru.ozon.app.android.fresh.common.configurators.addlegal;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.fresh.common.configurators.addlegal.AddLegalMobileConfigurator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddLegalMobileConfigurator$LegalsStateChangedLifecycleObserver$onResume$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AddLegalMobileConfigurator.LegalsStateChangedLifecycleObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddLegalMobileConfigurator$LegalsStateChangedLifecycleObserver$onResume$1(AddLegalMobileConfigurator.LegalsStateChangedLifecycleObserver legalsStateChangedLifecycleObserver) {
        super(0);
        this.this$0 = legalsStateChangedLifecycleObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConfiguratorReferences configuratorReferences;
        ConfiguratorReferences configuratorReferences2;
        boolean isFragmentInBottomSheetDialog;
        ConfiguratorReferences configuratorReferences3;
        configuratorReferences = this.this$0.references;
        C4911f ownerContainer = configuratorReferences.getOwnerContainer();
        if (ownerContainer.h()) {
            isFragmentInBottomSheetDialog = this.this$0.isFragmentInBottomSheetDialog(ownerContainer);
            if (isFragmentInBottomSheetDialog) {
                configuratorReferences3 = this.this$0.references;
                configuratorReferences3.getNavigator().popBackStack();
                return;
            }
        }
        configuratorReferences2 = this.this$0.references;
        InterfaceC7851b.a.a(configuratorReferences2.getController(), null, null, null, null, 15);
    }
}
