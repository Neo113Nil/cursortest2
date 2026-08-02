package com.vk.superapp.pip.impl.overlay;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.provider.Settings;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.concurrent.TimeUnit;
import xsna.anj;
import xsna.asu0;
import xsna.ayi0;
import xsna.bbw;
import xsna.c2u;
import xsna.dhr0;
import xsna.epx;
import xsna.gvw0;
import xsna.l7s;
import xsna.pey;
import xsna.r2v;
import xsna.r55;
import xsna.ux00;
import xsna.viz0;

/* compiled from: MiniAppPiPOverlayService.kt */
/* loaded from: classes6.dex */
public final class MiniAppPiPOverlayService extends Service {
    public static Long f;
    public com.vk.superapp.pip.impl.overlay.b b;
    public gvw0 c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final a e;

    /* compiled from: MiniAppPiPOverlayService.kt */
    public final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (epx.f(intent != null ? intent.getAction() : null, "pip_mini_app_action_update")) {
                long longExtra = intent.getLongExtra("prev_app_id_key", 0L);
                WebApiApplication webApiApplication = (WebApiApplication) intent.getParcelableExtra(MBridgeConstans.APP_KEY);
                int intExtra = intent.getIntExtra("app_width_key", 0);
                int intExtra2 = intent.getIntExtra("app_height_key", 0);
                MiniAppPiPOverlayService miniAppPiPOverlayService = MiniAppPiPOverlayService.this;
                com.vk.superapp.pip.impl.overlay.b bVar = miniAppPiPOverlayService.b;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.getClass();
                try {
                    try {
                        bVar.a(false);
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.q(th);
                    }
                    bVar.b(webApiApplication, intExtra, intExtra2);
                } catch (Throwable th2) {
                    com.vk.metrics.eventtracking.b.a.q(th2);
                }
                com.vk.superapp.pip.impl.overlay.b bVar2 = miniAppPiPOverlayService.b;
                com.vk.superapp.pip.impl.overlay.b bVar3 = bVar2 != null ? bVar2 : null;
                SchemeStat$TypeMiniAppItem.Type type = SchemeStat$TypeMiniAppItem.Type.PIP_CLOSE;
                bVar3.getClass();
                com.vk.superapp.pip.impl.overlay.b.c(type, longExtra);
            }
        }
    }

    /* compiled from: MiniAppPiPOverlayService.kt */
    public static final class b {
        public static void a(Context context) {
            try {
                context.stopService(new Intent(context, (Class<?>) MiniAppPiPOverlayService.class));
            } catch (Throwable th) {
                try {
                    com.vk.metrics.eventtracking.b.a.q(th);
                } finally {
                    MiniAppPiPOverlayService.f = null;
                }
            }
        }
    }

    public MiniAppPiPOverlayService() {
        r55 r55Var = r55.a;
        r55.g().f(new ayi0() { // from class: xsna.bq20
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                Long l = MiniAppPiPOverlayService.f;
                MiniAppPiPOverlayService.this.stopSelf();
                MiniAppPiPOverlayService.f = null;
            }
        });
        this.d = new io.reactivex.rxjava3.disposables.b();
        this.e = new a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        dhr0.a.getClass();
        this.b = new com.vk.superapp.pip.impl.overlay.b(new l7s(this, dhr0.u().c));
        this.c = new gvw0(this, null);
        this.d.b(new y(new i0(q.s(q.T(0L), q.R(1L, TimeUnit.SECONDS)).U(new r2v(new bbw(this, 9), 5)), new viz0(new pey(6))), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()).subscribe(new ux00(new c2u(this, 13), 2)));
        anj.d(this, this.e, new IntentFilter("pip_mini_app_action_update"), null, 4);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.dispose();
        com.vk.superapp.pip.impl.overlay.b bVar = this.b;
        if (bVar == null) {
            bVar = null;
        }
        bVar.getClass();
        try {
            bVar.a(false);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
        f = null;
        unregisterReceiver(this.e);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        WebApiApplication webApiApplication = intent != null ? (WebApiApplication) intent.getParcelableExtra(MBridgeConstans.APP_KEY) : null;
        int intExtra = intent.getIntExtra("app_width_key", 0);
        int intExtra2 = intent.getIntExtra("app_height_key", 0);
        gvw0 gvw0Var = this.c;
        if (gvw0Var == null) {
            gvw0Var = null;
        }
        if (!Settings.canDrawOverlays(gvw0Var.a)) {
            return 2;
        }
        com.vk.superapp.pip.impl.overlay.b bVar = this.b;
        com.vk.superapp.pip.impl.overlay.b bVar2 = bVar != null ? bVar : null;
        bVar2.getClass();
        try {
            try {
                bVar2.a(false);
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
            bVar2.b(webApiApplication, intExtra, intExtra2);
            return 2;
        } catch (Throwable th2) {
            com.vk.metrics.eventtracking.b.a.q(th2);
            return 2;
        }
    }
}
