package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProductsInBotV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProductsInBotV2ViewHolder> {
    final /* synthetic */ ProductsInBotV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsInBotV2ViewMapper$holderProducer$1(ProductsInBotV2ViewMapper productsInBotV2ViewMapper) {
        super(2);
        this.this$0 = productsInBotV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductsInBotV2ViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final ProductsInBotV2ViewMapper productsInBotV2ViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ProductsInBotV2ViewModel productsInBotV2ViewModel = ProductsInBotV2ViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(productsInBotV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return productsInBotV2ViewModel;
            }
        }).a(ProductsInBotV2ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new ProductsInBotV2ViewHolder((ProductsInBotV2View) view, composerReferences, tokenizedAnalytics, (ProductsInBotV2ViewModel) a12);
    }
}
