package com.vk.superapp.location.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.location.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsLocationDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsLocationDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsLocationDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsLocationDelegateComponent$Companion$STUB$1 STUB = new JsLocationDelegateComponent() { // from class: com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent
            public final b k2() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b k2();
}
