package com.vk.feed.blacklist.impl.presentation.blacklist;

import com.vk.feed.blacklist.impl.presentation.blacklist.a;
import com.vk.feed.blacklist.impl.presentation.blacklist.d;
import defpackage.p;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.be7;
import xsna.ce7;
import xsna.ec;
import xsna.ee7;
import xsna.f4z;
import xsna.iz0;
import xsna.j5g;
import xsna.ke7;
import xsna.tz;
import xsna.u06;
import xsna.wk50;

/* compiled from: BlacklistFeature.kt */
/* loaded from: classes18.dex */
public final class b extends wk50<g, ke7, a, d> {
    public final ee7 f;
    public final f4z g;

    public b(ee7 ee7Var, e eVar) {
        super(a.c.b, eVar);
        this.f = ee7Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ke7 ke7Var, a aVar) {
        ke7 ke7Var2 = ke7Var;
        a aVar2 = aVar;
        if (aVar2.equals(a.c.b)) {
            T(d.a.b);
            return;
        }
        if (!(aVar2 instanceof a.C1032a)) {
            boolean z = aVar2 instanceof a.d;
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            ee7 ee7Var = this.f;
            if (z) {
                a.d dVar = (a.d) aVar2;
                bVar.b(ee7Var.c(dVar.b).subscribe(new ce7(ke7Var2, dVar, this, 0), new tz(new iz0(this, 5), 6)));
                return;
            } else {
                if (!(aVar2 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b bVar2 = (a.b) aVar2;
                bVar.b(ee7Var.a(bVar2.b).subscribe(new be7(ke7Var2, bVar2, this, 0), new p(new ec(this, 10), 5)));
                return;
            }
        }
        a.C1032a c1032a = (a.C1032a) aVar2;
        u06 u06Var = c1032a.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!c1032a.c) {
            linkedHashSet.addAll(ke7Var2.d);
            hashMap.putAll(ke7Var2.e);
            hashMap2.putAll(ke7Var2.f);
        }
        linkedHashSet.addAll(u06Var.c);
        hashMap.putAll(u06Var.d);
        hashMap2.putAll(u06Var.e);
        T(new d.b(j5g.O0(linkedHashSet), hashMap, hashMap2, u06Var.a, u06Var.b));
    }
}
