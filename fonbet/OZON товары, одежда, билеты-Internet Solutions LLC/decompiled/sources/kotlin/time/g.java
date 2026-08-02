package kotlin.time;

import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/g;", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f71988a = new g();

    @InterfaceC6346b
    public static final class a implements kotlin.time.a {

        /* renamed from: a, reason: collision with root package name */
        private final long f71989a;

        private /* synthetic */ a(long j11) {
            this.f71989a = j11;
        }

        public static final /* synthetic */ a a(long j11) {
            return new a(j11);
        }

        public final long b(@NotNull kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z11 = other instanceof a;
            long j11 = this.f71989a;
            if (z11) {
                long j12 = ((a) other).f71989a;
                f.f71986a.getClass();
                return e.d(j11, j12, EnumC10311b.NANOSECONDS);
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j11 + ')')) + " and " + other);
        }

        public final /* synthetic */ long c() {
            return this.f71989a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(kotlin.time.a aVar) {
            return a.C1192a.a(this, aVar);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f71989a == ((a) obj).f71989a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f71989a);
        }

        public final String toString() {
            return "ValueTimeMark(reading=" + this.f71989a + ')';
        }
    }

    @NotNull
    public final String toString() {
        f.f71986a.getClass();
        return "TimeSource(System.nanoTime())";
    }
}
