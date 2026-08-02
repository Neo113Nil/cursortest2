package com.vk.geo.impl.presentation;

import com.vk.geo.impl.presentation.j;
import xsna.gm50;
import xsna.h0u0;
import xsna.izs;
import xsna.qcy;
import xsna.s3q0;
import xsna.sd4;
import xsna.uy7;

/* compiled from: GeoFragment.kt */
/* loaded from: classes2.dex */
public final class d implements izs<j.b, s3q0> {
    public final /* synthetic */ GeoFragment b;

    public d(GeoFragment geoFragment) {
        this.b = geoFragment;
    }

    @Override // xsna.izs
    public final s3q0 invoke(j.b bVar) {
        h0u0 h0u0Var = bVar.a;
        GeoFragment geoFragment = this.b;
        sd4 sd4Var = new sd4(geoFragment, 24);
        qcy<Object>[] qcyVarArr = GeoFragment.c0;
        gm50.a.a(geoFragment, h0u0Var, new uy7(sd4Var, 3));
        return s3q0.a;
    }
}
