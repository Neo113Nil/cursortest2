package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.ScannerModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MultipartBody;

/* compiled from: OrchestratorActivityScannerShim.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0014\u001a\u00020\u0015H\u0016J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/impl/OrchestratorActivityScannerShim;", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onModuleCompletedUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "moduleOrchestrator", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "onModuleSubmissionErrorUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;)V", "getOnModuleCompletedUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "getSubmission", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "onComplete", "", "uploadImage", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "image", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "uploadImage-gIAlu-s", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class OrchestratorActivityScannerShim implements ScannerShim {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatcher dispatcher;
    private final ModuleOrchestrator moduleOrchestrator;
    private final OnModuleCompletedUseCase onModuleCompletedUseCase;
    private final OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase;

    public abstract ModuleSubmission getSubmission(MultipartBody.Part documentBody, MultipartBody.Part metricsData);

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim
    /* renamed from: uploadImage-gIAlu-s, reason: not valid java name */
    public Object mo11542uploadImagegIAlus(UploadImage uploadImage, Continuation<? super Result<? extends ScannerModel>> continuation) {
        return m11541uploadImagegIAlus$suspendImpl(this, uploadImage, continuation);
    }

    public OrchestratorActivityScannerShim(CoroutineScope coroutineScope, OnModuleCompletedUseCase onModuleCompletedUseCase, ModuleOrchestrator moduleOrchestrator, CoroutineDispatcher dispatcher, OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onModuleCompletedUseCase, "onModuleCompletedUseCase");
        Intrinsics.checkNotNullParameter(moduleOrchestrator, "moduleOrchestrator");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(onModuleSubmissionErrorUseCase, "onModuleSubmissionErrorUseCase");
        this.coroutineScope = coroutineScope;
        this.onModuleCompletedUseCase = onModuleCompletedUseCase;
        this.moduleOrchestrator = moduleOrchestrator;
        this.dispatcher = dispatcher;
        this.onModuleSubmissionErrorUseCase = onModuleSubmissionErrorUseCase;
    }

    public final OnModuleCompletedUseCase getOnModuleCompletedUseCase() {
        return this.onModuleCompletedUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: uploadImage-gIAlu-s$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object m11541uploadImagegIAlus$suspendImpl(OrchestratorActivityScannerShim orchestratorActivityScannerShim, UploadImage uploadImage, Continuation<? super Result<? extends ScannerModel>> continuation) {
        OrchestratorActivityScannerShim$uploadImage$1 orchestratorActivityScannerShim$uploadImage$1;
        Object coroutine_suspended;
        int i;
        Object mo11539onFinishedgIAlus;
        Object value;
        OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase;
        Object m13470constructorimpl;
        Result result;
        Object value2;
        if (continuation instanceof OrchestratorActivityScannerShim$uploadImage$1) {
            orchestratorActivityScannerShim$uploadImage$1 = (OrchestratorActivityScannerShim$uploadImage$1) continuation;
            if ((orchestratorActivityScannerShim$uploadImage$1.label & Integer.MIN_VALUE) != 0) {
                orchestratorActivityScannerShim$uploadImage$1.label -= Integer.MIN_VALUE;
                Object obj = orchestratorActivityScannerShim$uploadImage$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = orchestratorActivityScannerShim$uploadImage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ModuleOrchestrator moduleOrchestrator = orchestratorActivityScannerShim.moduleOrchestrator;
                    MultipartBody.Part documentBody = uploadImage.getDocumentBody();
                    if (documentBody == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    ModuleSubmission submission = orchestratorActivityScannerShim.getSubmission(documentBody, uploadImage.getMetricsData());
                    orchestratorActivityScannerShim$uploadImage$1.L$0 = orchestratorActivityScannerShim;
                    orchestratorActivityScannerShim$uploadImage$1.label = 1;
                    mo11539onFinishedgIAlus = moduleOrchestrator.mo11539onFinishedgIAlus(submission, orchestratorActivityScannerShim$uploadImage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        result = (Result) orchestratorActivityScannerShim$uploadImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        value2 = result.getValue();
                        if (Result.m13477isSuccessimpl(value2)) {
                            return Result.m13470constructorimpl(value2);
                        }
                        Result.Companion companion = Result.INSTANCE;
                        ModuleModel moduleModel = (ModuleModel) value2;
                        Intrinsics.checkNotNull(moduleModel, "null cannot be cast to non-null type com.socure.docv.capturesdk.models.ScannerModel");
                        return Result.m13470constructorimpl((ScannerModel) moduleModel);
                    }
                    orchestratorActivityScannerShim = (OrchestratorActivityScannerShim) orchestratorActivityScannerShim$uploadImage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mo11539onFinishedgIAlus = ((Result) obj).getValue();
                }
                Result m13469boximpl = Result.m13469boximpl(mo11539onFinishedgIAlus);
                value = m13469boximpl.getValue();
                onModuleSubmissionErrorUseCase = orchestratorActivityScannerShim.onModuleSubmissionErrorUseCase;
                if (Result.m13477isSuccessimpl(value)) {
                    Result.Companion companion2 = Result.INSTANCE;
                    value = Unit.INSTANCE;
                }
                m13470constructorimpl = Result.m13470constructorimpl(value);
                orchestratorActivityScannerShim$uploadImage$1.L$0 = m13469boximpl;
                orchestratorActivityScannerShim$uploadImage$1.label = 2;
                if (onModuleSubmissionErrorUseCase.invoke(m13470constructorimpl, orchestratorActivityScannerShim$uploadImage$1) != coroutine_suspended) {
                    result = m13469boximpl;
                    value2 = result.getValue();
                    if (Result.m13477isSuccessimpl(value2)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        orchestratorActivityScannerShim$uploadImage$1 = new OrchestratorActivityScannerShim$uploadImage$1(orchestratorActivityScannerShim, continuation);
        Object obj2 = orchestratorActivityScannerShim$uploadImage$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = orchestratorActivityScannerShim$uploadImage$1.label;
        if (i != 0) {
        }
        Result m13469boximpl2 = Result.m13469boximpl(mo11539onFinishedgIAlus);
        value = m13469boximpl2.getValue();
        onModuleSubmissionErrorUseCase = orchestratorActivityScannerShim.onModuleSubmissionErrorUseCase;
        if (Result.m13477isSuccessimpl(value)) {
        }
        m13470constructorimpl = Result.m13470constructorimpl(value);
        orchestratorActivityScannerShim$uploadImage$1.L$0 = m13469boximpl2;
        orchestratorActivityScannerShim$uploadImage$1.label = 2;
        if (onModuleSubmissionErrorUseCase.invoke(m13470constructorimpl, orchestratorActivityScannerShim$uploadImage$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim
    public void onComplete() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatcher, null, new OrchestratorActivityScannerShim$onComplete$1(this, null), 2, null);
    }
}
