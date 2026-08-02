package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.a70;
import defpackage.duf;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.joa;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.ysa;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ljdb;", "doWork", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy$delegate", "Ljoa;", "getGetDiagnosticRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier$delegate", "getDiagnosticEventRequestWorkModifier", "()Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {

    /* renamed from: diagnosticEventRequestWorkModifier$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa diagnosticEventRequestWorkModifier;

    /* renamed from: getDiagnosticRequestPolicy$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa getDiagnosticRequestPolicy;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa universalRequestEventSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ysa ysaVar = ysa.c;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy = ypa.a(ysaVar, new Function0<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier = ypa.a(ysaVar, new Function0<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, duf.a.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class));
            }
        });
        final String str3 = ServiceProvider.DIAGNOSTICS_EVENT_SENDER;
        this.universalRequestEventSender = ypa.a(ysaVar, new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, duf.a.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(2:22|23))(3:33|34|(2:36|37)(2:38|(2:40|21)))|24|25|(3:27|(2:29|21)|19)(2:30|31)))|7|(0)(0)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (r8 != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0045, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        r6 = defpackage.w2g.b;
        r8 = new defpackage.u2g(r8);
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002a, B:13:0x00c3, B:18:0x0038, B:19:0x00af, B:25:0x0082, B:27:0x0088, B:30:0x00c6, B:42:0x007a, B:34:0x004d, B:36:0x005b, B:23:0x0041, B:24:0x0071, B:38:0x0060), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002a, B:13:0x00c3, B:18:0x0038, B:19:0x00af, B:25:0x0082, B:27:0x0088, B:30:0x00c6, B:42:0x007a, B:34:0x004d, B:36:0x005b, B:23:0x0041, B:24:0x0071, B:38:0x0060), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull rq3<? super jdb> rq3Var) {
        DiagnosticEventJob$doWork$1 diagnosticEventJob$doWork$1;
        ?? r2;
        Object u2gVar;
        try {
            if (rq3Var instanceof DiagnosticEventJob$doWork$1) {
                diagnosticEventJob$doWork$1 = (DiagnosticEventJob$doWork$1) rq3Var;
                int i = diagnosticEventJob$doWork$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    diagnosticEventJob$doWork$1.label = i - Integer.MIN_VALUE;
                    Object obj = diagnosticEventJob$doWork$1.result;
                    Object obj2 = lu3.a;
                    r2 = diagnosticEventJob$doWork$1.label;
                    if (r2 != 0) {
                        y6a.M(obj);
                        ensureApplicationContextSet();
                        String e = getWorkerParams().b.e(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                        if (e == null) {
                            return jdb.a();
                        }
                        p2g p2gVar = w2g.b;
                        UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
                        diagnosticEventJob$doWork$1.L$0 = e;
                        diagnosticEventJob$doWork$1.label = 1;
                        obj = universalRequestDataSource.get(diagnosticEventJob$doWork$1);
                        r2 = e;
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else if (r2 == 1) {
                        String str = (String) diagnosticEventJob$doWork$1.L$0;
                        y6a.M(obj);
                        r2 = str;
                    } else {
                        if (r2 != 2) {
                            if (r2 == 3) {
                                y6a.M(obj);
                                return (jdb) obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        setRequestPolicy(getGetDiagnosticRequestPolicy().invoke());
                        diagnosticEventJob$doWork$1.label = 3;
                        obj = super.doWork(diagnosticEventJob$doWork$1);
                    }
                    u2gVar = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r2);
                    p2g p2gVar2 = w2g.b;
                    String str2 = r2;
                    if (w2g.a(u2gVar) == null) {
                        return jdb.a();
                    }
                    UniversalRequestOuterClass.UniversalRequest parseFrom = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) u2gVar);
                    DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = getDiagnosticEventRequestWorkModifier();
                    parseFrom.getClass();
                    UniversalRequestOuterClass.UniversalRequest invoke = diagnosticEventRequestWorkModifier.invoke(parseFrom);
                    UniversalRequestDataSource universalRequestDataSource2 = getUniversalRequestDataSource();
                    ByteString byteString = invoke.toByteString();
                    byteString.getClass();
                    diagnosticEventJob$doWork$1.L$0 = null;
                    diagnosticEventJob$doWork$1.label = 2;
                    if (universalRequestDataSource2.set(str2, byteString, diagnosticEventJob$doWork$1) == obj2) {
                        return obj2;
                    }
                    setRequestPolicy(getGetDiagnosticRequestPolicy().invoke());
                    diagnosticEventJob$doWork$1.label = 3;
                    obj = super.doWork(diagnosticEventJob$doWork$1);
                }
            }
            if (r2 != 0) {
            }
            u2gVar = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r2);
            p2g p2gVar22 = w2g.b;
            String str22 = r2;
            if (w2g.a(u2gVar) == null) {
            }
        } catch (Throwable th) {
            getLogger().trace("DiagnosticEventJob failed to process work", th);
            return new hdb();
        }
        diagnosticEventJob$doWork$1 = new DiagnosticEventJob$doWork$1(this, rq3Var);
        Object obj3 = diagnosticEventJob$doWork$1.result;
        Object obj22 = lu3.a;
        r2 = diagnosticEventJob$doWork$1.label;
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    @NotNull
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }
}
