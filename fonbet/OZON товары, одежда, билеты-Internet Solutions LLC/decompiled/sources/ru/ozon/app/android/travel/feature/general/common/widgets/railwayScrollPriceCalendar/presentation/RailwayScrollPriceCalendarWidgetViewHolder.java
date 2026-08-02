package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation;

import Cm.RunnableC2781a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.RailwayScrollPriceCalendarDecoration;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.content.RailwayScrollPriceCalendarAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.shimmer.RailwayScrollPriceCalendarShimmerAdapter;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "index", "", "centerWidget", "(I)V", "verticalPadding", "setPadding", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "corners", "", "backgroundColor", "roundedCornersOuterColor", "setRoundedBackground", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;Ljava/lang/String;Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarAdapter;", "contentAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerAdapter;", "shimmerAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "defCorner", "F", "Landroid/graphics/drawable/GradientDrawable;", "outerDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarWidgetViewHolder extends k<RailwayScrollPriceCalendarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final RailwayScrollPriceCalendarAdapter contentAdapter;
    private final float defCorner;

    @NotNull
    private final LayerDrawable layerDrawable;

    @NotNull
    private final LinearLayoutManager llm;

    @NotNull
    private final GradientDrawable outerDrawable;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final RailwayScrollPriceCalendarShimmerAdapter shimmerAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayScrollPriceCalendarWidgetViewHolder(@NotNull RecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences composerReferences) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.recyclerView = recyclerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        this.contentAdapter = new RailwayScrollPriceCalendarAdapter(buildHandler);
        this.shimmerAdapter = new RailwayScrollPriceCalendarShimmerAdapter(getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.llm = linearLayoutManager;
        float pxF = ResourceExtKt.toPxF(CornerRadius.RADIUS_500.getPx(), getContext());
        this.defCorner = pxF;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.outerDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF});
        this.backgroundDrawable = gradientDrawable2;
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        this.layerDrawable = layerDrawable;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setBackground(layerDrawable);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new RailwayScrollPriceCalendarDecoration(context));
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(RailwayScrollPriceCalendarVO railwayScrollPriceCalendarVO, RailwayScrollPriceCalendarWidgetViewHolder railwayScrollPriceCalendarWidgetViewHolder) {
        Integer activeTabIndex = ((RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone) railwayScrollPriceCalendarVO.getState()).getActiveTabIndex();
        if (activeTabIndex != null) {
            railwayScrollPriceCalendarWidgetViewHolder.centerWidget(activeTabIndex.intValue());
        }
    }

    private final void centerWidget(int index) {
        if (index == -1) {
            return;
        }
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(getContext());
        centerSmoothScroller.setTargetPosition(index);
        this.llm.startSmoothScroll(centerSmoothScroller);
    }

    private final void setPadding(int verticalPadding) {
        this.recyclerView.setPadding(0, verticalPadding, 0, verticalPadding);
    }

    private final void setRoundedBackground(RailwayScrollPriceCalendarVO.CornersVO corners, String backgroundColor, String roundedCornersOuterColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        int parseColor = styleParser.parseColor(getContext(), backgroundColor, UniColors.LAYER_FLOOR_1.getResId());
        Integer parseColor2 = styleParser.parseColor(getContext(), roundedCornersOuterColor);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RailwayScrollPriceCalendarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setRoundedBackground(item.getCorners(), item.getBackgroundColor(), item.getRoundedCornersOuterColor());
        setPadding(item.getVerticalPadding());
        RailwayScrollPriceCalendarVO.PriceCalendarState state = item.getState();
        if (Intrinsics.d(state, RailwayScrollPriceCalendarVO.PriceCalendarState.Loading.INSTANCE)) {
            if (Intrinsics.d(this.recyclerView.getAdapter(), this.shimmerAdapter)) {
                return;
            }
            this.recyclerView.setAdapter(this.shimmerAdapter);
            centerWidget(this.shimmerAdapter.getShimmersPositionInCenter());
            return;
        }
        if (!(state instanceof RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone)) {
            throw new o();
        }
        if (!Intrinsics.d(this.recyclerView.getAdapter(), this.contentAdapter)) {
            this.recyclerView.setAdapter(this.contentAdapter);
        }
        this.contentAdapter.submitList(((RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone) item.getState()).getDateTabs(), new RunnableC2781a(6, item, this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RailwayScrollPriceCalendarVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((RailwayScrollPriceCalendarWidgetViewHolder) item, trackingData, viewedPond);
        t viewTokenizedEvent = item.getViewTokenizedEvent();
        if (viewTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewTokenizedEvent, null, 2, null);
        }
    }
}
