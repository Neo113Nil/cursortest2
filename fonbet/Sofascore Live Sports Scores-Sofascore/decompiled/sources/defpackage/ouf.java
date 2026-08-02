package defpackage;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ouf implements v4k {
    public final ln3 a;
    public final FieldNamingStrategy b;
    public final ne6 c;
    public final List d;

    public ouf(ln3 ln3Var, FieldNamingStrategy fieldNamingStrategy, ne6 ne6Var, afa afaVar, List list) {
        this.a = ln3Var;
        this.b = fieldNamingStrategy;
        this.c = ne6Var;
        this.d = list;
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        Class cls = u5kVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        sha.w(this.d);
        return iuf.a.A(cls) ? new nuf(cls, b(gson, u5kVar, cls, true)) : new muf(this.a.b(u5kVar), b(gson, u5kVar, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b0  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap b(Gson gson, u5k u5kVar, Class cls, boolean z) {
        Method method;
        Field[] fieldArr;
        b6h b6hVar;
        ArrayList arrayList;
        int size;
        int i;
        int i2;
        int i3;
        kuf kufVar;
        boolean z2;
        kuf kufVar2;
        boolean z3;
        int i4;
        Method method2;
        boolean z4;
        ArrayList arrayList2;
        ouf oufVar = this;
        Gson gson2 = gson;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            u5k u5kVar2 = u5kVar;
            Class cls2 = cls;
            while (cls2 != Object.class) {
                Field[] declaredFields = cls2.getDeclaredFields();
                if (cls2 != cls && declaredFields.length > 0) {
                    sha.w(oufVar.d);
                }
                int length = declaredFields.length;
                boolean z5 = false;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    Field field = declaredFields[i5];
                    boolean c = oufVar.c(field, true);
                    boolean c2 = oufVar.c(field, z5);
                    if (c || c2) {
                        if (z) {
                            if (Modifier.isStatic(field.getModifiers())) {
                                c2 = z5;
                            } else {
                                method = iuf.a.q(cls2, field);
                                iuf.e(method);
                                if (method.getAnnotation(b6h.class) != null && field.getAnnotation(b6h.class) == null) {
                                    throw new zfa(lnb.o("@SerializedName on ", iuf.d(method, z5), " is not supported"));
                                }
                                if (method == null) {
                                    iuf.e(field);
                                }
                                boolean z6 = true;
                                fieldArr = declaredFields;
                                Type x0 = k53.x0(u5kVar2.b, cls2, field.getGenericType(), new HashMap());
                                b6hVar = (b6h) field.getAnnotation(b6h.class);
                                if (b6hVar != null) {
                                    arrayList2 = Collections.singletonList(oufVar.b.translateName(field));
                                } else {
                                    String value = b6hVar.value();
                                    String[] alternate = b6hVar.alternate();
                                    if (alternate.length == 0) {
                                        arrayList2 = Collections.singletonList(value);
                                    } else {
                                        ArrayList arrayList3 = new ArrayList(alternate.length + 1);
                                        arrayList3.add(value);
                                        Collections.addAll(arrayList3, alternate);
                                        arrayList = arrayList3;
                                        size = arrayList.size();
                                        kuf kufVar3 = null;
                                        i = 0;
                                        while (i < size) {
                                            String str = (String) arrayList.get(i);
                                            if (i != 0) {
                                                c = false;
                                            }
                                            int i7 = i5;
                                            boolean z7 = c2;
                                            u5k u5kVar3 = new u5k(x0);
                                            Type type = x0;
                                            Class cls3 = u5kVar3.a;
                                            if (cls3 == null || !cls3.isPrimitive()) {
                                                kufVar2 = kufVar3;
                                                z3 = false;
                                            } else {
                                                kufVar2 = kufVar3;
                                                z3 = z6;
                                            }
                                            int modifiers = field.getModifiers();
                                            if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                                                i4 = i6;
                                                method2 = method;
                                                z4 = z6;
                                            } else {
                                                i4 = i6;
                                                method2 = method;
                                                z4 = false;
                                            }
                                            kuf kufVar4 = kufVar2;
                                            zea zeaVar = (zea) field.getAnnotation(zea.class);
                                            ArrayList arrayList4 = arrayList;
                                            u4k b = zeaVar != null ? afa.b(oufVar.a, gson2, u5kVar3, zeaVar) : null;
                                            int i8 = i;
                                            boolean z8 = b != null ? z6 : false;
                                            if (b == null) {
                                                b = gson2.getAdapter(u5kVar3);
                                            }
                                            boolean z9 = z6;
                                            int i9 = size;
                                            boolean z10 = c;
                                            kufVar3 = (kuf) linkedHashMap.put(str, new kuf(str, field, z10, z7, method2, z8, b, gson2, u5kVar3, z3, z4));
                                            if (kufVar4 != null) {
                                                kufVar3 = kufVar4;
                                            }
                                            i = i8 + 1;
                                            oufVar = this;
                                            gson2 = gson;
                                            c = z10;
                                            c2 = z7;
                                            method = method2;
                                            size = i9;
                                            i5 = i7;
                                            x0 = type;
                                            i6 = i4;
                                            z6 = z9;
                                            arrayList = arrayList4;
                                        }
                                        i2 = i5;
                                        i3 = i6;
                                        kufVar = kufVar3;
                                        z2 = false;
                                        if (kufVar != null) {
                                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + kufVar.a + "'; conflict is caused by fields " + iuf.c(kufVar.b) + " and " + iuf.c(field));
                                        }
                                    }
                                }
                                arrayList = arrayList2;
                                size = arrayList.size();
                                kuf kufVar32 = null;
                                i = 0;
                                while (i < size) {
                                }
                                i2 = i5;
                                i3 = i6;
                                kufVar = kufVar32;
                                z2 = false;
                                if (kufVar != null) {
                                }
                            }
                        }
                        method = null;
                        if (method == null) {
                        }
                        boolean z62 = true;
                        fieldArr = declaredFields;
                        Type x02 = k53.x0(u5kVar2.b, cls2, field.getGenericType(), new HashMap());
                        b6hVar = (b6h) field.getAnnotation(b6h.class);
                        if (b6hVar != null) {
                        }
                        arrayList = arrayList2;
                        size = arrayList.size();
                        kuf kufVar322 = null;
                        i = 0;
                        while (i < size) {
                        }
                        i2 = i5;
                        i3 = i6;
                        kufVar = kufVar322;
                        z2 = false;
                        if (kufVar != null) {
                        }
                    } else {
                        fieldArr = declaredFields;
                        z2 = z5;
                        i2 = i5;
                        i3 = i6;
                    }
                    i5 = i2 + 1;
                    oufVar = this;
                    gson2 = gson;
                    declaredFields = fieldArr;
                    length = i3;
                    z5 = z2;
                }
                u5kVar2 = new u5k(k53.x0(u5kVar2.b, cls2, cls2.getGenericSuperclass(), new HashMap()));
                cls2 = u5kVar2.a;
                oufVar = this;
                gson2 = gson;
            }
        }
        return linkedHashMap;
    }

    public final boolean c(Field field, boolean z) {
        Class<?> type = field.getType();
        ne6 ne6Var = this.c;
        if (ne6Var.c(type)) {
            return false;
        }
        ne6Var.d(z);
        if ((ne6Var.b & field.getModifiers()) != 0) {
            return false;
        }
        if (ne6Var.a != -1.0d) {
            shh shhVar = (shh) field.getAnnotation(shh.class);
            ddk ddkVar = (ddk) field.getAnnotation(ddk.class);
            if (shhVar != null) {
                if (ne6Var.a < shhVar.value()) {
                    return false;
                }
            }
            if (ddkVar != null) {
                if (ne6Var.a >= ddkVar.value()) {
                    return false;
                }
            }
        }
        if (field.isSynthetic()) {
            return false;
        }
        if (ne6Var.d) {
            cj6 cj6Var = (cj6) field.getAnnotation(cj6.class);
            if (cj6Var == null) {
                return false;
            }
            if (z) {
                if (!cj6Var.serialize()) {
                    return false;
                }
            } else if (!cj6Var.deserialize()) {
                return false;
            }
        }
        if (!ne6Var.c) {
            Class<?> type2 = field.getType();
            if (type2.isMemberClass() && (type2.getModifiers() & 8) == 0) {
                return false;
            }
        }
        if (ne6.e(field.getType())) {
            return false;
        }
        List list = z ? ne6Var.e : ne6Var.f;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        return true;
    }
}
