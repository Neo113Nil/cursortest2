package com.vk.ads.yandex.impl.di;

import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.googleump.api.di.GoogleUMPComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ax5;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.v4y0;

/* compiled from: YandexAdFeatureComponentImpl.kt */
/* loaded from: classes14.dex */
public final class YandexAdFeatureComponentImpl implements YandexAdFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: YandexAdFeatureComponentImpl.kt */
    public static final class a implements c8m<YandexAdFeatureComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new YandexAdFeatureComponentImpl((GoogleUMPComponent) g8mVar.a(fpf0.a(GoogleUMPComponent.class)), (AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), (AdsSdkStatTrackerComponent) g8mVar.a(fpf0.a(AdsSdkStatTrackerComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(YandexAdFeatureComponentImpl.class, "yandexAdFeature", "getYandexAdFeature()Lcom/vk/ads/yandex/api/YandexAdFeature;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public YandexAdFeatureComponentImpl(GoogleUMPComponent googleUMPComponent, AppContextDiComponent appContextDiComponent, AdsSdkStatTrackerComponent adsSdkStatTrackerComponent) {
        this.a = new nwy(new ax5(adsSdkStatTrackerComponent, googleUMPComponent, appContextDiComponent, 10));
    }

    @Override // com.vk.ads.yandex.api.di.YandexAdFeatureComponent
    public final v4y0 e5() {
        qcy<Object> qcyVar = b[0];
        return (v4y0) this.a.c();
    }
}
