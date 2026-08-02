package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fbh implements gp3 {
    public final String a;
    public final List b;
    public final boolean c;

    public fbh(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        return new so3(gmbVar, p41Var, this, plbVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
