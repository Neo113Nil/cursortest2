package com.vk.music.playerservice.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.vk.core.service.BoundService;
import com.vk.music.api.MusicPlayerServiceComponent;
import com.vk.music.api.di.MusicBroadcastManagerComponent;
import com.vk.music.bottomsheets.di.MusicBottomSheetComponent;
import com.vk.music.player.PlayState;
import com.vk.music.player.api.di.PlayerComponent;
import com.vk.music.pref.MusicPrefsComponent;
import io.reactivex.rxjava3.disposables.c;
import kotlin.Result;
import xsna.api0;
import xsna.bn40;
import xsna.boi0;
import xsna.bpn0;
import xsna.bx40;
import xsna.clb0;
import xsna.dy4;
import xsna.e2b0;
import xsna.e43;
import xsna.enj;
import xsna.etu;
import xsna.fpf0;
import xsna.i440;
import xsna.j6i;
import xsna.jg8;
import xsna.k140;
import xsna.k7m;
import xsna.k840;
import xsna.kd50;
import xsna.kvf;
import xsna.lp40;
import xsna.m7m;
import xsna.ou5;
import xsna.pn40;
import xsna.pu5;
import xsna.q7s;
import xsna.r6m;
import xsna.s450;
import xsna.s750;
import xsna.tib;
import xsna.tj2;
import xsna.u2b0;
import xsna.ych0;
import xsna.zf20;
import xsna.zoi0;

/* compiled from: PlayerService.kt */
/* loaded from: classes.dex */
public final class PlayerService extends BoundService {
    public static final /* synthetic */ int t = 0;
    public e2b0 d;
    public Handler e;
    public int f;
    public boolean g;
    public ych0 l;
    public boi0 m;
    public zoi0 n;
    public api0 o;
    public com.vk.music.pref.a p;
    public final tib h = new tib(PlayerService.class);
    public final bpn0 i = new bpn0(new i440(this, 13));
    public final bpn0 j = new bpn0(new zf20(this, 16));
    public final k140 k = new k140();
    public final ou5 q = new ou5(this, 9);
    public final pu5 r = new pu5(this, 12);
    public final bpn0 s = new bpn0(new tj2(17));

    /* compiled from: PlayerService.kt */
    /* loaded from: classes3.dex */
    public final class a {
        public a() {
        }
    }

