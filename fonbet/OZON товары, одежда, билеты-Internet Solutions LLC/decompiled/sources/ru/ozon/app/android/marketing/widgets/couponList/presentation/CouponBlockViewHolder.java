package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import GZ.g;
import Gy.a;
import Gy.c;
import Lw.ViewOnClickListenerC3598a;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import io.reactivex.p;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.marketing.common.coupon.AdultProductPreview;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModel;
import ru.ozon.app.android.marketing.databinding.CouponCardBinding;
import ru.ozon.app.android.marketing.databinding.WidgetSingleCouponBinding;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.network.error.OzonError;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003Be\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010\u001fJ\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010\u001fJ#\u0010,\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00022\n\u0010+\u001a\u00060)j\u0002`*H\u0014¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0018\u0010\u0018\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001f\u0010D\u001a\r\u0012\t\u0012\u00070B¢\u0006\u0002\bC0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010%\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponBlockViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "couponRouter", "Landroidx/lifecycle/J;", "viewOwner", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponListDecoration;", "couponListDecoration", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$CouponVO;", "adultDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;Landroidx/lifecycle/J;Ll10/b;Landroidx/fragment/app/m;Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponListDecoration;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LWZ/l;Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;)V", "", "observeActivateResult", "()V", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "result", "applyResult", "(Lru/ozon/app/android/marketing/common/coupon/CouponResult;)V", "observeActivatedCoupons", "item", "loadProductImages", "(Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$CouponVO;)V", "onAttach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;Ll20/d;)V", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "Landroidx/lifecycle/J;", "Ll10/b;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponListDecoration;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "LWZ/l;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;", "", "marginDefault", "I", "marginSmall", "Lru/ozon/app/android/marketing/databinding/WidgetSingleCouponBinding;", "blockBinding", "Lru/ozon/app/android/marketing/databinding/WidgetSingleCouponBinding;", "Lru/ozon/app/android/marketing/databinding/CouponCardBinding;", "cardBinding", "Lru/ozon/app/android/marketing/databinding/CouponCardBinding;", "", "Lru/ozon/app/android/marketing/common/coupon/AdultProductPreview;", "Lkotlin/jvm/internal/EnhancedNullability;", "previewViews", "[Lru/ozon/app/android/marketing/common/coupon/AdultProductPreview;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$CouponVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponBlockViewHolder extends k<BaseCouponVO> {

    @NotNull
    private final AdultDelegate<BaseCouponVO.CouponVO> adultDelegate;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final WidgetSingleCouponBinding blockBinding;

    @NotNull
    private final InterfaceC7851b bus;

    @NotNull
    private final CouponCardBinding cardBinding;

    @NotNull
    private final CouponListDecoration couponListDecoration;

    @NotNull
    private final CouponPromoRouter couponRouter;

    @NotNull
    private final ComponentCallbacksC5392m fragment;
    private BaseCouponVO.CouponVO item;
    private final int marginDefault;
    private final int marginSmall;

    @NotNull
    private final AdultProductPreview[] previewViews;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CouponViewModel viewModel;

    @NotNull
    private final J viewOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponBlockViewHolder(@NotNull View containerView, @NotNull CouponPromoRouter couponRouter, @NotNull J viewOwner, @NotNull InterfaceC7851b bus, @NotNull ComponentCallbacksC5392m fragment, @NotNull CouponListDecoration couponListDecoration, @NotNull AdultDelegate<BaseCouponVO.CouponVO> adultDelegate, @NotNull AdultHandler adultHandler, @NotNull l tokenizedAnalytics, @NotNull CouponViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(couponRouter, "couponRouter");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(couponListDecoration, "couponListDecoration");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.couponRouter = couponRouter;
        this.viewOwner = viewOwner;
        this.bus = bus;
        this.fragment = fragment;
        this.couponListDecoration = couponListDecoration;
        this.adultDelegate = adultDelegate;
        this.adultHandler = adultHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.marginDefault = getContext().getResources().getDimensionPixelSize(R$dimen.default_margin);
        this.marginSmall = getContext().getResources().getDimensionPixelSize(R$dimen.margin_extra_small);
        WidgetSingleCouponBinding bind = WidgetSingleCouponBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.blockBinding = bind;
        CouponCardBinding bind2 = CouponCardBinding.bind(bind.rootCv.getRootView());
        Intrinsics.checkNotNullExpressionValue(bind2, "bind(...)");
        this.cardBinding = bind2;
        this.previewViews = new AdultProductPreview[]{bind2.previewFirst, bind2.previewSecond, bind2.previewThird};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyResult(CouponResult result) {
        ViewGroup rootView = ContextExtKt.getRootView(this.fragment);
        Resources resources = getContext().getResources();
        if (result instanceof CouponResult.Auth) {
            this.couponRouter.showNeedAuthTooltip(this.fragment);
        } else if (result instanceof CouponResult.Success) {
            CouponPromoRouter couponPromoRouter = this.couponRouter;
            J j11 = this.viewOwner;
            Intrinsics.f(resources);
            CouponPromoRouter.showSuccessToolTip$default(couponPromoRouter, j11, resources, rootView, null, null, 24, null);
            if (this.item != null) {
                InterfaceC7851b.a.a(this.bus, null, null, null, null, 15);
            }
        } else {
            if (!(result instanceof CouponResult.Fail)) {
                throw new o();
            }
            CouponResult.Fail fail = (CouponResult.Fail) result;
            if (fail.getThrowable() instanceof OzonError.NetworkError.ServerError) {
                CouponPromoRouter couponPromoRouter2 = this.couponRouter;
                Intrinsics.f(resources);
                CouponPromoRouter.showErrorToolTip$default(couponPromoRouter2, this.viewOwner, resources, rootView, fail.getMessage(), null, 16, null);
            } else {
                CouponPromoRouter couponPromoRouter3 = this.couponRouter;
                J j12 = this.viewOwner;
                Intrinsics.f(resources);
                CouponPromoRouter.showErrorToolTip$default(couponPromoRouter3, j12, resources, rootView, null, null, 24, null);
            }
        }
        this.bus.hideLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$1(final CouponBlockViewHolder couponBlockViewHolder, final BaseCouponVO baseCouponVO, View view) {
        AdultHandler adultHandler = couponBlockViewHolder.adultHandler;
        boolean shouldBlur = ((BaseCouponVO.CouponVO) baseCouponVO).getShouldBlur();
        Context context = couponBlockViewHolder.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G supportFragmentManager = ((r) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, shouldBlur, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder$bind$1$2$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                CouponPromoRouter couponPromoRouter;
                couponPromoRouter = CouponBlockViewHolder.this.couponRouter;
                g.a.a(couponPromoRouter.getScreenRouter(), ((BaseCouponVO.CouponVO) baseCouponVO).getDeepLink(), null, null, 6);
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.DefaultImpls.onAdultReject(this);
            }
        }, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadProductImages(BaseCouponVO.CouponVO item) {
        AdultProductPreview[] adultProductPreviewArr;
        int i11;
        int i12;
        AdultProductPreview adultProductPreview;
        List<BaseCouponVO.ProductVO> products = item.getProducts();
        int productSize = item.getProductSize();
        boolean shouldBlur = item.getShouldBlur();
        List b02 = shouldBlur ? C7714v.b0(new ImageTransformation.Blur(0, 0, 3, null), new ImageTransformation.RoundedCorners(0, null, 3, null)) : K.f71697a;
        AdultProductPreview[] adultProductPreviewArr2 = this.previewViews;
        int length = adultProductPreviewArr2.length;
        int i13 = 0;
        while (i13 < length) {
            AdultProductPreview adultProductPreview2 = adultProductPreviewArr2[i13];
            Intrinsics.f(adultProductPreview2);
            BaseCouponVO.ProductVO productVO = (BaseCouponVO.ProductVO) C7714v.Q(i13, products);
            adultProductPreview2.showAdult(shouldBlur && productVO != null);
            String image = productVO != null ? productVO.getImage() : null;
            if (image == null || image.length() == 0) {
                adultProductPreviewArr = adultProductPreviewArr2;
                i11 = length;
                i12 = i13;
                adultProductPreview = adultProductPreview2;
                ViewExtKt.gone(adultProductPreview);
            } else {
                ViewExtKt.show(adultProductPreview2);
                i12 = i13;
                i11 = length;
                adultProductPreviewArr = adultProductPreviewArr2;
                adultProductPreview = adultProductPreview2;
                ImageViewExtKt.load$default(adultProductPreview2.getImageView(), image, b02, null, Integer.valueOf(R$drawable.ozon_image_placeholder), null, false, null, 116, null);
            }
            adultProductPreview.getLayoutParams().width = productSize;
            adultProductPreview.getLayoutParams().height = productSize;
            i13 = i12 + 1;
            length = i11;
            adultProductPreviewArr2 = adultProductPreviewArr;
        }
    }

    private final void observeActivateResult() {
        p<CouponResult> observeOn = this.viewModel.observeActivateResult().filter(new a(new CouponBlockViewHolder$observeActivateResult$1(this), 12)).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, this, new CouponBlockViewHolder$observeActivateResult$2(this), CouponBlockViewHolder$observeActivateResult$3.INSTANCE, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeActivateResult$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    private final void observeActivatedCoupons() {
        p<Set<String>> observeOn = this.viewModel.observeActivatedCoupons().filter(new c(new CouponBlockViewHolder$observeActivatedCoupons$1(this), 8)).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, this, new CouponBlockViewHolder$observeActivatedCoupons$2(this), CouponBlockViewHolder$observeActivatedCoupons$3.INSTANCE, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeActivatedCoupons$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(new CouponBlockViewHolder$onAttach$1(this));
        observeActivateResult();
        observeActivatedCoupons();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BaseCouponVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSingleCouponBinding widgetSingleCouponBinding = this.blockBinding;
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
        widgetSingleCouponBinding.rootFl.setBackgroundColor(item.getBackgroundColor());
        this.couponListDecoration.setDivider(new ColorDrawable(item.getBackgroundColor()));
        if (item instanceof BaseCouponVO.EmptyCouponVO) {
            CouponView rootCv = widgetSingleCouponBinding.rootCv;
            Intrinsics.checkNotNullExpressionValue(rootCv, "rootCv");
            ViewExtKt.gone(rootCv);
            return;
        }
        BaseCouponVO.CouponVO couponVO = (BaseCouponVO.CouponVO) item;
        this.item = couponVO;
        if (couponVO.getIsAdult()) {
            this.adultDelegate.bindItem((AdultVO) item);
        } else {
            loadProductImages(couponVO);
        }
        CouponView rootCv2 = widgetSingleCouponBinding.rootCv;
        Intrinsics.checkNotNullExpressionValue(rootCv2, "rootCv");
        ViewExtKt.show(rootCv2);
        ViewGroup.LayoutParams layoutParams = widgetSingleCouponBinding.rootCv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (couponVO.getIsEven()) {
            int i11 = this.marginDefault;
            int i12 = this.marginSmall;
            layoutParams2.setMargins(i11, i12, i12, i12);
        } else {
            int i13 = this.marginSmall;
            layoutParams2.setMargins(i13, i13, this.marginDefault, i13);
        }
        widgetSingleCouponBinding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC3598a(4, this, item));
        CouponCardBinding couponCardBinding = this.cardBinding;
        couponCardBinding.titleTv.setText(couponVO.getName());
        couponCardBinding.descriptionTv.setText(couponVO.getDescription());
        ImageView pointsIv = couponCardBinding.pointsIv;
        Intrinsics.checkNotNullExpressionValue(pointsIv, "pointsIv");
        ViewExtKt.showOrGone(pointsIv, Boolean.valueOf(couponVO.getIsPointsVisible()));
        ImageView couponImageIv = couponCardBinding.couponImageIv;
        Intrinsics.checkNotNullExpressionValue(couponImageIv, "couponImageIv");
        ImageViewExtKt.loadImageOrGone(couponImageIv, couponVO.getHeaderImage());
        couponCardBinding.conditionsTv.setText(couponVO.getConditions().getText());
        couponCardBinding.conditionsTv.setTextColor(couponVO.getConditions().getColor());
        ImageView couponAppliedIv = couponCardBinding.couponAppliedIv;
        Intrinsics.checkNotNullExpressionValue(couponAppliedIv, "couponAppliedIv");
        ViewExtKt.showOrGone(couponAppliedIv, Boolean.valueOf(couponVO.getActive()));
        couponCardBinding.actionBtn.setText(couponVO.getActionButton().getText());
        TextView actionBtn = couponCardBinding.actionBtn;
        Intrinsics.checkNotNullExpressionValue(actionBtn, "actionBtn");
        ViewExtKt.setOnClickListenerThrottle$default(actionBtn, 0L, new CouponBlockViewHolder$bind$1$3$1(item, this), 1, null);
    }
}
