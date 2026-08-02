package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes3.dex */
public final class O implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> {
    public static final a l = new a(null);
    public static final int m = 8;
    public static final String n = "VastFullscreenAdImpl";
    public final Context a;
    public final C2791e b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y c;
    public final MetricsRecorder d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e;
    public final CoroutineScope f;
    public final L g;
    public final MutableStateFlow<Boolean> h;
    public final StateFlow<Boolean> i;
    public final MutableStateFlow<Boolean> j;
    public final StateFlow<Boolean> k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastFullscreenAdImpl$show$1", f = "VastFullscreenAd.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x d;

        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
            public a(Object obj) {
                super(0, obj, O.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((O) this.receiver).n();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = wVar;
            this.d = xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return O.this.new b(this.c, this.d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v23, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r15v33, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r15v36, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r15v37, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r15v38, types: [T, com.moloco.sdk.acm.CountEvent] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Throwable th;
            Integer e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d = O.this.g.d();
                if (d instanceof v.a) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((v.a) d).a();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar = this.c;
                    if (wVar != null) {
                        wVar.a(cVar);
                    }
                    return Unit.INSTANCE;
                }
                if (!(d instanceof v.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((v.b) d).a();
                if (!aVar.j().j().exists()) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, O.n, "VAST ad media file does not exist", null, false, 12, null);
                    File j = aVar.j().j();
                    com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.a;
                    File cacheDir = O.this.a.getCacheDir();
                    Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                    com.moloco.sdk.internal.utils.e a2 = fVar.a(cacheDir);
                    String b = (a2 == null || (e = a2.e()) == null) ? null : fVar.b(e.intValue());
                    String a3 = fVar.a(j, O.this.a);
                    File parentFile = j.getParentFile();
                    Integer a4 = O.this.g.a();
                    String a5 = a4 != null ? fVar.a(a4.intValue()) : null;
                    MolocoLogger.info$default(molocoLogger, O.n, StringsKt.trimIndent("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: " + b + "\n                    - storage_bucket_at_load: " + O.this.g.b() + "\n                    - download_bucket_at_show: " + a5 + "\n                    - cache_location_type: " + a3 + "\n                    - cache_dir_exists: " + (parentFile != null && parentFile.exists()) + "\n                "), null, false, 12, null);
                    TimerEvent c = O.this.g.c();
                    if (c != null) {
                        O.this.d.recordTimerEvent(c);
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.a0.c());
                    if (parentFile != null && parentFile.exists()) {
                        z = true;
                    }
                    ?? withTag = countEvent.withTag("cache_dir_exists", String.valueOf(z));
                    objectRef.element = withTag;
                    if (b != null) {
                        objectRef.element = withTag.withTag("storage_bucket_at_show", b);
                    }
                    String b2 = O.this.g.b();
                    if (b2 != null) {
                        objectRef.element = ((CountEvent) objectRef.element).withTag("storage_bucket_at_load", b2);
                    }
                    if (a5 != null) {
                        objectRef.element = ((CountEvent) objectRef.element).withTag("download_bucket_at_show", a5);
                    }
                    if (a3 != null) {
                        objectRef.element = ((CountEvent) objectRef.element).withTag("cache_location_type", a3);
                    }
                    O.this.d.recordCountEvent((CountEvent) objectRef.element);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar2 = this.c;
                    if (wVar2 != null) {
                        wVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.d);
                    }
                    return Unit.INSTANCE;
                }
                try {
                    VastActivity.Companion companion = VastActivity.INSTANCE;
                    Context context = O.this.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar = this.d;
                    a aVar2 = new a(O.this);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = O.this.c;
                    String bundle = O.this.b.getBundle();
                    MetricsRecorder metricsRecorder = O.this.d;
                    final O o = O.this;
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar3 = this.c;
                    Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O$b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return O.b.a(O.this, wVar3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) obj2);
                        }
                    };
                    this.a = 1;
                    bVar = this;
                    try {
                        if (companion.a(aVar, context, xVar, aVar2, yVar, bundle, metricsRecorder, function1, bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        O.this.h.setValue(Boxing.boxBoolean(false));
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar = this;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = this;
                } catch (Throwable th4) {
                    th = th4;
                    bVar = this;
                    O.this.h.setValue(Boxing.boxBoolean(false));
                    throw th;
                }
            }
            O.this.h.setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        public static final Unit a(O o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            o.a(bVar, wVar);
            return Unit.INSTANCE;
        }
    }

    public O(Context context, C2791e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, InterfaceC2833m decLoader, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = bid;
        this.c = watermark;
        this.d = metricsRecorder;
        this.e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.f = CoroutineScope;
        this.g = new L(bid, CoroutineScope, loadVast, decLoader, z, metricsRecorder);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow;
        this.i = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.j = MutableStateFlow2;
        this.k = MutableStateFlow2;
    }

    public static Object h(O o) {
        return Reflection.property0(new PropertyReference0Impl(o.g, L.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.j.setValue(Boolean.TRUE);
        this.h.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public StateFlow<Boolean> isLoaded() {
        return this.g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public StateFlow<Boolean> k() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2818a
    public StateFlow<Boolean> l() {
        return this.i;
    }

    public final void p() {
        this.h.setValue(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public void a(long j, InterfaceC2819b.a aVar) {
        this.g.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new b(wVar, options, null), 3, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, b.g.b)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(event, b.C0345b.b)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(event, b.d.b)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(event, b.i.b)) {
            if (wVar != null) {
                wVar.a(true);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(event, b.j.b)) {
            if (wVar != null) {
                wVar.a();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(event, b.c.b)) {
            if (wVar != null) {
                wVar.a(false);
            }
        } else if (Intrinsics.areEqual(event, b.a.b)) {
            if (wVar != null) {
                wVar.b();
            }
        } else if (event instanceof b.f) {
            if (wVar != null) {
                wVar.a(((b.f) event).a());
            }
        } else if (!Intrinsics.areEqual(event, b.h.b) && !Intrinsics.areEqual(event, b.e.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
