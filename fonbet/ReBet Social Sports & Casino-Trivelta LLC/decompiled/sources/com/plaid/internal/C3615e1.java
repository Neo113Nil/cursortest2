package com.plaid.internal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.plaid.internal.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3615e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C3784x0 f40574b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3615e1 f40575c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f40576a = new LinkedHashMap();

    static {
        W3 w32 = Z3.f39803a;
        f40574b = new C3784x0("features");
        f40575c = new C3615e1();
    }

    public final void a(String str, Object obj) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            f40574b.a(W3.INFO, "set feature %s=%s", str, obj);
            this.f40576a.put(str, obj);
        } else {
            f40574b.a(W3.WARN, "ignore feature %s of type %s", str, obj == null ? "null" : obj.getClass().getSimpleName());
        }
    }

    public final boolean a(String str) {
        Object a10 = a(str, null, Object.class);
        if (a10 instanceof Boolean) {
            return Boolean.TRUE.equals(a10);
        }
        return a10 instanceof Number ? ((Number) a10).intValue() != 0 : a10 != null;
    }

    public final Object a(String str, Object obj, Class<?> cls) {
        Object obj2 = !str.startsWith("android.") ? this.f40576a.get("android.".concat(str)) : null;
        if (obj2 == null) {
            obj2 = this.f40576a.get(str);
        }
        return cls.isInstance(obj2) ? obj2 : obj;
    }

    public final C3615e1 a(HashMap hashMap) {
        C3615e1 c3615e1 = new C3615e1();
        LinkedHashMap linkedHashMap = this.f40576a;
        c3615e1.f40576a.clear();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c3615e1.a((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            c3615e1.a((String) entry2.getKey(), entry2.getValue());
        }
        return c3615e1;
    }
}
