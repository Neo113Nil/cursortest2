package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryReviewProductV2Binding;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductInfoView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001CB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0+8\u0006¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010>\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b:\u0010;*\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b?\u0010@*\u0004\bA\u0010=¨\u0006D"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "isFreshMiniApp", "<init>", "(Landroid/content/Context;Z)V", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "", "action", "ifProductsRecyclerViewInitialized", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;", "ifProductInfoViewInitialized", "Z", "Landroidx/constraintlayout/widget/Barrier;", "rightPanelBarrier", "Landroidx/constraintlayout/widget/Barrier;", "getRightPanelBarrier$annotations", "()V", "Landroid/widget/FrameLayout;", "contentContainer", "Landroid/widget/FrameLayout;", "getContentContainer", "()Landroid/widget/FrameLayout;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/SideButtonsView;", "sideButtonsHeader$delegate", "LSc/j;", "getSideButtonsHeader", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/SideButtonsView;", "sideButtonsHeader", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonView;", "closeButton$delegate", "getCloseButton", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonView;", "closeButton", "Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "productBinding", "Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "getProductBinding", "()Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "LSc/j;", "productRecyclerViewDelegate", "productInfoViewDelegate", "getProductInfoViewDelegate", "()LSc/j;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/RatingTextView;", "ratingText", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/RatingTextView;", "getRatingText", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/RatingTextView;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout;", "rightPanel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout;", "getRightPanel", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout;", "getProductRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "getProductRecyclerView$delegate", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;)Ljava/lang/Object;", "productRecyclerView", "getProductInfoView", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;", "getProductInfoView$delegate", "productInfoView", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ReviewGalleryView extends ConstraintLayout {

    /* renamed from: closeButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j closeButton;

    @NotNull
    private final FrameLayout contentContainer;
    private final boolean isFreshMiniApp;

    @NotNull
    private final ViewGalleryReviewProductV2Binding productBinding;

    @NotNull
    private final InterfaceC4008j<ProductInfoView> productInfoViewDelegate;

    @NotNull
    private final InterfaceC4008j<RecyclerView> productRecyclerViewDelegate;

    @NotNull
    private final RatingTextView ratingText;

    @NotNull
    private final RightPanelWithMuteLayout rightPanel;

    @NotNull
    private final Barrier rightPanelBarrier;

    /* renamed from: sideButtonsHeader$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sideButtonsHeader;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int productViewHeight = UiExtKt.toPx(52);
    private static final int newProductViewHeight = UiExtKt.toPx(54);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView$Companion;", "", "<init>", "()V", "", "newProductViewHeight", "I", "getNewProductViewHeight", "()I", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getNewProductViewHeight() {
            return ReviewGalleryView.newProductViewHeight;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewGalleryView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isFreshMiniApp = z11;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.rightPanelBarrier);
        barrier.setLayoutParams(new ConstraintLayout.b(0, 0));
        barrier.f(2);
        barrier.setReferencedIds(new int[]{R$id.productContainer, R$id.ratingText});
        addView(barrier);
        this.rightPanelBarrier = barrier;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.contentContainer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = dimens.getDP_10();
        frameLayout.setLayoutParams(bVar);
        addView(frameLayout);
        this.contentContainer = frameLayout;
        this.sideButtonsHeader = DelegatesKt.lazyUnsafe(new ReviewGalleryView$special$$inlined$lazyView$1(this, context));
        this.closeButton = DelegatesKt.lazyUnsafe(new ReviewGalleryView$special$$inlined$lazyView$2(this, context));
        ViewGalleryReviewProductV2Binding inflate = ViewGalleryReviewProductV2Binding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        inflate.getConstraintLayout().setId(R$id.productContainer);
        ConstraintLayout productContainerCl = inflate.productContainerCl;
        Intrinsics.checkNotNullExpressionValue(productContainerCl, "productContainerCl");
        ViewGroup.LayoutParams layoutParams = productContainerCl.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).height = productViewHeight;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41642l = R$id.contentContainer;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = dimens.getDP_16();
        bVar2.setMarginStart(dimens.getDP_16());
        bVar2.setMarginEnd(dimens.getDP_16());
        productContainerCl.setLayoutParams(bVar2);
        this.productBinding = inflate;
        this.productRecyclerViewDelegate = LazyUtilsKt.unsafeLazy(new ReviewGalleryView$productRecyclerViewDelegate$1(context, this));
        this.productInfoViewDelegate = LazyUtilsKt.unsafeLazy(new ReviewGalleryView$productInfoViewDelegate$1(context, this));
        RatingTextView ratingTextView = new RatingTextView(context, null, 0, 6, null);
        ratingTextView.setId(R$id.ratingText);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41640k = R$id.productContainer;
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = dimens.getDP_8();
        bVar3.setMarginStart(dimens.getDP_16());
        bVar3.setMarginEnd(dimens.getDP_16());
        bVar3.f41662z = 0;
        ratingTextView.setLayoutParams(bVar3);
        addView(ratingTextView);
        this.ratingText = ratingTextView;
        RightPanelWithMuteLayout rightPanelWithMuteLayout = new RightPanelWithMuteLayout(context, null, 2, null);
        rightPanelWithMuteLayout.setId(R$id.rightPanel);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41658v = 0;
        bVar4.f41640k = R$id.rightPanelBarrier;
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = dimens.getDP_16();
        rightPanelWithMuteLayout.setLayoutParams(bVar4);
        addView(rightPanelWithMuteLayout);
        this.rightPanel = rightPanelWithMuteLayout;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundResource(R$color.graphic_dark_key);
    }

    @NotNull
    public final SocialIconButtonView getCloseButton() {
        return (SocialIconButtonView) this.closeButton.getValue();
    }

    @NotNull
    public final FrameLayout getContentContainer() {
        return this.contentContainer;
    }

    @NotNull
    public final ViewGalleryReviewProductV2Binding getProductBinding() {
        return this.productBinding;
    }

    @NotNull
    public final ProductInfoView getProductInfoView() {
        return this.productInfoViewDelegate.getValue();
    }

    @NotNull
    public final RecyclerView getProductRecyclerView() {
        return this.productRecyclerViewDelegate.getValue();
    }

    @NotNull
    public final RatingTextView getRatingText() {
        return this.ratingText;
    }

    @NotNull
    public final RightPanelWithMuteLayout getRightPanel() {
        return this.rightPanel;
    }

    @NotNull
    public final SideButtonsView getSideButtonsHeader() {
        return (SideButtonsView) this.sideButtonsHeader.getValue();
    }

    public final void ifProductInfoViewInitialized(@NotNull Function1<? super ProductInfoView, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.productInfoViewDelegate.isInitialized()) {
            action.invoke(getProductInfoView());
        }
    }

    public final void ifProductsRecyclerViewInitialized(@NotNull Function1<? super RecyclerView, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.productRecyclerViewDelegate.isInitialized()) {
            action.invoke(getProductRecyclerView());
        }
    }
}
