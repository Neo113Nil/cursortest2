package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.sticky;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2StickyView;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObservable;
import ru.ozon.app.android.travel.utils.animator.ListTotalStickyAnimator;
import ru.ozon.app.android.travel.utils.animator.StickyAnimator;
import ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.VisibilityFreezable;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/TravelPriceDetailInformationV2StickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/PriceDetailInformationV2StickyVO;", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "widgetVisibilityObservable", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;Ll10/i;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/PriceDetailInformationV2StickyVO;)V", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2StickyView;", "currentView", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2StickyView;", "Lru/ozon/app/android/travel/utils/animator/StickyAnimator;", "animator", "Lru/ozon/app/android/travel/utils/animator/StickyAnimator;", "", "isHiddenBeforeLayout", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2StickyWidgetViewHolder extends AbstractC6064a<PriceDetailInformationV2StickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private StickyAnimator animator;

    @NotNull
    private final i container;

    @NotNull
    private final TravelPriceDetailInformationV2StickyView currentView;
    private boolean isHiddenBeforeLayout;

    @NotNull
    private final WidgetVisibilityObservable widgetVisibilityObservable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2StickyWidgetViewHolder(@NotNull WidgetVisibilityObservable widgetVisibilityObservable, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(widgetVisibilityObservable, "widgetVisibilityObservable");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.widgetVisibilityObservable = widgetVisibilityObservable;
        this.container = container;
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2StickyView");
        this.currentView = (TravelPriceDetailInformationV2StickyView) view;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TravelPriceDetailInformationV2StickyWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        StickyAnimator stickyAnimator;
        TravelPriceDetailInformationV2StickyView travelPriceDetailInformationV2StickyView = this.currentView;
        int i11 = Y.f42258g;
        if (!travelPriceDetailInformationV2StickyView.isLaidOut() || travelPriceDetailInformationV2StickyView.isLayoutRequested()) {
            travelPriceDetailInformationV2StickyView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.sticky.TravelPriceDetailInformationV2StickyWidgetViewHolder$onWidgetCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    StickyAnimator stickyAnimator2;
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    TravelPriceDetailInformationV2StickyWidgetViewHolder.this.animator = new ListTotalStickyAnimator(view, view.getMeasuredHeight());
                    if (!TravelPriceDetailInformationV2StickyWidgetViewHolder.this.isHiddenBeforeLayout || (stickyAnimator2 = TravelPriceDetailInformationV2StickyWidgetViewHolder.this.animator) == null) {
                        return;
                    }
                    stickyAnimator2.hide();
                }
            });
        } else {
            this.animator = new ListTotalStickyAnimator(travelPriceDetailInformationV2StickyView, travelPriceDetailInformationV2StickyView.getMeasuredHeight());
            if (this.isHiddenBeforeLayout && (stickyAnimator = this.animator) != null) {
                stickyAnimator.hide();
            }
        }
        this.currentView.setClickListener(this.actionHandler);
        this.widgetVisibilityObservable.observe(this, new TravelPriceDetailInformationV2StickyWidgetViewHolder$onWidgetCreated$2(this));
        WidgetVisibilityObservable widgetVisibilityObservable = this.widgetVisibilityObservable;
        VisibilityFreezable visibilityFreezable = widgetVisibilityObservable instanceof VisibilityFreezable ? (VisibilityFreezable) widgetVisibilityObservable : null;
        if (visibilityFreezable != null) {
            C2399j.C(new C2408n0(this.container.M().getEventsFlow(), new TravelPriceDetailInformationV2StickyWidgetViewHolder$onWidgetCreated$lambda$1$$inlined$freezeVisibilityWhileLoading$1(visibilityFreezable, null)), K.a(this));
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PriceDetailInformationV2StickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentView.bind(item);
    }
}
