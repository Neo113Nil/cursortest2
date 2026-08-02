package com.vk.voip;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.log.L;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.service.BaseVoipService;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.completable.h;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.aov0;
import xsna.asu0;
import xsna.ax0;
import xsna.bpn0;
import xsna.ca70;
import xsna.dhw0;
import xsna.drm0;
import xsna.e1x0;
import xsna.e43;
import xsna.est;
import xsna.ev60;
import xsna.foh;
import xsna.fpf0;
import xsna.gwn0;
import xsna.gz80;
import xsna.hx3;
import xsna.ipq0;
import xsna.j1a0;
import xsna.k6c0;
import xsna.k7m;
import xsna.lj70;
import xsna.m7m;
import xsna.msy;
import xsna.nof0;
import xsna.odg;
import xsna.oub0;
import xsna.po80;
import xsna.pzt0;
import xsna.qcw0;
import xsna.qjm0;
import xsna.rah0;
import xsna.s1j0;
import xsna.sbb;
import xsna.si60;
import xsna.sux;
import xsna.t2i0;
import xsna.u19;
import xsna.u1j0;
import xsna.uv80;
import xsna.w2x0;
import xsna.x870;
import xsna.xhw0;
import xsna.yhw0;
import xsna.ysg0;

/* compiled from: VoipService.kt */
/* loaded from: classes7.dex */
public final class VoipService extends BaseVoipService {
    public static final Object q = msy.a(LazyThreadSafetyMode.NONE, new nof0(9));
    public po80 n;
    public final io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();
    public final String o = "VoipService";
    public final int p = 242341;

