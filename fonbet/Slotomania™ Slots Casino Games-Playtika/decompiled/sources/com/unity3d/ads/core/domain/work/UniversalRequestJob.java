package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import io.sentry.SentryEvent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: UniversalRequestJob.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Landroidx/work/CoroutineWorker;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", SentryEvent.JsonKeys.LOGGER, "Lcom/unity3d/ads/core/log/Logger;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "logger$delegate", "Lkotlin/Lazy;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "getRequestPolicy", "()Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "setRequestPolicy", "(Lcom/unity3d/ads/gatewayclient/RequestPolicy;)V", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "getUniversalRequestDataSource", "()Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "getWorkerParams", "()Landroidx/work/WorkerParameters;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final Lazy logger;
    public RequestPolicy requestPolicy;

    /* renamed from: universalRequestDataSource$delegate, reason: from kotlin metadata */
    private final Lazy universalRequestDataSource;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    private final Lazy universalRequestEventSender;
    private final WorkerParameters workerParams;

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    protected final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.workerParams = workerParams;
        final UniversalRequestJob universalRequestJob = this;
        final String str = "universal";
        this.universalRequestEventSender = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
        final String str2 = "";
        this.universalRequestDataSource = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<UniversalRequestDataSource>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestDataSource invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class));
            }
        });
        this.logger = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Logger>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Logger invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(Logger.class));
            }
        });
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestPolicy");
        return null;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }

    protected UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    protected final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource.getValue();
    }

    protected final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(1:23)(2:26|27)))(3:29|30|31))(2:45|(2:47|48)(4:49|50|(1:52)|25))|32|33|(6:35|36|(2:38|25)|20|21|(0)(0))(2:39|40)))|57|6|7|(0)(0)|32|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f9, code lost:
    
        if (r9.remove(r8, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0049, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m11180constructorimpl(kotlin.ResultKt.createFailure(r9));
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object doWork$suspendImpl(UniversalRequestJob universalRequestJob, Continuation<? super ListenableWorker.Result> continuation) {
        UniversalRequestJob$doWork$1 universalRequestJob$doWork$1;
        ?? r2;
        Object m11180constructorimpl;
        ?? string;
        UniversalRequestJob universalRequestJob2;
        ?? r8;
        UniversalRequestJob universalRequestJob3;
        UniversalRequestJob universalRequestJob4;
        Object obj;
        if (continuation instanceof UniversalRequestJob$doWork$1) {
            universalRequestJob$doWork$1 = (UniversalRequestJob$doWork$1) continuation;
            if ((universalRequestJob$doWork$1.label & Integer.MIN_VALUE) != 0) {
                universalRequestJob$doWork$1.label -= Integer.MIN_VALUE;
                Object obj2 = universalRequestJob$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = universalRequestJob$doWork$1.label;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    string = universalRequestJob.workerParams.getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                    if (string == null) {
                        ListenableWorker.Result success = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success, "success()");
                        return success;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        UniversalRequestDataSource universalRequestDataSource = universalRequestJob.getUniversalRequestDataSource();
                        universalRequestJob$doWork$1.L$0 = universalRequestJob;
                        universalRequestJob$doWork$1.L$1 = string;
                        universalRequestJob$doWork$1.label = 1;
                        Object obj3 = universalRequestDataSource.get(universalRequestJob$doWork$1);
                        if (obj3 != coroutine_suspended) {
                            universalRequestJob2 = universalRequestJob;
                            r8 = string;
                            obj2 = obj3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        Object m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        universalRequestJob3 = universalRequestJob;
                        universalRequestJob4 = string;
                        obj = m11180constructorimpl2;
                        if (Result.m11183exceptionOrNullimpl(obj) == null) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (r2 == 1) {
                    r8 = (String) universalRequestJob$doWork$1.L$1;
                    universalRequestJob2 = (UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        universalRequestJob2 = universalRequestJob2;
                        r8 = r8;
                    } catch (Throwable th2) {
                        string = r8;
                        universalRequestJob = universalRequestJob2;
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        Object m11180constructorimpl22 = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        universalRequestJob3 = universalRequestJob;
                        universalRequestJob4 = string;
                        obj = m11180constructorimpl22;
                        if (Result.m11183exceptionOrNullimpl(obj) == null) {
                        }
                    }
                } else {
                    if (r2 != 2) {
                        if (r2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        ListenableWorker.Result success2 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success2, "{\n            universalR…esult.success()\n        }");
                        return success2;
                    }
                    ?? r82 = (String) universalRequestJob$doWork$1.L$1;
                    UniversalRequestJob universalRequestJob5 = (UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    r2 = universalRequestJob5;
                    universalRequestJob = r82;
                    m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                    UniversalRequestJob universalRequestJob6 = r2;
                    ?? r83 = universalRequestJob;
                    if (!Result.m11187isSuccessimpl(m11180constructorimpl)) {
                        ?? universalRequestDataSource2 = universalRequestJob6.getUniversalRequestDataSource();
                        universalRequestJob$doWork$1.L$0 = null;
                        universalRequestJob$doWork$1.L$1 = null;
                        universalRequestJob$doWork$1.label = 3;
                    } else {
                        ListenableWorker.Result retry = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry, "{\n            Result.retry()\n        }");
                        return retry;
                    }
                }
                obj = Result.m11180constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj2).getUniversalRequestMapOrThrow(r8));
                universalRequestJob3 = universalRequestJob2;
                universalRequestJob4 = r8;
                if (Result.m11183exceptionOrNullimpl(obj) == null) {
                    ListenableWorker.Result success3 = ListenableWorker.Result.success();
                    Intrinsics.checkNotNullExpressionValue(success3, "success()");
                    return success3;
                }
                UniversalRequestOuterClass.UniversalRequest universalRequest = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) obj);
                Result.Companion companion3 = Result.INSTANCE;
                UniversalRequestEventSender universalRequestEventSender = universalRequestJob3.getUniversalRequestEventSender();
                Intrinsics.checkNotNullExpressionValue(universalRequest, "universalRequest");
                RequestPolicy requestPolicy = universalRequestJob3.getRequestPolicy();
                universalRequestJob$doWork$1.L$0 = universalRequestJob3;
                universalRequestJob$doWork$1.L$1 = universalRequestJob4;
                universalRequestJob$doWork$1.label = 2;
                r2 = universalRequestJob3;
                universalRequestJob = universalRequestJob4;
                if (universalRequestEventSender.invoke(universalRequest, requestPolicy, universalRequestJob$doWork$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                UniversalRequestJob universalRequestJob62 = r2;
                ?? r832 = universalRequestJob;
                if (!Result.m11187isSuccessimpl(m11180constructorimpl)) {
                }
            }
        }
        universalRequestJob$doWork$1 = new UniversalRequestJob$doWork$1(universalRequestJob, continuation);
        Object obj22 = universalRequestJob$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = universalRequestJob$doWork$1.label;
        if (r2 != 0) {
        }
        obj = Result.m11180constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj22).getUniversalRequestMapOrThrow(r8));
        universalRequestJob3 = universalRequestJob2;
        universalRequestJob4 = r8;
        if (Result.m11183exceptionOrNullimpl(obj) == null) {
        }
    }
}
