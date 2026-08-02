package com.vk.notifications.list.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.notifications.list.api.di.NotificationListComponent;
import xsna.ac70;
import xsna.c8m;
import xsna.g8m;
import xsna.ib70;
import xsna.jb70;
import xsna.pwj0;
import xsna.zb70;

/* compiled from: NotificationListComponentImpl.kt */
/* loaded from: classes.dex */
public final class NotificationListComponentImpl implements NotificationListComponent {

    /* compiled from: NotificationListComponentImpl.kt */
    public static final class a implements c8m<NotificationListComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NotificationListComponentImpl();
        }
    }

    @Override // com.vk.notifications.list.api.di.NotificationListComponent
    public final zb70 a() {
        return new ac70();
    }

    @Override // com.vk.notifications.list.api.di.NotificationListComponent
    public final ib70 vc() {
        return new jb70();
    }
}
