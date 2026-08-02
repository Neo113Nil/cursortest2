package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class C extends B {
    @NotNull
    public static final <T> Collection<T> e(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : C7714v.U0(iterable);
    }

    private static final <T> boolean f(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z11) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    public static <T> boolean g(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return f(iterable, predicate, true);
    }

    public static <T> boolean h(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> predicate) {
        int i11;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return f(kotlin.jvm.internal.U.b(list), predicate, true);
        }
        int P11 = C7714v.P(list);
        if (P11 >= 0) {
            int i12 = 0;
            i11 = 0;
            while (true) {
                T t2 = list.get(i12);
                if (!predicate.invoke(t2).booleanValue()) {
                    if (i11 != i12) {
                        list.set(i11, t2);
                    }
                    i11++;
                }
                if (i12 == P11) {
                    break;
                }
                i12++;
            }
        } else {
            i11 = 0;
        }
        if (i11 >= list.size()) {
            return false;
        }
        int P12 = C7714v.P(list);
        if (i11 <= P12) {
            while (true) {
                list.remove(P12);
                if (P12 == i11) {
                    break;
                }
                P12--;
            }
        }
        return true;
    }

    public static <T> boolean i(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return f(iterable, predicate, false);
    }
}
