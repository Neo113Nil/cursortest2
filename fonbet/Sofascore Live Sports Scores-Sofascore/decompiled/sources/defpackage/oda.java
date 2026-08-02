package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum oda {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(cc2.class, cc2.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class a;
    public final Object b;

    oda(Class cls, Serializable serializable) {
        this.a = cls;
        this.b = serializable;
    }
}
