package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import T00.a;
import Vg.c;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.TileActionSheetHandler;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonActionListener;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010!\u001a\u00020 2\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u00132\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"J7\u0010(\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u0012\u0010'\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020 2\u0012\u0010'\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetProxyBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;", "messageProcesser", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetBinder;", "binders", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/product/TileActionSheetHandlerFactory;Ljava/util/Set;)V", "", "id", "", "currentUrl", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "buildActionHandler", "(JLjava/lang/String;Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "()V", "recycle", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "Ljava/util/Set;", "Lru/ozon/app/android/product/TileActionSheetHandler;", "atomActionSheetHandler", "Lru/ozon/app/android/product/TileActionSheetHandler;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductActionSheetProxyBinder extends ProductPropertyBinder<ProductVO> {
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

    /* JADX WARN: Multi-variable type inference failed */
    public ProductActionSheetProxyBinder(@NotNull SecondaryButtonMessageProcesser messageProcesser, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull TileActionSheetHandlerFactory sheetHandlerFactory, @NotNull Set<? extends ProductActionSheetBinder> binders) {
        Intrinsics.checkNotNullParameter(messageProcesser, "messageProcesser");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(sheetHandlerFactory, "sheetHandlerFactory");
        Intrinsics.checkNotNullParameter(binders, "binders");
        this.messageProcesser = messageProcesser;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.sheetHandlerFactory = sheetHandlerFactory;
        this.binders = binders;
    }

    private final DisposableActionHandler buildActionHandler(long id2, String currentUrl, k<?> viewHolder) {
        return new ActionHandler.Builder(getComposerReferences(), viewHolder).setCurrentPageUrl(currentUrl).onPreProcess(new ProductActionSheetProxyBinder$buildActionHandler$1(this)).customActionHandlers(new ProductActionSheetProxyBinder$buildActionHandler$2(this)).buildDisposableHandlerForListWidgets(id2, viewHolder.getLifecycle(), this.actionSheetEventHandler);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void attach(@NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.attach(holder);
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).attach(holder);
        }
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, k kVar) {
        bind2(productVO, dVar, (k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void detach() {
        super.detach();
        TileActionSheetHandler tileActionSheetHandler = this.atomActionSheetHandler;
        if (tileActionSheetHandler != null) {
            tileActionSheetHandler.clear();
        }
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).detach();
        }
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
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

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void recycle() {
        super.recycle();
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((ProductActionSheetBinder) it.next()).recycle();
        }
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        String str;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((ProductActionSheetProxyBinder) product, info, holder);
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
}
