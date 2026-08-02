package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes12.dex */
public enum k4 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(s.b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    k4(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
