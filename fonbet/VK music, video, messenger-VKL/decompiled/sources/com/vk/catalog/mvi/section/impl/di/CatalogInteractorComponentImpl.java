package com.vk.catalog.mvi.section.impl.di;

import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.catalog.mvi.section.impl.domain.CatalogInteractorImpl;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.m7a;
import xsna.nwy;
import xsna.pwj0;
import xsna.q03;
import xsna.qcy;

/* compiled from: CatalogInteractorComponentImpl.kt */
/* loaded from: classes.dex */
public final class CatalogInteractorComponentImpl implements CatalogInteractorComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new q03(2));

    /* compiled from: CatalogInteractorComponentImpl.kt */
    public static final class a implements c8m<CatalogInteractorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CatalogInteractorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogInteractorComponentImpl.class, "catalogInteractor", "getCatalogInteractor()Lcom/vk/catalog/mvi/section/impl/domain/CatalogInteractorImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.section.di.CatalogInteractorComponent
    public final m7a z0() {
        qcy<Object> qcyVar = b[0];
        return (CatalogInteractorImpl) this.a.c();
    }
}
