package kotlin.ranges;

import kd.InterfaceC7664c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/g;", "Lkotlin/ranges/f;", "Lkd/c;", "", "", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends f implements InterfaceC7664c<Long> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final g f71850f = new g(1, 0);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/g$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public g(long j11, long j12) {
        super(j11, j12, 1L);
    }

    @Override // kd.InterfaceC7664c
    public final Long e() {
        return Long.valueOf(getF71847b());
    }

    @Override // kotlin.ranges.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return getF71846a() == gVar.getF71846a() && getF71847b() == gVar.getF71847b();
    }

    @Override // kd.InterfaceC7664c
    public final Long getStart() {
        return Long.valueOf(getF71846a());
    }

    @Override // kotlin.ranges.f
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getF71846a() ^ (getF71846a() >>> 32))) + (getF71847b() ^ (getF71847b() >>> 32)));
    }

    @Override // kotlin.ranges.f, kd.InterfaceC7664c
    public final boolean isEmpty() {
        return getF71846a() > getF71847b();
    }

    @Override // kotlin.ranges.f
    @NotNull
    public final String toString() {
        return getF71846a() + ".." + getF71847b();
    }
}
