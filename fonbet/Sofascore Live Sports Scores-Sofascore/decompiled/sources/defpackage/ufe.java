package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ufe {
    public static final ArrayList e = new ArrayList();
    public final ihe a;
    public final sha b;
    public List c;
    public boolean d;

    public ufe(ihe iheVar, sha shaVar) {
        iheVar.getClass();
        ArrayList arrayList = e;
        arrayList.getClass();
        List b = i5k.b(arrayList);
        this.a = iheVar;
        this.b = shaVar;
        this.c = b;
        this.d = true;
        if (arrayList.isEmpty()) {
            return;
        }
        a70.r("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.a.b + "`, " + this.c.size() + " handlers";
    }
}
