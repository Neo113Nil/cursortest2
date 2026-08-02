package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import S0.C3956f1;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import S0.n1;
import a1.C4912a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.PaddingOption;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0085\u0001\u0010&\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d2$\b\u0002\u0010#\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 \u0012\u0004\u0012\u00020\f\u0018\u00010\u001d2 \b\u0002\u0010%\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\f\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0018J)\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0018J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0018R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R+\u0010F\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER/\u0010N\u001a\u0004\u0018\u00010G2\b\u0010?\u001a\u0004\u0018\u00010G8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR/\u0010T\u001a\u0004\u0018\u00010\u00062\b\u0010?\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR+\u0010V\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010I\u001a\u0004\bV\u0010W\"\u0004\bX\u0010*R+\u0010\\\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010W\"\u0004\b[\u0010*R$\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R2\u0010_\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 \u0012\u0004\u0012\u00020\f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010;R\u0014\u0010d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010;¨\u0006e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/view/ProfileIconButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "()V", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "item", "shouldShowTooltip", "isRichTooltipAnimationEnabled", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onTrackCloseTooltip", "Lkotlin/Function2;", "indicatorRemoveCallback", "bind", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "isVisible", "toggleIndicatorVisibility", "(Z)V", "dismissTooltip", "", "voId", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "tooltipData", "bindTooltip", "(JLru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;Z)V", "trackViewAnalytics", "dismissTooltipWithCloseTracking", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "buttonTopMargin", "I", "buttonLeftMargin", "buttonBottomMargin", "buttonRightMargin", "<set-?>", "tooltipRequestId$delegate", "LS0/m0;", "getTooltipRequestId", "()I", "setTooltipRequestId", "(I)V", "tooltipRequestId", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltipDto$delegate", "LS0/p0;", "getTooltipDto", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "setTooltipDto", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;)V", "tooltipDto", "tooltipAutohideDelaySeconds$delegate", "getTooltipAutohideDelaySeconds", "()Ljava/lang/Integer;", "setTooltipAutohideDelaySeconds", "(Ljava/lang/Integer;)V", "tooltipAutohideDelaySeconds", "isTooltipVisible$delegate", "isTooltipVisible", "()Z", "setTooltipVisible", "richTooltipAnimationEnabled$delegate", "getRichTooltipAnimationEnabled", "setRichTooltipAnimationEnabled", "richTooltipAnimationEnabled", "onTooltipAction", "Lkotlin/jvm/functions/Function1;", "trackTooltipClosed", "Landroidx/compose/ui/platform/ComposeView;", "tooltipComposeView", "Landroidx/compose/ui/platform/ComposeView;", "dp4", "dp1", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileIconButtonView extends FrameLayout {
    private int buttonBottomMargin;
    private int buttonLeftMargin;
    private int buttonRightMargin;
    private int buttonTopMargin;
    private final int dp1;
    private final int dp4;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @NotNull
    private final IndicatorView indicatorView;

    /* renamed from: isTooltipVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isTooltipVisible;
    private Function1<? super AtomAction, Unit> onTooltipAction;

    /* renamed from: richTooltipAnimationEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 richTooltipAnimationEnabled;

    /* renamed from: tooltipAutohideDelaySeconds$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 tooltipAutohideDelaySeconds;

    @NotNull
    private final ComposeView tooltipComposeView;

    /* renamed from: tooltipDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 tooltipDto;

    /* renamed from: tooltipRequestId$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3972m0 tooltipRequestId;
    private Function1<? super Map<String, TokenizedTrackingInfo>, Unit> trackTooltipClosed;

    public /* synthetic */ ProfileIconButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindTooltip(final long voId, IconTooltipDto tooltipData, boolean shouldShowTooltip) {
        setTooltipDto(tooltipData != null ? tooltipData.getTooltipModel() : null);
        setTooltipAutohideDelaySeconds(tooltipData != null ? tooltipData.getAutoHideDelay() : null);
        if ((tooltipData != null ? tooltipData.getTooltipModel() : null) == null || !shouldShowTooltip) {
            dismissTooltip();
            return;
        }
        setTooltipRequestId(getTooltipRequestId() + 1);
        final ProfileIconButtonView$bindTooltip$showTooltip$1 profileIconButtonView$bindTooltip$showTooltip$1 = new ProfileIconButtonView$bindTooltip$showTooltip$1(this, getTooltipRequestId(), tooltipData);
        setTooltipVisible(false);
        if (isAttachedToWindow() && this.iconButtonView.isLaidOut()) {
            post(new Runnable() { // from class: GL.a
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileIconButtonView.bindTooltip$lambda$8(Function1.this, voId);
                }
            });
            return;
        }
        IconButtonV3View iconButtonV3View = this.iconButtonView;
        if (!iconButtonV3View.isLaidOut() || iconButtonV3View.isLayoutRequested()) {
            iconButtonV3View.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView$bindTooltip$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    Function1.this.invoke(Long.valueOf(voId));
                }
            });
        } else {
            profileIconButtonView$bindTooltip$showTooltip$1.invoke((ProfileIconButtonView$bindTooltip$showTooltip$1) Long.valueOf(voId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTooltip$lambda$8(Function1 function1, long j11) {
        function1.invoke(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissTooltipWithCloseTracking() {
        Function1<? super Map<String, TokenizedTrackingInfo>, Unit> function1 = this.trackTooltipClosed;
        if (function1 != null) {
            TooltipDTO tooltipDto = getTooltipDto();
            function1.invoke(tooltipDto != null ? tooltipDto.getTrackingInfo() : null);
        }
        dismissTooltip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRichTooltipAnimationEnabled() {
        return ((Boolean) this.richTooltipAnimationEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTooltipAutohideDelaySeconds() {
        return (Integer) this.tooltipAutohideDelaySeconds.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TooltipDTO getTooltipDto() {
        return (TooltipDTO) this.tooltipDto.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTooltipRequestId() {
        return this.tooltipRequestId.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTooltipVisible() {
        return ((Boolean) this.isTooltipVisible.getValue()).booleanValue();
    }

    private final void setRichTooltipAnimationEnabled(boolean z11) {
        this.richTooltipAnimationEnabled.setValue(Boolean.valueOf(z11));
    }

    private final void setTooltipAutohideDelaySeconds(Integer num) {
        this.tooltipAutohideDelaySeconds.setValue(num);
    }

    private final void setTooltipDto(TooltipDTO tooltipDTO) {
        this.tooltipDto.setValue(tooltipDTO);
    }

    private final void setTooltipRequestId(int i11) {
        this.tooltipRequestId.d(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTooltipVisible(boolean z11) {
        this.isTooltipVisible.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewAnalytics() {
        TooltipDTO tooltipDto;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Function1<? super AtomAction, Unit> function1 = this.onTooltipAction;
        if (function1 == null || (tooltipDto = getTooltipDto()) == null || (trackingInfo = tooltipDto.getTrackingInfo()) == null) {
            return;
        }
        function1.invoke(new AtomAction.ViewAction(trackingInfo, null, 2, null));
    }

    public final void bind(@NotNull ProfileIconButtonVO item, boolean shouldShowTooltip, boolean isRichTooltipAnimationEnabled, Function1<? super AtomAction, Unit> onAction, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> onTrackCloseTooltip, Function2<? super AtomAction, ? super String, Unit> indicatorRemoveCallback) {
        int i11;
        int i12;
        int i13;
        Integer rightMargin;
        Integer bottomMargin;
        Integer leftMargin;
        Integer topMargin;
        Intrinsics.checkNotNullParameter(item, "item");
        this.trackTooltipClosed = onTrackCloseTooltip;
        this.onTooltipAction = onAction;
        IconButtonV3HolderKt.bind(this.iconButtonView, item.getIconButton(), new ProfileIconButtonView$bind$1(this, onAction, indicatorRemoveCallback, item));
        IndicatorDTO indicator = item.getIndicator();
        if (indicator != null) {
            IndicatorHolderKt.bind$default(this.indicatorView, indicator, null, 2, null);
            ViewExtKt.showOrInvisible(this.indicatorView, true);
        } else {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.indicatorView);
        }
        PaddingOption options = item.getOptions();
        int i14 = 0;
        if (options == null || (topMargin = options.getTopMargin()) == null) {
            i11 = 0;
        } else {
            int intValue = topMargin.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = UiExtKt.toPx(intValue, context);
        }
        this.buttonTopMargin = i11;
        if (options == null || (leftMargin = options.getLeftMargin()) == null) {
            i12 = 0;
        } else {
            int intValue2 = leftMargin.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i12 = UiExtKt.toPx(intValue2, context2);
        }
        this.buttonLeftMargin = i12;
        if (options == null || (bottomMargin = options.getBottomMargin()) == null) {
            i13 = 0;
        } else {
            int intValue3 = bottomMargin.intValue();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i13 = UiExtKt.toPx(intValue3, context3);
        }
        this.buttonBottomMargin = i13;
        if (options != null && (rightMargin = options.getRightMargin()) != null) {
            int intValue4 = rightMargin.intValue();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            i14 = UiExtKt.toPx(intValue4, context4);
        }
        this.buttonRightMargin = i14;
        IconButtonV3View iconButtonV3View = this.iconButtonView;
        ViewGroup.LayoutParams layoutParams = iconButtonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.buttonTopMargin;
        marginLayoutParams.leftMargin = this.buttonLeftMargin;
        marginLayoutParams.bottomMargin = this.buttonBottomMargin;
        marginLayoutParams.rightMargin = this.buttonRightMargin;
        iconButtonV3View.setLayoutParams(marginLayoutParams);
        setRichTooltipAnimationEnabled(isRichTooltipAnimationEnabled);
        bindTooltip(item.getId(), item.getIconTooltip(), shouldShowTooltip);
    }

    public final void dismissTooltip() {
        setTooltipRequestId(getTooltipRequestId() + 1);
        setTooltipVisible(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        dismissTooltip();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredHeight = (this.indicatorView.getMeasuredHeight() / 2) + this.buttonTopMargin;
        int measuredWidth = (this.indicatorView.getMeasuredWidth() / 2) + this.buttonLeftMargin;
        LayoutExtKt.layoutLeftTop(this.iconButtonView, measuredWidth, measuredHeight);
        LayoutExtKt.layoutLeftTop(this.indicatorView, (this.iconButtonView.getMeasuredWidth() + measuredWidth) - this.dp4, measuredHeight - this.dp1);
        this.tooltipComposeView.layout(0, 0, 0, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measureUnspecified(this.iconButtonView);
        this.indicatorView.measure(widthMeasureSpec, heightMeasureSpec);
        final ComposeView composeView = this.tooltipComposeView;
        if (composeView.isAttachedToWindow()) {
            this.tooltipComposeView.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            composeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView$onMeasure$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    composeView.removeOnAttachStateChangeListener(this);
                    this.tooltipComposeView.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
        }
        setMeasuredDimension(this.indicatorView.getMeasuredWidth() + this.iconButtonView.getMeasuredWidth() + this.buttonLeftMargin + this.buttonRightMargin, this.indicatorView.getMeasuredHeight() + this.iconButtonView.getMeasuredHeight() + this.buttonTopMargin + this.buttonBottomMargin);
    }

    public final void toggleIndicatorVisibility(boolean isVisible) {
        ViewExtKt.showOrInvisible(this.indicatorView, isVisible);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileIconButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(iconButtonV3View);
        this.iconButtonView = iconButtonV3View;
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        indicatorView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(indicatorView);
        addView(indicatorView);
        this.indicatorView = indicatorView;
        this.tooltipRequestId = C3956f1.a(0);
        f7 = n1.f(null, D1.f25195a);
        this.tooltipDto = f7;
        f11 = n1.f(null, D1.f25195a);
        this.tooltipAutohideDelaySeconds = f11;
        f12 = n1.f(Boolean.FALSE, D1.f25195a);
        this.isTooltipVisible = f12;
        f13 = n1.f(Boolean.TRUE, D1.f25195a);
        this.richTooltipAnimationEnabled = f13;
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        composeView.a(new C4912a(true, -1472211920, new ProfileIconButtonView$tooltipComposeView$1$1(this)));
        addView(composeView);
        this.tooltipComposeView = composeView;
        this.dp4 = UiExtKt.toPx(4);
        this.dp1 = UiExtKt.toPx(1);
    }
}
