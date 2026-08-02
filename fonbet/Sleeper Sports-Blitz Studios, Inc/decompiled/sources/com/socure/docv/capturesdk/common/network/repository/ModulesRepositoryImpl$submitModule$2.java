package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.models.FinishedModuleModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModulesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.network.repository.ModulesRepositoryImpl$submitModule$2", f = "ModulesRepositoryImpl.kt", i = {}, l = {49, 53, 61, 65, 73, 77, 85, 93, 97, 105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ModulesRepositoryImpl$submitModule$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ModuleModel>>, Object> {
    final /* synthetic */ String $moduleId;
    final /* synthetic */ ModuleSubmission $type;
    int label;
    final /* synthetic */ ModulesRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModulesRepositoryImpl$submitModule$2(ModuleSubmission moduleSubmission, ModulesRepositoryImpl modulesRepositoryImpl, String str, Continuation<? super ModulesRepositoryImpl$submitModule$2> continuation) {
        super(2, continuation);
        this.$type = moduleSubmission;
        this.this$0 = modulesRepositoryImpl;
        this.$moduleId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModulesRepositoryImpl$submitModule$2(this.$type, this.this$0, this.$moduleId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ModuleModel>> continuation) {
        return ((ModulesRepositoryImpl$submitModule$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01b5, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015d, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0187, code lost:
    
        if (r7 == r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a5 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0011, B:8:0x01b8, B:15:0x01a5), top: B:2:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createFailure;
        Object m13470constructorimpl;
        StepUpRepository stepUpRepository;
        StepUpRepository stepUpRepository2;
        StepUpRepository stepUpRepository3;
        StepUpRepository stepUpRepository4;
        StepUpRepository stepUpRepository5;
        StepUpRepository stepUpRepository6;
        StepUpRepository stepUpRepository7;
        StepUpRepository stepUpRepository8;
        StepUpRepository stepUpRepository9;
        Mapper mapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            createFailure = ResultKt.createFailure(th);
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(this.$type, ModuleSubmission.Finished.INSTANCE)) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(FinishedModuleModel.INSTANCE);
                    return Result.m13469boximpl(m13470constructorimpl);
                }
                ModuleSubmission moduleSubmission = this.$type;
                if (moduleSubmission instanceof ModuleSubmission.Landing) {
                    stepUpRepository9 = this.this$0.stepUpRepository;
                    this.label = 1;
                    createFailure = stepUpRepository9.m11531submitLandinggIAlus(this.$moduleId, this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.BackID) {
                    stepUpRepository8 = this.this$0.stepUpRepository;
                    this.label = 2;
                    createFailure = stepUpRepository8.m11527submitBackModuleBWLJW6A(this.$moduleId, ((ModuleSubmission.BackID) this.$type).getDocumentBody(), ((ModuleSubmission.BackID) this.$type).getMetricsData(), this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.Consent) {
                    stepUpRepository7 = this.this$0.stepUpRepository;
                    this.label = 3;
                    createFailure = stepUpRepository7.m11528submitConsentModule0E7RQCE(this.$moduleId, ((ModuleSubmission.Consent) this.$type).getAccepted(), this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.FrontID) {
                    stepUpRepository6 = this.this$0.stepUpRepository;
                    this.label = 4;
                    createFailure = stepUpRepository6.m11529submitFrontModuleBWLJW6A(this.$moduleId, ((ModuleSubmission.FrontID) this.$type).getDocumentBody(), ((ModuleSubmission.FrontID) this.$type).getMetricsData(), this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.IDSelection) {
                    stepUpRepository5 = this.this$0.stepUpRepository;
                    this.label = 5;
                    createFailure = stepUpRepository5.m11530submitIDSelectionModule0E7RQCE(this.$moduleId, ((ModuleSubmission.IDSelection) this.$type).getType().getValue(), this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.Passport) {
                    stepUpRepository4 = this.this$0.stepUpRepository;
                    this.label = 6;
                    createFailure = stepUpRepository4.m11532submitPassportModuleBWLJW6A(this.$moduleId, ((ModuleSubmission.Passport) this.$type).getDocumentBody(), ((ModuleSubmission.Passport) this.$type).getMetricsData(), this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.Selfie) {
                    stepUpRepository3 = this.this$0.stepUpRepository;
                    this.label = 7;
                    createFailure = stepUpRepository3.m11533submitSelfieModuleBWLJW6A(this.$moduleId, ((ModuleSubmission.Selfie) this.$type).getDocumentBody(), ((ModuleSubmission.Selfie) this.$type).getMetricsData(), this);
                    break;
                } else if (moduleSubmission instanceof ModuleSubmission.Transition) {
                    stepUpRepository2 = this.this$0.stepUpRepository;
                    this.label = 8;
                    createFailure = stepUpRepository2.m11534submitTransitiongIAlus(this.$moduleId, this);
                    break;
                } else {
                    if (moduleSubmission instanceof ModuleSubmission.Unstructured) {
                        stepUpRepository = this.this$0.stepUpRepository;
                        this.label = 9;
                        createFailure = stepUpRepository.m11535submitUnstructuredDocBWLJW6A(this.$moduleId, ((ModuleSubmission.Unstructured) this.$type).getDocumentBody(), ((ModuleSubmission.Unstructured) this.$type).getMetricsData(), this);
                        break;
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        createFailure = Result.m13470constructorimpl(ResultKt.createFailure(new UnknownModuleException(this.$type)));
                    }
                    ModulesRepositoryImpl modulesRepositoryImpl = this.this$0;
                    if (Result.m13477isSuccessimpl(createFailure)) {
                        Result.Companion companion4 = Result.INSTANCE;
                        mapper = modulesRepositoryImpl.moduleMapper;
                        this.label = 10;
                        obj = mapper.map((Mapper) createFailure, (Continuation) this);
                        break;
                    }
                    m13470constructorimpl = Result.m13470constructorimpl(createFailure);
                    return Result.m13469boximpl(m13470constructorimpl);
                }
                m13470constructorimpl = Result.m13470constructorimpl((ModuleModel) obj);
                return Result.m13469boximpl(m13470constructorimpl);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                ResultKt.throwOnFailure(obj);
                createFailure = ((Result) obj).getValue();
                ModulesRepositoryImpl modulesRepositoryImpl2 = this.this$0;
                if (Result.m13477isSuccessimpl(createFailure)) {
                }
                m13470constructorimpl = Result.m13470constructorimpl(createFailure);
                return Result.m13469boximpl(m13470constructorimpl);
            case 10:
                ResultKt.throwOnFailure(obj);
                m13470constructorimpl = Result.m13470constructorimpl((ModuleModel) obj);
                return Result.m13469boximpl(m13470constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
