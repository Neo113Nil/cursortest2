package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import DG.a;
import Sc.InterfaceC4008j;
import Sc.n;
import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.SkuVideoCoverDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.UtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.ContinuousScrollStateListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010 \u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u00030\u0016j\u0006\u0012\u0002\b\u0003`\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J7\u0010&\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#2\u0012\u0010%\u001a\u000e\u0012\u0002\b\u00030\u0016j\u0006\u0012\u0002\b\u0003`\u0017H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001d\u00103\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00107\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010\u0018\u001a\u0012\u0012\u0002\b\u0003\u0018\u00010\u0016j\b\u0012\u0002\b\u0003\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010AR\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00100B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductAdultImageWithVideoCoverBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "Landroid/widget/ImageView;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "setDrawableByNameOrGone", "(Landroid/widget/ImageView;Ljava/lang/String;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "navigateOrShowAdultDialog", "(Lru/ozon/app/android/product/common/product/ProductVO;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "imageContainer$delegate", "LSc/j;", "getImageContainer", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "imageContainer", "overlayImage$delegate", "getOverlayImage", "()Landroid/widget/ImageView;", "overlayImage", "Landroid/view/View;", "badgesView$delegate", "getBadgesView", "()Landroid/view/View;", "badgesView", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/product/common/core/GalleryItem;", "adultDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/composer/ui/widget/k;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/SkuVideoCoverDelegate;", "skuVideoCoverDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/SkuVideoCoverDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ProductAdultImageWithVideoCoverBinder extends ProductPropertyBinder<ProductVO> {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultDelegate<GalleryItem> adultDelegate;

    @NotNull
    private final AdultHandler adultHandler;

    /* renamed from: badgesView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgesView;

    /* renamed from: imageContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageContainer;

    /* renamed from: overlayImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j overlayImage;

    @NotNull
    private final PlayerPreloader playerPreloader;
    private SkuVideoCoverDelegate skuVideoCoverDelegate;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;
    private k<?> widgetViewHolder;

    public ProductAdultImageWithVideoCoverBinder(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull VideoTileDelegate videoTileDelegate, @NotNull PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        this.adultHandler = adultHandler;
        this.videoTileDelegate = videoTileDelegate;
        this.playerPreloader = playerPreloader;
        n nVar = n.NONE;
        this.imageContainer = Sc.k.a(nVar, new ProductAdultImageWithVideoCoverBinder$imageContainer$2(this));
        this.overlayImage = Sc.k.b(new ProductAdultImageWithVideoCoverBinder$overlayImage$2(this));
        this.badgesView = Sc.k.a(nVar, new ProductAdultImageWithVideoCoverBinder$badgesView$2(this));
        this.adultDelegate = new AdultDelegate<>(adultHandler, featureChecker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBadgesView() {
        return (View) this.badgesView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkuImageWrapper getImageContainer() {
        return (SkuImageWrapper) this.imageContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ProductAdultImageWithVideoCoverBinder productAdultImageWithVideoCoverBinder, View view) {
        if (productAdultImageWithVideoCoverBinder.getProduct().getAction() != null) {
            productAdultImageWithVideoCoverBinder.navigateOrShowAdultDialog(productAdultImageWithVideoCoverBinder.getProduct());
        }
    }

    private final void navigateOrShowAdultDialog(ProductVO product) {
        final AtomAction action = product.getAction();
        if (action == null) {
            return;
        }
        if (product.getShouldBlur()) {
            AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, getComposerReferences().getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverBinder$navigateOrShowAdultDialog$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    SkuVideoCoverDelegate skuVideoCoverDelegate;
                    PlayerPreloader playerPreloader;
                    Function1 function1;
                    skuVideoCoverDelegate = ProductAdultImageWithVideoCoverBinder.this.skuVideoCoverDelegate;
                    if (skuVideoCoverDelegate != null) {
                        skuVideoCoverDelegate.onProductClick();
                    }
                    playerPreloader = ProductAdultImageWithVideoCoverBinder.this.playerPreloader;
                    playerPreloader.tryToPreloadPdpVideo(action);
                    function1 = ProductAdultImageWithVideoCoverBinder.this.actionHandler;
                    if (function1 != null) {
                        function1.invoke(action);
                    } else {
                        Intrinsics.n("actionHandler");
                        throw null;
                    }
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
        this.playerPreloader.tryToPreloadPdpVideo(action);
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
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

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, k kVar) {
        bind2(productVO, dVar, (k<?>) kVar);
    }

    protected ImageView getOverlayImage() {
        return (ImageView) this.overlayImage.getValue();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.widgetViewHolder = widgetViewHolder;
        this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).buildHandler();
        getRootView().setOnClickListener(new a(this, 5));
        ContinuousScrollStateListener widgetsScrollStateListener = this.videoTileDelegate.getWidgetsScrollStateListener();
        View requireView = composerReferences.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        widgetsScrollStateListener.setOn(ComposerViewExtensionKt.composerRecyclerView(requireView));
        SkuImageWrapper imageContainer = getImageContainer();
        if (imageContainer != null) {
            imageContainer.setClickListener(new ProductAdultImageWithVideoCoverBinder$init$2$1(this));
            this.skuVideoCoverDelegate = new SkuVideoCoverDelegate(imageContainer, composerReferences, widgetViewHolder, this.videoTileDelegate, false);
        }
        RxExtKt.observe$default(this.adultDelegate.observeItem(), getLifecycleOwner(), new ProductAdultImageWithVideoCoverBinder$init$3(this), new ProductAdultImageWithVideoCoverBinder$init$4(Lm0.a.f17149a), null, 8, null);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.onViewInVisibleBounds();
        }
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.onViewOutOfVisibleBounds();
        }
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        SkuImageWrapper imageContainer;
        Unit unit;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((ProductAdultImageWithVideoCoverBinder) product, info, holder);
        SkuVideoCoverDelegate skuVideoCoverDelegate = this.skuVideoCoverDelegate;
        if (skuVideoCoverDelegate != null) {
            skuVideoCoverDelegate.bind(product);
        }
        SkuImageWrapper imageContainer2 = getImageContainer();
        if (imageContainer2 != null) {
            imageContainer2.setRatio(product.getImageModel().getRatio());
        }
        getBadgesView().setVisibility(!product.getIsAdult() ? 0 : 8);
        if (product.getIsAdult()) {
            GalleryItem.ImageItem imageItem = UtilsKt.getImageItem(product);
            if (imageItem != null) {
                this.adultDelegate.bindItem(imageItem);
            }
        } else if (UtilsKt.imageModelIsNotEmpty(product) && (imageContainer = getImageContainer()) != null) {
            imageContainer.bindItem(UtilsKt.getCurrentItem(product));
        }
        SkuImageWrapper imageContainer3 = getImageContainer();
        if (imageContainer3 != null) {
            imageContainer3.setTileAlpha(product.getImageAlpha());
        }
        String imageOverlayPicture = product.getImageOverlayPicture();
        if (imageOverlayPicture != null) {
            ImageView overlayImage = getOverlayImage();
            if (overlayImage != null) {
                setDrawableByNameOrGone(overlayImage, imageOverlayPicture);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        ImageView overlayImage2 = getOverlayImage();
        if (overlayImage2 != null) {
            ViewExtKt.gone(overlayImage2);
            Unit unit2 = Unit.f71690a;
        }
    }
}
