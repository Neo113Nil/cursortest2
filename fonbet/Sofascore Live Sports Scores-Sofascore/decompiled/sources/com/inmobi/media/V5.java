package com.inmobi.media;

import defpackage.lm5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class V5 extends AbstractC3536k2 {
    public final Zc b;
    public final C3608mm c;
    public final Aj d;
    public final AtomicInteger e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(Zc zc, C3608mm c3608mm, Aj aj, Aj aj2) {
        super(new defpackage.om(zc, 2));
        zc.getClass();
        c3608mm.getClass();
        aj.getClass();
        aj2.getClass();
        this.b = zc;
        this.c = c3608mm;
        this.d = aj2;
        this.e = new AtomicInteger(-1);
        if (c3608mm.c.isEmpty()) {
            return;
        }
        aj.a(C3472hf.a);
    }

    public static final boolean a(Zc zc) {
        return AbstractC3315bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC3536k2
    public final void b(H2 h2) {
        h2.getClass();
        int i = this.b.e;
        int i2 = this.e.get();
        if (i <= this.e.getAndSet(i)) {
            return;
        }
        ArrayList arrayList = this.c.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            int i4 = ((U5) next).a;
            if (i3 <= i4 && i4 <= i) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.d.a(C3472hf.a);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = ((U5) it2.next()).b;
            Zc zc = this.b;
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            String a = AbstractC3315bd.a(str, zc, lm5Var);
            E3 e3 = E3.a;
            a.getClass();
            E3.a(a, false, null);
        }
    }
}
