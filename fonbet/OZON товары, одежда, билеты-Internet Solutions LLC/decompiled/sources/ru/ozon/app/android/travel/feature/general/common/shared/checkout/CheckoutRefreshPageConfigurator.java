package ru.ozon.app.android.travel.feature.general.common.shared.checkout;

import android.content.Intent;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.di.TravelCellListV3Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3ViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/shared/checkout/CheckoutRefreshPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "viewModel", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel;", "onComposerInitialized", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutRefreshPageConfigurator extends ComposerScreenConfig.PageConfigurator {
    private TravelCellListV3ViewModel viewModel;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String stringExtra;
        InterfaceC7851b controller;
        if (resultCode != -1 || requestCode != 1777 || data == null || (stringExtra = data.getStringExtra("CURRENT_URL")) == null) {
            return;
        }
        if (h.t(stringExtra, "aviaServicePackagePanelMobile", false)) {
            TravelCellListV3ViewModel travelCellListV3ViewModel = this.viewModel;
            if (travelCellListV3ViewModel != null) {
                travelCellListV3ViewModel.onModalDismiss();
                return;
            }
            return;
        }
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        a00.h viewModelOwnerProvider;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        TravelCellListV3ViewModel travelCellListV3ViewModel = null;
        final TravelCellListV3Component travelCellListV3Component = (TravelCellListV3Component) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(TravelCellListV3Component.class));
        if (travelCellListV3Component == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null && (viewModelOwnerProvider = references2.getViewModelOwnerProvider()) != null) {
            travelCellListV3ViewModel = (TravelCellListV3ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.shared.checkout.CheckoutRefreshPageConfigurator$onComposerInitialized$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    TravelCellListV3ViewModel travelCellListV3ViewModel2 = TravelCellListV3Component.this.getTravelCellListV3ViewModel();
                    Intrinsics.g(travelCellListV3ViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return travelCellListV3ViewModel2;
                }
            }).a(TravelCellListV3ViewModel.class);
        }
        this.viewModel = travelCellListV3ViewModel;
    }
}
