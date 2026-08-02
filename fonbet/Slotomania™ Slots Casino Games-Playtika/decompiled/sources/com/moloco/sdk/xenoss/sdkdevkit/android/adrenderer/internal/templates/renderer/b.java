package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.login.LoginLogger;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.common_adapter_internal.AdapterAccess;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.d;
import com.moloco.sdk.internal.client_metrics_data.e;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class b extends WebView {
    public static final a i = new a(null);
    public static final int j = 8;
    public static final String k = "TemplateWebView";
    public static final String l = "webview_version";
    public final i a;
    public final h b;
    public final MetricsRecorder c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c d;
    public final CoroutineScope e;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> f;
    public final StateFlow<l> g;
    public final StateFlow<Boolean> h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2", f = "TemplateWebView.kt", i = {0, 0}, l = {148}, m = "invokeSuspend", n = {"timerEvent", "webViewVersion"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b, reason: collision with other inner class name */
    public static final class C0312b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super v<Unit, l>>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "TemplateWebView.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a */
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends l>>, Object> {
            public int a;
            public final /* synthetic */ b b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$a, reason: collision with other inner class name */
            public static final class C0313a extends SuspendLambda implements Function3<Boolean, l, Continuation<? super Pair<? extends Boolean, ? extends l>>, Object> {
                public int a;
                public /* synthetic */ boolean b;
                public /* synthetic */ Object c;

                public C0313a(Continuation<? super C0313a> continuation) {
                    super(3, continuation);
                }

                public final Object a(boolean z, l lVar, Continuation<? super Pair<Boolean, ? extends l>> continuation) {
                    C0313a c0313a = new C0313a(continuation);
                    c0313a.b = z;
                    c0313a.c = lVar;
                    return c0313a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, l lVar, Continuation<? super Pair<? extends Boolean, ? extends l>> continuation) {
                    return a(bool.booleanValue(), lVar, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return TuplesKt.to(Boxing.boxBoolean(z), (l) this.c);
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$b, reason: collision with other inner class name */
            public static final class C0314b extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends l>, Continuation<? super Boolean>, Object> {
                public int a;
                public /* synthetic */ Object b;

                public C0314b(Continuation<? super C0314b> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair<Boolean, ? extends l> pair, Continuation<? super Boolean> continuation) {
                    return ((C0314b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0314b c0314b = new C0314b(continuation);
                    c0314b.b = obj;
                    return c0314b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.b;
                    return Boxing.boxBoolean(((Boolean) pair.component1()).booleanValue() || ((l) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, ? extends l>> continuation) {
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
                Flow flowCombine = FlowKt.flowCombine(this.b.d.b(), this.b.d.a(), new C0313a(null));
                C0314b c0314b = new C0314b(null);
                this.a = 1;
                Object first = FlowKt.first(flowCombine, c0314b, this);
                return first == coroutine_suspended ? coroutine_suspended : first;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0312b(String str, long j, Continuation<? super C0312b> continuation) {
            super(2, continuation);
            this.e = str;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super v<Unit, l>> continuation) {
            return ((C0312b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0312b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TimerEvent startTimerEvent;
            Object m12683withTimeoutOrNullKLykuaI;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                startTimerEvent = b.this.c.startTimerEvent(e.r.c());
                String b = b.this.b();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Loading ad in webView, with webview version: " + b, null, false, 12, null);
                try {
                    MolocoAdsNetworkBridge.webviewLoadDataWithBaseURL(b.this, null, this.e, "text/html", C.UTF8_NAME, null);
                    long j = this.f;
                    a aVar = new a(b.this, null);
                    this.a = startTimerEvent;
                    this.b = b;
                    this.c = 1;
                    m12683withTimeoutOrNullKLykuaI = TimeoutKt.m12683withTimeoutOrNullKLykuaI(j, aVar, this);
                    if (m12683withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = b;
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, b.k, "loadHtml failed to load the provided html", e, false, 8, null);
                    MetricsRecorder metricsRecorder = b.this.c;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                    d dVar = d.d;
                    CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    d dVar2 = d.b;
                    metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "invalid_url").withTag(b.l, b));
                    b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "invalid_url").withTag(b.l, b));
                    return new v.a(l.b);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.b;
                startTimerEvent = (TimerEvent) this.a;
                ResultKt.throwOnFailure(obj);
                m12683withTimeoutOrNullKLykuaI = obj;
            }
            if (m12683withTimeoutOrNullKLykuaI == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.k, "Ad failed to load due to timeout", null, false, 12, null);
                MetricsRecorder metricsRecorder2 = b.this.c;
                CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                d dVar3 = d.d;
                CountEvent withTag2 = countEvent2.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                d dVar4 = d.b;
                metricsRecorder2.recordCountEvent(withTag2.withTag(dVar4.c(), "timeout_error").withTag(b.l, str));
                b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar4.c(), "timeout_error").withTag(b.l, str));
                return new v.a(l.f);
            }
            boolean booleanValue = b.this.d.b().getValue().booleanValue();
            l value = b.this.d.a().getValue();
            if (value != null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.k, "Ad failed to load due to unrecoverable error: " + value.name(), null, false, 12, null);
                MetricsRecorder metricsRecorder3 = b.this.c;
                CountEvent countEvent3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                d dVar5 = d.d;
                CountEvent withTag3 = countEvent3.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                d dVar6 = d.b;
                metricsRecorder3.recordCountEvent(withTag3.withTag(dVar6.c(), value.name()).withTag(b.l, str));
                b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar6.c(), value.name()).withTag(b.l, str));
                return new v.a(value);
            }
            if (booleanValue) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Ad loaded successfully in webView", null, false, 12, null);
                MetricsRecorder metricsRecorder4 = b.this.c;
                CountEvent countEvent4 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                d dVar7 = d.d;
                metricsRecorder4.recordCountEvent(countEvent4.withTag(dVar7.c(), "success").withTag(b.l, str));
                b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar7.c(), "success").withTag(b.l, str));
                return new v.b(Unit.INSTANCE);
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, b.k, "Ad failed to load due to unknown error", null, false, 12, null);
            MetricsRecorder metricsRecorder5 = b.this.c;
            CountEvent countEvent5 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
            d dVar8 = d.d;
            CountEvent withTag4 = countEvent5.withTag(dVar8.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            d dVar9 = d.b;
            metricsRecorder5.recordCountEvent(withTag4.withTag(dVar9.c(), "unknown_error").withTag(b.l, str));
            b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar8.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar9.c(), "unknown_error").withTag(b.l, str));
            return new v.a(l.a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1", f = "TemplateWebView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ b a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1$1", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a, reason: collision with other inner class name */
            public static final class C0315a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ h.a c;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0316a {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[h.a.values().length];
                        try {
                            iArr[h.a.d.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[h.a.c.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0315a(b bVar, h.a aVar, Continuation<? super C0315a> continuation) {
                    super(2, continuation);
                    this.b = bVar;
                    this.c = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0315a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0315a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WebSettings settings = this.b.getSettings();
                    int i = C0316a.a[this.c.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i != 1 ? i != 2 ? this.b.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1", f = "TemplateWebView.kt", i = {0, 0}, l = {87}, m = "emit", n = {"this", "creativeType"}, s = {"L$0", "L$1"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$b, reason: collision with other inner class name */
            public static final class C0317b extends ContinuationImpl {
                public Object a;
                public Object b;
                public /* synthetic */ Object c;
                public final /* synthetic */ a<T> d;
                public int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0317b(a<? super T> aVar, Continuation<? super C0317b> continuation) {
                    super(continuation);
                    this.d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.c = obj;
                    this.e |= Integer.MIN_VALUE;
                    return this.d.emit(null, this);
                }
            }

            public a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
                this.a = bVar;
                this.b = aVar;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24)(1:25))|12|(1:14)(1:18)|15|16))|28|6|7|(0)(0)|12|(0)(0)|15|16) */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0107, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
            
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Failed to access WebView settings", r0, false, 8, null);
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00a4 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x003a, B:12:0x007c, B:14:0x00a4, B:18:0x00e7, B:22:0x0049), top: B:7:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[Catch: Exception -> 0x0107, TRY_LEAVE, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x003a, B:12:0x007c, B:14:0x00a4, B:18:0x00e7, B:22:0x0049), top: B:7:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(h.a aVar, Continuation<? super Unit> continuation) {
                C0317b c0317b;
                int i;
                a<T> aVar2;
                h.a aVar3 = aVar;
                if (continuation instanceof C0317b) {
                    c0317b = (C0317b) continuation;
                    int i2 = c0317b.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0317b.e = i2 - Integer.MIN_VALUE;
                        Object obj = c0317b.c;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0317b.e;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Playlist item displaying event received: " + aVar3, null, false, 12, null);
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            C0315a c0315a = new C0315a(this.a, aVar3, null);
                            c0317b.a = this;
                            c0317b.b = aVar3;
                            c0317b.e = 1;
                            if (BuildersKt.withContext(main, c0315a, c0317b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar2 = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (h.a) c0317b.b;
                            aVar2 = (a) c0317b.a;
                            ResultKt.throwOnFailure(obj);
                        }
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.info$default(molocoLogger, b.k, "Set playback: " + aVar2.a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                        if (aVar3 != h.a.d) {
                            MolocoLogger.info$default(molocoLogger, b.k, "Playlist item displaying event is MRAID, setting orientation to: " + aVar2.b.e().getValue(), null, false, 12, null);
                            aVar2.a.f.setValue(n.a.i.a(aVar2.b.e().getValue()));
                            aVar2.b.d();
                        } else {
                            MolocoLogger.info$default(molocoLogger, b.k, "Playlist item displaying event is not MRAID, setting orientation to none", null, false, 12, null);
                            aVar2.a.f.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0317b = new C0317b(this, continuation);
                Object obj2 = c0317b.c;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0317b.e;
                if (i != 0) {
                }
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, b.k, "Set playback: " + aVar2.a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                if (aVar3 != h.a.d) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<h.a> c = b.this.b.c();
                    a aVar = new a(b.this, this.c);
                    this.a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Exception e) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Error collecting playlist item displaying events", e, false, 8, null);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(Context context, i iVar, h hVar, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, hVar, metricsRecorder, r5, (i2 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c(iVar, metricsRecorder, r5) : cVar);
        boolean z2 = (i2 & 16) != 0 ? true : z;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> getOrientation$moloco_sdk_release() {
        return this.f;
    }

    public final StateFlow<l> getUnrecoverableError() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        CoroutineScopeKt.cancel$default(this.e, null, 1, null);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final StateFlow<Boolean> a() {
        return this.h;
    }

    public final String b() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return (currentWebViewPackage == null || (str = currentWebViewPackage.versionName) == null) ? "unknown" : str;
            }
            PackageManager packageManager = getContext().getPackageManager();
            for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"com.google.android.webview", "com.android.webview", "com.android.chrome"})) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                String versionName = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
                if (versionName.length() > 0) {
                    String versionName2 = packageInfo.versionName;
                    Intrinsics.checkNotNullExpressionValue(versionName2, "versionName");
                    return versionName2;
                }
            }
            return "unknown";
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, k, "WebView version retrieval exception", e, false, 8, null);
            return "unknown";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, i contentLoadedEventHandler, h playListItemDisplayingEventHandler, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.a = contentLoadedEventHandler;
        this.b = playListItemDisplayingEventHandler;
        this.c = metricsRecorder;
        this.d = webViewClientImpl;
        this.e = CoroutineScopeKt.CoroutineScope(AdapterAccess.INSTANCE.DispatcherProvider().getMain());
        this.f = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.g = webViewClientImpl.a();
        this.h = webViewClientImpl.c();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new c(mraidCommunicationHub, null), 3, null);
    }

    public final Object a(String str, long j2, Continuation<? super v<Unit, l>> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new C0312b(str, j2, null), continuation);
    }
}
