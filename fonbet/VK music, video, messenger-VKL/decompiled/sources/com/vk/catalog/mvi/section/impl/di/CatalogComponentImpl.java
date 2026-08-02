package com.vk.catalog.mvi.section.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.api.di.CatalogMviLegacyComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.di.component.DiScopedComponent;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a67;
import xsna.b25;
import xsna.c8m;
import xsna.cg50;
import xsna.dea;
import xsna.ep;
import xsna.f1u;
import xsna.fba;
import xsna.fp;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g7s0;
import xsna.g8m;
import xsna.hpf0;
import xsna.m7a;
import xsna.maz;
import xsna.msy;
import xsna.np;
import xsna.nwy;
import xsna.p1e;
import xsna.pwj0;
import xsna.qcy;
import xsna.qmk;
import xsna.s3a;
import xsna.t3a;
import xsna.u3a;
import xsna.v3a;
import xsna.v62;
import xsna.w3a;
import xsna.w62;
import xsna.xb3;

/* compiled from: CatalogComponentImpl.kt */
/* loaded from: classes.dex */
public final class CatalogComponentImpl implements CatalogComponent {
    public static final /* synthetic */ qcy<Object>[] j;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final nwy h;
    public final nwy e = new nwy(new s3a(0));
    public final nwy f = new nwy(new t3a(this, 0));
    public final nwy g = new nwy(new v62(this, 1));
    public final nwy i = new nwy(new xb3(2));

    /* compiled from: CatalogComponentImpl.kt */
    public static final class a implements c8m<CatalogComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            np npVar = new np(g8mVar, 3);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new CatalogComponentImpl(msy.a(lazyThreadSafetyMode, npVar), msy.a(lazyThreadSafetyMode, new a67(g8mVar, 2)), msy.a(lazyThreadSafetyMode, new u3a(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new v3a(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new w3a(g8mVar, 0)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogComponentImpl.class, "globalCatalogBlockRegister", "getGlobalCatalogBlockRegister()Lcom/vk/catalog/mvi/register/GlobalCatalogBlockRegister;", 0);
        hpf0 hpf0Var = fpf0.a;
        j = new qcy[]{propertyReference1Impl, fp.c(0, CatalogComponentImpl.class, "catalogInteractor", "getCatalogInteractor()Lcom/vk/catalog/mvi/section/domain/CatalogInteractor;", hpf0Var), ep.a(0, CatalogComponentImpl.class, "catalogMviLegacyLauncher", "getCatalogMviLegacyLauncher()Lcom/vk/catalog/mvi/api/ui/CatalogMviLegacyLauncher;", hpf0Var), ep.a(0, CatalogComponentImpl.class, "clipsEntryPointsLauncher", "getClipsEntryPointsLauncher()Lcom/vk/clips/entrypoints/ClipsEntryPointsLauncher;", hpf0Var), ep.a(0, CatalogComponentImpl.class, "customAnalyticsList", "getCustomAnalyticsList()Ljava/util/List;", hpf0Var)};
    }

    public CatalogComponentImpl(Lazy<? extends CatalogInteractorComponent> lazy, Lazy<? extends BridgeComponent> lazy2, Lazy<? extends CatalogSectionScreenComponent> lazy3, Lazy<? extends CatalogMviLegacyComponent> lazy4, Lazy<? extends ClipsEntryPointsComponent> lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.h = new nwy(new w62(lazy5, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.section.di.CatalogComponent
    public final f1u Ze() {
        qcy<Object> qcyVar = j[0];
        return (f1u) this.e.c();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog.mvi.section.di.CatalogComponent
    public final dea i8(cg50 cg50Var) {
        qcy<Object>[] qcyVarArr = j;
        qcy<Object> qcyVar = qcyVarArr[1];
        m7a m7aVar = (m7a) this.f.c();
        ?? r0 = this.b;
        maz e = ((BridgeComponent) r0.getValue()).p().e();
        b25 s = ((BridgeComponent) r0.getValue()).s();
        g7s0 B = fxc0.B();
        com.vk.catalog.mvi.section.screen.api.a e2 = ((CatalogSectionScreenComponent) this.c.getValue()).e();
        qcy<Object> qcyVar2 = qcyVarArr[2];
        fba fbaVar = (fba) this.g.c();
        qcy<Object> qcyVar3 = qcyVarArr[3];
        p1e p1eVar = (p1e) this.h.c();
        qcy<Object> qcyVar4 = qcyVarArr[4];
        return new dea(cg50Var, m7aVar, B, s, e, e2, fbaVar, p1eVar, (List) this.i.c());
    }

    @Override // com.vk.catalog.mvi.section.di.CatalogComponent
    public final void q9(qmk qmkVar) {
        qcy<Object> qcyVar = j[4];
        ((List) this.i.c()).add(qmkVar);
    }
}
