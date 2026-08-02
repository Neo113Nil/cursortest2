package ru.ozon.app.android.pdp.widgets.crosssale.presentation;

import GZ.g;
import LZ.b;
import WZ.l;
import a00.C4911f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.databinding.PdpWidgetCrossSaleItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.view.crosssale.CrossSaleListFragment;
import ru.ozon.app.android.pdp.widgets.crosssale.data.CrossSaleDTO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.R$color;
import sZ.c;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u00103R\u0016\u00105\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleVO;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetCrossSaleItemBinding;", "Landroid/view/View;", "containerView", "LGZ/g;", "router", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "", "isSelect", "<init>", "(Landroid/view/View;LGZ/g;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Z)V", "", "image", "getItemView", "(Ljava/lang/String;)Landroid/view/View;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "", "onOnBoardingShow", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "key", "viewModel", "onboarding", "initDelegate", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "LGZ/g;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Z", "Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleVO;", "Landroid/graphics/drawable/Drawable;", "rippleDrawable", "Landroid/graphics/drawable/Drawable;", "colorDrawable", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossSaleViewHolder extends BindingWidgetViewHolder<CrossSaleVO, PdpWidgetCrossSaleItemBinding> {
    private final Drawable colorDrawable;

    @NotNull
    private final View containerView;
    private final boolean isSelect;
    private CrossSaleVO item;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final PDPOnBoardingViewModel pdpOnBoardingViewModel;

    @NotNull
    private final ComposerReferences refs;
    private final Drawable rippleDrawable;

    @NotNull
    private final g router;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.crosssale.presentation.CrossSaleViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetCrossSaleItemBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetCrossSaleItemBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetCrossSaleItemBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetCrossSaleItemBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetCrossSaleItemBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossSaleViewHolder(@NotNull View containerView, @NotNull g router, @NotNull PDPOnBoardingViewModel pdpOnBoardingViewModel, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, boolean z11) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(pdpOnBoardingViewModel, "pdpOnBoardingViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.router = router;
        this.pdpOnBoardingViewModel = pdpOnBoardingViewModel;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isSelect = z11;
        this.rippleDrawable = a.getDrawable(getContainerView().getContext(), R$drawable.bg_white_ripple_blue);
        this.colorDrawable = a.getDrawable(getContainerView().getContext(), R$color.layer_floor_1);
        PdpWidgetCrossSaleItemBinding binding = getBinding();
        if (z11) {
            ViewGroup.LayoutParams layoutParams = binding.getConstraintLayout().getLayoutParams();
            Dimens dimens = Dimens.INSTANCE;
            layoutParams.height = dimens.getDP_76();
            ViewGroup.LayoutParams layoutParams2 = binding.titleTv.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
            bVar.setMarginStart(dimens.getDP_12());
            bVar.setMarginEnd(dimens.getDP_8());
            TextView textView = binding.titleTv;
            StyleParser styleParser = StyleParser.INSTANCE;
            Integer parseTextStyle = styleParser.parseTextStyle("tsCompact500Medium");
            if (parseTextStyle != null) {
                int intValue = parseTextStyle.intValue();
                Intrinsics.f(textView);
                Context context = getContainerView().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TextViewExtKt.applyStyle(textView, context, intValue);
            }
            textView.setTextColor(a.getColor(getContainerView().getContext(), R$color.text_light_key));
            ViewGroup.LayoutParams layoutParams3 = binding.subtitleTv.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) layoutParams3)).topMargin = dimens.getDP_2();
            TextView textView2 = binding.subtitleTv;
            Integer parseTextStyle2 = styleParser.parseTextStyle("tsBody400Small");
            if (parseTextStyle2 != null) {
                int intValue2 = parseTextStyle2.intValue();
                Intrinsics.f(textView2);
                Context context2 = getContainerView().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                TextViewExtKt.applyStyle(textView2, context2, intValue2);
            }
            binding.subtitleTv.setTextColor(a.getColor(getContainerView().getContext(), R$color.text_secondary_on_dark));
            ImageView imageView = binding.disclosureIv;
            Intrinsics.f(imageView);
            ThemeExtKt.tint(imageView, Integer.valueOf(a.getColor(getContainerView().getContext(), R$color.graphic_tertiary_on_dark)));
        }
        getContainerView().setOnClickListener(new CD.a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(CrossSaleViewHolder crossSaleViewHolder, View view) {
        l lVar = crossSaleViewHolder.tokenizedAnalytics;
        CrossSaleVO crossSaleVO = crossSaleViewHolder.item;
        if (crossSaleVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        TokenizedAnalyticsExtKt.processClickEvents(lVar, crossSaleVO.getTokenizedEvent());
        CrossSaleVO crossSaleVO2 = crossSaleViewHolder.item;
        if (crossSaleVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        CrossSaleDTO.CrossSaleItem.Subitems subitems = crossSaleVO2.getSubitems();
        if (subitems != null) {
            String str = "CrossSaleListFragment";
            crossSaleViewHolder.router.c(new b(new c(str, CrossSaleListFragment.INSTANCE.newInstance$pdp_prodGoogleAllVendorsRelease(subitems.getCrossSaleTitle(), subitems.getItems()), null, false, false, null, false, false, false, 508, null)), null);
            return;
        }
        CrossSaleVO crossSaleVO3 = crossSaleViewHolder.item;
        if (crossSaleVO3 == null) {
            Intrinsics.n("item");
            throw null;
        }
        String deeplink = crossSaleVO3.getDeeplink();
        if (deeplink != null) {
            g.a.a(crossSaleViewHolder.router, deeplink, null, null, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final View getItemView(String image) {
        int i11 = 2;
        ImageView imageView = new ImageView(this.itemView.getContext());
        imageView.setId(View.generateViewId());
        Dimens dimens = Dimens.INSTANCE;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimens.getDP_56(), dimens.getDP_56()));
        boolean z11 = this.isSelect;
        ImageViewExtKt.load$default(imageView, image, C7714v.b0(z11 ? ImageTransformation.CenterCrop.INSTANCE : ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(UiExtKt.toPx((z11 ? CornerRadius.RADIUS_400 : CornerRadius.RADIUS_200).getPx()), null, i11, 0 == true ? 1 : 0)), null, null, null, false, null, 124, null);
        ThemeExtKt.setParandjaForDarkTheme(imageView);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(String key, PDPOnBoardingViewModel viewModel, OnBoardingDTO onboarding) {
        this.onBoardingDelegate = new OnBoardingDelegateImpl(key, this.refs, getContainerView(), onboarding, this, viewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOnBoardingShow(OnBoardingDTO onBoarding) {
        PDPOnBoardingViewModel pDPOnBoardingViewModel = this.pdpOnBoardingViewModel;
        C4911f container = this.refs.getContainer();
        String name = CrossSaleViewHolder.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        OnBoardingDelegateExtKt.checkForBindDelegate(container, name, pDPOnBoardingViewModel, getContainerView(), new CrossSaleViewHolder$onOnBoardingShow$1(this, pDPOnBoardingViewModel, onBoarding));
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CrossSaleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        binding(new CrossSaleViewHolder$bind$1(this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CrossSaleVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
