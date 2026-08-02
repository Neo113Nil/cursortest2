package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lbl {
    public final xbl a;
    public final String b;
    public final nf6 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public sz8 h;

    static {
        rik.x("WorkContinuationImpl");
    }

    public lbl(xbl xblVar, String str, nf6 nf6Var, List list, int i) {
        this.a = xblVar;
        this.b = str;
        this.c = nf6Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (nf6Var == nf6.a && ((icl) list.get(i2)).b.u != Long.MAX_VALUE) {
                a70.p("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((icl) list.get(i2)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(lbl lblVar) {
        HashSet hashSet = new HashSet();
        lblVar.getClass();
        return hashSet;
    }

    public final sz8 a() {
        if (this.g) {
            rik o = rik.o();
            TextUtils.join(", ", this.e);
            o.getClass();
        } else {
            xbl xblVar = this.a;
            this.h = nq8.G(xblVar.b.g, "EnqueueRunnable_" + this.c.name(), ((zbl) xblVar.d).a, new ndk(this, 10));
        }
        return this.h;
    }
}
