package ru.ozon.app.android.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.F;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.H;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "", "newValue", "Lkotlin/Function1;", "", "block", "replace", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "isNullOrEmpty", "(Ljava/lang/Iterable;)Z", "other", "deepEquals", "(Ljava/util/List;Ljava/util/List;)Z", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CollectionExtKt {
    public static final boolean deepEquals(@NotNull List<?> list, @NotNull List<?> other) {
        H.a aVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (list.size() != other.size()) {
            return false;
        }
        F w11 = C7714v.w(list);
        CollectionExtKt$deepEquals$1 transform = new CollectionExtKt$deepEquals$1(other);
        Intrinsics.checkNotNullParameter(w11, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator it = new H(w11, transform).iterator();
        do {
            aVar = (H.a) it;
            if (!aVar.hasNext()) {
                return true;
            }
        } while (((Boolean) aVar.next()).booleanValue());
        return false;
    }

    public static final <T> boolean isNullOrEmpty(Iterable<? extends T> iterable) {
        if (iterable != null) {
            Intrinsics.checkNotNullParameter(iterable, "<this>");
            if (!(iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> List<T> replace(@NotNull List<? extends T> list, T t2, @NotNull Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (T t11 : list2) {
            if (block.invoke(t11).booleanValue()) {
                t11 = t2;
            }
            arrayList.add(t11);
        }
        return arrayList;
    }
}
