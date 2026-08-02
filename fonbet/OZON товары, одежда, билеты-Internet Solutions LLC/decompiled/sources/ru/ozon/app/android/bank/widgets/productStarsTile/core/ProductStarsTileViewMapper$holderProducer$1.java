package ru.ozon.app.android.bank.widgets.productStarsTile.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetVH;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProductStarsTileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProductStarsTileWidgetVH> {
    final /* synthetic */ ProductStarsTileViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductStarsTileViewMapper$holderProducer$1(ProductStarsTileViewMapper productStarsTileViewMapper) {
        super(2);
        this.this$0 = productStarsTileViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductStarsTileWidgetVH invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final ProductStarsTileViewMapper productStarsTileViewMapper = this.this$0;
        return new ProductStarsTileWidgetVH((ProductStarsTileView) view, (ProductStarsTileWidgetViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ProductStarsTileWidgetViewModel viewModel = ProductStarsTileViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(ProductStarsTileWidgetViewModel.class), ref);
    }
}
