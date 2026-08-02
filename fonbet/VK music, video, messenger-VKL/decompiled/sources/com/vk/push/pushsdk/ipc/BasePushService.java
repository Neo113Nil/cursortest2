package com.vk.push.pushsdk.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1;
import com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bke0;
import xsna.bm01;
import xsna.bpn0;
import xsna.caj0;
import xsna.ctx;
import xsna.e5w0;
import xsna.fqf0;
import xsna.g9i;
import xsna.gqf0;
import xsna.gzs;
import xsna.hpj;
import xsna.i7i;
import xsna.lyd;
import xsna.mwk;
import xsna.myc0;
import xsna.o560;
import xsna.ok70;
import xsna.os9;
import xsna.p560;
import xsna.pk70;
import xsna.pwi;
import xsna.qxi;
import xsna.s3q0;
import xsna.s4w0;
import xsna.sdy;
import xsna.sle0;
import xsna.spj;
import xsna.t0c;
import xsna.t3x;
import xsna.v0c;
import xsna.v6g0;
import xsna.vl6;
import xsna.w3x;
import xsna.w790;
import xsna.w80;
import xsna.wzs;
import xsna.xip0;
import xsna.ycx;
import xsna.yfq0;
import xsna.yok0;
import xsna.yvj;
import xsna.zje0;
import xsna.zvj;

/* compiled from: BasePushService.kt */
/* loaded from: classes.dex */
public abstract class BasePushService extends Service {
    public static final /* synthetic */ int l = 0;
    public final bpn0 b = new bpn0(e.i);
    public final bpn0 c = new bpn0(new j());
    public final bpn0 d = new bpn0(new c());
    public final hpj e = zvj.a(bdn.b);
    public final bpn0 f = new bpn0(new d());
    public final bpn0 g = new bpn0(new k());
    public final bpn0 h = new bpn0(new l());
    public final bpn0 i = new bpn0(a.i);
    public final caj0 j = lyd.b(1, 0, null, 6);
    public final bpn0 k = new bpn0(new b());

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements gzs<t0c> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final t0c invoke() {
            return (t0c) ycx.d.getValue();
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements gzs<Logger> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            String b = BasePushService.this.b();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            return defaultLogger.createLogger(b);
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class c extends Lambda implements gzs<i7i> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final i7i invoke() {
            return new i7i(BasePushService.this.getApplication(), BasePushService.this.a());
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class d extends Lambda implements gzs<ok70> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final ok70 invoke() {
            BasePushService basePushService = BasePushService.this;
            hpj hpjVar = basePushService.e;
            return new ok70(BasePushService.this.a(), (pk70) basePushService.b.getValue(), hpjVar);
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class e extends Lambda implements gzs<pk70> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final pk70 invoke() {
            Logger defaultLogger;
            bpn0 bpn0Var = bke0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            pwi pwiVar = new pwi(4);
            Logger logger = v6g0.a;
            return new s4w0(defaultLogger, pwiVar, (w80) v6g0.J.getValue(), v6g0.c());
        }
    }

    /* compiled from: BasePushService.kt */
    @b6l(c = "com.vk.push.pushsdk.ipc.BasePushService$onBind$1", f = "BasePushService.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public f(spj<? super f> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return BasePushService.this.new f(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                Logger.DefaultImpls.info$default(BasePushService.this.a(), "onBind", null, 2, null);
                BasePushService basePushService = BasePushService.this;
                myc0.h(basePushService.e, null, null, new vl6(basePushService, false, null), 3);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BasePushService.kt */
    @b6l(c = "com.vk.push.pushsdk.ipc.BasePushService$onCreate$1", f = "BasePushService.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: BasePushService.kt */
        public /* synthetic */ class a extends AdaptedFunctionReference implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                BasePushService basePushService = (BasePushService) this.receiver;
                int i = BasePushService.l;
                basePushService.d(-1);
                return s3q0.a;
            }
        }

        /* compiled from: BasePushService.kt */
        public static final class b implements o560 {
            public final /* synthetic */ BasePushService a;

            public b(BasePushService basePushService) {
                this.a = basePushService;
            }

            @Override // xsna.o560
            public final void a() {
                BasePushService basePushService = this.a;
                Logger.DefaultImpls.info$default(basePushService.a(), "On connection lost", null, 2, null);
                ((zje0) basePushService.c.getValue()).a();
            }

            @Override // xsna.o560
            public final void b() {
                BasePushService basePushService = this.a;
                Logger.DefaultImpls.info$default(basePushService.a(), "On connection become available", null, 2, null);
                ((zje0) basePushService.c.getValue()).g();
            }
        }

        public g(spj<? super g> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return BasePushService.this.new g(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                BasePushService basePushService = BasePushService.this;
                int i = BasePushService.l;
                basePushService.getClass();
                return s3q0.a;
            }
            Logger.DefaultImpls.info$default(BasePushService.this.a(), "onCreate", null, 2, null);
            StopPushServiceInteractor stopPushServiceInteractor = (StopPushServiceInteractor) BasePushService.this.h.getValue();
            BasePushService basePushService2 = BasePushService.this;
            stopPushServiceInteractor.a(basePushService2.e, new a(0, basePushService2, BasePushService.class, "stopService", "stopService(I)V", 0));
            ((zje0) BasePushService.this.c.getValue()).g();
            ((p560) BasePushService.this.d.getValue()).a(new b(BasePushService.this));
            ok70 ok70Var = (ok70) BasePushService.this.f.getValue();
            myc0.h(ok70Var.d, null, null, new NotifierConnectionComponent$startConnection$1(ok70Var, null), 3);
            t0c t0cVar = (t0c) BasePushService.this.i.getValue();
            yok0 yok0Var = t0cVar.d;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            myc0.h(t0cVar.c, null, null, new v0c(t0cVar, null), 3);
            return s3q0.a;
        }
    }

    /* compiled from: BasePushService.kt */
    @b6l(c = "com.vk.push.pushsdk.ipc.BasePushService$onStartCommand$1", f = "BasePushService.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $startId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, spj<? super h> spjVar) {
            super(2, spjVar);
            this.$startId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return BasePushService.this.new h(this.$startId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                BasePushService.this.c();
                BasePushService basePushService = BasePushService.this;
                myc0.h(basePushService.e, null, null, new vl6(basePushService, true, null), 3);
                return s3q0.a;
            }
            BasePushService basePushService2 = BasePushService.this;
            int i = BasePushService.l;
            basePushService2.getClass();
            BasePushService.this.d(this.$startId);
            return s3q0.a;
        }
    }

