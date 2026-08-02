package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$anim;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeSmoothScroller;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSchemePayload$Highlight;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSeatsSchemeAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSeatsSchemeItemDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeContainerView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.shimmer.FlightSchemeShimmerView;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001DB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\bJ\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bJ\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\bJ\u0017\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010)\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020/¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010=R*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010=R\u0016\u0010B\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addChildren", "()V", "setUpContentView", "setUpShimmerView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "observeLastItemThresholdVisibility", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "onSeatClickListener", "", "lastItemThresholdVisibilityListener", "setUp", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lxe/M;", "scope", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "scheme", "showContent", "(Lxe/M;Ljava/util/List;)V", "showShimmer", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "state", "showEmptyState", "(Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;)V", "registerContentScrollListener", "unregisterContentScrollListener", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "item", "updateOrderDetails", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;", "selectSeat", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$ScrollToSeat;", "scrollToSchemeRow", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$ScrollToSeat;)V", "contentView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerView;", "shimmerView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerView;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "emptyStateView", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContainerView$ContentScrollListener;", "contentScrollListener", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContainerView$ContentScrollListener;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/adapter/FlightSeatsSchemeAdapter;", "contentAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/adapter/FlightSeatsSchemeAdapter;", "shouldShowSchemeAnimation", "Z", "ContentScrollListener", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeContainerView extends FrameLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final FlightSeatsSchemeAdapter contentAdapter;

    @NotNull
    private final ContentScrollListener contentScrollListener;

    @NotNull
    private final RecyclerView contentView;

    @NotNull
    private final EmptyStateView emptyStateView;
    private Function1<? super Boolean, Unit> lastItemThresholdVisibilityListener;
    private Function2<? super Integer, ? super AirplaneSeatVO, Unit> onSeatClickListener;

    @NotNull
    private final FlightSchemeShimmerView shimmerView;
    private boolean shouldShowSchemeAnimation;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContainerView$ContentScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "", "action", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "recyclerView", "", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ContentScrollListener extends RecyclerView.t {

        @NotNull
        private final Function1<RecyclerView, Unit> action;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentScrollListener(@NotNull Function1<? super RecyclerView, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            this.action.invoke(recyclerView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setNestedScrollingEnabled(false);
        this.contentView = recyclerView;
        FlightSchemeShimmerView flightSchemeShimmerView = new FlightSchemeShimmerView(context);
        flightSchemeShimmerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        flightSchemeShimmerView.setVisibility(8);
        flightSchemeShimmerView.setNestedScrollingEnabled(false);
        this.shimmerView = flightSchemeShimmerView;
        EmptyStateView emptyStateView = new EmptyStateView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = UiExtKt.toPx(8, context);
        emptyStateView.setLayoutParams(layoutParams);
        int px = UiExtKt.toPx(16, context);
        emptyStateView.setPadding(px, 0, px, UiExtKt.toPx(24, context));
        emptyStateView.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), ResourceExtKt.toPxF(20, context)));
        emptyStateView.setVisibility(8);
        this.emptyStateView = emptyStateView;
        this.contentScrollListener = new ContentScrollListener(new FlightSchemeContainerView$contentScrollListener$1(this));
        this.contentAdapter = new FlightSeatsSchemeAdapter(new FlightSchemeContainerView$contentAdapter$1(this), new FlightSchemeContainerView$contentAdapter$2(this));
        this.shouldShowSchemeAnimation = true;
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
    public final void observeLastItemThresholdVisibility(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int childCount = linearLayoutManager.getChildCount() - 1;
        if (childCount == -1) {
            return;
        }
        View childAt = linearLayoutManager.getChildAt(childCount);
        FlightSchemeOrderDetailsView flightSchemeOrderDetailsView = childAt instanceof FlightSchemeOrderDetailsView ? (FlightSchemeOrderDetailsView) childAt : null;
        if (flightSchemeOrderDetailsView == null) {
            Function1<? super Boolean, Unit> function1 = this.lastItemThresholdVisibilityListener;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        int submitButtonMiddleY = flightSchemeOrderDetailsView.getSubmitButtonMiddleY() + flightSchemeOrderDetailsView.getTop();
        int height = recyclerView.getHeight();
        Function1<? super Boolean, Unit> function12 = this.lastItemThresholdVisibilityListener;
        if (function12 != null) {
            function12.invoke(Boolean.valueOf(submitButtonMiddleY <= height));
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
        int px = UiExtKt.toPx(8, context);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = UiExtKt.toPx(88, context2);
        Context context3 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        recyclerView.addItemDecoration(new FlightSeatsSchemeItemDecoration(px, px, px2, UiExtKt.toPx(20, context3)));
    }

    private final void setUpShimmerView() {
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(this.shimmerView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateOrderDetails$lambda$5(FlightSchemeContainerView flightSchemeContainerView) {
        flightSchemeContainerView.contentView.invalidateItemDecorations();
    }

    public final void registerContentScrollListener() {
        RecyclerView recyclerView = this.contentView;
        recyclerView.removeOnScrollListener(this.contentScrollListener);
        recyclerView.addOnScrollListener(this.contentScrollListener);
    }

    public final void scrollToSchemeRow(@NotNull final FlightSeatsSchemeViewModel.ScrollToSeat item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RecyclerView.o layoutManager = this.contentView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        View findViewByPosition = layoutManager.findViewByPosition(item.getPosition());
        Integer valueOf = findViewByPosition != null ? Integer.valueOf(findViewByPosition.getTop()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (item.getSeatNumber() != null) {
                this.contentAdapter.notifyItemChanged(item.getPosition(), new FlightSchemePayload$Highlight(item.getSeatNumber(), false, 2, null));
                return;
            }
            return;
        }
        final String seatNumber = item.getSeatNumber();
        RecyclerView.t tVar = seatNumber != null ? new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeContainerView$scrollToSchemeRow$scrollListener$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                FlightSeatsSchemeAdapter flightSeatsSchemeAdapter;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerView.removeOnScrollListener(this);
                    flightSeatsSchemeAdapter = FlightSchemeContainerView.this.contentAdapter;
                    flightSeatsSchemeAdapter.notifyItemChanged(item.getPosition(), new FlightSchemePayload$Highlight(seatNumber, true));
                }
            }
        } : null;
        if (tVar != null) {
            this.contentView.addOnScrollListener(tVar);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightSeatsSchemeSmoothScroller flightSeatsSchemeSmoothScroller = new FlightSeatsSchemeSmoothScroller(context);
        flightSeatsSchemeSmoothScroller.setTargetPosition(item.getPosition());
        layoutManager.startSmoothScroll(flightSeatsSchemeSmoothScroller);
    }

    public final void selectSeat(@NotNull FlightSeatsSchemeViewModel.SeatSelection item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.contentAdapter.updateItem(item.getPosition(), new FlightSchemeContainerView$selectSeat$1(item), "FlightSchemePayloadSeatSelection");
    }

    public final void setUp(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super Integer, ? super AirplaneSeatVO, Unit> onSeatClickListener, @NotNull Function1<? super Boolean, Unit> lastItemThresholdVisibilityListener) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSeatClickListener, "onSeatClickListener");
        Intrinsics.checkNotNullParameter(lastItemThresholdVisibilityListener, "lastItemThresholdVisibilityListener");
        this.actionHandler = actionHandler;
        this.onSeatClickListener = onSeatClickListener;
        this.lastItemThresholdVisibilityListener = lastItemThresholdVisibilityListener;
    }

    public final void showContent(@NotNull M scope, @NotNull List<? extends FlightSeatsSchemeItem> scheme) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.shimmerView.setVisibility(8);
        this.emptyStateView.setVisibility(8);
        this.contentView.setVisibility(0);
        this.contentAdapter.submitList(scope, scheme, new FlightSchemeContainerView$showContent$1(this));
    }

    public final void showEmptyState(@NotNull EmptyStateVO state) {
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

    public final void updateOrderDetails(FlightSeatsSchemeOrderDetailsVO item) {
        int cardsCount = this.contentAdapter.getCardsCount();
        int i11 = cardsCount - 1;
        boolean z11 = this.contentAdapter.getItemOrNull(i11) instanceof FlightSeatsSchemeOrderDetailsVO;
        if (item == null) {
            if (z11) {
                this.contentAdapter.removeAt(i11);
            }
        } else if (z11) {
            this.contentAdapter.updateItem(i11, new FlightSchemeContainerView$updateOrderDetails$1(item), "FlightSchemePayloadOrderDetailsUpdate");
        } else {
            this.contentAdapter.add(cardsCount, item);
        }
        RecyclerView.l itemAnimator = this.contentView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.isRunning(new RecyclerView.l.a() { // from class: PM.a
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    FlightSchemeContainerView.updateOrderDetails$lambda$5(FlightSchemeContainerView.this);
                }
            });
        }
    }
}
