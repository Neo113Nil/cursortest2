package com.vk.superapp.vkclient.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkclient.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsVkclientDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsVkclientDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsVkclientDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsVkclientDelegateComponent$Companion$STUB$1 STUB = new JsVkclientDelegateComponent() { // from class: com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent$Companion$STUB$1
            public final b a = b.a.a();

            @Override // com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent
            public final b v4() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b v4();
}
