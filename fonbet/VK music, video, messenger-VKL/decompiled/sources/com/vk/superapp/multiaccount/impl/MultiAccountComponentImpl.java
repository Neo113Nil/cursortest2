package com.vk.superapp.multiaccount.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.api.d;
import com.vk.superapp.multiaccount.api.e;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.hpf0;
import xsna.ib8;
import xsna.jb8;
import xsna.l67;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u240;
import xsna.yp6;

/* compiled from: MultiAccountComponentImpl.kt */
/* loaded from: classes11.dex */
public final class MultiAccountComponentImpl implements MultiAccountComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy c;
    public final ewy a = new ewy(new yp6(7));
    public final nwy b = new nwy(new ib8(this, 6));
    public final ewy d = new ewy(new l67(4));

    /* compiled from: MultiAccountComponentImpl.kt */
    public static final class a implements c8m<MultiAccountComponent, pwj0> {
        public final gzs<ExecutorService> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gzs<? extends ExecutorService> gzsVar) {
            this.a = gzsVar;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MultiAccountComponentImpl(this.a.invoke());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MultiAccountComponentImpl.class, "router", "getRouter()Lcom/vk/superapp/multiaccount/api/MultiAccountRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, MultiAccountComponentImpl.class, "repository", "getRepository()Lcom/vk/superapp/multiaccount/api/MultiAccountRepository;", hpf0Var), ep.a(0, MultiAccountComponentImpl.class, "analytics", "getAnalytics()Lcom/vk/superapp/multiaccount/api/MultiAccountAnalytics;", hpf0Var), ep.a(0, MultiAccountComponentImpl.class, "relatedPinCodeEventsSubscriber", "getRelatedPinCodeEventsSubscriber()Lcom/vk/superapp/multiaccount/api/MultiAccountRelatedPinCodeEventsSubscriber;", hpf0Var)};
    }

    public MultiAccountComponentImpl(ExecutorService executorService) {
        this.c = new nwy(new jb8(executorService, 5));
    }

    @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
    public final e a() {
        qcy<Object> qcyVar = e[0];
        return (e) this.a.c();
    }

    @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
    public final d c() {
        qcy<Object> qcyVar = e[1];
        return (d) this.b.c();
    }

    @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
    public final com.vk.superapp.multiaccount.api.a d() {
        qcy<Object> qcyVar = e[2];
        return (com.vk.superapp.multiaccount.api.a) this.c.c();
    }

    @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
    public final u240 q2() {
        qcy<Object> qcyVar = e[3];
        return (u240) this.d.c();
    }
}
