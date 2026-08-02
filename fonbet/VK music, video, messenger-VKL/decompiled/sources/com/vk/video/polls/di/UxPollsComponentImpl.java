package com.vk.video.polls.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.movika.sdk.base.ui.p;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.ghn0;
import xsna.hpf0;
import xsna.j6;
import xsna.jzm0;
import xsna.nwy;
import xsna.p1d0;
import xsna.pwj0;
import xsna.qcy;
import xsna.r4r0;
import xsna.u4r0;
import xsna.y4r0;
import xsna.yqd0;

/* compiled from: UxPollsComponentImpl.kt */
/* loaded from: classes6.dex */
public final class UxPollsComponentImpl implements UxPollsComponent {
    public static final /* synthetic */ qcy<Object>[] i;
    public final AppContextDiComponent a;
    public final bpn0 b;
    public final bpn0 c;
    public final nwy e;
    public final nwy g;
    public final nwy d = new nwy(new p1d0(this, 27));
    public final nwy f = new nwy(new jzm0(5));
    public final nwy h = new nwy(new ghn0(this, 3));

    /* compiled from: UxPollsComponentImpl.kt */
    public static final class a implements c8m<UxPollsComponent, pwj0> {
        public final bpn0 a;

        public a(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new UxPollsComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), this.a, new bpn0(new yqd0(g8mVar, 13)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(UxPollsComponentImpl.class, "mapper", "getMapper()Lcom/vk/video/polls/mapper/UxPollsApiMapperImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        i = new qcy[]{propertyReference1Impl, fp.c(0, UxPollsComponentImpl.class, "pollsRepository", "getPollsRepository$impl_release()Lcom/vk/video/polls/repo/UxPollsRepo;", hpf0Var), ep.a(0, UxPollsComponentImpl.class, "analyticsSessionManager", "getAnalyticsSessionManager()Lcom/vk/video/polls/analytics/UxPollsAnalyticsSessionManager;", hpf0Var), ep.a(0, UxPollsComponentImpl.class, "pollsDelegate", "getPollsDelegate()Lcom/vk/video/polls/UxPollsDelegate;", hpf0Var), ep.a(0, UxPollsComponentImpl.class, "entryPointDelegate", "getEntryPointDelegate()Lcom/vk/video/polls/entrypoint/UxPollsEntryPointDelegate;", hpf0Var)};
    }

    public UxPollsComponentImpl(AuthBridgeComponent authBridgeComponent, AppContextDiComponent appContextDiComponent, bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = appContextDiComponent;
        this.b = bpn0Var;
        this.c = bpn0Var2;
        this.e = new nwy(new j6(19, authBridgeComponent, this));
        this.g = new nwy(new p(21, this, authBridgeComponent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.video.polls.di.UxPollsComponent
    public final r4r0 Z4() {
        qcy<Object> qcyVar = i[0];
        return (r4r0) this.d.c();
    }

    @Override // com.vk.video.polls.di.UxPollsComponent
    public final u4r0 o2() {
        qcy<Object> qcyVar = i[3];
        return (u4r0) this.g.c();
    }

    @Override // com.vk.video.polls.di.UxPollsComponent
    public final y4r0 v8() {
        qcy<Object> qcyVar = i[4];
        return (y4r0) this.h.c();
    }
}
