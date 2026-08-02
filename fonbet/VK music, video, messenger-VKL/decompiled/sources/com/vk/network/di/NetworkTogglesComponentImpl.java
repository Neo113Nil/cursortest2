package com.vk.network.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.toggle.f;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.lu2;
import xsna.pwj0;

/* compiled from: NetworkTogglesComponentImpl.kt */
/* loaded from: classes.dex */
public final class NetworkTogglesComponentImpl implements NetworkTogglesComponent {
    public final bpn0 a = new bpn0(new lu2(10));

    /* compiled from: NetworkTogglesComponentImpl.kt */
    public static final class a implements c8m<NetworkTogglesComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NetworkTogglesComponentImpl();
        }
    }

    @Override // com.vk.network.di.NetworkTogglesComponent
    public final f H9() {
        return (f) this.a.getValue();
    }
}
