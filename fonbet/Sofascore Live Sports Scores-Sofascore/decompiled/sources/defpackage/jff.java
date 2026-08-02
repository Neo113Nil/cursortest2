package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.i2;
import com.google.protobuf.p1;
import com.google.protobuf.r1;
import com.google.protobuf.t2;
import com.google.protobuf.y1;
import com.google.protobuf.z1;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jff {
    public static final jff c = new jff();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final hpo a = new hpo(1);

    public final vsg a(Class cls) {
        vsg B;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        vsg vsgVar = (vsg) concurrentHashMap.get(cls);
        if (vsgVar != null) {
            return vsgVar;
        }
        Class cls3 = i2.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = i2.a) != null && !cls2.isAssignableFrom(cls)) {
            a70.p("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        wgc a = ((ygc) this.a.a).a(cls);
        if (a.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                B = new z1(i2.c, tk6.a, a.b());
            } else {
                t2 t2Var = i2.b;
                pk6 pk6Var = tk6.b;
                if (pk6Var == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                B = new z1(t2Var, pk6Var, a.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            B = dtb.a[a.getSyntax().ordinal()] != 1 ? y1.B(a, ubd.b, r1.b, i2.c, tk6.a, bub.b) : y1.B(a, ubd.b, r1.b, i2.c, null, bub.b);
        } else if (dtb.a[a.getSyntax().ordinal()] != 1) {
            rbd rbdVar = ubd.a;
            p1 p1Var = r1.a;
            t2 t2Var2 = i2.b;
            pk6 pk6Var2 = tk6.b;
            if (pk6Var2 == null) {
                a70.r("Protobuf runtime is not correctly loaded.");
                return null;
            }
            B = y1.B(a, rbdVar, p1Var, t2Var2, pk6Var2, bub.a);
        } else {
            B = y1.B(a, ubd.a, r1.a, i2.b, null, bub.a);
        }
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(B, "schema");
        vsg vsgVar2 = (vsg) concurrentHashMap.putIfAbsent(cls, B);
        return vsgVar2 != null ? vsgVar2 : B;
    }
}
