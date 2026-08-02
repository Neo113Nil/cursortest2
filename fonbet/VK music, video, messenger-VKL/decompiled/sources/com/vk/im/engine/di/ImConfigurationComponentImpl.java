package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.f1w;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.knf;
import xsna.lnf;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.uuf0;

/* compiled from: ImConfigurationComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImConfigurationComponentImpl implements ImConfigurationComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ImConfigurationComponentImpl.class, "remoteConfig", "getRemoteConfig()Lcom/vk/im/engine/config/RemoteConfig;", 0), fp.c(0, ImConfigurationComponentImpl.class, "engineConfig", "getEngineConfig()Lcom/vk/im/engine/config/ImEngineConfiguration;", fpf0.a)};
    public final nwy a = new nwy(new knf(7));
    public final nwy b = new nwy(new lnf(5));

    /* compiled from: ImConfigurationComponentImpl.kt */
    public static final class a implements c8m<ImConfigurationComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImConfigurationComponentImpl();
        }
    }

    @Override // com.vk.im.engine.di.ImConfigurationComponent
    public final f1w b0() {
        qcy<Object> qcyVar = c[1];
        return (f1w) this.b.c();
    }

    @Override // com.vk.im.engine.di.ImConfigurationComponent
    public final uuf0 q6() {
        qcy<Object> qcyVar = c[0];
        return (uuf0) this.a.c();
    }
}
