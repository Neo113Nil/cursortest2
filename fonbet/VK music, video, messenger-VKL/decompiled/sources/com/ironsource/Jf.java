package com.ironsource;

import com.ironsource.Jf;
import com.ironsource.Mb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import org.json.JSONObject;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.gzs;
import xsna.k9x;
import xsna.myc0;
import xsna.pvj;
import xsna.s3q0;
import xsna.spj;
import xsna.swe0;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes13.dex */
public final class Jf {
    public static final Jf a = new Jf();
    private static gzs<Boolean> b = d.a;
    private static final Lazy c = new bpn0(c.a);
    private static final Lazy d = new bpn0(a.a);

    public static final class a extends Lambda implements gzs<yvj> {
        public static final a a = new a();

        /* renamed from: com.ironsource.Jf$a$a, reason: collision with other inner class name */
        public static final class C0202a extends kotlin.coroutines.a implements pvj {
            public C0202a(pvj.a aVar) {
                super(aVar);
            }

            @Override // xsna.pvj
            public void handleException(kotlin.coroutines.d dVar, Throwable th) {
                IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th.getMessage());
            }
        }

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yvj invoke() {
            bdn bdnVar = bdn.a;
            return zvj.a(wgl.c.plus(new C0202a(pvj.a.b)));
        }
    }

    @b6l(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int a;
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, spj<? super b> spjVar) {
            super(2, spjVar);
            this.b = runnable;
        }

        @Override // xsna.wzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.b, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                Jf.a.a(this.b, true).run();
            } catch (Throwable th) {
                C4452n4.d().a(th);
                IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th.getMessage());
            }
            return s3q0.a;
        }
    }

    public static final class c extends Lambda implements gzs<C4426le> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4426le invoke() {
            return new C4426le(16, null, 2, null);
        }
    }

    public static final class d extends Lambda implements gzs<Boolean> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(swe0.n(new k9x(0, 9, 1), Random.b) == 0);
        }
    }

    private Jf() {
    }

    private final C4426le b() {
        return (C4426le) c.getValue();
    }

    public final void a(gzs<Boolean> gzsVar) {
        b = gzsVar;
    }

    public final void b(Runnable runnable) {
        if (a(runnable)) {
            return;
        }
        b().execute(a(runnable, false));
    }

    public final gzs<Boolean> c() {
        return b;
    }

    private final yvj a() {
        return (yvj) d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable a(final Runnable runnable, final boolean z) {
        return new Runnable() { // from class: xsna.cyx
            @Override // java.lang.Runnable
            public final void run() {
                Jf.b(runnable, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, boolean z) {
        runnable.run();
        a.a(z);
    }

    private final boolean a(Runnable runnable) {
        if (!Kb.u.d().h().F()) {
            return false;
        }
        try {
            myc0.h(a(), null, null, new b(runnable, null), 3);
            return true;
        } catch (Throwable th) {
            try {
                If.a(th);
            } catch (Exception e) {
                C4452n4.d().a(e);
            }
            IronLog.INTERNAL.error("Failed to launch coroutine: " + th.getMessage());
            return false;
        }
    }

    private final void a(boolean z) {
        if (b.invoke().booleanValue()) {
            try {
                int activeCount = Thread.activeCount();
                Mb mb = new Mb.a.C0203a().get();
                String kotlinVersion = KotlinVersion.CURRENT.toString();
                StringBuilder sb = new StringBuilder();
                sb.append("kotlinVersion=" + kotlinVersion + ";");
                if (z) {
                    sb.append("coroutineVersion=" + new C4398k4().a() + ";");
                }
                sb.append("threadCount=" + activeCount + ";");
                sb.append("javaHeapKb=" + mb.d() + ";");
                sb.append("nativeHeapKb=" + mb.e() + ";");
                sb.append("sharedOtherKb=" + mb.f());
                String sb2 = sb.toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb2);
                If.a(EnumC4650y5.TROUBLESHOOTING_COROUTINE_USAGE_METRICS, jSONObject);
            } catch (Exception e) {
                IronLog.INTERNAL.error("Failed to send usage metrics: " + e.getMessage());
            }
        }
    }
}
