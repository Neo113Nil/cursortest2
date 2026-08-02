package com.vk.auth.oauth.component.impl.di;

import com.vk.auth.oauth.component.di.OAuthUiComponent;
import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.f25;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.lnf;
import xsna.pwj0;
import xsna.qcy;
import xsna.zn70;

/* compiled from: OAuthUiComponentImpl.kt */
/* loaded from: classes.dex */
public final class OAuthUiComponentImpl implements OAuthUiComponent {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(OAuthUiComponentImpl.class, "oAuthErrorRouter", "getOAuthErrorRouter()Lcom/vk/auth/oauth/component/errorrouter/OAuthErrorRouter;", 0), fp.c(0, OAuthUiComponentImpl.class, "grayOAuthBind", "getGrayOAuthBind()Lcom/vk/auth/oauth/component/bind/VkGrayOAuthBind;", fpf0.a)};
    public final ewy a;

    /* compiled from: OAuthUiComponentImpl.kt */
    public static final class a implements c8m<OAuthUiComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new OAuthUiComponentImpl((OAuthComponent) g8mVar.a(fpf0.a(OAuthComponent.class)));
        }
    }

    public OAuthUiComponentImpl(OAuthComponent oAuthComponent) {
        this.a = new ewy(new f25(this, oAuthComponent));
        new ewy(new lnf(7));
    }

    @Override // com.vk.auth.oauth.component.di.OAuthUiComponent
    public final zn70 n1() {
        qcy<Object> qcyVar = b[0];
        return (zn70) this.a.c();
    }
}
