package com.google.gson.internal.bind;

import androidx.appcompat.widget.c1;
import com.google.gson.h;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m3.f;
import rh.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements y {

    /* renamed from: a, reason: collision with root package name */
    public final f f6253a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6254b;

    /* renamed from: c, reason: collision with root package name */
    public final Excluder f6255c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f6256d;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    class AnonymousClass1 extends x {
        @Override // com.google.gson.x
        public final Object b(r9.a aVar) {
            aVar.s0();
            return null;
        }

        @Override // com.google.gson.x
        public final void c(r9.b bVar, Object obj) {
            bVar.C();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static abstract class Adapter<T, A> extends x {

        /* renamed from: a, reason: collision with root package name */
        public final d f6257a;

        public Adapter(d dVar) {
            this.f6257a = dVar;
        }

        @Override // com.google.gson.x
        public final Object b(r9.a aVar) {
            if (aVar.i0() == 9) {
                aVar.c0();
                return null;
            }
            Object d10 = d();
            Map map = this.f6257a.f6286a;
            try {
                aVar.k();
                while (aVar.C()) {
                    c cVar = (c) map.get(aVar.W());
                    if (cVar == null) {
                        aVar.s0();
                    } else {
                        f(d10, aVar, cVar);
                    }
                }
                aVar.w();
                return e(d10);
            } catch (IllegalAccessException e7) {
                g gVar = q9.c.f22069a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
            } catch (IllegalStateException e9) {
                throw new r(e9);
            }
        }

        @Override // com.google.gson.x
        public final void c(r9.b bVar, Object obj) {
            if (obj == null) {
                bVar.C();
                return;
            }
            bVar.n();
            try {
                Iterator it = this.f6257a.f6287b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(bVar, obj);
                }
                bVar.w();
            } catch (IllegalAccessException e7) {
                g gVar = q9.c.f22069a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, r9.a aVar, c cVar);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        public static final HashMap f6259e;

        /* renamed from: b, reason: collision with root package name */
        public final Constructor f6260b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f6261c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f6262d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f6259e = hashMap;
        }

        public RecordAdapter(Class cls, d dVar) {
            super(dVar);
            this.f6262d = new HashMap();
            g gVar = q9.c.f22069a;
            Constructor q = gVar.q(cls);
            this.f6260b = q;
            q9.c.f(q);
            String[] t3 = gVar.t(cls);
            for (int i5 = 0; i5 < t3.length; i5++) {
                this.f6262d.put(t3[i5], Integer.valueOf(i5));
            }
            Class<?>[] parameterTypes = this.f6260b.getParameterTypes();
            this.f6261c = new Object[parameterTypes.length];
            for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                this.f6261c[i10] = f6259e.get(parameterTypes[i10]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f6261c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f6260b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e7) {
                g gVar = q9.c.f22069a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
            } catch (IllegalArgumentException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + q9.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e10) {
                e = e10;
                throw new RuntimeException("Failed to invoke constructor '" + q9.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + q9.c.b(constructor) + "' with args " + Arrays.toString(objArr), e11.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, r9.a aVar, c cVar) {
            Object[] objArr = (Object[]) obj;
            String str = cVar.f6279c;
            Integer num = (Integer) this.f6262d.get(str);
            if (num == null) {
                throw new IllegalStateException("Could not find the index in the constructor '" + q9.c.b(this.f6260b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int intValue = num.intValue();
            Object b10 = cVar.f6282f.b(aVar);
            if (b10 != null || !cVar.f6283g) {
                objArr[intValue] = b10;
            } else {
                StringBuilder p10 = d9.e.p("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                p10.append(aVar.z(false));
                throw new p(p10.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(f fVar, h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        List list = Collections.EMPTY_LIST;
        this.f6253a = fVar;
        this.f6254b = hVar;
        this.f6255c = excluder;
        this.f6256d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + q9.c.c(field) + " and " + q9.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.y
    public final x a(j jVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        g gVar = q9.c.f22069a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new AnonymousClass1();
        }
        List list = Collections.EMPTY_LIST;
        com.google.gson.internal.e.f();
        return q9.c.f22069a.B(rawType) ? new RecordAdapter(rawType, c(jVar, typeToken, rawType, true)) : new FieldReflectionAdapter(this.f6253a.j(typeToken, true), c(jVar, typeToken, rawType, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b0  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d c(j jVar, TypeToken typeToken, Class cls, boolean z5) {
        boolean z7;
        Method method;
        o9.b bVar;
        List asList;
        String str;
        boolean z10;
        List list;
        String str2;
        o9.a aVar;
        j jVar2;
        boolean z11;
        Field field;
        List<String> list2;
        x xVar;
        Field field2;
        c cVar;
        if (cls.isInterface()) {
            return d.f6285c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken typeToken2 = typeToken;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                List list3 = Collections.EMPTY_LIST;
                com.google.gson.internal.e.f();
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i5 = 0;
            while (i5 < length) {
                Field field3 = declaredFields[i5];
                boolean d10 = d(field3, true);
                boolean d11 = d(field3, r14);
                if (d10 || d11) {
                    if (!z5) {
                        z7 = d11;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        z7 = r14;
                    } else {
                        Method p10 = q9.c.f22069a.p(cls2, field3);
                        q9.c.f(p10);
                        if (p10.getAnnotation(o9.b.class) != null && field3.getAnnotation(o9.b.class) == null) {
                            throw new m(c1.n("@SerializedName on ", q9.c.d(p10, r14), " is not supported"));
                        }
                        z7 = d11;
                        method = p10;
                        if (method == null) {
                            q9.c.f(field3);
                        }
                        Type j = com.google.gson.internal.e.j(typeToken2.getType(), cls2, field3.getGenericType(), new HashMap());
                        bVar = (o9.b) field3.getAnnotation(o9.b.class);
                        if (bVar != null) {
                            str = this.f6254b.b(field3);
                            asList = Collections.EMPTY_LIST;
                        } else {
                            String value = bVar.value();
                            asList = Arrays.asList(bVar.alternate());
                            str = value;
                        }
                        if (asList.isEmpty()) {
                            z10 = true;
                            ArrayList arrayList = new ArrayList(asList.size() + 1);
                            arrayList.add(str);
                            arrayList.addAll(asList);
                            list = arrayList;
                        } else {
                            z10 = true;
                            list = Collections.singletonList(str);
                        }
                        str2 = (String) list.get(r14);
                        TypeToken<?> typeToken3 = TypeToken.get(j);
                        Class<? super Object> rawType = typeToken3.getRawType();
                        boolean z12 = (rawType == null && rawType.isPrimitive()) ? z10 : r14;
                        int modifiers = field3.getModifiers();
                        boolean z13 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z10;
                        aVar = (o9.a) field3.getAnnotation(o9.a.class);
                        if (aVar == null) {
                            field = field3;
                            z11 = z10;
                            list2 = list;
                            jVar2 = jVar;
                            xVar = this.f6256d.b(this.f6253a, jVar2, typeToken3, aVar, false);
                        } else {
                            jVar2 = jVar;
                            z11 = z10;
                            field = field3;
                            list2 = list;
                            xVar = null;
                        }
                        boolean z14 = xVar == null ? z11 : r14;
                        if (xVar == null) {
                            xVar = jVar2.c(typeToken3);
                        }
                        c cVar2 = new c(str2, field, method, d10 ? xVar : z14 ? xVar : new TypeAdapterRuntimeTypeWrapper(jVar2, xVar, typeToken3.getType()), xVar, z12, z13);
                        field2 = field;
                        if (z7) {
                            for (String str3 : list2) {
                                c cVar3 = (c) linkedHashMap.put(str3, cVar2);
                                if (cVar3 != null) {
                                    b(cls, str3, cVar3.f6278b, field2);
                                    throw null;
                                }
                            }
                        }
                        if (d10 && (cVar = (c) linkedHashMap2.put(str2, cVar2)) != null) {
                            b(cls, str2, cVar.f6278b, field2);
                            throw null;
                        }
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type j6 = com.google.gson.internal.e.j(typeToken2.getType(), cls2, field3.getGenericType(), new HashMap());
                    bVar = (o9.b) field3.getAnnotation(o9.b.class);
                    if (bVar != null) {
                    }
                    if (asList.isEmpty()) {
                    }
                    str2 = (String) list.get(r14);
                    TypeToken<?> typeToken32 = TypeToken.get(j6);
                    Class<? super Object> rawType2 = typeToken32.getRawType();
                    if (rawType2 == null) {
                    }
                    int modifiers2 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers2)) {
                    }
                    aVar = (o9.a) field3.getAnnotation(o9.a.class);
                    if (aVar == null) {
                    }
                    if (xVar == null) {
                    }
                    if (xVar == null) {
                    }
                    if (d10) {
                    }
                    c cVar22 = new c(str2, field, method, d10 ? xVar : z14 ? xVar : new TypeAdapterRuntimeTypeWrapper(jVar2, xVar, typeToken32.getType()), xVar, z12, z13);
                    field2 = field;
                    if (z7) {
                    }
                    if (d10) {
                        b(cls, str2, cVar.f6278b, field2);
                        throw null;
                    }
                    continue;
                }
                i5++;
                r14 = 0;
            }
            typeToken2 = TypeToken.get(com.google.gson.internal.e.j(typeToken2.getType(), cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = typeToken2.getRawType();
        }
        return new d(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean d(Field field, boolean z5) {
        boolean z7;
        Excluder excluder = this.f6255c;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.b(field.getType(), z5)) {
            z7 = true;
        } else {
            List list = z5 ? excluder.f6214a : excluder.f6215b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z7 = false;
        }
        return !z7;
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public final l f6258b;

        public FieldReflectionAdapter(l lVar, d dVar) {
            super(dVar);
            this.f6258b = lVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f6258b.d();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, r9.a aVar, c cVar) {
            Field field = cVar.f6278b;
            Object b10 = cVar.f6282f.b(aVar);
            if (b10 == null && cVar.f6283g) {
                return;
            }
            if (cVar.f6284h) {
                throw new m(c1.m("Cannot set value of 'static final' ", q9.c.d(field, false)));
            }
            field.set(obj, b10);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }
    }
}
