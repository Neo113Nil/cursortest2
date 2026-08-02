package com.vk.superapp.vkclient.js.bridge.api.di;

import xsna.b8y;
import xsna.s7y;
import xsna.t7y;

/* compiled from: JsVkclientDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsVkclientDelegateFactory.kt */
    public static final class a {
        private static final b STUB = new C1914a();

        /* compiled from: JsVkclientDelegateFactory.kt */
        /* renamed from: com.vk.superapp.vkclient.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1914a implements b {
            @Override // com.vk.superapp.vkclient.js.bridge.api.di.b
            public final s7y a(t7y t7yVar) {
                return new b8y(t7yVar.b);
            }
        }

        public static b a() {
            return STUB;
        }
    }

    s7y a(t7y t7yVar);
}
