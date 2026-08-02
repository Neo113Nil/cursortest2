package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C3148p;
import com.google.android.gms.common.api.internal.C3161w;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public abstract class i {
    public static h a(l lVar, f fVar) {
        AbstractC3191o.n(lVar, "Result must not be null");
        AbstractC3191o.b(!lVar.getStatus().l(), "Status code must not be SUCCESS");
        u uVar = new u(fVar, lVar);
        uVar.setResult(lVar);
        return uVar;
    }

    public static g b(l lVar, f fVar) {
        AbstractC3191o.n(lVar, "Result must not be null");
        v vVar = new v(fVar);
        vVar.setResult(lVar);
        return new C3148p(vVar);
    }

    public static h c(Status status, f fVar) {
        AbstractC3191o.n(status, "Result must not be null");
        C3161w c3161w = new C3161w(fVar);
        c3161w.setResult(status);
        return c3161w;
    }
}
