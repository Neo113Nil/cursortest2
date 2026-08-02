package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.ie;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes4.dex */
public final class cx extends cw {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Method m7367(List<Object> list) {
        ie ieVar = (ie) m7365(list, 1, ie.class);
        if (list.get(0) instanceof Class) {
            return ic.m7925((Class) m7365(list, 0, Class.class), ieVar);
        }
        return ic.m7925(m7365(list, 0, Object.class).getClass(), ieVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static List<Method> m7366(List<Object> list) {
        ie ieVar = (ie) m7365(list, 1, ie.class);
        if (list.get(0) instanceof Class) {
            return ic.m7923((Class) m7365(list, 0, Class.class), ieVar);
        }
        return ic.m7923(m7365(list, 0, Object.class).getClass(), ieVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ie.b m7368() {
        return new ie.b();
    }
}
