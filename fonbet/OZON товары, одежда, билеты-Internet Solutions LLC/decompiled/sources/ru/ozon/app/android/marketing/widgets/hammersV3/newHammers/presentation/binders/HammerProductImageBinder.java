package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders;

import Dc0.m;
import Dc0.n;
import Lm0.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.common.flags.HammersNewImageLoadingFlag;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyView;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyViewBuilder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0019\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R&\u0010\u0014\u001a\u0012\u0012\u0002\b\u0003\u0018\u00010\u0012j\b\u0012\u0002\b\u0003\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#R(\u0010&\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductImageBinder;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductPropertyBinder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "hammerProduct", "", "bindOverlayImage", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;)V", "", "needCreate", "Landroidx/appcompat/widget/AppCompatImageView;", "getOverlayImage", "(Z)Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroid/view/ViewGroup;", "itemView", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentItem", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "setCurrentItem", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammerProductImageBinder extends HammerProductPropertyBinder {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;
    private AdultImageView.Image currentItem;

    @NotNull
    private final FeatureChecker featureChecker;
    private k<?> widgetViewHolder;
    public static final int $stable = 8;
    private static final int overlayImageRadius = UiExtKt.toPx(12);

    public HammerProductImageBinder(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
    }

    private final void bindOverlayImage(HammersV3BodyVO hammerProduct) {
        String imageOverlayPicture = hammerProduct.getImageOverlayPicture();
        boolean z11 = imageOverlayPicture != null;
        AppCompatImageView overlayImage = getOverlayImage(z11);
        if (overlayImage != null) {
            ImageViewExtKt.loadWithRoundCorners(overlayImage, imageOverlayPicture, Integer.valueOf(overlayImageRadius));
            ViewExtKt.showOrGone(overlayImage, Boolean.valueOf(z11));
        }
    }

    private final AppCompatImageView getOverlayImage(boolean needCreate) {
        HammersBodyView hammersBodyView;
        HammersBodyView rootView = getRootView();
        AppCompatImageView appCompatImageView = null;
        AppCompatImageView overlayImage = rootView != null ? rootView.getOverlayImage() : null;
        HammersBodyViewBuilder hammersBodyViewBuilder = HammersBodyViewBuilder.INSTANCE;
        if (needCreate && overlayImage == null) {
            hammersBodyView = ((HammerProductPropertyBinder) this).rootView;
            if (hammersBodyView != null) {
                appCompatImageView = hammersBodyViewBuilder.buildOverlayImage(hammersBodyView);
            }
        } else {
            appCompatImageView = overlayImage;
        }
        HammersBodyView rootView2 = getRootView();
        if (rootView2 != null) {
            rootView2.setOverlayImage(appCompatImageView);
        }
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(HammerProductImageBinder hammerProductImageBinder, View view) {
        AtomAction action;
        HammersV3BodyVO hammerV3Product = hammerProductImageBinder.getHammerV3Product();
        if (hammerV3Product == null || (action = hammerV3Product.getAction()) == null) {
            return;
        }
        Function1<? super AtomAction, Unit> function1 = hammerProductImageBinder.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        } else {
            Intrinsics.n("actionHandler");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(HammerProductImageBinder hammerProductImageBinder, View view) {
        HammersBodyView rootView = hammerProductImageBinder.getRootView();
        if (rootView != null) {
            rootView.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentItem(AdultImageView.Image image) {
        AdultImageView mainImage;
        AdultImageView.Image image2;
        if (!this.featureChecker.isEnabled(HammersNewImageLoadingFlag.INSTANCE)) {
            this.currentItem = image;
            return;
        }
        if (image != null) {
            if (Intrinsics.d(this.currentItem, image) && (image2 = this.currentItem) != null && image2.getShouldBlur() == image.getShouldBlur()) {
                return;
            }
            this.currentItem = image;
            HammersBodyView rootView = getRootView();
            if (rootView == null || (mainImage = rootView.getMainImage()) == null) {
                return;
            }
            mainImage.bind(image);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductPropertyBinder
    public void bind(@NotNull HammersV3BodyVO hammerProduct, @NotNull d info, @NotNull k<?> holder) {
        AdultImageView mainImage;
        AdultImageView mainImage2;
        Intrinsics.checkNotNullParameter(hammerProduct, "hammerProduct");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(hammerProduct, info, holder);
        boolean z11 = !this.adultHandler.isUserAnAdult() && hammerProduct.getImageInfo().getIsAdult();
        if (this.featureChecker.isEnabled(HammersNewImageLoadingFlag.INSTANCE)) {
            setCurrentItem(AdultImageView.Image.copy$default(hammerProduct.getImageInfo(), null, null, 0.0f, false, z11, false, null, null, null, false, null, false, 4079, null));
        } else {
            setCurrentItem(hammerProduct.getImageInfo());
            HammersBodyView rootView = getRootView();
            if (rootView != null && (mainImage = rootView.getMainImage()) != null) {
                mainImage.bind(AdultImageView.Image.copy$default(hammerProduct.getImageInfo(), null, null, 0.0f, false, z11, false, null, null, null, false, null, false, 4079, null));
            }
        }
        HammersBodyView rootView2 = getRootView();
        if (rootView2 != null && (mainImage2 = rootView2.getMainImage()) != null) {
            mainImage2.setAlpha(hammerProduct.getImageAlpha());
        }
        bindOverlayImage(hammerProduct);
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, ViewGroup itemView) {
        AdultImageView mainImage;
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        super.init(widgetViewHolder, composerReferences, itemView);
        this.widgetViewHolder = widgetViewHolder;
        this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).buildHandler();
        HammersBodyView rootView = getRootView();
        if (rootView != null) {
            rootView.setOnClickListener(new m(this, 1));
        }
        HammersBodyView rootView2 = getRootView();
        if (rootView2 != null && (mainImage = rootView2.getMainImage()) != null) {
            mainImage.setOnClickListener(new n(this, 1));
        }
        J lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            RxExtKt.observe$default(this.adultHandler.observeUserAdultState(), lifecycleOwner, new HammerProductImageBinder$init$3$1(this), new HammerProductImageBinder$init$3$2(a.f17149a), null, 8, null);
        }
    }
}
