package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import T00.a;
import Vg.c;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.TileActionSheetHandler;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton.SecondaryButtonActionListener;
import ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010 \u001a\u00020\u001f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u001f2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001fH\u0016¢\u0006\u0004\b-\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetProxyBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/SecondaryButtonMessageProcesser;", "messageProcesser", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductFavoriteButtonBinder;", "productFavoriteButtonBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/SecondaryProductButtonBinder;", "secondaryProductButtonBinder", "<init>", "(Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/SecondaryButtonMessageProcesser;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/product/TileActionSheetHandlerFactory;Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductFavoriteButtonBinder;Lru/ozon/app/android/sellerproducts/sellerProducts/binders/SecondaryProductButtonBinder;)V", "", "id", "", "currentUrl", "Lru/ozon/composer/ui/widget/k;", "viewHolder", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "buildActionHandler", "(JLjava/lang/String;Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "()V", "recycle", "Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/SecondaryButtonMessageProcesser;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "Lru/ozon/app/android/product/TileActionSheetHandler;", "atomActionSheetHandler", "Lru/ozon/app/android/product/TileActionSheetHandler;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetBinder;", "binders", "Ljava/util/Set;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductActionSheetProxyBinder extends ProductPropertyBinder {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;
    private TileActionSheetHandler atomActionSheetHandler;

    @NotNull
    private final Set<ProductActionSheetBinder> binders;

    @NotNull
    private final SecondaryButtonMessageProcesser messageProcesser;

    @NotNull
    private final TileActionSheetHandlerFactory sheetHandlerFactory;

    public ProductActionSheetProxyBinder(@NotNull SecondaryButtonMessageProcesser messageProcesser, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull TileActionSheetHandlerFactory sheetHandlerFactory, @NotNull ProductFavoriteButtonBinder productFavoriteButtonBinder, @NotNull SecondaryProductButtonBinder secondaryProductButtonBinder) {
        Intrinsics.checkNotNullParameter(messageProcesser, "messageProcesser");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(sheetHandlerFactory, "sheetHandlerFactory");
        Intrinsics.checkNotNullParameter(productFavoriteButtonBinder, "productFavoriteButtonBinder");
        Intrinsics.checkNotNullParameter(secondaryProductButtonBinder, "secondaryProductButtonBinder");
        this.messageProcesser = messageProcesser;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.sheetHandlerFactory = sheetHandlerFactory;
        ProductActionSheetBinder[] elements = {productFavoriteButtonBinder, secondaryProductButtonBinder};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.binders = C7705l.j0(elements);
    }

    private final DisposableActionHandler buildActionHandler(long id2, String currentUrl, k<?> viewHolder) {
        return new ActionHandler.Builder(getComposerReferences(), viewHolder).setCurrentPageUrl(currentUrl).onPreProcess(new ProductActionSheetProxyBinder$buildActionHandler$1(this)).buildDisposableHandlerForListWidgets(id2, viewHolder.getLifecycle(), this.actionSheetEventHandler);
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void attach(@NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.attach(holder);
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).attach(holder);
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        String str;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        TileActionSheetHandler tileActionSheetHandler = this.atomActionSheetHandler;
        if (tileActionSheetHandler != null) {
            tileActionSheetHandler.setWidgetViewItem(holder.getViewItem());
        }
        TileActionSheetHandler tileActionSheetHandler2 = this.atomActionSheetHandler;
        if (tileActionSheetHandler2 != null) {
            tileActionSheetHandler2.setTrackingData(holder.getTrackingData());
        }
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        long id2 = product.getId();
        a b11 = info.b();
        if (b11 == null || (str = b11.c()) == null) {
            str = "";
        }
        this.actionHandler = buildActionHandler(id2, str, holder);
        for (ProductActionSheetBinder productActionSheetBinder : this.binders) {
            DisposableActionHandler disposableActionHandler2 = this.actionHandler;
            productActionSheetBinder.setHandler(disposableActionHandler2 != null ? disposableActionHandler2.getHandler() : null);
            productActionSheetBinder.bind(product, info, holder);
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void detach() {
        super.detach();
        TileActionSheetHandler tileActionSheetHandler = this.atomActionSheetHandler;
        if (tileActionSheetHandler != null) {
            tileActionSheetHandler.clear();
        }
        this.atomActionSheetHandler = null;
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).detach();
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.atomActionSheetHandler = this.sheetHandlerFactory.create(composerReferences, new SecondaryButtonActionListener(composerReferences, this.messageProcesser));
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void recycle() {
        super.recycle();
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).recycle();
        }
    }
}
