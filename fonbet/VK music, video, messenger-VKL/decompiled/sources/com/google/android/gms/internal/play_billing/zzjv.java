package com.google.android.gms.internal.play_billing;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
public enum zzjv {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzgk.zzb),
    ENUM(null),
    MESSAGE(null);

    zzjv(Object obj) {
    }
}
