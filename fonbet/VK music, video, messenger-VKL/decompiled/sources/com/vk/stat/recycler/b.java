package com.vk.stat.recycler;

import com.vk.stat.recycler.Measurement;
import com.vk.stat.recycler.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.c63;
import xsna.h0;
import xsna.jjf0;
import xsna.s3q0;

/* compiled from: DefaultRecyclerScrollProfiler.kt */
/* loaded from: classes5.dex */
public abstract class b extends c63.b implements jjf0 {
    public final Executor b;
    public final Map<Measurement.Type, Map<Integer, a>> c = Collections.synchronizedMap(new LinkedHashMap());
    public final ArrayList d = new ArrayList();

    public b(Executor executor) {
        this.b = executor;
    }

    @Override // xsna.jjf0
    public final void l(Measurement measurement) {
        this.b.execute(new h0(1, this, measurement));
        c63 c63Var = c63.a;
        c63.a(this);
    }

    @Override // xsna.c63.b
    public final void u() {
        c63 c63Var = c63.a;
        c63.c(this);
        synchronized (this.c) {
            c cVar = (c) this;
            for (a aVar : this.d) {
                ArrayList arrayList = aVar.d;
                ArrayList arrayList2 = aVar.e;
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    a.C1787a a = a.a(aVar.d);
                    a.C1787a a2 = a.a(arrayList2);
                    cVar.D(aVar, a, false);
                    if (a2 != null) {
                        cVar.D(aVar, a2, true);
                    }
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
