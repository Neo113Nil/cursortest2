package com.vk.superapp.local.storage.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.local.storage.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsLocalStorageDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsLocalStorageDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsLocalStorageDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsLocalStorageDelegateComponent$Companion$STUB$1 STUB = new JsLocalStorageDelegateComponent() { // from class: com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent
            public final b ab() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b ab();
}
