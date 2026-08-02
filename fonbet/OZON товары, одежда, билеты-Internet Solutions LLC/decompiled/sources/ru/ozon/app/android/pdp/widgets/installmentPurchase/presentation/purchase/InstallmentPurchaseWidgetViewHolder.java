package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase;

import Dc0.n;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.animationsaleblock.ObjectAnimation;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseViewMapper$OnboardingPayload$Show;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 S2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001SB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J'\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b%\u0010)J\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010\u001cJ)\u00100\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0013078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseView;", "view", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseView;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "animationTimer", "", "bindAnimation", "(Ljava/lang/Integer;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "installmentOnBoarding", "additionalHeight", "bindOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;I)V", "launchAnimation", "()V", "", "key", "onboarding", "initDelegate", "(Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;Ll20/d;Ljava/lang/Object;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegateInstallment", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "delayAnimation", "Ljava/lang/Integer;", "Landroid/view/animation/Animation;", "animation$delegate", "LSc/j;", "getAnimation", "()Landroid/view/animation/Animation;", "animation", "Landroid/widget/FrameLayout;", "containerGradient$delegate", "getContainerGradient", "()Landroid/widget/FrameLayout;", "containerGradient", "Landroid/view/View;", "viewGradient$delegate", "getViewGradient", "()Landroid/view/View;", "viewGradient", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseWidgetViewHolder extends k<InstallmentVO.Purchase> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animation;
    private final RecyclerView composerRv;

    /* renamed from: containerGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerGradient;
    private Integer delayAnimation;
    private OnBoardingDelegate onBoardingDelegateInstallment;

    @NotNull
    private final BaseOnBoardingViewModel.Default onBoardingViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SaleBlockViewModel saleBlockViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final InstallmentPurchaseView view;

    /* renamed from: viewGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewGradient;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/view/animationsaleblock/ObjectAnimation;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ObjectAnimation, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ObjectAnimation objectAnimation) {
            invoke2(objectAnimation);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ObjectAnimation objectAnimation) {
            RecyclerView recyclerView;
            if (objectAnimation == ObjectAnimation.PRICE_INSTALLMENT && (recyclerView = InstallmentPurchaseWidgetViewHolder.this.composerRv) != null && recyclerView.getScrollState() == 0) {
                InstallmentPurchaseWidgetViewHolder.this.launchAnimation();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentPurchaseWidgetViewHolder(@NotNull InstallmentPurchaseView view, @NotNull BaseOnBoardingViewModel.Default onBoardingViewModel, @NotNull SaleBlockViewModel saleBlockViewModel, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(view);
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(saleBlockViewModel, "saleBlockViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.onBoardingViewModel = onBoardingViewModel;
        this.saleBlockViewModel = saleBlockViewModel;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        this.composerRv = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerViewOrNull(view2);
        this.animation = DelegatesKt.lazyUnsafe(new InstallmentPurchaseWidgetViewHolder$animation$2(this));
        this.containerGradient = DelegatesKt.lazyUnsafe(new InstallmentPurchaseWidgetViewHolder$containerGradient$2(this));
        this.viewGradient = DelegatesKt.lazyUnsafe(new InstallmentPurchaseWidgetViewHolder$viewGradient$2(this));
        saleBlockViewModel.getEvents().observe(refs.getContainer().g(), new InstallmentPurchaseWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        view.setOnClickListener(new n(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(InstallmentPurchaseWidgetViewHolder installmentPurchaseWidgetViewHolder, View view) {
        AtomAction action;
        InstallmentVO.Purchase boundData = installmentPurchaseWidgetViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        if (installmentPurchaseWidgetViewHolder.delayAnimation != null) {
            installmentPurchaseWidgetViewHolder.saleBlockViewModel.leftTheScreen(ObjectAnimation.PRICE_INSTALLMENT);
            ViewExtKt.gone(installmentPurchaseWidgetViewHolder.getViewGradient());
            installmentPurchaseWidgetViewHolder.delayAnimation = null;
        }
        installmentPurchaseWidgetViewHolder.actionHandler.invoke(action);
    }

    private final void bindAnimation(Integer animationTimer) {
        if (animationTimer != null) {
            this.delayAnimation = Integer.valueOf(animationTimer.intValue());
        }
    }

    private final void bindOnboarding(OnBoardingDTO installmentOnBoarding, int additionalHeight) {
        if (installmentOnBoarding != null) {
            String onboardingKey = installmentOnBoarding.getOnboardingKey();
            if (onboardingKey == null) {
                onboardingKey = "installment_onboarding_is_shown";
            }
            OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), onboardingKey, this.onBoardingViewModel, this.view, new InstallmentPurchaseWidgetViewHolder$bindOnboarding$1$1(this, onboardingKey, installmentOnBoarding, additionalHeight));
        }
    }

    static /* synthetic */ void bindOnboarding$default(InstallmentPurchaseWidgetViewHolder installmentPurchaseWidgetViewHolder, OnBoardingDTO onBoardingDTO, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        installmentPurchaseWidgetViewHolder.bindOnboarding(onBoardingDTO, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animation getAnimation() {
        Object value = this.animation.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getContainerGradient() {
        return (FrameLayout) this.containerGradient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewGradient() {
        return (View) this.viewGradient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(String key, OnBoardingDTO onboarding) {
        this.onBoardingDelegateInstallment = new OnBoardingDelegateImpl(key, this.refs, this.view, onboarding, this, this.onBoardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        InstallmentPurchaseView installmentPurchaseView = this.view;
        if (!installmentPurchaseView.isLaidOut() || installmentPurchaseView.isLayoutRequested()) {
            installmentPurchaseView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseWidgetViewHolder$launchAnimation$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    InstallmentPurchaseWidgetViewHolder.this.getViewGradient().startAnimation(InstallmentPurchaseWidgetViewHolder.this.getAnimation());
                    InstallmentPurchaseWidgetViewHolder.this.getViewGradient().setVisibility(0);
                    l lVar = InstallmentPurchaseWidgetViewHolder.this.tokenizedAnalytics;
                    InstallmentVO.Purchase boundData = InstallmentPurchaseWidgetViewHolder.this.getBoundData();
                    TokenizedAnalyticsExtKt.processViewEvents(lVar, boundData != null ? boundData.getAnimationTokenizedEvent() : null);
                }
            });
            return;
        }
        getViewGradient().startAnimation(getAnimation());
        getViewGradient().setVisibility(0);
        l lVar = this.tokenizedAnalytics;
        InstallmentVO.Purchase boundData = getBoundData();
        TokenizedAnalyticsExtKt.processViewEvents(lVar, boundData != null ? boundData.getAnimationTokenizedEvent() : null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Integer num = this.delayAnimation;
        if (num != null) {
            this.saleBlockViewModel.appearedOnScreen(ObjectAnimation.PRICE_INSTALLMENT, num.intValue());
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        if (this.delayAnimation != null) {
            this.saleBlockViewModel.leftTheScreen(ObjectAnimation.PRICE_INSTALLMENT);
            ViewExtKt.gone(getViewGradient());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InstallmentVO.Purchase item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InstallmentVO.Purchase item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        bindAnimation(item.getAnimationTimer());
        if (item.getHasPeriods()) {
            return;
        }
        bindOnboarding$default(this, item.getOnboarding(), 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InstallmentVO.Purchase item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof InstallmentPurchaseViewMapper$OnboardingPayload$Show) {
            bindOnboarding(item.getOnboarding(), ((InstallmentPurchaseViewMapper$OnboardingPayload$Show) payload).getAdditionalOnboardingHeight());
        } else {
            bind(item, info);
        }
    }
}
