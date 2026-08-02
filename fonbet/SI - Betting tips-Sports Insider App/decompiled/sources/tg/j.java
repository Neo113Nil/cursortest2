package tg;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import sg.n0;
import sg.s0;
import sg.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class j implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public final ag.c f23951a;

    /* renamed from: b, reason: collision with root package name */
    public final qg.h f23952b;

    public j(ag.c baseClass) {
        qg.h d10;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f23951a = baseClass;
        d10 = y4.a.d("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + '>', qg.c.f22156f, new qg.g[0], new k2.d0(16));
        this.f23952b = d10;
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        rg.b lVar;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        k c2 = y4.a.c(decoder);
        m element = c2.j();
        og.a e7 = e(element);
        Intrinsics.checkNotNull(e7, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        c json = c2.A();
        og.a deserializer = e7;
        json.getClass();
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String str = null;
        if (element instanceof y) {
            lVar = new ug.m(json, (y) element, str, 12);
        } else if (element instanceof e) {
            lVar = new ug.n(json, (e) element);
        } else {
            if (!(element instanceof s) && !Intrinsics.areEqual(element, v.INSTANCE)) {
                throw new gf.m();
            }
            lVar = new ug.l(json, (c0) element, null);
        }
        return lVar.a(deserializer);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e7 A[Catch: NoSuchFieldException -> 0x01df, TRY_LEAVE, TryCatch #3 {NoSuchFieldException -> 0x01df, blocks: (B:96:0x01b8, B:98:0x01c6, B:107:0x01e7, B:103:0x01db), top: B:95:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f9 A[Catch: NoSuchFieldException -> 0x01fc, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x01fc, blocks: (B:111:0x01ee, B:112:0x01f5, B:114:0x01f9), top: B:110:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6 A[Catch: NoSuchFieldException -> 0x01df, TryCatch #3 {NoSuchFieldException -> 0x01df, blocks: (B:96:0x01b8, B:98:0x01c6, B:107:0x01e7, B:103:0x01db), top: B:95:0x01b8 }] */
    @Override // og.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ug.s encoder, Object value) {
        Object obj;
        Class<?> cls;
        Object obj2;
        Field declaredField;
        og.a aVar;
        int length;
        int i5;
        Class<?> cls2;
        Object obj3;
        og.e eVar;
        og.a e7;
        og.a aVar2;
        Field field;
        Method method;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        c4.d u10 = encoder.u();
        ag.c cVar = this.f23951a;
        og.a h10 = u10.h(cVar, value);
        if (h10 == null) {
            ag.c orCreateKotlinClass = Reflection.getOrCreateKotlinClass(value.getClass());
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "<this>");
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "<this>");
            int i10 = 0;
            og.a[] args = new og.a[0];
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "<this>");
            Intrinsics.checkNotNullParameter(args, "args");
            Class k6 = u6.h.k(orCreateKotlinClass);
            og.a[] args2 = (og.a[]) Arrays.copyOf(args, 0);
            Intrinsics.checkNotNullParameter(k6, "<this>");
            Intrinsics.checkNotNullParameter(args2, "args");
            if (k6.isEnum() && k6.getAnnotation(og.e.class) == null && k6.getAnnotation(og.c.class) == null) {
                Object[] enumConstants = k6.getEnumConstants();
                String canonicalName = k6.getCanonicalName();
                Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
                Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
                aVar2 = new sg.v(canonicalName, (Enum[]) enumConstants);
            } else {
                og.a[] aVarArr = (og.a[]) Arrays.copyOf(args2, args2.length);
                og.a aVar3 = null;
                try {
                    Field declaredField2 = k6.getDeclaredField("Companion");
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(null);
                } catch (Throwable unused) {
                    obj = null;
                }
                og.a e9 = obj == null ? null : s0.e(obj, (og.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                if (e9 == null) {
                    String canonicalName2 = k6.getCanonicalName();
                    if (canonicalName2 != null && !kotlin.text.z.o(canonicalName2, "java.", false) && !kotlin.text.z.o(canonicalName2, "kotlin.", false)) {
                        Field[] declaredFields = k6.getDeclaredFields();
                        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                        int length2 = declaredFields.length;
                        boolean z5 = false;
                        Field field2 = null;
                        while (true) {
                            if (i10 < length2) {
                                Field field3 = declaredFields[i10];
                                if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), k6) && Modifier.isStatic(field3.getModifiers())) {
                                    if (z5) {
                                        break;
                                    }
                                    field2 = field3;
                                    z5 = true;
                                }
                                i10++;
                            } else if (z5) {
                                field = field2;
                            }
                        }
                        field = null;
                        if (field != null) {
                            Object obj4 = field.get(null);
                            Method[] methods = k6.getMethods();
                            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                            int length3 = methods.length;
                            Method method2 = null;
                            int i11 = 0;
                            boolean z7 = false;
                            while (true) {
                                if (i11 < length3) {
                                    Method method3 = methods[i11];
                                    if (Intrinsics.areEqual(method3.getName(), "serializer")) {
                                        Class<?>[] parameterTypes = method3.getParameterTypes();
                                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                                        if (parameterTypes.length == 0 && Intrinsics.areEqual(method3.getReturnType(), og.a.class)) {
                                            if (z7) {
                                                break;
                                            }
                                            method2 = method3;
                                            z7 = true;
                                        }
                                    }
                                    i11++;
                                } else if (z7) {
                                    method = method2;
                                }
                            }
                            method = null;
                            if (method != null) {
                                Object invoke = method.invoke(obj4, null);
                                if (invoke instanceof og.a) {
                                    aVar3 = (og.a) invoke;
                                }
                            }
                        }
                        if (aVar3 == null) {
                            og.a[] aVarArr2 = (og.a[]) Arrays.copyOf(args2, args2.length);
                            Class<?>[] declaredClasses = k6.getDeclaredClasses();
                            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
                            int length4 = declaredClasses.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length4) {
                                    cls = null;
                                    break;
                                }
                                cls = declaredClasses[i12];
                                if (cls.getAnnotation(n0.class) != null) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            if (cls == null) {
                                obj2 = null;
                            } else {
                                String simpleName = cls.getSimpleName();
                                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                                try {
                                    declaredField = k6.getDeclaredField(simpleName);
                                } catch (Throwable unused2) {
                                }
                                try {
                                    declaredField.setAccessible(true);
                                    obj2 = declaredField.get(null);
                                } catch (Throwable unused3) {
                                    obj2 = null;
                                    if (obj2 != null) {
                                    }
                                    try {
                                        Class<?>[] declaredClasses2 = k6.getDeclaredClasses();
                                        Intrinsics.checkNotNullExpressionValue(declaredClasses2, "getDeclaredClasses(...)");
                                        length = declaredClasses2.length;
                                        i5 = 0;
                                        Class<?> cls3 = null;
                                        boolean z10 = false;
                                        while (true) {
                                            if (i5 >= length) {
                                            }
                                            i5++;
                                        }
                                        cls2 = null;
                                        if (cls2 != null) {
                                        }
                                        aVar = null;
                                        obj3 = null;
                                        if (obj3 instanceof og.a) {
                                        }
                                    } catch (NoSuchFieldException unused4) {
                                        aVar = null;
                                    }
                                    e9 = aVar;
                                    if (e9 == null) {
                                    }
                                    aVar2 = e9;
                                    if (aVar2 == null) {
                                    }
                                    if (aVar2 != null) {
                                    }
                                }
                            }
                            if (obj2 != null || (e7 = s0.e(obj2, (og.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length))) == null) {
                                Class<?>[] declaredClasses22 = k6.getDeclaredClasses();
                                Intrinsics.checkNotNullExpressionValue(declaredClasses22, "getDeclaredClasses(...)");
                                length = declaredClasses22.length;
                                i5 = 0;
                                Class<?> cls32 = null;
                                boolean z102 = false;
                                while (true) {
                                    if (i5 >= length) {
                                        Class<?> cls4 = declaredClasses22[i5];
                                        if (Intrinsics.areEqual(cls4.getSimpleName(), "$serializer")) {
                                            if (z102) {
                                                break;
                                            }
                                            cls32 = cls4;
                                            z102 = true;
                                        }
                                        i5++;
                                    } else if (z102) {
                                        cls2 = cls32;
                                    }
                                }
                                cls2 = null;
                                if (cls2 != null) {
                                    Field field4 = cls2.getField("INSTANCE");
                                    if (field4 != null) {
                                        aVar = null;
                                        try {
                                            obj3 = field4.get(null);
                                            if (obj3 instanceof og.a) {
                                                e9 = (og.a) obj3;
                                            }
                                        } catch (NoSuchFieldException unused5) {
                                        }
                                        e9 = aVar;
                                    }
                                }
                                aVar = null;
                                obj3 = null;
                                if (obj3 instanceof og.a) {
                                }
                                e9 = aVar;
                            } else {
                                e9 = e7;
                                aVar = null;
                            }
                            if (e9 == null) {
                                if (k6.getAnnotation(og.c.class) == null && ((eVar = (og.e) k6.getAnnotation(og.e.class)) == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(eVar.with()), Reflection.getOrCreateKotlinClass(og.d.class)))) {
                                    aVar3 = aVar;
                                } else {
                                    Intrinsics.checkNotNullParameter(k6, "<this>");
                                    aVar3 = new og.d(Reflection.getOrCreateKotlinClass(k6));
                                }
                            }
                        }
                        aVar2 = aVar3;
                    }
                    aVar3 = null;
                    if (aVar3 == null) {
                    }
                    aVar2 = aVar3;
                }
                aVar2 = e9;
            }
            if (aVar2 == null) {
                hf.i iVar = z0.f23721a;
                Intrinsics.checkNotNullParameter(orCreateKotlinClass, "<this>");
                aVar2 = (og.a) z0.f23721a.get(orCreateKotlinClass);
            }
            if (aVar2 != null) {
                ag.c orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(value.getClass());
                String simpleName2 = orCreateKotlinClass2.getSimpleName();
                if (simpleName2 == null) {
                    simpleName2 = String.valueOf(orCreateKotlinClass2);
                }
                throw new og.f("Class '" + simpleName2 + "' is not registered for polymorphic serialization " + ("in the scope of '" + cVar.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
            }
            h10 = aVar2;
        }
        h10.c(encoder, value);
    }

    @Override // og.a
    public final qg.g d() {
        return this.f23952b;
    }

    public abstract og.a e(m mVar);
}
