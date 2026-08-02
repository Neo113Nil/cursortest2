package com.vk.ecomm.moderation.impl.restrictions.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.subjects.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a530;
import xsna.b25;
import xsna.b7m;
import xsna.cvs;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.k530;
import xsna.k7z;
import xsna.n430;
import xsna.nwy;
import xsna.qcy;
import xsna.s530;
import xsna.sk4;
import xsna.tvj;
import xsna.w9;
import xsna.y330;
import xsna.z430;

/* compiled from: ModerationComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ModerationComponentImpl implements ModerationComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final b25 a;
    public final nwy b = new nwy(new tvj(this, 26));
    public final nwy c = new nwy(new k7z(this, 5));
    public final nwy d = new nwy(new cvs(this, 20));
    public final nwy e = new nwy(new w9(20));
    public final nwy f = new nwy(new sk4(23));

    /* compiled from: ModerationComponentImpl.kt */
    public static final class a implements b7m<ModerationComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ModerationComponentImpl(((BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class))).s());
        }
    }

    /* compiled from: ModerationComponentImpl.kt */
    public static final class b implements a530 {
        public final f<z430> a = new f<>();

        @Override // xsna.a530
        public final q<z430> a() {
            return this.a;
        }

        @Override // xsna.a530
        public final void b(z430 z430Var) {
            this.a.onNext(z430Var);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ModerationComponentImpl.class, "moderationWrapperFactory", "getModerationWrapperFactory()Lcom/vk/ecomm/moderation/api/restrictions/ModerationWrapperFactory;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, ModerationComponentImpl.class, "moderationAdultCheckInteractor", "getModerationAdultCheckInteractor()Lcom/vk/ecomm/moderation/api/restrictions/ModerationAdultCheckInteractor;", hpf0Var), ep.a(0, ModerationComponentImpl.class, "moderationConfirmAdultInteractor", "getModerationConfirmAdultInteractor()Lcom/vk/ecomm/moderation/api/restrictions/ModerationConfirmAdultInteractor;", hpf0Var), ep.a(0, ModerationComponentImpl.class, "moderationRouter", "getModerationRouter()Lcom/vk/ecomm/moderation/api/restrictions/ModerationRouter;", hpf0Var), ep.a(0, ModerationComponentImpl.class, "moderationBus", "getModerationBus()Lcom/vk/ecomm/moderation/api/restrictions/ModerationEventBus;", hpf0Var)};
    }

    public ModerationComponentImpl(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final n430 B0() {
        qcy<Object> qcyVar = g[2];
        return (n430) this.d.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final k530 Q2() {
        qcy<Object> qcyVar = g[3];
        return (k530) this.e.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final y330 bd() {
        qcy<Object> qcyVar = g[1];
        return (y330) this.c.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final s530 pa() {
        qcy<Object> qcyVar = g[0];
        return (s530) this.b.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final a530 uf() {
        qcy<Object> qcyVar = g[4];
        return (a530) this.f.c();
    }
}
