package com.vk.im.notification.settings.impl;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.folders.api.di.FoldersComponent;
import com.vk.foldertypeobserver.api.FolderTypeObserverComponent;
import com.vk.im.notification.settings.MessengerNotificationSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.ig70;
import xsna.qcy;
import xsna.x4u;

/* compiled from: MessengerNotificationSettingsComponentImpl.kt */
/* loaded from: classes2.dex */
public final class MessengerNotificationSettingsComponentImpl implements MessengerNotificationSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final FolderTypeObserverComponent a;
    public final AuthBridgeComponent b;
    public final FoldersComponent c;
    public final ewy d = new ewy(new x4u(this, 8));

    /* compiled from: MessengerNotificationSettingsComponentImpl.kt */
    public static final class a implements b7m<MessengerNotificationSettingsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MessengerNotificationSettingsComponentImpl((FolderTypeObserverComponent) e7mVar.a(fpf0.a(FolderTypeObserverComponent.class)), (AuthBridgeComponent) e7mVar.a(fpf0.a(AuthBridgeComponent.class)), (FoldersComponent) e7mVar.a(fpf0.a(FoldersComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MessengerNotificationSettingsComponentImpl.class, "interactor", "getInteractor()Lcom/vk/im/notification/settings/NotificationSettingsInteractor;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public MessengerNotificationSettingsComponentImpl(FolderTypeObserverComponent folderTypeObserverComponent, AuthBridgeComponent authBridgeComponent, FoldersComponent foldersComponent) {
        this.a = folderTypeObserverComponent;
        this.b = authBridgeComponent;
        this.c = foldersComponent;
    }

    @Override // com.vk.im.notification.settings.MessengerNotificationSettingsComponent
    public final ig70 b() {
        qcy<Object> qcyVar = e[0];
        return (ig70) this.d.c();
    }
}
