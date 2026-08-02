package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.x;
import defpackage.a70;
import defpackage.lnb;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class k {
    private static volatile String o = "";
    private final String a;
    private final m b;
    private Context c;
    private x d;
    private JSONObject e;
    private List<String> f;
    private List<String> g;
    private volatile c h;
    private volatile l i;
    private volatile d j;
    private volatile j k;
    private volatile s l;
    private volatile boolean m = true;
    private volatile o n;

    public k(String str, m mVar) {
        this.a = str;
        this.b = mVar;
    }

    public boolean a() throws IllegalStateException {
        if (y.b(c())) {
            a70.r("config can not be null");
            return false;
        }
        if (y.b(g())) {
            a70.r("decorate can not be null");
            return false;
        }
        if (y.b(s())) {
            a70.r("responseHandler can not be null");
            return false;
        }
        if (y.b(o()) || y.b(o().b())) {
            a70.r("networkStackConfig or stack can not be null");
            return false;
        }
        if (!TextUtils.isEmpty(o().c())) {
            return true;
        }
        a70.r("report url is null");
        return false;
    }

    public void b() {
        this.m = true;
        try {
            q().j();
            this.l = null;
            this.k = null;
        } catch (Exception unused) {
        }
    }

    public x c() {
        x xVar = this.d;
        if (xVar != null) {
            return xVar;
        }
        x a = new x.b().a();
        this.d = a;
        return a;
    }

    public Context d() {
        return this.c;
    }

    public c e() {
        if (y.b(this.h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.h)) {
                        String u = u();
                        this.h = new c(new b(d(), f(), u), u);
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public String f() {
        return TextUtils.isEmpty(w()) ? "track_manager_default.db" : lnb.o("track_manager_", w(), ".db");
    }

    public d g() {
        if (y.b(this.j)) {
            this.j = c().h;
        }
        return this.j;
    }

    public l h() {
        if (y.b(this.i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.i)) {
                        this.i = new q(new g(e(), q()));
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public j i() {
        if (y.b(this.k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.k)) {
                        this.k = new j();
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public int j() {
        if (c().a < 0) {
            return 50;
        }
        return c().a;
    }

    public int k() {
        return Math.max(c().e, 0);
    }

    public int l() {
        if (c().d <= 0) {
            return 2;
        }
        return c().d;
    }

    public int m() {
        return Math.max(c().b, 0);
    }

    public o n() {
        if (y.b(this.n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.n)) {
                        this.n = new o(l(), o(), s(), r());
                    }
                } finally {
                }
            }
        }
        return this.n;
    }

    public p o() {
        return c().g;
    }

    public JSONObject p() {
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.e = jSONObject2;
        return jSONObject2;
    }

    public s q() {
        if (y.b(this.l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.l)) {
                        this.l = new s(this);
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public int r() {
        return c().c;
    }

    public w s() {
        return c().i;
    }

    public String t() {
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        String uuid = UUID.randomUUID().toString();
        o = uuid;
        return uuid;
    }

    public String u() {
        return "event_table";
    }

    public m v() {
        return this.b;
    }

    public String w() {
        return this.a;
    }

    public boolean x() {
        return this.m;
    }

    public String y() {
        if (!y.b(this.c) && !y.b(this.d)) {
            try {
                q().k();
                this.m = false;
                if (TextUtils.isEmpty(o)) {
                    o = UUID.randomUUID().toString();
                }
                return o;
            } catch (Exception unused) {
                this.m = true;
            }
        }
        return "";
    }

    public void a(x xVar) {
        this.d = xVar;
    }

    public void a(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = c().j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception unused) {
            }
        }
        String g = eVar.g();
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        if (this.g != null) {
            try {
                return !r0.contains(g);
            } catch (Exception unused2) {
            }
        }
        List<String> list = this.f;
        if (list != null) {
            try {
                return list.contains(g);
            } catch (Exception unused3) {
            }
        }
        return true;
    }

    public void a(Context context) {
        this.c = context;
    }
}
