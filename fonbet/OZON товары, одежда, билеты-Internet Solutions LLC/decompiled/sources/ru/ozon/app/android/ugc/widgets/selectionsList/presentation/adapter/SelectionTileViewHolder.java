package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.adapter;

import W10.c;
import WZ.l;
import WZ.t;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.SelectionTileView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/adapter/SelectionTileViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;LWZ/l;)V", "", "onViewInOverlapBounds", "()V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "favProductMoleculeDelegate", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;Lkotlin/jvm/functions/Function1;LW10/c;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;", "getView", "()Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;", "LWZ/l;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "currentItem", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionTileViewHolder extends j {
    private SelectionsListVI.SelectionsListItemVI currentItem;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SelectionTileView view;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionTileViewHolder(@NotNull SelectionTileView view, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void bind(@NotNull SelectionsListVI.SelectionsListItemVI.TileItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull c trackingData, ru.ozon.composer.ui.widget.l viewItem, @NotNull FavoriteProductDelegate favProductMoleculeDelegate) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        this.currentItem = item;
        this.view.bind(item, actionHandler, trackingData, viewItem, favProductMoleculeDelegate);
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        SelectionsListVI.SelectionItemCommon selectionItemCommon;
        t tokenizedEvent;
        super.onViewInOverlapBounds();
        SelectionsListVI.SelectionsListItemVI selectionsListItemVI = this.currentItem;
        if (selectionsListItemVI == null || (selectionItemCommon = selectionsListItemVI.getSelectionItemCommon()) == null || (tokenizedEvent = selectionItemCommon.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
