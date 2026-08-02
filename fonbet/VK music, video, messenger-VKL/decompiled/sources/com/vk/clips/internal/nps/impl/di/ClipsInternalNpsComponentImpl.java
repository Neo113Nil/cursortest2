package com.vk.clips.internal.nps.impl.di;

import com.vk.clips.internal.nps.api.di.ClipsInternalNpsComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.af0;
import xsna.c8m;
import xsna.de4;
import xsna.ee4;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.l63;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s7a;
import xsna.w9;

/* compiled from: ClipsInternalNpsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsInternalNpsComponentImpl implements ClipsInternalNpsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final nwy a = new nwy(new a44(8));
    public final nwy b = new nwy(new de4(9));
    public final ewy c = new ewy(new ee4(7));
    public final ewy d = new ewy(new l63(8));
    public final nwy e = new nwy(new af0(8));
    public final nwy f = new nwy(new w9(5));

    /* compiled from: ClipsInternalNpsComponentImpl.kt */
    public static final class a implements c8m<ClipsInternalNpsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsInternalNpsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsInternalNpsComponentImpl.class, "catalogInternalNpsViewFactory", "getCatalogInternalNpsViewFactory()Lcom/vk/clips/internal/nps/api/CatalogInternalNpsViewFactory;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, ClipsInternalNpsComponentImpl.class, "mapperFactory", "getMapperFactory$impl_release()Lcom/vk/clips/internal/nps/impl/mapper/NpsMapperFactory;", hpf0Var), ep.a(0, ClipsInternalNpsComponentImpl.class, "reducer", "getReducer()Lcom/vk/clips/internal/nps/impl/feature/common/InternalNpsReducer;", hpf0Var), ep.a(0, ClipsInternalNpsComponentImpl.class, "chainsSearch", "getChainsSearch()Lcom/vk/clips/internal/nps/impl/domain/ChainsSearch;", hpf0Var), ep.a(0, ClipsInternalNpsComponentImpl.class, "internalNpsCatalogRepository", "getInternalNpsCatalogRepository()Lcom/vk/clips/internal/nps/impl/domain/InternalNpsCatalogRepositoryImpl;", hpf0Var), ep.a(0, ClipsInternalNpsComponentImpl.class, "internalNpsStateHolderImpl", "getInternalNpsStateHolderImpl()Lcom/vk/clips/internal/nps/impl/domain/InternalNpsStateHolderImpl;", hpf0Var)};
    }

    @Override // com.vk.clips.internal.nps.api.di.ClipsInternalNpsComponent
    public final s7a ua() {
        qcy<Object> qcyVar = g[0];
        return (s7a) this.a.c();
    }
}
