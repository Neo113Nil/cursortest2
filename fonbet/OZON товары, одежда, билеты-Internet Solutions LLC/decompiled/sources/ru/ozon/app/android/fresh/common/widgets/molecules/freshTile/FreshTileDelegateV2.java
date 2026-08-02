package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import WZ.l;
import WZ.t;
import a00.C4911f;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.ProductMediaDelegate;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jc\u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010\u000fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "favoriteDelegate", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/ProductActionBarDelegate;", "actionBarDelegate", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/ProductMediaDelegate;", "productMediaDelegate", "<init>", "(LWZ/l;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/ProductActionBarDelegate;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/ProductMediaDelegate;)V", "", "onTileClick", "()V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "item", "setState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;)V", "Landroidx/lifecycle/v;", "lifecycle", "Lkotlin/Function0;", "La00/f;", "ownerProvider", "Lxe/M;", "coroutineScopeProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "dataProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;", "viewProvider", "onAttach", "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onDetach", "LWZ/l;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/ProductActionBarDelegate;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/ProductMediaDelegate;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "currentState", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileDelegateV2 {

    @NotNull
    private final ProductActionBarDelegate actionBarDelegate;

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;
    private FreshTileModel currentState;

    @NotNull
    private Function0<? extends FreshTileModel> dataProvider;

    @NotNull
    private final FreshFavoriteDelegate favoriteDelegate;

    @NotNull
    private final ProductMediaDelegate productMediaDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private Function0<FreshTileViewV2> viewProvider;

    public FreshTileDelegateV2(@NotNull l tokenizedAnalytics, @NotNull FreshFavoriteDelegate favoriteDelegate, @NotNull ProductActionBarDelegate actionBarDelegate, @NotNull ProductMediaDelegate productMediaDelegate) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(favoriteDelegate, "favoriteDelegate");
        Intrinsics.checkNotNullParameter(actionBarDelegate, "actionBarDelegate");
        Intrinsics.checkNotNullParameter(productMediaDelegate, "productMediaDelegate");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.favoriteDelegate = favoriteDelegate;
        this.actionBarDelegate = actionBarDelegate;
        this.productMediaDelegate = productMediaDelegate;
        this.actionHandler = FreshTileDelegateV2$actionHandler$1.INSTANCE;
        this.viewProvider = FreshTileDelegateV2$viewProvider$1.INSTANCE;
        this.dataProvider = FreshTileDelegateV2$dataProvider$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTileClick() {
        FreshTileModel invoke = this.dataProvider.invoke();
        if (invoke == null) {
            return;
        }
        AtomAction clickAction = invoke.getClickAction();
        if (clickAction != null) {
            this.actionHandler.invoke(clickAction);
        }
        t tokenizedEvent = invoke.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    public final void onAttach(@NotNull AbstractC5434v lifecycle, @NotNull Function0<C4911f> ownerProvider, @NotNull Function0<? extends M> coroutineScopeProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<? extends FreshTileModel> dataProvider, @NotNull Function0<FreshTileViewV2> viewProvider) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        this.actionHandler = actionHandler;
        this.viewProvider = viewProvider;
        this.dataProvider = dataProvider;
        this.favoriteDelegate.onAttach(lifecycle, coroutineScopeProvider, ownerProvider, new FreshTileDelegateV2$onAttach$1(viewProvider));
        this.actionBarDelegate.onAttach(coroutineScopeProvider, new FreshTileDelegateV2$onAttach$2(viewProvider), actionHandler, lifecycle);
        this.productMediaDelegate.onAttach(lifecycle, coroutineScopeProvider, new FreshTileDelegateV2$onAttach$3(viewProvider));
    }

    public final void onDetach() {
        this.productMediaDelegate.onDetach();
        this.actionBarDelegate.onDetach();
        this.favoriteDelegate.onDetach();
    }

    public final void setState(@NotNull FreshTileModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentState = item;
        FreshTileViewV2 invoke = this.viewProvider.invoke();
        if (invoke != null) {
            invoke.bind(item, new FreshTileDelegateV2$setState$1(this));
        }
        this.productMediaDelegate.setState(item.getProductMedia());
        this.actionBarDelegate.setState(item.getActionBarV2());
        FreshFavoriteDelegate freshFavoriteDelegate = this.favoriteDelegate;
        FreshFavoriteMoleculeVO favoriteButton = item.getFavoriteButton();
        FreshFavoriteDelegate.setState$default(freshFavoriteDelegate, favoriteButton != null ? favoriteButton.getState() : null, null, 2, null);
    }
}
