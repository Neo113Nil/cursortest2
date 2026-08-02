package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import Cm.c;
import Ey.ViewOnClickListenerC2975b;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import Vg.d;
import WZ.l;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.search.R$anim;
import ru.ozon.app.android.search.databinding.SuggestFilterItemsBinding;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.views.searchShimmer.ShimmerConfig;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import xe.B0;
import xe.C10727i;
import xe.Y;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001R\b\u0001\u0018\u0000 U2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001UB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010\u0015J\u0010\u0010-\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0015J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u0010\u0015J\u000f\u00102\u001a\u00020\u0013H\u0002¢\u0006\u0004\b2\u0010\u0015J\u000f\u00103\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\b4\u0010\u0015J\u000f\u00105\u001a\u00020\u0013H\u0002¢\u0006\u0004\b5\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00130>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010B\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00130>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/search/databinding/SuggestFilterItemsBinding;", "binding", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/search/databinding/SuggestFilterItemsBinding;LVg/d;LWZ/l;Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "setBackgroundColor", "saveScrollState", "restoreOrResetScrollPosition", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;)V", "observeComposerEvents", "subscribeToOnboardingEventsIfNeeded", "Lxe/B0;", "subscribeOnOnboardingEvents", "()Lxe/B0;", "cancelOnboarding", "showOnboardingWithDebounce", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "showAndStartOnboarding", "hideAndStopOnboarding", "addShimmerView", "addShimmerToRoot", "removeShimmerView", "setConstraintsToShimmer", "configureShimmer", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/databinding/SuggestFilterItemsBinding;", "LVg/d;", "LWZ/l;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel;", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "suggestHandler", "Lkotlin/jvm/functions/Function1;", "filtersHandler", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionFilterItemsAdapter;", "suggestionFilterItemsAdapter", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionFilterItemsAdapter;", "collectorJob", "Lxe/B0;", "", "isShimmerAnimationCancelled", "Z", "isShimmerAdded", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "shimmerView$delegate", "LSc/j;", "getShimmerView", "()Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "shimmerView", "ru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterViewHolder$animationListener$1", "animationListener", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterViewHolder$animationListener$1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionWithFilterViewHolder extends k<SuggestionWithFilterVO> {

    @NotNull
    private final ActionHandler.Builder actionHandlerBuilder;

    @NotNull
    private final SuggestionWithFilterViewHolder$animationListener$1 animationListener;

    @NotNull
    private final SuggestFilterItemsBinding binding;
    private B0 collectorJob;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Function1<AtomAction, Unit> filtersHandler;
    private boolean isShimmerAdded;
    private boolean isShimmerAnimationCancelled;

    /* renamed from: shimmerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shimmerView;

    @NotNull
    private final Function1<AtomAction, Unit> suggestHandler;

    @NotNull
    private final SuggestionFilterItemsAdapter suggestionFilterItemsAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SuggestionWithFilterSharedViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int ONBOARDING_SHIMMER_WIDTH = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);
    private static final int ONBOARDING_SHIMMER_HEIGHT = ResourceExtKt.toPx(58);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterViewHolder$Companion;", "", "<init>", "()V", "", "ONBOARDING_SHIMMER_HEIGHT", "I", "getONBOARDING_SHIMMER_HEIGHT", "()I", "", "ONBOARDING_DEBOUNCE", "J", "ONBOARDING_SHIMMER_CONSTRAINED_WIDTH", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getONBOARDING_SHIMMER_HEIGHT() {
            return SuggestionWithFilterViewHolder.ONBOARDING_SHIMMER_HEIGHT;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v9, types: [ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$animationListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuggestionWithFilterViewHolder(@NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor inhibitor, @NotNull SuggestFilterItemsBinding binding, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics, @NotNull SuggestionWithFilterSharedViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.composerReferences = composerReferences;
        this.binding = binding;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        ActionHandler.Builder customActionHandlers = new ActionHandler.Builder(composerReferences, this).enableClickThrottling(inhibitor).customActionHandlers(new SuggestionWithFilterViewHolder$actionHandlerBuilder$1(this));
        this.actionHandlerBuilder = customActionHandlers;
        this.suggestHandler = customActionHandlers.buildHandler();
        Function1<AtomAction, Unit> buildHandler = customActionHandlers.onPreProcess(new SuggestionWithFilterViewHolder$filtersHandler$1(this)).buildHandler();
        this.filtersHandler = buildHandler;
        SuggestionFilterItemsAdapter suggestionFilterItemsAdapter = new SuggestionFilterItemsAdapter(buildHandler);
        this.suggestionFilterItemsAdapter = suggestionFilterItemsAdapter;
        this.shimmerView = Sc.k.a(n.NONE, new SuggestionWithFilterViewHolder$shimmerView$2(this));
        this.animationListener = new Animation.AnimationListener() { // from class: ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$animationListener$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                boolean z11;
                SearchShimmer shimmerView;
                SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModel;
                z11 = SuggestionWithFilterViewHolder.this.isShimmerAnimationCancelled;
                if (!z11) {
                    suggestionWithFilterSharedViewModel = SuggestionWithFilterViewHolder.this.viewModel;
                    suggestionWithFilterSharedViewModel.onShownOnboarding();
                }
                SuggestionWithFilterViewHolder.this.cancelOnboarding();
                shimmerView = SuggestionWithFilterViewHolder.this.getShimmerView();
                shimmerView.setVisibility(8);
                SuggestionWithFilterViewHolder.this.removeShimmerView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                SearchShimmer shimmerView;
                shimmerView = SuggestionWithFilterViewHolder.this.getShimmerView();
                shimmerView.setVisibility(0);
            }
        };
        RecyclerView recyclerView = binding.valuesRv;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(suggestionFilterItemsAdapter);
        recyclerView.addItemDecoration(new SuggestionFilterItemDecoration());
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModel;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                SuggestionWithFilterViewHolder.this.cancelOnboarding();
                suggestionWithFilterSharedViewModel = SuggestionWithFilterViewHolder.this.viewModel;
                suggestionWithFilterSharedViewModel.onFiltersInteraction();
                if (newState == 0) {
                    SuggestionWithFilterViewHolder.this.saveScrollState();
                }
            }
        });
        TitleSubtitleCellView titleSubtitleCellView = binding.cellView;
        titleSubtitleCellView.getMainView().setOnClickListener(new ViewOnClickListenerC2975b(titleSubtitleCellView, 5));
    }

    private final void addShimmerToRoot() {
        this.isShimmerAdded = true;
        this.binding.getConstraintLayout().addView(getShimmerView());
    }

    private final void addShimmerView() {
        removeShimmerView();
        addShimmerToRoot();
        setConstraintsToShimmer();
        configureShimmer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(SuggestionWithFilterViewHolder suggestionWithFilterViewHolder, SuggestionWithFilterVO suggestionWithFilterVO) {
        suggestionWithFilterViewHolder.restoreOrResetScrollPosition(suggestionWithFilterVO);
        suggestionWithFilterViewHolder.viewModel.setCurrentItemId(suggestionWithFilterVO.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelOnboarding() {
        if (this.isShimmerAdded) {
            B0 b02 = this.collectorJob;
            if (b02 != null) {
                this.viewModel.detach(b02);
            }
            hideAndStopOnboarding();
        }
    }

    private final void configureShimmer() {
        SearchShimmer shimmerView = getShimmerView();
        int i11 = R$anim.onboarding_shimmer_animation;
        int i12 = ONBOARDING_SHIMMER_WIDTH;
        Float valueOf = Float.valueOf(0.0f);
        shimmerView.configureShimmer(new ShimmerConfig(i11, i12, U.j(new Pair(valueOf, valueOf), new Pair(Float.valueOf(0.13f), Float.valueOf(0.6f)), new Pair(Float.valueOf(0.5f), Float.valueOf(0.8f)), new Pair(Float.valueOf(0.67f), Float.valueOf(0.6f)), new Pair(Float.valueOf(1.0f), valueOf)), this.animationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchShimmer getShimmerView() {
        return (SearchShimmer) this.shimmerView.getValue();
    }

    private final void hideAndStopOnboarding() {
        this.isShimmerAnimationCancelled = true;
        getShimmerView().setVisibility(8);
        getShimmerView().stopAnimation();
        removeShimmerView();
    }

    private final void observeComposerEvents() {
        this.composerReferences.getController().getEvents().observe(this, new SuggestionWithFilterViewHolder$sam$androidx_lifecycle_Observer$0(new SuggestionWithFilterViewHolder$observeComposerEvents$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeShimmerView() {
        this.binding.getConstraintLayout().removeView(getShimmerView());
        this.isShimmerAdded = false;
    }

    private final void restoreOrResetScrollPosition(SuggestionWithFilterVO item) {
        if ((item.getFilterItems().getLayoutManagerState() == null && this.viewModel.getLayoutManagerState() == null) || (this.viewModel.getCurrentItemId() != item.getId() && this.viewModel.getCurrentItemId() != 0)) {
            RecyclerView.o layoutManager = this.binding.valuesRv.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
            this.viewModel.setLayoutManagerState(null);
            return;
        }
        if (item.getFilterItems().getLayoutManagerState() != null) {
            this.viewModel.setLayoutManagerState(item.getFilterItems().getLayoutManagerState());
        }
        RecyclerView.o layoutManager2 = this.binding.valuesRv.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(this.viewModel.getLayoutManagerState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModel = this.viewModel;
        RecyclerView.o layoutManager = this.binding.valuesRv.getLayoutManager();
        suggestionWithFilterSharedViewModel.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        InterfaceC7851b controller = this.composerReferences.getController();
        SuggestionWithFilterVO boundedData = getBoundedData();
        controller.d(new LayoutManagerStateSaveUpdate(boundedData != null ? Long.valueOf(boundedData.getId()) : null, this.viewModel.getLayoutManagerState()));
    }

    private final void setBackgroundColor() {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        SuggestionWithFilterVO boundData = getBoundData();
        Integer parseColor = styleParser.parseColor(context, boundData != null ? boundData.getBackgroundColor() : null);
        if (parseColor != null) {
            this.binding.getConstraintLayout().setBackgroundColor(parseColor.intValue());
        }
    }

    private final void setConstraintsToShimmer() {
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ConstraintLayoutExtKt.updateConstraints(constraintLayout, new SuggestionWithFilterViewHolder$setConstraintsToShimmer$1(this));
    }

    private final void showAndStartOnboarding() {
        getShimmerView().setVisibility(0);
        getShimmerView().startAnimation();
        this.isShimmerAnimationCancelled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showOnboardingWithDebounce(kotlin.coroutines.d<? super Unit> dVar) {
        SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1 suggestionWithFilterViewHolder$showOnboardingWithDebounce$1;
        int i11;
        SuggestionWithFilterViewHolder suggestionWithFilterViewHolder;
        if (dVar instanceof SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1) {
            suggestionWithFilterViewHolder$showOnboardingWithDebounce$1 = (SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1) dVar;
            int i12 = suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.L$0 = this;
                    suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.label = 1;
                    if (Y.b(600L, suggestionWithFilterViewHolder$showOnboardingWithDebounce$1) == aVar) {
                        return aVar;
                    }
                    suggestionWithFilterViewHolder = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    suggestionWithFilterViewHolder = (SuggestionWithFilterViewHolder) suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.L$0;
                    s.b(obj);
                }
                suggestionWithFilterViewHolder.addShimmerView();
                suggestionWithFilterViewHolder.showAndStartOnboarding();
                return Unit.f71690a;
            }
        }
        suggestionWithFilterViewHolder$showOnboardingWithDebounce$1 = new SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1(this, dVar);
        Object obj2 = suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = suggestionWithFilterViewHolder$showOnboardingWithDebounce$1.label;
        if (i11 != 0) {
        }
        suggestionWithFilterViewHolder.addShimmerView();
        suggestionWithFilterViewHolder.showAndStartOnboarding();
        return Unit.f71690a;
    }

    private final B0 subscribeOnOnboardingEvents() {
        return C10727i.c(K.a(this), null, null, new SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeToOnboardingEventsIfNeeded() {
        cancelOnboarding();
        if (!isInVisibleBounds() || this.viewModel.getIsRefreshing()) {
            return;
        }
        B0 subscribeOnOnboardingEvents = subscribeOnOnboardingEvents();
        this.viewModel.attach(subscribeOnOnboardingEvents);
        this.collectorJob = subscribeOnOnboardingEvents;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeComposerEvents();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        subscribeToOnboardingEventsIfNeeded();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        cancelOnboarding();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SuggestionWithFilterVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TitleSubtitleCellView cellView = this.binding.cellView;
        Intrinsics.checkNotNullExpressionValue(cellView, "cellView");
        TitleSubtitleCellHolderKt.bind(cellView, item.getSuggestion(), this.suggestHandler);
        setBackgroundColor();
        this.suggestionFilterItemsAdapter.submitList(C7714v.p0(item.getFilterItems().getValues(), C7714v.c0(item.getFilterItems().getFilterName())), new c(3, this, item));
        RecyclerView recyclerView = this.binding.valuesRv;
        TestInfo testInfo = item.getFilterItems().getTestInfo();
        recyclerView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SuggestionWithFilterVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getFilterItems().getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
