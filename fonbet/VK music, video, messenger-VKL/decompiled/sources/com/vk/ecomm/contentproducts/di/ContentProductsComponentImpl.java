package com.vk.ecomm.contentproducts.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.kkj;
import xsna.kr6;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ContentProductsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ContentProductsComponentImpl implements ContentProductsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new kr6(9));

    /* compiled from: ContentProductsComponentImpl.kt */
    public static final class a implements c8m<ContentProductsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ContentProductsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ContentProductsComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/contentproducts/router/ContentProductsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.contentproducts.di.ContentProductsComponent
    public final kkj a() {
        qcy<Object> qcyVar = b[0];
        return (kkj) this.a.c();
    }
}
