package com.fyber.inneractive.sdk.ignite;

import android.content.Context;
import xsna.awv;
import xsna.bwy0;
import xsna.fuy0;
import xsna.oxy0;
import xsna.q0z0;
import xsna.yyy0;

/* loaded from: classes12.dex */
public final class l extends awv {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z, boolean z2, boolean z3, h hVar) {
        super(kVar, aVar);
        l lVar;
        bwy0 oxy0Var;
        fuy0 fuy0Var = new fuy0(context);
        if (z && z2) {
            oxy0Var = new yyy0(new oxy0(fuy0Var, hVar), true, z3, hVar, this);
            lVar = this;
        } else if (z) {
            lVar = this;
            oxy0Var = new yyy0(fuy0Var, false, z3, hVar, lVar);
        } else {
            lVar = this;
            oxy0Var = z2 ? new oxy0(fuy0Var, hVar) : new q0z0(fuy0Var, hVar);
        }
        lVar.a = oxy0Var;
    }
}
