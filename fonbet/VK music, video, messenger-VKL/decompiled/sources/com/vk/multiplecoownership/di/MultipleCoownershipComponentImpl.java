package com.vk.multiplecoownership.di;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.t740;
import xsna.uw3;

/* compiled from: MultipleCoownershipComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MultipleCoownershipComponentImpl implements MultipleCoownershipComponent {
    public final bpn0 a = new bpn0(new uw3(23));

    /* compiled from: MultipleCoownershipComponentImpl.kt */
    public static final class a implements c8m<MultipleCoownershipComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MultipleCoownershipComponentImpl();
        }
    }

    @Override // com.vk.multiplecoownership.di.MultipleCoownershipComponent
    public final t740 a() {
        return (t740) this.a.getValue();
    }
}
