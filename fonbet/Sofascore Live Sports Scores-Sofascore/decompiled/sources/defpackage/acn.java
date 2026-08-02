package defpackage;

import com.google.android.gms.internal.pal.a;
import com.google.android.gms.internal.pal.c;
import com.google.android.gms.internal.pal.d;
import com.google.android.gms.internal.pal.e;
import com.google.android.gms.internal.pal.zzacz;
import com.google.android.gms.internal.pal.zzadg;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class acn {
    public static final acn c = new acn();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final sz8 a = new sz8(2);

    public final kcn a(Class cls) {
        kcn z;
        Class cls2;
        Charset charset = zzadg.a;
        if (cls == null) {
            yhk.s("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        kcn kcnVar = (kcn) concurrentHashMap.get(cls);
        if (kcnVar != null) {
            return kcnVar;
        }
        Class cls3 = e.a;
        if (!zzacz.class.isAssignableFrom(cls) && (cls2 = e.a) != null && !cls2.isAssignableFrom(cls)) {
            a70.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        fcn a = ((wan) this.a.b).a(cls);
        if ((a.d & 2) == 2) {
            if (zzacz.class.isAssignableFrom(cls)) {
                z = new d(e.d, y8n.a, a.a);
            } else {
                hdn hdnVar = e.b;
                a aVar = y8n.b;
                if (aVar == null) {
                    a70.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                z = new d(hdnVar, aVar, a.a);
            }
        } else if (zzacz.class.isAssignableFrom(cls)) {
            if ((a.d & 1) == 1) {
                int i = wbn.a;
                z = c.z(a, ran.b, e.d, y8n.a, jbn.b);
            } else {
                int i2 = wbn.a;
                z = c.z(a, ran.b, e.d, null, jbn.b);
            }
        } else if ((a.d & 1) == 1) {
            int i3 = wbn.a;
            man manVar = ran.a;
            hdn hdnVar2 = e.b;
            a aVar2 = y8n.b;
            if (aVar2 == null) {
                a70.r("Protobuf runtime is not correctly loaded.");
                return null;
            }
            z = c.z(a, manVar, hdnVar2, aVar2, jbn.a);
        } else {
            int i4 = wbn.a;
            z = c.z(a, ran.a, e.c, null, jbn.a);
        }
        kcn kcnVar2 = (kcn) concurrentHashMap.putIfAbsent(cls, z);
        return kcnVar2 == null ? z : kcnVar2;
    }
}
