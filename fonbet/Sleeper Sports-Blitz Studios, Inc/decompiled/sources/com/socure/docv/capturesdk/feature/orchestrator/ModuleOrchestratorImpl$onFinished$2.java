package com.socure.docv.capturesdk.feature.orchestrator;

import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.common.network.repository.ModulesRepository;
import com.socure.docv.capturesdk.common.network.repository.StepUpRepositoryKt;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.models.ErrorModule;
import com.socure.docv.capturesdk.models.ModuleModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: ModuleOrchestratorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestratorImpl$onFinished$2", f = "ModuleOrchestratorImpl.kt", i = {}, l = {53, 55, 76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ModuleOrchestratorImpl$onFinished$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ModuleModel>>, Object> {
    final /* synthetic */ ModuleSubmission $submission;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ModuleOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModuleOrchestratorImpl$onFinished$2(ModuleOrchestratorImpl moduleOrchestratorImpl, ModuleSubmission moduleSubmission, Continuation<? super ModuleOrchestratorImpl$onFinished$2> continuation) {
        super(2, continuation);
        this.this$0 = moduleOrchestratorImpl;
        this.$submission = moduleSubmission;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModuleOrchestratorImpl$onFinished$2 moduleOrchestratorImpl$onFinished$2 = new ModuleOrchestratorImpl$onFinished$2(this.this$0, this.$submission, continuation);
        moduleOrchestratorImpl$onFinished$2.L$0 = obj;
        return moduleOrchestratorImpl$onFinished$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ModuleModel>> continuation) {
        return ((ModuleOrchestratorImpl$onFinished$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createFailure;
        Object m13470constructorimpl;
        ModulesRepository modulesRepository;
        Object mo11525submitModule0E7RQCE;
        Throwable m13473exceptionOrNullimpl;
        Object m13470constructorimpl2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                createFailure = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            createFailure = ResultKt.createFailure(th2);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ModuleOrchestratorImpl moduleOrchestratorImpl = this.this$0;
            Result.Companion companion3 = Result.INSTANCE;
            MutableSharedFlow<ModuleModel> currentModule = moduleOrchestratorImpl.getCurrentModule();
            this.label = 1;
            obj = FlowKt.first(currentModule, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    m13470constructorimpl2 = obj2;
                    return Result.m13469boximpl(m13470constructorimpl2);
                }
                ResultKt.throwOnFailure(obj);
                mo11525submitModule0E7RQCE = ((Result) obj).getValue();
                m13470constructorimpl = Result.m13470constructorimpl(Result.m13469boximpl(mo11525submitModule0E7RQCE));
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl == null) {
                    m13470constructorimpl2 = ((Result) m13470constructorimpl).getValue();
                    ModuleModel moduleModel = (ModuleModel) (Result.m13476isFailureimpl(m13470constructorimpl2) ? null : m13470constructorimpl2);
                    if (moduleModel instanceof ErrorModule) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(new SocureApiError(StepUpRepositoryKt.codeToError((int) ((ErrorModule) moduleModel).getErrorCode()))));
                    }
                } else {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(m13473exceptionOrNullimpl));
                }
                ModuleOrchestratorImpl moduleOrchestratorImpl2 = this.this$0;
                if (Result.m13477isSuccessimpl(m13470constructorimpl2)) {
                    ModuleModel moduleModel2 = (ModuleModel) m13470constructorimpl2;
                    if (moduleModel2.getSessionToken() != null) {
                        SessionManager.INSTANCE.setSessionToken(moduleModel2.getSessionToken());
                    }
                    MutableSharedFlow<ModuleModel> currentModule2 = moduleOrchestratorImpl2.getCurrentModule();
                    this.L$0 = m13470constructorimpl2;
                    this.label = 3;
                    if (currentModule2.emit(moduleModel2, this) != coroutine_suspended) {
                        obj2 = m13470constructorimpl2;
                        m13470constructorimpl2 = obj2;
                    }
                    return coroutine_suspended;
                }
                return Result.m13469boximpl(m13470constructorimpl2);
            }
            ResultKt.throwOnFailure(obj);
        }
        createFailure = Result.m13470constructorimpl(((ModuleModel) obj).getModuleId());
        ModuleOrchestratorImpl moduleOrchestratorImpl3 = this.this$0;
        ModuleSubmission moduleSubmission = this.$submission;
        if (Result.m13477isSuccessimpl(createFailure)) {
            Result.Companion companion6 = Result.INSTANCE;
            modulesRepository = moduleOrchestratorImpl3.modulesRepository;
            this.label = 2;
            mo11525submitModule0E7RQCE = modulesRepository.mo11525submitModule0E7RQCE((String) createFailure, moduleSubmission, this);
            if (mo11525submitModule0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            m13470constructorimpl = Result.m13470constructorimpl(Result.m13469boximpl(mo11525submitModule0E7RQCE));
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
            }
            ModuleOrchestratorImpl moduleOrchestratorImpl22 = this.this$0;
            if (Result.m13477isSuccessimpl(m13470constructorimpl2)) {
            }
            return Result.m13469boximpl(m13470constructorimpl2);
        }
        m13470constructorimpl = Result.m13470constructorimpl(createFailure);
        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
        if (m13473exceptionOrNullimpl == null) {
        }
        ModuleOrchestratorImpl moduleOrchestratorImpl222 = this.this$0;
        if (Result.m13477isSuccessimpl(m13470constructorimpl2)) {
        }
        return Result.m13469boximpl(m13470constructorimpl2);
    }
}
