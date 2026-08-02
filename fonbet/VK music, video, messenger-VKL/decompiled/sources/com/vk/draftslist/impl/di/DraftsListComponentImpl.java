package com.vk.draftslist.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.draftslist.api.DraftsListComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.feo;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.w9;

/* compiled from: DraftsListComponentImpl.kt */
/* loaded from: classes18.dex */
public final class DraftsListComponentImpl implements DraftsListComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new w9(11));

    /* compiled from: DraftsListComponentImpl.kt */
    public static final class a implements b7m<DraftsListComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new DraftsListComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DraftsListComponentImpl.class, "router", "getRouter()Lcom/vk/draftslist/api/DraftsListRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.draftslist.api.DraftsListComponent
    public final feo a() {
        qcy<Object> qcyVar = b[0];
        return (feo) this.a.c();
    }
}
