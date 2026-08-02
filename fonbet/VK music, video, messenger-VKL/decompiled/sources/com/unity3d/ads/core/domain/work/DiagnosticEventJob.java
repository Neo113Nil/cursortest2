package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.fpf0;
import xsna.gzs;
import xsna.msy;
import xsna.spj;

/* compiled from: DiagnosticEventJob.kt */
/* loaded from: classes14.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    private final Lazy diagnosticEventRequestWorkModifier$delegate;
    private final Lazy getDiagnosticRequestPolicy$delegate;
    private final Lazy universalRequestEventSender$delegate;

    public DiagnosticEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy$delegate = msy.a(lazyThreadSafetyMode, new gzs<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // xsna.gzs
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier$delegate = msy.a(lazyThreadSafetyMode, new gzs<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // xsna.gzs
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(DiagnosticEventRequestWorkModifier.class));
            }
        });
        final String str3 = ServiceProvider.DIAGNOSTICS_EVENT_SENDER;
        this.universalRequestEventSender$delegate = msy.a(lazyThreadSafetyMode, new gzs<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // xsna.gzs
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, fpf0.a(UniversalRequestEventSender.class));
            }
        });
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(2:22|23))(3:33|34|(2:36|37)(2:38|(2:40|21)))|24|25|(3:27|(2:29|21)|19)(2:30|31)))|7|(0)(0)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        if (r8 != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0045, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r8 = new kotlin.Result.Failure(r8);
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:13:0x00b9, B:18:0x0039, B:19:0x00a5, B:25:0x007d, B:27:0x0083, B:30:0x00bc, B:42:0x0077, B:34:0x004d, B:36:0x005b, B:23:0x0041, B:24:0x0070, B:38:0x0061), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:13:0x00b9, B:18:0x0039, B:19:0x00a5, B:25:0x007d, B:27:0x0083, B:30:0x00bc, B:42:0x0077, B:34:0x004d, B:36:0x005b, B:23:0x0041, B:24:0x0070, B:38:0x0061), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(spj<? super b.a> spjVar) {
        DiagnosticEventJob$doWork$1 diagnosticEventJob$doWork$1;
        ?? r2;
        Object failure;
        try {
            if (spjVar instanceof DiagnosticEventJob$doWork$1) {
                diagnosticEventJob$doWork$1 = (DiagnosticEventJob$doWork$1) spjVar;
                int i = diagnosticEventJob$doWork$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    diagnosticEventJob$doWork$1.label = i - Integer.MIN_VALUE;
                    Object obj = diagnosticEventJob$doWork$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = diagnosticEventJob$doWork$1.label;
                    if (r2 != 0) {
                        a.a(obj);
                        ensureApplicationContextSet();
                        String d = getWorkerParams().b.d(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                        if (d == null) {
                            return new b.a.c();
                        }
                        UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
                        diagnosticEventJob$doWork$1.L$0 = d;
                        diagnosticEventJob$doWork$1.label = 1;
                        obj = universalRequestDataSource.get(diagnosticEventJob$doWork$1);
                        r2 = d;
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else if (r2 == 1) {
                        String str = (String) diagnosticEventJob$doWork$1.L$0;
                        a.a(obj);
                        r2 = str;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.a(obj);
                            return (b.a) obj;
                        }
                        a.a(obj);
                        setRequestPolicy(getGetDiagnosticRequestPolicy().invoke());
                        diagnosticEventJob$doWork$1.label = 3;
                        obj = super.doWork(diagnosticEventJob$doWork$1);
                    }
                    failure = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r2);
                    String str2 = r2;
                    if (Result.a(failure) == null) {
                        return new b.a.c();
                    }
                    UniversalRequestOuterClass.UniversalRequest invoke = getDiagnosticEventRequestWorkModifier().invoke(UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) failure));
                    UniversalRequestDataSource universalRequestDataSource2 = getUniversalRequestDataSource();
                    ByteString byteString = invoke.toByteString();
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
            failure = ((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r2);
            String str22 = r2;
            if (Result.a(failure) == null) {
            }
        } catch (Throwable th) {
            getLogger().trace("DiagnosticEventJob failed to process work", th);
            return new b.a.C0093b();
        }
        diagnosticEventJob$doWork$1 = new DiagnosticEventJob$doWork$1(this, spjVar);
        Object obj3 = diagnosticEventJob$doWork$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = diagnosticEventJob$doWork$1.label;
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }
}
