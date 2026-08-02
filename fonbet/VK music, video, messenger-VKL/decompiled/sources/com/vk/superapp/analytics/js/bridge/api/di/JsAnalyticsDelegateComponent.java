package com.vk.superapp.analytics.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.analytics.js.bridge.api.di.b;
import xsna.pwj0;

/* compiled from: JsAnalyticsDelegateComponent.kt */
/* loaded from: classes6.dex */
public interface JsAnalyticsDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: JsAnalyticsDelegateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final JsAnalyticsDelegateComponent$Companion$STUB$1 STUB = new JsAnalyticsDelegateComponent() { // from class: com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent
            public final b x4() {
                return this.a;
            }
        };

        public static a b() {
            return new a();
        }
    }

    b x4();
}
