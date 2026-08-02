package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Pc.a;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/B0;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "catalogTabsSharedViewModelProvider", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "createCatalogueTabsViewModel", "(Landroidx/lifecycle/B0;LPc/a;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsViewModelFactoryKt {
    @NotNull
    public static final CatalogueTabsViewModel createCatalogueTabsViewModel(@NotNull B0 b02, @NotNull final a<CatalogTabsSharedViewModel> catalogTabsSharedViewModelProvider) {
        Intrinsics.checkNotNullParameter(b02, "<this>");
        Intrinsics.checkNotNullParameter(catalogTabsSharedViewModelProvider, "catalogTabsSharedViewModelProvider");
        final CatalogTabsSharedViewModel catalogTabsSharedViewModel = (CatalogTabsSharedViewModel) new z0(b02, new z0.c() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModelFactoryKt$createCatalogueTabsViewModel$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CatalogTabsSharedViewModel catalogTabsSharedViewModel2 = (CatalogTabsSharedViewModel) a.this.get();
                Intrinsics.g(catalogTabsSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return catalogTabsSharedViewModel2;
            }
        }).a(CatalogTabsSharedViewModel.class);
        return (CatalogueTabsViewModel) new z0(b02, new z0.c() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModelFactoryKt$createCatalogueTabsViewModel$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.f(CatalogTabsSharedViewModel.this);
                return new CatalogueTabsViewModel(new CatalogTabsController(CatalogTabsSharedViewModel.this));
            }
        }).a(CatalogueTabsViewModel.class);
    }
}
