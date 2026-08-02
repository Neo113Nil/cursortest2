package com.vk.network.di;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.h360;
import xsna.pwj0;
import xsna.qy8;

/* compiled from: NetworkComponentImpl.kt */
/* loaded from: classes.dex */
public final class NetworkComponentImpl implements NetworkComponent {
    public final NetworkTogglesComponent a;
    public final bpn0 b = new bpn0(new qy8(this, 12));

    /* compiled from: NetworkComponentImpl.kt */
    public static final class a implements c8m<NetworkComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NetworkComponentImpl((NetworkTogglesComponent) g8mVar.a(fpf0.a(NetworkTogglesComponent.class)));
        }
    }

    public NetworkComponentImpl(NetworkTogglesComponent networkTogglesComponent) {
        this.a = networkTogglesComponent;
    }

    @Override // com.vk.network.di.NetworkComponent
    public final h360 vd() {
        return (h360) this.b.getValue();
    }
}
