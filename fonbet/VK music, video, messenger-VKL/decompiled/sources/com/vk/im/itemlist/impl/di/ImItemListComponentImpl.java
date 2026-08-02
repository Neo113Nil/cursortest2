package com.vk.im.itemlist.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.itemlist.api.di.ImItemListComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.af0;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.u5w;

/* compiled from: ImItemListComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImItemListComponentImpl implements ImItemListComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new af0(21));

    /* compiled from: ImItemListComponentImpl.kt */
    public static final class a implements b7m<ImItemListComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ImItemListComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImItemListComponentImpl.class, "imItemListFragmentFactory", "getImItemListFragmentFactory()Lcom/vk/im/itemlist/api/ImItemListFragmentFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.itemlist.api.di.ImItemListComponent
    public final u5w Ke() {
        qcy<Object> qcyVar = b[0];
        return (u5w) this.a.c();
    }
}
