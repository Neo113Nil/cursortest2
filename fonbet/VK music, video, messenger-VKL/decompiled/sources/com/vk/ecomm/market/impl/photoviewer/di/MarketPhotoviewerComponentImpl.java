package com.vk.ecomm.market.impl.photoviewer.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e390;
import xsna.e7m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.qcy;
import xsna.s0o0;
import xsna.s1x;
import xsna.vq6;

/* compiled from: MarketPhotoviewerComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketPhotoviewerComponentImpl implements MarketPhotoviewerComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(MarketPhotoviewerComponentImpl.class, "taggedGoodsControllerFactory", "getTaggedGoodsControllerFactory()Lcom/vk/ecomm/market/api/photoviewer/TaggedGoodsControllerFactory;", 0), fp.c(0, MarketPhotoviewerComponentImpl.class, "overlayViewControllerFactory", "getOverlayViewControllerFactory()Lcom/vk/ecomm/market/api/photoviewer/OverlayViewControllerFactory;", fpf0.a)};
    public final ewy a;
    public final ewy b;

    /* compiled from: MarketPhotoviewerComponentImpl.kt */
    public static final class a implements b7m<MarketPhotoviewerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketPhotoviewerComponentImpl((ModerationComponent) e7mVar.b(fpf0.a(ModerationComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (ProductsMultipickerComponent) e7mVar.a(fpf0.a(ProductsMultipickerComponent.class)));
        }
    }

    public MarketPhotoviewerComponentImpl(ModerationComponent moderationComponent, BridgeComponent bridgeComponent, ProductsMultipickerComponent productsMultipickerComponent) {
        this.a = new ewy(new s1x(productsMultipickerComponent, 6));
        this.b = new ewy(new vq6(13, moderationComponent, bridgeComponent));
    }

    @Override // com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent
    public final e390 G5() {
        qcy<Object> qcyVar = c[1];
        return (e390) this.b.c();
    }

    @Override // com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent
    public final s0o0 O1() {
        qcy<Object> qcyVar = c[0];
        return (s0o0) this.a.c();
    }
}
