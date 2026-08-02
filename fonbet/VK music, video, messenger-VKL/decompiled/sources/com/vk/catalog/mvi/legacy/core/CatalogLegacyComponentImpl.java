package com.vk.catalog.mvi.legacy.core;

import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a68;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: CatalogLegacyComponentImpl.kt */
/* loaded from: classes.dex */
public final class CatalogLegacyComponentImpl implements CatalogLegacyComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new a68(1));

    /* compiled from: CatalogLegacyComponentImpl.kt */
    public static final class a implements c8m<CatalogLegacyComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CatalogLegacyComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogLegacyComponentImpl.class, "register", "getRegister()Lcom/vk/catalog/mvi/legacy/api/CatalogLegacyBlockRegister;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent
    public final com.vk.catalog.mvi.legacy.api.a qf() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.catalog.mvi.legacy.api.a) this.a.c();
    }
}
