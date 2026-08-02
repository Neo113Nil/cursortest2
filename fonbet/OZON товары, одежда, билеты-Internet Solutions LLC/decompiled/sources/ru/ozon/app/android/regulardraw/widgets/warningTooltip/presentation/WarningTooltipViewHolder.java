package ru.ozon.app.android.regulardraw.widgets.warningTooltip.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import DS.a;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.regulardraw.ui.tooltip.ToolTipConfig;
import ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipViewHolder;", "Ld20/b;", "Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipVO;", "Ll10/i;", "screenUiContainer", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipViewModel;", "warningTooltipViewModel", "<init>", "(Ll10/i;LWZ/l;Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipViewModel;)V", "", "onWidgetCreated", "()V", "onRefresh", "item", "bind", "(Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipVO;)V", "addView", "removeView", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "LWZ/l;", "Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewGroup;", "composerRoot", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/regulardraw/ui/tooltip/TooltipView;", "warningTooltipView", "Lru/ozon/app/android/regulardraw/ui/tooltip/TooltipView;", "Landroid/view/View;", "interceptTouchesView", "Landroid/view/View;", "metricView", "getMetricView", "()Landroid/view/View;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WarningTooltipViewHolder extends AbstractC6065b<WarningTooltipVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ViewGroup composerRoot;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View interceptTouchesView;

    @NotNull
    private final View metricView;

    @NotNull
    private final i screenUiContainer;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TooltipView warningTooltipView;

    @NotNull
    private final WarningTooltipViewModel warningTooltipViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipViewHolder$Companion;", "", "<init>", "()V", "TOP_ARROW_BIAS", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WarningTooltipViewHolder(@NotNull i screenUiContainer, @NotNull l tokenizedAnalytics, @NotNull WarningTooltipViewModel warningTooltipViewModel) {
        Intrinsics.checkNotNullParameter(screenUiContainer, "screenUiContainer");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(warningTooltipViewModel, "warningTooltipViewModel");
        this.screenUiContainer = screenUiContainer;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.warningTooltipViewModel = warningTooltipViewModel;
        this.actionHandler = new ActionHandler.Builder(screenUiContainer, this).onPreProcess(new WarningTooltipViewHolder$actionHandler$1(this)).buildHandler();
        this.composerRoot = screenUiContainer.Z();
        Context L11 = screenUiContainer.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        TooltipView tooltipView = new TooltipView(L11, 0.5f, true, false);
        tooltipView.setOnClickListener(new a(this, 15));
        this.warningTooltipView = tooltipView;
        View view = new View(screenUiContainer.L());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setOnTouchListener(new QI.a(this, 3));
        this.interceptTouchesView = view;
        this.metricView = tooltipView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean interceptTouchesView$lambda$4$lambda$3(WarningTooltipViewHolder warningTooltipViewHolder, View view, MotionEvent motionEvent) {
        warningTooltipViewHolder.warningTooltipViewModel.hideTooltip();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void warningTooltipView$lambda$2$lambda$1(WarningTooltipViewHolder warningTooltipViewHolder, View view) {
        IconButtonV3DTO iconButton;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        WarningTooltipVO boundData = warningTooltipViewHolder.getBoundData();
        if (boundData == null || (iconButton = boundData.getIconButton()) == null || (common = iconButton.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        warningTooltipViewHolder.actionHandler.invoke(atomAction);
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        final LinearLayout composerTopContainer = ComposerViewExtensionKt.composerTopContainer(this.screenUiContainer.Y());
        this.composerRoot.setClipChildren(false);
        this.composerRoot.addView(this.interceptTouchesView);
        this.composerRoot.addView(this.warningTooltipView);
        if (!composerTopContainer.isLaidOut() || composerTopContainer.isLayoutRequested()) {
            composerTopContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.regulardraw.widgets.warningTooltip.presentation.WarningTooltipViewHolder$addView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TooltipView tooltipView = WarningTooltipViewHolder.this.warningTooltipView;
                    ViewGroup.LayoutParams layoutParams = tooltipView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (Dimens.INSTANCE.getDP_8() + composerTopContainer.getHeight()) - UtilKt.getStatusBarHeight(WarningTooltipViewHolder.this.screenUiContainer.K());
                    tooltipView.setLayoutParams(marginLayoutParams);
                }
            });
            return;
        }
        TooltipView tooltipView = this.warningTooltipView;
        ViewGroup.LayoutParams layoutParams = tooltipView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (Dimens.INSTANCE.getDP_8() + composerTopContainer.getHeight()) - UtilKt.getStatusBarHeight(this.screenUiContainer.K());
        tooltipView.setLayoutParams(marginLayoutParams);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        this.warningTooltipViewModel.onPageRefreshed();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        C2399j.C(new C2408n0(C5427n.a(this.warningTooltipViewModel.getShowWarningTooltip(), getLifecycle(), AbstractC5434v.b.STARTED), new WarningTooltipViewHolder$onWidgetCreated$1(this, null)), K.a(this.screenUiContainer.K().f()));
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.composerRoot.removeView(this.warningTooltipView);
        this.composerRoot.removeView(this.interceptTouchesView);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull WarningTooltipVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.warningTooltipView.bind(new ToolTipConfig.Warning(item.getText(), item.getImage(), item.getIconButton(), this.actionHandler, item.getTestInfo()));
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull WarningTooltipVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        CommonControlSettings common = item.getIconButton().getCommon();
        if (common == null || (trackingInfo = common.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, mapToTokenizedEvent$default, null);
    }
}
