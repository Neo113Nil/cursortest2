package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import Ae.C2399j;
import Ae.C2404l0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Vg.d;
import WZ.l;
import WZ.t;
import Wc.a;
import a00.C4911f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.Map;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4AllDoneVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0004*\u0001P\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060)j\u0002`*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0018H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u0010.J3\u0010;\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00022\n\u00107\u001a\u000605j\u0002`62\u000e\u0010:\u001a\n\u0018\u000108j\u0004\u0018\u0001`9H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b=\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00180C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4MultiFrameBindDelegate;", "multiFrameBindDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4MultiFrameBindDelegate;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel;LVg/d;)V", "Ljk0/q;", "info", "", "triggerOnboarding", "(Ljk0/q;)V", "", "onboardingKey", "checkOnBoardingNeed", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "onBoarding", "initDelegate", "", "isScreenVisible", "()Z", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;Ll20/d;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onVisibleAreaChanged", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4MultiFrameBindDelegate;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingCornerRadius", "F", "", "verticalOffset", "I", "horizontalOffset", "ru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneWidgetViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneWidgetViewHolder$lifecycleObserver$1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4AllDoneWidgetViewHolder extends k<AviaSearchResultV4AllDoneVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int horizontalOffset;

    @NotNull
    private final AviaSearchResultV4AllDoneWidgetViewHolder$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final AviaSearchResultV4MultiFrameBindDelegate multiFrameBindDelegate;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private final float onboardingCornerRadius;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;
    private final int verticalOffset;

    @NotNull
    private final AviaSearchResultV4AllDoneViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$lifecycleObserver$1] */
    public AviaSearchResultV4AllDoneWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull AviaSearchResultV4MultiFrameBindDelegate multiFrameBindDelegate, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull AviaSearchResultV4AllDoneViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(multiFrameBindDelegate, "multiFrameBindDelegate");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.multiFrameBindDelegate = multiFrameBindDelegate;
        this.onBoardingViewModel = onBoardingViewModel;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new AviaSearchResultV4AllDoneWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.onboardingCornerRadius = ResourceExtKt.toPxF(10, getContext());
        this.verticalOffset = ResourceExtKt.toPx(2, getContext());
        this.horizontalOffset = ResourceExtKt.toPx(6, getContext());
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
                AviaSearchResultV4AllDoneWidgetViewHolder.this.onBoardingDelegate = null;
                super.onDestroy(owner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                AviaSearchResultV4AllDoneViewModel aviaSearchResultV4AllDoneViewModel;
                OnBoardingDelegate onBoardingDelegate;
                ComposerReferences composerReferences;
                BaseOnBoardingViewModel baseOnBoardingViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onPause(owner);
                aviaSearchResultV4AllDoneViewModel = AviaSearchResultV4AllDoneWidgetViewHolder.this.viewModel;
                aviaSearchResultV4AllDoneViewModel.unbindOnboarding();
                onBoardingDelegate = AviaSearchResultV4AllDoneWidgetViewHolder.this.onBoardingDelegate;
                if (onBoardingDelegate != null) {
                    onBoardingDelegate.unbind();
                }
                composerReferences = AviaSearchResultV4AllDoneWidgetViewHolder.this.refs;
                C4911f container = composerReferences.getContainer();
                baseOnBoardingViewModel = AviaSearchResultV4AllDoneWidgetViewHolder.this.onBoardingViewModel;
                ComposerExtKt.withPageTag(container, new AviaSearchResultV4AllDoneWidgetViewHolder$lifecycleObserver$1$onPause$1(baseOnBoardingViewModel));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder = AviaSearchResultV4AllDoneWidgetViewHolder.this;
                aviaSearchResultV4AllDoneWidgetViewHolder.triggerOnboarding(aviaSearchResultV4AllDoneWidgetViewHolder.getViewHolderPositionInfo());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(OnBoardingDTO vo) {
        if (isScreenVisible()) {
            View view = this.itemView;
            Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView");
            ComposerExtKt.withPageTag(this.refs.getContainer(), new AviaSearchResultV4AllDoneWidgetViewHolder$bindOnBoarding$1(this, vo, ((AviaSearchResultV4FlightView) view).getPricePAV()));
        }
    }

    private final void checkOnBoardingNeed(String onboardingKey) {
        if (this.viewModel.getIsOnboardingShown() == null) {
            ComposerExtKt.withPageTag(this.refs.getContainer(), new AviaSearchResultV4AllDoneWidgetViewHolder$checkOnBoardingNeed$1(this, onboardingKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "avia_search_result_v4_onboarding_key";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.refs, this.itemView, onBoarding, this, this.onBoardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new AviaSearchResultV4AllDoneWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    private final boolean isScreenVisible() {
        List<ComponentCallbacksC5392m> r02;
        G d11 = this.refs.getContainer().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = (d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02);
        return (componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerOnboarding(q info) {
        AviaSearchResultV4FlightVO flight;
        AviaSearchResultV4AllDoneVO boundData = getBoundData();
        if (boundData == null || (flight = boundData.getFlight()) == null || flight.getOnboardingApp() == null || info.a().d().isEmpty()) {
            return;
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        float a11 = o.a(itemView, info, false);
        AviaSearchResultV4AllDoneVO boundData2 = getBoundData();
        if (boundData2 != null) {
            this.viewModel.onCardIsOnTheScreen(boundData2, a11);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        U7.d.c(this.refs).a(this.lifecycleObserver);
        this.multiFrameBindDelegate.onAttach();
        final C2404l0 c2404l0 = new C2404l0(C2399j.o(C5427n.a(this.viewModel.getOnboardingSharedFlow(), getLifecycle(), AbstractC5434v.b.STARTED)), N.b(AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding.class));
        C2399j.C(new C2408n0(new InterfaceC2395h<AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$$inlined$filter$1$2", f = "AviaSearchResultV4AllDoneWidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding = (AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding) obj;
                                AviaSearchResultV4AllDoneVO boundData = this.this$0.getBoundData();
                                if (boundData != null && aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding.getRecipientId() == boundData.getId()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        U7.d.c(this.refs).e(this.lifecycleObserver);
        this.multiFrameBindDelegate.onDetach();
        ComposerExtKt.withPageTag(this.refs.getContainer(), new AviaSearchResultV4AllDoneWidgetViewHolder$onDetach$1(this));
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.multiFrameBindDelegate.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.multiFrameBindDelegate.onRecycle();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        triggerOnboarding(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaSearchResultV4AllDoneVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        OnBoardingDTO onboardingApp = item.getFlight().getOnboardingApp();
        checkOnBoardingNeed(onboardingApp != null ? onboardingApp.getOnboardingKey() : null);
        this.multiFrameBindDelegate.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AviaSearchResultV4AllDoneVO item, @NotNull W10.c trackingData, f viewedPond) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AviaSearchResultV4AllDoneWidgetViewHolder) item, trackingData, viewedPond);
        AviaSearchResultV4AllDoneVO boundData = getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            Map<String, TokenizedTrackingInfo> viewTrackingInfo = item.getFlight().getViewTrackingInfo();
            if (viewTrackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(viewTrackingInfo, Long.valueOf(id2), null, 2, null)) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
        }
    }
}
