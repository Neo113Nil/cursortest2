package com.vk.push.pushsdk.masterhost;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.pushsdk.VkpnsPushConfig;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bk10;
import xsna.bpn0;
import xsna.dqk0;
import xsna.dqz0;
import xsna.e5w0;
import xsna.g9i;
import xsna.gk10;
import xsna.gzs;
import xsna.hpj;
import xsna.ip9;
import xsna.iyx;
import xsna.jn4;
import xsna.kpt;
import xsna.mwk;
import xsna.myc0;
import xsna.nhe0;
import xsna.nj10;
import xsna.nk10;
import xsna.o460;
import xsna.qxi;
import xsna.rj01;
import xsna.s3q0;
import xsna.sap;
import xsna.sic;
import xsna.sp;
import xsna.spj;
import xsna.v6g0;
import xsna.wzs;
import xsna.ycx;
import xsna.yfq0;
import xsna.yiz;
import xsna.yvj;
import xsna.zvj;

/* compiled from: MasterSelectionService.kt */
/* loaded from: classes.dex */
public final class MasterSelectionService extends Service {
    public final hpj b = zvj.a(bdn.b);
    public final bpn0 c = new bpn0(a.i);
    public final bpn0 d = new bpn0(new b());

    /* compiled from: MasterSelectionService.kt */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements gzs<Logger> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            return defaultLogger.createLogger("MasterSelectionService");
        }
    }

    /* compiled from: MasterSelectionService.kt */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements gzs<gk10> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final gk10 invoke() {
            Logger logger = g9i.a;
            MasterSelectionService masterSelectionService = MasterSelectionService.this;
            hpj hpjVar = masterSelectionService.b;
            Logger logger2 = (Logger) masterSelectionService.c.getValue();
            Logger logger3 = v6g0.a;
            PackagesRepository e = v6g0.e();
            Logger logger4 = ycx.a;
            nj10 a = ycx.a();
            Logger logger5 = yfq0.a;
            dqk0 dqk0Var = new dqk0(v6g0.g());
            rj01 rj01Var = new rj01(v6g0.g());
            PackagesRepository e2 = v6g0.e();
            bpn0 bpn0Var = o460.a;
            kpt kptVar = new kpt(o460.a(), e2, yfq0.a);
            bk10 d = v6g0.d();
            nhe0 a2 = g9i.a();
            ip9 ip9Var = new ip9(v6g0.g());
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return new nk10(hpjVar, e, a, dqk0Var, rj01Var, kptVar, yfq0.b(), new yiz(), d, a2, ip9Var, new jn4(vkpnsPushConfig.a.getApplicationContext()), new sic(mwk.a(), mwk.b(), mwk.c()), new dqz0(mwk.b()), (sap) v6g0.l.getValue(), v6g0.a(), logger2);
        }
    }

    /* compiled from: MasterSelectionService.kt */
    @b6l(c = "com.vk.push.pushsdk.masterhost.MasterSelectionService$onStartCommand$1", f = "MasterSelectionService.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $startId;
        int label;

        /* compiled from: MasterSelectionService.kt */
        public static final class a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ MasterSelectionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MasterSelectionService masterSelectionService) {
                super(0);
                this.this$0 = masterSelectionService;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                this.this$0.stopSelf();
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$startId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return MasterSelectionService.this.new c(this.$startId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                ((gk10) MasterSelectionService.this.d.getValue()).e(new a(MasterSelectionService.this));
            } else {
                MasterSelectionService.this.stopSelf(this.$startId);
            }
            return s3q0.a;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return sp.e(this.d, this.c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        hpj hpjVar = this.b;
        zvj.c(hpjVar, null);
        iyx.d(hpjVar.b);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        myc0.h(this.b, null, null, new c(i2, null), 3);
        return 2;
    }
}
