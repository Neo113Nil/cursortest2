package com.vk.geo.impl.di;

import android.app.Application;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.geo.api.di.GeoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bfm;
import xsna.dv2;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.hyk0;
import xsna.jg0;
import xsna.nm0;
import xsna.nwy;
import xsna.qcy;
import xsna.tkt;

/* compiled from: GeoComponentImpl.kt */
/* loaded from: classes2.dex */
public final class GeoComponentImpl implements GeoComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final Application a;
    public final ewy b = new ewy(new bfm(this, 8));
    public final nwy c = new nwy(new dv2(20));
    public final nwy d = new nwy(new jg0(22));
    public final ewy e = new ewy(new nm0(16));

    /* compiled from: GeoComponentImpl.kt */
    public static final class a implements b7m<GeoComponent> {
        public final Application a;

        public a(Application application) {
            this.a = application;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new GeoComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GeoComponentImpl.class, "iconCache", "getIconCache$impl_release()Lcom/vk/geo/impl/presentation/map/markers/icons/IconCache;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, GeoComponentImpl.class, "staticPreviewFactory", "getStaticPreviewFactory()Lcom/vk/geo/api/StaticPreviewFactory;", hpf0Var), ep.a(0, GeoComponentImpl.class, "geoFragmentFactory", "getGeoFragmentFactory()Lcom/vk/geo/api/GeoFragmentFactory;", hpf0Var), ep.a(0, GeoComponentImpl.class, "fetchMarkerIconUseCase", "getFetchMarkerIconUseCase$impl_release()Lcom/vk/geo/impl/usecase/FetchMarkerIconUseCase;", hpf0Var)};
    }

    public GeoComponentImpl(Application application) {
        this.a = application;
    }

    @Override // com.vk.geo.api.di.GeoComponent
    public final hyk0 ee() {
        qcy<Object> qcyVar = f[1];
        return (hyk0) this.c.c();
    }

    @Override // com.vk.geo.api.di.GeoComponent
    public final tkt s7() {
        qcy<Object> qcyVar = f[2];
        return (tkt) this.d.c();
    }
}
