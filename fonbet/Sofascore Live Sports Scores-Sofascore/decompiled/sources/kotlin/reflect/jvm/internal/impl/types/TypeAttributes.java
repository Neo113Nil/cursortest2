package kotlin.reflect.jvm.internal.impl.types;

import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeAttributes Empty = new TypeAttributes(km5.a);

    private TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            registerComponent((KClass) typeAttribute.getKey(), (KClass<? extends Object>) typeAttribute);
        }
    }

    @NotNull
    public final TypeAttributes add(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(intValue);
            TypeAttribute<?> typeAttribute2 = typeAttributes.getArrayMap().get(intValue);
            CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null : typeAttribute.add(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        return getArrayMap().get(Companion.getId(typeAttribute.getKey())) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> getTypeRegistry() {
        return Companion;
    }

    @NotNull
    public final TypeAttributes intersect(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(intValue);
            TypeAttribute<?> typeAttribute2 = typeAttributes.getArrayMap().get(intValue);
            CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null : typeAttribute.intersect(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    @NotNull
    public final TypeAttributes plus(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (contains(typeAttribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(typeAttribute);
        }
        return Companion.create(kotlin.collections.CollectionsKt.x0(kotlin.collections.CollectionsKt.S0(this), typeAttribute));
    }

    @NotNull
    public final TypeAttributes remove(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (!isEmpty()) {
            ArrayMap<TypeAttribute<?>> arrayMap = getArrayMap();
            ArrayList arrayList = new ArrayList();
            for (TypeAttribute<?> typeAttribute2 : arrayMap) {
                if (!Intrinsics.c(typeAttribute2, typeAttribute)) {
                    arrayList.add(typeAttribute2);
                }
            }
            if (arrayList.size() != getArrayMap().getSize()) {
                return Companion.create(arrayList);
            }
        }
        return this;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeAttributes create(@NotNull List<? extends TypeAttribute<?>> list) {
            list.getClass();
            return list.isEmpty() ? getEmpty() : new TypeAttributes(list, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1) {
            int intValue;
            concurrentHashMap.getClass();
            str.getClass();
            function1.getClass();
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 == null) {
                        Object invoke = function1.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) invoke).intValue()));
                        num2 = (Integer) invoke;
                    }
                    num2.getClass();
                    intValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return intValue;
        }

        @NotNull
        public final TypeAttributes getEmpty() {
            return TypeAttributes.Empty;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    private TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) a.c(typeAttribute));
    }
}
