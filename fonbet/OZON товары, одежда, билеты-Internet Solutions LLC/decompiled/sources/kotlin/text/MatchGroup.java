package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f71945a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IntRange f71946b;

    public MatchGroup(@NotNull String value, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f71945a = value;
        this.f71946b = range;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final String getF71945a() {
        return this.f71945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.d(this.f71945a, matchGroup.f71945a) && Intrinsics.d(this.f71946b, matchGroup.f71946b);
    }

    public final int hashCode() {
        return this.f71946b.hashCode() + (this.f71945a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MatchGroup(value=" + this.f71945a + ", range=" + this.f71946b + ')';
    }
}
