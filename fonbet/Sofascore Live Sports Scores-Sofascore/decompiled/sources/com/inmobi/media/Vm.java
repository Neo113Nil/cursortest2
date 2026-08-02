package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Vm {
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(2:19|20)(2:16|17)))|29|6|7|(0)(0)|11|12|(1:14)|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ol ol, AdConfig.VastVideoConfig vastVideoConfig, sq3 sq3Var) {
        Rm rm;
        int i;
        if (sq3Var instanceof Rm) {
            rm = (Rm) sq3Var;
            int i2 = rm.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rm.b = i2 - Integer.MIN_VALUE;
                Object obj = rm.a;
                lu3 lu3Var = lu3.a;
                i = rm.b;
                InterfaceC3317bf interfaceC3317bf = null;
                if (i != 0) {
                    y6a.M(obj);
                    Ye ye = new Ye(ol.c, new Ok(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                    F9 f9 = (F9) Ve.c.getValue();
                    rm.b = 1;
                    obj = f9.a.a(ye, rm);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                interfaceC3317bf = (InterfaceC3317bf) obj;
                return (interfaceC3317bf == null && interfaceC3317bf.c() == 200) ? new Double(interfaceC3317bf.b().c) : new Double(Double.MAX_VALUE);
            }
        }
        rm = new Rm(sq3Var);
        Object obj2 = rm.a;
        lu3 lu3Var2 = lu3.a;
        i = rm.b;
        InterfaceC3317bf interfaceC3317bf2 = null;
        if (i != 0) {
        }
        interfaceC3317bf2 = (InterfaceC3317bf) obj2;
        if (interfaceC3317bf2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ol ol, double d, AdConfig.VastVideoConfig vastVideoConfig, sq3 sq3Var) {
        Qm qm;
        int i;
        double d2;
        if (sq3Var instanceof Qm) {
            qm = (Qm) sq3Var;
            int i2 = qm.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qm.c = i2 - Integer.MIN_VALUE;
                Object obj = qm.b;
                lu3 lu3Var = lu3.a;
                i = qm.c;
                double d3 = Double.MAX_VALUE;
                if (i != 0) {
                    y6a.M(obj);
                    d2 = ol.d * d;
                    if (d2 <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                        return new Double(Double.MAX_VALUE);
                    }
                    if (d2 <= 0.0d) {
                        qm.a = vastVideoConfig;
                        qm.c = 1;
                        obj = a(ol, vastVideoConfig, qm);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    if (d2 > 0.0d && d2 <= vastVideoConfig.getVastMaxAssetSize()) {
                        d3 = d2;
                    }
                    return new Double(d3);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vastVideoConfig = qm.a;
                y6a.M(obj);
                d2 = ((Number) obj).doubleValue();
                if (d2 > 0.0d) {
                    d3 = d2;
                }
                return new Double(d3);
            }
        }
        qm = new Qm(sq3Var);
        Object obj2 = qm.b;
        lu3 lu3Var2 = lu3.a;
        i = qm.c;
        double d32 = Double.MAX_VALUE;
        if (i != 0) {
        }
        d2 = ((Number) obj2).doubleValue();
        if (d2 > 0.0d) {
        }
        return new Double(d32);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ol ol, double d, EnumC3369df enumC3369df, int i, AdConfig.VastVideoConfig vastVideoConfig, sq3 sq3Var) {
        Pm pm;
        int i2;
        double doubleValue;
        if (sq3Var instanceof Pm) {
            pm = (Pm) sq3Var;
            int i3 = pm.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pm.e = i3 - Integer.MIN_VALUE;
                Object obj = pm.d;
                lu3 lu3Var = lu3.a;
                i2 = pm.e;
                if (i2 != 0) {
                    y6a.M(obj);
                    pm.a = ol;
                    pm.b = enumC3369df;
                    pm.c = i;
                    pm.e = 1;
                    obj = a(ol, d, vastVideoConfig, pm);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = pm.c;
                    enumC3369df = pm.b;
                    ol = pm.a;
                    y6a.M(obj);
                }
                doubleValue = ((Number) obj).doubleValue();
                if (doubleValue != Double.MAX_VALUE) {
                    return new Double(Double.MAX_VALUE);
                }
                double abs = Math.abs((ol.a * ol.b) - i);
                int ordinal = enumC3369df.ordinal();
                return new Double((abs * (ordinal != 2 ? ordinal != 3 ? 0.5d : 1.5d : 1.0d)) / Math.exp(doubleValue / 3.145728E7d));
            }
        }
        pm = new Pm(sq3Var);
        Object obj2 = pm.d;
        lu3 lu3Var2 = lu3.a;
        i2 = pm.e;
        if (i2 != 0) {
        }
        doubleValue = ((Number) obj2).doubleValue();
        if (doubleValue != Double.MAX_VALUE) {
        }
    }
}
