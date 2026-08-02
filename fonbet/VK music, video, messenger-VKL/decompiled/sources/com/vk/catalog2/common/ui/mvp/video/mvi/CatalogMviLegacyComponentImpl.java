package com.vk.catalog2.common.ui.mvp.video.mvi;

import com.navigation.vk.RouterComponent;
import com.vk.catalog.mvi.api.di.CatalogMviLegacyComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.ca;
import xsna.e7m;
import xsna.fba;
import xsna.fpf0;
import xsna.gba;
import xsna.nwy;
import xsna.qcy;

/* compiled from: CatalogMviLegacyComponentImpl.kt */
/* loaded from: classes16.dex */
public final class CatalogMviLegacyComponentImpl implements CatalogMviLegacyComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: CatalogMviLegacyComponentImpl.kt */
    public static final class a implements b7m<CatalogMviLegacyComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CatalogMviLegacyComponentImpl((RouterComponent) e7mVar.a(fpf0.a(RouterComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogMviLegacyComponentImpl.class, "catalogMviLegacyLauncher", "getCatalogMviLegacyLauncher()Lcom/vk/catalog2/common/ui/mvp/video/mvi/CatalogMviLegacyLauncherImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public CatalogMviLegacyComponentImpl(RouterComponent routerComponent) {
        this.a = new nwy(new ca(routerComponent, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.api.di.CatalogMviLegacyComponent
    public final fba a7() {
        qcy<Object> qcyVar = b[0];
        return (gba) this.a.c();
    }
}
