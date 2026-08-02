package ru.ozon.app.android.geo.map.presentation.mapicons;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationPin;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterizationPinIcon;", "Lru/ozon/app/android/geo/map/presentation/mapicons/PinIcon;", "bindAndGetBitmap", "Landroid/graphics/Bitmap;", "pin", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;", "imageBitmap", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ClusterizationPinIcon extends PinIcon {
    @NotNull
    Bitmap bindAndGetBitmap(@NotNull ClusterizationPin pin, Bitmap imageBitmap);
}
