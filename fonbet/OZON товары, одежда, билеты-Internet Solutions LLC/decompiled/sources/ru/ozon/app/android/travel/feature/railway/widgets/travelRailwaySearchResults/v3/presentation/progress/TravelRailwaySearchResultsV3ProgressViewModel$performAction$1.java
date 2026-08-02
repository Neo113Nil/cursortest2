package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress;

import Ae.w0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressViewModel$performAction$1", f = "TravelRailwaySearchResultsV3ProgressViewModel.kt", l = {75, 50, 58, 62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV3ProgressViewModel$performAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $params;
    Object L$0;
    int label;
    final /* synthetic */ TravelRailwaySearchResultsV3ProgressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV3ProgressViewModel$performAction$1(TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel, Map<String, String> map, String str, d<? super TravelRailwaySearchResultsV3ProgressViewModel$performAction$1> dVar) {
        super(2, dVar);
        this.this$0 = travelRailwaySearchResultsV3ProgressViewModel;
        this.$params = map;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelRailwaySearchResultsV3ProgressViewModel$performAction$1(this.this$0, this.$params, this.$actionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (r10.emit(r3, r9) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r10.emit(r5, r9) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object a12;
        ActionV2Response actionV2Response;
        Object data;
        w0 w0Var;
        Throwable b11;
        w0 w0Var2;
        TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel;
        ActionV2Repository actionV2Repository;
        w0 w0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            travelRailwaySearchResultsV3ProgressViewModel = this.this$0;
            Map<String, String> map = this.$params;
            String str = this.$actionName;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = travelRailwaySearchResultsV3ProgressViewModel.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(map, str, true);
            this.L$0 = travelRailwaySearchResultsV3ProgressViewModel;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, TravelCommonActionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    a11 = (ActionV2Response) this.L$0;
                    s.b(obj);
                    r.Companion companion3 = r.INSTANCE;
                    if (!(a11 instanceof r.b)) {
                        try {
                            actionV2Response = (ActionV2Response) a11;
                            data = actionV2Response.getData();
                        } catch (Throwable th3) {
                            r.Companion companion4 = r.INSTANCE;
                            a12 = s.a(th3);
                        }
                        if (data == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        a12 = AtomActionMapperKt.toAtomAction(((TravelCommonActionResponse) data).getAction(), actionV2Response.getTrackingInfo());
                        a11 = a12;
                    }
                    TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel2 = this.this$0;
                    if (!(a11 instanceof r.b)) {
                        w0Var = travelRailwaySearchResultsV3ProgressViewModel2._actionFlow;
                        TravelRailwaySearchResultsV3ProgressViewModel.Action.Success success = new TravelRailwaySearchResultsV3ProgressViewModel.Action.Success((AtomAction) a11);
                        this.L$0 = a11;
                        this.label = 3;
                    }
                    TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel3 = this.this$0;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                a11 = this.L$0;
                s.b(obj);
                TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel32 = this.this$0;
                b11 = r.b(a11);
                if (b11 != null) {
                    if (b11 instanceof ActionV2RepositoryError) {
                        TravelActionLogger.INSTANCE.logException(b11, "travel_travelRailwaySearchResults3_action");
                    } else {
                        LoggerExtKt.sendNonFatal$default(b11, null, "travel_travelRailwaySearchResults3_action", null, 10, null);
                    }
                    BuildUtils buildUtils = BuildUtils.INSTANCE;
                    if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("travel_travelRailwaySearchResults3_action");
                        bVar.e(b11);
                    }
                    w0Var2 = travelRailwaySearchResultsV3ProgressViewModel32._actionFlow;
                    TravelRailwaySearchResultsV3ProgressViewModel.Action.Error error = TravelRailwaySearchResultsV3ProgressViewModel.Action.Error.INSTANCE;
                    this.L$0 = a11;
                    this.label = 4;
                }
                return Unit.f71690a;
            }
            travelRailwaySearchResultsV3ProgressViewModel = (TravelRailwaySearchResultsV3ProgressViewModel) this.L$0;
            s.b(obj);
        }
        ActionV2Response ensureSuccessful = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
        w0Var3 = travelRailwaySearchResultsV3ProgressViewModel._metricsFlow;
        MetricsResponse.Metrics metrics = ensureSuccessful.getMetrics();
        this.L$0 = ensureSuccessful;
        this.label = 2;
        if (w0Var3.emit(metrics, this) == aVar) {
            return aVar;
        }
        a11 = ensureSuccessful;
        r.Companion companion32 = r.INSTANCE;
        if (!(a11 instanceof r.b)) {
        }
        TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel22 = this.this$0;
        if (!(a11 instanceof r.b)) {
        }
        TravelRailwaySearchResultsV3ProgressViewModel travelRailwaySearchResultsV3ProgressViewModel322 = this.this$0;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelRailwaySearchResultsV3ProgressViewModel$performAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
