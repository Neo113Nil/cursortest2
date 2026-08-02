package ru.ozon.app.android.search.deeplink;

import Bi.k;
import Pc.a;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.material.bottomsheet.b;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/deeplink/SearchByImageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "searchByImageViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "onComposerInitialized", "", "checkIfSearchOnboarding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchByImageConfigurator extends ComposerScreenConfig.PageConfigurator {
    private SearchByImageViewModel searchByImageViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIfSearchOnboarding() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        ConfiguratorReferences references = getReferences();
        ComponentCallbacksC5392m parentFragment = (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) ? null : c11.getParentFragment();
        if (parentFragment instanceof b) {
            ((b) parentFragment).dismiss();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C7475g composerWidgetComponentStorage;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        SearchBarComponent searchBarComponent = (SearchBarComponent) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(SearchBarComponent.class));
        if (searchBarComponent == null) {
            return;
        }
        final a<SearchByImageViewModel> searchPhotoViewModel = searchBarComponent.searchPhotoViewModel();
        SearchByImageViewModel searchByImageViewModel = (SearchByImageViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.deeplink.SearchByImageConfigurator$onComposerInitialized$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SearchByImageViewModel searchByImageViewModel2 = (SearchByImageViewModel) a.this.get();
                Intrinsics.g(searchByImageViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return searchByImageViewModel2;
            }
        }).a(SearchByImageViewModel.class);
        ComponentCallbacksC5392m c11 = references.getOwnerContainer().c();
        if (c11 != null) {
            int i11 = k.f3828a;
            Ti.a i12 = k.a.i(c11, new SearchByImageConfigurator$onComposerInitialized$2$galleryLauncher$1(this, searchByImageViewModel), 7);
            C7475g composerWidgetComponentStorage2 = references.getComposerWidgetComponentStorage();
            if (composerWidgetComponentStorage2.hasComponent(GalleryLauncherComponent.class)) {
                ((GalleryLauncherComponent) composerWidgetComponentStorage2.getComponent(GalleryLauncherComponent.class)).setGalleryLauncher(i12);
            } else {
                composerWidgetComponentStorage2.a(GalleryLauncherComponent.INSTANCE.create(i12));
            }
        }
        if (searchByImageViewModel == null) {
            return;
        }
        this.searchByImageViewModel = searchByImageViewModel;
    }
}
