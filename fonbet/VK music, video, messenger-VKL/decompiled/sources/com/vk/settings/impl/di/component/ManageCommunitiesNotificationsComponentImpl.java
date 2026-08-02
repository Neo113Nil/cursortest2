package com.vk.settings.impl.di.component;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.settings.api.di.ManageCommunitiesNotificationsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ah00;
import xsna.b7m;
import xsna.d4;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: ManageCommunitiesNotificationsComponentImpl.kt */
/* loaded from: classes5.dex */
public final class ManageCommunitiesNotificationsComponentImpl implements ManageCommunitiesNotificationsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new d4(19));

    /* compiled from: ManageCommunitiesNotificationsComponentImpl.kt */
    public static final class a implements b7m<ManageCommunitiesNotificationsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ManageCommunitiesNotificationsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ManageCommunitiesNotificationsComponentImpl.class, "router", "getRouter()Lcom/vk/settings/api/router/ManageCommunitiesNotificationsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.settings.api.di.ManageCommunitiesNotificationsComponent
    public final ah00 a() {
        qcy<Object> qcyVar = b[0];
        return (ah00) this.a.c();
    }
}
