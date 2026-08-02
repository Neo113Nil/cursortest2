package kotlin.collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
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
public class I extends E {
    @NotNull
    public static final void l(@NotNull Iterable iterable, @NotNull Appendable buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            kotlin.text.h.p(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    @NotNull
    public static final void m(@NotNull Iterable iterable, @NotNull AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    @NotNull
    public static final <T> List<T> n(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C7714v.W0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m(iterable, arrayList);
        return arrayList;
    }

    @NotNull
    public static final ArrayList o(@NotNull Iterable iterable, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        i0.a(i11, i12);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b11 = i0.b(iterable.iterator(), i11, i12, z11, false);
            while (b11.hasNext()) {
                arrayList.add((List) b11.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i12) + (size % i12 == 0 ? 0 : 1));
        int i13 = 0;
        while (i13 >= 0 && i13 < size) {
            int i14 = size - i13;
            if (i11 <= i14) {
                i14 = i11;
            }
            if (i14 < i11 && !z11) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList3.add(list.get(i15 + i13));
            }
            arrayList2.add(arrayList3);
            i13 += i12;
        }
        return arrayList2;
    }
}