    /* compiled from: BasePushService.kt */
    @b6l(c = "com.vk.push.pushsdk.ipc.BasePushService$onUnbind$1", f = "BasePushService.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public i(spj<? super i> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return BasePushService.this.new i(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                Logger.DefaultImpls.info$default(BasePushService.this.a(), "onUnbind", null, 2, null);
                BasePushService basePushService = BasePushService.this;
                myc0.h(basePushService.e, null, null, new vl6(basePushService, true, null), 3);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class j extends Lambda implements gzs<zje0> {
        public j() {
            super(0);
        }

        @Override // xsna.gzs
        public final zje0 invoke() {
            bpn0 bpn0Var = bke0.a;
            return bke0.a((pk70) BasePushService.this.b.getValue());
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class k extends Lambda implements gzs<fqf0> {
        public k() {
            super(0);
        }

        @Override // xsna.gzs
        public final fqf0 invoke() {
            Logger logger = g9i.a;
            BasePushService basePushService = BasePushService.this;
            hpj hpjVar = basePushService.e;
            Logger a = basePushService.a();
            Logger logger2 = ycx.a;
            xip0 d = mwk.d();
            Logger logger3 = v6g0.a;
            w790 w790Var = (w790) v6g0.o.getValue();
            Logger logger4 = yfq0.a;
            ctx ctxVar = new ctx(TimeUnit.DAYS.toMillis(1L));
            bpn0 bpn0Var = v6g0.n;
            t3x t3xVar = new t3x(d, w790Var, ctxVar, new bm01((sle0) bpn0Var.getValue()), new w3x((sle0) bpn0Var.getValue(), yfq0.a), yfq0.b(), logger2);
            return new gqf0(hpjVar, v6g0.e(), v6g0.d(), t3xVar, yfq0.b(), v6g0.a(), a);
        }
    }

    /* compiled from: BasePushService.kt */
    /* loaded from: classes5.dex */
    public static final class l extends Lambda implements gzs<StopPushServiceInteractor> {
        public l() {
            super(0);
        }

        @Override // xsna.gzs
        public final StopPushServiceInteractor invoke() {
            Logger logger = ycx.a;
            Logger a = BasePushService.this.a();
            caj0 caj0Var = BasePushService.this.j;
            Logger logger2 = yfq0.a;
            return new StopPushServiceInteractor(caj0Var, new os9(mwk.c(), 9), a);
        }
    }

    public final Logger a() {
        return (Logger) this.k.getValue();
    }

    public abstract String b();

    public abstract void c();

    public abstract void d(int i2);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        myc0.h(this.e, null, null, new f(null), 3);
        return sdy.f(this.g, this.k);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        myc0.h(this.e, null, null, new g(null), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zvj.c(this.e, null);
        e5w0.b bVar = e5w0.y;
        boolean z = false;
        if (e5w0.A != null) {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null ? vkpnsPushConfig.d : false) {
                z = true;
            }
        }
        if (z) {
            Logger.DefaultImpls.info$default(a(), "onDestroy", null, 2, null);
            ((zje0) this.c.getValue()).e();
            ((p560) this.d.getValue()).b();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        myc0.h(this.e, null, null, new h(i3, null), 3);
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        myc0.h(this.e, null, null, new i(null), 3);
        return super.onUnbind(intent);
    }
}
