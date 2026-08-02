package com.vk.superapp.auth.js.bridge.api.di;

import xsna.awz;
import xsna.bpn0;
import xsna.fvv0;
import xsna.g2y;
import xsna.j5y;
import xsna.n2y;
import xsna.tdk;

/* compiled from: JsAuthDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsAuthDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1866a();

        /* compiled from: JsAuthDelegateFactory.kt */
        /* renamed from: com.vk.superapp.auth.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1866a implements b {
            @Override // com.vk.superapp.auth.js.bridge.api.di.b
            public final g2y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, g2y.a aVar, awz awzVar, j5y j5yVar, bpn0 bpn0Var, tdk tdkVar) {
                return new n2y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    g2y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, g2y.a aVar, awz awzVar, j5y j5yVar, bpn0 bpn0Var, tdk tdkVar);
}
