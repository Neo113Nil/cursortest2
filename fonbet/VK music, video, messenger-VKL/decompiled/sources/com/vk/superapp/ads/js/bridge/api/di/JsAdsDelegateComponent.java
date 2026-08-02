package com.vk.superapp.ads.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.ads.js.bridge.api.di.a;
import com.vk.superapp.ads.js.bridge.api.di.b;
import com.vk.superapp.ads.js.bridge.api.di.d;
import xsna.pwj0;

/* compiled from: JsAdsDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsAdsDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsAdsDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsAdsDelegateComponent$Companion$STUB$1 STUB = new JsAdsDelegateComponent() { // from class: com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent$Companion$STUB$1
            public final d a = d.a.a.getSTUB();
            public final b b = b.a.a.getSTUB();
            public final a c = a.C1852a.a.getSTUB();

            @Override // com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent
            public final b C5() {
                return this.b;
            }

            @Override // com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent
            public final a rf() {
                return this.c;
            }

            @Override // com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent
            public final d z1() {
                return this.a;
            }
        };

        public static c b() {
            return new c();
        }
    }

    b C5();

    a rf();

    d z1();
}
