package com.vk.phoneactualization.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.phoneactualization.api.di.PhoneActualizationComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.i2a0;
import xsna.l2a0;
import xsna.l35;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.ubw;

/* compiled from: PhoneActualizationComponentImpl.kt */
/* loaded from: classes4.dex */
public final class PhoneActualizationComponentImpl implements PhoneActualizationComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(PhoneActualizationComponentImpl.class, "entryPoint", "getEntryPoint()Lcom/vk/phoneactualization/api/domain/PhoneActualizationEntryPoint;", 0), fp.c(0, PhoneActualizationComponentImpl.class, "router", "getRouter()Lcom/vk/phoneactualization/api/router/PhoneActualizationRouter;", fpf0.a)};
    public final nwy a = new nwy(new l35(22));
    public final ewy b = new ewy(new ubw(this, 21));

    /* compiled from: PhoneActualizationComponentImpl.kt */
    public static final class a implements c8m<PhoneActualizationComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PhoneActualizationComponentImpl();
        }
    }

    @Override // com.vk.phoneactualization.api.di.PhoneActualizationComponent
    public final l2a0 a() {
        qcy<Object> qcyVar = c[1];
        return (l2a0) this.b.c();
    }

    @Override // com.vk.phoneactualization.api.di.PhoneActualizationComponent
    public final i2a0 getEntryPoint() {
        qcy<Object> qcyVar = c[0];
        return (i2a0) this.a.c();
    }
}
