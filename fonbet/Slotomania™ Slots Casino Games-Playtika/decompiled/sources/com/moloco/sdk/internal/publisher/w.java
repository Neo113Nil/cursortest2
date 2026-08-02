package com.moloco.sdk.internal.publisher;

import androidx.compose.material.TextFieldImplKt;
import com.facebook.login.LoginLogger;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.InterfaceC2784a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.service_locator.a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class w {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final MolocoInitStatus h;
    public static final MolocoInitStatus i;
    public static final String j = "InitializationHandler";
    public static final String k = "Moloco SDK failed to initialize due to unexpected app key";
    public static final String l = "Moloco SDK failed to initialize due to unexpected app key during existing initialization";
    public final com.moloco.sdk.internal.services.J a;
    public final MutableStateFlow<Initialization> b;
    public final StateFlow<Initialization> c;
    public Init.SDKInitResponse d;
    public final MutableStateFlow<InterfaceC2784a> e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MolocoInitStatus a() {
            return w.h;
        }

        public final MolocoInitStatus b() {
            return w.i;
        }

        public a() {
        }

        public final MolocoInitStatus a(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new MolocoInitStatus(Initialization.FAILURE, errorMessage);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", i = {}, l = {85}, m = "awaitAdFactory", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return w.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler$awaitAdFactory$adFactory$1", f = "InitializationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<InterfaceC2784a, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2784a interfaceC2784a, Continuation<? super Boolean> continuation) {
            return ((c) create(interfaceC2784a, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((InterfaceC2784a) this.b) != null);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {TextFieldImplKt.AnimationDuration, 153, 183, 184, PsExtractor.AUDIO_STREAM}, m = "handleInitializationResult", n = {"result", "trackingApi", "metricsRecorder", "initTimerEvent", "latency", "result", "metricsRecorder", "initTimerEvent", "this", "trackingApi", "metricsRecorder", "initTimerEvent", "$this$handleInitializationResult_u24lambda_u240", "latency", "this", "metricsRecorder", "initTimerEvent", "$this$handleInitializationResult_u24lambda_u240"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public long f;
        public /* synthetic */ Object g;
        public int i;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return w.this.a((com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>) null, 0L, (com.moloco.sdk.internal.services.init.n) null, (MetricsRecorder) null, (TimerEvent) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", i = {0, 0, 0, 1}, l = {112, 116, 120}, m = MobileAdsBridgeBase.initializeMethodName, n = {"this", "metricsRecorder", "clientFailureType", "clientFailureType"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return w.this.a(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler$startInitialization$2", f = "InitializationHandler.kt", i = {0, 0, 1}, l = {134, 138}, m = "invokeSuspend", n = {"acmInitTimer", "startTime", "result"}, s = {"L$0", "J$0", "L$0"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>>, Object> {
        public Object a;
        public long b;
        public int c;
        public final /* synthetic */ MetricsRecorder d;
        public final /* synthetic */ w e;
        public final /* synthetic */ String f;
        public final /* synthetic */ MediationInfo g;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.n h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MetricsRecorder metricsRecorder, w wVar, String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.d = metricsRecorder;
            this.e = wVar;
            this.f = str;
            this.g = mediationInfo;
            this.h = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TimerEvent startTimerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, w.j, "startInitialization switch to Dispatchers.IO", null, false, 12, null);
                startTimerEvent = this.d.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.b.c());
                long a = this.e.f().a();
                com.moloco.sdk.internal.services.init.k b = a.f.a.b();
                String str = this.f;
                MediationInfo mediationInfo = this.g;
                this.a = startTimerEvent;
                this.b = a;
                this.c = 1;
                obj = b.a(str, mediationInfo, this);
                if (obj != coroutine_suspended) {
                    j = a;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) this.a;
                ResultKt.throwOnFailure(obj);
                return vVar;
            }
            j = this.b;
            startTimerEvent = (TimerEvent) this.a;
            ResultKt.throwOnFailure(obj);
            TimerEvent timerEvent = startTimerEvent;
            com.moloco.sdk.internal.v vVar2 = (com.moloco.sdk.internal.v) obj;
            long a2 = this.e.f().a() - j;
            w wVar = this.e;
            com.moloco.sdk.internal.services.init.n nVar = this.h;
            MetricsRecorder metricsRecorder = this.d;
            this.a = vVar2;
            this.c = 2;
            return wVar.a((com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>) vVar2, a2, nVar, metricsRecorder, timerEvent, this) == coroutine_suspended ? coroutine_suspended : vVar2;
        }
    }

    static {
        Initialization initialization = Initialization.SUCCESS;
        h = new MolocoInitStatus(initialization, "Already Initialized");
        i = new MolocoInitStatus(initialization, "Initialized");
    }

    public w(com.moloco.sdk.internal.services.J timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.a = timeProviderService;
        MutableStateFlow<Initialization> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
        this.e = StateFlowKt.MutableStateFlow(null);
    }

    public final boolean c() {
        return g();
    }

    public final StateFlow<Initialization> d() {
        return this.c;
    }

    public final Init.SDKInitResponse e() {
        return this.d;
    }

    public final com.moloco.sdk.internal.services.J f() {
        return this.a;
    }

    public final boolean g() {
        try {
            a.i.a.c();
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final Object b(String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, MetricsRecorder metricsRecorder, Continuation<? super com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new f(metricsRecorder, this, str, mediationInfo, nVar, null), continuation);
    }

    public final Object b(Continuation<? super Unit> continuation) {
        this.d = null;
        this.e.setValue(null);
        this.b.setValue(null);
        Object a2 = a.f.a.b().a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation<? super InterfaceC2784a> continuation) {
        b bVar;
        int i2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.c = i3 - Integer.MIN_VALUE;
                Object obj = bVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "Moloco SDK awaiting init to receive AdFactory", null, false, 12, null);
                    MutableStateFlow<InterfaceC2784a> mutableStateFlow = this.e;
                    c cVar = new c(null);
                    bVar.c = 1;
                    obj = FlowKt.first(mutableStateFlow, cVar, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory");
                InterfaceC2784a interfaceC2784a = (InterfaceC2784a) obj;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "Moloco SDK init completed, AdFactory received", null, false, 12, null);
                return interfaceC2784a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.c;
        if (i2 != 0) {
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory");
        InterfaceC2784a interfaceC2784a2 = (InterfaceC2784a) obj2;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "Moloco SDK init completed, AdFactory received", null, false, 12, null);
        return interfaceC2784a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d6, code lost:
    
        if (r1.emit(r3, r5) != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, MetricsRecorder metricsRecorder, Continuation<? super com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        e eVar;
        int i2;
        j.a aVar;
        MetricsRecorder metricsRecorder2;
        w wVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i3 = eVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f = i3 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eVar2.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, j, "initialize()", null, false, 12, null);
                    metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.a.c()));
                    if (!c()) {
                        MolocoLogger.error$default(molocoLogger, j, "PersistentHttpRequest is not available, failing to initialize", null, false, 12, null);
                        j.a aVar2 = new j.a(com.moloco.sdk.internal.services.init.b.e);
                        eVar2.a = this;
                        eVar2.b = metricsRecorder;
                        eVar2.c = aVar2;
                        eVar2.f = 1;
                        if (nVar.a(aVar2, 0L, eVar2) != coroutine_suspended) {
                            aVar = aVar2;
                            metricsRecorder2 = metricsRecorder;
                            wVar = this;
                        }
                    } else {
                        eVar2.f = 3;
                        Object b2 = b(str, mediationInfo, nVar, metricsRecorder, eVar2);
                        if (b2 != coroutine_suspended) {
                            return b2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        aVar = (j.a) eVar2.a;
                        ResultKt.throwOnFailure(obj);
                        return new v.a(aVar);
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                aVar = (j.a) eVar2.c;
                metricsRecorder2 = (MetricsRecorder) eVar2.b;
                wVar = (w) eVar2.a;
                ResultKt.throwOnFailure(obj);
                metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), aVar.a().name()));
                MutableStateFlow<Initialization> mutableStateFlow = wVar.b;
                Initialization initialization = Initialization.FAILURE;
                eVar2.a = aVar;
                eVar2.b = null;
                eVar2.c = null;
                eVar2.f = 2;
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar22.f;
        if (i2 != 0) {
        }
        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), aVar.a().name()));
        MutableStateFlow<Initialization> mutableStateFlow2 = wVar.b;
        Initialization initialization2 = Initialization.FAILURE;
        eVar22.a = aVar;
        eVar22.b = null;
        eVar22.c = null;
        eVar22.f = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0255, code lost:
    
        if (r2.emit(r1, r8) != r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r7.emit(r10, r8) == r9) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar, long j2, com.moloco.sdk.internal.services.init.n nVar, MetricsRecorder metricsRecorder, TimerEvent timerEvent, Continuation<? super Unit> continuation) {
        d dVar;
        int i2;
        Init.SDKInitResponse sDKInitResponse;
        long j3;
        w wVar;
        com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar2;
        MetricsRecorder metricsRecorder2;
        TimerEvent timerEvent2;
        com.moloco.sdk.internal.services.init.j jVar;
        Init.SDKInitResponse sDKInitResponse2;
        MetricsRecorder metricsRecorder3;
        TimerEvent timerEvent3;
        w wVar2;
        com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar3 = vVar;
        long j4 = j2;
        com.moloco.sdk.internal.services.init.n nVar2 = nVar;
        MetricsRecorder metricsRecorder4 = metricsRecorder;
        TimerEvent timerEvent4 = timerEvent;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i3 = dVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.i = i3 - Integer.MIN_VALUE;
                Object obj = dVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dVar.i;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (vVar3 instanceof v.a) {
                        MutableStateFlow<Initialization> mutableStateFlow = this.b;
                        Initialization initialization = Initialization.FAILURE;
                        dVar.a = vVar3;
                        dVar.b = nVar2;
                        dVar.c = metricsRecorder4;
                        dVar.d = timerEvent4;
                        dVar.f = j4;
                        dVar.i = 1;
                    } else if (vVar3 instanceof v.b) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "sdk init success", null, false, 12, null);
                        Init.SDKInitResponse sDKInitResponse3 = (Init.SDKInitResponse) ((v.b) vVar3).a();
                        this.d = sDKInitResponse3;
                        MutableStateFlow<Initialization> mutableStateFlow2 = this.b;
                        Initialization initialization2 = Initialization.SUCCESS;
                        dVar.a = this;
                        dVar.b = nVar2;
                        dVar.c = metricsRecorder4;
                        dVar.d = timerEvent4;
                        dVar.e = sDKInitResponse3;
                        dVar.f = j4;
                        dVar.i = 3;
                        if (mutableStateFlow2.emit(initialization2, dVar) != coroutine_suspended) {
                            sDKInitResponse = sDKInitResponse3;
                            j3 = j4;
                            wVar = this;
                            dVar.a = wVar;
                            dVar.b = metricsRecorder4;
                            dVar.c = timerEvent4;
                            dVar.d = sDKInitResponse;
                            dVar.e = null;
                            dVar.i = 4;
                            if (nVar2.a(j3, dVar) != coroutine_suspended) {
                            }
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    long j5 = dVar.f;
                    TimerEvent timerEvent5 = (TimerEvent) dVar.d;
                    MetricsRecorder metricsRecorder5 = (MetricsRecorder) dVar.c;
                    com.moloco.sdk.internal.services.init.n nVar3 = (com.moloco.sdk.internal.services.init.n) dVar.b;
                    com.moloco.sdk.internal.v<Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar4 = (com.moloco.sdk.internal.v) dVar.a;
                    ResultKt.throwOnFailure(obj);
                    timerEvent4 = timerEvent5;
                    j4 = j5;
                    vVar3 = vVar4;
                    metricsRecorder4 = metricsRecorder5;
                    nVar2 = nVar3;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "sdk init failed", null, false, 12, null);
                    com.moloco.sdk.internal.services.init.j jVar2 = (com.moloco.sdk.internal.services.init.j) ((v.a) vVar3).a();
                    dVar.a = vVar3;
                    dVar.b = metricsRecorder4;
                    dVar.c = timerEvent4;
                    dVar.d = null;
                    dVar.i = 2;
                    if (nVar2.a(jVar2, j4, dVar) != coroutine_suspended) {
                        vVar2 = vVar3;
                        metricsRecorder2 = metricsRecorder4;
                        timerEvent2 = timerEvent4;
                        jVar = (com.moloco.sdk.internal.services.init.j) ((v.a) vVar2).a();
                        if (!(jVar instanceof j.a)) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 == 2) {
                    timerEvent2 = (TimerEvent) dVar.c;
                    metricsRecorder2 = (MetricsRecorder) dVar.b;
                    vVar2 = (com.moloco.sdk.internal.v) dVar.a;
                    ResultKt.throwOnFailure(obj);
                    jVar = (com.moloco.sdk.internal.services.init.j) ((v.a) vVar2).a();
                    if (!(jVar instanceof j.a)) {
                        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c());
                        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                        j.a aVar = (j.a) jVar;
                        metricsRecorder2.recordCountEvent(countEvent.withTag(dVar2.c(), aVar.a().name()));
                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), aVar.a().name()));
                    } else if (jVar instanceof j.b) {
                        CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c());
                        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                        j.b bVar = (j.b) jVar;
                        metricsRecorder2.recordCountEvent(countEvent2.withTag(dVar3.c(), String.valueOf(bVar.a())));
                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar3.c(), String.valueOf(bVar.a())));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i2 == 3) {
                        j3 = dVar.f;
                        sDKInitResponse = (Init.SDKInitResponse) dVar.e;
                        TimerEvent timerEvent6 = (TimerEvent) dVar.d;
                        metricsRecorder4 = (MetricsRecorder) dVar.c;
                        com.moloco.sdk.internal.services.init.n nVar4 = (com.moloco.sdk.internal.services.init.n) dVar.b;
                        wVar = (w) dVar.a;
                        ResultKt.throwOnFailure(obj);
                        timerEvent4 = timerEvent6;
                        nVar2 = nVar4;
                        dVar.a = wVar;
                        dVar.b = metricsRecorder4;
                        dVar.c = timerEvent4;
                        dVar.d = sDKInitResponse;
                        dVar.e = null;
                        dVar.i = 4;
                        if (nVar2.a(j3, dVar) != coroutine_suspended) {
                            sDKInitResponse2 = sDKInitResponse;
                            metricsRecorder3 = metricsRecorder4;
                            timerEvent3 = timerEvent4;
                            wVar2 = wVar;
                            CountEvent countEvent3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b.c());
                            com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.e;
                            String c2 = dVar4.c();
                            String countryIso2Code = sDKInitResponse2.getCountryIso2Code();
                            Intrinsics.checkNotNullExpressionValue(countryIso2Code, "getCountryIso2Code(...)");
                            metricsRecorder3.recordCountEvent(countEvent3.withTag(c2, countryIso2Code));
                            TimerEvent withTag = timerEvent3.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success");
                            String c3 = dVar4.c();
                            String countryIso2Code2 = sDKInitResponse2.getCountryIso2Code();
                            Intrinsics.checkNotNullExpressionValue(countryIso2Code2, "getCountryIso2Code(...)");
                            metricsRecorder3.recordTimerEvent(withTag.withTag(c3, countryIso2Code2));
                            MutableStateFlow<InterfaceC2784a> mutableStateFlow3 = wVar2.e;
                            InterfaceC2784a a2 = a.f.a.a(sDKInitResponse2);
                            dVar.a = null;
                            dVar.b = null;
                            dVar.c = null;
                            dVar.d = null;
                            dVar.i = 5;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 == 4) {
                        sDKInitResponse2 = (Init.SDKInitResponse) dVar.d;
                        timerEvent3 = (TimerEvent) dVar.c;
                        metricsRecorder3 = (MetricsRecorder) dVar.b;
                        wVar2 = (w) dVar.a;
                        ResultKt.throwOnFailure(obj);
                        CountEvent countEvent32 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b.c());
                        com.moloco.sdk.internal.client_metrics_data.d dVar42 = com.moloco.sdk.internal.client_metrics_data.d.e;
                        String c22 = dVar42.c();
                        String countryIso2Code3 = sDKInitResponse2.getCountryIso2Code();
                        Intrinsics.checkNotNullExpressionValue(countryIso2Code3, "getCountryIso2Code(...)");
                        metricsRecorder3.recordCountEvent(countEvent32.withTag(c22, countryIso2Code3));
                        TimerEvent withTag2 = timerEvent3.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success");
                        String c32 = dVar42.c();
                        String countryIso2Code22 = sDKInitResponse2.getCountryIso2Code();
                        Intrinsics.checkNotNullExpressionValue(countryIso2Code22, "getCountryIso2Code(...)");
                        metricsRecorder3.recordTimerEvent(withTag2.withTag(c32, countryIso2Code22));
                        MutableStateFlow<InterfaceC2784a> mutableStateFlow32 = wVar2.e;
                        InterfaceC2784a a22 = a.f.a.a(sDKInitResponse2);
                        dVar.a = null;
                        dVar.b = null;
                        dVar.c = null;
                        dVar.d = null;
                        dVar.i = 5;
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dVar.i;
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }
}
