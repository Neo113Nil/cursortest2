package com.vk.fullscreen.promo.core;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.t0f;
import xsna.zys;

/* compiled from: FullscreenPromoComponentImpl.kt */
/* loaded from: classes.dex */
public final class FullscreenPromoComponentImpl implements FullscreenPromoComponent {
    public final bpn0 a = new bpn0(new t0f(2));

    /* compiled from: FullscreenPromoComponentImpl.kt */
    public static final class a implements c8m<FullscreenPromoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new FullscreenPromoComponentImpl();
        }
    }

    @Override // com.vk.fullscreen.promo.core.FullscreenPromoComponent
    public final zys n() {
        return (zys) this.a.getValue();
    }
}
