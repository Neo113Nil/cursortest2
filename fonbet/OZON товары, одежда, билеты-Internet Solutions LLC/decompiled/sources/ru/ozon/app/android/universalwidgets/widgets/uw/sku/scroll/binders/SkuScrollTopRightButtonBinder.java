package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import T00.a;
import Vg.c;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonActionListener;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsAdapterMain;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsDecoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderUtils;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010 \u001a\u00020\u001f2\u0012\u0010\u0017\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$2\u0012\u0010&\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u0012H\u0016¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u001f2\u0012\u0010&\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollTopRightButtonBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;", "messagesProcessor", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;Lru/ozon/app/android/product/TileActionSheetHandlerFactory;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;)V", "", "id", "", "currentUrl", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "buildActionHandler", "(JLjava/lang/String;Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Landroidx/recyclerview/widget/RecyclerView;", "topRightButtonsRV$delegate", "LSc/j;", "getTopRightButtonsRV", "()Landroidx/recyclerview/widget/RecyclerView;", "topRightButtonsRV", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;", "topRightButtonsAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;", "getTopRightButtonsAdapter", "()Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;", "setTopRightButtonsAdapter", "(Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;)V", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "atomActionSheetHandler", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "disposableActionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollTopRightButtonBinder extends ProductPropertyBinder<ProductVO> {

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;
    private AtomActionSheetHandler atomActionSheetHandler;
    private DisposableActionHandler disposableActionHandler;

    @NotNull
    private final SecondaryButtonMessageProcesser messagesProcessor;

    @NotNull
    private final TileActionSheetHandlerFactory sheetHandlerFactory;
    private TopRightButtonsAdapterMain topRightButtonsAdapter;

    /* renamed from: topRightButtonsRV$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRightButtonsRV;

    @NotNull
    private final TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils;

    public SkuScrollTopRightButtonBinder(@NotNull TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, @NotNull TileActionSheetHandlerFactory sheetHandlerFactory, @NotNull SecondaryButtonMessageProcesser messagesProcessor, @NotNull ActionSheetEventHandler actionSheetEventHandler) {
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderUtils, "topRightButtonsViewHolderUtils");
        Intrinsics.checkNotNullParameter(sheetHandlerFactory, "sheetHandlerFactory");
        Intrinsics.checkNotNullParameter(messagesProcessor, "messagesProcessor");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        this.topRightButtonsViewHolderUtils = topRightButtonsViewHolderUtils;
        this.sheetHandlerFactory = sheetHandlerFactory;
        this.messagesProcessor = messagesProcessor;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.topRightButtonsRV = k.a(n.NONE, new SkuScrollTopRightButtonBinder$topRightButtonsRV$2(this));
    }

    private final DisposableActionHandler buildActionHandler(long id2, String currentUrl, ru.ozon.composer.ui.widget.k<?> vh2) {
        AbstractC5434v lifecycle;
        ru.ozon.composer.ui.widget.k<?> kVar = vh2 != null ? vh2 : null;
        if (kVar == null || (lifecycle = kVar.getLifecycle()) == null) {
            lifecycle = getComposerReferences().getContainer().f().getLifecycle();
        }
        AtomActionSheetHandler atomActionSheetHandler = this.atomActionSheetHandler;
        if (atomActionSheetHandler == null) {
            return null;
        }
        return new ActionHandler.Builder(getComposerReferences(), vh2).setCurrentPageUrl(currentUrl).onPreProcess(new SkuScrollTopRightButtonBinder$buildActionHandler$1(atomActionSheetHandler)).customActionHandlers(new SkuScrollTopRightButtonBinder$buildActionHandler$2(this)).buildDisposableHandlerForListWidgets(id2, lifecycle, this.actionSheetEventHandler);
    }

    private final RecyclerView getTopRightButtonsRV() {
        return (RecyclerView) this.topRightButtonsRV.getValue();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void attach(@NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.attach(holder);
        getTopRightButtonsRV().setAdapter(this.topRightButtonsAdapter);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void detach() {
        super.detach();
        getTopRightButtonsRV().setAdapter(null);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull ru.ozon.composer.ui.widget.k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.atomActionSheetHandler = this.sheetHandlerFactory.create(composerReferences, new SecondaryButtonActionListener(composerReferences, this.messagesProcessor));
        this.topRightButtonsAdapter = new TopRightButtonsAdapterMain(this.topRightButtonsViewHolderUtils, composerReferences);
        RecyclerView topRightButtonsRV = getTopRightButtonsRV();
        topRightButtonsRV.setItemAnimator(null);
        topRightButtonsRV.addItemDecoration(new TopRightButtonsDecoration());
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        String str;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((SkuScrollTopRightButtonBinder) product, info, holder);
        AtomActionSheetHandler atomActionSheetHandler = this.atomActionSheetHandler;
        if (atomActionSheetHandler != null) {
            atomActionSheetHandler.setWidgetViewItem(holder.getViewItem());
        }
        AtomActionSheetHandler atomActionSheetHandler2 = this.atomActionSheetHandler;
        if (atomActionSheetHandler2 != null) {
            atomActionSheetHandler2.setTrackingData(holder.getTrackingData());
        }
        DisposableActionHandler disposableActionHandler = this.disposableActionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        long id2 = product.getId();
        a b11 = info.b();
        if (b11 == null || (str = b11.c()) == null) {
            str = "";
        }
        this.disposableActionHandler = buildActionHandler(id2, str, holder);
        TopRightButtonsAdapterMain topRightButtonsAdapterMain = this.topRightButtonsAdapter;
        if (topRightButtonsAdapterMain != null) {
            topRightButtonsAdapterMain.setTrackingData(holder.getTrackingData());
            topRightButtonsAdapterMain.setWidgetViewItem(holder.getViewItem());
            DisposableActionHandler disposableActionHandler2 = this.disposableActionHandler;
            topRightButtonsAdapterMain.setActionHandler(disposableActionHandler2 != null ? disposableActionHandler2.getHandler() : null);
            topRightButtonsAdapterMain.submitList(product.getTopRightButtons());
        }
    }
}
