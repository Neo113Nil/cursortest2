package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.presentation.sticky;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.presentation.ButtonWidgetV2VO;
import ru.ozon.app.android.travel.utils.drawable.TopRoundedBorderDrawable;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/presentation/sticky/ButtonWidgetV2StickyViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/presentation/ButtonWidgetV2VO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;LWZ/l;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/presentation/ButtonWidgetV2VO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/presentation/ButtonWidgetV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "", "borderWidth", "F", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getContainerView", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "containerView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWidgetV2StickyViewHolder extends AbstractC6064a<ButtonWidgetV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private float borderWidth;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWidgetV2StickyViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.tokenizedAnalytics = tokenizedAnalytics;
        Context context = container.Y().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.borderWidth = ResourceExtKt.toPxF(1, context);
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ButtonWidgetV2StickyViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final SingleAtom getContainerView() {
        View view = getView();
        if (view instanceof SingleAtom) {
            return (SingleAtom) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        SingleAtom containerView = getContainerView();
        if (containerView != null) {
            containerView.setOnAction(this.actionHandler);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonWidgetV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SingleAtom containerView = getContainerView();
        if (containerView != null) {
            SingleAtom.bind$default(containerView, item.getButton(), false, 2, null);
            containerView.setPadding(item.getLeftPadding(), item.getTopPadding(), item.getRightPadding(), item.getBottomPadding());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
            int intValue = parseColor != null ? parseColor.intValue() : 0;
            Context context2 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, item.getBorderColor());
            int intValue2 = parseColor2 != null ? parseColor2.intValue() : 0;
            Drawable background = containerView.getBackground();
            TopRoundedBorderDrawable topRoundedBorderDrawable = background instanceof TopRoundedBorderDrawable ? (TopRoundedBorderDrawable) background : null;
            if (topRoundedBorderDrawable != null) {
                topRoundedBorderDrawable.bind(intValue2, this.borderWidth, item.getTopCornerRadius(), intValue);
            }
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ButtonWidgetV2VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((ButtonWidgetV2StickyViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
