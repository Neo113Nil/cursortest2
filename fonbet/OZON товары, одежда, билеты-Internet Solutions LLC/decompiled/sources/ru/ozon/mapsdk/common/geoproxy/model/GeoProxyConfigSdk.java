package ru.ozon.mapsdk.common.geoproxy.model;

import Sc.InterfaceC3999a;
import We.B;
import We.InterfaceC4875q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/GeoProxyConfigSdk;", "Lru/ozon/mapsdk/common/geoproxy/model/GeoProxyConfig;", "<init>", "()V", "LWe/B;", "requestInterceptor", "LWe/B;", "getRequestInterceptor", "()LWe/B;", "getAntibotInterceptor", "antibotInterceptor", "getNetworkInterractor", "networkInterractor", "LWe/q;", "getCookieJar", "()LWe/q;", "cookieJar", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class GeoProxyConfigSdk extends GeoProxyConfig {
    private final B requestInterceptor;

    @NotNull
    public abstract B getAntibotInterceptor();

    @NotNull
    public abstract InterfaceC4875q getCookieJar();

    @NotNull
    public abstract B getNetworkInterractor();

    public B getRequestInterceptor() {
        return this.requestInterceptor;
    }
}
