package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Ae.w0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import i10.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2ViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2ViewModel$onFindTicketsClicked$1", f = "PricesHistogramV2ViewModel.kt", l = {370}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PricesHistogramV2ViewModel$onFindTicketsClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ PricesHistogramV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramV2ViewModel$onFindTicketsClicked$1(PricesHistogramV2ViewModel pricesHistogramV2ViewModel, Map<String, String> map, String str, d<? super PricesHistogramV2ViewModel$onFindTicketsClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = pricesHistogramV2ViewModel;
        this.$params = map;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PricesHistogramV2ViewModel$onFindTicketsClicked$1(this.this$0, this.$params, this.$actionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        InterfaceC7851b interfaceC7851b;
        w0 w0Var;
        InterfaceC7851b interfaceC7851b2;
        w0 w0Var2;
        InterfaceC7851b interfaceC7851b3;
        Map provideRequestBody;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC7851b3 = this.this$0.controller;
                interfaceC7851b3.e(new l.a.C1079a(0L, null, 3));
                provideRequestBody = this.this$0.provideRequestBody();
                LinkedHashMap u11 = U.u(provideRequestBody);
                Map<String, String> map = this.$params;
                if (map != null) {
                    u11.putAll(map);
                }
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel = this.this$0;
                String str = this.$actionName;
                r.Companion companion = r.INSTANCE;
                actionV2Repository = pricesHistogramV2ViewModel.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(u11, str, true);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, TravelCommonActionResponse.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (!(a11 instanceof r.b)) {
            try {
                ActionV2Response actionV2Response = (ActionV2Response) a11;
                Object data = actionV2Response.getData();
                if (data == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                a11 = AtomActionMapperKt.toAtomAction(((TravelCommonActionResponse) data).getAction(), actionV2Response.getTrackingInfo());
            } catch (Throwable th3) {
                r.Companion companion4 = r.INSTANCE;
                a11 = s.a(th3);
            }
        }
        PricesHistogramV2ViewModel pricesHistogramV2ViewModel2 = this.this$0;
        if (!(a11 instanceof r.b)) {
            interfaceC7851b2 = pricesHistogramV2ViewModel2.controller;
            interfaceC7851b2.hideLoader();
            w0Var2 = pricesHistogramV2ViewModel2.actionLiveData;
            w0Var2.tryEmit(new PricesHistogramV2ViewModel.Action.Success((AtomAction) a11));
        }
        PricesHistogramV2ViewModel pricesHistogramV2ViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            if (b11 instanceof ActionV2RepositoryError) {
                TravelActionLogger.INSTANCE.logException(b11, "travel_pricesHistogram2_action");
            } else {
                LoggerExtKt.sendNonFatal$default(b11, null, "travel_pricesHistogram2_action", null, 10, null);
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b("travel_pricesHistogram2_action");
                bVar.e(b11);
            }
            interfaceC7851b = pricesHistogramV2ViewModel3.controller;
            interfaceC7851b.hideLoader();
            w0Var = pricesHistogramV2ViewModel3.actionLiveData;
            w0Var.tryEmit(PricesHistogramV2ViewModel.Action.Error.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PricesHistogramV2ViewModel$onFindTicketsClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
