package com.vk.browserlogin.impl.di;

import com.vk.browserlogin.api.di.BrowserLoginComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.d1;
import xsna.fpf0;
import xsna.g8m;
import xsna.lk8;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: BrowserLoginComponentImpl.kt */
/* loaded from: classes15.dex */
public final class BrowserLoginComponentImpl implements BrowserLoginComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new d1(5));

    /* compiled from: BrowserLoginComponentImpl.kt */
    public static final class a implements c8m<BrowserLoginComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new BrowserLoginComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BrowserLoginComponentImpl.class, "browserAuthLinkRepository", "getBrowserAuthLinkRepository()Lcom/vk/browserlogin/api/BrowserAuthLinkRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.browserlogin.api.di.BrowserLoginComponent
    public final lk8 of() {
        qcy<Object> qcyVar = b[0];
        return (lk8) this.a.c();
    }
}
