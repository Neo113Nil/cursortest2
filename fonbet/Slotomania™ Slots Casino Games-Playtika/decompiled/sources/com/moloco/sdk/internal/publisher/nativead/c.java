package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.login.LoginLogger;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.ironsource.M6;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.B;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.publisher.C2793a;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.publisher.p;
import com.moloco.sdk.internal.publisher.y;
import com.moloco.sdk.internal.s;
import com.moloco.sdk.internal.scheduling.DispatcherProvider;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.internal.t;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes2.dex */
public final class c {
    public static final a k = new a(null);
    public static final int l = 8;
    public static final String m = "NativeAdLoader";
    public final Context a;
    public final String b;
    public final p c;
    public final com.moloco.sdk.internal.publisher.nativead.parser.a d;
    public final C2793a e;
    public final MetricsRecorder f;
    public final J g;
    public final AdFormatType h;
    public final TimerEvent i;
    public final DispatcherProvider j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {
        public static final int d = 8;
        public final C2791e a;
        public final com.moloco.sdk.internal.publisher.nativead.model.b b;
        public final com.moloco.sdk.internal.publisher.nativead.model.d c;

        public b(C2791e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            this.a = bid;
            this.b = ortbResponse;
            this.c = preparedAssets;
        }

        public final C2791e a() {
            return this.a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.b b() {
            return this.b;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
            return this.c;
        }

        public final C2791e d() {
            return this.a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.b e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c);
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d f() {
            return this.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "LoadedNativeAd(bid=" + this.a + ", ortbResponse=" + this.b + ", preparedAssets=" + this.c + ')';
        }

        public final b a(C2791e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            return new b(bid, ortbResponse, preparedAssets);
        }

        public static /* synthetic */ b a(b bVar, C2791e c2791e, com.moloco.sdk.internal.publisher.nativead.model.b bVar2, com.moloco.sdk.internal.publisher.nativead.model.d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                c2791e = bVar.a;
            }
            if ((i & 2) != 0) {
                bVar2 = bVar.b;
            }
            if ((i & 4) != 0) {
                dVar = bVar.c;
            }
            return bVar.a(c2791e, bVar2, dVar);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0}, l = {239}, m = "fetchAssets-8Mi8wO0", n = {"this", "adType", "nativeAdPrepareTime"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.c$c, reason: collision with other inner class name */
    public static final class C0251c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public C0251c(Continuation<? super C0251c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return c.this.a((com.moloco.sdk.internal.publisher.nativead.model.b) null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$fireAdLoadFailedEventOnUiThread$2", f = "NativeAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ y b;
        public final /* synthetic */ s c;
        public final /* synthetic */ B d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y yVar, s sVar, B b, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = yVar;
            this.c = sVar;
            this.d = b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.a(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0, 1, 2}, l = {PsExtractor.PRIVATE_STREAM_1, 202, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "handleAssetsFetching-yxL6bBk", n = {"this", "sdkEvents", "adLoadTracker", "timeoutError", "error"}, s = {"L$0", "L$1", "L$2", "L$0", "L$0"})
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
            Object a = c.this.a((B) null, (com.moloco.sdk.internal.publisher.nativead.model.b) null, (y) null, 0L, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m11179boximpl(a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$handleAssetsFetching$result$1", f = "NativeAdLoader.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.b c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.nativead.model.b bVar, long j, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = bVar;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new f(this.c, this.d, continuation);
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
            c cVar = c.this;
            com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
            long j = this.d;
            this.a = 1;
            Object a = cVar.a(bVar, j, this);
            return a == coroutine_suspended ? coroutine_suspended : a;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0, 1}, l = {143, 159}, m = "handleBidParsing-BWLJW6A", n = {"this", "acmLoadTimerEvent", "adLoadTracker", "it"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a = c.this.a((String) null, (TimerEvent) null, (y) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m11179boximpl(a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0}, l = {175}, m = "handleOrtbParsing-BWLJW6A", n = {"result"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = c.this.a((String) null, (B) null, (y) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m11179boximpl(a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {}, l = {99}, m = "load-BWLJW6A", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object b = c.this.b(null, null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m11179boximpl(b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2", f = "NativeAdLoader.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {111, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 126, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {"adLoadStartTimeMs", M6.f, "adLoadStartTimeMs", M6.f, "adLoadStartTimeMs", M6.f, "ortbResponse"}, s = {"J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "L$1"})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends b>>, Object> {
        public long a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ TimerEvent f;
        public final /* synthetic */ String g;
        public final /* synthetic */ y h;

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2$1", f = "NativeAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ y b;
            public final /* synthetic */ c c;
            public final /* synthetic */ C2791e d;
            public final /* synthetic */ long e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, c cVar, C2791e c2791e, long j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = yVar;
                this.c = cVar;
                this.d = c2791e;
                this.e = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.a(MolocoAdKt.createAdInfo(this.c.b, Boxing.boxFloat(this.d.getPrice()), this.d.getCrid()), this.e, this.d.getExt().getSdkEvents());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TimerEvent timerEvent, String str, y yVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f = timerEvent;
            this.g = str;
            this.h = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<b>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new j(this.f, this.g, this.h, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            long j;
            C2791e c2791e;
            long j2;
            Object a3;
            long j3;
            Throwable m11183exceptionOrNullimpl;
            Object a4;
            com.moloco.sdk.internal.publisher.nativead.model.b bVar;
            Throwable m11183exceptionOrNullimpl2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long a5 = c.this.g.a();
                this.f.startTimer();
                c.this.f.recordTimerEvent(c.this.i);
                MetricsRecorder metricsRecorder = c.this.f;
                CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
                String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                String lowerCase = c.this.h.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                c cVar = c.this;
                String str = this.g;
                TimerEvent timerEvent = this.f;
                y yVar = this.h;
                this.a = a5;
                this.d = 1;
                a2 = cVar.a(str, timerEvent, yVar, this);
                if (a2 != coroutine_suspended) {
                    j = a5;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    j2 = this.a;
                    c2791e = (C2791e) this.b;
                    ResultKt.throwOnFailure(obj);
                    c cVar2 = c.this;
                    String adm = c2791e.getAdm();
                    B sdkEvents = c2791e.getExt().getSdkEvents();
                    y yVar2 = this.h;
                    this.b = c2791e;
                    this.a = j2;
                    this.d = 3;
                    a3 = cVar2.a(adm, sdkEvents, yVar2, this);
                    if (a3 != coroutine_suspended) {
                        j3 = j2;
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a3);
                        if (m11183exceptionOrNullimpl == null) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (com.moloco.sdk.internal.publisher.nativead.model.b) this.c;
                    c2791e = (C2791e) this.b;
                    ResultKt.throwOnFailure(obj);
                    a4 = ((Result) obj).getValue();
                    m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(a4);
                    if (m11183exceptionOrNullimpl2 != null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11179boximpl(Result.m11180constructorimpl(new b(c2791e, bVar, (com.moloco.sdk.internal.publisher.nativead.model.d) a4)));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl2)));
                }
                long j4 = this.a;
                c2791e = (C2791e) this.b;
                ResultKt.throwOnFailure(obj);
                a3 = ((Result) obj).getValue();
                j3 = j4;
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a3);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl)));
                }
                com.moloco.sdk.internal.publisher.nativead.model.b bVar2 = (com.moloco.sdk.internal.publisher.nativead.model.b) a3;
                c cVar3 = c.this;
                B sdkEvents2 = c2791e.getExt().getSdkEvents();
                y yVar3 = this.h;
                this.b = c2791e;
                this.c = bVar2;
                this.d = 4;
                a4 = cVar3.a(sdkEvents2, bVar2, yVar3, j3, this);
                if (a4 != coroutine_suspended) {
                    bVar = bVar2;
                    m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(a4);
                    if (m11183exceptionOrNullimpl2 != null) {
                    }
                }
                return coroutine_suspended;
            }
            long j5 = this.a;
            ResultKt.throwOnFailure(obj);
            a2 = ((Result) obj).getValue();
            j = j5;
            Throwable m11183exceptionOrNullimpl3 = Result.m11183exceptionOrNullimpl(a2);
            if (m11183exceptionOrNullimpl3 != null) {
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl3)));
            }
            C2791e c2791e2 = (C2791e) a2;
            CoroutineContext main = c.this.j.getMain();
            a aVar = new a(this.h, c.this, c2791e2, j, null);
            this.b = c2791e2;
            this.a = j;
            this.d = 2;
            if (BuildersKt.withContext(main, aVar, this) != coroutine_suspended) {
                c2791e = c2791e2;
                j2 = j;
                c cVar22 = c.this;
                String adm2 = c2791e.getAdm();
                B sdkEvents3 = c2791e.getExt().getSdkEvents();
                y yVar22 = this.h;
                this.b = c2791e;
                this.a = j2;
                this.d = 3;
                a3 = cVar22.a(adm2, sdkEvents3, yVar22, this);
                if (a3 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {}, l = {286}, m = "prepareAssets-8Mi8wO0", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return c.this.a((List<? extends b.a>) null, 0L, this);
        }
    }

    public c(Context context, String adUnitId, p bidLoader, com.moloco.sdk.internal.publisher.nativead.parser.a ortbResponseParser, C2793a createLoadTimeoutManager, MetricsRecorder metricsRecorder, J timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bidLoader, "bidLoader");
        Intrinsics.checkNotNullParameter(ortbResponseParser, "ortbResponseParser");
        Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.a = context;
        this.b = adUnitId;
        this.c = bidLoader;
        this.d = ortbResponseParser;
        this.e = createLoadTimeoutManager;
        this.f = metricsRecorder;
        this.g = timeProvider;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.h = adFormatType;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.i = startTimerEvent.withTag(c, lowerCase);
        this.j = com.moloco.sdk.internal.scheduling.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, TimerEvent timerEvent, y yVar, Continuation<? super Result<b>> continuation) {
        i iVar;
        int i2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.c = i3 - Integer.MIN_VALUE;
                Object obj = iVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.j.getDefault();
                    j jVar = new j(timerEvent, str, yVar, null);
                    iVar.c = 1;
                    obj = BuildersKt.withContext(coroutineContext, jVar, iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, TimerEvent timerEvent, y yVar, Continuation<? super Result<C2791e>> continuation) {
        g gVar;
        int i2;
        c cVar;
        v vVar;
        v vVar2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f = i3 - Integer.MIN_VALUE;
                Object obj = gVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    p pVar = this.c;
                    String str2 = this.b;
                    gVar.a = this;
                    gVar.b = timerEvent;
                    gVar.c = yVar;
                    gVar.f = 1;
                    obj = pVar.a(str2, str, gVar);
                    if (obj != coroutine_suspended) {
                        cVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar2 = (v) gVar.a;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(new Exception(((s) ((v.a) vVar2).a()).toString())));
                }
                yVar = (y) gVar.c;
                timerEvent = (TimerEvent) gVar.b;
                cVar = (c) gVar.a;
                ResultKt.throwOnFailure(obj);
                vVar = (v) obj;
                if (!(vVar instanceof v.a)) {
                    MetricsRecorder metricsRecorder = cVar.f;
                    TimerEvent withTag = timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                    String c = dVar.c();
                    MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                    TimerEvent withTag2 = withTag.withTag(c, String.valueOf(errorType.getErrorCode()));
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    String c2 = dVar2.c();
                    String name = cVar.h.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                    MetricsRecorder metricsRecorder2 = cVar.f;
                    CountEvent withTag3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), String.valueOf(errorType.getErrorCode()));
                    String c3 = dVar2.c();
                    String lowerCase2 = cVar.h.name().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                    s sVar = (s) ((v.a) vVar).a();
                    gVar.a = vVar;
                    gVar.b = null;
                    gVar.c = null;
                    gVar.f = 2;
                    if (cVar.a(yVar, sVar, (B) null, gVar) != coroutine_suspended) {
                        vVar2 = vVar;
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(new Exception(((s) ((v.a) vVar2).a()).toString())));
                    }
                    return coroutine_suspended;
                }
                if (!(vVar instanceof v.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m11180constructorimpl(((v.b) vVar).a());
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.f;
        if (i2 != 0) {
        }
        vVar = (v) obj2;
        if (!(vVar instanceof v.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, B b2, y yVar, Continuation<? super Result<com.moloco.sdk.internal.publisher.nativead.model.b>> continuation) {
        h hVar;
        int i2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.e = i3 - Integer.MIN_VALUE;
                Object obj = hVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.e;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = hVar.a;
                    ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                ResultKt.throwOnFailure(obj);
                Object a2 = this.d.a(str);
                Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a2);
                if (m11183exceptionOrNullimpl != null) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, m, "handleOrtbParsing", m11183exceptionOrNullimpl, false, 8, null);
                    s a3 = t.a(this.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.a, null, 8, null);
                    hVar.a = a2;
                    hVar.b = a2;
                    hVar.e = 1;
                    if (a(yVar, a3, b2, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return a2;
            }
        }
        hVar = new h(continuation);
        Object obj3 = hVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.e;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(B b2, com.moloco.sdk.internal.publisher.nativead.model.b bVar, y yVar, long j2, Continuation<? super Result<com.moloco.sdk.internal.publisher.nativead.model.d>> continuation) {
        e eVar;
        int i2;
        B b3;
        y yVar2;
        c cVar;
        v vVar;
        s sVar;
        s sVar2;
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
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "nativeAd load has " + j2 + " to load the ad", null, false, 12, null);
                    long a2 = this.e.a(j2);
                    f fVar = new f(bVar, a2, null);
                    eVar2.a = this;
                    b3 = b2;
                    eVar2.b = b3;
                    yVar2 = yVar;
                    eVar2.c = yVar2;
                    eVar2.f = 1;
                    obj = TimeoutKt.m12683withTimeoutOrNullKLykuaI(a2, fVar, eVar2);
                    if (obj != coroutine_suspended) {
                        cVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        sVar2 = (s) eVar2.a;
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(new Exception(sVar2.toString())));
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) eVar2.a;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(new Exception(sVar.toString())));
                }
                y yVar3 = (y) eVar2.c;
                B b4 = (B) eVar2.b;
                cVar = (c) eVar2.a;
                ResultKt.throwOnFailure(obj);
                yVar2 = yVar3;
                b3 = b4;
                vVar = (v) obj;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, m, "Handling native ad load result: " + vVar, null, false, 12, null);
                if (vVar != null) {
                    MolocoLogger.warn$default(molocoLogger, m, "Native ad load timeout", null, false, 12, null);
                    s a3 = t.a(cVar.b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.d, null, 8, null);
                    eVar2.a = a3;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 2;
                    if (cVar.a(yVar2, a3, b3, eVar2) != coroutine_suspended) {
                        sVar2 = a3;
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(new Exception(sVar2.toString())));
                    }
                } else if (vVar instanceof v.a) {
                    s a4 = t.a(cVar.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((v.a) vVar).a(), null, 8, null);
                    eVar2.a = a4;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 3;
                    if (cVar.a(yVar2, a4, b3, eVar2) != coroutine_suspended) {
                        sVar = a4;
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(new Exception(sVar.toString())));
                    }
                } else {
                    if (vVar instanceof v.b) {
                        Result.Companion companion4 = Result.INSTANCE;
                        return Result.m11180constructorimpl(((v.b) vVar).a());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar22.f;
        if (i2 != 0) {
        }
        vVar = (v) obj2;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, m, "Handling native ad load result: " + vVar, null, false, 12, null);
        if (vVar != null) {
        }
        return coroutine_suspended2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.internal.publisher.nativead.model.b bVar, long j2, Continuation<? super v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
        C0251c c0251c;
        int i2;
        c cVar;
        String str;
        TimerEvent timerEvent;
        v vVar;
        if (continuation instanceof C0251c) {
            c0251c = (C0251c) continuation;
            int i3 = c0251c.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0251c.f = i3 - Integer.MIN_VALUE;
                Object obj = c0251c.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0251c.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long duration = DurationKt.toDuration(RangesKt.coerceAtLeast(Duration.m12538getInWholeMillisecondsimpl(j2) - (this.g.a() - this.g.a()), 0L), DurationUnit.MILLISECONDS);
                    List<b.a> a2 = bVar.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : a2) {
                        if (obj2 instanceof b.a.d) {
                            arrayList.add(obj2);
                        }
                    }
                    String str2 = !arrayList.isEmpty() ? "video" : "image";
                    TimerEvent startTimerEvent = this.f.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.k.c());
                    MetricsRecorder metricsRecorder = this.f;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.n.c());
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                    List<b.a> a3 = bVar.a();
                    c0251c.a = this;
                    c0251c.b = str2;
                    c0251c.c = startTimerEvent;
                    c0251c.f = 1;
                    Object a4 = a(a3, duration, c0251c);
                    if (a4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                    str = str2;
                    obj = a4;
                    timerEvent = startTimerEvent;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timerEvent = (TimerEvent) c0251c.c;
                    str = (String) c0251c.b;
                    cVar = (c) c0251c.a;
                    ResultKt.throwOnFailure(obj);
                }
                vVar = (v) obj;
                if (!(vVar instanceof v.a)) {
                    v.a aVar = (v.a) vVar;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "NativeAd load failed: " + ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b(), null, false, 12, null);
                    MetricsRecorder metricsRecorder2 = cVar.f;
                    CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.o.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag = countEvent2.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    String c2 = dVar2.c();
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    CountEvent withTag2 = withTag.withTag(c2, lowerCase2);
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder2.recordCountEvent(withTag2.withTag(dVar3.c(), ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b().a()).withTag("asset_id", String.valueOf(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).a())));
                    MetricsRecorder metricsRecorder3 = cVar.f;
                    TimerEvent withTag3 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    String c3 = dVar2.c();
                    String lowerCase3 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    metricsRecorder3.recordTimerEvent(withTag3.withTag(c3, lowerCase3).withTag(dVar3.c(), ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b().a()).withTag("asset_id", String.valueOf(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).a())));
                    return new v.a(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b());
                }
                if (vVar instanceof v.b) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "NativeAd load successfully parsed and loaded all assets", null, false, 12, null);
                    MetricsRecorder metricsRecorder4 = cVar.f;
                    CountEvent countEvent3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.o.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag4 = countEvent3.withTag(dVar4.c(), "success");
                    com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    String c4 = dVar5.c();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase4 = str.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    metricsRecorder4.recordCountEvent(withTag4.withTag(c4, lowerCase4));
                    MetricsRecorder metricsRecorder5 = cVar.f;
                    TimerEvent withTag5 = timerEvent.withTag(dVar4.c(), "success");
                    String c5 = dVar5.c();
                    String lowerCase5 = str.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                    metricsRecorder5.recordTimerEvent(withTag5.withTag(c5, lowerCase5));
                    return new v.b(((v.b) vVar).a());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        c0251c = new C0251c(continuation);
        Object obj3 = c0251c.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0251c.f;
        if (i2 != 0) {
        }
        vVar = (v) obj3;
        if (!(vVar instanceof v.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List<? extends b.a> list, long j2, Continuation<? super v<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.internal.publisher.nativead.parser.b>> continuation) {
        k kVar;
        int i2;
        v vVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i3 = kVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.c = i3 - Integer.MIN_VALUE;
                Object obj = kVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context = this.a;
                    kVar.c = 1;
                    obj = com.moloco.sdk.internal.publisher.nativead.parser.c.a(context, list, j2, kVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                vVar = (v) obj;
                if (!(vVar instanceof v.b)) {
                    return new v.b(((v.b) vVar).a());
                }
                if (vVar instanceof v.a) {
                    v.a aVar = (v.a) vVar;
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, m, "NativeAd prepareAssets failed", (Throwable) aVar.a(), false, 8, null);
                    return new v.a(aVar.a());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.c;
        if (i2 != 0) {
        }
        vVar = (v) obj2;
        if (!(vVar instanceof v.b)) {
        }
    }

    public final Object a(y yVar, s sVar, B b2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.j.getMain(), new d(yVar, sVar, b2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
