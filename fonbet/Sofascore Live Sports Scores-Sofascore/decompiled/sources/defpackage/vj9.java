package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class vj9 {
    public static final Set a = ph0.a0(new ij9[]{ij9.b, ij9.d});
    public static final bjb b = ejb.b("io.ktor.client.plugins.HttpRedirect");
    public static final p4h c = new p4h(22);
    public static final sx2 d = new sx2("HttpRedirect", (Function0) tj9.b, (Function1) new yh9(2));

    /* JADX WARN: Removed duplicated region for block: B:12:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01d8 -> B:10:0x01de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k4h k4hVar, yj9 yj9Var, xh9 xh9Var, vh9 vh9Var, sq3 sq3Var) {
        uj9 uj9Var;
        int i;
        yj9 yj9Var2;
        o8k o8kVar;
        String sb;
        fsf fsfVar;
        k4h k4hVar2;
        uj9 uj9Var2;
        fsf fsfVar2;
        vh9 vh9Var2;
        String str;
        m8k m8kVar;
        bjb bjbVar;
        m8k m8kVar2;
        String str2;
        String str3;
        Object a2;
        if (sq3Var instanceof uj9) {
            uj9Var = (uj9) sq3Var;
            int i2 = uj9Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uj9Var.A = i2 - Integer.MIN_VALUE;
                Object obj = uj9Var.z;
                lu3 lu3Var = lu3.a;
                i = uj9Var.A;
                if (i != 0) {
                    y6a.M(obj);
                    if (!b(xh9Var.d().d())) {
                        return xh9Var;
                    }
                    fsf fsfVar3 = new fsf();
                    fsfVar3.a = xh9Var;
                    fsf fsfVar4 = new fsf();
                    yj9Var2 = yj9Var;
                    fsfVar4.a = yj9Var2;
                    o8kVar = xh9Var.c().getUrl().h;
                    lek url = xh9Var.c().getUrl();
                    url.getClass();
                    o8k o8kVar2 = url.h;
                    int i3 = url.b;
                    StringBuilder sb2 = new StringBuilder();
                    String str4 = (String) url.k.getValue();
                    String str5 = (String) url.l.getValue();
                    if (str4 != null) {
                        sb2.append(str4);
                        if (str5 != null) {
                            sb2.append(':');
                            sb2.append(str5);
                        }
                        sb2.append("@");
                    }
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    String str6 = url.a;
                    if (i3 != 0 && i3 != o8kVar2.b) {
                        StringBuilder sb4 = new StringBuilder(str6);
                        sb4.append(':');
                        Integer valueOf = i3 != 0 ? Integer.valueOf(i3) : null;
                        sb4.append(valueOf != null ? valueOf.intValue() : o8kVar2.b);
                        str6 = sb4.toString();
                    }
                    sb3.append(str6);
                    sb = sb3.toString();
                    fsfVar = fsfVar4;
                    k4hVar2 = k4hVar;
                    uj9Var2 = uj9Var;
                    fsfVar2 = fsfVar3;
                    vh9Var2 = vh9Var;
                    de0 de0Var = vh9Var2.j;
                    ((xh9) fsfVar2.a).d();
                    de0Var.B(c);
                    o89 a3 = ((xh9) fsfVar2.a).d().a();
                    List list = zi9.a;
                    str = a3.get("Location");
                    StringBuilder q = wt3.q("Received redirect response to ", str, " for request ");
                    m8kVar = yj9Var2.a;
                    q.append(m8kVar);
                    String sb5 = q.toString();
                    bjbVar = b;
                    bjbVar.l(sb5);
                    yj9 yj9Var3 = new yj9();
                    yj9 yj9Var4 = (yj9) fsfVar.a;
                    yj9Var4.getClass();
                    yj9Var3.e = yj9Var4.e;
                    yj9Var3.e(yj9Var4);
                    m8kVar2 = yj9Var3.a;
                    ((v8e) m8kVar2.j.a).m();
                    if (str != null) {
                    }
                    o8kVar.getClass();
                    str2 = o8kVar.a;
                    if (!str2.equals(HttpRequest.DEFAULT_SCHEME)) {
                    }
                    o8k c2 = m8kVar2.c();
                    c2.getClass();
                    str3 = c2.a;
                    if (!str3.equals(HttpRequest.DEFAULT_SCHEME)) {
                        bjbVar.l("Can not redirect " + m8kVar + " because of security downgrade");
                        return fsfVar2.a;
                    }
                    if (!Intrinsics.c(sb, s6a.y(m8kVar2))) {
                    }
                    fsfVar.a = yj9Var3;
                    uj9Var2.r = k4hVar2;
                    uj9Var2.s = yj9Var2;
                    uj9Var2.t = vh9Var2;
                    uj9Var2.u = fsfVar2;
                    uj9Var2.v = fsfVar;
                    uj9Var2.w = o8kVar;
                    uj9Var2.x = sb;
                    uj9Var2.y = fsfVar2;
                    uj9Var2.A = 1;
                    a2 = k4hVar2.a.a(yj9Var3, uj9Var2);
                    if (a2 != lu3Var) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsf fsfVar5 = uj9Var.y;
                    String str7 = uj9Var.x;
                    o8k o8kVar3 = uj9Var.w;
                    fsf fsfVar6 = uj9Var.v;
                    fsf fsfVar7 = uj9Var.u;
                    vh9 vh9Var3 = uj9Var.t;
                    yj9 yj9Var5 = uj9Var.s;
                    k4h k4hVar3 = uj9Var.r;
                    y6a.M(obj);
                    uj9Var2 = uj9Var;
                    fsfVar2 = fsfVar7;
                    o8kVar = o8kVar3;
                    sb = str7;
                    fsf fsfVar8 = fsfVar6;
                    yj9Var2 = yj9Var5;
                    fsfVar5.a = obj;
                    if (b(((xh9) fsfVar2.a).d().d())) {
                        return fsfVar2.a;
                    }
                    vh9Var2 = vh9Var3;
                    fsfVar = fsfVar8;
                    k4hVar2 = k4hVar3;
                    de0 de0Var2 = vh9Var2.j;
                    ((xh9) fsfVar2.a).d();
                    de0Var2.B(c);
                    o89 a32 = ((xh9) fsfVar2.a).d().a();
                    List list2 = zi9.a;
                    str = a32.get("Location");
                    StringBuilder q2 = wt3.q("Received redirect response to ", str, " for request ");
                    m8kVar = yj9Var2.a;
                    q2.append(m8kVar);
                    String sb52 = q2.toString();
                    bjbVar = b;
                    bjbVar.l(sb52);
                    yj9 yj9Var32 = new yj9();
                    yj9 yj9Var42 = (yj9) fsfVar.a;
                    yj9Var42.getClass();
                    yj9Var32.e = yj9Var42.e;
                    yj9Var32.e(yj9Var42);
                    m8kVar2 = yj9Var32.a;
                    ((v8e) m8kVar2.j.a).m();
                    if (str != null) {
                        n8k.b(m8kVar2, str);
                    }
                    o8kVar.getClass();
                    str2 = o8kVar.a;
                    if (!str2.equals(HttpRequest.DEFAULT_SCHEME) || str2.equals("wss")) {
                        o8k c22 = m8kVar2.c();
                        c22.getClass();
                        str3 = c22.a;
                        if (!str3.equals(HttpRequest.DEFAULT_SCHEME) && !str3.equals("wss")) {
                            bjbVar.l("Can not redirect " + m8kVar + " because of security downgrade");
                            return fsfVar2.a;
                        }
                    }
                    if (!Intrinsics.c(sb, s6a.y(m8kVar2))) {
                        ((Map) yj9Var32.c.b).remove("Authorization");
                        bjbVar.l("Removing Authorization header from redirect for " + m8kVar);
                    }
                    fsfVar.a = yj9Var32;
                    uj9Var2.r = k4hVar2;
                    uj9Var2.s = yj9Var2;
                    uj9Var2.t = vh9Var2;
                    uj9Var2.u = fsfVar2;
                    uj9Var2.v = fsfVar;
                    uj9Var2.w = o8kVar;
                    uj9Var2.x = sb;
                    uj9Var2.y = fsfVar2;
                    uj9Var2.A = 1;
                    a2 = k4hVar2.a.a(yj9Var32, uj9Var2);
                    if (a2 != lu3Var) {
                        return lu3Var;
                    }
                    fsf fsfVar9 = fsfVar;
                    vh9Var3 = vh9Var2;
                    obj = a2;
                    fsfVar8 = fsfVar9;
                    k4hVar3 = k4hVar2;
                    fsfVar5 = fsfVar2;
                    fsfVar5.a = obj;
                    if (b(((xh9) fsfVar2.a).d().d())) {
                    }
                }
            }
        }
        uj9Var = new uj9(sq3Var);
        Object obj2 = uj9Var.z;
        lu3 lu3Var2 = lu3.a;
        i = uj9Var.A;
        if (i != 0) {
        }
    }

    public static final boolean b(zk9 zk9Var) {
        int i = zk9Var.a;
        zk9 zk9Var2 = zk9.c;
        return i == zk9.e.a || i == zk9.f.a || i == zk9.i.a || i == zk9.j.a || i == zk9.g.a;
    }
}
