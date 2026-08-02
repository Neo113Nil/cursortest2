package com.vk.ecomm.avito.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.avito.api.MarketAvitoComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.ut5;

/* compiled from: MarketAvitoComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketAvitoComponentImpl implements MarketAvitoComponent {
    public final ut5 a;

    /* compiled from: MarketAvitoComponentImpl.kt */
    public static final class a implements b7m<MarketAvitoComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketAvitoComponentImpl(new ut5());
        }
    }

    public MarketAvitoComponentImpl(ut5 ut5Var) {
        this.a = ut5Var;
    }

    @Override // com.vk.ecomm.avito.api.MarketAvitoComponent
    public final com.vk.ecomm.avito.api.a getDelegate() {
        return this.a;
    }
}
