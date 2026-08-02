package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import WZ.x;
import Wc.a;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import er.RunnableC6383a;
import j.C7232a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.serviceCarousel.core.LMStateSaveUpdate;
import ru.ozon.app.android.common.serviceCarousel.core.PostponedTransitionStarted;
import ru.ozon.app.android.common.serviceCarousel.data.CornersState;
import ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.OnboardingHelperDelegate;
import ru.ozon.app.android.common.ui.serviceCarousel.R$drawable;
import ru.ozon.app.android.common.ui.serviceCarousel.databinding.WidgetServiceCarouselBinding;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001hBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010&J#\u0010+\u001a\u00020\u001a2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J$\u00105\u001a\u00020\u001a*\u0002012\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020-H\u0082@¢\u0006\u0004\b5\u00106J#\u00107\u001a\u00020\u001a*\u0002012\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020-H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001aH\u0002¢\u0006\u0004\b9\u0010&J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001a0>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010bR\u0016\u0010g\u001a\u0004\u0018\u00010d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "sharedViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "", "isPreCreateWidgetsCategoryMainPageFresh", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;LWZ/l;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Z)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onViewOutOfVisibleBounds", "()V", "onViewInVisibleBounds", "", "", "params", "trackClick", "(Ljava/util/Map;)V", "", "onboardingItemIndex", "showCarouselOnboarding", "(Ljava/lang/Integer;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingDTO", "itemIndex", "setupOnBoardingForItem", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;ILkotlin/coroutines/d;)Ljava/lang/Object;", "showOnBoardingForItem", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;I)V", "saveScrollState", "Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "state", "setBackgroundDrawable", "(Lru/ozon/app/android/common/serviceCarousel/data/CornersState;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "LWZ/t;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)LWZ/t;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "widgetInfo", "Ll20/d;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lru/ozon/app/android/common/ui/serviceCarousel/databinding/WidgetServiceCarouselBinding;", "binding", "Lru/ozon/app/android/common/ui/serviceCarousel/databinding/WidgetServiceCarouselBinding;", "Lxe/M;", "showOnboardingScope", "Lxe/M;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselAdapter;", "carouselAdapter$delegate", "LSc/j;", "getCarouselAdapter", "()Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselAdapter;", "carouselAdapter", "Lru/ozon/app/android/common/serviceCarousel/presentation/onboarding/OnboardingHelperDelegate;", "onboardingHelper$delegate", "getOnboardingHelper", "()Lru/ozon/app/android/common/serviceCarousel/presentation/onboarding/OnboardingHelperDelegate;", "onboardingHelper", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewModel;", "widgetViewModel", "Companion", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServiceCarouselViewHolder extends k<ServiceCarouselVO> {

    @NotNull
    private final WidgetServiceCarouselBinding binding;

    /* renamed from: carouselAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j carouselAdapter;

    @NotNull
    private final View containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;

    /* renamed from: onboardingHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onboardingHelper;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final SharedCarouselViewModel sharedViewModel;

    @NotNull
    private final M showOnboardingScope;

    @NotNull
    private final l tokenizedAnalytics;
    private l20.d widgetInfo;
    private static final int smallPadding = ResourceExtKt.toPx(6);
    private static final int bigPadding = ResourceExtKt.toPx(12);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornersState.values().length];
            try {
                iArr[CornersState.WITHOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CornersState.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CornersState.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CornersState.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCarouselViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull SharedCarouselViewModel sharedViewModel, @NotNull l tokenizedAnalytics, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull CoroutineDispatcherProvider dispatchersProvider, boolean z11) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(sharedViewModel, "sharedViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.containerView = containerView;
        this.references = references;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.sharedViewModel = sharedViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onBoardingViewModel = onBoardingViewModel;
        this.dispatchersProvider = dispatchersProvider;
        WidgetServiceCarouselBinding bind = WidgetServiceCarouselBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.showOnboardingScope = N.a(dispatchersProvider.getMainImmediate());
        this.carouselAdapter = UtilsKt.unsafeLazy(new ServiceCarouselViewHolder$carouselAdapter$2(this, z11));
        this.onboardingHelper = Sc.k.b(new ServiceCarouselViewHolder$onboardingHelper$2(this));
        bind.rvItems.setItemAnimator(null);
        bind.rvItems.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    ServiceCarouselViewHolder.this.saveScrollState();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ServiceCarouselVO serviceCarouselVO, ServiceCarouselViewHolder serviceCarouselViewHolder) {
        RecyclerView.o layoutManager;
        if (serviceCarouselVO.getLayoutManagerState() != null || (layoutManager = serviceCarouselViewHolder.binding.rvItems.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        ServiceCarouselVO boundedData = getBoundedData();
        return (boundedData == null || !boundedData.getIsKeepPermanentPageViewId()) ? new ActionHandler.Builder(this.references, this).customActionHandlers(new ServiceCarouselViewHolder$getActionHandler$3(this)).buildHandler() : new ActionHandler.Builder(this.references, this).customAnalyticHandler(new ServiceCarouselViewHolder$getActionHandler$1(this)).customActionHandlers(new ServiceCarouselViewHolder$getActionHandler$2(this)).buildHandler();
    }

    private final ServiceCarouselAdapter getCarouselAdapter() {
        return (ServiceCarouselAdapter) this.carouselAdapter.getValue();
    }

    private final OnboardingHelperDelegate getOnboardingHelper() {
        return (OnboardingHelperDelegate) this.onboardingHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getTokenizedEvent(AtomAction.SendAnalytics action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        ServiceCarouselVO boundedData = getBoundedData();
        if (boundedData == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return null;
        }
        Long valueOf = Long.valueOf(boundedData.getId());
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        return x.b(trackingInfo, valueOf, null);
    }

    private final ServiceCarouselViewModel getWidgetViewModel() {
        return (ServiceCarouselViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        InterfaceC7851b controller = this.references.getController();
        ServiceCarouselVO boundedData = getBoundedData();
        Long valueOf = boundedData != null ? Long.valueOf(boundedData.getId()) : null;
        RecyclerView.o layoutManager = this.binding.rvItems.getLayoutManager();
        controller.d(new LMStateSaveUpdate(valueOf, layoutManager != null ? layoutManager.onSaveInstanceState() : null));
    }

    private final void setBackgroundDrawable(CornersState state) {
        Drawable drawable;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            RecyclerView rvItems = this.binding.rvItems;
            Intrinsics.checkNotNullExpressionValue(rvItems, "rvItems");
            int i12 = smallPadding;
            ViewExtKt.updatePadding$default(rvItems, 0, i12, 0, i12, 5, null);
            drawable = null;
        } else if (i11 == 2) {
            drawable = C7232a.a(getContext(), R$drawable.bg_rounded_top_24);
            RecyclerView rvItems2 = this.binding.rvItems;
            Intrinsics.checkNotNullExpressionValue(rvItems2, "rvItems");
            ViewExtKt.updatePadding$default(rvItems2, 0, bigPadding, 0, smallPadding, 5, null);
        } else if (i11 == 3) {
            drawable = C7232a.a(getContext(), R$drawable.bg_rounded_bottom_24);
            RecyclerView rvItems3 = this.binding.rvItems;
            Intrinsics.checkNotNullExpressionValue(rvItems3, "rvItems");
            ViewExtKt.updatePadding$default(rvItems3, 0, smallPadding, 0, bigPadding, 5, null);
        } else {
            if (i11 != 4) {
                throw new o();
            }
            drawable = C7232a.a(getContext(), R$drawable.bg_rounded_both_24);
            RecyclerView rvItems4 = this.binding.rvItems;
            Intrinsics.checkNotNullExpressionValue(rvItems4, "rvItems");
            int i13 = bigPadding;
            ViewExtKt.updatePadding$default(rvItems4, 0, i13, 0, i13, 5, null);
        }
        if (drawable != null) {
            this.binding.rootCard.setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setupOnBoardingForItem(RecyclerView recyclerView, OnBoardingDTO onBoardingDTO, int i11, kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.dispatchersProvider.getMainImmediate(), new ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1(this, null, recyclerView, i11, this, onBoardingDTO), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCarouselOnboarding(Integer onboardingItemIndex) {
        ComposerExtKt.withPageTag(this.references.getContainer(), new ServiceCarouselViewHolder$showCarouselOnboarding$$inlined$showOnboardingIfNeed$1(this, onboardingItemIndex, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnBoardingForItem(final RecyclerView recyclerView, final OnBoardingDTO onBoardingDTO, final int i11) {
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showOnBoardingForItem$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    C10727i.c(ServiceCarouselViewHolder.this.showOnboardingScope, null, null, new ServiceCarouselViewHolder$showOnBoardingForItem$1$1(recyclerView, i11, onBoardingDTO, null), 3);
                }
            });
        } else {
            C10727i.c(this.showOnboardingScope, null, null, new ServiceCarouselViewHolder$showOnBoardingForItem$1$1(recyclerView, i11, onBoardingDTO, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackClick(Map<String, String> params) {
        ServiceCarouselViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.trackFreshNewLabelClick(params);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        ServiceCarouselVO boundedData = getBoundedData();
        if (boundedData != null) {
            getOnboardingHelper().show(boundedData);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        Window window;
        super.onViewOutOfVisibleBounds();
        N.c(this.showOnboardingScope, null);
        r a11 = this.references.getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        window.clearFlags(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ServiceCarouselVO item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (!(this.binding.rvItems.getAdapter() instanceof ServiceCarouselAdapter)) {
            this.binding.rvItems.setAdapter(getCarouselAdapter());
        }
        this.widgetInfo = info;
        getCarouselAdapter().setKeepPermanentPageViewId(item.getIsKeepPermanentPageViewId());
        this.binding.rvItems.setRecycledViewPool(this.references.getComposerViewPoolProvider().getViewPool());
        getCarouselAdapter().submitList(item.getItems(), new RunnableC6383a(0, item, this));
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = this.binding.rvItems.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        setBackgroundDrawable(item.getCornersState());
        if (item.getShouldStartPostponedTransition()) {
            r a11 = this.references.getContainer().a();
            if (a11 != null) {
                a11.startPostponedEnterTransition();
            }
            this.references.getController().d(PostponedTransitionStarted.INSTANCE);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ServiceCarouselVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (!item.getIsKeepPermanentPageViewId()) {
            t tokenizedEvent2 = item.getTokenizedEvent();
            if (tokenizedEvent2 != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent2, null, 2, null);
                return;
            }
            return;
        }
        ServiceCarouselVO boundedData = getBoundedData();
        if (boundedData == null || (tokenizedEvent = boundedData.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent, new ServiceCarouselViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(this.sharedViewModel.pageIdModifier()));
    }
}
