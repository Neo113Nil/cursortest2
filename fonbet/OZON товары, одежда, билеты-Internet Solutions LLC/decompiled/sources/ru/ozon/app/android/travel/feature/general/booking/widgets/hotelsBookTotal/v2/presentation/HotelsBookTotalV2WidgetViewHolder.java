package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import El.C2971a;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookSuccessValidationActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.HotelsBookTotalV2View;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B7\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010\u001aJ\u001f\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J'\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b0\u00104J\u0017\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u00162\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000509H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J)\u0010E\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00160M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\"\u0010Z\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020W0V0U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewModel;", "viewModel", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewModel;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "showError", "()V", "state", "setState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;)V", "", "shouldFetchState", "", "asyncData", "setShouldFetchState", "(ZLjava/lang/String;)V", "isLoading", "showLoadingState", "(Z)V", "observeLiveData", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewModel$ActionResult;", "result", "handleResult", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewModel$ActionResult;)V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;Ll20/d;Ljava/lang/Object;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/HotelsBookTotalV2View;", "hotelsBookTotalView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/HotelsBookTotalV2View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2WidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2WidgetViewModel;", "widgetViewModel", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "getSupportedActionHandlers", "()[Ljava/lang/Class;", "supportedActionHandlers", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV2WidgetViewHolder extends k<HotelsBookTotalV2VO> implements AsyncWidgetCallbacks<HotelsBookTotalV2VO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final HotelsBookTotalV2View hotelsBookTotalView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsBookTotalV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV2WidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull HotelsBookTotalV2ViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.hotelsBookTotalView = containerView instanceof HotelsBookTotalV2View ? (HotelsBookTotalV2View) containerView : null;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HotelsBookTotalV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory, this)).onComposerAction(new HotelsBookTotalV2WidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<? extends CustomActionHandler>[] getSupportedActionHandlers() {
        return new Class[]{TravelForceRedirectActionHandler.class, HotelsBookSuccessValidationActionHandler.class};
    }

    private final HotelsBookTotalV2WidgetViewModel getWidgetViewModel() {
        return (HotelsBookTotalV2WidgetViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleComposerAction(AtomAction.ComposerAction action) {
        HotelsBookTotalV2View hotelsBookTotalV2View = this.hotelsBookTotalView;
        if (hotelsBookTotalV2View != null) {
            ViewExtKt.hideKeyboard(hotelsBookTotalV2View);
        }
        this.viewModel.performApiAction(action.getActionName(), action.getParams(), getTrackingData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(HotelsBookTotalV2ViewModel.ActionResult result) {
        if (result instanceof HotelsBookTotalV2ViewModel.ActionResult.NewAction) {
            this.actionHandler.invoke(((HotelsBookTotalV2ViewModel.ActionResult.NewAction) result).getAction());
        } else {
            if (!Intrinsics.d(result, HotelsBookTotalV2ViewModel.ActionResult.Error.INSTANCE)) {
                throw new o();
            }
            showError();
        }
    }

    private final void observeLiveData() {
        this.viewModel.getResultLiveData().observe(this, new HotelsBookTotalV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new HotelsBookTotalV2WidgetViewHolder$observeLiveData$1(this)));
    }

    private final void setShouldFetchState(boolean shouldFetchState, String asyncData) {
        HotelsBookTotalV2WidgetViewModel widgetViewModel;
        if (!shouldFetchState || asyncData == null || (widgetViewModel = getWidgetViewModel()) == null) {
            return;
        }
        widgetViewModel.fetchWidget(asyncData);
    }

    private final void setState(HotelsBookTotalV2VO.State state) {
        HotelsBookTotalV2View hotelsBookTotalV2View = this.hotelsBookTotalView;
        if (hotelsBookTotalV2View != null) {
            hotelsBookTotalV2View.bind(state, this.actionHandler);
        }
    }

    private final void showError() {
        ViewGroup b11 = C2971a.b(this.references);
        if (b11 == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
    }

    private final void showLoadingState(boolean isLoading) {
        LoaderView buttonLoaderView;
        ButtonV3View buttonView;
        LoaderView buttonLoaderView2;
        ButtonV3View buttonView2;
        if (isLoading) {
            HotelsBookTotalV2View hotelsBookTotalV2View = this.hotelsBookTotalView;
            if (hotelsBookTotalV2View != null && (buttonView2 = hotelsBookTotalV2View.getButtonView()) != null) {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.invisible(buttonView2);
            }
            HotelsBookTotalV2View hotelsBookTotalV2View2 = this.hotelsBookTotalView;
            if (hotelsBookTotalV2View2 == null || (buttonLoaderView2 = hotelsBookTotalV2View2.getButtonLoaderView()) == null) {
                return;
            }
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(buttonLoaderView2);
            return;
        }
        HotelsBookTotalV2View hotelsBookTotalV2View3 = this.hotelsBookTotalView;
        if (hotelsBookTotalV2View3 != null && (buttonView = hotelsBookTotalV2View3.getButtonView()) != null) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(buttonView);
        }
        HotelsBookTotalV2View hotelsBookTotalV2View4 = this.hotelsBookTotalView;
        if (hotelsBookTotalV2View4 == null || (buttonLoaderView = hotelsBookTotalV2View4.getButtonLoaderView()) == null) {
            return;
        }
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(buttonLoaderView);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotelsBookTotalV2VO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        HotelsBookTotalV2VO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().update(new HotelsBookTotalV2Update(fetchedModel.getFetchedState(), false, boundData.getShouldShowLoader()));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        HotelsBookTotalV2WidgetViewHolder hotelsBookTotalV2WidgetViewHolder;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ViewGroup b11 = C2971a.b(this.references);
        if (b11 != null) {
            hotelsBookTotalV2WidgetViewHolder = this;
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, hotelsBookTotalV2WidgetViewHolder, 62, null).show();
        } else {
            hotelsBookTotalV2WidgetViewHolder = this;
        }
        HotelsBookTotalV2VO boundData = getBoundData();
        if (boundData != null) {
            hotelsBookTotalV2WidgetViewHolder.references.getController().update(new HotelsBookTotalV2Update(boundData.getState(), false, boundData.getShouldShowLoader()));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        HotelsBookTotalV2WidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsBookTotalV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsBookTotalV2WidgetViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getState().getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null) : null;
        if (tokenizedEvent$default != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsBookTotalV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsBookTotalV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        showLoadingState(item.getShouldShowLoader() || item.getShouldFetchState());
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            setState(item.getState());
            setShouldFetchState(item.getShouldFetchState(), item.getAsyncData());
            return;
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            for (Object obj : list) {
                if (obj == HotelsBookTotalV2Payload.STATE) {
                    setState(item.getState());
                } else if (obj == HotelsBookTotalV2Payload.SHOULD_FETCH_STATE) {
                    setShouldFetchState(item.getShouldFetchState(), item.getAsyncData());
                } else if (obj == HotelsBookTotalV2Payload.SHOULD_SHOW_LOADER) {
                    showLoadingState(item.getShouldShowLoader());
                }
            }
        }
    }
}
