package com.unity3d.ads.core.domain.events;

import androidx.work.c;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.awx0;
import xsna.b6l;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;

/* compiled from: DiagnosticEventObserver.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class DiagnosticEventObserver$invoke$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ DiagnosticEventObserver this$0;

    /* compiled from: DiagnosticEventObserver.kt */
    @b6l(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {45, 49, 54}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements wzs<List<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent>, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DiagnosticEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DiagnosticEventObserver diagnosticEventObserver, spj<? super AnonymousClass2> spjVar) {
            super(2, spjVar);
            this.this$0 = diagnosticEventObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, spjVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // xsna.wzs
        public /* bridge */ /* synthetic */ Object invoke(List<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent> list, spj<? super s3q0> spjVar) {
            return invoke2((List<DiagnosticEventRequestOuterClass.DiagnosticEvent>) list, spjVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(1:29)|22|23|24|(4:26|15|7|8)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
        
            if (r8.invoke(r3, r1, r7) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
        
            r3 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        
            if (r8 == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
            GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
            UniversalRequestOuterClass.UniversalRequest universalRequest;
            String uuid;
            UniversalRequestDataSource universalRequestDataSource;
            UniversalRequestEventSender universalRequestEventSender;
            GetRequestPolicy getRequestPolicy;
            BackgroundWorker backgroundWorker;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = (List) this.L$0;
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                DiagnosticEventObserver diagnosticEventObserver = this.this$0;
                UniversalRequestKt.PayloadKt.Dsl _create = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
                getDiagnosticEventBatchRequest = diagnosticEventObserver.getDiagnosticEventBatchRequest;
                _create.setDiagnosticEventRequest(getDiagnosticEventBatchRequest.invoke(list));
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    uuid = (String) this.L$1;
                    universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                    try {
                        a.a(obj);
                        UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(uuid);
                        backgroundWorker = this.this$0.backgroundWorker;
                        c b = new c.a(DiagnosticEventJob.class).h(universalRequestWorkerData.invoke()).a(BackgroundWorker.TAG).b();
                        awx0 workManager = backgroundWorker.getWorkManager();
                        workManager.getClass();
                        workManager.d(Collections.singletonList(b));
                    } catch (Throwable unused) {
                        universalRequestEventSender = this.this$0.universalRequestEventSender;
                        getRequestPolicy = this.this$0.diagnosticRequestPolicy;
                        RequestPolicy invoke = getRequestPolicy.invoke();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    return s3q0.a;
                }
                a.a(obj);
            }
            UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
            uuid = UUID.randomUUID().toString();
            universalRequestDataSource = this.this$0.universalRequestDataSource;
            ByteString byteString = ByteStringsKt.toByteString(universalRequest2.toByteArray());
            this.L$0 = universalRequest2;
            this.L$1 = uuid;
            this.label = 2;
            if (universalRequestDataSource.set(uuid, byteString, this) != coroutineSingletons) {
                universalRequest = universalRequest2;
                UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(uuid);
                backgroundWorker = this.this$0.backgroundWorker;
                c b2 = new c.a(DiagnosticEventJob.class).h(universalRequestWorkerData2.invoke()).a(BackgroundWorker.TAG).b();
                awx0 workManager2 = backgroundWorker.getWorkManager();
                workManager2.getClass();
                workManager2.d(Collections.singletonList(b2));
                return s3q0.a;
            }
            return coroutineSingletons;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, spj<? super s3q0> spjVar) {
            return ((AnonymousClass2) create(list, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventObserver$invoke$2(DiagnosticEventObserver diagnosticEventObserver, spj<? super DiagnosticEventObserver$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = diagnosticEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new DiagnosticEventObserver$invoke$2(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xh50 xh50Var;
        Object value;
        Boolean bool;
        DiagnosticEventRepository diagnosticEventRepository;
        yvj yvjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        xh50Var = this.this$0.isRunning;
        do {
            value = xh50Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return s3q0.a;
        }
        diagnosticEventRepository = this.this$0.diagnosticEventRepository;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(diagnosticEventRepository.getDiagnosticEvents(), new AnonymousClass2(this.this$0, null));
        yvjVar = this.this$0.scope;
        rsr.s(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, yvjVar);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((DiagnosticEventObserver$invoke$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
