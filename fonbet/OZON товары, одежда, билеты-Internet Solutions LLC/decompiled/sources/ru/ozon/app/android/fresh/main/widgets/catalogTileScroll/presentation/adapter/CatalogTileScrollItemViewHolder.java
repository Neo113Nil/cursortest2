package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.FavoriteBadgeVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.CatalogScrollTileView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileScrollItemViewHolder extends CatalogTileItemViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CatalogScrollTileView containerView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatalogTileScrollItemViewHolder(@NotNull CatalogScrollTileView containerView, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogTile item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind((CatalogTile.TileItemVO) item, this.tokenizedAnalytics, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CatalogTile item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CatalogTileScrollItemViewHolder) item, trackingData, viewedPond);
        CatalogTile.TileItemVO tileItemVO = (CatalogTile.TileItemVO) item;
        t tokenizedEvent2 = tileItemVO.getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent2, null);
        }
        FavoriteBadgeVO badge = tileItemVO.getBadge();
        if (badge == null || (tokenizedEvent = badge.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, tokenizedEvent, null);
    }
}
