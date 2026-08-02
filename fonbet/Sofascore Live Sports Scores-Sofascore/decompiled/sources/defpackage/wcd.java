package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wcd implements hcd {
    public final sv1 a;
    public final String b;
    public final transient LinkedHashMap c;

    public wcd(sv1 sv1Var) {
        sv1Var.getClass();
        this.a = sv1Var;
        this.b = sv1Var.b;
        this.c = new LinkedHashMap();
        Map map = sv1Var.p;
        sv1 sv1Var2 = map.containsKey("impression_trackers") ? sv1Var : null;
        if (sv1Var2 != null) {
        }
        sv1Var = map.containsKey("click_trackers") ? sv1Var : null;
        if (sv1Var != null) {
        }
    }

    @Override // defpackage.hcd
    public final String a() {
        return this.a.k;
    }

    @Override // defpackage.hcd
    public final String b() {
        return this.b;
    }

    @Override // defpackage.hcd
    public final int c() {
        return this.a.h;
    }

    @Override // defpackage.hcd
    public final String d() {
        return this.a.l;
    }

    @Override // defpackage.hcd
    public final boolean e() {
        return this.a.n > 0;
    }

    @Override // defpackage.hcd
    public final Map f() {
        return this.c;
    }

    @Override // defpackage.hcd
    public final int g() {
        return this.a.i;
    }

    @Override // defpackage.hcd
    public final Collection h() {
        String[] strArr = (String[]) this.a.p.get("click_trackers");
        if (strArr != null) {
            return ph0.X(strArr);
        }
        return null;
    }

    @Override // defpackage.hcd
    public final boolean i() {
        return this.a.j > 0;
    }

    @Override // defpackage.hcd
    public final String position() {
        return this.a.o;
    }

    @Override // defpackage.hcd
    public final String type() {
        return this.a.a;
    }
}
