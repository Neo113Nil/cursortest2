package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.ortb.model.C2792f;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes3.dex */
public final class y implements InterfaceC2819b {
    public static final int h = 8;
    public final CoroutineScope a;
    public final C2791e b;
    public final InterfaceC2833m c;
    public final Function1<Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> d;
    public final MutableStateFlow<Boolean> e;
    public final StateFlow<Boolean> f;
    public com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> g;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1", f = "MraidAdLoad.kt", i = {0}, l = {60, 80}, m = "invokeSuspend", n = {"decDeferred"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC2819b.a e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1", f = "MraidAdLoad.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a, reason: collision with other inner class name */
        public static final class C0380a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C2829i>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C2829i c;
            public final /* synthetic */ y d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1$1", f = "MraidAdLoad.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a$a, reason: collision with other inner class name */
            public static final class C0381a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C2829i>, Object> {
                public Object a;
                public int b;
                public final /* synthetic */ C2829i c;
                public final /* synthetic */ y d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0381a(C2829i c2829i, y yVar, Continuation<? super C0381a> continuation) {
                    super(2, continuation);
                    this.c = c2829i;
                    this.d = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C2829i> continuation) {
                    return ((C0381a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0381a(this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C2829i c2829i;
                    C2792f ext;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C2829i c2829i2 = this.c;
                        String str = null;
                        if (c2829i2 == null) {
                            return null;
                        }
                        y yVar = this.d;
                        try {
                            InterfaceC2833m interfaceC2833m = yVar.c;
                            C2791e c2791e = yVar.b;
                            if (c2791e != null && (ext = c2791e.getExt()) != null) {
                                str = ext.getMtid();
                            }
                            this.a = c2829i2;
                            this.b = 1;
                            Object a = interfaceC2833m.a(c2829i2, str, this);
                            if (a == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c2829i = c2829i2;
                            obj = a;
                        } catch (Exception unused) {
                            return c2829i2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2829i = (C2829i) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception unused2) {
                            return c2829i;
                        }
                    }
                    return (C2829i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0380a(long j, C2829i c2829i, y yVar, Continuation<? super C0380a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c2829i;
                this.d = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C2829i> continuation) {
                return ((C0380a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0380a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C0381a c0381a = new C0381a(this.c, this.d, null);
                    this.a = 1;
                    obj = TimeoutKt.m12683withTimeoutOrNullKLykuaI(j, c0381a, this);
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

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1", f = "MraidAdLoad.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ y c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1$1", f = "MraidAdLoad.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$b$a, reason: collision with other inner class name */
            public static final class C0382a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {
                public int a;
                public final /* synthetic */ y b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0382a(y yVar, Continuation<? super C0382a> continuation) {
                    super(2, continuation);
                    this.b = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
                    return ((C0382a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0382a(this.b, continuation);
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
                    Function1 function1 = this.b.d;
                    this.a = 1;
                    Object invoke = function1.invoke(this);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, y yVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
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
                C0382a c0382a = new C0382a(this.c, null);
                this.a = 1;
                Object m12683withTimeoutOrNullKLykuaI = TimeoutKt.m12683withTimeoutOrNullKLykuaI(j, c0382a, this);
                return m12683withTimeoutOrNullKLykuaI == coroutine_suspended ? coroutine_suspended : m12683withTimeoutOrNullKLykuaI;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2819b.a aVar, long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = y.this.new a(this.e, this.f, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00fb  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.Deferred, kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            C2792f ext;
            com.moloco.sdk.internal.ortb.model.z player;
            com.moloco.sdk.internal.ortb.model.l lVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar;
            y yVar;
            InterfaceC2819b.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.b;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.c;
                    if (y.this.a() instanceof v.b) {
                        InterfaceC2819b.a aVar2 = this.e;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        return Unit.INSTANCE;
                    }
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b(this.f, y.this, null), 3, null);
                    C2791e c2791e = y.this.b;
                    async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C0380a(this.f, (c2791e == null || (ext = c2791e.getExt()) == null || (player = ext.getPlayer()) == null || (lVar = player.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String()) == null) ? null : com.moloco.sdk.internal.l.a(lVar), y.this, null), 3, null);
                    this.c = async$default2;
                    this.b = 1;
                    obj = async$default.await(this);
                    r1 = async$default2;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) this.a;
                        yVar = (y) this.c;
                        ResultKt.throwOnFailure(obj);
                        yVar.a(new v.b(cVar.a((C2829i) obj)));
                        y.this.e.setValue(Boxing.boxBoolean(true));
                        aVar = this.e;
                        if (aVar != null) {
                            aVar.a();
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferred = (Deferred) this.c;
                    ResultKt.throwOnFailure(obj);
                    r1 = deferred;
                }
                com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) obj;
                if (vVar == null) {
                    InterfaceC2819b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.c);
                    }
                } else {
                    if (!(vVar instanceof v.a)) {
                        if (!(vVar instanceof v.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y yVar2 = y.this;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((v.b) vVar).a();
                        this.c = yVar2;
                        this.a = cVar2;
                        this.b = 2;
                        Object await = r1.await(this);
                        if (await != coroutine_suspended) {
                            cVar = cVar2;
                            obj = await;
                            yVar = yVar2;
                            yVar.a(new v.b(cVar.a((C2829i) obj)));
                            y.this.e.setValue(Boxing.boxBoolean(true));
                            aVar = this.e;
                            if (aVar != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    InterfaceC2819b.a aVar4 = this.e;
                    if (aVar4 != null) {
                        aVar4.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((v.a) vVar).a());
                    }
                    Job.DefaultImpls.cancel$default((Job) r1, (CancellationException) null, 1, (Object) null);
                }
                return Unit.INSTANCE;
            } catch (TimeoutCancellationException unused) {
                Job.DefaultImpls.cancel$default((Job) r1, (CancellationException) null, 1, (Object) null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                y.this.a(new v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                InterfaceC2819b.a aVar6 = this.e;
                if (aVar6 != null) {
                    aVar6.a(aVar5);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(CoroutineScope scope, C2791e c2791e, InterfaceC2833m decLoader, Function1<? super Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, ? extends Object> loadAndReadyMraid) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(loadAndReadyMraid, "loadAndReadyMraid");
        this.a = scope;
        this.b = c2791e;
        this.c = decLoader;
        this.d = loadAndReadyMraid;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        this.g = new v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public StateFlow<Boolean> isLoaded() {
        return this.f;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.g;
    }

    public final void a(com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.g = vVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public void a(long j, InterfaceC2819b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new a(aVar, j, null), 3, null);
    }
}
