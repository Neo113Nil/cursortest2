package ru.ozon.app.android.pdp.ui.configurators.monetization.bloggerFormSubmit;

import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator;
import ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsViewModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/bloggerFormSubmit/BloggerRefreshMainPageConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/RefreshByFragmentResultPageConfigurator;", "<init>", "()V", "onRefreshed", "", "requestKey", "", "clearSelections", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BloggerRefreshMainPageConfigurator extends RefreshByFragmentResultPageConfigurator {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BloggerRefreshMainPageConfigurator() {
        super(C7705l.j0(elements));
        String[] elements = {"REFRESH_BLOGGER_MAIN_PAGE_AFTER_FORM_SUBMIT_REQUEST_KEY", "REFRESH_BLOGGER_MAIN_PAGE_AFTER_INPUT_SUBMIT_REQUEST_KEY"};
        Intrinsics.checkNotNullParameter(elements, "elements");
    }

    private final void clearSelections() {
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = getReferences();
        SelectedProductsViewModel selectedProductsViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) ? null : (SelectedProductsViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.bloggerFormSubmit.BloggerRefreshMainPageConfigurator$clearSelections$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new SelectedProductsViewModel();
            }
        }).a(SelectedProductsViewModel.class);
        if (selectedProductsViewModel != null) {
            selectedProductsViewModel.clearProducts();
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator
    protected void onRefreshed(@NotNull String requestKey) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        if (Intrinsics.d(requestKey, "REFRESH_BLOGGER_MAIN_PAGE_AFTER_FORM_SUBMIT_REQUEST_KEY")) {
            clearSelections();
        }
    }
}
