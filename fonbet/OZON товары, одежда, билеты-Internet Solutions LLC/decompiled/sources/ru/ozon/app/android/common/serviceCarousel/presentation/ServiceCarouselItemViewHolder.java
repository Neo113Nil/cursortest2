package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.InterfaceC4008j;
import UZ.a;
import WZ.g;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.serviceCarousel.core.ItemViewedUpdate;
import ru.ozon.app.android.common.ui.serviceCarousel.databinding.WidgetServiceCarouselItemBinding;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.E0;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 A2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001AB\u007f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\b*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R,\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "", "analyticsTrack", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Landroidx/lifecycle/J;", "parentLifecycleOwner", "Lkotlin/Function2;", "LUZ/a;", "LWZ/g;", "pageIdModifier", "", "isKeepPermanentPageViewId", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function2;Ljava/lang/Boolean;)V", "", "getOnboardingVerticalOffset", "(Landroid/view/View;)I", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingDTO", "initDelegate", "(Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "item", "handleItemClick", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;)V", "onViewInVisibleBounds", "()V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;Ll20/d;)V", "showOnBoardingForItem", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/Boolean;", "Lru/ozon/app/android/common/ui/serviceCarousel/databinding/WidgetServiceCarouselItemBinding;", "binding", "Lru/ozon/app/android/common/ui/serviceCarousel/databinding/WidgetServiceCarouselItemBinding;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Landroid/graphics/Rect;", "visibleWindowRect$delegate", "LSc/j;", "getVisibleWindowRect", "()Landroid/graphics/Rect;", "visibleWindowRect", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "Companion", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServiceCarouselItemViewHolder extends k<ServiceCarouselItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<Map<String, String>, Unit> analyticsTrack;

    @NotNull
    private final WidgetServiceCarouselItemBinding binding;

    @NotNull
    private final View containerView;
    private final Boolean isKeepPermanentPageViewId;
    private ServiceCarouselItemVO item;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final Function2<a, g, g> pageIdModifier;

    @NotNull
    private final J parentLifecycleOwner;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: visibleWindowRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j visibleWindowRect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int onboardingTopMargin = ResourceExtKt.toPx(4);
    private static final float onboardingCornerRadius = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselItemViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ServiceCarouselItemVO serviceCarouselItemVO = ServiceCarouselItemViewHolder.this.item;
            if (serviceCarouselItemVO != null) {
                ServiceCarouselItemViewHolder.this.handleItemClick(serviceCarouselItemVO);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemViewHolder$Companion;", "", "<init>", "()V", "", "SERVICE_CAROUSEL_ITEM_ONBOARDING_KEY", "Ljava/lang/String;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ServiceCarouselItemViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Map<String, String>, Unit> analyticsTrack, @NotNull ComposerReferences refs, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull J parentLifecycleOwner, @NotNull Function2<? super a, ? super g, g> pageIdModifier, Boolean bool) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(analyticsTrack, "analyticsTrack");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(parentLifecycleOwner, "parentLifecycleOwner");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        this.containerView = containerView;
        this.actionHandler = actionHandler;
        this.analyticsTrack = analyticsTrack;
        this.refs = refs;
        this.onBoardingViewModel = onBoardingViewModel;
        this.parentLifecycleOwner = parentLifecycleOwner;
        this.pageIdModifier = pageIdModifier;
        this.isKeepPermanentPageViewId = bool;
        WidgetServiceCarouselItemBinding bind = WidgetServiceCarouselItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.visibleWindowRect = LazyUtilsKt.unsafeLazy(ServiceCarouselItemViewHolder$visibleWindowRect$2.INSTANCE);
        CardView root = bind.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        ViewExtKt.setOnClickListenerThrottle$default(root, 0L, new AnonymousClass1(), 1, null);
    }

    private final int getOnboardingVerticalOffset(View view) {
        Context context = view.getContext();
        int statusBarHeight = context != null ? ResourceExtKt.getStatusBarHeight(context) : 0;
        view.getWindowVisibleDisplayFrame(getVisibleWindowRect());
        return statusBarHeight - getVisibleWindowRect().top;
    }

    private final Rect getVisibleWindowRect() {
        return (Rect) this.visibleWindowRect.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleItemClick(ServiceCarouselItemVO item) {
        Map<String, String> params;
        if (item.getShowNewBadge()) {
            this.refs.getController().update(new ItemViewedUpdate(item.getId()));
            if ((item.getAction() instanceof AtomAction.Move) && (params = ((AtomAction.Move) item.getAction()).getParams()) != null) {
                this.analyticsTrack.invoke(params);
            }
        }
        if (item.getStoryId() == null) {
            this.actionHandler.invoke(item.getAction());
            return;
        }
        String deeplink = item.getDeeplink();
        if (deeplink == null) {
            return;
        }
        ComposerNavigator navigator = this.refs.getNavigator();
        View view = this.containerView;
        view.setTransitionName("transition_view" + item);
        Unit unit = Unit.f71690a;
        navigator.openDeeplink(deeplink, U.i(new Pair("transition_view", view)));
        if (Intrinsics.d(this.isKeepPermanentPageViewId, Boolean.TRUE)) {
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents(this.refs.getTokenizedAnalytics(), tokenizedEvent, new ServiceCarouselItemViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(this.pageIdModifier));
                return;
            }
            return;
        }
        t tokenizedEvent2 = item.getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent2, null, 2, null);
        }
    }

    private final void initDelegate(View view, OnBoardingDTO onBoardingDTO) {
        this.onBoardingDelegate = new OnBoardingDelegateImpl("service_carousel_item_onboarding_key", this.refs, view, onBoardingDTO, this.parentLifecycleOwner, this.onBoardingViewModel, null, 0.0f, 192, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        t tokenizedEvent2;
        super.onViewInVisibleBounds();
        if (Intrinsics.d(this.isKeepPermanentPageViewId, Boolean.TRUE)) {
            ServiceCarouselItemVO serviceCarouselItemVO = this.item;
            if (serviceCarouselItemVO == null || (tokenizedEvent2 = serviceCarouselItemVO.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents(this.refs.getTokenizedAnalytics(), tokenizedEvent2, new ServiceCarouselItemViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(this.pageIdModifier));
            return;
        }
        ServiceCarouselItemVO serviceCarouselItemVO2 = this.item;
        if (serviceCarouselItemVO2 == null || (tokenizedEvent = serviceCarouselItemVO2.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    public final Object showOnBoardingForItem(@NotNull OnBoardingDTO onBoardingDTO, @NotNull d<? super Unit> dVar) {
        CoroutineContext context = dVar.getContext();
        if (this.onBoardingDelegate == null) {
            initDelegate(this.containerView, onBoardingDTO);
        }
        int onboardingVerticalOffset = getOnboardingVerticalOffset(this.containerView);
        E0.f(context);
        OnBoardingDelegate onBoardingDelegate = this.onBoardingDelegate;
        if (onBoardingDelegate != null) {
            float f7 = onboardingCornerRadius;
            onBoardingDelegate.bind(this, new OnBoardingCutConfig(null, new Integer(onboardingTopMargin + onboardingVerticalOffset), null, new Integer(-onboardingVerticalOffset), null, null, new Float(f7), false, 181, null), null);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ServiceCarouselItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        WidgetServiceCarouselItemBinding widgetServiceCarouselItemBinding = this.binding;
        ImageView imageIv = widgetServiceCarouselItemBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.load$default(imageIv, item.getImage(), null, null, null, null, false, null, 126, null);
        widgetServiceCarouselItemBinding.imageIv.setClipToOutline(true);
        View imageBackground = widgetServiceCarouselItemBinding.imageBackground;
        Intrinsics.checkNotNullExpressionValue(imageBackground, "imageBackground");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewExtKt.setBackgroundTint(imageBackground, styleParser.parseColor(context, item.getImageBgColor(), R$color.layer_floor_3));
        TextAtomView tvTitle = widgetServiceCarouselItemBinding.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        TextAtomHolderKt.bind$default(tvTitle, item.getTitle(), null, 2, null);
        TextAtomView tvNewBadge = widgetServiceCarouselItemBinding.tvNewBadge;
        Intrinsics.checkNotNullExpressionValue(tvNewBadge, "tvNewBadge");
        tvNewBadge.setVisibility(item.getShowNewBadge() ? 0 : 8);
        if (item.getShouldShowBadge()) {
            BadgeView badge = widgetServiceCarouselItemBinding.badge;
            Intrinsics.checkNotNullExpressionValue(badge, "badge");
            BadgeHolderKt.bindOrGone$default(badge, item.getBadge(), (Function1) null, 2, (Object) null);
        } else {
            BadgeView badge2 = widgetServiceCarouselItemBinding.badge;
            Intrinsics.checkNotNullExpressionValue(badge2, "badge");
            ViewExtKt.gone(badge2);
        }
    }
}
