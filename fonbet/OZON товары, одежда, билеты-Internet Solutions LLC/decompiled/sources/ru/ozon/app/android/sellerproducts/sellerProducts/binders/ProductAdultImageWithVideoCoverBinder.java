package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import Ae.C2399j;
import Ae.C2408n0;
import Ez.ViewOnClickListenerC2978b;
import Ez.ViewOnClickListenerC2979c;
import Sc.InterfaceC4008j;
import Sc.n;
import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.K;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.containers.AtomBadgesLayout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.videocover.SkuVideoCoverDelegate;
import ru.ozon.app.android.sellerproducts.sellerProducts.videocover.UtilsKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.views.CsmaSkuImageWrapper;
import ru.ozon.app.android.storefront.domain.events.OnAdultDialogSubmited;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.videocover.ContinuousScrollStateListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001d\u001a\u00020\r2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00102\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010<R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\r0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductAdultImageWithVideoCoverBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/videocover/VideoTileDelegate;)V", "Landroid/widget/ImageView;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "setDrawableByNameOrGone", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "navigateOrShowAdultDialog", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;)V", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Ll20/d;", "info", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;", "imageContainer$delegate", "LSc/j;", "getImageContainer", "()Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;", "imageContainer", "overlayImage$delegate", "getOverlayImage", "()Landroid/widget/ImageView;", "overlayImage", "Lru/ozon/app/android/atoms/v3/containers/AtomBadgesLayout;", "badgesView$delegate", "getBadgesView", "()Lru/ozon/app/android/atoms/v3/containers/AtomBadgesLayout;", "badgesView", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "adultListDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/composer/ui/widget/k;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/sellerproducts/sellerProducts/videocover/SkuVideoCoverDelegate;", "skuVideoCoverDelegate", "Lru/ozon/app/android/sellerproducts/sellerProducts/videocover/SkuVideoCoverDelegate;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductAdultImageWithVideoCoverBinder extends ProductPropertyBinder {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AdultListDelegate<ProductVO.GalleryItem> adultListDelegate;

    /* renamed from: badgesView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgesView;

    /* renamed from: imageContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageContainer;

    /* renamed from: overlayImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j overlayImage;
    private SkuVideoCoverDelegate skuVideoCoverDelegate;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;
    private k<?> widgetViewHolder;

    public ProductAdultImageWithVideoCoverBinder(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull VideoTileDelegate videoTileDelegate) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        this.adultHandler = adultHandler;
        this.videoTileDelegate = videoTileDelegate;
        n nVar = n.NONE;
        this.imageContainer = Sc.k.a(nVar, new ProductAdultImageWithVideoCoverBinder$imageContainer$2(this));
        this.overlayImage = Sc.k.b(new ProductAdultImageWithVideoCoverBinder$overlayImage$2(this));
        this.badgesView = Sc.k.a(nVar, new ProductAdultImageWithVideoCoverBinder$badgesView$2(this));
        this.adultListDelegate = new AdultListDelegate<>(adultHandler, featureChecker);
    }

    private final AtomBadgesLayout getBadgesView() {
        return (AtomBadgesLayout) this.badgesView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CsmaSkuImageWrapper getImageContainer() {
        return (CsmaSkuImageWrapper) this.imageContainer.getValue();
    }

    private final ImageView getOverlayImage() {
        return (ImageView) this.overlayImage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ProductAdultImageWithVideoCoverBinder productAdultImageWithVideoCoverBinder, View view) {
        if (productAdultImageWithVideoCoverBinder.getProduct().getLink() != null) {
            productAdultImageWithVideoCoverBinder.navigateOrShowAdultDialog(productAdultImageWithVideoCoverBinder.getProduct());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(ProductAdultImageWithVideoCoverBinder productAdultImageWithVideoCoverBinder, View view) {
        productAdultImageWithVideoCoverBinder.getRootView().performClick();
    }

    private final void navigateOrShowAdultDialog(final ProductVO product) {
        final AtomActionDTO link = product.getLink();
        if (link == null) {
            return;
        }
        if (product.getShouldBlur()) {
            AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, getComposerReferences().getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductAdultImageWithVideoCoverBinder$navigateOrShowAdultDialog$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    SkuVideoCoverDelegate skuVideoCoverDelegate;
                    Function1 function1;
                    skuVideoCoverDelegate = ProductAdultImageWithVideoCoverBinder.this.skuVideoCoverDelegate;
                    if (skuVideoCoverDelegate != null) {
                        skuVideoCoverDelegate.onProductClick();
                    }
                    function1 = ProductAdultImageWithVideoCoverBinder.this.actionHandler;
                    if (function1 == null) {
                        Intrinsics.n("actionHandler");
                        throw null;
                    }
                    function1.invoke(AtomActionMapperKt.toAtomAction(link, product.getTrackingInfo()));
                    ProductAdultImageWithVideoCoverBinder.this.getComposerReferences().getController().update(new OnAdultDialogSubmited(null, 1, null));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, null, false, 12, null);
            return;
        }
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.onProductClick();
        }
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(AtomActionMapperKt.toAtomAction(link, product.getTrackingInfo()));
        } else {
            Intrinsics.n("actionHandler");
            throw null;
        }
    }

    private final void setDrawableByNameOrGone(ImageView imageView, String str) {
        try {
            int identifier = imageView.getContext().getResources().getIdentifier(str, "drawable", imageView.getContext().getApplicationContext().getPackageName());
            if (identifier == 0) {
                ViewExtKt.gone(imageView);
            } else {
                imageView.setImageResource(identifier);
                ViewExtKt.show(imageView);
            }
        } catch (Exception unused) {
            ViewExtKt.gone(imageView);
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.bind(product);
        }
        getImageContainer().setRatio(product.getImageModel().getRatio());
        getBadgesView().setVisibility(!product.getIsAdult() ? 0 : 8);
        if (product.getIsAdult()) {
            this.adultListDelegate.bindItems(C7714v.c0(UtilsKt.getImageItem(product)));
        } else if (UtilsKt.imageModelIsNotEmpty(product)) {
            getImageContainer().bindItem(UtilsKt.getCurrentItem(product));
        }
        getImageContainer().setAlpha(product.getImageAlpha());
        String imageOverlayPicture = product.getImageOverlayPicture();
        if (imageOverlayPicture != null) {
            setDrawableByNameOrGone(getOverlayImage(), imageOverlayPicture);
        } else {
            ViewExtKt.gone(getOverlayImage());
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.widgetViewHolder = widgetViewHolder;
        this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).buildHandler();
        getRootView().setOnClickListener(new ViewOnClickListenerC2978b(this, 13));
        ContinuousScrollStateListener widgetsScrollStateListener = this.videoTileDelegate.getWidgetsScrollStateListener();
        View requireView = composerReferences.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        widgetsScrollStateListener.setOn(ComposerViewExtensionKt.composerRecyclerView(requireView));
        getImageContainer().setOnClickListener(new ViewOnClickListenerC2979c(this, 10));
        this.skuVideoCoverDelegate = new SkuVideoCoverDelegate(getImageContainer(), composerReferences, widgetViewHolder, this.videoTileDelegate, false);
        C2399j.C(new C2408n0(Ge.n.a(this.adultListDelegate.observeItems()), new ProductAdultImageWithVideoCoverBinder$init$3(this, null)), K.a(getLifecycleOwner()));
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.onViewInVisibleBounds();
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.onViewOutOfVisibleBounds();
        }
    }
}
