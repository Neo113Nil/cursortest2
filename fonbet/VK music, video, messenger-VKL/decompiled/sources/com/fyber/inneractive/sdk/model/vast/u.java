package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import xsna.i5s;

/* loaded from: classes12.dex */
public final class u {
    public String a;
    public ArrayList b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.a = w1.b(node, "version");
        ArrayList c = w1.c(node, "Ad");
        if (!c.isEmpty()) {
            uVar.b = new ArrayList();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.a = w1.b(node2, "id");
                    Node d = w1.d(node2, "Wrapper");
                    if (d != null) {
                        fVar2.b = a0.c(d);
                    }
                    Node d2 = w1.d(node2, "InLine");
                    if (d2 != null) {
                        fVar2.c = p.c(d2);
                    }
                    fVar = fVar2;
                }
                uVar.b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return new StringBuilder(i5s.a(new StringBuilder("Vast: version - "), this.a, "\nAds: ")).toString();
    }
}
