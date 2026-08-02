package com.vk.fave.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.enq;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.gnq;
import xsna.hpf0;
import xsna.isq;
import xsna.l9;
import xsna.ml7;
import xsna.nwy;
import xsna.qcy;
import xsna.qo0;
import xsna.uw3;
import xsna.wrq;

/* compiled from: FaveComponentImpl.kt */
/* loaded from: classes18.dex */
public final class FaveComponentImpl implements FaveComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy a = new nwy(new ml7(8));
    public final nwy b = new nwy(new qo0(16));
    public final nwy c = new nwy(new uw3(15));
    public final nwy d = new nwy(new l9(9));

    /* compiled from: FaveComponentImpl.kt */
    public static final class a implements b7m<FaveComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new FaveComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FaveComponentImpl.class, "faveConverter", "getFaveConverter()Lcom/vk/fave/FaveConverterImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, FaveComponentImpl.class, "faveRouter", "getFaveRouter()Lcom/vk/fave/di/FaveRouterImpl;", hpf0Var), ep.a(0, FaveComponentImpl.class, "faveController", "getFaveController()Lcom/vk/fave/FaveControllerImpl;", hpf0Var), ep.a(0, FaveComponentImpl.class, "faveToggler", "getFaveToggler()Lcom/vk/fave/FaveToggler;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.fave.di.FaveComponent
    public final wrq S8() {
        qcy<Object> qcyVar = e[1];
        return (wrq) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.fave.di.FaveComponent
    public final gnq Va() {
        qcy<Object> qcyVar = e[0];
        return (gnq) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.fave.di.FaveComponent
    public final enq xe() {
        qcy<Object> qcyVar = e[2];
        return (enq) this.c.c();
    }

    @Override // com.vk.fave.di.FaveComponent
    public final isq xf() {
        qcy<Object> qcyVar = e[3];
        return (isq) this.d.c();
    }
}
