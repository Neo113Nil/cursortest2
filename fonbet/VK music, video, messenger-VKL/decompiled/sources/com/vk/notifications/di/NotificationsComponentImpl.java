package com.vk.notifications.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fn4;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nd1;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rj70;

/* compiled from: NotificationsComponentImpl.kt */
/* loaded from: classes4.dex */
public final class NotificationsComponentImpl implements NotificationsComponent {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(NotificationsComponentImpl.class, "interactor", "getInteractor()Lcom/vk/notifications/domain/NotificationsInteractor;", 0), fp.c(0, NotificationsComponentImpl.class, "updateListener", "getUpdateListener()Lcom/vk/notifications/domain/NotificationsUpdateListener;", fpf0.a)};
    public final nwy a = new nwy(new nd1(26));

    /* compiled from: NotificationsComponentImpl.kt */
    public static final class a implements c8m<NotificationsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NotificationsComponentImpl();
        }
    }

    public NotificationsComponentImpl() {
        new nwy(new fn4(27));
    }

    @Override // com.vk.notifications.di.NotificationsComponent
    public final rj70 b() {
        qcy<Object> qcyVar = b[0];
        return (rj70) this.a.c();
    }
}
