package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor;

import Pc.a;
import a00.h;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/LegalDetailsFileSelectConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "viewModel", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewModel;", "onComposerInitialized", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegalDetailsFileSelectConfigurator extends ComposerScreenConfig.PageConfigurator {
    private LegalDetailsEditorViewModel viewModel;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String dataString;
        Uri parse;
        LegalDetailsEditorViewModel legalDetailsEditorViewModel;
        if (resultCode != -1 || data == null || (dataString = data.getDataString()) == null || (parse = Uri.parse(dataString)) == null || (legalDetailsEditorViewModel = this.viewModel) == null) {
            return;
        }
        legalDetailsEditorViewModel.updateFileFieldsByFilePicker(parse, requestCode);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        h viewModelOwnerProvider;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        LegalDetailsEditorViewModel legalDetailsEditorViewModel = null;
        LegalDetailsEditorComponent legalDetailsEditorComponent = (LegalDetailsEditorComponent) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(LegalDetailsEditorComponent.class));
        if (legalDetailsEditorComponent == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null && (viewModelOwnerProvider = references2.getViewModelOwnerProvider()) != null) {
            final a<LegalDetailsEditorViewModel> viewModel = legalDetailsEditorComponent.getViewModel();
            legalDetailsEditorViewModel = (LegalDetailsEditorViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.LegalDetailsFileSelectConfigurator$onComposerInitialized$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    LegalDetailsEditorViewModel legalDetailsEditorViewModel2 = (LegalDetailsEditorViewModel) a.this.get();
                    Intrinsics.g(legalDetailsEditorViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return legalDetailsEditorViewModel2;
                }
            }).a(LegalDetailsEditorViewModel.class);
        }
        this.viewModel = legalDetailsEditorViewModel;
    }
}
