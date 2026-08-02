package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cfp implements nap {
    public final gvo a;
    public final nbp b;
    public final ydp c;
    public final List d;

    public cfp(gvo gvoVar, nbp nbpVar, ydp ydpVar, List list) {
        this.a = gvoVar;
        this.b = nbpVar;
        this.c = ydpVar;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!ocp.a.a(obj, accessibleObject)) {
            throw new o9p(f6n.b(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."), 16);
        }
    }

    public static void d(Class cls, String str, Field field, Field field2) {
        String name = cls.getName();
        String c = f6n.c(field);
        String c2 = f6n.c(field2);
        StringBuilder sb = new StringBuilder(fn0.b(name.length(), 44, String.valueOf(str).length(), 32, c.length(), 5, c2.length()) + 81);
        bf3.v(sb, "Class ", name, " declares multiple JSON fields named '", str);
        bf3.v(sb, "'; conflict is caused by fields ", c, " and ", c2);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Class cls = z6nVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        vha vhaVar = f6n.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new d9p(2);
        }
        int V = b0a.V(cls, this.d);
        if (V != 4) {
            boolean z = V == 3;
            return f6n.a.O(cls) ? new bfp(cls, e(h9pVar, z6nVar, cls, z, true), z) : new xep(this.a.e(z6nVar, true), e(h9pVar, z6nVar, cls, z, false));
        }
        String valueOf = String.valueOf(cls);
        throw new o9p(wt3.m("ReflectionAccessFilter does not permit using reflection for ", valueOf, new StringBuilder(valueOf.length() + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), ". Register a TypeAdapter for this type or adjust the access filter."), 16);
    }

    public final boolean c(Field field, boolean z) {
        nbp nbpVar = this.b;
        nbpVar.getClass();
        if ((field.getModifiers() & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE) != 0 || field.isSynthetic() || nbpVar.c(field.getType(), z)) {
            return false;
        }
        List<r1p> list = z ? nbpVar.a : nbpVar.b;
        if (list.isEmpty()) {
            return true;
        }
        for (r1p r1pVar : list) {
            q1p q1pVar = (q1p) field.getDeclaringClass().getAnnotation(q1p.class);
            if (q1pVar != null && Arrays.asList(q1pVar.zzb()).contains(field.getName())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zep e(h9p h9pVar, z6n z6nVar, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        pap papVar;
        List asList;
        String str;
        boolean z5;
        ArrayList arrayList;
        String str2;
        Class cls2;
        String str3;
        boolean z6;
        int modifiers;
        Method method2;
        boolean z7;
        oap oapVar;
        int i;
        int i2;
        Field field;
        boolean z8;
        z6n z6nVar2;
        h9p h9pVar2;
        map mapVar;
        String str4;
        boolean z9;
        Field field2;
        int i3;
        boolean z10;
        sep sepVar;
        cfp cfpVar = this;
        if (cls.isInterface()) {
            return zep.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        z6n z6nVar3 = z6nVar;
        boolean z11 = z;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int i4 = 16;
            boolean z12 = true;
            boolean z13 = false;
            if (cls3 != cls && declaredFields.length > 0) {
                int V = b0a.V(cls3, cfpVar.d);
                if (V == 4) {
                    String valueOf = String.valueOf(cls3);
                    String valueOf2 = String.valueOf(cls);
                    StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 75 + 68);
                    bf3.v(sb, "ReflectionAccessFilter does not permit using reflection for ", valueOf, " (supertype of ", valueOf2);
                    sb.append("). Register a TypeAdapter for this type or adjust the access filter.");
                    throw new o9p(sb.toString(), 16);
                }
                z11 = V == 3;
            }
            int length = declaredFields.length;
            int i5 = 0;
            while (i5 < length) {
                Field field3 = declaredFields[i5];
                boolean c = cfpVar.c(field3, z12);
                boolean c2 = cfpVar.c(field3, z13);
                if (!c) {
                    if (c2) {
                        c2 = z12;
                    } else {
                        z8 = z13;
                        i = length;
                        i2 = i5;
                        i3 = i4;
                        z10 = z12;
                        z9 = z11;
                        boolean z14 = z9;
                        i5 = i2 + 1;
                        z11 = z14;
                        cfpVar = this;
                        i4 = i3;
                        z12 = z10;
                        length = i;
                        z13 = z8;
                    }
                }
                if (!z2) {
                    z3 = z12;
                    z4 = c2;
                } else if (Modifier.isStatic(field3.getModifiers())) {
                    z4 = z13;
                    z3 = z12;
                } else {
                    z3 = z12;
                    method = f6n.a.T(cls3, field3);
                    if (!z11) {
                        f6n.a(method);
                    }
                    if (method.getAnnotation(pap.class) != null && field3.getAnnotation(pap.class) == null) {
                        String b = f6n.b(method, z13);
                        throw new o9p(wt3.m("@SerializedName on ", b, new StringBuilder(b.length() + 36), " is not supported"), i4);
                    }
                    z4 = c2;
                    if (!z11 && method == null) {
                        f6n.a(field3);
                    }
                    Type T = ktm.T(z6nVar3.b, cls3, field3.getGenericType(), new HashMap());
                    papVar = (pap) field3.getAnnotation(pap.class);
                    if (papVar != null) {
                        str = field3.getName();
                        asList = Collections.EMPTY_LIST;
                    } else {
                        String zza = papVar.zza();
                        asList = Arrays.asList(papVar.zzb());
                        str = zza;
                    }
                    if (asList.isEmpty()) {
                        z5 = z11;
                        ArrayList arrayList2 = new ArrayList(asList.size() + 1);
                        arrayList2.add(str);
                        arrayList2.addAll(asList);
                        arrayList = arrayList2;
                    } else {
                        z5 = z11;
                        arrayList = Collections.singletonList(str);
                    }
                    str2 = (String) arrayList.get(0);
                    z6n z6nVar4 = new z6n(T);
                    cls2 = z6nVar4.a;
                    if (cls2 == null && cls2.isPrimitive()) {
                        str3 = str2;
                        z6 = z3;
                    } else {
                        str3 = str2;
                        z6 = false;
                    }
                    modifiers = field3.getModifiers();
                    if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                        method2 = method;
                        z7 = false;
                    } else {
                        method2 = method;
                        z7 = z3;
                    }
                    oapVar = (oap) field3.getAnnotation(oap.class);
                    if (oapVar == null) {
                        i = length;
                        z6nVar2 = z6nVar4;
                        z8 = false;
                        field = field3;
                        i2 = i5;
                        mapVar = cfpVar.c.b(cfpVar.a, h9pVar, z6nVar2, oapVar, false);
                        h9pVar2 = h9pVar;
                    } else {
                        i = length;
                        i2 = i5;
                        field = field3;
                        z8 = false;
                        z6nVar2 = z6nVar4;
                        h9pVar2 = h9pVar;
                        mapVar = null;
                    }
                    map b2 = mapVar != null ? h9pVar2.b(z6nVar2) : mapVar;
                    map jepVar = (c || mapVar != null) ? b2 : new jep(h9pVar2, b2, z6nVar2.b);
                    ArrayList<String> arrayList3 = arrayList;
                    str4 = str3;
                    Method method3 = method2;
                    z9 = z5;
                    field2 = field;
                    i3 = 16;
                    z10 = z3;
                    sep sepVar2 = new sep(cfpVar, str4, field2, z9, method3, jepVar, b2, z6, z7);
                    if (z4) {
                        for (String str5 : arrayList3) {
                            sep sepVar3 = (sep) linkedHashMap.put(str5, sepVar2);
                            if (sepVar3 != null) {
                                d(cls, str5, sepVar3.b, field2);
                                throw null;
                            }
                        }
                    }
                    if (c && (sepVar = (sep) linkedHashMap2.put(str4, sepVar2)) != null) {
                        d(cls, str4, sepVar.b, field2);
                        throw null;
                    }
                    boolean z142 = z9;
                    i5 = i2 + 1;
                    z11 = z142;
                    cfpVar = this;
                    i4 = i3;
                    z12 = z10;
                    length = i;
                    z13 = z8;
                }
                method = null;
                if (!z11) {
                    f6n.a(field3);
                }
                Type T2 = ktm.T(z6nVar3.b, cls3, field3.getGenericType(), new HashMap());
                papVar = (pap) field3.getAnnotation(pap.class);
                if (papVar != null) {
                }
                if (asList.isEmpty()) {
                }
                str2 = (String) arrayList.get(0);
                z6n z6nVar42 = new z6n(T2);
                cls2 = z6nVar42.a;
                if (cls2 == null) {
                }
                str3 = str2;
                z6 = false;
                modifiers = field3.getModifiers();
                if (Modifier.isStatic(modifiers)) {
                }
                method2 = method;
                z7 = false;
                oapVar = (oap) field3.getAnnotation(oap.class);
                if (oapVar == null) {
                }
                if (mapVar != null) {
                }
                if (c) {
                }
                ArrayList<String> arrayList32 = arrayList;
                str4 = str3;
                Method method32 = method2;
                z9 = z5;
                field2 = field;
                i3 = 16;
                z10 = z3;
                sep sepVar22 = new sep(cfpVar, str4, field2, z9, method32, jepVar, b2, z6, z7);
                if (z4) {
                }
                if (c) {
                    d(cls, str4, sepVar.b, field2);
                    throw null;
                }
                continue;
                boolean z1422 = z9;
                i5 = i2 + 1;
                z11 = z1422;
                cfpVar = this;
                i4 = i3;
                z12 = z10;
                length = i;
                z13 = z8;
            }
            z6nVar3 = new z6n(ktm.T(z6nVar3.b, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = z6nVar3.a;
            cfpVar = this;
            z11 = z11;
        }
        return new zep(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }
}
