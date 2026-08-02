package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation;

import El.C2971a;
import OD.a;
import T00.m;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Map;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view.MilesForBuyersView;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "callWidgetFetch", "()V", "showDefaultError", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersWidgetViewModel;", "viewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersWidgetViewHolder extends k<MilesForBuyersVO> implements AsyncWidgetCallbacks<MilesForBuyersVO.State>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final MilesForBuyersView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilesForBuyersWidgetViewHolder(@NotNull MilesForBuyersView view, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).onPreProcess(new MilesForBuyersWidgetViewHolder$actionHandler$1(this)).buildHandler();
        view.setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MilesForBuyersWidgetViewHolder milesForBuyersWidgetViewHolder, View view) {
        MilesForBuyersVO.State state;
        AtomAction clickAction;
        MilesForBuyersVO boundData = milesForBuyersWidgetViewHolder.getBoundData();
        if (boundData == null || (state = boundData.getState()) == null || (clickAction = state.getClickAction()) == null) {
            return;
        }
        milesForBuyersWidgetViewHolder.actionHandler.invoke(clickAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callWidgetFetch() {
        MilesForBuyersVO.AsyncState asyncState;
        String asyncData;
        MilesForBuyersVO boundData = getBoundData();
        MilesForBuyersVO.State state = boundData != null ? boundData.getState() : null;
        if ((state instanceof MilesForBuyersVO.AsyncState) && (asyncData = (asyncState = (MilesForBuyersVO.AsyncState) state).getAsyncData()) != null) {
            this.view.showLoader();
            MilesForBuyersWidgetViewModel viewModel = getViewModel();
            if (viewModel != null) {
                viewModel.fetchWidgetWithParams(asyncData, asyncState.getAsyncParams());
            }
        }
    }

    private final MilesForBuyersWidgetViewModel getViewModel() {
        return (MilesForBuyersWidgetViewModel) getWidgetViewModel();
    }

    private final void showDefaultError() {
        ViewGroup b11 = C2971a.b(this.references);
        if (b11 == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<MilesForBuyersVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.references.getController().update(new MilesForBuyersUpdate(fetchedModel.getFetchedState()));
        this.view.hideLoader();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Lm0.a.f17149a.e(throwable);
        this.view.hideLoader();
        showDefaultError();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        MilesForBuyersVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        MilesForBuyersWidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.observeEvents(lifecycle, this, this);
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        if (o.a(this.view, info, false) >= 1.0f) {
            this.view.onViewCompletelyVisible();
        }
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MilesForBuyersVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        if (isInVisibleBounds()) {
            trackView(item, getTrackingData(), (f) null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MilesForBuyersVO item, @NotNull c trackingData, f viewedPond) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = item.getState().getViewTrackingInfo();
        if (viewTrackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(viewTrackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }
}
