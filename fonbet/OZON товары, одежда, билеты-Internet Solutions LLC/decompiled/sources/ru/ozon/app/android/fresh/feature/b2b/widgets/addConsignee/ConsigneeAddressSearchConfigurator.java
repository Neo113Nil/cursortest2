package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee;

import a00.C4911f;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di.AddConsigneeComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewModel;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/ConsigneeAddressSearchConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "viewModel", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;", "onComposerInitialized", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConsigneeAddressSearchConfigurator extends ComposerScreenConfig.PageConfigurator {
    private AddConsigneeViewModel viewModel;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        YandexSearchSheetFragment.Data data2;
        AddConsigneeViewModel addConsigneeViewModel;
        if (resultCode != -1 || requestCode != 1000 || data == null || (data2 = (YandexSearchSheetFragment.Data) data.getParcelableExtra("EXTRA_DATA")) == null || (addConsigneeViewModel = this.viewModel) == null) {
            return;
        }
        SuggestVO.Suggest.SuggestInfo selectedSuggest = data2.getSelectedSuggest();
        String displayFullAddress = selectedSuggest != null ? selectedSuggest.getDisplayFullAddress() : null;
        if (displayFullAddress == null) {
            displayFullAddress = "";
        }
        addConsigneeViewModel.updateAddress(displayFullAddress);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        final AddConsigneeViewModel viewModel;
        ConfiguratorReferences references;
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references2 = getReferences();
        AddConsigneeViewModel addConsigneeViewModel = null;
        AddConsigneeComponent addConsigneeComponent = (AddConsigneeComponent) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(AddConsigneeComponent.class));
        if (addConsigneeComponent != null && (viewModel = addConsigneeComponent.getViewModel()) != null && (references = getReferences()) != null && (ownerContainer = references.getOwnerContainer()) != null && (c11 = ownerContainer.c()) != null) {
            if (c11.isDetached()) {
                c11 = null;
            }
            if (c11 != null) {
                addConsigneeViewModel = (AddConsigneeViewModel) new z0(c11, new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.ConsigneeAddressSearchConfigurator$onComposerInitialized$lambda$2$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        AddConsigneeViewModel addConsigneeViewModel2 = AddConsigneeViewModel.this;
                        Intrinsics.g(addConsigneeViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return addConsigneeViewModel2;
                    }
                }).a(AddConsigneeViewModel.class);
            }
        }
        this.viewModel = addConsigneeViewModel;
    }
}
