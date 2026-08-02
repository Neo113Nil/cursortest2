package ru.ozon.mapsdk.common.geoproxy.data.model;

import ae0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeometryResponse;
import ru.ozon.mapsdk.common.geoproxy.model.Components;
import ru.ozon.mapsdk.common.geoproxy.model.GeocodeModel;
import we0.m;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toGeoCodeModel", "Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeResponse;", "mapsdk_fullFirebaseOpenglRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeocodeResponseKt {
    @NotNull
    public static final GeocodeModel toGeoCodeModel(@NotNull GeocodeResponse geocodeResponse) {
        Intrinsics.checkNotNullParameter(geocodeResponse, "<this>");
        Components components = geocodeResponse.getAddress().getComponents();
        String a11 = k.a(geocodeResponse.getAddress().getFullText());
        GeometryResponse.PointResponse point = geocodeResponse.getAddress().getGeometry().getPoint();
        m mVar = new m(point.getLat(), point.getLon());
        GeometryResponse.PointResponse leftLowerCorner = geocodeResponse.getAddress().getGeometry().getViewPort().getLeftLowerCorner();
        m mVar2 = new m(leftLowerCorner.getLat(), leftLowerCorner.getLon());
        GeometryResponse.PointResponse rightUpperCorner = geocodeResponse.getAddress().getGeometry().getViewPort().getRightUpperCorner();
        return new GeocodeModel(new GeocodeModel.Address(components, a11, new GeocodeModel.Geometry(mVar, mVar2, new m(rightUpperCorner.getLat(), rightUpperCorner.getLon())), geocodeResponse.getAddress().getPostalCode(), geocodeResponse.getAddress().getSource(), geocodeResponse.getAddress().getTimezone()));
    }
}
