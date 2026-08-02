package com.vk.superapp.common.js.bridge.api.di;

import xsna.d3y;
import xsna.e3y;
import xsna.g3y;

/* compiled from: JsCommonDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsCommonDelegateFactory.kt */
    public static final class a {
        private static final b STUB = new C1875a();

        /* compiled from: JsCommonDelegateFactory.kt */
        /* renamed from: com.vk.superapp.common.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1875a implements b {
            @Override // com.vk.superapp.common.js.bridge.api.di.b
            public final d3y a(e3y e3yVar) {
                return new g3y(e3yVar.b);
            }
        }

        public static b a() {
            return STUB;
        }
    }

    d3y a(e3y e3yVar);
}
