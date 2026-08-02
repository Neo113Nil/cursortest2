package com.vk.voip.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.api.metrics.CallsMetricsTracker;
import com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aow0;
import xsna.apf;
import xsna.bew0;
import xsna.bfw0;
import xsna.bn;
import xsna.bpn0;
import xsna.c8m;
import xsna.cd3;
import xsna.d29;
import xsna.dr4;
import xsna.ea9;
import xsna.ep;
import xsna.er4;
import xsna.f53;
import xsna.fhw0;
import xsna.fp;
import xsna.fpf0;
import xsna.fr4;
import xsna.frw0;
import xsna.g8m;
import xsna.gbl;
import xsna.hpf0;
import xsna.io80;
import xsna.j55;
import xsna.kmw0;
import xsna.knf;
import xsna.ko80;
import xsna.kp50;
import xsna.m66;
import xsna.n66;
import xsna.nsw;
import xsna.nwy;
import xsna.o66;
import xsna.phw0;
import xsna.psw;
import xsna.pwj0;
import xsna.q12;
import xsna.qcy;
import xsna.r30;
import xsna.rew0;
import xsna.s0f;
import xsna.t99;
import xsna.tog;
import xsna.tvw0;
import xsna.u94;
import xsna.umw0;
import xsna.wh;
import xsna.x2x0;
import xsna.xsw0;
import xsna.z58;
import xsna.zc9;

