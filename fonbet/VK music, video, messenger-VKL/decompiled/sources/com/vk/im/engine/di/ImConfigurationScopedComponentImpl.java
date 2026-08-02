package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.bpn0;
import xsna.c5f;
import xsna.c8m;
import xsna.f1w;
import xsna.fc;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.jrh;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ImConfigurationScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImConfigurationScopedComponentImpl implements ImConfigurationScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(ImConfigurationScopedComponentImpl.class, "remoteConfig", "getRemoteConfig()Lcom/vk/im/engine/config/RemoteConfig;", 0), fp.c(0, ImConfigurationScopedComponentImpl.class, "engineConfig", "getEngineConfig()Lcom/vk/im/engine/config/ImEngineConfiguration;", fpf0.a)};
    public final acw a;
    public final bpn0 b;
    public final nwy c;

    /* compiled from: ImConfigurationScopedComponentImpl.kt */
    public static final class a implements c8m<ImConfigurationScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImConfigurationScopedComponentImpl((acw) pwj0Var, new bpn0(new jrh(g8mVar, 18)));
        }
    }

    public ImConfigurationScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
        new nwy(new fc(17));
        this.c = new nwy(new c5f(this, 26));
    }

    @Override // com.vk.im.engine.di.ImConfigurationScopedComponent
    public final f1w b0() {
        qcy<Object> qcyVar = d[1];
        return (f1w) this.c.c();
    }
}
