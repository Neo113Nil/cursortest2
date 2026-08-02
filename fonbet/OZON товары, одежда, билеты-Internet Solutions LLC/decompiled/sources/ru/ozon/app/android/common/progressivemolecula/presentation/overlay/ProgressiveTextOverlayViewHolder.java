package ru.ozon.app.android.common.progressivemolecula.presentation.overlay;

import CG.b;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/presentation/overlay/ProgressiveTextOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;", "Ll10/i;", "container", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "view", "<init>", "(Ll10/i;Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;)V", "item", "", "bind", "(Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "metricView", "getMetricView", "()Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/widget/LinearLayout;", "getBottomContainer", "()Landroid/widget/LinearLayout;", "bottomContainer", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextOverlayViewHolder extends AbstractC6065b<ProgressiveTextWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final ProgressiveTextView metricView;

    @NotNull
    private final ProgressiveTextView view;

    public ProgressiveTextOverlayViewHolder(@NotNull i container, @NotNull ProgressiveTextView view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        this.container = container;
        this.view = view;
        this.metricView = view;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        view.setOnClickListener(new b(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProgressiveTextOverlayViewHolder progressiveTextOverlayViewHolder, View view) {
        ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;
        AtomAction action;
        ProgressiveTextWidgetVO boundData = progressiveTextOverlayViewHolder.getBoundData();
        if (boundData == null || (progressiveText = boundData.getProgressiveText()) == null || (action = progressiveText.getAction()) == null) {
            return;
        }
        progressiveTextOverlayViewHolder.actionHandler.invoke(action);
    }

    private final LinearLayout getBottomContainer() {
        return ComposerViewExtensionKt.composerBottomContainer(this.container.Z());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        LinearLayout bottomContainer = getBottomContainer();
        ProgressiveTextWidgetVO boundData = getBoundData();
        bottomContainer.addView(this.view, (boundData == null || !boundData.getPageTypeIsPDP()) ? bottomContainer.getChildCount() : 0);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        getBottomContainer().removeView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ProgressiveTextWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CommonCellSettings.LayoutPadding horizontalPadding = item.getHorizontalPadding();
        if (horizontalPadding != null) {
            int cellLayoutPadding = horizontalPadding.getCellLayoutPadding();
            Context L11 = this.container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            int dim = ResourceExtKt.dim(L11, cellLayoutPadding);
            ProgressiveTextView progressiveTextView = this.view;
            progressiveTextView.setPadding(dim, progressiveTextView.getPaddingTop(), dim, progressiveTextView.getPaddingBottom());
        }
        this.view.bind(item.getProgressiveText());
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public ProgressiveTextView getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ProgressiveTextWidgetVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getProgressiveText().getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
