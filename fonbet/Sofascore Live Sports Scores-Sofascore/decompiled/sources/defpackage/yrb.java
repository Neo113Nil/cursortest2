package defpackage;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yrb {
    public final wrb a;
    public final Map b;
    public final Map c;
    public final s3g d;
    public final Object e;
    public final Map f;

    public yrb(wrb wrbVar, HashMap hashMap, HashMap hashMap2, s3g s3gVar, Object obj, Map map) {
        this.a = wrbVar;
        this.b = fn0.q(hashMap);
        this.c = fn0.q(hashMap2);
        this.d = s3gVar;
        this.e = obj;
        this.f = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
    }

    public static yrb a(Map map, boolean z, int i, int i2, Object obj) {
        s3g s3gVar;
        Map P;
        s3g s3gVar2;
        if (z) {
            if (map == null || (P = aik.P("retryThrottling", map)) == null) {
                s3gVar2 = null;
            } else {
                float floatValue = aik.N("maxTokens", P).floatValue();
                float floatValue2 = aik.N("tokenRatio", P).floatValue();
                z1a.D("maxToken should be greater than zero", floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                z1a.D("tokenRatio should be greater than zero", floatValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                s3gVar2 = new s3g(floatValue, floatValue2);
            }
            s3gVar = s3gVar2;
        } else {
            s3gVar = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map P2 = map == null ? null : aik.P("healthCheckConfig", map);
        List<Map> L = aik.L("methodConfig", map);
        if (L == null) {
            L = null;
        } else {
            aik.B(L);
        }
        if (L == null) {
            return new yrb(null, hashMap, hashMap2, s3gVar, obj, P2);
        }
        wrb wrbVar = null;
        for (Map map2 : L) {
            wrb wrbVar2 = new wrb(map2, z, i, i2);
            List<Map> L2 = aik.L("name", map2);
            if (L2 == null) {
                L2 = null;
            } else {
                aik.B(L2);
            }
            if (L2 != null && !L2.isEmpty()) {
                for (Map map3 : L2) {
                    String R = aik.R(NotificationCompat.CATEGORY_SERVICE, map3);
                    String R2 = aik.R("method", map3);
                    if (vha.M(R)) {
                        z1a.q(R2, "missing service name for method %s", vha.M(R2));
                        z1a.q(map, "Duplicate default method config in service config %s", wrbVar == null);
                        wrbVar = wrbVar2;
                    } else if (vha.M(R2)) {
                        z1a.q(R, "Duplicate service %s", !hashMap2.containsKey(R));
                        hashMap2.put(R, wrbVar2);
                    } else {
                        z1a.y(R, "fullServiceName");
                        StringBuilder sb = new StringBuilder(R);
                        sb.append("/");
                        z1a.y(R2, "methodName");
                        sb.append(R2);
                        String sb2 = sb.toString();
                        z1a.q(sb2, "Duplicate method name %s", !hashMap.containsKey(sb2));
                        hashMap.put(sb2, wrbVar2);
                    }
                }
            }
        }
        return new yrb(wrbVar, hashMap, hashMap2, s3gVar, obj, P2);
    }

    public final xrb b() {
        if (this.c.isEmpty() && this.b.isEmpty() && this.a == null) {
            return null;
        }
        return new xrb(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yrb.class == obj.getClass()) {
            yrb yrbVar = (yrb) obj;
            if (sha.r(this.a, yrbVar.a) && sha.r(this.b, yrbVar.b) && sha.r(this.c, yrbVar.c) && sha.r(this.d, yrbVar.d) && sha.r(this.e, yrbVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "defaultMethodConfig");
        I.e(this.b, "serviceMethodMap");
        I.e(this.c, "serviceMap");
        I.e(this.d, "retryThrottling");
        I.e(this.e, "loadBalancingConfig");
        return I.toString();
    }
}
