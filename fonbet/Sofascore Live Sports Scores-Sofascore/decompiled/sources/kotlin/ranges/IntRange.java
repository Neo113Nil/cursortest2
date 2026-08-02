package kotlin.ranges;

import defpackage.w6a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "", "", "e", "w6a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntRange extends a {

    @NotNull
    public static final w6a e = new w6a(null);
    public static final IntRange f = new IntRange(1, 0, 1);

    public final boolean d(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.a == intRange.a && this.b == intRange.b;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
