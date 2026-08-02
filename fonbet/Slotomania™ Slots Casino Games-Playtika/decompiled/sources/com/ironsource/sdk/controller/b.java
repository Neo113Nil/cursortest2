package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* loaded from: classes8.dex */
class b {
    private static final String b = "b";
    private final v.s a;

    b(v.s sVar) {
        this.a = sVar;
    }

    synchronized void a(String str, String str2) throws Exception {
        if (this.a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.a, str2);
    }

    void b(String str) {
        v.s sVar = this.a;
        if (sVar != null) {
            sVar.v(str);
        }
    }

    void a(String str) {
        v.s sVar = this.a;
        if (sVar != null) {
            sVar.u(str);
        }
    }
}