    @Override // com.vk.core.service.BoundService
    public final void i() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.q);
        }
    }

    @Override // com.vk.core.service.BoundService
    public final void j() {
        l(true);
    }

    public final boolean k() {
        Object failure;
        try {
            Handler handler = this.e;
            failure = Boolean.valueOf(handler != null ? etu.a(handler, this.r) : false);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Boolean bool = (Boolean) failure;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void l(boolean z) {
        Handler handler = this.e;
        ou5 ou5Var = this.q;
        if (handler != null) {
            handler.removeCallbacks(ou5Var);
        }
        if (!g() || this.c) {
            return;
        }
        e2b0 e2b0Var = this.d;
        if (e2b0Var == null) {
            e2b0Var = null;
        }
        if (e2b0Var.getState() == PlayState.STOPPED) {
            if (!z) {
                stopSelf(this.f);
                return;
            }
            if (((Boolean) this.s.getValue()).booleanValue()) {
                Handler handler2 = this.e;
                if (handler2 != null) {
                    handler2.post(ou5Var);
                    return;
                }
                return;
            }
            Handler handler3 = this.e;
            if (handler3 != null) {
                handler3.postDelayed(ou5Var, 5000L);
            }
        }
    }

    public final void m() {
        this.k.h(this);
    }

    @Override // com.vk.core.service.BoundService, android.app.Service
    public final void onCreate() {
        bx40 bx40Var;
        com.vk.music.pref.a aVar;
        super.onCreate();
        q7s.a("PlayerService");
        bn40.f("PlayerService onCreate");
        Looper myLooper = Looper.myLooper();
        this.e = myLooper != null ? new Handler(myLooper) : null;
        bx40 q3 = ((PlayerComponent) ((k7m) m7m.b(this)).mo408a(fpf0.a(PlayerComponent.class))).q3();
        a aVar2 = new a();
        clb0 clb0Var = new clb0();
        s450 s450Var = k840.a.c;
        if (s450Var == null) {
            s450Var = null;
        }
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        if (this.p == null) {
            this.p = ((MusicPrefsComponent) ((k7m) m7m.b(this)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
        }
        com.vk.music.pref.a aVar3 = this.p;
        if (aVar3 == null) {
            bx40Var = q3;
            aVar = null;
        } else {
            bx40Var = q3;
            aVar = aVar3;
        }
        e2b0 e2b0Var = new e2b0(this, aVar2, clb0Var, s450Var, s750Var, aVar, bx40Var);
        bx40 bx40Var2 = bx40Var;
        this.d = e2b0Var;
        ych0 ych0Var = new ych0(e2b0Var);
        this.l = ych0Var;
        ych0Var.D(this);
        bpn0 bpn0Var = this.i;
        u2b0 u2b0Var = (u2b0) bpn0Var.getValue();
        ych0 ych0Var2 = this.l;
        if (ych0Var2 == null) {
            ych0Var2 = null;
        }
        jg8 jg8Var = new jg8(u2b0Var, ych0Var2);
        e2b0 e2b0Var2 = this.d;
        if (e2b0Var2 == null) {
            e2b0Var2 = null;
        }
        e2b0Var2.r0(jg8Var);
        e2b0 e2b0Var3 = this.d;
        if (e2b0Var3 == null) {
            e2b0Var3 = null;
        }
        bpn0 bpn0Var2 = this.j;
        this.m = new boi0(e2b0Var3, jg8Var, this, (kd50) bpn0Var2.getValue(), (u2b0) bpn0Var.getValue(), bx40Var2);
        e2b0 e2b0Var4 = this.d;
        if (e2b0Var4 == null) {
            e2b0Var4 = null;
        }
        u2b0 u2b0Var2 = (u2b0) bpn0Var.getValue();
        lp40 lp40Var = kvf.a;
        if (lp40Var == null) {
            lp40Var = null;
        }
        if (this.p == null) {
            this.p = ((MusicPrefsComponent) ((k7m) m7m.b(this)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
        }
        com.vk.music.pref.a aVar4 = this.p;
        if (aVar4 == null) {
            aVar4 = null;
        }
        zoi0 zoi0Var = new zoi0(e2b0Var4, this, u2b0Var2, lp40Var, aVar4, bx40Var2);
        this.n = zoi0Var;
        this.o = new api0(this, zoi0Var, ((MusicBroadcastManagerComponent) ((k7m) m7m.b(this)).mo408a(fpf0.a(MusicBroadcastManagerComponent.class))).M(), ((MusicBottomSheetComponent) ((k7m) m7m.b(this)).mo408a(fpf0.a(MusicBottomSheetComponent.class))).C2(), (u2b0) bpn0Var.getValue());
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String packageName = context.getPackageName();
        e2b0 e2b0Var5 = this.d;
        if (e2b0Var5 == null) {
            e2b0Var5 = null;
        }
        int R = e2b0Var5.R();
        this.h.getClass();
        sendBroadcast(tib.b(R, packageName, true));
        kd50 kd50Var = (kd50) bpn0Var2.getValue();
        zoi0 zoi0Var2 = this.n;
        if (zoi0Var2 == null) {
            zoi0Var2 = null;
        }
        kd50Var.N(zoi0Var2);
        e2b0 e2b0Var6 = this.d;
        if (e2b0Var6 == null) {
            e2b0Var6 = null;
        }
        api0 api0Var = this.o;
        e2b0Var6.m0(api0Var != null ? api0Var : null);
    }

    @Override // com.vk.core.service.BoundService, android.app.Service
    public final void onDestroy() {
        int i;
        StringBuilder sb = new StringBuilder("PlayerService onDestroy. bg state: ");
        r6m.a.getClass();
        try {
            Context context = r6m.e;
            if (context == null) {
                context = null;
            }
            i = ((ConnectivityManager) context.getSystemService("connectivity")).getRestrictBackgroundStatus();
        } catch (Exception unused) {
            i = -1;
        }
        sb.append(i);
        bn40.f(sb.toString());
        api0 api0Var = this.o;
        if (api0Var == null) {
            api0Var = null;
        }
        PlayState playState = PlayState.STOPPED;
        e2b0 e2b0Var = this.d;
        if (e2b0Var == null) {
            e2b0Var = null;
        }
        api0Var.N3(playState, e2b0Var.C());
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        String packageName = context2.getPackageName();
        e2b0 e2b0Var2 = this.d;
        if (e2b0Var2 == null) {
            e2b0Var2 = null;
        }
        int R = e2b0Var2.R();
        this.h.getClass();
        sendBroadcast(tib.b(R, packageName, false));
        this.k.f(this);
        ych0 ych0Var = this.l;
        if (ych0Var == null) {
            ych0Var = null;
        }
        ych0Var.F(this);
        boi0 boi0Var = this.m;
        if (boi0Var == null) {
            boi0Var = null;
        }
        boi0Var.f();
        ((NotificationManager) getSystemService("notification")).cancel(2);
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e2b0 e2b0Var3 = this.d;
        if (e2b0Var3 == null) {
            e2b0Var3 = null;
        }
        e2b0Var3.n0();
        dy4 dy4Var = dy4.p;
        dy4Var.f = null;
        if (dy4Var.b == null) {
            dy4Var.b = ((MusicPlayerServiceComponent) j6i.b(m7m.f(dy4Var), MusicPlayerServiceComponent.class)).o4();
        }
        dy4Var.b.a(false);
        enj.s(e43.a, dy4Var.j);
        bpn0 bpn0Var = this.j;
        kd50 kd50Var = (kd50) bpn0Var.getValue();
        zoi0 zoi0Var = this.n;
        if (zoi0Var == null) {
            zoi0Var = null;
        }
        kd50Var.U(zoi0Var);
        ((kd50) bpn0Var.getValue()).release();
        pn40 pn40Var = k840.a;
        pn40Var.getClass();
        bn40.f("MusicMessageQueue", "unsubscribe()");
        c cVar = pn40Var.a;
        if (cVar != null) {
            cVar.dispose();
        }
        pn40Var.a = null;
        pn40Var.b.c();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        this.f = i2;
        if (g()) {
            boi0 boi0Var = this.m;
            (boi0Var != null ? boi0Var : null).d(intent);
            return 2;
        }
        boi0 boi0Var2 = this.m;
        (boi0Var2 != null ? boi0Var2 : null).a(intent);
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        bn40.f("PlayerService onTaskRemoved");
        e2b0 e2b0Var = this.d;
        if (e2b0Var == null) {
            e2b0Var = null;
        }
        if (e2b0Var.getState().i()) {
            StringBuilder sb = new StringBuilder("Performing stop, state=");
            e2b0 e2b0Var2 = this.d;
            if (e2b0Var2 == null) {
                e2b0Var2 = null;
            }
            sb.append(e2b0Var2.getState());
            bn40.f(sb.toString());
            this.k.f(this);
            e2b0 e2b0Var3 = this.d;
            if (e2b0Var3 == null) {
                e2b0Var3 = null;
            }
            e2b0Var3.stop(12);
            e2b0 e2b0Var4 = this.d;
            (e2b0Var4 != null ? e2b0Var4 : null).e0();
            return;
        }
        e2b0 e2b0Var5 = this.d;
        if (e2b0Var5 == null) {
            e2b0Var5 = null;
        }
        if (e2b0Var5.getState().h()) {
            StringBuilder sb2 = new StringBuilder("Performing pause, state=");
            e2b0 e2b0Var6 = this.d;
            if (e2b0Var6 == null) {
                e2b0Var6 = null;
            }
            sb2.append(e2b0Var6.getState());
            bn40.f(sb2.toString());
            e2b0 e2b0Var7 = this.d;
            (e2b0Var7 != null ? e2b0Var7 : null).f0(12);
        }
    }
}
