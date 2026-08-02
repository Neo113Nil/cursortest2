package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class egc implements gp3 {
    public final int a;
    public final boolean b;

    public egc(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        if (((HashSet) gmbVar.l.a).contains(jmb.a)) {
            return new fgc(this);
        }
        ajb.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
