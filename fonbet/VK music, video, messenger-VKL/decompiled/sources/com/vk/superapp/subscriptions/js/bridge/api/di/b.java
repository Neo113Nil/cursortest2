package com.vk.superapp.subscriptions.js.bridge.api.di;

import xsna.f6y;
import xsna.fvv0;
import xsna.h6y;
import xsna.jq20;

/* compiled from: JsSubscriptionsDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsSubscriptionsDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* compiled from: JsSubscriptionsDelegateFactory.kt */
        /* renamed from: com.vk.superapp.subscriptions.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1904a implements b {
            @Override // com.vk.superapp.subscriptions.js.bridge.api.di.b
            public final f6y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, jq20 jq20Var) {
                return new h6y(bVar);
            }
        }

        public final b getSTUB() {
            return new C1904a();
        }
    }

    f6y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, jq20 jq20Var);
}
