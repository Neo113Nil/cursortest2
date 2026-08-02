package com.vk.video.ui.upload.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.video.ui.upload.api.di.UploadComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.jcq0;
import xsna.k03;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: UploadComponentImpl.kt */
/* loaded from: classes11.dex */
public final class UploadComponentImpl implements UploadComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new k03(14));

    /* compiled from: UploadComponentImpl.kt */
    public static final class a implements c8m<UploadComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new UploadComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(UploadComponentImpl.class, "router", "getRouter()Lcom/vk/video/ui/upload/api/router/UploadRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.video.ui.upload.api.di.UploadComponent
    public final jcq0 a() {
        qcy<Object> qcyVar = b[0];
        return (jcq0) this.a.c();
    }
}
