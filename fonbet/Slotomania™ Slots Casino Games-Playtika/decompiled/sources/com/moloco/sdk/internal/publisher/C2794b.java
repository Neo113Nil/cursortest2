package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.ViewParent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.InterfaceC2784a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.i;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.service_locator.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.moloco.sdk.internal.publisher.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2794b {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final String h = "UNABLE_TO_CREATE_AD";
    public static final String i = "AdCreator";
    public final StateFlow<Initialization> a;
    public final com.moloco.sdk.internal.services.J b;
    public final C2795c c;
    public final Function1<Continuation<? super InterfaceC2784a>, Object> d;
    public final CoroutineContext e;

    /* renamed from: com.moloco.sdk.internal.publisher.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.publisher.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0246b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Initialization.values().length];
            try {
                iArr[Initialization.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Initialization.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator", f = "AdCreator.kt", i = {0, 0, 0}, l = {TypedValues.CycleType.TYPE_PATH_ROTATE}, m = "awaitAdFactoryWithTimeoutOrNull", n = {"createAdType", "metricsRecorder", "awaitTimer"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$c */
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return C2794b.this.a(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$awaitAdFactoryWithTimeoutOrNull$2", f = "AdCreator.kt", i = {}, l = {TypedValues.CycleType.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.b$d */
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC2784a>, Object> {
        public int a;
        public final /* synthetic */ Function1<Continuation<? super InterfaceC2784a>, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Continuation<? super InterfaceC2784a>, ? extends Object> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC2784a> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, continuation);
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
            Function1<Continuation<? super InterfaceC2784a>, Object> function1 = this.b;
            this.a = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBanner$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKMetric.SDKMetricType.NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$e */
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super e> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2794b.this.new e(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String a;
            Object a2;
            TimerEvent timerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                tVar = t.a;
                long invoke = C2794b.this.b.invoke();
                a = C2794b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", a);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Creating " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                C2794b c2794b = C2794b.this;
                Function1 function1 = c2794b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar;
                this.b = a;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c2794b.a(function1, tVar, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = withTag;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                a = (String) this.b;
                tVar = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                a2 = obj;
            }
            String str = a;
            t tVar2 = tVar;
            InterfaceC2784a interfaceC2784a = (InterfaceC2784a) a2;
            if (interfaceC2784a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC2811f e = a.b.a.e();
                String str2 = this.h;
                a.h hVar = a.h.a;
                ViewParent b = interfaceC2784a.b(a3, e, str2, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C2793a(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), i.c.d, this.g);
                if (b != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (b instanceof s) {
                        ((s) b).setCreateAdObjectStartTime(j);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Created " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new v.b(b);
                }
            }
            MolocoAdError.AdCreateError a4 = C2794b.this.a(this.h, str, timerEvent, tVar2, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C2794b.i, "Failed to create " + tVar2 + " with reason: " + a4, null, false, 12, null);
            return new v.a(a4);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBannerTablet$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {120}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$f */
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super f> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2794b.this.new f(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String a;
            Object a2;
            TimerEvent timerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                tVar = t.b;
                long invoke = C2794b.this.b.invoke();
                a = C2794b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", a);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Creating " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                C2794b c2794b = C2794b.this;
                Function1 function1 = c2794b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar;
                this.b = a;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c2794b.a(function1, tVar, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = withTag;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                a = (String) this.b;
                tVar = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                a2 = obj;
            }
            String str = a;
            t tVar2 = tVar;
            InterfaceC2784a interfaceC2784a = (InterfaceC2784a) a2;
            if (interfaceC2784a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC2811f e = a.b.a.e();
                String str2 = this.h;
                a.h hVar = a.h.a;
                ViewParent c = interfaceC2784a.c(a3, e, str2, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C2793a(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), i.d.d, this.g);
                if (c != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (c instanceof s) {
                        ((s) c).setCreateAdObjectStartTime(j);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Created " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new v.b(c);
                }
            }
            MolocoAdError.AdCreateError a4 = C2794b.this.a(this.h, str, timerEvent, tVar2, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C2794b.i, "Failed to create " + tVar2 + " with reason: " + a4, null, false, 12, null);
            return new v.a(a4);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createInterstitial$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {262}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$g */
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<InterstitialAd, MolocoAdError.AdCreateError>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super g> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<InterstitialAd, MolocoAdError.AdCreateError>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2794b.this.new g(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String a;
            Object a2;
            TimerEvent timerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                tVar = t.f;
                long invoke = C2794b.this.b.invoke();
                a = C2794b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", a);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Creating " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                C2794b c2794b = C2794b.this;
                Function1 function1 = c2794b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar;
                this.b = a;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c2794b.a(function1, tVar, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = withTag;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                a = (String) this.b;
                tVar = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                a2 = obj;
            }
            String str = a;
            t tVar2 = tVar;
            InterfaceC2784a interfaceC2784a = (InterfaceC2784a) a2;
            if (interfaceC2784a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC2811f e = a.b.a.e();
                String str2 = this.h;
                a.h hVar = a.h.a;
                InterstitialAd a4 = interfaceC2784a.a(a3, e, str2, hVar.k(), hVar.f(), a.i.a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C2793a(AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g);
                if (a4 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a4 instanceof s) {
                        ((s) a4).setCreateAdObjectStartTime(j);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Created " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new v.b(a4);
                }
            }
            MolocoAdError.AdCreateError a5 = C2794b.this.a(this.h, str, timerEvent, tVar2, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C2794b.i, "Failed to create " + tVar2 + " with reason: " + a5, null, false, 12, null);
            return new v.a(a5);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createMREC$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {168}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$h */
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super h> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2794b.this.new h(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String a;
            Object a2;
            TimerEvent timerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                tVar = t.c;
                long a3 = C2794b.this.b.a();
                a = C2794b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", a);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Creating " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                C2794b c2794b = C2794b.this;
                Function1 function1 = c2794b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar;
                this.b = a;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c2794b.a(function1, tVar, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = withTag;
                j = a3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                a = (String) this.b;
                tVar = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                a2 = obj;
            }
            String str = a;
            t tVar2 = tVar;
            InterfaceC2784a interfaceC2784a = (InterfaceC2784a) a2;
            if (interfaceC2784a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC2811f e = a.b.a.e();
                String str2 = this.h;
                a.h hVar = a.h.a;
                ViewParent a5 = interfaceC2784a.a(a4, e, str2, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C2793a(AdFormatType.MREC, com.moloco.sdk.internal.mediators.b.c(this.j), null), hVar.j(), i.b.d, this.g);
                if (a5 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof s) {
                        ((s) a5).setCreateAdObjectStartTime(j);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Created " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new v.b(a5);
                }
            }
            MolocoAdError.AdCreateError a6 = C2794b.this.a(this.h, str, timerEvent, tVar2, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C2794b.i, "Failed to create " + tVar2 + " with reason: " + a6, null, false, 12, null);
            return new v.a(a6);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createNativeAd$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$i */
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<NativeAd, MolocoAdError.AdCreateError>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super i> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<NativeAd, MolocoAdError.AdCreateError>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2794b.this.new i(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String a;
            Object a2;
            TimerEvent timerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                tVar = t.d;
                long a3 = C2794b.this.b.a();
                a = C2794b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", a);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Creating " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                C2794b c2794b = C2794b.this;
                Function1 function1 = c2794b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar;
                this.b = a;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c2794b.a(function1, tVar, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = withTag;
                j = a3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                a = (String) this.b;
                tVar = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                a2 = obj;
            }
            String str = a;
            t tVar2 = tVar;
            InterfaceC2784a interfaceC2784a = (InterfaceC2784a) a2;
            if (interfaceC2784a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC2811f e = a.b.a.e();
                com.moloco.sdk.internal.services.n i2 = a.e.a.i();
                String str2 = this.h;
                a.h hVar = a.h.a;
                NativeAd a5 = interfaceC2784a.a(a4, e, i2, str2, hVar.k(), hVar.f(), a.i.a.c(), hVar.j(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C2793a(AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.b.d(this.j), null), hVar.i(), this.g);
                if (a5 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof s) {
                        ((s) a5).setCreateAdObjectStartTime(j);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Created " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new v.b(a5);
                }
            }
            MolocoAdError.AdCreateError a6 = C2794b.this.a(this.h, str, timerEvent, tVar2, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C2794b.i, "Failed to create " + tVar2 + " with reason: " + a6, null, false, 12, null);
            return new v.a(a6);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createRewardedInterstitial$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {309}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$j */
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.v<RewardedInterstitialAd, MolocoAdError.AdCreateError>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super j> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.v<RewardedInterstitialAd, MolocoAdError.AdCreateError>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2794b.this.new j(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String a;
            Object a2;
            TimerEvent timerEvent;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                tVar = t.g;
                long invoke = C2794b.this.b.invoke();
                a = C2794b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", a);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Creating " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                C2794b c2794b = C2794b.this;
                Function1 function1 = c2794b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar;
                this.b = a;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c2794b.a(function1, tVar, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = withTag;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                a = (String) this.b;
                tVar = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                a2 = obj;
            }
            String str = a;
            t tVar2 = tVar;
            InterfaceC2784a interfaceC2784a = (InterfaceC2784a) a2;
            if (interfaceC2784a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC2811f e = a.b.a.e();
                String str2 = this.h;
                a.h hVar = a.h.a;
                RewardedInterstitialAd a4 = interfaceC2784a.a(a3, e, str2, hVar.k(), hVar.f(), a.i.a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C2793a(AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g, a.c.a.b());
                if (a4 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a4 instanceof s) {
                        ((s) a4).setCreateAdObjectStartTime(j);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C2794b.i, "Created " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new v.b(a4);
                }
            }
            MolocoAdError.AdCreateError a5 = C2794b.this.a(this.h, str, timerEvent, tVar2, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C2794b.i, "Failed to create " + tVar2 + " with reason: " + a5, null, false, 12, null);
            return new v.a(a5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2794b(StateFlow<? extends Initialization> initializationState, com.moloco.sdk.internal.services.J timeProviderService, C2795c adCreatorConfiguration, Function1<? super Continuation<? super InterfaceC2784a>, ? extends Object> awaitAdFactory) {
        Intrinsics.checkNotNullParameter(initializationState, "initializationState");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(adCreatorConfiguration, "adCreatorConfiguration");
        Intrinsics.checkNotNullParameter(awaitAdFactory, "awaitAdFactory");
        this.a = initializationState;
        this.b = timeProviderService;
        this.c = adCreatorConfiguration;
        this.d = awaitAdFactory;
        this.e = com.moloco.sdk.internal.scheduling.b.a().getDefault();
    }

    public final Object d(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new h(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object e(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.v<NativeAd, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new i(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object f(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.v<RewardedInterstitialAd, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new j(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object d(C2794b c2794b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c2794b.d(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object e(C2794b c2794b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c2794b.e(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object f(C2794b c2794b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c2794b.f(str, str2, metricsRecorder, str3, continuation);
    }

    public final Object b(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new f(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object c(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.v<InterstitialAd, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new g(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object b(C2794b c2794b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c2794b.b(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object c(C2794b c2794b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c2794b.c(str, str2, metricsRecorder, str3, continuation);
    }

    public final Object a(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new e(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object a(C2794b c2794b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c2794b.a(str, str2, metricsRecorder, str3, (Continuation<? super com.moloco.sdk.internal.v<Banner, MolocoAdError.AdCreateError>>) continuation);
    }

    public final MolocoAdError.AdCreateError a(String str, String str2, TimerEvent timerEvent, t tVar, MetricsRecorder metricsRecorder) {
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("initial_sdk_init_state", str2).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name());
        Initialization value = this.a.getValue();
        int i2 = value == null ? -1 : C0246b.a[value.ordinal()];
        if (i2 == -1) {
            com.moloco.sdk.internal.error.b f2 = a.b.a.f();
            StringBuilder sb = new StringBuilder("CREATE_");
            String upperCase = tVar.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            b.a.a(f2, sb.append(upperCase).append("_AD_FAILED_SDK_INIT_NOT_COMPLETED").toString(), null, 2, null);
            TimerEvent withTag2 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag2.withTag(dVar2.c(), "sdk_init_not_completed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "sdk_init_not_completed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i2 == 1) {
            b.a.a(a.b.a.f(), h, null, 2, null);
            TimerEvent withTag3 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag3.withTag(dVar3.c(), "unable_to_create_ad"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar3.c(), "unable_to_create_ad"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Could not find the adUnitId that was requested for load: " + str, null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i2 == 2) {
            com.moloco.sdk.internal.error.b f3 = a.b.a.f();
            StringBuilder sb2 = new StringBuilder("CREATE_");
            String upperCase2 = tVar.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            b.a.a(f3, sb2.append(upperCase2).append("_AD_FAILED_SDK_INIT_FAILED").toString(), null, 2, null);
            TimerEvent withTag4 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag4.withTag(dVar4.c(), "sdk_init_failed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar4.c(), "sdk_init_failed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1<? super Continuation<? super InterfaceC2784a>, ? extends Object> function1, t tVar, MetricsRecorder metricsRecorder, Continuation<? super InterfaceC2784a> continuation) {
        c cVar;
        int i2;
        TimerEvent startTimerEvent;
        Object m12683withTimeoutOrNullKLykuaI;
        t tVar2 = tVar;
        MetricsRecorder metricsRecorder2 = metricsRecorder;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.f = i3 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    startTimerEvent = metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.i.c());
                    Duration duration = this.c.c().get(tVar2);
                    long rawValue = duration != null ? duration.getRawValue() : this.c.d();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "Waiting for AdFactory with timeout: " + ((Object) Duration.m12567toStringimpl(rawValue)), null, false, 12, null);
                    d dVar = new d(function1, null);
                    cVar.a = tVar2;
                    cVar.b = metricsRecorder2;
                    cVar.c = startTimerEvent;
                    cVar.f = 1;
                    m12683withTimeoutOrNullKLykuaI = TimeoutKt.m12683withTimeoutOrNullKLykuaI(rawValue, dVar, cVar);
                    if (m12683withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    TimerEvent timerEvent = (TimerEvent) cVar.c;
                    metricsRecorder2 = (MetricsRecorder) cVar.b;
                    t tVar3 = (t) cVar.a;
                    ResultKt.throwOnFailure(obj);
                    startTimerEvent = timerEvent;
                    tVar2 = tVar3;
                    m12683withTimeoutOrNullKLykuaI = obj;
                }
                InterfaceC2784a interfaceC2784a = (InterfaceC2784a) m12683withTimeoutOrNullKLykuaI;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "AdFactory received: " + (interfaceC2784a != null), null, false, 12, null);
                metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC2784a == null ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
                return m12683withTimeoutOrNullKLykuaI;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.f;
        if (i2 != 0) {
        }
        InterfaceC2784a interfaceC2784a2 = (InterfaceC2784a) m12683withTimeoutOrNullKLykuaI;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "AdFactory received: " + (interfaceC2784a2 != null), null, false, 12, null);
        metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC2784a2 == null ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
        return m12683withTimeoutOrNullKLykuaI;
    }

    public final String a() {
        String name;
        Initialization value = this.a.getValue();
        if (value == null || (name = value.name()) == null) {
            return "not_invoked_or_in_progress";
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase == null ? "not_invoked_or_in_progress" : lowerCase;
    }
}
