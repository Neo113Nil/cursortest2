package com.vk.superapp.vibration.js.bridge.api.di;

import xsna.fvv0;
import xsna.l6y;
import xsna.n6y;
import xsna.qfj;

/* compiled from: JsVibrationDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsVibrationDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1912a();

        /* compiled from: JsVibrationDelegateFactory.kt */
        /* renamed from: com.vk.superapp.vibration.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1912a implements b {
            @Override // com.vk.superapp.vibration.js.bridge.api.di.b
            public final l6y a(com.vk.superapp.base.js.bridge.b bVar, fvv0 fvv0Var, qfj qfjVar) {
                return new n6y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    l6y a(com.vk.superapp.base.js.bridge.b bVar, fvv0 fvv0Var, qfj qfjVar);
}
