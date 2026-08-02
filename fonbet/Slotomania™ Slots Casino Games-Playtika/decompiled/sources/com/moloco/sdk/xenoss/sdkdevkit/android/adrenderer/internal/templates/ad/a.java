package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes3.dex */
public final class a implements s<u> {
    public static final C0306a o = new C0306a(null);
    public static final int p = 8;
    public static final String q = "WebviewAd";
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b b;
    public final i c;
    public final h d;
    public final MetricsRecorder e;
    public final CoroutineScope f;
    public final e g;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a j;
    public final Lazy k;
    public final MutableStateFlow<Boolean> l;
    public final Lazy m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a n;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$a, reason: collision with other inner class name */
    public static final class C0306a {
        public /* synthetic */ C0306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0306a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$isAdDisplaying$2$1", f = "WebviewAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            b bVar = new b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(Unit.INSTANCE);
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1", f = "WebviewAd.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ u c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1$error$1", f = "WebviewAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$d$a, reason: collision with other inner class name */
        public static final class C0307a extends SuspendLambda implements Function2<l, Continuation<? super Boolean>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public C0307a(Continuation<? super C0307a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l lVar, Continuation<? super Boolean> continuation) {
                return ((C0307a) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0307a c0307a = new C0307a(continuation);
                c0307a.b = obj;
                return c0307a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((l) this.b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u uVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.l.setValue(Boxing.boxBoolean(true));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.q, "Ad show called, isAdDisplaying: " + ((Boolean) a.this.l.getValue()).booleanValue(), null, false, 12, null);
                StateFlow<l> unrecoverableError = a.this.p().getUnrecoverableError();
                C0307a c0307a = new C0307a(null);
                this.a = 1;
                obj = FlowKt.first(unrecoverableError, c0307a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            l lVar = (l) obj;
            if (lVar != null) {
                u uVar = this.c;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, a.q, "Ad show error: " + lVar, null, false, 12, null);
                uVar.a(lVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, final String adm, Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler, i contentLoadedHandler, h playListItemDisplayingEventHandler, MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        Intrinsics.checkNotNullParameter(contentLoadedHandler, "contentLoadedHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = eventHandlers;
        this.b = clickthroughEventHandler;
        this.c = contentLoadedHandler;
        this.d = playListItemDisplayingEventHandler;
        this.e = metricsRecorder;
        this.f = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        e eVar = new e(eventHandlers, metricsRecorder);
        this.g = eVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(context, contentLoadedHandler, playListItemDisplayingEventHandler, metricsRecorder, z, null, 32, null);
        MolocoAdsNetworkBridge.webviewAddJavascriptInterface(bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(eVar), "AndroidTemplateBridge");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(context, bVar, clickthroughEventHandler);
        this.h = bVar2;
        bVar2.b();
        this.i = bVar;
        this.j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(bVar, metricsRecorder);
        this.k = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(adm, this);
            }
        });
        this.l = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.m = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(a.this);
            }
        });
        this.n = k();
    }

    public static final StateFlow b(a aVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(aVar.l, aVar.i.a(), new b(null)), aVar.f, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }

    public static Object c(a aVar) {
        return Reflection.property0(new PropertyReference0Impl(aVar.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, q, "Ad destroy called", null, false, 12, null);
        this.l.setValue(Boolean.FALSE);
        this.h.remove();
        this.i.destroy();
        CoroutineScopeKt.cancel$default(this.f, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public StateFlow<Boolean> isLoaded() {
        return this.n.isLoaded();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a k() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.k.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2818a
    public StateFlow<Boolean> l() {
        return (StateFlow) this.m.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a n() {
        return this.h;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b p() {
        return this.i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a s() {
        return this.j;
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> x() {
        return this.i.getOrientation$moloco_sdk_release();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.h = aVar;
    }

    public static final class c implements InterfaceC2819b.a {
        public final /* synthetic */ InterfaceC2819b.a b;

        public c(InterfaceC2819b.a aVar) {
            this.b = aVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, a.q, "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
            a.this.p().a(a.this.n());
            InterfaceC2819b.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
            Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
            InterfaceC2819b.a aVar = this.b;
            if (aVar != null) {
                aVar.a(timeoutError);
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
            Intrinsics.checkNotNullParameter(internalError, "internalError");
            InterfaceC2819b.a aVar = this.b;
            if (aVar != null) {
                aVar.a(internalError);
            }
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a a(String str, a aVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a(str, aVar.f, aVar.i);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public void a(u listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new d(listener, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public void a(long j, InterfaceC2819b.a aVar) {
        k().a(j, new c(aVar));
    }

    public /* synthetic */ a(Context context, String str, Set set, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar, i iVar, h hVar, MetricsRecorder metricsRecorder, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, set, bVar, iVar, hVar, metricsRecorder, (i & 128) != 0 ? true : z);
    }
}
