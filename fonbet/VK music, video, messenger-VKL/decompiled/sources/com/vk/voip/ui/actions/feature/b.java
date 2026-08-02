package com.vk.voip.ui.actions.feature;

import android.app.Activity;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.q2;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.f;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.ap80;
import xsna.awi0;
import xsna.bj50;
import xsna.bv4;
import xsna.c80;
import xsna.cfi0;
import xsna.d7l0;
import xsna.efr0;
import xsna.gj9;
import xsna.gsi0;
import xsna.gzs;
import xsna.l570;
import xsna.mcw0;
import xsna.mft0;
import xsna.mlh0;
import xsna.n5j0;
import xsna.o8c0;
import xsna.obc;
import xsna.or20;
import xsna.p9w0;
import xsna.qc00;
import xsna.rcw0;
import xsna.rd9;
import xsna.uki;
import xsna.vcw0;
import xsna.vtg0;
import xsna.wep0;
import xsna.wii0;
import xsna.wot;
import xsna.y160;
import xsna.ysg0;
import xsna.yvq0;
import xsna.zo80;
import xsna.zzq0;

/* compiled from: VoipActionsFeatureDataProvider.kt */
/* loaded from: classes7.dex */
public class b {
    public final gzs<Activity> a;
    public final l570 b;
    public final CallEffectsDependency c;
    public final gj9 d;
    public final wot e;
    public final c f;

    public b(gzs gzsVar, l570 l570Var, CallEffectsDependency callEffectsDependency, gj9 gj9Var, wot wotVar, rd9 rd9Var, c cVar) {
        this.a = gzsVar;
        this.b = l570Var;
        this.c = callEffectsDependency;
        this.d = gj9Var;
        this.e = wotVar;
        this.f = cVar;
        callEffectsDependency.b();
        callEffectsDependency.d((Activity) gzsVar.invoke());
        l570Var.b();
    }

    public static boolean b() {
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.InCall && com.vk.voip.ui.c.K0 != VoipViewModelState.CallingPeer) {
            return false;
        }
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        return oKVoipEngine.isMeCreatorOrAdmin() && oKVoipEngine.isGroupCall();
    }

    public static y f(gzs gzsVar) {
        f<Object> fVar = ysg0.b.a;
        gsi0 gsi0Var = new gsi0(7);
        fVar.getClass();
        q o0 = new i0(fVar, gsi0Var).U(new o8c0(gzsVar, 14)).o0(new v(new obc(gzsVar, 2)));
        o0.getClass();
        return new y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static y g() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.W().b(true);
    }

    public static q j() {
        com.vk.voip.ui.c.b.getClass();
        return q.m(new io.reactivex.rxjava3.internal.operators.observable.q(new zzq0(4)).U(new or20(new d7l0(18), 24)), com.vk.voip.ui.c.M0(), new wii0(new bv4((byte) 0, 11), 17));
    }

    public final q2 c() {
        q<T> p0 = this.c.e().p0(CallEffectsDependency.DynamicLibsState.NOT_LOADED);
        p0.getClass();
        return new q2(new y(p0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new n5j0(new y160(23), 11));
    }

    public final q2 d() {
        j1 U = q.P(0L, 1000L, TimeUnit.MILLISECONDS).U(new bj50(new efr0(this, 13), 21));
        yvq0 yvq0Var = new yvq0(new vcw0(this, 0), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        q s = q.s(q.T(Boolean.FALSE), U.E(yvq0Var, lVar, kVar, kVar));
        s.getClass();
        return new q2(new y(s, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new mft0(new wep0(8)));
    }

    public final q<VoipActionsFeatureState.e> e() {
        return c().U(new awi0(new p9w0(1), 13)).p(new rcw0(new VoipActionsFeatureState.e(false)));
    }

    public final q<VoipActionsFeatureState.n> h() {
        mcw0 mcw0Var = (mcw0) this;
        return q.m(f(new qc00(mcw0Var)), f(new cfi0(mcw0Var)), new vtg0(new uki(8), 16)).p(new rcw0(new VoipActionsFeatureState.n(false, MediaOptionState.UNMUTED)));
    }

    public final q<VoipActionsFeatureState.o> i() {
        mcw0 mcw0Var = (mcw0) this;
        return q.m(f(new zo80(mcw0Var)), f(new ap80(mcw0Var, 20)), new mlh0(new c80(6), 8)).p(new rcw0(new VoipActionsFeatureState.o(false, MediaOptionState.UNMUTED)));
    }
}
