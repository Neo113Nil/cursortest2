package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.MetricsManager;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.models.LandingModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.objectweb.asm.Opcodes;

/* compiled from: OrchestratorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$startSession$1", f = "OrchestratorViewModel.kt", i = {1}, l = {Opcodes.NEW, Opcodes.IFNULL, 200, 201}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
/* loaded from: classes8.dex */
final class OrchestratorViewModel$startSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OrchestratorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrchestratorViewModel$startSession$1(OrchestratorViewModel orchestratorViewModel, Continuation<? super OrchestratorViewModel$startSession$1> continuation) {
        super(2, continuation);
        this.this$0 = orchestratorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrchestratorViewModel$startSession$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrchestratorViewModel$startSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r8.invoke(r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrchestratorActivityComponent orchestratorActivityComponent;
        Object mo11540startSessionIoAF18A;
        Object obj2;
        OrchestratorViewModel orchestratorViewModel;
        StartSessionModel startSessionModel;
        MetricsManager metricManager;
        OrchestratorActivityComponent orchestratorActivityComponent2;
        OrchestratorActivityComponent orchestratorActivityComponent3;
        OrchestratorViewModel orchestratorViewModel2;
        Object obj3;
        OrchestratorActivityComponent orchestratorActivityComponent4;
        OnModuleCompletedUseCase onModuleCompletedUseCase;
        Object obj4;
        Throwable m13473exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            orchestratorActivityComponent = this.this$0.dependencyGraph;
            this.label = 1;
            mo11540startSessionIoAF18A = orchestratorActivityComponent.getOrchestratorModuleOrchestrator().mo11540startSessionIoAF18A(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    startSessionModel = (StartSessionModel) this.L$2;
                    OrchestratorViewModel orchestratorViewModel3 = (OrchestratorViewModel) this.L$1;
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    orchestratorViewModel = orchestratorViewModel3;
                    if (startSessionModel.getNextModule() instanceof LandingModuleModel) {
                        orchestratorActivityComponent3 = orchestratorViewModel.dependencyGraph;
                        ModuleOrchestrator orchestratorModuleOrchestrator = orchestratorActivityComponent3.getOrchestratorModuleOrchestrator();
                        ModuleSubmission.Landing landing = ModuleSubmission.Landing.INSTANCE;
                        this.L$0 = obj2;
                        this.L$1 = orchestratorViewModel;
                        this.L$2 = null;
                        this.label = 3;
                        if (orchestratorModuleOrchestrator.mo11539onFinishedgIAlus(landing, this) != coroutine_suspended) {
                            orchestratorViewModel2 = orchestratorViewModel;
                            obj3 = obj2;
                            orchestratorActivityComponent4 = orchestratorViewModel2.dependencyGraph;
                            onModuleCompletedUseCase = orchestratorActivityComponent4.getOnModuleCompletedUseCase();
                            this.L$0 = obj3;
                            this.L$1 = null;
                            this.label = 4;
                            if (onModuleCompletedUseCase.invoke(this) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    LoggerKt.logD("SDLT_OVM", "onSuccess called");
                    OrchestratorViewModel orchestratorViewModel4 = this.this$0;
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(obj2);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    orchestratorViewModel2 = (OrchestratorViewModel) this.L$1;
                    obj3 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
                    orchestratorActivityComponent4 = orchestratorViewModel2.dependencyGraph;
                    onModuleCompletedUseCase = orchestratorActivityComponent4.getOnModuleCompletedUseCase();
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.label = 4;
                    if (onModuleCompletedUseCase.invoke(this) != coroutine_suspended) {
                        obj4 = obj3;
                        obj2 = obj4;
                        LoggerKt.logD("SDLT_OVM", "onSuccess called");
                        OrchestratorViewModel orchestratorViewModel42 = this.this$0;
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(obj2);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj4 = this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj4;
                LoggerKt.logD("SDLT_OVM", "onSuccess called");
                OrchestratorViewModel orchestratorViewModel422 = this.this$0;
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(obj2);
                if (m13473exceptionOrNullimpl != null) {
                    LoggerKt.logD("SDLT_OVM", "onFailure called - " + m13473exceptionOrNullimpl);
                    if (m13473exceptionOrNullimpl instanceof SocureApiError) {
                        SocureApiError socureApiError = (SocureApiError) m13473exceptionOrNullimpl;
                        orchestratorViewModel422.getError().postValue(new IOrchestratorViewModel.Error.ApiError(socureApiError.getSocureDocVError()));
                        orchestratorViewModel422.sendReqFailEvent(socureApiError.getSocureDocVError());
                    } else {
                        orchestratorViewModel422.getError().postValue(IOrchestratorViewModel.Error.FailedToStartSession.INSTANCE);
                        orchestratorViewModel422.sendReqFailEvent(SocureDocVError.UNKNOWN);
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            mo11540startSessionIoAF18A = ((Result) obj).getValue();
        }
        obj2 = mo11540startSessionIoAF18A;
        orchestratorViewModel = this.this$0;
        if (Result.m13477isSuccessimpl(obj2)) {
            startSessionModel = (StartSessionModel) obj2;
            orchestratorViewModel.getOnSessionStarted().postValue(startSessionModel);
            metricManager = orchestratorViewModel.getMetricManager();
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(ScanType.LICENSE_FRONT);
            createListBuilder.add(ScanType.LICENSE_BACK);
            createListBuilder.add(ScanType.PASSPORT);
            createListBuilder.add(ScanType.SELFIE);
            metricManager.setDeviceMetrics(CollectionsKt.build(createListBuilder));
            orchestratorActivityComponent2 = orchestratorViewModel.dependencyGraph;
            OnModuleCompletedUseCase onModuleCompletedUseCase2 = orchestratorActivityComponent2.getOnModuleCompletedUseCase();
            this.L$0 = obj2;
            this.L$1 = orchestratorViewModel;
            this.L$2 = startSessionModel;
            this.label = 2;
        }
        OrchestratorViewModel orchestratorViewModel4222 = this.this$0;
        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(obj2);
        if (m13473exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
