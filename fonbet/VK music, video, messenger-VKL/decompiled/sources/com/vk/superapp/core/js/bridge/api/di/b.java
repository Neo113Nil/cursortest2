package com.vk.superapp.core.js.bridge.api.di;

import xsna.awz;
import xsna.fvv0;
import xsna.k3y;
import xsna.os9;
import xsna.q3y;
import xsna.tau0;

/* compiled from: JsCoreDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsCoreDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1877a();

        /* compiled from: JsCoreDelegateFactory.kt */
        /* renamed from: com.vk.superapp.core.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1877a implements b {
            @Override // com.vk.superapp.core.js.bridge.api.di.b
            public final k3y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tau0 tau0Var, os9 os9Var, awz awzVar) {
                return new q3y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    k3y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tau0 tau0Var, os9 os9Var, awz awzVar);
}
