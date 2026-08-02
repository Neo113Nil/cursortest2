package com.vk.voip.miniapps.impl.picture_in_picture.overlay;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import com.vk.voip.ui.c;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.concurrent.TimeUnit;
import xsna.asu0;
import xsna.dhr0;
import xsna.gvw0;
import xsna.hyu;
import xsna.l7s;
import xsna.lp0;
import xsna.mj1;
import xsna.n1d;
import xsna.ql2;
import xsna.rxz;
import xsna.skz;
import xsna.to20;
import xsna.viu;
import xsna.w00;
import xsna.wcj;

/* compiled from: MiniAppCallPiPOverlayService.kt */
/* loaded from: classes7.dex */
public final class MiniAppCallPiPOverlayService extends Service {
    public static final /* synthetic */ int e = 0;
    public to20 b;
    public gvw0 c;
    public final b d = new b();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        dhr0.a.getClass();
        this.b = new to20(new l7s(this, dhr0.u().c));
        this.c = new gvw0(this, null);
        c.b.getClass();
        int i = 28;
        i0 i0Var = new i0(c.H0(true), new mj1(new viu(8), i));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = i0Var.a0(asu0Var.d()).subscribe(new w00(new rxz(this, 2), 25));
        b bVar = this.d;
        bVar.b(subscribe);
        bVar.b(new y(new i0(q.s(q.T(0L), q.R(1L, TimeUnit.SECONDS)).U(new lp0(new n1d(this, 29), i)), new ql2(new hyu(5), i)), a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0Var.d()).subscribe(new skz(new wcj(this, 23), 4)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.dispose();
        to20 to20Var = this.b;
        if (to20Var == null) {
            to20Var = null;
        }
        to20Var.getClass();
        try {
            to20Var.a();
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
        c.C(c.b, null, 0L, false, false, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        gvw0 gvw0Var = this.c;
        if (gvw0Var == null) {
            gvw0Var = null;
        }
        if (!Settings.canDrawOverlays(gvw0Var.a)) {
            return 2;
        }
        to20 to20Var = this.b;
        to20 to20Var2 = to20Var != null ? to20Var : null;
        to20Var2.getClass();
        try {
            to20Var2.b();
            return 2;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            return 2;
        }
    }
}
