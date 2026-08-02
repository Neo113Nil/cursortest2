package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hff {
    public static final hff c = new hff();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final j0l a = new j0l(1);

    public final usg a(Class cls) {
        qk6 qk6Var;
        usg w;
        Class cls2;
        u7a.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        usg usgVar = (usg) concurrentHashMap.get(cls);
        if (usgVar != null) {
            return usgVar;
        }
        Class cls3 = zsg.a;
        if (!gw8.class.isAssignableFrom(cls) && (cls2 = zsg.a) != null && !cls2.isAssignableFrom(cls)) {
            a70.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        jnf a = ((etb) this.a.b).a(cls);
        if ((a.d & 2) == 2) {
            if (gw8.class.isAssignableFrom(cls)) {
                w = new ihc(zsg.c, sk6.a, a.a);
            } else {
                ybk ybkVar = zsg.b;
                qk6 qk6Var2 = sk6.b;
                if (qk6Var2 == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new ihc(ybkVar, qk6Var2, a.a);
            }
        } else if (gw8.class.isAssignableFrom(cls)) {
            w = ghc.w(a, tbd.b, ecb.b, zsg.c, wt3.C(a.a()) != 1 ? sk6.a : null, aub.b);
        } else {
            qbd qbdVar = tbd.a;
            ccb ccbVar = ecb.a;
            ybk ybkVar2 = zsg.b;
            if (wt3.C(a.a()) != 1) {
                qk6 qk6Var3 = sk6.b;
                if (qk6Var3 == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                qk6Var = qk6Var3;
            } else {
                qk6Var = null;
            }
            w = ghc.w(a, qbdVar, ccbVar, ybkVar2, qk6Var, aub.a);
        }
        usg usgVar2 = (usg) concurrentHashMap.putIfAbsent(cls, w);
        return usgVar2 != null ? usgVar2 : w;
    }
}
