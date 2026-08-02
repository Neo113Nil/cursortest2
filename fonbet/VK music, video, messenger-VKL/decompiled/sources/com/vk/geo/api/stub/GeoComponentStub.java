package com.vk.geo.api.stub;

import com.vk.geo.api.di.GeoComponent;
import com.vk.search.communities.map.impl.ui.map.d;
import kotlin.NotImplementedError;
import xsna.dkt;
import xsna.gl00;
import xsna.hyk0;
import xsna.pb00;
import xsna.tkt;
import xsna.yl00;

/* compiled from: GeoComponentStub.kt */
/* loaded from: classes18.dex */
public final class GeoComponentStub implements GeoComponent {

    /* compiled from: GeoComponentStub.kt */
    public static final class a implements tkt {
        @Override // xsna.tkt
        public final tkt.b a(d dVar, hyk0.a aVar, gl00 gl00Var, yl00 yl00Var, pb00 pb00Var) {
            throw new NotImplementedError();
        }
    }

    @Override // com.vk.geo.api.di.GeoComponent
    public final hyk0 ee() {
        return new dkt(0);
    }

    @Override // com.vk.geo.api.di.GeoComponent
    public final tkt s7() {
        return new a();
    }
}
