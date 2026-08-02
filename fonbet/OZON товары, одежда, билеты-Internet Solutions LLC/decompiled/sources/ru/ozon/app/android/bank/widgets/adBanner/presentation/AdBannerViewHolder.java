package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.w0;
import B90.g0;
import Sc.InterfaceC4008j;
import U7.d;
import Ve.C4598rp;
import WZ.l;
import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001=\b\u0000\u0018\u0000 U2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0002UVB#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010-\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010\u000fJ\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010\u000fJ\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u000fJ\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\r068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R2\u0010E\u001a \u0012\b\u0012\u00060Aj\u0002`B\u0012\f\u0012\n\u0018\u00010Cj\u0004\u0018\u0001`D\u0012\u0004\u0012\u00020\r0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerView;", "bannerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "onAttach", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerVO;Ll20/d;)V", "onRecycle", "initRecyclerView", "", "getActualCurrentPosition", "()I", "position", "trackViewEvent", "(I)V", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "adBannerItemVO", "Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;", "analyticEventType", "trackAnalyticEvent", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;)V", "closeBanner", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;)V", "fixItemsSnapPositionIfNeeded", "actualPosition", "getCurrentPositionByActual", "(I)I", "observeSwipeRefresh", "observeLifecycle", "pauseAutoScroll", "resumeAutoScrollWithDelay", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemAdapter;", "adapter", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemAdapter;", "ru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder$smoothScroller$1", "smoothScroller", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder$smoothScroller$1;", "Lkotlin/reflect/KFunction2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "viewEventProcessing", "Lkotlin/reflect/h;", "", "isViewHolderVisible", "Z", "isMostViewHolderVisible", "Landroidx/recyclerview/widget/x;", "snapHelper$delegate", "LSc/j;", "getSnapHelper", "()Landroidx/recyclerview/widget/x;", "snapHelper", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewModel;", "getViewModel", "()Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewModel;", "viewModel", "Companion", "AdBannerLifecycleObserver", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerViewHolder extends k<AdBannerVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdBannerItemAdapter adapter;

    @NotNull
    private final AdBannerView bannerView;

    @NotNull
    private final ComposerReferences composerReferences;
    private boolean isMostViewHolderVisible;
    private boolean isViewHolderVisible;

    @NotNull
    private final AdBannerViewHolder$smoothScroller$1 smoothScroller;

    /* renamed from: snapHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j snapHelper;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final h<Unit> viewEventProcessing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder$AdBannerLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/v;", "lifecycle", "Lkotlin/Function0;", "", "onResumeAction", "onPauseAction", "<init>", "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "onPause", "onDestroy", "Landroidx/lifecycle/v;", "Lkotlin/jvm/functions/Function0;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AdBannerLifecycleObserver implements DefaultLifecycleObserver {

        @NotNull
        private final AbstractC5434v lifecycle;

        @NotNull
        private final Function0<Unit> onPauseAction;

        @NotNull
        private final Function0<Unit> onResumeAction;

        public AdBannerLifecycleObserver(@NotNull AbstractC5434v lifecycle, @NotNull Function0<Unit> onResumeAction, @NotNull Function0<Unit> onPauseAction) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onResumeAction, "onResumeAction");
            Intrinsics.checkNotNullParameter(onPauseAction, "onPauseAction");
            this.lifecycle = lifecycle;
            this.onResumeAction = onResumeAction;
            this.onPauseAction = onPauseAction;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.lifecycle.e(this);
            super.onDestroy(owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.onPauseAction.invoke();
            super.onPause(owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.onResumeAction.invoke();
            super.onResume(owner);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewHolder$Companion;", "", "<init>", "()V", "AUTOSCROLL_SPEED_MS", "", "FIRST_BANNER_POSITION", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewHolder$smoothScroller$1] */
    public AdBannerViewHolder(@NotNull AdBannerView bannerView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(bannerView);
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.bannerView = bannerView;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        this.adapter = new AdBannerItemAdapter(this, new AdBannerViewHolder$adapter$1(this), buildHandler);
        final Context context = getContext();
        this.smoothScroller = new r(context) { // from class: ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewHolder$smoothScroller$1
            @Override // androidx.recyclerview.widget.r
            protected int calculateTimeForDeceleration(int dx) {
                return 600;
            }
        };
        this.viewEventProcessing = new AdBannerViewHolder$viewEventProcessing$1(tokenizedAnalytics);
        this.isMostViewHolderVisible = true;
        this.snapHelper = LazyUtilsKt.unsafeLazy(AdBannerViewHolder$snapHelper$2.INSTANCE);
        initRecyclerView();
        observeLifecycle();
    }

    private final void closeBanner(AdBannerItemVO adBannerItemVO) {
        AdBannerViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.removeBannerFromSnapshot(adBannerItemVO);
        }
        resumeAutoScrollWithDelay();
        this.bannerView.getAdBannerRv().post(new g0(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeBanner$lambda$5(AdBannerViewHolder adBannerViewHolder) {
        List<AdBannerItemVO> list;
        AdBannerItemAdapter adBannerItemAdapter = adBannerViewHolder.adapter;
        AdBannerViewModel viewModel = adBannerViewHolder.getViewModel();
        if (viewModel == null || (list = viewModel.getBannersSnapshot()) == null) {
            list = K.f71697a;
        }
        adBannerItemAdapter.setItems(list);
    }

    private final void fixItemsSnapPositionIfNeeded() {
        View findSnapView;
        int[] calculateDistanceToFinalSnap;
        RecyclerView.o layoutManager = this.bannerView.getAdBannerRv().getLayoutManager();
        if (layoutManager == null || (findSnapView = getSnapHelper().findSnapView(layoutManager)) == null || (calculateDistanceToFinalSnap = getSnapHelper().calculateDistanceToFinalSnap(layoutManager, findSnapView)) == null) {
            return;
        }
        if ((calculateDistanceToFinalSnap.length == 0) || calculateDistanceToFinalSnap[0] == 0) {
            return;
        }
        this.bannerView.getAdBannerRv().scrollBy(calculateDistanceToFinalSnap[0], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getActualCurrentPosition() {
        RecyclerView.o layoutManager = this.bannerView.getAdBannerRv().getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentPositionByActual(int actualPosition) {
        return this.adapter.getFixedPosition(actualPosition);
    }

    private final x getSnapHelper() {
        return (x) this.snapHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdBannerViewModel getViewModel() {
        return (AdBannerViewModel) getWidgetViewModel();
    }

    private final void initRecyclerView() {
        AdBannerView adBannerView = this.bannerView;
        adBannerView.getAdBannerRv().setAdapter(this.adapter);
        adBannerView.getAdBannerRv().setItemAnimator(null);
        adBannerView.getAdBannerRv().setHasFixedSize(true);
        getSnapHelper().attachToRecyclerView(adBannerView.getAdBannerRv());
        adBannerView.getAdBannerRv().initListeners();
        adBannerView.getAdBannerRv().addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewHolder$initRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                boolean z11;
                int actualCurrentPosition;
                int currentPositionByActual;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState != 0) {
                    if (newState == 1 || newState == 2) {
                        AdBannerViewHolder.this.pauseAutoScroll();
                        return;
                    }
                    return;
                }
                AdBannerViewHolder.this.resumeAutoScrollWithDelay();
                z11 = AdBannerViewHolder.this.isViewHolderVisible;
                if (z11) {
                    actualCurrentPosition = AdBannerViewHolder.this.getActualCurrentPosition();
                    currentPositionByActual = AdBannerViewHolder.this.getCurrentPositionByActual(actualCurrentPosition);
                    AdBannerViewHolder.this.trackViewEvent(currentPositionByActual);
                }
            }
        });
        adBannerView.getAdBannerRv().addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewHolder$initRecyclerView$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                if (e11.getActionMasked() != 0) {
                    return false;
                }
                AdBannerViewHolder.this.pauseAutoScroll();
                return false;
            }
        });
    }

    private final void observeLifecycle() {
        AbstractC5434v c11 = d.c(this.composerReferences);
        c11.a(new AdBannerLifecycleObserver(c11, new AdBannerViewHolder$observeLifecycle$1(this), new AdBannerViewHolder$observeLifecycle$2(this)));
    }

    private final void observeSwipeRefresh() {
        C4598rp.f(this.composerReferences, new C2408n0(this.composerReferences.getController().getEventsFlow(), new AdBannerViewHolder$observeSwipeRefresh$1(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseAutoScroll() {
        AdBannerViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.stopAutoScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeAutoScrollWithDelay() {
        AdBannerVO boundData = getBoundData();
        if (boundData != null) {
            int autoScrollDelay = boundData.getAutoScrollDelay();
            AdBannerViewModel viewModel = getViewModel();
            if (viewModel != null) {
                viewModel.startAutoScrollByDelay(autoScrollDelay);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAnalyticEvent(AdBannerItemVO adBannerItemVO, AnalyticEventType analyticEventType) {
        if (analyticEventType == AnalyticEventType.CLOSE) {
            closeBanner(adBannerItemVO);
        }
        AdBannerViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.trackAnalyticEvent(adBannerItemVO, analyticEventType, (Function2) this.viewEventProcessing);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewEvent(int position) {
        List<AdBannerItemVO> banners;
        AdBannerItemVO adBannerItemVO;
        AdBannerVO boundData = getBoundData();
        if (boundData == null || (banners = boundData.getBanners()) == null || (adBannerItemVO = (AdBannerItemVO) C7714v.Q(position, banners)) == null) {
            return;
        }
        trackAnalyticEvent(adBannerItemVO, AnalyticEventType.VIEW);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeSwipeRefresh();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        w0<Unit> autoScrollEventsFlow;
        AdBannerViewModel viewModel;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AdBannerVO boundData = getBoundData();
        if (boundData != null && (viewModel = getViewModel()) != null) {
            viewModel.startAutoScrollByDelay(boundData.getAutoScrollDelay());
        }
        AdBannerViewModel viewModel2 = getViewModel();
        if (viewModel2 == null || (autoScrollEventsFlow = viewModel2.getAutoScrollEventsFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(C5427n.a(autoScrollEventsFlow, lifecycle.getLifecycle(), AbstractC5434v.b.STARTED), new AdBannerViewHolder$onAttachViewModel$2(this, null)), androidx.lifecycle.K.a(lifecycle));
    }

    @Override // jk0.j
    public void onRecycle() {
        AdBannerVO boundData = getBoundData();
        if (boundData != null) {
            RecyclerView.o layoutManager = this.bannerView.getAdBannerRv().getLayoutManager();
            boundData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        super.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        this.isViewHolderVisible = true;
        fixItemsSnapPositionIfNeeded();
        super.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.isViewHolderVisible = false;
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdBannerVO item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AdBannerViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.setBannersSnapshot(item.getBanners());
        }
        this.adapter.setItems(item.getBanners());
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor());
        if (parseColor != null) {
            ViewExtKt.setBackgroundTint(this.bannerView, parseColor.intValue());
        }
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = this.bannerView.getAdBannerRv().getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        if (this.adapter.getItems().isEmpty()) {
            return;
        }
        trackViewEvent(0);
    }
}
