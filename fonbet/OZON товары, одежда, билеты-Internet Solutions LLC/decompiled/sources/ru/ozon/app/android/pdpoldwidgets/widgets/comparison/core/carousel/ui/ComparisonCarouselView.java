package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import El.C2971a;
import Pc.a;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import io.reactivex.AbstractC7094b;
import j10.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.utils.ListItemHolder;
import ru.ozon.app.android.pdp.utils.ListItemsAdapterKt;
import ru.ozon.app.android.pdpoldwidgets.R$string;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import vc.k;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 G2\u00020\u0001:\u0002GHBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\t0\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselView;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselBinding;", "binding", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "comparisonCarouselViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/l;", "widgetViewItemProvider", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavDelegateProvider", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LPc/a;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lj10/h;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LPc/a;LWZ/l;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "item", "", "setupScrollListener", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "click", "handleClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "clickId", "handleSuccessfulClickResult", "(Ljava/lang/String;)V", "handleFailedClickResult", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;)Lkotlin/Unit;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselBinding;", "getBinding", "()Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselBinding;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "currentFirstIndex", "I", "currentSecondIndex", "Landroidx/recyclerview/widget/RecyclerView$t;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "vo", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselAdapter;", "firstColumnAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselAdapter;", "secondColumnAdapter", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", "lifecycle", "Companion", "ComparisonCarouselOnScrollListener", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonCarouselView implements J {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PdpWidgetComparisonCarouselBinding binding;

    @NotNull
    private final ComparisonCarouselViewModel comparisonCarouselViewModel;

    @NotNull
    private final ComposerReferences composerReferences;
    private int currentFirstIndex;
    private int currentSecondIndex;

    @NotNull
    private final ComparisonCarouselAdapter firstColumnAdapter;
    private RecyclerView.t scrollListener;

    @NotNull
    private final ComparisonCarouselAdapter secondColumnAdapter;
    private ComparisonCarouselVO vo;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselView$ComparisonCarouselOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "item", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselView;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ComparisonCarouselOnScrollListener extends RecyclerView.t {

        @NotNull
        private final ComparisonCarouselVO item;
        final /* synthetic */ ComparisonCarouselView this$0;

        public ComparisonCarouselOnScrollListener(@NotNull ComparisonCarouselView comparisonCarouselView, ComparisonCarouselVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0 = comparisonCarouselView;
            this.item = item;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            Uri uri;
            Uri parse;
            Uri.Builder buildUpon;
            ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct comparedProduct;
            ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct comparedProduct2;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState != 0) {
                this.this$0.composerReferences.getController().a();
                return;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
            ComparisonCarouselView comparisonCarouselView = this.this$0;
            int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            int i11 = recyclerView.equals(comparisonCarouselView.getBinding().firstColumnRV) ? comparisonCarouselView.currentFirstIndex : comparisonCarouselView.currentSecondIndex;
            if (findFirstCompletelyVisibleItemPosition == -1 || findFirstCompletelyVisibleItemPosition == i11 || i11 == -1) {
                return;
            }
            RecyclerView firstColumnRV = comparisonCarouselView.getBinding().firstColumnRV;
            Intrinsics.checkNotNullExpressionValue(firstColumnRV, "firstColumnRV");
            RecyclerView.o layoutManager2 = firstColumnRV.getLayoutManager();
            if (layoutManager2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
            comparisonCarouselView.currentFirstIndex = ((LinearLayoutManager) layoutManager2).findFirstCompletelyVisibleItemPosition();
            RecyclerView secondColumnRV = comparisonCarouselView.getBinding().secondColumnRV;
            Intrinsics.checkNotNullExpressionValue(secondColumnRV, "secondColumnRV");
            RecyclerView.o layoutManager3 = secondColumnRV.getLayoutManager();
            if (layoutManager3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
            comparisonCarouselView.currentSecondIndex = ((LinearLayoutManager) layoutManager3).findFirstCompletelyVisibleItemPosition();
            try {
                List<ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct> products = this.item.getCarousel().getProducts();
                String sku = (products == null || (comparedProduct2 = products.get(comparisonCarouselView.currentFirstIndex)) == null) ? null : comparedProduct2.getSku();
                List<ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct> products2 = this.item.getCarousel().getProducts();
                List b02 = C7714v.b0(sku, (products2 == null || (comparedProduct = products2.get(comparisonCarouselView.currentSecondIndex)) == null) ? null : comparedProduct.getSku());
                String link = this.item.getCarousel().getProductActionOnSwipe().getLink();
                if (link == null || (parse = Uri.parse(link)) == null || (buildUpon = parse.buildUpon()) == null) {
                    uri = null;
                } else {
                    buildUpon.appendQueryParameter("skus", C7714v.V(b02, ",", null, null, null, 62));
                    uri = buildUpon.build();
                }
                InterfaceC7851b.a.e(comparisonCarouselView.composerReferences.getController(), String.valueOf(uri), null, null, 6);
            } catch (IndexOutOfBoundsException unused) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (dx != 0) {
                this.this$0.composerReferences.getController().a();
            }
        }
    }

    public ComparisonCarouselView(@NotNull PdpWidgetComparisonCarouselBinding binding, @NotNull ComparisonCarouselViewModel comparisonCarouselViewModel, @NotNull ComposerReferences composerReferences, @NotNull Function0<l> widgetViewItemProvider, @NotNull ProductFavoriteDelegateProvider productFavDelegateProvider, @NotNull h<l> voHelper, @NotNull HandlersInhibitor handlersInhibitor, @NotNull a<CartAtomBinder> cartAtomBinder, @NotNull WZ.l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(comparisonCarouselViewModel, "comparisonCarouselViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
        Intrinsics.checkNotNullParameter(productFavDelegateProvider, "productFavDelegateProvider");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.binding = binding;
        this.comparisonCarouselViewModel = comparisonCarouselViewModel;
        this.composerReferences = composerReferences;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, voHelper, ComparisonCarouselVO.class).enableClickThrottling(handlersInhibitor).onClick(new ComparisonCarouselView$actionHandler$1(this)).onComposerAction(new ComparisonCarouselView$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        ComparisonCarouselAdapter comparisonCarouselAdapter = new ComparisonCarouselAdapter(productFavDelegateProvider, buildHandler, null, cartAtomBinder, tokenizedAnalytics, composerReferences, widgetViewItemProvider, this);
        this.firstColumnAdapter = comparisonCarouselAdapter;
        ComparisonCarouselAdapter comparisonCarouselAdapter2 = new ComparisonCarouselAdapter(productFavDelegateProvider, buildHandler, null, cartAtomBinder, tokenizedAnalytics, composerReferences, widgetViewItemProvider, this);
        this.secondColumnAdapter = comparisonCarouselAdapter2;
        new x().attachToRecyclerView(binding.firstColumnRV);
        new x().attachToRecyclerView(binding.secondColumnRV);
        RecyclerView.u uVar = new RecyclerView.u();
        RecyclerView recyclerView = binding.firstColumnRV;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setAdapter(comparisonCarouselAdapter);
        RecyclerView recyclerView2 = binding.secondColumnRV;
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(recyclerView2.getContext(), 0, false);
        linearLayoutManager2.setRecycleChildrenOnDetach(true);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setRecycledViewPool(uVar);
        recyclerView2.setAdapter(comparisonCarouselAdapter2);
        comparisonCarouselViewModel.attach(composerReferences.getTokenizedAnalytics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleClick(AtomAction.Click click) {
        String str;
        String str2;
        AbstractC7094b abstractC7094b;
        String link;
        if (Intrinsics.d(click.getId(), "goToProduct") && (link = click.getLink()) != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.composerReferences.getNavigator(), link, null, 2, null);
        }
        Map<String, String> params = click.getParams();
        if (params == null || (str2 = params.get("product_id")) == null) {
            Map<String, String> params2 = click.getParams();
            if (params2 == null) {
                str = null;
                if (str == null) {
                    String id2 = click.getId();
                    if (id2 != null) {
                        switch (id2.hashCode()) {
                            case -1311196741:
                                if (id2.equals("unsubscribeFromStock")) {
                                    abstractC7094b = this.comparisonCarouselViewModel.unsubscribeFromStock(str);
                                    break;
                                }
                                break;
                            case 23457852:
                                if (id2.equals("addToCart")) {
                                    ComparisonCarouselViewModel comparisonCarouselViewModel = this.comparisonCarouselViewModel;
                                    ComparisonCarouselVO comparisonCarouselVO = this.vo;
                                    abstractC7094b = ComparisonCarouselViewModel.addToCart$default(comparisonCarouselViewModel, comparisonCarouselVO != null ? Long.valueOf(comparisonCarouselVO.getId()) : null, str, 0, 4, null);
                                    break;
                                }
                                break;
                            case 1455340174:
                                if (id2.equals("removeFromCart")) {
                                    ComparisonCarouselViewModel comparisonCarouselViewModel2 = this.comparisonCarouselViewModel;
                                    ComparisonCarouselVO comparisonCarouselVO2 = this.vo;
                                    abstractC7094b = comparisonCarouselViewModel2.removeFromCart(comparisonCarouselVO2 != null ? Long.valueOf(comparisonCarouselVO2.getId()) : null, str);
                                    break;
                                }
                                break;
                            case 1459740849:
                                if (id2.equals("subscribeToStock")) {
                                    abstractC7094b = this.comparisonCarouselViewModel.subscribeToStock(str).c(this.comparisonCarouselViewModel.addToFavorite(Long.parseLong(str)));
                                    break;
                                }
                                break;
                        }
                        Intrinsics.f(abstractC7094b);
                        RxExtKt.subscribe(abstractC7094b, this, new ComparisonCarouselView$handleClick$2(this, click), new ComparisonCarouselView$handleClick$3(this, click));
                        return;
                    }
                    abstractC7094b = k.f102782a;
                    Intrinsics.f(abstractC7094b);
                    RxExtKt.subscribe(abstractC7094b, this, new ComparisonCarouselView$handleClick$2(this, click), new ComparisonCarouselView$handleClick$3(this, click));
                    return;
                }
                return;
            }
            str2 = params2.get("sku");
        }
        str = str2;
        if (str == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFailedClickResult(String clickId) {
        NotificationDTO createUnknownErrorNotification = Intrinsics.d(clickId, "subscribeToStock") ? NotificationsKt.createUnknownErrorNotification() : null;
        if (createUnknownErrorNotification != null) {
            showNotificationBar(createUnknownErrorNotification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessfulClickResult(String clickId) {
        NotificationDTO notificationDTO = null;
        InterfaceC7851b.a.e(this.composerReferences.getController(), null, null, null, 7);
        if (Intrinsics.d(clickId, "subscribeToStock")) {
            notificationDTO = new NotificationDTO(StringProvider.getString(R$string.subscribe_to_product_notification_android), null, null, null, null, new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.CLOSE, null, null, null, 14, null), null, null, null, NotificationDTO.Preset.SUCCESS, 478, null);
        }
        if (notificationDTO != null) {
            showNotificationBar(notificationDTO);
        }
    }

    private final void setupScrollListener(PdpWidgetComparisonCarouselBinding pdpWidgetComparisonCarouselBinding, ComparisonCarouselVO comparisonCarouselVO) {
        RecyclerView.t tVar = this.scrollListener;
        if (tVar != null) {
            pdpWidgetComparisonCarouselBinding.firstColumnRV.removeOnScrollListener(tVar);
            pdpWidgetComparisonCarouselBinding.secondColumnRV.removeOnScrollListener(tVar);
        }
        ComparisonCarouselOnScrollListener comparisonCarouselOnScrollListener = new ComparisonCarouselOnScrollListener(this, comparisonCarouselVO);
        this.scrollListener = comparisonCarouselOnScrollListener;
        pdpWidgetComparisonCarouselBinding.firstColumnRV.addOnScrollListener(comparisonCarouselOnScrollListener);
        pdpWidgetComparisonCarouselBinding.secondColumnRV.addOnScrollListener(comparisonCarouselOnScrollListener);
    }

    private final void showNotificationBar(NotificationDTO notification) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup b11 = C2971a.b(this.composerReferences);
        if (b11 == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, this.composerReferences.getContainer().g(), null, 8, null).show();
    }

    public final Unit bind(@NotNull ComparisonCarouselVO item) {
        List list;
        Intrinsics.checkNotNullParameter(item, "item");
        PdpWidgetComparisonCarouselBinding pdpWidgetComparisonCarouselBinding = this.binding;
        this.vo = item;
        List<ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct> products = item.getCarousel().getProducts();
        if (products == null || products.isEmpty()) {
            this.composerReferences.getNavigator().popBackStack();
        }
        setupScrollListener(pdpWidgetComparisonCarouselBinding, item);
        this.currentFirstIndex = ((ComparisonCarouselVO.CarouselVO.Index) C7714v.K(item.getCarousel().getIndices())).getSelectedIndex();
        this.currentSecondIndex = ((ComparisonCarouselVO.CarouselVO.Index) C7714v.X(item.getCarousel().getIndices())).getSelectedIndex();
        List<ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct> products2 = item.getCarousel().getProducts();
        if (products2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct comparedProduct : products2) {
            Long y02 = kotlin.text.h.y0(comparedProduct.getSku());
            ListItemHolder listItem = y02 != null ? ListItemsAdapterKt.toListItem(comparedProduct, Long.valueOf(y02.longValue())) : null;
            if (listItem != null) {
                arrayList.add(listItem);
            }
        }
        if (arrayList.size() == 1) {
            this.firstColumnAdapter.submitList(arrayList);
            ComparisonCarouselAdapter comparisonCarouselAdapter = this.secondColumnAdapter;
            for (ComparisonCarouselVO.CarouselVO.Index index : item.getCarousel().getIndices()) {
                if (index.getEmptyProduct() != null) {
                    ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO emptyProduct = index.getEmptyProduct();
                    if (emptyProduct == null || (list = C7714v.a0(ListItemsAdapterKt.toListItem(emptyProduct, Long.valueOf(emptyProduct.getImage().hashCode())))) == null) {
                        list = K.f71697a;
                    }
                    comparisonCarouselAdapter.submitList(list);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (arrayList.size() > 1) {
            this.firstColumnAdapter.submitList(arrayList);
            this.secondColumnAdapter.submitList(arrayList);
            pdpWidgetComparisonCarouselBinding.firstColumnRV.scrollToPosition(this.currentFirstIndex);
            pdpWidgetComparisonCarouselBinding.secondColumnRV.scrollToPosition(this.currentSecondIndex);
        }
        return Unit.f71690a;
    }

    @NotNull
    public final PdpWidgetComparisonCarouselBinding getBinding() {
        return this.binding;
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        Object context = this.binding.getConstraintLayout().getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return ((J) context).getLifecycle();
    }
}
