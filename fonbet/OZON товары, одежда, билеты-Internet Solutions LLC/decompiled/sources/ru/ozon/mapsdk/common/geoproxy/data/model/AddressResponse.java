package ru.ozon.mapsdk.common.geoproxy.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.Components;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/AddressResponse;", "", "components", "Lru/ozon/mapsdk/common/geoproxy/model/Components;", "fullText", "", "geometry", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse;", "postalCode", "source", "timezone", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/model/Components;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponents", "()Lru/ozon/mapsdk/common/geoproxy/model/Components;", "getFullText", "()Ljava/lang/String;", "getGeometry", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse;", "getPostalCode", "getSource", "getTimezone", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressResponse {

    @NotNull
    private final Components components;

    @NotNull
    private final String fullText;

    @NotNull
    private final GeometryResponse geometry;

    @NotNull
    private final String postalCode;

    @NotNull
    private final String source;

    @NotNull
    private final String timezone;

    public AddressResponse(@NotNull Components components, @NotNull String fullText, @NotNull GeometryResponse geometry, @NotNull String postalCode, @NotNull String source, @NotNull String timezone) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.components = components;
        this.fullText = fullText;
        this.geometry = geometry;
        this.postalCode = postalCode;
        this.source = source;
        this.timezone = timezone;
    }

    @NotNull
    public final Components getComponents() {
        return this.components;
    }

    @NotNull
    public final String getFullText() {
        return this.fullText;
    }

    @NotNull
    public final GeometryResponse getGeometry() {
        return this.geometry;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }
}
