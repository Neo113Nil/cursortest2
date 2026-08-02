package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.o;
import Vg.d;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.travel.feature.avia.R$string;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2AsyncViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2Payload;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.FlightSeatsSchemeV2HeaderBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeContainerViewV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeContentRowViewV2;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.app.android.travel.utils.navBarButtonUpdate.NavBarButtonUpdate;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import v10.C10183a;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B3\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\"\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010\"\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b\"\u0010$J\u001d\u0010'\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u0010\u0015J\u001b\u00104\u001a\u00020\u00132\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J;\u0010=\u001a\u00020\u00132\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020:\u0018\u0001092\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u000109H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0013H\u0002¢\u0006\u0004\bC\u0010\u0015J\u000f\u0010D\u001a\u00020\u0013H\u0002¢\u0006\u0004\bD\u0010\u0015J\u0017\u0010F\u001a\u00020\u00132\u0006\u0010E\u001a\u00020?H\u0002¢\u0006\u0004\bF\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00130J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001d\u0010V\u001a\u0004\u0018\u00010Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR$\u0010X\u001a\u0012\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00130Jj\u0002`W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010MR\u0016\u0010Z\u001a\u0004\u0018\u00010Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u0004\u0018\u00010b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LVg/d;Ll10/i;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;LWZ/l;)V", "", "onAttach", "()V", "onDetach", "onViewOutOfVisibleBounds", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;Ll20/d;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "observeFlows", "showSeatSelectionError", "", "message", "showError", "(Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate;", "updateScheme", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate;)V", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "event", "payloads", "trackSeatClickEvent", "(Ljava/util/Map;Ljava/util/Map;)V", "", "isVisible", "updateClearButton", "(Z)V", "setLiteralsRowView", "removeLiteralsRowView", "shouldShowLiterals", "updateLiterals", "Ll10/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "dp16", "I", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate$delegate", "LSc/j;", "getNotificationBarDelegate", "()Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate", "Lru/ozon/app/android/action/BuildedActionHandler;", "emergencySeatsActionHandler", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContainerViewV2;", "schemeContainerView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContainerViewV2;", "Landroid/view/ViewGroup;", "composerStickyContainerView", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContentRowViewV2;", "literalsRowView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContentRowViewV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2AsyncViewModel;", "getAsyncViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2AsyncViewModel;", "asyncViewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2BlockWidgetViewHolder extends k<FlightSeatsSchemeV2VI> implements AsyncWidgetCallbacks<FlightSeatsSchemeV2VI.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private ViewGroup composerStickyContainerView;

    @NotNull
    private final i container;
    private final int dp16;

    @NotNull
    private final Function1<AtomAction, Unit> emergencySeatsActionHandler;

    @NotNull
    private final FlightSchemeContentRowViewV2 literalsRowView;

    /* renamed from: notificationBarDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationBarDelegate;
    private final FlightSchemeContainerViewV2 schemeContainerView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FlightSeatsSchemeV2ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "seat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<Integer, AirplaneSeatTypeV2VI, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI) {
            invoke(num.intValue(), airplaneSeatTypeV2VI);
            return Unit.f71690a;
        }

        public final void invoke(int i11, AirplaneSeatTypeV2VI seat) {
            Intrinsics.checkNotNullParameter(seat, "seat");
            FlightSeatsSchemeV2VI boundData = FlightSeatsSchemeV2BlockWidgetViewHolder.this.getBoundData();
            FlightSeatsSchemeV2VI.State state = boundData != null ? boundData.getState() : null;
            if (state instanceof FlightSeatsSchemeV2VI.State.Content) {
                FlightSeatsSchemeV2BlockWidgetViewHolder.this.viewModel.onSeatClicked(i11, seat, ((FlightSeatsSchemeV2VI.State.Content) state).getSchemeBlock().getSelectSeatAction());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isVisible", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            FlightSeatsSchemeV2BlockWidgetViewHolder.this.viewModel.onVisibilityLiteralsChanged(!z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2BlockWidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull FlightSeatsSchemeV2ViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.container = container;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new FlightSeatsSchemeV2BlockWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.dp16 = UiExtKt.toPx(16, getContext());
        this.notificationBarDelegate = LazyUtilsKt.unsafeLazy(new FlightSeatsSchemeV2BlockWidgetViewHolder$notificationBarDelegate$2(this));
        FlightSeatsSchemeV2BlockWidgetViewHolder$emergencySeatsActionHandler$1 flightSeatsSchemeV2BlockWidgetViewHolder$emergencySeatsActionHandler$1 = new FlightSeatsSchemeV2BlockWidgetViewHolder$emergencySeatsActionHandler$1(this);
        this.emergencySeatsActionHandler = flightSeatsSchemeV2BlockWidgetViewHolder$emergencySeatsActionHandler$1;
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2 = containerView instanceof FlightSchemeContainerViewV2 ? (FlightSchemeContainerViewV2) containerView : null;
        this.schemeContainerView = flightSchemeContainerViewV2;
        FlightSchemeContentRowViewV2 flightSchemeContentRowViewV2 = new FlightSchemeContentRowViewV2(getContext());
        flightSchemeContentRowViewV2.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        flightSchemeContentRowViewV2.setLayoutParams(layoutParams);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = flightSchemeContentRowViewV2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        flightSchemeContentRowViewV2.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, 0.0f, 0.0f, 30, null));
        Context context2 = flightSchemeContentRowViewV2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        flightSchemeContentRowViewV2.setPadding(0, 0, 0, UiExtKt.toPx(4, context2));
        this.literalsRowView = flightSchemeContentRowViewV2;
        if (flightSchemeContainerViewV2 != null) {
            flightSchemeContainerViewV2.setUp(buildHandler, flightSeatsSchemeV2BlockWidgetViewHolder$emergencySeatsActionHandler$1, new AnonymousClass1(), new AnonymousClass2());
        }
    }

    private final FlightSeatsSchemeV2AsyncViewModel getAsyncViewModel() {
        return (FlightSeatsSchemeV2AsyncViewModel) getWidgetViewModel();
    }

    private final NotificationBarDelegate getNotificationBarDelegate() {
        return (NotificationBarDelegate) this.notificationBarDelegate.getValue();
    }

    private final void observeFlows() {
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel = this.viewModel;
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getSeatSelectionFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$1(this, null)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getScrollToSchemeRowFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2(this, null)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getSeatSelectionErrorFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$3(this, null)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getNetworkErrorFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$4(this, null)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.isClearButtonVisibleFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$5(this)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getSchemeUpdateVoFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$6(this)), K.a(this));
        C2399j.C(new C2408n0(flightSeatsSchemeV2ViewModel.getShowLiteralsFlow(), new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$7(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlows$lambda$6$updateClearButton(FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder, boolean z11, kotlin.coroutines.d dVar) {
        flightSeatsSchemeV2BlockWidgetViewHolder.updateClearButton(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlows$lambda$6$updateLiterals(FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder, boolean z11, kotlin.coroutines.d dVar) {
        flightSeatsSchemeV2BlockWidgetViewHolder.updateLiterals(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeFlows$lambda$6$updateScheme(FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder, FlightSeatsSchemeV2ViewModel.SchemeUpdate schemeUpdate, kotlin.coroutines.d dVar) {
        flightSeatsSchemeV2BlockWidgetViewHolder.updateScheme(schemeUpdate);
        return Unit.f71690a;
    }

    private final void removeLiteralsRowView() {
        ViewGroup viewGroup = this.composerStickyContainerView;
        if (viewGroup != null) {
            ViewExtKt.hide(viewGroup);
        }
        ViewGroup viewGroup2 = this.composerStickyContainerView;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.literalsRowView);
        }
        this.composerStickyContainerView = null;
    }

    private final void setLiteralsRowView() {
        this.composerStickyContainerView = C10183a.l(this.container.Y());
        ViewParent parent = this.literalsRowView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.literalsRowView);
        }
        ViewGroup viewGroup = this.composerStickyContainerView;
        if (viewGroup != null) {
            viewGroup.addView(this.literalsRowView);
        }
    }

    private final void showError(String message) {
        NotificationBarDelegate notificationBarDelegate = getNotificationBarDelegate();
        if (notificationBarDelegate != null) {
            notificationBarDelegate.showError(message);
        }
    }

    static /* synthetic */ void showError$default(FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        flightSeatsSchemeV2BlockWidgetViewHolder.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSeatSelectionError() {
        showError(StringProvider.getString(R$string.seat_selection_error_android));
    }

    private final void trackSeatClickEvent(Map<String, TokenizedTrackingInfo> event, Map<String, String> payloads) {
        t mapToTokenizedEvent$default;
        FlightSeatsSchemeV2VI boundData = getBoundData();
        Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
        if (payloads != null) {
            this.container.X().e(payloads);
        }
        if (event == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(event, valueOf, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.container.X(), mapToTokenizedEvent$default, null, 2, null);
    }

    private final void updateClearButton(boolean isVisible) {
        this.container.M().update(new NavBarButtonUpdate(isVisible));
    }

    private final void updateLiterals(boolean shouldShowLiterals) {
        if (shouldShowLiterals) {
            ViewGroup viewGroup = this.composerStickyContainerView;
            if (viewGroup != null) {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.composerStickyContainerView;
        if (viewGroup2 != null) {
            ViewExtKt.hide(viewGroup2);
        }
    }

    private final void updateScheme(FlightSeatsSchemeV2ViewModel.SchemeUpdate item) {
        FlightSeatsSchemeV2HeaderBlockVI headerBlock;
        FlightSeatsSchemeV2VI boundData = getBoundData();
        if (boundData != null && (boundData.getState() instanceof FlightSeatsSchemeV2VI.State.Content)) {
            FlightSeatsSchemeV2FooterBlockVI footerBlock = ((FlightSeatsSchemeV2VI.State.Content) boundData.getState()).getFooterBlock();
            List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengers = item.getFooterBlockUpdate().getPassengers();
            TextDTO price = item.getFooterBlockUpdate().getPrice();
            CommonAtomIconDTO infoIcon = item.getFooterBlockUpdate().getInfoIcon();
            FlightSeatsSchemeV2FooterBlockVI copy$default = FlightSeatsSchemeV2FooterBlockVI.copy$default(footerBlock, passengers, item.getFooterBlockUpdate().getSelectedPassengerIndex(), item.getFooterBlockUpdate().getCaption(), price, item.getFooterBlockUpdate().getSubmitButton(), infoIcon, null, true, item.getFooterBlockUpdate().getHideInfo(), item.getFooterBlockUpdate().getSkipButton(), 64, null);
            if (item.getSubtitleName() != null) {
                FlightSeatsSchemeV2HeaderBlockVI headerBlock2 = ((FlightSeatsSchemeV2VI.State.Content) boundData.getState()).getHeaderBlock();
                headerBlock = headerBlock2 != null ? FlightSeatsSchemeV2HeaderBlockVI.copy$default(headerBlock2, null, null, item.getSubtitleName(), null, 11, null) : null;
            } else {
                headerBlock = ((FlightSeatsSchemeV2VI.State.Content) boundData.getState()).getHeaderBlock();
            }
            this.container.M().d(FlightSeatsSchemeV2VI.copy$default(boundData, 0L, null, null, false, FlightSeatsSchemeV2VI.State.Content.copy$default((FlightSeatsSchemeV2VI.State.Content) boundData.getState(), FlightSeatsSchemeV2BlockVI.copy$default(((FlightSeatsSchemeV2VI.State.Content) boundData.getState()).getSchemeBlock(), null, item.getFirstSelectedSeatIndex(), item.getSeatNumberToPassengerMap(), item.getPassengerToSeatNumberMap(), item.getPassengerToSeatPositionMap(), null, null, item.getSchemeItems(), 0, false, 865, null), headerBlock, copy$default, null, false, 8, null), 15, null));
            trackSeatClickEvent(item.getClickEvent(), item.getPayloads());
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<FlightSeatsSchemeV2VI.State> fetchedModel) {
        String asyncData;
        FlightSeatsSchemeV2AsyncViewModel asyncViewModel;
        FlightSeatsSchemeV2VI copy$default;
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        FlightSeatsSchemeV2VI.State fetchedState = fetchedModel.getFetchedState();
        if (fetchedState instanceof FlightSeatsSchemeV2VI.State.Content) {
            FlightSeatsSchemeV2VI boundData = getBoundData();
            if (boundData == null || (copy$default = FlightSeatsSchemeV2VI.copy$default(boundData, 0L, null, null, false, fetchedState, 15, null)) == null) {
                return;
            }
            this.container.M().update(copy$default);
            return;
        }
        if (!(fetchedState instanceof FlightSeatsSchemeV2VI.State.Loading)) {
            throw new o();
        }
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2 = this.schemeContainerView;
        if (flightSchemeContainerViewV2 != null) {
            flightSchemeContainerViewV2.showShimmer();
        }
        FlightSeatsSchemeV2VI boundData2 = getBoundData();
        if (boundData2 == null || (asyncData = boundData2.getAsyncData()) == null || (asyncViewModel = getAsyncViewModel()) == null) {
            return;
        }
        asyncViewModel.fetchWidget(asyncData);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FlightSeatsSchemeV2VI boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        FlightSeatsSchemeV2VI boundData2 = getBoundData();
        EmptyStateV2VO emptyState = boundData2 != null ? boundData2.getEmptyState() : null;
        if (emptyState == null) {
            InterfaceC7851b.a.a(this.container.M(), null, null, null, null, 15);
            return;
        }
        this.container.M().update(FlightSeatsSchemeV2VI.copy$default(boundData, 0L, null, null, true, null, 23, null));
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2 = this.schemeContainerView;
        if (flightSchemeContainerViewV2 != null) {
            flightSchemeContainerViewV2.showEmptyState(emptyState);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2 = this.schemeContainerView;
        if (flightSchemeContainerViewV2 != null) {
            flightSchemeContainerViewV2.registerContentScrollListener();
        }
        setLiteralsRowView();
        observeFlows();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        FlightSeatsSchemeV2AsyncViewModel asyncViewModel = getAsyncViewModel();
        if (asyncViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(asyncViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2 = this.schemeContainerView;
        if (flightSchemeContainerViewV2 != null) {
            flightSchemeContainerViewV2.unregisterContentScrollListener();
        }
        removeLiteralsRowView();
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        ViewGroup viewGroup = this.composerStickyContainerView;
        if (viewGroup != null) {
            ViewExtKt.hide(viewGroup);
        }
        super.onViewOutOfVisibleBounds();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2 = this.schemeContainerView;
        if (flightSchemeContainerViewV2 != null) {
            ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(flightSchemeContainerViewV2, info, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlightSeatsSchemeV2VI item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof FlightSeatsSchemeV2Payload) {
            return;
        }
        super.bind((FlightSeatsSchemeV2BlockWidgetViewHolder) item, info, payload);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlightSeatsSchemeV2VI item, @NotNull l20.d info) {
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2;
        FlightSchemeContentRowV2 literalsRow;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Integer displayWidth = this.viewModel.getDisplayWidth();
        int i11 = getContext().getResources().getDisplayMetrics().widthPixels;
        if (displayWidth != null && displayWidth.intValue() != i11) {
            this.viewModel.setDisplayWidth(Integer.valueOf(i11));
            InterfaceC7851b.a.a(this.container.M(), null, null, null, null, 15);
        } else {
            this.viewModel.setDisplayWidth(Integer.valueOf(i11));
        }
        FlightSeatsSchemeV2VI.State state = item.getState();
        if (state instanceof FlightSeatsSchemeV2VI.State.Loading) {
            FlightSchemeContainerViewV2 flightSchemeContainerViewV22 = this.schemeContainerView;
            if (flightSchemeContainerViewV22 != null) {
                flightSchemeContainerViewV22.showShimmer();
            }
            FlightSeatsSchemeV2AsyncViewModel asyncViewModel = getAsyncViewModel();
            if (asyncViewModel != null) {
                asyncViewModel.fetchWidget(item.getAsyncData());
                return;
            }
            return;
        }
        if (state instanceof FlightSeatsSchemeV2VI.State.Content) {
            FlightSeatsSchemeV2VI.State.Content content = (FlightSeatsSchemeV2VI.State.Content) state;
            this.viewModel.setUpScheme(content);
            FlightSeatsSchemeV2HeaderBlockVI headerBlock = content.getHeaderBlock();
            if (headerBlock != null && (literalsRow = headerBlock.getLiteralsRow()) != null) {
                this.literalsRowView.bind(literalsRow);
            }
            int schemeWidth = content.getSchemeBlock().getSchemeWidth() + this.dp16;
            if (this.literalsRowView.getWidth() != schemeWidth) {
                FlightSchemeContentRowViewV2 flightSchemeContentRowViewV2 = this.literalsRowView;
                ViewGroup.LayoutParams layoutParams = flightSchemeContentRowViewV2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = schemeWidth;
                    flightSchemeContentRowViewV2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            List<FlightSeatsSchemeV2Item> schemeItems = content.getSchemeBlock().getSchemeItems();
            if (schemeItems != null) {
                FlightSchemeContainerViewV2 flightSchemeContainerViewV23 = this.schemeContainerView;
                if (flightSchemeContainerViewV23 != null) {
                    flightSchemeContainerViewV23.showContent(K.a(this), schemeItems);
                    return;
                }
                return;
            }
            if (content.getEmptyState() == null || (flightSchemeContainerViewV2 = this.schemeContainerView) == null) {
                return;
            }
            flightSchemeContainerViewV2.showEmptyState(content.getEmptyState());
            return;
        }
        throw new o();
    }
}
