package defpackage;

import com.google.android.gms.internal.auth.b;
import com.google.android.gms.internal.auth.c;
import com.google.android.gms.internal.auth.d;
import com.google.android.gms.internal.auth.zzev;
import com.google.android.gms.internal.auth.zzfa;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nco {
    public static final nco c = new nco();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final j0l a = new j0l(3);

    public final ido a(Class cls) {
        ido l;
        Class cls2;
        Charset charset = zzfa.a;
        if (cls == null) {
            yhk.s("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        ido idoVar = (ido) concurrentHashMap.get(cls);
        if (idoVar != null) {
            return idoVar;
        }
        Class cls3 = d.a;
        if (!zzev.class.isAssignableFrom(cls) && (cls2 = d.a) != null && !cls2.isAssignableFrom(cls)) {
            a70.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        bdo a = ((d9o) this.a.b).a(cls);
        if ((a.c & 2) == 2) {
            if (zzev.class.isAssignableFrom(cls)) {
                l = new c(d.c, d5o.a, a.a);
            } else {
                nko nkoVar = d.b;
                x4o x4oVar = d5o.b;
                if (x4oVar == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                l = new c(nkoVar, x4oVar, a.a);
            }
        } else if (zzev.class.isAssignableFrom(cls)) {
            if (((a.c & 1) != 0 ? 1 : 2) - 1 != 1) {
                int i = bco.a;
                j8o j8oVar = q8o.b;
                nko nkoVar2 = d.c;
                x4o x4oVar2 = d5o.a;
                int i2 = z9o.a;
                l = b.l(a, j8oVar, nkoVar2);
            } else {
                int i3 = bco.a;
                j8o j8oVar2 = q8o.b;
                nko nkoVar3 = d.c;
                int i4 = z9o.a;
                l = b.l(a, j8oVar2, nkoVar3);
            }
        } else {
            if (((a.c & 1) != 0 ? 1 : 2) - 1 != 1) {
                int i5 = bco.a;
                b8o b8oVar = q8o.a;
                nko nkoVar4 = d.b;
                if (d5o.b == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                int i6 = z9o.a;
                l = b.l(a, b8oVar, nkoVar4);
            } else {
                int i7 = bco.a;
                b8o b8oVar2 = q8o.a;
                nko nkoVar5 = d.b;
                int i8 = z9o.a;
                l = b.l(a, b8oVar2, nkoVar5);
            }
        }
        ido idoVar2 = (ido) concurrentHashMap.putIfAbsent(cls, l);
        return idoVar2 == null ? l : idoVar2;
    }
}
