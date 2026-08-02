package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.HeaderUtils;
import com.socure.docv.capturesdk.models.StartSessionModel;
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

/* compiled from: ModulesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.network.repository.ModulesRepositoryImpl$startSession$result$1", f = "ModulesRepositoryImpl.kt", i = {}, l = {26, 29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ModulesRepositoryImpl$startSession$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends StartSessionModel>>, Object> {
    int label;
    final /* synthetic */ ModulesRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModulesRepositoryImpl$startSession$result$1(ModulesRepositoryImpl modulesRepositoryImpl, Continuation<? super ModulesRepositoryImpl$startSession$result$1> continuation) {
        super(2, continuation);
        this.this$0 = modulesRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModulesRepositoryImpl$startSession$result$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends StartSessionModel>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<StartSessionModel>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<StartSessionModel>> continuation) {
        return ((ModulesRepositoryImpl$startSession$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createFailure;
        Object m13470constructorimpl;
        StepUpRepository stepUpRepository;
        Mapper mapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            createFailure = ResultKt.createFailure(th);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            stepUpRepository = this.this$0.stepUpRepository;
            this.label = 1;
            createFailure = stepUpRepository.m11526startModulesSessiongIAlus(HeaderUtils.INSTANCE.getStepHeader(SessionManager.INSTANCE.getTransactionToken()), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m13470constructorimpl = Result.m13470constructorimpl((StartSessionModel) obj);
                return Result.m13469boximpl(m13470constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            createFailure = ((Result) obj).getValue();
        }
        ModulesRepositoryImpl modulesRepositoryImpl = this.this$0;
        if (Result.m13477isSuccessimpl(createFailure)) {
            Result.Companion companion2 = Result.INSTANCE;
            mapper = modulesRepositoryImpl.startSessionModelMapper;
            this.label = 2;
            obj = mapper.map((Mapper) createFailure, (Continuation) this);
        }
        m13470constructorimpl = Result.m13470constructorimpl(createFailure);
        return Result.m13469boximpl(m13470constructorimpl);
    }
}
