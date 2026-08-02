package ru.ozon.app.android.geo.map.presentation;

import Pc.a;
import a00.h;
import android.content.Intent;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.geo.map.di.AddressEditMapComponent;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "viewModel", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel;", "onComposerInitialized", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressEditMapConfigurator extends ComposerScreenConfig.PageConfigurator {
    private AddressEditMapViewModel viewModel;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        YandexSearchSheetFragment.Data data2;
        AddressEditMapViewModel addressEditMapViewModel;
        if (requestCode == 992) {
            AddressEditMapViewModel addressEditMapViewModel2 = this.viewModel;
            if (addressEditMapViewModel2 != null) {
                addressEditMapViewModel2.onLocationEnabledResult(resultCode);
                return;
            }
            return;
        }
        if (requestCode != 1001) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode != -1 || data == null || (data2 = (YandexSearchSheetFragment.Data) data.getParcelableExtra("EXTRA_DATA")) == null || (addressEditMapViewModel = this.viewModel) == null) {
            return;
        }
        SuggestVO.Suggest.SuggestInfo selectedSuggest = data2.getSelectedSuggest();
        addressEditMapViewModel.setContextLocationUid(selectedSuggest != null ? selectedSuggest.getContextLocationUid() : null);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        final a<AddressEditMapViewModelImpl> pViewModel;
        h viewModelOwnerProvider;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references != null) {
            references.getController().getEvents().observe(references.getOwnerContainer().g(), new AddressEditMapConfigurator$sam$androidx_lifecycle_Observer$0(new AddressEditMapConfigurator$onComposerInitialized$1$1(references, this)));
        }
        ConfiguratorReferences references2 = getReferences();
        AddressEditMapViewModelImpl addressEditMapViewModelImpl = null;
        AddressEditMapComponent addressEditMapComponent = (AddressEditMapComponent) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(AddressEditMapComponent.class));
        if (addressEditMapComponent == null || (pViewModel = addressEditMapComponent.getPViewModel()) == null) {
            return;
        }
        ConfiguratorReferences references3 = getReferences();
        if (references3 != null && (viewModelOwnerProvider = references3.getViewModelOwnerProvider()) != null) {
            addressEditMapViewModelImpl = (AddressEditMapViewModelImpl) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.geo.map.presentation.AddressEditMapConfigurator$onComposerInitialized$lambda$2$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    AddressEditMapViewModelImpl addressEditMapViewModelImpl2 = (AddressEditMapViewModelImpl) a.this.get();
                    Intrinsics.g(addressEditMapViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return addressEditMapViewModelImpl2;
                }
            }).a(AddressEditMapViewModelImpl.class);
        }
        this.viewModel = addressEditMapViewModelImpl;
    }
}
