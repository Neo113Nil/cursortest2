package com.appsonair.applink.services;

import android.content.Context;
import com.appsonair.applink.services.NetworkWatcherService;
import com.appsonair.core.interfaces.UpdateNetwork;
import com.appsonair.core.services.NetworkService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/appsonair/applink/services/NetworkWatcherService;", "", "()V", "Companion", "applink_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkWatcherService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isNetworkConnected = true;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/appsonair/applink/services/NetworkWatcherService$Companion;", "", "()V", "isNetworkConnected", "", "()Z", "setNetworkConnected", "(Z)V", "checkNetworkConnection", "", "context", "Landroid/content/Context;", "applink_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: checkNetworkConnection$lambda-0, reason: not valid java name */
        public static final void m58checkNetworkConnection$lambda0(boolean z10) {
            NetworkWatcherService.INSTANCE.setNetworkConnected(z10);
        }

        public final void checkNetworkConnection(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            NetworkService.INSTANCE.checkConnectivity(context, new UpdateNetwork() { // from class: com.appsonair.applink.services.b
                @Override // com.appsonair.core.interfaces.UpdateNetwork
                public final void onUpdate(boolean z10) {
                    NetworkWatcherService.Companion.m58checkNetworkConnection$lambda0(z10);
                }
            });
        }

        public final boolean isNetworkConnected() {
            return NetworkWatcherService.isNetworkConnected;
        }

        public final void setNetworkConnected(boolean z10) {
            NetworkWatcherService.isNetworkConnected = z10;
        }

        private Companion() {
        }
    }
}
