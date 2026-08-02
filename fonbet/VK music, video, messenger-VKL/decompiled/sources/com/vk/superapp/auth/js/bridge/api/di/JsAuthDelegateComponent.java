package com.vk.superapp.auth.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.auth.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsAuthDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsAuthDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsAuthDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsAuthDelegateComponent$Companion$STUB$1 STUB = new JsAuthDelegateComponent() { // from class: com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent
            public final b Hc() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b Hc();
}
