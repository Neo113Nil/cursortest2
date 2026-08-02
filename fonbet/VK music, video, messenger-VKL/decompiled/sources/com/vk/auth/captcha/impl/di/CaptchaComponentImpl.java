package com.vk.auth.captcha.impl.di;

import com.vk.auth.captcha.api.di.CaptchaComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.qe3;
import xsna.wzg0;

/* compiled from: CaptchaComponentImpl.kt */
/* loaded from: classes15.dex */
public final class CaptchaComponentImpl implements CaptchaComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new qe3(5));

    /* compiled from: CaptchaComponentImpl.kt */
    public static final class a implements b7m<CaptchaComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CaptchaComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CaptchaComponentImpl.class, "sakCaptchaHandler", "getSakCaptchaHandler()Lcom/vk/auth/captcha/api/SakCaptchaHandler;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.auth.captcha.api.di.CaptchaComponent
    public final wzg0 D1() {
        qcy<Object> qcyVar = b[0];
        return (wzg0) this.a.c();
    }
}
