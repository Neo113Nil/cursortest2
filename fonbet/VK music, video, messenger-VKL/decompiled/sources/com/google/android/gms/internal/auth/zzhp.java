package com.google.android.gms.internal.auth;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public enum zzhp {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzef.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzhp(Object obj) {
        this.zzk = obj;
    }
}
