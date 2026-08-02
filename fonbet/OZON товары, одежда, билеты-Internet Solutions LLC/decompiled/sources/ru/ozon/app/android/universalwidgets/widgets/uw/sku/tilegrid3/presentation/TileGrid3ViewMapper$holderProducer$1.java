package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation;

import Vg.c;
import Vg.d;
import Vg.f;
import WZ.l;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileFavoriteButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/TileGrid3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TileGrid3ViewHolder> {
    final /* synthetic */ TileGrid3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid3ViewMapper$holderProducer$1(TileGrid3ViewMapper tileGrid3ViewMapper) {
        super(2);
        this.this$0 = tileGrid3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileGrid3ViewHolder invoke(View view, ComposerReferences refs) {
        Set<? extends Class<? extends f>> set;
        boolean isPdpOfflineModeEnabled;
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        SmallTileMoleculeView smallTileMoleculeView = view instanceof SmallTileMoleculeView ? (SmallTileMoleculeView) view : null;
        if (smallTileMoleculeView == null) {
            throw new IllegalStateException("The view is not a SmallTileMoleculeView");
        }
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        set = this.this$0.customActionHandlers;
        c create = customActionHandlersStoreFactory.create(set);
        FrameBinder frameBinder = this.this$0.component().getFrameBinder();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        RecyclerView composerRecyclerView = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2);
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        PlayerPreloader playerPreloader = this.this$0.component().getPlayerPreloader();
        isPdpOfflineModeEnabled = this.this$0.isPdpOfflineModeEnabled();
        PdpOfflineScreenWidgetsData offlineScreenWidgetsData = isPdpOfflineModeEnabled ? this.this$0.component().getOfflineScreenWidgetsData() : null;
        TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper = this.this$0.component().getTilesOpenPdpOfflineProductMapper();
        SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder = this.this$0.component().getAddToCartButtonBinderProvider().get();
        Intrinsics.checkNotNullExpressionValue(smallTileAddToCartButtonBinder, "get(...)");
        return new TileGrid3ViewHolder(smallTileMoleculeView, refs, create, new SmallTileMoleculeDelegate(smallTileMoleculeView, frameBinder, composerRecyclerView, tokenizedAnalytics, playerPreloader, offlineScreenWidgetsData, tilesOpenPdpOfflineProductMapper, smallTileAddToCartButtonBinder, new SmallTileFavoriteButtonBinder(smallTileMoleculeView, this.this$0.component().getFavoriteDelegateProvider().get(refs)), this.this$0.component().getBlurDelegateProvider().provide(), this.this$0.component().getAdultHandler(), null, null, 6144, null));
    }
}
