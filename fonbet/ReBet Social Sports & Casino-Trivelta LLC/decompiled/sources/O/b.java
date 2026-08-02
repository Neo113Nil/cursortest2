package O;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8149a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f8150b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f8151c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f8152d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f8153e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f8152d;
        }

        public final long b() {
            return b.f8150b;
        }

        public final long c() {
            return b.f8151c;
        }

        public a() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f8150b = d((0 & BodyPartID.bodyIdMax) | j11);
        f8151c = d((1 & BodyPartID.bodyIdMax) | j11);
        f8152d = d(j11 | (2 & BodyPartID.bodyIdMax));
        f8153e = d((j10 & BodyPartID.bodyIdMax) | (4 << 32));
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f8150b) ? "Rgb" : e(j10, f8151c) ? "Xyz" : e(j10, f8152d) ? "Lab" : e(j10, f8153e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j10) {
        return j10;
    }
}
