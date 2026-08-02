package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pbw;
import xsna.pwj0;
import xsna.qcy;
import xsna.r12;

/* compiled from: ImReportersComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImReportersComponentImpl implements ImReportersComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new r12(8));

    /* compiled from: ImReportersComponentImpl.kt */
    public static final class a implements c8m<ImReportersComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImReportersComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImReportersComponentImpl.class, "reporters", "getReporters()Lcom/vk/im/reporters/api/ImReporters;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.reporters.api.di.ImReportersComponent
    public final pbw K() {
        qcy<Object> qcyVar = b[0];
        return (pbw) this.a.c();
    }
}
