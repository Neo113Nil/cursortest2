package com.vk.translate.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.translate.api.di.TranslateComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.eul0;
import xsna.g8m;
import xsna.pnp0;
import xsna.pwj0;

/* compiled from: TranslateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class TranslateComponentImpl implements TranslateComponent {
    public final bpn0 a = new bpn0(new eul0(1));

    /* compiled from: TranslateComponentImpl.kt */
    public static final class a implements c8m<TranslateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new TranslateComponentImpl();
        }
    }

    @Override // com.vk.translate.api.di.TranslateComponent
    public final pnp0 Q6() {
        return (pnp0) this.a.getValue();
    }
}
