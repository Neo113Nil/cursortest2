package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderView;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.common.viewmodel.b;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.TileScrollMappingCompatKt;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.adapter.TileScrollBlockItemAdapter;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.messenger.util.HorizontallRecyclerViewVisibilityTracker;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bc\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010%J\u0019\u0010+\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u00020#H\u0002¢\u0006\u0004\b,\u0010'J1\u00100\u001a\u00020#2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020#H\u0016¢\u0006\u0004\b4\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020#0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockView;", "Lru/ozon/android/messenger/framework/presentation/common/view/recycler/q;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "viewModel", "viewBinding", "Lru/ozon/android/messenger/framework/core/d;", "references", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinderProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;Lru/ozon/android/messenger/framework/core/d;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;LPc/a;LWZ/l;)V", "Lru/ozon/android/messenger/framework/presentation/models/p;", "itemInfo", "Lru/ozon/android/messenger/framework/presentation/models/d;", "blockInfo", "", "buildScrollStateKey", "(Lru/ozon/android/messenger/framework/presentation/models/p;Lru/ozon/android/messenger/framework/presentation/models/d;)Ljava/lang/String;", "newScrollKey", "", "saveCurrentScrollStateIfKeyChanged", "(Ljava/lang/String;)V", "saveCurrentScrollState", "()V", "scrollStateKey", "restoreScrollState", "backgroundColor", "setBackgroundColor", "initScrollStateListener", "block", "", "payload", "bind", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO;Lru/ozon/android/messenger/framework/presentation/models/p;Lru/ozon/android/messenger/framework/presentation/models/d;Ljava/lang/Object;)V", "trackView", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO;)V", "onRecycle", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "Lru/ozon/android/messenger/framework/core/d;", "currentScrollKey", "Ljava/lang/String;", "restoredScrollStateKey", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable$delegate", "LSc/j;", "getGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "", "backgroundColorDefault$delegate", "getBackgroundColorDefault", "()I", "backgroundColorDefault", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/TileScrollBlockItemAdapter;", "rvAdapter$delegate", "getRvAdapter", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/TileScrollBlockItemAdapter;", "rvAdapter", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBlockView extends q<TileScrollBlockVO, TileScrollBlockViewBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: backgroundColorDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColorDefault;
    private String currentScrollKey;

    /* renamed from: gradientDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientDrawable;

    @NotNull
    private final d references;
    private String restoredScrollStateKey;

    /* renamed from: rvAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rvAdapter;

    @NotNull
    private final TileScrollBlockViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileScrollBlockView(@NotNull TileScrollBlockViewModel viewModel, @NotNull TileScrollBlockViewBinding viewBinding, @NotNull d references, @NotNull PlayerPreloader playerPreloader, @NotNull BlurDelegateProvider blurDelegateProvider, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull AdultHandler adultHandler, @NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider, @NotNull a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider, @NotNull l tokenizedAnalytics) {
        super(viewBinding, references);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(blurDelegateProvider, "blurDelegateProvider");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(addToCartButtonBinderProvider, "addToCartButtonBinderProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.viewModel = viewModel;
        this.references = references;
        this.gradientDrawable = UtilsKt.unsafeLazy(TileScrollBlockView$gradientDrawable$2.INSTANCE);
        this.backgroundColorDefault = UtilsKt.unsafeLazy(new TileScrollBlockView$backgroundColorDefault$2(this));
        this.actionHandler = new TileScrollBlockView$actionHandler$1(this);
        this.rvAdapter = k.b(new TileScrollBlockView$rvAdapter$2(this, playerPreloader, blurDelegateProvider, adultHandler, addToCartButtonBinderProvider, pdpOfflineScreenWidgetsData, productFavoriteDelegateProvider, tokenizedAnalytics));
        initScrollStateListener();
        RecyclerView recyclerView = getBinding().getRecyclerView();
        RecyclerView.o layoutManager = getBinding().getRecyclerView().getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        new HorizontallRecyclerViewVisibilityTracker(recyclerView, (LinearLayoutManager) layoutManager);
        getBinding().getRecyclerView().setAdapter(getRvAdapter());
    }

    private final String buildScrollStateKey(p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo) {
        String str = TileScrollBlockView.class.getName() + ProductContainerDTO.RATIO_DELIMITER + itemInfo.getId() + ProductContainerDTO.RATIO_DELIMITER + blockInfo.hashCode();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    private final int getBackgroundColorDefault() {
        return ((Number) this.backgroundColorDefault.getValue()).intValue();
    }

    private final GradientDrawable getGradientDrawable() {
        return (GradientDrawable) this.gradientDrawable.getValue();
    }

    private final TileScrollBlockItemAdapter getRvAdapter() {
        return (TileScrollBlockItemAdapter) this.rvAdapter.getValue();
    }

    private final void initScrollStateListener() {
        getBinding().getRecyclerView().addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockView$initScrollStateListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    TileScrollBlockView.this.saveCurrentScrollState();
                }
            }
        });
    }

    private final void restoreScrollState(final String scrollStateKey) {
        if (Intrinsics.d(this.restoredScrollStateKey, scrollStateKey)) {
            return;
        }
        final RecyclerView recyclerView = getBinding().getRecyclerView();
        RecyclerView.g adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getCardsCount() != 0) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockView$restoreScrollState$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    d dVar;
                    RecyclerView.o layoutManager;
                    RecyclerView.this.removeOnLayoutChangeListener(this);
                    dVar = this.references;
                    b b11 = dVar.b();
                    String key = scrollStateKey;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    Intrinsics.checkNotNullParameter(b11, "<this>");
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    Parcelable parcelable = (Parcelable) ((ru.ozon.android.messenger.framework.presentation.messenger.a) b11).b("recycler_view_state:" + key);
                    if (parcelable != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                        layoutManager.onRestoreInstanceState(parcelable);
                    }
                    this.restoredScrollStateKey = scrollStateKey;
                }
            });
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveCurrentScrollState() {
        String str = this.currentScrollKey;
        if (str == null) {
            return;
        }
        ru.ozon.android.messenger.framework.core.b.a(this.references.b(), str, getBinding().getRecyclerView());
    }

    private final void saveCurrentScrollStateIfKeyChanged(String newScrollKey) {
        String str = this.currentScrollKey;
        if (str == null || str.equals(newScrollKey)) {
            return;
        }
        ru.ozon.android.messenger.framework.core.b.a(this.references.b(), str, getBinding().getRecyclerView());
    }

    private final void setBackgroundColor(String backgroundColor) {
        RecyclerView recyclerView = getBinding().getRecyclerView();
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

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public void onRecycle() {
        saveCurrentScrollState();
        getBinding().getRecyclerView().swapAdapter(null, false);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public void bind(@NotNull TileScrollBlockVO block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object payload) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        String buildScrollStateKey = buildScrollStateKey(itemInfo, blockInfo);
        saveCurrentScrollStateIfKeyChanged(buildScrollStateKey);
        this.currentScrollKey = buildScrollStateKey;
        super.bind((TileScrollBlockView) block, itemInfo, blockInfo, payload);
        RecyclerView.o layoutManager = getBinding().getRecyclerView().getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setInitialPrefetchItemCount(block.getItems().size());
        setBackgroundColor(block.getBackgroundColor());
        ViewExtKt.updatePadding(getBinding().getRecyclerView(), 0, Dimens.INSTANCE.getDP_8(), 0, 0);
        getRvAdapter().submitList(block.getItems());
        restoreScrollState(buildScrollStateKey);
        if (block.getHeader() != null) {
            getBinding().getOrCreateHeaderView().bind(block.getHeader());
            return;
        }
        HeaderView headerView = getBinding().getHeaderView();
        if (headerView != null) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(headerView);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public void trackView(@NotNull TileScrollBlockVO block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Map<String, TokenizedTrackingInfo> trackingInfo = block.getTrackingInfo();
        if (trackingInfo != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(trackingInfo.size()));
            Iterator<T> it = trackingInfo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), TileScrollMappingCompatKt.toMessengerTrackingInfo$default((TokenizedTrackingInfo) entry.getValue(), null, 1, null));
            }
            this.references.c().g(linkedHashMap);
        }
        super.trackView((TileScrollBlockView) block);
    }
}
