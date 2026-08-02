package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v5c {
    public final Uri a;
    public final String b;
    public final q5c c;
    public final g5c d;
    public final List e;
    public final String f;
    public final hv9 g;
    public final long h;

    static {
        wt3.s(0, 1, 2, 3, 4);
        nik.N(5);
        nik.N(6);
        nik.N(7);
    }

    public v5c(Uri uri, String str, q5c q5cVar, g5c g5cVar, List list, String str2, hv9 hv9Var, long j) {
        this.a = uri;
        this.b = sjc.p(str);
        this.c = q5cVar;
        this.d = g5cVar;
        this.e = list;
        this.f = str2;
        this.g = hv9Var;
        zu9 s = hv9.s();
        for (int i = 0; i < hv9Var.size(); i++) {
            ((c6c) hv9Var.get(i)).getClass();
            s.c(new c6c());
        }
        s.g();
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5c)) {
            return false;
        }
        v5c v5cVar = (v5c) obj;
        return this.a.equals(v5cVar.a) && Objects.equals(this.b, v5cVar.b) && Objects.equals(this.c, v5cVar.c) && Objects.equals(this.d, v5cVar.d) && this.e.equals(v5cVar.e) && Objects.equals(this.f, v5cVar.f) && this.g.equals(v5cVar.g) && this.h == v5cVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        q5c q5cVar = this.c;
        int hashCode3 = (hashCode2 + (q5cVar == null ? 0 : q5cVar.hashCode())) * 31;
        g5c g5cVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (g5cVar == null ? 0 : g5cVar.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
