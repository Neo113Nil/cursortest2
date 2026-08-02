package com.squareup.moshi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u001f B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/squareup/moshi/ClassJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/g;", "classFactory", "", "", "Lcom/squareup/moshi/ClassJsonAdapter$b;", "fieldsMap", "<init>", "(Lcom/squareup/moshi/g;Ljava/util/Map;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/g;", "", "fieldsArray", "[Lcom/squareup/moshi/ClassJsonAdapter$b;", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Factory", "a", "b", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ClassJsonAdapter<T> extends JsonAdapter<T> {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final g<T> classFactory;

    @NotNull
    private final b<?>[] fieldsArray;

    @NotNull
    private final n.a options;

    /* renamed from: com.squareup.moshi.ClassJsonAdapter$a, reason: from kotlin metadata */
    public static final class Companion implements JsonAdapter.a {
        private static void a(Type type, Class cls) {
            if (cls.isAssignableFrom(F.a(type))) {
                StringBuilder sb2 = new StringBuilder("No JsonAdapter for ");
                sb2.append(type);
                sb2.append(", you should probably use ");
                sb2.append(cls.getSimpleName());
                sb2.append(" instead of ");
                Intrinsics.checkNotNullParameter(type, "<this>");
                sb2.append(D.c(type).getSimpleName());
                sb2.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            i iVar;
            Type type2 = type;
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                return null;
            }
            Class<?> a11 = F.a(type2);
            if (a11.isInterface() || a11.isEnum() || !annotations.isEmpty()) {
                return null;
            }
            if (Y9.c.i(a11)) {
                a(type2, List.class);
                a(type2, Set.class);
                a(type2, Map.class);
                a(type2, Collection.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Platform " + a11);
                if (type2 instanceof ParameterizedType) {
                    sb2.append(" in " + type2);
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalArgumentException(U7.d.e(sb3, " requires explicit JsonAdapter to be registered"));
            }
            if (a11.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(a11.getName()).toString());
            }
            if (a11.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class ".concat(a11.getName()).toString());
            }
            if (a11.getEnclosingClass() != null && !Modifier.isStatic(a11.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(a11.getName()).toString());
            }
            if (Modifier.isAbstract(a11.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class ".concat(a11.getName()).toString());
            }
            if (Y9.c.h(a11)) {
                throw new IllegalArgumentException(("Cannot serialize Kotlin type " + a11.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.").toString());
            }
            g a12 = g.a.a(a11);
            TreeMap q11 = U.q(new Pair[0]);
            while (!Intrinsics.d(type2, Object.class)) {
                Class<?> a13 = F.a(type2);
                boolean i11 = Y9.c.i(a13);
                Field[] declaredFields = a13.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "rawType.declaredFields");
                for (Field field : declaredFields) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !i11) && ((iVar = (i) field.getAnnotation(i.class)) == null || !iVar.ignore()))) {
                        Type genericType = field.getGenericType();
                        Intrinsics.checkNotNullExpressionValue(genericType, "field.genericType");
                        Type l11 = Y9.c.l(genericType, a13, type2);
                        Intrinsics.checkNotNullExpressionValue(field, "field");
                        Set<? extends Annotation> f7 = Y9.c.f(field);
                        String declaredName = field.getName();
                        JsonAdapter<T> f11 = moshi.f(l11, f7, declaredName);
                        field.setAccessible(true);
                        Intrinsics.checkNotNullExpressionValue(declaredName, "fieldName");
                        Intrinsics.checkNotNullParameter(declaredName, "declaredName");
                        if (iVar != null) {
                            String name = iVar.name();
                            if (!"\u0000".equals(name)) {
                                declaredName = name;
                            }
                        }
                        b bVar = new b(declaredName, field, f11);
                        b bVar2 = (b) q11.put(declaredName, bVar);
                        if (bVar2 != null) {
                            throw new IllegalStateException(("Conflicting fields:\n    " + bVar2.a() + "\n    " + bVar.a()).toString());
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(type2, "type");
                Class<?> c11 = D.c(type2);
                Type genericSuperclass = c11.getGenericSuperclass();
                Intrinsics.checkNotNullExpressionValue(genericSuperclass, "rawType.genericSuperclass");
                type2 = Y9.c.l(genericSuperclass, c11, type2);
            }
            return new ClassJsonAdapter(a12, q11).nullSafe();
        }
    }

    /* loaded from: classes9.dex */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f60359a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Field f60360b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final JsonAdapter<T> f60361c;

        public b(@NotNull String name, @NotNull Field field, @NotNull JsonAdapter<T> adapter) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f60359a = name;
            this.f60360b = field;
            this.f60361c = adapter;
        }

        @NotNull
        public final Field a() {
            return this.f60360b;
        }

        @NotNull
        public final String b() {
            return this.f60359a;
        }

        public final void c(@NotNull n reader, Object obj) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f60360b.set(obj, this.f60361c.fromJson(reader));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(@NotNull x writer, Object obj) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            this.f60361c.mo44toJson(writer, (x) this.f60360b.get(obj));
        }
    }

    public ClassJsonAdapter(@NotNull g<T> classFactory, @NotNull Map<String, ? extends b<?>> fieldsMap) {
        Intrinsics.checkNotNullParameter(classFactory, "classFactory");
        Intrinsics.checkNotNullParameter(fieldsMap, "fieldsMap");
        this.classFactory = classFactory;
        Object[] array = fieldsMap.values().toArray(new b[0]);
        Intrinsics.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.fieldsArray = (b[]) array;
        Object[] array2 = fieldsMap.keySet().toArray(new String[0]);
        Intrinsics.g(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array2;
        this.options = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        try {
            T a11 = this.classFactory.a();
            try {
                reader.beginObject();
                while (reader.hasNext()) {
                    int v11 = reader.v(this.options);
                    if (v11 == -1) {
                        reader.y();
                        reader.skipValue();
                    } else {
                        this.fieldsArray[v11].c(reader, a11);
                    }
                }
                reader.endObject();
                return a11;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            Y9.c.n(e12);
            throw null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        try {
            writer.j();
            for (b<?> bVar : this.fieldsArray) {
                writer.w(bVar.b());
                bVar.d(writer, value);
            }
            writer.p();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    @NotNull
    public String toString() {
        return "JsonAdapter(" + this.classFactory + ')';
    }
}
