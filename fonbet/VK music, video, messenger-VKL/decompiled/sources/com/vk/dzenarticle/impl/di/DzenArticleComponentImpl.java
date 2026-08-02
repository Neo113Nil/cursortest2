package com.vk.dzenarticle.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.dzenarticle.api.DzenArticleComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.kb3;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wro;

/* compiled from: DzenArticleComponentImpl.kt */
/* loaded from: classes.dex */
public final class DzenArticleComponentImpl implements DzenArticleComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new kb3(4));

    /* compiled from: DzenArticleComponentImpl.kt */
    public static final class a implements c8m<DzenArticleComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DzenArticleComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DzenArticleComponentImpl.class, "router", "getRouter()Lcom/vk/dzenarticle/api/DzenArticleRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.dzenarticle.api.DzenArticleComponent
    public final wro a() {
        qcy<Object> qcyVar = b[0];
        return (wro) this.a.c();
    }
}
