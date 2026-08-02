package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.duf;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.joa;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.ysa;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/work/OperativeEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ljdb;", "doWork", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy$delegate", "Ljoa;", "getGetOperativeRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {

    /* renamed from: getOperativeRequestPolicy$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa getOperativeRequestPolicy;

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa sendDiagnosticEvent;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa universalRequestEventSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ysa ysaVar = ysa.c;
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy = ypa.a(ysaVar, new Function0<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.sendDiagnosticEvent = ypa.a(ysaVar, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, duf.a.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        });
        final String str3 = ServiceProvider.OPERATIVE_EVENT_SENDER;
        this.universalRequestEventSender = ypa.a(ysaVar, new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, duf.a.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull rq3<? super jdb> rq3Var) {
        OperativeEventJob$doWork$1 operativeEventJob$doWork$1;
        int i;
        Throwable th;
        long j;
        String message;
        if (rq3Var instanceof OperativeEventJob$doWork$1) {
            operativeEventJob$doWork$1 = (OperativeEventJob$doWork$1) rq3Var;
            int i2 = operativeEventJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                operativeEventJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = operativeEventJob$doWork$1.result;
                Object obj2 = lu3.a;
                i = operativeEventJob$doWork$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ensureApplicationContextSet();
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b = xuc.b();
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
                        Double d = new Double(TimeExtensionsKt.elapsedMillis(new whj(j)));
                        Pair pair = new Pair("reason", th.getClass().getSimpleName());
                        message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, tub.h(pair, new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        getLogger().trace("OperativeEventJob failed to process work", th);
                        return new hdb();
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = operativeEventJob$doWork$1.J$0;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        SendDiagnosticEvent sendDiagnosticEvent2 = getSendDiagnosticEvent();
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                        Double d2 = new Double(TimeExtensionsKt.elapsedMillis(new whj(j)));
                        Pair pair2 = new Pair("reason", th.getClass().getSimpleName());
                        message = th.getMessage();
                        if (message == null) {
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d2, tub.h(pair2, new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        getLogger().trace("OperativeEventJob failed to process work", th);
                        return new hdb();
                    }
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return (jdb) obj;
            }
        }
        operativeEventJob$doWork$1 = new OperativeEventJob$doWork$1(this, rq3Var);
        Object obj3 = operativeEventJob$doWork$1.result;
        Object obj22 = lu3.a;
        i = operativeEventJob$doWork$1.label;
        if (i != 0) {
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return (jdb) obj3;
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    @NotNull
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }
}
