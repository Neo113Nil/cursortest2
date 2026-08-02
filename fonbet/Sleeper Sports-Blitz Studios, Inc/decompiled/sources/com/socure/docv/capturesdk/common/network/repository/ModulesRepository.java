package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: ModulesRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "", "startSession", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "startSession-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitModule", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "moduleId", "", "type", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "submitModule-0E7RQCE", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ModulesRepository {
    /* renamed from: startSession-IoAF18A, reason: not valid java name */
    Object mo11524startSessionIoAF18A(Continuation<? super Result<StartSessionModel>> continuation);

    /* renamed from: submitModule-0E7RQCE, reason: not valid java name */
    Object mo11525submitModule0E7RQCE(String str, ModuleSubmission moduleSubmission, Continuation<? super Result<? extends ModuleModel>> continuation);
}
