package com.vk.newsfeed.impl.di;

import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.lw60;
import xsna.msy;
import xsna.mw60;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.w8q;
import xsna.zwc;

/* compiled from: NewsfeedRouterComponentImpl.kt */
/* loaded from: classes4.dex */
public final class NewsfeedRouterComponentImpl implements NewsfeedRouterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: NewsfeedRouterComponentImpl.kt */
    public static final class a implements c8m<NewsfeedRouterComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            lw60 lw60Var = new lw60(g8mVar, 0);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new NewsfeedRouterComponentImpl(msy.a(lazyThreadSafetyMode, lw60Var), msy.a(lazyThreadSafetyMode, new mw60(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new w8q(g8mVar, 29)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsfeedRouterComponentImpl.class, "newsfeedRouter", "getNewsfeedRouter()Lcom/vk/newsfeed/api/NewsfeedRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public NewsfeedRouterComponentImpl(Lazy<? extends MarketComponent> lazy, Lazy<? extends ProductsMultipickerComponent> lazy2, Lazy<? extends AttachPickerComponent> lazy3) {
        this.a = new nwy(new zwc(lazy3, lazy, lazy2, 2));
    }

    @Override // com.vk.newsfeed.api.di.NewsfeedRouterComponent
    public final NewsfeedRouter l0() {
        qcy<Object> qcyVar = b[0];
        return (NewsfeedRouter) this.a.c();
    }
}
