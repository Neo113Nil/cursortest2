package com.vk.donut.video.impl.di;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.com.vk.donut.popup.api.di.DonutPopupComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.video.ui.upload.api.di.UploadComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b5o;
import xsna.c5o;
import xsna.c8m;
import xsna.cd3;
import xsna.ep;
import xsna.ewy;
import xsna.f5o;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.l5o;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.tkj;
import xsna.vg9;
import xsna.w6;
import xsna.x4o;
import xsna.zyn;

/* compiled from: DonutVideoComponentImpl.kt */
/* loaded from: classes.dex */
public final class DonutVideoComponentImpl implements DonutVideoComponent {
    public static final /* synthetic */ qcy<Object>[] j;
    public final DonutPopupComponent a;
    public final LinksBridgeComponent b;
    public final UploadComponent c;
    public final DonutPriceComponent d;
    public final nwy e = new nwy(new cd3(5));
    public final ewy f = new ewy(new tkj(this, 1));
    public final ewy g = new ewy(new b5o(this, 0));
    public final ewy h = new ewy(new c5o(this, 0));
    public final ewy i = new ewy(new vg9(2));

    /* compiled from: DonutVideoComponentImpl.kt */
    public static final class a implements c8m<DonutVideoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DonutVideoComponentImpl((DonutPopupComponent) g8mVar.a(fpf0.a(DonutPopupComponent.class)), (LinksBridgeComponent) g8mVar.a(fpf0.a(LinksBridgeComponent.class)), (UploadComponent) g8mVar.a(fpf0.a(UploadComponent.class)), (DonutPriceComponent) g8mVar.a(fpf0.a(DonutPriceComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DonutVideoComponentImpl.class, "featuresRepository", "getFeaturesRepository()Lcom/vk/donut/video/api/domain/repository/feature/DonutVideoFeaturesRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        j = new qcy[]{propertyReference1Impl, fp.c(0, DonutVideoComponentImpl.class, "actionHandler", "getActionHandler()Lcom/vk/donut/video/api/presentation/handler/donutaction/DonutVideoActionHandler;", hpf0Var), ep.a(0, DonutVideoComponentImpl.class, "aboutVideoActionHandler", "getAboutVideoActionHandler()Lcom/vk/donut/video/api/presentation/handler/aboutvideo/AboutVideoDonutActionHandler;", hpf0Var), ep.a(0, DonutVideoComponentImpl.class, "donutVideoUiModelProvider", "getDonutVideoUiModelProvider()Lcom/vk/donut/video/api/presentation/provider/DonutVideoUiModelProvider;", hpf0Var), ep.a(0, DonutVideoComponentImpl.class, "donutChipSpanFactory", "getDonutChipSpanFactory()Lcom/vk/donut/video/api/presentation/span/DonutChipSpanFactory;", hpf0Var)};
    }

    public DonutVideoComponentImpl(DonutPopupComponent donutPopupComponent, LinksBridgeComponent linksBridgeComponent, UploadComponent uploadComponent, DonutPriceComponent donutPriceComponent) {
        this.a = donutPopupComponent;
        this.b = linksBridgeComponent;
        this.c = uploadComponent;
        this.d = donutPriceComponent;
    }

    @Override // com.vk.donut.video.api.di.DonutVideoComponent
    public final f5o J() {
        qcy<Object> qcyVar = j[0];
        return (f5o) this.e.c();
    }

    @Override // com.vk.donut.video.api.di.DonutVideoComponent
    public final w6 Qa() {
        qcy<Object> qcyVar = j[2];
        return (w6) this.g.c();
    }

    @Override // com.vk.donut.video.api.di.DonutVideoComponent
    public final x4o getActionHandler() {
        qcy<Object> qcyVar = j[1];
        return (x4o) this.f.c();
    }

    @Override // com.vk.donut.video.api.di.DonutVideoComponent
    public final zyn s3() {
        qcy<Object> qcyVar = j[4];
        return (zyn) this.i.c();
    }

    @Override // com.vk.donut.video.api.di.DonutVideoComponent
    public final l5o wb() {
        qcy<Object> qcyVar = j[3];
        return (l5o) this.h.c();
    }
}
