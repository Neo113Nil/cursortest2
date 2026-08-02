package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final C0403pa f12327a = new C0403pa();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12328b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0161fm f12329c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f12330d = new Fl(this);

    public static final Hl a() {
        return Gl.f12284a;
    }

    public final Am a(Context context, Q4 q42, Zl zl) {
        Am am = (Am) this.f12328b.get(q42.f12770a);
        boolean z5 = true;
        if (am == null) {
            synchronized (this.f12328b) {
                try {
                    am = (Am) this.f12328b.get(q42.f12770a);
                    if (am == null) {
                        am = new Am(new Bm(context, q42.f12770a, zl, this.f12330d));
                        am.f();
                        this.f12328b.put(q42.f12770a, am);
                        z5 = false;
                    }
                } finally {
                }
            }
        }
        if (z5) {
            am.a(zl);
        }
        return am;
    }

    public final void a(Q4 q42, Ql ql) {
        synchronized (this.f12328b) {
            try {
                this.f12327a.a(q42.f12770a, ql);
                C0161fm c0161fm = this.f12329c;
                if (c0161fm != null) {
                    ql.a(c0161fm);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
