package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hli implements bjb {
    public final String a;
    public volatile bjb b;
    public Boolean c;
    public Method d;
    public m66 e;
    public final LinkedBlockingQueue f;
    public final boolean g;

    public hli(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    public final bjb a() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return t2d.a;
        }
        m66 m66Var = this.e;
        if (m66Var != null) {
            return m66Var;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f;
        m66 m66Var2 = new m66();
        m66Var2.b = this;
        m66Var2.a = this.a;
        m66Var2.c = linkedBlockingQueue;
        this.e = m66Var2;
        return m66Var2;
    }

    public final boolean b() {
        Boolean bool;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", ili.class);
            bool = Boolean.TRUE;
            this.c = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.c = bool;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.bjb
    public final boolean d() {
        return a().d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hli.class == obj.getClass() && this.a.equals(((hli) obj).a);
    }

    @Override // defpackage.bjb
    public final boolean g() {
        return a().g();
    }

    @Override // defpackage.bjb
    public final boolean h() {
        return a().h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bjb
    public final boolean i() {
        return a().i();
    }

    @Override // defpackage.bjb
    public final void j(Throwable th) {
        a().j(th);
    }

    @Override // defpackage.bjb
    public final boolean k() {
        return a().k();
    }

    @Override // defpackage.bjb
    public final void l(String str) {
        a().l(str);
    }

    @Override // defpackage.bjb
    public final boolean m(int i) {
        return a().m(i);
    }
}
