package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gbc {
    public final Context a;
    public final yia b;
    public final gl0 c = new gl0(this, 10);
    public hpo d;
    public oac e;
    public boolean f;
    public hbc g;
    public boolean h;

    public gbc(Context context, yia yiaVar) {
        if (context == null) {
            a70.p("context must not be null");
            throw null;
        }
        this.a = context;
        if (yiaVar == null) {
            this.b = new yia(new ComponentName(context, getClass()), 4);
        } else {
            this.b = yiaVar;
        }
    }

    public dbc a(String str, fbc fbcVar) {
        if (str != null) {
            return null;
        }
        a70.p("initialMemberRouteId cannot be null.");
        return null;
    }

    public ebc d(String str) {
        if (str != null) {
            return null;
        }
        a70.p("routeId cannot be null");
        return null;
    }

    public ebc f(String str, fbc fbcVar) {
        return d(str);
    }

    public ebc g(String str, String str2) {
        if (str == null) {
            a70.p("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return f(str, fbc.b);
        }
        a70.p("routeGroupId cannot be null");
        return null;
    }

    public abstract void h(oac oacVar);

    public final void i(hbc hbcVar) {
        pbc.b();
        if (this.g != hbcVar) {
            this.g = hbcVar;
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void j(oac oacVar) {
        pbc.b();
        if (Objects.equals(this.e, oacVar)) {
            return;
        }
        this.e = oacVar;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.sendEmptyMessage(2);
    }
}
