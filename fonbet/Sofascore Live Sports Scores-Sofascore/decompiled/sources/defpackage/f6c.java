package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f6c implements i72 {
    public static final i3c g;
    public final String a;
    public final x5c b;
    public final t5c c;
    public final p6c d;
    public final l5c e;
    public final y5c f;

    static {
        i5c i5cVar = new i5c();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        List list = Collections.EMPTY_LIST;
        av9 av9Var2 = hv9.b;
        vvf vvfVar2 = vvf.e;
        y5c y5cVar = y5c.c;
        new l5c(i5cVar);
        new t5c(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
        p6c p6cVar = p6c.G;
        g = new i3c(2);
    }

    public f6c(String str, l5c l5cVar, x5c x5cVar, t5c t5cVar, p6c p6cVar, y5c y5cVar) {
        this.a = str;
        this.b = x5cVar;
        this.c = t5cVar;
        this.d = p6cVar;
        this.e = l5cVar;
        this.f = y5cVar;
    }

    public static f6c a(String str) {
        i5c i5cVar = new i5c();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        List list = Collections.EMPTY_LIST;
        av9 av9Var2 = hv9.b;
        vvf vvfVar2 = vvf.e;
        y5c y5cVar = y5c.c;
        Uri parse = str == null ? null : Uri.parse(str);
        return new f6c("", new l5c(i5cVar), parse != null ? new x5c(parse, null, list, vvfVar2) : null, new t5c(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), p6c.G, y5cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6c)) {
            return false;
        }
        f6c f6cVar = (f6c) obj;
        return lik.a(this.a, f6cVar.a) && this.e.equals(f6cVar.e) && lik.a(this.b, f6cVar.b) && this.c.equals(f6cVar.c) && lik.a(this.d, f6cVar.d) && lik.a(this.f, f6cVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x5c x5cVar = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (x5cVar != null ? x5cVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
