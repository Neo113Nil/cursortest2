package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h6c {
    public static final h6c g;
    public final String a;
    public final v5c b;
    public final u5c c;
    public final q6c d;
    public final m5c e;
    public final z5c f;

    static {
        b78 b78Var = new b78();
        p5c p5cVar = new p5c(0);
        List list = Collections.EMPTY_LIST;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        s5c s5cVar = new s5c();
        z5c z5cVar = z5c.a;
        z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
        g = new h6c("", new m5c(b78Var), null, new u5c(s5cVar), q6c.D, z5cVar);
        wt3.s(0, 1, 2, 3, 4);
        nik.N(5);
    }

    public h6c(String str, m5c m5cVar, v5c v5cVar, u5c u5cVar, q6c q6cVar, z5c z5cVar) {
        this.a = str;
        this.b = v5cVar;
        this.c = u5cVar;
        this.d = q6cVar;
        this.e = m5cVar;
        this.f = z5cVar;
    }

    public final h5c a() {
        h5c h5cVar = new h5c();
        b78 b78Var = new b78();
        b78Var.a = this.e.a;
        h5cVar.d = b78Var;
        h5cVar.a = this.a;
        h5cVar.k = this.d;
        h5cVar.l = this.c.a();
        h5cVar.m = this.f;
        v5c v5cVar = this.b;
        if (v5cVar != null) {
            h5cVar.g = v5cVar.f;
            h5cVar.c = v5cVar.b;
            h5cVar.b = v5cVar.a;
            h5cVar.f = v5cVar.e;
            h5cVar.h = v5cVar.g;
            q5c q5cVar = v5cVar.c;
            h5cVar.e = q5cVar != null ? q5cVar.a() : new p5c(0);
            h5cVar.i = v5cVar.d;
            h5cVar.j = v5cVar.h;
        }
        return h5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6c)) {
            return false;
        }
        h6c h6cVar = (h6c) obj;
        return Objects.equals(this.a, h6cVar.a) && this.e.equals(h6cVar.e) && Objects.equals(this.b, h6cVar.b) && this.c.equals(h6cVar.c) && Objects.equals(this.d, h6cVar.d) && Objects.equals(this.f, h6cVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v5c v5cVar = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (v5cVar != null ? v5cVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode2;
    }
}