/* compiled from: VoipCallComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VoipCallComponentImpl implements VoipCallComponent {
    public static final /* synthetic */ qcy<Object>[] B;
    public final nwy A;
    public final AppContextDiComponent a;
    public final Lazy<fhw0> b;
    public final Lazy<t99.a> c;
    public final VoipMiniAppCallComponent d;
    public final Lazy<bfw0> e;
    public final Lazy<String> f;
    public final CallsMetricsTracker g;
    public final Lazy<xsw0> h;
    public final Lazy<bew0> i;
    public final nwy j;
    public final nwy k;
    public final nwy l;
    public final nwy m;
    public final nwy n;
    public final nwy o;
    public final nwy p;
    public final nwy q;
    public final nwy r;
    public final nwy s;
    public final nwy t;
    public final nwy u;
    public final nwy v;
    public final nwy w;
    public final nwy x;
    public final nwy y;
    public final nwy z;

    /* compiled from: VoipCallComponentImpl.kt */
    public static final class a implements c8m<VoipCallComponent, pwj0> {
        public final bpn0 a;
        public final bpn0 b;
        public final bpn0 c;
        public final bpn0 d;
        public final kp50 e;
        public final bpn0 f;
        public final bpn0 g;

        public a(bpn0 bpn0Var, bpn0 bpn0Var2, kp50 kp50Var, bpn0 bpn0Var3, bpn0 bpn0Var4) {
            bpn0 bpn0Var5 = new bpn0(new cd3(19));
            bpn0 bpn0Var6 = new bpn0(new z58(21));
            this.a = bpn0Var;
            this.b = bpn0Var5;
            this.c = bpn0Var6;
            this.d = bpn0Var2;
            this.e = kp50Var;
            this.f = bpn0Var3;
            this.g = bpn0Var4;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipCallComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), this.a, this.b, (VoipMiniAppCallComponent) g8mVar.a(fpf0.a(VoipMiniAppCallComponent.class)), this.c, this.d, this.e, this.f, this.g);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipCallComponentImpl.class, "voipExecutor", "getVoipExecutor()Lcom/vk/voip/api/exec/VoipExecutor;", 0);
        hpf0 hpf0Var = fpf0.a;
        B = new qcy[]{propertyReference1Impl, fp.c(0, VoipCallComponentImpl.class, "router", "getRouter()Lcom/vk/voip/api/VoipCallRouter;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "incomingCallActions", "getIncomingCallActions()Lcom/vk/voip/api/notification/incoming/IncomingCallActions;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "incomingCallActionsProcessor", "getIncomingCallActionsProcessor()Lcom/vk/voip/api/notification/incoming/IncomingCallActionsProcessor;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "ongoingCallActions", "getOngoingCallActions()Lcom/vk/voip/api/notification/ongoing/OngoingCallActions;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "ongoingCallActionsProcessor", "getOngoingCallActionsProcessor()Lcom/vk/voip/api/notification/ongoing/OngoingCallActionsProcessor;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "callSounds", "getCallSounds()Lcom/vk/voip/api/notification/sounds/CallSounds;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "uiLauncherChooser", "getUiLauncherChooser()Lcom/vk/voip/api/launcher/VoipUiLauncherChooser;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "configuration", "getConfiguration()Lcom/vk/voip/api/config/VoipConfiguration;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "authProvider", "getAuthProvider()Lcom/vk/voip/api/auth/VoipAuthDataProvider;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "callsMetrics", "getCallsMetrics()Lcom/vk/voip/api/metrics/CallsMetrics;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "miniAppRouter", "getMiniAppRouter()Lcom/vk/voip/api/miniapps/VoipMiniAppRouter;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "applicationInfo", "getApplicationInfo()Lcom/vk/voip/api/application/VoipApplicationInfo;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "chatHelper", "getChatHelper()Lcom/vk/voip/api/chat/VoipChatHelper;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "debugMenuInteractorProvider", "getDebugMenuInteractorProvider()Lcom/vk/voip/api/debug/menu/CallDebugMenuInteractorProvider;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "callStateInteractor", "getCallStateInteractor()Lcom/vk/voip/api/state/CallStateInteractor;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "pushStatistics", "getPushStatistics()Lcom/vk/voip/api/push/VoipPushStatistics;", hpf0Var), ep.a(0, VoipCallComponentImpl.class, "join", "getJoin()Lcom/vk/voip/api/join/VoipJoinDelegate;", hpf0Var)};
    }

    public VoipCallComponentImpl() {
        throw null;
    }

    public VoipCallComponentImpl(AppContextDiComponent appContextDiComponent, bpn0 bpn0Var, bpn0 bpn0Var2, VoipMiniAppCallComponent voipMiniAppCallComponent, bpn0 bpn0Var3, bpn0 bpn0Var4, kp50 kp50Var, bpn0 bpn0Var5, bpn0 bpn0Var6) {
        this.a = appContextDiComponent;
        this.b = bpn0Var;
        this.c = bpn0Var2;
        this.d = voipMiniAppCallComponent;
        this.e = bpn0Var3;
        this.f = bpn0Var4;
        this.g = kp50Var;
        this.h = bpn0Var5;
        this.i = bpn0Var6;
        this.j = new nwy(new m66(this, 10));
        this.k = new nwy(new gbl(this, 8));
        this.l = new nwy(new n66(this, 12));
        this.m = new nwy(new o66(this, 9));
        this.n = new nwy(new dr4(this, 11));
        this.o = new nwy(new f53(this, 13));
        this.p = new nwy(new er4(this, 9));
        this.q = new nwy(new fr4(this, 11));
        this.r = new nwy(new r30(this, 11));
        this.s = new nwy(new knf(22));
        this.t = new nwy(new q12(this, 8));
        this.u = new nwy(new wh(this, 6));
        this.v = new nwy(new apf(this, 9));
        this.w = new nwy(new tog(16));
        this.x = new nwy(new j55(21));
        this.y = new nwy(new s0f(this, 12));
        this.z = new nwy(new u94(19));
        this.A = new nwy(new bn(this, 8));
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final t99 D9() {
        qcy<Object> qcyVar = B[6];
        return (t99) this.p.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final zc9 F6() {
        qcy<Object> qcyVar = B[10];
        return (zc9) this.t.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final tvw0 Fd() {
        qcy<Object> qcyVar = B[16];
        return (tvw0) this.z.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final rew0 L1() {
        qcy<Object> qcyVar = B[9];
        return (rew0) this.s.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final io80 La() {
        qcy<Object> qcyVar = B[4];
        return (io80) this.n.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final aow0 X6() {
        qcy<Object> qcyVar = B[0];
        return (aow0) this.j.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final ko80 Yc() {
        qcy<Object> qcyVar = B[5];
        return (ko80) this.o.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final phw0 a() {
        qcy<Object> qcyVar = B[1];
        return (phw0) this.k.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final kmw0 a4() {
        qcy<Object> qcyVar = B[13];
        return (kmw0) this.w.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final frw0 c0() {
        qcy<Object> qcyVar = B[17];
        return (frw0) this.A.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final x2x0 ca() {
        qcy<Object> qcyVar = B[7];
        return (x2x0) this.q.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final bew0 d1() {
        qcy<Object> qcyVar = B[12];
        return (bew0) this.v.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final psw e3() {
        qcy<Object> qcyVar = B[3];
        return (psw) this.m.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final umw0 getConfiguration() {
        qcy<Object> qcyVar = B[8];
        return (umw0) this.r.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final xsw0 s4() {
        qcy<Object> qcyVar = B[11];
        return (xsw0) this.u.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final d29 t1() {
        qcy<Object> qcyVar = B[14];
        return (d29) this.x.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final nsw ud() {
        qcy<Object> qcyVar = B[2];
        return (nsw) this.l.c();
    }

    @Override // com.vk.voip.api.di.VoipCallComponent
    public final ea9 wa() {
        qcy<Object> qcyVar = B[15];
        return (ea9) this.y.c();
    }
}
