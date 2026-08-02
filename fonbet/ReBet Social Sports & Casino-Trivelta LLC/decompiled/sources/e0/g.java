package e0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45452a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f45453b = h.a(0, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return g.f45453b;
        }

        public a() {
        }
    }

    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int d(long j10) {
        return (int) (j10 & BodyPartID.bodyIdMax);
    }

    public static long b(long j10) {
        return j10;
    }
}
