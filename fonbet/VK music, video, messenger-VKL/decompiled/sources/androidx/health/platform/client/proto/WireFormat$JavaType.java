package androidx.health.platform.client.proto;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes12.dex */
public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ByteString.b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    WireFormat$JavaType(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
