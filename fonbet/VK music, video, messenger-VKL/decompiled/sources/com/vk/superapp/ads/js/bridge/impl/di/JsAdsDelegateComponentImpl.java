package com.vk.superapp.ads.js.bridge.impl.di;

import android.app.Activity;
import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent;
import com.vk.superapp.ads.js.bridge.api.di.d;
import com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent;
import com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent;
import com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.btm;
import xsna.c8m;
import xsna.cu1;
import xsna.d66;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hax;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s3q0;
import xsna.tbh;
import xsna.wzs;

/* compiled from: JsAdsDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsAdsDelegateComponentImpl implements JsAdsDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy a;
    public final ewy b = new ewy(new btm(this, 16));
    public final ewy c = new ewy(new tbh(this, 25));
    public final ewy d = new ewy(new cu1(16));

    /* compiled from: JsAdsDelegateComponentImpl.kt */
    public static final class a {
        public final AdvertisementOptionalFormatsComponent a;

        public a(AdvertisementOptionalFormatsComponent advertisementOptionalFormatsComponent) {
            this.a = advertisementOptionalFormatsComponent;
        }

        public final void a(Activity activity, wzs<? super Integer, ? super String, s3q0> wzsVar) {
            this.a.Tc(activity, wzsVar);
        }

        public final void b(hax haxVar) {
            this.a.me(haxVar);
        }
    }

    /* compiled from: JsAdsDelegateComponentImpl.kt */
    public static final class b implements c8m<JsAdsDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsAdsDelegateComponentImpl((AdvertisementOptionalFormatsComponent) g8mVar.a(fpf0.a(AdvertisementOptionalFormatsComponent.class)), (StickyBannerAdFactoriesComponent) g8mVar.a(fpf0.a(StickyBannerAdFactoriesComponent.class)), (FullscreenAdFactoryComponent) g8mVar.a(fpf0.a(FullscreenAdFactoryComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsAdsDelegateComponentImpl.class, "adFactories", "getAdFactories()Lcom/vk/superapp/ads/js/bridge/impl/JsAdsDelegateImpl$AdFactories;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, JsAdsDelegateComponentImpl.class, "jsAdsDelegateFactory", "getJsAdsDelegateFactory()Lcom/vk/superapp/ads/js/bridge/api/di/JsAdsDelegateFactory;", hpf0Var), ep.a(0, JsAdsDelegateComponentImpl.class, "closingAdsDelegateFactory", "getClosingAdsDelegateFactory()Lcom/vk/superapp/ads/js/bridge/api/di/ClosingBannerAdsDelegateFactory;", hpf0Var), ep.a(0, JsAdsDelegateComponentImpl.class, "adsBundleAnalyticsDelegateFactory", "getAdsBundleAnalyticsDelegateFactory()Lcom/vk/superapp/ads/js/bridge/api/di/AdsBundleAnalyticsDelegateFactory;", hpf0Var)};
    }

    public JsAdsDelegateComponentImpl(AdvertisementOptionalFormatsComponent advertisementOptionalFormatsComponent, StickyBannerAdFactoriesComponent stickyBannerAdFactoriesComponent, FullscreenAdFactoryComponent fullscreenAdFactoryComponent) {
        this.a = new nwy(new d66(advertisementOptionalFormatsComponent, stickyBannerAdFactoriesComponent, fullscreenAdFactoryComponent, 3));
    }

    @Override // com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent
    public final com.vk.superapp.ads.js.bridge.api.di.b C5() {
        qcy<Object> qcyVar = e[2];
        return (com.vk.superapp.ads.js.bridge.api.di.b) this.c.c();
    }

    @Override // com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent
    public final com.vk.superapp.ads.js.bridge.api.di.a rf() {
        qcy<Object> qcyVar = e[3];
        return (com.vk.superapp.ads.js.bridge.api.di.a) this.d.c();
    }

    @Override // com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent
    public final d z1() {
        qcy<Object> qcyVar = e[1];
        return (d) this.b.c();
    }
}
