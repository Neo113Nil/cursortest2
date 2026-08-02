package com.vk.donut.privacy.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.d2o;
import xsna.pwj0;

/* compiled from: DonutPrivacyComponent.kt */
/* loaded from: classes18.dex */
public interface DonutPrivacyComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: DonutPrivacyComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final DonutPrivacyComponent STUB = new DonutPrivacyComponent() { // from class: com.vk.donut.privacy.api.di.DonutPrivacyComponent$Companion$STUB$1
            public final d2o a = d2o.a.a.getSTUB();

            @Override // com.vk.donut.privacy.api.di.DonutPrivacyComponent
            public final d2o a() {
                return this.a;
            }
        };

        public final DonutPrivacyComponent getSTUB() {
            return STUB;
        }
    }

    d2o a();
}
