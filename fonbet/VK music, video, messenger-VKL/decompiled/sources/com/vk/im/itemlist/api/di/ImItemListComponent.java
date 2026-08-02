package com.vk.im.itemlist.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.u5w;

/* compiled from: ImItemListComponent.kt */
/* loaded from: classes2.dex */
public interface ImItemListComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImItemListComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImItemListComponent STUB = new ImItemListComponent() { // from class: com.vk.im.itemlist.api.di.ImItemListComponent$Companion$STUB$1
            public final u5w a = u5w.a.a.getSTUB();

            @Override // com.vk.im.itemlist.api.di.ImItemListComponent
            public final u5w Ke() {
                return this.a;
            }
        };

        public final ImItemListComponent getSTUB() {
            return STUB;
        }
    }

    u5w Ke();
}
