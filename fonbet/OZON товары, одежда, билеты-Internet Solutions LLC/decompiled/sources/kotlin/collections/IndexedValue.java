package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f71694a;

    /* renamed from: b, reason: collision with root package name */
    private final T f71695b;

    public IndexedValue(int i11, T t2) {
        this.f71694a = i11;
        this.f71695b = t2;
    }

    /* renamed from: a, reason: from getter */
    public final int getF71694a() {
        return this.f71694a;
    }

    public final T b() {
        return this.f71695b;
    }

    public final int c() {
        return this.f71694a;
    }

    public final T d() {
        return this.f71695b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f71694a == indexedValue.f71694a && Intrinsics.d(this.f71695b, indexedValue.f71695b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f71694a) * 31;
        T t2 = this.f71695b;
        return hashCode + (t2 == null ? 0 : t2.hashCode());
    }

    @NotNull
    public final String toString() {
        return "IndexedValue(index=" + this.f71694a + ", value=" + this.f71695b + ')';
    }
}
