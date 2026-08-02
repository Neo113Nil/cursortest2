package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer;

import Vg.d;
import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer.TileGrid2CartContainerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandlerImpl;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartContainer/TileGrid2CartContainerViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2CartContainerViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TileGrid2CartContainerViewHolder> {
    final /* synthetic */ TileGrid2CartContainerViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer.TileGrid2CartContainerViewMapper$holderProducer$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<SelectionProductsEventsHandler> {
        final /* synthetic */ TileOverlayBinder $overlayBinder;
        final /* synthetic */ TileGrid2CartContainerViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TileGrid2CartContainerViewMapper tileGrid2CartContainerViewMapper, TileOverlayBinder tileOverlayBinder) {
            super(0);
            this.this$0 = tileGrid2CartContainerViewMapper;
            this.$overlayBinder = tileOverlayBinder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SelectionProductsEventsHandler invoke() {
            return new SelectionProductsEventsHandlerImpl.Creator(this.this$0.component().getSelectionProductsEventManager(), this.this$0.component().getSelectionProductsEventsMap(), this.$overlayBinder).createForButtons();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2CartContainerViewMapper$holderProducer$1(TileGrid2CartContainerViewMapper tileGrid2CartContainerViewMapper) {
        super(2);
        this.this$0 = tileGrid2CartContainerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileGrid2CartContainerViewHolder invoke(View view, ComposerReferences refs) {
        i iVar;
        TileGrid2CartContainerViewMapper.Companion companion;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TileGrid2SingleCartContainerView tileGrid2SingleCartContainerView = (TileGrid2SingleCartContainerView) view;
        TileOverlayBinder tileOverlayBinder = new TileOverlayBinder(this.this$0.component().getTileDislikeInteractor(), refs, false, tileGrid2SingleCartContainerView.getOverlayView());
        AddToCartContainerBinder addToCartContainerBinder = this.this$0.component().getAddToCartContainerBinder();
        iVar = this.this$0.container;
        addToCartContainerBinder.setup(iVar);
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        companion = TileGrid2CartContainerViewMapper.Companion;
        return new TileGrid2CartContainerViewHolder(tileGrid2SingleCartContainerView, refs, addToCartContainerBinder, tokenizedAnalytics, customActionHandlersStoreFactory.create(companion.getCustomActionHandlers()), this.this$0.component().getFrameBinder(), this.this$0.component().getTileRelatedBottomSheetDelegate(), tileOverlayBinder, this.this$0.component().getWishlistServiceLazy(), LazyUtilsKt.unsafeLazy(new AnonymousClass2(this.this$0, tileOverlayBinder)), this.this$0.component().getTileDislikeInteractor());
    }
}
