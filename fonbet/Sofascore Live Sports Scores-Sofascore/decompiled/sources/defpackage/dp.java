package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dp implements fed {
    public final oh3 a;
    public final ArrayList b;

    public dp(oh3 oh3Var, ArrayList arrayList) {
        this.a = oh3Var;
        this.b = arrayList;
    }

    @Override // defpackage.vm8
    public final wm8 a() {
        return this.a.a();
    }

    @Override // defpackage.vm8
    public final v9e b() {
        km5 km5Var = km5.a;
        xbb b = a.b();
        b.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            b.add(((vm8) it.next()).b());
        }
        return new v9e(km5Var, a.a(b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.a.equals(dpVar.a) && this.b.equals(dpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
