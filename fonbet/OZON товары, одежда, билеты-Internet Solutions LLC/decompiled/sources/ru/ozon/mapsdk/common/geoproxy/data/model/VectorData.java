package ru.ozon.mapsdk.common.geoproxy.data.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/VectorData;", "", "maxZoom", "", "minZoom", "sdk", "", "tileSize", "", "tileUrl", "styleUrl", "styleUrls", "", "<init>", "(DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getMaxZoom", "()D", "getMinZoom", "getSdk", "()Ljava/lang/String;", "getTileSize", "()I", "getTileUrl", "getStyleUrl", "getStyleUrls", "()Ljava/util/Map;", "clearTileUrl", "getClearTileUrl$mapsdk_fullFirebaseOpenglRelease", "tileUrlWithArgs", "getTileUrlWithArgs$mapsdk_fullFirebaseOpenglRelease", "isSupportThemes", "", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VectorData {

    @NotNull
    private final String clearTileUrl;
    private final double maxZoom;
    private final double minZoom;

    @NotNull
    private final String sdk;

    @NotNull
    private final String styleUrl;
    private final Map<String, String> styleUrls;
    private final int tileSize;

    @NotNull
    private final String tileUrl;
    private final String tileUrlWithArgs;

    public VectorData(double d11, double d12, @NotNull String sdk, int i11, @NotNull String tileUrl, @NotNull String styleUrl, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(tileUrl, "tileUrl");
        Intrinsics.checkNotNullParameter(styleUrl, "styleUrl");
        this.maxZoom = d11;
        this.minZoom = d12;
        this.sdk = sdk;
        this.tileSize = i11;
        this.tileUrl = tileUrl;
        this.styleUrl = styleUrl;
        this.styleUrls = map;
        this.clearTileUrl = (String) C7714v.K(h.m(tileUrl, new String[]{"?"}, 0, 6));
        this.tileUrlWithArgs = (String) C7714v.Q(1, h.m(tileUrl, new String[]{"?"}, 0, 6));
    }

    @NotNull
    /* renamed from: getClearTileUrl$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getClearTileUrl() {
        return this.clearTileUrl;
    }

    public final double getMaxZoom() {
        return this.maxZoom;
    }

    public final double getMinZoom() {
        return this.minZoom;
    }

    @NotNull
    public final String getSdk() {
        return this.sdk;
    }

    @NotNull
    public final String getStyleUrl() {
        return this.styleUrl;
    }

    public final Map<String, String> getStyleUrls() {
        return this.styleUrls;
    }

    public final int getTileSize() {
        return this.tileSize;
    }

    @NotNull
    public final String getTileUrl() {
        return this.tileUrl;
    }

    /* renamed from: getTileUrlWithArgs$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getTileUrlWithArgs() {
        return this.tileUrlWithArgs;
    }

    public final boolean isSupportThemes() {
        Map<String, String> map = this.styleUrls;
        return map != null && map.containsKey("light") && this.styleUrls.containsKey("dark");
    }

    public /* synthetic */ VectorData(double d11, double d12, String str, int i11, String str2, String str3, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(d11, d12, str, i11, str2, str3, (i12 & 64) != 0 ? null : map);
    }
}
