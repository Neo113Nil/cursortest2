package com.vk.superapp.dating.js.bridge.api.di;

import com.vk.superapp.base.js.bridge.b;
import xsna.krh;
import xsna.rjd;
import xsna.t3y;
import xsna.w3y;

/* compiled from: JsDatingDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: JsDatingDelegateFactory.kt */
    /* renamed from: com.vk.superapp.dating.js.bridge.api.di.a$a, reason: collision with other inner class name */
    public static final class C1878a {
        public static final /* synthetic */ C1878a a = new C1878a();
        private static final a STUB = new C1879a();

        /* compiled from: JsDatingDelegateFactory.kt */
        /* renamed from: com.vk.superapp.dating.js.bridge.api.di.a$a$a, reason: collision with other inner class name */
        public static final class C1879a implements a {
            @Override // com.vk.superapp.dating.js.bridge.api.di.a
            public final t3y a(krh krhVar, rjd rjdVar, b bVar) {
                return new w3y(bVar);
            }
        }

        public final a getSTUB() {
            return STUB;
        }
    }

    t3y a(krh krhVar, rjd rjdVar, b bVar);
}
