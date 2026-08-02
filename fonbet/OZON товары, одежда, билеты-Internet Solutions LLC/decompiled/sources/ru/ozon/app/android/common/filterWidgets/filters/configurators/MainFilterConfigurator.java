package ru.ozon.app.android.common.filterWidgets.filters.configurators;

import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/configurators/MainFilterConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "vmProvider", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "LPc/a;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainFilterConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<FilterSharedViewModel> vmProvider;

    public MainFilterConfigurator(@NotNull a<FilterSharedViewModel> vmProvider) {
        Intrinsics.checkNotNullParameter(vmProvider, "vmProvider");
        this.vmProvider = vmProvider;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        FilterSharedViewModel filterSharedViewModel;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (filterSharedViewModel = (FilterSharedViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.common.filterWidgets.filters.configurators.MainFilterConfigurator$onComposerInitialized$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = MainFilterConfigurator.this.vmProvider;
                FilterSharedViewModel filterSharedViewModel2 = (FilterSharedViewModel) aVar.get();
                Intrinsics.g(filterSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return filterSharedViewModel2;
            }
        }).a(FilterSharedViewModel.class)) == null) {
            return;
        }
        filterSharedViewModel.getRefreshUrl().observe(references.getOwnerContainer().f(), new MainFilterConfigurator$sam$androidx_lifecycle_Observer$0(new MainFilterConfigurator$onComposerInitialized$1(filterSharedViewModel, references)));
    }
}
