package com.mkuczera.vibrateFactory;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Map f39055a;

    static {
        HashMap hashMap = new HashMap();
        f39055a = hashMap;
        hashMap.put("impactLight", new e(new long[]{0, 20}));
        f39055a.put("impactMedium", new e(new long[]{0, 40}));
        f39055a.put("impactHeavy", new e(new long[]{0, 60}));
        f39055a.put("notificationSuccess", new e(new long[]{0, 40, 60, 20}));
        f39055a.put("notificationWarning", new e(new long[]{0, 20, 60, 40}));
        f39055a.put("notificationError", new e(new long[]{0, 20, 40, 30, 40, 40}));
        f39055a.put("rigid", new e(new long[]{0, 30}));
        f39055a.put("soft", new e(new long[]{0, 10}));
        f39055a.put("clockTick", new f(4));
        f39055a.put("contextClick", new f(6));
        f39055a.put("keyboardPress", new f(3));
        f39055a.put("keyboardRelease", new f(7));
        f39055a.put("keyboardTap", new f(3));
        f39055a.put("longPress", new f(0));
        f39055a.put("textHandleMove", new f(9));
        f39055a.put("virtualKey", new f(1));
        f39055a.put("virtualKeyRelease", new f(8));
        f39055a.put("effectClick", new d(0));
        f39055a.put("effectDoubleClick", new d(1));
        f39055a.put("effectHeavyClick", new d(5));
        f39055a.put("effectTick", new d(2));
    }

    public static a a(String str) {
        return (a) f39055a.get(str);
    }
}
