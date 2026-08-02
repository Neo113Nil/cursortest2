package com.vk.im.business.notifications.impl;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.foldertypeobserver.api.FolderTypeObserverComponent;
import com.vk.im.business.notifications.api.BusinessNotificationComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bb;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.ko8;
import xsna.qcy;

/* compiled from: BusinessNotificationComponentImpl.kt */
/* loaded from: classes2.dex */
public final class BusinessNotificationComponentImpl implements BusinessNotificationComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final FolderTypeObserverComponent a;
    public final ewy b = new ewy(new bb(this, 11));

    /* compiled from: BusinessNotificationComponentImpl.kt */
    public static final class a implements b7m<BusinessNotificationComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new BusinessNotificationComponentImpl((FolderTypeObserverComponent) e7mVar.a(fpf0.a(FolderTypeObserverComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BusinessNotificationComponentImpl.class, "businessNotificationsObserver", "getBusinessNotificationsObserver()Lcom/vk/im/business/notifications/api/BusinessNotificationsObserver;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public BusinessNotificationComponentImpl(FolderTypeObserverComponent folderTypeObserverComponent) {
        this.a = folderTypeObserverComponent;
    }

    @Override // com.vk.im.business.notifications.api.BusinessNotificationComponent
    public final ko8 i4() {
        qcy<Object> qcyVar = c[0];
        return (ko8) this.b.c();
    }
}
