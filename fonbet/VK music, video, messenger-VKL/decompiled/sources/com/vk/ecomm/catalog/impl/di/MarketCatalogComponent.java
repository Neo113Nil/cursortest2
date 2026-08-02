package com.vk.ecomm.catalog.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.maz;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rfc;
import xsna.y3a;
import xsna.y3i;

/* compiled from: MarketCatalogComponent.kt */
/* loaded from: classes18.dex */
public final class MarketCatalogComponent implements DiScopedComponent<pwj0> {
    public static final /* synthetic */ qcy<Object>[] e;
    public final rfc a;
    public final rfc b;
    public final maz c;
    public final nwy d;

    /* compiled from: MarketCatalogComponent.kt */
    public static final class a implements c8m<MarketCatalogComponent, pwj0> {
        public final rfc a;
        public final rfc b;

        public a(rfc rfcVar, rfc rfcVar2) {
            this.a = rfcVar;
            this.b = rfcVar2;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MarketCatalogComponent(this.a, this.b, ((BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class))).p().e());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketCatalogComponent.class, "catalogConfigurationFactory", "getCatalogConfigurationFactory()Lcom/vk/catalog2/common/ui/mvp/configuration/CatalogConfigurationFactory;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public MarketCatalogComponent() {
        throw null;
    }

    public MarketCatalogComponent(rfc rfcVar, rfc rfcVar2, maz mazVar) {
        this.a = rfcVar;
        this.b = rfcVar2;
        this.c = mazVar;
        this.d = new nwy(new y3i(this, 21));
    }

    public final y3a Df() {
        qcy<Object> qcyVar = e[0];
        return (y3a) this.d.c();
    }
}
