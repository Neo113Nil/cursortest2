package com.vk.superapp.vibration.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vibration.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsVibrationDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsVibrationDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsVibrationDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsVibrationDelegateComponent$Companion$STUB$1 STUB = new JsVibrationDelegateComponent() { // from class: com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent
            public final b ef() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b ef();
}
