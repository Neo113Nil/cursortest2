package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.ortb.model.C2792f;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class L implements InterfaceC2819b {
    public static final int m = 8;
    public final C2791e a;
    public final CoroutineScope b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d c;
    public final InterfaceC2833m d;
    public final boolean e;
    public final MetricsRecorder f;
    public com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g;
    public final MutableStateFlow<Boolean> h;
    public final StateFlow<Boolean> i;
    public Job j;
    public TimerEvent k;
    public String l;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$captureLoadMetrics$2", f = "VastAdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer e;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            L l = L.this;
            com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.a;
            com.moloco.sdk.internal.utils.e a = fVar.a(this.c.j().j());
            l.l = (a == null || (e = a.e()) == null) ? null : fVar.b(e.intValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1", f = "VastAdLoad.kt", i = {0}, l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135}, m = "invokeSuspend", n = {"decDeferred"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ InterfaceC2819b.a d;
        public final /* synthetic */ long e;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1", f = "VastAdLoad.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C2829i>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C2829i c;
            public final /* synthetic */ L d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$a$a, reason: collision with other inner class name */
            public static final class C0276a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C2829i>, Object> {
                public int a;
                public final /* synthetic */ C2829i b;
                public final /* synthetic */ L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0276a(C2829i c2829i, L l, Continuation<? super C0276a> continuation) {
                    super(2, continuation);
                    this.b = c2829i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C2829i> continuation) {
                    return ((C0276a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0276a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C2829i c2829i = this.b;
                        if (c2829i == null) {
                            return null;
                        }
                        L l = this.c;
                        InterfaceC2833m interfaceC2833m = l.d;
                        C2792f ext = l.a.getExt();
                        String mtid = ext != null ? ext.getMtid() : null;
                        this.a = 1;
                        obj = interfaceC2833m.a(c2829i, mtid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C2829i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, C2829i c2829i, L l, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c2829i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C2829i> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C0276a c0276a = new C0276a(this.c, this.d, null);
                    this.a = 1;
                    obj = TimeoutKt.m12683withTimeoutOrNullKLykuaI(j, c0276a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C2829i c2829i = (C2829i) obj;
                return c2829i == null ? this.c : c2829i;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1", f = "VastAdLoad.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b, reason: collision with other inner class name */
        public static final class C0277b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ L c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b$a */
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {
                public int a;
                public final /* synthetic */ L b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(L l, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = this.b.c;
                    String adm = this.b.a.getAdm();
                    String a = com.moloco.sdk.internal.ortb.model.h.a(this.b.a);
                    this.a = 1;
                    Object a2 = dVar.a(adm, a, false, this);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0277b(long j, L l, Continuation<? super C0277b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
                return ((C0277b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0277b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                long j = this.b;
                a aVar = new a(this.c, null);
                this.a = 1;
                Object m12682withTimeoutKLykuaI = TimeoutKt.m12682withTimeoutKLykuaI(j, aVar, this);
                return m12682withTimeoutKLykuaI == coroutine_suspended ? coroutine_suspended : m12682withTimeoutKLykuaI;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2819b.a aVar, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = aVar;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = L.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
        
            if (r1.a(r15, r14) != r0) goto L45;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.Deferred] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            com.moloco.sdk.internal.ortb.model.l lVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.a;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    if (L.this.d() instanceof v.b) {
                        InterfaceC2819b.a aVar2 = this.d;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        return Unit.INSTANCE;
                    }
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C0277b(this.e, L.this, null), 3, null);
                    com.moloco.sdk.internal.ortb.model.z player = L.this.a.getExt().getPlayer();
                    async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(this.e, (player == null || (lVar = player.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String()) == null) ? null : com.moloco.sdk.internal.l.a(lVar), L.this, null), 3, null);
                    this.b = async$default2;
                    this.a = 1;
                    obj = async$default.await(this);
                    r1 = async$default2;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (r1 == 1) {
                    Deferred deferred = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                    r1 = deferred;
                } else {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        L.this.h.setValue(Boxing.boxBoolean(true));
                        InterfaceC2819b.a aVar3 = this.d;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        return Unit.INSTANCE;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.b;
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar4;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C2829i) obj, 15, null);
                    L.this.a(new v.b(a2));
                    L l = L.this;
                    MetricsRecorder metricsRecorder = l.f;
                    l.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                    L l2 = L.this;
                    this.b = null;
                    this.a = 3;
                }
                com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof v.b)) {
                    if (!(vVar instanceof v.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.this.a((Deferred<C2829i>) r1, this.d, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((v.a) vVar).a());
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((v.b) vVar).a();
                this.b = aVar5;
                this.a = 2;
                Object await = r1.await(this);
                if (await != coroutine_suspended) {
                    aVar = aVar5;
                    obj = await;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C2829i) obj, 15, null);
                    L.this.a(new v.b(a22));
                    L l3 = L.this;
                    MetricsRecorder metricsRecorder2 = l3.f;
                    l3.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                    L l22 = L.this;
                    this.b = null;
                    this.a = 3;
                }
                return coroutine_suspended;
            } catch (TimeoutCancellationException unused) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, M.a, "main VAST ad didn't load due to timeout", false, 4, null);
                Job.DefaultImpls.cancel$default((Job) r1, (CancellationException) null, 1, (Object) null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
                L.this.a(new v.a(aVar6));
                InterfaceC2819b.a aVar7 = this.d;
                if (aVar7 != null) {
                    aVar7.a(aVar6);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1", f = "VastAdLoad.kt", i = {0, 1, 1}, l = {158, 173, 175, 178}, m = "invokeSuspend", n = {"$this$launch", "vastAdDeferred", "decDeferred"}, s = {"L$0", "L$0", "L$1"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC2819b.a e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1", f = "VastAdLoad.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C2829i>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C2829i c;
            public final /* synthetic */ L d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$c$a$a, reason: collision with other inner class name */
            public static final class C0278a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C2829i>, Object> {
                public int a;
                public final /* synthetic */ C2829i b;
                public final /* synthetic */ L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0278a(C2829i c2829i, L l, Continuation<? super C0278a> continuation) {
                    super(2, continuation);
                    this.b = c2829i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C2829i> continuation) {
                    return ((C0278a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0278a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C2829i c2829i = this.b;
                        if (c2829i == null) {
                            return null;
                        }
                        L l = this.c;
                        InterfaceC2833m interfaceC2833m = l.d;
                        String mtid = l.a.getExt().getMtid();
                        this.a = 1;
                        obj = interfaceC2833m.a(c2829i, mtid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C2829i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, C2829i c2829i, L l, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c2829i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C2829i> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C0278a c0278a = new C0278a(this.c, this.d, null);
                    this.a = 1;
                    obj = TimeoutKt.m12683withTimeoutOrNullKLykuaI(j, c0278a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C2829i c2829i = (C2829i) obj;
                return c2829i == null ? this.c : c2829i;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2819b.a aVar, long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = L.this.new c(this.e, this.f, continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x013b, code lost:
        
            if (r4.a(r2, r17) != r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0088, code lost:
        
            if (r8 == r1) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0155  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object a2;
            Deferred async$default;
            Object a3;
            com.moloco.sdk.internal.v vVar;
            Deferred deferred;
            com.moloco.sdk.internal.ortb.model.l lVar;
            com.moloco.sdk.internal.v vVar2;
            Object await;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                if (L.this.d() instanceof v.b) {
                    InterfaceC2819b.a aVar2 = this.e;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = L.this.c;
                String adm = L.this.a.getAdm();
                String a4 = com.moloco.sdk.internal.ortb.model.h.a(L.this.a);
                this.c = coroutineScope;
                this.b = 1;
                a2 = dVar.a(adm, a4, true, this);
            } else if (i == 1) {
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                a2 = obj;
            } else {
                if (i == 2) {
                    deferred = (Deferred) this.a;
                    com.moloco.sdk.internal.v vVar3 = (com.moloco.sdk.internal.v) this.c;
                    ResultKt.throwOnFailure(obj);
                    vVar = vVar3;
                    a3 = obj;
                    vVar2 = (com.moloco.sdk.internal.v) a3;
                    if (vVar2 instanceof v.b) {
                        if (!(vVar2 instanceof v.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, M.a, "main VAST ad didn't load due to failure or timeout", false, 4, null);
                        v.a aVar3 = (v.a) vVar2;
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) aVar3.a()).d()) {
                            L.this.b(deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar3.a());
                        } else {
                            L.this.a((Deferred<C2829i>) deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar3.a());
                        }
                        return Unit.INSTANCE;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((v.b) vVar).a();
                    this.c = aVar4;
                    this.a = null;
                    this.b = 3;
                    await = deferred.await(this);
                    if (await != coroutine_suspended) {
                        aVar = aVar4;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C2829i) await, 15, null);
                        L.this.a(new v.b(a5));
                        L l = L.this;
                        MetricsRecorder metricsRecorder = l.f;
                        l.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        L l2 = L.this;
                        this.c = null;
                        this.b = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    L.this.h.setValue(Boxing.boxBoolean(true));
                    InterfaceC2819b.a aVar5 = this.e;
                    if (aVar5 != null) {
                        aVar5.a();
                    }
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.c;
                ResultKt.throwOnFailure(obj);
                aVar = aVar6;
                await = obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a52 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C2829i) await, 15, null);
                L.this.a(new v.b(a52));
                L l3 = L.this;
                MetricsRecorder metricsRecorder2 = l3.f;
                l3.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                L l22 = L.this;
                this.c = null;
                this.b = 4;
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            com.moloco.sdk.internal.v vVar4 = (com.moloco.sdk.internal.v) a2;
            com.moloco.sdk.internal.ortb.model.z player = L.this.a.getExt().getPlayer();
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new a(this.f, (player == null || (lVar = player.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String()) == null) ? null : com.moloco.sdk.internal.l.a(lVar), L.this, null), 3, null);
            if (!(vVar4 instanceof v.b)) {
                if (!(vVar4 instanceof v.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                L.this.a((Deferred<C2829i>) async$default, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((v.a) vVar4).a());
                return Unit.INSTANCE;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = L.this.c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((v.b) vVar4).a();
            long j = this.f;
            this.c = vVar4;
            this.a = async$default;
            this.b = 2;
            a3 = dVar2.a(aVar7, j, this);
            if (a3 != coroutine_suspended) {
                vVar = vVar4;
                deferred = async$default;
                vVar2 = (com.moloco.sdk.internal.v) a3;
                if (vVar2 instanceof v.b) {
                }
            }
            return coroutine_suspended;
        }
    }

    public L(C2791e bid, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, InterfaceC2833m decLoader, boolean z, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        this.a = bid;
        this.b = scope;
        this.c = loadVast;
        this.d = decLoader;
        this.e = z;
        this.f = metricsRecorder;
        this.g = new v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.a);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public StateFlow<Boolean> isLoaded() {
        return this.i;
    }

    public final TimerEvent c() {
        return this.k;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d() {
        return this.g;
    }

    public final String b() {
        return this.l;
    }

    public final void c(long j, InterfaceC2819b.a aVar) {
        Job launch$default;
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new c(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void b(long j, InterfaceC2819b.a aVar) {
        Job launch$default;
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void a(com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.g = vVar;
    }

    public final void b(Deferred<C2829i> deferred, InterfaceC2819b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
        this.g = new v.a(cVar);
        if (aVar != null) {
            aVar.a(aVar2);
        }
    }

    public final Integer a() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> vVar = this.g;
        v.b bVar = vVar instanceof v.b ? (v.b) vVar : null;
        if (bVar == null || (aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) bVar.a()) == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = this.c.a(aVar.j().l());
        if (a2 instanceof c.a) {
            return 100;
        }
        if (a2 instanceof c.C0295c) {
            c.d d = ((c.C0295c) a2).d();
            if (d.d() > 0) {
                return Integer.valueOf((int) ((d.c() * 100) / d.d()));
            }
        } else if (!(a2 instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public /* synthetic */ L(C2791e c2791e, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, InterfaceC2833m interfaceC2833m, boolean z, MetricsRecorder metricsRecorder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2791e, coroutineScope, dVar, interfaceC2833m, z, (i & 32) != 0 ? null : metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public void a(long j, InterfaceC2819b.a aVar) {
        if (this.e) {
            c(j, aVar);
        } else {
            b(j, aVar);
        }
    }

    public final void a(Deferred<C2829i> deferred, InterfaceC2819b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, M.a, "Vast AD failed to load: " + cVar, null, false, 12, null);
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        this.g = new v.a(cVar);
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(aVar, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
