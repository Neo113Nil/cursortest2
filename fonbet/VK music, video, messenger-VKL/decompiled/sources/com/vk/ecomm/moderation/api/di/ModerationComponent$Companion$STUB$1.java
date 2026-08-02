package com.vk.ecomm.moderation.api.di;

import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.a530;
import xsna.c6;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.k530;
import xsna.n1;
import xsna.n430;
import xsna.qcy;
import xsna.s530;
import xsna.te0;
import xsna.y330;
import xsna.z34;

/* compiled from: ModerationComponent.kt */
/* loaded from: classes18.dex */
public final class ModerationComponent$Companion$STUB$1 implements ModerationComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final ewy a = new ewy(new te0(25));
    public final ewy b = new ewy(new c6(17));
    public final ewy c = new ewy(new z34(21));
    public final ewy d = new ewy(new n1(23));
    public final ewy e = new ewy(new a44(25));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ModerationComponent$Companion$STUB$1.class, "moderationWrapperFactory", "getModerationWrapperFactory()Lcom/vk/ecomm/moderation/api/restrictions/ModerationWrapperFactory;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, ModerationComponent$Companion$STUB$1.class, "moderationAdultCheckInteractor", "getModerationAdultCheckInteractor()Lcom/vk/ecomm/moderation/api/restrictions/ModerationAdultCheckInteractor;", hpf0Var), ep.a(0, ModerationComponent$Companion$STUB$1.class, "moderationConfirmAdultInteractor", "getModerationConfirmAdultInteractor()Lcom/vk/ecomm/moderation/api/restrictions/ModerationConfirmAdultInteractor;", hpf0Var), ep.a(0, ModerationComponent$Companion$STUB$1.class, "moderationRouter", "getModerationRouter()Lcom/vk/ecomm/moderation/api/restrictions/ModerationRouter;", hpf0Var), ep.a(0, ModerationComponent$Companion$STUB$1.class, "moderationBus", "getModerationBus()Lcom/vk/ecomm/moderation/api/restrictions/ModerationEventBus;", hpf0Var)};
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final n430 B0() {
        qcy<Object> qcyVar = f[2];
        return (n430) this.c.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final k530 Q2() {
        qcy<Object> qcyVar = f[3];
        return (k530) this.d.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final y330 bd() {
        qcy<Object> qcyVar = f[1];
        return (y330) this.b.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final s530 pa() {
        qcy<Object> qcyVar = f[0];
        return (s530) this.a.c();
    }

    @Override // com.vk.ecomm.moderation.api.di.ModerationComponent
    public final a530 uf() {
        qcy<Object> qcyVar = f[4];
        return (a530) this.e.c();
    }
}
