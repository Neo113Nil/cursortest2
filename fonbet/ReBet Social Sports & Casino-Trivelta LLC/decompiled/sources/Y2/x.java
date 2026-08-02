package Y2;

import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f13965a = new x();

    public final int[] a(NetworkRequest request) {
        int[] capabilities;
        Intrinsics.checkNotNullParameter(request, "request");
        capabilities = request.getCapabilities();
        Intrinsics.checkNotNullExpressionValue(capabilities, "request.capabilities");
        return capabilities;
    }

    public final int[] b(NetworkRequest request) {
        int[] transportTypes;
        Intrinsics.checkNotNullParameter(request, "request");
        transportTypes = request.getTransportTypes();
        Intrinsics.checkNotNullExpressionValue(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
