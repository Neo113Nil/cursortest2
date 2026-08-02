package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hz;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class cv extends cw {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Field m7358(List<Object> list) {
        return id.m7937().m7940().m7871((Class) m7365(list, 0, Class.class), (hz) m7365(list, 1, hz.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static List<Field> m7357(List<Object> list) {
        if (list.get(0) instanceof Class) {
            if (list.size() > 1) {
                return id.m7937().m7940().m7870((Class) m7365(list, 0, Class.class), (hz) m7365(list, 1, hz.class));
            }
        } else {
            Object obj = m7365(list, 0, Object.class);
            boolean booleanValue = list.size() > 1 ? ((Boolean) m7365(list, 1, Boolean.class)).booleanValue() : false;
            id.m7937().m7940();
            Field[] m7867 = hw.m7867(obj.getClass(), booleanValue, -1, null);
            if (m7867 != null) {
                return Arrays.asList(m7867);
            }
        }
        return new ArrayList();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field m7359(List<Object> list) {
        if (list.get(0) instanceof Class) {
            Class cls = (Class) m7365(list, 0, Class.class);
            if (list.get(1) instanceof Class) {
                return id.m7937().m7940().m7869(cls, (Class) m7365(list, 1, Class.class));
            }
            return id.m7937().m7940().m7871(cls, (hz) m7365(list, 1, hz.class));
        }
        Object obj = m7365(list, 0, Object.class);
        return id.m7937().m7940().m7869(obj.getClass(), (Class) m7365(list, 1, Class.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Field m7361(List<Object> list) {
        return id.m7937().m7940().m7868((Class) m7365(list, 0, Class.class), (String) m7365(list, 1, String.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static hz.d m7360() {
        id.m7937().m7940();
        return hw.m7864();
    }
}
