package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation;

import WZ.l;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.view.MiniAppTitleView;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"JG\u0010-\u001a\u00020,*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J#\u00106\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00022\n\u00105\u001a\u000603j\u0002`4H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0018H\u0016¢\u0006\u0004\b8\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010=R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00180>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u0004\u0018\u00010B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020,0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/onboarding/MiniAppOnboardingInfoProvider;", "onboardingInfoProviders", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;Ljava/util/Map;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO$OnbordingItem;", "onboardings", "", "bindOnBoarding", "(Ljava/util/List;)V", "", "key", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "initDelegate", "(Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "cancelOnboardingJobs", "()V", "Lxe/M;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "delay", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lxe/B0;", "launchWithDelay", "(Lxe/M;Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)Lxe/B0;", "", "hasBottomSheetOpened", "()Z", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "Ljava/util/Map;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/view/MiniAppTitleView;", "miniAppTitleView", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/view/MiniAppTitleView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "", "onboardingJobs", "Ljava/util/List;", "onboardingWasShown", "Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiniAppTitleWidgetViewHolder extends k<MiniAppTitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;
    private final MiniAppTitleView miniAppTitleView;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final Map<OnboardingType, MiniAppOnboardingInfoProvider> onboardingInfoProviders;

    @NotNull
    private List<B0> onboardingJobs;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;
    private boolean onboardingWasShown;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiniAppTitleWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull l tokenizedAnalytics, @NotNull Map<OnboardingType, ? extends MiniAppOnboardingInfoProvider> onboardingInfoProviders, @NotNull CoroutineDispatcherProvider dispatchersProvider) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onboardingInfoProviders, "onboardingInfoProviders");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.references = references;
        this.onboardingViewModel = onboardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onboardingInfoProviders = onboardingInfoProviders;
        this.dispatchersProvider = dispatchersProvider;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.miniAppTitleView = containerView instanceof MiniAppTitleView ? (MiniAppTitleView) containerView : null;
        this.onboardingJobs = new ArrayList();
    }

    private final void bindOnBoarding(List<MiniAppTitleVO.OnbordingItem> onboardings) {
        if (this.miniAppTitleView == null) {
            return;
        }
        for (final MiniAppTitleVO.OnbordingItem onbordingItem : onboardings) {
            final MiniAppOnboardingInfoProvider miniAppOnboardingInfoProvider = this.onboardingInfoProviders.get(onbordingItem.getOnboardingType());
            if (miniAppOnboardingInfoProvider == null) {
                return;
            }
            final View childView = miniAppOnboardingInfoProvider.getChildView(this.miniAppTitleView);
            childView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleWidgetViewHolder$bindOnBoarding$lambda$2$$inlined$afterMeasured$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    CoroutineDispatcherProvider coroutineDispatcherProvider;
                    B0 launchWithDelay;
                    List list;
                    if (childView.getMeasuredWidth() <= 0 || childView.getMeasuredHeight() <= 0) {
                        return;
                    }
                    childView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    View view = childView;
                    MiniAppTitleWidgetViewHolder miniAppTitleWidgetViewHolder = this;
                    D a11 = K.a(miniAppTitleWidgetViewHolder);
                    coroutineDispatcherProvider = this.dispatchersProvider;
                    launchWithDelay = miniAppTitleWidgetViewHolder.launchWithDelay(a11, coroutineDispatcherProvider.getMainImmediate(), 300L, new MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1(this, miniAppOnboardingInfoProvider, onbordingItem, view, null));
                    list = this.onboardingJobs;
                    list.add(launchWithDelay);
                }
            });
        }
    }

    private final void cancelOnboardingJobs() {
        Iterator<T> it = this.onboardingJobs.iterator();
        while (it.hasNext()) {
            ((B0) it.next()).j(null);
        }
        this.onboardingJobs.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasBottomSheetOpened() {
        List<ComponentCallbacksC5392m> r02;
        G d11 = this.references.getContainer().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        if (d11 != null && (r02 = d11.r0()) != null) {
            ListIterator<ComponentCallbacksC5392m> listIterator = r02.listIterator(r02.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                ComponentCallbacksC5392m previous = listIterator.previous();
                if (previous instanceof BottomSheetComposerFragment) {
                    componentCallbacksC5392m = previous;
                    break;
                }
            }
            componentCallbacksC5392m = componentCallbacksC5392m;
        }
        return componentCallbacksC5392m != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(String key, OnBoardingDTO onBoarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(key, this.references, this.miniAppTitleView, onBoarding, this, this.onboardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new MiniAppTitleWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B0 launchWithDelay(M m11, CoroutineContext coroutineContext, long j11, Function2<? super M, ? super d<? super Unit>, ? extends Object> function2) {
        return C10727i.c(m11, coroutineContext, null, new MiniAppTitleWidgetViewHolder$launchWithDelay$1(j11, function2, null), 2);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        cancelOnboardingJobs();
        if (this.onboardingWasShown) {
            ComposerExtKt.withPageTag(this.references.getContainer(), new MiniAppTitleWidgetViewHolder$onDetach$1(this.onboardingViewModel));
        }
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MiniAppTitleVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        MiniAppTitleView miniAppTitleView = this.miniAppTitleView;
        if (miniAppTitleView != null) {
            miniAppTitleView.bind(item, this.actionHandler);
        }
        List<MiniAppTitleVO.OnbordingItem> onboardings = item.getOnboardings();
        if (onboardings != null) {
            bindOnBoarding(onboardings);
        }
    }
}
