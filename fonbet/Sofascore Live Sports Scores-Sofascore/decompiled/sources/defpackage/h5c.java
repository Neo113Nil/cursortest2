package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h5c {
    public String a;
    public Uri b;
    public String c;
    public b78 d = new b78();
    public p5c e = new p5c(0);
    public List f = Collections.EMPTY_LIST;
    public String g;
    public hv9 h;
    public g5c i;
    public long j;
    public q6c k;
    public s5c l;
    public z5c m;

    public h5c() {
        av9 av9Var = hv9.b;
        this.h = vvf.e;
        this.l = new s5c();
        this.m = z5c.a;
        this.j = C.TIME_UNSET;
    }

    public final h6c a() {
        v5c v5cVar;
        p5c p5cVar = this.e;
        z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            p5c p5cVar2 = this.e;
            v5cVar = new v5c(uri, str, ((UUID) p5cVar2.b) != null ? new q5c(p5cVar2) : null, this.i, this.f, this.g, this.h, this.j);
        } else {
            v5cVar = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        b78 b78Var = this.d;
        b78Var.getClass();
        m5c m5cVar = new m5c(b78Var);
        s5c s5cVar = this.l;
        s5cVar.getClass();
        u5c u5cVar = new u5c(s5cVar);
        q6c q6cVar = this.k;
        if (q6cVar == null) {
            q6cVar = q6c.D;
        }
        return new h6c(str3, m5cVar, v5cVar, u5cVar, q6cVar, this.m);
    }

    public final void b(String str) {
        this.b = str == null ? null : Uri.parse(str);
    }
}
