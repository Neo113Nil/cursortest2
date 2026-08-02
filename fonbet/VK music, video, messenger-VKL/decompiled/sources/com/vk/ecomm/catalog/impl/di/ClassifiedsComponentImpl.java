package com.vk.ecomm.catalog.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dhc;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.se0;

/* compiled from: ClassifiedsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsComponentImpl implements ClassifiedsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new se0(7));

    /* compiled from: ClassifiedsComponentImpl.kt */
    public static final class a implements c8m<ClassifiedsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClassifiedsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClassifiedsComponentImpl.class, "classifiedsRouter", "getClassifiedsRouter()Lcom/vk/ecomm/catalog/api/router/ClassifiedsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.catalog.api.di.ClassifiedsComponent
    public final dhc dc() {
        qcy<Object> qcyVar = b[0];
        return (dhc) this.a.c();
    }
}
