package ru.ozon.app.android.geo.map.presentation.mapicons;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapObjectFactory;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "mapObject", "", "isCollapsed", "Lru/ozon/app/android/geo/map/presentation/mapicons/PinIcon;", "createView", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;Z)Lru/ozon/app/android/geo/map/presentation/mapicons/PinIcon;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapObjectFactory {

    @NotNull
    private final Context context;

    @NotNull
    private final FeatureChecker featureChecker;

    public MapObjectFactory(@NotNull Context context, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.context = context;
        this.featureChecker = featureChecker;
    }

    @NotNull
    public final PinIcon createView(@NotNull AddressEditMapVO.MapObject mapObject, boolean isCollapsed) {
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        return mapObject.getType() == AddressEditMapDTO.MapObject.Type.CLUSTER ? new ClusterPinIconView(this.context, null, 0, 0, 14, null) : mapObject.getIsSelected() ? new SelectedPinIconView(this.context, null, 0, 0, 14, null) : isCollapsed ? new CollapsedPinIconView(this.context, null, 0, 0, 14, null) : mapObject.getAdditionalContent() != null ? new ExpandedPinIconView(this.context, null, 0, 0, 14, null) : new DefaultPinIconView(this.context, null, 0, 0, 14, null);
    }
}
