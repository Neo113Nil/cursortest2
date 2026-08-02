package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import W10.c;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view.NightsRangeSelectorV3View;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00100%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/view/NightsRangeSelectorV3View;", "containerView", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;", "viewModel", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/view/NightsRangeSelectorV3View;Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;Ll10/i;LVg/d;)V", "item", "", "handleState", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;)V", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/view/NightsRangeSelectorV3View;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NightsRangeSelectorV3WidgetViewHolder extends k<NightsRangeSelectorV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final NightsRangeSelectorV3View containerView;

    @NotNull
    private final NightsRangeSelectorV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NightsRangeSelectorV3WidgetViewHolder(@NotNull NightsRangeSelectorV3View containerView, @NotNull NightsRangeSelectorV3ViewModel viewModel, @NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new NightsRangeSelectorV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final void handleState(NightsRangeSelectorV3VO item) {
        if (item != null) {
            String text = item.getTagButton().getText();
            if (text != null) {
                this.containerView.updateTagButtonText(text);
            }
            this.containerView.updateApplyButton(item.getApplyButton());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$handleState(NightsRangeSelectorV3WidgetViewHolder nightsRangeSelectorV3WidgetViewHolder, NightsRangeSelectorV3VO nightsRangeSelectorV3VO, kotlin.coroutines.d dVar) {
        nightsRangeSelectorV3WidgetViewHolder.handleState(nightsRangeSelectorV3VO);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getState(), getLifecycle(), AbstractC5434v.b.CREATED), new NightsRangeSelectorV3WidgetViewHolder$onAttach$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NightsRangeSelectorV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.initState(item);
        this.containerView.bind(item, this.actionHandler, this.viewModel);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NightsRangeSelectorV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((NightsRangeSelectorV3WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), viewEvent, null, 2, null);
        }
    }
}
