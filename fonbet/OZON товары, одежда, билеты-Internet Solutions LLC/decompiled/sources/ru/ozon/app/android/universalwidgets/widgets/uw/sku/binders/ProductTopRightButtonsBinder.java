package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Vg.c;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsAdapterMain;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsDecoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderUtils;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0011\u001a\u00020\u00102\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u00072\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductTopRightButtonsBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/product/common/product/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;", "adapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;", "Landroidx/recyclerview/widget/RecyclerView;", "topRightButtonsRv$delegate", "LSc/j;", "getTopRightButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "topRightButtonsRv", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductTopRightButtonsBinder extends ProductActionSheetBinder {
    private TopRightButtonsAdapterMain adapter;

    /* renamed from: topRightButtonsRv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRightButtonsRv;

    @NotNull
    private final TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils;

    public ProductTopRightButtonsBinder(@NotNull TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils) {
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderUtils, "topRightButtonsViewHolderUtils");
        this.topRightButtonsViewHolderUtils = topRightButtonsViewHolderUtils;
        this.topRightButtonsRv = k.a(n.NONE, new ProductTopRightButtonsBinder$topRightButtonsRv$2(this));
    }

    private final RecyclerView getTopRightButtonsRv() {
        return (RecyclerView) this.topRightButtonsRv.getValue();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void attach(@NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        getTopRightButtonsRv().setAdapter(this.adapter);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void detach() {
        getTopRightButtonsRv().setAdapter(null);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull ru.ozon.composer.ui.widget.k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.adapter = new TopRightButtonsAdapterMain(this.topRightButtonsViewHolderUtils, composerReferences);
        getTopRightButtonsRv().addItemDecoration(new TopRightButtonsDecoration());
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((ProductTopRightButtonsBinder) product, info, holder);
        TopRightButtonsAdapterMain topRightButtonsAdapterMain = this.adapter;
        if (topRightButtonsAdapterMain != null) {
            topRightButtonsAdapterMain.setTrackingData(holder.getTrackingData());
            topRightButtonsAdapterMain.setWidgetViewItem(holder.getViewItem());
            topRightButtonsAdapterMain.setActionHandler(getHandler());
            topRightButtonsAdapterMain.submitList(product.getTopRightButtons());
        }
    }
}
