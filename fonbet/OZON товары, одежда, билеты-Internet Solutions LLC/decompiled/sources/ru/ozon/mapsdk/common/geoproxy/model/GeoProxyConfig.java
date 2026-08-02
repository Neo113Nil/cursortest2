package ru.ozon.mapsdk.common.geoproxy.model;

import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/GeoProxyConfig;", "", "<init>", "()V", "clone", "()Lru/ozon/mapsdk/common/geoproxy/model/GeoProxyConfig;", "", "locationUid", "Ljava/lang/String;", "getLocationUid", "()Ljava/lang/String;", "responseLanguageString", "getResponseLanguageString", "Lei0/b;", "ozonTracker", "Lei0/b;", "getOzonTracker", "()Lei0/b;", "getAppName", "appName", "Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "getHost", "()Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "host", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class GeoProxyConfig implements Cloneable {
    private final String locationUid;
    private final InterfaceC6369b ozonTracker;
    private final String responseLanguageString;

    @NotNull
    public abstract String getAppName();

    @NotNull
    public abstract ApiHost getHost();

    public String getLocationUid() {
        return this.locationUid;
    }

    public InterfaceC6369b getOzonTracker() {
        return this.ozonTracker;
    }

    public String getResponseLanguageString() {
        return this.responseLanguageString;
    }

    @NotNull
    public GeoProxyConfig clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig");
        return (GeoProxyConfig) clone;
    }
}
