package com.vk.catalog2.registry.impl.app.di;

import com.vk.catalog2.registry.api.di.CatalogRegistryComponent;
import com.vk.di.component.DiUnscopedWithParamsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bv0;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.l9i;
import xsna.nwy;
import xsna.o3a;
import xsna.q8m;
import xsna.qcy;
import xsna.vca;
import xsna.wia;
import xsna.yv2;

/* compiled from: CatalogRegistryComponentImpl.kt */
/* loaded from: classes16.dex */
public final class CatalogRegistryComponentImpl implements CatalogRegistryComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(CatalogRegistryComponentImpl.class, "catalogViewHolderFactory", "getCatalogViewHolderFactory()Lcom/vk/catalog2/registry/api/CatalogViewHolderFactory;", 0), fp.c(0, CatalogRegistryComponentImpl.class, "catalogCommandBus", "getCatalogCommandBus()Lcom/vk/catalog2/registry/api/commandbus/CatalogCommandBus;", fpf0.a)};
    public final nwy a = new nwy(new yv2(6));
    public final nwy b = new nwy(new bv0(4));

    /* compiled from: CatalogRegistryComponentImpl.kt */
    public static final class a implements q8m<CatalogRegistryComponent, vca> {
        @Override // xsna.q8m
        public final DiUnscopedWithParamsComponent a(e7m e7mVar, l9i l9iVar) {
            return new CatalogRegistryComponentImpl();
        }
    }

    @Override // com.vk.catalog2.registry.api.di.CatalogRegistryComponent
    public final o3a K3() {
        qcy<Object> qcyVar = c[1];
        return (o3a) this.b.c();
    }

    @Override // com.vk.catalog2.registry.api.di.CatalogRegistryComponent
    public final wia ga() {
        qcy<Object> qcyVar = c[0];
        return (wia) this.a.c();
    }
}
