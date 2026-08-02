package kotlin.ranges;

import kd.InterfaceC7664c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/e;", "Lkd/c;", "", "", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRange extends e implements InterfaceC7664c<Integer> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final IntRange f71831f = new IntRange(1, 0, 1);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/IntRange$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kd.InterfaceC7664c
    public final Integer e() {
        return Integer.valueOf(getF71843b());
    }

    @Override // kotlin.ranges.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return getF71842a() == intRange.getF71842a() && getF71843b() == intRange.getF71843b();
    }

    @Override // kotlin.ranges.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getF71843b() + (getF71842a() * 31);
    }

    @Override // kotlin.ranges.e, kd.InterfaceC7664c
    public final boolean isEmpty() {
        return getF71842a() > getF71843b();
    }

    public final boolean n(int i11) {
        return getF71842a() <= i11 && i11 <= getF71843b();
    }

    @Override // kd.InterfaceC7664c
    @NotNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Integer getStart() {
        return Integer.valueOf(getF71842a());
    }

    @Override // kotlin.ranges.e
    @NotNull
    public final String toString() {
        return getF71842a() + ".." + getF71843b();
    }
}
