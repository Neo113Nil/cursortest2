package com.vk.notifications.list.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ib70;
import xsna.pwj0;
import xsna.zb70;

/* compiled from: NotificationListComponent.kt */
/* loaded from: classes.dex */
public interface NotificationListComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: NotificationListComponent.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final NotificationListComponent STUB = new NotificationListComponent() { // from class: com.vk.notifications.list.api.di.NotificationListComponent$Companion$STUB$1
            public final zb70 a = zb70.a.a.getSTUB();
            public final ib70 b = ib70.a.a.getSTUB();

            @Override // com.vk.notifications.list.api.di.NotificationListComponent
            public final zb70 a() {
                return this.a;
            }

            @Override // com.vk.notifications.list.api.di.NotificationListComponent
            public final ib70 vc() {
                return this.b;
            }
        };

        public final NotificationListComponent getSTUB() {
            return STUB;
        }
    }

    zb70 a();

    ib70 vc();
}
