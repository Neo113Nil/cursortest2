package com.vk.ecomm.catalog.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.dhc;
import xsna.pwj0;

/* compiled from: ClassifiedsComponent.kt */
/* loaded from: classes18.dex */
public interface ClassifiedsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClassifiedsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClassifiedsComponent STUB = new ClassifiedsComponent() { // from class: com.vk.ecomm.catalog.api.di.ClassifiedsComponent$Companion$STUB$1
            public final dhc a = dhc.a.a.getSTUB();

            @Override // com.vk.ecomm.catalog.api.di.ClassifiedsComponent
            public final dhc dc() {
                return this.a;
            }
        };

        public final ClassifiedsComponent getSTUB() {
            return STUB;
        }
    }

    dhc dc();
}
