package com.squareup.moshi;

import com.squareup.moshi.AdapterMethodsFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import g.C6594f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AdapterMethodsFactory implements JsonAdapter.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f60347a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f60348b;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f60349a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Set<Annotation> f60350b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Object f60351c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Method f60352d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f60353e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final Type f60354f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final JsonAdapter<?>[] f60355g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i11, @NotNull Type type, int i12, @NotNull Set<? extends Annotation> annotations, @NotNull Object adapter, @NotNull Method method, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(method, "method");
            this.f60349a = i11;
            this.f60350b = annotations;
            this.f60351c = adapter;
            this.f60352d = method;
            this.f60353e = z11;
            this.f60354f = Y9.c.a(type);
            this.f60355g = new JsonAdapter[i12 - i11];
        }

        public void a(@NotNull Moshi moshi, @NotNull AdapterMethodsFactory factory) {
            JsonAdapter<?> e11;
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(factory, "factory");
            JsonAdapter<?>[] jsonAdapterArr = this.f60355g;
            if (jsonAdapterArr.length == 0) {
                return;
            }
            Method method = this.f60352d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i11 = this.f60349a;
            for (int i12 = i11; i12 < length; i12++) {
                Type type = genericParameterTypes[i12];
                Intrinsics.g(type, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Annotation[] annotationArr = parameterAnnotations[i12];
                Intrinsics.checkNotNullExpressionValue(annotationArr, "parameterAnnotations[i]");
                Set<Annotation> g10 = Y9.c.g(annotationArr);
                int i13 = i12 - i11;
                if (D.b(this.f60354f, type2) && Intrinsics.d(this.f60350b, g10)) {
                    Intrinsics.checkNotNullExpressionValue(type2, "type");
                    e11 = moshi.h(factory, type2, g10);
                } else {
                    Intrinsics.checkNotNullExpressionValue(type2, "type");
                    e11 = moshi.e(type2, g10);
                }
                jsonAdapterArr[i13] = e11;
            }
        }

        public Object b(@NotNull Moshi moshi, @NotNull n reader) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(reader, "reader");
            throw new AssertionError();
        }

        @NotNull
        public final Set<Annotation> c() {
            return this.f60350b;
        }

        @NotNull
        public final Method d() {
            return this.f60352d;
        }

        public final boolean e() {
            return this.f60353e;
        }

        @NotNull
        public final Type f() {
            return this.f60354f;
        }

        protected final Object g(Object obj) {
            JsonAdapter<?>[] jsonAdapterArr = this.f60355g;
            int length = jsonAdapterArr.length + 1;
            Object[] objArr = new Object[length];
            objArr[0] = obj;
            C7705l.r(jsonAdapterArr, 1, objArr, 0, jsonAdapterArr.length);
            try {
                return this.f60352d.invoke(this.f60351c, Arrays.copyOf(objArr, length));
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected final void h(x xVar, Object obj) {
            JsonAdapter<?>[] jsonAdapterArr = this.f60355g;
            int length = jsonAdapterArr.length + 2;
            Object[] objArr = new Object[length];
            objArr[0] = xVar;
            objArr[1] = obj;
            C7705l.r(jsonAdapterArr, 2, objArr, 0, jsonAdapterArr.length);
            try {
                this.f60352d.invoke(this.f60351c, Arrays.copyOf(objArr, length));
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void i(@NotNull Moshi moshi, @NotNull x writer, Object obj) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(writer, "writer");
            throw new AssertionError();
        }
    }

    public static final class b {

        static final class a extends AbstractC7737t implements Function1<Class<Object>, Class<Object>> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f60356b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Class<Object> invoke(Class<Object> cls) {
                Class<Object> it = cls;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSuperclass();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(ArrayList arrayList, Type type, Set set) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (D.b(aVar.f(), type) && Intrinsics.d(aVar.c(), set)) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0123 A[SYNTHETIC] */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static AdapterMethodsFactory c(@NotNull Object adapter) {
            String str;
            Method declaredMethod;
            int i11;
            ArrayList arrayList;
            Iterator it;
            Method[] methodArr;
            int i12;
            String str2;
            String str3;
            String str4;
            Class cls;
            ArrayList arrayList2;
            a c5969a;
            a c5972d;
            a b11;
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = kotlin.sequences.l.q(adapter.getClass(), a.f60356b).iterator();
            while (it2.hasNext()) {
                Method[] declaredMethods = ((Class) it2.next()).getDeclaredMethods();
                Intrinsics.checkNotNullExpressionValue(declaredMethods, "clazz.declaredMethods");
                int i13 = 0;
                for (int length = declaredMethods.length; i13 < length; length = i12) {
                    Method declaredMethod2 = declaredMethods[i13];
                    boolean isAnnotationPresent = declaredMethod2.isAnnotationPresent(C.class);
                    Class cls2 = Void.TYPE;
                    if (isAnnotationPresent) {
                        Intrinsics.checkNotNullExpressionValue(declaredMethod2, "declaredMethod");
                        declaredMethod2.setAccessible(true);
                        Type genericReturnType = declaredMethod2.getGenericReturnType();
                        Type[] parameterTypes = declaredMethod2.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = declaredMethod2.getParameterAnnotations();
                        if (parameterTypes.length >= 2 && Intrinsics.d(parameterTypes[0], x.class) && Intrinsics.d(genericReturnType, cls2)) {
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
                            if (d(2, parameterTypes)) {
                                Annotation[] annotationArr = parameterAnnotations[1];
                                Intrinsics.checkNotNullExpressionValue(annotationArr, "parameterAnnotations[1]");
                                Set<Annotation> g10 = Y9.c.g(annotationArr);
                                Type type = parameterTypes[1];
                                int length2 = parameterTypes.length;
                                Intrinsics.checkNotNullExpressionValue(type, "parameterTypes[1]");
                                it = it2;
                                methodArr = declaredMethods;
                                i12 = length;
                                cls = cls2;
                                str4 = "parameterTypes";
                                c5972d = new a(2, type, length2, g10, adapter, declaredMethod2, true);
                                declaredMethod = declaredMethod2;
                                i11 = i13;
                                arrayList = arrayList4;
                                str = "parameterAnnotations[0]";
                                str2 = "\n    ";
                                str3 = "\n              Unexpected signature for ";
                                b11 = b(arrayList3, c5972d.f(), c5972d.c());
                                if (b11 == null) {
                                    throw new IllegalStateException(("Conflicting @ToJson methods:\n    " + b11.d() + str2 + c5972d.d()).toString());
                                }
                                arrayList3.add(c5972d);
                            }
                        }
                        declaredMethod = declaredMethod2;
                        it = it2;
                        methodArr = declaredMethods;
                        i12 = length;
                        str4 = "parameterTypes";
                        cls = cls2;
                        if (parameterTypes.length != 1 || Intrinsics.d(genericReturnType, cls)) {
                            throw new IllegalArgumentException(kotlin.text.h.E0("\n              Unexpected signature for " + declaredMethod + ".\n              @ToJson method signatures may have one of the following structures:\n                  <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n                  <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n                  <any access modifier> R toJson(T value) throws <any>;\n\n            "));
                        }
                        Set f7 = Y9.c.f(declaredMethod);
                        Annotation[] annotationArr2 = parameterAnnotations[0];
                        Intrinsics.checkNotNullExpressionValue(annotationArr2, "parameterAnnotations[0]");
                        Set<Annotation> g11 = Y9.c.g(annotationArr2);
                        Annotation[] annotationArr3 = parameterAnnotations[0];
                        Intrinsics.checkNotNullExpressionValue(annotationArr3, "parameterAnnotations[0]");
                        arrayList = arrayList4;
                        str = "parameterAnnotations[0]";
                        str3 = "\n              Unexpected signature for ";
                        str2 = "\n    ";
                        i11 = i13;
                        c5972d = new C5972d(g11, adapter, declaredMethod, Y9.c.e(annotationArr3), parameterTypes, genericReturnType, f7, parameterTypes[0], parameterTypes.length);
                        b11 = b(arrayList3, c5972d.f(), c5972d.c());
                        if (b11 == null) {
                        }
                    } else {
                        str = "parameterAnnotations[0]";
                        declaredMethod = declaredMethod2;
                        i11 = i13;
                        arrayList = arrayList4;
                        it = it2;
                        methodArr = declaredMethods;
                        i12 = length;
                        str2 = "\n    ";
                        str3 = "\n              Unexpected signature for ";
                        str4 = "parameterTypes";
                        cls = cls2;
                    }
                    if (declaredMethod.isAnnotationPresent(h.class)) {
                        Intrinsics.checkNotNullExpressionValue(declaredMethod, "declaredMethod");
                        declaredMethod.setAccessible(true);
                        Type returnType = declaredMethod.getGenericReturnType();
                        Set f11 = Y9.c.f(declaredMethod);
                        Type[] genericParameterTypes = declaredMethod.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = declaredMethod.getParameterAnnotations();
                        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, str4);
                        if (genericParameterTypes.length != 0 && Intrinsics.d(genericParameterTypes[0], n.class) && !Intrinsics.d(returnType, cls) && d(1, genericParameterTypes)) {
                            Method method = declaredMethod;
                            int length3 = genericParameterTypes.length;
                            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
                            c5969a = new C5969a(1, returnType, length3, f11, adapter, method, true);
                        } else {
                            if (genericParameterTypes.length != 1 || Intrinsics.d(returnType, cls)) {
                                throw new IllegalArgumentException(kotlin.text.h.E0(str3 + declaredMethod + ".\n              @FromJson method signatures may have one of the following structures:\n                  <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n                  <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n                  <any access modifier> R fromJson(T value) throws <any>;\n\n            "));
                            }
                            Annotation[] annotationArr4 = parameterAnnotations2[0];
                            String str5 = str;
                            Intrinsics.checkNotNullExpressionValue(annotationArr4, str5);
                            Set<Annotation> g12 = Y9.c.g(annotationArr4);
                            Annotation[] annotationArr5 = parameterAnnotations2[0];
                            Intrinsics.checkNotNullExpressionValue(annotationArr5, str5);
                            c5969a = new C5970b(returnType, f11, adapter, declaredMethod, Y9.c.e(annotationArr5), genericParameterTypes, g12, genericParameterTypes.length);
                        }
                        arrayList2 = arrayList;
                        a b12 = b(arrayList2, c5969a.f(), c5969a.c());
                        if (b12 != null) {
                            throw new IllegalStateException(("Conflicting @FromJson methods:\n    " + b12.d() + str2 + c5969a.d()).toString());
                        }
                        arrayList2.add(c5969a);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i13 = i11 + 1;
                    arrayList4 = arrayList2;
                    it2 = it;
                    declaredMethods = methodArr;
                }
            }
            ArrayList arrayList5 = arrayList4;
            if (arrayList3.isEmpty() && arrayList5.isEmpty()) {
                throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(adapter.getClass().getName()).toString());
            }
            return new AdapterMethodsFactory(arrayList3, arrayList5);
        }

        private static boolean d(int i11, Type[] typeArr) {
            int length = typeArr.length;
            while (i11 < length) {
                Type type = typeArr[i11];
                if (!(type instanceof ParameterizedType) || !Intrinsics.d(((ParameterizedType) type).getRawType(), JsonAdapter.class)) {
                    return false;
                }
                i11++;
            }
            return true;
        }
    }

    public AdapterMethodsFactory(@NotNull ArrayList toAdapters, @NotNull ArrayList fromAdapters) {
        Intrinsics.checkNotNullParameter(toAdapters, "toAdapters");
        Intrinsics.checkNotNullParameter(fromAdapters, "fromAdapters");
        this.f60347a = toAdapters;
        this.f60348b = fromAdapters;
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull final Type type, @NotNull final Set<? extends Annotation> annotations, @NotNull final Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        final a b11 = b.b(this.f60347a, type, annotations);
        final a b12 = b.b(this.f60348b, type, annotations);
        JsonAdapter jsonAdapter = null;
        if (b11 == null && b12 == null) {
            return null;
        }
        if (b11 == null || b12 == null) {
            try {
                jsonAdapter = moshi.h(this, type, annotations);
            } catch (IllegalArgumentException e11) {
                StringBuilder b13 = C6594f.b("No ", b11 == null ? "@ToJson" : "@FromJson", " adapter for ");
                b13.append(Y9.c.o(type, annotations));
                throw new IllegalArgumentException(b13.toString(), e11);
            }
        }
        final JsonAdapter jsonAdapter2 = jsonAdapter;
        if (b11 != null) {
            b11.a(moshi, this);
        }
        if (b12 != null) {
            b12.a(moshi, this);
        }
        return new JsonAdapter<Object>() { // from class: com.squareup.moshi.AdapterMethodsFactory$create$1
            @Override // com.squareup.moshi.JsonAdapter
            public Object fromJson(@NotNull n reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AdapterMethodsFactory.a aVar = b12;
                if (aVar == null) {
                    return jsonAdapter2.fromJson(reader);
                }
                if (!aVar.e() && reader.p() == n.b.NULL) {
                    reader.m();
                    return null;
                }
                try {
                    return b12.b(moshi, reader);
                } catch (InvocationTargetException e12) {
                    Throwable cause = e12.getCause();
                    if (cause instanceof IOException) {
                        throw cause;
                    }
                    throw new k(cause + " at " + reader.d(), cause);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            /* renamed from: toJson */
            public void mo44toJson(@NotNull x writer, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                AdapterMethodsFactory.a aVar = AdapterMethodsFactory.a.this;
                if (aVar == null) {
                    jsonAdapter2.mo44toJson(writer, (x) value);
                    return;
                }
                if (!aVar.e() && value == null) {
                    writer.x();
                    return;
                }
                try {
                    AdapterMethodsFactory.a.this.i(moshi, writer, value);
                } catch (InvocationTargetException e12) {
                    Throwable cause = e12.getCause();
                    if (cause instanceof IOException) {
                        throw cause;
                    }
                    throw new k(cause + " at " + writer.r(), cause);
                }
            }

            @NotNull
            public String toString() {
                return "JsonAdapter" + annotations + '(' + type + ')';
            }
        };
    }
}
