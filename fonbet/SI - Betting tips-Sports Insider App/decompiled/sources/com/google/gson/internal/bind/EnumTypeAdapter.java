package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class EnumTypeAdapter<T extends Enum<T>> extends x {

    /* renamed from: d, reason: collision with root package name */
    public static final y f6234d = new y() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6235a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6236b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6237c = new HashMap();

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i5 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i5] = field;
                    i5++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i5);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                o9.b bVar = (o9.b) field2.getAnnotation(o9.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f6235a.put(str2, r42);
                    }
                }
                this.f6235a.put(name, r42);
                this.f6236b.put(str, r42);
                this.f6237c.put(r42, name);
            }
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        if (aVar.i0() == 9) {
            aVar.c0();
            return null;
        }
        String f02 = aVar.f0();
        Enum r02 = (Enum) this.f6235a.get(f02);
        return r02 == null ? (Enum) this.f6236b.get(f02) : r02;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        Enum r32 = (Enum) obj;
        bVar.W(r32 == null ? null : (String) this.f6237c.get(r32));
    }
}
