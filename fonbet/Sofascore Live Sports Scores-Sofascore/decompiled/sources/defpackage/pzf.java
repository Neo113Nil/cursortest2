package defpackage;

import com.ironsource.C4094gc;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pzf {
    public jl9 a;
    public yzf d;
    public y6a e = ym5.f;
    public String b = C4094gc.a;
    public ef0 c = new ef0(1);

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c.b(str, str2);
    }

    public final void b(je2 je2Var) {
        je2Var.getClass();
        String je2Var2 = je2Var.toString();
        if (je2Var2.length() == 0) {
            this.c.m("Cache-Control");
        } else {
            c("Cache-Control", je2Var2);
        }
    }

    public final void c(String str, String str2) {
        str2.getClass();
        ef0 ef0Var = this.c;
        ef0Var.getClass();
        vha.x(str);
        vha.y(str2, str);
        ef0Var.m(str);
        vha.h(ef0Var, str, str2);
    }

    public final void d(q89 q89Var) {
        q89Var.getClass();
        this.c = vha.k(q89Var);
    }

    public final void e(String str, yzf yzfVar) {
        str.getClass();
        if (str.length() <= 0) {
            a70.p("method.isEmpty() == true");
            return;
        }
        if (yzfVar == null) {
            if (str.equals(C4094gc.b) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                ogj.h(lnb.o("method ", str, " must have a request body."));
                return;
            }
        } else if (!td4.o0(str)) {
            ogj.h(lnb.o("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = yzfVar;
    }

    public final void f(String str) {
        str.getClass();
        if (c.v(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (c.v(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        il9 il9Var = new il9(0);
        il9Var.h(null, str);
        this.a = il9Var.c();
    }
}
