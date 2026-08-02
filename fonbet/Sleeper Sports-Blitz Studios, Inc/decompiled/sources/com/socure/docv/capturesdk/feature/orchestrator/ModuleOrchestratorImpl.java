package com.socure.docv.capturesdk.feature.orchestrator;

import com.socure.docv.capturesdk.common.analytics.EventManager;
import com.socure.docv.capturesdk.common.network.repository.ModulesRepository;
import com.socure.docv.capturesdk.core.storage.Cache;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: ModuleOrchestratorImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestratorImpl;", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "modulesRepository", "Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "cache", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "eventManager", "Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "(Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/socure/docv/capturesdk/core/storage/Cache;Lcom/socure/docv/capturesdk/common/analytics/EventManager;)V", "currentModule", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getCurrentModule", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "onFinished", "Lkotlin/Result;", "submission", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "onFinished-gIAlu-s", "(Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", "startSession-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleOrchestratorImpl implements ModuleOrchestrator {
    private final Cache<StartSessionModel> cache;
    private final MutableSharedFlow<ModuleModel> currentModule;
    private final CoroutineDispatcher dispatcher;
    private final EventManager eventManager;
    private final ModulesRepository modulesRepository;

    public ModuleOrchestratorImpl(ModulesRepository modulesRepository, CoroutineDispatcher dispatcher, Cache<StartSessionModel> cache, EventManager eventManager) {
        Intrinsics.checkNotNullParameter(modulesRepository, "modulesRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.modulesRepository = modulesRepository;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.eventManager = eventManager;
        this.currentModule = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator
    public MutableSharedFlow<ModuleModel> getCurrentModule() {
        return this.currentModule;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator
    /* renamed from: startSession-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11540startSessionIoAF18A(Continuation<? super Result<StartSessionModel>> continuation) {
        ModuleOrchestratorImpl$startSession$1 moduleOrchestratorImpl$startSession$1;
        int i;
        if (continuation instanceof ModuleOrchestratorImpl$startSession$1) {
            moduleOrchestratorImpl$startSession$1 = (ModuleOrchestratorImpl$startSession$1) continuation;
            if ((moduleOrchestratorImpl$startSession$1.label & Integer.MIN_VALUE) != 0) {
                moduleOrchestratorImpl$startSession$1.label -= Integer.MIN_VALUE;
                Object obj = moduleOrchestratorImpl$startSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moduleOrchestratorImpl$startSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.dispatcher;
                    ModuleOrchestratorImpl$startSession$2 moduleOrchestratorImpl$startSession$2 = new ModuleOrchestratorImpl$startSession$2(this, null);
                    moduleOrchestratorImpl$startSession$1.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, moduleOrchestratorImpl$startSession$2, moduleOrchestratorImpl$startSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        moduleOrchestratorImpl$startSession$1 = new ModuleOrchestratorImpl$startSession$1(this, continuation);
        Object obj2 = moduleOrchestratorImpl$startSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moduleOrchestratorImpl$startSession$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator
    /* renamed from: onFinished-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11539onFinishedgIAlus(ModuleSubmission moduleSubmission, Continuation<? super Result<? extends ModuleModel>> continuation) {
        ModuleOrchestratorImpl$onFinished$1 moduleOrchestratorImpl$onFinished$1;
        int i;
        if (continuation instanceof ModuleOrchestratorImpl$onFinished$1) {
            moduleOrchestratorImpl$onFinished$1 = (ModuleOrchestratorImpl$onFinished$1) continuation;
            if ((moduleOrchestratorImpl$onFinished$1.label & Integer.MIN_VALUE) != 0) {
                moduleOrchestratorImpl$onFinished$1.label -= Integer.MIN_VALUE;
                Object obj = moduleOrchestratorImpl$onFinished$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moduleOrchestratorImpl$onFinished$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.dispatcher;
                    ModuleOrchestratorImpl$onFinished$2 moduleOrchestratorImpl$onFinished$2 = new ModuleOrchestratorImpl$onFinished$2(this, moduleSubmission, null);
                    moduleOrchestratorImpl$onFinished$1.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, moduleOrchestratorImpl$onFinished$2, moduleOrchestratorImpl$onFinished$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        moduleOrchestratorImpl$onFinished$1 = new ModuleOrchestratorImpl$onFinished$1(this, continuation);
        Object obj2 = moduleOrchestratorImpl$onFinished$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moduleOrchestratorImpl$onFinished$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
