package ru.ozon.android.networkinfo.models;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.NetworkInfo;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toConnectionType", "Lru/ozon/android/networkinfo/models/ConnectionType;", "Lru/ozon/android/networkinfo/models/NetworkInfo;", "network-info_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkInfoKt {
    @NotNull
    public static final ConnectionType toConnectionType(@NotNull NetworkInfo networkInfo) {
        Intrinsics.checkNotNullParameter(networkInfo, "<this>");
        if (networkInfo instanceof NetworkInfo.Available) {
            NetworkInfo.Available available = (NetworkInfo.Available) networkInfo;
            return available.isValidated() ? ConnectionType.INSTANCE.from(available.getNetworkConnectionType().name()) : ConnectionType.NO_INTERNET;
        }
        if (Intrinsics.d(networkInfo, NetworkInfo.NotAvailable.INSTANCE)) {
            return ConnectionType.NO_INTERNET;
        }
        if (Intrinsics.d(networkInfo, NetworkInfo.Unknown.INSTANCE)) {
            return ConnectionType.CONNECTION_TYPE_UNKNOWN;
        }
        throw new o();
    }
}
