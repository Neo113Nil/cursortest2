package com.vk.silentauthbylogin.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.ihg;
import xsna.jhg;
import xsna.kb0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.umj0;
import xsna.wmj0;
import xsna.ymj0;

/* compiled from: SilentAuthByLoginComponentImpl.kt */
/* loaded from: classes11.dex */
public final class SilentAuthByLoginComponentImpl implements SilentAuthByLoginComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final bpn0 a;
    public final ewy b = new ewy(new kb0(8));
    public final ewy c = new ewy(new ihg(8));
    public final nwy d = new nwy(new jhg(this, 8));

    /* compiled from: SilentAuthByLoginComponentImpl.kt */
    public static final class a implements c8m<SilentAuthByLoginComponent, pwj0> {
        public final bpn0 a;

        public a(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SilentAuthByLoginComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SilentAuthByLoginComponentImpl.class, "router", "getRouter()Lcom/vk/silentauthbylogin/presentation/SilentAuthByLoginRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, SilentAuthByLoginComponentImpl.class, "analytics", "getAnalytics()Lcom/vk/silentauthbylogin/domain/SilentAuthByLoginAnalytics;", hpf0Var), ep.a(0, SilentAuthByLoginComponentImpl.class, "repository", "getRepository()Lcom/vk/silentauthbylogin/domain/SilentAuthByLoginRepository;", hpf0Var)};
    }

    public SilentAuthByLoginComponentImpl(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // com.vk.silentauthbylogin.di.SilentAuthByLoginComponent
    public final ymj0 a() {
        qcy<Object> qcyVar = e[0];
        return (ymj0) this.b.c();
    }

    @Override // com.vk.silentauthbylogin.di.SilentAuthByLoginComponent
    public final wmj0 c() {
        qcy<Object> qcyVar = e[2];
        return (wmj0) this.d.c();
    }

    @Override // com.vk.silentauthbylogin.di.SilentAuthByLoginComponent
    public final umj0 d() {
        qcy<Object> qcyVar = e[1];
        return (umj0) this.c.c();
    }
}
