package com.vk.oauth.di;

import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.auth.oauth.di.b;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rq6;
import xsna.sq6;

/* compiled from: OAuthComponentImpl.kt */
/* loaded from: classes.dex */
public final class OAuthComponentImpl implements OAuthComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(OAuthComponentImpl.class, "oAuthManager", "getOAuthManager()Lcom/vk/auth/oauth/di/OAuthManager;", 0), fp.c(0, OAuthComponentImpl.class, "verificationOAuthManager", "getVerificationOAuthManager()Lcom/vk/auth/oauth/di/VerificationOAuthManager;", fpf0.a)};
    public final nwy a = new nwy(new rq6(8));
    public final nwy b = new nwy(new sq6(11));

    /* compiled from: OAuthComponentImpl.kt */
    public static final class a implements c8m<OAuthComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new OAuthComponentImpl();
        }
    }

    @Override // com.vk.auth.oauth.di.OAuthComponent
    public final com.vk.auth.oauth.di.a B8() {
        qcy<Object> qcyVar = c[0];
        return (com.vk.auth.oauth.di.a) this.a.c();
    }

    @Override // com.vk.auth.oauth.di.OAuthComponent
    public final b p1() {
        qcy<Object> qcyVar = c[1];
        return (b) this.b.c();
    }
}
