package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation;

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
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.CatalogTileView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;", "getContainerView", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileViewHolder extends k<CatalogTileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CatalogTileView containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogTileViewHolder(@NotNull CatalogTileView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogTileVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CatalogTileVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CatalogTileViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent2 = item.getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent2, null);
        }
        for (CatalogTileVO.TileVO tileVO : item.getTiles()) {
            t tokenizedEvent3 = tileVO.getTokenizedEvent();
            if (tokenizedEvent3 != null) {
                m.c(this.tokenizedAnalytics, tokenizedEvent3, null);
            }
            CatalogTileVO.FavoriteBadge badge = tileVO.getBadge();
            if (badge != null && (tokenizedEvent = badge.getTokenizedEvent()) != null) {
                m.c(this.tokenizedAnalytics, tokenizedEvent, null);
            }
        }
        this.containerView.setContentDescription("catalogTileWidget");
    }
}
