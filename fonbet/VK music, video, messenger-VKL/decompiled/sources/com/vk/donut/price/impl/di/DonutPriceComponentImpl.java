package com.vk.donut.price.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.donut.price.api.di.DonutPriceComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a2o;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.k03;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: DonutPriceComponentImpl.kt */
/* loaded from: classes.dex */
public final class DonutPriceComponentImpl implements DonutPriceComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new k03(3));

    /* compiled from: DonutPriceComponentImpl.kt */
    public static final class a implements c8m<DonutPriceComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DonutPriceComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DonutPriceComponentImpl.class, "donutPriceTemplateParser", "getDonutPriceTemplateParser()Lcom/vk/donut/price/api/domain/parser/template/DonutPriceTemplateParser;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.donut.price.api.di.DonutPriceComponent
    public final a2o kf() {
        qcy<Object> qcyVar = b[0];
        return (a2o) this.a.c();
    }
}
