package yd;

import Ld.B;
import Ld.C3577d;
import Ld.y;
import ae.EnumC5003e;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.p;
import qd.s;
import sd.C9661c;
import zd.C11104f;

/* renamed from: yd.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10885c {
    private static Xd.f a(Class cls) {
        int i11 = 0;
        while (cls.isArray()) {
            i11++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            Sd.b a11 = C11104f.a(cls);
            int i12 = C9661c.f98575o;
            Sd.b j11 = C9661c.j(a11.a());
            if (j11 != null) {
                a11 = j11;
            }
            return new Xd.f(a11, i11);
        }
        if (cls.equals(Void.TYPE)) {
            Sd.c topLevelFqName = s.a.f81903d.l();
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            return new Xd.f(new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")), i11);
        }
        p g10 = EnumC5003e.b(cls.getName()).g();
        Intrinsics.checkNotNullExpressionValue(g10, "getPrimitiveType(...)");
        if (i11 > 0) {
            Sd.c topLevelFqName2 = g10.d();
            Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
            Sd.c e12 = topLevelFqName2.e();
            return new Xd.f(new Sd.b(e12, U7.d.a(e12, "parent(...)", topLevelFqName2, "shortName(...)")), i11 - 1);
        }
        Sd.c topLevelFqName3 = g10.f();
        Intrinsics.checkNotNullParameter(topLevelFqName3, "topLevelFqName");
        Sd.c e13 = topLevelFqName3.e();
        return new Xd.f(new Sd.b(e13, U7.d.a(e13, "parent(...)", topLevelFqName3, "shortName(...)")), i11);
    }

    public static void b(@NotNull Class klass, @NotNull y.c visitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Iterator a11 = C7721c.a(klass.getDeclaredAnnotations());
        while (a11.hasNext()) {
            Annotation annotation = (Annotation) a11.next();
            Intrinsics.f(annotation);
            c(visitor, annotation);
        }
        visitor.a();
    }

    private static void c(y.c cVar, Annotation annotation) {
        Class b11 = C6345a.b(C6345a.a(annotation));
        y.a b12 = cVar.b(C11104f.a(b11), new C10884b(annotation));
        if (b12 != null) {
            d(b12, annotation, b11);
        }
    }

    private static void d(y.a aVar, Annotation annotation, Class cls) {
        Set set;
        Iterator a11 = C7721c.a(cls.getDeclaredMethods());
        while (a11.hasNext()) {
            Method method = (Method) a11.next();
            int i11 = 0;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                Intrinsics.f(invoke);
                Sd.f f7 = Sd.f.f(method.getName());
                Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
                Class<?> cls2 = invoke.getClass();
                if (cls2.equals(Class.class)) {
                    aVar.d(f7, a((Class) invoke));
                } else {
                    set = h.f106570a;
                    if (set.contains(cls2)) {
                        aVar.f(f7, invoke);
                    } else if (C11104f.h(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        Intrinsics.f(cls2);
                        Sd.b a12 = C11104f.a(cls2);
                        Sd.f f11 = Sd.f.f(((Enum) invoke).name());
                        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
                        aVar.c(f7, a12, f11);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                        Class cls3 = (Class) C7705l.Y(interfaces);
                        Intrinsics.f(cls3);
                        y.a e11 = aVar.e(C11104f.a(cls3), f7);
                        if (e11 != null) {
                            d(e11, (Annotation) invoke, cls3);
                        }
                    } else {
                        if (!cls2.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                        }
                        y.b b11 = aVar.b(f7);
                        if (b11 != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                Sd.b a13 = C11104f.a(componentType);
                                Object[] objArr = (Object[]) invoke;
                                int length = objArr.length;
                                while (i11 < length) {
                                    Object obj = objArr[i11];
                                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    Sd.f f12 = Sd.f.f(((Enum) obj).name());
                                    Intrinsics.checkNotNullExpressionValue(f12, "identifier(...)");
                                    b11.c(a13, f12);
                                    i11++;
                                }
                            } else if (componentType.equals(Class.class)) {
                                Object[] objArr2 = (Object[]) invoke;
                                int length2 = objArr2.length;
                                while (i11 < length2) {
                                    Object obj2 = objArr2[i11];
                                    Intrinsics.g(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    b11.e(a((Class) obj2));
                                    i11++;
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) invoke;
                                int length3 = objArr3.length;
                                while (i11 < length3) {
                                    Object obj3 = objArr3[i11];
                                    y.a d11 = b11.d(C11104f.a(componentType));
                                    if (d11 != null) {
                                        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        d(d11, (Annotation) obj3, componentType);
                                    }
                                    i11++;
                                }
                            } else {
                                Object[] objArr4 = (Object[]) invoke;
                                int length4 = objArr4.length;
                                while (i11 < length4) {
                                    b11.b(objArr4[i11]);
                                    i11++;
                                }
                            }
                            b11.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public static void e(@NotNull Class klass, @NotNull C3577d memberVisitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        Iterator a11 = C7721c.a(klass.getDeclaredMethods());
        while (a11.hasNext()) {
            Method method = (Method) a11.next();
            Sd.f f7 = Sd.f.f(method.getName());
            Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
            Intrinsics.checkNotNullParameter(method, "method");
            StringBuilder sb2 = new StringBuilder("(");
            Iterator a12 = C7721c.a(method.getParameterTypes());
            while (a12.hasNext()) {
                Class cls = (Class) a12.next();
                Intrinsics.f(cls);
                sb2.append(C11104f.b(cls));
            }
            sb2.append(")");
            Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            sb2.append(C11104f.b(returnType));
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            C3577d.a a13 = memberVisitor.a(f7, sb3);
            Iterator a14 = C7721c.a(method.getDeclaredAnnotations());
            while (a14.hasNext()) {
                Annotation annotation = (Annotation) a14.next();
                Intrinsics.f(annotation);
                c(a13, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
            Annotation[][] annotationArr = parameterAnnotations;
            int length = annotationArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                Iterator a15 = C7721c.a(annotationArr[i11]);
                while (a15.hasNext()) {
                    Annotation annotation2 = (Annotation) a15.next();
                    Class b11 = C6345a.b(C6345a.a(annotation2));
                    Ld.k d11 = a13.d(i11, C11104f.a(b11), new C10884b(annotation2));
                    if (d11 != null) {
                        d(d11, annotation2, b11);
                    }
                }
            }
            a13.a();
        }
        Iterator a16 = C7721c.a(klass.getDeclaredConstructors());
        while (a16.hasNext()) {
            Constructor constructor = (Constructor) a16.next();
            Sd.f fVar = Sd.h.f26148e;
            Intrinsics.f(constructor);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            StringBuilder sb4 = new StringBuilder("(");
            Iterator a17 = C7721c.a(constructor.getParameterTypes());
            while (a17.hasNext()) {
                Class cls2 = (Class) a17.next();
                Intrinsics.f(cls2);
                sb4.append(C11104f.b(cls2));
            }
            sb4.append(")V");
            String sb5 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
            C3577d.a a18 = memberVisitor.a(fVar, sb5);
            Iterator a19 = C7721c.a(constructor.getDeclaredAnnotations());
            while (a19.hasNext()) {
                Annotation annotation3 = (Annotation) a19.next();
                Intrinsics.f(annotation3);
                c(a18, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            Intrinsics.f(parameterAnnotations2);
            if (parameterAnnotations2.length != 0) {
                int length2 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length3 = parameterAnnotations2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    Iterator a21 = C7721c.a(parameterAnnotations2[i12]);
                    while (a21.hasNext()) {
                        Annotation annotation4 = (Annotation) a21.next();
                        Class b12 = C6345a.b(C6345a.a(annotation4));
                        Iterator it = a16;
                        Ld.k d12 = a18.d(i12 + length2, C11104f.a(b12), new C10884b(annotation4));
                        if (d12 != null) {
                            d(d12, annotation4, b12);
                        }
                        a16 = it;
                    }
                }
            }
            Iterator it2 = a16;
            a18.a();
            a16 = it2;
        }
        Iterator a22 = C7721c.a(klass.getDeclaredFields());
        while (a22.hasNext()) {
            Field field = (Field) a22.next();
            Sd.f name = Sd.f.f(field.getName());
            Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
            Intrinsics.checkNotNullParameter(field, "field");
            Class<?> type = field.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            String desc = C11104f.b(type);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            String name2 = name.b();
            Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            C3577d.b bVar = new C3577d.b(memberVisitor, new B(name2 + '#' + desc));
            Iterator a23 = C7721c.a(field.getDeclaredAnnotations());
            while (a23.hasNext()) {
                Annotation annotation5 = (Annotation) a23.next();
                Intrinsics.f(annotation5);
                c(bVar, annotation5);
            }
            bVar.a();
        }
    }
}