    /* compiled from: VoipService.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static void a(Context context) {
            e1x0 e1x0Var = (e1x0) VoipService.q.getValue();
            e1x0Var.getClass();
            L.A("VoipServiceLifecycle", "start");
            if (e1x0Var.d) {
                return;
            }
            L.A("VoipServiceLifecycle", "start !isRunning");
            if (e1x0Var.c != null) {
                return;
            }
            L.A("VoipServiceLifecycle", "start initializeDisposable == null");
            e1x0Var.c = io.reactivex.rxjava3.kotlin.c.d(new h(e1x0Var.a.a().o(e1x0Var.b.d()), new sbb(e1x0Var, 9)), new oub0(e1x0Var, context), new hx3(L.a, 11));
        }
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final void b() {
        com.vk.voip.ui.c.b.getClass();
        x870 x870Var = x870.a;
        if (gz80.a(26)) {
            NotificationManager f = ca70.f(this);
            f.deleteNotificationChannelGroup("calls");
            f.deleteNotificationChannel("incoming_calls");
            f.deleteNotificationChannel("ongoing_call");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    @Override // com.vk.voip.ui.service.BaseVoipService
    public final Notification c() {
        String str;
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.v0() || com.vk.voip.ui.c.K0 == VoipViewModelState.Idle) {
            return null;
        }
        po80 po80Var = this.n;
        if (po80Var == null) {
            return null;
        }
        try {
            lj70 lj70Var = po80Var.j;
            bpn0 bpn0Var = (bpn0) lj70Var.b;
            int length = ((NotificationManager) bpn0Var.getValue()).getActiveNotifications().length;
            if (length >= (gz80.a(29) ? 25 : 50)) {
                lj70Var.b(po80Var.f);
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        dhw0 dhw0Var = com.vk.voip.ui.c.O;
        if (dhw0Var == null || (str = dhw0Var.h()) == null) {
            str = "";
        }
        cVar.getClass();
        boolean z = com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer && !com.vk.voip.ui.c.J;
        if (z) {
            boolean j = j();
            VoipService voipService = po80Var.a;
            x870 x870Var = x870.a;
            x870.a(voipService);
            return po80Var.k.a(str, j);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        boolean j2 = j();
        po80.a aVar = po80Var.b;
        VoipService voipService2 = po80Var.a;
        x870 x870Var2 = x870.a;
        x870.a(voipService2);
        String string = com.vk.voip.ui.c.W().a() ? voipService2.getString(R.string.voip_contact_call_notification_title) : j2 ? aVar.b : aVar.a;
        NotificationCompat.a b = new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, voipService2.getString(R.string.voip_call_notification_end_call), po80Var.g.a(voipService2, po80Var.i)).b();
        NotificationCompat.h hVar = new NotificationCompat.h(voipService2, "ongoing_call");
        hVar.I.icon = j2 ? R.drawable.vk_icon_videocam_24 : R.drawable.vk_icon_phone_24;
        hVar.e = NotificationCompat.h.d(string);
        hVar.f = NotificationCompat.h.d(str);
        hVar.g = t2i0.a(po80Var.a, 0, (Intent) po80Var.e.invoke(), 167772160);
        hVar.n(2, true);
        hVar.k = -1;
        if (Build.VERSION.SDK_INT >= 34) {
            hVar.h = t2i0.a(po80Var.a, 0, (Intent) po80Var.e.invoke(), 167772160);
            hVar.n(128, false);
            IconCompat iconCompat = (IconCompat) aVar.c.invoke();
            PendingIntent pendingIntent = b.j;
            if (pendingIntent != null) {
                if (drm0.N(str)) {
                    str = !drm0.N(string) ? string : "-";
                }
                j1a0 j1a0Var = new j1a0();
                j1a0Var.a = str;
                j1a0Var.b = iconCompat;
                j1a0Var.c = null;
                j1a0Var.d = null;
                j1a0Var.e = false;
                j1a0Var.f = true;
                hVar.B(new NotificationCompat.i(2, j1a0Var, pendingIntent, null, null));
                hVar.j(string);
            }
        } else {
            hVar.b(b);
        }
        return hVar.c();
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final Notification d(boolean z) {
        x870 x870Var = x870.a;
        x870.a(this);
        NotificationCompat.h hVar = new NotificationCompat.h(this, "ongoing_call");
        hVar.I.icon = z ? R.drawable.vk_icon_videocam_24 : R.drawable.vk_icon_phone_24;
        hVar.k = -1;
        return hVar.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.voip.ui.service.BaseVoipService
    public final e1x0 e() {
        return (e1x0) q.getValue();
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final int f() {
        return this.p;
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final String g() {
        return this.o;
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final boolean i() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.K0 == VoipViewModelState.Idle;
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final boolean j() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.N;
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final void k() {
        L.A("VoipService", "initializeService");
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        String d = com.vk.voip.ui.c.s0.n.d(R.string.voip_call_notification_title);
        cVar.getClass();
        po80.a aVar = new po80.a(d, com.vk.voip.ui.c.s0.n.d(R.string.voip_video_call_notification_title), new est(cVar, 4));
        ipq0 ipq0Var = new ipq0(this, 16);
        uv80 uv80Var = new uv80(20);
        cVar.getClass();
        ax0 ax0Var = new ax0(0, com.vk.voip.ui.c.U(), w2x0.class, "getCallScreenIntent", "getCallScreenIntent()Landroid/content/Intent;", 0, 8);
        cVar.getClass();
        this.n = new po80(this, aVar, ipq0Var, uv80Var, ax0Var, com.vk.voip.ui.c.s0.n.b, ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).La(), ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).Yc());
        h();
        int i = 1;
        com.vk.voip.ui.c.f = true;
        if (com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer) {
            com.vk.voip.ui.c.H().h(com.vk.voip.ui.c.K0, com.vk.voip.ui.c.J0, com.vk.voip.ui.c.R);
        }
        f<Object> fVar = ysg0.b.a;
        int i2 = 0;
        int i3 = 10;
        gwn0 gwn0Var = new gwn0(new foh(1, this, VoipService.class, "isTargetEvent", "isTargetEvent(Ljava/lang/Object;)Z", i2, i3), 12);
        fVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new i0(fVar, gwn0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xhw0(new u19(1, this, VoipService.class, "respondToVoipStateChange", "respondToVoipStateChange(Ljava/lang/Object;)V", i2, i3), i));
        io.reactivex.rxjava3.disposables.b bVar = this.m;
        bVar.b(subscribe);
        j1 U = com.vk.voip.ui.c.H0(true).U(new si60(new ev60(this), 19));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        y yVar = new y(U, qVar, aVar2);
        y yVar2 = new y(com.vk.voip.ui.c.G0(true).U(new u1j0(new pzt0(8), 13)), qVar, aVar2);
        m1 m1Var = com.vk.voip.ui.c.u.d;
        m1Var.getClass();
        y yVar3 = new y(m1Var, qVar, aVar2);
        int i4 = 3;
        int i5 = 2;
        q[] qVarArr = {yVar, yVar2, yVar3};
        int i6 = 15;
        bVar.b(q.n(e43.l(qVarArr), new s1j0(new qcw0(i5), i6)).a0(asu0.a.d()).subscribe(new aov0(new qjm0(this, i6), i5)));
        rah0 rah0Var = com.vk.voip.ui.c.g;
        if (rah0Var == null) {
            rah0Var = null;
        }
        bVar.b(rah0Var.g.U(new k6c0(new sux(24), i4)).subscribe(new yhw0(new odg(1, this, VoipService.class, "onScreenSharePermitted", "onScreenSharePermitted(Z)V", 0, 8), i5)));
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final void l() {
        this.m.dispose();
        po80 po80Var = this.n;
        if (po80Var != null) {
            po80Var.h.b(po80Var.i);
        }
    }

    @Override // com.vk.voip.ui.service.BaseVoipService
    public final void m() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        a.a(context);
    }
}
