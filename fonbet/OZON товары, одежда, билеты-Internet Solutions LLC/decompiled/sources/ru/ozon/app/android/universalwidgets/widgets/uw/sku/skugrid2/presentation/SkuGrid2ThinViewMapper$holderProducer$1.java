package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation;

import Vg.d;
import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.multiframe.BinderFrameWrapper;
import ru.ozon.app.android.product.multiframe.MultiFrameBinderDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverThinBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBackgroundBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBottomBadgesBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductStateRecyclerViewBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ThinViewMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/presentation/SkuGrid2ViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SkuGrid2ThinViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SkuGrid2ViewHolder> {
    final /* synthetic */ SkuGrid2ThinViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuGrid2ThinViewMapper$holderProducer$1(SkuGrid2ThinViewMapper skuGrid2ThinViewMapper) {
        super(2);
        this.this$0 = skuGrid2ThinViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SkuGrid2ViewHolder invoke(View view, ComposerReferences ref) {
        SkuGrid2ThinViewMapper.Companion companion;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ProductAdultImageWithVideoCoverThinBinder productAdultImageWithVideoCoverThinBinder = this.this$0.component().getPProductImageThinBinder().get();
        Intrinsics.checkNotNullExpressionValue(productAdultImageWithVideoCoverThinBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper = new BinderFrameWrapper(0, productAdultImageWithVideoCoverThinBinder);
        ProductStateRecyclerViewBinder productStateRecyclerViewBinder = this.this$0.component().getPProductStateBinder().get();
        Intrinsics.checkNotNullExpressionValue(productStateRecyclerViewBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper2 = new BinderFrameWrapper(3, productStateRecyclerViewBinder);
        ProductBottomBadgesBinder productBottomBadgesBinder = this.this$0.component().getPProductBadgesBinder().get();
        Intrinsics.checkNotNullExpressionValue(productBottomBadgesBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper3 = new BinderFrameWrapper(4, productBottomBadgesBinder);
        BinderFrameWrapper binderFrameWrapper4 = new BinderFrameWrapper(5, this.this$0.component().getPProductActionSheetProxyBinderFactory().get().createWithoutSecondary());
        ProductBackgroundBinder productBackgroundBinder = this.this$0.component().getPProductBackgroundBinder().get();
        Intrinsics.checkNotNullExpressionValue(productBackgroundBinder, "get(...)");
        BinderFrameWrapper[] elements = {binderFrameWrapper, binderFrameWrapper2, binderFrameWrapper3, binderFrameWrapper4, new BinderFrameWrapper(0, productBackgroundBinder)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        FrameBinder frameBinder = ref.getFrameBinderProvider().get();
        Intrinsics.checkNotNullExpressionValue(frameBinder, "get(...)");
        MultiFrameBinderDelegate multiFrameBinderDelegate = new MultiFrameBinderDelegate(j02, frameBinder);
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        companion = SkuGrid2ThinViewMapper.Companion;
        return new SkuGrid2ViewHolder(view, ref, j02, multiFrameBinderDelegate, customActionHandlersStoreFactory.create(companion.getCustomActionHandlers()));
    }
}
