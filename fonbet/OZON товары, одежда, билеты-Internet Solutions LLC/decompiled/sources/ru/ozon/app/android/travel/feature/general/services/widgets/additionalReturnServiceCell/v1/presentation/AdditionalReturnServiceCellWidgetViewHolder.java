package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation;

import T00.m;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import WZ.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellVO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view.AdditionalReturnServiceView;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006B/\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010%\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "item", "", "trackViewEvent", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "()V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "dp16", "I", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellViewModel;", "widgetViewModel", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellWidgetViewHolder extends k<AdditionalReturnServiceCellVO> implements AsyncWidgetCallbacks<AdditionalReturnServiceCellVO.Content>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int dp16;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AdditionalReturnServiceView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceCellWidgetViewHolder(@NotNull AdditionalReturnServiceView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new AdditionalReturnServiceCellWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.dp16 = ResourceExtKt.toPx(16, getContext());
    }

    private final AdditionalReturnServiceCellViewModel getWidgetViewModel() {
        return (AdditionalReturnServiceCellViewModel) getWidgetViewModel();
    }

    private final void trackViewEvent(AdditionalReturnServiceCellVO.Content item) {
        Map<String, TokenizedTrackingInfo> viewEventFromClickControl = item.getViewEventFromClickControl();
        if (viewEventFromClickControl != null) {
            AdditionalReturnServiceCellVO boundData = getBoundData();
            Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
            Intrinsics.checkNotNullParameter(viewEventFromClickControl, "<this>");
            t b11 = x.b(viewEventFromClickControl, valueOf, null);
            if (b11 != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
            }
        }
        Map<String, TokenizedTrackingInfo> viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            AdditionalReturnServiceCellVO boundData2 = getBoundData();
            t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(viewEvent, boundData2 != null ? Long.valueOf(boundData2.getId()) : null, null, 2, null);
            if (tokenizedEvent$default != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
            }
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<AdditionalReturnServiceCellVO.Content> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.refs.getController().update(new AdditionalReturnServiceCellUpdate(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AdditionalReturnServiceCellVO boundData = getBoundData();
        if (boundData != null) {
            this.refs.getController().m(boundData.getId());
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AdditionalReturnServiceCellVO boundData = getBoundData();
        if (boundData != null) {
            this.refs.getController().m(boundData.getId());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AdditionalReturnServiceCellViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.observeEvents(lifecycle, this, this);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalReturnServiceCellVO item, @NotNull l20.d info) {
        AdditionalReturnServiceCellViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        int i11 = item.getContent().getIsNotShaded() ? 0 : this.dp16;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        if (((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() != i11) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams2 = itemView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(i11);
            marginLayoutParams.setMarginEnd(i11);
            itemView.setLayoutParams(marginLayoutParams);
        }
        if (item.getContent().getShouldFetchState() && item.getAsyncData() != null && (widgetViewModel = getWidgetViewModel()) != null) {
            widgetViewModel.fetchWidgetWithParams(item.getAsyncData(), item.getContent().getAsyncParams());
        }
        this.view.bind(item.getContent(), item.getContent().getShouldShowSkeleton(), this.actionHandler);
        if (isInVisibleBounds()) {
            trackViewEvent(item.getContent());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AdditionalReturnServiceCellVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AdditionalReturnServiceCellWidgetViewHolder) item, trackingData, viewedPond);
        trackViewEvent(item.getContent());
    }
}
