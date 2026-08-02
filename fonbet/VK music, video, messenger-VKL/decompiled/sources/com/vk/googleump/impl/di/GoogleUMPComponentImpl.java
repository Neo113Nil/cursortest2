package com.vk.googleump.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.googleump.api.di.GoogleUMPComponent;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.lau;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xyh;

/* compiled from: GoogleUMPComponentImpl.kt */
/* loaded from: classes2.dex */
public final class GoogleUMPComponentImpl implements GoogleUMPComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: GoogleUMPComponentImpl.kt */
    public static final class a implements c8m<GoogleUMPComponent, pwj0> {
        public final ExecutorService a;

        public a(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new GoogleUMPComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GoogleUMPComponentImpl.class, "googleUmp", "getGoogleUmp()Lcom/vk/googleump/api/GoogleUMP;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public GoogleUMPComponentImpl(ExecutorService executorService) {
        this.a = new nwy(new xyh(executorService, 18));
    }

    @Override // com.vk.googleump.api.di.GoogleUMPComponent
    public final lau P4() {
        qcy<Object> qcyVar = b[0];
        return (lau) this.a.c();
    }
}
