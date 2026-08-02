package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ZoomRange;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.tiles.TileProvider;
import com.yandex.mapkit.tiles.UrlProvider;
import java.util.List;

/* loaded from: classes9.dex */
public interface BaseTileDataSourceBuilder extends BaseDataSourceBuilder {
    void setProjection(@NonNull Projection projection);

    void setTileFormat(@NonNull TileFormat tileFormat);

    void setTileProvider(@NonNull TileProvider tileProvider);

    void setTileUrlProvider(@NonNull UrlProvider urlProvider);

    void setZoomRanges(@NonNull List<ZoomRange> list);
}
