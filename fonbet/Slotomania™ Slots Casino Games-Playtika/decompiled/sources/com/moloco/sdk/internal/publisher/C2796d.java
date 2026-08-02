package com.moloco.sdk.internal.publisher;

import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.a;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.ortb.model.C2792f;
import com.moloco.sdk.internal.services.L;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* renamed from: com.moloco.sdk.internal.publisher.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2796d implements AdLoad {
    public static final a p = new a(null);
    public static final int q = 8;

    @Deprecated
    public static final String r = "AdLoad";
    public final Function1<Long, Duration> a;
    public final String b;
    public final Function1<C2791e, InterfaceC2819b> c;
    public final com.moloco.sdk.internal.ortb.b d;
    public final q e;
    public final AdFormatType f;
    public final L g;
    public final MetricsRecorder h;
    public final Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> i;
    public final CoroutineScope j;
    public boolean k;
    public String l;
    public com.moloco.sdk.internal.ortb.model.g m;
    public final TimerEvent n;
    public Job o;

    /* renamed from: com.moloco.sdk.internal.publisher.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$load$2", f = "AdLoad.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.d$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdLoad.Listener listener, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = listener;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2796d.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2792f ext;
            C2792f ext2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C2796d c2796d = C2796d.this;
                String str = this.c;
                this.a = 1;
                obj = c2796d.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str2 = (String) obj;
            if (str2 == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                AdLoad.Listener listener = this.d;
                if (listener != null) {
                    listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(C2796d.this.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                MetricsRecorder metricsRecorder = C2796d.this.h;
                TimerEvent withTag = C2796d.this.n.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c = dVar.c();
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                TimerEvent withTag2 = withTag.withTag(c, String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                String c2 = dVar2.c();
                String name = C2796d.this.f.name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                MetricsRecorder metricsRecorder2 = C2796d.this.h;
                CountEvent withTag3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), String.valueOf(errorType.getErrorCode()));
                String c3 = dVar2.c();
                String lowerCase2 = C2796d.this.f.name().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                return Unit.INSTANCE;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, C2796d.r, "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            y a = C2799g.a(this.d, C2796d.this.n, C2796d.this.f, C2796d.this.h, C2796d.this.i);
            if (Intrinsics.areEqual(C2796d.this.l, str2)) {
                if (C2796d.this.isLoaded()) {
                    com.moloco.sdk.internal.ortb.model.B b = null;
                    MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(C2796d.this.b, null, null, 6, null);
                    long j = this.e;
                    C2796d c2796d2 = C2796d.this;
                    C2791e a2 = c2796d2.a(c2796d2.m);
                    a.a(createAdInfo$default, j, (a2 == null || (ext2 = a2.getExt()) == null) ? null : ext2.getSdkEvents());
                    C2796d c2796d3 = C2796d.this;
                    C2791e a3 = c2796d3.a(c2796d3.m);
                    if (a3 != null && (ext = a3.getExt()) != null) {
                        b = ext.getSdkEvents();
                    }
                    a.a(createAdInfo$default, b);
                    return Unit.INSTANCE;
                }
                Job job = C2796d.this.o;
                if (job != null && job.isActive()) {
                    MolocoLogger.info$default(molocoLogger, C2796d.r, "Already loading ad " + C2796d.this.f + ' ' + C2796d.this.b + ". Returning", null, false, 12, null);
                    return Unit.INSTANCE;
                }
            }
            C2796d.this.a(str2, this.e, a);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl", f = "AdLoad.kt", i = {0}, l = {168}, m = "processBidResponse", n = {"bidResponseJson"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.d$c */
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
            return C2796d.this.a((String) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1", f = "AdLoad.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.d$d, reason: collision with other inner class name */
    public static final class C0247d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public long b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ y h;

        /* renamed from: com.moloco.sdk.internal.publisher.d$d$a */
        public static final class a implements InterfaceC2819b.a {
            public final /* synthetic */ C2796d a;
            public final /* synthetic */ y b;
            public final /* synthetic */ C2791e c;

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoad$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$a, reason: collision with other inner class name */
            public static final class C0248a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ C2796d b;
                public final /* synthetic */ y c;
                public final /* synthetic */ C2791e d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0248a(C2796d c2796d, y yVar, C2791e c2791e, Continuation<? super C0248a> continuation) {
                    super(2, continuation);
                    this.b = c2796d;
                    this.c = yVar;
                    this.d = c2791e;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0248a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0248a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C2792f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = true;
                    y yVar = this.c;
                    MolocoAd createAdInfo = MolocoAdKt.createAdInfo(this.b.b, Boxing.boxFloat(this.d.getPrice()), this.d.getCrid());
                    C2796d c2796d = this.b;
                    C2791e a = c2796d.a(c2796d.m);
                    yVar.a(createAdInfo, (a == null || (ext = a.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadError$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$b */
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ C2796d b;
                public final /* synthetic */ y c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C2796d c2796d, y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = c2796d;
                    this.c = yVar;
                    this.d = cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C2792f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    y yVar = this.c;
                    com.moloco.sdk.internal.s a = com.moloco.sdk.internal.t.a(this.b.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.d, null, 8, null);
                    C2796d c2796d = this.b;
                    C2791e a2 = c2796d.a(c2796d.m);
                    yVar.a(a, (a2 == null || (ext = a2.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadTimeout$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$c */
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ C2796d b;
                public final /* synthetic */ y c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(C2796d c2796d, y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.b = c2796d;
                    this.c = yVar;
                    this.d = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C2792f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    y yVar = this.c;
                    com.moloco.sdk.internal.s a = com.moloco.sdk.internal.t.a(this.b.b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.d, null, 8, null);
                    C2796d c2796d = this.b;
                    C2791e a2 = c2796d.a(c2796d.m);
                    yVar.a(a, (a2 == null || (ext = a2.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            public a(C2796d c2796d, y yVar, C2791e c2791e) {
                this.a = c2796d;
                this.b = yVar;
                this.c = c2791e;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
            public void a() {
                BuildersKt__Builders_commonKt.launch$default(this.a.j, null, null, new C0248a(this.a, this.b, this.c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                BuildersKt__Builders_commonKt.launch$default(this.a.j, null, null, new c(this.a, this.b, timeoutError, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                BuildersKt__Builders_commonKt.launch$default(this.a.j, null, null, new b(this.a, this.b, internalError, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0247d(String str, long j, y yVar, Continuation<? super C0247d> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = j;
            this.h = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0247d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0247d c0247d = C2796d.this.new C0247d(this.f, this.g, this.h, continuation);
            c0247d.d = obj;
            return c0247d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
        
            if (r6 != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
        
            if (r2 != null) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0172  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.internal.ortb.model.g gVar;
            C2796d c2796d;
            long j;
            Object a2;
            y yVar;
            C2791e a3;
            C2792f ext;
            String str;
            Map emptyMap;
            C2792f ext2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            com.moloco.sdk.internal.ortb.model.B b = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.d;
                C2796d.this.k = false;
                if (!Intrinsics.areEqual(C2796d.this.l, this.f)) {
                    C2796d.this.l = this.f;
                    C2796d.this.m = null;
                }
                gVar = C2796d.this.m;
                if (gVar == null) {
                    c2796d = C2796d.this;
                    String str2 = this.f;
                    y yVar2 = this.h;
                    j = this.g;
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    com.moloco.sdk.internal.ortb.b bVar = c2796d.d;
                    this.d = c2796d;
                    this.a = yVar2;
                    this.b = j;
                    this.c = 1;
                    a2 = bVar.a(str2, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                }
                a3 = gVar == null ? C2796d.this.a(gVar) : null;
                if (a3 == null) {
                    ((InterfaceC2819b) C2796d.this.c.invoke(a3)).a(((Duration) C2796d.this.a.invoke(Boxing.boxLong(this.g))).getRawValue(), new a(C2796d.this, this.h, a3));
                    return Unit.INSTANCE;
                }
                y yVar3 = this.h;
                C2796d c2796d2 = C2796d.this;
                com.moloco.sdk.internal.s a4 = com.moloco.sdk.internal.t.a(c2796d2.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.e, null, 8, null);
                C2791e a5 = c2796d2.a(c2796d2.m);
                if (a5 != null && (ext = a5.getExt()) != null) {
                    b = ext.getSdkEvents();
                }
                yVar3.a(a4, b);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.b;
            yVar = (y) this.a;
            c2796d = (C2796d) this.d;
            ResultKt.throwOnFailure(obj);
            j = j2;
            a2 = obj;
            com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) a2;
            if (!(vVar instanceof v.b)) {
                if (!(vVar instanceof v.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                v.a aVar = (v.a) vVar;
                com.moloco.sdk.internal.o a6 = c2796d.a((com.moloco.sdk.internal.ortb.a) aVar.a());
                Object a7 = aVar.a();
                a.C0242a c0242a = a7 instanceof a.C0242a ? (a.C0242a) a7 : null;
                Exception b2 = c0242a != null ? c0242a.b() : null;
                Object a8 = aVar.a();
                a.b bVar2 = a8 instanceof a.b ? (a.b) a8 : null;
                List<String> b3 = bVar2 != null ? bVar2.b() : null;
                if (b3 != null) {
                    List<String> list = !b3.isEmpty() ? b3 : null;
                    if (list != null) {
                        str = CollectionsKt.joinToString$default(list, ",", " missingFields=", null, 0, null, null, 60, null);
                    }
                }
                str = "";
                MolocoLogger.error$default(MolocoLogger.INSTANCE, C2796d.r, "startLoadJob failed to parse BID json string. subType=" + a6 + str, b2, false, 8, null);
                if (b3 != null) {
                    List<String> list2 = !b3.isEmpty() ? b3 : null;
                    if (list2 != null) {
                        String joinToString$default = CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null);
                        if (joinToString$default != null) {
                            emptyMap = MapsKt.mapOf(TuplesKt.to("missing_fields", joinToString$default));
                        }
                    }
                }
                emptyMap = MapsKt.emptyMap();
                yVar.a(com.moloco.sdk.internal.t.a(c2796d.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, a6, emptyMap), (com.moloco.sdk.internal.ortb.model.B) null);
                return Unit.INSTANCE;
            }
            com.moloco.sdk.internal.ortb.model.g gVar2 = (com.moloco.sdk.internal.ortb.model.g) ((v.b) vVar).a();
            c2796d.m = gVar2;
            MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(c2796d.b, null, null, 6, null);
            C2791e a9 = c2796d.a(c2796d.m);
            yVar.a(createAdInfo$default, j, (a9 == null || (ext2 = a9.getExt()) == null) ? null : ext2.getSdkEvents());
            gVar = gVar2;
            if (gVar == null) {
            }
            if (a3 == null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2796d(CoroutineScope scope, Function1<? super Long, Duration> timeout, String adUnitId, Function1<? super C2791e, ? extends InterfaceC2819b> recreateXenossAdLoader, com.moloco.sdk.internal.ortb.b parseBidResponse, q adLoadPreprocessor, AdFormatType adFormatType, L webViewChecker, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(parseBidResponse, "parseBidResponse");
        Intrinsics.checkNotNullParameter(adLoadPreprocessor, "adLoadPreprocessor");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = timeout;
        this.b = adUnitId;
        this.c = recreateXenossAdLoader;
        this.d = parseBidResponse;
        this.e = adLoadPreprocessor;
        this.f = adFormatType;
        this.g = webViewChecker;
        this.h = metricsRecorder;
        this.i = function0;
        this.j = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.n = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.j.c());
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(this.g.a());
        if (m11183exceptionOrNullimpl != null) {
            MolocoLogger.INSTANCE.error(r, "WebView Error: " + m11183exceptionOrNullimpl.getMessage(), m11183exceptionOrNullimpl, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.b, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long a2 = a.h.a.i().a();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: " + bidResponseJson, false, 4, null);
        this.n.startTimer();
        MetricsRecorder metricsRecorder = this.h;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.f.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new b(bidResponseJson, listener, a2, null), 3, null);
    }

    public final C2791e a(com.moloco.sdk.internal.ortb.model.g gVar) {
        List<com.moloco.sdk.internal.ortb.model.C> b2;
        com.moloco.sdk.internal.ortb.model.C c2;
        List<C2791e> b3;
        if (gVar == null || (b2 = gVar.b()) == null || (c2 = b2.get(0)) == null || (b3 = c2.b()) == null) {
            return null;
        }
        return b3.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation<? super String> continuation) {
        c cVar;
        int i;
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
                    q qVar = this.e;
                    cVar.a = str;
                    cVar.d = 1;
                    obj = qVar.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                String str2 = (String) obj;
                return str2 == null ? str2 : str;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        if (str22 == null) {
        }
    }

    public final void a(String str, long j, y yVar) {
        Job launch$default;
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new C0247d(str, j, yVar, null), 3, null);
        this.o = launch$default;
    }

    public final com.moloco.sdk.internal.o a(com.moloco.sdk.internal.ortb.a aVar) {
        if (aVar instanceof a.C0242a) {
            return com.moloco.sdk.internal.o.c;
        }
        if (aVar instanceof a.b) {
            return com.moloco.sdk.internal.o.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C2796d(CoroutineScope coroutineScope, Function1 function1, String str, Function1 function12, com.moloco.sdk.internal.ortb.b bVar, q qVar, AdFormatType adFormatType, L l, MetricsRecorder metricsRecorder, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, function1, str, function12, bVar, qVar, adFormatType, l, metricsRecorder, (i & 512) != 0 ? null : function0);
    }
}
