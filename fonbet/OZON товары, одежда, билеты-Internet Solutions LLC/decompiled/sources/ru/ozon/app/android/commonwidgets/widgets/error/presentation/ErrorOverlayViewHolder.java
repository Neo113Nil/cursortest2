package ru.ozon.app.android.commonwidgets.widgets.error.presentation;

import U7.d;
import V10.c;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.commonwidgets.R$string;
import ru.ozon.app.android.commonwidgets.widgets.error.ErrorAnalytics;
import ru.ozon.app.android.commonwidgets.widgets.error.presentation.ErrorVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorVO;", "Ll10/i;", "container", "Lru/ozon/app/android/commonwidgets/widgets/error/ErrorAnalytics;", "errorAnalytics", "<init>", "(Ll10/i;Lru/ozon/app/android/commonwidgets/widgets/error/ErrorAnalytics;)V", "item", "", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorVO;)V", "Ll10/i;", "Lru/ozon/app/android/commonwidgets/widgets/error/ErrorAnalytics;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorOverlayViewHolder extends AbstractC6065b<ErrorVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final ErrorAnalytics errorAnalytics;
    private final View metricView;

    public ErrorOverlayViewHolder(@NotNull i container, @NotNull ErrorAnalytics errorAnalytics) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(errorAnalytics, "errorAnalytics");
        this.container = container;
        this.errorAnalytics = errorAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ErrorVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String errorId = item.getErrorId();
        ErrorOverlayViewHolder$bind$onDescriptionClickAction$1 errorOverlayViewHolder$bind$onDescriptionClickAction$1 = null;
        if (errorId == null) {
            errorId = null;
        } else if (item.getNotificationTitle() != null) {
            errorId = StringProvider.getString(R$string.error_commonwidgets_error_description_link_android, errorId);
        }
        String subtitle = item.getSubtitle();
        if (errorId == null) {
            errorId = "";
        }
        String e11 = d.e(subtitle, errorId);
        if (item.getNotificationTitle() != null && item.getErrorId() != null) {
            errorOverlayViewHolder$bind$onDescriptionClickAction$1 = new ErrorOverlayViewHolder$bind$onDescriptionClickAction$1(this, item);
        }
        this.container.M().h(new c(item.getTitle(), e11, item.getButtonTitle(), item.getButtons(), this.actionHandler, new ErrorOverlayViewHolder$bind$1(this), errorOverlayViewHolder$bind$onDescriptionClickAction$1));
        ErrorVO.V2TrackingInfo v2TrackingInfo = item.getV2TrackingInfo();
        if (v2TrackingInfo != null) {
            this.errorAnalytics.trackErrorView(v2TrackingInfo.getErrorId(), v2TrackingInfo.getErrorCode());
        }
    }
}
