package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation;

import Vg.c;
import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.multiframe.BinderFrameWrapper;
import ru.ozon.app.android.product.multiframe.MultiFrameBinderDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.ProductViewHolder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/presentation/SkuGrid2ViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/ProductViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "", "Lru/ozon/app/android/product/multiframe/BinderFrameWrapper;", "Lru/ozon/app/android/product/common/product/ProductVO;", "productPropertyBinders", "Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;", "frameBinder", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Ljava/util/Set;Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;LVg/c;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuGrid2ViewHolder extends ProductViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuGrid2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull Set<BinderFrameWrapper<ProductVO>> productPropertyBinders, @NotNull MultiFrameBinderDelegate<ProductVO> frameBinder, @NotNull c customActionHandlersStore) {
        super(containerView, composerReferences, productPropertyBinders, frameBinder, customActionHandlersStore);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(productPropertyBinders, "productPropertyBinders");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
    }
}
