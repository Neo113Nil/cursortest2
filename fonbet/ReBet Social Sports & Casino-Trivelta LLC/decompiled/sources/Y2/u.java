package Y2;

import Q2.AbstractC1508t;
import android.net.NetworkRequest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f13964a = new u();

    public static final NetworkRequest a(int[] capabilities, int[] transports) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                AbstractC1508t.e().l(y.f13966b.a(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        iArr = z.defaultCapabilities;
        for (int i11 : iArr) {
            if (!ArraysKt.contains(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    AbstractC1508t.e().l(y.f13966b.a(), "Ignoring removing default capability '" + i11 + '\'', e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "networkRequest.build()");
        return build;
    }

    public final y b(int[] capabilities, int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        return new y(a(capabilities, transports));
    }

    public final boolean c(NetworkRequest request, int i10) {
        boolean hasCapability;
        Intrinsics.checkNotNullParameter(request, "request");
        hasCapability = request.hasCapability(i10);
        return hasCapability;
    }

    public final boolean d(NetworkRequest request, int i10) {
        boolean hasTransport;
        Intrinsics.checkNotNullParameter(request, "request");
        hasTransport = request.hasTransport(i10);
        return hasTransport;
    }
}
