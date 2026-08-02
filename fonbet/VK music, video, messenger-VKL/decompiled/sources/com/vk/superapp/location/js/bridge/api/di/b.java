package com.vk.superapp.location.js.bridge.api.di;

import xsna.d5y;
import xsna.fvv0;
import xsna.h5y;
import xsna.k7y;
import xsna.n1i;
import xsna.tau0;
import xsna.xwv0;

/* compiled from: JsLocationDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsLocationDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1884a();

        /* compiled from: JsLocationDelegateFactory.kt */
        /* renamed from: com.vk.superapp.location.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1884a implements b {
            @Override // com.vk.superapp.location.js.bridge.api.di.b
            public final d5y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tau0 tau0Var, n1i n1iVar) {
                return new h5y(bVar);
            }

            @Override // com.vk.superapp.location.js.bridge.api.di.b
            public final d5y b(com.vk.superapp.base.js.bridge.b bVar, k7y k7yVar, xwv0 xwv0Var) {
                return new h5y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    d5y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tau0 tau0Var, n1i n1iVar);

    d5y b(com.vk.superapp.base.js.bridge.b bVar, k7y k7yVar, xwv0 xwv0Var);
}
