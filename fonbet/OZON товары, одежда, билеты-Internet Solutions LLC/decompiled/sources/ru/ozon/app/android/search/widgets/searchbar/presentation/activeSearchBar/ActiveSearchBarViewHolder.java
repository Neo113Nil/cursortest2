package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Ae.C2399j;
import Ae.C2408n0;
import B90.V;
import D90.c;
import QI.a;
import QI.b;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.network.cache.ForceNetworkRefreshParameters;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.ActiveSearchbarBinding;
import ru.ozon.app.android.search.widgets.commonTapTags.SearchBarValueFormatter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.RefreshDataWrapper;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import ru.ozon.app.android.search.widgets.utils.LiveDataDebounceExtKt;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import xe.B0;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002PS\b\u0001\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001YBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010\u001dJ\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010\u001dJ\u001f\u0010/\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010+2\u0006\u00102\u001a\u00020-H\u0002¢\u0006\u0004\b3\u00100J\u0013\u00104\u001a\u00020\u0019*\u00020\u0003H\u0003¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u0019*\u00020\u0003H\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u0010\u001dJ\u0013\u00109\u001a\u00020\u0019*\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u0019*\u0002082\b\u00101\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010AR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "Lru/ozon/app/android/search/databinding/ActiveSearchbarBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "sharedCarouselViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "tapTagsV2ViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "tapTagsV3ViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/common/SearchUrlPrefetchService;Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "()V", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;Ll20/d;)V", "observeViewModelActions", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;", "data", "handleTapTagsV3Refresh", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;)V", "observeLifecycleContainer", "", "suggestedTapTag", "", "shouldOverrideExistingText", "onSuggestedTapTagClicked", "(Ljava/lang/String;Z)V", "newText", "fromBind", "onTextChanged", "setupSearch", "(Lru/ozon/app/android/search/databinding/ActiveSearchbarBinding;)V", "setupClickListeners", "observeBusEvents", "Landroid/widget/EditText;", "toggleKeyboard", "(Landroid/widget/EditText;)V", "setTextWithSelection", "(Landroid/widget/EditText;Ljava/lang/String;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lxe/B0;", "searchBarActionJob", "Lxe/B0;", "", "maxQueryLength", "Ljava/lang/Integer;", "shouldHandleTapTagQueryChange", "Z", "Ll20/d;", "ru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewHolder$editTextTextWatcher$1", "editTextTextWatcher", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewHolder$editTextTextWatcher$1;", "ru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewHolder$scrollListener$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActiveSearchBarViewHolder extends BindingViewHolder<ActiveSearchBarVO, ActiveSearchbarBinding> {

    @NotNull
    private final ActiveSearchBarViewModel activeSearchBarViewModel;

    @NotNull
    private final ActiveSearchBarViewHolder$editTextTextWatcher$1 editTextTextWatcher;

    @NotNull
    private final Handler handler;
    private d info;
    private Integer maxQueryLength;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ActiveSearchBarViewHolder$scrollListener$1 scrollListener;
    private B0 searchBarActionJob;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final SharedCarouselViewModel sharedCarouselViewModel;
    private boolean shouldHandleTapTagQueryChange;

    @NotNull
    private final TapTagsV2ViewModel tapTagsV2ViewModel;

    @NotNull
    private final TapTagsV3ViewModel tapTagsV3ViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, ActiveSearchbarBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, ActiveSearchbarBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/ActiveSearchbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ActiveSearchbarBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ActiveSearchbarBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewHolder$Companion;", "", "<init>", "()V", "MIN_SEARCH_QUERY_LENGTH", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder$editTextTextWatcher$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder$scrollListener$1] */
    public ActiveSearchBarViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull SharedCarouselViewModel sharedCarouselViewModel, @NotNull ActiveSearchBarViewModel activeSearchBarViewModel, @NotNull TapTagsV2ViewModel tapTagsV2ViewModel, @NotNull TapTagsV3ViewModel tapTagsV3ViewModel) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(sharedCarouselViewModel, "sharedCarouselViewModel");
        Intrinsics.checkNotNullParameter(activeSearchBarViewModel, "activeSearchBarViewModel");
        Intrinsics.checkNotNullParameter(tapTagsV2ViewModel, "tapTagsV2ViewModel");
        Intrinsics.checkNotNullParameter(tapTagsV3ViewModel, "tapTagsV3ViewModel");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.sharedCarouselViewModel = sharedCarouselViewModel;
        this.activeSearchBarViewModel = activeSearchBarViewModel;
        this.tapTagsV2ViewModel = tapTagsV2ViewModel;
        this.tapTagsV3ViewModel = tapTagsV3ViewModel;
        this.handler = new Handler(Looper.getMainLooper());
        this.editTextTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder$editTextTextWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                super.afterTextChanged(s11);
                ActiveSearchBarViewHolder.this.onTextChanged(s11.toString(), false);
            }
        };
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                ActiveSearchbarBinding binding;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (1 == newState) {
                    ActiveSearchBarViewHolder activeSearchBarViewHolder = ActiveSearchBarViewHolder.this;
                    binding = activeSearchBarViewHolder.getBinding();
                    AppCompatEditText etSearch = binding.etSearch;
                    Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
                    activeSearchBarViewHolder.toggleKeyboard(etSearch);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                ActiveSearchbarBinding binding;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                if (dy != 0) {
                    ActiveSearchBarViewHolder activeSearchBarViewHolder = ActiveSearchBarViewHolder.this;
                    binding = activeSearchBarViewHolder.getBinding();
                    AppCompatEditText etSearch = binding.etSearch;
                    Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
                    activeSearchBarViewHolder.toggleKeyboard(etSearch);
                }
            }
        };
        this.touchListener = new a(this, 0);
        observeBusEvents();
        observeLifecycleContainer();
        ActiveSearchbarBinding binding = getBinding();
        setupSearch(binding);
        setupClickListeners(binding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTapTagsV3Refresh(RefreshDataWrapper data) {
        View view;
        RecyclerView composerRecyclerView;
        T00.a b11;
        d dVar = this.info;
        if (SearchBarUtilsKt.searchParamsHasChanged(data.getSuggestedPage().getRefreshLink(), (dVar == null || (b11 = dVar.b()) == null) ? null : b11.c()) || h.K(String.valueOf(getBinding().etSearch.getText()))) {
            t tokenizedEvent = data.getSuggestedPage().getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
            InterfaceC7851b.a.e(this.references.getController(), data.getSuggestedPage().getRefreshLink(), null, ForceNetworkRefreshParameters.INSTANCE, 2);
            ComponentCallbacksC5392m c11 = this.references.getContainer().c();
            if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
                return;
            }
            composerRecyclerView.post(new V(composerRecyclerView, 2));
        }
    }

    private final void observeBusEvents() {
        this.references.getController().getEvents().observe(this, new ActiveSearchBarViewHolder$sam$androidx_lifecycle_Observer$0(new ActiveSearchBarViewHolder$observeBusEvents$1(this)));
    }

    private final void observeLifecycleContainer() {
        U7.d.c(this.references).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder$observeLifecycleContainer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                ActiveSearchbarBinding binding;
                ActiveSearchBarViewHolder$editTextTextWatcher$1 activeSearchBarViewHolder$editTextTextWatcher$1;
                Handler handler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                binding = ActiveSearchBarViewHolder.this.getBinding();
                AppCompatEditText appCompatEditText = binding.etSearch;
                activeSearchBarViewHolder$editTextTextWatcher$1 = ActiveSearchBarViewHolder.this.editTextTextWatcher;
                appCompatEditText.removeTextChangedListener(activeSearchBarViewHolder$editTextTextWatcher$1);
                handler = ActiveSearchBarViewHolder.this.handler;
                handler.removeCallbacksAndMessages(null);
            }
        });
    }

    private final void observeViewModelActions() {
        B0 b02 = this.searchBarActionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.searchBarActionJob = C2399j.C(new C2408n0(C5427n.a(this.activeSearchBarViewModel.getActionFlow(), U7.d.c(this.references), AbstractC5434v.b.STARTED), new ActiveSearchBarViewHolder$observeViewModelActions$1(this, null)), K.a(this.references.getContainer().g()));
        LiveDataDebounceExtKt.debounce(this.tapTagsV3ViewModel.getActionLiveData(), this.activeSearchBarViewModel.getSearchDebounce(String.valueOf(getBinding().etSearch.getText())), x0.a(this.activeSearchBarViewModel)).observe(this.references.getContainer().g(), new ActiveSearchBarViewHolder$sam$androidx_lifecycle_Observer$0(new ActiveSearchBarViewHolder$observeViewModelActions$2(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuggestedTapTagClicked(String suggestedTapTag, boolean shouldOverrideExistingText) {
        String formatSearchValueWithTapTags = SearchBarValueFormatter.INSTANCE.formatSearchValueWithTapTags(String.valueOf(getBinding().etSearch.getText()), suggestedTapTag, shouldOverrideExistingText);
        this.shouldHandleTapTagQueryChange = true;
        AppCompatEditText etSearch = getBinding().etSearch;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        setTextWithSelection(etSearch, formatSearchValueWithTapTags);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onTextChanged(String newText, boolean fromBind) {
        ActiveSearchBarVO activeSearchBarVO = (ActiveSearchBarVO) getBoundedData();
        if (activeSearchBarVO != null ? Intrinsics.d(activeSearchBarVO.getIsDynamicUpdateDisabled(), Boolean.TRUE) : false) {
            return;
        }
        ActiveSearchbarBinding binding = getBinding();
        AppCompatImageView ivClearSearch = binding.ivClearSearch;
        Intrinsics.checkNotNullExpressionValue(ivClearSearch, "ivClearSearch");
        ivClearSearch.setVisibility(!(newText == null || newText.length() == 0) ? 0 : 8);
        if (newText == null) {
            return;
        }
        if (!fromBind) {
            this.activeSearchBarViewModel.configureTapTagsRequestBody(newText, fromBind, new ActiveSearchBarViewHolder$onTextChanged$1$1(this));
        }
        if (binding.etSearch.hasFocus() || this.shouldHandleTapTagQueryChange) {
            this.activeSearchBarViewModel.onQueryChanged(newText);
            this.shouldHandleTapTagQueryChange = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextWithSelection(EditText editText, String str) {
        String cut;
        if (str == null || (cut = SearchBarUtilsKt.cut(str, this.maxQueryLength)) == null) {
            return;
        }
        editText.setText(cut);
        editText.setSelection(cut.length());
    }

    private final void setupClickListeners(ActiveSearchbarBinding activeSearchbarBinding) {
        activeSearchbarBinding.ivBack.setOnClickListener(new c(this, 4));
        activeSearchbarBinding.ivClearSearch.setOnClickListener(new HY.c(activeSearchbarBinding, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$17(ActiveSearchBarViewHolder activeSearchBarViewHolder, View view) {
        activeSearchBarViewHolder.references.getNavigator().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$18(ActiveSearchbarBinding activeSearchbarBinding, View view) {
        activeSearchbarBinding.etSearch.setText("");
        activeSearchbarBinding.etSearch.requestFocus();
        AppCompatEditText etSearch = activeSearchbarBinding.etSearch;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        KeyboardUtilsKt.showKeyboard(etSearch);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setupSearch(final ActiveSearchbarBinding activeSearchbarBinding) {
        activeSearchbarBinding.etSearch.setOnFocusChangeListener(new Dk0.a(activeSearchbarBinding, 2));
        this.handler.post(new b(activeSearchbarBinding, 0));
        activeSearchbarBinding.etSearch.setOnKeyListener(new View.OnKeyListener() { // from class: QI.c
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean z11;
                z11 = ActiveSearchBarViewHolder.setupSearch$lambda$16(ActiveSearchBarViewHolder.this, activeSearchbarBinding, view, i11, keyEvent);
                return z11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearch$lambda$10(ActiveSearchbarBinding activeSearchbarBinding, View view, boolean z11) {
        if (z11) {
            AppCompatEditText etSearch = activeSearchbarBinding.etSearch;
            Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
            KeyboardUtilsKt.showKeyboard(etSearch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearch$lambda$11(ActiveSearchbarBinding activeSearchbarBinding) {
        activeSearchbarBinding.etSearch.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean setupSearch$lambda$16(ActiveSearchBarViewHolder activeSearchBarViewHolder, ActiveSearchbarBinding activeSearchbarBinding, View view, int i11, KeyEvent keyEvent) {
        t keyboardSearchTrackingInfo;
        if (i11 != 66) {
            return false;
        }
        ActiveSearchBarVO activeSearchBarVO = (ActiveSearchBarVO) activeSearchBarViewHolder.getBoundedData();
        if (activeSearchBarVO != null && (keyboardSearchTrackingInfo = activeSearchBarVO.getKeyboardSearchTrackingInfo()) != null) {
            TokenizedAnalyticsExtensionsKt.processAnyEvents(activeSearchBarViewHolder.references.getTokenizedAnalytics(), keyboardSearchTrackingInfo, new ActiveSearchBarViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(activeSearchBarViewHolder.activeSearchBarViewModel.m981pageIdModifierUsgXMg(SearchAnalyticsCustomizedParams.m982boximpl(SearchAnalyticsCustomizedParams.m983constructorimpl(String.valueOf(activeSearchbarBinding.etSearch.getText()))))));
        }
        ActiveSearchBarVO activeSearchBarVO2 = (ActiveSearchBarVO) activeSearchBarViewHolder.getBoundedData();
        if ((activeSearchBarVO2 != null ? activeSearchBarVO2.getReturnKeyType() : null) == SearchBarVO.ReturnKeyType.DONE) {
            AppCompatEditText etSearch = activeSearchbarBinding.etSearch;
            Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
            activeSearchBarViewHolder.toggleKeyboard(etSearch);
            return true;
        }
        if (keyEvent.getAction() == 1) {
            String valueOf = String.valueOf(activeSearchbarBinding.etSearch.getText());
            String str = valueOf.length() >= 2 ? valueOf : null;
            if (str != null) {
                SearchUrlPrefetchService.DefaultImpls.navigateWhenRequestPrefetched$default(activeSearchBarViewHolder.searchUrlPrefetchService, activeSearchBarViewHolder.activeSearchBarViewModel.getSearchResultDeeplink(str), activeSearchBarViewHolder.references.getContainer().g(), new ActiveSearchBarViewHolder$setupSearch$3$3$1$1(activeSearchBarViewHolder), null, 8, null);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleKeyboard(EditText editText) {
        editText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(ActiveSearchBarViewHolder activeSearchBarViewHolder, View view, MotionEvent motionEvent) {
        AppCompatEditText etSearch = activeSearchBarViewHolder.getBinding().etSearch;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        KeyboardUtilsKt.hideKeyboard(etSearch);
        return false;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        View view;
        RecyclerView composerRecyclerView;
        super.onAttach();
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.addOnScrollListener(this.scrollListener);
        composerRecyclerView.setOnTouchListener(this.touchListener);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.activeSearchBarViewModel.subscribeForSearchValue();
        observeViewModelActions();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        View view;
        RecyclerView composerRecyclerView;
        super.onDetach();
        B0 b02 = this.searchBarActionJob;
        if (b02 != null) {
            b02.j(null);
        }
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.removeOnScrollListener(this.scrollListener);
        composerRecyclerView.setOnTouchListener(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActiveSearchBarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        this.maxQueryLength = item.getMaxSearchQueryTextLength();
        AppCompatEditText appCompatEditText = getBinding().etSearch;
        appCompatEditText.setHint(item.getHint());
        Integer maxSearchQueryTextLength = item.getMaxSearchQueryTextLength();
        if (maxSearchQueryTextLength != null) {
            appCompatEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxSearchQueryTextLength.intValue())});
        }
        this.activeSearchBarViewModel.updateSearchModel(item);
        this.sharedCarouselViewModel.setPageViewId(this.activeSearchBarViewModel.getPageViewId());
        this.activeSearchBarViewModel.setSearchDelay(item.getSearchDelay());
        this.activeSearchBarViewModel.setSearchQuery(item.getSearchText(), new ActiveSearchBarViewHolder$bind$2(this));
    }
}
