package di;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public abstract class L0 {
    public static final int b(bi.f fVar, bi.f[] typeParams) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (fVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable a10 = bi.i.a(fVar);
        Iterator it = a10.iterator();
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i13 = i11 * 31;
            String h10 = ((bi.f) it.next()).h();
            if (h10 != null) {
                i12 = h10.hashCode();
            }
            i11 = i13 + i12;
        }
        Iterator it2 = a10.iterator();
        while (it2.hasNext()) {
            int i14 = i10 * 31;
            bi.m kind = ((bi.f) it2.next()).getKind();
            i10 = i14 + (kind != null ? kind.hashCode() : 0);
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }

    public static final String c(final bi.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return CollectionsKt.joinToString$default(RangesKt.until(0, fVar.d()), ", ", fVar.h() + '(', ")", 0, null, new Function1() { // from class: di.K0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence d10;
                d10 = L0.d(bi.f.this, ((Integer) obj).intValue());
                return d10;
            }
        }, 24, null);
    }

    public static final CharSequence d(bi.f fVar, int i10) {
        return fVar.e(i10) + ": " + fVar.g(i10).h();
    }
}
