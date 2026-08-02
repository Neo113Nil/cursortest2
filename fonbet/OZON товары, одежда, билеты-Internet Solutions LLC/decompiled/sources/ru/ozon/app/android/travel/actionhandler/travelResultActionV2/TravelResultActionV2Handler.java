package ru.ozon.app.android.travel.actionhandler.travelResultActionV2;

import Qj0.A0;
import Qj0.U;
import Sc.InterfaceC4008j;
import Tg.b;
import Vg.d;
import Vg.f;
import a00.C4911f;
import androidx.lifecycle.K;
import i10.l;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.travel.actionhandler.SupportedResultActionHandlers;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00180!j\u0002`#2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00020\u00182\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00180!j\u0002`#2\u0006\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u00103\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<²\u0006\u000e\u0010;\u001a\u0004\u0018\u00010:8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultActionV2/TravelResultActionV2Handler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;", "supportedResultActionHandlers", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/travel/actionhandler/travelResultActionV2/TrackableActions;", "trackableActions", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/travel/actionhandler/travelResultActionV2/TrackableActions;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Li10/l$a;", "getLoaderType", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Li10/l$a;", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "metrics", "", "widgetName", "", "trackPerformance", "(Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;Ljava/lang/String;)V", "LVg/f$a;", "widgetInfo", "Lk20/g;", "storage", "Ll10/b;", "controller", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "createActionHandler", "(LVg/f$a;Lk20/g;Ll10/b;)Lkotlin/jvm/functions/Function1;", "actionHandler", "atomAction", "handleAtomAction", "(Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/AtomAction;)V", "LTg/b;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/travel/actionhandler/travelResultActionV2/TrackableActions;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/B0;", "actionJob", "Lxe/B0;", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelResultActionV2Handler extends f {

    @NotNull
    private final String actionId;
    private B0 actionJob;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final SupportedResultActionHandlers supportedResultActionHandlers;

    @NotNull
    private final TrackableActions trackableActions;

    public TravelResultActionV2Handler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory, @NotNull SupportedResultActionHandlers supportedResultActionHandlers, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull TrackableActions trackableActions) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(supportedResultActionHandlers, "supportedResultActionHandlers");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(trackableActions, "trackableActions");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.supportedResultActionHandlers = supportedResultActionHandlers;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.trackableActions = trackableActions;
        this.actionId = "travelResultActionV2";
    }

    private final Function1<AtomAction, Unit> createActionHandler(f.a widgetInfo, C7475g storage, InterfaceC7851b controller) {
        return new ActionHandler.Builder(((RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(new C4911f(widgetInfo.a().e()), widgetInfo.b()), new TravelResultActionV2Handler$createActionHandler$1(widgetInfo), new TravelResultActionV2Handler$createActionHandler$2(widgetInfo), new TravelResultActionV2Handler$createActionHandler$3(widgetInfo)).customActionHandlers(new TravelResultActionV2Handler$createActionHandler$4(this)).onPreProcess(new TravelResultActionV2Handler$createActionHandler$5(controller)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.a getLoaderType(AtomAction.ComposerAction action) {
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("loaderType") : null;
        if (!Intrinsics.d(str, "overlay") && Intrinsics.d(str, "transparent")) {
            return new l.a.b(0L, null, 3);
        }
        return new l.a.C1079a(0L, null, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAtomAction(Function1<? super AtomAction, Unit> actionHandler, AtomAction atomAction) {
        actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationBarDelegate processWidgetAction$lambda$0(InterfaceC4008j<NotificationBarDelegate> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPerformance(MetricsResponse.Metrics metrics, String widgetName) {
        U trace;
        if (metrics == null || (trace = metrics.getTrace()) == null) {
            return;
        }
        U.p(trace, MetricType.TOTAL_TIME_END, 0L, false, 6);
        trace.n(new A0(widgetName), true);
        this.performanceTrackerDelegate.beginTrace(trace);
        this.performanceTrackerDelegate.endTrace(metrics.getUuid(), kotlin.collections.U.c());
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            Map<String, String> params = composerAction.getParams();
            boolean parseBoolean = Boolean.parseBoolean(params != null ? params.get("isSilentRefresh") : null);
            Map<String, String> params2 = composerAction.getParams();
            Boolean valueOf = (params2 == null || (str = params2.get("isActivityNotification")) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(str));
            C4911f a11 = widgetInfo.a();
            InterfaceC7851b composerController = ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerController();
            Function1<AtomAction, Unit> createActionHandler = createActionHandler(widgetInfo, widgetComponentStorage, composerController);
            InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new TravelResultActionV2Handler$processWidgetAction$notificationBarDelegate$2(valueOf, a11, createActionHandler));
            B0 b02 = this.actionJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.actionJob = C10727i.c(K.a(a11.g()), null, null, new TravelResultActionV2Handler$processWidgetAction$1(parseBoolean, composerController, this, action, widgetInfo, unsafeLazy, createActionHandler, null), 3);
        }
    }
}
