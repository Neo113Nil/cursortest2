package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation;

import T00.m;
import W10.c;
import W10.e;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.OverlayButtonsV2View;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2WidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2AsyncActionViewModel;", "asyncActionWidgetViewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(LWZ/l;Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2AsyncActionViewModel;Ll10/i;Ld20/e;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "onAsyncWidgetAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2AsyncActionViewModel;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsV2WidgetViewHolder extends AbstractC6064a<OverlayButtonsV2VO> implements AsyncActionWidgetCallbacks<OverlayButtonsV2State>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OverlayButtonsV2AsyncActionViewModel asyncActionWidgetViewModel;

    @NotNull
    private final i container;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonsV2WidgetViewHolder(@NotNull l tokenizedAnalytics, @NotNull OverlayButtonsV2AsyncActionViewModel asyncActionWidgetViewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(asyncActionWidgetViewModel, "asyncActionWidgetViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.asyncActionWidgetViewModel = asyncActionWidgetViewModel;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks
    public void onAsyncWidgetAction(@NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<OverlayButtonsV2State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        this.container.M().update(new OverlayButtonsV2Update(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncActionWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.asyncActionWidgetViewModel.setCallbacks(this);
        this.asyncActionWidgetViewModel.setTraceNameProvider(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.asyncActionWidgetViewModel.removeCallbacks();
        this.asyncActionWidgetViewModel.removeTraceNameProvider();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OverlayButtonsV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        OverlayButtonsV2View overlayButtonsV2View = view instanceof OverlayButtonsV2View ? (OverlayButtonsV2View) view : null;
        if (overlayButtonsV2View != null) {
            overlayButtonsV2View.bind(item.getState(), this.actionHandler);
        }
        if (item.getState().getAsyncAction() != null) {
            this.asyncActionWidgetViewModel.submit(item.getState().getAsyncAction());
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull OverlayButtonsV2VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        t b11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Map<String, TokenizedTrackingInfo> viewEvent = item.getState().getViewEvent();
        if (viewEvent == null || (b11 = e.b(viewEvent, Long.valueOf(item.getId()))) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, b11);
    }
}
