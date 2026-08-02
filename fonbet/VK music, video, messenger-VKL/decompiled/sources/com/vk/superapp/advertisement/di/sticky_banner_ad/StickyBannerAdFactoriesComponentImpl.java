package com.vk.superapp.advertisement.di.sticky_banner_ad;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent;
import com.vk.superapp.advertisement.api.di.sticky_banner_ad.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.jo60;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: StickyBannerAdFactoriesComponentImpl.kt */
/* loaded from: classes6.dex */
public final class StickyBannerAdFactoriesComponentImpl implements StickyBannerAdFactoriesComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new jo60(11));

    /* compiled from: StickyBannerAdFactoriesComponentImpl.kt */
    public static final class a implements c8m<StickyBannerAdFactoriesComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StickyBannerAdFactoriesComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StickyBannerAdFactoriesComponentImpl.class, "bannerAdFactoriesProvider", "getBannerAdFactoriesProvider()Lcom/vk/superapp/advertisement/api/di/sticky_banner_ad/StickyBannerAdFactoriesProvider;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent
    public final b R7() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
