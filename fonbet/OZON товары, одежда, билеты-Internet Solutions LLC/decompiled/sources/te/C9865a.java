package te;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: te.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9865a {
    public static final void a(@NotNull AbstractCollection abstractCollection, Object obj) {
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    @NotNull
    public static final <T> List<T> b(@NotNull ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return K.f71697a;
        }
        if (size == 1) {
            return C7714v.a0(C7714v.K(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @NotNull
    public static final <K, V> HashMap<K, V> c(int i11) {
        return new HashMap<>(i11 >= 3 ? (i11 / 3) + i11 + 1 : 3);
    }

    @NotNull
    public static final <E> HashSet<E> d(int i11) {
        return new HashSet<>(i11 >= 3 ? (i11 / 3) + i11 + 1 : 3);
    }
}
