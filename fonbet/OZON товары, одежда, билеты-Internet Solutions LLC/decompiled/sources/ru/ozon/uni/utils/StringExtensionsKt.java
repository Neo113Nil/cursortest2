package ru.ozon.uni.utils;

import K1.AbstractC3429i;
import K1.C3422b;
import K1.D;
import K1.L;
import S0.InterfaceC3967k;
import Vc.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LK1/b;", "Ll1/Q;", "brush", "applyGradient", "(LK1/b;Ll1/Q;LS0/k;I)LK1/b;", "", "LK1/b$b;", "LK1/D;", "ranges", "mergeOverlapping", "(Ljava/util/List;)Ljava/util/List;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final C3422b applyGradient(@NotNull C3422b c3422b, @NotNull AbstractC7799Q brush, InterfaceC3967k interfaceC3967k, int i11) {
        int h11;
        D d11;
        Intrinsics.checkNotNullParameter(c3422b, "<this>");
        Intrinsics.checkNotNullParameter(brush, "brush");
        interfaceC3967k.o(560737673);
        List<C3422b.C0288b<D>> e11 = c3422b.e();
        List<C3422b.C0288b> b11 = c3422b.b(c3422b.h().length());
        ArrayList arrayList = new ArrayList();
        for (C3422b.C0288b c0288b : b11) {
            L b12 = ((AbstractC3429i) c0288b.f()).b();
            C3422b.C0288b c0288b2 = (b12 == null || (d11 = b12.d()) == null) ? null : new C3422b.C0288b(c0288b.g(), c0288b.e(), d11);
            if (c0288b2 != null) {
                arrayList.add(c0288b2);
            }
        }
        List<C3422b.C0288b<D>> mergeOverlapping = mergeOverlapping(C7714v.I0(new Comparator() { // from class: ru.ozon.uni.utils.StringExtensionsKt$applyGradient$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Integer.valueOf(((C3422b.C0288b) t2).g()), Integer.valueOf(((C3422b.C0288b) t11).g()));
            }
        }, C7714v.p0(arrayList, e11)));
        C3422b.a aVar = new C3422b.a();
        if (mergeOverlapping.isEmpty()) {
            h11 = aVar.h(new D(brush));
            try {
                aVar.d(c3422b);
                Unit unit = Unit.f71690a;
            } finally {
            }
        } else {
            Iterator<T> it = mergeOverlapping.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                C3422b.C0288b c0288b3 = (C3422b.C0288b) it.next();
                if (c0288b3.g() > i12) {
                    h11 = aVar.h(new D(brush));
                    try {
                        aVar.d(c3422b.subSequence(i12, c0288b3.g()));
                        Unit unit2 = Unit.f71690a;
                        aVar.f(h11);
                    } finally {
                    }
                }
                h11 = aVar.h((D) c0288b3.f());
                try {
                    aVar.d(c3422b.subSequence(c0288b3.g(), c0288b3.e()));
                    Unit unit3 = Unit.f71690a;
                    aVar.f(h11);
                    i12 = c0288b3.e();
                } finally {
                }
            }
            if (i12 < c3422b.length()) {
                h11 = aVar.h(new D(brush));
                try {
                    aVar.d(c3422b.subSequence(i12, c3422b.length()));
                    Unit unit4 = Unit.f71690a;
                    aVar.f(h11);
                } finally {
                }
            }
        }
        C3422b i13 = aVar.i();
        interfaceC3967k.k();
        return i13;
    }

    private static final List<C3422b.C0288b<D>> mergeOverlapping(List<C3422b.C0288b<D>> list) {
        if (list.isEmpty()) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        C3422b.C0288b c0288b = (C3422b.C0288b) C7714v.K(list);
        for (C3422b.C0288b c0288b2 : C7714v.D(list, 1)) {
            if (c0288b2.g() <= c0288b.e()) {
                c0288b = C3422b.C0288b.d(c0288b, Math.max(c0288b.e(), c0288b2.e()));
            } else {
                arrayList.add(c0288b);
                c0288b = c0288b2;
            }
        }
        arrayList.add(c0288b);
        return arrayList;
    }
}
