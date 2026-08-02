package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.JamStyle;
import java.util.List;

/* loaded from: classes9.dex */
public class DrivingJamsPainter {
    public static native void applyJamsStyle(@NonNull PolylineMapObject polylineMapObject, @NonNull List<JamSegment> list, @NonNull JamStyle jamStyle);
}
