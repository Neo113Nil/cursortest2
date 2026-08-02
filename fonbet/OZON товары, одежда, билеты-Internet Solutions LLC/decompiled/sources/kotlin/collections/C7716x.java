package kotlin.collections;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7716x extends C7715w {
    public static int a(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int i11 = 0;
        d(arrayList.size(), 0, size);
        int i12 = size - 1;
        while (i11 <= i12) {
            int i13 = (i11 + i12) >>> 1;
            int b11 = Vc.a.b((Comparable) arrayList.get(i13), comparable);
            if (b11 < 0) {
                i11 = i13 + 1;
            } else {
                if (b11 <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static int b(ArrayList arrayList, Function1 comparison) {
        int size = arrayList.size();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        int i11 = 0;
        d(arrayList.size(), 0, size);
        int i12 = size - 1;
        while (i11 <= i12) {
            int i13 = (i11 + i12) >>> 1;
            int intValue = ((Number) comparison.invoke(arrayList.get(i13))).intValue();
            if (intValue < 0) {
                i11 = i13 + 1;
            } else {
                if (intValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> c(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C7714v.a0(list.get(0)) : K.f71697a;
    }

    private static final void d(int i11, int i12, int i13) {
        if (i12 > i13) {
            throw new IllegalArgumentException(Cm.e.c("fromIndex (", i12, ") is greater than toIndex (", ").", i13));
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(T7.E.a(i12, "fromIndex (", ") is less than zero."));
        }
        if (i13 > i11) {
            throw new IndexOutOfBoundsException(Cm.e.c("toIndex (", i13, ") is greater than size (", ").", i11));
        }
    }
}
