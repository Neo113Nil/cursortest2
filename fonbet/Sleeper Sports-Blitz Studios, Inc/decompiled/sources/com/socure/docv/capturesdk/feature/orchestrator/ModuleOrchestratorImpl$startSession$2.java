package com.socure.docv.capturesdk.feature.orchestrator;

import com.socure.docv.capturesdk.common.analytics.EventManager;
import com.socure.docv.capturesdk.common.network.repository.ModulesRepository;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.core.storage.Cache;
import com.socure.docv.capturesdk.models.EnvironmentModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModuleOrchestratorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestratorImpl$startSession$2", f = "ModuleOrchestratorImpl.kt", i = {1}, l = {29, 42}, m = "invokeSuspend", n = {"model"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ModuleOrchestratorImpl$startSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends StartSessionModel>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ModuleOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModuleOrchestratorImpl$startSession$2(ModuleOrchestratorImpl moduleOrchestratorImpl, Continuation<? super ModuleOrchestratorImpl$startSession$2> continuation) {
        super(2, continuation);
        this.this$0 = moduleOrchestratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleOrchestratorImpl$startSession$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends StartSessionModel>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<StartSessionModel>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<StartSessionModel>> continuation) {
        return ((ModuleOrchestratorImpl$startSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        if (r11 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ModulesRepository modulesRepository;
        Object mo11524startSessionIoAF18A;
        Object m13470constructorimpl;
        Cache cache;
        EventManager eventManager;
        StartSessionModel startSessionModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            modulesRepository = this.this$0.modulesRepository;
            this.label = 1;
            mo11524startSessionIoAF18A = modulesRepository.mo11524startSessionIoAF18A(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                startSessionModel = (StartSessionModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(startSessionModel);
                return Result.m13469boximpl(m13470constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            mo11524startSessionIoAF18A = ((Result) obj).getValue();
        }
        if (Result.m13477isSuccessimpl(mo11524startSessionIoAF18A)) {
            ResultKt.throwOnFailure(mo11524startSessionIoAF18A);
            StartSessionModel startSessionModel2 = (StartSessionModel) mo11524startSessionIoAF18A;
            cache = this.this$0.cache;
            cache.set(startSessionModel2);
            SessionManager.INSTANCE.setSessionToken(startSessionModel2.getSessionToken());
            eventManager = this.this$0.eventManager;
            String transactionToken = SessionManager.INSTANCE.getTransactionToken();
            String eventId = startSessionModel2.getGlobalConfig().getEventId();
            Boolean boxBoolean = Boxing.boxBoolean(false);
            Integer accountId = startSessionModel2.getGlobalConfig().getAccountId();
            EnvironmentModel environment = startSessionModel2.getGlobalConfig().getEnvironment();
            eventManager.updateSessionData(transactionToken, eventId, boxBoolean, accountId, environment != null ? environment.getName() : null, startSessionModel2.getGlobalConfig().getLanguage());
            this.L$0 = startSessionModel2;
            this.label = 2;
            if (this.this$0.getCurrentModule().emit(startSessionModel2.getNextModule(), this) != coroutine_suspended) {
                startSessionModel = startSessionModel2;
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(startSessionModel);
                return Result.m13469boximpl(m13470constructorimpl);
            }
            return coroutine_suspended;
        }
        Result.Companion companion3 = Result.INSTANCE;
        RuntimeException m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(mo11524startSessionIoAF18A);
        if (m13473exceptionOrNullimpl == null) {
            m13473exceptionOrNullimpl = new RuntimeException();
        }
        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(m13473exceptionOrNullimpl));
        return Result.m13469boximpl(m13470constructorimpl);
    }
}
