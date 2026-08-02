package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴈ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0792 extends AbstractC0475 {
    static {
        StringFog.decrypt("7sqWCJVGh9Q=\n", "ia/iTvwj67A=\n");
        StringFog.decrypt("hLSIn9VlLXmQ\n", "49H82bwAQR0=\n");
        StringFog.decrypt("lhgKB9jX6uy3FBst1er/zIgNGw==\n", "8X1+QbGlmZg=\n");
        StringFog.decrypt("HCJyQ/KM4mY9LmNp/6n4ZhMXdGD9l+k=\n", "e0cGBZv+kRI=\n");
        StringFog.decrypt("qchKK7Hvf5yv1ksOoOx7gKPWSy+3\n", "yrovSsWKOfU=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Field m450(ArrayList arrayList) {
        Field[] fields;
        Class cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
        String str = (String) AbstractC0475.m295(arrayList, 1, String.class);
        C0805 c0805 = C0267.m139().f488;
        synchronized (C0805.class) {
            try {
                ArrayList arrayList2 = c0805.f2559;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    c0805.f2559 = arrayList2;
                }
                arrayList2.clear();
                ArrayList arrayList3 = c0805.f2559;
                try {
                    fields = cls.getDeclaredFields();
                } catch (Error unused) {
                    fields = cls.getFields();
                }
                for (Field field : fields) {
                    if (field.getType().getName().toLowerCase().startsWith(str.toLowerCase())) {
                        field.setAccessible(true);
                        arrayList3.add(field);
                    }
                }
                if (c0805.f2559.isEmpty()) {
                    return null;
                }
                return (Field) c0805.f2559.get(0);
            } finally {
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field m451(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
            return C0267.m139().f488.m463(m295.getClass(), (Class) AbstractC0475.m295(arrayList, 1, Class.class));
        }
        Class cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
        if (arrayList.get(1) instanceof Class) {
            return C0267.m139().f488.m463(cls, (Class) AbstractC0475.m295(arrayList, 1, Class.class));
        }
        return C0267.m139().f488.m462(cls, (C0832) AbstractC0475.m295(arrayList, 1, C0832.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List m452(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
            boolean booleanValue = arrayList.size() > 1 ? ((Boolean) AbstractC0475.m295(arrayList, 1, Boolean.class)).booleanValue() : false;
            C0805 c0805 = C0267.m139().f488;
            return Arrays.asList(C0805.m461(m295.getClass(), booleanValue, -1, null));
        }
        if (arrayList.size() <= 1) {
            return new ArrayList();
        }
        Class cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
        C0832 c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
        C0805 c08052 = C0267.m139().f488;
        ArrayList arrayList2 = new ArrayList();
        c08052.m464(cls, c0832, arrayList2);
        return arrayList2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m454(ArrayList arrayList) {
        return C0267.m139().f488.m462((Class) AbstractC0475.m295(arrayList, 0, Class.class), (C0832) AbstractC0475.m295(arrayList, 1, C0832.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0874 m453() {
        C0805 c0805 = C0267.m139().f488;
        return new C0874();
    }
}
