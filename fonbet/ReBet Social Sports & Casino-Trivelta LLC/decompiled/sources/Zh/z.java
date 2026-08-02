package Zh;

import ai.AbstractC2028a;
import di.C4084d0;
import di.C4087f;
import di.C4088f0;
import di.D0;
import di.E0;
import di.P;
import di.R0;
import di.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class z {
    public static final InterfaceC1901b b(KClass kClass, List list, Function0 function0) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new C4087f((InterfaceC1901b) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new S((InterfaceC1901b) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new C4088f0((InterfaceC1901b) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new P((InterfaceC1901b) list.get(0), (InterfaceC1901b) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new C4084d0((InterfaceC1901b) list.get(0), (InterfaceC1901b) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return AbstractC2028a.j((InterfaceC1901b) list.get(0), (InterfaceC1901b) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return AbstractC2028a.m((InterfaceC1901b) list.get(0), (InterfaceC1901b) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return AbstractC2028a.o((InterfaceC1901b) list.get(0), (InterfaceC1901b) list.get(1), (InterfaceC1901b) list.get(2));
        }
        if (!D0.o(kClass)) {
            return null;
        }
        Object invoke = function0.invoke();
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return AbstractC2028a.a((KClass) invoke, (InterfaceC1901b) list.get(0));
    }

    public static final InterfaceC1901b c(KClass kClass, List list) {
        InterfaceC1901b[] interfaceC1901bArr = (InterfaceC1901b[]) list.toArray(new InterfaceC1901b[0]);
        return D0.d(kClass, (InterfaceC1901b[]) Arrays.copyOf(interfaceC1901bArr, interfaceC1901bArr.length));
    }

    public static final InterfaceC1901b d(InterfaceC1901b interfaceC1901b, boolean z10) {
        if (z10) {
            return AbstractC2028a.t(interfaceC1901b);
        }
        Intrinsics.checkNotNull(interfaceC1901b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return interfaceC1901b;
    }

    public static final InterfaceC1901b e(KClass kClass, List serializers, Function0 elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        InterfaceC1901b b10 = b(kClass, serializers, elementClassifierIfArray);
        return b10 == null ? c(kClass, serializers) : b10;
    }

    public static final InterfaceC1901b f(gi.e eVar, KType type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC1901b g10 = g(eVar, type, true);
        if (g10 != null) {
            return g10;
        }
        D0.p(E0.c(type));
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC1901b g(gi.e eVar, KType kType, boolean z10) {
        InterfaceC1901b interfaceC1901b;
        InterfaceC1901b interfaceC1901b2;
        g gVar;
        KClass c10 = E0.c(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(E0.g((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!D0.l(c10) || gi.e.c(eVar, c10, null, 2, null) == null) {
                interfaceC1901b = w.m(c10, isMarkedNullable);
            }
            interfaceC1901b = null;
        } else {
            if (!eVar.d()) {
                Object n10 = w.n(c10, arrayList, isMarkedNullable);
                if (Result.m153isFailureimpl(n10)) {
                    n10 = null;
                }
                interfaceC1901b = (InterfaceC1901b) n10;
            }
            interfaceC1901b = null;
        }
        if (interfaceC1901b != null) {
            return interfaceC1901b;
        }
        if (arrayList.isEmpty()) {
            interfaceC1901b2 = x.d(c10);
            if (interfaceC1901b2 == null && (interfaceC1901b2 = gi.e.c(eVar, c10, null, 2, null)) == null) {
                if (D0.l(c10)) {
                    gVar = new g(c10);
                    interfaceC1901b2 = gVar;
                }
                interfaceC1901b2 = null;
            }
            if (interfaceC1901b2 == null) {
                return d(interfaceC1901b2, isMarkedNullable);
            }
            return null;
        }
        List e10 = x.e(eVar, arrayList, z10);
        if (e10 == null) {
            return null;
        }
        InterfaceC1901b a10 = x.a(c10, e10, new Function0() { // from class: Zh.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KClassifier h10;
                h10 = z.h(arrayList);
                return h10;
            }
        });
        if (a10 == null) {
            interfaceC1901b2 = eVar.b(c10, e10);
            if (interfaceC1901b2 == null) {
                if (D0.l(c10)) {
                    gVar = new g(c10);
                    interfaceC1901b2 = gVar;
                }
                interfaceC1901b2 = null;
            }
        } else {
            interfaceC1901b2 = a10;
        }
        if (interfaceC1901b2 == null) {
        }
    }

    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final InterfaceC1901b i(gi.e eVar, KType type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return g(eVar, type, false);
    }

    public static final InterfaceC1901b j(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        InterfaceC1901b b10 = D0.b(kClass);
        return b10 == null ? R0.b(kClass) : b10;
    }

    public static final List k(gi.e eVar, List typeArguments, boolean z10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x.b(eVar, (KType) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC1901b c10 = x.c(eVar, (KType) it2.next());
            if (c10 == null) {
                return null;
            }
            arrayList2.add(c10);
        }
        return arrayList2;
    }
}
