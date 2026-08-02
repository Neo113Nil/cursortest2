package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader;

import Ae.w0;
import Lm0.a;
import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.data.AviaSkeletonLoaderResponse;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewModel$performAction$1", f = "AviaSkeletonLoaderWidgetViewModel.kt", l = {77, 46, 60, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSkeletonLoaderWidgetViewModel$performAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ c $trackingData;
    Object L$0;
    int label;
    final /* synthetic */ AviaSkeletonLoaderWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSkeletonLoaderWidgetViewModel$performAction$1(AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel, AtomAction atomAction, c cVar, d<? super AviaSkeletonLoaderWidgetViewModel$performAction$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaSkeletonLoaderWidgetViewModel;
        this.$action = atomAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AviaSkeletonLoaderWidgetViewModel$performAction$1(this.this$0, this.$action, this.$trackingData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
    
        if (r11.emit(r3, r10) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
    
        if (r11.emit((ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewModel.ActionResult) r0, r10) == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel;
        ActionV2Repository actionV2Repository;
        w0 w0Var3;
        Object obj2;
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
            aviaSkeletonLoaderWidgetViewModel = this.this$0;
            AtomAction atomAction = this.$action;
            c cVar = this.$trackingData;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = aviaSkeletonLoaderWidgetViewModel.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) atomAction).getParams(), ((AtomAction.ComposerAction) atomAction).getActionName(), true);
            this.L$0 = aviaSkeletonLoaderWidgetViewModel;
            this.label = 1;
            obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, AviaSkeletonLoaderResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    a11 = this.L$0;
                    s.b(obj);
                    AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel2 = this.this$0;
                    b11 = r.b(a11);
                    if (b11 != null) {
                        if (b11 instanceof ActionV2RepositoryError) {
                            TravelActionLogger.INSTANCE.logException(b11, "travel_aviaSkeletonLoader_action");
                        } else {
                            LoggerExtKt.sendNonFatal$default(b11, null, "travel_aviaSkeletonLoader_action", null, 10, null);
                        }
                        BuildUtils buildUtils = BuildUtils.INSTANCE;
                        if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                            a.b bVar = Lm0.a.f17149a;
                            bVar.b("travel_aviaSkeletonLoader_action");
                            bVar.e(b11);
                        }
                        w0Var2 = aviaSkeletonLoaderWidgetViewModel2._actionFlow;
                        AviaSkeletonLoaderWidgetViewModel.ActionResult.Error error = AviaSkeletonLoaderWidgetViewModel.ActionResult.Error.INSTANCE;
                        this.L$0 = a11;
                        this.label = 4;
                    }
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                a11 = (ActionV2Response) obj2;
                r.Companion companion3 = r.INSTANCE;
                if (!(a11 instanceof r.b)) {
                    try {
                        actionV2Response = (ActionV2Response) a11;
                        ActionV2ExtensionsKt.ensureSuccessful(actionV2Response);
                        data = actionV2Response.getData();
                    } catch (Throwable th3) {
                        r.Companion companion4 = r.INSTANCE;
                        a12 = s.a(th3);
                    }
                    if (data == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    AviaSkeletonLoaderResponse aviaSkeletonLoaderResponse = (AviaSkeletonLoaderResponse) data;
                    if (aviaSkeletonLoaderResponse.getRepeatRequest()) {
                        a12 = AviaSkeletonLoaderWidgetViewModel.ActionResult.RepeatRequest.INSTANCE;
                    } else {
                        if (aviaSkeletonLoaderResponse.getRefreshAction() == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        a12 = new AviaSkeletonLoaderWidgetViewModel.ActionResult.Action(AtomActionMapperKt.toAtomAction(aviaSkeletonLoaderResponse.getRefreshAction(), actionV2Response.getTrackingInfo()));
                    }
                    a11 = a12;
                }
                AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel3 = this.this$0;
                if (!(a11 instanceof r.b)) {
                    w0Var = aviaSkeletonLoaderWidgetViewModel3._actionFlow;
                    this.L$0 = a11;
                    this.label = 3;
                }
                AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel22 = this.this$0;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            aviaSkeletonLoaderWidgetViewModel = (AviaSkeletonLoaderWidgetViewModel) this.L$0;
            s.b(obj);
        }
        w0Var3 = aviaSkeletonLoaderWidgetViewModel._metricsFlow;
        MetricsResponse.Metrics metrics = ((ActionV2Response) obj).getMetrics();
        this.L$0 = obj;
        this.label = 2;
        if (w0Var3.emit(metrics, this) == aVar) {
            return aVar;
        }
        obj2 = obj;
        a11 = (ActionV2Response) obj2;
        r.Companion companion32 = r.INSTANCE;
        if (!(a11 instanceof r.b)) {
        }
        AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel32 = this.this$0;
        if (!(a11 instanceof r.b)) {
        }
        AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel222 = this.this$0;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AviaSkeletonLoaderWidgetViewModel$performAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
