package com.vk.ecomm.configureitemlist.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.configureitemlist.api.di.ConfigureItemListComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b0j;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.w9;

/* compiled from: ConfigureItemListComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ConfigureItemListComponentImpl implements ConfigureItemListComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new w9(9));

    /* compiled from: ConfigureItemListComponentImpl.kt */
    public static final class a implements b7m<ConfigureItemListComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ConfigureItemListComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ConfigureItemListComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/configureitemlist/api/router/ConfigureItemListRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.configureitemlist.api.di.ConfigureItemListComponent
    public final b0j a() {
        qcy<Object> qcyVar = b[0];
        return (b0j) this.a.c();
    }
}
