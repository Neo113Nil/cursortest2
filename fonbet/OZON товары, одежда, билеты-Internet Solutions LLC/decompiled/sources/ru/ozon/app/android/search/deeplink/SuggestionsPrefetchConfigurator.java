package ru.ozon.app.android.search.deeplink;

import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/deeplink/SuggestionsPrefetchConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchViewModel;", "prefetchViewModel", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "modifySearchUrlViewModel", "<init>", "(LPc/a;Lru/ozon/app/android/common/SearchUrlPrefetchService;LPc/a;)V", "", "onComposerInitialized", "()V", "LPc/a;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuggestionsPrefetchConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ModifySearchUrlViewModel> modifySearchUrlViewModel;

    @NotNull
    private final a<SuggestionsPrefetchViewModel> prefetchViewModel;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    public SuggestionsPrefetchConfigurator(@NotNull a<SuggestionsPrefetchViewModel> prefetchViewModel, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull a<ModifySearchUrlViewModel> modifySearchUrlViewModel) {
        Intrinsics.checkNotNullParameter(prefetchViewModel, "prefetchViewModel");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(modifySearchUrlViewModel, "modifySearchUrlViewModel");
        this.prefetchViewModel = prefetchViewModel;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.modifySearchUrlViewModel = modifySearchUrlViewModel;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        SuggestionsPrefetchViewModel suggestionsPrefetchViewModel = (SuggestionsPrefetchViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.deeplink.SuggestionsPrefetchConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SuggestionsPrefetchConfigurator.this.prefetchViewModel;
                SuggestionsPrefetchViewModel suggestionsPrefetchViewModel2 = (SuggestionsPrefetchViewModel) aVar.get();
                Intrinsics.g(suggestionsPrefetchViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return suggestionsPrefetchViewModel2;
            }
        }).a(SuggestionsPrefetchViewModel.class);
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null) {
            return;
        }
        suggestionsPrefetchViewModel.getLinksForPrefetch().observe(getOwner(), new SuggestionsPrefetchConfigurator$sam$androidx_lifecycle_Observer$0(new SuggestionsPrefetchConfigurator$onComposerInitialized$1(this, (ModifySearchUrlViewModel) new z0(references2.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.deeplink.SuggestionsPrefetchConfigurator$onComposerInitialized$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SuggestionsPrefetchConfigurator.this.modifySearchUrlViewModel;
                ModifySearchUrlViewModel modifySearchUrlViewModel = (ModifySearchUrlViewModel) aVar.get();
                Intrinsics.g(modifySearchUrlViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return modifySearchUrlViewModel;
            }
        }).a(ModifySearchUrlViewModel.class))));
    }
}
