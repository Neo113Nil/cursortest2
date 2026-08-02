package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2View;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2ViewBinder;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObserver;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationIsVisibleViewModel;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationV2IsVisibleViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J#\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J3\u00100\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010,\u001a\u00060*j\u0002`+2\u000e\u0010/\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\"078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "widgetVisibilityObserver", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "viewModel", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationV2IsVisibleViewModel;", "viewModelV2", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationV2IsVisibleViewModel;LWZ/l;)V", "Ljk0/q;", "info", "", "calculateWidgetVisibilityPercent", "(Ljk0/q;)F", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "payload", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;Ll20/d;)V", "onVisibleAreaChanged", "(Ljk0/q;)V", "onViewOutOfVisibleBounds", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationV2IsVisibleViewModel;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$u;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2ViewBinder;", "binder", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2ViewBinder;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2WidgetViewHolder extends k<TravelPriceDetailInformationV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelPriceDetailInformationV2ViewBinder binder;

    @NotNull
    private final TravelPriceDetailInformationV2View containerView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ButtonWithInformationIsVisibleViewModel viewModel;

    @NotNull
    private final ButtonWithInformationV2IsVisibleViewModel viewModelV2;

    @NotNull
    private final RecyclerView.u viewPool;

    @NotNull
    private final WidgetVisibilityObserver widgetVisibilityObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2WidgetViewHolder(@NotNull TravelPriceDetailInformationV2View containerView, @NotNull ComposerReferences references, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory, @NotNull WidgetVisibilityObserver widgetVisibilityObserver, @NotNull ButtonWithInformationIsVisibleViewModel viewModel, @NotNull ButtonWithInformationV2IsVisibleViewModel viewModelV2, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(widgetVisibilityObserver, "widgetVisibilityObserver");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewModelV2, "viewModelV2");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.widgetVisibilityObserver = widgetVisibilityObserver;
        this.viewModel = viewModel;
        this.viewModelV2 = viewModelV2;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelPriceDetailInformationV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(handlersInhibitor).buildHandler();
        this.actionHandler = buildHandler;
        RecyclerView.u viewPool = references.getComposerViewPoolProvider().getViewPool();
        this.viewPool = viewPool;
        this.binder = new TravelPriceDetailInformationV2ViewBinder(containerView, buildHandler, viewPool);
    }

    private final float calculateWidgetVisibilityPercent(q info) {
        return (((this.containerView.getButton().getHeight() / 2.0f) + this.containerView.getButton().getTop()) - info.a().d().height()) / this.itemView.getHeight();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.widgetVisibilityObserver.onVisibilityChanged(false);
        this.viewModel.onVisibilityChanged(false);
        this.viewModelV2.onVisibilityChanged(0.0f);
        super.onViewOutOfVisibleBounds();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        float calculateWidgetVisibilityPercent = calculateWidgetVisibilityPercent(info);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        float a11 = o.a(itemView, info, true);
        boolean z11 = a11 > calculateWidgetVisibilityPercent;
        this.widgetVisibilityObserver.onVisibilityChanged(z11);
        this.viewModel.onVisibilityChanged(z11);
        this.viewModelV2.onVisibilityChanged(a11);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelPriceDetailInformationV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelPriceDetailInformationV2WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPriceDetailInformationV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List<?> list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        this.binder.bind(item, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPriceDetailInformationV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binder.bind(item);
    }
}
