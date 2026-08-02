package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C2790d;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2828h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public final class n<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> extends Banner implements s {
    public static final int B = 12;
    public static final String C = "BannerViewImpl";
    public final Context a;
    public final InterfaceC2811f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final String d;
    public final boolean e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final Function8<Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, C2791e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.internal.A, com.moloco.sdk.internal.services.s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L>> g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y h;
    public final C2793a i;
    public final com.moloco.sdk.internal.A j;
    public final com.moloco.sdk.internal.i k;
    public final com.moloco.sdk.internal.services.s l;
    public final MetricsRecorder m;
    public final Q n;
    public final AdFormatType o;
    public boolean p;
    public final TimerEvent q;
    public TimerEvent r;
    public final CoroutineScope s;
    public final com.moloco.sdk.internal.publisher.l<L> t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h u;
    public C v;
    public BannerAdShowListener w;
    public final AdLoad x;
    public final L y;
    public static final a z = new a(null);
    public static final int A = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Long, Duration> {
        public b(Object obj) {
            super(1, obj, C2793a.class, "calculateTimeout", "calculateTimeout-5sfh64U(J)J", 0);
        }

        public final long a(long j) {
            return ((C2793a) this.receiver).a(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Duration invoke(Long l) {
            return Duration.m12525boximpl(a(l.longValue()));
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<C2791e, InterfaceC2819b> {
        public c(Object obj) {
            super(1, obj, n.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2819b invoke(C2791e p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((n) this.receiver).a(p0);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$1", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            d dVar = new d(continuation);
            dVar.b = z;
            dVar.c = z2;
            return dVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$2", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Boolean> continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$3", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ n<L> c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(n<L> nVar, com.moloco.sdk.internal.publisher.l<L> lVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = lVar;
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((f) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.c, this.d, continuation);
            fVar.b = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            this.c.t.b(z);
            if (z) {
                TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    MetricsRecorder metricsRecorder = nVar.m;
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase2 = nVar.o.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                String c2 = this.c.c();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, n.C, "Banner parent view type: " + c2, false, 4, null);
                C c3 = this.c.v;
                if (c3 != null) {
                    c3.a(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                C c4 = this.c.v;
                if (c4 != null) {
                    c4.onAdHidden(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                Job a = this.d.a();
                if (a != null) {
                    Job.DefaultImpls.cancel$default(a, (CancellationException) null, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$4", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Boolean> continuation) {
            return ((g) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.b = ((Boolean) obj).booleanValue();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$5", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ n<L> c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n<L> nVar, com.moloco.sdk.internal.publisher.l<L> lVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = lVar;
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((h) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.c, this.d, continuation);
            hVar.b = ((Boolean) obj).booleanValue();
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    MetricsRecorder metricsRecorder = nVar.m;
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase2 = nVar.o.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                String c2 = this.c.c();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, n.C, "Banner parent view type: " + c2, false, 4, null);
                C c3 = this.c.v;
                if (c3 != null) {
                    c3.a(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                C c4 = this.c.v;
                if (c4 != null) {
                    c4.onAdHidden(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                Job a = this.d.a();
                if (a != null) {
                    Job.DefaultImpls.cancel$default(a, (CancellationException) null, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$load$1", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ n<L> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(n<L> nVar, String str, AdLoad.Listener listener, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = nVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.x.load(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$1", f = "Banner.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SharedFlow<Unit> b;
        public final /* synthetic */ n<L> c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ n<L> a;

            public a(n<L> nVar) {
                this.a = nVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                this.a.y.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SharedFlow<Unit> sharedFlow, n<L> nVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = sharedFlow;
            this.c = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new j(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Unit> sharedFlow = this.b;
                a aVar = new a(this.c);
                this.a = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$2$1", f = "Banner.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MotionEvent b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y c;
        public final /* synthetic */ n<L> d;
        public final /* synthetic */ MutableSharedFlow<Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar, n<L> nVar, MutableSharedFlow<Unit> mutableSharedFlow, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = motionEvent;
            this.c = yVar;
            this.d = nVar;
            this.e = mutableSharedFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MotionEvent motionEvent = this.b;
                if (motionEvent != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar = this.c;
                    n<L> nVar = this.d;
                    MutableSharedFlow<Unit> mutableSharedFlow = this.e;
                    com.moloco.sdk.internal.services.s sVar = nVar.l;
                    String c = nVar.t.c();
                    String d = nVar.t.d();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = nVar.u;
                    this.a = 1;
                    a = yVar.a(motionEvent, sVar, c, d, hVar, mutableSharedFlow, (r19 & 64) != 0 ? com.moloco.sdk.internal.y.b() : null, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(Context context, InterfaceC2811f interfaceC2811f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function8 function8, Function1 function1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C2793a c2793a, com.moloco.sdk.internal.A a2, com.moloco.sdk.internal.i iVar, com.moloco.sdk.internal.services.s sVar, MetricsRecorder metricsRecorder, Q q, AdFormatType adFormatType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC2811f, aVar, str, z2, rVar, function8, function1, yVar, c2793a, a2, iVar, sVar, metricsRecorder, q, (i2 & 32768) != 0 ? AdFormatType.BANNER : adFormatType);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i l(n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    public static final com.moloco.sdk.internal.ortb.model.B m(n nVar) {
        return nVar.t.e();
    }

    public static final C2803k n(n nVar) {
        return nVar.t.b();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i o(n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.s, null, 1, null);
        a(this, null, 1, null);
        setAdShowListener(null);
        this.v = null;
    }

    @Override // com.moloco.sdk.publisher.Banner, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public BannerAdShowListener getAdShowListener() {
        return this.w;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.i.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.x.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.m.recordTimerEvent(this.q);
        this.r = this.m.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new i(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(BannerAdShowListener bannerAdShowListener) {
        C a2 = a(bannerAdShowListener);
        this.v = a2;
        this.w = a2.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j2) {
        this.i.setCreateAdObjectStartTime(j2);
    }

    public static final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w {
        public final /* synthetic */ n<L> a;

        public l(n<L> nVar) {
            this.a = nVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            C c = this.a.v;
            if (c != null) {
                c.onAdClicked(MolocoAdKt.createAdInfo$default(this.a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            n<L> nVar = this.a;
            nVar.a(com.moloco.sdk.internal.t.a(nVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    public final void b() {
        StateFlow<Boolean> isLoaded;
        com.moloco.sdk.internal.publisher.l<L> lVar = this.t;
        if (!a()) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "Banner: Using isAdShowing function to track ad display state.", false, 4, null);
            Job a2 = lVar.a();
            if (a2 != null) {
                Job.DefaultImpls.cancel$default(a2, (CancellationException) null, 1, (Object) null);
            }
            lVar.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(a(this.t.f()), new g(null)), new h(this, lVar, null)), this.s));
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state.", false, 4, null);
        Job a3 = lVar.a();
        if (a3 != null) {
            Job.DefaultImpls.cancel$default(a3, (CancellationException) null, 1, (Object) null);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = lVar.f();
        if (f2 == null || (isLoaded = f2.isLoaded()) == null) {
            return;
        }
        lVar.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(FlowKt.combine(isLoaded, this.n.a(this), new d(null)), new e(null)), new f(this, lVar, null)), this.s));
    }

    public final String c() {
        Object parent = getParent();
        while (parent != null) {
            String simpleName = parent.getClass().getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            if (StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "RecyclerView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ScrollView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ListView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ViewPager", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "HorizontalScrollView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "AndroidComposeView", false, 2, (Object) null)) {
                return simpleName;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        return "none";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, Function8<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, ? super C2791e, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, ? super com.moloco.sdk.internal.A, ? super com.moloco.sdk.internal.services.s, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L>> createXenossBannerView, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, ? extends L> createXenossBannerAdShowListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwner, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.internal.services.s clickthroughService, MetricsRecorder metricsRecorder, Q viewVisibilityTracker, AdFormatType adFormatType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(createXenossBannerView, "createXenossBannerView");
        Intrinsics.checkNotNullParameter(createXenossBannerAdShowListener, "createXenossBannerAdShowListener");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = z2;
        this.f = externalLinkHandler;
        this.g = createXenossBannerView;
        this.h = watermark;
        this.i = adCreateLoadTimeoutManager;
        this.j = viewLifecycleOwner;
        this.k = bannerSize;
        this.l = clickthroughService;
        this.m = metricsRecorder;
        this.n = viewVisibilityTracker;
        this.o = adFormatType;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.q = startTimerEvent.withTag(c2, lowerCase);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.s = CoroutineScope;
        this.t = new com.moloco.sdk.internal.publisher.l<>(null, null, null, null, false, null, null, false, 255, null);
        this.u = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a();
        this.x = C2797e.a(CoroutineScope, new b(adCreateLoadTimeoutManager), adUnitId, new c(this), adFormatType, a.C0269a.a.b(), metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.l(n.this);
            }
        });
        this.y = createXenossBannerAdShowListener.invoke(new l(this));
    }

    public final C a(BannerAdShowListener bannerAdShowListener) {
        return new C(bannerAdShowListener, this.b, this.c, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.m(n.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.n(n.this);
            }
        }, this.o, this.m, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.o(n.this);
            }
        });
    }

    public static /* synthetic */ void a(n nVar, com.moloco.sdk.internal.s sVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sVar = null;
        }
        nVar.a(sVar);
    }

    public final void a(com.moloco.sdk.internal.s sVar) {
        boolean booleanValue;
        C c2;
        C c3;
        com.moloco.sdk.internal.publisher.l<L> lVar = this.t;
        Job a2 = lVar.a();
        if (a2 != null) {
            Job.DefaultImpls.cancel$default(a2, (CancellationException) null, 1, (Object) null);
        }
        lVar.a((Job) null);
        if (a()) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker).", false, 4, null);
            booleanValue = this.t.h();
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "Banner: isAdShowing state set from isAdShowing function.", false, 4, null);
            booleanValue = a(this.t.f()).getValue().booleanValue();
        }
        com.moloco.sdk.internal.publisher.l<L> lVar2 = this.t;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = lVar2.f();
        if (f2 != null) {
            f2.destroy();
        }
        lVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B) null);
        if (sVar != null && (c3 = this.v) != null) {
            c3.a(sVar);
        }
        if (booleanValue && (c2 = this.v) != null) {
            c2.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.t.a((com.moloco.sdk.internal.ortb.model.B) null);
        if (a()) {
            this.t.b(false);
        }
        this.t.a((C2803k) null);
    }

    public final InterfaceC2819b a(C2791e c2791e) {
        C2790d bannerClickMetaData;
        C2790d bannerClickMetaData2;
        this.p = C2828h.a.b(c2791e.getAdm());
        a(this, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> invoke = this.g.invoke(this.a, this.c, c2791e, this.f, this.h, this.j, this.l, this.u);
        com.moloco.sdk.internal.publisher.l<L> lVar = this.t;
        lVar.a(invoke);
        lVar.a(c2791e.getExt().getSdkEvents());
        lVar.a(c2791e.getCom.ironsource.q2.y java.lang.String() != null ? new C2803k(c2791e.getCom.ironsource.q2.y java.lang.String(), Float.valueOf(c2791e.getPrice())) : null);
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData = c2791e.getExt().getMolocoSdkClickMetaData();
        lVar.b((molocoSdkClickMetaData == null || (bannerClickMetaData2 = molocoSdkClickMetaData.getBannerClickMetaData()) == null) ? null : bannerClickMetaData2.getClickThrough());
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData2 = c2791e.getExt().getMolocoSdkClickMetaData();
        lVar.a((molocoSdkClickMetaData2 == null || (bannerClickMetaData = molocoSdkClickMetaData2.getBannerClickMetaData()) == null) ? null : bannerClickMetaData.getClickTracking());
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData3 = c2791e.getExt().getMolocoSdkClickMetaData();
        lVar.a((molocoSdkClickMetaData3 != null ? molocoSdkClickMetaData3.getBannerClickMetaData() : null) != null);
        invoke.setAdShowListener(this.y);
        b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.moloco.sdk.internal.j.a(this.k.b()), com.moloco.sdk.internal.j.a(this.k.a()));
        layoutParams.gravity = 1;
        addView(invoke, layoutParams);
        if (this.t.g()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y(this.a);
            final MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new j(MutableSharedFlow$default, this, null), 3, null);
            yVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return n.a(n.this, yVar, MutableSharedFlow$default, view, motionEvent);
                }
            });
            addView(yVar, new FrameLayout.LayoutParams(-1, com.moloco.sdk.internal.j.a(this.k.a())));
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(this.f, this.a, null, 0, 12, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        bVar.setPadding(12, 0, 0, 12);
        bVar.setPrivacyUrl(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a);
        bVar.setOnButtonRenderedListener(new Function1() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.a(n.this, (a.AbstractC0383a.c) obj);
            }
        });
        bVar.setLayoutParams(layoutParams2);
        addView(bVar);
        return invoke;
    }

    public static final boolean a(n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y yVar, MutableSharedFlow mutableSharedFlow, View view, MotionEvent motionEvent) {
        BuildersKt__Builders_commonKt.launch$default(nVar.s, null, null, new k(motionEvent, yVar, nVar, mutableSharedFlow, null), 3, null);
        return false;
    }

    public static final Unit a(n nVar, a.AbstractC0383a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        nVar.u.a(button);
        return Unit.INSTANCE;
    }

    public final StateFlow<Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b2) {
        if (!this.e && b2 != null) {
            return b2.l();
        }
        return isViewShown();
    }

    public final boolean a() {
        return this.o == AdFormatType.MREC && this.p;
    }
}
