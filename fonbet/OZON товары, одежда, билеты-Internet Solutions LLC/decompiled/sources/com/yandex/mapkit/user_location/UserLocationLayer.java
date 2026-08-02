package com.yandex.mapkit.user_location;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.mapkit.location.LocationViewSource;
import com.yandex.mapkit.map.CameraPosition;

/* loaded from: classes9.dex */
public interface UserLocationLayer {
    CameraPosition cameraPosition();

    boolean isAnchorEnabled();

    boolean isAutoZoomEnabled();

    boolean isHeadingModeActive();

    boolean isValid();

    boolean isVisible();

    void resetAnchor();

    void setAnchor(@NonNull PointF pointF, @NonNull PointF pointF2);

    void setAutoZoomEnabled(boolean z11);

    void setDefaultSource();

    void setHeadingModeActive(boolean z11);

    void setObjectListener(UserLocationObjectListener userLocationObjectListener);

    void setSource(LocationViewSource locationViewSource);

    void setTapListener(UserLocationTapListener userLocationTapListener);

    void setVisible(boolean z11);
}
