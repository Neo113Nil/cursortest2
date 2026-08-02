package Gj;

import Dj.a;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(Dj.a o12, Dj.a o22) {
        Intrinsics.checkNotNullParameter(o12, "o1");
        Intrinsics.checkNotNullParameter(o22, "o2");
        if (Intrinsics.areEqual(o12, o22)) {
            return 0;
        }
        if (o12 instanceof a.C0059a) {
            return -1;
        }
        return ((o12 instanceof a.c) && (o22 instanceof a.b)) ? -1 : 1;
    }
}
