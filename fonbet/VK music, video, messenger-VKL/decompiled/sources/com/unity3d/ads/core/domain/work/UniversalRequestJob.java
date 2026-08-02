package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.fpf0;
import xsna.gzs;
import xsna.msy;
import xsna.s3q0;
import xsna.spj;

/* compiled from: UniversalRequestJob.kt */
/* loaded from: classes14.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    private final Lazy logger$delegate;
    public RequestPolicy requestPolicy;
    private final Lazy universalRequestDataSource$delegate;
    private final Lazy universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    public UniversalRequestJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.workerParams = workerParameters;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = "universal";
        this.universalRequestEventSender$delegate = msy.a(lazyThreadSafetyMode, new gzs<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // xsna.gzs
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(UniversalRequestEventSender.class));
            }
        });
        final String str2 = "";
        this.universalRequestDataSource$delegate = msy.a(lazyThreadSafetyMode, new gzs<UniversalRequestDataSource>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, java.lang.Object] */
            @Override // xsna.gzs
            public final UniversalRequestDataSource invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(UniversalRequestDataSource.class));
            }
        });
        this.logger$delegate = msy.a(lazyThreadSafetyMode, new gzs<Logger>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // xsna.gzs
            public final Logger invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(Logger.class));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(1:23)(2:26|27)))(3:29|30|31))(2:45|(2:47|48)(4:49|50|(1:52)|25))|32|33|(6:35|36|(2:38|25)|20|21|(0)(0))(2:39|40)))|57|6|7|(0)(0)|32|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (r9.remove(r8, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0043, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b6, code lost:
    
        r9 = new kotlin.Result.Failure(r9);
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v20, types: [com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object doWork$suspendImpl(UniversalRequestJob universalRequestJob, spj<? super b.a> spjVar) {
        UniversalRequestJob$doWork$1 universalRequestJob$doWork$1;
        ?? r2;
        Object failure;
        ?? d;
        UniversalRequestJob universalRequestJob2;
        ?? r8;
        UniversalRequestJob universalRequestJob3;
        UniversalRequestJob universalRequestJob4;
        Object obj;
        if (spjVar instanceof UniversalRequestJob$doWork$1) {
            universalRequestJob$doWork$1 = (UniversalRequestJob$doWork$1) spjVar;
            int i = universalRequestJob$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalRequestJob$doWork$1.label = i - Integer.MIN_VALUE;
                Object obj2 = universalRequestJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = universalRequestJob$doWork$1.label;
                if (r2 != 0) {
                    a.a(obj2);
                    d = universalRequestJob.workerParams.b.d(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                    if (d == null) {
                        return new b.a.c();
                    }
                    try {
                        UniversalRequestDataSource universalRequestDataSource = universalRequestJob.getUniversalRequestDataSource();
                        universalRequestJob$doWork$1.L$0 = universalRequestJob;
                        universalRequestJob$doWork$1.L$1 = d;
                        universalRequestJob$doWork$1.label = 1;
                        Object obj3 = universalRequestDataSource.get(universalRequestJob$doWork$1);
                        if (obj3 != coroutineSingletons) {
                            universalRequestJob2 = universalRequestJob;
                            r8 = d;
                            obj2 = obj3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Result.Failure failure2 = new Result.Failure(th);
                        universalRequestJob3 = universalRequestJob;
                        universalRequestJob4 = d;
                        obj = failure2;
                        if (Result.a(obj) == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (r2 == 1) {
                    r8 = (String) universalRequestJob$doWork$1.L$1;
                    universalRequestJob2 = (UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    try {
                        a.a(obj2);
                        universalRequestJob2 = universalRequestJob2;
                        r8 = r8;
                    } catch (Throwable th2) {
                        d = r8;
                        universalRequestJob = universalRequestJob2;
                        th = th2;
                        Result.Failure failure22 = new Result.Failure(th);
                        universalRequestJob3 = universalRequestJob;
                        universalRequestJob4 = d;
                        obj = failure22;
                        if (Result.a(obj) == null) {
                        }
                    }
                } else {
                    if (r2 != 2) {
                        if (r2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj2);
                        return new b.a.c();
                    }
                    ?? r82 = (String) universalRequestJob$doWork$1.L$1;
                    UniversalRequestJob universalRequestJob5 = (UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    a.a(obj2);
                    r2 = universalRequestJob5;
                    universalRequestJob = r82;
                    failure = s3q0.a;
                    UniversalRequestJob universalRequestJob6 = r2;
                    ?? r83 = universalRequestJob;
                    if (!(failure instanceof Result.Failure)) {
                        return new b.a.C0093b();
                    }
                    ?? universalRequestDataSource2 = universalRequestJob6.getUniversalRequestDataSource();
                    universalRequestJob$doWork$1.L$0 = null;
                    universalRequestJob$doWork$1.L$1 = null;
                    universalRequestJob$doWork$1.label = 3;
                }
                obj = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj2).getUniversalRequestMapOrThrow(r8);
                universalRequestJob3 = universalRequestJob2;
                universalRequestJob4 = r8;
                if (Result.a(obj) == null) {
                    return new b.a.c();
                }
                UniversalRequestOuterClass.UniversalRequest parseFrom = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) obj);
                UniversalRequestEventSender universalRequestEventSender = universalRequestJob3.getUniversalRequestEventSender();
                RequestPolicy requestPolicy = universalRequestJob3.getRequestPolicy();
                universalRequestJob$doWork$1.L$0 = universalRequestJob3;
                universalRequestJob$doWork$1.L$1 = universalRequestJob4;
                universalRequestJob$doWork$1.label = 2;
                r2 = universalRequestJob3;
                universalRequestJob = universalRequestJob4;
                if (universalRequestEventSender.invoke(parseFrom, requestPolicy, universalRequestJob$doWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                failure = s3q0.a;
                UniversalRequestJob universalRequestJob62 = r2;
                ?? r832 = universalRequestJob;
                if (!(failure instanceof Result.Failure)) {
                }
            }
        }
        universalRequestJob$doWork$1 = new UniversalRequestJob$doWork$1(universalRequestJob, spjVar);
        Object obj22 = universalRequestJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = universalRequestJob$doWork$1.label;
        if (r2 != 0) {
        }
        obj = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj22).getUniversalRequestMapOrThrow(r8);
        universalRequestJob3 = universalRequestJob2;
        universalRequestJob4 = r8;
        if (Result.a(obj) == null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(spj<? super b.a> spjVar) {
        return doWork$suspendImpl(this, spjVar);
    }

    public final void ensureApplicationContextSet() {
        if (ClientProperties.getApplicationContext() == null) {
            ClientProperties.setApplicationContext(getApplicationContext());
        }
    }

    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        return null;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        this.requestPolicy = requestPolicy;
    }
}
