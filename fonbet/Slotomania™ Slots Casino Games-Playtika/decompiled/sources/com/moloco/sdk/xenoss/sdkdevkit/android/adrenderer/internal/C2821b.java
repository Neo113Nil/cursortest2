package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2821b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> {
    public static final int z = 8;
    public final Context h;
    public final C2791e i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h j;
    public final r k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y l;
    public final com.moloco.sdk.internal.A m;
    public final CoroutineScope n;
    public final com.moloco.sdk.internal.services.s o;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h p;
    public final String q;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g s;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> t;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> u;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> v;
    public final InterfaceC2819b w;
    public final MutableStateFlow<Boolean> x;
    public final StateFlow<Boolean> y;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a */
    public static final class a implements InterfaceC2819b {
        public final MutableStateFlow<Boolean> a;
        public final StateFlow<Boolean> b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0282a {
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

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$load$1", f = "AggregatedBanner.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b, reason: collision with other inner class name */
        public static final class C0283b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ C2821b c;
            public final /* synthetic */ long d;
            public final /* synthetic */ InterfaceC2819b.a e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a, reason: collision with other inner class name */
            public static final class C0284a implements InterfaceC2819b.a {
                public final /* synthetic */ InterfaceC2819b.a a;
                public final /* synthetic */ C2821b b;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0285a {
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

                public C0284a(InterfaceC2819b.a aVar, C2821b c2821b) {
                    this.a = aVar;
                    this.b = c2821b;
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
                    switch (creativeType == null ? -1 : C0285a.a[creativeType.ordinal()]) {
                        case -1:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.q, "creativeType is null", new Throwable(), false, 8, null);
                            return;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            InterfaceC2819b.a aVar = this.a;
                            if (aVar != null) {
                                aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.h);
                                return;
                            }
                            return;
                        case 2:
                            InterfaceC2819b.a aVar2 = this.a;
                            if (aVar2 != null) {
                                aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.i);
                                return;
                            }
                            return;
                        case 3:
                            InterfaceC2819b.a aVar3 = this.a;
                            if (aVar3 != null) {
                                aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.j);
                                return;
                            }
                            return;
                        case 4:
                        case 5:
                        case 6:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.q, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                            return;
                        case 7:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.q, "Unknown creative type for timeout error", null, false, 12, null);
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
            public C0283b(C2821b c2821b, long j, InterfaceC2819b.a aVar, Continuation<? super C0283b> continuation) {
                super(2, continuation);
                this.c = c2821b;
                this.d = j;
                this.e = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0283b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return a.this.new C0283b(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = a.this;
                    this.a = 1;
                    if (aVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl = this.c.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.a(this.d, new C0284a(this.e, this.c));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1", f = "AggregatedBanner.kt", i = {0}, l = {160}, m = "prepareBanner", n = {"this"}, s = {"L$0"})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$c */
        public static final class c extends ContinuationImpl {
            public Object a;
            public /* synthetic */ Object b;
            public int d;

            public c(Continuation<? super c> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$2", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$d */
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
                d dVar = a.this.new d(continuation);
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
                a.this.a.setValue(Boxing.boxBoolean(this.b));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$3", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$e */
        public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ C2821b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C2821b c2821b, Continuation<? super e> continuation) {
                super(2, continuation);
                this.c = c2821b;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.c, continuation);
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
                this.c.x.setValue(Boxing.boxBoolean(this.b));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$crType$1", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$f */
        public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i>, Object> {
            public int a;
            public final /* synthetic */ C2821b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C2821b c2821b, Continuation<? super f> continuation) {
                super(2, continuation);
                this.b = c2821b;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> continuation) {
                return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c = C2828h.a.c(this.b.i.getAdm());
                this.b.r = c;
                return c;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            this.d = aVar;
            MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.a = MutableStateFlow;
            this.b = FlowKt.asStateFlow(MutableStateFlow);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
        public StateFlow<Boolean> isLoaded() {
            return this.b;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
        public void a(long j, InterfaceC2819b.a aVar) {
            BuildersKt__Builders_commonKt.launch$default(C2821b.this.n, null, null, new C0283b(C2821b.this, j, aVar, null), 3, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(Continuation<? super Unit> continuation) {
            c cVar;
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl2;
            StateFlow<Boolean> l;
            Flow onEach;
            StateFlow<Boolean> isLoaded;
            Flow onEach2;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, C2821b.this.q, "Preparing banner", false, 4, null);
                        creativeType = C2821b.this.getCreativeType();
                        if (creativeType != null) {
                            aVar = this;
                            switch (C0282a.a[creativeType.ordinal()]) {
                                case 1:
                                    C2821b.this.m.a(C2821b.this);
                                    C2821b.this.t = new N(C2821b.this.h, aVar.d, C2821b.this.j.c(), C2821b.this.k, C2821b.this.n, new L(C2821b.this.i, C2821b.this.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(C2821b.this.h), a.C0269a.a.a(), true, null, 32, null));
                                    break;
                                case 2:
                                    C2821b.this.u = new z(C2821b.this.h, C2821b.this.i.getAdm(), C2821b.this.k, C2821b.this.l, null, C2821b.this.n, 16, null);
                                    break;
                                case 3:
                                    Context context = C2821b.this.h;
                                    com.moloco.sdk.internal.services.s sVar = C2821b.this.o;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = C2821b.this.p;
                                    com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData = C2821b.this.i.getExt().getMolocoSdkClickMetaData();
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, sVar, hVar, (molocoSdkClickMetaData != null ? molocoSdkClickMetaData.getBannerClickMetaData() : null) != null, null, 34, null);
                                    C2821b.this.v = new F(C2821b.this.h, C2821b.this.l, aVar2, new E(C2821b.this.i.getAdm(), C2821b.this.n, aVar2), C2821b.this.n, null, 32, null);
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, C2821b.this.q, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                                    break;
                                case 7:
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, C2821b.this.q, "Unknown creative type for timeout error", null, false, 12, null);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            bannerImpl = C2821b.this.getBannerImpl();
                            if (bannerImpl != null && (isLoaded = bannerImpl.isLoaded()) != null && (onEach2 = FlowKt.onEach(isLoaded, aVar.new d(null))) != null) {
                                FlowKt.launchIn(onEach2, C2821b.this.n);
                            }
                            bannerImpl2 = C2821b.this.getBannerImpl();
                            if (bannerImpl2 != null && (l = bannerImpl2.l()) != null && (onEach = FlowKt.onEach(l, new e(C2821b.this, null))) != null) {
                                FlowKt.launchIn(onEach, C2821b.this.n);
                            }
                            C2821b c2821b = C2821b.this;
                            c2821b.setAdShowListener(c2821b.getAdShowListener());
                            return Unit.INSTANCE;
                        }
                        CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar = new f(C2821b.this, null);
                        cVar.a = this;
                        cVar.d = 1;
                        obj = BuildersKt.withContext(coroutineContext, fVar, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) cVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj;
                    switch (C0282a.a[creativeType.ordinal()]) {
                    }
                    bannerImpl = C2821b.this.getBannerImpl();
                    if (bannerImpl != null) {
                        FlowKt.launchIn(onEach2, C2821b.this.n);
                    }
                    bannerImpl2 = C2821b.this.getBannerImpl();
                    if (bannerImpl2 != null) {
                        FlowKt.launchIn(onEach, C2821b.this.n);
                    }
                    C2821b c2821b2 = C2821b.this;
                    c2821b2.setAdShowListener(c2821b2.getAdShowListener());
                    return Unit.INSTANCE;
                }
            }
            cVar = new c(continuation);
            Object obj2 = cVar.b;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cVar.d;
            if (i != 0) {
            }
            creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj2;
            switch (C0282a.a[creativeType.ordinal()]) {
            }
            bannerImpl = C2821b.this.getBannerImpl();
            if (bannerImpl != null) {
            }
            bannerImpl2 = C2821b.this.getBannerImpl();
            if (bannerImpl2 != null) {
            }
            C2821b c2821b22 = C2821b.this;
            c2821b22.setAdShowListener(c2821b22.getAdShowListener());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$destroy$1", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$b, reason: collision with other inner class name */
    public static final class C0286b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public C0286b(Continuation<? super C0286b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0286b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2821b.this.new C0286b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C2821b.super.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl = C2821b.this.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2821b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, C2791e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h options, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.A viewLifecycleOwner, CoroutineScope scope, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.h = context;
        this.i = bid;
        this.j = options;
        this.k = externalLinkHandler;
        this.l = watermark;
        this.m = viewLifecycleOwner;
        this.n = scope;
        this.o = clickthroughService;
        this.p = buttonTracker;
        this.q = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.r = iVar;
        this.w = new a(customUserEventBuilderService);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.x = MutableStateFlow;
        this.y = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<?> getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> b = this.t;
        if (b != null) {
            return b;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> b2 = this.u;
        return b2 == null ? this.v : b2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        BuildersKt__Builders_commonKt.launch$default(this.n, null, null, new C0286b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public InterfaceC2819b getAdLoader() {
        return this.w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g getAdShowListener() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2818a
    public StateFlow<Boolean> l() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void setAdShowListener(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.s = gVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> b = this.t;
        if (b != null) {
            b.setAdShowListener(gVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> b2 = this.u;
        if (b2 == null) {
            b2 = this.v;
        }
        if (b2 != null) {
            b2.setAdShowListener(gVar);
        }
    }
}
