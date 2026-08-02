package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.ItemsListAdapter;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.ItemsListDecorator;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.BarcodeProductsListVI;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u0018\u0010 J)\u0010%\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00170*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/BarcodeProductsListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/BarcodeProductsListView;", "view", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/BarcodeProductsListView;LVg/d;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "", "payload", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/BarcodeProductsListView;", "LVg/d;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/ItemsListAdapter;", "itemsAdapter", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/ItemsListAdapter;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeProductsListViewHolder extends k<BarcodeProductsListVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ItemsListAdapter itemsAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final BarcodeProductsListView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeProductsListViewHolder(@NotNull BarcodeProductsListView view, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics, @NotNull AdultListDelegateProvider adultListDelegateProvider, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new BarcodeProductsListViewHolder$actionHandler$1(this)).enableClickThrottling(handlersInhibitor).buildHandler();
        this.actionHandler = buildHandler;
        ItemsListAdapter itemsListAdapter = new ItemsListAdapter(buildHandler, adultListDelegateProvider, refs);
        this.itemsAdapter = itemsListAdapter;
        RecyclerView itemsList = view.getItemsList();
        itemsList.setAdapter(itemsListAdapter);
        itemsList.addItemDecoration(new ItemsListDecorator());
        itemsList.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
        itemsList.setNestedScrollingEnabled(false);
        itemsList.setItemAnimator(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()));
        view.setBackground(gradientDrawable);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        BarcodeProductsListVI boundData = getBoundData();
        if (boundData == null || boundData.getExpanded()) {
            return;
        }
        this.view.setCollapsedState();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BarcodeProductsListVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BarcodeProductsListVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.clearItemsListHeight();
        CellHolderKt.bind(this.view.getHeaderCell(), item.getHeader(), this.actionHandler);
        this.itemsAdapter.submitList(item.getItems());
        this.view.updateVerticalPadding((int) getResources().getDimension(item.getVerticalPadding().getTop().getCellLayoutPadding()), (int) getResources().getDimension(item.getVerticalPadding().getBottom().getCellLayoutPadding()));
        if (item.getExpanded()) {
            this.view.setExpandedState();
        } else {
            this.view.setCollapsedState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BarcodeProductsListVI item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Boolean bool = payload instanceof Boolean ? (Boolean) payload : null;
        if (bool != null) {
            if (bool.booleanValue()) {
                this.view.startExpandAnimation();
            } else {
                this.view.startCollapseAnimation();
            }
        }
    }
}
