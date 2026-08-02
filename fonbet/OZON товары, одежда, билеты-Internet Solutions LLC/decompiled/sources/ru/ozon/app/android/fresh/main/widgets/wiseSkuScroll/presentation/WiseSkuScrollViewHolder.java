package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.common.flags.FreshWiseSkuScrollDynamicHeightEnabled;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.WiseSkuScrollConstants;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollHeightUpdate;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollViewHolder$dependencyHolder$2;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.WiseSkuScrollAdapter;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseFreshTileVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.tiles.utils.CollectionExtKt;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002EH\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001By\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020-*\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,H\u0002¢\u0006\u0004\b.\u0010/J#\u00104\u001a\u00020 2\u0006\u00100\u001a\u00020\u00022\n\u00103\u001a\u000601j\u0002`2H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020 H\u0016¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020 H\u0016¢\u0006\u0004\b7\u0010*J\u000f\u00108\u001a\u00020 H\u0016¢\u0006\u0004\b8\u0010*J\u000f\u00109\u001a\u00020 H\u0016¢\u0006\u0004\b9\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010?R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020 0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lkotlin/Function1;", "", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManagerProvider", "Lkotlin/Function0;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegateV2Provider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureCheckerProvider", "LPc/a;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "addToCartButtonBinderProvider", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LPc/a;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;LVg/d;)V", "data", "", "updateHeightIfNecessary", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;)V", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "items", "", "measureMaxHeight", "(Ljava/util/Set;)I", "releasePlayerObserver", "()V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "buildAnalyticData", "(Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;Ll20/d;)V", "onAttach", "onViewInOverlapBounds", "onViewOutOfVisibleBounds", "onDetach", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollLifecycle;", "playerObserver", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollLifecycle;", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$pageLifecycleObserver$1", "pageLifecycleObserver", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$pageLifecycleObserver$1;", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$dependencyHolder$2$1", "dependencyHolder$delegate", "LSc/j;", "getDependencyHolder", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder$dependencyHolder$2$1;", "dependencyHolder", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;", "mockView$delegate", "getMockView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;", "mockView", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/WiseSkuScrollAdapter;", "adapter$delegate", "getAdapter", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/WiseSkuScrollAdapter;", "adapter", "Landroidx/lifecycle/v;", "getPageLifecycle", "()Landroidx/lifecycle/v;", "pageLifecycle", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseSkuScrollViewHolder extends AbstractHorizontalListViewHolder<WiseSkuScrollVO, WiseSkuScrollElement> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final PullableHorizontalRecyclerView containerView;

    /* renamed from: dependencyHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dependencyHolder;

    @NotNull
    private final Function1<Boolean, ExoManager> exoManagerProvider;

    @NotNull
    private final Function0<FeatureChecker> featureCheckerProvider;

    @NotNull
    private final Function0<FreshTileDelegateV2> freshTileDelegateV2Provider;

    /* renamed from: mockView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mockView;

    @NotNull
    private WiseSkuScrollViewHolder$pageLifecycleObserver$1 pageLifecycleObserver;
    private WiseSkuScrollLifecycle playerObserver;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoController videoController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollViewHolder$pageLifecycleObserver$1] */
    public WiseSkuScrollViewHolder(@NotNull PullableHorizontalRecyclerView containerView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull VideoController videoController, @NotNull Function1<? super Boolean, ? extends ExoManager> exoManagerProvider, @NotNull Function0<FreshTileDelegateV2> freshTileDelegateV2Provider, @NotNull Function0<? extends FeatureChecker> featureCheckerProvider, @NotNull a<AddToCartButtonBinder> addToCartButtonBinderProvider, @NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider, @NotNull d customActionHandlersStoreFactory) {
        super(containerView, composerReferences);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(exoManagerProvider, "exoManagerProvider");
        Intrinsics.checkNotNullParameter(freshTileDelegateV2Provider, "freshTileDelegateV2Provider");
        Intrinsics.checkNotNullParameter(featureCheckerProvider, "featureCheckerProvider");
        Intrinsics.checkNotNullParameter(addToCartButtonBinderProvider, "addToCartButtonBinderProvider");
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.videoController = videoController;
        this.exoManagerProvider = exoManagerProvider;
        this.freshTileDelegateV2Provider = freshTileDelegateV2Provider;
        this.featureCheckerProvider = featureCheckerProvider;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new WiseSkuScrollViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.pageLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollViewHolder$pageLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                WiseSkuScrollViewHolder.this.releasePlayerObserver();
                super.onStop(owner);
            }
        };
        this.dependencyHolder = k.b(new WiseSkuScrollViewHolder$dependencyHolder$2(this, addToCartButtonBinderProvider, productFavoriteDelegateProvider));
        this.mockView = k.b(new WiseSkuScrollViewHolder$mockView$2(this));
        this.adapter = k.b(new WiseSkuScrollViewHolder$adapter$2(this));
        containerView.setAdapter(getAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticData buildAnalyticData(ru.ozon.composer.ui.widget.k<?> kVar) {
        return new AnalyticData(kVar.getTrackingData(), kVar.getViewItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WiseSkuScrollViewHolder$dependencyHolder$2.AnonymousClass1 getDependencyHolder() {
        return (WiseSkuScrollViewHolder$dependencyHolder$2.AnonymousClass1) this.dependencyHolder.getValue();
    }

    private final FreshTileViewV2 getMockView() {
        return (FreshTileViewV2) this.mockView.getValue();
    }

    private final AbstractC5434v getPageLifecycle() {
        return U7.d.c(this.composerReferences);
    }

    private final int measureMaxHeight(Set<WiseFreshTileVO> items) {
        if (items.isEmpty()) {
            return 0;
        }
        Iterator<WiseFreshTileVO> it = items.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            getMockView().bind(it.next(), WiseSkuScrollViewHolder$measureMaxHeight$1.INSTANCE);
            getMockView().measure(View.MeasureSpec.makeMeasureSpec(WiseSkuScrollConstants.INSTANCE.getFRESH_TILE_WIDTH(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (getMockView().getMeasuredHeight() > i11) {
                i11 = getMockView().getMeasuredHeight();
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releasePlayerObserver() {
        WiseSkuScrollLifecycle wiseSkuScrollLifecycle = this.playerObserver;
        if (wiseSkuScrollLifecycle != null) {
            wiseSkuScrollLifecycle.onDestroy();
        }
        this.playerObserver = null;
        getPageLifecycle().e(this.pageLifecycleObserver);
    }

    private final void updateHeightIfNecessary(WiseSkuScrollVO data) {
        int i11;
        boolean isEnabled = getDependencyHolder().getFeatureCheckerProvider().invoke().isEnabled(FreshWiseSkuScrollDynamicHeightEnabled.INSTANCE);
        boolean z11 = (C7714v.M(data.getItems()) instanceof WiseFreshTileVO) || (CollectionExtKt.secondOrNull(data.getItems()) instanceof WiseFreshTileVO);
        if (!isEnabled || !z11) {
            PullableHorizontalRecyclerView pullableHorizontalRecyclerView = this.containerView;
            ViewGroup.LayoutParams layoutParams = pullableHorizontalRecyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            pullableHorizontalRecyclerView.setLayoutParams(layoutParams);
            return;
        }
        int bottom = data.getPaddings().getBottom() + data.getPaddings().getTop();
        if (data.getHeight() != -1) {
            i11 = data.getHeight();
        } else {
            int banner_height = (C7714v.M(data.getItems()) instanceof WiseBannerVO ? WiseSkuScrollConstants.INSTANCE.getBANNER_HEIGHT() : 0) + bottom;
            int measureMaxHeight = bottom + measureMaxHeight(data.getTilesToMeasure());
            if (measureMaxHeight <= banner_height) {
                measureMaxHeight = banner_height;
            }
            this.composerReferences.getController().update(new WiseSkuScrollHeightUpdate(data.getId(), measureMaxHeight));
            i11 = measureMaxHeight;
        }
        PullableHorizontalRecyclerView pullableHorizontalRecyclerView2 = this.containerView;
        ViewGroup.LayoutParams layoutParams2 = pullableHorizontalRecyclerView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i11;
        pullableHorizontalRecyclerView2.setLayoutParams(layoutParams2);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        getPageLifecycle().a(this.pageLifecycleObserver);
        super.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        releasePlayerObserver();
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        WiseSkuScrollLifecycle wiseSkuScrollLifecycle = this.playerObserver;
        if (wiseSkuScrollLifecycle != null) {
            wiseSkuScrollLifecycle.onViewIn();
        }
        super.onViewInOverlapBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        WiseSkuScrollLifecycle wiseSkuScrollLifecycle = this.playerObserver;
        if (wiseSkuScrollLifecycle != null) {
            wiseSkuScrollLifecycle.onViewOut();
        }
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull WiseSkuScrollVO item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PullableHorizontalRecyclerView pullableHorizontalRecyclerView = this.containerView;
        pullableHorizontalRecyclerView.setPaddingRelative(item.getPaddings().getLeft(), item.getPaddings().getTop(), item.getPaddings().getRight(), item.getPaddings().getBottom());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = pullableHorizontalRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        pullableHorizontalRecyclerView.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = pullableHorizontalRecyclerView.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        updateHeightIfNecessary(item);
        AbstractHorizontalListViewHolder.submitList$default(this, item.getItems(), item.getLayoutManagerState(), null, 4, null);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder
    @NotNull
    public androidx.recyclerview.widget.t<WiseSkuScrollElement, ?> getAdapter() {
        return (WiseSkuScrollAdapter) this.adapter.getValue();
    }
}
