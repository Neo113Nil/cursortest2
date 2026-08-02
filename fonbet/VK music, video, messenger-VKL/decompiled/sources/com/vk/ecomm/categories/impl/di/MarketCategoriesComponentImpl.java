package com.vk.ecomm.categories.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.categories.api.MarketCategoriesComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.tv00;

/* compiled from: MarketCategoriesComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketCategoriesComponentImpl implements MarketCategoriesComponent {
    public final tv00 a;

    /* compiled from: MarketCategoriesComponentImpl.kt */
    public static final class a implements b7m<MarketCategoriesComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketCategoriesComponentImpl(new tv00());
        }
    }

    public MarketCategoriesComponentImpl(tv00 tv00Var) {
        this.a = tv00Var;
    }

    @Override // com.vk.ecomm.categories.api.MarketCategoriesComponent
    public final com.vk.ecomm.categories.api.a a() {
        return this.a;
    }
}
