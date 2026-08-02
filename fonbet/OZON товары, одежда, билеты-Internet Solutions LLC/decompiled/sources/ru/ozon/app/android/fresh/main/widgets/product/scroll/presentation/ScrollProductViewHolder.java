package ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation;

import Aw.ViewOnClickListenerC2448a;
import Ax.ViewOnClickListenerC2451a;
import Cw.ViewOnClickListenerC2787a;
import Cw.b;
import W10.c;
import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import rc.e;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.app.android.atoms.v3.containers.AtomBadgesLayout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.fresh.main.databinding.ViewProductExpressBinding;
import ru.ozon.app.android.fresh.main.ui.atoms.FreshAtomsFactory;
import ru.ozon.app.android.fresh.main.widgets.product.common.events.OnAdultDialogSubmited;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ImageBadge;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductVO;
import ru.ozon.app.android.fresh.main.widgets.product.common.views.ProductFavoriteExpressMoleculeView;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B\u007f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010!J\u000f\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010!J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\"¢\u0006\u0004\b.\u0010%J\u0018\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b3\u0010!J*\u00109\u001a\u00020\u00142\u0006\u00100\u001a\u0002042\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u000207H\u0096\u0001¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u001c\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u0018\u0010\u0018\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010CR\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010-\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010]\u001a\u0010\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductViewHolder;", "Ljk0/j;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Landroid/view/View;", "containerView", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "adultListDelegate", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/utils/CartPriceAtomBinder;", "cartPriceAtomBinder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "favProductMoleculeDelegate", "<init>", "(Landroid/view/View;LW10/c;Landroidx/lifecycle/J;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;Lru/ozon/app/android/fresh/main/widgets/product/scroll/utils/CartPriceAtomBinder;Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;)V", "unbind", "()V", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "bindBadges", "(Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;)V", "navigateOrShowAdultDialog", "onDetach", "onAttach", "onRecycle", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "item", "bind", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Landroid/view/View;", "LW10/c;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/utils/CartPriceAtomBinder;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/app/android/fresh/main/databinding/ViewProductExpressBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/ViewProductExpressBinding;", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "Lnc/b;", "disposable", "Lnc/b;", "Lkotlin/Function0;", "onAdultDialogCompleted", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductsContainerStateDecorator;", "atomsDecorator", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductsContainerStateDecorator;", "Landroid/view/View$OnClickListener;", "badgesClickListener", "Landroid/view/View$OnClickListener;", "", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScrollProductViewHolder extends j implements DefaultLifecycleObserver, FavoriteProductDelegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AdultListDelegate<AdultImageView.Image> adultListDelegate;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final ScrollProductsContainerStateDecorator atomsDecorator;
    private View.OnClickListener badgesClickListener;

    @NotNull
    private final ViewProductExpressBinding binding;

    @NotNull
    private final CartPriceAtomBinder cartPriceAtomBinder;

    @NotNull
    private final View containerView;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;
    private ProductVO item;

    @NotNull
    private final Function0<Unit> onAdultDialogCompleted;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final l tokenizedAnalytics;
    private final c trackingData;
    private final ru.ozon.composer.ui.widget.l widgetViewItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollProductViewHolder(@NotNull View containerView, c cVar, @NotNull J lifecycleOwner, @NotNull ComposerReferences ref, @NotNull AdultListDelegate<AdultImageView.Image> adultListDelegate, @NotNull CartPriceAtomBinder cartPriceAtomBinder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, ru.ozon.composer.ui.widget.l lVar, @NotNull FavoriteProductDelegate favProductMoleculeDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(cartPriceAtomBinder, "cartPriceAtomBinder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        this.containerView = containerView;
        this.trackingData = cVar;
        this.ref = ref;
        this.adultListDelegate = adultListDelegate;
        this.cartPriceAtomBinder = cartPriceAtomBinder;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.widgetViewItem = lVar;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        ViewProductExpressBinding bind = ViewProductExpressBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        e eVar = e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
        this.disposable = eVar;
        this.onAdultDialogCompleted = new ScrollProductViewHolder$onAdultDialogCompleted$1(this);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Context applicationContext = containerView.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ScrollProductsContainerStateDecorator scrollProductsContainerStateDecorator = new ScrollProductsContainerStateDecorator(applicationContext);
        this.atomsDecorator = scrollProductsContainerStateDecorator;
        lifecycleOwner.getLifecycle().a(this);
        containerView.setOnClickListener(new ViewOnClickListenerC2448a(this, 1));
        this.badgesClickListener = new ViewOnClickListenerC2787a(this, 0);
        bind.imagesSwipeView.setOnClickListener(new b(this, 0));
        VerticalAtomsLayout verticalAtomsLayout = bind.stateVrc;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        atomsAdapter.setFactory(new FreshAtomsFactory());
        verticalAtomsLayout.setDecorator(scrollProductsContainerStateDecorator);
        verticalAtomsLayout.setOnClickListener(new ViewOnClickListenerC2451a(this, 1));
        atomsAdapter.setOnAction(new ScrollProductViewHolder$4$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ScrollProductViewHolder scrollProductViewHolder, View view) {
        ProductVO productVO = scrollProductViewHolder.item;
        if (productVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (productVO.getLink() != null) {
            ProductVO productVO2 = scrollProductViewHolder.item;
            if (productVO2 != null) {
                scrollProductViewHolder.navigateOrShowAdultDialog(productVO2);
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ScrollProductViewHolder scrollProductViewHolder, View view) {
        scrollProductViewHolder.containerView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ScrollProductViewHolder scrollProductViewHolder, View view) {
        scrollProductViewHolder.containerView.performClick();
    }

    private final void bindBadges(ProductVO product) {
        AtomBadgesLayout topBadgesContainer = this.binding.topBadgesContainer;
        Intrinsics.checkNotNullExpressionValue(topBadgesContainer, "topBadgesContainer");
        topBadgesContainer.setVisibility(!product.getShouldBlur() ? 0 : 8);
        AtomBadgesLayout bottomBadgesContainer = this.binding.bottomBadgesContainer;
        Intrinsics.checkNotNullExpressionValue(bottomBadgesContainer, "bottomBadgesContainer");
        bottomBadgesContainer.setVisibility(product.getShouldBlur() ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(ScrollProductViewHolder scrollProductViewHolder, View view) {
        scrollProductViewHolder.containerView.performClick();
    }

    private final void navigateOrShowAdultDialog(final ProductVO product) {
        final AtomActionDTO link = product.getLink();
        if (link == null) {
            return;
        }
        if (product.getShouldBlur()) {
            AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, this.ref.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollProductViewHolder$navigateOrShowAdultDialog$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    Function1 function1;
                    ComposerReferences composerReferences;
                    function1 = ScrollProductViewHolder.this.actionHandler;
                    function1.invoke(AtomActionMapperKt.toAtomAction(link, product.getTrackingInfo()));
                    composerReferences = ScrollProductViewHolder.this.ref;
                    composerReferences.getController().update(new OnAdultDialogSubmited(null, 1, null));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, null, false, 12, null);
        } else {
            this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(link, product.getTrackingInfo()));
        }
    }

    private final void unbind() {
        this.disposable.dispose();
        this.cartPriceAtomBinder.unbind();
        this.cartPriceAtomBinder.setAdultDialogCommitListener(null);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favProductMoleculeDelegate.attachFavButtonView(button);
    }

    public final void bind(@NotNull ProductVO item) {
        Object obj;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.binding.productSa.setOnAction(this.actionHandler);
        bindBadges(item);
        ProductFavoriteExpressMoleculeView productFavMoleculeButton = this.binding.productFavMoleculeButton;
        Intrinsics.checkNotNullExpressionValue(productFavMoleculeButton, "productFavMoleculeButton");
        Iterator<T> it = item.getTopRightButtons().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj != null ? obj instanceof FavoriteProductMolecule : true) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        bindFavoriteProductButton(productFavMoleculeButton, (FavoriteProductMolecule) obj, new AnalyticData(this.trackingData, this.widgetViewItem));
        if (item.getIsAdult()) {
            this.adultListDelegate.bindItems(C7714v.a0(item.getImage()));
        } else {
            this.binding.imagesSwipeView.bind(item.getImage());
        }
        this.binding.topBadgesContainer.reset();
        this.binding.bottomBadgesContainer.reset();
        List<ImageBadge> imageBadges = item.getImageBadges();
        if (imageBadges != null) {
            for (ImageBadge imageBadge : imageBadges) {
                if (Intrinsics.d(imageBadge.getPosition().getY(), "top")) {
                    this.binding.topBadgesContainer.addBadge(imageBadge.getBadge(), imageBadge.getPosition().getX(), imageBadge.getPosition().getY()).setOnClickListener(this.badgesClickListener);
                } else {
                    this.binding.bottomBadgesContainer.addBadge(imageBadge.getBadge(), imageBadge.getPosition().getX(), imageBadge.getPosition().getY()).setOnClickListener(this.badgesClickListener);
                }
            }
        }
        List<AtomDTO> state = item.getState();
        if (state != null) {
            AtomsAdapter atomsAdapter = this.atomsAdapter;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, state);
        }
        AtomDTO button = item.getButton();
        if (button != null) {
            if (!(button instanceof CartPriceFreshAtom) && !(button instanceof ButtonV3Atom.AddToCartAtom)) {
                SingleAtom.bind$default(this.binding.productSa, button, false, 2, null);
                this.binding.productSa.setOnAction(this.actionHandler);
                return;
            }
            CartPriceAtomBinder cartPriceAtomBinder = this.cartPriceAtomBinder;
            SingleAtom productSa = this.binding.productSa;
            Intrinsics.checkNotNullExpressionValue(productSa, "productSa");
            Function1<AtomAction, Unit> function1 = this.actionHandler;
            l lVar = this.tokenizedAnalytics;
            ru.ozon.composer.ui.widget.l lVar2 = this.widgetViewItem;
            cartPriceAtomBinder.bind(productSa, button, function1, lVar, lVar2 != null ? Long.valueOf(lVar2.f()) : null);
            this.cartPriceAtomBinder.bindAdult(item.getShouldBlur());
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        ProductVO productVO = this.item;
        if (productVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (productVO.getIsAdult()) {
            this.disposable = this.adultListDelegate.observeItems().subscribe(new Cw.c(new ScrollProductViewHolder$onAttach$1(this), 0));
        }
        CartPriceAtomBinder cartPriceAtomBinder = this.cartPriceAtomBinder;
        SingleAtom productSa = this.binding.productSa;
        Intrinsics.checkNotNullExpressionValue(productSa, "productSa");
        cartPriceAtomBinder.init(productSa);
        this.cartPriceAtomBinder.setAdultDialogCommitListener(this.onAdultDialogCompleted);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        unbind();
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        unbind();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        unbind();
        this.atomsAdapter.onRecycle();
        this.binding.productSa.onRecycle();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favProductMoleculeDelegate.setOnFavoriteClick(function1);
    }
}
