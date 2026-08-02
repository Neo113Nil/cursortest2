package com.vk.superapp.health.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.health.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsHealthDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsHealthDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsHealthDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsHealthDelegateComponent$Companion$STUB$1 STUB = new JsHealthDelegateComponent() { // from class: com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent
            public final b L4() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b L4();
}
