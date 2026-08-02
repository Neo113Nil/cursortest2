package com.vk.superapp.ads.js.bridge.api.di;

import xsna.f1y;
import xsna.fvv0;
import xsna.o1y;
import xsna.tbg;

/* compiled from: JsAdsDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface d {

    /* compiled from: JsAdsDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final d STUB = new C1855a();

        /* compiled from: JsAdsDelegateFactory.kt */
        /* renamed from: com.vk.superapp.ads.js.bridge.api.di.d$a$a, reason: collision with other inner class name */
        public static final class C1855a implements d {
            @Override // com.vk.superapp.ads.js.bridge.api.di.d
            public final f1y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tbg tbgVar) {
                return new o1y(bVar);
            }
        }

        public final d getSTUB() {
            return STUB;
        }
    }

    f1y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tbg tbgVar);
}
