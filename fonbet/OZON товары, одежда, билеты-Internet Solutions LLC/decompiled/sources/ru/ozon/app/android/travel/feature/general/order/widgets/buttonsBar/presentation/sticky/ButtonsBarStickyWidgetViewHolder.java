package ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.sticky;

import Vg.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
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
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.ButtonsBarVO;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/sticky/ButtonsBarStickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/ButtonsBarVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/ButtonsBarVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/ButtonsBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "Landroid/view/View;", "getParentView", "()Landroid/view/View;", "parentView", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowView;", "getButtonsRowView", "()Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowView;", "buttonsRowView", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonsBarStickyWidgetViewHolder extends AbstractC6064a<ButtonsBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;

    @NotNull
    private final i container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsBarStickyWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ButtonsBarStickyWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.backgroundProducer = new RoundedBackgroundProducer();
    }

    private final ButtonsRowView getButtonsRowView() {
        View view = getView();
        if (view instanceof ButtonsRowView) {
            return (ButtonsRowView) view;
        }
        return null;
    }

    private final View getParentView() {
        Object parent = getView().getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonsBarVO item) {
        ShapeDrawable shapeDrawable;
        Intrinsics.checkNotNullParameter(item, "item");
        View parentView = getParentView();
        if (parentView != null) {
            String backgroundColor = item.getBackgroundColor();
            if (backgroundColor != null) {
                RoundedBackgroundProducer roundedBackgroundProducer = this.backgroundProducer;
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = parentView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context, backgroundColor);
                shapeDrawable = RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, parseColor != null ? parseColor.intValue() : 0, item.getTopRadius(), item.getTopRadius(), 0.0f, 0.0f, 24, null);
            } else {
                shapeDrawable = null;
            }
            parentView.setBackground(shapeDrawable);
        }
        ButtonsRowView buttonsRowView = getButtonsRowView();
        if (buttonsRowView != null) {
            buttonsRowView.bind(item.getButtonsRow(), this.actionHandler);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ButtonsBarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), viewEvent, null, 2, null);
        }
    }
}
