package com.vk.ecomm.market.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.fxc0;
import xsna.fz5;
import xsna.g7s0;
import xsna.xo;

/* compiled from: MarketInternalComponent.kt */
/* loaded from: classes18.dex */
public final class MarketInternalComponent implements DiUnscopedComponent {
    public final xo a;
    public final fz5 b;
    public final g7s0 c;

    /* compiled from: MarketInternalComponent.kt */
    public static final class a implements b7m<MarketInternalComponent> {
        public final xo a;
        public final fz5 b;

        public a(xo xoVar, fz5 fz5Var) {
            this.a = xoVar;
            this.b = fz5Var;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketInternalComponent(this.a, this.b, fxc0.B());
        }
    }

    public MarketInternalComponent(xo xoVar, fz5 fz5Var, g7s0 g7s0Var) {
        this.a = xoVar;
        this.b = fz5Var;
        this.c = g7s0Var;
    }
}
