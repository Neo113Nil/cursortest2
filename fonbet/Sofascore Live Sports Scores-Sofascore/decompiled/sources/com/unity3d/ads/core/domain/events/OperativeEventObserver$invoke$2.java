package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ktd;
import defpackage.ku3;
import defpackage.ltd;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v98;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class OperativeEventObserver$invoke$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    int label;
    final /* synthetic */ OperativeEventObserver this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "operativeEventRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @il4(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {47, 51, 59}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends hoi implements Function2<OperativeEventRequestOuterClass.OperativeEventRequest, rq3<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ OperativeEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OperativeEventObserver operativeEventObserver, rq3<? super AnonymousClass2> rq3Var) {
            super(2, rq3Var);
            this.this$0 = operativeEventObserver;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, rq3Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass2) create(operativeEventRequest, rq3Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(1:29)|22|23|24|(4:26|15|7|8)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
        
            if (r2.invoke(r5, r6, r17) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
        
            r5 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            if (r2 == r1) goto L27;
         */
        @Override // defpackage.h21
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
            Object invoke;
            UniversalRequestOuterClass.UniversalRequest universalRequest;
            UniversalRequestDataSource universalRequestDataSource;
            String str;
            UniversalRequestEventSender universalRequestEventSender;
            GetRequestPolicy getRequestPolicy;
            SendDiagnosticEvent sendDiagnosticEvent;
            BackgroundWorker backgroundWorker;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                newBuilder.getClass();
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setOperativeEvent(operativeEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                invoke = getUniversalRequestForPayLoad.invoke(_build, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$1;
                    universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                    try {
                        y6a.M(obj);
                        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                        UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                        backgroundWorker = this.this$0.backgroundWorker;
                        ktd ktdVar = (ktd) new ktd(OperativeEventJob.class).f(universalRequestWorkerData.invoke());
                        ktdVar.d.add(BackgroundWorker.TAG);
                        backgroundWorker.getWorkManager().a((ltd) ktdVar.a());
                    } catch (Throwable unused) {
                        universalRequestEventSender = this.this$0.universalRequestEventSender;
                        getRequestPolicy = this.this$0.operativeRequestPolicy;
                        RequestPolicy invoke2 = getRequestPolicy.invoke();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    return Unit.a;
                }
                y6a.M(obj);
                invoke = obj;
            }
            UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) invoke;
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            universalRequestDataSource = this.this$0.universalRequestDataSource;
            byte[] byteArray = universalRequest2.toByteArray();
            byteArray.getClass();
            ByteString byteString = ByteStringsKt.toByteString(byteArray);
            this.L$0 = universalRequest2;
            this.L$1 = uuid;
            this.label = 2;
            if (universalRequestDataSource.set(uuid, byteString, this) != lu3Var) {
                universalRequest = universalRequest2;
                str = uuid;
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                backgroundWorker = this.this$0.backgroundWorker;
                ktd ktdVar2 = (ktd) new ktd(OperativeEventJob.class).f(universalRequestWorkerData2.invoke());
                ktdVar2.d.add(BackgroundWorker.TAG);
                backgroundWorker.getWorkManager().a((ltd) ktdVar2.a());
                return Unit.a;
            }
            return lu3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventObserver$invoke$2(OperativeEventObserver operativeEventObserver, rq3<? super OperativeEventObserver$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = operativeEventObserver;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new OperativeEventObserver$invoke$2(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((OperativeEventObserver$invoke$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        f1d f1dVar;
        fdi fdiVar;
        Object value;
        Boolean bool;
        OperativeEventRepository operativeEventRepository;
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        f1dVar = this.this$0.isRunning;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!fdiVar.k(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return Unit.a;
        }
        operativeEventRepository = this.this$0.operativeEventRepository;
        v98 v98Var = new v98(operativeEventRepository.getOperativeEvents(), new AnonymousClass2(this.this$0, null), 3);
        ku3Var = this.this$0.scope;
        fcp.m0(v98Var, ku3Var);
        return Unit.a;
    }
}
