package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i3d {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public i3d(Integer num, jgf jgfVar, xx3 xx3Var, b59 b59Var, orb orbVar, bo2 bo2Var, irb irbVar) {
        this.a = 0;
        this.b = num.intValue();
        this.c = jgfVar;
        this.d = xx3Var;
        this.e = b59Var;
        this.f = orbVar;
        this.g = bo2Var;
        this.h = irbVar;
    }

    public r6d a(String str) {
        p6d p6dVar;
        str.getClass();
        mqi mqiVar = (mqi) this.h;
        if (mqiVar == null || (p6dVar = (p6d) mqiVar.getValue()) == null) {
            return null;
        }
        int i = s6d.f;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d = p6dVar.d(parse, (LinkedHashMap) this.f);
        if (d == null) {
            return null;
        }
        return new r6d((s6d) this.c, d, p6dVar.p, p6dVar.b(parse), false, -1);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                en0 I = qea.I(this);
                I.f("defaultPort", String.valueOf(this.b));
                I.e((jgf) this.c, "proxyDetector");
                I.e((xx3) this.d, "syncContext");
                I.e((b59) this.e, "serviceConfigParser");
                I.e((orb) this.f, "scheduledExecutorService");
                I.e((bo2) this.g, "channelLogger");
                I.e((irb) this.h, "executor");
                I.e(null, "overrideAuthority");
                return I.toString();
            default:
                return super.toString();
        }
    }

    public i3d(s6d s6dVar) {
        this.a = 1;
        this.c = s6dVar;
        this.e = new ArrayList();
        this.f = new LinkedHashMap();
    }
}
