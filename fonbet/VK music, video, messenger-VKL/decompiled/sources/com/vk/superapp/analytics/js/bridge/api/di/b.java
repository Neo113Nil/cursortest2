package com.vk.superapp.analytics.js.bridge.api.di;

import xsna.fvv0;
import xsna.r1y;
import xsna.t1y;

/* compiled from: JsAnalyticsDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsAnalyticsDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1861a();

        /* compiled from: JsAnalyticsDelegateFactory.kt */
        /* renamed from: com.vk.superapp.analytics.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1861a implements b {
            @Override // com.vk.superapp.analytics.js.bridge.api.di.b
            public final r1y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar) {
                return new t1y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    r1y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar);
}
