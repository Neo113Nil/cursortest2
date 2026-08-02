package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation;

import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d0.P;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.RailwayScrollPriceCalendarDecoration;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.content.RailwayScrollPriceCalendarAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.shimmer.RailwayScrollPriceCalendarShimmerAdapter;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarStickyWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Ll10/i;", "composerScreenUiContainer", "<init>", "(Ld20/e;Ll10/i;)V", "", "index", "", "centerWidget", "(I)V", "verticalPadding", "setPadding", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "corners", "", "backgroundColor", "roundedCornersOuterColor", "setRoundedBackground", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;Ljava/lang/String;Ljava/lang/String;)V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarAdapter;", "contentAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerAdapter;", "shimmerAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "defCorner", "F", "Landroid/graphics/drawable/GradientDrawable;", "outerDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarStickyWidgetViewHolder extends AbstractC6067d<RailwayScrollPriceCalendarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final RailwayScrollPriceCalendarAdapter contentAdapter;
    private final Context context;
    private final float defCorner;

    @NotNull
    private final LayerDrawable layerDrawable;

    @NotNull
    private final LinearLayoutManager llm;

    @NotNull
    private final GradientDrawable outerDrawable;
    private final RecyclerView recyclerView;

    @NotNull
    private final RailwayScrollPriceCalendarShimmerAdapter shimmerAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayScrollPriceCalendarStickyWidgetViewHolder(@NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull i composerScreenUiContainer) {
        super(composerScreenUiContainer, viewFactory);
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(composerScreenUiContainer, "composerScreenUiContainer");
        View view = getView();
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        this.recyclerView = recyclerView;
        Context context = getView().getContext();
        this.context = context;
        this.tokenizedAnalytics = composerScreenUiContainer.X();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerScreenUiContainer, this).buildHandler();
        this.actionHandler = buildHandler;
        this.contentAdapter = new RailwayScrollPriceCalendarAdapter(buildHandler);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.shimmerAdapter = new RailwayScrollPriceCalendarShimmerAdapter(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.llm = linearLayoutManager;
        int px = CornerRadius.RADIUS_500.getPx();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float pxF = ResourceExtKt.toPxF(px, context);
        this.defCorner = pxF;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.outerDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF});
        this.backgroundDrawable = gradientDrawable2;
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        this.layerDrawable = layerDrawable;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setBackground(layerDrawable);
            Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            recyclerView.addItemDecoration(new RailwayScrollPriceCalendarDecoration(context2));
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(RailwayScrollPriceCalendarVO railwayScrollPriceCalendarVO, RailwayScrollPriceCalendarStickyWidgetViewHolder railwayScrollPriceCalendarStickyWidgetViewHolder) {
        Integer activeTabIndex = ((RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone) railwayScrollPriceCalendarVO.getState()).getActiveTabIndex();
        if (activeTabIndex != null) {
            railwayScrollPriceCalendarStickyWidgetViewHolder.centerWidget(activeTabIndex.intValue());
        }
    }

    private final void centerWidget(int index) {
        if (index == -1) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(context);
        centerSmoothScroller.setTargetPosition(index);
        this.llm.startSmoothScroll(centerSmoothScroller);
    }

    private final void setPadding(int verticalPadding) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setPadding(0, verticalPadding, 0, verticalPadding);
        }
    }

    private final void setRoundedBackground(RailwayScrollPriceCalendarVO.CornersVO corners, String backgroundColor, String roundedCornersOuterColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int parseColor = styleParser.parseColor(context, backgroundColor, UniColors.LAYER_FLOOR_1.getResId());
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Integer parseColor2 = styleParser.parseColor(context2, roundedCornersOuterColor);
        this.outerDrawable.setColor(parseColor2 != null ? parseColor2.intValue() : 0);
        this.backgroundDrawable.setColor(parseColor);
        float[] cornerRadii = this.backgroundDrawable.getCornerRadii();
        if (cornerRadii != null) {
            Intrinsics.checkNotNullParameter(cornerRadii, "<this>");
            if (cornerRadii.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (cornerRadii[0] == corners.getTopRadius()) {
                Intrinsics.checkNotNullParameter(cornerRadii, "<this>");
                if (cornerRadii.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                Intrinsics.checkNotNullParameter(cornerRadii, "<this>");
                if (cornerRadii[cornerRadii.length - 1] == corners.getBottomRadius()) {
                    return;
                }
            }
        }
        this.backgroundDrawable.setCornerRadii(new float[]{corners.getTopRadius(), corners.getTopRadius(), corners.getTopRadius(), corners.getTopRadius(), corners.getBottomRadius(), corners.getBottomRadius(), corners.getBottomRadius(), corners.getBottomRadius()});
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RailwayScrollPriceCalendarVO item) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(item, "item");
        setRoundedBackground(item.getCorners(), item.getBackgroundColor(), item.getRoundedCornersOuterColor());
        setPadding(item.getVerticalPadding());
        RailwayScrollPriceCalendarVO.PriceCalendarState state = item.getState();
        if (Intrinsics.d(state, RailwayScrollPriceCalendarVO.PriceCalendarState.Loading.INSTANCE)) {
            RecyclerView recyclerView2 = this.recyclerView;
            if (Intrinsics.d(recyclerView2 != null ? recyclerView2.getAdapter() : null, this.shimmerAdapter)) {
                return;
            }
            RecyclerView recyclerView3 = this.recyclerView;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.shimmerAdapter);
            }
            centerWidget(this.shimmerAdapter.getShimmersPositionInCenter());
            return;
        }
        if (!(state instanceof RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone)) {
            throw new o();
        }
        RecyclerView recyclerView4 = this.recyclerView;
        if (!Intrinsics.d(recyclerView4 != null ? recyclerView4.getAdapter() : null, this.contentAdapter) && (recyclerView = this.recyclerView) != null) {
            recyclerView.setAdapter(this.contentAdapter);
        }
        this.contentAdapter.submitList(((RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone) item.getState()).getDateTabs(), new P(1, item, this));
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull RailwayScrollPriceCalendarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((RailwayScrollPriceCalendarStickyWidgetViewHolder) item, trackingData, viewedPond);
        t viewTokenizedEvent = item.getViewTokenizedEvent();
        if (viewTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewTokenizedEvent, null, 2, null);
        }
    }
}
