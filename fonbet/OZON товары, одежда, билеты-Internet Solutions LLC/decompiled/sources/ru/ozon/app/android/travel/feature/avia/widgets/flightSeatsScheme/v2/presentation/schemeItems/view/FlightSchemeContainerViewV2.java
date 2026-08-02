package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$anim;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2SmoothScroller;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSchemeV2Payload$HighlightV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSeatsSchemeV2Adapter;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSeatsSchemeV2ItemDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.shimmer.FlightSchemeShimmerViewV2;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2VO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2View;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jc\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00112\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bJ\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020.¢\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00109R$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010B¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContainerViewV2;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addChildren", "()V", "setUpContentView", "setUpShimmerView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "isScrollDown", "observeLastItemThresholdVisibility", "(Landroidx/recyclerview/widget/RecyclerView;Z)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "emergencySeatsActionHandler", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "onSeatClickListener", "literalsVisibilityListener", "setUp", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lxe/M;", "scope", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "scheme", "showContent", "(Lxe/M;Ljava/util/List;)V", "showShimmer", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "state", "showEmptyState", "(Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;)V", "registerContentScrollListener", "unregisterContentScrollListener", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SeatSelection;", "item", "selectSeat", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SeatSelection;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$ScrollToSeat;", "scrollToSchemeRow", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$ScrollToSeat;)V", "contentView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerViewV2;", "shimmerView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerViewV2;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2View;", "emptyStateView", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContainerViewV2$ContentScrollListener;", "contentScrollListener", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContainerViewV2$ContentScrollListener;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/adapter/FlightSeatsSchemeV2Adapter;", "contentAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/adapter/FlightSeatsSchemeV2Adapter;", "shouldShowSchemeAnimation", "Z", "literalsPosition", "I", "isLiteralsViewFullyVisible", "ContentScrollListener", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeContainerViewV2 extends FrameLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final FlightSeatsSchemeV2Adapter contentAdapter;

    @NotNull
    private final ContentScrollListener contentScrollListener;

    @NotNull
    private final RecyclerView contentView;
    private Function1<? super AtomAction, Unit> emergencySeatsActionHandler;

    @NotNull
    private final EmptyStateV2View emptyStateView;
    private boolean isLiteralsViewFullyVisible;
    private int literalsPosition;
    private Function1<? super Boolean, Unit> literalsVisibilityListener;
    private Function2<? super Integer, ? super AirplaneSeatTypeV2VI, Unit> onSeatClickListener;

    @NotNull
    private final FlightSchemeShimmerViewV2 shimmerView;
    private boolean shouldShowSchemeAnimation;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContainerViewV2$ContentScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "action", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "recyclerView", "", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lkotlin/jvm/functions/Function2;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ContentScrollListener extends RecyclerView.t {

        @NotNull
        private final Function2<RecyclerView, Boolean, Unit> action;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentScrollListener(@NotNull Function2<? super RecyclerView, ? super Boolean, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
            boolean z11;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (dy > 0) {
                z11 = false;
            } else if (dy >= 0) {
                return;
            } else {
                z11 = true;
            }
            this.action.invoke(recyclerView, Boolean.valueOf(z11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeContainerViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setNestedScrollingEnabled(false);
        this.contentView = recyclerView;
        FlightSchemeShimmerViewV2 flightSchemeShimmerViewV2 = new FlightSchemeShimmerViewV2(context);
        flightSchemeShimmerViewV2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        flightSchemeShimmerViewV2.setVisibility(8);
        flightSchemeShimmerViewV2.setNestedScrollingEnabled(false);
        this.shimmerView = flightSchemeShimmerViewV2;
        EmptyStateV2View emptyStateV2View = new EmptyStateV2View(context);
        int px = UiExtKt.toPx(4, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = px;
        layoutParams.bottomMargin = px;
        emptyStateV2View.setLayoutParams(layoutParams);
        emptyStateV2View.setGravity(16);
        int px2 = UiExtKt.toPx(16, context);
        emptyStateV2View.setPadding(px2, 0, px2, UiExtKt.toPx(24, context));
        emptyStateV2View.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), ResourceExtKt.toPxF(20, context)));
        emptyStateV2View.setVisibility(8);
        this.emptyStateView = emptyStateV2View;
        this.contentScrollListener = new ContentScrollListener(new FlightSchemeContainerViewV2$contentScrollListener$1(this));
        this.contentAdapter = new FlightSeatsSchemeV2Adapter(new FlightSchemeContainerViewV2$contentAdapter$1(this), new FlightSchemeContainerViewV2$contentAdapter$2(this), new FlightSchemeContainerViewV2$contentAdapter$3(this));
        this.shouldShowSchemeAnimation = true;
        this.literalsPosition = 2;
        this.isLiteralsViewFullyVisible = true;
        addChildren();
        setUpContentView();
        setUpShimmerView();
    }

    private final void addChildren() {
        addView(this.contentView);
        addView(this.shimmerView);
        addView(this.emptyStateView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r8 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void observeLastItemThresholdVisibility(RecyclerView recyclerView, boolean isScrollDown) {
        if (this.literalsPosition == -1) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(this.literalsPosition);
        boolean z11 = this.isLiteralsViewFullyVisible;
        boolean z12 = false;
        if (findViewByPosition != null) {
            int height = recyclerView.getHeight();
            boolean z13 = findViewByPosition.getTop() > 0;
            boolean z14 = findViewByPosition.getTop() >= 0 && findViewByPosition.getBottom() <= height;
            if (z11) {
                if (!z13) {
                }
                z12 = z11;
            } else {
                if (z14 && isScrollDown) {
                    z12 = true;
                }
                z12 = z11;
            }
        }
        if (z12 != z11) {
            this.isLiteralsViewFullyVisible = z12;
            Function1<? super Boolean, Unit> function1 = this.literalsVisibilityListener;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z12));
            }
        }
    }

    private final void setUpContentView() {
        RecyclerView recyclerView = this.contentView;
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.contentAdapter);
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), R$anim.fall_down_layout_animation));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new FlightSeatsSchemeV2ItemDecoration(context));
    }

    private final void setUpShimmerView() {
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(this.shimmerView, true);
    }

    public final void registerContentScrollListener() {
        RecyclerView recyclerView = this.contentView;
        recyclerView.removeOnScrollListener(this.contentScrollListener);
        recyclerView.addOnScrollListener(this.contentScrollListener);
    }

    public final void scrollToSchemeRow(@NotNull final FlightSeatsSchemeV2ViewModel.ScrollToSeat item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RecyclerView.o layoutManager = this.contentView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        View findViewByPosition = layoutManager.findViewByPosition(item.getPosition());
        Integer valueOf = findViewByPosition != null ? Integer.valueOf(findViewByPosition.getTop()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (item.getSeatNumber() != null) {
                this.contentAdapter.notifyItemChanged(item.getPosition(), new FlightSchemeV2Payload$HighlightV2(item.getSeatNumber(), false, 2, null));
                return;
            }
            return;
        }
        final String seatNumber = item.getSeatNumber();
        RecyclerView.t tVar = seatNumber != null ? new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeContainerViewV2$scrollToSchemeRow$scrollListener$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                FlightSeatsSchemeV2Adapter flightSeatsSchemeV2Adapter;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerView.removeOnScrollListener(this);
                    flightSeatsSchemeV2Adapter = FlightSchemeContainerViewV2.this.contentAdapter;
                    flightSeatsSchemeV2Adapter.notifyItemChanged(item.getPosition(), new FlightSchemeV2Payload$HighlightV2(seatNumber, true));
                }
            }
        } : null;
        if (tVar != null) {
            this.contentView.addOnScrollListener(tVar);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightSeatsSchemeV2SmoothScroller flightSeatsSchemeV2SmoothScroller = new FlightSeatsSchemeV2SmoothScroller(context);
        flightSeatsSchemeV2SmoothScroller.setTargetPosition(item.getPosition());
        layoutManager.startSmoothScroll(flightSeatsSchemeV2SmoothScroller);
    }

    public final void selectSeat(@NotNull FlightSeatsSchemeV2ViewModel.SeatSelection item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.contentAdapter.updateItem(item.getPosition(), new FlightSchemeContainerViewV2$selectSeat$1(item), "FlightSchemePayloadSeatSelection");
    }

    public final void setUp(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> emergencySeatsActionHandler, @NotNull Function2<? super Integer, ? super AirplaneSeatTypeV2VI, Unit> onSeatClickListener, @NotNull Function1<? super Boolean, Unit> literalsVisibilityListener) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(emergencySeatsActionHandler, "emergencySeatsActionHandler");
        Intrinsics.checkNotNullParameter(onSeatClickListener, "onSeatClickListener");
        Intrinsics.checkNotNullParameter(literalsVisibilityListener, "literalsVisibilityListener");
        this.actionHandler = actionHandler;
        this.emergencySeatsActionHandler = emergencySeatsActionHandler;
        this.onSeatClickListener = onSeatClickListener;
        this.literalsVisibilityListener = literalsVisibilityListener;
    }

    public final void showContent(@NotNull M scope, @NotNull List<? extends FlightSeatsSchemeV2Item> scheme) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.shimmerView.setVisibility(8);
        this.emptyStateView.setVisibility(8);
        int i11 = 0;
        this.contentView.setVisibility(0);
        this.contentAdapter.submitList(scope, scheme, new FlightSchemeContainerViewV2$showContent$1(this));
        Iterator<? extends FlightSeatsSchemeV2Item> it = scheme.iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            FlightSeatsSchemeV2Item next = it.next();
            if ((next instanceof FlightSchemeContentRowV2) && ((FlightSchemeContentRowV2) next).getIsSticky()) {
                break;
            } else {
                i11++;
            }
        }
        this.literalsPosition = i11;
    }

    public final void showEmptyState(@NotNull EmptyStateV2VO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.contentView.setVisibility(8);
        this.shimmerView.setVisibility(8);
        this.emptyStateView.setVisibility(0);
        this.emptyStateView.bind(state, this.actionHandler);
    }

    public final void showShimmer() {
        this.shimmerView.setVisibility(0);
        this.emptyStateView.setVisibility(8);
        this.contentView.setVisibility(8);
    }

    public final void unregisterContentScrollListener() {
        this.contentView.removeOnScrollListener(this.contentScrollListener);
    }
}
