package ru.ozon.app.android.network.websockets;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;", "", "getUrl", "", "getHeaders", "", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OzonWebSocketUrl {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Map<String, String> getHeaders(@NotNull OzonWebSocketUrl ozonWebSocketUrl) {
            return null;
        }
    }

    Map<String, String> getHeaders();

    @NotNull
    String getUrl();
}
