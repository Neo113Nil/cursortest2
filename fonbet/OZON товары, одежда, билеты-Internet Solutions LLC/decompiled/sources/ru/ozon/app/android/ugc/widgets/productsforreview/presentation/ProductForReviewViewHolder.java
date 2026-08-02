package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import El.C2971a;
import GW.a;
import Go.e;
import W10.c;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import fW.ViewOnTouchListenerC6483a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductBinder;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductView;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.ugc.databinding.WidgetProductForReviewBinding;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002MNB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0018018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductView;", "Lru/ozon/app/android/ugc/databinding/WidgetProductForReviewBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetProductForReviewBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "link", "", "selectedRating", "buildRateTapActionLink", "(Ljava/lang/String;I)Ljava/lang/String;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "hideButtonVO", "", "bindHideAreaOrGone", "(Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;)V", "showErrorMessage", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Lru/ozon/app/android/ugc/databinding/WidgetProductForReviewBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductBinder;", "reviewProductBinder", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductBinder;", "Ljava/lang/Runnable;", "openDeeplinkRunnable", "Ljava/lang/Runnable;", "", "isHideTitleVisible", "Ljava/lang/Boolean;", "Landroid/widget/ImageView;", "imageIv", "Landroid/widget/ImageView;", "getImageIv", "()Landroid/widget/ImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "nameTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getNameTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lcom/google/android/flexbox/FlexboxLayout;", "badgesFl", "Lcom/google/android/flexbox/FlexboxLayout;", "getBadgesFl", "()Lcom/google/android/flexbox/FlexboxLayout;", "Companion", "RatingBarObserver", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ProductForReviewViewHolder extends k<ProductForReviewVO> implements ReviewProductView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FlexboxLayout badgesFl;

    @NotNull
    private final WidgetProductForReviewBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final ImageView imageIv;
    private Boolean isHideTitleVisible;

    @NotNull
    private final TextAtomV2View nameTav;
    private Runnable openDeeplinkRunnable;

    @NotNull
    private final ReviewProductBinder reviewProductBinder;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ProductsForReviewViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewViewHolder$Companion;", "", "<init>", "()V", "SKIP_REVIEW_COMPOSER_ACTION_V2", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewViewHolder$RatingBarObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar;", "view", "<init>", "(Landroidx/lifecycle/v;Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar;)V", "Landroidx/lifecycle/J;", "owner", "", "onResume", "(Landroidx/lifecycle/J;)V", "onDestroy", "Landroidx/lifecycle/v;", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RatingBarObserver implements DefaultLifecycleObserver {

        @NotNull
        private final AbstractC5434v lifecycle;

        @NotNull
        private final VectorRatingBar view;

        public RatingBarObserver(@NotNull AbstractC5434v lifecycle, @NotNull VectorRatingBar view) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(view, "view");
            this.lifecycle = lifecycle;
            this.view = view;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.lifecycle.e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.view.setRating(0.0f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProductForReviewViewHolder(@NotNull WidgetProductForReviewBinding binding, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull ProductsForReviewViewModel viewModel, @NotNull HandlersInhibitor inhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).enableClickThrottling(inhibitor).onComposerAction(new ProductForReviewViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.reviewProductBinder = new ReviewProductBinder(this, buildHandler);
        ImageView imageIv = binding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        this.imageIv = imageIv;
        TextAtomV2View nameTav = binding.nameTav;
        Intrinsics.checkNotNullExpressionValue(nameTav, "nameTav");
        this.nameTav = nameTav;
        FlexboxLayout badgesFl = binding.badgesFl;
        Intrinsics.checkNotNullExpressionValue(badgesFl, "badgesFl");
        this.badgesFl = badgesFl;
        getNameTav().setTextIsSelectable(false);
        binding.reviewRatingBar.setOnTouchListener(new ViewOnTouchListenerC6483a());
        binding.reviewRatingBar.setOnRatingBarChangeListener(new ProductForReviewViewHolder$1$2(this, binding));
        AbstractC5434v lifecycle = composerReferences.getContainer().g().getLifecycle();
        VectorRatingBar reviewRatingBar = binding.reviewRatingBar;
        Intrinsics.checkNotNullExpressionValue(reviewRatingBar, "reviewRatingBar");
        lifecycle.a(new RatingBarObserver(lifecycle, reviewRatingBar));
        binding.getConstraintLayout().setOnClickListener(new a(this, 4));
        binding.hideCL.setOnClickListener(new Il.a(this, 10));
        Iterator it = C7714v.b0(getNameTav(), getImageIv()).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new e(this, 9));
        }
    }

    private final void bindHideAreaOrGone(final ProductForReviewVO.HideButtonVO hideButtonVO) {
        final WidgetProductForReviewBinding widgetProductForReviewBinding = this.binding;
        LinearLayout hideCL = widgetProductForReviewBinding.hideCL;
        Intrinsics.checkNotNullExpressionValue(hideCL, "hideCL");
        ViewExtKt.showOrGone(hideCL, Boolean.valueOf(hideButtonVO != null));
        if (hideButtonVO != null) {
            IconButtonV3View hideButton = widgetProductForReviewBinding.hideButton;
            Intrinsics.checkNotNullExpressionValue(hideButton, "hideButton");
            IconButtonV3HolderKt.bindOrGone(hideButton, hideButtonVO.getIconButton(), this.actionHandler);
            TextAtomV2View hideTitle = widgetProductForReviewBinding.hideTitle;
            Intrinsics.checkNotNullExpressionValue(hideTitle, "hideTitle");
            TextHolderKt.bindOrGone$default(hideTitle, hideButtonVO.getTitle(), null, 2, null);
            widgetProductForReviewBinding.hideTitle.setClickable(false);
            widgetProductForReviewBinding.hideTitle.setTextIsSelectable(false);
            if (this.isHideTitleVisible == null) {
                final ConstraintLayout constraintLayout = widgetProductForReviewBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                G.a(constraintLayout, new Runnable() { // from class: ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder$bindHideAreaOrGone$lambda$13$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z11 = widgetProductForReviewBinding.reviewRatingBar.getRight() >= ((widgetProductForReviewBinding.getConstraintLayout().getWidth() - hideButtonVO.getTitleWidth()) - widgetProductForReviewBinding.hideCL.getPaddingRight()) - widgetProductForReviewBinding.hideCL.getPaddingLeft();
                        this.isHideTitleVisible = Boolean.valueOf(!z11);
                        TextAtomV2View hideTitle2 = widgetProductForReviewBinding.hideTitle;
                        Intrinsics.checkNotNullExpressionValue(hideTitle2, "hideTitle");
                        ViewExtKt.showOrGone(hideTitle2, Boolean.valueOf(!z11));
                    }
                });
            } else {
                TextAtomV2View hideTitle2 = widgetProductForReviewBinding.hideTitle;
                Intrinsics.checkNotNullExpressionValue(hideTitle2, "hideTitle");
                ViewExtKt.showOrGone(hideTitle2, this.isHideTitleVisible);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildRateTapActionLink(String link, int selectedRating) {
        Uri.Builder buildUpon = Uri.parse(link).buildUpon();
        buildUpon.appendQueryParameter("selectedRating", String.valueOf(selectedRating));
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(ProductForReviewViewHolder productForReviewViewHolder, View view) {
        AtomAction.Move rateTapAction;
        ProductForReviewVO boundData = productForReviewViewHolder.getBoundData();
        if (boundData == null || (rateTapAction = boundData.getRateTapAction()) == null) {
            return;
        }
        productForReviewViewHolder.actionHandler.invoke(rateTapAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(ProductForReviewViewHolder productForReviewViewHolder, View view) {
        ProductForReviewVO.HideButtonVO hideButton;
        IconButtonV3DTO iconButton;
        CommonControlSettings common;
        AtomAction atomAction;
        ProductForReviewVO boundData = productForReviewViewHolder.getBoundData();
        if (boundData == null || (hideButton = boundData.getHideButton()) == null || (iconButton = hideButton.getIconButton()) == null || (common = iconButton.getCommon()) == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        productForReviewViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(ProductForReviewViewHolder productForReviewViewHolder, View view) {
        AtomAction productTapAction;
        ProductForReviewVO boundData = productForReviewViewHolder.getBoundData();
        if (boundData == null || (productTapAction = boundData.getProductTapAction()) == null) {
            return;
        }
        productForReviewViewHolder.actionHandler.invoke(productTapAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage() {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup b11 = C2971a.b(this.composerReferences);
        if (b11 == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null), this.composerReferences.getContainer().g(), null, 8, null).show();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductView
    public RecyclerView getBadgesRv() {
        return ReviewProductView.DefaultImpls.getBadgesRv(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductView
    @NotNull
    public ImageView getImageIv() {
        return this.imageIv;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductView
    @NotNull
    public TextAtomV2View getNameTav() {
        return this.nameTav;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getRemoveWidget(), new ProductForReviewViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getError(), new ProductForReviewViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.binding.getConstraintLayout().removeCallbacks(this.openDeeplinkRunnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductForReviewVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetProductForReviewBinding widgetProductForReviewBinding = this.binding;
        widgetProductForReviewBinding.badgesFl.removeAllViews();
        FlexboxLayout badgesFl = widgetProductForReviewBinding.badgesFl;
        Intrinsics.checkNotNullExpressionValue(badgesFl, "badgesFl");
        List<ReviewProductVO.BadgeVO> badges = item.getProduct().getBadges();
        ViewExtKt.showOrGone(badgesFl, Boolean.valueOf(!(badges == null || badges.isEmpty())));
        List<ReviewProductVO.BadgeVO> badges2 = item.getProduct().getBadges();
        if (badges2 != null) {
            Iterator<T> it = badges2.iterator();
            while (it.hasNext()) {
                AtomDTO badge = ((ReviewProductVO.BadgeVO) it.next()).getBadge();
                BadgeDTO badgeDTO = badge instanceof BadgeDTO ? (BadgeDTO) badge : null;
                if (badgeDTO != null) {
                    BadgeView badgeView = new BadgeView(getContext(), null, 0, 0, 14, null);
                    FlexboxLayout.a aVar = new FlexboxLayout.a(-2, -2);
                    Dimens dimens = Dimens.INSTANCE;
                    ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = dimens.getDP_4();
                    aVar.setMarginEnd(dimens.getDP_4());
                    badgeView.setLayoutParams(aVar);
                    BadgeHolderKt.bind(badgeView, badgeDTO, this.actionHandler);
                    widgetProductForReviewBinding.badgesFl.addView(badgeView);
                }
            }
        }
        this.reviewProductBinder.bind(ReviewProductVO.copy$default(item.getProduct(), 0L, null, null, null, null, null, null, null, null, 383, null));
        bindHideAreaOrGone(item.getHideButton());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProductForReviewVO item, @NotNull c trackingData, f viewedPond) {
        t viewEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        ProductForReviewVO boundData = getBoundData();
        if (boundData == null || (viewEvent = boundData.getViewEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
    }
}
