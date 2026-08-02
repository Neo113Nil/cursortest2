package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0805 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public ArrayList f2559;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public C0832 f2560;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C0806 f2561;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m460(Class cls, C0806 c0806, ArrayList arrayList) {
        Field[] fields;
        boolean z;
        C0832 c0832 = c0806.f2563;
        if (c0832 == null || !(z = c0832.f1210)) {
            try {
                fields = cls.getDeclaredFields();
            } catch (Error unused) {
                fields = cls.getFields();
            }
        } else {
            fields = m461(cls, z, c0832.f1209, null);
        }
        for (Field field : fields) {
            if (c0806.f2563 != null) {
                int modifiers = field.getModifiers();
                int i = c0806.f2563.f1208;
                if ((modifiers & i) == i) {
                    int modifiers2 = field.getModifiers();
                    C0832 c08322 = c0806.f2563;
                    if ((modifiers2 & c08322.f1207) == 0 && !c08322.f2643.contains(field.getType())) {
                        C0832 c08323 = c0806.f2563;
                        if (c08323.f2644 ? field.getType().equals(c0806.f2563.f2646) : c08323.f2646.isAssignableFrom(field.getType())) {
                            int i2 = c0806.f2562;
                            if (i2 == 0) {
                                field.setAccessible(true);
                                arrayList.add(field);
                            } else {
                                c0806.f2562 = i2 - 1;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m462(Class cls, C0832 c0832) {
        synchronized (AbstractC0370.class) {
            try {
                ArrayList arrayList = this.f2559;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f2559 = arrayList;
                }
                arrayList.clear();
                m464(cls, c0832, this.f2559);
                if (this.f2559.isEmpty()) {
                    return null;
                }
                return (Field) this.f2559.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m464(Class cls, C0832 c0832, ArrayList arrayList) {
        synchronized (C0805.class) {
            try {
                C0806 c0806 = this.f2561;
                if (c0806 == null) {
                    c0806 = new C0806();
                    this.f2561 = c0806;
                }
                c0806.f2563 = c0832;
                c0806.f2562 = c0832.f2645;
                m460(cls, c0806, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m461(Class cls, boolean z, int i, List list) {
        while (cls != null && !AbstractC0816.m506(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = new Field[0];
        if (cls == null) {
            return fieldArr;
        }
        Field[] fieldArr2 = new Field[0];
        Field[] fieldArr3 = new Field[0];
        try {
            fieldArr2 = cls.getDeclaredFields();
        } catch (Error unused) {
        }
        try {
            fieldArr3 = cls.getFields();
        } catch (Error unused2) {
        }
        String str = AbstractC0816.f2624;
        int length = fieldArr2.length;
        int length2 = fieldArr3.length;
        Field[] fieldArr4 = new Field[length + length2];
        System.arraycopy(fieldArr2, 0, fieldArr4, 0, length);
        System.arraycopy(fieldArr3, 0, fieldArr4, length, length2);
        if (!z) {
            return fieldArr4;
        }
        Class superclass = cls.getSuperclass();
        for (int i2 = 0; superclass != null && i2 != i; i2++) {
            try {
                Field[] declaredFields = superclass.getDeclaredFields();
                int length3 = fieldArr4.length;
                int length4 = declaredFields.length;
                Field[] fieldArr5 = new Field[length3 + length4];
                System.arraycopy(fieldArr4, 0, fieldArr5, 0, length3);
                System.arraycopy(declaredFields, 0, fieldArr5, length3, length4);
                fieldArr4 = fieldArr5;
            } catch (Error unused3) {
            }
            try {
                Field[] fields = superclass.getFields();
                int length5 = fieldArr4.length;
                int length6 = fields.length;
                Field[] fieldArr6 = new Field[length5 + length6];
                System.arraycopy(fieldArr4, 0, fieldArr6, 0, length5);
                System.arraycopy(fields, 0, fieldArr6, length5, length6);
                fieldArr4 = fieldArr6;
            } catch (Error unused4) {
            }
            superclass = superclass.getSuperclass();
        }
        return fieldArr4;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m463(Class cls, Class cls2) {
        Field m462;
        synchronized (AbstractC0370.class) {
            try {
                C0832 c0832 = this.f2560;
                if (c0832 == null) {
                    c0832 = new C0832();
                    this.f2560 = c0832;
                }
                c0832.f2646 = cls2;
                m462 = m462(cls, c0832);
            } catch (Throwable th) {
                throw th;
            }
        }
        return m462;
    }
}
