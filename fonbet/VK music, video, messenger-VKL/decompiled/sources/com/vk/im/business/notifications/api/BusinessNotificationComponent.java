package com.vk.im.business.notifications.api;

import com.vk.di.component.DiUnscopedComponent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.io8;
import xsna.ko8;

/* compiled from: BusinessNotificationComponent.kt */
/* loaded from: classes2.dex */
public interface BusinessNotificationComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: BusinessNotificationComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final BusinessNotificationComponent$Companion$STUB$1 STUB = new BusinessNotificationComponent() { // from class: com.vk.im.business.notifications.api.BusinessNotificationComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: BusinessNotificationComponent.kt */
            public static final class a implements ko8 {
                @Override // xsna.ko8
                public final q<io8> a() {
                    return g0.b;
                }
            }

            @Override // com.vk.im.business.notifications.api.BusinessNotificationComponent
            public final ko8 i4() {
                return this.a;
            }
        };
    }

    ko8 i4();
}
