package com.socure.docv.capturesdk.feature.orchestrator;

import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ModuleOrchestrator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "", "currentModule", "Lkotlinx/coroutines/flow/Flow;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getCurrentModule", "()Lkotlinx/coroutines/flow/Flow;", "onFinished", "Lkotlin/Result;", "submission", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "onFinished-gIAlu-s", "(Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "startSession-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ModuleOrchestrator {
    Flow<ModuleModel> getCurrentModule();

    /* renamed from: onFinished-gIAlu-s, reason: not valid java name */
    Object mo11539onFinishedgIAlus(ModuleSubmission moduleSubmission, Continuation<? super Result<? extends ModuleModel>> continuation);

    /* renamed from: startSession-IoAF18A, reason: not valid java name */
    Object mo11540startSessionIoAF18A(Continuation<? super Result<StartSessionModel>> continuation);
}
