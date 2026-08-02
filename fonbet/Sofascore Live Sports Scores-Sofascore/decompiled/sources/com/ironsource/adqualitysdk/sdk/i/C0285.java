package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0285 implements InvocationHandler {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f525 = StringFog.decrypt("IrqkL8zI9C4kq7UP6sr3MCe+swA=\n", "Rd/Qa6mrm1w=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0960 f526;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f527;

    public C0285(Object obj, C0960 c0960) {
        this.f527 = obj;
        this.f526 = c0960;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name.hashCode() == 1622498214) {
            String str = f525;
            if (name.equals(str)) {
                try {
                    String name2 = method.getName();
                    if (name2.hashCode() == 1622498214 && name2.equals(str)) {
                        return this.f527;
                    }
                    return null;
                } catch (Throwable th) {
                    AbstractC0356.m204(StringFog.decrypt("gTeSKvQUWH+9Ng==\n", "0UX9Uo1BLBY=\n"), StringFog.decrypt("V1TXfz/KUBRkSc51bYtdK2dHyXk5kxkXd1LNfynK\n", "EialEE3qOXo=\n") + method.getName(), th, true);
                    return null;
                }
            }
        }
        try {
            this.f526.m594(obj, method, objArr);
        } catch (Throwable th2) {
            String decrypt = StringFog.decrypt("OZdXBdAFUTgFlg==\n", "aeU4falQJVE=\n");
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("v2N537eiieWMfmDV5e6J+I50ZdW3uMA=\n", "+hELsMWC4Is=\n"));
            Object obj2 = this.f527;
            sb.append(obj2 != null ? obj2.toString() : StringFog.decrypt("U6m+HQ==\n", "PdzScSnkcaw=\n"));
            sb.append(StringFog.decrypt("Z41Lpqs9QrU=\n", "R+Au0sNSJo8=\n"));
            sb.append(method.getName());
            AbstractC0356.m204(decrypt, sb.toString(), th2, true);
        }
        Object obj3 = this.f527;
        if (obj3 != null) {
            return method.invoke(obj3, objArr);
        }
        if (!Object.class.equals(method.getDeclaringClass())) {
            return null;
        }
        if (objArr != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : objArr) {
                    if (Proxy.isProxyClass(obj4.getClass())) {
                        arrayList.add(Proxy.getInvocationHandler(obj4));
                    } else {
                        arrayList.add(obj4);
                    }
                }
                objArr = arrayList.toArray();
            } catch (Throwable th3) {
                AbstractC0356.m204(StringFog.decrypt("QOyM/+uR9yR87Q==\n", "EJ7jh5LEg00=\n"), StringFog.decrypt("P1gc7SXwDOEOXgfsMPAC6gxFDeMjuQTqWksc5SQ=\n", "eipuglfQa4Q=\n"), th3, true);
            }
        }
        return method.invoke(this, objArr);
    }
}
