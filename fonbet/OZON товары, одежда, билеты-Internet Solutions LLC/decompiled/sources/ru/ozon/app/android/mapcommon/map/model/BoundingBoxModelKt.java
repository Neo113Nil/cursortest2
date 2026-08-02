package ru.ozon.app.android.mapcommon.map.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "Lwe0/n;", "toSdkBoundingBox", "(Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;)Lwe0/n;", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BoundingBoxModelKt {
    @NotNull
    public static final n toSdkBoundingBox(@NotNull BoundingBoxModel boundingBoxModel) {
        Intrinsics.checkNotNullParameter(boundingBoxModel, "<this>");
        return new n(PointModelKt.toSdkPoint(boundingBoxModel.getSouthWest()), PointModelKt.toSdkPoint(boundingBoxModel.getNorthEast()));
    }
}
