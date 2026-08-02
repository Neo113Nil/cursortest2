package com.vk.antispam.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cw2;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.yv2;

/* compiled from: AntispamComponentImpl.kt */
/* loaded from: classes14.dex */
public final class AntispamComponentImpl implements AntispamComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new yv2(0));

    /* compiled from: AntispamComponentImpl.kt */
    public static final class a implements b7m<AntispamComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AntispamComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AntispamComponentImpl.class, "antispamRouter", "getAntispamRouter()Lcom/vk/antispam/AntispamRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.antispam.di.AntispamComponent
    public final cw2 ae() {
        qcy<Object> qcyVar = b[0];
        return (cw2) this.a.c();
    }
}
