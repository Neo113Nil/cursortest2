package com.vk.superapp.permission.js.bridge.api.di;

import xsna.foi;
import xsna.tau0;
import xsna.w5y;
import xsna.z5y;

/* compiled from: JsPermissionDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsPermissionDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1901a();

        /* compiled from: JsPermissionDelegateFactory.kt */
        /* renamed from: com.vk.superapp.permission.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1901a implements b {
            @Override // com.vk.superapp.permission.js.bridge.api.di.b
            public final w5y a(tau0 tau0Var, foi foiVar, com.vk.superapp.base.js.bridge.b bVar) {
                return new z5y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    w5y a(tau0 tau0Var, foi foiVar, com.vk.superapp.base.js.bridge.b bVar);
}
