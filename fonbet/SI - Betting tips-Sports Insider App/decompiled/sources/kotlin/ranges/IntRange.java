package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "", "", "e", "zf/c", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntRange extends a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final c f19231e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    public static final IntRange f19232f = new IntRange(1, 0, 1);

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.f19234a == intRange.f19234a && this.f19235b == intRange.f19235b;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f19234a * 31) + this.f19235b;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.f19234a > this.f19235b;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f19234a + ".." + this.f19235b;
    }
}
