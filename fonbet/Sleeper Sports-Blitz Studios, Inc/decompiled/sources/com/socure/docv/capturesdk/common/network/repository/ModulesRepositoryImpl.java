package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: ModulesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepositoryImpl;", "Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "stepUpRepository", "Lcom/socure/docv/capturesdk/common/network/repository/StepUpRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "moduleMapper", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "startSessionModelMapper", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "(Lcom/socure/docv/capturesdk/common/network/repository/StepUpRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "startSession", "Lkotlin/Result;", "startSession-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitModule", "moduleId", "", "type", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "submitModule-0E7RQCE", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModulesRepositoryImpl implements ModulesRepository {
    private final CoroutineDispatcher dispatcher;
    private final Mapper<ModuleDataResponse, ModuleModel> moduleMapper;
    private final Mapper<ModuleDataResponse, StartSessionModel> startSessionModelMapper;
    private final StepUpRepository stepUpRepository;

    public ModulesRepositoryImpl(StepUpRepository stepUpRepository, CoroutineDispatcher dispatcher, Mapper<ModuleDataResponse, ModuleModel> moduleMapper, Mapper<ModuleDataResponse, StartSessionModel> startSessionModelMapper) {
        Intrinsics.checkNotNullParameter(stepUpRepository, "stepUpRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(moduleMapper, "moduleMapper");
        Intrinsics.checkNotNullParameter(startSessionModelMapper, "startSessionModelMapper");
        this.stepUpRepository = stepUpRepository;
        this.dispatcher = dispatcher;
        this.moduleMapper = moduleMapper;
        this.startSessionModelMapper = startSessionModelMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.socure.docv.capturesdk.common.network.repository.ModulesRepository
    /* renamed from: startSession-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11524startSessionIoAF18A(Continuation<? super Result<StartSessionModel>> continuation) {
        ModulesRepositoryImpl$startSession$1 modulesRepositoryImpl$startSession$1;
        int i;
        Object value;
        if (continuation instanceof ModulesRepositoryImpl$startSession$1) {
            modulesRepositoryImpl$startSession$1 = (ModulesRepositoryImpl$startSession$1) continuation;
            if ((modulesRepositoryImpl$startSession$1.label & Integer.MIN_VALUE) != 0) {
                modulesRepositoryImpl$startSession$1.label -= Integer.MIN_VALUE;
                Object obj = modulesRepositoryImpl$startSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = modulesRepositoryImpl$startSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.dispatcher;
                    ModulesRepositoryImpl$startSession$result$1 modulesRepositoryImpl$startSession$result$1 = new ModulesRepositoryImpl$startSession$result$1(this, null);
                    modulesRepositoryImpl$startSession$1.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, modulesRepositoryImpl$startSession$result$1, modulesRepositoryImpl$startSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.m13473exceptionOrNullimpl(value) instanceof UnknownHostException) {
                    return value;
                }
                Result.Companion companion = Result.INSTANCE;
                return Result.m13470constructorimpl(ResultKt.createFailure(new SocureApiError(SocureDocVError.NO_INTERNET_CONNECTION)));
            }
        }
        modulesRepositoryImpl$startSession$1 = new ModulesRepositoryImpl$startSession$1(this, continuation);
        Object obj2 = modulesRepositoryImpl$startSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = modulesRepositoryImpl$startSession$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (Result.m13473exceptionOrNullimpl(value) instanceof UnknownHostException) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.socure.docv.capturesdk.common.network.repository.ModulesRepository
    /* renamed from: submitModule-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11525submitModule0E7RQCE(String str, ModuleSubmission moduleSubmission, Continuation<? super Result<? extends ModuleModel>> continuation) {
        ModulesRepositoryImpl$submitModule$1 modulesRepositoryImpl$submitModule$1;
        int i;
        if (continuation instanceof ModulesRepositoryImpl$submitModule$1) {
            modulesRepositoryImpl$submitModule$1 = (ModulesRepositoryImpl$submitModule$1) continuation;
            if ((modulesRepositoryImpl$submitModule$1.label & Integer.MIN_VALUE) != 0) {
                modulesRepositoryImpl$submitModule$1.label -= Integer.MIN_VALUE;
                Object obj = modulesRepositoryImpl$submitModule$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = modulesRepositoryImpl$submitModule$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.dispatcher;
                    ModulesRepositoryImpl$submitModule$2 modulesRepositoryImpl$submitModule$2 = new ModulesRepositoryImpl$submitModule$2(moduleSubmission, this, str, null);
                    modulesRepositoryImpl$submitModule$1.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, modulesRepositoryImpl$submitModule$2, modulesRepositoryImpl$submitModule$1);
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
        modulesRepositoryImpl$submitModule$1 = new ModulesRepositoryImpl$submitModule$1(this, continuation);
        Object obj2 = modulesRepositoryImpl$submitModule$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = modulesRepositoryImpl$submitModule$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
