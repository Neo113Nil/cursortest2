package com.vk.superapp.pip.impl.overlay;

import android.content.Context;
import android.content.Intent;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.external.miniapp.net.app.WebApiApplication;
import xsna.d3g;
import xsna.e1s0;
import xsna.gvw0;
import xsna.hf8;
import xsna.pnr0;

/* compiled from: MiniAppPiPOverlayLauncher.kt */
/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final gvw0 b;

    /* compiled from: MiniAppPiPOverlayLauncher.kt */
    /* renamed from: com.vk.superapp.pip.impl.overlay.a$a, reason: collision with other inner class name */
    public static final class C1902a {
        public final WebApiApplication a;
        public final int b;
        public final int c;
        public final d3g d;
        public final e1s0 e;
        public final pnr0 f;

        public C1902a(WebApiApplication webApiApplication, int i, int i2, d3g d3gVar, e1s0 e1s0Var, pnr0 pnr0Var) {
            this.a = webApiApplication;
            this.b = i;
            this.c = i2;
            this.d = d3gVar;
            this.e = e1s0Var;
            this.f = pnr0Var;
        }
    }

    public a(Context context) {
        this.a = context;
        this.b = new gvw0(context, null);
    }

    public final void a(C1902a c1902a) {
        c1902a.e.invoke();
        Long l = MiniAppPiPOverlayService.f;
        Context context = this.a;
        WebApiApplication webApiApplication = c1902a.a;
        int i = c1902a.b;
        int i2 = c1902a.c;
        long j = webApiApplication.b;
        if (MiniAppPiPOverlayService.f != null) {
            Intent putExtra = new Intent("pip_mini_app_action_update").putExtra("prev_app_id_key", MiniAppPiPOverlayService.f).putExtra(MBridgeConstans.APP_KEY, webApiApplication).putExtra("app_width_key", i).putExtra("app_height_key", i2);
            MiniAppPiPOverlayService.f = Long.valueOf(j);
            hf8.a(putExtra);
        } else {
            try {
                Intent intent = new Intent(context, (Class<?>) MiniAppPiPOverlayService.class);
                intent.putExtra(MBridgeConstans.APP_KEY, webApiApplication);
                intent.putExtra("app_width_key", i);
                intent.putExtra("app_height_key", i2);
                context.startService(intent);
                MiniAppPiPOverlayService.f = Long.valueOf(j);
            } catch (Throwable th) {
                MiniAppPiPOverlayService.f = null;
                com.vk.metrics.eventtracking.b.a.q(th);
                c1902a.f.invoke();
                return;
            }
        }
        c1902a.d.invoke();
    }
}
