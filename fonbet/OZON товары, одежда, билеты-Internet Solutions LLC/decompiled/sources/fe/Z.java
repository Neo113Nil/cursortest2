package fe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9816G;
import td.C9858x;
import td.n0;

/* loaded from: classes10.dex */
public final class Z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    public static final <T extends ne.h> n0<T> a(@NotNull Nd.b bVar, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull Function1<? super Nd.p, ? extends T> typeDeserializer, @NotNull Function1<? super Sd.f, ? extends T> typeOfPublicProperty) {
        T invoke;
        ?? E02;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (bVar.z0() <= 0) {
            Nd.p pVar = null;
            if (!bVar.R0()) {
                return null;
            }
            Sd.f b11 = L.b(nameResolver, bVar.w0());
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            if (bVar.S0()) {
                pVar = bVar.x0();
            } else if (bVar.T0()) {
                pVar = typeTable.a(bVar.y0());
            }
            if ((pVar != null && (invoke = typeDeserializer.invoke(pVar)) != null) || (invoke = typeOfPublicProperty.invoke(b11)) != null) {
                return new C9858x(b11, invoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + L.b(nameResolver, bVar.u0()) + " with property " + b11).toString());
        }
        List<Integer> A02 = bVar.A0();
        Intrinsics.checkNotNullExpressionValue(A02, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = A02;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Integer num : list) {
            Intrinsics.f(num);
            arrayList.add(L.b(nameResolver, num.intValue()));
        }
        Pair pair = new Pair(Integer.valueOf(bVar.C0()), Integer.valueOf(bVar.B0()));
        if (pair.equals(new Pair(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> D02 = bVar.D0();
            Intrinsics.checkNotNullExpressionValue(D02, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = D02;
            E02 = new ArrayList(C7714v.z(list2, 10));
            for (Integer num2 : list2) {
                Intrinsics.f(num2);
                E02.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!pair.equals(new Pair(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + L.b(nameResolver, bVar.u0()) + " has illegal multi-field value class representation").toString());
            }
            E02 = bVar.E0();
        }
        Intrinsics.f(E02);
        Iterable iterable = (Iterable) E02;
        ArrayList arrayList2 = new ArrayList(C7714v.z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new C9816G(C7714v.b1(arrayList, arrayList2));
    }
}
