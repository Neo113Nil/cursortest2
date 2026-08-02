package h7;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: h7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4487c {

    /* renamed from: a, reason: collision with root package name */
    public final int f47826a;

    public C4487c(int i10) {
        this.f47826a = i10;
    }

    public final Map a(int i10, int i11, int i12) {
        float coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i12, 1), this.f47826a) * b(i10), 0.0f);
        float f10 = i11;
        float coerceAtMost = f10 / RangesKt.coerceAtMost(coerceAtLeast, f10);
        int i13 = 0;
        IntRange until = RangesKt.until(0, i11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(until, 10)), 16));
        for (Integer num : until) {
            int intValue = num.intValue();
            if (((int) (intValue % coerceAtMost)) == 0) {
                i13 = intValue;
            }
            linkedHashMap.put(num, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    public final float b(int i10) {
        return i10 / 1000.0f;
    }
}
