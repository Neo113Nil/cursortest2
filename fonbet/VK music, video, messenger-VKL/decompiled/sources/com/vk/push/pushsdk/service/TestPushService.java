package com.vk.push.pushsdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import xsna.bdn;
import xsna.bke0;
import xsna.bm01;
import xsna.bpn0;
import xsna.ctx;
import xsna.fqf0;
import xsna.g9i;
import xsna.gqf0;
import xsna.gzs;
import xsna.hpj;
import xsna.iji0;
import xsna.iyx;
import xsna.kji0;
import xsna.mji0;
import xsna.mwk;
import xsna.qta;
import xsna.qxi;
import xsna.rao0;
import xsna.sao0;
import xsna.sle0;
import xsna.t3x;
import xsna.v6g0;
import xsna.w790;
import xsna.xip0;
import xsna.y3x;
import xsna.ycx;
import xsna.yfq0;
import xsna.zvj;

/* compiled from: TestPushService.kt */
/* loaded from: classes5.dex */
public final class TestPushService extends Service {
    public final hpj b = zvj.a(bdn.b);
    public final bpn0 c = new bpn0(new a());
    public final bpn0 d = new bpn0(new c());
    public final bpn0 e = new bpn0(new b());

    /* compiled from: TestPushService.kt */
    public static final class a extends Lambda implements gzs<Logger> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            TestPushService testPushService = TestPushService.this;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            return defaultLogger.createLogger(testPushService);
        }
    }

    /* compiled from: TestPushService.kt */
    public static final class b extends Lambda implements gzs<fqf0> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final fqf0 invoke() {
            Logger logger = g9i.a;
            TestPushService testPushService = TestPushService.this;
            hpj hpjVar = testPushService.b;
            Logger logger2 = (Logger) testPushService.c.getValue();
            Logger logger3 = ycx.a;
            xip0 d = mwk.d();
            Logger logger4 = v6g0.a;
            w790 w790Var = (w790) v6g0.o.getValue();
            Logger logger5 = yfq0.a;
            ctx ctxVar = new ctx(TimeUnit.DAYS.toMillis(1L));
            bpn0 bpn0Var = v6g0.n;
            t3x t3xVar = new t3x(d, w790Var, ctxVar, new bm01((sle0) bpn0Var.getValue()), new y3x((sle0) bpn0Var.getValue(), yfq0.a), yfq0.b(), logger3);
            return new gqf0(hpjVar, v6g0.e(), v6g0.d(), t3xVar, yfq0.b(), v6g0.a(), logger2);
        }
    }

    /* compiled from: TestPushService.kt */
    public static final class c extends Lambda implements gzs<iji0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final iji0 invoke() {
            Logger logger = g9i.a;
            TestPushService testPushService = TestPushService.this;
            hpj hpjVar = testPushService.b;
            Logger logger2 = (Logger) testPushService.c.getValue();
            Logger logger3 = yfq0.a;
            rao0 rao0Var = new rao0();
            Logger logger4 = v6g0.a;
            return new kji0(hpjVar, new mji0(rao0Var, (sle0) v6g0.n.getValue(), v6g0.f(), (qta) bke0.b().d()), logger2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new sao0(this.d, this.e, this.c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        hpj hpjVar = this.b;
        zvj.c(hpjVar, null);
        iyx.d(hpjVar.b);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
