package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.a70;
import defpackage.duf;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.joa;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.ysa;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Landroidx/work/CoroutineWorker;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "ensureApplicationContextSet", "()V", "Ljdb;", "doWork", "(Lrq3;)Ljava/lang/Object;", "Landroidx/work/WorkerParameters;", "getWorkerParams", "()Landroidx/work/WorkerParameters;", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "getRequestPolicy", "()Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "setRequestPolicy", "(Lcom/unity3d/ads/gatewayclient/RequestPolicy;)V", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "Ljoa;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource$delegate", "getUniversalRequestDataSource", "()Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource", "Lcom/unity3d/ads/core/log/Logger;", "logger$delegate", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "logger", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa logger;
    public RequestPolicy requestPolicy;

    /* renamed from: universalRequestDataSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa universalRequestDataSource;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa universalRequestEventSender;

    @NotNull
    private final WorkerParameters workerParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.workerParams = workerParameters;
        ysa ysaVar = ysa.c;
        final String str = "universal";
        this.universalRequestEventSender = ypa.a(ysaVar, new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
        final String str2 = "";
        this.universalRequestDataSource = ypa.a(ysaVar, new Function0<UniversalRequestDataSource>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestDataSource invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, duf.a.getOrCreateKotlinClass(UniversalRequestDataSource.class));
            }
        });
        this.logger = ypa.a(ysaVar, new Function0<Logger>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Logger invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, duf.a.getOrCreateKotlinClass(Logger.class));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(1:23)(2:26|27)))(3:29|30|31))(2:45|(2:47|48)(4:49|50|(1:52)|25))|32|33|(6:35|36|(2:38|25)|20|21|(0)(0))(2:39|40)))|57|6|7|(0)(0)|32|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
    
        if (r10.remove(r9, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0042, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        r5 = defpackage.w2g.b;
        r10 = new defpackage.u2g(r10);
        r2 = r2;
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object doWork$suspendImpl(UniversalRequestJob universalRequestJob, rq3<? super jdb> rq3Var) {
        UniversalRequestJob$doWork$1 universalRequestJob$doWork$1;
        ?? r2;
        Object u2gVar;
        ?? e;
        UniversalRequestJob universalRequestJob2;
        ?? r9;
        UniversalRequestJob universalRequestJob3;
        UniversalRequestJob universalRequestJob4;
        Object obj;
        if (rq3Var instanceof UniversalRequestJob$doWork$1) {
            universalRequestJob$doWork$1 = (UniversalRequestJob$doWork$1) rq3Var;
            int i = universalRequestJob$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalRequestJob$doWork$1.label = i - Integer.MIN_VALUE;
                Object obj2 = universalRequestJob$doWork$1.result;
                lu3 lu3Var = lu3.a;
                r2 = universalRequestJob$doWork$1.label;
                if (r2 != 0) {
                    y6a.M(obj2);
                    e = universalRequestJob.workerParams.b.e(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                    if (e == null) {
                        return jdb.a();
                    }
                    try {
                        p2g p2gVar = w2g.b;
                        UniversalRequestDataSource universalRequestDataSource = universalRequestJob.getUniversalRequestDataSource();
                        universalRequestJob$doWork$1.L$0 = universalRequestJob;
                        universalRequestJob$doWork$1.L$1 = e;
                        universalRequestJob$doWork$1.label = 1;
                        Object obj3 = universalRequestDataSource.get(universalRequestJob$doWork$1);
                        if (obj3 != lu3Var) {
                            universalRequestJob2 = universalRequestJob;
                            r9 = e;
                            obj2 = obj3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        p2g p2gVar2 = w2g.b;
                        u2g u2gVar2 = new u2g(th);
                        universalRequestJob3 = universalRequestJob;
                        universalRequestJob4 = e;
                        obj = u2gVar2;
                        if (w2g.a(obj) == null) {
                        }
                    }
                    return lu3Var;
                }
                if (r2 == 1) {
                    r9 = (String) universalRequestJob$doWork$1.L$1;
                    universalRequestJob2 = (UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    try {
                        y6a.M(obj2);
                        universalRequestJob2 = universalRequestJob2;
                        r9 = r9;
                    } catch (Throwable th2) {
                        e = r9;
                        universalRequestJob = universalRequestJob2;
                        th = th2;
                        p2g p2gVar22 = w2g.b;
                        u2g u2gVar22 = new u2g(th);
                        universalRequestJob3 = universalRequestJob;
                        universalRequestJob4 = e;
                        obj = u2gVar22;
                        if (w2g.a(obj) == null) {
                        }
                    }
                } else {
                    if (r2 != 2) {
                        if (r2 == 3) {
                            y6a.M(obj2);
                            return jdb.a();
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r92 = (String) universalRequestJob$doWork$1.L$1;
                    UniversalRequestJob universalRequestJob5 = (UniversalRequestJob) universalRequestJob$doWork$1.L$0;
                    y6a.M(obj2);
                    r2 = universalRequestJob5;
                    universalRequestJob = r92;
                    u2gVar = Unit.a;
                    p2g p2gVar3 = w2g.b;
                    UniversalRequestJob universalRequestJob6 = r2;
                    ?? r93 = universalRequestJob;
                    if (!(u2gVar instanceof u2g)) {
                        return new hdb();
                    }
                    ?? universalRequestDataSource2 = universalRequestJob6.getUniversalRequestDataSource();
                    universalRequestJob$doWork$1.L$0 = null;
                    universalRequestJob$doWork$1.L$1 = null;
                    universalRequestJob$doWork$1.label = 3;
                }
                obj = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj2).getUniversalRequestMapOrThrow(r9);
                p2g p2gVar4 = w2g.b;
                universalRequestJob3 = universalRequestJob2;
                universalRequestJob4 = r9;
                if (w2g.a(obj) == null) {
                    return jdb.a();
                }
                UniversalRequestOuterClass.UniversalRequest parseFrom = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) obj);
                UniversalRequestEventSender universalRequestEventSender = universalRequestJob3.getUniversalRequestEventSender();
                parseFrom.getClass();
                RequestPolicy requestPolicy = universalRequestJob3.getRequestPolicy();
                universalRequestJob$doWork$1.L$0 = universalRequestJob3;
                universalRequestJob$doWork$1.L$1 = universalRequestJob4;
                universalRequestJob$doWork$1.label = 2;
                r2 = universalRequestJob3;
                universalRequestJob = universalRequestJob4;
                if (universalRequestEventSender.invoke(parseFrom, requestPolicy, universalRequestJob$doWork$1) == lu3Var) {
                    return lu3Var;
                }
                u2gVar = Unit.a;
                p2g p2gVar32 = w2g.b;
                UniversalRequestJob universalRequestJob62 = r2;
                ?? r932 = universalRequestJob;
                if (!(u2gVar instanceof u2g)) {
                }
            }
        }
        universalRequestJob$doWork$1 = new UniversalRequestJob$doWork$1(universalRequestJob, rq3Var);
        Object obj22 = universalRequestJob$doWork$1.result;
        lu3 lu3Var2 = lu3.a;
        r2 = universalRequestJob$doWork$1.label;
        if (r2 != 0) {
        }
        obj = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj22).getUniversalRequestMapOrThrow(r9);
        p2g p2gVar42 = w2g.b;
        universalRequestJob3 = universalRequestJob2;
        universalRequestJob4 = r9;
        if (w2g.a(obj) == null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull rq3<? super jdb> rq3Var) {
        return doWork$suspendImpl(this, rq3Var);
    }

    public final void ensureApplicationContextSet() {
        if (ClientProperties.getApplicationContext() == null) {
            ClientProperties.setApplicationContext(getApplicationContext());
        }
    }

    @NotNull
    public final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    @NotNull
    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        Intrinsics.i("requestPolicy");
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource.getValue();
    }

    @NotNull
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    @NotNull
    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(@NotNull RequestPolicy requestPolicy) {
        requestPolicy.getClass();
        this.requestPolicy = requestPolicy;
    }
}
