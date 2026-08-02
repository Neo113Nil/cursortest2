package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2822c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public static final int t = 8;
    public final Context a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final C2791e c;
    public final r d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y e;
    public final MetricsRecorder f;
    public final String g;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i h;
    public final CoroutineScope i;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> l;
    public final v m;
    public final MutableStateFlow<Boolean> n;
    public final StateFlow<Boolean> o;
    public final MutableStateFlow<Boolean> p;
    public final StateFlow<Boolean> q;
    public final MutableStateFlow<Boolean> r;
    public final StateFlow<Boolean> s;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$load$1", f = "AggregatedFullscreenAd.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC2819b.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a */
        public static final class a implements InterfaceC2819b.a {
            public final /* synthetic */ InterfaceC2819b.a a;
            public final /* synthetic */ C2822c b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0287a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.values().length];
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    a = iArr;
                }
            }

            public a(InterfaceC2819b.a aVar, C2822c c2822c) {
                this.a = aVar;
                this.b = c2822c;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
            public void a() {
                InterfaceC2819b.a aVar = this.a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType = this.b.getCreativeType();
                switch (creativeType == null ? -1 : C0287a.a[creativeType.ordinal()]) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "creativeType is null", null, false, 12, null);
                        return;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        InterfaceC2819b.a aVar = this.a;
                        if (aVar != null) {
                            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e);
                            return;
                        }
                        return;
                    case 2:
                        InterfaceC2819b.a aVar2 = this.a;
                        if (aVar2 != null) {
                            aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f);
                            return;
                        }
                        return;
                    case 3:
                        InterfaceC2819b.a aVar3 = this.a;
                        if (aVar3 != null) {
                            aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.g);
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                        return;
                    case 7:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                        return;
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                InterfaceC2819b.a aVar = this.a;
                if (aVar != null) {
                    aVar.a(internalError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, InterfaceC2819b.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2822c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C2822c c2822c = C2822c.this;
                this.a = 1;
                if (c2822c.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l n = C2822c.this.n();
            if (n != null) {
                n.a(this.c, new a(this.d, C2822c.this));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd", f = "AggregatedFullscreenAd.kt", i = {0}, l = {Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION_VALUE}, m = "prepareAd", n = {"this"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$c, reason: collision with other inner class name */
    public static final class C0288c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C0288c(Continuation<? super C0288c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C2822c.this.b(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$2", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$d */
    public static final class d extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C2822c.this.new d(continuation);
            dVar.b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C2822c.this.n.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$3", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$e */
    public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C2822c.this.new e(continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C2822c.this.p.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$4", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$f */
    public static final class f extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((f) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C2822c.this.new f(continuation);
            fVar.b = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C2822c.this.r.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$crType$1", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$g */
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2822c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c = C2828h.a.c(C2822c.this.c.getAdm());
            C2822c c2822c = C2822c.this;
            c2822c.h = c;
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, c2822c.g, "Native ad resolved creativeType: " + c, false, 4, null);
            return c;
        }
    }

    public C2822c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, C2791e bid, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = customUserEventBuilderService;
        this.c = bid;
        this.d = externalLinkHandler;
        this.e = watermark;
        this.f = metricsRecorder;
        this.g = "AggregatedFullscreenAd";
        this.h = iVar;
        this.i = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = new v();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.r = MutableStateFlow3;
        this.s = MutableStateFlow3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.i, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n = n();
        if (n != null) {
            n.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public StateFlow<Boolean> isLoaded() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public StateFlow<Boolean> k() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2818a
    public StateFlow<Boolean> l() {
        return this.q;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> lVar = this.j;
        if (lVar != null) {
            return lVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar2 = this.k;
        return lVar2 == null ? this.l : lVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation<? super Unit> continuation) {
        C0288c c0288c;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
        C2822c c2822c;
        com.moloco.sdk.internal.ortb.model.y mute;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n3;
        StateFlow<Boolean> k;
        Flow onEach;
        StateFlow<Boolean> l;
        Flow onEach2;
        StateFlow<Boolean> isLoaded;
        Flow onEach3;
        if (continuation instanceof C0288c) {
            c0288c = (C0288c) continuation;
            int i2 = c0288c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0288c.d = i2 - Integer.MIN_VALUE;
                Object obj = c0288c.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0288c.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    creativeType = getCreativeType();
                    if (creativeType != null) {
                        c2822c = this;
                        switch (a.a[creativeType.ordinal()]) {
                            case 1:
                                c2822c.j = c2822c.m.a(c2822c.a, c2822c.c, a.g.a.b().h(), c2822c.e, c2822c.f);
                                break;
                            case 2:
                                v vVar = c2822c.m;
                                Context context = c2822c.a;
                                CoroutineScope coroutineScope = c2822c.i;
                                C2791e c2791e = c2822c.c;
                                r rVar = c2822c.d;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = c2822c.e;
                                MutableStateFlow<Boolean> mutableStateFlow = c2822c.p;
                                com.moloco.sdk.internal.ortb.model.z player = c2791e.getExt().getPlayer();
                                c2822c.k = vVar.a(context, coroutineScope, c2791e, rVar, yVar, mutableStateFlow, (player == null || (mute = player.getMute()) == null) ? false : mute.getMute(), c2822c.f);
                                break;
                            case 3:
                                c2822c.l = c2822c.m.a(c2822c.a, c2822c.b, c2822c.c.getAdm(), c2822c.d, c2822c.e);
                                break;
                            case 4:
                            case 5:
                            case 6:
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, c2822c.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                                break;
                            case 7:
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, c2822c.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        n = c2822c.n();
                        if (n != null && (isLoaded = n.isLoaded()) != null && (onEach3 = FlowKt.onEach(isLoaded, c2822c.new d(null))) != null) {
                            FlowKt.launchIn(onEach3, c2822c.i);
                        }
                        n2 = c2822c.n();
                        if (n2 != null && (l = n2.l()) != null && (onEach2 = FlowKt.onEach(l, c2822c.new e(null))) != null) {
                            FlowKt.launchIn(onEach2, c2822c.i);
                        }
                        n3 = c2822c.n();
                        if (n3 != null && (k = n3.k()) != null && (onEach = FlowKt.onEach(k, c2822c.new f(null))) != null) {
                            FlowKt.launchIn(onEach, c2822c.i);
                        }
                        return Unit.INSTANCE;
                    }
                    CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    g gVar = new g(null);
                    c0288c.a = this;
                    c0288c.d = 1;
                    obj = BuildersKt.withContext(coroutineContext, gVar, c0288c);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c2822c = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2822c = (C2822c) c0288c.a;
                    ResultKt.throwOnFailure(obj);
                }
                creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj;
                switch (a.a[creativeType.ordinal()]) {
                }
                n = c2822c.n();
                if (n != null) {
                    FlowKt.launchIn(onEach3, c2822c.i);
                }
                n2 = c2822c.n();
                if (n2 != null) {
                    FlowKt.launchIn(onEach2, c2822c.i);
                }
                n3 = c2822c.n();
                if (n3 != null) {
                    FlowKt.launchIn(onEach, c2822c.i);
                }
                return Unit.INSTANCE;
            }
        }
        c0288c = new C0288c(continuation);
        Object obj2 = c0288c.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0288c.d;
        if (i != 0) {
        }
        creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj2;
        switch (a.a[creativeType.ordinal()]) {
        }
        n = c2822c.n();
        if (n != null) {
        }
        n2 = c2822c.n();
        if (n2 != null) {
        }
        n3 = c2822c.n();
        if (n3 != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public void a(long j, InterfaceC2819b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new b(j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(options, "options");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> lVar = this.j;
        if (lVar != null) {
            lVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x>) options.c(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) gVar);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar2 = this.k;
        if (lVar2 != null) {
            lVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) gVar);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar3 = this.l;
        if (lVar3 != null) {
            lVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) gVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || gVar == null) {
            return;
        }
        gVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.a);
        Unit unit4 = Unit.INSTANCE;
    }
}
