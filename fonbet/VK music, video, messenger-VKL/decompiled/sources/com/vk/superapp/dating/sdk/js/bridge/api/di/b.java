package com.vk.superapp.dating.sdk.js.bridge.api.di;

import xsna.c4y;
import xsna.fvv0;
import xsna.sbg;
import xsna.y3y;

/* compiled from: JsDatingSdkDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: JsDatingSdkDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1880a();

        /* compiled from: JsDatingSdkDelegateFactory.kt */
        /* renamed from: com.vk.superapp.dating.sdk.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1880a implements b {
            @Override // com.vk.superapp.dating.sdk.js.bridge.api.di.b
            public final y3y a(sbg sbgVar, fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar) {
                return new c4y(bVar);
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    y3y a(sbg sbgVar, fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar);
}
