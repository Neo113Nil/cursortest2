package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x5c {
    public final Uri a;
    public final List b;
    public final hv9 c;

    public x5c(Uri uri, wba wbaVar, List list, hv9 hv9Var) {
        this.a = uri;
        this.b = list;
        this.c = hv9Var;
        zu9 s = hv9.s();
        for (int i = 0; i < hv9Var.size(); i++) {
            ((b6c) hv9Var.get(i)).getClass();
            s.c(new b6c());
        }
        s.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5c)) {
            return false;
        }
        x5c x5cVar = (x5c) obj;
        if (!this.a.equals(x5cVar.a)) {
            return false;
        }
        int i = lik.a;
        return lik.a(null, null) && this.b.equals(x5cVar.b) && this.c.equals(x5cVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 923521)) * 961)) * 31;
    }
}
