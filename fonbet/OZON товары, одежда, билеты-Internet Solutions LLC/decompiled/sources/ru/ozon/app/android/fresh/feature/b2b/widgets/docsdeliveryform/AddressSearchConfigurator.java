package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform;

import Pc.a;
import a00.h;
import android.content.Intent;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/AddressSearchConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModelImpl;", "pDocsDeliveryFormViewModel", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;", "viewModel", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressSearchConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<DocsDeliveryFormViewModelImpl> pDocsDeliveryFormViewModel;
    private DocsDeliveryFormViewModel viewModel;

    public AddressSearchConfigurator(@NotNull a<DocsDeliveryFormViewModelImpl> pDocsDeliveryFormViewModel) {
        Intrinsics.checkNotNullParameter(pDocsDeliveryFormViewModel, "pDocsDeliveryFormViewModel");
        this.pDocsDeliveryFormViewModel = pDocsDeliveryFormViewModel;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        YandexSearchSheetFragment.Data data2;
        DocsDeliveryFormViewModel docsDeliveryFormViewModel;
        if (resultCode != -1 || requestCode != 1000 || data == null || (data2 = (YandexSearchSheetFragment.Data) data.getParcelableExtra("EXTRA_DATA")) == null || (docsDeliveryFormViewModel = this.viewModel) == null) {
            return;
        }
        SuggestVO.Suggest.SuggestInfo selectedSuggest = data2.getSelectedSuggest();
        String displayFullAddress = selectedSuggest != null ? selectedSuggest.getDisplayFullAddress() : null;
        if (displayFullAddress == null) {
            displayFullAddress = "";
        }
        docsDeliveryFormViewModel.updateAddress(displayFullAddress);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        h viewModelOwnerProvider;
        B0 b11;
        ConfiguratorReferences references = getReferences();
        this.viewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (b11 = viewModelOwnerProvider.b()) == null) ? null : (DocsDeliveryFormViewModelImpl) new z0(b11, new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.AddressSearchConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = AddressSearchConfigurator.this.pDocsDeliveryFormViewModel;
                DocsDeliveryFormViewModelImpl docsDeliveryFormViewModelImpl = (DocsDeliveryFormViewModelImpl) aVar.get();
                Intrinsics.g(docsDeliveryFormViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return docsDeliveryFormViewModelImpl;
            }
        }).a(DocsDeliveryFormViewModelImpl.class);
    }
}
