package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kff {
    public static final kff c = new kff();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final de0 a = new de0(2);

    public final wsg a(Class cls) {
        rk6 rk6Var;
        wsg w;
        Class cls2;
        w7a.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        wsg wsgVar = (wsg) concurrentHashMap.get(cls);
        if (wsgVar != null) {
            return wsgVar;
        }
        Class cls3 = atg.a;
        if (!hw8.class.isAssignableFrom(cls) && (cls2 = atg.a) != null && !cls2.isAssignableFrom(cls)) {
            a70.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        lnf a = ((gtb) this.a.b).a(cls);
        if ((a.d & 2) == 2) {
            if (hw8.class.isAssignableFrom(cls)) {
                w = new jhc(atg.c, uk6.a, a.a);
            } else {
                zbk zbkVar = atg.b;
                rk6 rk6Var2 = uk6.b;
                if (rk6Var2 == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new jhc(zbkVar, rk6Var2, a.a);
            }
        } else if (hw8.class.isAssignableFrom(cls)) {
            w = hhc.w(a, vbd.b, fcb.b, atg.c, wt3.C(a.a()) != 1 ? uk6.a : null, cub.b);
        } else {
            sbd sbdVar = vbd.a;
            dcb dcbVar = fcb.a;
            zbk zbkVar2 = atg.b;
            if (wt3.C(a.a()) != 1) {
                rk6 rk6Var3 = uk6.b;
                if (rk6Var3 == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                rk6Var = rk6Var3;
            } else {
                rk6Var = null;
            }
            w = hhc.w(a, sbdVar, dcbVar, zbkVar2, rk6Var, cub.a);
        }
        wsg wsgVar2 = (wsg) concurrentHashMap.putIfAbsent(cls, w);
        return wsgVar2 != null ? wsgVar2 : w;
    }
}
