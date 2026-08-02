package kotlin.ranges;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kd.C7666e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/f;", "", "", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class f implements Iterable<Long>, InterfaceC6712a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f71846a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71847b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71848c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/f$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public static f a(long j11, long j12, long j13) {
            return new f(j11, j12, j13);
        }
    }

    public f(long j11, long j12, long j13) {
        if (j13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j13 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f71846a = j11;
        if (j13 > 0) {
            if (j11 < j12) {
                long j14 = j12 % j13;
                long j15 = j11 % j13;
                long j16 = ((j14 < 0 ? j14 + j13 : j14) - (j15 < 0 ? j15 + j13 : j15)) % j13;
                j12 -= j16 < 0 ? j16 + j13 : j16;
            }
        } else {
            if (j13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j11 > j12) {
                long j17 = -j13;
                long j18 = j11 % j17;
                long j19 = j12 % j17;
                long j21 = ((j18 < 0 ? j18 + j17 : j18) - (j19 < 0 ? j19 + j17 : j19)) % j17;
                j12 += j21 < 0 ? j21 + j17 : j21;
            }
        }
        this.f71847b = j12;
        this.f71848c = j13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (isEmpty() && ((f) obj).isEmpty()) {
            return true;
        }
        f fVar = (f) obj;
        return this.f71846a == fVar.f71846a && this.f71847b == fVar.f71847b && this.f71848c == fVar.f71848c;
    }

    /* renamed from: h, reason: from getter */
    public final long getF71846a() {
        return this.f71846a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j11 = 31;
        long j12 = this.f71846a;
        long j13 = this.f71847b;
        long j14 = (((j12 ^ (j12 >>> 32)) * j11) + (j13 ^ (j13 >>> 32))) * j11;
        long j15 = this.f71848c;
        return (int) (j14 + (j15 ^ (j15 >>> 32)));
    }

    /* renamed from: i, reason: from getter */
    public final long getF71847b() {
        return this.f71847b;
    }

    public boolean isEmpty() {
        long j11 = this.f71848c;
        long j12 = this.f71847b;
        long j13 = this.f71846a;
        return j11 > 0 ? j13 > j12 : j13 < j12;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new C7666e(this.f71846a, this.f71847b, this.f71848c);
    }

    /* renamed from: k, reason: from getter */
    public final long getF71848c() {
        return this.f71848c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j11 = this.f71848c;
        long j12 = this.f71847b;
        long j13 = this.f71846a;
        if (j11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j13);
            sb2.append("..");
            sb2.append(j12);
            sb2.append(" step ");
            sb2.append(j11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j13);
            sb2.append(" downTo ");
            sb2.append(j12);
            sb2.append(" step ");
            sb2.append(-j11);
        }
        return sb2.toString();
    }
}
