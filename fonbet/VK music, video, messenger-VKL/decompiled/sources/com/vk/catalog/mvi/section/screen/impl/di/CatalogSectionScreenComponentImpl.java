package com.vk.catalog.mvi.section.screen.impl.di;

import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nh0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: CatalogSectionScreenComponentImpl.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionScreenComponentImpl implements CatalogSectionScreenComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new nh0(1));

    /* compiled from: CatalogSectionScreenComponentImpl.kt */
    public static final class a implements b7m<CatalogSectionScreenComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CatalogSectionScreenComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogSectionScreenComponentImpl.class, "launcher", "getLauncher()Lcom/vk/catalog/mvi/section/screen/api/CatalogSectionScreenLauncher;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenComponent
    public final com.vk.catalog.mvi.section.screen.api.a e() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.catalog.mvi.section.screen.api.a) this.a.c();
    }
}
