package ru.ozon.app.android.common.productselectormobile.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.productselectormobile.PickerRefreshLinkStore;
import ru.ozon.app.android.common.productselectormobile.presentation.ProductSelectorMobileViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/productselectormobile/presentation/ProductSelectorMobileViewHolder;", "containerView", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProductSelectorMobileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProductSelectorMobileViewHolder> {
    final /* synthetic */ HandlersInhibitor $handlersInhibitor;
    final /* synthetic */ PickerRefreshLinkStore $refreshLinkStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductSelectorMobileViewMapper$holderProducer$1(HandlersInhibitor handlersInhibitor, PickerRefreshLinkStore pickerRefreshLinkStore) {
        super(2);
        this.$handlersInhibitor = handlersInhibitor;
        this.$refreshLinkStore = pickerRefreshLinkStore;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductSelectorMobileViewHolder invoke(View containerView, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        return new ProductSelectorMobileViewHolder(containerView, ref, this.$handlersInhibitor, this.$refreshLinkStore);
    }
}
