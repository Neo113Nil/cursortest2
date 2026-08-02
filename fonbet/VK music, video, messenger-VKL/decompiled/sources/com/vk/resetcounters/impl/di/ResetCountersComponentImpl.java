package com.vk.resetcounters.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.resetcounters.api.di.ResetCountersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.g9g0;
import xsna.kld0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.uv80;

/* compiled from: ResetCountersComponentImpl.kt */
/* loaded from: classes5.dex */
public final class ResetCountersComponentImpl implements ResetCountersComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(ResetCountersComponentImpl.class, "repository", "getRepository()Lcom/vk/resetcounters/api/di/ResetCountersRepository;", 0), fp.c(0, ResetCountersComponentImpl.class, "interactor", "getInteractor()Lcom/vk/resetcounters/api/di/ResetCountersInteractor;", fpf0.a)};
    public final ImConfigurationComponent a;
    public final nwy b = new nwy(new uv80(4));
    public final nwy c = new nwy(new kld0(this, 4));

    /* compiled from: ResetCountersComponentImpl.kt */
    public static final class a implements c8m<ResetCountersComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ResetCountersComponentImpl((ImConfigurationComponent) g8mVar.a(fpf0.a(ImConfigurationComponent.class)));
        }
    }

    public ResetCountersComponentImpl(ImConfigurationComponent imConfigurationComponent) {
        this.a = imConfigurationComponent;
    }

    @Override // com.vk.resetcounters.api.di.ResetCountersComponent
    public final g9g0 b() {
        qcy<Object> qcyVar = d[1];
        return (g9g0) this.c.c();
    }
}
