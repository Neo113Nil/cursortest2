package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import A00.a;
import GZ.j;
import L3.D;
import Vg.d;
import WZ.x;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.taglist.common.TagListDecorator;
import ru.ozon.app.android.common.taglist.taglistv3.TagListUtilsKt;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3VO;
import ru.ozon.app.android.common.ui.taglist.databinding.WidgetScrollingTagListBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 k2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001kB[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010\u001dJ\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J/\u00100\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001bH\u0002¢\u0006\u0004\b4\u0010\u001dJ\u001b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u001b2\u0006\u00108\u001a\u00020*2\u0006\u0010/\u001a\u00020.2\u0006\u00109\u001a\u00020(H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020\u001b*\u00020*2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b<\u0010=J#\u0010@\u001a\u00020\u001b2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001b0>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010B\u001a\u00020(H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001bH\u0002¢\u0006\u0004\bJ\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010PR\u0018\u0010\u0016\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010X\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u001b0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020F0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/rv/ScrollingTagListV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "nullifier", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "LHZ/a;", "deeplinkHandlersCache", "LGZ/k;", "routeFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Landroid/view/View;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LHZ/a;LGZ/k;LVg/d;Lru/ozon/app/android/utils/AppType;)V", "", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3VO;Ll20/d;)V", "onRecycle", "onDetach", "showOnBoarding", "(Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3VO;)V", "", "pageTag", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "onboardingIndex", "", "widgetId", "showOnBoardingForTag", "(Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;IJ)V", "showOldOnboardingForWidget", "(Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;J)V", "enableComposerRvScroll", "onBoardingIndex", "getOnboardingItemView", "(Ljava/lang/Integer;)Landroid/view/View;", "onBoarding", "widgetKey", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;JLjava/lang/String;)V", "trackOnboardingView", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;J)V", "Lkotlin/Function1;", "block", "withPageTag", "(Lkotlin/jvm/functions/Function1;)V", "deeplink", "LpZ/f;", "getFullWindowFiltersDestination", "(Ljava/lang/String;)LpZ/f;", "LA00/a;", "event", "busEventHandler", "(LA00/a;)V", "saveScrollState", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LHZ/a;", "LGZ/k;", "LVg/d;", "Landroid/os/Handler;", "onboardingHandler", "Landroid/os/Handler;", "Lru/ozon/app/android/common/ui/taglist/databinding/WidgetScrollingTagListBinding;", "binding", "Lru/ozon/app/android/common/ui/taglist/databinding/WidgetScrollingTagListBinding;", "widgetInfo", "Ll20/d;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/rv/TagListV3RvAdapter;", "tagListAdapter", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/rv/TagListV3RvAdapter;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Landroidx/lifecycle/W;", "eventHandlerObserver", "Landroidx/lifecycle/W;", "defaultBgColor", "I", "Lru/ozon/app/android/common/taglist/common/TagListDecorator;", "tagListDecorator", "Lru/ozon/app/android/common/taglist/common/TagListDecorator;", "Companion", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollingTagListV3ViewHolder extends k<ScrollingTagListV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetScrollingTagListBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final HZ.a deeplinkHandlersCache;
    private final int defaultBgColor;

    @NotNull
    private final W<A00.a> eventHandlerObserver;

    @NotNull
    private final RecycledViewPoolViewNullifier nullifier;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final Handler onboardingHandler;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;

    @NotNull
    private final GZ.k routeFactory;

    @NotNull
    private final TagListV3RvAdapter tagListAdapter;

    @NotNull
    private final TagListDecorator tagListDecorator;
    private l20.d widgetInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int ONBOARDING_HORIZONTAL_MARGIN = ResourceExtKt.toPx(6);
    private static final float ONBOARDING_CORNER_RADIUS = UiExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/rv/ScrollingTagListV3ViewHolder$Companion;", "", "<init>", "()V", "ONBOARDING_HORIZONTAL_MARGIN", "", "getONBOARDING_HORIZONTAL_MARGIN", "()I", "ONBOARDING_CORNER_RADIUS", "", "getONBOARDING_CORNER_RADIUS", "()F", "ONBOARDING_TIME_TO_ENABLE_SCROLL", "", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getONBOARDING_CORNER_RADIUS() {
            return ScrollingTagListV3ViewHolder.ONBOARDING_CORNER_RADIUS;
        }

        public final int getONBOARDING_HORIZONTAL_MARGIN() {
            return ScrollingTagListV3ViewHolder.ONBOARDING_HORIZONTAL_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingTagListV3ViewHolder(@NotNull View containerView, @NotNull FeatureChecker featureChecker, @NotNull ComposerReferences composerReferences, @NotNull RecycledViewPoolViewNullifier nullifier, @NotNull CommonOnboardingRepository onboardingRepository, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull HZ.a deeplinkHandlersCache, @NotNull GZ.k routeFactory, @NotNull d customActionHandlersStoreFactory, @NotNull AppType appType) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(nullifier, "nullifier");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.composerReferences = composerReferences;
        this.nullifier = nullifier;
        this.onboardingRepository = onboardingRepository;
        this.onBoardingViewModel = onBoardingViewModel;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
        this.routeFactory = routeFactory;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.onboardingHandler = new Handler(Looper.getMainLooper());
        WidgetScrollingTagListBinding bind = WidgetScrollingTagListBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new ScrollingTagListV3ViewHolder$actionHandler$1(this)).onPreProcess(new ScrollingTagListV3ViewHolder$actionHandler$2(this, featureChecker)).buildHandler();
        this.actionHandler = buildHandler;
        TagListV3RvAdapter tagListV3RvAdapter = new TagListV3RvAdapter(buildHandler, this);
        this.tagListAdapter = tagListV3RvAdapter;
        this.eventHandlerObserver = new ScrollingTagListV3ViewHolder$eventHandlerObserver$1(this);
        this.defaultBgColor = appType == AppType.SELECT ? UniColorsSelect.LAYER_FLOOR_0_SELECT.getResId() : UniColors.LAYER_FLOOR_1.getResId();
        int i11 = 0;
        TagListDecorator tagListDecorator = new TagListDecorator(i11, i11, 3, null);
        this.tagListDecorator = tagListDecorator;
        RecyclerView recyclerView = bind.tagListRv;
        recyclerView.setAdapter(tagListV3RvAdapter);
        recyclerView.addItemDecoration(tagListDecorator);
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    ScrollingTagListV3ViewHolder.this.saveScrollState();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(ScrollingTagListV3VO scrollingTagListV3VO, RecyclerView recyclerView) {
        RecyclerView.o layoutManager;
        if (scrollingTagListV3VO.getLayoutManagerState() == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(scrollingTagListV3VO.getLayoutManagerState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void busEventHandler(A00.a event) {
        if (event instanceof a.C2370k) {
            saveScrollState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableComposerRvScroll() {
        this.onboardingHandler.postDelayed(new Runnable() { // from class: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder$enableComposerRvScroll$$inlined$postDelayed$default$1
            @Override // java.lang.Runnable
            public final void run() {
                ComposerReferences composerReferences;
                RecyclerView composerRecyclerView;
                composerReferences = ScrollingTagListV3ViewHolder.this.composerReferences;
                ViewGroup rootView = ContextExtKt.getRootView(composerReferences.getContainer().a());
                if (rootView == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(rootView)) == null) {
                    return;
                }
                ScrollExtKt.scrollEnable(composerRecyclerView, true);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f getFullWindowFiltersDestination(String deeplink) {
        IZ.a b11;
        j b12 = GZ.k.b(this.routeFactory, deeplink, null, 6);
        if (b12 != null && (b11 = this.deeplinkHandlersCache.b(b12)) != null) {
            Object destination = b11.getDestination(getContext(), b12);
            ComposerScreenContainer composerScreenContainer = destination instanceof ComposerScreenContainer ? (ComposerScreenContainer) destination : null;
            if (composerScreenContainer != null) {
                return new ComposerFragmentDestination(ComposerScreenConfig.copy$default(composerScreenContainer.getScreenConfig(), null, null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777151, null), "filters", null, false, false, null, false, false, null, 508, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getOnboardingItemView(Integer onBoardingIndex) {
        RecyclerView.o layoutManager;
        if (onBoardingIndex == null || (layoutManager = this.binding.tagListRv.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.findViewByPosition(onBoardingIndex.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding, long widgetId, String widgetKey) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(widgetKey, this.composerReferences, this.binding.getConstraintLayout(), onBoarding, this, this.onBoardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new ScrollingTagListV3ViewHolder$initDelegate$1$1(this, onBoarding, widgetId));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        ScrollingTagListV3VO boundData = getBoundData();
        if (boundData != null) {
            RecyclerView.o layoutManager = this.binding.tagListRv.getLayoutManager();
            boundData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOldOnboardingForWidget(String pageTag, OnBoardingDTO onboarding, long widgetId) {
        String onboardingKey = onboarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "tag_list_onboarding_is_shown";
        }
        String str = onboardingKey;
        this.onBoardingViewModel.showIfNeed(pageTag, str, new ScrollingTagListV3ViewHolder$showOldOnboardingForWidget$1(this, onboarding, widgetId, str));
    }

    private final void showOnBoarding(ScrollingTagListV3VO item) {
        OnBoardingDTO onboarding = item.getOnboarding();
        if (onboarding == null) {
            return;
        }
        withPageTag(new ScrollingTagListV3ViewHolder$showOnBoarding$1(item, this, onboarding, item.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnBoardingForTag(String pageTag, OnBoardingDTO onboarding, int onboardingIndex, long widgetId) {
        String onboardingKey = onboarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "TagItemOnboardingKey";
        }
        String str = onboardingKey;
        this.onBoardingViewModel.showIfNeed(pageTag, str, new ScrollingTagListV3ViewHolder$showOnBoardingForTag$1(this, onboarding, widgetId, str, onboardingIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackOnboardingView(OnBoardingDTO onBoardingDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo = onBoardingDTO.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), x.b(trackingInfo, Long.valueOf(j11), null), null, 2, null);
        }
    }

    private final void withPageTag(Function1<? super String, Unit> block) {
        String tag;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 == null || (tag = c11.getTag()) == null) {
            return;
        }
        block.invoke(tag);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.composerReferences.getController().getEvents().observe(this.composerReferences.getContainer().g(), this.eventHandlerObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        withPageTag(new ScrollingTagListV3ViewHolder$onDetach$1(this));
        this.composerReferences.getController().getEvents().removeObserver(this.eventHandlerObserver);
        OnBoardingDelegate onBoardingDelegate = this.onboardingDelegate;
        if (onBoardingDelegate != null) {
            onBoardingDelegate.unbind();
        }
        this.onboardingDelegate = null;
        this.onboardingHandler.removeCallbacksAndMessages(null);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        saveScrollState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ScrollingTagListV3VO item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        RecyclerView recyclerView = this.binding.tagListRv;
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        this.nullifier.switchMaxRecycledViewInPoolToZero(recyclerView, getItemViewType());
        this.tagListAdapter.submitList(item.getTags(), new D(1, item, recyclerView));
        Intrinsics.f(recyclerView);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), (int) recyclerView.getResources().getDimension(item.getTopPadding().getCellLayoutPadding()), recyclerView.getPaddingRight(), (int) recyclerView.getResources().getDimension(item.getBottomPadding().getCellLayoutPadding()));
        this.tagListDecorator.setRightOffset$taglist_prodGoogleAllVendorsRelease((int) recyclerView.getResources().getDimension(item.getRightPadding().getCellLayoutPadding()));
        this.tagListDecorator.setLimitItemOffset$taglist_prodGoogleAllVendorsRelease((int) recyclerView.getResources().getDimension(item.getLeftPadding().getCellLayoutPadding()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, item.getBackgroundColor());
        int intValue = mapColor != null ? mapColor.intValue() : this.defaultBgColor;
        if (item.getIsBottomRounded()) {
            Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            recyclerView.setBackground(TagListUtilsKt.getRoundedBackground(context2, intValue));
            recyclerView.setClipToOutline(true);
        } else {
            Context context3 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            recyclerView.setBackgroundColor(ResourceExtKt.color(context3, intValue));
        }
        showOnBoarding(item);
    }
}
