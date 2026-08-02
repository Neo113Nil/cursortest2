package com.vk.superapp.qr.web2app;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ag6;
import xsna.c8m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.koe0;
import xsna.noe0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.y45;

/* compiled from: QrWebToAppComponentImpl.kt */
/* loaded from: classes11.dex */
public final class QrWebToAppComponentImpl implements QrWebToAppComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(QrWebToAppComponentImpl.class, "handler", "getHandler()Lcom/vk/superapp/qr/web2app/QrWebToAppHandler;", 0), fp.c(0, QrWebToAppComponentImpl.class, "repository", "getRepository()Lcom/vk/superapp/qr/web2app/QrWebToAppRepository;", fpf0.a)};
    public final SessionManagementComponent a;
    public final nwy b = new nwy(new y45(10));
    public final ewy c = new ewy(new ag6(this, 10));

    /* compiled from: QrWebToAppComponentImpl.kt */
    public static final class a implements c8m<QrWebToAppComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new QrWebToAppComponentImpl((SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)));
        }
    }

    public QrWebToAppComponentImpl(SessionManagementComponent sessionManagementComponent) {
        this.a = sessionManagementComponent;
    }

    @Override // com.vk.superapp.qr.web2app.QrWebToAppComponent
    public final noe0 c() {
        qcy<Object> qcyVar = d[1];
        return (noe0) this.c.c();
    }

    @Override // com.vk.superapp.qr.web2app.QrWebToAppComponent
    public final koe0 getHandler() {
        qcy<Object> qcyVar = d[0];
        return (koe0) this.b.c();
    }
}
