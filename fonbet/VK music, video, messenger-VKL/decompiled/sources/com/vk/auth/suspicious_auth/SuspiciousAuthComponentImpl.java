package com.vk.auth.suspicious_auth;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.w2a0;

/* compiled from: SuspiciousAuthComponent.kt */
/* loaded from: classes15.dex */
public final class SuspiciousAuthComponentImpl implements SuspiciousAuthComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new w2a0(12));

    /* compiled from: SuspiciousAuthComponent.kt */
    public static final class a implements c8m<SuspiciousAuthComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SuspiciousAuthComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuspiciousAuthComponentImpl.class, "repository", "getRepository()Lcom/vk/auth/suspicious_auth/SuspiciousAuthRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.auth.suspicious_auth.SuspiciousAuthComponent
    public final b c() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
