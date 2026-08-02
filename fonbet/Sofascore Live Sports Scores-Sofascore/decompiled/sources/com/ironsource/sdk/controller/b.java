package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class b {
    private static final String b = "b";
    private final v.s a;

    public b(v.s sVar) {
        this.a = sVar;
    }

    public synchronized void a(String str, String str2) throws Exception {
        if (this.a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }

    public void b(String str) {
        v.s sVar = this.a;
        if (sVar != null) {
            sVar.v(str);
        }
    }

    public void a(String str) {
        v.s sVar = this.a;
        if (sVar != null) {
            sVar.u(str);
        }
    }
}
