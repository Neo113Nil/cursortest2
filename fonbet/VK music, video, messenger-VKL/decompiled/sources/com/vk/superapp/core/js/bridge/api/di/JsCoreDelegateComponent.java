package com.vk.superapp.core.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.core.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsCoreDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsCoreDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsCoreDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsCoreDelegateComponent$Companion$STUB$1 STUB = new JsCoreDelegateComponent() { // from class: com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent
            public final b na() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b na();
}
