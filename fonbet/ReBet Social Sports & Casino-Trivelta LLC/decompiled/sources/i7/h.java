package i7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f48166a;

    public h(int i10) {
        this.f48166a = i10;
    }

    public final int a(int i10) {
        int i11 = i10 % this.f48166a;
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i11 + this.f48166a;
    }

    public final int b() {
        return this.f48166a;
    }

    public final boolean c(int i10, int i11, int i12) {
        int a10 = a(i12 + i10);
        return i10 < a10 ? i10 <= i11 && i11 <= a10 : (i10 <= i11 && i11 <= this.f48166a) || (i11 >= 0 && i11 <= a10);
    }

    public final List d(int i10, int i11) {
        IntRange until = RangesKt.until(0, i11);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((IntIterator) it).nextInt() + i10)));
        }
        return arrayList;
    }
}
