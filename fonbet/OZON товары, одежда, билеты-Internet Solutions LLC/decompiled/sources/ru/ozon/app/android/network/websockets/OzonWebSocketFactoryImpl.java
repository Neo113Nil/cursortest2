package ru.ozon.app.android.network.websockets;

import We.E;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/network/websockets/OzonWebSocketFactoryImpl;", "Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "LWe/E;", "baseOkHttpClient", "Lru/ozon/app/android/network/websockets/AppVisibility;", "appVisibility", "<init>", "(LWe/E;Lru/ozon/app/android/network/websockets/AppVisibility;)V", "Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;", "ozonWebSocketUrl", "Lru/ozon/app/android/network/websockets/OzonWebSocket;", "create", "(Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;)Lru/ozon/app/android/network/websockets/OzonWebSocket;", "LWe/E;", "Lru/ozon/app/android/network/websockets/AppVisibility;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonWebSocketFactoryImpl implements OzonWebSocketFactory {

    @NotNull
    private final AppVisibility appVisibility;

    @NotNull
    private final E baseOkHttpClient;

    public OzonWebSocketFactoryImpl(@NotNull E baseOkHttpClient, @NotNull AppVisibility appVisibility) {
        Intrinsics.checkNotNullParameter(baseOkHttpClient, "baseOkHttpClient");
        Intrinsics.checkNotNullParameter(appVisibility, "appVisibility");
        this.baseOkHttpClient = baseOkHttpClient;
        this.appVisibility = appVisibility;
    }

    @Override // ru.ozon.app.android.network.websockets.OzonWebSocketFactory
    @NotNull
    public OzonWebSocket create(@NotNull OzonWebSocketUrl ozonWebSocketUrl) {
        Intrinsics.checkNotNullParameter(ozonWebSocketUrl, "ozonWebSocketUrl");
        return new OzonWebSocketImpl(this.baseOkHttpClient, this.appVisibility, ozonWebSocketUrl);
    }
}
