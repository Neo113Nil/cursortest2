package com.vk.superapp.common.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.common.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsCommonDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsCommonDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsCommonDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsCommonDelegateComponent$Companion$STUB$1 STUB = new JsCommonDelegateComponent() { // from class: com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent$Companion$STUB$1
            public final b a = b.a.a();

            @Override // com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent
            public final b s9() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b s9();
}
