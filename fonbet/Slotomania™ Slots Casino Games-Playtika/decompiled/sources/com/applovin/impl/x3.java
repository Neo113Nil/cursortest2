package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class x3 {
    private final List a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(a3 a3Var);
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b(a aVar) {
        this.a.remove(aVar);
    }

    public void a(a3 a3Var) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(a3Var);
        }
    }
}
