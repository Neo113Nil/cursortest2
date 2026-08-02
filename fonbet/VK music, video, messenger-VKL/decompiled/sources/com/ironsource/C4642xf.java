package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4642xf extends G4 {
    public C4642xf(AbstractC4627x0 abstractC4627x0, Pg pg) {
        super(abstractC4627x0, pg);
    }

    private final int b(B b) {
        return b.h().l();
    }

    @Override // com.ironsource.H
    public boolean a(B b, Pg pg) {
        return a(pg) < b(b);
    }

    private final int a(Pg pg) {
        Integer num;
        List<B> b = pg.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(b((B) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(b((B) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
