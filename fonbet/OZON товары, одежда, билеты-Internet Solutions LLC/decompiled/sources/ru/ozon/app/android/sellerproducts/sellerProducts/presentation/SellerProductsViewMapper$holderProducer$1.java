package ru.ozon.app.android.sellerproducts.sellerProducts.presentation;

import Vg.d;
import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.SingleFrameBinder;
import ru.ozon.app.android.sellerproducts.di.SellerProductsComponent;
import ru.ozon.app.android.sellerproducts.sellerProducts.multiframe.BinderFrameWrapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.multiframe.BinderFrameWrapperKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.multiframe.MultiFrameBinderDelegate;
import ru.ozon.app.android.sellerproducts.sellerProducts.presentation.SellerProductsViewMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/sellerproducts/sellerProducts/presentation/ProductViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SellerProductsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProductViewHolder> {
    final /* synthetic */ SellerProductsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerProductsViewMapper$holderProducer$1(SellerProductsViewMapper sellerProductsViewMapper) {
        super(2);
        this.this$0 = sellerProductsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductViewHolder invoke(View view, ComposerReferences ref) {
        SingleFrameBinder frameBinder;
        SellerProductsViewMapper.Companion companion;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        SellerProductsComponent component = this.this$0.component();
        BinderFrameWrapper[] elements = {BinderFrameWrapperKt.asFrameWrapper$default(component.getProductAdultImageWithVideoCoverBinder(), 0, 1, null), BinderFrameWrapperKt.asFrameWrapper(component.getProductButtonBinder(), 1), BinderFrameWrapperKt.asFrameWrapper(component.getProductButtonSubtitleBinder(), 1), BinderFrameWrapperKt.asFrameWrapper(component.getProductStateRecyclerViewBinder(), 2), BinderFrameWrapperKt.asFrameWrapper(component.getProductBadgesBinder(), 3), BinderFrameWrapperKt.asFrameWrapper(component.getProductActionSheetProxyBinder(), 4), BinderFrameWrapperKt.asFrameWrapper$default(component.getProductOverlayBinder().get(), 0, 1, null), BinderFrameWrapperKt.asFrameWrapper$default(component.getProductBackgroundBinder(), 0, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        frameBinder = this.this$0.getFrameBinder();
        MultiFrameBinderDelegate multiFrameBinderDelegate = new MultiFrameBinderDelegate(j02, frameBinder);
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        companion = SellerProductsViewMapper.Companion;
        return new ProductViewHolder(view, ref, j02, multiFrameBinderDelegate, customActionHandlersStoreFactory.create(companion.getCustomActionHandlers()));
    }
}
