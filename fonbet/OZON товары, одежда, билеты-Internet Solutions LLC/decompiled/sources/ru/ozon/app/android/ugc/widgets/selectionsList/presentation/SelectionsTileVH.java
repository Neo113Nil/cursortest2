package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionsTileVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;", "selectionTileView", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "favProductMoleculeDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;LWZ/l;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;", "LWZ/l;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionsTileVH extends k<SelectionsListVI.SelectionsListItemVI.TileItem> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;

    @NotNull
    private final SelectionTileView selectionTileView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionsTileVH(@NotNull SelectionTileView selectionTileView, @NotNull l tokenizedAnalytics, @NotNull FavoriteProductDelegate favProductMoleculeDelegate, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs) {
        super(selectionTileView);
        Intrinsics.checkNotNullParameter(selectionTileView, "selectionTileView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.selectionTileView = selectionTileView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SelectionsTileVH$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectionsListVI.SelectionsListItemVI.TileItem item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.selectionTileView.bind(item, this.actionHandler, getTrackingData(), getViewItem(), this.favProductMoleculeDelegate);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SelectionsListVI.SelectionsListItemVI.TileItem item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SelectionsTileVH) item, trackingData, viewedPond);
        t widgetViewEvent = item.getWidgetViewEvent();
        if (widgetViewEvent != null) {
            m.c(this.tokenizedAnalytics, widgetViewEvent, null);
        }
        SelectionsListVI.SelectionItemCommon selectionItemCommon = item.getSelectionItemCommon();
        if (selectionItemCommon == null || (tokenizedEvent = selectionItemCommon.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, tokenizedEvent, null);
    }
}
