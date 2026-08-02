package com.vk.ecomm.checklist.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.checklist.api.di.MarketChecklistComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.xv00;

/* compiled from: MarketChecklistComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketChecklistComponentImpl implements MarketChecklistComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new a44(23));

    /* compiled from: MarketChecklistComponentImpl.kt */
    public static final class a implements b7m<MarketChecklistComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketChecklistComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketChecklistComponentImpl.class, "marketChecklistRouter", "getMarketChecklistRouter()Lcom/vk/ecomm/checklist/api/router/MarketChecklistRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.checklist.api.di.MarketChecklistComponent
    public final xv00 I6() {
        qcy<Object> qcyVar = b[0];
        return (xv00) this.a.c();
    }
}
