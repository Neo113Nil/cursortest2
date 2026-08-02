package com.vk.audience.impl.di;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ab4;
import xsna.c8m;
import xsna.db4;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.ia4;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u94;
import xsna.v94;
import xsna.w94;

/* compiled from: AudienceResearchComponentImpl.kt */
/* loaded from: classes.dex */
public final class AudienceResearchComponentImpl implements AudienceResearchComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new u94(0));
    public final nwy b = new nwy(new v94(0));
    public final nwy c = new nwy(new w94(0));

    /* compiled from: AudienceResearchComponentImpl.kt */
    public static final class a implements c8m<AudienceResearchComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AudienceResearchComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudienceResearchComponentImpl.class, "interactor", "getInteractor()Lcom/vk/audience/api/domain/AudienceResearchInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, AudienceResearchComponentImpl.class, "urlBuilderFactory", "getUrlBuilderFactory()Lcom/vk/audience/api/domain/AudienceResearchUrlBuilderFactory;", hpf0Var), ep.a(0, AudienceResearchComponentImpl.class, "trackersFactory", "getTrackersFactory()Lcom/vk/audience/api/domain/tracking/AudienceResearchTrackersFactory;", hpf0Var)};
    }

    @Override // com.vk.audience.api.di.AudienceResearchComponent
    public final db4 Z2() {
        qcy<Object> qcyVar = d[1];
        return (db4) this.b.c();
    }

    @Override // com.vk.audience.api.di.AudienceResearchComponent
    public final ia4 b() {
        qcy<Object> qcyVar = d[0];
        return (ia4) this.a.c();
    }

    @Override // com.vk.audience.api.di.AudienceResearchComponent
    public final ab4 y7() {
        qcy<Object> qcyVar = d[2];
        return (ab4) this.c.c();
    }
}
