package com.yandex.mapkit.tiles;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RawTile;
import com.yandex.mapkit.TileId;
import com.yandex.mapkit.Version;
import java.util.Map;

/* loaded from: classes9.dex */
public interface TileProvider {
    @NonNull
    RawTile load(@NonNull TileId tileId, @NonNull Version version, @NonNull Map<String, String> map, @NonNull String str);
}
