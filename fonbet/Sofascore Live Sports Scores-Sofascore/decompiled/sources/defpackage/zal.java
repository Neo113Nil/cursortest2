package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum zal {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ec2.c),
    ENUM(null),
    MESSAGE(null);

    public final Object a;

    zal(Serializable serializable) {
        this.a = serializable;
    }
}
