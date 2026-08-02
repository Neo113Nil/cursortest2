package com.vk.push.rustore.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.rustore.di.RuStoreComponent;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.asu0;
import xsna.b290;
import xsna.buc0;
import xsna.c8m;
import xsna.crg0;
import xsna.e3c0;
import xsna.ep;
import xsna.erg0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.grg0;
import xsna.hpf0;
import xsna.k100;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.su80;
import xsna.ta50;

/* compiled from: RuStoreComponentImpl.kt */
/* loaded from: classes5.dex */
public final class RuStoreComponentImpl implements RuStoreComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final ExecutorService a;
    public final nwy b = new nwy(new b290(this, 13));
    public final nwy c = new nwy(new buc0(3));
    public final nwy d = new nwy(new ta50(5));
    public final nwy e = new nwy(new su80(this, 16));

    /* compiled from: RuStoreComponentImpl.kt */
    public static final class a implements c8m<RuStoreComponent, pwj0> {
        public a(e3c0 e3c0Var) {
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            asu0.a.getClass();
            return new RuStoreComponentImpl(asu0.s());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(RuStoreComponentImpl.class, "ruStorePushBridge", "getRuStorePushBridge()Lcom/vk/rustore/pushes/RuStorePushBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, RuStoreComponentImpl.class, "ruStorePreference", "getRuStorePreference()Lcom/vk/rustore/data/sharedpref/RuStorePreference;", hpf0Var), ep.a(0, RuStoreComponentImpl.class, "ruStoreLogger", "getRuStoreLogger()Lru/rustore/sdk/pushclient/common/logger/Logger;", hpf0Var), ep.a(0, RuStoreComponentImpl.class, "ruStorePushInteractor", "getRuStorePushInteractor()Lcom/vk/rustore/domain/interactor/RuStorePushInteractor;", hpf0Var)};
    }

    public RuStoreComponentImpl(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // com.vk.rustore.di.RuStoreComponent
    public final grg0 Bf() {
        qcy<Object> qcyVar = f[3];
        return (grg0) this.e.c();
    }

    @Override // com.vk.rustore.di.RuStoreComponent
    public final ExecutorService F3() {
        return this.a;
    }

    @Override // com.vk.rustore.di.RuStoreComponent
    public final k100 Ma() {
        qcy<Object> qcyVar = f[2];
        return (k100) this.d.c();
    }

    @Override // com.vk.rustore.di.RuStoreComponent
    public final crg0 se() {
        qcy<Object> qcyVar = f[1];
        return (crg0) this.c.c();
    }

    @Override // com.vk.rustore.di.RuStoreComponent
    public final erg0 u6() {
        qcy<Object> qcyVar = f[0];
        return (erg0) this.b.c();
    }
}
