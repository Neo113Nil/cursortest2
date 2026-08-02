package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp63;", "Lltk;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class p63 extends ltk {
    public final Context b;
    public final uwg c;
    public final s96 d;
    public final String e;
    public final p83 f;
    public final fdi g;
    public final LinkedHashMap h;
    public final fu3 i;
    public final o63 j;

    public p63(Context context, uwg uwgVar, s96 s96Var, fqg fqgVar) {
        p83 p83Var;
        e73 valueOf;
        uwgVar.getClass();
        s96Var.getClass();
        fqgVar.getClass();
        this.b = context;
        this.c = uwgVar;
        this.d = s96Var;
        String str = (String) fqgVar.a("SPORT");
        this.e = str;
        String str2 = (String) fqgVar.a("ENTITY_TYPE");
        int ordinal = ((str2 == null || (valueOf = e73.valueOf(str2)) == null) ? e73.a : valueOf).ordinal();
        int i = 1;
        rq3 rq3Var = null;
        if (ordinal == 0) {
            p83Var = m83.f;
        } else {
            if (ordinal != 1) {
                zzl.b();
                throw null;
            }
            p83Var = wyh.e(str) ? n83.f : o83.f;
        }
        this.f = p83Var;
        fdi a = gdi.a("");
        this.g = a;
        yf4 c = uwgVar.c(str);
        this.h = new LinkedHashMap();
        int i2 = 3;
        hof w = pco.w(la8.a(new yf4(hkg.F(a, new b42(23)), c, new tl(this, rq3Var, i2), i), new m63(i2, rq3Var, 0)), un0.z(this));
        this.i = j72.t(w);
        this.j = new o63(0, w, this);
    }
}
