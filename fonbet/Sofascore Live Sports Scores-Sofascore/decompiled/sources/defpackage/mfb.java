package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mfb {
    public final r0f a;
    public final List b;
    public final String c;

    public mfb(Class cls, Class cls2, Class cls3, List list, r0f r0fVar) {
        this.a = r0fVar;
        if (list.isEmpty()) {
            a70.p("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e1g a(int i, int i2, yz1 yz1Var, ie4 ie4Var, uvd uvdVar) {
        r0f r0fVar = this.a;
        List list = (List) r0fVar.c();
        w1a.m(list, "Argument must not be null");
        try {
            List list2 = this.b;
            int size = list2.size();
            e1g e1gVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    e1gVar = ((ul4) list2.get(i3)).a(i, i2, yz1Var, ie4Var, uvdVar);
                } catch (mz8 e) {
                    list.add(e);
                }
                if (e1gVar != null) {
                    break;
                }
            }
            if (e1gVar != null) {
                return e1gVar;
            }
            throw new mz8(this.c, new ArrayList(list));
        } finally {
            r0fVar.b(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
