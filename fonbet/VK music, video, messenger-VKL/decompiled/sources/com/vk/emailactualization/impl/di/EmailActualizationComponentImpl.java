package com.vk.emailactualization.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.emailactualization.api.di.EmailActualizationComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bb3;
import xsna.c8m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.vbp;
import xsna.wbp;
import xsna.zbp;

/* compiled from: EmailActualizationComponentImpl.kt */
/* loaded from: classes.dex */
public final class EmailActualizationComponentImpl implements EmailActualizationComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(EmailActualizationComponentImpl.class, "entryPoint", "getEntryPoint()Lcom/vk/emailactualization/api/domain/EmailActualizationEntryPoint;", 0), fp.c(0, EmailActualizationComponentImpl.class, "router", "getRouter()Lcom/vk/emailactualization/api/router/EmailActualizationRouter;", fpf0.a)};
    public final nwy a = new nwy(new bb3(3));
    public final ewy b = new ewy(new vbp(this, 0));

    /* compiled from: EmailActualizationComponentImpl.kt */
    public static final class a implements c8m<EmailActualizationComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new EmailActualizationComponentImpl();
        }
    }

    @Override // com.vk.emailactualization.api.di.EmailActualizationComponent
    public final zbp a() {
        qcy<Object> qcyVar = c[1];
        return (zbp) this.b.c();
    }

    @Override // com.vk.emailactualization.api.di.EmailActualizationComponent
    public final wbp getEntryPoint() {
        qcy<Object> qcyVar = c[0];
        return (wbp) this.a.c();
    }
}
