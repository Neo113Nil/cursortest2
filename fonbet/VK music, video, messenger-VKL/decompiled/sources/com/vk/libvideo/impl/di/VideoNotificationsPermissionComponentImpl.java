package com.vk.libvideo.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a7p0;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.iri0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: VideoNotificationsPermissionComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoNotificationsPermissionComponentImpl implements VideoNotificationsPermissionComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VideoNotificationsPermissionComponentImpl.class, "notificationGdprService", "getNotificationGdprService()Lcom/vk/pushes/gdpr/NotificationGdprService;", 0), fp.c(0, VideoNotificationsPermissionComponentImpl.class, "notificationsPermission", "getNotificationsPermission()Lcom/vk/libvideo/api/NotificationsPermission;", fpf0.a)};
    public final nwy a = new nwy(new a7p0(4));
    public final nwy b = new nwy(new iri0(this, 21));

    /* compiled from: VideoNotificationsPermissionComponentImpl.kt */
    public static final class a implements c8m<VideoNotificationsPermissionComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoNotificationsPermissionComponentImpl();
        }
    }

    @Override // com.vk.libvideo.api.di.VideoNotificationsPermissionComponent
    public final NotificationsPermission V() {
        qcy<Object> qcyVar = c[1];
        return (NotificationsPermission) this.b.c();
    }
}
