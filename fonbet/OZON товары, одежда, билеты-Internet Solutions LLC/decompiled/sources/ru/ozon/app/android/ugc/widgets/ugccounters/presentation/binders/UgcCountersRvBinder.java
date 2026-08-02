package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders;

import B.d;
import B90.f0;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersRvBinder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersRvBinder$ugcScrollListener$2;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersItemDecoration;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersLayoutManager;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersRecyclerAdapter;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001G\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J;\u0010.\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00172\u0006\u0010)\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00170@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersRvBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "imagesPreCreationConfig", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "rv", "", "setupUi", "(Landroidx/recyclerview/widget/RecyclerView;)V", "LWZ/t;", "tokenizedEvent", "onBlockInVisibleBounds", "(LWZ/t;)V", "itemVO", "setupOnboarding", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "initOnboardingDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "showOnboarding", "()V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "onFinish", "bind", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "", "isImagesUploaded", "Z", "onImageLoadSuccessful", "Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersRecyclerAdapter;", "ugcRecyclerAdapter", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersRecyclerAdapter;", "ru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersRvBinder$ugcScrollListener$2$1", "ugcScrollListener$delegate", "LSc/j;", "getUgcScrollListener", "()Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersRvBinder$ugcScrollListener$2$1;", "ugcScrollListener", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "", "onboardingBlockIndex", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersRvBinder extends BaseWidgetPlaceholderBinder<UgcCountersVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerView containerView;
    private boolean isImagesUploaded;
    private Function0<Unit> onImageLoadSuccessful;
    private int onboardingBlockIndex;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final UgcCountersOnboardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final UgcCountersRecyclerAdapter ugcRecyclerAdapter;

    /* renamed from: ugcScrollListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ugcScrollListener;

    @NotNull
    private final k<UgcCountersVO> viewHolderOwner;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public UgcCountersRvBinder(@NotNull RecyclerView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull UgcCountersOnboardingViewModel onboardingViewModel, @NotNull PlayerPreloader playerPreloader, UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig, @NotNull k<UgcCountersVO> viewHolderOwner, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onboardingViewModel = onboardingViewModel;
        this.viewHolderOwner = viewHolderOwner;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        this.actionHandler = buildHandler;
        this.ugcRecyclerAdapter = new UgcCountersRecyclerAdapter(getViewHolderOwner(), buildHandler, new UgcCountersRvBinder$ugcRecyclerAdapter$1(playerPreloader, this), new UgcCountersRvBinder$ugcRecyclerAdapter$2(this), ugcCountersImagesPreCreationConfig, new UgcCountersRvBinder$ugcRecyclerAdapter$3(this));
        this.ugcScrollListener = LazyUtilsKt.unsafeLazy(new UgcCountersRvBinder$ugcScrollListener$2(this));
        this.onboardingBlockIndex = -1;
        setupUi(containerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(UgcCountersRvBinder ugcCountersRvBinder, Function0 function0, RecyclerView recyclerView) {
        if (!ugcCountersRvBinder.isImagesUploaded) {
            ugcCountersRvBinder.onImageLoadSuccessful = function0;
        } else if (function0 != null) {
            function0.invoke();
        }
        recyclerView.post(new f0(recyclerView, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UgcCountersRvBinder$ugcScrollListener$2.AnonymousClass1 getUgcScrollListener() {
        return (UgcCountersRvBinder$ugcScrollListener$2.AnonymousClass1) this.ugcScrollListener.getValue();
    }

    private final void initOnboardingDelegate(OnBoardingDTO onboarding) {
        String onboardingKey = onboarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "rpProduct.ugcCounters_onboarding";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.refs, getViewHolderOwner().itemView, onboarding, getViewHolderOwner(), this.onboardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new UgcCountersRvBinder$initOnboardingDelegate$1$1(this));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBlockInVisibleBounds(t tokenizedEvent) {
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
        }
    }

    private final void setupOnboarding(UgcCountersVO itemVO) {
        String tag;
        Pair<OnBoardingDTO, Integer> firstNonShownOnboarding;
        UgcCountersOnboardingViewModel ugcCountersOnboardingViewModel = this.onboardingViewModel;
        List<UgcCountersVO.Item> items = itemVO.getItems();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            OnBoardingDTO onboarding = ((UgcCountersVO.Item) obj).getBlock().getOnboarding();
            Pair<OnBoardingDTO, Integer> pair = onboarding != null ? new Pair<>(onboarding, Integer.valueOf(i11)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
            i11 = i12;
        }
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (tag = c11.getTag()) == null || (firstNonShownOnboarding = ugcCountersOnboardingViewModel.getFirstNonShownOnboarding(arrayList, tag, "rpProduct.ugcCounters_onboarding")) == null) {
            return;
        }
        OnBoardingDTO a11 = firstNonShownOnboarding.a();
        this.onboardingBlockIndex = firstNonShownOnboarding.b().intValue();
        if (this.onboardingDelegate == null) {
            initOnboardingDelegate(a11);
        }
        RecyclerView recyclerView = this.containerView;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersRvBinder$setupOnboarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    UgcCountersRvBinder.this.showOnboarding();
                }
            });
        } else {
            showOnboarding();
        }
    }

    private final void setupUi(RecyclerView rv) {
        rv.setAdapter(this.ugcRecyclerAdapter);
        Context context = rv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rv.setLayoutManager(new UgcCountersLayoutManager(context));
        rv.setItemAnimator(null);
        rv.addItemDecoration(new UgcCountersItemDecoration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding() {
        View view;
        List<UgcCountersVO.Item> items;
        UgcCountersVO.Item item;
        RecyclerView recyclerView = this.containerView;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        UgcCountersVO.Block block = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int i11 = this.onboardingBlockIndex;
        if (findFirstCompletelyVisibleItemPosition > i11 || i11 > findLastCompletelyVisibleItemPosition) {
            recyclerView.addOnScrollListener(getUgcScrollListener());
            recyclerView.post(new d(2, recyclerView, this));
            return;
        }
        recyclerView.removeOnScrollListener(getUgcScrollListener());
        RecyclerView.C findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.onboardingBlockIndex);
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        UgcCountersVO boundData = getViewHolderOwner().getBoundData();
        if (boundData != null && (items = boundData.getItems()) != null && (item = (UgcCountersVO.Item) C7714v.Q(this.onboardingBlockIndex, items)) != null) {
            block = item.getBlock();
        }
        OnBoardingDelegate onBoardingDelegate = this.onboardingDelegate;
        if (onBoardingDelegate != null) {
            onBoardingDelegate.bind(getViewHolderOwner(), new OnBoardingCutConfig(Integer.valueOf(view.getLeft()), null, Integer.valueOf(this.containerView.getWidth() - view.getRight()), null, null, null, null, false, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, null), new UgcCountersRvBinder$showOnboarding$1$2(block, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOnboarding$lambda$9$lambda$8(RecyclerView recyclerView, UgcCountersRvBinder ugcCountersRvBinder) {
        recyclerView.smoothScrollToPosition(ugcCountersRvBinder.onboardingBlockIndex);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(UgcCountersVO ugcCountersVO, l20.d dVar, Object obj, Function0 function0) {
        bind2(ugcCountersVO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<UgcCountersVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        this.widgetImagePlaceholderAdapter.cacheViewIfNeeded(this.containerView, "UgcCountersWidget", (String) pair.b(), info, (String) pair.a(), new UgcCountersRvBinder$onVisibleAreaChanged$1(this));
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull UgcCountersVO item, l20.d info, Object payload, final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        final RecyclerView recyclerView = this.containerView;
        super.bind((UgcCountersRvBinder) item, info, payload, onFinish);
        this.isImagesUploaded = false;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ContextExtKt.parseColor(context, item.getBackgroundColor()));
        this.ugcRecyclerAdapter.submitList(item.getItems(), new Runnable() { // from class: YW.a
            @Override // java.lang.Runnable
            public final void run() {
                UgcCountersRvBinder.bind$lambda$2$lambda$1(UgcCountersRvBinder.this, onFinish, recyclerView);
            }
        });
        setupOnboarding(item);
    }
}
