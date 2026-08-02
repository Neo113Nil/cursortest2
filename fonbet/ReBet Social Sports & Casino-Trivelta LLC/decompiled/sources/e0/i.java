package e0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45454a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f45455b = a(0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final int b(long j10) {
        return (int) (j10 & BodyPartID.bodyIdMax);
    }

    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    public static long a(long j10) {
        return j10;
    }
}
