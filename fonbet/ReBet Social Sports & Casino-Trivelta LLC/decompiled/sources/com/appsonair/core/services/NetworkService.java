package com.appsonair.core.services;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.appsonair.core.interfaces.UpdateNetwork;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/appsonair/core/services/NetworkService;", "", "()V", "Companion", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/appsonair/core/services/NetworkService$Companion;", "", "()V", "checkConnectivity", "", "context", "Landroid/content/Context;", "updateNetworkState", "Lcom/appsonair/core/interfaces/UpdateNetwork;", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"ObsoleteSdkInt"})
        public final void checkConnectivity(@NotNull Context context, @NotNull final UpdateNetwork updateNetworkState) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(updateNetworkState, "updateNetworkState");
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.appsonair.core.services.NetworkService$Companion$checkConnectivity$networkCallback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(@NotNull Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onAvailable(network);
                    UpdateNetwork.this.onUpdate(true);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(@NotNull Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onLost(network);
                    UpdateNetwork.this.onUpdate(false);
                }
            };
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(networkCallback);
        }

        private Companion() {
        }
    }

    @JvmStatic
    @SuppressLint({"ObsoleteSdkInt"})
    public static final void checkConnectivity(@NotNull Context context, @NotNull UpdateNetwork updateNetwork) {
        INSTANCE.checkConnectivity(context, updateNetwork);
    }
}
