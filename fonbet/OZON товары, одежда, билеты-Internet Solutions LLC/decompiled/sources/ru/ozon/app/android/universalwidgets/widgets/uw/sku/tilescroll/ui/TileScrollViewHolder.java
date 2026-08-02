package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui;

import Pc.a;
import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import androidx.core.view.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.TileScrollItemsAdapter;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 P2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001PBw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010&J\u0019\u0010+\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J#\u00100\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\n\u0010/\u001a\u00060-j\u0002`.H\u0014¢\u0006\u0004\b0\u00101J)\u00106\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\"H\u0016¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\"H\u0016¢\u0006\u0004\b9\u0010&J\u000f\u0010:\u001a\u00020\"H\u0016¢\u0006\u0004\b:\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\"0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010JR\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/TileScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineWidgetsHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinderProvider", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LWZ/l;LVg/c;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;LPc/a;Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "item", "", "restoreScrollState", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;)V", "saveScrollState", "()V", "safeResetScrollToStart", "setRootLocatorIfExists", "", "backgroundColor", "setBackgroundColor", "(Ljava/lang/String;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onViewInVisibleBounds", "onAttach", "onDetach", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable$delegate", "LSc/j;", "getGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "", "backgroundColorDefault$delegate", "getBackgroundColorDefault", "()I", "backgroundColorDefault", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/adapter/TileScrollItemsAdapter;", "rvAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/adapter/TileScrollItemsAdapter;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollViewHolder extends k<TileScrollVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: backgroundColorDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColorDefault;

    /* renamed from: gradientDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientDrawable;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TileScrollItemsAdapter rvAdapter;
    private f viewedPond;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/TileScrollViewHolder$Companion;", "", "<init>", "()V", "WIDGET_LOCATOR", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileScrollViewHolder(@NotNull RecyclerView recyclerView, @NotNull ComposerReferences refs, @NotNull ProductFavoriteDelegateProvider favoriteDelegateProvider, @NotNull FrameBinder frameBinder, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull PlayerPreloader playerPreloader, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper, @NotNull a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider, @NotNull BlurDelegateProvider blurDelegateProvider, @NotNull AdultHandler adultHandler) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(favoriteDelegateProvider, "favoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(tilesOpenPdpOfflineProductMapper, "tilesOpenPdpOfflineProductMapper");
        Intrinsics.checkNotNullParameter(addToCartButtonBinderProvider, "addToCartButtonBinderProvider");
        Intrinsics.checkNotNullParameter(blurDelegateProvider, "blurDelegateProvider");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.recyclerView = recyclerView;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new TileScrollViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        this.actionHandler = buildHandler;
        this.gradientDrawable = UtilsKt.unsafeLazy(TileScrollViewHolder$gradientDrawable$2.INSTANCE);
        this.backgroundColorDefault = UtilsKt.unsafeLazy(new TileScrollViewHolder$backgroundColorDefault$2(this));
        this.rvAdapter = new TileScrollItemsAdapter(buildHandler, this, favoriteDelegateProvider, refs, tokenizedAnalytics, frameBinder, recyclerView, UtilsKt.unsafeLazy(new TileScrollViewHolder$rvAdapter$1(this)), playerPreloader, pdpOfflineScreenWidgetsData, tilesOpenPdpOfflineProductMapper, addToCartButtonBinderProvider, new TileScrollViewHolder$rvAdapter$2(this), blurDelegateProvider, adultHandler);
        recyclerView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.TileScrollViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    TileScrollViewHolder.this.saveScrollState();
                }
            }
        });
    }

    private final int getBackgroundColorDefault() {
        return ((Number) this.backgroundColorDefault.getValue()).intValue();
    }

    private final GradientDrawable getGradientDrawable() {
        return (GradientDrawable) this.gradientDrawable.getValue();
    }

    private final void restoreScrollState(TileScrollVO item) {
        RecyclerView.o layoutManager;
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState == null || (layoutManager = this.recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(layoutManagerState);
    }

    private final void safeResetScrollToStart(TileScrollVO item) {
        if (!item.getResetScroll()) {
            restoreScrollState(item);
        } else {
            this.recyclerView.scrollToPosition(0);
            item.setResetScroll(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        Parcelable onSaveInstanceState;
        TileScrollVO boundData;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null || (boundData = getBoundData()) == null) {
            return;
        }
        boundData.setLayoutManagerState(onSaveInstanceState);
    }

    private final void setBackgroundColor(String backgroundColor) {
        RecyclerView recyclerView = this.recyclerView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, backgroundColor);
        if (parseColor != null) {
            recyclerView.setBackgroundColor(parseColor.intValue());
            return;
        }
        UniGradient gradientByToken = backgroundColor != null ? TokensExtKt.getGradientByToken(backgroundColor) : null;
        if (gradientByToken == null) {
            recyclerView.setBackgroundColor(getBackgroundColorDefault());
            return;
        }
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TokensExtKt.toGradient(gradientByToken, context2).applyTo(getGradientDrawable());
        recyclerView.setBackground(getGradientDrawable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRootLocatorIfExists() {
        String str;
        TestInfo testInfo;
        TileScrollVO boundData = getBoundData();
        if (boundData == null || (testInfo = boundData.getTestInfo()) == null || (str = testInfo.getAutomatizationId()) == null) {
            str = "tileScrollWidgetContainer";
        }
        this.recyclerView.setContentDescription(str);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.recyclerView.swapAdapter(this.rvAdapter, true);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.recyclerView.swapAdapter(null, true);
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        setRootLocatorIfExists();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TileScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setInitialPrefetchItemCount(item.getPrefetchedItems().size());
        setBackgroundColor(item.getBackgroundColor());
        this.recyclerView.setPadding(0, item.getThemeVO().getTopOffset(), 0, 0);
        final RecyclerView recyclerView = this.recyclerView;
        G.a(recyclerView, new Runnable() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.TileScrollViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
        safeResetScrollToStart(item);
        this.rvAdapter.submitList(item.getItems());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TileScrollVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TileScrollViewHolder) item, trackingData, viewedPond);
        this.viewedPond = viewedPond;
    }
}
