package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bxd extends gfb {
    public static j3d d(Map map) {
        ujg ujgVar;
        g7h g7hVar;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Long S = aik.S("interval", map);
        Long S2 = aik.S("baseEjectionTime", map);
        Long S3 = aik.S("maxEjectionTime", map);
        Integer O = aik.O("maxEjectionPercentage", map);
        Long l = S != null ? S : 10000000000L;
        Long l2 = S2 != null ? S2 : 30000000000L;
        Long l3 = S3 != null ? S3 : 300000000000L;
        Integer num8 = O != null ? O : 10;
        Map P = aik.P("successRateEjection", map);
        List list = null;
        if (P != null) {
            Integer O2 = aik.O("stdevFactor", P);
            Integer O3 = aik.O("enforcementPercentage", P);
            Integer O4 = aik.O("minimumHosts", P);
            Integer O5 = aik.O("requestVolume", P);
            Integer num9 = O2 != null ? O2 : 1900;
            if (O3 != null) {
                z1a.s(O3.intValue() >= 0 && O3.intValue() <= 100);
                num5 = O3;
            } else {
                num5 = 100;
            }
            if (O4 != null) {
                z1a.s(O4.intValue() >= 0);
                num6 = O4;
            } else {
                num6 = 5;
            }
            if (O5 != null) {
                z1a.s(O5.intValue() >= 0);
                num7 = O5;
            } else {
                num7 = 100;
            }
            ujgVar = new ujg(15, num9, num5, num6, num7, false);
        } else {
            ujgVar = null;
        }
        Map P2 = aik.P("failurePercentageEjection", map);
        if (P2 != null) {
            Integer O6 = aik.O("threshold", P2);
            Integer O7 = aik.O("enforcementPercentage", P2);
            Integer O8 = aik.O("minimumHosts", P2);
            Integer O9 = aik.O("requestVolume", P2);
            if (O6 != null) {
                z1a.s(O6.intValue() >= 0 && O6.intValue() <= 100);
                num = O6;
            } else {
                num = 85;
            }
            if (O7 != null) {
                z1a.s(O7.intValue() >= 0 && O7.intValue() <= 100);
                num2 = O7;
            } else {
                num2 = 100;
            }
            if (O8 != null) {
                z1a.s(O8.intValue() >= 0);
                num3 = O8;
            } else {
                num3 = 5;
            }
            if (O9 != null) {
                z1a.s(O9.intValue() >= 0);
                num4 = O9;
            } else {
                num4 = 50;
            }
            g7hVar = new g7h(num, num2, num3, num4, 14);
        } else {
            g7hVar = null;
        }
        List L = aik.L("childPolicy", map);
        if (L != null) {
            aik.B(L);
            list = L;
        }
        List X = u6h.X(list);
        if (X == null || X.isEmpty()) {
            return new j3d(xei.l.h("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        j3d R = u6h.R(X, hfb.a());
        if (R.a != null) {
            return R;
        }
        t6h t6hVar = (t6h) R.b;
        z1a.E(t6hVar != null);
        z1a.E(t6hVar != null);
        return new j3d(new vwd(l, l2, l3, num8, ujgVar, g7hVar, t6hVar));
    }

    @Override // defpackage.gfb
    public final String a() {
        return "outlier_detection_experimental";
    }

    @Override // defpackage.gfb
    public final ffb b(f6a f6aVar) {
        return new axd(f6aVar);
    }

    @Override // defpackage.gfb
    public final j3d c(Map map) {
        try {
            return d(map);
        } catch (RuntimeException e) {
            return new j3d(xei.m.g(e).h("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
