package com.vk.superapp.permission.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.permission.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsPermissionDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsPermissionDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsPermissionDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsPermissionDelegateComponent$Companion$STUB$1 STUB = new JsPermissionDelegateComponent() { // from class: com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent
            public final b A0() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b A0();
}
