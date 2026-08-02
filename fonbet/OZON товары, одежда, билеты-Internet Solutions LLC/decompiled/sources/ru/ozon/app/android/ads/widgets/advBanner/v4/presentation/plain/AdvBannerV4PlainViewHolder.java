package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import U7.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.x;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4VO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewHolder;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemAdapter;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001C\b\u0000\u0018\u0000 \\2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\\B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J3\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0010J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010\u0010J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010\u0010J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020/2\u0006\u00105\u001a\u00020/H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR2\u0010N\u001a \u0012\b\u0012\u00060Jj\u0002`K\u0012\f\u0012\n\u0018\u00010Lj\u0004\u0018\u0001`M\u0012\u0004\u0012\u00020\u000e0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainView;", "bannerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;", "viewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4VO;Ll20/d;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRecycle", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lxe/B0;", "observeRotationFlow", "()Lxe/B0;", "observeSwipeRefresh", "initRecyclerView", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "advBannerItemVO", "trackItemClick", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;)V", "trackViewAfterLoadImage", "", "position", "trackViewAndImpression", "(I)V", "getActualCurrentPosition", "()I", "actualPosition", "getCurrentPositionByActual", "(I)I", "fixItemsSnapPositionIfNeeded", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemAdapter;", "adapter", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemAdapter;", "ru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder$smoothScroller$1", "smoothScroller", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder$smoothScroller$1;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lkotlin/reflect/KFunction2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "eventProcessing", "Lkotlin/reflect/h;", "lastBannerPosition", "I", "", "isViewHolderVisible", "Z", "isMostViewHolderVisible", "Landroidx/recyclerview/widget/x;", "snapHelper$delegate", "LSc/j;", "getSnapHelper", "()Landroidx/recyclerview/widget/x;", "snapHelper", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainViewHolder extends k<AdvBannerV4VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdvBannerV4PlainItemAdapter adapter;

    @NotNull
    private final AdvBannerV4PlainView bannerView;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final h<Unit> eventProcessing;

    @NotNull
    private final Handler handler;
    private boolean isMostViewHolderVisible;
    private boolean isViewHolderVisible;
    private int lastBannerPosition;

    @NotNull
    private final AdvBannerV4PlainViewHolder$smoothScroller$1 smoothScroller;

    /* renamed from: snapHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j snapHelper;

    @NotNull
    private final AdvBannerV4PlainViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder$Companion;", "", "<init>", "()V", "HALF_BANNER_PERCENTAGE_VISIBILITY", "", "AUTOSCROLL_SPEED_MS", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v1, types: [ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewHolder$smoothScroller$1] */
    public AdvBannerV4PlainViewHolder(@NotNull AdvBannerV4PlainView bannerView, @NotNull ComposerReferences composerReferences, @NotNull AdvBannerV4PlainViewModel viewModel, @NotNull FeatureChecker featureChecker) {
        super(bannerView);
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.bannerView = bannerView;
        this.composerReferences = composerReferences;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        this.adapter = new AdvBannerV4PlainItemAdapter(this, new AdvBannerV4PlainViewHolder$adapter$1(this), new AdvBannerV4PlainViewHolder$adapter$2(this), buildHandler, K.a(composerReferences.getContainer().g()), featureChecker);
        final Context context = getContext();
        this.smoothScroller = new r(context) { // from class: ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewHolder$smoothScroller$1
            @Override // androidx.recyclerview.widget.r
            protected int calculateTimeForDeceleration(int dx) {
                return 600;
            }
        };
        this.handler = new Handler(Looper.getMainLooper());
        this.eventProcessing = new AdvBannerV4PlainViewHolder$eventProcessing$1(composerReferences.getTokenizedAnalytics());
        this.lastBannerPosition = -1;
        this.isMostViewHolderVisible = true;
        this.snapHelper = LazyUtilsKt.unsafeLazy(AdvBannerV4PlainViewHolder$snapHelper$2.INSTANCE);
        initRecyclerView();
        observeRotationFlow();
    }

    private final void fixItemsSnapPositionIfNeeded() {
        View findSnapView;
        int[] calculateDistanceToFinalSnap;
        RecyclerView.o layoutManager = this.bannerView.getItemsRv().getLayoutManager();
        if (layoutManager == null || (findSnapView = getSnapHelper().findSnapView(layoutManager)) == null || (calculateDistanceToFinalSnap = getSnapHelper().calculateDistanceToFinalSnap(layoutManager, findSnapView)) == null) {
            return;
        }
        if ((calculateDistanceToFinalSnap.length == 0) || calculateDistanceToFinalSnap[0] == 0) {
            return;
        }
        this.bannerView.getItemsRv().scrollBy(calculateDistanceToFinalSnap[0], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getActualCurrentPosition() {
        RecyclerView.o layoutManager = this.bannerView.getItemsRv().getLayoutManager();
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

    private final void initRecyclerView() {
        AdvBannerV4PlainView advBannerV4PlainView = this.bannerView;
        advBannerV4PlainView.getItemsRv().setAdapter(this.adapter);
        advBannerV4PlainView.getItemsRv().setItemAnimator(null);
        advBannerV4PlainView.getItemsRv().setHasFixedSize(true);
        getSnapHelper().attachToRecyclerView(advBannerV4PlainView.getItemsRv());
        this.lastBannerPosition = -1;
        advBannerV4PlainView.getItemsRv().initListeners();
        advBannerV4PlainView.getItemsRv().addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewHolder$initRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                boolean z11;
                int actualCurrentPosition;
                int currentPositionByActual;
                int i11;
                AdvBannerV4PlainViewModel advBannerV4PlainViewModel;
                AdvBannerV4PlainViewModel advBannerV4PlainViewModel2;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState != 0) {
                    if (newState != 1) {
                        return;
                    }
                    advBannerV4PlainViewModel2 = AdvBannerV4PlainViewHolder.this.viewModel;
                    advBannerV4PlainViewModel2.stopAutoRotation();
                    return;
                }
                AdvBannerV4VO boundData = AdvBannerV4PlainViewHolder.this.getBoundData();
                if (boundData != null) {
                    advBannerV4PlainViewModel = AdvBannerV4PlainViewHolder.this.viewModel;
                    advBannerV4PlainViewModel.startAutoRotationByDelay(boundData);
                }
                z11 = AdvBannerV4PlainViewHolder.this.isViewHolderVisible;
                if (z11) {
                    actualCurrentPosition = AdvBannerV4PlainViewHolder.this.getActualCurrentPosition();
                    currentPositionByActual = AdvBannerV4PlainViewHolder.this.getCurrentPositionByActual(actualCurrentPosition);
                    if (actualCurrentPosition != -1) {
                        i11 = AdvBannerV4PlainViewHolder.this.lastBannerPosition;
                        if (actualCurrentPosition != i11) {
                            AdvBannerV4PlainViewHolder.this.trackViewAndImpression(currentPositionByActual);
                        }
                    }
                    AdvBannerV4PlainViewHolder.this.lastBannerPosition = actualCurrentPosition;
                }
            }
        });
    }

    private final B0 observeRotationFlow() {
        return C2399j.C(new C2408n0(C5427n.a(this.viewModel.observeRotationEventsFlow(), d.c(this.composerReferences), AbstractC5434v.b.STARTED), new AdvBannerV4PlainViewHolder$observeRotationFlow$1(this, null)), K.a(this.composerReferences.getContainer().g()));
    }

    private final void observeSwipeRefresh() {
        this.composerReferences.getController().getEvents().observe(this.composerReferences.getContainer().g(), new AdvBannerV4PlainViewHolder$sam$androidx_lifecycle_Observer$0(new AdvBannerV4PlainViewHolder$observeSwipeRefresh$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewInVisibleBounds$lambda$3(AdvBannerV4PlainViewHolder advBannerV4PlainViewHolder) {
        AdvBannerV4VO boundData = advBannerV4PlainViewHolder.getBoundData();
        if (boundData != null) {
            advBannerV4PlainViewHolder.viewModel.startAutoRotationByDelay(boundData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackItemClick(AdvBannerV4ItemVO advBannerItemVO) {
        String link = advBannerItemVO.getAction().getLink();
        if (link != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.composerReferences.getNavigator(), link, null, 2, null);
            if (advBannerItemVO.getCanTrack()) {
                t tokenizedEvent = advBannerItemVO.getTokenizedEvent();
                if (tokenizedEvent != null) {
                    TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                }
                this.viewModel.trackClick(advBannerItemVO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewAfterLoadImage() {
        trackViewAndImpression(getCurrentPositionByActual(getActualCurrentPosition()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewAndImpression(int position) {
        List<AdvBannerV4ItemVO> items;
        AdvBannerV4ItemVO advBannerV4ItemVO;
        AdvBannerV4VO boundData = getBoundData();
        if (boundData == null || (items = boundData.getItems()) == null || (advBannerV4ItemVO = (AdvBannerV4ItemVO) C7714v.Q(position, items)) == null || !advBannerV4ItemVO.getCanTrack()) {
            return;
        }
        this.viewModel.trackViewV4(advBannerV4ItemVO, (Function2) this.eventProcessing);
        this.viewModel.trackImpressionV4(advBannerV4ItemVO, (Function2) this.eventProcessing);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeSwipeRefresh();
    }

    @Override // jk0.j
    public void onRecycle() {
        AdvBannerV4VO boundData = getBoundData();
        if (boundData != null) {
            RecyclerView.o layoutManager = this.bannerView.getItemsRv().getLayoutManager();
            boundData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        super.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        this.isViewHolderVisible = true;
        fixItemsSnapPositionIfNeeded();
        this.handler.post(new Runnable() { // from class: yl.a
            @Override // java.lang.Runnable
            public final void run() {
                AdvBannerV4PlainViewHolder.onViewInVisibleBounds$lambda$3(AdvBannerV4PlainViewHolder.this);
            }
        });
        super.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.isViewHolderVisible = false;
        super.onViewOutOfVisibleBounds();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        double a11 = o.a(itemView, info, false);
        this.isMostViewHolderVisible = a11 >= 0.5d;
        this.viewModel.setCanTrackPixels(a11 >= 0.5d);
        if (this.isMostViewHolderVisible) {
            trackViewAndImpression(getCurrentPositionByActual(getActualCurrentPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdvBannerV4VO item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.layer_floor_1);
        AdvBannerV4PlainItemAdapter advBannerV4PlainItemAdapter = this.adapter;
        advBannerV4PlainItemAdapter.setBgColor(parseColor);
        advBannerV4PlainItemAdapter.setItems(item.getItems());
        this.bannerView.setBackgroundColor(parseColor);
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState == null || (layoutManager = this.bannerView.getItemsRv().getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(layoutManagerState);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AdvBannerV4VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.lastBannerPosition = getActualCurrentPosition();
    }
}
