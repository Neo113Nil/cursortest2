package ru.ozon.app.android.search.catalog.components.productselectormobiledata.core;

import A00.a;
import android.view.View;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.ProductSelectorLoadingDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\t\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/ProductSelectorLoadingDelegate;", "", "Landroid/view/View;", "progressView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "bindIsCalled", "()V", "onRemove", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "", "Z", "Landroidx/lifecycle/W;", "LA00/a;", "loadingObserver", "Landroidx/lifecycle/W;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductSelectorLoadingDelegate {
    private boolean bindIsCalled;

    @NotNull
    private final W<a> loadingObserver;

    @NotNull
    private final View progressView;

    @NotNull
    private final ComposerReferences references;

    public ProductSelectorLoadingDelegate(@NotNull View progressView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.progressView = progressView;
        this.references = references;
        W<a> w11 = new W() { // from class: XH.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                ProductSelectorLoadingDelegate.loadingObserver$lambda$0(ProductSelectorLoadingDelegate.this, (A00.a) obj);
            }
        };
        this.loadingObserver = w11;
        references.getController().getEvents().observe(references.getContainer().g(), w11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadingObserver$lambda$0(ProductSelectorLoadingDelegate productSelectorLoadingDelegate, a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof a.I) {
            boolean e11 = ((a.I) it).e();
            View view = productSelectorLoadingDelegate.progressView;
            if (e11) {
                ViewExtKt.show(view);
                return;
            } else {
                ViewExtKt.gone(view);
                return;
            }
        }
        if (it instanceof a.C2370k) {
            if (productSelectorLoadingDelegate.bindIsCalled) {
                productSelectorLoadingDelegate.bindIsCalled = false;
            } else {
                ViewExtKt.gone(productSelectorLoadingDelegate.progressView);
            }
        }
    }

    public final void bindIsCalled() {
        this.bindIsCalled = true;
    }

    public final void onRemove() {
        this.references.getController().getEvents().removeObserver(this.loadingObserver);
    }
}
