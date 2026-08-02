package com.vk.community.strikes.impl.di;

import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cg1;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.o2i;
import xsna.pwj0;
import xsna.qcy;
import xsna.wv0;

/* compiled from: CommunityStrikesComponentImpl.kt */
/* loaded from: classes17.dex */
public final class CommunityStrikesComponentImpl implements CommunityStrikesComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(CommunityStrikesComponentImpl.class, "strikesController", "getStrikesController()Lcom/vk/community/strikes/api/controller/CommunityStrikesController;", 0), fp.c(0, CommunityStrikesComponentImpl.class, "strikesRouter", "getStrikesRouter()Lcom/vk/community/strikes/api/router/CommunityStrikesRouter;", fpf0.a)};
    public final nwy a;
    public final nwy b = new nwy(new wv0(9));

    /* compiled from: CommunityStrikesComponentImpl.kt */
    public static final class a implements c8m<CommunityStrikesComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommunityStrikesComponentImpl((DataRepositoryComponent) g8mVar.a(fpf0.a(DataRepositoryComponent.class)));
        }
    }

    public CommunityStrikesComponentImpl(DataRepositoryComponent dataRepositoryComponent) {
        this.a = new nwy(new cg1(10, dataRepositoryComponent, this));
    }

    @Override // com.vk.community.strikes.api.di.CommunityStrikesComponent
    public final o2i ge() {
        qcy<Object> qcyVar = c[0];
        return (o2i) this.a.c();
    }
}
