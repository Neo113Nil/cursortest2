package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: DiagnosticEventJob.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "diagnosticEventRequestWorkModifier", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "getDiagnosticEventRequestWorkModifier", "()Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier$delegate", "Lkotlin/Lazy;", "getDiagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetDiagnosticRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {

    /* renamed from: diagnosticEventRequestWorkModifier$delegate, reason: from kotlin metadata */
    private final Lazy diagnosticEventRequestWorkModifier;

    /* renamed from: getDiagnosticRequestPolicy$delegate, reason: from kotlin metadata */
    private final Lazy getDiagnosticRequestPolicy;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    private final Lazy universalRequestEventSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        final DiagnosticEventJob diagnosticEventJob = this;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class));
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final String str3 = ServiceProvider.DIAGNOSTICS_EVENT_SENDER;
        this.universalRequestEventSender = LazyKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy.getValue();
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    protected UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:37:0x00a8, B:39:0x00ae, B:42:0x00f8, B:47:0x009e), top: B:46:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[Catch: all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:37:0x00a8, B:39:0x00ae, B:42:0x00f8, B:47:0x009e), top: B:46:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        DiagnosticEventJob$doWork$1 diagnosticEventJob$doWork$1;
        int i;
        DiagnosticEventJob diagnosticEventJob;
        String string;
        DiagnosticEventJob diagnosticEventJob2;
        Object m11180constructorimpl;
        DiagnosticEventJob diagnosticEventJob3;
        if (continuation instanceof DiagnosticEventJob$doWork$1) {
            diagnosticEventJob$doWork$1 = (DiagnosticEventJob$doWork$1) continuation;
            if ((diagnosticEventJob$doWork$1.label & Integer.MIN_VALUE) != 0) {
                diagnosticEventJob$doWork$1.label -= Integer.MIN_VALUE;
                Object obj = diagnosticEventJob$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diagnosticEventJob$doWork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        string = getWorkerParams().getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                        if (string == null) {
                            ListenableWorker.Result success = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success, "success()");
                            return success;
                        }
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            DiagnosticEventJob diagnosticEventJob4 = this;
                            UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
                            diagnosticEventJob$doWork$1.L$0 = this;
                            diagnosticEventJob$doWork$1.L$1 = string;
                            diagnosticEventJob$doWork$1.label = 1;
                            obj = universalRequestDataSource.get(diagnosticEventJob$doWork$1);
                            if (obj != coroutine_suspended) {
                                diagnosticEventJob2 = this;
                            }
                        } catch (Throwable th) {
                            th = th;
                            diagnosticEventJob2 = this;
                            Result.Companion companion2 = Result.INSTANCE;
                            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                            if (Result.m11183exceptionOrNullimpl(m11180constructorimpl) == null) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        diagnosticEventJob = this;
                        diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                        ListenableWorker.Result retry = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry, "retry()");
                        return retry;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        diagnosticEventJob = (DiagnosticEventJob) diagnosticEventJob$doWork$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return (ListenableWorker.Result) obj;
                        } catch (Throwable th3) {
                            th = th3;
                            diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                            ListenableWorker.Result retry2 = ListenableWorker.Result.retry();
                            Intrinsics.checkNotNullExpressionValue(retry2, "retry()");
                            return retry2;
                        }
                    }
                    diagnosticEventJob3 = (DiagnosticEventJob) diagnosticEventJob$doWork$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
                        diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob3;
                        diagnosticEventJob$doWork$1.label = 3;
                        obj = super.doWork(diagnosticEventJob$doWork$1);
                        if (obj != coroutine_suspended) {
                            diagnosticEventJob = diagnosticEventJob3;
                            return (ListenableWorker.Result) obj;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        diagnosticEventJob = diagnosticEventJob3;
                        diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                        ListenableWorker.Result retry22 = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry22, "retry()");
                        return retry22;
                    }
                }
                string = (String) diagnosticEventJob$doWork$1.L$1;
                diagnosticEventJob2 = (DiagnosticEventJob) diagnosticEventJob$doWork$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        Result.Companion companion22 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        if (Result.m11183exceptionOrNullimpl(m11180constructorimpl) == null) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        diagnosticEventJob = diagnosticEventJob2;
                        diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                        ListenableWorker.Result retry222 = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry222, "retry()");
                        return retry222;
                    }
                }
                m11180constructorimpl = Result.m11180constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(string));
                if (Result.m11183exceptionOrNullimpl(m11180constructorimpl) == null) {
                    ListenableWorker.Result success2 = ListenableWorker.Result.success();
                    Intrinsics.checkNotNullExpressionValue(success2, "success()");
                    return success2;
                }
                UniversalRequestOuterClass.UniversalRequest universalRequest = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) m11180constructorimpl);
                DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = diagnosticEventJob2.getDiagnosticEventRequestWorkModifier();
                Intrinsics.checkNotNullExpressionValue(universalRequest, "universalRequest");
                UniversalRequestOuterClass.UniversalRequest invoke = diagnosticEventRequestWorkModifier.invoke(universalRequest);
                UniversalRequestDataSource universalRequestDataSource2 = diagnosticEventJob2.getUniversalRequestDataSource();
                ByteString byteString = invoke.toByteString();
                Intrinsics.checkNotNullExpressionValue(byteString, "modifiedUniversalRequest.toByteString()");
                diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob2;
                diagnosticEventJob$doWork$1.L$1 = null;
                diagnosticEventJob$doWork$1.label = 2;
                if (universalRequestDataSource2.set(string, byteString, diagnosticEventJob$doWork$1) != coroutine_suspended) {
                    diagnosticEventJob3 = diagnosticEventJob2;
                    diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
                    diagnosticEventJob$doWork$1.L$0 = diagnosticEventJob3;
                    diagnosticEventJob$doWork$1.label = 3;
                    obj = super.doWork(diagnosticEventJob$doWork$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        diagnosticEventJob$doWork$1 = new DiagnosticEventJob$doWork$1(this, continuation);
        Object obj2 = diagnosticEventJob$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diagnosticEventJob$doWork$1.label;
        if (i != 0) {
        }
        m11180constructorimpl = Result.m11180constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj2).getUniversalRequestMapOrThrow(string));
        if (Result.m11183exceptionOrNullimpl(m11180constructorimpl) == null) {
        }
    }
}
