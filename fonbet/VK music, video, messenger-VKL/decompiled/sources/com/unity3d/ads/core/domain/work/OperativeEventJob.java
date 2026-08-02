package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.fpf0;
import xsna.gzs;
import xsna.jvo0;
import xsna.k830;
import xsna.msy;
import xsna.pn00;
import xsna.spj;

/* compiled from: OperativeEventJob.kt */
/* loaded from: classes14.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final Lazy getOperativeRequestPolicy$delegate;
    private final Lazy sendDiagnosticEvent$delegate;
    private final Lazy universalRequestEventSender$delegate;

    public OperativeEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy$delegate = msy.a(lazyThreadSafetyMode, new gzs<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // xsna.gzs
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.sendDiagnosticEvent$delegate = msy.a(lazyThreadSafetyMode, new gzs<SendDiagnosticEvent>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // xsna.gzs
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, fpf0.a(SendDiagnosticEvent.class));
            }
        });
        final String str3 = ServiceProvider.OPERATIVE_EVENT_SENDER;
        this.universalRequestEventSender$delegate = msy.a(lazyThreadSafetyMode, new gzs<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // xsna.gzs
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, fpf0.a(UniversalRequestEventSender.class));
            }
        });
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(spj<? super b.a> spjVar) {
        OperativeEventJob$doWork$1 operativeEventJob$doWork$1;
        int i;
        Throwable th;
        long j;
        String message;
        if (spjVar instanceof OperativeEventJob$doWork$1) {
            operativeEventJob$doWork$1 = (OperativeEventJob$doWork$1) spjVar;
            int i2 = operativeEventJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                operativeEventJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = operativeEventJob$doWork$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = operativeEventJob$doWork$1.label;
                if (i != 0) {
                    a.a(obj);
                    ensureApplicationContextSet();
                    long b = k830.b();
                    try {
                        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
                        operativeEventJob$doWork$1.J$0 = b;
                        operativeEventJob$doWork$1.label = 1;
                        obj = super.doWork(operativeEventJob$doWork$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        j = b;
                    } catch (Throwable th2) {
                        th = th2;
                        j = b;
                        SendDiagnosticEvent sendDiagnosticEvent = getSendDiagnosticEvent();
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                        Double d = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j)));
                        Pair pair = new Pair("reason", th.getClass().getSimpleName());
                        message = th.getMessage();
                        if (message == null) {
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, pn00.k(pair, new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        getLogger().trace("OperativeEventJob failed to process work", th);
                        return new b.a.C0093b();
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = operativeEventJob$doWork$1.J$0;
                    try {
                        a.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        SendDiagnosticEvent sendDiagnosticEvent2 = getSendDiagnosticEvent();
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                        Double d2 = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j)));
                        Pair pair2 = new Pair("reason", th.getClass().getSimpleName());
                        message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d2, pn00.k(pair2, new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        getLogger().trace("OperativeEventJob failed to process work", th);
                        return new b.a.C0093b();
                    }
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return (b.a) obj;
            }
        }
        operativeEventJob$doWork$1 = new OperativeEventJob$doWork$1(this, spjVar);
        Object obj3 = operativeEventJob$doWork$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = operativeEventJob$doWork$1.label;
        if (i != 0) {
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return (b.a) obj3;
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }
}
