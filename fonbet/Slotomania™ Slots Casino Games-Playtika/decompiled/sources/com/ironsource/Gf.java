package com.ironsource;

import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Gf {
    public static final Gf a = new Gf();
    private static Function0<Boolean> b = d.a;
    private static final Lazy c = LazyKt.lazy(c.a);
    private static final Lazy d = LazyKt.lazy(a.a);

    static final class a extends Lambda implements Function0<CoroutineScope> {
        public static final a a = new a();

        /* renamed from: com.ironsource.Gf$a$a, reason: collision with other inner class name */
        public static final class C0176a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public C0176a(CoroutineExceptionHandler.Companion companion) {
                super(companion);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(CoroutineContext coroutineContext, Throwable th) {
                IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th.getMessage());
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(new C0176a(CoroutineExceptionHandler.INSTANCE)));
        }
    }

    @DebugMetadata(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Gf.a.a(this.b, true).run();
            } catch (Throwable th) {
                C2556n4.d().a(th);
                IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0<C2530le> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2530le invoke() {
            return new C2530le(16, null, null, 6, null);
        }
    }

    static final class d extends Lambda implements Function0<Boolean> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(RangesKt.random(new IntRange(0, 9), Random.INSTANCE) == 0);
        }
    }

    private Gf() {
    }

    private final C2530le b() {
        return (C2530le) c.getValue();
    }

    public final Function0<Boolean> c() {
        return b;
    }

    public final void a(Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        b = function0;
    }

    public final void b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            return;
        }
        b().execute(a(action, false));
    }

    private final CoroutineScope a() {
        return (CoroutineScope) d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable a(final Runnable runnable, final boolean z) {
        return new Runnable() { // from class: com.ironsource.Gf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Gf.b(runnable, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable action, boolean z) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.run();
        a.a(z);
    }

    private final boolean a(Runnable runnable) {
        if (!Jb.u.d().h().D()) {
            return false;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(a(), null, null, new b(runnable, null), 3, null);
            return true;
        } catch (Throwable th) {
            try {
                Ff.a(th);
            } catch (Exception e) {
                C2556n4.d().a(e);
            }
            IronLog.INTERNAL.error("Failed to launch coroutine: " + th.getMessage());
            return false;
        }
    }

    private final void a(boolean z) {
        if (b.invoke().booleanValue()) {
            try {
                int activeCount = Thread.activeCount();
                Lb lb = new Lb.a.C0178a().get();
                String kotlinVersion = KotlinVersion.CURRENT.toString();
                StringBuilder sb = new StringBuilder();
                sb.append("kotlinVersion=" + kotlinVersion + ";");
                if (z) {
                    sb.append("coroutineVersion=" + new C2502k4().a() + ";");
                }
                sb.append("threadCount=" + activeCount + ";");
                sb.append("javaHeapKb=" + lb.d() + ";");
                sb.append("nativeHeapKb=" + lb.e() + ";");
                sb.append("sharedOtherKb=" + lb.f());
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, sb2);
                Ff.a(EnumC2754y5.TROUBLESHOOTING_COROUTINE_USAGE_METRICS, jsonObjectInit);
            } catch (Exception e) {
                IronLog.INTERNAL.error("Failed to send usage metrics: " + e.getMessage());
            }
        }
    }
}
