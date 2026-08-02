package zf;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class e implements Iterable, KMappedMarker {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final d f25974d = new d(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f25975a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25976b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25977c;

    public e(long j, long j6, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f25975a = j;
        if (j10 > 0) {
            if (j < j6) {
                long j11 = j6 % j10;
                long j12 = j % j10;
                long j13 = ((j11 < 0 ? j11 + j10 : j11) - (j12 < 0 ? j12 + j10 : j12)) % j10;
                j6 -= j13 < 0 ? j13 + j10 : j13;
            }
        } else {
            if (j10 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j6) {
                long j14 = -j10;
                long j15 = j % j14;
                long j16 = j6 % j14;
                long j17 = ((j15 < 0 ? j15 + j14 : j15) - (j16 < 0 ? j16 + j14 : j16)) % j14;
                j6 += j17 < 0 ? j17 + j14 : j17;
            }
        }
        this.f25976b = j6;
        this.f25977c = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f25975a == eVar.f25975a && this.f25976b == eVar.f25976b && this.f25977c == eVar.f25977c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j6 = this.f25975a;
        long j10 = this.f25976b;
        long j11 = (((j6 ^ (j6 >>> 32)) * j) + (j10 ^ (j10 >>> 32))) * j;
        long j12 = this.f25977c;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f25977c;
        long j6 = this.f25976b;
        long j10 = this.f25975a;
        return j > 0 ? j10 > j6 : j10 < j6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f25975a, this.f25976b, this.f25977c);
    }

    public String toString() {
        StringBuilder sb2;
        long j = this.f25977c;
        long j6 = this.f25976b;
        long j10 = this.f25975a;
        if (j > 0) {
            sb2 = new StringBuilder();
            sb2.append(j10);
            sb2.append("..");
            sb2.append(j6);
            sb2.append(" step ");
            sb2.append(j);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j10);
            sb2.append(" downTo ");
            sb2.append(j6);
            sb2.append(" step ");
            sb2.append(-j);
        }
        return sb2.toString();
    }
}
