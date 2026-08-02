package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeView;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeView;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "onAttach", "()V", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;", "widgetViewModel", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWithSchemeWidgetViewHolder extends k<TravelRailwaySeatSelectWithSchemeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelRailwaySeatSelectWithSchemeView containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySeatSelectWithSchemeWidgetViewHolder(@NotNull TravelRailwaySeatSelectWithSchemeView containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelRailwaySeatSelectWidgetViewModel getWidgetViewModel() {
        return (TravelRailwaySeatSelectWidgetViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.containerView.onAttach(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        SingleLiveEvent<Map<String, TokenizedTrackingInfo>> trackingLiveData;
        V<Boolean> progressLiveData;
        SingleLiveEvent<TravelRailwaySeatSelectWidgetViewModel.Action> actionLiveData;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        TravelRailwaySeatSelectWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null && (actionLiveData = widgetViewModel.getActionLiveData()) != null) {
            actionLiveData.observe(lifecycle, new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$onAttachViewModel$1(this)));
        }
        TravelRailwaySeatSelectWidgetViewModel widgetViewModel2 = getWidgetViewModel();
        if (widgetViewModel2 != null && (progressLiveData = widgetViewModel2.getProgressLiveData()) != null) {
            progressLiveData.observe(lifecycle, new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$onAttachViewModel$2(this)));
        }
        TravelRailwaySeatSelectWidgetViewModel widgetViewModel3 = getWidgetViewModel();
        if (widgetViewModel3 == null || (trackingLiveData = widgetViewModel3.getTrackingLiveData()) == null) {
            return;
        }
        trackingLiveData.observe(lifecycle, new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelRailwaySeatSelectWithSchemeWidgetViewHolder$onAttachViewModel$3(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.containerView.onDetach(this);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelRailwaySeatSelectWithSchemeVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelRailwaySeatSelectWithSchemeVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelRailwaySeatSelectWithSchemeWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
