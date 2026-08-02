package M;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7382a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f7383b = e.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7384c = e.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final long f7385d = e.a(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return d.f7383b;
        }

        public a() {
        }
    }

    public static final float c(long j10) {
        if (j10 == f7385d) {
            throw new IllegalStateException("Offset is unspecified");
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float d(long j10) {
        if (j10 == f7385d) {
            throw new IllegalStateException("Offset is unspecified");
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final long e(long j10, long j11) {
        return e.a(c(j10) - c(j11), d(j10) - d(j11));
    }

    public static final long f(long j10, long j11) {
        return e.a(c(j10) + c(j11), d(j10) + d(j11));
    }

    public static final long g(long j10) {
        return e.a(-c(j10), -d(j10));
    }

    public static long b(long j10) {
        return j10;
    }
}
